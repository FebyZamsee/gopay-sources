package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzjk implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zziq zzb;

    zzjk(zziq zziq, long j) {
        this.zzb = zziq;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zza(this.zza, true);
        this.zzb.zzo().zza((AtomicReference<String>) new AtomicReference());
    }
}
