package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_Session_Event_Application extends CrashlyticsReport.Session.Event.Application {
    private final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
    private final Boolean background;
    private final CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
    private final List<CrashlyticsReport.CustomAttribute> customAttributes;
    private final CrashlyticsReport.Session.Event.Application.Execution execution;
    private final List<CrashlyticsReport.CustomAttribute> internalKeys;
    private final int uiOrientation;

    private AutoValue_CrashlyticsReport_Session_Event_Application(CrashlyticsReport.Session.Event.Application.Execution execution2, List<CrashlyticsReport.CustomAttribute> list, List<CrashlyticsReport.CustomAttribute> list2, Boolean bool, CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3, int i) {
        this.execution = execution2;
        this.customAttributes = list;
        this.internalKeys = list2;
        this.background = bool;
        this.currentProcessDetails = processDetails;
        this.appProcessDetails = list3;
        this.uiOrientation = i;
    }

    public final CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.execution;
    }

    public final List<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.customAttributes;
    }

    public final List<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.internalKeys;
    }

    public final Boolean getBackground() {
        return this.background;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails() {
        return this.currentProcessDetails;
    }

    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails() {
        return this.appProcessDetails;
    }

    public final int getUiOrientation() {
        return this.uiOrientation;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.execution);
        sb.append(", customAttributes=");
        sb.append(this.customAttributes);
        sb.append(", internalKeys=");
        sb.append(this.internalKeys);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", currentProcessDetails=");
        sb.append(this.currentProcessDetails);
        sb.append(", appProcessDetails=");
        sb.append(this.appProcessDetails);
        sb.append(", uiOrientation=");
        sb.append(this.uiOrientation);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        List<CrashlyticsReport.CustomAttribute> list;
        List<CrashlyticsReport.CustomAttribute> list2;
        Boolean bool;
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails;
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (!this.execution.equals(application.getExecution()) || ((list = this.customAttributes) != null ? !list.equals(application.getCustomAttributes()) : application.getCustomAttributes() != null) || ((list2 = this.internalKeys) != null ? !list2.equals(application.getInternalKeys()) : application.getInternalKeys() != null) || ((bool = this.background) != null ? !bool.equals(application.getBackground()) : application.getBackground() != null) || ((processDetails = this.currentProcessDetails) != null ? !processDetails.equals(application.getCurrentProcessDetails()) : application.getCurrentProcessDetails() != null) || ((list3 = this.appProcessDetails) != null ? !list3.equals(application.getAppProcessDetails()) : application.getAppProcessDetails() != null) || this.uiOrientation != application.getUiOrientation()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.execution.hashCode();
        List<CrashlyticsReport.CustomAttribute> list = this.customAttributes;
        int i = 0;
        int hashCode2 = list == null ? 0 : list.hashCode();
        List<CrashlyticsReport.CustomAttribute> list2 = this.internalKeys;
        int hashCode3 = list2 == null ? 0 : list2.hashCode();
        Boolean bool = this.background;
        int hashCode4 = bool == null ? 0 : bool.hashCode();
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = this.currentProcessDetails;
        int hashCode5 = processDetails == null ? 0 : processDetails.hashCode();
        List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list3 = this.appProcessDetails;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ i) * 1000003) ^ this.uiOrientation;
    }

    public final CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Builder {
        private List<CrashlyticsReport.Session.Event.Application.ProcessDetails> appProcessDetails;
        private Boolean background;
        private CrashlyticsReport.Session.Event.Application.ProcessDetails currentProcessDetails;
        private List<CrashlyticsReport.CustomAttribute> customAttributes;
        private CrashlyticsReport.Session.Event.Application.Execution execution;
        private List<CrashlyticsReport.CustomAttribute> internalKeys;
        private Integer uiOrientation;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session.Event.Application application) {
            this.execution = application.getExecution();
            this.customAttributes = application.getCustomAttributes();
            this.internalKeys = application.getInternalKeys();
            this.background = application.getBackground();
            this.currentProcessDetails = application.getCurrentProcessDetails();
            this.appProcessDetails = application.getAppProcessDetails();
            this.uiOrientation = Integer.valueOf(application.getUiOrientation());
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution2) {
            if (execution2 != null) {
                this.execution = execution2;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(List<CrashlyticsReport.CustomAttribute> list) {
            this.customAttributes = list;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(List<CrashlyticsReport.CustomAttribute> list) {
            this.internalKeys = list;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setBackground(Boolean bool) {
            this.background = bool;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setCurrentProcessDetails(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails) {
            this.currentProcessDetails = processDetails;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setAppProcessDetails(List<CrashlyticsReport.Session.Event.Application.ProcessDetails> list) {
            this.appProcessDetails = list;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.uiOrientation = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application build() {
            String str = this.execution == null ? " execution" : "";
            if (this.uiOrientation == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uiOrientation");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application(this.execution, this.customAttributes, this.internalKeys, this.background, this.currentProcessDetails, this.appProcessDetails, this.uiOrientation.intValue());
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
