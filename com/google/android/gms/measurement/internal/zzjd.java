package com.google.android.gms.measurement.internal;

final class zzjd implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zziq zzb;

    zzjd(zziq zziq, long j) {
        this.zzb = zziq;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzk().zzf.zza(this.zza);
        this.zzb.zzj().zzc().zza("Session timeout duration set", Long.valueOf(this.zza));
    }
}
