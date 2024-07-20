package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {
    private final CrashlyticsReport report;
    private final File reportFile;
    private final String sessionId;

    AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport != null) {
            this.report = crashlyticsReport;
            if (str != null) {
                this.sessionId = str;
                if (file != null) {
                    this.reportFile = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    public final CrashlyticsReport getReport() {
        return this.report;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final File getReportFile() {
        return this.reportFile;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CrashlyticsReportWithSessionId{report=");
        sb.append(this.report);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", reportFile=");
        sb.append(this.reportFile);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        if (!this.report.equals(crashlyticsReportWithSessionId.getReport()) || !this.sessionId.equals(crashlyticsReportWithSessionId.getSessionId()) || !this.reportFile.equals(crashlyticsReportWithSessionId.getReportFile())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.report.hashCode() ^ 1000003) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.reportFile.hashCode();
    }
}
