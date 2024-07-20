package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.metadata.LogFileManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import com.google.firebase.crashlytics.internal.stacktrace.StackTraceTrimmingStrategy;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

public class SessionReportingCoordinator {
    private final CrashlyticsReportDataCapture dataCapture;
    private final IdManager idManager;
    private final LogFileManager logFileManager;
    private final UserMetadata reportMetadata;
    private final CrashlyticsReportPersistence reportPersistence;
    private final DataTransportCrashlyticsReportSender reportsSender;

    public static SessionReportingCoordinator create(Context context, IdManager idManager2, FileStore fileStore, AppData appData, LogFileManager logFileManager2, UserMetadata userMetadata, StackTraceTrimmingStrategy stackTraceTrimmingStrategy, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        SettingsProvider settingsProvider2 = settingsProvider;
        FileStore fileStore2 = fileStore;
        Context context2 = context;
        return new SessionReportingCoordinator(new CrashlyticsReportDataCapture(context, idManager2, appData, stackTraceTrimmingStrategy, settingsProvider), new CrashlyticsReportPersistence(fileStore, settingsProvider2, crashlyticsAppQualitySessionsSubscriber), DataTransportCrashlyticsReportSender.create(context, settingsProvider2, onDemandCounter), logFileManager2, userMetadata, idManager2);
    }

    SessionReportingCoordinator(CrashlyticsReportDataCapture crashlyticsReportDataCapture, CrashlyticsReportPersistence crashlyticsReportPersistence, DataTransportCrashlyticsReportSender dataTransportCrashlyticsReportSender, LogFileManager logFileManager2, UserMetadata userMetadata, IdManager idManager2) {
        this.dataCapture = crashlyticsReportDataCapture;
        this.reportPersistence = crashlyticsReportPersistence;
        this.reportsSender = dataTransportCrashlyticsReportSender;
        this.logFileManager = logFileManager2;
        this.reportMetadata = userMetadata;
        this.idManager = idManager2;
    }

    public void onBeginSession(String str, long j) {
        this.reportPersistence.persistReport(this.dataCapture.captureReportData(str, j));
    }

