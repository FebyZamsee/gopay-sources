package com.google.android.gms.measurement.internal;

final class zzd implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzb zzc;

    zzd(zzb zzb2, String str, long j) {
        this.zzc = zzb2;
        this.zza = str;
        this.zzb = j;
    }

    public final void run() {
        zzb.zzb(this.zzc, this.zza, this.zzb);
    }
}
