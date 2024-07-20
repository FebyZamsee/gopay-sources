package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzm;
import java.util.concurrent.Callable;

public final /* synthetic */ class zzgq implements Callable {
    private /* synthetic */ zzgp zza;
    private /* synthetic */ String zzb;

    public /* synthetic */ zzgq(zzgp zzgp, String str) {
        this.zza = zzgp;
        this.zzb = str;
    }

    public final Object call() {
        return new zzm("internal.remoteConfig", new zzgx(this.zza, this.zzb));
    }
}
