package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.auth.api.identity.CredentialSavingClient;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api.zbam  reason: invalid package */
public final class zbam extends GoogleApi<zbc> implements CredentialSavingClient {
    private static final Api.ClientKey<zbw> zba;
    private static final Api.AbstractClientBuilder<zbw, zbc> zbb;
    private static final Api<zbc> zbc;
    private final String zbd = zbax.zba();

    static {
        Api.ClientKey<zbw> clientKey = new Api.ClientKey<>();
        zba = clientKey;
        zbaj zbaj = new zbaj();
        zbb = zbaj;
        zbc = new Api<>("Auth.Api.Identity.CredentialSaving.API", zbaj, clientKey);
    }

    public zbam(Activity activity, zbc zbc2) {
        super(activity, zbc, zbc2, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<SaveAccountLinkingTokenResult> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        SaveAccountLinkingTokenRequest.Builder zba2 = SaveAccountLinkingTokenRequest.zba(saveAccountLinkingTokenRequest);
        zba2.zba(this.zbd);
        SaveAccountLinkingTokenRequest build = zba2.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zbg).run(new zbah(this, build)).setAutoResolveMissingFeatures(false).setMethodKey(1535).build());
    }

    public final Task<SavePasswordResult> savePassword(SavePasswordRequest savePasswordRequest) {
        SavePasswordRequest.Builder zba2 = SavePasswordRequest.zba(savePasswordRequest);
        zba2.zba(this.zbd);
        SavePasswordRequest build = zba2.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zbe).run(new zbai(this, build)).setAutoResolveMissingFeatures(false).setMethodKey(1536).build());
    }

    public zbam(Context context, zbc zbc2) {
        super(context, zbc, zbc2, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
