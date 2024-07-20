package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {
    private final String arch;
    private final String buildId;
    private final String libraryName;

    private AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.arch = str;
        this.libraryName = str2;
        this.buildId = str3;
    }

    public final String getArch() {
        return this.arch;
    }

    public final String getLibraryName() {
        return this.libraryName;
    }

    public final String getBuildId() {
        return this.buildId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.arch);
        sb.append(", libraryName=");
        sb.append(this.libraryName);
        sb.append(", buildId=");
        sb.append(this.buildId);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        if (!this.arch.equals(buildIdMappingForArch.getArch()) || !this.libraryName.equals(buildIdMappingForArch.getLibraryName()) || !this.buildId.equals(buildIdMappingForArch.getBuildId())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.arch.hashCode() ^ 1000003) * 1000003) ^ this.libraryName.hashCode()) * 1000003) ^ this.buildId.hashCode();
    }

    static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {
        private String arch;
        private String buildId;
        private String libraryName;

        Builder() {
        }

        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setArch(String str) {
            if (str != null) {
                this.arch = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setLibraryName(String str) {
            if (str != null) {
                this.libraryName = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }

        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder setBuildId(String str) {
            if (str != null) {
                this.buildId = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch build() {
            String str = this.arch == null ? " arch" : "";
            if (this.libraryName == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" libraryName");
                str = sb.toString();
            }
            if (this.buildId == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" buildId");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(this.arch, this.libraryName, this.buildId);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }
}
