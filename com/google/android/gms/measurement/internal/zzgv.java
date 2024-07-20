package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzb;

final class zzgv extends LruCache<String, zzb> {
    private final /* synthetic */ zzgp zza;

    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzgp.zza(this.zza, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgv(zzgp zzgp, int i) {
        super(20);
        this.zza = zzgp;
    }
}
