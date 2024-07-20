package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class FirebaseSessionsData {
    private final String sessionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseSessionsData) && Intrinsics.RemoteActionCompatParcelizer(this.sessionId, ((FirebaseSessionsData) obj).sessionId);
    }

    public final int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseSessionsData(sessionId=");
        sb.append(this.sessionId);
        sb.append(')');
        return sb.toString();
    }

    public FirebaseSessionsData(String str) {
        this.sessionId = str;
    }

    public final String getSessionId() {
        return this.sessionId;
    }
}
