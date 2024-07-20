package com.google.android.gms.measurement.internal;

final class zzln implements Runnable {
    private final /* synthetic */ zzfk zza;
    private final /* synthetic */ zzlm zzb;

    zzln(zzlm zzlm, zzfk zzfk) {
        this.zzb = zzlm;
        this.zza = zzfk;
    }

    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzah()) {
                this.zzb.zza.zzj().zzc().zza("Connected to remote service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}
