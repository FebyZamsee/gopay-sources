package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInClient;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.zbl;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbau  reason: invalid package */
public final class zbau extends GoogleApi<zbl> implements SignInClient {
    private static final Api.ClientKey<zbav> zba;
    private static final Api.AbstractClientBuilder<zbav, zbl> zbb;
    private static final Api<zbl> zbc;
    private final String zbd = zbax.zba();

    static {
        Api.ClientKey<zbav> clientKey = new Api.ClientKey<>();
        zba = clientKey;
        zbaq zbaq = new zbaq();
        zbb = zbaq;
        zbc = new Api<>("Auth.Api.Identity.SignIn.API", zbaq, clientKey);
    }

    public zbau(Activity activity, zbl zbl) {
        super(activity, zbc, zbl, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest) {
        BeginSignInRequest.Builder zba2 = BeginSignInRequest.zba(beginSignInRequest);
        zba2.zba(this.zbd);
        BeginSignInRequest build = zba2.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zba).run(new zbao(this, build)).setAutoResolveMissingFeatures(false).setMethodKey(1553).build());
    }

    public final Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest) {
        GetSignInIntentRequest.Builder zba2 = GetSignInIntentRequest.zba(getSignInIntentRequest);
        zba2.zba(this.zbd);
        GetSignInIntentRequest build = zba2.build();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zbf).run(new zbap(this, build)).setMethodKey(1555).build());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (GoogleApiClient maybeSignOut : GoogleApiClient.getAllClients()) {
            maybeSignOut.maybeSignOut();
        }
        GoogleApiManager.reportSignOut();
        return doRead(TaskApiCall.builder().setFeatures(zbaw.zbb).run(new zban(this)).setAutoResolveMissingFeatures(false).setMethodKey(1554).build());
    }

    public final /* synthetic */ void zba(zbav zbav, TaskCompletionSource taskCompletionSource) throws RemoteException {
        ((zbag) zbav.getService()).zbe(new zbas(this, taskCompletionSource), this.zbd);
    }

    public final SignInCredential getSignInCredentialFromIntent(Intent intent) throws ApiException {
        if (intent != null) {
            Status status = (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, NotificationCompat.CATEGORY_STATUS, Status.CREATOR);
            if (status == null) {
                throw new ApiException(Status.RESULT_CANCELED);
            } else if (status.isSuccess()) {
                SignInCredential signInCredential = (SignInCredential) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "sign_in_credential", SignInCredential.CREATOR);
                if (signInCredential != null) {
                    return signInCredential;
                }
                throw new ApiException(Status.RESULT_INTERNAL_ERROR);
            } else {
                throw new ApiException(status);
            }
        } else {
            throw new ApiException(Status.RESULT_INTERNAL_ERROR);
        }
    }

    public zbau(Context context, zbl zbl) {
        super(context, zbc, zbl, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
