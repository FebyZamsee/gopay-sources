package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;

final class AutoValue_TokenResult extends TokenResult {
    private final TokenResult.ResponseCode responseCode;
    private final String token;
    private final long tokenExpirationTimestamp;

    private AutoValue_TokenResult(String str, long j, TokenResult.ResponseCode responseCode2) {
        this.token = str;
        this.tokenExpirationTimestamp = j;
        this.responseCode = responseCode2;
    }

    public final String getToken() {
        return this.token;
    }

    public final long getTokenExpirationTimestamp() {
        return this.tokenExpirationTimestamp;
    }

    public final TokenResult.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.token);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.tokenExpirationTimestamp);
        sb.append(", responseCode=");
        sb.append(this.responseCode);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.token;
        if (str != null ? str.equals(tokenResult.getToken()) : tokenResult.getToken() == null) {
            if (this.tokenExpirationTimestamp == tokenResult.getTokenExpirationTimestamp()) {
                TokenResult.ResponseCode responseCode2 = this.responseCode;
                if (responseCode2 == null) {
                    if (tokenResult.getResponseCode() == null) {
                        return true;
                    }
                } else if (!responseCode2.equals(tokenResult.getResponseCode())) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.token;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.tokenExpirationTimestamp;
        int i2 = (int) (j ^ (j >>> 32));
        TokenResult.ResponseCode responseCode2 = this.responseCode;
        if (responseCode2 != null) {
            i = responseCode2.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i;
    }

    static final class Builder extends TokenResult.Builder {
        private TokenResult.ResponseCode responseCode;
        private String token;
        private Long tokenExpirationTimestamp;

        Builder() {
        }

        public final TokenResult.Builder setToken(String str) {
            this.token = str;
            return this;
        }

        public final TokenResult.Builder setTokenExpirationTimestamp(long j) {
            this.tokenExpirationTimestamp = Long.valueOf(j);
            return this;
        }

        public final TokenResult.Builder setResponseCode(TokenResult.ResponseCode responseCode2) {
            this.responseCode = responseCode2;
            return this;
        }

        public final TokenResult build() {
            String str = this.tokenExpirationTimestamp == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new AutoValue_TokenResult(this.token, this.tokenExpirationTimestamp.longValue(), this.responseCode);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }
}
