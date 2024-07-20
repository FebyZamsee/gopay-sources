package com.appsflyer.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class AFc1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static boolean AFInAppEventType = false;
    private static int[] AFKeystoreWrapper = null;
    private static int afErrorLog = ((afRDLog + 37) % 128);
    private static int afRDLog = 1;
    private static char[] valueOf;
    private static boolean values;

    static {
        AFInAppEventParameterName();
        ViewConfiguration.getLongPressTimeout();
        View.combineMeasuredStates(0, 0);
        Process.getElapsedCpuTime();
        AndroidCharacter.getMirror('0');
        View.MeasureSpec.getSize(0);
        View.MeasureSpec.getMode(0);
        Gravity.getAbsoluteGravity(0, 0);
        TextUtils.indexOf("", "", 0, 0);
        TypedValue.complexToFraction(0, 0.0f, 0.0f);
    }

    static void AFInAppEventParameterName() {
        AFKeystoreWrapper = new int[]{-940157921, -404657886, 252354068, 1516642636, -1191157367, -227280087, -1985871405, 1752061083, -1627229987, -99343284, 1073079174, -1344709191, 196077201, -807557286, -1190859630, -968986907, 1855367083, -1714282654};
        AFInAppEventParameterName = -448549118;
        values = true;
        valueOf = new char[]{44900, 44899, 44903, 44882, 44887, 44875, 44902, 44885, 44886, 44952, 44883, 44884, 44955, 44949, 44869, 44958, 44834, 44895, 44944, 44945, 44950, 44951, 44948, 44880, 44868, 44939, 44927, 44953, 44954, 44937, 44917, 44910, 44881, 44901, 44892, 44890, 44891, 44957, 44959, 44871, 44938, 44946, 44920, 44876};
        AFInAppEventType = true;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String, int[]] */
    public static String valueOf(Context context, long j) {
        Object obj;
        int i;
        String str;
        String str2;
        long j2 = j;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr = new Object[1];
        AFInAppEventParameterName(new int[]{1954798454, 1670555005, -287343176, 205264460, -1500025449, 1708994299, -584176739, 1866153634, -1576926039, -1733252905, 156231892, -117476129, 1794627243, 1987409554, -57970374, -1568787181, -1032313214, 209893505}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34, objArr);
        ? r11 = 0;
        if ((AFInAppEventParameterName(((String) objArr[0]).intern()) ? 'c' : 9) != 9) {
            int i2 = afRDLog + 101;
            afErrorLog = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                AFInAppEventParameterName(new int[]{-948199316, 1869991458}, -MotionEvent.axisFromString(""), objArr2);
                obj = objArr2[0];
            } else {
                Object[] objArr3 = new Object[1];
                AFInAppEventParameterName(new int[]{-948199316, 1869991458}, -MotionEvent.axisFromString(""), objArr3);
                ((String) objArr3[0]).intern();
                r11.hashCode();
                throw r11;
            }
        } else {
            Object[] objArr4 = new Object[1];
            AFInAppEventParameterName(new int[]{-300962695, 2079682246}, Drawable.resolveOpacity(0, 0) + 1, objArr4);
            obj = objArr4[0];
        }
        sb2.append(((String) obj).intern());
        sb.append(AFInAppEventParameterName(context, sb2));
        try {
            long j3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            Object[] objArr5 = new Object[1];
            AFInAppEventParameterName(new int[]{-1523036770, 2076176062, 197796350, 731410920, 1173137483, 1469913372, -59748895, -659613674, 1603261017, -1242100653}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18, objArr5);
            sb.append(new SimpleDateFormat(((String) objArr5[0]).intern(), Locale.US).format(new Date(j3)));
            int i3 = afErrorLog + 119;
            afRDLog = i3 % 128;
            if (i3 % 2 == 0) {
                sb.append(j2);
                AFInAppEventParameterName(sb3);
                str2 = AFInAppEventType(values(sb.toString()), sb2.toString(), 39);
                str = sb3.toString();
                i = 104;
            } else {
                sb.append(j2);
                AFInAppEventParameterName(sb3);
                str2 = AFInAppEventType(values(sb.toString()), sb2.toString(), 17);
                str = sb3.toString();
                i = 27;
            }
            return AFKeystoreWrapper(AFInAppEventType(str2, str, i), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException e) {
            Object[] objArr6 = new Object[1];
            AFInAppEventParameterName(new int[]{-531637370, 1944144861, -576614006, 1362419952, 1570258680, -148204952, 1438355656, -1807060540, 1372684692, -1282831403, 1730826947, 80283117, -1028086447, 106076668}, 28 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
            Object[] objArr7 = new Object[1];
            valueOf("", r11, r11, Process.getGidForName("") + 128, objArr7);
            return ((String) objArr7[0]).intern();
        }
    }

    private static String AFKeystoreWrapper(String str, Long l) {
        long j;
        int i = (afRDLog + 79) % 128;
        afErrorLog = i;
        if (str != null) {
            afRDLog = (i + 45) % 128;
            if (!(l == null) && str.length() == 32) {
                StringBuilder sb = new StringBuilder(str);
                String obj = l.toString();
                afRDLog = (afErrorLog + 119) % 128;
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if ((i2 < obj.length() ? ' ' : 'Q') != ' ') {
                        break;
                    }
                    int i4 = afRDLog + 29;
                    afErrorLog = i4 % 128;
                    if ((i4 % 2 != 0 ? (char) 31 : 0) != 0) {
                        i3 >>= Character.getNumericValue(obj.charAt(i2));
                        i2 += 27;
                    } else {
                        i3 += Character.getNumericValue(obj.charAt(i2));
                        i2++;
                    }
                }
                String hexString = Integer.toHexString(i3);
                sb.replace(7, hexString.length() + 7, hexString);
                long j2 = 0;
                int i5 = 0;
                while (true) {
                    if (!(i5 < sb.length())) {
                        break;
                    }
                    int i6 = afRDLog + 3;
                    afErrorLog = i6 % 128;
                    if (i6 % 2 != 0) {
                        j2 ^= (long) Character.getNumericValue(sb.charAt(i5));
                        i5 += 18;
                    } else {
                        j2 += (long) Character.getNumericValue(sb.charAt(i5));
                        i5++;
                    }
                }
                while (j2 > 100) {
                    int i7 = afErrorLog + 81;
                    afRDLog = i7 % 128;
                    if (i7 % 2 == 0) {
                        j = j2 | 100;
                    } else {
                        j = j2 % 100;
                    }
                }
                sb.insert(23, (int) j2);
                if (j2 < 10) {
                    Object[] objArr = new Object[1];
                    AFInAppEventParameterName(new int[]{-300962695, 2079682246}, Color.green(0) + 1, objArr);
                    sb.insert(23, ((String) objArr[0]).intern());
                }
                return sb.toString();
            }
        }
        Object[] objArr2 = new Object[1];
        valueOf("", (String) null, (int[]) null, 127 - View.resolveSizeAndState(0, 0, 0), objArr2);
        return ((String) objArr2[0]).intern();
    }

    private static boolean AFInAppEventParameterName(String str) {
        afErrorLog = (afRDLog + 37) % 128;
        try {
            Class.forName(str);
            afErrorLog = (afRDLog + 57) % 128;
            return true;
        } catch (ClassNotFoundException e) {
            Object[] objArr = new Object[1];
            valueOf("", (String) null, (int[]) null, (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 126, objArr);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
            return false;
        }
    }

    private static String AFInAppEventType(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, valueOf(str2).charAt(0));
        String obj = sb.toString();
        int i2 = afErrorLog + 117;
        afRDLog = i2 % 128;
        if ((i2 % 2 == 0 ? '^' : 19) == 19) {
            return obj;
        }
        throw null;
    }

    private static String valueOf(String str) {
        int i;
        int i2;
        int i3 = afRDLog + 75;
        afErrorLog = i3 % 128;
        if ((i3 % 2 != 0 ? 'W' : 3) != 3) {
            i = Integer.parseInt(str, 3);
            i2 = 36;
        } else {
            i = Integer.parseInt(str, 2);
            i2 = 16;
        }
        String num = Integer.toString(i, i2);
        int i4 = afErrorLog + 61;
        afRDLog = i4 % 128;
        if ((i4 % 2 == 0 ? 'A' : '/') != 'A') {
            return num;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0177  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void AFInAppEventParameterName(java.lang.StringBuilder r12) {
        /*
            int r0 = afRDLog
            int r0 = r0 + 29
            int r0 = r0 % 128
            afErrorLog = r0
            r0 = 0
            int r1 = android.graphics.ImageFormat.getBitsPerPixel(r0)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r1 = r1 + 128
            r4 = 0
            java.lang.String r5 = ""
            valueOf(r5, r4, r4, r1, r3)
            r1 = r3[r0]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r1 = AFInAppEventParameterName((java.lang.String) r1)
            r3 = 92
            r5 = 2
            if (r1 == 0) goto L_0x002c
            r1 = 92
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r6 = 0
            if (r1 == r3) goto L_0x0043
            int[] r1 = new int[r5]
            r1 = {-300962695, 2079682246} // fill-array
            int r3 = android.widget.ExpandableListView.getPackedPositionType(r6)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r3 = r3 + r2
            AFInAppEventParameterName(r1, r3, r8)
            r1 = r8[r0]
            goto L_0x0055
        L_0x0043:
            int[] r1 = new int[r5]
            r1 = {-948199316, 1869991458} // fill-array
            int r3 = android.graphics.Color.green(r0)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r3 = 1 - r3
            AFInAppEventParameterName(r1, r3, r8)
            r1 = r8[r0]
        L_0x0055:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r12.append(r1)
            int r1 = android.graphics.Color.alpha(r0)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            int r1 = r1 + 127
            java.lang.String r8 = ""
            valueOf(r8, r4, r4, r1, r3)
            r1 = r3[r0]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r1 = AFInAppEventParameterName((java.lang.String) r1)
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x008e
            int[] r1 = new int[r5]
            r1 = {-948199316, 1869991458} // fill-array
            int r4 = android.view.KeyEvent.keyCodeFromString(r3)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r4 = 1 - r4
            AFInAppEventParameterName(r1, r4, r8)
            r1 = r8[r0]
            goto L_0x00a2
        L_0x008e:
            int[] r1 = new int[r5]
            r1 = {-300962695, 2079682246} // fill-array
            int r4 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r4 = r4 >> 16
            int r4 = 1 - r4
            AFInAppEventParameterName(r1, r4, r8)
            r1 = r8[r0]
        L_0x00a2:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r12.append(r1)
            r1 = 10
            int[] r1 = new int[r1]
            r1 = {1954798454, 1670555005, -287343176, 205264460, -920485145, 1769399247, 852526811, 385320888, 797236674, -1423058241} // fill-array
            int r4 = android.graphics.Color.blue(r0)
            java.lang.Object[] r8 = new java.lang.Object[r2]
            int r4 = r4 + 20
            AFInAppEventParameterName(r1, r4, r8)
            r1 = r8[r0]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r1 = AFInAppEventParameterName((java.lang.String) r1)
            r4 = 48
            if (r1 == 0) goto L_0x00d0
            r1 = 48
            goto L_0x00d2
        L_0x00d0:
            r1 = 19
        L_0x00d2:
            r8 = 8
            if (r1 == r4) goto L_0x00eb
            int[] r1 = new int[r5]
            r1 = {-300962695, 2079682246} // fill-array
            long r9 = android.widget.ExpandableListView.getPackedPositionForGroup(r0)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            int r6 = 1 - r11
            AFInAppEventParameterName(r1, r6, r4)
            r1 = r4[r0]
            goto L_0x0123
        L_0x00eb:
            int r1 = afRDLog
            int r1 = r1 + 83
            int r4 = r1 % 128
            afErrorLog = r4
            int r1 = r1 % r5
            if (r1 == 0) goto L_0x0111
            int[] r1 = new int[r5]
            r1 = {-948199316, 1869991458} // fill-array
            int r4 = android.view.ViewConfiguration.getTouchSlop()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r4 = r4 << 85
            int r4 = r0 >> r4
            AFInAppEventParameterName(r1, r4, r6)
            r1 = r6[r0]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            goto L_0x0129
        L_0x0111:
            int[] r1 = new int[r5]
            r1 = {-948199316, 1869991458} // fill-array
            int r4 = android.view.ViewConfiguration.getTouchSlop()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            int r4 = r4 >> r8
            int r4 = r4 + r2
            AFInAppEventParameterName(r1, r4, r6)
            r1 = r6[r0]
        L_0x0123:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
        L_0x0129:
            r12.append(r1)
            int[] r1 = new int[r8]
            r1 = {1954798454, 1670555005, -287343176, 205264460, -504811073, 1953374387, 1917641939, -1148548580} // fill-array
            int r3 = android.text.TextUtils.getOffsetBefore(r3, r0)
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r3 = 15 - r3
            AFInAppEventParameterName(r1, r3, r4)
            r1 = r4[r0]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            boolean r1 = AFInAppEventParameterName((java.lang.String) r1)
            if (r1 == 0) goto L_0x0177
            int r1 = afErrorLog
            int r1 = r1 + 43
            int r3 = r1 % 128
            afRDLog = r3
            int[] r3 = new int[r5]
            r3 = {-948199316, 1869991458} // fill-array
            int r1 = r1 % r5
            if (r1 != 0) goto L_0x0168
            int r1 = android.view.KeyEvent.getMaxKeyCode()
            int r1 = r1 / 20
            java.lang.Object[] r2 = new java.lang.Object[r2]
            AFInAppEventParameterName(r3, r1, r2)
            r0 = r2[r0]
            goto L_0x018a
        L_0x0168:
            int r1 = android.view.KeyEvent.getMaxKeyCode()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r1 = r1 >> 16
            int r2 = r2 - r1
            AFInAppEventParameterName(r3, r2, r4)
            r0 = r4[r0]
            goto L_0x018a
        L_0x0177:
            int[] r1 = new int[r5]
            r1 = {-300962695, 2079682246} // fill-array
            int r3 = android.os.Process.myTid()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            int r3 = r3 >> 22
            int r2 = r2 - r3
            AFInAppEventParameterName(r1, r2, r4)
            r0 = r4[r0]
        L_0x018a:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r12.append(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1uSDK.AFInAppEventParameterName(java.lang.StringBuilder):void");
    }

    private static String values(String str) {
        int i = afErrorLog + 79;
        afRDLog = i % 128;
        if ((i % 2 == 0 ? 'F' : 'C') == 'C') {
            return AFa1aSDK.AFInAppEventType(AFa1aSDK.AFKeystoreWrapper(str));
        }
        AFa1aSDK.AFInAppEventType(AFa1aSDK.AFKeystoreWrapper(str));
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String, int[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        r5 = new java.lang.Object[1];
        valueOf(" ", r2, r2, 127 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), r5);
        r11 = r11.split(((java.lang.String) r5[0]).intern());
        r0 = r11.length;
        r2 = new java.lang.StringBuilder();
        r0 = r0 - 1;
        r2.append(r11[r0]);
        r7 = new java.lang.Object[1];
        AFInAppEventParameterName(new int[]{1036335954, 250409160}, 1 - android.view.View.getDefaultSize(0, 0), r7);
        r2.append(((java.lang.String) r7[0]).intern());
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a8, code lost:
        if (r5 >= r0) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00aa, code lost:
        r6 = afErrorLog + 73;
        afRDLog = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b3, code lost:
        if ((r6 % 2) != 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b5, code lost:
        r2.append(r11[r5]);
        r8 = new java.lang.Object[1];
        AFInAppEventParameterName(new int[]{1036335954, 250409160}, 0 / android.view.KeyEvent.getDeadChar(1, 1), r8);
        r2.append(((java.lang.String) r8[0]).intern());
        r5 = r5 + 120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d8, code lost:
        r2.append(r11[r5]);
        r8 = new java.lang.Object[1];
        AFInAppEventParameterName(new int[]{1036335954, 250409160}, android.view.KeyEvent.getDeadChar(0, 0) + 1, r8);
        r2.append(((java.lang.String) r8[0]).intern());
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00fa, code lost:
        r2.append(r11[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0103, code lost:
        return r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if ((!r11.contains(((java.lang.String) r7[0]).intern())) != true) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004f, code lost:
        if (r11.contains(((java.lang.String) r7[0]).intern()) == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String AFInAppEventType(java.lang.String r11) {
        /*
            int r0 = afRDLog
            int r0 = r0 + 47
            int r1 = r0 % 128
            afErrorLog = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0031
            int[] r0 = new int[r1]
            r0 = {1036335954, 250409160} // fill-array
            long r5 = android.os.Process.getElapsedCpuTime()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r8 = 1
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            AFInAppEventParameterName(r0, r10, r7)
            r0 = r7[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r11.contains(r0)
            r0 = r0 ^ r4
            if (r0 == r4) goto L_0x0051
            goto L_0x0065
        L_0x0031:
            int[] r0 = new int[r1]
            r0 = {1036335954, 250409160} // fill-array
            long r5 = android.os.Process.getElapsedCpuTime()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            AFInAppEventParameterName(r0, r10, r7)
            r0 = r7[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            boolean r0 = r11.contains(r0)
            if (r0 != 0) goto L_0x0065
        L_0x0051:
            int r0 = afErrorLog
            int r0 = r0 + 83
            int r5 = r0 % 128
            afRDLog = r5
            int r0 = r0 % r1
            if (r0 != 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = 1
        L_0x005e:
            if (r3 != r4) goto L_0x0061
            return r11
        L_0x0061:
            r2.hashCode()
            throw r2
        L_0x0065:
            int r0 = android.view.ViewConfiguration.getWindowTouchSlop()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            int r0 = r0 >> 8
            int r0 = 127 - r0
            java.lang.String r6 = " "
            valueOf(r6, r2, r2, r0, r5)
            r0 = r5[r3]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            java.lang.String[] r11 = r11.split(r0)
            int r0 = r11.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r0 = r0 - r4
            r5 = r11[r0]
            r2.append(r5)
            int[] r5 = new int[r1]
            r5 = {1036335954, 250409160} // fill-array
            int r6 = android.view.View.getDefaultSize(r3, r3)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            int r6 = 1 - r6
            AFInAppEventParameterName(r5, r6, r7)
            r5 = r7[r3]
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = r5.intern()
            r2.append(r5)
            r5 = 1
        L_0x00a8:
            if (r5 >= r0) goto L_0x00fa
            int r6 = afErrorLog
            int r6 = r6 + 73
            int r7 = r6 % 128
            afRDLog = r7
            int r6 = r6 % r1
            if (r6 != 0) goto L_0x00d8
            r6 = r11[r5]
            r2.append(r6)
            int[] r6 = new int[r1]
            r6 = {1036335954, 250409160} // fill-array
            int r7 = android.view.KeyEvent.getDeadChar(r4, r4)
            int r7 = r3 / r7
            java.lang.Object[] r8 = new java.lang.Object[r4]
            AFInAppEventParameterName(r6, r7, r8)
            r6 = r8[r3]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            int r5 = r5 + 120
            goto L_0x00a8
        L_0x00d8:
            r6 = r11[r5]
            r2.append(r6)
            int[] r6 = new int[r1]
            r6 = {1036335954, 250409160} // fill-array
            int r7 = android.view.KeyEvent.getDeadChar(r3, r3)
            java.lang.Object[] r8 = new java.lang.Object[r4]
            int r7 = r7 + r4
            AFInAppEventParameterName(r6, r7, r8)
            r6 = r8[r3]
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            int r5 = r5 + 1
            goto L_0x00a8
        L_0x00fa:
            r11 = r11[r3]
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1uSDK.AFInAppEventType(java.lang.String):java.lang.String");
    }

    private static String values(Context context) {
        Properties properties = System.getProperties();
        Object[] objArr = new Object[1];
        AFInAppEventParameterName(new int[]{1429121291, -423274077, -613032166, 292228165, 1973603652, 1103944328, -447502749, 1340288288}, 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), objArr);
        String str = null;
        if (!(!properties.containsKey(((String) objArr[0]).intern()))) {
            afRDLog = (afErrorLog + 9) % 128;
            try {
                String path = context.getCacheDir().getPath();
                Object[] objArr2 = new Object[1];
                valueOf("¢¢¡", (String) null, (int[]) null, 128 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), objArr2);
                String replace = path.replace(((String) objArr2[0]).intern(), "");
                Object[] objArr3 = new Object[1];
                valueOf("¥£¤£ ¡£", (String) null, (int[]) null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, objArr3);
                Matcher matcher = Pattern.compile(((String) objArr3[0]).intern()).matcher(replace);
                if ((matcher.find() ? (char) 5 : 0) == 5) {
                    str = matcher.group(1);
                }
                afRDLog = (afErrorLog + 21) % 128;
            } catch (Exception e) {
                Object[] objArr4 = new Object[1];
                AFInAppEventParameterName(new int[]{1758380615, 911777669, 1676323557, 43970594, 1500894861, 1301572909, 913153170, -184523049, 1396991208, 593433283, 238868041, 1667860295}, (KeyEvent.getMaxKeyCode() >> 16) + 24, objArr4);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr4[0]).intern(), e);
                AFb1uSDK afErrorLogForExcManagerOnly = AFa1dSDK.valueOf().values().afErrorLogForExcManagerOnly();
                Object[] objArr5 = new Object[1];
                valueOf("ª¢©¨§¦¢", (String) null, (int[]) null, 127 - View.combineMeasuredStates(0, 0), objArr5);
                String intern = ((String) objArr5[0]).intern();
                StringBuilder sb = new StringBuilder();
                Object[] objArr6 = new Object[1];
                valueOf("¬ª¢©ª¢¢«", (String) null, (int[]) null, (Process.myTid() >> 22) + 127, objArr6);
                sb.append(((String) objArr6[0]).intern());
                sb.append(e);
                afErrorLogForExcManagerOnly.AFInAppEventType(intern, sb.toString());
            }
        }
        return str;
    }

    private static String valueOf(Context context) {
        PackageManager packageManager;
        String packageName;
        int i = afRDLog + 53;
        afErrorLog = i % 128;
        if (i % 2 != 0) {
            try {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } catch (PackageManager.NameNotFoundException e) {
                Object[] objArr = new Object[1];
                AFInAppEventParameterName(new int[]{1978675431, 701963988, 1909322667, 1319967164, 6877541, 106671138, -1907967013, -869376005, -572885773, 421267342, 1130715364, -180670615, -393780240, -846411660, -1522003178, 1889174220}, 29 - TextUtils.indexOf("", "", 0, 0), objArr);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr[0]).intern(), e);
                return null;
            }
        } else {
            packageManager = context.getPackageManager();
            packageName = context.getPackageName();
        }
        String str = packageManager.getPackageInfo(packageName, 0).packageName;
        afRDLog = (afErrorLog + 49) % 128;
        return str;
    }

    private static String AFInAppEventParameterName(Context context, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFInAppEventType2 = AFInAppEventType(packageName);
        Object[] objArr = new Object[1];
        AFInAppEventParameterName(new int[]{-948199316, 1869991458}, (ViewConfiguration.getFadingEdgeLength() >> 16) + 1, objArr);
        sb.append(((String) objArr[0]).intern());
        sb2.append(AFInAppEventType2);
        if ((values(context) == null ? (char) 20 : 14) != 20) {
            Object[] objArr2 = new Object[1];
            AFInAppEventParameterName(new int[]{-948199316, 1869991458}, TextUtils.indexOf("", "", 0, 0) + 1, objArr2);
            sb.append(((String) objArr2[0]).intern());
            sb2.append(packageName);
        } else {
            Object[] objArr3 = new Object[1];
            AFInAppEventParameterName(new int[]{-300962695, 2079682246}, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr3);
            sb.append(((String) objArr3[0]).intern());
            sb2.append(packageName);
        }
        String valueOf2 = valueOf(context);
        if ((valueOf2 == null ? 'F' : '^') != '^') {
            afRDLog = (afErrorLog + 5) % 128;
            Object[] objArr4 = new Object[1];
            AFInAppEventParameterName(new int[]{-300962695, 2079682246}, 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr4);
            sb.append(((String) objArr4[0]).intern());
            sb2.append(packageName);
        } else {
            Object[] objArr5 = new Object[1];
            AFInAppEventParameterName(new int[]{-948199316, 1869991458}, 1 - View.getDefaultSize(0, 0), objArr5);
            sb.append(((String) objArr5[0]).intern());
            sb2.append(valueOf2);
        }
        sb2.append(Boolean.TRUE.toString());
        String obj = sb2.toString();
        afErrorLog = (afRDLog + 121) % 128;
        return obj;
    }

    public static final class AFa1xSDK extends HashMap<String, Object> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static char AFInAppEventType = '\u0000';
        private static char afDebugLog = '\u0000';
        private static char[] afErrorLog = null;
        private static int afInfoLog = 1;
        private static int afRDLog;
        private static long valueOf;
        private static int values;
        private final Map<String, Object> AFInAppEventParameterName;
        private final Context AFKeystoreWrapper;

        static {
            AFKeystoreWrapper();
            View.resolveSizeAndState(0, 0, 0);
            View.MeasureSpec.getSize(0);
            KeyEvent.getMaxKeyCode();
            TextUtils.getTrimmedLength("");
            ViewConfiguration.getScrollFriction();
            TextUtils.lastIndexOf("", '0', 0, 0);
            AudioTrack.getMinVolume();
            TypedValue.complexToFraction(0, 0.0f, 0.0f);
            KeyEvent.normalizeMetaState(0);
            ViewConfiguration.getZoomControlsTimeout();
            TextUtils.getOffsetBefore("", 0);
            AudioTrack.getMaxVolume();
            KeyEvent.getModifierMetaStateMask();
            AndroidCharacter.getMirror('0');
            int i = afInfoLog + 69;
            afRDLog = i % 128;
            if ((i % 2 != 0 ? 'J' : 'B') != 'B') {
                throw new ArithmeticException();
            }
        }

        static void AFKeystoreWrapper() {
            values = 1310960211;
            AFInAppEventType = 3266;
            valueOf = -2556690134738949549L;
            afDebugLog = 31060;
            afErrorLog = new char[]{19645, 19708, 19643, 19590, 19626, 19695, 19619, 19616, 19647, 19641, 19629, 19595, 19707, 19592, 19620, 19589, 19632, 19697, 20307, 19623, 19699, 19628, 19630, 19624, 19644, 19631, 19642, 19711, 19625, 19617, 19683, 19621, 19615, 19705, 19684, 19633, 19646, 19597, 19611, 19704, 19687, 19696, 19622, 19591, 19627, 19709, 19689, 19606, 19618};
        }

        public AFa1xSDK(Map<String, Object> map, Context context) {
            this.AFInAppEventParameterName = map;
            this.AFKeystoreWrapper = context;
            put(AFInAppEventType(), AFInAppEventParameterName());
        }

        private static StringBuilder AFKeystoreWrapper(String... strArr) throws Exception {
            ArrayList arrayList = new ArrayList();
            int length = strArr.length;
            for (int i = 0; i < 3; i++) {
                arrayList.add(Integer.valueOf(strArr[i].length()));
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                if ((i2 < intValue ? 7 : 'B') == 'B') {
                    return sb;
                }
                int length2 = strArr.length;
                Integer num = null;
                int i3 = 0;
                while (true) {
                    if ((i3 < 3 ? '=' : 3) != '=') {
                        break;
                    }
                    afInfoLog = (afRDLog + 83) % 128;
                    char charAt = strArr[i3].charAt(i2);
                    if (num == null) {
                        afInfoLog = (afRDLog + 59) % 128;
                    } else {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                    i3++;
                }
                sb.append(Integer.toHexString(num.intValue()));
                i2++;
            }
        }

        private String AFInAppEventType() {
            afInfoLog = (afRDLog + 35) % 128;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                Map<String, Object> map = this.AFInAppEventParameterName;
                Object[] objArr = new Object[1];
                AFInAppEventType((char) (ViewConfiguration.getEdgeSlop() >> 16), "\u0000\u0000\u0000\u0000", "㼇䍮캌ᦿ", "ꗿ觳舠矩⍔쎐豁鲠殆⋑죚", TextUtils.indexOf("", "", 0), objArr);
                String obj = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.AFInAppEventParameterName;
                Object[] objArr2 = new Object[1];
                AFInAppEventType((char) (TextUtils.lastIndexOf("", '0') + 62933), "\u0000\u0000\u0000\u0000", "롆蔊푑烵", "객?㸗莛쑻", 1367673528 + TextUtils.getOffsetBefore("", 0), objArr2);
                String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
                if (obj2 == null) {
                    afRDLog = (afInfoLog + 45) % 128;
                    Object[] objArr3 = new Object[1];
                    AFInAppEventType("-\u0001.\f)\n,$", ((byte) KeyEvent.getModifierMetaStateMask()) + 9, (byte) (TextUtils.getOffsetAfter("", 0) + 104), objArr3);
                    obj2 = ((String) objArr3[0]).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb.toString());
                int length = AFKeystoreWrapper2.length();
                if ((length > 4 ? '1' : 5) != '1') {
                    while (true) {
                        if ((length < 4 ? 28 : '5') == '5') {
                            break;
                        }
                        length++;
                        AFKeystoreWrapper2.append('1');
                        afRDLog = (afInfoLog + 95) % 128;
                    }
                } else {
                    afInfoLog = (afRDLog + 29) % 128;
                    AFKeystoreWrapper2.delete(4, length);
                }
                Object[] objArr4 = new Object[1];
                AFInAppEventType((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 8715), "\u0000\u0000\u0000\u0000", "燂灱ୠ蜢", "᣹ꍼ倶", 1617981809 + Gravity.getAbsoluteGravity(0, 0), objArr4);
                AFKeystoreWrapper2.insert(0, ((String) objArr4[0]).intern());
                return AFKeystoreWrapper2.toString();
            } catch (Exception e) {
                Object[] objArr5 = new Object[1];
                AFInAppEventType((char) (View.resolveSizeAndState(0, 0, 0) + 22041), "\u0000\u0000\u0000\u0000", "㌳౮ᦴ㡖", "훼ሮ鳚槟눩庼럷䮮꽗ᜰ롻ゥ떈咓ꧻ쫒눗⎞룗벀케閤茑돎롯禫妿밋﫳铍酊๷煽쀡壉읝剙", ViewConfiguration.getLongPressTimeout() >> 16, objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFInAppEventType("\u001a\u0018\n\u001c\u0018\u0007+\u0019\u001a\u000e\u0017\u0000\u0015\u0002\f\u000e\u0019+*\u001b \u0004*\u001b\u0012,#\b\u0001\u001c*\u0019'\u0000\u0017\u0007\u0007\u000e/\u000e\u00120", KeyEvent.normalizeMetaState(0) + 42, (byte) (22 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))), objArr6);
                sb2.append(((String) objArr6[0]).intern());
                sb2.append(e);
                AFLogger.afRDLog(sb2.toString());
                Object[] objArr7 = new Object[1];
                AFInAppEventType("*\u001b\u001b'㗸㗸㗸", TextUtils.indexOf("", '0', 0, 0) + 8, (byte) (KeyEvent.normalizeMetaState(0) + 85), objArr7);
                return ((String) objArr7[0]).intern();
            }
        }

        private String AFInAppEventParameterName() {
            String str;
            int i;
            try {
                Map<String, Object> map = this.AFInAppEventParameterName;
                Object[] objArr = new Object[1];
                AFInAppEventType((char) (ViewConfiguration.getPressedStateDuration() >> 16), "\u0000\u0000\u0000\u0000", "㼇䍮캌ᦿ", "ꗿ觳舠矩⍔쎐豁鲠殆⋑죚", Gravity.getAbsoluteGravity(0, 0), objArr);
                String obj = map.get(((String) objArr[0]).intern()).toString();
                Map<String, Object> map2 = this.AFInAppEventParameterName;
                Object[] objArr2 = new Object[1];
                AFInAppEventType("\u0015\u000b\u0005\u0017\u0001\u000e\u0018\u0019\u0012\u0005\u001e$\u0015\u0002㘌", 15 - KeyEvent.getDeadChar(0, 0), (byte) (Drawable.resolveOpacity(0, 0) + 13), objArr2);
                String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
                Object[] objArr3 = new Object[1];
                AFInAppEventType((char) (View.resolveSizeAndState(0, 0, 0) + 22727), "\u0000\u0000\u0000\u0000", "廈ꑶ잽콘", "㰭䕳꧇⛠㨣", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr3);
                String intern = ((String) objArr3[0]).intern();
                Object[] objArr4 = new Object[1];
                AFInAppEventType("\u001e\u0006\u0005'㗷", TextUtils.lastIndexOf("", '0') + 6, (byte) (71 - View.getDefaultSize(0, 0)), objArr4);
                String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(obj2);
                sb.append(replaceAll);
                String AFKeystoreWrapper2 = AFa1aSDK.AFKeystoreWrapper(sb.toString());
                StringBuilder sb2 = new StringBuilder("");
                sb2.append(AFKeystoreWrapper2.substring(0, 16));
                str = sb2.toString();
            } catch (Exception e) {
                Object[] objArr5 = new Object[1];
                AFInAppEventType("\u0017\u0016\u0004\u001c\u000b!\u0018\u001e\u0019\u0016\u0004 \u0015\t\u001c\u0018\u000b-\u0017\u0016\u000e\u001a\t\u001e\u0007\u000e\u000f\u001a/*\u0016\u001a+\u000b\u0018\u001e\u0019\u0016", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 38, (byte) (AndroidCharacter.getMirror('0') + 9), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                AFInAppEventType("\u001a\u0018\n\u001c\u0018\u0007+\u0019\u001a\u000e\u0017\u0000\u0015\u0002\f\u000e\u0019+*\u001b \u0004\t\u0016&\u001f\u0019*#\b\u0001\u001c*\u0019'\u0000\u0017\u0007\u0007\u000e/\u000e\u00120", -16777172 - Color.rgb(0, 0, 0), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 57), objArr6);
                sb3.append(((String) objArr6[0]).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder("");
                Object[] objArr7 = new Object[1];
                AFInAppEventType("\u0002\u001e*\u0017\u0018\u0016\u001d\u0005/\u001f\r&. \u0013(&\u0012", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, (byte) (100 - (Process.myPid() >> 22)), objArr7);
                sb4.append(((String) objArr7[0]).intern());
                str = sb4.toString();
            }
            String str2 = str;
            Context context = this.AFKeystoreWrapper;
            Object[] objArr8 = new Object[1];
            AFInAppEventType((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000\u0000\u0000", "풿漍ጇ㔡", "챌螒骭㋡되ⳁ퓅퀜ꤼ可犀詭纍탋ﰅ⤤骺䟣춞⎭戆ｵ蹢㦂䌫ꋐ㡝ꎲ銟蛛ឬ佢罕៘", 124718548 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr8);
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter(((String) objArr8[0]).intern()));
            int i2 = -2700;
            if (!(registerReceiver == null)) {
                Object[] objArr9 = new Object[1];
                AFInAppEventType((char) (MotionEvent.axisFromString("") + 1), "\u0000\u0000\u0000\u0000", "屜握⳷陣", "ꍤ?媬ދ鿵ꆺ囪ᣮ鞟", MotionEvent.axisFromString("") - 144449187, objArr9);
                i2 = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            } else {
                afInfoLog = (afRDLog + 57) % 128;
            }
            try {
                String str3 = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                if (str3 != null) {
                    afInfoLog = (afRDLog + 107) % 128;
                    Object[] objArr10 = new Object[1];
                    AFInAppEventType("&\u000e㘁", 3 - (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 86), objArr10);
                    if (str3.contains(((String) objArr10[0]).intern())) {
                        i = 1;
                        Context context2 = this.AFKeystoreWrapper;
                        Object[] objArr11 = new Object[1];
                        AFInAppEventType((char) (53617 - TextUtils.indexOf("", '0')), "\u0000\u0000\u0000\u0000", "姀✲爐⿑", "㞘╘郯咿旨犝", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr11);
                        int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                        StringBuilder sb5 = new StringBuilder();
                        Object[] objArr12 = new Object[1];
                        AFInAppEventType((char) (TextUtils.getOffsetBefore("", 0) + 27905), "\u0000\u0000\u0000\u0000", "च旋ǟ摭", "䥎", (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) - 546977014, objArr12);
                        sb5.append(((String) objArr12[0]).intern());
                        sb5.append(i2);
                        Object[] objArr13 = new Object[1];
                        AFInAppEventType((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 54591), "\u0000\u0000\u0000\u0000", "韓푮㽜迕", "ꧦ銉", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr13);
                        sb5.append(((String) objArr13[0]).intern());
                        sb5.append(i);
                        Object[] objArr14 = new Object[1];
                        AFInAppEventType("\f!", TextUtils.getCapsMode("", 0, 0) + 2, (byte) (3 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr14);
                        sb5.append(((String) objArr14[0]).intern());
                        sb5.append(size);
                        Object[] objArr15 = new Object[1];
                        AFInAppEventType((char) (ExpandableListView.getPackedPositionChild(0) + 39618), "\u0000\u0000\u0000\u0000", "嵻ᙗ섞箚", "쟕촿", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr15);
                        sb5.append(((String) objArr15[0]).intern());
                        sb5.append(this.AFInAppEventParameterName.size());
                        String obj3 = sb5.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(str2);
                        sb6.append(C0002AFa1xSDK.AFInAppEventParameterName(obj3));
                        return sb6.toString();
                    }
                }
                afInfoLog = (afRDLog + 111) % 128;
                i = 0;
                Context context22 = this.AFKeystoreWrapper;
                Object[] objArr112 = new Object[1];
                AFInAppEventType((char) (53617 - TextUtils.indexOf("", '0')), "\u0000\u0000\u0000\u0000", "姀✲爐⿑", "㞘╘郯咿旨犝", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr112);
                int size2 = ((SensorManager) context22.getSystemService(((String) objArr112[0]).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                Object[] objArr122 = new Object[1];
                AFInAppEventType((char) (TextUtils.getOffsetBefore("", 0) + 27905), "\u0000\u0000\u0000\u0000", "च旋ǟ摭", "䥎", (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) - 546977014, objArr122);
                sb52.append(((String) objArr122[0]).intern());
                sb52.append(i2);
                Object[] objArr132 = new Object[1];
                AFInAppEventType((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 54591), "\u0000\u0000\u0000\u0000", "韓푮㽜迕", "ꧦ銉", ViewConfiguration.getScrollDefaultDelay() >> 16, objArr132);
                sb52.append(((String) objArr132[0]).intern());
                sb52.append(i);
                Object[] objArr142 = new Object[1];
                AFInAppEventType("\f!", TextUtils.getCapsMode("", 0, 0) + 2, (byte) (3 - View.MeasureSpec.makeMeasureSpec(0, 0)), objArr142);
                sb52.append(((String) objArr142[0]).intern());
                sb52.append(size2);
                Object[] objArr152 = new Object[1];
                AFInAppEventType((char) (ExpandableListView.getPackedPositionChild(0) + 39618), "\u0000\u0000\u0000\u0000", "嵻ᙗ섞箚", "쟕촿", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr152);
                sb52.append(((String) objArr152[0]).intern());
                sb52.append(this.AFInAppEventParameterName.size());
                String obj32 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(str2);
                sb62.append(C0002AFa1xSDK.AFInAppEventParameterName(obj32));
                return sb62.toString();
            } catch (Exception e2) {
                Object[] objArr16 = new Object[1];
                AFInAppEventType((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 28880), "\u0000\u0000\u0000\u0000", "﮳䐲쾃㱰", "ꆝ䢇̓鐝檍崽ܪ煛욿볝涸觗穕쭕줿Ợ", -1 - TextUtils.lastIndexOf("", '0'), objArr16);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e2);
                StringBuilder sb7 = new StringBuilder();
                Object[] objArr17 = new Object[1];
                AFInAppEventType("\u001a\u0018\n\u001c\u0018\u0007+\u0019\u001a\u000e\u0017\u0000\u0015\u0002\f\u000e\u0019+*\u001b \u0004\t\u0016&\u001f\u0019*#\b\u0001\u001c*\u0019'\u0000\u0017\u0007\u0007\u000e/\u000e\u00120", Color.argb(0, 0, 0, 0) + 44, (byte) (57 - View.resolveSize(0, 0)), objArr17);
                sb7.append(((String) objArr17[0]).intern());
                sb7.append(e2);
                AFLogger.afRDLog(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str2);
                Object[] objArr18 = new Object[1];
                AFInAppEventType((char) (AndroidCharacter.getMirror('0') + 53483), "\u0000\u0000\u0000\u0000", "갠䮠᯾ꃑ", "ᙫ爂⻅砧尴帰瀂皨琽娿ጀឈ⥄鱈࡝", View.getDefaultSize(0, 0), objArr18);
                sb8.append(((String) objArr18[0]).intern());
                return sb8.toString();
            }
        }

        /* renamed from: com.appsflyer.internal.AFc1uSDK$AFa1xSDK$AFa1xSDK  reason: collision with other inner class name */
        public static final class C0002AFa1xSDK {
            private static int $10 = 0;
            private static int $11 = 1;
            private static int AFInAppEventParameterName = 803265745;
            private static byte[] AFInAppEventType = {10};
            private static int AFKeystoreWrapper = 1124903538;
            private static int afDebugLog = 1;
            private static int afErrorLog = 0;
            private static short[] valueOf = null;
            private static int values = 1365226287;

            public static String AFInAppEventParameterName(String str) throws Exception {
                afErrorLog = (afDebugLog + 101) % 128;
                String AFInAppEventType2 = AFInAppEventType(values(valueOf(str)));
                afErrorLog = (afDebugLog + 45) % 128;
                return AFInAppEventType2;
            }

            private static byte[] valueOf(String str) throws Exception {
                afDebugLog = (afErrorLog + 79) % 128;
                byte[] bytes = str.getBytes(Charset.defaultCharset());
                int i = afErrorLog + 93;
                afDebugLog = i % 128;
                if ((i % 2 == 0 ? 'A' : '(') == '(') {
                    return bytes;
                }
                throw new ArithmeticException();
            }

            private static byte[] values(byte[] bArr) throws Exception {
                int i = 0;
                while (true) {
                    if (!(i >= bArr.length)) {
                        afErrorLog = (afDebugLog + 27) % 128;
                        bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                        i++;
                    } else {
                        afErrorLog = (afDebugLog + 43) % 128;
                        return bArr;
                    }
                }
            }

            private static String AFInAppEventType(byte[] bArr) throws Exception {
                byte[] bArr2 = bArr;
                StringBuilder sb = new StringBuilder();
                int length = bArr2.length;
                afErrorLog = (afDebugLog + 61) % 128;
                boolean z = false;
                int i = 0;
                while (true) {
                    if ((i < length ? 'T' : 'U') == 'U') {
                        break;
                    }
                    String hexString = Integer.toHexString(bArr2[i]);
                    if (hexString.length() == 1) {
                        StringBuilder sb2 = new StringBuilder();
                        short scrollDefaultDelay = (short) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 125);
                        int pressedStateDuration = ViewConfiguration.getPressedStateDuration();
                        Object[] objArr = new Object[1];
                        AFInAppEventParameterName(scrollDefaultDelay, (pressedStateDuration >> 16) - 2126475227, MotionEvent.axisFromString("") - 35, (ViewConfiguration.getGlobalActionKeyTimeout() > 0 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0 ? 0 : -1)) - 307435849, (byte) (54 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr);
                        sb2.append(((String) objArr[0]).intern());
                        sb2.append(hexString);
                        hexString = sb2.toString();
                    }
                    sb.append(hexString);
                    i++;
                }
                String obj = sb.toString();
                int i2 = afErrorLog + 87;
                afDebugLog = i2 % 128;
                if (i2 % 2 != 0) {
                    z = true;
                }
                if (z) {
                    return obj;
                }
                throw null;
            }

            private static void AFInAppEventParameterName(short s, int i, int i2, int i3, byte b, Object[] objArr) {
                Throwable cause;
                int i4;
                int i5;
                byte[] bArr;
                int i6;
                AFh1xSDK aFh1xSDK = new AFh1xSDK();
                StringBuilder sb = new StringBuilder();
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[1] = Integer.valueOf(values);
                    char c = 0;
                    objArr2[0] = Integer.valueOf(i2);
                    Object obj = AFa1wSDK.onInstallConversionFailureNative.get(33882170);
                    long j = 0;
                    if (obj == null) {
                        obj = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (63769 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))), 305 - (ViewConfiguration.getPressedStateDuration() >> 16), 37 - Color.green(0))).getMethod("o", new Class[]{Integer.TYPE, Integer.TYPE});
                        AFa1wSDK.onInstallConversionFailureNative.put(33882170, obj);
                    }
                    int intValue = ((Integer) ((Method) obj).invoke((Object) null, objArr2)).intValue();
                    boolean z = !(intValue != -1);
                    char c2 = '#';
                    if (!(!z)) {
                        byte[] bArr2 = AFInAppEventType;
                        if (bArr2 != null) {
                            $11 = ($10 + 33) % 128;
                            int length = bArr2.length;
                            byte[] bArr3 = new byte[length];
                            int i7 = 0;
                            while (true) {
                                if ((i7 < length ? 2 : '0') == '0') {
                                    break;
                                }
                                $11 = ($10 + 21) % 128;
                                try {
                                    Object[] objArr3 = new Object[1];
                                    objArr3[c] = Integer.valueOf(bArr2[i7]);
                                    Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(927256342);
                                    if (obj2 == null) {
                                        obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (TextUtils.getTrimmedLength("") + 47725), (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 232, (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 35)).getMethod("q", new Class[]{Integer.TYPE});
                                        AFa1wSDK.onInstallConversionFailureNative.put(927256342, obj2);
                                    }
                                    bArr3[i7] = ((Byte) ((Method) obj2).invoke((Object) null, objArr3)).byteValue();
                                    i7++;
                                    c = 0;
                                    j = 0;
                                } catch (Throwable th) {
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            }
                            bArr2 = bArr3;
                        }
                        if (bArr2 != null) {
                            byte[] bArr4 = AFInAppEventType;
                            try {
                                Object[] objArr4 = new Object[2];
                                objArr4[1] = Integer.valueOf(AFInAppEventParameterName);
                                objArr4[0] = Integer.valueOf(i);
                                Object obj3 = AFa1wSDK.onInstallConversionFailureNative.get(33882170);
                                if (obj3 == null) {
                                    obj3 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (63768 - ExpandableListView.getPackedPositionGroup(0)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 304, 37 - TextUtils.indexOf("", "", 0, 0))).getMethod("o", new Class[]{Integer.TYPE, Integer.TYPE});
                                    AFa1wSDK.onInstallConversionFailureNative.put(33882170, obj3);
                                }
                                intValue = (byte) (((byte) ((int) (((long) bArr4[((Integer) ((Method) obj3).invoke((Object) null, objArr4)).intValue()]) ^ -1606027539218713846L))) + ((int) (((long) values) ^ -1606027539218713846L)));
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th2;
                            }
                        } else {
                            intValue = (short) (((short) ((int) (((long) valueOf[i + ((int) (((long) AFInAppEventParameterName) ^ -1606027539218713846L))]) ^ -1606027539218713846L))) + ((int) (((long) values) ^ -1606027539218713846L)));
                        }
                    }
                    if (intValue > 0) {
                        c2 = 31;
                    }
                    if (c2 == 31) {
                        int i8 = (int) (((long) AFInAppEventParameterName) ^ -1606027539218713846L);
                        if (z) {
                            int i9 = ($10 + 109) % 128;
                            $11 = i9;
                            $10 = (i9 + 109) % 128;
                            i4 = 1;
                        } else {
                            $10 = ($11 + 41) % 128;
                            i4 = 0;
                        }
                        aFh1xSDK.AFInAppEventType = ((i + intValue) - 2) + i8 + i4;
                        int i10 = AFKeystoreWrapper;
                        try {
                            Object[] objArr5 = new Object[4];
                            objArr5[3] = sb;
                            objArr5[2] = Integer.valueOf(i10);
                            objArr5[1] = Integer.valueOf(i3);
                            objArr5[0] = aFh1xSDK;
                            Object obj4 = AFa1wSDK.onInstallConversionFailureNative.get(-202412459);
                            if (obj4 == null) {
                                obj4 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) TextUtils.getTrimmedLength(""), View.getDefaultSize(0, 0) + 73, 37 - (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)))).getMethod("y", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                AFa1wSDK.onInstallConversionFailureNative.put(-202412459, obj4);
                            }
                            ((StringBuilder) ((Method) obj4).invoke((Object) null, objArr5)).append(aFh1xSDK.AFInAppEventParameterName);
                            aFh1xSDK.values = aFh1xSDK.AFInAppEventParameterName;
                            byte[] bArr5 = AFInAppEventType;
                            if (bArr5 != null) {
                                int i11 = $10 + 45;
                                $11 = i11 % 128;
                                if (i11 % 2 == 0) {
                                    i6 = bArr5.length;
                                    bArr = new byte[i6];
                                    i5 = 1;
                                } else {
                                    i6 = bArr5.length;
                                    bArr = new byte[i6];
                                    i5 = 0;
                                }
                                while (i5 < i6) {
                                    bArr[i5] = (byte) ((int) (((long) bArr5[i5]) ^ -1606027539218713846L));
                                    i5++;
                                }
                                bArr5 = bArr;
                            }
                            boolean z2 = bArr5 != null;
                            aFh1xSDK.valueOf = 1;
                            while (true) {
                                if ((aFh1xSDK.valueOf < intValue ? 'c' : '-') != 'c') {
                                    break;
                                }
                                if (z2) {
                                    byte[] bArr6 = AFInAppEventType;
                                    int i12 = aFh1xSDK.AFInAppEventType;
                                    aFh1xSDK.AFInAppEventType = i12 - 1;
                                    aFh1xSDK.AFInAppEventParameterName = (char) (aFh1xSDK.values + (((byte) (((byte) ((int) (((long) bArr6[i12]) ^ -1606027539218713846L))) + s)) ^ b));
                                } else {
                                    short[] sArr = valueOf;
                                    int i13 = aFh1xSDK.AFInAppEventType;
                                    aFh1xSDK.AFInAppEventType = i13 - 1;
                                    aFh1xSDK.AFInAppEventParameterName = (char) (aFh1xSDK.values + (((short) (((short) ((int) (((long) sArr[i13]) ^ -1606027539218713846L))) + s)) ^ b));
                                }
                                sb.append(aFh1xSDK.AFInAppEventParameterName);
                                aFh1xSDK.values = aFh1xSDK.AFInAppEventParameterName;
                                aFh1xSDK.valueOf++;
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 != null) {
                                throw cause3;
                            }
                            throw th3;
                        }
                    }
                    objArr[0] = sb.toString();
                } finally {
                    cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.String] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void AFInAppEventType(char r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, java.lang.Object[] r23) {
            /*
                int r0 = $11
                int r0 = r0 + 55
                int r0 = r0 % 128
                $10 = r0
                if (r21 == 0) goto L_0x0015
                int r0 = r0 + 89
                int r0 = r0 % 128
                $11 = r0
                char[] r0 = r21.toCharArray()
                goto L_0x0017
            L_0x0015:
                r0 = r21
            L_0x0017:
                char[] r0 = (char[]) r0
                if (r20 == 0) goto L_0x0028
                int r1 = $10
                int r1 = r1 + 67
                int r1 = r1 % 128
                $11 = r1
                char[] r1 = r20.toCharArray()
                goto L_0x002a
            L_0x0028:
                r1 = r20
            L_0x002a:
                char[] r1 = (char[]) r1
                r2 = 72
                if (r19 == 0) goto L_0x0033
                r3 = 72
                goto L_0x0035
            L_0x0033:
                r3 = 71
            L_0x0035:
                if (r3 != r2) goto L_0x004c
                int r2 = $11
                int r2 = r2 + 105
                int r2 = r2 % 128
                $10 = r2
                char[] r2 = r19.toCharArray()
                int r3 = $10
                int r3 = r3 + 47
                int r3 = r3 % 128
                $11 = r3
                goto L_0x004e
            L_0x004c:
                r2 = r19
            L_0x004e:
                char[] r2 = (char[]) r2
                com.appsflyer.internal.AFh1wSDK r3 = new com.appsflyer.internal.AFh1wSDK
                r3.<init>()
                int r4 = r1.length
                char[] r5 = new char[r4]
                int r6 = r2.length
                char[] r7 = new char[r6]
                r8 = 0
                java.lang.System.arraycopy(r1, r8, r5, r8, r4)
                java.lang.System.arraycopy(r2, r8, r7, r8, r6)
                char r1 = r5[r8]
                r1 = r1 ^ r18
                char r1 = (char) r1
                r5[r8] = r1
                r1 = 2
                char r2 = r7[r1]
                r4 = r22
                char r4 = (char) r4
                int r2 = r2 + r4
                char r2 = (char) r2
                r7[r1] = r2
                int r2 = r0.length
                char[] r4 = new char[r2]
                r3.valueOf = r8
            L_0x0078:
                int r6 = r3.valueOf
                r9 = 1
                if (r6 >= r2) goto L_0x007f
                r6 = 1
                goto L_0x0080
            L_0x007f:
                r6 = 0
            L_0x0080:
                if (r6 == r9) goto L_0x008a
                java.lang.String r0 = new java.lang.String
                r0.<init>(r4)
                r23[r8] = r0
                return
            L_0x008a:
                java.lang.Object[] r6 = new java.lang.Object[r9]     // Catch:{ all -> 0x0262 }
                r6[r8] = r3     // Catch:{ all -> 0x0262 }
                java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0262 }
                r11 = 1403841572(0x53acec24, float:1.48539231E12)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0262 }
                java.lang.Object r10 = r10.get(r12)     // Catch:{ all -> 0x0262 }
                r12 = 0
                if (r10 != 0) goto L_0x00d5
                r10 = 47725(0xba6d, float:6.6877E-41)
                int r14 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()     // Catch:{ all -> 0x0262 }
                int r14 = r14 >> 24
                int r10 = r10 - r14
                char r10 = (char) r10     // Catch:{ all -> 0x0262 }
                int r14 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x0262 }
                int r14 = r14 >> 8
                int r14 = 233 - r14
                long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0262 }
                int r17 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
                int r15 = r17 + 35
                java.lang.Object r10 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r10, r14, r15)     // Catch:{ all -> 0x0262 }
                java.lang.Class r10 = (java.lang.Class) r10     // Catch:{ all -> 0x0262 }
                java.lang.Class[] r14 = new java.lang.Class[r9]     // Catch:{ all -> 0x0262 }
                java.lang.Class<java.lang.Object> r15 = java.lang.Object.class
                r14[r8] = r15     // Catch:{ all -> 0x0262 }
                java.lang.String r15 = "v"
                java.lang.reflect.Method r10 = r10.getMethod(r15, r14)     // Catch:{ all -> 0x0262 }
                java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0262 }
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0262 }
                r14.put(r11, r10)     // Catch:{ all -> 0x0262 }
            L_0x00d5:
                java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x0262 }
                r11 = 0
                java.lang.Object r6 = r10.invoke(r11, r6)     // Catch:{ all -> 0x0262 }
                java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0262 }
                int r6 = r6.intValue()     // Catch:{ all -> 0x0262 }
                java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ all -> 0x0259 }
                r10[r8] = r3     // Catch:{ all -> 0x0259 }
                java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0259 }
                r15 = -822734967(0xffffffffcef60f89, float:-2.06410662E9)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0259 }
                java.lang.Object r12 = r14.get(r12)     // Catch:{ all -> 0x0259 }
                r13 = 52321(0xcc61, float:7.3317E-41)
                if (r12 != 0) goto L_0x0128
                int r12 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x0259 }
                int r12 = r12 >> 16
                int r12 = r13 - r12
                char r12 = (char) r12     // Catch:{ all -> 0x0259 }
                int r14 = android.view.View.resolveSizeAndState(r8, r8, r8)     // Catch:{ all -> 0x0259 }
                int r14 = 196 - r14
                int r16 = android.graphics.Color.blue(r8)     // Catch:{ all -> 0x0259 }
                int r13 = r16 + 37
                java.lang.Object r12 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r12, r14, r13)     // Catch:{ all -> 0x0259 }
                java.lang.Class r12 = (java.lang.Class) r12     // Catch:{ all -> 0x0259 }
                java.lang.Class[] r13 = new java.lang.Class[r9]     // Catch:{ all -> 0x0259 }
                java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
                r13[r8] = r14     // Catch:{ all -> 0x0259 }
                java.lang.String r14 = "w"
                java.lang.reflect.Method r12 = r12.getMethod(r14, r13)     // Catch:{ all -> 0x0259 }
                java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0259 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0259 }
                r13.put(r14, r12)     // Catch:{ all -> 0x0259 }
            L_0x0128:
                java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x0259 }
                java.lang.Object r10 = r12.invoke(r11, r10)     // Catch:{ all -> 0x0259 }
                java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0259 }
                int r10 = r10.intValue()     // Catch:{ all -> 0x0259 }
                int r12 = r3.valueOf
                int r12 = r12 % 4
                char r12 = r5[r12]
                char r13 = r7[r6]
                r14 = 3
                java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x0250 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0250 }
                r15[r1] = r13     // Catch:{ all -> 0x0250 }
                int r12 = r12 * 32718
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0250 }
                r15[r9] = r12     // Catch:{ all -> 0x0250 }
                r15[r8] = r3     // Catch:{ all -> 0x0250 }
                java.util.Map<java.lang.Integer, java.lang.Object> r12 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0250 }
                r13 = -724967617(0xffffffffd4c9df3f, float:-6.936271E12)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0250 }
                java.lang.Object r11 = r12.get(r11)     // Catch:{ all -> 0x0250 }
                if (r11 != 0) goto L_0x019f
                r11 = 63768(0xf918, float:8.9358E-41)
                int r12 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x0250 }
                int r12 = r12 >> 16
                int r11 = r11 - r12
                char r11 = (char) r11     // Catch:{ all -> 0x0250 }
                r12 = 48
                char r12 = android.text.AndroidCharacter.getMirror(r12)     // Catch:{ all -> 0x0250 }
                int r12 = 353 - r12
                java.lang.String r16 = ""
                int r16 = android.os.Process.getGidForName(r16)     // Catch:{ all -> 0x0250 }
                int r13 = 36 - r16
                java.lang.Object r11 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r11, r12, r13)     // Catch:{ all -> 0x0250 }
                java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x0250 }
                java.lang.Class[] r12 = new java.lang.Class[r14]     // Catch:{ all -> 0x0250 }
                java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
                r12[r8] = r13     // Catch:{ all -> 0x0250 }
                java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0250 }
                r12[r9] = r13     // Catch:{ all -> 0x0250 }
                java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0250 }
                r12[r1] = r13     // Catch:{ all -> 0x0250 }
                java.lang.String r13 = "D"
                java.lang.reflect.Method r11 = r11.getMethod(r13, r12)     // Catch:{ all -> 0x0250 }
                java.util.Map<java.lang.Integer, java.lang.Object> r12 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0250 }
                r13 = -724967617(0xffffffffd4c9df3f, float:-6.936271E12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0250 }
                r12.put(r13, r11)     // Catch:{ all -> 0x0250 }
            L_0x019f:
                java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11     // Catch:{ all -> 0x0250 }
                r12 = 0
                r11.invoke(r12, r15)     // Catch:{ all -> 0x0250 }
                char r11 = r5[r10]
                char r6 = r7[r6]
                java.lang.Object[] r12 = new java.lang.Object[r1]     // Catch:{ all -> 0x0247 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0247 }
                r12[r9] = r6     // Catch:{ all -> 0x0247 }
                int r11 = r11 * 32718
                java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0247 }
                r12[r8] = r6     // Catch:{ all -> 0x0247 }
                java.util.Map<java.lang.Integer, java.lang.Object> r6 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0247 }
                r11 = 1420736580(0x54aeb844, float:6.0033262E12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0247 }
                java.lang.Object r6 = r6.get(r13)     // Catch:{ all -> 0x0247 }
                if (r6 != 0) goto L_0x0207
                int r6 = android.view.ViewConfiguration.getMinimumFlingVelocity()     // Catch:{ all -> 0x0247 }
                int r6 = r6 >> 16
                r13 = 52321(0xcc61, float:7.3317E-41)
                int r13 = r13 - r6
                char r6 = (char) r13     // Catch:{ all -> 0x0247 }
                long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0247 }
                r15 = 0
                int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                int r11 = 197 - r11
                int r13 = android.view.ViewConfiguration.getMaximumFlingVelocity()     // Catch:{ all -> 0x0247 }
                int r13 = r13 >> 16
                int r13 = 37 - r13
                java.lang.Object r6 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r6, r11, r13)     // Catch:{ all -> 0x0247 }
                java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x0247 }
                java.lang.Class[] r11 = new java.lang.Class[r1]     // Catch:{ all -> 0x0247 }
                java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0247 }
                r11[r8] = r13     // Catch:{ all -> 0x0247 }
                java.lang.Class r13 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0247 }
                r11[r9] = r13     // Catch:{ all -> 0x0247 }
                java.lang.String r13 = "B"
                java.lang.reflect.Method r6 = r6.getMethod(r13, r11)     // Catch:{ all -> 0x0247 }
                java.util.Map<java.lang.Integer, java.lang.Object> r11 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0247 }
                r13 = 1420736580(0x54aeb844, float:6.0033262E12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0247 }
                r11.put(r13, r6)     // Catch:{ all -> 0x0247 }
            L_0x0207:
                java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ all -> 0x0247 }
                r11 = 0
                java.lang.Object r6 = r6.invoke(r11, r12)     // Catch:{ all -> 0x0247 }
                java.lang.Character r6 = (java.lang.Character) r6     // Catch:{ all -> 0x0247 }
                char r6 = r6.charValue()     // Catch:{ all -> 0x0247 }
                r7[r10] = r6
                char r6 = r3.AFInAppEventParameterName
                r5[r10] = r6
                int r6 = r3.valueOf
                int r11 = r3.valueOf
                char r11 = r0[r11]
                char r10 = r5[r10]
                r10 = r10 ^ r11
                long r10 = (long) r10
                long r12 = valueOf
                r14 = -2556690134738949549(0xdc84cfde4e23aa53, double:-4.840626320496244E137)
                long r12 = r12 ^ r14
                long r10 = r10 ^ r12
                int r12 = values
                long r12 = (long) r12
                long r12 = r12 ^ r14
                int r13 = (int) r12
                long r12 = (long) r13
                long r10 = r10 ^ r12
                char r12 = AFInAppEventType
                long r12 = (long) r12
                long r12 = r12 ^ r14
                int r13 = (int) r12
                char r12 = (char) r13
                long r12 = (long) r12
                long r10 = r10 ^ r12
                int r11 = (int) r10
                char r10 = (char) r11
                r4[r6] = r10
                int r6 = r3.valueOf
                int r6 = r6 + r9
                r3.valueOf = r6
                goto L_0x0078
            L_0x0247:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x024f
                throw r1
            L_0x024f:
                throw r0
            L_0x0250:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x0258
                throw r1
            L_0x0258:
                throw r0
            L_0x0259:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x0261
                throw r1
            L_0x0261:
                throw r0
            L_0x0262:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x026a
                throw r1
            L_0x026a:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1uSDK.AFa1xSDK.AFInAppEventType(char, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object[]):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:0x039a, code lost:
            if (r3.AFInAppEventType != r3.AFInAppEventParameterName) goto L_0x03ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x039c, code lost:
            $11 = ($10 + 83) % 128;
            r3.afRDLog = ((r3.afRDLog + r1) - 1) % r1;
            r3.afInfoLog = ((r3.afInfoLog + r1) - 1) % r1;
            r7 = r3.AFInAppEventType;
            r8 = r3.afRDLog;
            r10 = r3.AFInAppEventParameterName;
            r15 = r3.afInfoLog;
            r5[r3.AFKeystoreWrapper] = r4[(r7 * r1) + r8];
            r5[r3.AFKeystoreWrapper + 1] = r4[(r10 * r1) + r15];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x03ce, code lost:
            r7 = r3.AFInAppEventType;
            r8 = r3.afInfoLog;
            r9 = r3.AFInAppEventParameterName;
            r10 = r3.afRDLog;
            r5[r3.AFKeystoreWrapper] = r4[(r7 * r1) + r8];
            r5[r3.AFKeystoreWrapper + 1] = r4[(r9 * r1) + r10];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x03f1, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x03f2, code lost:
            r1 = r0.getCause();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x03f6, code lost:
            if (r1 != null) goto L_0x03f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x03f8, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x03f9, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bc, code lost:
            if (r3.valueOf == r3.values) goto L_0x01d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d0, code lost:
            if (r3.valueOf == r3.values) goto L_0x01d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
            r7 = new java.lang.Object[13];
            r7[12] = r3;
            r7[11] = java.lang.Integer.valueOf(r1);
            r7[10] = r3;
            r7[9] = r3;
            r7[8] = java.lang.Integer.valueOf(r1);
            r7[7] = r3;
            r7[6] = r3;
            r7[5] = java.lang.Integer.valueOf(r1);
            r7[4] = r3;
            r7[3] = r3;
            r7[2] = java.lang.Integer.valueOf(r1);
            r7[1] = r3;
            r7[0] = r3;
            r8 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative.get(-1842179489);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x0238, code lost:
            if (r8 != null) goto L_0x02ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x023a, code lost:
            r8 = ((java.lang.Class) com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper((char) android.text.TextUtils.indexOf("", "", 0), 110 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)), android.view.MotionEvent.axisFromString("") + 52)).getMethod("C", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
            com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative.put(-1842179489, r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x02ba, code lost:
            if (((java.lang.Integer) ((java.lang.reflect.Method) r8).invoke((java.lang.Object) null, r7)).intValue() != r3.afInfoLog) goto L_0x0393;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
            r8 = new java.lang.Object[11];
            r8[10] = r3;
            r8[9] = java.lang.Integer.valueOf(r1);
            r8[8] = r3;
            r8[7] = java.lang.Integer.valueOf(r1);
            r8[6] = java.lang.Integer.valueOf(r1);
            r8[5] = r3;
            r8[4] = r3;
            r8[3] = java.lang.Integer.valueOf(r1);
            r8[2] = java.lang.Integer.valueOf(r1);
            r8[1] = r3;
            r8[0] = r3;
            r7 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative.get(-1347559805);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x02fe, code lost:
            if (r7 != null) goto L_0x0366;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x0300, code lost:
            r7 = ((java.lang.Class) com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper((char) (android.text.TextUtils.indexOf("", "", 0) + 23637), android.text.TextUtils.indexOf("", "", 0) + 160, 36 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("z", new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Object.class});
            com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative.put(-1347559805, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x0368, code lost:
            r7 = ((java.lang.Integer) ((java.lang.reflect.Method) r7).invoke((java.lang.Object) null, r8)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0375, code lost:
            r8 = r3.AFInAppEventParameterName;
            r10 = r3.afInfoLog;
            r5[r3.AFKeystoreWrapper] = r4[r7];
            r5[r3.AFKeystoreWrapper + 1] = r4[(r8 * r1) + r10];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x038a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0391, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0392, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void AFInAppEventType(java.lang.String r26, int r27, byte r28, java.lang.Object[] r29) {
            /*
                r0 = r27
                r1 = 2
                if (r26 == 0) goto L_0x001b
                int r2 = $10
                int r2 = r2 + 49
                int r3 = r2 % 128
                $11 = r3
                int r2 = r2 % r1
                if (r2 == 0) goto L_0x0015
                char[] r2 = r26.toCharArray()
                goto L_0x001d
            L_0x0015:
                java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
                r0.<init>()
                throw r0
            L_0x001b:
                r2 = r26
            L_0x001d:
                char[] r2 = (char[]) r2
                com.appsflyer.internal.AFh1zSDK r3 = new com.appsflyer.internal.AFh1zSDK
                r3.<init>()
                char[] r4 = afErrorLog
                r5 = 14
                if (r4 == 0) goto L_0x002d
                r6 = 14
                goto L_0x002f
            L_0x002d:
                r6 = 89
            L_0x002f:
                java.lang.String r7 = "A"
                r10 = -933360548(0xffffffffc85e0c5c, float:-227377.44)
                java.lang.String r11 = ""
                r12 = 0
                r13 = 1
                if (r6 == r5) goto L_0x003c
                goto L_0x011a
            L_0x003c:
                int r5 = r4.length
                char[] r6 = new char[r5]
                r14 = 0
            L_0x0040:
                if (r14 >= r5) goto L_0x0119
                int r15 = $11
                int r15 = r15 + 31
                int r9 = r15 % 128
                $10 = r9
                int r15 = r15 % r1
                if (r15 == 0) goto L_0x0050
                r9 = 93
                goto L_0x0052
            L_0x0050:
                r9 = 27
            L_0x0052:
                r15 = 27
                if (r9 == r15) goto L_0x00b7
                char r9 = r4[r14]
                java.lang.Object[] r15 = new java.lang.Object[r13]     // Catch:{ all -> 0x00ae }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00ae }
                r15[r12] = r9     // Catch:{ all -> 0x00ae }
                java.util.Map<java.lang.Integer, java.lang.Object> r9 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00ae }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00ae }
                java.lang.Object r1 = r9.get(r1)     // Catch:{ all -> 0x00ae }
                if (r1 != 0) goto L_0x009c
                int r1 = android.graphics.Color.blue(r12)     // Catch:{ all -> 0x00ae }
                int r1 = 23637 - r1
                char r1 = (char) r1     // Catch:{ all -> 0x00ae }
                r9 = 48
                int r9 = android.text.TextUtils.lastIndexOf(r11, r9, r12, r12)     // Catch:{ all -> 0x00ae }
                int r9 = r9 + 161
                int r17 = android.os.Process.myPid()     // Catch:{ all -> 0x00ae }
                int r17 = r17 >> 22
                int r8 = 36 - r17
                java.lang.Object r1 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r1, r9, r8)     // Catch:{ all -> 0x00ae }
                java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x00ae }
                java.lang.Class[] r8 = new java.lang.Class[r13]     // Catch:{ all -> 0x00ae }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ae }
                r8[r12] = r9     // Catch:{ all -> 0x00ae }
                java.lang.reflect.Method r1 = r1.getMethod(r7, r8)     // Catch:{ all -> 0x00ae }
                java.util.Map<java.lang.Integer, java.lang.Object> r8 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00ae }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x00ae }
                r8.put(r9, r1)     // Catch:{ all -> 0x00ae }
            L_0x009c:
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x00ae }
                r8 = 0
                java.lang.Object r1 = r1.invoke(r8, r15)     // Catch:{ all -> 0x00ae }
                java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ all -> 0x00ae }
                char r1 = r1.charValue()     // Catch:{ all -> 0x00ae }
                r6[r14] = r1
                int r14 = r14 >>> 1
                goto L_0x010d
            L_0x00ae:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x00b6
                throw r1
            L_0x00b6:
                throw r0
            L_0x00b7:
                char r1 = r4[r14]
                java.lang.Object[] r8 = new java.lang.Object[r13]     // Catch:{ all -> 0x0110 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0110 }
                r8[r12] = r1     // Catch:{ all -> 0x0110 }
                java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0110 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0110 }
                java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0110 }
                if (r1 != 0) goto L_0x00fc
                int r1 = android.view.ViewConfiguration.getTouchSlop()     // Catch:{ all -> 0x0110 }
                r9 = 8
                int r1 = r1 >> r9
                int r1 = r1 + 23637
                char r1 = (char) r1     // Catch:{ all -> 0x0110 }
                int r9 = android.view.KeyEvent.normalizeMetaState(r12)     // Catch:{ all -> 0x0110 }
                int r9 = r9 + 160
                int r15 = android.view.View.getDefaultSize(r12, r12)     // Catch:{ all -> 0x0110 }
                int r15 = r15 + 36
                java.lang.Object r1 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r1, r9, r15)     // Catch:{ all -> 0x0110 }
                java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x0110 }
                java.lang.Class[] r9 = new java.lang.Class[r13]     // Catch:{ all -> 0x0110 }
                java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0110 }
                r9[r12] = r15     // Catch:{ all -> 0x0110 }
                java.lang.reflect.Method r1 = r1.getMethod(r7, r9)     // Catch:{ all -> 0x0110 }
                java.util.Map<java.lang.Integer, java.lang.Object> r9 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0110 }
                java.lang.Integer r15 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0110 }
                r9.put(r15, r1)     // Catch:{ all -> 0x0110 }
            L_0x00fc:
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x0110 }
                r9 = 0
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch:{ all -> 0x0110 }
                java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ all -> 0x0110 }
                char r1 = r1.charValue()     // Catch:{ all -> 0x0110 }
                r6[r14] = r1
                int r14 = r14 + 1
            L_0x010d:
                r1 = 2
                goto L_0x0040
            L_0x0110:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x0118
                throw r1
            L_0x0118:
                throw r0
            L_0x0119:
                r4 = r6
            L_0x011a:
                char r1 = afDebugLog
                java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x0417 }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0417 }
                r5[r12] = r1     // Catch:{ all -> 0x0417 }
                java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0417 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0417 }
                java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0417 }
                if (r1 != 0) goto L_0x0161
                int r1 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ all -> 0x0417 }
                int r1 = r1 >> 16
                int r1 = 23637 - r1
                char r1 = (char) r1     // Catch:{ all -> 0x0417 }
                int r6 = android.text.TextUtils.getTrimmedLength(r11)     // Catch:{ all -> 0x0417 }
                int r6 = 160 - r6
                int r8 = android.view.ViewConfiguration.getTouchSlop()     // Catch:{ all -> 0x0417 }
                r9 = 8
                int r8 = r8 >> r9
                int r8 = 36 - r8
                java.lang.Object r1 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r1, r6, r8)     // Catch:{ all -> 0x0417 }
                java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x0417 }
                java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x0417 }
                java.lang.Class r8 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0417 }
                r6[r12] = r8     // Catch:{ all -> 0x0417 }
                java.lang.reflect.Method r1 = r1.getMethod(r7, r6)     // Catch:{ all -> 0x0417 }
                java.util.Map<java.lang.Integer, java.lang.Object> r6 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0417 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0417 }
                r6.put(r7, r1)     // Catch:{ all -> 0x0417 }
            L_0x0161:
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x0417 }
                r6 = 0
                java.lang.Object r1 = r1.invoke(r6, r5)     // Catch:{ all -> 0x0417 }
                java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ all -> 0x0417 }
                char r1 = r1.charValue()     // Catch:{ all -> 0x0417 }
                char[] r5 = new char[r0]
                int r6 = r0 % 2
                if (r6 == 0) goto L_0x0176
                r6 = 1
                goto L_0x0177
            L_0x0176:
                r6 = 0
            L_0x0177:
                if (r6 == 0) goto L_0x0183
                int r6 = r0 + -1
                char r7 = r2[r6]
                int r7 = r7 - r28
                char r7 = (char) r7
                r5[r6] = r7
                goto L_0x0184
            L_0x0183:
                r6 = r0
            L_0x0184:
                if (r6 <= r13) goto L_0x03fa
                int r7 = $10
                int r7 = r7 + 79
                int r8 = r7 % 128
                $11 = r8
                r8 = 2
                int r7 = r7 % r8
                if (r7 != 0) goto L_0x0194
                r7 = 0
                goto L_0x0195
            L_0x0194:
                r7 = 1
            L_0x0195:
                if (r7 == r13) goto L_0x019a
                r3.AFKeystoreWrapper = r13
                goto L_0x019c
            L_0x019a:
                r3.AFKeystoreWrapper = r12
            L_0x019c:
                int r7 = r3.AFKeystoreWrapper
                if (r7 >= r6) goto L_0x03fa
                int r7 = $11
                int r7 = r7 + 93
                int r8 = r7 % 128
                $10 = r8
                r8 = 2
                int r7 = r7 % r8
                if (r7 == 0) goto L_0x01bf
                int r7 = r3.AFKeystoreWrapper
                char r7 = r2[r7]
                r3.valueOf = r7
                int r7 = r3.AFKeystoreWrapper
                char r7 = r2[r7]
                r3.values = r7
                char r7 = r3.valueOf
                char r8 = r3.values
                if (r7 != r8) goto L_0x01e9
                goto L_0x01d2
            L_0x01bf:
                int r7 = r3.AFKeystoreWrapper
                char r7 = r2[r7]
                r3.valueOf = r7
                int r7 = r3.AFKeystoreWrapper
                int r7 = r7 + r13
                char r7 = r2[r7]
                r3.values = r7
                char r7 = r3.valueOf
                char r8 = r3.values
                if (r7 != r8) goto L_0x01e9
            L_0x01d2:
                int r7 = r3.AFKeystoreWrapper
                char r8 = r3.valueOf
                int r8 = r8 - r28
                char r8 = (char) r8
                r5[r7] = r8
                int r7 = r3.AFKeystoreWrapper
                int r7 = r7 + r13
                char r8 = r3.values
                int r8 = r8 - r28
                char r8 = (char) r8
                r5[r7] = r8
                r14 = 8
                goto L_0x03e9
            L_0x01e9:
                r7 = 13
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x03f1 }
                r8 = 12
                r7[r8] = r3     // Catch:{ all -> 0x03f1 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03f1 }
                r9 = 11
                r7[r9] = r8     // Catch:{ all -> 0x03f1 }
                r8 = 10
                r7[r8] = r3     // Catch:{ all -> 0x03f1 }
                r10 = 9
                r7[r10] = r3     // Catch:{ all -> 0x03f1 }
                java.lang.Integer r14 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03f1 }
                r15 = 8
                r7[r15] = r14     // Catch:{ all -> 0x03f1 }
                r14 = 7
                r7[r14] = r3     // Catch:{ all -> 0x03f1 }
                r15 = 6
                r7[r15] = r3     // Catch:{ all -> 0x03f1 }
                java.lang.Integer r17 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03f1 }
                r18 = 5
                r7[r18] = r17     // Catch:{ all -> 0x03f1 }
                r17 = 4
                r7[r17] = r3     // Catch:{ all -> 0x03f1 }
                r19 = 3
                r7[r19] = r3     // Catch:{ all -> 0x03f1 }
                java.lang.Integer r20 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03f1 }
                r16 = 2
                r7[r16] = r20     // Catch:{ all -> 0x03f1 }
                r7[r13] = r3     // Catch:{ all -> 0x03f1 }
                r7[r12] = r3     // Catch:{ all -> 0x03f1 }
                java.util.Map<java.lang.Integer, java.lang.Object> r9 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x03f1 }
                r21 = -1842179489(0xffffffff9232925f, float:-5.6347313E-28)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x03f1 }
                java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x03f1 }
                if (r8 != 0) goto L_0x02ab
                int r8 = android.text.TextUtils.indexOf(r11, r11, r12)     // Catch:{ all -> 0x03f1 }
                char r8 = (char) r8     // Catch:{ all -> 0x03f1 }
                long r22 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x03f1 }
                r24 = 0
                int r9 = (r22 > r24 ? 1 : (r22 == r24 ? 0 : -1))
                int r9 = 110 - r9
                int r21 = android.view.MotionEvent.axisFromString(r11)     // Catch:{ all -> 0x03f1 }
                int r10 = r21 + 52
                java.lang.Object r8 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r8, r9, r10)     // Catch:{ all -> 0x03f1 }
                java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x03f1 }
                r9 = 13
                java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r12] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r13] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x03f1 }
                r16 = 2
                r9[r16] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r19] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r17] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x03f1 }
                r9[r18] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r15] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r14] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x03f1 }
                r21 = 8
                r9[r21] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r21 = 9
                r9[r21] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r21 = 10
                r9[r21] = r10     // Catch:{ all -> 0x03f1 }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x03f1 }
                r20 = 11
                r9[r20] = r10     // Catch:{ all -> 0x03f1 }
                r10 = 12
                java.lang.Class<java.lang.Object> r21 = java.lang.Object.class
                r9[r10] = r21     // Catch:{ all -> 0x03f1 }
                java.lang.String r10 = "C"
                java.lang.reflect.Method r8 = r8.getMethod(r10, r9)     // Catch:{ all -> 0x03f1 }
                java.util.Map<java.lang.Integer, java.lang.Object> r9 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x03f1 }
                r10 = -1842179489(0xffffffff9232925f, float:-5.6347313E-28)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x03f1 }
                r9.put(r10, r8)     // Catch:{ all -> 0x03f1 }
            L_0x02ab:
                java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x03f1 }
                r9 = 0
                java.lang.Object r7 = r8.invoke(r9, r7)     // Catch:{ all -> 0x03f1 }
                java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x03f1 }
                int r7 = r7.intValue()     // Catch:{ all -> 0x03f1 }
                int r8 = r3.afInfoLog
                if (r7 != r8) goto L_0x0393
                r7 = 11
                java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ all -> 0x038a }
                r7 = 10
                r8[r7] = r3     // Catch:{ all -> 0x038a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x038a }
                r9 = 9
                r8[r9] = r7     // Catch:{ all -> 0x038a }
                r7 = 8
                r8[r7] = r3     // Catch:{ all -> 0x038a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x038a }
                r8[r14] = r7     // Catch:{ all -> 0x038a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x038a }
                r8[r15] = r7     // Catch:{ all -> 0x038a }
                r8[r18] = r3     // Catch:{ all -> 0x038a }
                r8[r17] = r3     // Catch:{ all -> 0x038a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x038a }
                r8[r19] = r7     // Catch:{ all -> 0x038a }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x038a }
                r9 = 2
                r8[r9] = r7     // Catch:{ all -> 0x038a }
                r8[r13] = r3     // Catch:{ all -> 0x038a }
                r8[r12] = r3     // Catch:{ all -> 0x038a }
                java.util.Map<java.lang.Integer, java.lang.Object> r7 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x038a }
                r9 = -1347559805(0xffffffffafadde83, float:-3.162662E-10)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x038a }
                java.lang.Object r7 = r7.get(r9)     // Catch:{ all -> 0x038a }
                if (r7 != 0) goto L_0x0366
                int r7 = android.text.TextUtils.indexOf(r11, r11, r12)     // Catch:{ all -> 0x038a }
                int r7 = r7 + 23637
                char r7 = (char) r7     // Catch:{ all -> 0x038a }
                int r9 = android.text.TextUtils.indexOf(r11, r11, r12)     // Catch:{ all -> 0x038a }
                int r9 = r9 + 160
                int r10 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x038a }
                int r10 = r10 >> 16
                int r10 = 36 - r10
                java.lang.Object r7 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r7, r9, r10)     // Catch:{ all -> 0x038a }
                java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x038a }
                r9 = 11
                java.lang.Class[] r9 = new java.lang.Class[r9]     // Catch:{ all -> 0x038a }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r12] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r13] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038a }
                r16 = 2
                r9[r16] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038a }
                r9[r19] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r17] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r9[r18] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038a }
                r9[r15] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038a }
                r9[r14] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r14 = 8
                r9[r14] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x038a }
                r15 = 9
                r9[r15] = r10     // Catch:{ all -> 0x038a }
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                r15 = 10
                r9[r15] = r10     // Catch:{ all -> 0x038a }
                java.lang.String r10 = "z"
                java.lang.reflect.Method r7 = r7.getMethod(r10, r9)     // Catch:{ all -> 0x038a }
                java.util.Map<java.lang.Integer, java.lang.Object> r9 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x038a }
                r10 = -1347559805(0xffffffffafadde83, float:-3.162662E-10)
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x038a }
                r9.put(r10, r7)     // Catch:{ all -> 0x038a }
                goto L_0x0368
            L_0x0366:
                r14 = 8
            L_0x0368:
                java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch:{ all -> 0x038a }
                r9 = 0
                java.lang.Object r7 = r7.invoke(r9, r8)     // Catch:{ all -> 0x038a }
                java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x038a }
                int r7 = r7.intValue()     // Catch:{ all -> 0x038a }
                int r8 = r3.AFInAppEventParameterName
                int r10 = r3.afInfoLog
                int r15 = r3.AFKeystoreWrapper
                char r7 = r4[r7]
                r5[r15] = r7
                int r7 = r3.AFKeystoreWrapper
                int r7 = r7 + r13
                int r8 = r8 * r1
                int r8 = r8 + r10
                char r8 = r4[r8]
                r5[r7] = r8
                goto L_0x03e9
            L_0x038a:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x0392
                throw r1
            L_0x0392:
                throw r0
            L_0x0393:
                r9 = 0
                r14 = 8
                int r7 = r3.AFInAppEventType
                int r8 = r3.AFInAppEventParameterName
                if (r7 != r8) goto L_0x03ce
                int r7 = $10
                int r7 = r7 + 83
                int r7 = r7 % 128
                $11 = r7
                int r7 = r3.afRDLog
                int r7 = r7 + r1
                int r7 = r7 - r13
                int r7 = r7 % r1
                r3.afRDLog = r7
                int r7 = r3.afInfoLog
                int r7 = r7 + r1
                int r7 = r7 - r13
                int r7 = r7 % r1
                r3.afInfoLog = r7
                int r7 = r3.AFInAppEventType
                int r8 = r3.afRDLog
                int r10 = r3.AFInAppEventParameterName
                int r15 = r3.afInfoLog
                int r9 = r3.AFKeystoreWrapper
                int r7 = r7 * r1
                int r7 = r7 + r8
                char r7 = r4[r7]
                r5[r9] = r7
                int r7 = r3.AFKeystoreWrapper
                int r7 = r7 + r13
                int r10 = r10 * r1
                int r10 = r10 + r15
                char r8 = r4[r10]
                r5[r7] = r8
                goto L_0x03e9
            L_0x03ce:
                int r7 = r3.AFInAppEventType
                int r8 = r3.afInfoLog
                int r9 = r3.AFInAppEventParameterName
                int r10 = r3.afRDLog
                int r15 = r3.AFKeystoreWrapper
                int r7 = r7 * r1
                int r7 = r7 + r8
                char r7 = r4[r7]
                r5[r15] = r7
                int r7 = r3.AFKeystoreWrapper
                int r7 = r7 + r13
                int r9 = r9 * r1
                int r9 = r9 + r10
                char r8 = r4[r9]
                r5[r7] = r8
            L_0x03e9:
                int r7 = r3.AFKeystoreWrapper
                r8 = 2
                int r7 = r7 + r8
                r3.AFKeystoreWrapper = r7
                goto L_0x019c
            L_0x03f1:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x03f9
                throw r1
            L_0x03f9:
                throw r0
            L_0x03fa:
                r1 = 0
            L_0x03fb:
                if (r1 >= r0) goto L_0x0407
                char r2 = r5[r1]
                r2 = r2 ^ 13722(0x359a, float:1.9229E-41)
                char r2 = (char) r2
                r5[r1] = r2
                int r1 = r1 + 1
                goto L_0x03fb
            L_0x0407:
                java.lang.String r0 = new java.lang.String
                r0.<init>(r5)
                int r1 = $11
                int r1 = r1 + 31
                int r1 = r1 % 128
                $10 = r1
                r29[r12] = r0
                return
            L_0x0417:
                r0 = move-exception
                java.lang.Throwable r1 = r0.getCause()
                if (r1 == 0) goto L_0x041f
                throw r1
            L_0x041f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1uSDK.AFa1xSDK.AFInAppEventType(java.lang.String, int, byte, java.lang.Object[]):void");
        }
    }

    private static void AFInAppEventParameterName(int[] iArr, int i, Object[] objArr) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int[] iArr4 = iArr;
        AFh1tSDK aFh1tSDK = new AFh1tSDK();
        char[] cArr = new char[4];
        int i3 = 1;
        char[] cArr2 = new char[(iArr4.length << 1)];
        int[] iArr5 = AFKeystoreWrapper;
        float f = 0.0f;
        int i4 = -1572644106;
        char c = 0;
        if ((iArr5 != null ? (char) 16 : 4) != 4) {
            int i5 = $11 + 51;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = iArr5.length;
                iArr3 = new int[i2];
            } else {
                i2 = iArr5.length;
                iArr3 = new int[i2];
            }
            int i6 = 0;
            while (i6 < i2) {
                $11 = ($10 + 29) % 128;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(iArr5[i6]);
                    Object obj = AFa1wSDK.onInstallConversionFailureNative.get(-1572644106);
                    if (obj == null) {
                        obj = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (63768 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1))), 305 - TextUtils.getTrimmedLength(""), 'U' - AndroidCharacter.getMirror('0'))).getMethod("d", new Class[]{Integer.TYPE});
                        AFa1wSDK.onInstallConversionFailureNative.put(-1572644106, obj);
                    }
                    iArr3[i6] = ((Integer) ((Method) obj).invoke((Object) null, objArr2)).intValue();
                    i6++;
                    c = 0;
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            iArr5 = iArr3;
        }
        int length = iArr5.length;
        int[] iArr6 = new int[length];
        int[] iArr7 = AFKeystoreWrapper;
        if (iArr7 != null) {
            int length2 = iArr7.length;
            int[] iArr8 = new int[length2];
            int i7 = 0;
            while (true) {
                if ((i7 < length2 ? '7' : '8') != '7') {
                    break;
                }
                try {
                    Object[] objArr3 = new Object[i3];
                    objArr3[0] = Integer.valueOf(iArr7[i7]);
                    Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(Integer.valueOf(i4));
                    if (obj2 == null) {
                        obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 63768), (ViewConfiguration.getScrollBarSize() >> 8) + 305, Color.green(0) + 37)).getMethod("d", new Class[]{Integer.TYPE});
                        iArr2 = iArr7;
                        i4 = -1572644106;
                        AFa1wSDK.onInstallConversionFailureNative.put(-1572644106, obj2);
                    } else {
                        iArr2 = iArr7;
                    }
                    iArr8[i7] = ((Integer) ((Method) obj2).invoke((Object) null, objArr3)).intValue();
                    i7++;
                    iArr7 = iArr2;
                    i3 = 1;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            iArr7 = iArr8;
        } else {
            int[] iArr9 = iArr7;
        }
        char c2 = 0;
        System.arraycopy(iArr7, 0, iArr6, 0, length);
        aFh1tSDK.AFInAppEventType = 0;
        while (aFh1tSDK.AFInAppEventType < iArr4.length) {
            int i8 = 16;
            cArr[c2] = (char) (iArr4[aFh1tSDK.AFInAppEventType] >> 16);
            cArr[1] = (char) iArr4[aFh1tSDK.AFInAppEventType];
            cArr[2] = (char) (iArr4[aFh1tSDK.AFInAppEventType + 1] >> 16);
            cArr[3] = (char) iArr4[aFh1tSDK.AFInAppEventType + 1];
            aFh1tSDK.valueOf = (cArr[0] << 16) + cArr[1];
            aFh1tSDK.AFInAppEventParameterName = (cArr[2] << 16) + cArr[3];
            AFh1tSDK.AFKeystoreWrapper(iArr6);
            int i9 = 0;
            while (i9 < i8) {
                $11 = ($10 + 41) % 128;
                aFh1tSDK.valueOf ^= iArr6[i9];
                int values2 = AFh1tSDK.values(aFh1tSDK.valueOf);
                try {
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = aFh1tSDK;
                    objArr4[2] = aFh1tSDK;
                    objArr4[1] = Integer.valueOf(values2);
                    objArr4[0] = aFh1tSDK;
                    Object obj3 = AFa1wSDK.onInstallConversionFailureNative.get(717384304);
                    if (obj3 == null) {
                        obj3 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) ((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 52320), 196 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), Process.getGidForName("") + 38)).getMethod("c", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        AFa1wSDK.onInstallConversionFailureNative.put(717384304, obj3);
                    }
                    int intValue = ((Integer) ((Method) obj3).invoke((Object) null, objArr4)).intValue();
                    aFh1tSDK.valueOf = aFh1tSDK.AFInAppEventParameterName;
                    aFh1tSDK.AFInAppEventParameterName = intValue;
                    i9++;
                    i8 = 16;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th3;
                }
            }
            int i10 = aFh1tSDK.valueOf;
            aFh1tSDK.valueOf = aFh1tSDK.AFInAppEventParameterName;
            aFh1tSDK.AFInAppEventParameterName = i10;
            aFh1tSDK.AFInAppEventParameterName ^= iArr6[16];
            aFh1tSDK.valueOf ^= iArr6[17];
            int i11 = aFh1tSDK.valueOf;
            int i12 = aFh1tSDK.AFInAppEventParameterName;
            cArr[0] = (char) (aFh1tSDK.valueOf >>> 16);
            cArr[1] = (char) aFh1tSDK.valueOf;
            cArr[2] = (char) (aFh1tSDK.AFInAppEventParameterName >>> 16);
            cArr[3] = (char) aFh1tSDK.AFInAppEventParameterName;
            AFh1tSDK.AFKeystoreWrapper(iArr6);
            cArr2[aFh1tSDK.AFInAppEventType << 1] = cArr[0];
            cArr2[(aFh1tSDK.AFInAppEventType << 1) + 1] = cArr[1];
            cArr2[(aFh1tSDK.AFInAppEventType << 1) + 2] = cArr[2];
            cArr2[(aFh1tSDK.AFInAppEventType << 1) + 3] = cArr[3];
            try {
                Object[] objArr5 = new Object[2];
                objArr5[1] = aFh1tSDK;
                objArr5[0] = aFh1tSDK;
                Object obj4 = AFa1wSDK.onInstallConversionFailureNative.get(-39002524);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (52321 - TextUtils.indexOf("", "", 0)), 196 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("b", new Class[]{Object.class, Object.class});
                    AFa1wSDK.onInstallConversionFailureNative.put(-39002524, obj4);
                }
                ((Method) obj4).invoke((Object) null, objArr5);
                c2 = 0;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
                throw th4;
            }
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void valueOf(java.lang.String r19, java.lang.String r20, int[] r21, int r22, java.lang.Object[] r23) {
        /*
            r0 = r19
            r1 = r21
            int r2 = $10
            int r2 = r2 + 79
            int r3 = r2 % 128
            $11 = r3
            r3 = 2
            int r2 = r2 % r3
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x0014
            r2 = 0
            goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            r6 = 0
            if (r2 == 0) goto L_0x031b
            if (r20 == 0) goto L_0x001c
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            if (r2 == r4) goto L_0x0024
            char[] r2 = r20.toCharArray()
            goto L_0x0026
        L_0x0024:
            r2 = r20
        L_0x0026:
            char[] r2 = (char[]) r2
            if (r0 == 0) goto L_0x0030
            java.lang.String r7 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r7)
        L_0x0030:
            byte[] r0 = (byte[]) r0
            com.appsflyer.internal.AFh1ySDK r7 = new com.appsflyer.internal.AFh1ySDK
            r7.<init>()
            char[] r8 = valueOf
            r9 = 48
            java.lang.String r10 = ""
            if (r8 == 0) goto L_0x00c9
            int r11 = $11
            int r11 = r11 + 123
            int r11 = r11 % 128
            $10 = r11
            int r11 = r8.length
            char[] r12 = new char[r11]
            r13 = 0
        L_0x004b:
            if (r13 >= r11) goto L_0x004f
            r14 = 0
            goto L_0x0050
        L_0x004f:
            r14 = 1
        L_0x0050:
            if (r14 == r4) goto L_0x00c8
            int r14 = $11
            int r14 = r14 + 37
            int r14 = r14 % 128
            $10 = r14
            char r14 = r8[r13]
            java.lang.Object[] r15 = new java.lang.Object[r4]     // Catch:{ all -> 0x00bf }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00bf }
            r15[r5] = r14     // Catch:{ all -> 0x00bf }
            java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00bf }
            r16 = 926988223(0x3740b7bf, float:1.14868735E-5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00bf }
            java.lang.Object r3 = r14.get(r3)     // Catch:{ all -> 0x00bf }
            if (r3 != 0) goto L_0x00a3
            r3 = 47725(0xba6d, float:6.6877E-41)
            int r14 = android.text.TextUtils.getOffsetBefore(r10, r5)     // Catch:{ all -> 0x00bf }
            int r3 = r3 - r14
            char r3 = (char) r3     // Catch:{ all -> 0x00bf }
            int r14 = android.text.TextUtils.indexOf(r10, r9)     // Catch:{ all -> 0x00bf }
            int r14 = r14 + 234
            int r17 = android.view.View.getDefaultSize(r5, r5)     // Catch:{ all -> 0x00bf }
            int r9 = r17 + 36
            java.lang.Object r3 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r3, r14, r9)     // Catch:{ all -> 0x00bf }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x00bf }
            java.lang.Class[] r9 = new java.lang.Class[r4]     // Catch:{ all -> 0x00bf }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00bf }
            r9[r5] = r14     // Catch:{ all -> 0x00bf }
            java.lang.String r14 = "h"
            java.lang.reflect.Method r3 = r3.getMethod(r14, r9)     // Catch:{ all -> 0x00bf }
            java.util.Map<java.lang.Integer, java.lang.Object> r9 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00bf }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00bf }
            r9.put(r14, r3)     // Catch:{ all -> 0x00bf }
        L_0x00a3:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x00bf }
            java.lang.Object r3 = r3.invoke(r6, r15)     // Catch:{ all -> 0x00bf }
            java.lang.Character r3 = (java.lang.Character) r3     // Catch:{ all -> 0x00bf }
            char r3 = r3.charValue()     // Catch:{ all -> 0x00bf }
            r12[r13] = r3
            int r13 = r13 + 1
            int r3 = $11
            int r3 = r3 + 69
            int r3 = r3 % 128
            $10 = r3
            r3 = 2
            r9 = 48
            goto L_0x004b
        L_0x00bf:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00c7
            throw r1
        L_0x00c7:
            throw r0
        L_0x00c8:
            r8 = r12
        L_0x00c9:
            int r3 = AFInAppEventParameterName
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0312 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0312 }
            r9[r5] = r3     // Catch:{ all -> 0x0312 }
            java.util.Map<java.lang.Integer, java.lang.Object> r3 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0312 }
            r11 = -1572465360(0xffffffffa2461530, float:-2.684522E-18)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0312 }
            java.lang.Object r3 = r3.get(r12)     // Catch:{ all -> 0x0312 }
            r12 = 0
            if (r3 != 0) goto L_0x0118
            r3 = 48
            int r14 = android.text.TextUtils.lastIndexOf(r10, r3, r5)     // Catch:{ all -> 0x0312 }
            r3 = 63769(0xf919, float:8.936E-41)
            int r14 = r14 + r3
            char r3 = (char) r14     // Catch:{ all -> 0x0312 }
            int r14 = android.text.TextUtils.indexOf(r10, r10)     // Catch:{ all -> 0x0312 }
            int r14 = 305 - r14
            long r15 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0312 }
            int r17 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            int r15 = r17 + 36
            java.lang.Object r3 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r3, r14, r15)     // Catch:{ all -> 0x0312 }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x0312 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0312 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0312 }
            r14[r5] = r15     // Catch:{ all -> 0x0312 }
            java.lang.String r15 = "j"
            java.lang.reflect.Method r3 = r3.getMethod(r15, r14)     // Catch:{ all -> 0x0312 }
            java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0312 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0312 }
            r14.put(r11, r3)     // Catch:{ all -> 0x0312 }
        L_0x0118:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch:{ all -> 0x0312 }
            java.lang.Object r3 = r3.invoke(r6, r9)     // Catch:{ all -> 0x0312 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0312 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0312 }
            boolean r9 = AFInAppEventType
            java.lang.String r11 = "i"
            r14 = -194173915(0xfffffffff46d2425, float:-7.5153043E31)
            if (r9 == 0) goto L_0x0236
            int r1 = r0.length
            r7.AFInAppEventParameterName = r1
            int r1 = r7.AFInAppEventParameterName
            char[] r1 = new char[r1]
            r7.AFKeystoreWrapper = r5
        L_0x0136:
            int r2 = r7.AFKeystoreWrapper
            int r9 = r7.AFInAppEventParameterName
            if (r2 >= r9) goto L_0x013e
            r2 = 1
            goto L_0x013f
        L_0x013e:
            r2 = 0
        L_0x013f:
            if (r2 == r4) goto L_0x0149
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r23[r5] = r0
            return
        L_0x0149:
            int r2 = $10
            int r2 = r2 + 37
            int r9 = r2 % 128
            $11 = r9
            r9 = 2
            int r2 = r2 % r9
            if (r2 != 0) goto L_0x0157
            r2 = 0
            goto L_0x0158
        L_0x0157:
            r2 = 1
        L_0x0158:
            if (r2 == r4) goto L_0x01c5
            int r2 = r7.AFKeystoreWrapper
            int r9 = r7.AFInAppEventParameterName
            int r15 = r7.AFKeystoreWrapper
            int r9 = r9 * r15
            byte r9 = r0[r9]
            int r9 = r9 << r22
            char r9 = r8[r9]
            int r9 = r9 - r3
            char r9 = (char) r9
            r1[r2] = r9
            r2 = 2
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x01bc }
            r9[r4] = r7     // Catch:{ all -> 0x01bc }
            r9[r5] = r7     // Catch:{ all -> 0x01bc }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x01bc }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x01bc }
            java.lang.Object r2 = r2.get(r15)     // Catch:{ all -> 0x01bc }
            if (r2 != 0) goto L_0x01b1
            int r2 = android.view.Gravity.getAbsoluteGravity(r5, r5)     // Catch:{ all -> 0x01bc }
            char r2 = (char) r2     // Catch:{ all -> 0x01bc }
            int r15 = android.os.Process.getGidForName(r10)     // Catch:{ all -> 0x01bc }
            int r15 = r15 + 74
            r12 = 48
            int r13 = android.text.TextUtils.indexOf(r10, r12, r5)     // Catch:{ all -> 0x01bc }
            int r13 = 35 - r13
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r2, r15, r13)     // Catch:{ all -> 0x01bc }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x01bc }
            r13 = 2
            java.lang.Class[] r15 = new java.lang.Class[r13]     // Catch:{ all -> 0x01bc }
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            r15[r5] = r13     // Catch:{ all -> 0x01bc }
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            r15[r4] = r13     // Catch:{ all -> 0x01bc }
            java.lang.reflect.Method r2 = r2.getMethod(r11, r15)     // Catch:{ all -> 0x01bc }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x01bc }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x01bc }
            r13.put(r15, r2)     // Catch:{ all -> 0x01bc }
            goto L_0x01b3
        L_0x01b1:
            r12 = 48
        L_0x01b3:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x01bc }
            r2.invoke(r6, r9)     // Catch:{ all -> 0x01bc }
            r12 = 0
            goto L_0x0136
        L_0x01bc:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01c4
            throw r1
        L_0x01c4:
            throw r0
        L_0x01c5:
            r12 = 48
            int r2 = r7.AFKeystoreWrapper
            int r9 = r7.AFInAppEventParameterName
            int r9 = r9 - r4
            int r13 = r7.AFKeystoreWrapper
            int r9 = r9 - r13
            byte r9 = r0[r9]
            int r9 = r9 + r22
            char r9 = r8[r9]
            int r9 = r9 - r3
            char r9 = (char) r9
            r1[r2] = r9
            r2 = 2
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch:{ all -> 0x022d }
            r9[r4] = r7     // Catch:{ all -> 0x022d }
            r9[r5] = r7     // Catch:{ all -> 0x022d }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x022d }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x022d }
            java.lang.Object r2 = r2.get(r13)     // Catch:{ all -> 0x022d }
            if (r2 != 0) goto L_0x0222
            int r2 = android.view.ViewConfiguration.getLongPressTimeout()     // Catch:{ all -> 0x022d }
            int r2 = r2 >> 16
            char r2 = (char) r2     // Catch:{ all -> 0x022d }
            long r15 = android.view.ViewConfiguration.getZoomControlsTimeout()     // Catch:{ all -> 0x022d }
            r17 = 0
            int r13 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            int r13 = 74 - r13
            int r15 = android.view.View.getDefaultSize(r5, r5)     // Catch:{ all -> 0x022d }
            int r15 = r15 + 36
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r2, r13, r15)     // Catch:{ all -> 0x022d }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x022d }
            r13 = 2
            java.lang.Class[] r15 = new java.lang.Class[r13]     // Catch:{ all -> 0x022d }
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            r15[r5] = r13     // Catch:{ all -> 0x022d }
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            r15[r4] = r13     // Catch:{ all -> 0x022d }
            java.lang.reflect.Method r2 = r2.getMethod(r11, r15)     // Catch:{ all -> 0x022d }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x022d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x022d }
            r13.put(r15, r2)     // Catch:{ all -> 0x022d }
            goto L_0x0224
        L_0x0222:
            r17 = 0
        L_0x0224:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x022d }
            r2.invoke(r6, r9)     // Catch:{ all -> 0x022d }
            r12 = r17
            goto L_0x0136
        L_0x022d:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0235
            throw r1
        L_0x0235:
            throw r0
        L_0x0236:
            boolean r0 = values
            if (r0 == 0) goto L_0x02bd
            int r0 = r2.length
            r7.AFInAppEventParameterName = r0
            int r0 = r7.AFInAppEventParameterName
            char[] r0 = new char[r0]
            r7.AFKeystoreWrapper = r5
        L_0x0243:
            int r1 = r7.AFKeystoreWrapper
            int r9 = r7.AFInAppEventParameterName
            if (r1 >= r9) goto L_0x024b
            r1 = 1
            goto L_0x024c
        L_0x024b:
            r1 = 0
        L_0x024c:
            if (r1 == r4) goto L_0x0256
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r23[r5] = r1
            return
        L_0x0256:
            int r1 = r7.AFKeystoreWrapper
            int r9 = r7.AFInAppEventParameterName
            int r9 = r9 - r4
            int r10 = r7.AFKeystoreWrapper
            int r9 = r9 - r10
            char r9 = r2[r9]
            int r9 = r9 - r22
            char r9 = r8[r9]
            int r9 = r9 - r3
            char r9 = (char) r9
            r0[r1] = r9
            r1 = 2
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x02b4 }
            r9[r4] = r7     // Catch:{ all -> 0x02b4 }
            r9[r5] = r7     // Catch:{ all -> 0x02b4 }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x02b4 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x02b4 }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x02b4 }
            if (r1 != 0) goto L_0x02ae
            int r1 = android.view.View.combineMeasuredStates(r5, r5)     // Catch:{ all -> 0x02b4 }
            char r1 = (char) r1     // Catch:{ all -> 0x02b4 }
            int r10 = android.view.KeyEvent.getModifierMetaStateMask()     // Catch:{ all -> 0x02b4 }
            byte r10 = (byte) r10     // Catch:{ all -> 0x02b4 }
            int r10 = 72 - r10
            float r12 = android.util.TypedValue.complexToFloat(r5)     // Catch:{ all -> 0x02b4 }
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            int r12 = 36 - r12
            java.lang.Object r1 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r1, r10, r12)     // Catch:{ all -> 0x02b4 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x02b4 }
            r10 = 2
            java.lang.Class[] r12 = new java.lang.Class[r10]     // Catch:{ all -> 0x02b4 }
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r12[r5] = r10     // Catch:{ all -> 0x02b4 }
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r12[r4] = r10     // Catch:{ all -> 0x02b4 }
            java.lang.reflect.Method r1 = r1.getMethod(r11, r12)     // Catch:{ all -> 0x02b4 }
            java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x02b4 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x02b4 }
            r10.put(r12, r1)     // Catch:{ all -> 0x02b4 }
        L_0x02ae:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x02b4 }
            r1.invoke(r6, r9)     // Catch:{ all -> 0x02b4 }
            goto L_0x0243
        L_0x02b4:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02bc
            throw r1
        L_0x02bc:
            throw r0
        L_0x02bd:
            int r0 = r1.length
            r7.AFInAppEventParameterName = r0
            int r0 = r7.AFInAppEventParameterName
            char[] r0 = new char[r0]
            r7.AFKeystoreWrapper = r5
        L_0x02c6:
            int r2 = r7.AFKeystoreWrapper
            int r6 = r7.AFInAppEventParameterName
            if (r2 >= r6) goto L_0x030a
            int r2 = $10
            int r2 = r2 + 11
            int r6 = r2 % 128
            $11 = r6
            r6 = 2
            int r2 = r2 % r6
            if (r2 != 0) goto L_0x02da
            r2 = 0
            goto L_0x02db
        L_0x02da:
            r2 = 1
        L_0x02db:
            if (r2 == 0) goto L_0x02f3
            int r2 = r7.AFKeystoreWrapper
            int r9 = r7.AFInAppEventParameterName
            int r9 = r9 - r4
            int r10 = r7.AFKeystoreWrapper
            int r9 = r9 - r10
            r9 = r1[r9]
            int r9 = r9 - r22
            char r9 = r8[r9]
            int r9 = r9 - r3
            char r9 = (char) r9
            r0[r2] = r9
            int r2 = r7.AFKeystoreWrapper
            int r2 = r2 + r4
            goto L_0x0307
        L_0x02f3:
            int r2 = r7.AFKeystoreWrapper
            int r9 = r7.AFInAppEventParameterName
            int r10 = r7.AFKeystoreWrapper
            int r9 = r9 % r10
            r9 = r1[r9]
            int r9 = r9 * r22
            char r9 = r8[r9]
            int r9 = r9 >>> r3
            char r9 = (char) r9
            r0[r2] = r9
            int r2 = r7.AFKeystoreWrapper
            r2 = 0
        L_0x0307:
            r7.AFKeystoreWrapper = r2
            goto L_0x02c6
        L_0x030a:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r23[r5] = r1
            return
        L_0x0312:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x031a
            throw r1
        L_0x031a:
            throw r0
        L_0x031b:
            r6.hashCode()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1uSDK.valueOf(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }
}
