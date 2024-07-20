package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zbd;
import com.google.android.gms.auth.api.signin.internal.zbe;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.p001authapi.zbl;
import com.google.android.gms.internal.p001authapi.zbo;

public final class Auth {
    public static final Api<AuthCredentialsOptions> CREDENTIALS_API;
    public static final CredentialsApi CredentialsApi = new zbl();
    public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;
    public static final GoogleSignInApi GoogleSignInApi = new zbd();
    @Deprecated
    public static final Api<AuthProxyOptions> PROXY_API = AuthProxy.API;
    @Deprecated
    public static final ProxyApi ProxyApi = AuthProxy.ProxyApi;
    public static final Api.ClientKey<zbo> zba;
    public static final Api.ClientKey<zbe> zbb;
    private static final Api.AbstractClientBuilder<zbo, AuthCredentialsOptions> zbc;
    private static final Api.AbstractClientBuilder<zbe, GoogleSignInOptions> zbd;

    @Deprecated
    public static class AuthCredentialsOptions implements Api.ApiOptions.Optional {
        public static final AuthCredentialsOptions zba = new AuthCredentialsOptions(new Builder());
        /* access modifiers changed from: private */
        public final String zbb = null;
        /* access modifiers changed from: private */
        public final boolean zbc;
        /* access modifiers changed from: private */
        public final String zbd;

        @Deprecated
        public static class Builder {
            public Boolean zba = Boolean.FALSE;
            protected String zbb;

            public Builder() {
            }

            public Builder forceEnableSaveDialog() {
                this.zba = Boolean.TRUE;
                return this;
            }

            public final Builder zba(String str) {
                this.zbb = str;
                return this;
            }

            public Builder(AuthCredentialsOptions authCredentialsOptions) {
                String unused = authCredentialsOptions.zbb;
                this.zba = Boolean.valueOf(authCredentialsOptions.zbc);
                this.zbb = authCredentialsOptions.zbd;
            }
        }

        public AuthCredentialsOptions(Builder builder) {
            this.zbc = builder.zba.booleanValue();
            this.zbd = builder.zbb;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AuthCredentialsOptions)) {
                return false;
            }
            AuthCredentialsOptions authCredentialsOptions = (AuthCredentialsOptions) obj;
            String str = authCredentialsOptions.zbb;
            return Objects.equal((Object) null, (Object) null) && this.zbc == authCredentialsOptions.zbc && Objects.equal(this.zbd, authCredentialsOptions.zbd);
        }

        public int hashCode() {
            return Objects.hashCode(null, Boolean.valueOf(this.zbc), this.zbd);
        }

        public final Bundle zba() {
            Bundle bundle = new Bundle();
            bundle.putString("consumer_package", (String) null);
            bundle.putBoolean("force_save_dialog", this.zbc);
            bundle.putString("log_session_id", this.zbd);
            return bundle;
        }

        public final String zbd() {
            return this.zbd;
        }
    }

    static {
        Api.ClientKey<zbo> clientKey = new Api.ClientKey<>();
        zba = clientKey;
        Api.ClientKey<zbe> clientKey2 = new Api.ClientKey<>();
        zbb = clientKey2;
        zba zba2 = new zba();
        zbc = zba2;
        zbb zbb2 = new zbb();
        zbd = zbb2;
        CREDENTIALS_API = new Api<>("Auth.CREDENTIALS_API", zba2, clientKey);
        GOOGLE_SIGN_IN_API = new Api<>("Auth.GOOGLE_SIGN_IN_API", zbb2, clientKey2);
    }

    private Auth() {
    }
}
