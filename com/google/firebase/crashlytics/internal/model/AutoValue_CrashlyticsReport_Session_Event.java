package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event extends CrashlyticsReport.Session.Event {
    private final CrashlyticsReport.Session.Event.Application app;
    private final CrashlyticsReport.Session.Event.Device device;
    private final CrashlyticsReport.Session.Event.Log log;
    private final CrashlyticsReport.Session.Event.RolloutsState rollouts;
    private final long timestamp;
    private final String type;

    private AutoValue_CrashlyticsReport_Session_Event(long j, String str, CrashlyticsReport.Session.Event.Application application, CrashlyticsReport.Session.Event.Device device2, CrashlyticsReport.Session.Event.Log log2, CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
        this.timestamp = j;
        this.type = str;
        this.app = application;
        this.device = device2;
        this.log = log2;
        this.rollouts = rolloutsState;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final CrashlyticsReport.Session.Event.Application getApp() {
        return this.app;
    }

    public final CrashlyticsReport.Session.Event.Device getDevice() {
        return this.device;
    }

    public final CrashlyticsReport.Session.Event.Log getLog() {
        return this.log;
    }

    public final CrashlyticsReport.Session.Event.RolloutsState getRollouts() {
        return this.rollouts;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event{timestamp=");
        sb.append(this.timestamp);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", app=");
        sb.append(this.app);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", log=");
        sb.append(this.log);
        sb.append(", rollouts=");
        sb.append(this.rollouts);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        CrashlyticsReport.Session.Event.Log log2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event)) {
            return false;
        }
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        if (this.timestamp == event.getTimestamp() && this.type.equals(event.getType()) && this.app.equals(event.getApp()) && this.device.equals(event.getDevice()) && ((log2 = this.log) != null ? log2.equals(event.getLog()) : event.getLog() == null)) {
            CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.rollouts;
            if (rolloutsState == null) {
                if (event.getRollouts() == null) {
                    return true;
                }
            } else if (!rolloutsState.equals(event.getRollouts())) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.timestamp;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.type.hashCode();
        int hashCode2 = this.app.hashCode();
        int hashCode3 = this.device.hashCode();
        CrashlyticsReport.Session.Event.Log log2 = this.log;
        int i2 = 0;
        int hashCode4 = log2 == null ? 0 : log2.hashCode();
        CrashlyticsReport.Session.Event.RolloutsState rolloutsState = this.rollouts;
        if (rolloutsState != null) {
            i2 = rolloutsState.hashCode();
        }
        return ((((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i2;
    }

    public final CrashlyticsReport.Session.Event.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Builder {
        private CrashlyticsReport.Session.Event.Application app;
        private CrashlyticsReport.Session.Event.Device device;
        private CrashlyticsReport.Session.Event.Log log;
        private CrashlyticsReport.Session.Event.RolloutsState rollouts;
        private Long timestamp;
        private String type;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event event) {
            this.timestamp = Long.valueOf(event.getTimestamp());
            this.type = event.getType();
            this.app = event.getApp();
            this.device = event.getDevice();
            this.log = event.getLog();
            this.rollouts = event.getRollouts();
        }

        public final CrashlyticsReport.Session.Event.Builder setTimestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Builder setType(String str) {
            if (str != null) {
                this.type = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        public final CrashlyticsReport.Session.Event.Builder setApp(CrashlyticsReport.Session.Event.Application application) {
            if (application != null) {
                this.app = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public final CrashlyticsReport.Session.Event.Builder setDevice(CrashlyticsReport.Session.Event.Device device2) {
            if (device2 != null) {
                this.device = device2;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        public final CrashlyticsReport.Session.Event.Builder setLog(CrashlyticsReport.Session.Event.Log log2) {
            this.log = log2;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Builder setRollouts(CrashlyticsReport.Session.Event.RolloutsState rolloutsState) {
            this.rollouts = rolloutsState;
            return this;
        }

        public final CrashlyticsReport.Session.Event build() {
            String str = this.timestamp == null ? " timestamp" : "";
            if (this.type == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" type");
                str = sb.toString();
            }
            if (this.app == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" app");
                str = sb2.toString();
            }
            if (this.device == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" device");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event(this.timestamp.longValue(), this.type, this.app, this.device, this.log, this.rollouts);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
