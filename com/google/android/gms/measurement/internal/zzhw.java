package com.google.android.gms.measurement.internal;

final class zzhw implements Runnable {
    private final /* synthetic */ zzbg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhj zzc;

    zzhw(zzhj zzhj, zzbg zzbg, String str) {
        this.zzc = zzhj;
        this.zza = zzbg;
        this.zzb = str;
    }

    public final void run() {
        this.zzc.zza.zzr();
        this.zzc.zza.zza(this.zza, this.zzb);
    }
}
