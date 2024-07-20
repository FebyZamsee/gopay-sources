package com.google.zxing;

public final class ChecksumException extends ReaderException {
    private static final ChecksumException onTransact;

    static {
        ChecksumException checksumException = new ChecksumException();
        onTransact = checksumException;
        checksumException.setStackTrace(RemoteActionCompatParcelizer);
    }

    private ChecksumException() {
    }

    public static ChecksumException RemoteActionCompatParcelizer() {
        return asInterface ? new ChecksumException() : onTransact;
    }
}
