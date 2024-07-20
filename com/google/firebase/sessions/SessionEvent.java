package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class SessionEvent {
    private final ApplicationInfo applicationInfo;
    private final EventType eventType;
    private final SessionInfo sessionData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        return this.eventType == sessionEvent.eventType && Intrinsics.RemoteActionCompatParcelizer(this.sessionData, sessionEvent.sessionData) && Intrinsics.RemoteActionCompatParcelizer(this.applicationInfo, sessionEvent.applicationInfo);
    }

    public final int hashCode() {
        return (((this.eventType.hashCode() * 31) + this.sessionData.hashCode()) * 31) + this.applicationInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionEvent(eventType=");
        sb.append(this.eventType);
        sb.append(", sessionData=");
        sb.append(this.sessionData);
        sb.append(", applicationInfo=");
        sb.append(this.applicationInfo);
        sb.append(')');
        return sb.toString();
    }

    public SessionEvent(EventType eventType2, SessionInfo sessionInfo, ApplicationInfo applicationInfo2) {
        Intrinsics.checkNotNullParameter(eventType2, "");
        Intrinsics.checkNotNullParameter(sessionInfo, "");
        Intrinsics.checkNotNullParameter(applicationInfo2, "");
        this.eventType = eventType2;
        this.sessionData = sessionInfo;
        this.applicationInfo = applicationInfo2;
    }

    public final EventType getEventType() {
        return this.eventType;
    }

    public final SessionInfo getSessionData() {
        return this.sessionData;
    }

    public final ApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }
}
