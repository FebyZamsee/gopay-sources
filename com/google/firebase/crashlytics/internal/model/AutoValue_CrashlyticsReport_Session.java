package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    private final CrashlyticsReport.Session.Application app;
    private final String appQualitySessionId;
    private final boolean crashed;
    private final CrashlyticsReport.Session.Device device;
    private final Long endedAt;
    private final List<CrashlyticsReport.Session.Event> events;
    private final String generator;
    private final int generatorType;
    private final String identifier;
    private final CrashlyticsReport.Session.OperatingSystem os;
    private final long startedAt;
    private final CrashlyticsReport.Session.User user;

    private AutoValue_CrashlyticsReport_Session(String str, String str2, String str3, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user2, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device2, List<CrashlyticsReport.Session.Event> list, int i) {
        this.generator = str;
        this.identifier = str2;
        this.appQualitySessionId = str3;
        this.startedAt = j;
        this.endedAt = l;
        this.crashed = z;
        this.app = application;
        this.user = user2;
        this.os = operatingSystem;
        this.device = device2;
        this.events = list;
        this.generatorType = i;
    }

    public final String getGenerator() {
        return this.generator;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    public final Long getEndedAt() {
        return this.endedAt;
    }

    public final boolean isCrashed() {
        return this.crashed;
    }

    public final CrashlyticsReport.Session.Application getApp() {
        return this.app;
    }

    public final CrashlyticsReport.Session.User getUser() {
        return this.user;
    }

    public final CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.os;
    }

    public final CrashlyticsReport.Session.Device getDevice() {
        return this.device;
    }

    public final List<CrashlyticsReport.Session.Event> getEvents() {
        return this.events;
    }

    public final int getGeneratorType() {
        return this.generatorType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Session{generator=");
        sb.append(this.generator);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", appQualitySessionId=");
        sb.append(this.appQualitySessionId);
        sb.append(", startedAt=");
        sb.append(this.startedAt);
        sb.append(", endedAt=");
        sb.append(this.endedAt);
        sb.append(", crashed=");
        sb.append(this.crashed);
        sb.append(", app=");
        sb.append(this.app);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", os=");
        sb.append(this.os);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", events=");
        sb.append(this.events);
        sb.append(", generatorType=");
        sb.append(this.generatorType);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        Long l;
        CrashlyticsReport.Session.User user2;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device2;
        List<CrashlyticsReport.Session.Event> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (!this.generator.equals(session.getGenerator()) || !this.identifier.equals(session.getIdentifier()) || ((str = this.appQualitySessionId) != null ? !str.equals(session.getAppQualitySessionId()) : session.getAppQualitySessionId() != null) || this.startedAt != session.getStartedAt() || ((l = this.endedAt) != null ? !l.equals(session.getEndedAt()) : session.getEndedAt() != null) || this.crashed != session.isCrashed() || !this.app.equals(session.getApp()) || ((user2 = this.user) != null ? !user2.equals(session.getUser()) : session.getUser() != null) || ((operatingSystem = this.os) != null ? !operatingSystem.equals(session.getOs()) : session.getOs() != null) || ((device2 = this.device) != null ? !device2.equals(session.getDevice()) : session.getDevice() != null) || ((list = this.events) != null ? !list.equals(session.getEvents()) : session.getEvents() != null) || this.generatorType != session.getGeneratorType()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.generator.hashCode();
        int hashCode2 = this.identifier.hashCode();
        String str = this.appQualitySessionId;
        int i = 0;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j = this.startedAt;
        int i2 = (int) (j ^ (j >>> 32));
        Long l = this.endedAt;
        int hashCode4 = l == null ? 0 : l.hashCode();
        int i3 = this.crashed ? 1231 : 1237;
        int hashCode5 = this.app.hashCode();
        CrashlyticsReport.Session.User user2 = this.user;
        int hashCode6 = user2 == null ? 0 : user2.hashCode();
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.os;
        int hashCode7 = operatingSystem == null ? 0 : operatingSystem.hashCode();
        CrashlyticsReport.Session.Device device2 = this.device;
        int hashCode8 = device2 == null ? 0 : device2.hashCode();
        List<CrashlyticsReport.Session.Event> list = this.events;
        if (list != null) {
            i = list.hashCode();
        }
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i2) * 1000003) ^ hashCode4) * 1000003) ^ i3) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ i) * 1000003) ^ this.generatorType;
    }

    public final CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Builder {
        private CrashlyticsReport.Session.Application app;
        private String appQualitySessionId;
        private Boolean crashed;
        private CrashlyticsReport.Session.Device device;
        private Long endedAt;
        private List<CrashlyticsReport.Session.Event> events;
        private String generator;
        private Integer generatorType;
        private String identifier;
        private CrashlyticsReport.Session.OperatingSystem os;
        private Long startedAt;
        private CrashlyticsReport.Session.User user;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.appQualitySessionId = session.getAppQualitySessionId();
            this.startedAt = Long.valueOf(session.getStartedAt());
            this.endedAt = session.getEndedAt();
            this.crashed = Boolean.valueOf(session.isCrashed());
            this.app = session.getApp();
            this.user = session.getUser();
            this.os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = Integer.valueOf(session.getGeneratorType());
        }

        public final CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str != null) {
                this.generator = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        public final CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public final CrashlyticsReport.Session.Builder setAppQualitySessionId(String str) {
            this.appQualitySessionId = str;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.startedAt = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.endedAt = l;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.crashed = Boolean.valueOf(z);
            return this;
        }

        public final CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.app = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public final CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user2) {
            this.user = user2;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.os = operatingSystem;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device2) {
            this.device = device2;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setEvents(List<CrashlyticsReport.Session.Event> list) {
            this.events = list;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.generatorType = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session build() {
            String str = this.generator == null ? " generator" : "";
            if (this.identifier == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" identifier");
                str = sb.toString();
            }
            if (this.startedAt == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" startedAt");
                str = sb2.toString();
            }
            if (this.crashed == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" crashed");
                str = sb3.toString();
            }
            if (this.app == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" app");
                str = sb4.toString();
            }
            if (this.generatorType == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" generatorType");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.generator, this.identifier, this.appQualitySessionId, this.startedAt.longValue(), this.endedAt, this.crashed.booleanValue(), this.app, this.user, this.os, this.device, this.events, this.generatorType.intValue());
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }
}
