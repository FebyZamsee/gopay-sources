package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

abstract class zaav implements Runnable {
    final /* synthetic */ zaaw zab;

    /* synthetic */ zaav(zaaw zaaw, zaau zaau) {
        this.zab = zaaw;
    }

    public final void run() {
        Lock lock;
        this.zab.zab.lock();
        try {
            if (Thread.interrupted()) {
                lock = this.zab.zab;
            } else {
                zaa();
                lock = this.zab.zab;
            }
        } catch (RuntimeException e) {
            this.zab.zaa.zam(e);
            lock = this.zab.zab;
        } catch (Throwable th) {
            this.zab.zab.unlock();
            throw th;
        }
        lock.unlock();
    }

    /* access modifiers changed from: protected */
    public abstract void zaa();
}
