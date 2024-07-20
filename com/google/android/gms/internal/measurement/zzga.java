package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzga extends ContentObserver {
    private final /* synthetic */ zzfy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzga(zzfy zzfy, Handler handler) {
        super((Handler) null);
        this.zza = zzfy;
    }

    public final void onChange(boolean z) {
        this.zza.zzd();
    }
}
