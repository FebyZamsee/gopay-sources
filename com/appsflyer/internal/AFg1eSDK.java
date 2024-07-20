package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class AFg1eSDK extends FilterInputStream {
    private short AFInAppEventParameterName;
    private long[] AFInAppEventType;
    private final int AFKeystoreWrapper;
    private int AFLogger = Integer.MAX_VALUE;
    private int afInfoLog;
    private int afRDLog;
    private byte[] valueOf;
    private long[] values;

    public final boolean markSupported() {
        return false;
    }

    public AFg1eSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        int min = Math.min(Math.max(s, 4), 8);
        this.AFKeystoreWrapper = min;
        this.valueOf = new byte[min];
        this.AFInAppEventType = new long[4];
        this.values = new long[4];
        this.afInfoLog = min;
        this.afRDLog = min;
        this.AFInAppEventType = AFg1lSDK.valueOf(i ^ i4, min ^ i4);
        this.values = AFg1lSDK.valueOf(i2 ^ i4, i3 ^ i4);
    }

    public final int read() throws IOException {
        valueOf();
        int i = this.afInfoLog;
        if (i >= this.afRDLog) {
            return -1;
        }
        byte[] bArr = this.valueOf;
        this.afInfoLog = i + 1;
        return bArr[i] & 255;
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            valueOf();
            int i5 = this.afInfoLog;
            if (i5 < this.afRDLog) {
                byte[] bArr2 = this.valueOf;
                this.afInfoLog = i5 + 1;
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
        valueOf();
        return this.afRDLog - this.afInfoLog;
    }

    private void AFInAppEventType() {
        long[] jArr = this.AFInAppEventType;
        long[] jArr2 = this.values;
        short s = this.AFInAppEventParameterName;
        long j = jArr[s % 4];
        long j2 = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j2) / 2147483647L;
        jArr[i] = ((j * 2147483085) + j2) % 2147483647L;
        for (int i2 = 0; i2 < this.AFKeystoreWrapper; i2++) {
            byte[] bArr = this.valueOf;
            bArr[i2] = (byte) ((int) (((long) bArr[i2]) ^ ((this.AFInAppEventType[this.AFInAppEventParameterName] >> (i2 << 3)) & 255)));
        }
        this.AFInAppEventParameterName = (short) ((this.AFInAppEventParameterName + 1) % 4);
    }

    private int valueOf() throws IOException {
        int read;
        int i;
        if (this.AFLogger == Integer.MAX_VALUE) {
            this.AFLogger = this.in.read();
        }
        if (this.afInfoLog == this.AFKeystoreWrapper) {
            byte[] bArr = this.valueOf;
            int i2 = this.AFLogger;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    read = this.in.read(this.valueOf, i3, this.AFKeystoreWrapper - i3);
                    if (read <= 0 || (i3 = i3 + read) >= this.AFKeystoreWrapper) {
                    }
                    read = this.in.read(this.valueOf, i3, this.AFKeystoreWrapper - i3);
                    break;
                } while ((i3 = i3 + read) >= this.AFKeystoreWrapper);
                if (i3 >= this.AFKeystoreWrapper) {
                    AFInAppEventType();
                    int read2 = this.in.read();
                    this.AFLogger = read2;
                    this.afInfoLog = 0;
                    if (read2 < 0) {
                        int i4 = this.AFKeystoreWrapper;
                        i = i4 - (this.valueOf[i4 - 1] & 255);
                    } else {
                        i = this.AFKeystoreWrapper;
                    }
                    this.afRDLog = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.afRDLog;
    }
}
