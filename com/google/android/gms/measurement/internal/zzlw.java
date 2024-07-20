package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final /* synthetic */ class zzlw implements Runnable {
    private /* synthetic */ zzlu zza;
    private /* synthetic */ int zzb;
    private /* synthetic */ zzfr zzc;
    private /* synthetic */ Intent zzd;

    public /* synthetic */ zzlw(zzlu zzlu, int i, zzfr zzfr, Intent intent) {
        this.zza = zzlu;
        this.zzb = i;
        this.zzc = zzfr;
        this.zzd = intent;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd);
    }
}
