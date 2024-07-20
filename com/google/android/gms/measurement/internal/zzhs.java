package com.google.android.gms.measurement.internal;

final class zzhs implements Runnable {
    private final /* synthetic */ zzo zza;
    private final /* synthetic */ zzhj zzb;

    zzhs(zzhj zzhj, zzo zzo) {
        this.zzb = zzhj;
        this.zza = zzo;
    }

    public final void run() {
        this.zzb.zza.zzr();
        this.zzb.zza.zzd(this.zza);
    }
}
