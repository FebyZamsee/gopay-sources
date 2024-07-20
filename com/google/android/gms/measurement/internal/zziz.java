package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

final class zziz implements Executor {
    private final /* synthetic */ zziq zza;

    zziz(zziq zziq) {
        this.zza = zziq;
    }

    public final void execute(Runnable runnable) {
        this.zza.zzl().zzb(runnable);
    }
}
