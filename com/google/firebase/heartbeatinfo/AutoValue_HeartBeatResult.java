package com.google.firebase.heartbeatinfo;

import java.util.List;

final class AutoValue_HeartBeatResult extends HeartBeatResult {
    private final List<String> usedDates;
    private final String userAgent;

    AutoValue_HeartBeatResult(String str, List<String> list) {
        if (str != null) {
            this.userAgent = str;
            if (list != null) {
                this.usedDates = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final List<String> getUsedDates() {
        return this.usedDates;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{userAgent=");
        sb.append(this.userAgent);
        sb.append(", usedDates=");
        sb.append(this.usedDates);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        if (!this.userAgent.equals(heartBeatResult.getUserAgent()) || !this.usedDates.equals(heartBeatResult.getUsedDates())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.userAgent.hashCode() ^ 1000003) * 1000003) ^ this.usedDates.hashCode();
    }
}