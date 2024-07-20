package com.google.android.gms.common;

import android.util.Log;

class zzx {
    private static final zzx zze = new zzx(true, 3, 1, (String) null, (Throwable) null);
    final boolean zza;
    final String zzb;
    final Throwable zzc;
    final int zzd;

    private zzx(boolean z, int i, int i2, String str, Throwable th) {
        this.zza = z;
        this.zzd = i;
        this.zzb = str;
        this.zzc = th;
    }

    /* synthetic */ zzx(boolean z, int i, int i2, String str, Throwable th, zzw zzw) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    static zzx zzb() {
        return zze;
    }

    static zzx zzc(String str) {
        return new zzx(false, 1, 5, str, (Throwable) null);
    }

    static zzx zzd(String str, Throwable th) {
        return new zzx(false, 1, 5, str, th);
    }

    static zzx zzf(int i) {
        return new zzx(true, i, 1, (String) null, (Throwable) null);
    }

    static zzx zzg(int i, int i2, String str, Throwable th) {
        return new zzx(false, i, i2, str, th);
    }

    /* access modifiers changed from: package-private */
    public String zza() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final void zze() {
        if (!this.zza && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.zzc != null) {
                Log.d("GoogleCertificatesRslt", zza(), this.zzc);
            } else {
                Log.d("GoogleCertificatesRslt", zza());
            }
        }
    }
}
