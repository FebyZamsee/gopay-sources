package com.google.android.gms.measurement.internal;

final class zzko implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzkh zzb;

    zzko(zzkh zzkh, long j) {
        this.zzb = zzkh;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzc().zza(this.zza);
        this.zzb.zza = null;
    }
}