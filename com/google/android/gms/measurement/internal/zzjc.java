package com.google.android.gms.measurement.internal;

import o.tryGetActivity;

final class zzjc implements tryGetActivity<Object> {
    private final /* synthetic */ zzmh zza;
    private final /* synthetic */ zziq zzb;

    zzjc(zziq zziq, zzmh zzmh) {
        this.zzb = zziq;
        this.zza = zzmh;
    }

    public final void onFailure(Throwable th) {
        this.zzb.zzt();
        this.zzb.zzh = false;
        this.zzb.zzan();
        this.zzb.zzj().zzg().zza("registerTriggerAsync failed with throwable", th);
    }

    public final void onSuccess(Object obj) {
        this.zzb.zzt();
        this.zzb.zzh = false;
        this.zzb.zzan();
        this.zzb.zzj().zzc().zza("registerTriggerAsync ran. uri", this.zza.zza);
    }
}