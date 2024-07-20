package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import o.addMenu;
import o.readFromParcel;

public abstract class TagPayloadReader {
    public final readFromParcel read;

    /* access modifiers changed from: protected */
    public abstract boolean read(addMenu addmenu) throws ParserException;

    /* access modifiers changed from: protected */
    public abstract boolean read(addMenu addmenu, long j) throws ParserException;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, (Throwable) null, false, 1);
        }
    }

    public TagPayloadReader(readFromParcel readfromparcel) {
        this.read = readfromparcel;
    }

    public final boolean asInterface(addMenu addmenu, long j) throws ParserException {
        return read(addmenu) && read(addmenu, j);
    }
}
