package com.google.android.gms.common;

final class zzd {
    static int zza(int i) {
        int[] iArr = {1, 2, 3};
        int i2 = 0;
        while (i2 < 3) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                throw null;
            } else if (i3 - 1 == i) {
                return i3;
            } else {
                i2++;
            }
        }
        return 1;
    }
}
