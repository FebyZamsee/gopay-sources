package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Device extends CrashlyticsReport.Session.Event.Device {
    private final Double batteryLevel;
    private final int batteryVelocity;
    private final long diskUsed;
    private final int orientation;
    private final boolean proximityOn;
    private final long ramUsed;

    private AutoValue_CrashlyticsReport_Session_Event_Device(Double d, int i, boolean z, int i2, long j, long j2) {
        this.batteryLevel = d;
        this.batteryVelocity = i;
        this.proximityOn = z;
        this.orientation = i2;
        this.ramUsed = j;
        this.diskUsed = j2;
    }

    public final Double getBatteryLevel() {
        return this.batteryLevel;
    }

    public final int getBatteryVelocity() {
        return this.batteryVelocity;
    }

    public final boolean isProximityOn() {
        return this.proximityOn;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final long getRamUsed() {
        return this.ramUsed;
    }

    public final long getDiskUsed() {
        return this.diskUsed;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.batteryLevel);
        sb.append(", batteryVelocity=");
        sb.append(this.batteryVelocity);
        sb.append(", proximityOn=");
        sb.append(this.proximityOn);
        sb.append(", orientation=");
        sb.append(this.orientation);
        sb.append(", ramUsed=");
        sb.append(this.ramUsed);
        sb.append(", diskUsed=");
        sb.append(this.diskUsed);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Device)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
        Double d = this.batteryLevel;
        if (d != null ? d.equals(device.getBatteryLevel()) : device.getBatteryLevel() == null) {
            if (this.batteryVelocity == device.getBatteryVelocity() && this.proximityOn == device.isProximityOn() && this.orientation == device.getOrientation() && this.ramUsed == device.getRamUsed() && this.diskUsed == device.getDiskUsed()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Double d = this.batteryLevel;
        int hashCode = d == null ? 0 : d.hashCode();
        int i = this.batteryVelocity;
        int i2 = this.proximityOn ? 1231 : 1237;
        int i3 = this.orientation;
        long j = this.ramUsed;
        long j2 = this.diskUsed;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Device.Builder {
        private Double batteryLevel;
        private Integer batteryVelocity;
        private Long diskUsed;
        private Integer orientation;
        private Boolean proximityOn;
        private Long ramUsed;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Device.Builder setBatteryLevel(Double d) {
            this.batteryLevel = d;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Device.Builder setBatteryVelocity(int i) {
            this.batteryVelocity = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Device.Builder setProximityOn(boolean z) {
            this.proximityOn = Boolean.valueOf(z);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Device.Builder setOrientation(int i) {
            this.orientation = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Device.Builder setRamUsed(long j) {
            this.ramUsed = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Device.Builder setDiskUsed(long j) {
            this.diskUsed = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Device build() {
            String str = this.batteryVelocity == null ? " batteryVelocity" : "";
            if (this.proximityOn == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" proximityOn");
                str = sb.toString();
            }
            if (this.orientation == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" orientation");
                str = sb2.toString();
            }
            if (this.ramUsed == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" ramUsed");
                str = sb3.toString();
            }
            if (this.diskUsed == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" diskUsed");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Device(this.batteryLevel, this.batteryVelocity.intValue(), this.proximityOn.booleanValue(), this.orientation.intValue(), this.ramUsed.longValue(), this.diskUsed.longValue());
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }
    }
}
