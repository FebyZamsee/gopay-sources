package com.google.firebase.crashlytics.internal.send;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.nio.charset.Charset;
import o.getNavigationItemCount;

public final /* synthetic */ class DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda0 implements getNavigationItemCount {
    public final Object apply(Object obj) {
        return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
    }
}
