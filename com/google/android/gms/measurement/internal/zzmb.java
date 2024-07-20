package com.google.android.gms.measurement.internal;

final class zzmb implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzmc zzc;

    zzmb(zzmc zzmc, long j, long j2) {
        this.zzc = zzmc;
        this.zza = j;
        this.zzb = j2;
    }

    public final void run() {
        this.zzc.zza.zzl().zzb((Runnable) new zzme(this));
    }
}
