package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import java.io.IOException;
import o.SupportActionModeWrapper;
import o.SupportMenuInflater;
import o.collapseItemActionView;
import o.isUiFocusable;
import o.setTintMode;

public interface HlsPlaylistTracker {

    public interface RemoteActionCompatParcelizer {
        void onTransact(SupportActionModeWrapper.CallbackWrapper callbackWrapper);
    }

    public interface asBinder {
        HlsPlaylistTracker onTransact(isUiFocusable isuifocusable, collapseItemActionView collapseitemactionview, SupportMenuInflater.InflatedOnMenuItemClickListener inflatedOnMenuItemClickListener);
    }

    public interface read {
        boolean asBinder(Uri uri, collapseItemActionView.asBinder asbinder, boolean z);

        void write();
    }

    SupportActionModeWrapper.CallbackWrapper RemoteActionCompatParcelizer(Uri uri, boolean z);

    void RemoteActionCompatParcelizer(read read2);

    boolean RemoteActionCompatParcelizer();

    boolean RemoteActionCompatParcelizer(Uri uri, long j);

    long asBinder();

    boolean asBinder(Uri uri);

    SupportMenuInflater asInterface();

    void asInterface(Uri uri);

    void asInterface(Uri uri, setTintMode.asInterface asinterface, RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void asInterface(read read2);

    void onTransact();

    void onTransact(Uri uri) throws IOException;

    void read() throws IOException;

    public static final class PlaylistStuckException extends IOException {
        private Uri onTransact;

        public PlaylistStuckException(Uri uri) {
            this.onTransact = uri;
        }
    }

    public static final class PlaylistResetException extends IOException {
        private Uri read;

        public PlaylistResetException(Uri uri) {
            this.read = uri;
        }
    }
}
