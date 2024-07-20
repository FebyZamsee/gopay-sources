package com.scp.login.sso.data.network;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.setThumbTintList;

public final class NetworkError extends RuntimeException {
    private final List<setThumbTintList.read> asBinder;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof NetworkError) && Intrinsics.RemoteActionCompatParcelizer(this.asBinder, ((NetworkError) obj).asBinder);
        }
        return true;
    }

    public final int hashCode() {
        List<setThumbTintList.read> list = this.asBinder;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkError(errorData=");
        sb.append(this.asBinder);
        sb.append(")");
        return sb.toString();
    }

    public NetworkError(List<setThumbTintList.read> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.asBinder = list;
    }

    public final String getMessage() {
        List<setThumbTintList.read> list = this.asBinder;
        Intrinsics.checkNotNullParameter(list, "");
        setThumbTintList.read read = list.isEmpty() ? null : list.get(0);
        if (read != null) {
            return read.asInterface;
        }
        return null;
    }
}
