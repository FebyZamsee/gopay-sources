package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;
import o.AppCompatDelegateImpl;
import o.mapNightMode;
import o.onSubDecorInstalled;
import o.onTitleChanged;
import o.setMultiChoiceItems;

public interface AudioSink {

    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer();

        void asBinder();

        void asBinder(boolean z);

        void asInterface(Exception exc);

        void onTransact();

        void onTransact(int i, long j, long j2);

        void read(long j);
    }

    boolean AudioAttributesCompatParcelizer();

    void AudioAttributesImplApi21Parcelizer() throws WriteException;

    void AudioAttributesImplApi26Parcelizer();

    boolean IconCompatParcelizer();

    int RemoteActionCompatParcelizer(setMultiChoiceItems setmultichoiceitems);

    onTitleChanged RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(AppCompatDelegateImpl.AnonymousClass3 r1);

    void RemoteActionCompatParcelizer(mapNightMode mapnightmode);

    void asBinder();

    void asBinder(int i);

    void asBinder(boolean z);

    boolean asBinder(setMultiChoiceItems setmultichoiceitems);

    void asInterface();

    void asInterface(AudioDeviceInfo audioDeviceInfo);

    void asInterface(onSubDecorInstalled onsubdecorinstalled);

    void asInterface(setMultiChoiceItems setmultichoiceitems, int[] iArr) throws ConfigurationException;

    boolean asInterface(ByteBuffer byteBuffer, long j, int i) throws InitializationException, WriteException;

    void onTransact();

    void onTransact(float f);

    void onTransact(onTitleChanged ontitlechanged);

    long read(boolean z);

    void read();

    void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void setInternalConnectionCallback();

    void write();

    public static final class ConfigurationException extends Exception {
        public final setMultiChoiceItems read;

        public ConfigurationException(Throwable th, setMultiChoiceItems setmultichoiceitems) {
            super(th);
            this.read = setmultichoiceitems;
        }

        public ConfigurationException(String str, setMultiChoiceItems setmultichoiceitems) {
            super(str);
            this.read = setmultichoiceitems;
        }
    }

    public static final class InitializationException extends Exception {
        public final int RemoteActionCompatParcelizer;
        public final boolean onTransact;
        public final setMultiChoiceItems read;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InitializationException(int r3, int r4, int r5, int r6, o.setMultiChoiceItems r7, boolean r8, java.lang.Exception r9) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "AudioTrack init failed "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r1 = " Config("
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = ", "
                r0.append(r4)
                r0.append(r5)
                r0.append(r4)
                r0.append(r6)
                java.lang.String r4 = ")"
                r0.append(r4)
                if (r8 == 0) goto L_0x002a
                java.lang.String r4 = " (recoverable)"
                goto L_0x002c
            L_0x002a:
                java.lang.String r4 = ""
            L_0x002c:
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r2.<init>(r4, r9)
                r2.RemoteActionCompatParcelizer = r3
                r2.onTransact = r8
                r2.read = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.InitializationException.<init>(int, int, int, int, o.setMultiChoiceItems, boolean, java.lang.Exception):void");
        }
    }

    public static final class WriteException extends Exception {
        public final int asBinder;
        public final setMultiChoiceItems asInterface;
        public final boolean read;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public WriteException(int r3, o.setMultiChoiceItems r4, boolean r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "AudioTrack write failed: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.read = r5
                r2.asBinder = r3
                r2.asInterface = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.WriteException.<init>(int, o.setMultiChoiceItems, boolean):void");
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        private long asBinder;
        private long asInterface;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnexpectedDiscontinuityException(long r3, long r5) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.<init>(r1)
                r0.append(r5)
                java.lang.String r1 = ", got "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.asInterface = r3
                r2.asBinder = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioSink.UnexpectedDiscontinuityException.<init>(long, long):void");
        }
    }
}
