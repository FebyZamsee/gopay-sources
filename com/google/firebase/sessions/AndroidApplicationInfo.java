package com.google.firebase.sessions;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class AndroidApplicationInfo {
    private final String appBuildVersion;
    private final List<ProcessDetails> appProcessDetails;
    private final ProcessDetails currentProcessDetails;
    private final String deviceManufacturer;
    private final String packageName;
    private final String versionName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidApplicationInfo)) {
            return false;
        }
        AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.packageName, androidApplicationInfo.packageName) && Intrinsics.RemoteActionCompatParcelizer(this.versionName, androidApplicationInfo.versionName) && Intrinsics.RemoteActionCompatParcelizer(this.appBuildVersion, androidApplicationInfo.appBuildVersion) && Intrinsics.RemoteActionCompatParcelizer(this.deviceManufacturer, androidApplicationInfo.deviceManufacturer) && Intrinsics.RemoteActionCompatParcelizer(this.currentProcessDetails, androidApplicationInfo.currentProcessDetails) && Intrinsics.RemoteActionCompatParcelizer(this.appProcessDetails, androidApplicationInfo.appProcessDetails);
    }

    public final int hashCode() {
        return (((((((((this.packageName.hashCode() * 31) + this.versionName.hashCode()) * 31) + this.appBuildVersion.hashCode()) * 31) + this.deviceManufacturer.hashCode()) * 31) + this.currentProcessDetails.hashCode()) * 31) + this.appProcessDetails.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidApplicationInfo(packageName=");
        sb.append(this.packageName);
        sb.append(", versionName=");
        sb.append(this.versionName);
        sb.append(", appBuildVersion=");
        sb.append(this.appBuildVersion);
        sb.append(", deviceManufacturer=");
        sb.append(this.deviceManufacturer);
        sb.append(", currentProcessDetails=");
        sb.append(this.currentProcessDetails);
        sb.append(", appProcessDetails=");
        sb.append(this.appProcessDetails);
        sb.append(')');
        return sb.toString();
    }

    public AndroidApplicationInfo(String str, String str2, String str3, String str4, ProcessDetails processDetails, List<ProcessDetails> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(processDetails, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.packageName = str;
        this.versionName = str2;
        this.appBuildVersion = str3;
        this.deviceManufacturer = str4;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public final String getAppBuildVersion() {
        return this.appBuildVersion;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final List<ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }
}
