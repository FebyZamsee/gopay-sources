package com.google.android.gms.measurement.internal;

final class zzms implements Runnable {
    private final /* synthetic */ zzna zza;
    private final /* synthetic */ zzmp zzb;

    zzms(zzmp zzmp, zzna zzna) {
        this.zzb = zzmp;
        this.zza = zzna;
    }

    public final void run() {
        zzmp.zza(this.zzb, this.zza);
        this.zzb.zzv();
    }
}