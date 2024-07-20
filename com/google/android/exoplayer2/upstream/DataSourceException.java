package com.google.android.exoplayer2.upstream;

import java.io.IOException;

public class DataSourceException extends IOException {
    public final int asBinder;

    public DataSourceException(int i) {
        this.asBinder = i;
    }

    public DataSourceException(Throwable th, int i) {
        super(th);
        this.asBinder = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.asBinder = i;
    }

    public DataSourceException(String str, Throwable th, int i) {
        super(str, th);
        this.asBinder = i;
    }
}
