package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import java.util.HashSet;
import java.util.Set;

public final class zze {
    Set<String> zza = new HashSet();
    /* access modifiers changed from: private */
    public AnalyticsConnector.AnalyticsConnectorListener zzb;
    private AppMeasurementSdk zzc;
    private zzd zzd;

    public zze(AppMeasurementSdk appMeasurementSdk, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurementSdk;
        zzd zzd2 = new zzd(this);
        this.zzd = zzd2;
        this.zzc.registerOnMeasurementEventListener(zzd2);
    }
}
