package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;

final class AutoValue_InstallationResponse extends InstallationResponse {
    private final TokenResult authToken;
    private final String fid;
    private final String refreshToken;
    private final InstallationResponse.ResponseCode responseCode;
    private final String uri;

    private AutoValue_InstallationResponse(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode2) {
        this.uri = str;
        this.fid = str2;
        this.refreshToken = str3;
        this.authToken = tokenResult;
        this.responseCode = responseCode2;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getFid() {
        return this.fid;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final TokenResult getAuthToken() {
        return this.authToken;
    }

    public final InstallationResponse.ResponseCode getResponseCode() {
        return this.responseCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.uri);
        sb.append(", fid=");
        sb.append(this.fid);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", authToken=");
        sb.append(this.authToken);
        sb.append(", responseCode=");
        sb.append(this.responseCode);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.uri;
        if (str != null ? str.equals(installationResponse.getUri()) : installationResponse.getUri() == null) {
            String str2 = this.fid;
            if (str2 != null ? str2.equals(installationResponse.getFid()) : installationResponse.getFid() == null) {
                String str3 = this.refreshToken;
                if (str3 != null ? str3.equals(installationResponse.getRefreshToken()) : installationResponse.getRefreshToken() == null) {
                    TokenResult tokenResult = this.authToken;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.getAuthToken()) : installationResponse.getAuthToken() == null) {
                        InstallationResponse.ResponseCode responseCode2 = this.responseCode;
                        if (responseCode2 == null) {
                            if (installationResponse.getResponseCode() == null) {
                                return true;
                            }
                        } else if (!responseCode2.equals(installationResponse.getResponseCode())) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.uri;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fid;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.refreshToken;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        TokenResult tokenResult = this.authToken;
        int hashCode4 = tokenResult == null ? 0 : tokenResult.hashCode();
        InstallationResponse.ResponseCode responseCode2 = this.responseCode;
        if (responseCode2 != null) {
            i = responseCode2.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i;
    }

    static final class Builder extends InstallationResponse.Builder {
        private TokenResult authToken;
        private String fid;
        private String refreshToken;
        private InstallationResponse.ResponseCode responseCode;
        private String uri;

        Builder() {
        }

        public final InstallationResponse.Builder setUri(String str) {
            this.uri = str;
            return this;
        }

        public final InstallationResponse.Builder setFid(String str) {
            this.fid = str;
            return this;
        }

        public final InstallationResponse.Builder setRefreshToken(String str) {
            this.refreshToken = str;
            return this;
        }

        public final InstallationResponse.Builder setAuthToken(TokenResult tokenResult) {
            this.authToken = tokenResult;
            return this;
        }

        public final InstallationResponse.Builder setResponseCode(InstallationResponse.ResponseCode responseCode2) {
            this.responseCode = responseCode2;
            return this;
        }

        public final InstallationResponse build() {
            return new AutoValue_InstallationResponse(this.uri, this.fid, this.refreshToken, this.authToken, this.responseCode);
        }
    }
}
