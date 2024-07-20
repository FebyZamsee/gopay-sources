package com.google.android.gms.internal.location;

import java.util.List;

final class zzdr extends zzds {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzds zzc;

    zzdr(zzds zzds, int i, int i2) {
        this.zzc = zzds;
        this.zza = i;
        this.zzb = i2;
    }

    public final Object get(int i) {
        zzdm.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* access modifiers changed from: package-private */
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    public final zzds zzh(int i, int i2) {
        zzdm.zzc(i, i2, this.zzb);
        zzds zzds = this.zzc;
        int i3 = this.zza;
        return zzds.subList(i + i3, i2 + i3);
    }
}
