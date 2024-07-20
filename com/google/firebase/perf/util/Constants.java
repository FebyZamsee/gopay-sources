package com.google.firebase.perf.util;

public class Constants {

    public enum TraceNames {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");
        
        private String mName;

        private TraceNames(String str) {
            this.mName = str;
        }

        public final String toString() {
            return this.mName;
        }
    }

    public enum CounterNames {
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        FRAMES_TOTAL("_fr_tot"),
        FRAMES_SLOW("_fr_slo"),
        FRAMES_FROZEN("_fr_fzn");
        
        private String mName;

        private CounterNames(String str) {
            this.mName = str;
        }

        public final String toString() {
            return this.mName;
        }
    }
}
