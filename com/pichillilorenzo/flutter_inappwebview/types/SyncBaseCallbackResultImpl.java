package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.concurrent.CountDownLatch;

public class SyncBaseCallbackResultImpl<T> extends BaseCallbackResultImpl<T> {
    public final CountDownLatch latch = new CountDownLatch(1);
    public T result = null;

    public void defaultBehaviour(T t) {
        this.latch.countDown();
    }

    public void success(Object obj) {
        boolean z;
        T decodeResult = decodeResult(obj);
        this.result = decodeResult;
        if (decodeResult == null) {
            z = nullSuccess();
        } else {
            z = nonNullSuccess(decodeResult);
        }
        if (z) {
            defaultBehaviour(decodeResult);
        } else {
            this.latch.countDown();
        }
    }

    public void error(String str, String str2, Object obj) {
        this.latch.countDown();
    }

    public void notImplemented() {
        defaultBehaviour(null);
    }
}
