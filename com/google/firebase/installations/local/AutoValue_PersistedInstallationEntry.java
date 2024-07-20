package com.google.firebase.installations.local;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

final class AutoValue_PersistedInstallationEntry extends PersistedInstallationEntry {
    private final String authToken;
    private final long expiresInSecs;
    private final String firebaseInstallationId;
    private final String fisError;
    private final String refreshToken;
    private final PersistedInstallation.RegistrationStatus registrationStatus;
    private final long tokenCreationEpochInSecs;

    private AutoValue_PersistedInstallationEntry(String str, PersistedInstallation.RegistrationStatus registrationStatus2, String str2, String str3, long j, long j2, String str4) {
        this.firebaseInstallationId = str;
        this.registrationStatus = registrationStatus2;
        this.authToken = str2;
        this.refreshToken = str3;
        this.expiresInSecs = j;
        this.tokenCreationEpochInSecs = j2;
        this.fisError = str4;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final PersistedInstallation.RegistrationStatus getRegistrationStatus() {
        return this.registrationStatus;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final long getExpiresInSecs() {
        return this.expiresInSecs;
    }

    public final long getTokenCreationEpochInSecs() {
        return this.tokenCreationEpochInSecs;
    }

    public final String getFisError() {
        return this.fisError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", registrationStatus=");
        sb.append(this.registrationStatus);
        sb.append(", authToken=");
        sb.append(this.authToken);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", expiresInSecs=");
        sb.append(this.expiresInSecs);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.tokenCreationEpochInSecs);
        sb.append(", fisError=");
        sb.append(this.fisError);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedInstallationEntry)) {
            return false;
        }
        PersistedInstallationEntry persistedInstallationEntry = (PersistedInstallationEntry) obj;
        String str3 = this.firebaseInstallationId;
        if (str3 != null ? str3.equals(persistedInstallationEntry.getFirebaseInstallationId()) : persistedInstallationEntry.getFirebaseInstallationId() == null) {
            if (this.registrationStatus.equals(persistedInstallationEntry.getRegistrationStatus()) && ((str = this.authToken) != null ? str.equals(persistedInstallationEntry.getAuthToken()) : persistedInstallationEntry.getAuthToken() == null) && ((str2 = this.refreshToken) != null ? str2.equals(persistedInstallationEntry.getRefreshToken()) : persistedInstallationEntry.getRefreshToken() == null) && this.expiresInSecs == persistedInstallationEntry.getExpiresInSecs() && this.tokenCreationEpochInSecs == persistedInstallationEntry.getTokenCreationEpochInSecs()) {
                String str4 = this.fisError;
                if (str4 == null) {
                    if (persistedInstallationEntry.getFisError() == null) {
                        return true;
                    }
                } else if (!str4.equals(persistedInstallationEntry.getFisError())) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.firebaseInstallationId;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.registrationStatus.hashCode();
        String str2 = this.authToken;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.refreshToken;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        long j = this.expiresInSecs;
        int i2 = (int) (j ^ (j >>> 32));
        long j2 = this.tokenCreationEpochInSecs;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        String str4 = this.fisError;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i;
    }

    public final PersistedInstallationEntry.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends PersistedInstallationEntry.Builder {
        private String authToken;
        private Long expiresInSecs;
        private String firebaseInstallationId;
        private String fisError;
        private String refreshToken;
        private PersistedInstallation.RegistrationStatus registrationStatus;
        private Long tokenCreationEpochInSecs;

        Builder() {
        }

        private Builder(PersistedInstallationEntry persistedInstallationEntry) {
            this.firebaseInstallationId = persistedInstallationEntry.getFirebaseInstallationId();
            this.registrationStatus = persistedInstallationEntry.getRegistrationStatus();
            this.authToken = persistedInstallationEntry.getAuthToken();
            this.refreshToken = persistedInstallationEntry.getRefreshToken();
            this.expiresInSecs = Long.valueOf(persistedInstallationEntry.getExpiresInSecs());
            this.tokenCreationEpochInSecs = Long.valueOf(persistedInstallationEntry.getTokenCreationEpochInSecs());
            this.fisError = persistedInstallationEntry.getFisError();
        }

        public final PersistedInstallationEntry.Builder setFirebaseInstallationId(String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        public final PersistedInstallationEntry.Builder setRegistrationStatus(PersistedInstallation.RegistrationStatus registrationStatus2) {
            if (registrationStatus2 != null) {
                this.registrationStatus = registrationStatus2;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public final PersistedInstallationEntry.Builder setAuthToken(String str) {
            this.authToken = str;
            return this;
        }

        public final PersistedInstallationEntry.Builder setRefreshToken(String str) {
            this.refreshToken = str;
            return this;
        }

        public final PersistedInstallationEntry.Builder setExpiresInSecs(long j) {
            this.expiresInSecs = Long.valueOf(j);
            return this;
        }

        public final PersistedInstallationEntry.Builder setTokenCreationEpochInSecs(long j) {
            this.tokenCreationEpochInSecs = Long.valueOf(j);
            return this;
        }

        public final PersistedInstallationEntry.Builder setFisError(String str) {
            this.fisError = str;
            return this;
        }

        public final PersistedInstallationEntry build() {
            String str = this.registrationStatus == null ? " registrationStatus" : "";
            if (this.expiresInSecs == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" expiresInSecs");
                str = sb.toString();
            }
            if (this.tokenCreationEpochInSecs == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" tokenCreationEpochInSecs");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_PersistedInstallationEntry(this.firebaseInstallationId, this.registrationStatus, this.authToken, this.refreshToken, this.expiresInSecs.longValue(), this.tokenCreationEpochInSecs.longValue(), this.fisError);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }
}
