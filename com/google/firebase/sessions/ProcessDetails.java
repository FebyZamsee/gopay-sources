package com.google.firebase.sessions;

import kotlin.jvm.internal.Intrinsics;

public final class ProcessDetails {
    private final int importance;
    private final boolean isDefaultProcess;
    private final int pid;
    private final String processName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) obj;
        return Intrinsics.RemoteActionCompatParcelizer(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public final int hashCode() {
        int hashCode = this.processName.hashCode();
        int i = this.pid;
        int i2 = this.importance;
        boolean z = this.isDefaultProcess;
        if (z) {
            z = true;
        }
        return (((((hashCode * 31) + i) * 31) + i2) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.processName);
        sb.append(", pid=");
        sb.append(this.pid);
        sb.append(", importance=");
        sb.append(this.importance);
        sb.append(", isDefaultProcess=");
        sb.append(this.isDefaultProcess);
        sb.append(')');
        return sb.toString();
    }

    public ProcessDetails(String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.processName = str;
        this.pid = i;
        this.importance = i2;
        this.isDefaultProcess = z;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public final int getPid() {
        return this.pid;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final boolean isDefaultProcess() {
        return this.isDefaultProcess;
    }
}
