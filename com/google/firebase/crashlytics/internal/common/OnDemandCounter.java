package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

public final class OnDemandCounter {
    private final AtomicInteger droppedOnDemandExceptions = new AtomicInteger();
    private final AtomicInteger recordedOnDemandExceptions = new AtomicInteger();

    public final int getRecordedOnDemandExceptions() {
        return this.recordedOnDemandExceptions.get();
    }

    public final void incrementRecordedOnDemandExceptions() {
        this.recordedOnDemandExceptions.getAndIncrement();
    }

    public final int getDroppedOnDemandExceptions() {
        return this.droppedOnDemandExceptions.get();
    }

    public final void incrementDroppedOnDemandExceptions() {
        this.droppedOnDemandExceptions.getAndIncrement();
    }

    public final void resetDroppedOnDemandExceptions() {
        this.droppedOnDemandExceptions.set(0);
    }
}
