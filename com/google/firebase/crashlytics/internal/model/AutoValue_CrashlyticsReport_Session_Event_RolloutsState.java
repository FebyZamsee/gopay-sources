package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {
    private final List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
        this.rolloutAssignments = list;
    }

    public final List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
        return this.rolloutAssignments;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutsState{rolloutAssignments=");
        sb.append(this.rolloutAssignments);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.rolloutAssignments.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    public final int hashCode() {
        return this.rolloutAssignments.hashCode() ^ 1000003;
    }

    static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {
        private List<CrashlyticsReport.Session.Event.RolloutAssignment> rolloutAssignments;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list != null) {
                this.rolloutAssignments = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }

        public final CrashlyticsReport.Session.Event.RolloutsState build() {
            String str = this.rolloutAssignments == null ? " rolloutAssignments" : "";
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(this.rolloutAssignments);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }
}