    public void persistFatalEvent(Throwable th, Thread thread, String str, long j) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Persisting fatal event for session ");
        sb.append(str);
        logger.v(sb.toString());
        persistEvent(th, thread, str, AppMeasurement.CRASH_ORIGIN, j, true);
    }

    public void persistNonFatalEvent(Throwable th, Thread thread, String str, long j) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Persisting non-fatal event for session ");
        sb.append(str);
        logger.v(sb.toString());
        persistEvent(th, thread, str, "error", j, false);
    }

    public void persistRelevantAppExitInfoEvent(String str, List<ApplicationExitInfo> list, LogFileManager logFileManager2, UserMetadata userMetadata) {
        ApplicationExitInfo findRelevantApplicationExitInfo = findRelevantApplicationExitInfo(str, list);
        if (findRelevantApplicationExitInfo == null) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("No relevant ApplicationExitInfo occurred during session: ");
            sb.append(str);
            logger.v(sb.toString());
            return;
        }
        CrashlyticsReport.Session.Event captureAnrEventData = this.dataCapture.captureAnrEventData(convertApplicationExitInfo(findRelevantApplicationExitInfo));
        Logger logger2 = Logger.getLogger();
        StringBuilder sb2 = new StringBuilder("Persisting anr for session ");
        sb2.append(str);
        logger2.d(sb2.toString());
        this.reportPersistence.persistEvent(addRolloutsStateToEvent(addLogsAndCustomKeysToEvent(captureAnrEventData, logFileManager2, userMetadata), userMetadata), str, true);
    }

    public void finalizeSessionWithNativeEvent(String str, List<NativeSessionFile> list, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        Logger.getLogger().d("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (NativeSessionFile asFilePayload : list) {
            CrashlyticsReport.FilesPayload.File asFilePayload2 = asFilePayload.asFilePayload();
            if (asFilePayload2 != null) {
                arrayList.add(asFilePayload2);
            }
        }
        this.reportPersistence.finalizeSessionWithNativeEvent(str, CrashlyticsReport.FilesPayload.builder().setFiles(Collections.unmodifiableList(arrayList)).build(), applicationExitInfo);
    }

    public void finalizeSessions(long j, String str) {
        this.reportPersistence.finalizeReports(str, j);
    }

    public SortedSet<String> listSortedOpenSessionIds() {
        return this.reportPersistence.getOpenSessionIds();
    }

    public boolean hasReportsToSend() {
        return this.reportPersistence.hasFinalizedReports();
    }

    public void removeAllReports() {
        this.reportPersistence.deleteAllReports();
    }

    public Task<Void> sendReports(Executor executor) {
        return sendReports(executor, (String) null);
    }

    public Task<Void> sendReports(Executor executor, String str) {
        List<CrashlyticsReportWithSessionId> loadFinalizedReports = this.reportPersistence.loadFinalizedReports();
        ArrayList arrayList = new ArrayList();
        for (CrashlyticsReportWithSessionId next : loadFinalizedReports) {
            if (str == null || str.equals(next.getSessionId())) {
                arrayList.add(this.reportsSender.enqueueReport(ensureHasFid(next), str != null).continueWith(executor, new SessionReportingCoordinator$$ExternalSyntheticLambda1(this)));
            }
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList);
    }

    private CrashlyticsReportWithSessionId ensureHasFid(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        if (crashlyticsReportWithSessionId.getReport().getFirebaseInstallationId() != null) {
            return crashlyticsReportWithSessionId;
        }
        return CrashlyticsReportWithSessionId.create(crashlyticsReportWithSessionId.getReport().withFirebaseInstallationId(this.idManager.fetchTrueFid()), crashlyticsReportWithSessionId.getSessionId(), crashlyticsReportWithSessionId.getReportFile());
    }

    private CrashlyticsReport.Session.Event addMetaDataToEvent(CrashlyticsReport.Session.Event event) {
        return addRolloutsStateToEvent(addLogsAndCustomKeysToEvent(event, this.logFileManager, this.reportMetadata), this.reportMetadata);
    }

    private CrashlyticsReport.Session.Event addLogsAndCustomKeysToEvent(CrashlyticsReport.Session.Event event, LogFileManager logFileManager2, UserMetadata userMetadata) {
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        String logString = logFileManager2.getLogString();
        if (logString != null) {
            builder.setLog(CrashlyticsReport.Session.Event.Log.builder().setContent(logString).build());
        } else {
            Logger.getLogger().v("No log data to include with this event.");
        }
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes = getSortedCustomAttributes(userMetadata.getCustomKeys());
        List<CrashlyticsReport.CustomAttribute> sortedCustomAttributes2 = getSortedCustomAttributes(userMetadata.getInternalKeys());
        if (!sortedCustomAttributes.isEmpty() || !sortedCustomAttributes2.isEmpty()) {
            builder.setApp(event.getApp().toBuilder().setCustomAttributes(sortedCustomAttributes).setInternalKeys(sortedCustomAttributes2).build());
        }
        return builder.build();
    }

    private CrashlyticsReport.Session.Event addRolloutsStateToEvent(CrashlyticsReport.Session.Event event, UserMetadata userMetadata) {
        List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutsState = userMetadata.getRolloutsState();
        if (rolloutsState.isEmpty()) {
            return event;
        }
        CrashlyticsReport.Session.Event.Builder builder = event.toBuilder();
        builder.setRollouts(CrashlyticsReport.Session.Event.RolloutsState.builder().setRolloutAssignments(rolloutsState).build());
        return builder.build();
    }

    private void persistEvent(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        boolean equals = str2.equals(AppMeasurement.CRASH_ORIGIN);
        CrashlyticsReport.Session.Event captureEventData = this.dataCapture.captureEventData(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.reportPersistence.persistEvent(addMetaDataToEvent(captureEventData), str, equals);
    }

    /* access modifiers changed from: private */
    public boolean onReportSendComplete(Task<CrashlyticsReportWithSessionId> task) {
        if (task.isSuccessful()) {
            CrashlyticsReportWithSessionId result = task.getResult();
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Crashlytics report successfully enqueued to DataTransport: ");
            sb.append(result.getSessionId());
            logger.d(sb.toString());
            File reportFile = result.getReportFile();
            if (reportFile.delete()) {
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder("Deleted report file: ");
                sb2.append(reportFile.getPath());
                logger2.d(sb2.toString());
                return true;
            }
            Logger logger3 = Logger.getLogger();
            StringBuilder sb3 = new StringBuilder("Crashlytics could not delete report file: ");
            sb3.append(reportFile.getPath());
            logger3.w(sb3.toString());
            return true;
        }
        Logger.getLogger().w("Crashlytics report could not be enqueued to DataTransport", task.getException());
        return false;
    }

    private static List<CrashlyticsReport.CustomAttribute> getSortedCustomAttributes(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(CrashlyticsReport.CustomAttribute.builder().setKey((String) next.getKey()).setValue((String) next.getValue()).build());
        }
        Collections.sort(arrayList, new SessionReportingCoordinator$$ExternalSyntheticLambda0());
        return Collections.unmodifiableList(arrayList);
    }

    private static CrashlyticsReport.ApplicationExitInfo convertApplicationExitInfo(ApplicationExitInfo applicationExitInfo) {
        String str;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = convertInputStreamToString(traceInputStream);
                return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(str).build();
            }
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not get input trace in application exit info: ");
            sb.append(applicationExitInfo.toString());
            sb.append(" Error: ");
            sb.append(e);
            logger.w(sb.toString());
        }
        str = null;
        return CrashlyticsReport.ApplicationExitInfo.builder().setImportance(applicationExitInfo.getImportance()).setProcessName(applicationExitInfo.getProcessName()).setReasonCode(applicationExitInfo.getReason()).setTimestamp(applicationExitInfo.getTimestamp()).setPid(applicationExitInfo.getPid()).setPss(applicationExitInfo.getPss()).setRss(applicationExitInfo.getRss()).setTraceFile(str).build();
    }

    public static String convertInputStreamToString(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private ApplicationExitInfo findRelevantApplicationExitInfo(String str, List<ApplicationExitInfo> list) {
        long startTimestampMillis = this.reportPersistence.getStartTimestampMillis(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < startTimestampMillis) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }
}
