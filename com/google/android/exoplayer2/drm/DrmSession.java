package com.google.android.exoplayer2.drm;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;
import o.DrawableContainerCompat;
import o.generateConfigDelta_locale;

public interface DrmSession {
    Map<String, String> AudioAttributesCompatParcelizer();

    boolean AudioAttributesImplApi21Parcelizer();

    DrawableContainerCompat.AnonymousClass1 RemoteActionCompatParcelizer();

    int asBinder();

    void asBinder(generateConfigDelta_locale.asBinder asbinder);

    DrmSessionException asInterface();

    UUID onTransact();

    boolean onTransact(String str);

    void read(generateConfigDelta_locale.asBinder asbinder);

    public static class DrmSessionException extends IOException {
        public final int RemoteActionCompatParcelizer;

        public DrmSessionException(Throwable th, int i) {
            super(th);
            this.RemoteActionCompatParcelizer = i;
        }
    }
}
