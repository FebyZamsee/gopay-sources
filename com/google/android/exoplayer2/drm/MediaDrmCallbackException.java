package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o.showsIcon;

public final class MediaDrmCallbackException extends IOException {
    public final long RemoteActionCompatParcelizer;
    public final showsIcon asBinder;
    public final Uri asInterface;
    public final Map<String, List<String>> onTransact;

    public MediaDrmCallbackException(showsIcon showsicon, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.asBinder = showsicon;
        this.asInterface = uri;
        this.onTransact = map;
        this.RemoteActionCompatParcelizer = j;
    }
}
