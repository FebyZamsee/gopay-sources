package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.ParserException;

public class UnrecognizedInputFormatException extends ParserException {
    private Uri RemoteActionCompatParcelizer;

    public UnrecognizedInputFormatException(String str, Uri uri) {
        super(str, (Throwable) null, false, 1);
        this.RemoteActionCompatParcelizer = uri;
    }
}
