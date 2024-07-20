package com.google.zxing;

public final class NotFoundException extends ReaderException {
    private static final NotFoundException onTransact;

    static {
        NotFoundException notFoundException = new NotFoundException();
        onTransact = notFoundException;
        notFoundException.setStackTrace(RemoteActionCompatParcelizer);
    }

    private NotFoundException() {
    }

    public static NotFoundException asInterface() {
        return onTransact;
    }
}
