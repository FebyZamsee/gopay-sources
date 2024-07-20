package com.google.android.gms.internal.location;

final class zzdq extends zzdo {
    private final zzds zza;

    zzdq(zzds zzds, int i) {
        super(zzds.size(), i);
        this.zza = zzds;
    }

    /* access modifiers changed from: protected */
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
