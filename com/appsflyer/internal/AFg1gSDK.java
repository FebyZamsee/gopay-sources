package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class AFg1gSDK extends FilterInputStream {
    private static final byte[] AFInAppEventParameterName = AFg1dSDK.values;
    private static final int[] AFInAppEventType = AFg1dSDK.AFInAppEventType;
    private static final int[] AFKeystoreWrapper = AFg1dSDK.valueOf;
    private static final int[] valueOf = AFg1dSDK.AFInAppEventParameterName;
    private static final int[] values = AFg1dSDK.AFKeystoreWrapper;
    private final int[] AFLogger = new int[4];
    private int AFLogger$LogLevel = Integer.MAX_VALUE;
    private final byte[] afDebugLog = new byte[16];
    private final byte[][] afErrorLog;
    private final byte[] afErrorLogForExcManagerOnly = new byte[16];
    private final int afInfoLog;
    private final int[] afRDLog;
    private int afWarnLog = 16;
    private int getLevel = 16;

    public final boolean markSupported() {
        return false;
    }

    public AFg1gSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.afInfoLog = i;
        this.afRDLog = AFg1dSDK.AFKeystoreWrapper(bArr, i);
        this.afErrorLog = AFInAppEventParameterName(bArr2);
    }

    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i = this.getLevel;
        if (i >= this.afWarnLog) {
            return -1;
        }
        byte[] bArr = this.afErrorLogForExcManagerOnly;
        this.getLevel = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            AFKeystoreWrapper();
            int i5 = this.getLevel;
            if (i5 < this.afWarnLog) {
                byte[] bArr2 = this.afErrorLogForExcManagerOnly;
                this.getLevel = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.afWarnLog - this.getLevel;
    }

    public final void close() throws IOException {
        super.close();
    }

    public final void mark(int i) {
        synchronized (this) {
        }
    }

    public final void reset() throws IOException {
        synchronized (this) {
        }
    }

    private static byte[][] AFInAppEventParameterName(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 >= bArr3.length) {
                    break;
                }
                bArr2[i][bArr3[i2]] = (byte) i2;
                i2++;
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int AFKeystoreWrapper() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.AFLogger$LogLevel
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.AFLogger$LogLevel = r0
        L_0x000f:
            int r0 = r7.getLevel
            r1 = 16
            if (r0 != r1) goto L_0x005e
            byte[] r0 = r7.afDebugLog
            int r2 = r7.AFLogger$LogLevel
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0058
            r2 = 1
        L_0x0022:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.afDebugLog
            int r6 = 16 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0031
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0022
        L_0x0031:
            if (r2 < r1) goto L_0x0052
            byte[] r0 = r7.afDebugLog
            byte[] r2 = r7.afErrorLogForExcManagerOnly
            r7.valueOf(r0, r2)
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.AFLogger$LogLevel = r0
            r7.getLevel = r4
            if (r0 >= 0) goto L_0x004f
            byte[] r0 = r7.afErrorLogForExcManagerOnly
            r2 = 15
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004f:
            r7.afWarnLog = r1
            goto L_0x005e
        L_0x0052:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x005e:
            int r0 = r7.afWarnLog
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1gSDK.AFKeystoreWrapper():int");
    }

    private void valueOf(byte[] bArr, byte[] bArr2) {
        AFg1gSDK aFg1gSDK = this;
        int[] iArr = aFg1gSDK.AFLogger;
        char c = 0;
        byte b = bArr[0];
        char c2 = 1;
        byte b2 = bArr[1];
        char c3 = 2;
        byte b3 = bArr[2];
        char c4 = 3;
        byte b4 = bArr[3];
        int[] iArr2 = aFg1gSDK.afRDLog;
        iArr[0] = ((((b << 24) | ((b2 & 255) << 16)) | ((b3 & 255) << 8)) | (b4 & 255)) ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        byte b5 = bArr[12];
        iArr[3] = (((((bArr[13] & 255) << 16) | (b5 << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i = 1;
        int i2 = 4;
        while (i < aFg1gSDK.afInfoLog) {
            int[] iArr3 = AFKeystoreWrapper;
            int[] iArr4 = aFg1gSDK.AFLogger;
            byte[][] bArr3 = aFg1gSDK.afErrorLog;
            byte[] bArr4 = bArr3[c];
            int i3 = iArr3[iArr4[bArr4[c]] >>> 24];
            int[] iArr5 = AFInAppEventType;
            byte[] bArr5 = bArr3[c2];
            int i4 = iArr5[(iArr4[bArr5[c]] >>> 16) & 255];
            int[] iArr6 = valueOf;
            byte[] bArr6 = bArr3[c3];
            int i5 = iArr6[(iArr4[bArr6[c]] >>> 8) & 255];
            int[] iArr7 = values;
            byte[] bArr7 = bArr3[c4];
            int i6 = iArr7[iArr4[bArr7[c]] & 255];
            int[] iArr8 = aFg1gSDK.afRDLog;
            int i7 = iArr8[i2];
            int i8 = iArr3[iArr4[bArr4[c2]] >>> 24];
            int i9 = iArr5[(iArr4[bArr5[c2]] >>> 16) & 255];
            int i10 = iArr6[(iArr4[bArr6[c2]] >>> 8) & 255];
            int i11 = iArr7[iArr4[bArr7[c2]] & 255];
            int i12 = iArr8[i2 + 1];
            int i13 = iArr3[iArr4[bArr4[c3]] >>> 24];
            int i14 = iArr5[(iArr4[bArr5[c3]] >>> 16) & 255];
            int i15 = iArr6[(iArr4[bArr6[c3]] >>> 8) & 255];
            int i16 = iArr7[iArr4[bArr7[2]] & 255];
            int i17 = iArr8[i2 + 2];
            int i18 = iArr3[iArr4[bArr4[3]] >>> 24];
            int i19 = iArr5[(iArr4[bArr5[3]] >>> 16) & 255];
            int i20 = i;
            int i21 = iArr6[(iArr4[bArr6[3]] >>> 8) & 255];
            int i22 = iArr7[iArr4[bArr7[3]] & 255];
            int i23 = iArr8[i2 + 3];
            iArr4[0] = (i6 ^ (i5 ^ (i3 ^ i4))) ^ i7;
            iArr4[1] = (((i8 ^ i9) ^ i10) ^ i11) ^ i12;
            iArr4[2] = (i16 ^ ((i14 ^ i13) ^ i15)) ^ i17;
            iArr4[3] = (((i18 ^ i19) ^ i21) ^ i22) ^ i23;
            i = i20 + 1;
            i2 += 4;
            c = 0;
            c2 = 1;
            c3 = 2;
            c4 = 3;
            aFg1gSDK = this;
        }
        int[] iArr9 = aFg1gSDK.afRDLog;
        int i24 = iArr9[i2];
        byte[] bArr8 = AFInAppEventParameterName;
        int[] iArr10 = aFg1gSDK.AFLogger;
        byte[][] bArr9 = aFg1gSDK.afErrorLog;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i24 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i24 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i24 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (i24 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i25 = iArr9[i2 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i25 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i25 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i25 >>> 8));
        bArr2[7] = (byte) (i25 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i26 = iArr9[i2 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i26 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i26 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i26 >>> 8));
        bArr2[11] = (byte) (i26 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i27 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i27 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i27 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i27 >>> 8));
        bArr2[15] = (byte) (i27 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }
}
