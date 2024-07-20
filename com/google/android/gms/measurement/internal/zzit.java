package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class zzit implements Runnable {
    private /* synthetic */ zziq zza;
    private /* synthetic */ Bundle zzb;

    public /* synthetic */ zzit(zziq zziq, Bundle bundle) {
        this.zza = zziq;
        this.zzb = bundle;
    }

    public final void run() {
        this.zza.zza(this.zzb);
    }
}
