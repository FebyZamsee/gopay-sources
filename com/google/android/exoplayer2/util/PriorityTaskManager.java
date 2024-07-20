package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

public final class PriorityTaskManager {
    private final Object RemoteActionCompatParcelizer = new Object();
    private final PriorityQueue<Integer> asBinder = new PriorityQueue<>(10, Collections.reverseOrder());
    private int read = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
    }

    public final void onTransact() {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.asBinder.add(0);
            this.read = Math.max(this.read, 0);
        }
    }

    public final void RemoteActionCompatParcelizer() {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.asBinder.remove(0);
            this.read = this.asBinder.isEmpty() ? Integer.MIN_VALUE : this.asBinder.peek().intValue();
            this.RemoteActionCompatParcelizer.notifyAll();
        }
    }
}
