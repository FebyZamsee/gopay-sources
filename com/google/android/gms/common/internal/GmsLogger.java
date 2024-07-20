package com.google.android.gms.common.internal;

import android.util.Log;

public final class GmsLogger {
    private final String zza;
    private final String zzb;

    public GmsLogger(String str) {
        this(str, (String) null);
    }

    private final String zza(String str) {
        String str2 = this.zzb;
        return str2 == null ? str : str2.concat(str);
    }

    private final String zzb(String str, Object... objArr) {
        String format = String.format(str, objArr);
        String str2 = this.zzb;
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    public final boolean canLog(int i) {
        return Log.isLoggable(this.zza, i);
    }

    public final boolean canLogPii() {
        return false;
    }

    public final void d(String str, String str2) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    public final void e(String str, String str2) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    public final void efmt(String str, String str2, Object... objArr) {
        if (canLog(6)) {
            zzb(str2, objArr);
        }
    }

    public final void i(String str, String str2) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    public final void pii(String str, String str2) {
    }

    public final void pii(String str, String str2, Throwable th) {
    }

    public final void v(String str, String str2) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    public final void w(String str, String str2) {
        if (canLog(5)) {
            zza(str2);
        }
    }

    public final void wfmt(String str, String str2, Object... objArr) {
        if (canLog(5)) {
            zzb(str2, objArr);
        }
    }

    public final void wtf(String str, String str2, Throwable th) {
        if (canLog(7)) {
            zza(str2);
            Log.wtf(str, zza(str2), th);
        }
    }

    public GmsLogger(String str, String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.zza = str;
        if (str2 == null || str2.length() <= 0) {
            this.zzb = null;
        } else {
            this.zzb = str2;
        }
    }

    public final void d(String str, String str2, Throwable th) {
        if (canLog(3)) {
            zza(str2);
        }
    }

    public final void e(String str, String str2, Throwable th) {
        if (canLog(6)) {
            zza(str2);
        }
    }

    public final void i(String str, String str2, Throwable th) {
        if (canLog(4)) {
            zza(str2);
        }
    }

    public final void v(String str, String str2, Throwable th) {
        if (canLog(2)) {
            zza(str2);
        }
    }

    public final void w(String str, String str2, Throwable th) {
        if (canLog(5)) {
            zza(str2);
        }
    }
}
