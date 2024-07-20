package com.google.android.exoplayer2.decoder;

import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;
import o.AppCompatDelegateImpl;
import o.onCloseMenu;
import o.setNegativeButtonIcon;

public class DecoderInputBuffer extends onCloseMenu {
    public boolean AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    public ByteBuffer RemoteActionCompatParcelizer;
    public final AppCompatDelegateImpl.ActionModeCallbackWrapperV9 asBinder;
    public long onTransact;
    public ByteBuffer read;
    private final int write;

    static {
        setNegativeButtonIcon.read("goog.exo.decoder");
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
        private int asBinder;
        private int onTransact;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public InsufficientCapacityException(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Buffer too small ("
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r1 = " < "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.onTransact = r3
                r2.asBinder = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    public DecoderInputBuffer(int i) {
        this(i, (byte) 0);
    }

    private DecoderInputBuffer(int i, byte b) {
        this.asBinder = new AppCompatDelegateImpl.ActionModeCallbackWrapperV9();
        this.write = i;
        this.AudioAttributesImplApi26Parcelizer = 0;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        int i2 = i + this.AudioAttributesImplApi26Parcelizer;
        ByteBuffer byteBuffer = this.read;
        if (byteBuffer == null) {
            this.read = asBinder(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.read = byteBuffer;
            return;
        }
        ByteBuffer asBinder2 = asBinder(i3);
        asBinder2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            asBinder2.put(byteBuffer);
        }
        this.read = asBinder2;
    }

    public void asInterface() {
        super.asInterface();
        ByteBuffer byteBuffer = this.read;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.RemoteActionCompatParcelizer;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    private ByteBuffer asBinder(int i) {
        int i2 = this.write;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.read;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public final boolean onTransact() {
        return (this.asInterface & BasicMeasure.EXACTLY) == 1073741824;
    }
}
