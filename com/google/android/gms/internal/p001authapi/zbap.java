package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbap  reason: invalid package */
public final /* synthetic */ class zbap implements RemoteCall {
    public final /* synthetic */ zbau zba;
    public final /* synthetic */ GetSignInIntentRequest zbb;

    public /* synthetic */ zbap(zbau zbau, GetSignInIntentRequest getSignInIntentRequest) {
        this.zba = zbau;
        this.zbb = getSignInIntentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        zbau zbau = this.zba;
        GetSignInIntentRequest getSignInIntentRequest = this.zbb;
        ((zbag) ((zbav) obj).getService()).zbd(new zbat(zbau, (TaskCompletionSource) obj2), (GetSignInIntentRequest) Preconditions.checkNotNull(getSignInIntentRequest));
    }
}
