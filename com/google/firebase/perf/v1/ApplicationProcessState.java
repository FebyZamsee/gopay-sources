package com.google.firebase.perf.v1;

import o.measureNullChild;

public enum ApplicationProcessState implements measureNullChild.read {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);
    
    private static final measureNullChild.asInterface<ApplicationProcessState> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new measureNullChild.asInterface<ApplicationProcessState>() {
            public ApplicationProcessState findValueByNumber(int i) {
                return ApplicationProcessState.forNumber(i);
            }
        };
    }

    public final int getNumber() {
        return this.value;
    }

    public static ApplicationProcessState forNumber(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static measureNullChild.RemoteActionCompatParcelizer internalGetVerifier() {
        return ApplicationProcessStateVerifier.INSTANCE;
    }

    static final class ApplicationProcessStateVerifier implements measureNullChild.RemoteActionCompatParcelizer {
        static final measureNullChild.RemoteActionCompatParcelizer INSTANCE = null;

        private ApplicationProcessStateVerifier() {
        }

        static {
            INSTANCE = new ApplicationProcessStateVerifier();
        }

        public final boolean isInRange(int i) {
            return ApplicationProcessState.forNumber(i) != null;
        }
    }

    private ApplicationProcessState(int i) {
        this.value = i;
    }
}
