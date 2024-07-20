package com.google.firebase.installations;

import com.google.firebase.installations.InstallationTokenResult;

final class AutoValue_InstallationTokenResult extends InstallationTokenResult {
    private final String token;
    private final long tokenCreationTimestamp;
    private final long tokenExpirationTimestamp;

    private AutoValue_InstallationTokenResult(String str, long j, long j2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.tokenCreationTimestamp = j2;
    }

    public final String getToken() {
        return this.token;
    }

    public final long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public final long getTokenCreationTimestamp() {
        return this.tokenCreationTimestamp;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationTokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.tokenCreationTimestamp);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationTokenResult)) {
            return false;
        }
        InstallationTokenResult installationTokenResult = (InstallationTokenResult) obj;
        if (this.token.equals(installationTokenResult.getToken()) && this.tokenExpirationTimestamp == installationTokenResult.getTokenExpirationTimestamp() && this.tokenCreationTimestamp == installationTokenResult.getTokenCreationTimestamp()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.token.hashCode();
        long j = this.tokenExpirationTimestamp;
        long j2 = this.tokenCreationTimestamp;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    static final class Builder extends InstallationTokenResult.Builder {
        private String token;
        private Long tokenCreationTimestamp;
        private Long tokenExpirationTimestamp;

        Builder() {
        }

        public final InstallationTokenResult.Builder setToken(String str) {
            if (str != null) {
                this.token = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        public final InstallationTokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = Long.valueOf(j);
            return this;
        }

        public final InstallationTokenResult.Builder setTokenCreationTimestamp(long j) {
            this.tokenCreationTimestamp = Long.valueOf(j);
            return this;
        }

        public final InstallationTokenResult build() {
            String str = this.token == null ? " token" : "";
            if (this.tokenExpirationTimestamp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" tokenExpirationTimestamp");
                str = sb.toString();
            }
            if (this.tokenCreationTimestamp == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" tokenCreationTimestamp");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_InstallationTokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.tokenCreationTimestamp.longValue());
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }
}
