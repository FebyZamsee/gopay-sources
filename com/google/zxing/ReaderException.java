package com.google.zxing;

public abstract class ReaderException extends Exception {
    protected static final StackTraceElement[] RemoteActionCompatParcelizer = new StackTraceElement[0];
    protected static final boolean asInterface = (System.getProperty("surefire.test.class.path") != null);

    ReaderException() {
    }

    ReaderException(Throwable th) {
        super(th);
    }

    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }
}
