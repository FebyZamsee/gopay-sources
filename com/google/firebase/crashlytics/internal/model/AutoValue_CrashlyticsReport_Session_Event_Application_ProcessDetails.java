package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails extends CrashlyticsReport.Session.Event.Application.ProcessDetails {
    private final boolean defaultProcess;
    private final int importance;
    private final int pid;
    private final String processName;

    private AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(String str, int i, int i2, boolean z) {
        this.processName = str;
        this.pid = i;
        this.importance = i2;
        this.defaultProcess = z;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final boolean isDefaultProcess() {
        return this.defaultProcess;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.processName);
        sb.append(", pid=");
        sb.append(this.pid);
        sb.append(", importance=");
        sb.append(this.importance);
        sb.append(", defaultProcess=");
        sb.append(this.defaultProcess);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.ProcessDetails)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (this.processName.equals(processDetails.getProcessName()) && this.pid == processDetails.getPid() && this.importance == processDetails.getImportance() && this.defaultProcess == processDetails.isDefaultProcess()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.processName.hashCode();
        int i = this.pid;
        return ((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.importance) * 1000003) ^ (this.defaultProcess ? 1231 : 1237);
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder {
        private Boolean defaultProcess;
        private Integer importance;
        private Integer pid;
        private String processName;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setProcessName(String str) {
            if (str != null) {
                this.processName = str;
                return this;
            }
            throw new NullPointerException("Null processName");
        }

        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setPid(int i) {
            this.pid = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.ProcessDetails.Builder setDefaultProcess(boolean z) {
            this.defaultProcess = Boolean.valueOf(z);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.ProcessDetails build() {
            String str = this.processName == null ? " processName" : "";
            if (this.pid == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" pid");
                str = sb.toString();
            }
            if (this.importance == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" importance");
                str = sb2.toString();
            }
            if (this.defaultProcess == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" defaultProcess");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails(this.processName, this.pid.intValue(), this.importance.intValue(), this.defaultProcess.booleanValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
