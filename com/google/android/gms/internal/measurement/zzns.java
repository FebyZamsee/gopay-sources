package com.google.android.gms.internal.measurement;

public final class zzns implements zznt {
    private static final zzgn<Boolean> zza;
    private static final zzgn<Boolean> zzb;
    private static final zzgn<Boolean> zzc;

    public final boolean zza() {
        return true;
    }

    static {
        zzgv zza2 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.collection.event_safelist", true);
        zzb = zza2.zza("measurement.service.store_null_safelist", true);
        zzc = zza2.zza("measurement.service.store_safelist", true);
    }

    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }

    public final boolean zzc() {
        return zzc.zza().booleanValue();
    }
}
