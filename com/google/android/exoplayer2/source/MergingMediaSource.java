package com.google.android.exoplayer2.source;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.AppCompatImageHelper;
import o.DrawableContainerCompat;
import o.applyImageLevel;
import o.getHotspotBounds;
import o.getLocaleManagerForApplication;
import o.getMenuView;
import o.getMinimumHeight;
import o.getPadding;
import o.initialize;
import o.invalidateDrawable;
import o.setColorFilter;
import o.setExitFadeDuration;
import o.setHomeButtonEnabled;
import o.setHotspotBounds;
import o.setOnCancelListener;
import o.setSupportImageTintMode;

public final class MergingMediaSource extends getHotspotBounds<Integer> {
    private static final setOnCancelListener read;
    private final invalidateDrawable AudioAttributesCompatParcelizer;
    private final setHotspotBounds[] AudioAttributesImplApi21Parcelizer;
    private final applyImageLevel<Object, getMinimumHeight> AudioAttributesImplApi26Parcelizer;
    private long[][] AudioAttributesImplBaseParcelizer;
    private final Map<Object, Long> IconCompatParcelizer;
    private final boolean asBinder;
    private int onConnected;
    private final ArrayList<setHotspotBounds> onConnectionFailed;
    private final getLocaleManagerForApplication[] onConnectionSuspended;
    private final boolean onTransact;
    private IllegalMergeException write;

    public static final class IllegalMergeException extends IOException {
        private int asInterface = 0;
    }

