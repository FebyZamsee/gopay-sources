package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
    private final long templateVersion;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant2, String str, String str2, long j) {
        this.rolloutVariant = rolloutVariant2;
        this.parameterKey = str;
        this.parameterValue = str2;
        this.templateVersion = j;
    }

    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant getRolloutVariant() {
        return this.rolloutVariant;
    }

    public final String getParameterKey() {
        return this.parameterKey;
    }

    public final String getParameterValue() {
        return this.parameterValue;
    }

    public final long getTemplateVersion() {
        return this.templateVersion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.rolloutVariant);
        sb.append(", parameterKey=");
        sb.append(this.parameterKey);
        sb.append(", parameterValue=");
        sb.append(this.parameterValue);
        sb.append(", templateVersion=");
        sb.append(this.templateVersion);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        if (!this.rolloutVariant.equals(rolloutAssignment.getRolloutVariant()) || !this.parameterKey.equals(rolloutAssignment.getParameterKey()) || !this.parameterValue.equals(rolloutAssignment.getParameterValue()) || this.templateVersion != rolloutAssignment.getTemplateVersion()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.rolloutVariant.hashCode();
        int hashCode2 = this.parameterKey.hashCode();
        int hashCode3 = this.parameterValue.hashCode();
        long j = this.templateVersion;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {
        private String parameterKey;
        private String parameterValue;
        private CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
        private Long templateVersion;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setRolloutVariant(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant2) {
            if (rolloutVariant2 != null) {
                this.rolloutVariant = rolloutVariant2;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterKey(String str) {
            if (str != null) {
                this.parameterKey = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setParameterValue(String str) {
            if (str != null) {
                this.parameterValue = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder setTemplateVersion(long j) {
            this.templateVersion = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment build() {
            String str = this.rolloutVariant == null ? " rolloutVariant" : "";
            if (this.parameterKey == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" parameterKey");
                str = sb.toString();
            }
            if (this.parameterValue == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" parameterValue");
                str = sb2.toString();
            }
            if (this.templateVersion == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" templateVersion");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(this.rolloutVariant, this.parameterKey, this.parameterValue, this.templateVersion.longValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
