package com.gojek.courier.exception;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AuthApiException extends Exception {
    public final long RemoteActionCompatParcelizer;
    private final Throwable asBinder;
    public final int onTransact;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthApiException)) {
            return false;
        }
        AuthApiException authApiException = (AuthApiException) obj;
        return this.onTransact == authApiException.onTransact && this.RemoteActionCompatParcelizer == authApiException.RemoteActionCompatParcelizer && Intrinsics.RemoteActionCompatParcelizer(this.asBinder, authApiException.asBinder);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthApiException(reasonCode=");
        sb.append(this.onTransact);
        sb.append(", nextRetrySeconds=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", failureCause=");
        sb.append(this.asBinder);
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthApiException(int i, long j, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, j, th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AuthApiException(int i, long j, Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "");
        this.onTransact = i;
        this.RemoteActionCompatParcelizer = j;
        this.asBinder = th;
    }

    public final int hashCode() {
        long j = this.RemoteActionCompatParcelizer;
        return (((this.onTransact * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.asBinder.hashCode();
    }
}
