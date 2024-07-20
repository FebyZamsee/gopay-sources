package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

final class AutoValue_InstallIdProvider_InstallIds extends InstallIdProvider.InstallIds {
    private final String crashlyticsInstallId;
    private final String firebaseInstallationId;

    AutoValue_InstallIdProvider_InstallIds(String str, String str2) {
        if (str != null) {
            this.crashlyticsInstallId = str;
            this.firebaseInstallationId = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final String getCrashlyticsInstallId() {
        return this.crashlyticsInstallId;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.crashlyticsInstallId);
        sb.append(", firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallIdProvider.InstallIds)) {
            return false;
        }
        InstallIdProvider.InstallIds installIds = (InstallIdProvider.InstallIds) obj;
        if (this.crashlyticsInstallId.equals(installIds.getCrashlyticsInstallId())) {
            String str = this.firebaseInstallationId;
            if (str == null) {
                if (installIds.getFirebaseInstallationId() == null) {
                    return true;
                }
            } else if (!str.equals(installIds.getFirebaseInstallationId())) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.crashlyticsInstallId.hashCode();
        String str = this.firebaseInstallationId;
        return ((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }
}
