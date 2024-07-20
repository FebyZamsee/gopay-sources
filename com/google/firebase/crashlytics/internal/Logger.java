package com.google.firebase.crashlytics.internal;

import android.util.Log;

public class Logger {
    static final Logger DEFAULT_LOGGER = new Logger("FirebaseCrashlytics");
    private int logLevel = 4;
    private final String tag;

    public Logger(String str) {
        this.tag = str;
    }

    public static Logger getLogger() {
        return DEFAULT_LOGGER;
    }

    private boolean canLog(int i) {
        return this.logLevel <= i || Log.isLoggable(this.tag, i);
    }

    public void d(String str, Throwable th) {
        boolean canLog = canLog(3);
    }

    public void v(String str, Throwable th) {
        boolean canLog = canLog(2);
    }

    public void i(String str, Throwable th) {
        boolean canLog = canLog(4);
    }

    public void w(String str, Throwable th) {
        boolean canLog = canLog(5);
    }

    public void e(String str, Throwable th) {
        boolean canLog = canLog(6);
    }

    public void d(String str) {
        d(str, (Throwable) null);
    }

    public void v(String str) {
        v(str, (Throwable) null);
    }

    public void i(String str) {
        i(str, (Throwable) null);
    }

    public void w(String str) {
        w(str, (Throwable) null);
    }

    public void e(String str) {
        e(str, (Throwable) null);
    }
}
