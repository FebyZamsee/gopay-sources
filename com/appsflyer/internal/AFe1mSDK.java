package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;

public final class AFe1mSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFInAppEventParameterName = null;
    private static int AFInAppEventType = 1;
    private static char AFKeystoreWrapper;
    private static int values;

    static {
        valueOf();
        TextUtils.getOffsetBefore("", 0);
        TypedValue.complexToFloat(0);
        int i = values + 89;
        AFInAppEventType = i % 128;
        if ((i % 2 == 0 ? 9 : '[') != '[') {
            throw new ArithmeticException();
        }
    }

    static void valueOf() {
        AFKeystoreWrapper = 31063;
        AFInAppEventParameterName = new char[]{19707, 19683, 19682, 19596, 19709, 19708, 19705, 19710, 19597, 19697, 19711, 19696, 19704, 19706, 19681, 19592};
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.AFf1dSDK AFKeystoreWrapper(com.appsflyer.internal.AFf1gSDK r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0023
            r1 = 81
            if (r6 == 0) goto L_0x000a
            r2 = 31
            goto L_0x000c
        L_0x000a:
            r2 = 81
        L_0x000c:
            if (r2 == r1) goto L_0x0023
            int r1 = AFInAppEventType
            int r1 = r1 + 43
            int r1 = r1 % 128
            values = r1
            r1 = 22
            if (r7 == 0) goto L_0x001d
            r2 = 36
            goto L_0x001f
        L_0x001d:
            r2 = 22
        L_0x001f:
            if (r2 == r1) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 != 0) goto L_0x0036
            com.appsflyer.internal.AFf1dSDK r4 = new com.appsflyer.internal.AFf1dSDK
            com.appsflyer.internal.AFf1fSDK r5 = com.appsflyer.internal.AFf1fSDK.INTERNAL_ERROR
            r4.<init>(r0, r5)
            int r5 = AFInAppEventType
            int r5 = r5 + 27
            int r5 = r5 % 128
            values = r5
            return r4
        L_0x0036:
            com.appsflyer.internal.AFf1dSDK r4 = AFInAppEventType(r4, r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1mSDK.AFKeystoreWrapper(com.appsflyer.internal.AFf1gSDK, java.lang.String, java.lang.String, java.lang.String):com.appsflyer.internal.AFf1dSDK");
    }

    private static String AFInAppEventParameterName(String str, String str2, String str3, String str4, String str5) {
        String valueOf = AFa1aSDK.valueOf(AFa1aSDK.AFInAppEventType(str2, str3, str4, str5, ""), str);
        if ((valueOf.length() < 12 ? 'C' : 'N') == 'N') {
            return valueOf.substring(0, 12);
        }
        int i = (values + 37) % 128;
        AFInAppEventType = i;
        values = (i + 89) % 128;
        return valueOf;
    }

    private static AFf1dSDK AFInAppEventType(AFf1gSDK aFf1gSDK, String str, String str2, String str3) {
        String str4;
        boolean z = true;
        if (str == null) {
            if (aFf1gSDK.valueOf != AFf1jSDK.DEFAULT) {
                z = false;
            }
            return new AFf1dSDK(z, AFf1fSDK.NA);
        }
        Object[] objArr = new Object[1];
        values((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 64, (byte) (View.combineMeasuredStates(0, 0) + 90), "㘃㘃\u0005\u000f\u000e\t\u0006\u000b\u000f\t\u000b\u000f\u0004\b\b\u0004\u0002\b\u0005\u0006\u0003\b\u0005\b\u0005\u0007\b\f\t\u000e\u0004\r㘆㘆\u0006\u0005\u000b\u000e\u0006\u0004\u000b\u0002\u0007\r\u0004\u000f\f\u0005\u0004\u0005\u000f\u0005㘇㘇\u0004\u0000\u000b\u0003\u0001\u0004\u0005\f\u0003\f", objArr);
        String intern = ((String) objArr[0]).intern();
        if (aFf1gSDK.valueOf == AFf1jSDK.CUSTOM) {
            str4 = new StringBuilder(str2).reverse().toString();
        } else {
            str4 = "";
            str3 = intern;
        }
        boolean equals = AFInAppEventParameterName(new StringBuilder(str3).reverse().toString(), aFf1gSDK.AFInAppEventType, "android", "v1", str4).equals(str);
        return new AFf1dSDK(equals, equals ? AFf1fSDK.SUCCESS : AFf1fSDK.FAILURE);
    }

    private static void values(int i, byte b, String str, Object[] objArr) {
        int i2;
        Throwable cause;
        int i3 = i;
        char[] cArr = (char[]) (str != null ? str.toCharArray() : str);
        AFh1zSDK aFh1zSDK = new AFh1zSDK();
        char[] cArr2 = AFInAppEventParameterName;
        if (!(cArr2 == null)) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                $10 = ($11 + 115) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object obj = AFa1wSDK.onInstallConversionFailureNative.get(-933360548);
                    if (obj == null) {
                        obj = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (TextUtils.getOffsetBefore("", 0) + 23637), 159 - ImageFormat.getBitsPerPixel(0), 36 - TextUtils.getOffsetAfter("", 0))).getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                        AFa1wSDK.onInstallConversionFailureNative.put(-933360548, obj);
                    }
                    cArr3[i4] = ((Character) ((Method) obj).invoke((Object) null, objArr2)).charValue();
                    i4++;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(AFKeystoreWrapper)};
            Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(-933360548);
            char c = 6;
            char c2 = 8;
            if (obj2 == null) {
                obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) ((ViewConfiguration.getTouchSlop() >> 8) + 23637), View.getDefaultSize(0, 0) + 160, ((Process.getThreadPriority(0) + 20) >> 6) + 36)).getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                AFa1wSDK.onInstallConversionFailureNative.put(-933360548, obj2);
            }
            char charValue = ((Character) ((Method) obj2).invoke((Object) null, objArr3)).charValue();
            char[] cArr4 = new char[i3];
            if (i3 % 2 != 0) {
                int i5 = $10 + 79;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    i2 = i3 + 100;
                    cArr4[i2] = (char) (cArr[i2] % b);
                } else {
                    i2 = i3 - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i3;
            }
            if (i2 > 1) {
                aFh1zSDK.AFKeystoreWrapper = 0;
                while (true) {
                    if (aFh1zSDK.AFKeystoreWrapper >= i2) {
                        break;
                    }
                    aFh1zSDK.valueOf = cArr[aFh1zSDK.AFKeystoreWrapper];
                    aFh1zSDK.values = cArr[aFh1zSDK.AFKeystoreWrapper + 1];
                    if (aFh1zSDK.valueOf == aFh1zSDK.values) {
                        int i6 = $10 + 23;
                        $11 = i6 % 128;
                        if (i6 % 2 == 0) {
                            cArr4[aFh1zSDK.AFKeystoreWrapper] = (char) (aFh1zSDK.valueOf - b);
                            cArr4[aFh1zSDK.AFKeystoreWrapper << 1] = (char) (aFh1zSDK.values >> b);
                        } else {
                            cArr4[aFh1zSDK.AFKeystoreWrapper] = (char) (aFh1zSDK.valueOf - b);
                            cArr4[aFh1zSDK.AFKeystoreWrapper + 1] = (char) (aFh1zSDK.values - b);
                        }
                    } else {
                        try {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = aFh1zSDK;
                            objArr4[11] = Integer.valueOf(charValue);
                            objArr4[10] = aFh1zSDK;
                            objArr4[9] = aFh1zSDK;
                            objArr4[c2] = Integer.valueOf(charValue);
                            objArr4[7] = aFh1zSDK;
                            objArr4[c] = aFh1zSDK;
                            objArr4[5] = Integer.valueOf(charValue);
                            objArr4[4] = aFh1zSDK;
                            objArr4[3] = aFh1zSDK;
                            objArr4[2] = Integer.valueOf(charValue);
                            objArr4[1] = aFh1zSDK;
                            objArr4[0] = aFh1zSDK;
                            Object obj3 = AFa1wSDK.onInstallConversionFailureNative.get(-1842179489);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) View.resolveSize(0, 0), 109 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Drawable.resolveOpacity(0, 0) + 51)).getMethod("C", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                AFa1wSDK.onInstallConversionFailureNative.put(-1842179489, obj3);
                            }
                            if ((((Integer) ((Method) obj3).invoke((Object) null, objArr4)).intValue() == aFh1zSDK.afInfoLog ? '*' : 'M') != 'M') {
                                $11 = ($10 + 29) % 128;
                                try {
                                    Object[] objArr5 = new Object[11];
                                    objArr5[10] = aFh1zSDK;
                                    objArr5[9] = Integer.valueOf(charValue);
                                    objArr5[8] = aFh1zSDK;
                                    objArr5[7] = Integer.valueOf(charValue);
                                    objArr5[6] = Integer.valueOf(charValue);
                                    objArr5[5] = aFh1zSDK;
                                    objArr5[4] = aFh1zSDK;
                                    objArr5[3] = Integer.valueOf(charValue);
                                    objArr5[2] = Integer.valueOf(charValue);
                                    objArr5[1] = aFh1zSDK;
                                    objArr5[0] = aFh1zSDK;
                                    Object obj4 = AFa1wSDK.onInstallConversionFailureNative.get(-1347559805);
                                    if (obj4 == null) {
                                        obj4 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 23637), KeyEvent.normalizeMetaState(0) + 160, 35 - Process.getGidForName(""))).getMethod("z", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                        AFa1wSDK.onInstallConversionFailureNative.put(-1347559805, obj4);
                                    }
                                    int intValue = ((Integer) ((Method) obj4).invoke((Object) null, objArr5)).intValue();
                                    int i7 = aFh1zSDK.AFInAppEventParameterName;
                                    int i8 = aFh1zSDK.afInfoLog;
                                    cArr4[aFh1zSDK.AFKeystoreWrapper] = cArr2[intValue];
                                    cArr4[aFh1zSDK.AFKeystoreWrapper + 1] = cArr2[(i7 * charValue) + i8];
                                } catch (Throwable th2) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th2;
                                }
                            } else {
                                if (aFh1zSDK.AFInAppEventType == aFh1zSDK.AFInAppEventParameterName) {
                                    $11 = ($10 + 121) % 128;
                                    aFh1zSDK.afRDLog = ((aFh1zSDK.afRDLog + charValue) - 1) % charValue;
                                    aFh1zSDK.afInfoLog = ((aFh1zSDK.afInfoLog + charValue) - 1) % charValue;
                                    int i9 = aFh1zSDK.AFInAppEventType;
                                    int i10 = aFh1zSDK.afRDLog;
                                    int i11 = aFh1zSDK.AFInAppEventParameterName;
                                    int i12 = aFh1zSDK.afInfoLog;
                                    cArr4[aFh1zSDK.AFKeystoreWrapper] = cArr2[(i9 * charValue) + i10];
                                    cArr4[aFh1zSDK.AFKeystoreWrapper + 1] = cArr2[(i11 * charValue) + i12];
                                } else {
                                    int i13 = aFh1zSDK.AFInAppEventType;
                                    int i14 = aFh1zSDK.afInfoLog;
                                    int i15 = aFh1zSDK.AFInAppEventParameterName;
                                    int i16 = aFh1zSDK.afRDLog;
                                    cArr4[aFh1zSDK.AFKeystoreWrapper] = cArr2[(i13 * charValue) + i14];
                                    cArr4[aFh1zSDK.AFKeystoreWrapper + 1] = cArr2[(i15 * charValue) + i16];
                                }
                            }
                        } finally {
                            cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                        }
                    }
                    aFh1zSDK.AFKeystoreWrapper += 2;
                    c = 6;
                    c2 = 8;
                }
            }
            for (int i17 = 0; i17 < i3; i17++) {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
            }
            String str2 = new String(cArr4);
            int i18 = $10 + 61;
            $11 = i18 % 128;
            if (i18 % 2 != 0) {
                objArr[0] = str2;
                return;
            }
            throw new ArithmeticException();
        } finally {
            Throwable cause3 = th.getCause();
            if (cause3 != null) {
                throw cause3;
            }
        }
    }
}
