package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class SessionDetails {
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.sessionId, sessionDetails.sessionId) && Intrinsics.RemoteActionCompatParcelizer(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    public final int hashCode() {
        long j = this.sessionStartTimestampUs;
        return (((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + this.sessionIndex) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
        sb.append(this.sessionId);
        sb.append(", firstSessionId=");
        sb.append(this.firstSessionId);
        sb.append(", sessionIndex=");
        sb.append(this.sessionIndex);
        sb.append(", sessionStartTimestampUs=");
        sb.append(this.sessionStartTimestampUs);
        sb.append(')');
        return sb.toString();
    }

    public SessionDetails(String str, String str2, int i, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i;
        this.sessionStartTimestampUs = j;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }
}
