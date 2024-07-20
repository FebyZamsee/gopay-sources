package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame {
    private final String file;
    private final int importance;
    private final long offset;
    private final long pc;
    private final String symbol;

    private AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(long j, String str, String str2, long j2, int i) {
        this.pc = j;
        this.symbol = str;
        this.file = str2;
        this.offset = j2;
        this.importance = i;
    }

    public final long getPc() {
        return this.pc;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    public final String getFile() {
        return this.file;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final int getImportance() {
        return this.importance;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.pc);
        sb.append(", symbol=");
        sb.append(this.symbol);
        sb.append(", file=");
        sb.append(this.file);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", importance=");
        sb.append(this.importance);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
        if (this.pc == frame.getPc() && this.symbol.equals(frame.getSymbol()) && ((str = this.file) != null ? str.equals(frame.getFile()) : frame.getFile() == null) && this.offset == frame.getOffset() && this.importance == frame.getImportance()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.pc;
        int i = (int) (j ^ (j >>> 32));
        int hashCode = this.symbol.hashCode();
        String str = this.file;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.offset;
        return ((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.importance;
    }

    static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder {
        private String file;
        private Integer importance;
        private Long offset;
        private Long pc;
        private String symbol;

        Builder() {
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setPc(long j) {
            this.pc = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setSymbol(String str) {
            if (str != null) {
                this.symbol = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setFile(String str) {
            this.file = str;
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setOffset(long j) {
            this.offset = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder setImportance(int i) {
            this.importance = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame build() {
            String str = this.pc == null ? " pc" : "";
            if (this.symbol == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" symbol");
                str = sb.toString();
            }
            if (this.offset == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" offset");
                str = sb2.toString();
            }
            if (this.importance == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" importance");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame(this.pc.longValue(), this.symbol, this.file, this.offset.longValue(), this.importance.intValue());
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}
