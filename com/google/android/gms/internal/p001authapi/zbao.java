package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbao  reason: invalid package */
public final /* synthetic */ class zbao implements RemoteCall {
    public final /* synthetic */ zbau zba;
    public final /* synthetic */ BeginSignInRequest zbb;

    public /* synthetic */ zbao(zbau zbau, BeginSignInRequest beginSignInRequest) {
        this.zba = zbau;
        this.zbb = beginSignInRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbau zbau = this.zba;
        BeginSignInRequest beginSignInRequest = this.zbb;
        ((zbag) ((zbav) obj).getService()).zbc(new zbar(zbau, (TaskCompletionSource) obj2), (BeginSignInRequest) Preconditions.checkNotNull(beginSignInRequest));
    }
}
