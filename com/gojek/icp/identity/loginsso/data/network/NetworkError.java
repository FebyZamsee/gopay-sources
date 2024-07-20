package com.gojek.icp.identity.loginsso.data.network;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1;

public final class NetworkError extends RuntimeException {
    private final List<ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.onTransact> onTransact;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkError) && Intrinsics.RemoteActionCompatParcelizer(this.onTransact, ((NetworkError) obj).onTransact);
    }

    public final int hashCode() {
        return this.onTransact.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkError(errorData=");
        sb.append(this.onTransact);
        sb.append(')');
        return sb.toString();
    }

    public NetworkError(List<ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.onTransact> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.onTransact = list;
    }

    public final String getMessage() {
        List<ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.onTransact> list = this.onTransact;
        Intrinsics.checkNotNullParameter(list, "");
        ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.onTransact ontransact = list.isEmpty() ? null : list.get(0);
        if (ontransact == null) {
            return null;
        }
        return ontransact.RemoteActionCompatParcelizer;
    }
}
