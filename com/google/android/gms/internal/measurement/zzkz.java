package com.google.android.gms.internal.measurement;

final class zzkz implements zzkh {
    private final zzkj zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public final zzkj zza() {
        return this.zza;
    }

    public final zzky zzb() {
        int i = this.zzd;
        if ((i & 1) != 0) {
            return zzky.PROTO2;
        }
        if ((i & 4) == 4) {
            return zzky.EDITIONS;
        }
        return zzky.PROTO3;
    }

    /* access modifiers changed from: package-private */
    public final String zzd() {
        return this.zzb;
    }

    zzkz(zzkj zzkj, String str, Object[] objArr) {
        this.zza = zzkj;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 1;
        int i2 = 13;
        while (true) {
            char charAt2 = str.charAt(i);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i2;
                i2 += 13;
                i++;
            } else {
                this.zzd = c | (charAt2 << i2);
                return;
            }
        }
    }

    public final boolean zzc() {
        return (this.zzd & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zze() {
        return this.zzc;
    }
}
