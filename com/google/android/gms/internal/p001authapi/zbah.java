package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbah  reason: invalid package */
public final /* synthetic */ class zbah implements RemoteCall {
    public final /* synthetic */ zbam zba;
    public final /* synthetic */ SaveAccountLinkingTokenRequest zbb;

    public /* synthetic */ zbah(zbam zbam, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        this.zba = zbam;
        this.zbb = saveAccountLinkingTokenRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbam zbam = this.zba;
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = this.zbb;
        ((zbz) ((zbw) obj).getService()).zbc(new zbak(zbam, (TaskCompletionSource) obj2), (SaveAccountLinkingTokenRequest) Preconditions.checkNotNull(saveAccountLinkingTokenRequest));
    }
}
