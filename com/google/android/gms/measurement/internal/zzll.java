package com.google.android.gms.measurement.internal;

final class zzll implements Runnable {
    private final /* synthetic */ zzfk zza;
    private final /* synthetic */ zzlm zzb;

    zzll(zzlm zzlm, zzfk zzfk) {
        this.zzb = zzlm;
        this.zza = zzfk;
    }

    public final void run() {
        synchronized (this.zzb) {
            this.zzb.zzb = false;
            if (!this.zzb.zza.zzah()) {
                this.zzb.zza.zzj().zzp().zza("Connected to service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}
