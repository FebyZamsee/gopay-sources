package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.util.ArrayList;
import o.getLocaleManagerForApplication;
import o.getMinimumHeight;
import o.initialize;
import o.setChangingConfigurations;
import o.setColorFilter;
import o.setExitFadeDuration;
import o.setHotspotBounds;
import o.setVariablePadding;

public final class ClippingMediaSource extends setChangingConfigurations {
    private long AudioAttributesCompatParcelizer;
    private final ArrayList<getMinimumHeight> AudioAttributesImplApi21Parcelizer;
    private onTransact AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean asBinder;
    private final boolean onConnected;
    private final long onConnectionFailed;
    private IllegalClippingException onTransact;
    private final getLocaleManagerForApplication.read setInternalConnectionCallback;
    private final long write;

    public static final class IllegalClippingException extends IOException {
        private int onTransact;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public IllegalClippingException(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Illegal clipping: "
                r0.<init>(r1)
                if (r3 == 0) goto L_0x0018
                r1 = 1
                if (r3 == r1) goto L_0x0015
                r1 = 2
                if (r3 == r1) goto L_0x0012
                java.lang.String r1 = "unknown"
                goto L_0x001a
            L_0x0012:
                java.lang.String r1 = "start exceeds end"
                goto L_0x001a
            L_0x0015:
                java.lang.String r1 = "not seekable to start"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = "invalid period count"
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.onTransact = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ClippingMediaSource.IllegalClippingException.<init>(int):void");
        }
    }

