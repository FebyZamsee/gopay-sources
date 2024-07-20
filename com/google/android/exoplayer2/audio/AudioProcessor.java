package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import o.OnBackPressedDispatcher;

public interface AudioProcessor {
    public static final ByteBuffer asBinder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void IconCompatParcelizer();

    boolean RemoteActionCompatParcelizer();

    void asBinder();

    ByteBuffer asInterface();

    boolean onTransact();

    read read(read read2) throws UnhandledAudioFormatException;

    void read();

    void read(ByteBuffer byteBuffer);

    public static final class read {
        public static final read read = new read(-1, -1, -1);
        public final int RemoteActionCompatParcelizer;
        public final int asBinder;
        public final int asInterface;
        public final int onTransact;

        public read(int i, int i2, int i3) {
            this.asInterface = i;
            this.asBinder = i2;
            this.onTransact = i3;
            this.RemoteActionCompatParcelizer = OnBackPressedDispatcher.Api33Impl.AudioAttributesImplApi26Parcelizer(i3) ? OnBackPressedDispatcher.Api33Impl.onTransact(i3, i2) : -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
            sb.append(this.asInterface);
            sb.append(", channelCount=");
            sb.append(this.asBinder);
            sb.append(", encoding=");
            sb.append(this.onTransact);
            sb.append(']');
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read2 = (read) obj;
            if (this.asInterface == read2.asInterface && this.asBinder == read2.asBinder && this.onTransact == read2.onTransact) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.asInterface), Integer.valueOf(this.asBinder), Integer.valueOf(this.onTransact)});
        }
    }

    public static final class UnhandledAudioFormatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public UnhandledAudioFormatException(com.google.android.exoplayer2.audio.AudioProcessor.read r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unhandled format: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.AudioProcessor.UnhandledAudioFormatException.<init>(com.google.android.exoplayer2.audio.AudioProcessor$read):void");
        }
    }
}
