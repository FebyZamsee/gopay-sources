package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import o.getNavigationItemCount;
import o.getSubtitle;
import o.getTabAt;
import o.getTabCount;
import o.setListNavigationCallbacks;
import o.setSelectedNavigationItem;

public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final getNavigationItemCount<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda0();
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private final ReportQueue reportQueue;
    private final getNavigationItemCount<CrashlyticsReport, byte[]> transportTransform;

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        setSelectedNavigationItem.asInterface(context);
        setListNavigationCallbacks setlistnavigationcallbacks = setSelectedNavigationItem.onTransact;
        if (setlistnavigationcallbacks != null) {
            getTabAt onTransact = setlistnavigationcallbacks.RemoteActionCompatParcelizer().onTransact(new getTabCount(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
            getSubtitle getsubtitle = new getSubtitle("json");
            getNavigationItemCount<CrashlyticsReport, byte[]> getnavigationitemcount = DEFAULT_TRANSFORM;
            Class<CrashlyticsReport> cls = CrashlyticsReport.class;
            return new DataTransportCrashlyticsReportSender(new ReportQueue(onTransact.RemoteActionCompatParcelizer("FIREBASE_CRASHLYTICS_REPORT", getsubtitle, getnavigationitemcount), settingsProvider.getSettingsSync(), onDemandCounter), getnavigationitemcount);
        }
        throw new IllegalStateException("Not initialized!");
    }

    DataTransportCrashlyticsReportSender(ReportQueue reportQueue2, getNavigationItemCount<CrashlyticsReport, byte[]> getnavigationitemcount) {
        this.reportQueue = reportQueue2;
        this.transportTransform = getnavigationitemcount;
    }

    public Task<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).getTask();
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
