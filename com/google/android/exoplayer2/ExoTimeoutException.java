package com.google.android.exoplayer2;

public final class ExoTimeoutException extends RuntimeException {
    private int read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoTimeoutException(int i) {
        super(i != 1 ? i != 2 ? i != 3 ? "Undefined timeout." : "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
        this.read = i;
    }
}
