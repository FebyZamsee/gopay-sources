package com.google.firebase;

final class AutoValue_StartupTime extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    AutoValue_StartupTime(long j, long j2, long j3) {
        this.epochMillis = j;
        this.elapsedRealtime = j2;
        this.uptimeMillis = j3;
    }

    public final long getEpochMillis() {
        return this.epochMillis;
    }

    public final long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartupTime{epochMillis=");
        sb.append(this.epochMillis);
        sb.append(", elapsedRealtime=");
        sb.append(this.elapsedRealtime);
        sb.append(", uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartupTime)) {
            return false;
        }
        StartupTime startupTime = (StartupTime) obj;
        if (this.epochMillis == startupTime.getEpochMillis() && this.elapsedRealtime == startupTime.getElapsedRealtime() && this.uptimeMillis == startupTime.getUptimeMillis()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.epochMillis;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.elapsedRealtime;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.uptimeMillis;
        return ((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }
}
