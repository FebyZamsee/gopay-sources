package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Application_Organization extends CrashlyticsReport.Session.Application.Organization {
    private final String clsId;

    public final String getClsId() {
        return this.clsId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization{clsId=");
        sb.append(this.clsId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Application.Organization) {
            return this.clsId.equals(((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
        }
        return false;
    }

    public final int hashCode() {
        return this.clsId.hashCode() ^ 1000003;
    }
}
