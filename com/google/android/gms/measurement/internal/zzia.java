package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzia implements Callable<List<zzne>> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzhj zzb;

    public final /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzr();
        return this.zzb.zza.zzf().zzi(this.zza);
    }

    zzia(zzhj zzhj, String str) {
        this.zzb = zzhj;
        this.zza = str;
    }
}
