package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;

public final class AFd1pSDK {
    final String valueOf;
    final String values;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFd1pSDK)) {
            return false;
        }
        AFd1pSDK aFd1pSDK = (AFd1pSDK) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.values, aFd1pSDK.values) && Intrinsics.RemoteActionCompatParcelizer(this.valueOf, aFd1pSDK.valueOf);
    }

    public final int hashCode() {
        return (this.values.hashCode() * 31) + this.valueOf.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostConfig(prefix=");
        sb.append(this.values);
        sb.append(", host=");
        sb.append(this.valueOf);
        sb.append(')');
        return sb.toString();
    }

    public AFd1pSDK(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.values = str;
        this.valueOf = str2;
    }
}
