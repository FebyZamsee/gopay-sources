package com.google.android.gms.measurement.internal;

final class zzlv implements Runnable {
    private final /* synthetic */ zzmp zza;
    private final /* synthetic */ Runnable zzb;

    zzlv(zzlu zzlu, zzmp zzmp, Runnable runnable) {
        this.zza = zzmp;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzr();
        this.zza.zza(this.zzb);
        this.zza.zzw();
    }
}
