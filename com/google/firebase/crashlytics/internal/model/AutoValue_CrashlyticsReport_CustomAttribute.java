package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {
    private final String key;
    private final String value;

    private AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.key);
        sb.append(", value=");
        sb.append(this.value);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        if (!this.key.equals(customAttribute.getKey()) || !this.value.equals(customAttribute.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.key.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }

    static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {
        private String key;
        private String value;

        Builder() {
        }

        public final CrashlyticsReport.CustomAttribute.Builder setKey(String str) {
            if (str != null) {
                this.key = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public final CrashlyticsReport.CustomAttribute.Builder setValue(String str) {
            if (str != null) {
                this.value = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }

        public final CrashlyticsReport.CustomAttribute build() {
            String str = this.key == null ? " key" : "";
            if (this.value == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" value");
                str = sb.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(this.key, this.value);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
