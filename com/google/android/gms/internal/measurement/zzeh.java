package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;

final class zzeh extends zzdf.zza {
    private final /* synthetic */ boolean zzc;
    private final /* synthetic */ zzdf zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeh(zzdf zzdf, boolean z) {
        super(zzdf);
        this.zzd = zzdf;
        this.zzc = z;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        ((zzcu) Preconditions.checkNotNull(this.zzd.zzj)).setDataCollectionEnabled(this.zzc);
    }
}
