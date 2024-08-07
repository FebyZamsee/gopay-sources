package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.internal.p000authapiphone.zzi;
import com.google.android.gms.tasks.Task;

public abstract class SmsRetrieverClient extends GoogleApi<Api.ApiOptions.NoOptions> implements SmsRetrieverApi {
    private static final Api<Api.ApiOptions.NoOptions> API;
    private static final Api.AbstractClientBuilder<zzi, Api.ApiOptions.NoOptions> CLIENT_BUILDER;
    private static final Api.ClientKey<zzi> CLIENT_KEY;

    static {
        Api.ClientKey<zzi> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zza zza = new zza();
        CLIENT_BUILDER = zza;
        API = new Api<>("SmsRetriever.API", zza, clientKey);
    }

    public SmsRetrieverClient(Activity activity) {
        super(activity, API, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public SmsRetrieverClient(Context context) {
        super(context, API, null, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    public abstract Task<Void> startSmsRetriever();
}
