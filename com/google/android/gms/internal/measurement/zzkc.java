package com.google.android.gms.internal.measurement;

final class zzkc implements zzkk {
    private zzkk[] zza;

    public final zzkh zza(Class<?> cls) {
        for (zzkk zzkk : this.zza) {
            if (zzkk.zzb(cls)) {
                return zzkk.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    zzkc(zzkk... zzkkArr) {
        this.zza = zzkkArr;
    }

    public final boolean zzb(Class<?> cls) {
        for (zzkk zzb : this.zza) {
            if (zzb.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
