package com.google.zxing;

public final class FormatException extends ReaderException {
    private static final FormatException onTransact;

    static {
        FormatException formatException = new FormatException();
        onTransact = formatException;
        formatException.setStackTrace(RemoteActionCompatParcelizer);
    }

    private FormatException() {
    }

    private FormatException(Throwable th) {
        super(th);
    }

    public static FormatException asBinder() {
        return asInterface ? new FormatException() : onTransact;
    }

    public static FormatException onTransact(Throwable th) {
        return asInterface ? new FormatException(th) : onTransact;
    }
}
