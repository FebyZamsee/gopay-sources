package com.google.firebase.crashlytics.internal.persistence;

import androidx.core.app.NotificationCompat;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class CrashlyticsReportPersistence {
    private static final FilenameFilter EVENT_FILE_FILTER = new CrashlyticsReportPersistence$$ExternalSyntheticLambda3();
    private static final int EVENT_NAME_LENGTH = 15;
    private static final Comparator<? super File> LATEST_SESSION_ID_FIRST_COMPARATOR = new CrashlyticsReportPersistence$$ExternalSyntheticLambda2();
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final AtomicInteger eventCounter = new AtomicInteger(0);
    private final FileStore fileStore;
    private final CrashlyticsAppQualitySessionsSubscriber sessionsSubscriber;
    private final SettingsProvider settingsProvider;

    private static long convertTimestampFromSecondsToMs(long j) {
        return j * 1000;
    }

    public CrashlyticsReportPersistence(FileStore fileStore2, SettingsProvider settingsProvider2, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.fileStore = fileStore2;
        this.settingsProvider = settingsProvider2;
        this.sessionsSubscriber = crashlyticsAppQualitySessionsSubscriber;
    }

    public void persistReport(CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.Session session = crashlyticsReport.getSession();
        if (session == null) {
            Logger.getLogger().d("Could not get session for report");
            return;
        }
        String identifier = session.getIdentifier();
        try {
            writeTextFile(this.fileStore.getSessionFile(identifier, "report"), TRANSFORM.reportToJson(crashlyticsReport));
            writeTextFile(this.fileStore.getSessionFile(identifier, "start-time"), "", session.getStartedAt());
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not persist report for session ");
            sb.append(identifier);
            logger.d(sb.toString(), e);
        }
    }

    public void persistEvent(CrashlyticsReport.Session.Event event, String str, boolean z) {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCustomExceptionEvents;
        try {
            writeTextFile(this.fileStore.getSessionFile(str, generateEventFilename(this.eventCounter.getAndIncrement(), z)), TRANSFORM.eventToJson(event));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not persist event for session ");
            sb.append(str);
            logger.w(sb.toString(), e);
        }
        trimEvents(str, i);
    }

    public SortedSet<String> getOpenSessionIds() {
        return new TreeSet(this.fileStore.getAllOpenSessionIds()).descendingSet();
    }

    public long getStartTimestampMillis(String str) {
        return this.fileStore.getSessionFile(str, "start-time").lastModified();
    }

    public boolean hasFinalizedReports() {
        return !this.fileStore.getReports().isEmpty() || !this.fileStore.getPriorityReports().isEmpty() || !this.fileStore.getNativeReports().isEmpty();
    }

    public void deleteAllReports() {
        deleteFiles(this.fileStore.getReports());
        deleteFiles(this.fileStore.getPriorityReports());
        deleteFiles(this.fileStore.getNativeReports());
    }

    private void deleteFiles(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    public void finalizeReports(String str, long j) {
        for (String next : capAndGetOpenSessions(str)) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Finalizing report for session ");
            sb.append(next);
            logger.v(sb.toString());
            synthesizeReport(next, j);
            this.fileStore.deleteSessionFiles(next);
        }
        capFinalizedReports();
    }

    public void finalizeSessionWithNativeEvent(String str, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        File sessionFile = this.fileStore.getSessionFile(str, "report");
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Writing native session report for ");
        sb.append(str);
        sb.append(" to file: ");
        sb.append(sessionFile);
        logger.d(sb.toString());
        synthesizeNativeReportFile(sessionFile, filesPayload, str, applicationExitInfo);
    }

    public List<CrashlyticsReportWithSessionId> loadFinalizedReports() {
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        ArrayList arrayList = new ArrayList();
        for (File next : allFinalizedReportFiles) {
            try {
                arrayList.add(CrashlyticsReportWithSessionId.create(TRANSFORM.reportFromJson(readTextFile(next)), next.getName(), next));
            } catch (IOException e) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Could not load report file ");
                sb.append(next);
                sb.append("; deleting");
                logger.w(sb.toString(), e);
                next.delete();
            }
        }
        return arrayList;
    }

    private SortedSet<String> capAndGetOpenSessions(String str) {
        this.fileStore.cleanupPreviousFileSystems();
        SortedSet<String> openSessionIds = getOpenSessionIds();
        if (str != null) {
            openSessionIds.remove(str);
        }
        if (openSessionIds.size() <= 8) {
            return openSessionIds;
        }
        while (openSessionIds.size() > 8) {
            String last = openSessionIds.last();
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Removing session over cap: ");
            sb.append(last);
            logger.d(sb.toString());
            this.fileStore.deleteSessionFiles(last);
            openSessionIds.remove(last);
        }
        return openSessionIds;
    }

    private void capFinalizedReports() {
        int i = this.settingsProvider.getSettingsSync().sessionData.maxCompleteSessionsCount;
        List<File> allFinalizedReportFiles = getAllFinalizedReportFiles();
        int size = allFinalizedReportFiles.size();
        if (size > i) {
            for (File delete : allFinalizedReportFiles.subList(i, size)) {
                delete.delete();
            }
        }
    }

    private List<File> getAllFinalizedReportFiles() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.fileStore.getPriorityReports());
        arrayList.addAll(this.fileStore.getNativeReports());
        Comparator<? super File> comparator = LATEST_SESSION_ID_FIRST_COMPARATOR;
        Collections.sort(arrayList, comparator);
        List<File> reports = this.fileStore.getReports();
        Collections.sort(reports, comparator);
        arrayList.addAll(reports);
        return arrayList;
    }

    private void synthesizeReport(String str, long j) {
        boolean z;
        List<File> sessionFiles = this.fileStore.getSessionFiles(str, EVENT_FILE_FILTER);
        if (sessionFiles.isEmpty()) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Session ");
            sb.append(str);
            sb.append(" has no events.");
            logger.v(sb.toString());
            return;
        }
        Collections.sort(sessionFiles);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = sessionFiles.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(TRANSFORM.eventFromJson(readTextFile(next)));
                    if (z || isHighPriorityEventFile(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    Logger logger2 = Logger.getLogger();
                    StringBuilder sb2 = new StringBuilder("Could not add event to report for ");
                    sb2.append(next);
                    logger2.w(sb2.toString(), e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            Logger logger3 = Logger.getLogger();
            StringBuilder sb3 = new StringBuilder("Could not parse event files for session ");
            sb3.append(str);
            logger3.w(sb3.toString());
            return;
        }
        String readUserId = UserMetadata.readUserId(str, this.fileStore);
        String appQualitySessionId = this.sessionsSubscriber.getAppQualitySessionId(str);
        synthesizeReportFile(this.fileStore.getSessionFile(str, "report"), arrayList, j, z, readUserId, appQualitySessionId);
    }

    private void synthesizeNativeReportFile(File file, CrashlyticsReport.FilesPayload filesPayload, String str, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        String appQualitySessionId = this.sessionsSubscriber.getAppQualitySessionId(str);
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            writeTextFile(this.fileStore.getNativeReport(str), crashlyticsReportJsonTransform.reportToJson(crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withNdkPayload(filesPayload).withApplicationExitInfo(applicationExitInfo).withAppQualitySessionId(appQualitySessionId)));
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Could not synthesize final native report file for ");
            sb.append(file);
            logger.w(sb.toString(), e);
        }
    }

    private void synthesizeReportFile(File file, List<CrashlyticsReport.Session.Event> list, long j, boolean z, String str, String str2) {
        File file2;
        try {
            CrashlyticsReportJsonTransform crashlyticsReportJsonTransform = TRANSFORM;
            CrashlyticsReport withEvents = crashlyticsReportJsonTransform.reportFromJson(readTextFile(file)).withSessionEndFields(j, z, str).withAppQualitySessionId(str2).withEvents(list);
            CrashlyticsReport.Session session = withEvents.getSession();
            if (session != null) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("appQualitySessionId: ");
                sb.append(str2);
                logger.d(sb.toString());
                if (z) {
                    file2 = this.fileStore.getPriorityReport(session.getIdentifier());
                } else {
                    file2 = this.fileStore.getReport(session.getIdentifier());
                }
                writeTextFile(file2, crashlyticsReportJsonTransform.reportToJson(withEvents));
            }
        } catch (IOException e) {
            Logger logger2 = Logger.getLogger();
            StringBuilder sb2 = new StringBuilder("Could not synthesize final report file for ");
            sb2.append(file);
            logger2.w(sb2.toString(), e);
        }
    }

    private static boolean isHighPriorityEventFile(String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    public static boolean isNormalPriorityEventFile(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith("_");
    }

    private static String generateEventFilename(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        String str = z ? "_" : "";
        StringBuilder sb = new StringBuilder(NotificationCompat.CATEGORY_EVENT);
        sb.append(format);
        sb.append(str);
        return sb.toString();
    }

    private int trimEvents(String str, int i) {
        List<File> sessionFiles = this.fileStore.getSessionFiles(str, new CrashlyticsReportPersistence$$ExternalSyntheticLambda0());
        Collections.sort(sessionFiles, new CrashlyticsReportPersistence$$ExternalSyntheticLambda1());
        return capFilesCount(sessionFiles, i);
    }

    private static String getEventNameWithoutPriority(String str) {
        return str.substring(0, EVENT_NAME_LENGTH);
    }

    /* access modifiers changed from: private */
    public static int oldestEventFileFirst(File file, File file2) {
        return getEventNameWithoutPriority(file.getName()).compareTo(getEventNameWithoutPriority(file2.getName()));
    }

    private static void writeTextFile(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static void writeTextFile(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), UTF_8);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(convertTimestampFromSecondsToMs(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static String readTextFile(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), UTF_8);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    private static int capFilesCount(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            FileStore.recursiveDelete(next);
            size--;
        }
        return size;
    }
}
