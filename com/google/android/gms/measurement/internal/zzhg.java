package com.google.android.gms.measurement.internal;

final class zzhg implements Runnable {
    private final /* synthetic */ zzio zza;
    private final /* synthetic */ zzhf zzb;

    zzhg(zzhf zzhf, zzio zzio) {
        this.zzb = zzhf;
        this.zza = zzio;
    }

    public final void run() {
        zzhf.zza(this.zzb, this.zza);
        this.zzb.zza(this.zza.zzg);
    }
}
