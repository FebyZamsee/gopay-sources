package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import o.onSetButtonDrawable;

public final class zzgv {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final onSetButtonDrawable<Context, Boolean> zzh;
    private final boolean zzi;

    public final zzgv zza() {
        return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, true, this.zzg, this.zzh);
    }

    public final zzgv zzb() {
        if (this.zzc.isEmpty()) {
            onSetButtonDrawable<Context, Boolean> onsetbuttondrawable = this.zzh;
            if (onsetbuttondrawable == null) {
                return new zzgv(this.zza, this.zzb, this.zzc, this.zzd, true, this.zzf, this.zzi, this.zzg, onsetbuttondrawable);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzgn<Double> zza(String str, double d) {
        return zzgn.zza(this, str, Double.valueOf(-3.0d), true);
    }

    public final zzgn<Long> zza(String str, long j) {
        return zzgn.zza(this, str, Long.valueOf(j), true);
    }

    public final zzgn<String> zza(String str, String str2) {
        return zzgn.zza(this, str, str2, true);
    }

    public final zzgn<Boolean> zza(String str, boolean z) {
        return zzgn.zza(this, str, Boolean.valueOf(z), true);
    }

    public zzgv(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (onSetButtonDrawable<Context, Boolean>) null);
    }

    private zzgv(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, onSetButtonDrawable<Context, Boolean> onsetbuttondrawable) {
        this.zza = str;
        this.zzb = uri;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = z2;
        this.zzi = z3;
        this.zzg = z4;
        this.zzh = onsetbuttondrawable;
    }
}
