package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class ApplicationInfo {
    private final AndroidApplicationInfo androidAppInfo;
    private final String appId;
    private final String deviceModel;
    private final LogEnvironment logEnvironment;
    private final String osVersion;
    private final String sessionSdkVersion;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationInfo)) {
            return false;
        }
        ApplicationInfo applicationInfo = (ApplicationInfo) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.appId, applicationInfo.appId) && Intrinsics.RemoteActionCompatParcelizer(this.deviceModel, applicationInfo.deviceModel) && Intrinsics.RemoteActionCompatParcelizer(this.sessionSdkVersion, applicationInfo.sessionSdkVersion) && Intrinsics.RemoteActionCompatParcelizer(this.osVersion, applicationInfo.osVersion) && this.logEnvironment == applicationInfo.logEnvironment && Intrinsics.RemoteActionCompatParcelizer(this.androidAppInfo, applicationInfo.androidAppInfo);
    }

    public final int hashCode() {
        return (((((((((this.appId.hashCode() * 31) + this.deviceModel.hashCode()) * 31) + this.sessionSdkVersion.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.logEnvironment.hashCode()) * 31) + this.androidAppInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationInfo(appId=");
        sb.append(this.appId);
        sb.append(", deviceModel=");
        sb.append(this.deviceModel);
        sb.append(", sessionSdkVersion=");
        sb.append(this.sessionSdkVersion);
        sb.append(", osVersion=");
        sb.append(this.osVersion);
        sb.append(", logEnvironment=");
        sb.append(this.logEnvironment);
        sb.append(", androidAppInfo=");
        sb.append(this.androidAppInfo);
        sb.append(')');
        return sb.toString();
    }

    public ApplicationInfo(String str, String str2, String str3, String str4, LogEnvironment logEnvironment2, AndroidApplicationInfo androidApplicationInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(logEnvironment2, "");
        Intrinsics.checkNotNullParameter(androidApplicationInfo, "");
        this.appId = str;
        this.deviceModel = str2;
        this.sessionSdkVersion = str3;
        this.osVersion = str4;
        this.logEnvironment = logEnvironment2;
        this.androidAppInfo = androidApplicationInfo;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getSessionSdkVersion() {
        return this.sessionSdkVersion;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final LogEnvironment getLogEnvironment() {
        return this.logEnvironment;
    }

    public final AndroidApplicationInfo getAndroidAppInfo() {
        return this.androidAppInfo;
    }
}
