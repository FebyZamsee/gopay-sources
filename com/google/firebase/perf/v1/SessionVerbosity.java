package com.google.firebase.perf.v1;

import o.measureNullChild;

public enum SessionVerbosity implements measureNullChild.read {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    private static final measureNullChild.asInterface<SessionVerbosity> internalValueMap = null;
    private final int value;

    static {
        internalValueMap = new measureNullChild.asInterface<SessionVerbosity>() {
            public SessionVerbosity findValueByNumber(int i) {
                return SessionVerbosity.forNumber(i);
            }
        };
    }

    public final int getNumber() {
        return this.value;
    }

    public static SessionVerbosity forNumber(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static measureNullChild.RemoteActionCompatParcelizer internalGetVerifier() {
        return SessionVerbosityVerifier.INSTANCE;
    }

    static final class SessionVerbosityVerifier implements measureNullChild.RemoteActionCompatParcelizer {
        static final measureNullChild.RemoteActionCompatParcelizer INSTANCE = null;

        private SessionVerbosityVerifier() {
        }

        static {
            INSTANCE = new SessionVerbosityVerifier();
        }

        public final boolean isInRange(int i) {
            return SessionVerbosity.forNumber(i) != null;
        }
    }

    private SessionVerbosity(int i) {
        this.value = i;
    }
}
