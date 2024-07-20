package com.google.android.gms.internal.measurement;

import o.asInterface;

public final class zzgy {
    private final boolean zza;

    public zzgy(zzhb zzhb) {
        asInterface.RemoteActionCompatParcelizer.onTransact(zzhb, (Object) "BuildInfo must be non-null");
        this.zza = !zzhb.zza();
    }

    public final boolean zza(String str) {
        asInterface.RemoteActionCompatParcelizer.onTransact(str, (Object) "flagName must not be null");
        if (!this.zza) {
            return true;
        }
        return zzha.zza.get().asInterface(str);
    }
}
