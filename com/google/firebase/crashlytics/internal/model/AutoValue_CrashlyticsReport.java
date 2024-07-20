package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport extends CrashlyticsReport {
    private final CrashlyticsReport.ApplicationExitInfo appExitInfo;
    private final String appQualitySessionId;
    private final String buildVersion;
    private final String displayVersion;
    private final String firebaseInstallationId;
    private final String gmpAppId;
    private final String installationUuid;
    private final CrashlyticsReport.FilesPayload ndkPayload;
    private final int platform;
    private final String sdkVersion;
    private final CrashlyticsReport.Session session;

    private AutoValue_CrashlyticsReport(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, CrashlyticsReport.Session session2, CrashlyticsReport.FilesPayload filesPayload, CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
        this.sdkVersion = str;
        this.gmpAppId = str2;
        this.platform = i;
        this.installationUuid = str3;
        this.firebaseInstallationId = str4;
        this.appQualitySessionId = str5;
        this.buildVersion = str6;
        this.displayVersion = str7;
        this.session = session2;
        this.ndkPayload = filesPayload;
        this.appExitInfo = applicationExitInfo;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getGmpAppId() {
        return this.gmpAppId;
    }

    public final int getPlatform() {
        return this.platform;
    }

    public final String getInstallationUuid() {
        return this.installationUuid;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    public final String getBuildVersion() {
        return this.buildVersion;
    }

    public final String getDisplayVersion() {
        return this.displayVersion;
    }

    public final CrashlyticsReport.Session getSession() {
        return this.session;
    }

    public final CrashlyticsReport.FilesPayload getNdkPayload() {
        return this.ndkPayload;
    }

    public final CrashlyticsReport.ApplicationExitInfo getAppExitInfo() {
        return this.appExitInfo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReport{sdkVersion=");
        sb.append(this.sdkVersion);
        sb.append(", gmpAppId=");
        sb.append(this.gmpAppId);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", installationUuid=");
        sb.append(this.installationUuid);
        sb.append(", firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", appQualitySessionId=");
        sb.append(this.appQualitySessionId);
        sb.append(", buildVersion=");
        sb.append(this.buildVersion);
        sb.append(", displayVersion=");
        sb.append(this.displayVersion);
        sb.append(", session=");
        sb.append(this.session);
        sb.append(", ndkPayload=");
        sb.append(this.ndkPayload);
        sb.append(", appExitInfo=");
        sb.append(this.appExitInfo);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        CrashlyticsReport.Session session2;
        CrashlyticsReport.FilesPayload filesPayload;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.sdkVersion.equals(crashlyticsReport.getSdkVersion()) && this.gmpAppId.equals(crashlyticsReport.getGmpAppId()) && this.platform == crashlyticsReport.getPlatform() && this.installationUuid.equals(crashlyticsReport.getInstallationUuid()) && ((str = this.firebaseInstallationId) != null ? str.equals(crashlyticsReport.getFirebaseInstallationId()) : crashlyticsReport.getFirebaseInstallationId() == null) && ((str2 = this.appQualitySessionId) != null ? str2.equals(crashlyticsReport.getAppQualitySessionId()) : crashlyticsReport.getAppQualitySessionId() == null) && this.buildVersion.equals(crashlyticsReport.getBuildVersion()) && this.displayVersion.equals(crashlyticsReport.getDisplayVersion()) && ((session2 = this.session) != null ? session2.equals(crashlyticsReport.getSession()) : crashlyticsReport.getSession() == null) && ((filesPayload = this.ndkPayload) != null ? filesPayload.equals(crashlyticsReport.getNdkPayload()) : crashlyticsReport.getNdkPayload() == null)) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
            if (applicationExitInfo == null) {
                if (crashlyticsReport.getAppExitInfo() == null) {
                    return true;
                }
            } else if (!applicationExitInfo.equals(crashlyticsReport.getAppExitInfo())) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.sdkVersion.hashCode();
        int hashCode2 = this.gmpAppId.hashCode();
        int i = this.platform;
        int hashCode3 = this.installationUuid.hashCode();
        String str = this.firebaseInstallationId;
        int i2 = 0;
        int hashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.appQualitySessionId;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        int hashCode6 = this.buildVersion.hashCode();
        int hashCode7 = this.displayVersion.hashCode();
        CrashlyticsReport.Session session2 = this.session;
        int hashCode8 = session2 == null ? 0 : session2.hashCode();
        CrashlyticsReport.FilesPayload filesPayload = this.ndkPayload;
        int hashCode9 = filesPayload == null ? 0 : filesPayload.hashCode();
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = this.appExitInfo;
        if (applicationExitInfo != null) {
            i2 = applicationExitInfo.hashCode();
        }
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ i2;
    }

    /* access modifiers changed from: protected */
    public final CrashlyticsReport.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Builder {
        private CrashlyticsReport.ApplicationExitInfo appExitInfo;
        private String appQualitySessionId;
        private String buildVersion;
        private String displayVersion;
        private String firebaseInstallationId;
        private String gmpAppId;
        private String installationUuid;
        private CrashlyticsReport.FilesPayload ndkPayload;
        private Integer platform;
        private String sdkVersion;
        private CrashlyticsReport.Session session;

        Builder() {
        }

        private Builder(CrashlyticsReport crashlyticsReport) {
            this.sdkVersion = crashlyticsReport.getSdkVersion();
            this.gmpAppId = crashlyticsReport.getGmpAppId();
            this.platform = Integer.valueOf(crashlyticsReport.getPlatform());
            this.installationUuid = crashlyticsReport.getInstallationUuid();
            this.firebaseInstallationId = crashlyticsReport.getFirebaseInstallationId();
            this.appQualitySessionId = crashlyticsReport.getAppQualitySessionId();
            this.buildVersion = crashlyticsReport.getBuildVersion();
            this.displayVersion = crashlyticsReport.getDisplayVersion();
            this.session = crashlyticsReport.getSession();
            this.ndkPayload = crashlyticsReport.getNdkPayload();
            this.appExitInfo = crashlyticsReport.getAppExitInfo();
        }

        public final CrashlyticsReport.Builder setSdkVersion(String str) {
            if (str != null) {
                this.sdkVersion = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        public final CrashlyticsReport.Builder setGmpAppId(String str) {
            if (str != null) {
                this.gmpAppId = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        public final CrashlyticsReport.Builder setPlatform(int i) {
            this.platform = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Builder setInstallationUuid(String str) {
            if (str != null) {
                this.installationUuid = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        public final CrashlyticsReport.Builder setFirebaseInstallationId(String str) {
            this.firebaseInstallationId = str;
            return this;
        }

        public final CrashlyticsReport.Builder setAppQualitySessionId(String str) {
            this.appQualitySessionId = str;
            return this;
        }

        public final CrashlyticsReport.Builder setBuildVersion(String str) {
            if (str != null) {
                this.buildVersion = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public final CrashlyticsReport.Builder setDisplayVersion(String str) {
            if (str != null) {
                this.displayVersion = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        public final CrashlyticsReport.Builder setSession(CrashlyticsReport.Session session2) {
            this.session = session2;
            return this;
        }

        public final CrashlyticsReport.Builder setNdkPayload(CrashlyticsReport.FilesPayload filesPayload) {
            this.ndkPayload = filesPayload;
            return this;
        }

        public final CrashlyticsReport.Builder setAppExitInfo(CrashlyticsReport.ApplicationExitInfo applicationExitInfo) {
            this.appExitInfo = applicationExitInfo;
            return this;
        }

        public final CrashlyticsReport build() {
            String str = this.sdkVersion == null ? " sdkVersion" : "";
            if (this.gmpAppId == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" gmpAppId");
                str = sb.toString();
            }
            if (this.platform == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" platform");
                str = sb2.toString();
            }
            if (this.installationUuid == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" installationUuid");
                str = sb3.toString();
            }
            if (this.buildVersion == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" buildVersion");
                str = sb4.toString();
            }
            if (this.displayVersion == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" displayVersion");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport(this.sdkVersion, this.gmpAppId, this.platform.intValue(), this.installationUuid, this.firebaseInstallationId, this.appQualitySessionId, this.buildVersion, this.displayVersion, this.session, this.ndkPayload, this.appExitInfo);
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }
}
