package com.google.firebase.sessions.api;

import kotlin.jvm.internal.Intrinsics;

public interface SessionSubscriber {

    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(SessionDetails sessionDetails);

    public static final class SessionDetails {
        private final String sessionId;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && Intrinsics.RemoteActionCompatParcelizer(this.sessionId, ((SessionDetails) obj).sessionId);
        }

        public final int hashCode() {
            return this.sessionId.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionDetails(sessionId=");
            sb.append(this.sessionId);
            sb.append(')');
            return sb.toString();
        }

        public SessionDetails(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.sessionId = str;
        }

        public final String getSessionId() {
            return this.sessionId;
        }
    }
}
