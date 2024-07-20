package com.google.android.gms.internal.measurement;

public final class zzpo implements zzpp {
    private static final zzgn<Boolean> zza;
    private static final zzgn<Long> zzb;

    public final boolean zza() {
        return true;
    }

    static {
        zzgv zza2 = new zzgv(zzgk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.remove_app_background.client", false);
        zzb = zza2.zza("measurement.id.remove_app_background.client", 0);
    }

    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
