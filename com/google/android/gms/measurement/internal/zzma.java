package com.google.android.gms.measurement.internal;

final class zzma implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzlx zzb;

    zzma(zzlx zzlx, long j) {
        this.zzb = zzlx;
        this.zza = j;
    }

    public final void run() {
        zzlx.zzb(this.zzb, this.zza);
    }
}
