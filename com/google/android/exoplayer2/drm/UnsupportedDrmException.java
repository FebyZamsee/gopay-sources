package com.google.android.exoplayer2.drm;

public final class UnsupportedDrmException extends Exception {
    private int read;

    public UnsupportedDrmException() {
        this.read = 1;
    }

    public UnsupportedDrmException(int i, Exception exc) {
        super(exc);
        this.read = i;
    }
}
