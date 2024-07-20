package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

final class zzha implements Thread.UncaughtExceptionHandler {
    private final String zza;
    private final /* synthetic */ zzgy zzb;

    public zzha(zzgy zzgy, String str) {
        this.zzb = zzgy;
        Preconditions.checkNotNull(str);
        this.zza = str;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        synchronized (this) {
            this.zzb.zzj().zzg().zza(this.zza, th);
        }
    }
}
