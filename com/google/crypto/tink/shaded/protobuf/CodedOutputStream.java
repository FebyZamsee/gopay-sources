package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.AppCompatTextView;
import o.AppCompatTextViewAutoSizeHelper;
import o.ContentFrameLayout;
import o.access$401;
import o.access$701;
import o.access$901;
import o.cleanupAutoSizePresetSizes;
import o.consumeTextFutureAndSetBlocking;
import o.getMinWidthMinor;
import o.setAttachListener;
import o.setFontVariationSettings;

public abstract class CodedOutputStream extends access$901 {
    private static final Logger onTransact = Logger.getLogger(CodedOutputStream.class.getName());
    /* access modifiers changed from: private */
    public static final boolean read = setAttachListener.RemoteActionCompatParcelizer();
    public consumeTextFutureAndSetBlocking RemoteActionCompatParcelizer;
    public boolean asBinder;

    public static int AudioAttributesImplApi21Parcelizer() {
        return 8;
    }

    public static int IconCompatParcelizer() {
        return 4;
    }

    public static int RemoteActionCompatParcelizer() {
        return 8;
    }

    public static int asInterface() {
        return 8;
    }

    public static int onConnectionFailed(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int onTransact() {
        return 4;
    }

    public static int onTransact(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int read() {
        return 1;
    }

    public static int write() {
        return 4;
    }

    public abstract void AudioAttributesCompatParcelizer(int i, int i2) throws IOException;

    public abstract int AudioAttributesImplApi26Parcelizer();

    public abstract void AudioAttributesImplApi26Parcelizer(int i, int i2) throws IOException;

    public abstract void IconCompatParcelizer(int i, int i2) throws IOException;

    public abstract void MediaBrowserCompat$MediaItem(int i) throws IOException;

    public abstract void MediaBrowserCompat$SearchResultReceiver(int i) throws IOException;

    public abstract void RemoteActionCompatParcelizer(int i, access$701 access_701) throws IOException;

    public abstract void asBinder(int i, access$701 access_701) throws IOException;

    public abstract void asBinder(int i, boolean z) throws IOException;

    public abstract void asBinder(long j) throws IOException;

    public abstract void asInterface(int i, long j) throws IOException;

    public abstract void asInterface(access$701 access_701) throws IOException;

    public abstract void onConnectionSuspended(int i) throws IOException;

    public abstract void onTransact(byte b) throws IOException;

    public abstract void onTransact(int i, long j) throws IOException;

    public abstract void onTransact(int i, AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl) throws IOException;

    public abstract void onTransact(int i, AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl, ContentFrameLayout contentFrameLayout) throws IOException;

    public abstract void onTransact(String str) throws IOException;

    public abstract void read(int i, int i2) throws IOException;

    public abstract void read(int i, String str) throws IOException;

    public abstract void read(long j) throws IOException;

    public abstract void read(AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl) throws IOException;

    public abstract void read(byte[] bArr, int i) throws IOException;

    /* synthetic */ CodedOutputStream(byte b) {
        this();
    }

    public static CodedOutputStream onTransact(byte[] bArr) {
        return new asBinder(bArr, 0, bArr.length);
    }

    private CodedOutputStream() {
    }

    public static int AudioAttributesImplBaseParcelizer(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0));
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        if (i >= 0) {
            return onConnectionFailed(i);
        }
        return 10;
    }

    public static int onConnected(int i) {
        return onConnectionFailed((i << 1) ^ (i >> 31));
    }

    public static int asInterface(long j) {
        return onTransact(j);
    }

    public static int RemoteActionCompatParcelizer(long j) {
        return onTransact((j << 1) ^ (j >> 63));
    }

    public static int read(String str) {
        int i;
        try {
            i = getMinWidthMinor.asInterface(str);
        } catch (getMinWidthMinor.RemoteActionCompatParcelizer unused) {
            i = str.getBytes(AppCompatTextView.SuperCallerApi28.asInterface).length;
        }
        return onConnectionFailed(i) + i;
    }

