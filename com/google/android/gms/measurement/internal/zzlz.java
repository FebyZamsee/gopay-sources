package com.google.android.gms.measurement.internal;

final class zzlz implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzlx zzb;

    zzlz(zzlx zzlx, long j) {
        this.zzb = zzlx;
        this.zza = j;
    }

    public final void run() {
        zzlx.zza(this.zzb, this.zza);
    }
}
