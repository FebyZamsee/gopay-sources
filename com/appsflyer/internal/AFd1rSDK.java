package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFd1rSDK {
    public final AFd1oSDK AFInAppEventParameterName;
    public final String AFInAppEventType;
    public final String AFKeystoreWrapper;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1rSDK)) {
            return false;
        }
        AFd1rSDK aFd1rSDK = (AFd1rSDK) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.AFInAppEventType, aFd1rSDK.AFInAppEventType) && Intrinsics.RemoteActionCompatParcelizer(this.AFKeystoreWrapper, aFd1rSDK.AFKeystoreWrapper) && this.AFInAppEventParameterName == aFd1rSDK.AFInAppEventParameterName;
    }

    public final int hashCode() {
        int hashCode = this.AFInAppEventType.hashCode();
        String str = this.AFKeystoreWrapper;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AFInAppEventParameterName.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AFd1rSDK(AFInAppEventType=");
        sb.append(this.AFInAppEventType);
        sb.append(", AFKeystoreWrapper=");
        sb.append(this.AFKeystoreWrapper);
        sb.append(", values=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(')');
        return sb.toString();
    }

    public AFd1rSDK(String str, String str2, AFd1oSDK aFd1oSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFd1oSDK, "");
        this.AFInAppEventType = str;
        this.AFKeystoreWrapper = str2;
        this.AFInAppEventParameterName = aFd1oSDK;
    }
}
