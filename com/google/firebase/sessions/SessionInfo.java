package com.google.firebase.sessions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SessionInfo {
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final String firebaseInstallationId;
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.sessionId, sessionInfo.sessionId) && Intrinsics.RemoteActionCompatParcelizer(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && Intrinsics.RemoteActionCompatParcelizer(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && Intrinsics.RemoteActionCompatParcelizer(this.firebaseInstallationId, sessionInfo.firebaseInstallationId);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.sessionId);
        sb.append(", firstSessionId=");
        sb.append(this.firstSessionId);
        sb.append(", sessionIndex=");
        sb.append(this.sessionIndex);
        sb.append(", eventTimestampUs=");
        sb.append(this.eventTimestampUs);
        sb.append(", dataCollectionStatus=");
        sb.append(this.dataCollectionStatus);
        sb.append(", firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(')');
        return sb.toString();
    }

    public SessionInfo(String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(dataCollectionStatus2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i;
        this.eventTimestampUs = j;
        this.dataCollectionStatus = dataCollectionStatus2;
        this.firebaseInstallationId = str3;
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

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionInfo(String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, j, (i2 & 16) != 0 ? new DataCollectionStatus((DataCollectionState) null, (DataCollectionState) null, 0.0d, 7, (DefaultConstructorMarker) null) : dataCollectionStatus2, (i2 & 32) != 0 ? "" : str3);
    }

    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final int hashCode() {
        long j = this.eventTimestampUs;
        return (((((((((this.sessionId.hashCode() * 31) + this.firstSessionId.hashCode()) * 31) + this.sessionIndex) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.dataCollectionStatus.hashCode()) * 31) + this.firebaseInstallationId.hashCode();
    }
}
