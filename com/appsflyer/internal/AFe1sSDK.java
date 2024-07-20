package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;

public final class AFe1sSDK extends AFe1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AppsFlyer2dXConversionCallback = 1365226326;
    private static int afErrorLogForExcManagerOnly = 1913545010;
    private static byte[] init = {-93, -85, 80, -78, 77};
    private static int onAppOpenAttributionNative = 1798096156;
    private static short[] onInstallConversionDataLoadedNative = null;
    private static int onInstallConversionFailureNative = 0;
    private static int onResponseNative = 1;
    private final String AFLogger$LogLevel;
    private final AFc1vSDK AFVersionDeclaration;
    private final AFc1tSDK getLevel;

    public AFe1sSDK(String str, AFc1pSDK aFc1pSDK) {
        super(new AFe1iSDK(aFc1pSDK.init().AFInAppEventType), aFc1pSDK, str);
        this.AFVersionDeclaration = aFc1pSDK.AFKeystoreWrapper();
        this.getLevel = aFc1pSDK.init();
        this.AFLogger$LogLevel = str;
    }

    public final void values() {
        super.values();
        AFd1tSDK<Result> aFd1tSDK = this.afInfoLog;
        boolean z = false;
        if (!(aFd1tSDK == null)) {
            int i = onInstallConversionFailureNative + 51;
            onResponseNative = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (z) {
                aFd1tSDK.isSuccessful();
                Throwable th = null;
                th.hashCode();
                throw th;
            } else if (!(!aFd1tSDK.isSuccessful())) {
                afErrorLogForExcManagerOnly();
                onResponseNative = (onInstallConversionFailureNative + 1) % 128;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void valueOf(AFa1rSDK aFa1rSDK) {
        AFa1rSDK aFa1rSDK2 = aFa1rSDK;
        onResponseNative = (onInstallConversionFailureNative + 117) % 128;
        super.valueOf(aFa1rSDK);
        Context context = this.getLevel.AFInAppEventType;
        AFa1dSDK valueOf = AFa1dSDK.valueOf();
        if (context != null) {
            boolean z = true;
            if (!valueOf.AFInAppEventType()) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                    aFa1rSDK2.values("app_version_code", Integer.toString(packageInfo.versionCode));
                    aFa1rSDK2.values("app_version_name", packageInfo.versionName);
                    aFa1rSDK2.values("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
                    aFa1rSDK2.values("installDate", AFa1dSDK.AFInAppEventParameterName(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Exception while collecting application version info.", th);
                }
                valueOf.values(context, (Map<String, ? super String>) aFa1rSDK.AFInAppEventType());
                String AFInAppEventParameterName = AFa1dSDK.AFInAppEventParameterName();
                if (AFInAppEventParameterName != null) {
                    int i = onResponseNative + 113;
                    onInstallConversionFailureNative = i % 128;
                    boolean z2 = i % 2 != 0;
                    aFa1rSDK2.values("appUserId", AFInAppEventParameterName);
                    if (z2) {
                        throw null;
                    }
                }
                try {
                    aFa1rSDK2.values("model", Build.MODEL);
                    Object[] objArr = new Object[1];
                    valueOf((short) (1 - (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1))), View.combineMeasuredStates(0, 0) - 592564792, -94 - TextUtils.lastIndexOf("", '0', 0, 0), (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) - 980645301, (byte) (87 - View.resolveSize(0, 0)), objArr);
                    aFa1rSDK2.values(((String) objArr[0]).intern(), Build.BRAND);
                } catch (Throwable th2) {
                    AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
                }
                if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) ? 12 : 'P') != 'P') {
                    aFa1rSDK2.values(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                }
                AFa1eSDK AFInAppEventParameterName2 = AFa1fSDK.AFInAppEventParameterName(context.getContentResolver());
                if ((AFInAppEventParameterName2 != null ? ':' : 22) == ':') {
                    int i2 = onResponseNative + 83;
                    onInstallConversionFailureNative = i2 % 128;
                    if (i2 % 2 == 0) {
                        aFa1rSDK2.values("amazon_aid", AFInAppEventParameterName2.AFKeystoreWrapper);
                        aFa1rSDK2.values("amazon_aid_limit", String.valueOf(AFInAppEventParameterName2.valueOf));
                    } else {
                        aFa1rSDK2.values("amazon_aid", AFInAppEventParameterName2.AFKeystoreWrapper);
                        aFa1rSDK2.values("amazon_aid_limit", String.valueOf(AFInAppEventParameterName2.valueOf));
                        throw null;
                    }
                }
                String string = AppsFlyerProperties.getInstance().getString("advertiserId");
                if (string != null) {
                    int i3 = onInstallConversionFailureNative + 29;
                    onResponseNative = i3 % 128;
                    if (i3 % 2 != 0) {
                        aFa1rSDK2.values("advertiserId", string);
                    } else {
                        aFa1rSDK2.values("advertiserId", string);
                        throw null;
                    }
                }
                aFa1rSDK2.values("devkey", this.afErrorLog.valueOf);
                aFa1rSDK2.values("uid", AFb1rSDK.valueOf(new WeakReference(context)));
                aFa1rSDK2.values("af_gcm_token", this.AFLogger$LogLevel);
                aFa1rSDK2.values("launch_counter", Integer.toString(this.afWarnLog.AFInAppEventType("appsFlyerCount", 0)));
                aFa1rSDK2.values("sdk", Integer.toString(Build.VERSION.SDK_INT));
                String AFInAppEventType = this.AFVersionDeclaration.AFInAppEventType();
                if (AFInAppEventType != null) {
                    z = false;
                }
                if (!z) {
                    onInstallConversionFailureNative = (onResponseNative + 67) % 128;
                    aFa1rSDK2.values(AppsFlyerProperties.CHANNEL, AFInAppEventType);
                    return;
                }
                return;
            }
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            throw new IllegalStateException("CustomerUserId not set, register is not sent");
        }
        throw new IllegalStateException("Context is not provided, can't send register request");
    }

    /* access modifiers changed from: protected */
    public final boolean afErrorLog() {
        int i = (onInstallConversionFailureNative + 77) % 128;
        onResponseNative = i;
        onInstallConversionFailureNative = (i + 55) % 128;
        return false;
    }

    private void afErrorLogForExcManagerOnly() {
        onInstallConversionFailureNative = (onResponseNative + 119) % 128;
        this.afWarnLog.values("sentRegisterRequestToAF", true);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        int i = onResponseNative + 1;
        onInstallConversionFailureNative = i % 128;
        if ((i % 2 != 0 ? 1 : 'D') == 1) {
            throw null;
        }
    }

    private static void valueOf(short s, int i, int i2, int i3, byte b, Object[] objArr) {
        Throwable cause;
        char c;
        AFh1xSDK aFh1xSDK = new AFh1xSDK();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = new Object[2];
            objArr2[1] = Integer.valueOf(AppsFlyer2dXConversionCallback);
            objArr2[0] = Integer.valueOf(i2);
            Object obj = AFa1wSDK.onInstallConversionFailureNative.get(33882170);
            if (obj == null) {
                obj = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (63768 - View.getDefaultSize(0, 0)), Color.green(0) + 305, 37 - TextUtils.getOffsetBefore("", 0))).getMethod("o", new Class[]{Integer.TYPE, Integer.TYPE});
                AFa1wSDK.onInstallConversionFailureNative.put(33882170, obj);
            }
            int intValue = ((Integer) ((Method) obj).invoke((Object) null, objArr2)).intValue();
            boolean z = intValue == -1;
            if ((z ? 'M' : 14) == 'M') {
                byte[] bArr = init;
                if (bArr != null) {
                    $11 = ($10 + 81) % 128;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i4 = 0;
                    while (i4 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i4])};
                            Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(927256342);
                            if (obj2 == null) {
                                obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (TextUtils.lastIndexOf("", '0', 0) + 47726), View.MeasureSpec.makeMeasureSpec(0, 0) + 233, 35 - ExpandableListView.getPackedPositionChild(0))).getMethod("q", new Class[]{Integer.TYPE});
                                AFa1wSDK.onInstallConversionFailureNative.put(927256342, obj2);
                            }
                            bArr2[i4] = ((Byte) ((Method) obj2).invoke((Object) null, objArr3)).byteValue();
                            i4++;
                        } catch (Throwable th) {
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = init;
                    try {
                        Object[] objArr4 = new Object[2];
                        objArr4[1] = Integer.valueOf(afErrorLogForExcManagerOnly);
                        objArr4[0] = Integer.valueOf(i);
                        Object obj3 = AFa1wSDK.onInstallConversionFailureNative.get(33882170);
                        if (obj3 == null) {
                            obj3 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (View.MeasureSpec.getMode(0) + 63768), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 305, Drawable.resolveOpacity(0, 0) + 37)).getMethod("o", new Class[]{Integer.TYPE, Integer.TYPE});
                            AFa1wSDK.onInstallConversionFailureNative.put(33882170, obj3);
                        }
                        intValue = (byte) (((byte) ((int) (((long) bArr3[((Integer) ((Method) obj3).invoke((Object) null, objArr4)).intValue()]) ^ -1606027539218713846L))) + ((int) (((long) AppsFlyer2dXConversionCallback) ^ -1606027539218713846L)));
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 != null) {
                            throw cause2;
                        }
                        throw th2;
                    }
                } else {
                    intValue = (short) (((short) ((int) (((long) onInstallConversionDataLoadedNative[i + ((int) (((long) afErrorLogForExcManagerOnly) ^ -1606027539218713846L))]) ^ -1606027539218713846L))) + ((int) (((long) AppsFlyer2dXConversionCallback) ^ -1606027539218713846L)));
                }
            }
            if ((intValue > 0 ? ';' : 'H') != 'H') {
                aFh1xSDK.AFInAppEventType = ((i + intValue) - 2) + ((int) (((long) afErrorLogForExcManagerOnly) ^ -1606027539218713846L)) + ((z ? '?' : ']') != ']' ? 1 : 0);
                int i5 = onAppOpenAttributionNative;
                try {
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = sb;
                    objArr5[2] = Integer.valueOf(i5);
                    objArr5[1] = Integer.valueOf(i3);
                    objArr5[0] = aFh1xSDK;
                    Object obj4 = AFa1wSDK.onInstallConversionFailureNative.get(-202412459);
                    if (obj4 == null) {
                        obj4 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 73 - View.MeasureSpec.getSize(0), TextUtils.indexOf("", "", 0) + 36)).getMethod("y", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                        AFa1wSDK.onInstallConversionFailureNative.put(-202412459, obj4);
                    }
                    ((StringBuilder) ((Method) obj4).invoke((Object) null, objArr5)).append(aFh1xSDK.AFInAppEventParameterName);
                    aFh1xSDK.values = aFh1xSDK.AFInAppEventParameterName;
                    byte[] bArr4 = init;
                    if (bArr4 != null) {
                        int i6 = ($10 + 109) % 128;
                        $11 = i6;
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        $10 = (i6 + 67) % 128;
                        for (int i7 = 0; i7 < length2; i7++) {
                            $10 = ($11 + 91) % 128;
                            bArr5[i7] = (byte) ((int) (((long) bArr4[i7]) ^ -1606027539218713846L));
                        }
                        bArr4 = bArr5;
                    }
                    boolean z2 = bArr4 != null;
                    aFh1xSDK.valueOf = 1;
                    while (aFh1xSDK.valueOf < intValue) {
                        if (z2) {
                            int i8 = $10 + 113;
                            $11 = i8 % 128;
                            if (i8 % 2 == 0) {
                                byte[] bArr6 = init;
                                int i9 = aFh1xSDK.AFInAppEventType;
                                aFh1xSDK.AFInAppEventType = i9 + 1;
                                c = (char) (aFh1xSDK.values >>> (((byte) (((byte) ((int) (((long) bArr6[i9]) / -1606027539218713846L))) << s)) ^ b));
                            } else {
                                byte[] bArr7 = init;
                                int i10 = aFh1xSDK.AFInAppEventType;
                                aFh1xSDK.AFInAppEventType = i10 - 1;
                                c = (char) (aFh1xSDK.values + (((byte) (((byte) ((int) (((long) bArr7[i10]) ^ -1606027539218713846L))) + s)) ^ b));
                            }
                            aFh1xSDK.AFInAppEventParameterName = c;
                        } else {
                            short[] sArr = onInstallConversionDataLoadedNative;
                            int i11 = aFh1xSDK.AFInAppEventType;
                            aFh1xSDK.AFInAppEventType = i11 - 1;
                            aFh1xSDK.AFInAppEventParameterName = (char) (aFh1xSDK.values + (((short) (((short) ((int) (((long) sArr[i11]) ^ -1606027539218713846L))) + s)) ^ b));
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
