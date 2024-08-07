package com.google.android.exoplayer2.upstream.cache;

import java.io.IOException;

public interface Cache {

    public static class CacheException extends IOException {
    }

    void asInterface(String str);

    void onTransact(boolean z);
}
