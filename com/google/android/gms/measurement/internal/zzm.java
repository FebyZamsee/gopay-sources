package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

final class zzm implements Runnable {
    private final /* synthetic */ AppMeasurementDynamiteService.zza zza;
    private final /* synthetic */ AppMeasurementDynamiteService zzb;

    zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.zza zza2) {
        this.zzb = appMeasurementDynamiteService;
        this.zza = zza2;
    }

    public final void run() {
        this.zzb.zza.zzp().zza((zzim) this.zza);
    }
}
