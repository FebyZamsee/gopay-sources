package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.Feature;

/* renamed from: com.google.android.gms.internal.auth-api.zbaw  reason: invalid package */
public final class zbaw {
    public static final Feature zba;
    public static final Feature zbb;
    public static final Feature zbc;
    public static final Feature zbd;
    public static final Feature zbe;
    public static final Feature zbf;
    public static final Feature zbg;
    public static final Feature[] zbh;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 4);
        zba = feature;
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2);
        zbb = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1);
        zbc = feature3;
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1);
        zbd = feature4;
        Feature feature5 = new Feature("auth_api_credentials_save_password", 3);
        zbe = feature5;
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 4);
        zbf = feature6;
        Feature feature7 = new Feature("auth_api_credentials_save_account_linking_token", 2);
        zbg = feature7;
        zbh = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7};
    }
}
