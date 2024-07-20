package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbai  reason: invalid package */
public final /* synthetic */ class zbai implements RemoteCall {
    public final /* synthetic */ zbam zba;
    public final /* synthetic */ SavePasswordRequest zbb;

    public /* synthetic */ zbai(zbam zbam, SavePasswordRequest savePasswordRequest) {
        this.zba = zbam;
        this.zbb = savePasswordRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbam zbam = this.zba;
        SavePasswordRequest savePasswordRequest = this.zbb;
        ((zbz) ((zbw) obj).getService()).zbd(new zbal(zbam, (TaskCompletionSource) obj2), (SavePasswordRequest) Preconditions.checkNotNull(savePasswordRequest));
    }
}
