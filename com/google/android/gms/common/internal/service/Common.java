package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Api;

public final class Common {
    public static final Api<Api.ApiOptions.NoOptions> API;
    public static final Api.ClientKey<zah> CLIENT_KEY;
    public static final zae zaa = new zae();
    private static final Api.AbstractClientBuilder zab;

    static {
        Api.ClientKey<zah> clientKey = new Api.ClientKey<>();
        CLIENT_KEY = clientKey;
        zab zab2 = new zab();
        zab = zab2;
        API = new Api<>("Common.API", zab2, clientKey);
    }
}
