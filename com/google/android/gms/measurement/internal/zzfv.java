package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final class zzfv {
    public String zza;
    public Bundle zzb;
    private String zzc;
    private long zzd;

    public final zzbg zza() {
        return new zzbg(this.zza, new zzbb(new Bundle(this.zzb)), this.zzc, this.zzd);
    }

    public static zzfv zza(zzbg zzbg) {
        return new zzfv(zzbg.zza, zzbg.zzc, zzbg.zzb.zzb(), zzbg.zzd);
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zza;
        String valueOf = String.valueOf(this.zzb);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    private zzfv(String str, String str2, Bundle bundle, long j) {
        this.zza = str;
        this.zzc = str2;
        this.zzb = bundle == null ? new Bundle() : bundle;
        this.zzd = j;
    }
}
