package com.google.android.exoplayer2;

import java.io.IOException;

public class ParserException extends IOException {
    public final int asBinder;
    public final boolean read;

    public static ParserException asInterface(String str, Throwable th) {
        return new ParserException(str, th, true, 1);
    }

    public static ParserException RemoteActionCompatParcelizer(String str, Throwable th) {
        return new ParserException(str, th, true, 4);
    }

    public ParserException(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.read = z;
        this.asBinder = i;
    }
}