    public final /* synthetic */ setHotspotBounds.onTransact read(Object obj, setHotspotBounds.onTransact ontransact) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return ontransact;
    }

    public final /* synthetic */ void read(Object obj, setHotspotBounds sethotspotbounds, getLocaleManagerForApplication getlocalemanagerforapplication) {
        getLocaleManagerForApplication[] getlocalemanagerforapplicationArr;
        Integer num = (Integer) obj;
        if (this.write == null) {
            if (this.onConnected == -1) {
                this.onConnected = getlocalemanagerforapplication.read();
            } else if (getlocalemanagerforapplication.read() != this.onConnected) {
                this.write = new IllegalMergeException();
                return;
            }
            if (this.AudioAttributesImplBaseParcelizer.length == 0) {
                int i = this.onConnected;
                int[] iArr = new int[2];
                iArr[1] = this.onConnectionSuspended.length;
                iArr[0] = i;
                this.AudioAttributesImplBaseParcelizer = (long[][]) Array.newInstance(Long.TYPE, iArr);
            }
            this.onConnectionFailed.remove(sethotspotbounds);
            this.onConnectionSuspended[num.intValue()] = getlocalemanagerforapplication;
            if (this.onConnectionFailed.isEmpty()) {
                if (this.asBinder) {
                    getLocaleManagerForApplication.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getLocaleManagerForApplication.RemoteActionCompatParcelizer();
                    for (int i2 = 0; i2 < this.onConnected; i2++) {
                        long j = -this.onConnectionSuspended[0].read(i2, remoteActionCompatParcelizer, false).AudioAttributesImplBaseParcelizer;
                        int i3 = 1;
                        while (true) {
                            getLocaleManagerForApplication[] getlocalemanagerforapplicationArr2 = this.onConnectionSuspended;
                            if (i3 >= getlocalemanagerforapplicationArr2.length) {
                                break;
                            }
                            this.AudioAttributesImplBaseParcelizer[i2][i3] = j - (-getlocalemanagerforapplicationArr2[i3].read(i2, remoteActionCompatParcelizer, false).AudioAttributesImplBaseParcelizer);
                            i3++;
                        }
                    }
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onConnectionSuspended[0];
                if (this.onTransact) {
                    getLocaleManagerForApplication.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = new getLocaleManagerForApplication.RemoteActionCompatParcelizer();
                    for (int i4 = 0; i4 < this.onConnected; i4++) {
                        long j2 = Long.MIN_VALUE;
                        int i5 = 0;
                        while (true) {
                            getlocalemanagerforapplicationArr = this.onConnectionSuspended;
                            if (i5 >= getlocalemanagerforapplicationArr.length) {
                                break;
                            }
                            long j3 = getlocalemanagerforapplicationArr[i5].read(i4, remoteActionCompatParcelizer3, false).write;
                            if (j3 != -9223372036854775807L) {
                                long j4 = j3 + this.AudioAttributesImplBaseParcelizer[i4][i5];
                                if (j2 == Long.MIN_VALUE || j4 < j2) {
                                    j2 = j4;
                                }
                            }
                            i5++;
                        }
                        Object AudioAttributesImplApi21Parcelizer2 = getlocalemanagerforapplicationArr[0].AudioAttributesImplApi21Parcelizer(i4);
                        this.IconCompatParcelizer.put(AudioAttributesImplApi21Parcelizer2, Long.valueOf(j2));
                        for (getMinimumHeight next : this.AudioAttributesImplApi26Parcelizer.read(AudioAttributesImplApi21Parcelizer2)) {
                            next.RemoteActionCompatParcelizer = 0;
                            next.asBinder = j2;
                        }
                    }
                    remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(remoteActionCompatParcelizer2, this.IconCompatParcelizer);
                }
                asInterface(remoteActionCompatParcelizer2);
            }
        }
    }

    static {
        setOnCancelListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new setOnCancelListener.RemoteActionCompatParcelizer();
        remoteActionCompatParcelizer.asBinder = "MergingMediaSource";
        read = remoteActionCompatParcelizer.onTransact();
    }

    public MergingMediaSource(setHotspotBounds... sethotspotboundsArr) {
        this(sethotspotboundsArr, (byte) 0);
    }

    private MergingMediaSource(setHotspotBounds[] sethotspotboundsArr, byte b) {
        this(false, sethotspotboundsArr);
    }

    private MergingMediaSource(boolean z, setHotspotBounds... sethotspotboundsArr) {
        this(false, false, new getPadding(), sethotspotboundsArr);
    }

    private MergingMediaSource(boolean z, boolean z2, invalidateDrawable invalidatedrawable, setHotspotBounds... sethotspotboundsArr) {
        this.asBinder = z;
        this.onTransact = false;
        this.AudioAttributesImplApi21Parcelizer = sethotspotboundsArr;
        this.AudioAttributesCompatParcelizer = invalidatedrawable;
        this.onConnectionFailed = new ArrayList<>(Arrays.asList(sethotspotboundsArr));
        this.onConnected = -1;
        this.onConnectionSuspended = new getLocaleManagerForApplication[sethotspotboundsArr.length];
        this.AudioAttributesImplBaseParcelizer = new long[0][];
        this.IconCompatParcelizer = new HashMap();
        setHomeButtonEnabled.onTransact.asBinder(8, "expectedKeys");
        setSupportImageTintMode.AnonymousClass3 r2 = new setSupportImageTintMode.asBinder<Object>(8) {
            private /* synthetic */ int asBinder = 8;

            /* access modifiers changed from: package-private */
            public final <K, V> Map<K, Collection<V>> asBinder() {
                return onDragEvent.onTransact(this.asBinder);
            }
        };
        setHomeButtonEnabled.onTransact.asBinder(2, "expectedValuesPerKey");
        this.AudioAttributesImplApi26Parcelizer = new setSupportImageTintMode.asInterface<K0, Object>(2) {
            private /* synthetic */ int read = 2;

            public final <K extends K0, V> setImageBitmap<K, V> RemoteActionCompatParcelizer() {
                return new AppCompatImageHelper.asInterface(asBinder.this.asBinder(), new onTransact(this.read));
            }
        }.RemoteActionCompatParcelizer();
    }

    public final setOnCancelListener AudioAttributesCompatParcelizer() {
        setHotspotBounds[] sethotspotboundsArr = this.AudioAttributesImplApi21Parcelizer;
        return sethotspotboundsArr.length > 0 ? sethotspotboundsArr[0].AudioAttributesCompatParcelizer() : read;
    }

    public final void onTransact(getMenuView getmenuview) {
        super.onTransact(getmenuview);
        for (int i = 0; i < this.AudioAttributesImplApi21Parcelizer.length; i++) {
            RemoteActionCompatParcelizer(Integer.valueOf(i), this.AudioAttributesImplApi21Parcelizer[i]);
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() throws IOException {
        IllegalMergeException illegalMergeException = this.write;
        if (illegalMergeException == null) {
            super.AudioAttributesImplApi26Parcelizer();
            return;
        }
        throw illegalMergeException;
    }

    public final setExitFadeDuration asInterface(setHotspotBounds.onTransact ontransact, initialize initialize, long j) {
        int length = this.AudioAttributesImplApi21Parcelizer.length;
        setExitFadeDuration[] setexitfadedurationArr = new setExitFadeDuration[length];
        int RemoteActionCompatParcelizer2 = this.onConnectionSuspended[0].RemoteActionCompatParcelizer(ontransact.RemoteActionCompatParcelizer);
        for (int i = 0; i < length; i++) {
            setexitfadedurationArr[i] = this.AudioAttributesImplApi21Parcelizer[i].asInterface(ontransact.onTransact(this.onConnectionSuspended[i].AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer2)), initialize, j - this.AudioAttributesImplBaseParcelizer[RemoteActionCompatParcelizer2][i]);
        }
        DrawableContainerCompat.BlockInvalidateCallback blockInvalidateCallback = new DrawableContainerCompat.BlockInvalidateCallback(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer[RemoteActionCompatParcelizer2], setexitfadedurationArr);
        if (!this.onTransact) {
            return blockInvalidateCallback;
        }
        getMinimumHeight getminimumheight = new getMinimumHeight(blockInvalidateCallback, true, 0, this.IconCompatParcelizer.get(ontransact.RemoteActionCompatParcelizer).longValue());
        getMinimumHeight getminimumheight2 = getminimumheight;
        this.AudioAttributesImplApi26Parcelizer.asBinder(ontransact.RemoteActionCompatParcelizer, getminimumheight);
        return getminimumheight;
    }

    public final void asBinder(setExitFadeDuration setexitfadeduration) {
        if (this.onTransact) {
            getMinimumHeight getminimumheight = (getMinimumHeight) setexitfadeduration;
            Iterator<Map.Entry<Object, getMinimumHeight>> it = this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((getMinimumHeight) next.getValue()).equals(getminimumheight)) {
                    this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(next.getKey(), next.getValue());
                    break;
                }
            }
            setexitfadeduration = getminimumheight.onTransact;
        }
        DrawableContainerCompat.BlockInvalidateCallback blockInvalidateCallback = (DrawableContainerCompat.BlockInvalidateCallback) setexitfadeduration;
        int i = 0;
        while (true) {
            setHotspotBounds[] sethotspotboundsArr = this.AudioAttributesImplApi21Parcelizer;
            if (i < sethotspotboundsArr.length) {
                setHotspotBounds sethotspotbounds = sethotspotboundsArr[i];
                setExitFadeDuration setexitfadeduration2 = blockInvalidateCallback.asInterface[i];
                if (setexitfadeduration2 instanceof DrawableContainerCompat.BlockInvalidateCallback.asInterface) {
                    setexitfadeduration2 = ((DrawableContainerCompat.BlockInvalidateCallback.asInterface) setexitfadeduration2).onTransact;
                }
                sethotspotbounds.asBinder(setexitfadeduration2);
                i++;
            } else {
                return;
            }
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        super.AudioAttributesImplApi21Parcelizer();
        Arrays.fill(this.onConnectionSuspended, (Object) null);
        this.onConnected = -1;
        this.write = null;
        this.onConnectionFailed.clear();
        Collections.addAll(this.onConnectionFailed, this.AudioAttributesImplApi21Parcelizer);
    }

    static final class RemoteActionCompatParcelizer extends setColorFilter {
        private final long[] AudioAttributesImplApi26Parcelizer;
        private final long[] write;

        public RemoteActionCompatParcelizer(getLocaleManagerForApplication getlocalemanagerforapplication, Map<Object, Long> map) {
            super(getlocalemanagerforapplication);
            int RemoteActionCompatParcelizer = getlocalemanagerforapplication.RemoteActionCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer = new long[getlocalemanagerforapplication.RemoteActionCompatParcelizer()];
            getLocaleManagerForApplication.read read = new getLocaleManagerForApplication.read();
            for (int i = 0; i < RemoteActionCompatParcelizer; i++) {
                this.AudioAttributesImplApi26Parcelizer[i] = getlocalemanagerforapplication.asInterface(i, read, 0).MediaDescriptionCompat;
            }
            int read2 = getlocalemanagerforapplication.read();
            this.write = new long[read2];
            getLocaleManagerForApplication.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getLocaleManagerForApplication.RemoteActionCompatParcelizer();
            for (int i2 = 0; i2 < read2; i2++) {
                getlocalemanagerforapplication.read(i2, remoteActionCompatParcelizer, true);
                long longValue = map.get(remoteActionCompatParcelizer.onConnectionSuspended).longValue();
                this.write[i2] = longValue == Long.MIN_VALUE ? remoteActionCompatParcelizer.write : longValue;
                if (remoteActionCompatParcelizer.write != -9223372036854775807L) {
                    long[] jArr = this.AudioAttributesImplApi26Parcelizer;
                    int i3 = remoteActionCompatParcelizer.setInternalConnectionCallback;
                    jArr[i3] = jArr[i3] - (remoteActionCompatParcelizer.write - this.write[i2]);
                }
            }
        }

        public final getLocaleManagerForApplication.read asInterface(int i, getLocaleManagerForApplication.read read, long j) {
            long j2;
            super.asInterface(i, read, j);
            read.MediaDescriptionCompat = this.AudioAttributesImplApi26Parcelizer[i];
            if (read.MediaDescriptionCompat == -9223372036854775807L || read.MediaBrowserCompat$SearchResultReceiver == -9223372036854775807L) {
                j2 = read.MediaBrowserCompat$SearchResultReceiver;
            } else {
                j2 = Math.min(read.MediaBrowserCompat$SearchResultReceiver, read.MediaDescriptionCompat);
            }
            read.MediaBrowserCompat$SearchResultReceiver = j2;
            return read;
        }

        public final getLocaleManagerForApplication.RemoteActionCompatParcelizer read(int i, getLocaleManagerForApplication.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
            super.read(i, remoteActionCompatParcelizer, z);
            remoteActionCompatParcelizer.write = this.write[i];
            return remoteActionCompatParcelizer;
        }
    }
}
