package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.List;

final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {
    private final List<CrashlyticsReport.FilesPayload.File> files;
    private final String orgId;

    private AutoValue_CrashlyticsReport_FilesPayload(List<CrashlyticsReport.FilesPayload.File> list, String str) {
        this.files = list;
        this.orgId = str;
    }

    public final List<CrashlyticsReport.FilesPayload.File> getFiles() {
        return this.files;
    }

    public final String getOrgId() {
        return this.orgId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.files);
        sb.append(", orgId=");
        sb.append(this.orgId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (this.files.equals(filesPayload.getFiles())) {
            String str = this.orgId;
            if (str == null) {
                if (filesPayload.getOrgId() == null) {
                    return true;
                }
            } else if (!str.equals(filesPayload.getOrgId())) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.files.hashCode();
        String str = this.orgId;
        return ((hashCode ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    static final class Builder extends CrashlyticsReport.FilesPayload.Builder {
        private List<CrashlyticsReport.FilesPayload.File> files;
        private String orgId;

        Builder() {
        }

        public final CrashlyticsReport.FilesPayload.Builder setFiles(List<CrashlyticsReport.FilesPayload.File> list) {
            if (list != null) {
                this.files = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        public final CrashlyticsReport.FilesPayload.Builder setOrgId(String str) {
            this.orgId = str;
            return this;
        }

        public final CrashlyticsReport.FilesPayload build() {
            String str = this.files == null ? " files" : "";
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_FilesPayload(this.files, this.orgId);
            }
            StringBuilder sb = new StringBuilder("Missing required properties:");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }
}
