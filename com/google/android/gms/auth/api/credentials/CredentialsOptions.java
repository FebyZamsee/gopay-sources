package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.auth.api.Auth;

public final class CredentialsOptions extends Auth.AuthCredentialsOptions {
    public static final CredentialsOptions DEFAULT = new Builder().build();

    public static final class Builder extends Auth.AuthCredentialsOptions.Builder {
        public final CredentialsOptions build() {
            return new CredentialsOptions(this, (zbd) null);
        }

        public final Builder forceEnableSaveDialog() {
            this.zba = Boolean.TRUE;
            return this;
        }
    }

    /* synthetic */ CredentialsOptions(Builder builder, zbd zbd) {
        super(builder);
    }
}
