package com.google.android.gms.internal.measurement;

public final class zzch {
    private static final zzci zza;
    private static volatile zzci zzb;

    public static zzci zza() {
        return zzb;
    }

    static {
        zzck zzck = new zzck();
        zza = zzck;
        zzb = zzck;
    }
}
