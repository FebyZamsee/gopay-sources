package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.zzdf;

final class zzet extends zzdf.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdf.zzd zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzet(zzdf.zzd zzd2, Activity activity) {
        super(zzdf.this);
        this.zzd = zzd2;
        this.zzc = activity;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcu) Preconditions.checkNotNull(zzdf.this.zzj)).onActivityDestroyed(ObjectWrapper.wrap(this.zzc), this.zzb);
    }
}