package com.google.firebase.crashlytics.internal.metadata;

final class AutoValue_RolloutAssignment extends RolloutAssignment {
    private final String parameterKey;
    private final String parameterValue;
    private final String rolloutId;
    private final long templateVersion;
    private final String variantId;

    AutoValue_RolloutAssignment(String str, String str2, String str3, String str4, long j) {
        if (str != null) {
            this.rolloutId = str;
            if (str2 != null) {
                this.parameterKey = str2;
                if (str3 != null) {
                    this.parameterValue = str3;
                    if (str4 != null) {
                        this.variantId = str4;
                        this.templateVersion = j;
                        return;
                    }
                    throw new NullPointerException("Null variantId");
                }
                throw new NullPointerException("Null parameterValue");
            }
            throw new NullPointerException("Null parameterKey");
        }
        throw new NullPointerException("Null rolloutId");
    }

    public final String getRolloutId() {
        return this.rolloutId;
    }

    public final String getParameterKey() {
        return this.parameterKey;
    }

    public final String getParameterValue() {
        return this.parameterValue;
    }

    public final String getVariantId() {
        return this.variantId;
    }

    public final long getTemplateVersion() {
        return this.templateVersion;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutId=");
        sb.append(this.rolloutId);
        sb.append(", parameterKey=");
        sb.append(this.parameterKey);
        sb.append(", parameterValue=");
        sb.append(this.parameterValue);
        sb.append(", variantId=");
        sb.append(this.variantId);
        sb.append(", templateVersion=");
        sb.append(this.templateVersion);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RolloutAssignment)) {
            return false;
        }
        RolloutAssignment rolloutAssignment = (RolloutAssignment) obj;
        if (!this.rolloutId.equals(rolloutAssignment.getRolloutId()) || !this.parameterKey.equals(rolloutAssignment.getParameterKey()) || !this.parameterValue.equals(rolloutAssignment.getParameterValue()) || !this.variantId.equals(rolloutAssignment.getVariantId()) || this.templateVersion != rolloutAssignment.getTemplateVersion()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.rolloutId.hashCode();
        int hashCode2 = this.parameterKey.hashCode();
        int hashCode3 = this.parameterValue.hashCode();
        int hashCode4 = this.variantId.hashCode();
        long j = this.templateVersion;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ ((int) ((j >>> 32) ^ j));
    }
}
