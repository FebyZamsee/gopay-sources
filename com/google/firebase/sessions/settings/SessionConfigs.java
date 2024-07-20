package com.google.firebase.sessions.settings;

import kotlin.jvm.internal.Intrinsics;

public final class SessionConfigs {
    private final Integer cacheDuration;
    private final Long cacheUpdatedTime;
    private final Boolean sessionEnabled;
    private final Integer sessionRestartTimeout;
    private final Double sessionSamplingRate;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionConfigs)) {
            return false;
        }
        SessionConfigs sessionConfigs = (SessionConfigs) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.sessionEnabled, sessionConfigs.sessionEnabled) && Intrinsics.RemoteActionCompatParcelizer(this.sessionSamplingRate, sessionConfigs.sessionSamplingRate) && Intrinsics.RemoteActionCompatParcelizer(this.sessionRestartTimeout, sessionConfigs.sessionRestartTimeout) && Intrinsics.RemoteActionCompatParcelizer(this.cacheDuration, sessionConfigs.cacheDuration) && Intrinsics.RemoteActionCompatParcelizer(this.cacheUpdatedTime, sessionConfigs.cacheUpdatedTime);
    }

    public final int hashCode() {
        Boolean bool = this.sessionEnabled;
        int i = 0;
        int hashCode = bool == null ? 0 : bool.hashCode();
        Double d = this.sessionSamplingRate;
        int hashCode2 = d == null ? 0 : d.hashCode();
        Integer num = this.sessionRestartTimeout;
        int hashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.cacheDuration;
        int hashCode4 = num2 == null ? 0 : num2.hashCode();
        Long l = this.cacheUpdatedTime;
        if (l != null) {
            i = l.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionConfigs(sessionEnabled=");
        sb.append(this.sessionEnabled);
        sb.append(", sessionSamplingRate=");
        sb.append(this.sessionSamplingRate);
        sb.append(", sessionRestartTimeout=");
        sb.append(this.sessionRestartTimeout);
        sb.append(", cacheDuration=");
        sb.append(this.cacheDuration);
        sb.append(", cacheUpdatedTime=");
        sb.append(this.cacheUpdatedTime);
        sb.append(')');
        return sb.toString();
    }

    public SessionConfigs(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.sessionEnabled = bool;
        this.sessionSamplingRate = d;
        this.sessionRestartTimeout = num;
        this.cacheDuration = num2;
        this.cacheUpdatedTime = l;
    }

    public final Boolean getSessionEnabled() {
        return this.sessionEnabled;
    }

    public final Double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public final Integer getSessionRestartTimeout() {
        return this.sessionRestartTimeout;
    }

    public final Integer getCacheDuration() {
        return this.cacheDuration;
    }

    public final Long getCacheUpdatedTime() {
        return this.cacheUpdatedTime;
    }
}
