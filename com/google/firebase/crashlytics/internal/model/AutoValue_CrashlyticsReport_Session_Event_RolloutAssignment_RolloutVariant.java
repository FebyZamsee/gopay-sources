package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant {
    private final String rolloutId;
    private final String variantId;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(String str, String str2) {
        this.rolloutId = str;
        this.variantId = str2;
    }

    public final String getRolloutId() {
        return this.rolloutId;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutVariant{rolloutId=");
        sb.append(this.rolloutId);
        sb.append(", variantId=");
        sb.append(this.variantId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
        if (!this.rolloutId.equals(rolloutVariant.getRolloutId()) || !this.variantId.equals(rolloutVariant.getVariantId())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.rolloutId.hashCode() ^ 1000003) * 1000003) ^ this.variantId.hashCode();
    }

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder {
        private String rolloutId;
        private String variantId;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setRolloutId(String str) {
            if (str != null) {
                this.rolloutId = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.Builder setVariantId(String str) {
            if (str != null) {
                this.variantId = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }

        public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant build() {
            String str = this.rolloutId == null ? " rolloutId" : "";
            if (this.variantId == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" variantId");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant(this.rolloutId, this.variantId);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
