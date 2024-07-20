package com.google.android.gms.common.api.internal;

import java.util.concurrent.locks.Lock;

abstract class zabg {
    private final zabf zaa;

    protected zabg(zabf zabf) {
        this.zaa = zabf;
    }

    /* access modifiers changed from: protected */
    public abstract void zaa();

    public final void zab(zabi zabi) {
        Lock lock;
        zabi.zai.lock();
        try {
            if (zabi.zan != this.zaa) {
                lock = zabi.zai;
            } else {
                zaa();
                lock = zabi.zai;
            }
            lock.unlock();
        } catch (Throwable th) {
            zabi.zai.unlock();
            throw th;
        }
    }
}