    public static int asBinder(cleanupAutoSizePresetSizes cleanupautosizepresetsizes) {
        int onTransact2 = cleanupautosizepresetsizes.onTransact();
        return onConnectionFailed(onTransact2) + onTransact2;
    }

    public static int read(access$701 access_701) {
        int asInterface = access_701.asInterface();
        return onConnectionFailed(asInterface) + asInterface;
    }

    public static int asBinder(byte[] bArr) {
        int length = bArr.length;
        return onConnectionFailed(length) + length;
    }

    public static int RemoteActionCompatParcelizer(AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl) {
        int onConnected = api16Impl.onConnected();
        return onConnectionFailed(onConnected) + onConnected;
    }

    public static int onTransact(AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl, ContentFrameLayout contentFrameLayout) {
        setFontVariationSettings setfontvariationsettings = (setFontVariationSettings) api16Impl;
        int onTransact2 = setfontvariationsettings.onTransact();
        if (onTransact2 == -1) {
            onTransact2 = contentFrameLayout.onTransact(setfontvariationsettings);
            setfontvariationsettings.RemoteActionCompatParcelizer(onTransact2);
        }
        return onConnectionFailed(onTransact2) + onTransact2;
    }

    public static int AudioAttributesImplApi21Parcelizer(int i) {
        return onConnectionFailed(i) + i;
    }

    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        OutOfSpaceException(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.CodedOutputStream.OutOfSpaceException.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void asInterface(String str, getMinWidthMinor.RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws IOException {
        onTransact.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", remoteActionCompatParcelizer);
        byte[] bytes = str.getBytes(AppCompatTextView.SuperCallerApi28.asInterface);
        try {
            MediaBrowserCompat$SearchResultReceiver(bytes.length);
            asInterface(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        } catch (OutOfSpaceException e2) {
            throw e2;
        }
    }

    @Deprecated
    public static int asInterface(AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl) {
        return api16Impl.onConnected();
    }

    @Deprecated
    public static int AudioAttributesImplApi26Parcelizer(int i) {
        return onConnectionFailed(i);
    }

    static class asBinder extends CodedOutputStream {
        private final byte[] asInterface;
        private final int onTransact;
        private final int read;
        private int write;

        asBinder(byte[] bArr, int i, int i2) {
            super((byte) 0);
            if (bArr != null) {
                int i3 = i2 + 0;
                if (((bArr.length - i3) | i2 | 0) >= 0) {
                    this.asInterface = bArr;
                    this.onTransact = 0;
                    this.write = 0;
                    this.read = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void AudioAttributesCompatParcelizer(int i, int i2) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, i2));
        }

        public final void asInterface(access$701 access_701) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(access_701.asInterface());
            access_701.asInterface((access$901) this);
        }

        public final void read(byte[] bArr, int i) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(i);
            read(bArr, 0, i);
        }

        public final void read(AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(api16Impl.onConnected());
            api16Impl.asInterface(this);
        }

        public final void onTransact(byte b) throws IOException {
            try {
                byte[] bArr = this.asInterface;
                int i = this.write;
                this.write = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.read), 1}), e);
            }
        }

        public final void MediaBrowserCompat$MediaItem(int i) throws IOException {
            if (i >= 0) {
                MediaBrowserCompat$SearchResultReceiver(i);
            } else {
                read((long) i);
            }
        }

        public final void MediaBrowserCompat$SearchResultReceiver(int i) throws IOException {
            if (CodedOutputStream.read && !access$401.RemoteActionCompatParcelizer()) {
                int i2 = this.read;
                int i3 = this.write;
                if (i2 - i3 >= 5) {
                    if ((i & -128) == 0) {
                        byte[] bArr = this.asInterface;
                        this.write = i3 + 1;
                        setAttachListener.asBinder(bArr, (long) i3, (byte) i);
                        return;
                    }
                    byte[] bArr2 = this.asInterface;
                    this.write = i3 + 1;
                    setAttachListener.asBinder(bArr2, (long) i3, (byte) (i | 128));
                    int i4 = i >>> 7;
                    if ((i4 & -128) == 0) {
                        byte[] bArr3 = this.asInterface;
                        int i5 = this.write;
                        this.write = i5 + 1;
                        setAttachListener.asBinder(bArr3, (long) i5, (byte) i4);
                        return;
                    }
                    byte[] bArr4 = this.asInterface;
                    int i6 = this.write;
                    this.write = i6 + 1;
                    setAttachListener.asBinder(bArr4, (long) i6, (byte) (i4 | 128));
                    int i7 = i4 >>> 7;
                    if ((i7 & -128) == 0) {
                        byte[] bArr5 = this.asInterface;
                        int i8 = this.write;
                        this.write = i8 + 1;
                        setAttachListener.asBinder(bArr5, (long) i8, (byte) i7);
                        return;
                    }
                    byte[] bArr6 = this.asInterface;
                    int i9 = this.write;
                    this.write = i9 + 1;
                    setAttachListener.asBinder(bArr6, (long) i9, (byte) (i7 | 128));
                    int i10 = i7 >>> 7;
                    if ((i10 & -128) == 0) {
                        byte[] bArr7 = this.asInterface;
                        int i11 = this.write;
                        this.write = i11 + 1;
                        setAttachListener.asBinder(bArr7, (long) i11, (byte) i10);
                        return;
                    }
                    byte[] bArr8 = this.asInterface;
                    int i12 = this.write;
                    this.write = i12 + 1;
                    setAttachListener.asBinder(bArr8, (long) i12, (byte) (i10 | 128));
                    byte[] bArr9 = this.asInterface;
                    int i13 = this.write;
                    this.write = i13 + 1;
                    setAttachListener.asBinder(bArr9, (long) i13, (byte) (i10 >>> 7));
                    return;
                }
            }
            while ((i & -128) != 0) {
                byte[] bArr10 = this.asInterface;
                int i14 = this.write;
                this.write = i14 + 1;
                bArr10[i14] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr11 = this.asInterface;
                int i15 = this.write;
                this.write = i15 + 1;
                bArr11[i15] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.read), 1}), e);
            }
        }

        public final void onConnectionSuspended(int i) throws IOException {
            try {
                byte[] bArr = this.asInterface;
                int i2 = this.write;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.write = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.read), 1}), e);
            }
        }

        public final void read(long j) throws IOException {
            if (!CodedOutputStream.read || this.read - this.write < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.asInterface;
                    int i = this.write;
                    this.write = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.asInterface;
                    int i2 = this.write;
                    this.write = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.read), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.asInterface;
                    int i3 = this.write;
                    this.write = i3 + 1;
                    setAttachListener.asBinder(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.asInterface;
                int i4 = this.write;
                this.write = i4 + 1;
                setAttachListener.asBinder(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void asBinder(long j) throws IOException {
            try {
                byte[] bArr = this.asInterface;
                int i = this.write;
                int i2 = i + 1;
                bArr[i] = (byte) ((int) j);
                int i3 = i2 + 1;
                bArr[i2] = (byte) ((int) (j >> 8));
                int i4 = i3 + 1;
                bArr[i3] = (byte) ((int) (j >> 16));
                int i5 = i4 + 1;
                bArr[i4] = (byte) ((int) (j >> 24));
                int i6 = i5 + 1;
                bArr[i5] = (byte) ((int) (j >> 32));
                int i7 = i6 + 1;
                bArr[i6] = (byte) ((int) (j >> 40));
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((int) (j >> 48));
                this.write = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.read), 1}), e);
            }
        }

        private void read(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.asInterface, this.write, i2);
                this.write += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.read), Integer.valueOf(i2)}), e);
            }
        }

        public final void asInterface(byte[] bArr, int i, int i2) throws IOException {
            read(bArr, i, i2);
        }

        public final void onTransact(String str) throws IOException {
            int i = this.write;
            try {
                int onConnectionFailed = onConnectionFailed(str.length() * 3);
                int onConnectionFailed2 = onConnectionFailed(str.length());
                if (onConnectionFailed2 == onConnectionFailed) {
                    int i2 = i + onConnectionFailed2;
                    this.write = i2;
                    int read2 = getMinWidthMinor.read(str, this.asInterface, i2, this.read - i2);
                    this.write = i;
                    MediaBrowserCompat$SearchResultReceiver((read2 - i) - onConnectionFailed2);
                    this.write = read2;
                    return;
                }
                MediaBrowserCompat$SearchResultReceiver(getMinWidthMinor.asInterface(str));
                this.write = getMinWidthMinor.read(str, this.asInterface, this.write, this.read - this.write);
            } catch (getMinWidthMinor.RemoteActionCompatParcelizer e) {
                this.write = i;
                asInterface(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final int AudioAttributesImplApi26Parcelizer() {
            return this.read - this.write;
        }

        public final void asBinder(int i, boolean z) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 0));
            onTransact(z ? (byte) 1 : 0);
        }

        public final void RemoteActionCompatParcelizer(int i, access$701 access_701) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 2));
            MediaBrowserCompat$SearchResultReceiver(access_701.asInterface());
            access_701.asInterface((access$901) this);
        }

        public final void read(int i, int i2) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 5));
            onConnectionSuspended(i2);
        }

        public final void asInterface(int i, long j) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 1));
            asBinder(j);
        }

        public final void AudioAttributesImplApi26Parcelizer(int i, int i2) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 0));
            if (i2 >= 0) {
                MediaBrowserCompat$SearchResultReceiver(i2);
            } else {
                read((long) i2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void onTransact(int i, AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl, ContentFrameLayout contentFrameLayout) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 2));
            setFontVariationSettings setfontvariationsettings = (setFontVariationSettings) api16Impl;
            int onTransact2 = setfontvariationsettings.onTransact();
            if (onTransact2 == -1) {
                onTransact2 = contentFrameLayout.onTransact(setfontvariationsettings);
                setfontvariationsettings.RemoteActionCompatParcelizer(onTransact2);
            }
            MediaBrowserCompat$SearchResultReceiver(onTransact2);
            contentFrameLayout.RemoteActionCompatParcelizer(api16Impl, this.RemoteActionCompatParcelizer);
        }

        public final void onTransact(int i, AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(1, 3));
            AudioAttributesCompatParcelizer(2, 0);
            MediaBrowserCompat$SearchResultReceiver(i);
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(3, 2));
            MediaBrowserCompat$SearchResultReceiver(api16Impl.onConnected());
            api16Impl.asInterface(this);
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(1, 4));
        }

        public final void asBinder(int i, access$701 access_701) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(1, 3));
            AudioAttributesCompatParcelizer(2, 0);
            MediaBrowserCompat$SearchResultReceiver(i);
            RemoteActionCompatParcelizer(3, access_701);
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(1, 4));
        }

        public final void read(int i, String str) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 2));
            onTransact(str);
        }

        public final void IconCompatParcelizer(int i, int i2) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 0));
            MediaBrowserCompat$SearchResultReceiver(i2);
        }

        public final void onTransact(int i, long j) throws IOException {
            MediaBrowserCompat$SearchResultReceiver(ContentFrameLayout.OnAttachListener.read(i, 0));
            read(j);
        }
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + 1;
    }

    public static int onTransact(int i, access$701 access_701) {
        int onConnectionFailed = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0));
        int asInterface = access_701.asInterface();
        return onConnectionFailed + onConnectionFailed(asInterface) + asInterface;
    }

    public static int asInterface(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + 8;
    }

    public static int asInterface(int i, int i2) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + (i2 >= 0 ? onConnectionFailed(i2) : 10);
    }

    public static int onTransact(int i) {
        if (i >= 0) {
            return onConnectionFailed(i);
        }
        return 10;
    }

    public static int read(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + 4;
    }

    public static int asBinder(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + 8;
    }

    public static int IconCompatParcelizer(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + 4;
    }

    @Deprecated
    public static int RemoteActionCompatParcelizer(int i, AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl, ContentFrameLayout contentFrameLayout) {
        int onConnectionFailed = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) << 1;
        setFontVariationSettings setfontvariationsettings = (setFontVariationSettings) api16Impl;
        int onTransact2 = setfontvariationsettings.onTransact();
        if (onTransact2 == -1) {
            onTransact2 = contentFrameLayout.onTransact(setfontvariationsettings);
            setfontvariationsettings.RemoteActionCompatParcelizer(onTransact2);
        }
        return onConnectionFailed + onTransact2;
    }

    public static int onTransact(int i, int i2) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + (i2 >= 0 ? onConnectionFailed(i2) : 10);
    }

    public static int asBinder(int i, long j) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + onTransact(j);
    }

    public static int onTransact(int i, cleanupAutoSizePresetSizes cleanupautosizepresetsizes) {
        int onConnectionFailed = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(1, 0));
        int onConnectionFailed2 = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(2, 0)) + onConnectionFailed(i);
        int onConnectionFailed3 = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(3, 0));
        int onTransact2 = cleanupautosizepresetsizes.onTransact();
        return (onConnectionFailed << 1) + onConnectionFailed2 + onConnectionFailed3 + onConnectionFailed(onTransact2) + onTransact2;
    }

    public static int asBinder(int i, cleanupAutoSizePresetSizes cleanupautosizepresetsizes) {
        int onConnectionFailed = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0));
        int onTransact2 = cleanupautosizepresetsizes.onTransact();
        return onConnectionFailed + onConnectionFailed(onTransact2) + onTransact2;
    }

    public static int RemoteActionCompatParcelizer(int i, AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl) {
        int onConnectionFailed = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(1, 0));
        int onConnectionFailed2 = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(2, 0)) + onConnectionFailed(i);
        int onConnectionFailed3 = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(3, 0));
        int onConnected = api16Impl.onConnected();
        return (onConnectionFailed << 1) + onConnectionFailed2 + onConnectionFailed3 + onConnectionFailed(onConnected) + onConnected;
    }

    public static int read(int i, AppCompatTextViewAutoSizeHelper.Api16Impl api16Impl, ContentFrameLayout contentFrameLayout) {
        int onConnectionFailed = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0));
        setFontVariationSettings setfontvariationsettings = (setFontVariationSettings) api16Impl;
        int onTransact2 = setfontvariationsettings.onTransact();
        if (onTransact2 == -1) {
            onTransact2 = contentFrameLayout.onTransact(setfontvariationsettings);
            setfontvariationsettings.RemoteActionCompatParcelizer(onTransact2);
        }
        return onConnectionFailed + onConnectionFailed(onTransact2) + onTransact2;
    }

    public static int read(int i, access$701 access_701) {
        int onConnectionFailed = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(1, 0));
        int onConnectionFailed2 = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(2, 0)) + onConnectionFailed(i);
        int onConnectionFailed3 = onConnectionFailed(ContentFrameLayout.OnAttachListener.read(3, 0));
        int asInterface = access_701.asInterface();
        return (onConnectionFailed << 1) + onConnectionFailed2 + onConnectionFailed3 + onConnectionFailed(asInterface) + asInterface;
    }

    public static int write(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + 4;
    }

    public static int setInternalConnectionCallback(int i) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + 8;
    }

    public static int asBinder(int i, int i2) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + onConnectionFailed((i2 << 1) ^ (i2 >> 31));
    }

    public static int read(int i, long j) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + onTransact((j << 1) ^ (j >> 63));
    }

    public static int asInterface(int i, String str) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + read(str);
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + onConnectionFailed(i2);
    }

    public static int RemoteActionCompatParcelizer(int i, long j) {
        return onConnectionFailed(ContentFrameLayout.OnAttachListener.read(i, 0)) + onTransact(j);
    }
}
