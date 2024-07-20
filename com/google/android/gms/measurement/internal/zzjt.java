package com.google.android.gms.measurement.internal;

final class zzjt implements Runnable {
    private final /* synthetic */ Boolean zza;
    private final /* synthetic */ zziq zzb;

    zzjt(zziq zziq, Boolean bool) {
        this.zzb = zziq;
        this.zza = bool;
    }

    public final void run() {
        this.zzb.zza(this.zza, true);
    }
}
