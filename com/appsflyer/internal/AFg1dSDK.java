package com.appsflyer.internal;

public final class AFg1dSDK {
    static final int[] AFInAppEventParameterName = new int[256];
    static final int[] AFInAppEventType = new int[256];
    static final int[] AFKeystoreWrapper = new int[256];
    private static int[] afErrorLog = new int[10];
    private static byte[] afRDLog = new byte[256];
    static final int[] valueOf = new int[256];
    static final byte[] values = new byte[256];

    static {
        byte[] bArr;
        byte b;
        byte b2 = 1;
        byte b3 = 1;
        do {
            b2 = (byte) ((b2 ^ (b2 << 1)) ^ ((b2 & 128) != 0 ? (byte) 27 : 0));
            byte b4 = (byte) (b3 ^ (b3 << 1));
            byte b5 = (byte) (b4 ^ (b4 << 2));
            byte b6 = (byte) (b5 ^ (b5 << 4));
            b3 = (byte) (b6 ^ ((b6 & 128) != 0 ? (byte) 9 : 0));
            bArr = afRDLog;
            b = b2 & 255;
            byte b7 = b3 & 255;
            bArr[b] = (byte) (((b7 << 4) | (b7 >> 4)) ^ ((((b3 ^ 99) ^ ((b7 << 1) | (b7 >> 7))) ^ ((b7 << 2) | (b7 >> 6))) ^ ((b7 << 3) | (b7 >> 5))));
        } while (b != 1);
        bArr[0] = 99;
        for (int i = 0; i < 256; i++) {
            byte b8 = afRDLog[i] & 255;
            values[b8] = (byte) i;
            int i2 = i << 1;
            if (i2 >= 256) {
                i2 ^= 283;
            }
            int i3 = i2 << 1;
            if (i3 >= 256) {
                i3 ^= 283;
            }
            int i4 = i3 << 1;
            if (i4 >= 256) {
                i4 ^= 283;
            }
            int i5 = i4 ^ i;
            int i6 = (i2 ^ i5) | ((i3 ^ i5) << 8) | (((i4 ^ i3) ^ i2) << 24) | (i5 << 16);
            valueOf[b8] = i6;
            AFInAppEventType[b8] = (i6 >>> 8) | (i6 << 24);
            AFInAppEventParameterName[b8] = (i6 >>> 16) | (i6 << 16);
            AFKeystoreWrapper[b8] = (i6 >>> 24) | (i6 << 8);
        }
        afErrorLog[0] = 16777216;
        int i7 = 1;
        for (int i8 = 1; i8 < 10; i8++) {
            i7 <<= 1;
            if (i7 >= 256) {
                i7 ^= 283;
            }
            afErrorLog[i8] = i7 << 24;
        }
    }

    public static byte[][] AFKeystoreWrapper(int i) {
        byte[][] bArr = new byte[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i >>> (i2 << 3);
            bArr[i2] = new byte[]{(byte) (i3 & 3), (byte) ((i3 >> 2) & 3), (byte) ((i3 >> 4) & 3), (byte) ((i3 >> 6) & 3)};
        }
        return bArr;
    }

    static int[] AFKeystoreWrapper(byte[] bArr, int i) throws IllegalArgumentException {
        int i2;
        byte[] bArr2 = bArr;
        int i3 = i;
        if (bArr2.length == 16) {
            int i4 = (i3 + 1) << 2;
            int[] iArr = new int[i4];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i2 = 4;
                if (i5 >= 4) {
                    break;
                }
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                iArr[i5] = (bArr2[i6] << 24) | ((bArr2[i7] & 255) << 16) | ((bArr2[i8] & 255) << 8) | (bArr2[i9] & 255);
                i5++;
                i6 = i9 + 1;
            }
            int i10 = 4;
            int i11 = 0;
            int i12 = 0;
            while (i10 < i4) {
                int i13 = iArr[i10 - 1];
                if (i11 == 0) {
                    byte[] bArr3 = afRDLog;
                    i13 = afErrorLog[i12] ^ ((bArr3[i13 >>> 24] & 255) | (((bArr3[(i13 >>> 16) & 255] << 24) | ((bArr3[(i13 >>> 8) & 255] & 255) << 16)) | ((bArr3[i13 & 255] & 255) << 8)));
                    i12++;
                    i11 = 4;
                }
                iArr[i10] = i13 ^ iArr[i10 - 4];
                i10++;
                i11--;
            }
            if (bArr2.length == 16) {
                int[] iArr2 = new int[i4];
                int i14 = i3 << 2;
                int i15 = i14 + 1;
                iArr2[0] = iArr[i14];
                int i16 = i15 + 1;
                iArr2[1] = iArr[i15];
                int i17 = i16 + 1;
                iArr2[2] = iArr[i16];
                iArr2[3] = iArr[i17];
                int i18 = i17 - 7;
                for (int i19 = 1; i19 < i3; i19++) {
                    int i20 = i18 + 1;
                    int i21 = iArr[i18];
                    int i22 = i2 + 1;
                    int[] iArr3 = valueOf;
                    byte[] bArr4 = afRDLog;
                    int i23 = iArr3[bArr4[i21 >>> 24] & 255];
                    int[] iArr4 = AFInAppEventType;
                    int i24 = iArr4[bArr4[(i21 >>> 16) & 255] & 255];
                    int[] iArr5 = AFInAppEventParameterName;
                    int i25 = iArr5[bArr4[(i21 >>> 8) & 255] & 255];
                    int[] iArr6 = AFKeystoreWrapper;
                    iArr2[i2] = iArr6[bArr4[i21 & 255] & 255] ^ ((i23 ^ i24) ^ i25);
                    int i26 = i20 + 1;
                    int i27 = iArr[i20];
                    int i28 = i22 + 1;
                    iArr2[i22] = iArr6[bArr4[i27 & 255] & 255] ^ ((iArr3[bArr4[i27 >>> 24] & 255] ^ iArr4[bArr4[(i27 >>> 16) & 255] & 255]) ^ iArr5[bArr4[(i27 >>> 8) & 255] & 255]);
                    int i29 = i26 + 1;
                    int i30 = iArr[i26];
                    int i31 = i28 + 1;
                    iArr2[i28] = iArr6[bArr4[i30 & 255] & 255] ^ ((iArr3[bArr4[i30 >>> 24] & 255] ^ iArr4[bArr4[(i30 >>> 16) & 255] & 255]) ^ iArr5[bArr4[(i30 >>> 8) & 255] & 255]);
                    int i32 = iArr[i29];
                    i2 = i31 + 1;
                    iArr2[i31] = iArr6[bArr4[i32 & 255] & 255] ^ ((iArr3[bArr4[i32 >>> 24] & 255] ^ iArr4[bArr4[(i32 >>> 16) & 255] & 255]) ^ iArr5[bArr4[(i32 >>> 8) & 255] & 255]);
                    i18 = i29 - 7;
                }
                int i33 = i2 + 1;
                int i34 = i18 + 1;
                iArr2[i2] = iArr[i18];
                int i35 = i33 + 1;
                int i36 = i34 + 1;
                iArr2[i33] = iArr[i34];
                iArr2[i35] = iArr[i36];
                iArr2[i35 + 1] = iArr[i36 + 1];
                return iArr2;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
