package com.appsflyer.internal;

public final class AFh1tSDK {
    public int AFInAppEventParameterName;
    public int AFInAppEventType;
    public int valueOf;

    public static void AFKeystoreWrapper(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int values(int i) {
        AFg1cSDK aFg1cSDK = AFg1cSDK.AFInAppEventParameterName;
        return ((aFg1cSDK.valueOf[0][i >>> 24] + aFg1cSDK.valueOf[1][(i >>> 16) & 255]) ^ aFg1cSDK.valueOf[2][(i >>> 8) & 255]) + aFg1cSDK.valueOf[3][i & 255];
    }
}
