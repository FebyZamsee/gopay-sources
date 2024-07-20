package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzhz implements Callable<byte[]> {
    private final /* synthetic */ zzbg zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzhj zzc;

    public final /* synthetic */ Object call() throws Exception {
        this.zzc.zza.zzr();
        return this.zzc.zza.zzm().zza(this.zza, this.zzb);
    }

    zzhz(zzhj zzhj, zzbg zzbg, String str) {
        this.zzc = zzhj;
        this.zza = zzbg;
        this.zzb = str;
    }
}
