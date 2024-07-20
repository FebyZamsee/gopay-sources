package com.appsflyer.internal;

import io.flutter.embedding.android.KeyboardMap;

public final class AFg1lSDK {
    static long[] valueOf(int i, int i2) {
        long[] jArr = new long[4];
        jArr[0] = (((long) i2) & KeyboardMap.kValueMask) | ((((long) i) & KeyboardMap.kValueMask) << 32);
        for (int i3 = 1; i3 < 4; i3++) {
            long j = jArr[i3 - 1];
            jArr[i3] = ((j ^ (j >> 30)) * 1812433253) + ((long) i3);
        }
        return jArr;
    }
}
