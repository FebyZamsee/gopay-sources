package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.forceUniformHeight;
import o.getBaseline;
import o.getChildrenSkipCount;
import o.getMaxAvailableHeight;
import o.measureNullChild;
import o.onLongPress;
import o.postShow;
import o.setBaselineAlignedChildIndex;
import o.setInputMethodMode;
import o.setModal;
import o.setOnItemClickListener;

public abstract class CodedOutputStream extends forceUniformHeight {
    private static final Logger RemoteActionCompatParcelizer = Logger.getLogger(CodedOutputStream.class.getName());
    /* access modifiers changed from: private */
    public static final boolean onTransact = setModal.onTransact();
    public getChildrenSkipCount asInterface;
    public boolean read;

    public static int AudioAttributesCompatParcelizer() {
        return 4;
    }

    public static int AudioAttributesImplApi26Parcelizer() {
        return 4;
    }

    public static int RemoteActionCompatParcelizer() {
        return 4;
    }

    public static int asBinder() {
        return 8;
    }

    public static int onConnected(int i) {
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
        return 8;
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
        return 8;
    }

    public static int write(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public abstract void AudioAttributesImplApi21Parcelizer() throws IOException;

    public abstract void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException;

    public abstract void AudioAttributesImplBaseParcelizer(int i) throws IOException;

    public abstract int IconCompatParcelizer();

    public abstract void IconCompatParcelizer(int i, int i2) throws IOException;

    public abstract void MediaBrowserCompat$CustomActionResultReceiver(int i) throws IOException;

    public abstract void MediaBrowserCompat$MediaItem(int i) throws IOException;

    public abstract void RemoteActionCompatParcelizer(byte b) throws IOException;

    public abstract void RemoteActionCompatParcelizer(int i, getMaxAvailableHeight getmaxavailableheight) throws IOException;

    public abstract void RemoteActionCompatParcelizer(long j) throws IOException;

    public abstract void RemoteActionCompatParcelizer(String str) throws IOException;

    public abstract void RemoteActionCompatParcelizer(getMaxAvailableHeight getmaxavailableheight) throws IOException;

    public abstract void asBinder(int i, long j) throws IOException;

    public abstract void asBinder(int i, getBaseline getbaseline) throws IOException;

    public abstract void onTransact(int i, getBaseline getbaseline) throws IOException;

    public abstract void onTransact(int i, getMaxAvailableHeight getmaxavailableheight, postShow postshow) throws IOException;

    public abstract void onTransact(getBaseline getbaseline) throws IOException;

    public abstract void read(int i, int i2) throws IOException;

    public abstract void read(int i, long j) throws IOException;

    public abstract void read(int i, String str) throws IOException;

    public abstract void read(int i, boolean z) throws IOException;

    public abstract void read(long j) throws IOException;

    public abstract void read(byte[] bArr, int i) throws IOException;

    public abstract void write(int i, int i2) throws IOException;

    /* synthetic */ CodedOutputStream(byte b) {
        this();
    }

    public static CodedOutputStream RemoteActionCompatParcelizer(OutputStream outputStream, int i) {
        return new RemoteActionCompatParcelizer(outputStream, i);
    }

    public static CodedOutputStream RemoteActionCompatParcelizer(byte[] bArr) {
        return new read(bArr, 0, bArr.length);
    }

    private CodedOutputStream() {
    }

    public static int setInternalConnectionCallback(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0));
    }

    public static int AudioAttributesImplApi26Parcelizer(int i) {
        if (i >= 0) {
            return onConnected(i);
        }
        return 10;
    }

    public static int onConnectionFailed(int i) {
        return onConnected((i << 1) ^ (i >> 31));
    }

    public static int asBinder(long j) {
        return onTransact(j);
    }

    public static int asInterface(long j) {
        return onTransact((j << 1) ^ (j >> 63));
    }

    public static int onTransact(String str) {
        int i;
        try {
            i = setInputMethodMode.read((CharSequence) str);
        } catch (setInputMethodMode.onTransact unused) {
            i = str.getBytes(measureNullChild.RemoteActionCompatParcelizer).length;
        }
        return onConnected(i) + i;
    }

    public static int onTransact(setBaselineAlignedChildIndex setbaselinealignedchildindex) {
        int onTransact2 = setbaselinealignedchildindex.onTransact();
        return onConnected(onTransact2) + onTransact2;
    }

    public static int asBinder(getBaseline getbaseline) {
        int asInterface2 = getbaseline.asInterface();
        return onConnected(asInterface2) + asInterface2;
    }

    public static int read(byte[] bArr) {
        int length = bArr.length;
        return onConnected(length) + length;
    }

    public static int onTransact(getMaxAvailableHeight getmaxavailableheight) {
        int serializedSize = getmaxavailableheight.getSerializedSize();
        return onConnected(serializedSize) + serializedSize;
    }

    public static int RemoteActionCompatParcelizer(getMaxAvailableHeight getmaxavailableheight, postShow postshow) {
        int serializedSize = ((onLongPress) getmaxavailableheight).getSerializedSize(postshow);
        return onConnected(serializedSize) + serializedSize;
    }

    public static int IconCompatParcelizer(int i) {
        return onConnected(i) + i;
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedOutputStream.OutOfSpaceException.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(String str, setInputMethodMode.onTransact ontransact) throws IOException {
        RemoteActionCompatParcelizer.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ontransact);
        byte[] bytes = str.getBytes(measureNullChild.RemoteActionCompatParcelizer);
        try {
            MediaBrowserCompat$MediaItem(bytes.length);
            onTransact(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    @Deprecated
    public static int read(getMaxAvailableHeight getmaxavailableheight) {
        return getmaxavailableheight.getSerializedSize();
    }

    static class read extends CodedOutputStream {
        private int AudioAttributesImplApi21Parcelizer;
        private final byte[] RemoteActionCompatParcelizer;
        private final int asBinder;
        private final int onTransact;

        public final void AudioAttributesImplApi21Parcelizer() {
        }

        read(byte[] bArr, int i, int i2) {
            super((byte) 0);
            if (bArr != null) {
                int i3 = i2 + 0;
                if (((bArr.length - i3) | i2 | 0) >= 0) {
                    this.RemoteActionCompatParcelizer = bArr;
                    this.asBinder = 0;
                    this.AudioAttributesImplApi21Parcelizer = 0;
                    this.onTransact = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, i2));
        }

        public final void onTransact(getBaseline getbaseline) throws IOException {
            MediaBrowserCompat$MediaItem(getbaseline.asInterface());
            getbaseline.asInterface(this);
        }

        public final void read(byte[] bArr, int i) throws IOException {
            MediaBrowserCompat$MediaItem(i);
            asBinder(bArr, 0, i);
        }

        public final void RemoteActionCompatParcelizer(getMaxAvailableHeight getmaxavailableheight) throws IOException {
            MediaBrowserCompat$MediaItem(getmaxavailableheight.getSerializedSize());
            getmaxavailableheight.writeTo(this);
        }

        public final void RemoteActionCompatParcelizer(byte b) throws IOException {
            try {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.onTransact), 1}), e);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) throws IOException {
            if (i >= 0) {
                MediaBrowserCompat$MediaItem(i);
            } else {
                read((long) i);
            }
        }

        public final void MediaBrowserCompat$MediaItem(int i) throws IOException {
            while ((i & -128) != 0) {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            }
            try {
                byte[] bArr2 = this.RemoteActionCompatParcelizer;
                int i3 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                bArr2[i3] = (byte) i;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.onTransact), 1}), e);
            }
        }

        public final void AudioAttributesImplBaseParcelizer(int i) throws IOException {
            try {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i2 = this.AudioAttributesImplApi21Parcelizer;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.AudioAttributesImplApi21Parcelizer = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.onTransact), 1}), e);
            }
        }

        public final void read(long j) throws IOException {
            if (!CodedOutputStream.onTransact || this.onTransact - this.AudioAttributesImplApi21Parcelizer < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.RemoteActionCompatParcelizer;
                    int i = this.AudioAttributesImplApi21Parcelizer;
                    this.AudioAttributesImplApi21Parcelizer = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.RemoteActionCompatParcelizer;
                    int i2 = this.AudioAttributesImplApi21Parcelizer;
                    this.AudioAttributesImplApi21Parcelizer = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.onTransact), 1}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.RemoteActionCompatParcelizer;
                    int i3 = this.AudioAttributesImplApi21Parcelizer;
                    this.AudioAttributesImplApi21Parcelizer = i3 + 1;
                    setModal.asBinder(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.RemoteActionCompatParcelizer;
                int i4 = this.AudioAttributesImplApi21Parcelizer;
                this.AudioAttributesImplApi21Parcelizer = i4 + 1;
                setModal.asBinder(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void RemoteActionCompatParcelizer(long j) throws IOException {
            try {
                byte[] bArr = this.RemoteActionCompatParcelizer;
                int i = this.AudioAttributesImplApi21Parcelizer;
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
                this.AudioAttributesImplApi21Parcelizer = i8 + 1;
                bArr[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.onTransact), 1}), e);
            }
        }

        private void asBinder(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, i2);
                this.AudioAttributesImplApi21Parcelizer += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Integer.valueOf(this.onTransact), Integer.valueOf(i2)}), e);
            }
        }

        public final void onTransact(byte[] bArr, int i, int i2) throws IOException {
            asBinder(bArr, i, i2);
        }

        public final void RemoteActionCompatParcelizer(String str) throws IOException {
            int i = this.AudioAttributesImplApi21Parcelizer;
            try {
                int onConnected = onConnected(str.length() * 3);
                int onConnected2 = onConnected(str.length());
                if (onConnected2 == onConnected) {
                    int i2 = i + onConnected2;
                    this.AudioAttributesImplApi21Parcelizer = i2;
                    int asInterface = setInputMethodMode.asInterface(str, this.RemoteActionCompatParcelizer, i2, this.onTransact - i2);
                    this.AudioAttributesImplApi21Parcelizer = i;
                    MediaBrowserCompat$MediaItem((asInterface - i) - onConnected2);
                    this.AudioAttributesImplApi21Parcelizer = asInterface;
                    return;
                }
                MediaBrowserCompat$MediaItem(setInputMethodMode.read((CharSequence) str));
                this.AudioAttributesImplApi21Parcelizer = setInputMethodMode.asInterface(str, this.RemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.onTransact - this.AudioAttributesImplApi21Parcelizer);
            } catch (setInputMethodMode.onTransact e) {
                this.AudioAttributesImplApi21Parcelizer = i;
                read(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        public final int IconCompatParcelizer() {
            return this.onTransact - this.AudioAttributesImplApi21Parcelizer;
        }

        public final void read(int i, boolean z) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 0));
            RemoteActionCompatParcelizer(z ? (byte) 1 : 0);
        }

        public final void onTransact(int i, getBaseline getbaseline) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 2));
            MediaBrowserCompat$MediaItem(getbaseline.asInterface());
            getbaseline.asInterface(this);
        }

        public final void read(int i, int i2) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 5));
            AudioAttributesImplBaseParcelizer(i2);
        }

        public final void asBinder(int i, long j) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 1));
            RemoteActionCompatParcelizer(j);
        }

        public final void IconCompatParcelizer(int i, int i2) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 0));
            if (i2 >= 0) {
                MediaBrowserCompat$MediaItem(i2);
            } else {
                read((long) i2);
            }
        }

        /* access modifiers changed from: package-private */
        public final void onTransact(int i, getMaxAvailableHeight getmaxavailableheight, postShow postshow) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 2));
            MediaBrowserCompat$MediaItem(((onLongPress) getmaxavailableheight).getSerializedSize(postshow));
            postshow.onTransact(getmaxavailableheight, (setPromptPosition) this.asInterface);
        }

        public final void RemoteActionCompatParcelizer(int i, getMaxAvailableHeight getmaxavailableheight) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 3));
            AudioAttributesImplApi21Parcelizer(2, 0);
            MediaBrowserCompat$MediaItem(i);
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(3, 2));
            MediaBrowserCompat$MediaItem(getmaxavailableheight.getSerializedSize());
            getmaxavailableheight.writeTo(this);
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 4));
        }

        public final void asBinder(int i, getBaseline getbaseline) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 3));
            AudioAttributesImplApi21Parcelizer(2, 0);
            MediaBrowserCompat$MediaItem(i);
            onTransact(3, getbaseline);
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 4));
        }

        public final void read(int i, String str) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 2));
            RemoteActionCompatParcelizer(str);
        }

        public final void write(int i, int i2) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 0));
            MediaBrowserCompat$MediaItem(i2);
        }

        public final void read(int i, long j) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 0));
            read(j);
        }
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + 1;
    }

    static abstract class asBinder extends CodedOutputStream {
        int AudioAttributesCompatParcelizer;
        final byte[] RemoteActionCompatParcelizer;
        final int asBinder;
        int onTransact;

        asBinder(int i) {
            super((byte) 0);
            if (i >= 0) {
                int max = Math.max(i, 20);
                this.RemoteActionCompatParcelizer = new byte[max];
                this.asBinder = max;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final int IconCompatParcelizer() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(int i) {
            if (CodedOutputStream.onTransact) {
                long j = (long) this.onTransact;
                while ((i & -128) != 0) {
                    byte[] bArr = this.RemoteActionCompatParcelizer;
                    int i2 = this.onTransact;
                    this.onTransact = i2 + 1;
                    setModal.asBinder(bArr, (long) i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.RemoteActionCompatParcelizer;
                int i3 = this.onTransact;
                this.onTransact = i3 + 1;
                setModal.asBinder(bArr2, (long) i3, (byte) i);
                this.AudioAttributesCompatParcelizer += (int) (((long) this.onTransact) - j);
                return;
            }
            while ((i & -128) != 0) {
                byte[] bArr3 = this.RemoteActionCompatParcelizer;
                int i4 = this.onTransact;
                this.onTransact = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.AudioAttributesCompatParcelizer++;
                i >>>= 7;
            }
            byte[] bArr4 = this.RemoteActionCompatParcelizer;
            int i5 = this.onTransact;
            this.onTransact = i5 + 1;
            bArr4[i5] = (byte) i;
            this.AudioAttributesCompatParcelizer++;
        }

        /* access modifiers changed from: package-private */
        public final void AudioAttributesCompatParcelizer(long j) {
            if (CodedOutputStream.onTransact) {
                long j2 = (long) this.onTransact;
                while ((j & -128) != 0) {
                    byte[] bArr = this.RemoteActionCompatParcelizer;
                    int i = this.onTransact;
                    this.onTransact = i + 1;
                    setModal.asBinder(bArr, (long) i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.RemoteActionCompatParcelizer;
                int i2 = this.onTransact;
                this.onTransact = i2 + 1;
                setModal.asBinder(bArr2, (long) i2, (byte) ((int) j));
                this.AudioAttributesCompatParcelizer += (int) (((long) this.onTransact) - j2);
                return;
            }
            while ((j & -128) != 0) {
                byte[] bArr3 = this.RemoteActionCompatParcelizer;
                int i3 = this.onTransact;
                this.onTransact = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.AudioAttributesCompatParcelizer++;
                j >>>= 7;
            }
            byte[] bArr4 = this.RemoteActionCompatParcelizer;
            int i4 = this.onTransact;
            this.onTransact = i4 + 1;
            bArr4[i4] = (byte) ((int) j);
            this.AudioAttributesCompatParcelizer++;
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$SearchResultReceiver(int i) {
            byte[] bArr = this.RemoteActionCompatParcelizer;
            int i2 = this.onTransact;
            int i3 = i2 + 1;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i >> 16);
            this.onTransact = i5 + 1;
            bArr[i5] = (byte) (i >>> 24);
            this.AudioAttributesCompatParcelizer += 4;
        }

        /* access modifiers changed from: package-private */
        public final void write(long j) {
            byte[] bArr = this.RemoteActionCompatParcelizer;
            int i = this.onTransact;
            int i2 = i + 1;
            bArr[i] = (byte) ((int) (j & 255));
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((int) ((j >> 8) & 255));
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((int) ((j >> 16) & 255));
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((int) (255 & (j >> 24)));
            int i6 = i5 + 1;
            bArr[i5] = (byte) ((int) (j >> 32));
            int i7 = i6 + 1;
            bArr[i6] = (byte) ((int) (j >> 40));
            int i8 = i7 + 1;
            bArr[i7] = (byte) ((int) (j >> 48));
            this.onTransact = i8 + 1;
            bArr[i8] = (byte) ((int) (j >> 56));
            this.AudioAttributesCompatParcelizer += 8;
        }
    }

    static final class RemoteActionCompatParcelizer extends asBinder {
        private final OutputStream IconCompatParcelizer;

        RemoteActionCompatParcelizer(OutputStream outputStream, int i) {
            super(i);
            if (outputStream != null) {
                this.IconCompatParcelizer = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        public final void AudioAttributesImplApi21Parcelizer(int i, int i2) throws IOException {
            int asInterface = setOnItemClickListener.asInterface(i, i2);
            MediaDescriptionCompat(5);
            MediaBrowserCompat$ItemReceiver(asInterface);
        }

        public final void IconCompatParcelizer(int i, int i2) throws IOException {
            MediaDescriptionCompat(20);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(i, 0));
            if (i2 >= 0) {
                MediaBrowserCompat$ItemReceiver(i2);
            } else {
                AudioAttributesCompatParcelizer((long) i2);
            }
        }

        public final void write(int i, int i2) throws IOException {
            MediaDescriptionCompat(20);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(i, 0));
            MediaBrowserCompat$ItemReceiver(i2);
        }

        public final void read(int i, int i2) throws IOException {
            MediaDescriptionCompat(14);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(i, 5));
            MediaBrowserCompat$SearchResultReceiver(i2);
        }

        public final void read(int i, long j) throws IOException {
            MediaDescriptionCompat(20);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(i, 0));
            AudioAttributesCompatParcelizer(j);
        }

        public final void asBinder(int i, long j) throws IOException {
            MediaDescriptionCompat(18);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(i, 1));
            write(j);
        }

        public final void read(int i, boolean z) throws IOException {
            MediaDescriptionCompat(11);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(i, 0));
            byte b = z ? (byte) 1 : 0;
            byte[] bArr = this.RemoteActionCompatParcelizer;
            int i2 = this.onTransact;
            this.onTransact = i2 + 1;
            bArr[i2] = b;
            this.AudioAttributesCompatParcelizer++;
        }

        public final void onTransact(getBaseline getbaseline) throws IOException {
            int asInterface = getbaseline.asInterface();
            MediaDescriptionCompat(5);
            MediaBrowserCompat$ItemReceiver(asInterface);
            getbaseline.asInterface(this);
        }

        public final void RemoteActionCompatParcelizer(getMaxAvailableHeight getmaxavailableheight) throws IOException {
            int serializedSize = getmaxavailableheight.getSerializedSize();
            MediaDescriptionCompat(5);
            MediaBrowserCompat$ItemReceiver(serializedSize);
            getmaxavailableheight.writeTo(this);
        }

        public final void RemoteActionCompatParcelizer(byte b) throws IOException {
            if (this.onTransact == this.asBinder) {
                this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, 0, this.onTransact);
                this.onTransact = 0;
            }
            byte[] bArr = this.RemoteActionCompatParcelizer;
            int i = this.onTransact;
            this.onTransact = i + 1;
            bArr[i] = b;
            this.AudioAttributesCompatParcelizer++;
        }

        public final void MediaBrowserCompat$MediaItem(int i) throws IOException {
            MediaDescriptionCompat(5);
            MediaBrowserCompat$ItemReceiver(i);
        }

        public final void AudioAttributesImplBaseParcelizer(int i) throws IOException {
            MediaDescriptionCompat(4);
            MediaBrowserCompat$SearchResultReceiver(i);
        }

        public final void read(long j) throws IOException {
            MediaDescriptionCompat(10);
            AudioAttributesCompatParcelizer(j);
        }

        public final void RemoteActionCompatParcelizer(long j) throws IOException {
            MediaDescriptionCompat(8);
            write(j);
        }

        public final void RemoteActionCompatParcelizer(String str) throws IOException {
            int i;
            int i2;
            try {
                int length = str.length() * 3;
                int onConnected = onConnected(length);
                int i3 = onConnected + length;
                if (i3 > this.asBinder) {
                    byte[] bArr = new byte[length];
                    int asInterface = setInputMethodMode.asInterface(str, bArr, 0, length);
                    MediaDescriptionCompat(5);
                    MediaBrowserCompat$ItemReceiver(asInterface);
                    asInterface(bArr, 0, asInterface);
                    return;
                }
                if (i3 > this.asBinder - this.onTransact) {
                    this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, 0, this.onTransact);
                    this.onTransact = 0;
                }
                int onConnected2 = onConnected(str.length());
                i = this.onTransact;
                if (onConnected2 == onConnected) {
                    this.onTransact = i + onConnected2;
                    int asInterface2 = setInputMethodMode.asInterface(str, this.RemoteActionCompatParcelizer, this.onTransact, this.asBinder - this.onTransact);
                    this.onTransact = i;
                    i2 = (asInterface2 - i) - onConnected2;
                    MediaBrowserCompat$ItemReceiver(i2);
                    this.onTransact = asInterface2;
                } else {
                    i2 = setInputMethodMode.read((CharSequence) str);
                    MediaBrowserCompat$ItemReceiver(i2);
                    this.onTransact = setInputMethodMode.asInterface(str, this.RemoteActionCompatParcelizer, this.onTransact, i2);
                }
                this.AudioAttributesCompatParcelizer += i2;
            } catch (setInputMethodMode.onTransact e) {
                this.AudioAttributesCompatParcelizer -= this.onTransact - i;
                this.onTransact = i;
                throw e;
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            } catch (setInputMethodMode.onTransact e3) {
                read(str, e3);
            }
        }

        public final void AudioAttributesImplApi21Parcelizer() throws IOException {
            if (this.onTransact > 0) {
                this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, 0, this.onTransact);
                this.onTransact = 0;
            }
        }

        private void asInterface(byte[] bArr, int i, int i2) throws IOException {
            if (this.asBinder - this.onTransact >= i2) {
                System.arraycopy(bArr, i, this.RemoteActionCompatParcelizer, this.onTransact, i2);
                this.onTransact += i2;
            } else {
                int i3 = this.asBinder - this.onTransact;
                System.arraycopy(bArr, i, this.RemoteActionCompatParcelizer, this.onTransact, i3);
                int i4 = i + i3;
                i2 -= i3;
                this.onTransact = this.asBinder;
                this.AudioAttributesCompatParcelizer += i3;
                this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, 0, this.onTransact);
                this.onTransact = 0;
                if (i2 <= this.asBinder) {
                    System.arraycopy(bArr, i4, this.RemoteActionCompatParcelizer, 0, i2);
                    this.onTransact = i2;
                } else {
                    this.IconCompatParcelizer.write(bArr, i4, i2);
                }
            }
            this.AudioAttributesCompatParcelizer += i2;
        }

        public final void onTransact(byte[] bArr, int i, int i2) throws IOException {
            asInterface(bArr, i, i2);
        }

        private void MediaDescriptionCompat(int i) throws IOException {
            if (this.asBinder - this.onTransact < i) {
                this.IconCompatParcelizer.write(this.RemoteActionCompatParcelizer, 0, this.onTransact);
                this.onTransact = 0;
            }
        }

        public final void read(byte[] bArr, int i) throws IOException {
            MediaDescriptionCompat(5);
            MediaBrowserCompat$ItemReceiver(i);
            asInterface(bArr, 0, i);
        }

        public final void onTransact(int i, getBaseline getbaseline) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 2));
            MediaBrowserCompat$MediaItem(getbaseline.asInterface());
            getbaseline.asInterface(this);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) throws IOException {
            if (i >= 0) {
                MediaDescriptionCompat(5);
                MediaBrowserCompat$ItemReceiver(i);
                return;
            }
            MediaDescriptionCompat(10);
            AudioAttributesCompatParcelizer((long) i);
        }

        /* access modifiers changed from: package-private */
        public final void onTransact(int i, getMaxAvailableHeight getmaxavailableheight, postShow postshow) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 2));
            int serializedSize = ((onLongPress) getmaxavailableheight).getSerializedSize(postshow);
            MediaDescriptionCompat(5);
            MediaBrowserCompat$ItemReceiver(serializedSize);
            postshow.onTransact(getmaxavailableheight, (setPromptPosition) this.asInterface);
        }

        public final void RemoteActionCompatParcelizer(int i, getMaxAvailableHeight getmaxavailableheight) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 3));
            MediaDescriptionCompat(20);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(2, 0));
            MediaBrowserCompat$ItemReceiver(i);
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(3, 2));
            int serializedSize = getmaxavailableheight.getSerializedSize();
            MediaDescriptionCompat(5);
            MediaBrowserCompat$ItemReceiver(serializedSize);
            getmaxavailableheight.writeTo(this);
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 4));
        }

        public final void asBinder(int i, getBaseline getbaseline) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 3));
            MediaDescriptionCompat(20);
            MediaBrowserCompat$ItemReceiver(setOnItemClickListener.asInterface(2, 0));
            MediaBrowserCompat$ItemReceiver(i);
            onTransact(3, getbaseline);
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(1, 4));
        }

        public final void read(int i, String str) throws IOException {
            MediaBrowserCompat$MediaItem(setOnItemClickListener.asInterface(i, 2));
            RemoteActionCompatParcelizer(str);
        }
    }

    public static int read(int i, getBaseline getbaseline) {
        int onConnected = onConnected(setOnItemClickListener.asInterface(i, 0));
        int asInterface2 = getbaseline.asInterface();
        return onConnected + onConnected(asInterface2) + asInterface2;
    }

    public static int asBinder(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + 8;
    }

    public static int asBinder(int i, int i2) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + (i2 >= 0 ? onConnected(i2) : 10);
    }

    public static int onTransact(int i) {
        if (i >= 0) {
            return onConnected(i);
        }
        return 10;
    }

    public static int asInterface(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + 4;
    }

    public static int read(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + 8;
    }

    public static int AudioAttributesImplApi21Parcelizer(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + 4;
    }

    @Deprecated
    public static int asBinder(int i, getMaxAvailableHeight getmaxavailableheight, postShow postshow) {
        return (onConnected(setOnItemClickListener.asInterface(i, 0)) << 1) + ((onLongPress) getmaxavailableheight).getSerializedSize(postshow);
    }

    public static int onTransact(int i, int i2) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + (i2 >= 0 ? onConnected(i2) : 10);
    }

    public static int onTransact(int i, long j) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + onTransact(j);
    }

    public static int RemoteActionCompatParcelizer(int i, setBaselineAlignedChildIndex setbaselinealignedchildindex) {
        int onConnected = onConnected(setOnItemClickListener.asInterface(1, 0));
        int onConnected2 = onConnected(setOnItemClickListener.asInterface(2, 0)) + onConnected(i);
        int onConnected3 = onConnected(setOnItemClickListener.asInterface(3, 0));
        int onTransact2 = setbaselinealignedchildindex.onTransact();
        return (onConnected << 1) + onConnected2 + onConnected3 + onConnected(onTransact2) + onTransact2;
    }

    public static int asInterface(int i, setBaselineAlignedChildIndex setbaselinealignedchildindex) {
        int onConnected = onConnected(setOnItemClickListener.asInterface(i, 0));
        int onTransact2 = setbaselinealignedchildindex.onTransact();
        return onConnected + onConnected(onTransact2) + onTransact2;
    }

    public static int asInterface(int i, getMaxAvailableHeight getmaxavailableheight) {
        int onConnected = onConnected(setOnItemClickListener.asInterface(1, 0));
        int onConnected2 = onConnected(setOnItemClickListener.asInterface(2, 0)) + onConnected(i);
        int onConnected3 = onConnected(setOnItemClickListener.asInterface(3, 0));
        int serializedSize = getmaxavailableheight.getSerializedSize();
        return (onConnected << 1) + onConnected2 + onConnected3 + onConnected(serializedSize) + serializedSize;
    }

    public static int asInterface(int i, getMaxAvailableHeight getmaxavailableheight, postShow postshow) {
        int onConnected = onConnected(setOnItemClickListener.asInterface(i, 0));
        int serializedSize = ((onLongPress) getmaxavailableheight).getSerializedSize(postshow);
        return onConnected + onConnected(serializedSize) + serializedSize;
    }

    public static int asInterface(int i, getBaseline getbaseline) {
        int onConnected = onConnected(setOnItemClickListener.asInterface(1, 0));
        int onConnected2 = onConnected(setOnItemClickListener.asInterface(2, 0)) + onConnected(i);
        int onConnected3 = onConnected(setOnItemClickListener.asInterface(3, 0));
        int asInterface2 = getbaseline.asInterface();
        return (onConnected << 1) + onConnected2 + onConnected3 + onConnected(asInterface2) + asInterface2;
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + 4;
    }

    public static int onConnectionSuspended(int i) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + 8;
    }

    public static int RemoteActionCompatParcelizer(int i, int i2) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + onConnected((i2 << 1) ^ (i2 >> 31));
    }

    public static int asInterface(int i, long j) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + onTransact((j << 1) ^ (j >> 63));
    }

    public static int asInterface(int i, String str) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + onTransact(str);
    }

    public static int asInterface(int i, int i2) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + onConnected(i2);
    }

    public static int RemoteActionCompatParcelizer(int i, long j) {
        return onConnected(setOnItemClickListener.asInterface(i, 0)) + onTransact(j);
    }
}
