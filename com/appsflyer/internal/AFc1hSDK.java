package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.browser.trusted.sharing.ShareTarget;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import o.Function;
import org.json.JSONObject;

public final class AFc1hSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static String AFInAppEventParameterName = "https://%sonelink.%s/shortlink-sdk/v2";
    private static String AFKeystoreWrapper = "https://%smonitorsdk.%s/remote-debug?app_id=";
    private static int AFLogger$LogLevel = 0;
    private static char AFVersionDeclaration = '\u0000';
    private static char afDebugLog = '\u0000';
    private static char afErrorLog = '\u0000';
    private static char afInfoLog = '\u0000';
    private static int getLevel = 1;
    public static String valueOf = "https://%sgcdsdk.%s/install_data/v5.0/";
    private final AFc1dSDK AFInAppEventType;
    private final AFd1qSDK AFLogger;
    private final AppsFlyerProperties afRDLog;
    private final AFc1vSDK values;

    static void AFInAppEventType() {
        afInfoLog = 27244;
        afErrorLog = 61600;
        AFVersionDeclaration = 65434;
        afDebugLog = 20617;
    }

    static {
        AFInAppEventType();
        int i = AFLogger$LogLevel + 39;
        getLevel = i % 128;
        if (i % 2 == 0) {
            Throwable th = null;
            th.hashCode();
            throw th;
        }
    }

    public AFc1hSDK(AFc1dSDK aFc1dSDK, AFc1vSDK aFc1vSDK, AppsFlyerProperties appsFlyerProperties, AFd1qSDK aFd1qSDK) {
        this.AFInAppEventType = aFc1dSDK;
        this.values = aFc1vSDK;
        this.afRDLog = appsFlyerProperties;
        this.AFLogger = aFd1qSDK;
    }

    public final AFc1eSDK<String> AFKeystoreWrapper(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        sb.append(String.format("https://%sars.%s/api/v2/android/validate_subscription?app_id=", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
        sb.append(this.values.AFInAppEventParameterName.AFInAppEventType.getPackageName());
        String obj = sb.toString();
        try {
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = map;
            Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(538938077);
            if (obj2 == null) {
                obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (ViewConfiguration.getPressedStateDuration() >> 16), 72 - TextUtils.lastIndexOf("", '0'), 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16))).getMethod("AFKeystoreWrapper", new Class[]{Map.class, String.class});
                AFa1wSDK.onInstallConversionFailureNative.put(538938077, obj2);
            }
            AFc1eSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFd1vSDK(obj, (byte[]) ((Method) obj2).invoke((Object) null, objArr), ShareTarget.METHOD_POST, Collections.emptyMap(), true), new AFc1bSDK());
            int i = getLevel + 73;
            AFLogger$LogLevel = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (z) {
                return AFKeystoreWrapper2;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1eSDK<String> valueOf(Map<String, Object> map, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
        sb.append(this.values.AFInAppEventParameterName.AFInAppEventType.getPackageName());
        String obj = sb.toString();
        try {
            Object[] objArr = new Object[2];
            objArr[1] = str;
            objArr[0] = map;
            Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(538938077);
            if (obj2 == null) {
                obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (-1 - ImageFormat.getBitsPerPixel(0)), 74 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 37 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)))).getMethod("AFKeystoreWrapper", new Class[]{Map.class, String.class});
                AFa1wSDK.onInstallConversionFailureNative.put(538938077, obj2);
            }
            AFc1eSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFd1vSDK(obj, (byte[]) ((Method) obj2).invoke((Object) null, objArr), ShareTarget.METHOD_POST, Collections.emptyMap(), true), new AFc1bSDK());
            AFLogger$LogLevel = (getLevel + 21) % 128;
            return AFKeystoreWrapper2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1eSDK<String> AFInAppEventType(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        sb.append(String.format(AFKeystoreWrapper, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
        sb.append(this.values.AFInAppEventParameterName.AFInAppEventType.getPackageName());
        AFc1eSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFd1vSDK(sb.toString(), new JSONObject(map).toString().getBytes(Charset.defaultCharset()), ShareTarget.METHOD_POST, Collections.emptyMap(), false), new AFc1bSDK());
        int i = getLevel + 5;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (z) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    public final AFc1eSDK<AFf1gSDK> AFInAppEventType(boolean z, boolean z2, String str, int i) {
        String str2;
        String str3;
        String str4;
        getLevel = (AFLogger$LogLevel + 67) % 128;
        AFd1qSDK aFd1qSDK = this.AFLogger;
        Intrinsics.checkNotNullParameter(str, "");
        if ((z ? ':' : 20) != ':') {
            str2 = AFd1qSDK.AFInAppEventType;
        } else {
            str2 = AFd1qSDK.AFKeystoreWrapper;
            AFLogger$LogLevel = (getLevel + 55) % 128;
        }
        if (z2) {
            getLevel = (AFLogger$LogLevel + 119) % 128;
            str3 = "stg";
        } else {
            str3 = "";
        }
        Function function = Function.asBinder;
        Object[] objArr = new Object[4];
        if (AFd1qSDK.AFInAppEventType()) {
            str4 = (String) aFd1qSDK.valueOf.getValue();
        } else {
            str4 = "";
        }
        objArr[0] = str4;
        objArr[1] = str3;
        objArr[2] = aFd1qSDK.valueOf();
        objArr[3] = str;
        String format = String.format(str2, Arrays.copyOf(objArr, 4));
        Intrinsics.checkNotNullExpressionValue(format, "");
        AFd1vSDK aFd1vSDK = new AFd1vSDK(format, ShareTarget.METHOD_GET);
        aFd1vSDK.afRDLog = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        return AFKeystoreWrapper(aFd1vSDK, new AFd1uSDK());
    }

    public final AFc1eSDK<String> AFKeystoreWrapper(AFa1rSDK aFa1rSDK, String str, AFc1tSDK aFc1tSDK) {
        try {
            Object[] objArr = new Object[3];
            objArr[2] = aFc1tSDK;
            objArr[1] = str;
            objArr[0] = aFa1rSDK;
            Object obj = AFa1wSDK.onInstallConversionFailureNative.get(1062297095);
            if (obj == null) {
                obj = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 73, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 36)).getMethod("AFInAppEventParameterName", new Class[]{AFa1rSDK.class, String.class, AFc1tSDK.class});
                AFa1wSDK.onInstallConversionFailureNative.put(1062297095, obj);
            }
            AFc1eSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFd1vSDK(aFa1rSDK.afErrorLog, (byte[]) ((Method) obj).invoke((Object) null, objArr), ShareTarget.METHOD_POST, Collections.emptyMap(), aFa1rSDK.AFInAppEventParameterName()), new AFc1bSDK());
            int i = getLevel + 45;
            AFLogger$LogLevel = i % 128;
            if ((i % 2 != 0 ? 'c' : '.') != 'c') {
                return AFKeystoreWrapper2;
            }
            throw new ArithmeticException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final AFc1eSDK<Map<String, Object>> values(String str, String str2) {
        AFc1eSDK<Map<String, Object>> AFKeystoreWrapper2 = AFKeystoreWrapper((AFd1vSDK) AFc1cSDK.valueOf(this.values.AFInAppEventParameterName.AFInAppEventType.getPackageName(), AFb1rSDK.valueOf(new WeakReference(this.values.AFInAppEventParameterName.AFInAppEventType)), str, str2), new AFc1aSDK());
        AFLogger$LogLevel = (getLevel + 59) % 128;
        return AFKeystoreWrapper2;
    }

    public final AFc1eSDK<String> values(AFf1rSDK aFf1rSDK) {
        AFc1eSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFd1vSDK(aFf1rSDK.afErrorLog, aFf1rSDK.values(), ShareTarget.METHOD_POST, Collections.emptyMap(), true), new AFc1bSDK());
        AFLogger$LogLevel = (getLevel + 7) % 128;
        return AFKeystoreWrapper2;
    }

    public final AFc1eSDK<String> values(String str, Map<String, String> map, String str2, UUID uuid, String str3) {
        String obj = uuid.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("ttl", "-1");
        hashMap.put("uuid", obj);
        hashMap.put("data", map);
        hashMap.put("meta", values());
        if (str2 != null) {
            int i = AFLogger$LogLevel + 33;
            getLevel = i % 128;
            char c = i % 2 == 0 ? '*' : 'O';
            hashMap.put("brand_domain", str2);
            if (c == 'O') {
                AFLogger$LogLevel = (getLevel + 31) % 128;
            } else {
                throw new ArithmeticException();
            }
        }
        String jSONObject = AFa1tSDK.AFInAppEventParameterName(hashMap).toString();
        HashMap hashMap2 = new HashMap();
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("뺃뎓ヺ쭺㭝?犙态ࡲ괩ܚ", 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
        hashMap2.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, ShareTarget.METHOD_POST, jSONObject));
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
        sb.append("/");
        sb.append(str);
        return AFInAppEventParameterName(new AFd1vSDK(sb.toString(), jSONObject.getBytes(Charset.defaultCharset()), ShareTarget.METHOD_POST, hashMap2, false), new AFc1bSDK(), true);
    }

    public final AFc1eSDK<Map<String, String>> AFInAppEventType(String str, String str2, UUID uuid, String str3) {
        String str4 = str;
        String str5 = str2;
        String obj = uuid.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
        sb.append("/");
        sb.append(str4);
        sb.append("?id=");
        sb.append(str5);
        String obj2 = sb.toString();
        Map<String, Object> values2 = values();
        String valueOf2 = String.valueOf(values2.get("build_number"));
        HashMap hashMap = new HashMap();
        hashMap.put("Af-UUID", uuid.toString());
        hashMap.put("Af-Meta-Sdk-Ver", valueOf2);
        hashMap.put("Af-Meta-Counter", String.valueOf(values2.get("counter")));
        hashMap.put("Af-Meta-Model", String.valueOf(values2.get("model")));
        hashMap.put("Af-Meta-Platform", String.valueOf(values2.get("platformextension")));
        hashMap.put("Af-Meta-System-Version", String.valueOf(values2.get("sdk")));
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("뺃뎓ヺ쭺㭝?犙态ࡲ괩ܚ", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12, objArr);
        hashMap.put(((String) objArr[0]).intern(), AFKeystoreWrapper(str3, obj, ShareTarget.METHOD_GET, obj, str4, str5, valueOf2));
        AFc1eSDK<Map<String, String>> AFKeystoreWrapper2 = AFKeystoreWrapper(new AFd1vSDK(obj2, (byte[]) null, ShareTarget.METHOD_GET, hashMap, false), new AFd1xSDK());
        AFLogger$LogLevel = (getLevel + 81) % 128;
        return AFKeystoreWrapper2;
    }

    public final AFc1eSDK<String> valueOf(String str) {
        AFd1vSDK aFd1vSDK = new AFd1vSDK(str, (byte[]) null, ShareTarget.METHOD_GET, Collections.emptyMap(), false);
        aFd1vSDK.afRDLog = 10000;
        aFd1vSDK.AFInAppEventParameterName = false;
        AFc1eSDK<String> AFKeystoreWrapper2 = AFKeystoreWrapper(aFd1vSDK, new AFc1bSDK());
        int i = AFLogger$LogLevel + 1;
        getLevel = i % 128;
        if ((i % 2 == 0 ? 25 : '\\') != 25) {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private <T> AFc1eSDK<T> AFKeystoreWrapper(AFd1vSDK aFd1vSDK, AFd1wSDK<T> aFd1wSDK) {
        int i = AFLogger$LogLevel + 89;
        getLevel = i % 128;
        if (!(i % 2 == 0)) {
            AFc1eSDK<T> AFInAppEventParameterName2 = AFInAppEventParameterName(aFd1vSDK, aFd1wSDK, valueOf());
            getLevel = (AFLogger$LogLevel + 3) % 128;
            return AFInAppEventParameterName2;
        }
        AFInAppEventParameterName(aFd1vSDK, aFd1wSDK, valueOf());
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("build_number", "6.11.1");
        hashMap.put("counter", Integer.valueOf(this.values.values.AFInAppEventType("appsFlyerCount", 0)));
        hashMap.put("model", Build.MODEL);
        Object[] objArr = new Object[1];
        AFKeystoreWrapper("榦落綏쒖蘦뉀", 4 - MotionEvent.axisFromString(""), objArr);
        hashMap.put(((String) objArr[0]).intern(), Build.BRAND);
        hashMap.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
        AFc1vSDK aFc1vSDK = this.values;
        hashMap.put("app_version_name", AFa1bSDK.values(aFc1vSDK.AFInAppEventParameterName.AFInAppEventType, aFc1vSDK.AFInAppEventParameterName.AFInAppEventType.getPackageName()));
        hashMap.put("app_id", this.values.AFInAppEventParameterName.AFInAppEventType.getPackageName());
        hashMap.put("platformextension", new AFb1vSDK().AFInAppEventParameterName());
        int i = getLevel + 43;
        AFLogger$LogLevel = i % 128;
        if ((i % 2 != 0 ? 'R' : '@') != 'R') {
            return hashMap;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private static String AFKeystoreWrapper(String str, String str2, String... strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        boolean z = true;
        arrayList.add(1, "v2");
        String AFInAppEventType2 = AFa1aSDK.AFInAppEventType((String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String valueOf2 = AFa1aSDK.valueOf(AFInAppEventType2, sb.toString());
        int i = getLevel + 111;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            z = false;
        }
        if (!z) {
            return valueOf2;
        }
        throw null;
    }

    private boolean valueOf() {
        AFLogger$LogLevel = (getLevel + 93) % 128;
        if ((!this.afRDLog.getBoolean(AppsFlyerProperties.HTTP_CACHE, true) ? '2' : '@') == '@') {
            return false;
        }
        getLevel = (AFLogger$LogLevel + 123) % 128;
        return true;
    }

    private <T> AFc1eSDK<T> AFInAppEventParameterName(AFd1vSDK aFd1vSDK, AFd1wSDK<T> aFd1wSDK, boolean z) {
        aFd1vSDK.AFKeystoreWrapper = z;
        AFc1dSDK aFc1dSDK = this.AFInAppEventType;
        AFc1eSDK<T> aFc1eSDK = new AFc1eSDK<>(aFd1vSDK, aFc1dSDK.values, aFc1dSDK.valueOf, aFd1wSDK);
        getLevel = (AFLogger$LogLevel + 111) % 128;
        return aFc1eSDK;
    }

    private static void AFKeystoreWrapper(String str, int i, Object[] objArr) {
        int i2;
        Throwable cause;
        int i3 = $11 + 59;
        $10 = i3 % 128;
        int i4 = 2;
        Object obj = null;
        if (i3 % 2 == 0) {
            char[] cArr = (char[]) (str != null ? str.toCharArray() : str);
            AFg1bSDK aFg1bSDK = new AFg1bSDK();
            char[] cArr2 = new char[cArr.length];
            aFg1bSDK.values = 0;
            char[] cArr3 = new char[2];
            while (true) {
                if (aFg1bSDK.values >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                int i5 = i;
                int i6 = $10 + 35;
                $11 = i6 % 128;
                if (i6 % i4 == 0) {
                    cArr3[1] = cArr[aFg1bSDK.values];
                    int i7 = aFg1bSDK.values;
                    cArr3[0] = cArr[0];
                    i2 = 1;
                } else {
                    cArr3[0] = cArr[aFg1bSDK.values];
                    cArr3[1] = cArr[aFg1bSDK.values + 1];
                    i2 = 0;
                }
                int i8 = 58224;
                while (true) {
                    if ((i2 < 16 ? '0' : 'W') != '0') {
                        break;
                    }
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    AFg1bSDK aFg1bSDK2 = aFg1bSDK;
                    char c3 = (char) ((int) (((long) afInfoLog) ^ -4811251968381114924L));
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(AFVersionDeclaration);
                        objArr2[i4] = Integer.valueOf(c2 >>> 5);
                        objArr2[1] = Integer.valueOf((c2 + i8) ^ ((c2 << 4) + c3));
                        objArr2[0] = Integer.valueOf(c);
                        Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(537658797);
                        if (obj2 == null) {
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[i4] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (TextUtils.getCapsMode("", 0, 0) + 5147), 342 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Process.getGidForName("") + 38)).getMethod("l", clsArr);
                            AFa1wSDK.onInstallConversionFailureNative.put(537658797, obj2);
                        }
                        char charValue = ((Character) ((Method) obj2).invoke((Object) null, objArr2)).charValue();
                        cArr3[1] = charValue;
                        char c4 = cArr3[0];
                        char c5 = (char) ((int) (((long) afErrorLog) ^ -4811251968381114924L));
                        try {
                            Object[] objArr3 = new Object[4];
                            objArr3[3] = Integer.valueOf(afDebugLog);
                            objArr3[2] = Integer.valueOf(charValue >>> 5);
                            objArr3[1] = Integer.valueOf(((charValue << 4) + c5) ^ (charValue + i8));
                            objArr3[0] = Integer.valueOf(c4);
                            Object obj3 = AFa1wSDK.onInstallConversionFailureNative.get(537658797);
                            if (obj3 == null) {
                                obj3 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (TextUtils.indexOf("", "", 0) + 5147), (Process.myTid() >> 22) + 342, ExpandableListView.getPackedPositionChild(0) + 38)).getMethod("l", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                AFa1wSDK.onInstallConversionFailureNative.put(537658797, obj3);
                            }
                            cArr3[0] = ((Character) ((Method) obj3).invoke((Object) null, objArr3)).charValue();
                            i8 -= 40503;
                            i2++;
                            aFg1bSDK = aFg1bSDK2;
                            i4 = 2;
                            obj = null;
                        } catch (Throwable th) {
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } finally {
                        cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                    }
                }
                cArr2[aFg1bSDK.values] = cArr3[0];
                cArr2[aFg1bSDK.values + 1] = cArr3[1];
                try {
                    Object[] objArr4 = new Object[i4];
                    objArr4[1] = aFg1bSDK;
                    objArr4[0] = aFg1bSDK;
                    Object obj4 = AFa1wSDK.onInstallConversionFailureNative.get(-1282540758);
                    if (obj4 == null) {
                        Class[] clsArr2 = new Class[i4];
                        clsArr2[0] = Object.class;
                        clsArr2[1] = Object.class;
                        obj4 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (-1 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf("", '0') + 74, 36 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).getMethod("n", clsArr2);
                        AFa1wSDK.onInstallConversionFailureNative.put(-1282540758, obj4);
                    }
                    ((Method) obj4).invoke(obj, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        } else {
            throw null;
        }
    }
}
