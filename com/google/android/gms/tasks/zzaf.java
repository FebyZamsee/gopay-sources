package com.google.android.gms.tasks;

import java.util.concurrent.ExecutionException;

final class zzaf<T> implements zzae<T> {
    private final Object zza = new Object();
    private final int zzb;
    private final zzw zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private Exception zzg;
    private boolean zzh;

    public zzaf(int i, zzw zzw) {
        this.zzb = i;
        this.zzc = zzw;
    }

    private final void zza() {
        int i = this.zzd;
        int i2 = this.zze;
        int i3 = i + i2 + this.zzf;
        int i4 = this.zzb;
        if (i3 != i4) {
            return;
        }
        if (this.zzg != null) {
            zzw zzw = this.zzc;
            zzw.zza(new ExecutionException(i2 + " out of " + i4 + " underlying tasks failed", this.zzg));
        } else if (this.zzh) {
            this.zzc.zzc();
        } else {
            this.zzc.zzb((Object) null);
        }
    }

    public final void onCanceled() {
        synchronized (this.zza) {
            this.zzf++;
            this.zzh = true;
            zza();
        }
    }

    public final void onFailure(Exception exc) {
        synchronized (this.zza) {
            this.zze++;
            this.zzg = exc;
            zza();
        }
    }

    public final void onSuccess(T t) {
        synchronized (this.zza) {
            this.zzd++;
            zza();
        }
    }
}
