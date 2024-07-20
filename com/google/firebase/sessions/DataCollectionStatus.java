package com.google.firebase.sessions;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DataCollectionStatus {
    private final DataCollectionState crashlytics;
    private final DataCollectionState performance;
    private final double sessionSamplingRate;

    public DataCollectionStatus() {
        this((DataCollectionState) null, (DataCollectionState) null, 0.0d, 7, (DefaultConstructorMarker) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        return this.performance == dataCollectionStatus.performance && this.crashlytics == dataCollectionStatus.crashlytics && Intrinsics.RemoteActionCompatParcelizer(Double.valueOf(this.sessionSamplingRate), Double.valueOf(dataCollectionStatus.sessionSamplingRate));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.performance);
        sb.append(", crashlytics=");
        sb.append(this.crashlytics);
        sb.append(", sessionSamplingRate=");
        sb.append(this.sessionSamplingRate);
        sb.append(')');
        return sb.toString();
    }

    public DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        Intrinsics.checkNotNullParameter(dataCollectionState, "");
        Intrinsics.checkNotNullParameter(dataCollectionState2, "");
        this.performance = dataCollectionState;
        this.crashlytics = dataCollectionState2;
        this.sessionSamplingRate = d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState, (i & 2) != 0 ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : dataCollectionState2, (i & 4) != 0 ? 1.0d : d);
    }

    public final DataCollectionState getPerformance() {
        return this.performance;
    }

    public final DataCollectionState getCrashlytics() {
        return this.crashlytics;
    }

    public final double getSessionSamplingRate() {
        return this.sessionSamplingRate;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.sessionSamplingRate);
        return (((this.performance.hashCode() * 31) + this.crashlytics.hashCode()) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }
}
