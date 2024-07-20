package com.google.firebase.sessions;

public final class WallClock implements TimeProvider {
    public static final WallClock INSTANCE = new WallClock();

    private WallClock() {
    }

    public final long currentTimeUs() {
        return System.currentTimeMillis() * 1000;
    }
}
