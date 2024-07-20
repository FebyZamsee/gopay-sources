package com.google.firebase.perf.logging;

class LogWrapper {
    private static LogWrapper instance;

    /* access modifiers changed from: package-private */
    public void d(String str) {
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
    }

    /* access modifiers changed from: package-private */
    public void w(String str) {
    }

    public static LogWrapper getInstance() {
        LogWrapper logWrapper;
        synchronized (LogWrapper.class) {
            if (instance == null) {
                instance = new LogWrapper();
            }
            logWrapper = instance;
        }
        return logWrapper;
    }

    private LogWrapper() {
    }
}
