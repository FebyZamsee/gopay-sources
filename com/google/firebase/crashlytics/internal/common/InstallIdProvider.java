package com.google.firebase.crashlytics.internal.common;

public interface InstallIdProvider {
    InstallIds getInstallIds();

    public static abstract class InstallIds {
        public abstract String getCrashlyticsInstallId();

        public abstract String getFirebaseInstallationId();

        public static InstallIds createWithoutFid(String str) {
            return create(str, (String) null);
        }

        static InstallIds create(String str, String str2) {
            return new AutoValue_InstallIdProvider_InstallIds(str, str2);
        }
    }
}