    public ClippingMediaSource(setHotspotBounds sethotspotbounds, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(sethotspotbounds);
        if (j >= 0) {
            this.onConnectionFailed = j;
            this.write = j2;
            this.IconCompatParcelizer = z;
            this.asBinder = z2;
            this.onConnected = z3;
            this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
            this.setInternalConnectionCallback = new getLocaleManagerForApplication.read();
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void AudioAttributesImplApi26Parcelizer() throws IOException {
        IllegalClippingException illegalClippingException = this.onTransact;
        if (illegalClippingException == null) {
            super.AudioAttributesImplApi26Parcelizer();
            return;
        }
        throw illegalClippingException;
    }

    public final setExitFadeDuration asInterface(setHotspotBounds.onTransact ontransact, initialize initialize, long j) {
        getMinimumHeight getminimumheight = new getMinimumHeight(this.read.asInterface(ontransact, initialize, j), this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplApi21Parcelizer.add(getminimumheight);
        return getminimumheight;
    }

    public final void asBinder(setExitFadeDuration setexitfadeduration) {
        if (this.AudioAttributesImplApi21Parcelizer.remove(setexitfadeduration)) {
            this.read.asBinder(((getMinimumHeight) setexitfadeduration).onTransact);
            if (this.AudioAttributesImplApi21Parcelizer.isEmpty() && !this.asBinder) {
                asBinder(this.AudioAttributesImplApi26Parcelizer.read);
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        super.AudioAttributesImplApi21Parcelizer();
        this.onTransact = null;
        this.AudioAttributesImplApi26Parcelizer = null;
    }

    public final void onTransact(getLocaleManagerForApplication getlocalemanagerforapplication) {
        if (this.onTransact == null) {
            asBinder(getlocalemanagerforapplication);
        }
    }

    private void asBinder(getLocaleManagerForApplication getlocalemanagerforapplication) {
        long j;
        long j2;
        getlocalemanagerforapplication.asInterface(0, this.setInternalConnectionCallback, 0);
        long j3 = this.setInternalConnectionCallback.PlaybackStateCompat;
        long j4 = Long.MIN_VALUE;
        if (this.AudioAttributesImplApi26Parcelizer == null || this.AudioAttributesImplApi21Parcelizer.isEmpty() || this.asBinder) {
            long j5 = this.onConnectionFailed;
            long j6 = this.write;
            if (this.onConnected) {
                long j7 = this.setInternalConnectionCallback.MediaBrowserCompat$SearchResultReceiver;
                j5 += j7;
                j6 += j7;
            }
            this.AudioAttributesImplBaseParcelizer = j3 + j5;
            if (this.write != Long.MIN_VALUE) {
                j4 = j3 + j6;
            }
            this.AudioAttributesCompatParcelizer = j4;
            int size = this.AudioAttributesImplApi21Parcelizer.size();
            for (int i = 0; i < size; i++) {
                getMinimumHeight getminimumheight = this.AudioAttributesImplApi21Parcelizer.get(i);
                long j8 = this.AudioAttributesImplBaseParcelizer;
                long j9 = this.AudioAttributesCompatParcelizer;
                getminimumheight.RemoteActionCompatParcelizer = j8;
                getminimumheight.asBinder = j9;
            }
            j2 = j5;
            j = j6;
        } else {
            long j10 = this.AudioAttributesImplBaseParcelizer;
            if (this.write != Long.MIN_VALUE) {
                j4 = this.AudioAttributesCompatParcelizer - j3;
            }
            long j11 = j4;
            j2 = j10 - j3;
            j = j11;
        }
        try {
            onTransact ontransact = new onTransact(getlocalemanagerforapplication, j2, j);
            this.AudioAttributesImplApi26Parcelizer = ontransact;
            asInterface((getLocaleManagerForApplication) ontransact);
        } catch (IllegalClippingException e) {
            this.onTransact = e;
            for (int i2 = 0; i2 < this.AudioAttributesImplApi21Parcelizer.size(); i2++) {
                this.AudioAttributesImplApi21Parcelizer.get(i2).asInterface = this.onTransact;
            }
        }
    }

    static final class onTransact extends setColorFilter {
        private final long AudioAttributesCompatParcelizer;
        private final boolean AudioAttributesImplApi21Parcelizer;
        private final long AudioAttributesImplApi26Parcelizer;
        private final long IconCompatParcelizer;

        public onTransact(getLocaleManagerForApplication getlocalemanagerforapplication, long j, long j2) throws IllegalClippingException {
            super(getlocalemanagerforapplication);
            boolean z = true;
            if (getlocalemanagerforapplication.read() == 1) {
                getLocaleManagerForApplication.read asInterface = getlocalemanagerforapplication.asInterface(0, new getLocaleManagerForApplication.read(), 0);
                long max = Math.max(0, j);
                if (asInterface.MediaSessionCompat$ResultReceiverWrapper || max == 0 || asInterface.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
                    long max2 = j2 == Long.MIN_VALUE ? asInterface.MediaDescriptionCompat : Math.max(0, j2);
                    if (asInterface.MediaDescriptionCompat != -9223372036854775807L) {
                        max2 = max2 > asInterface.MediaDescriptionCompat ? asInterface.MediaDescriptionCompat : max2;
                        if (max > max2) {
                            throw new IllegalClippingException(2);
                        }
                    }
                    this.IconCompatParcelizer = max;
                    this.AudioAttributesCompatParcelizer = max2;
                    int i = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                    this.AudioAttributesImplApi26Parcelizer = i == 0 ? -9223372036854775807L : max2 - max;
                    if (!asInterface.MediaSessionCompat$QueueItem || (i != 0 && (asInterface.MediaDescriptionCompat == -9223372036854775807L || max2 != asInterface.MediaDescriptionCompat))) {
                        z = false;
                    }
                    this.AudioAttributesImplApi21Parcelizer = z;
                    return;
                }
                throw new IllegalClippingException(1);
            }
            throw new IllegalClippingException(0);
        }

        public final getLocaleManagerForApplication.read asInterface(int i, getLocaleManagerForApplication.read read, long j) {
            this.read.asInterface(0, read, 0);
            read.PlaybackStateCompat += this.IconCompatParcelizer;
            read.MediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer;
            read.MediaSessionCompat$QueueItem = this.AudioAttributesImplApi21Parcelizer;
            if (read.MediaBrowserCompat$SearchResultReceiver != -9223372036854775807L) {
                read.MediaBrowserCompat$SearchResultReceiver = Math.max(read.MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer);
                long j2 = this.AudioAttributesCompatParcelizer;
                long j3 = read.MediaBrowserCompat$SearchResultReceiver;
                if (j2 != -9223372036854775807L) {
                    j3 = Math.min(j3, this.AudioAttributesCompatParcelizer);
                }
                read.MediaBrowserCompat$SearchResultReceiver = j3;
                read.MediaBrowserCompat$SearchResultReceiver -= this.IconCompatParcelizer;
            }
            long j4 = this.IconCompatParcelizer;
            if (!(j4 == -9223372036854775807L || j4 == Long.MIN_VALUE)) {
                j4 /= 1000;
            }
            if (read.ParcelableVolumeInfo != -9223372036854775807L) {
                read.ParcelableVolumeInfo += j4;
            }
            if (read.initViewTreeOwners != -9223372036854775807L) {
                read.initViewTreeOwners += j4;
            }
            return read;
        }

        public final getLocaleManagerForApplication.RemoteActionCompatParcelizer read(int i, getLocaleManagerForApplication.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
            this.read.read(0, remoteActionCompatParcelizer, z);
            long j = remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer - this.IconCompatParcelizer;
            long j2 = this.AudioAttributesImplApi26Parcelizer;
            return remoteActionCompatParcelizer.asBinder(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.onConnectionSuspended, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, setVariablePadding.AudioAttributesImplApi26Parcelizer, false);
        }
    }
}
