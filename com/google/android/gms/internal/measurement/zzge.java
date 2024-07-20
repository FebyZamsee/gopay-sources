package com.google.android.gms.internal.measurement;

import android.os.Binder;

public final /* synthetic */ class zzge {
    public static <V> V zza(zzgd<V> zzgd) {
        long clearCallingIdentity;
        try {
            return zzgd.zza();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V zza = zzgd.zza();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return zza;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
