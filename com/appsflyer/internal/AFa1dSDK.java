package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFVersionDeclaration;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFa1gSDK;
import com.appsflyer.internal.AFa1uSDK;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFc1ySDK;
import com.appsflyer.internal.AFe1wSDK;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.NetworkInterface;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFa1dSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static AppsFlyerInAppPurchaseValidatorListener AFInAppEventType = null;
    public static final String AFKeystoreWrapper;
    private static AFa1dSDK afInfoLog = new AFa1dSDK();
    private static String afRDLog = "https://%sstats.%s/stats";
    private static char[] onAppOpenAttribution = null;
    private static boolean onAttributionFailure = false;
    private static int onConversionDataFail = 0;
    private static int onResponseError = 1;
    private static boolean onValidateInApp;
    private static int onValidateInAppFailure = ((onResponseError + 119) % 128);
    static final String valueOf = "248";
    public static final String values;
    public volatile AppsFlyerConversionListener AFInAppEventParameterName = null;
    private long AFLogger = -1;
    private long AFLogger$LogLevel = TimeUnit.SECONDS.toMillis(5);
    private String AFVersionDeclaration;
    private boolean AppsFlyer2dXConversionCallback;
    String afDebugLog;
    public AFb1eSDK afErrorLog;
    private boolean afErrorLogForExcManagerOnly = false;
    private long afWarnLog = -1;
    private Map<Long, String> getLevel;
    private boolean init;
    private final AFb1vSDK onAppOpenAttributionNative = new AFb1vSDK();
    private String onAttributionFailureNative;
    private Map<String, Object> onConversionDataSuccess;
    private final AFc1wSDK onDeepLinking;
    private boolean onDeepLinkingNative = false;
    private boolean onInstallConversionDataLoadedNative = false;
    private Application onInstallConversionFailureNative;
    private final Executor onResponse = Executors.newSingleThreadExecutor();
    private SharedPreferences onResponseErrorNative;
    private AFb1dSDK onResponseNative;

    static void AFKeystoreWrapper() {
        onConversionDataFail = -448549057;
        onAttributionFailure = true;
        onAppOpenAttribution = new char[]{44944, 44949, 44958, 44931, 44936, 44940, 44948, 44930, 44943, 44864, 44945, 44929, 44941, 44947, 44907, 44932, 44946, 44951, 44915, 44877};
        onValidateInApp = true;
    }

    static /* synthetic */ void AFInAppEventType(AFa1dSDK aFa1dSDK) {
        onResponseError = (onValidateInAppFailure + 63) % 128;
        aFa1dSDK.afWarnLog();
        onValidateInAppFailure = (onResponseError + 73) % 128;
    }

    static /* synthetic */ boolean AFKeystoreWrapper(AFa1dSDK aFa1dSDK, boolean z) {
        int i = onValidateInAppFailure + 119;
        onResponseError = i % 128;
        boolean z2 = i % 2 == 0;
        aFa1dSDK.onInstallConversionDataLoadedNative = z;
        if (!z2) {
            return z;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    static /* synthetic */ long valueOf(AFa1dSDK aFa1dSDK, long j) {
        int i = onValidateInAppFailure + 11;
        onResponseError = i % 128;
        char c = i % 2 == 0 ? 14 : ';';
        aFa1dSDK.afWarnLog = j;
        if (c == ';') {
            return j;
        }
        throw new ArithmeticException();
    }

    static /* synthetic */ Application valueOf(AFa1dSDK aFa1dSDK) {
        int i = onResponseError + 123;
        onValidateInAppFailure = i % 128;
        boolean z = i % 2 == 0;
        Application application = aFa1dSDK.onInstallConversionFailureNative;
        if (z) {
            return application;
        }
        throw null;
    }

    static /* synthetic */ void valueOf(AFa1dSDK aFa1dSDK, AFa1rSDK aFa1rSDK) {
        onResponseError = (onValidateInAppFailure + 125) % 128;
        aFa1dSDK.AFInAppEventParameterName(aFa1rSDK);
        onValidateInAppFailure = (onResponseError + 71) % 128;
    }

    static /* synthetic */ Map values(AFa1dSDK aFa1dSDK) {
        int i = onResponseError;
        onValidateInAppFailure = (i + 93) % 128;
        Map<String, Object> map = aFa1dSDK.onConversionDataSuccess;
        onValidateInAppFailure = (i + 29) % 128;
        return map;
    }

    static {
        AFKeystoreWrapper();
        Object[] objArr = new Object[1];
        values((String) null, "", (int[]) null, TextUtils.lastIndexOf("", '0', 0, 0) + 128, objArr);
        String substring = "6.11.1".substring(0, "6.11.1".lastIndexOf(((String) objArr[0]).intern()));
        AFKeystoreWrapper = substring;
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("/androidevent?buildnumber=6.11.1&app_id=");
        values = sb.toString();
    }

    public final AFc1pSDK values() {
        int i = onResponseError;
        onValidateInAppFailure = (i + 57) % 128;
        AFc1wSDK aFc1wSDK = this.onDeepLinking;
        int i2 = i + 41;
        onValidateInAppFailure = i2 % 128;
        if ((i2 % 2 != 0 ? 9 : '/') == '/') {
            return aFc1wSDK;
        }
        throw null;
    }

    public AFa1dSDK() {
        AFVersionDeclaration.init();
        this.onDeepLinking = new AFc1wSDK();
        AFd1mSDK level = values().getLevel();
        level.valueOf.add(new AFa1ySDK(this, (byte) 0));
    }

    public static AFa1dSDK valueOf() {
        int i = (onValidateInAppFailure + 45) % 128;
        onResponseError = i;
        AFa1dSDK aFa1dSDK = afInfoLog;
        int i2 = i + 89;
        onValidateInAppFailure = i2 % 128;
        if ((i2 % 2 != 0 ? 'M' : '_') == '_') {
            return aFa1dSDK;
        }
        throw null;
    }

    @Deprecated
    public final void performOnAppAttribution(Context context, URI uri) {
        int i = onValidateInAppFailure;
        int i2 = i + 83;
        onResponseError = i2 % 128;
        Throwable th = null;
        if (i2 % 2 != 0) {
            if (!(uri == null)) {
                int i3 = i + 113;
                onResponseError = i3 % 128;
                if ((i3 % 2 == 0 ? 'C' : '.') == 'C') {
                    throw th;
                } else if (!uri.toString().isEmpty()) {
                    if (context == null) {
                        AFb1nSDK onResponseErrorNative2 = values().onResponseErrorNative();
                        StringBuilder sb = new StringBuilder("Context is \"");
                        sb.append(context);
                        sb.append("\"");
                        onResponseErrorNative2.AFKeystoreWrapper(sb.toString(), DeepLinkResult.Error.NETWORK);
                        return;
                    }
                    values().onResponseErrorNative().AFKeystoreWrapper(context, (Map<String, Object>) new HashMap(), Uri.parse(uri.toString()));
                    return;
                }
            }
            AFb1nSDK onResponseErrorNative3 = values().onResponseErrorNative();
            StringBuilder sb2 = new StringBuilder("Link is \"");
            sb2.append(uri);
            sb2.append("\"");
            onResponseErrorNative3.AFKeystoreWrapper(sb2.toString(), DeepLinkResult.Error.NETWORK);
            onValidateInAppFailure = (onResponseError + 47) % 128;
            return;
        }
        th.hashCode();
        throw th;
    }

    @Deprecated
    public final void setSharingFilter(String... strArr) {
        int i = onValidateInAppFailure + 69;
        onResponseError = i % 128;
        char c = i % 2 == 0 ? 'G' : 21;
        setSharingFilterForPartners(strArr);
        if (c != 'G') {
            int i2 = onValidateInAppFailure + 103;
            onResponseError = i2 % 128;
            boolean z = false;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (z) {
                Throwable th = null;
                th.hashCode();
                throw th;
            }
            return;
        }
        throw new ArithmeticException();
    }

    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = onResponseError + 115;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? 12 : '\\') != '\\') {
            String[] strArr = new String[1];
            strArr[1] = "all";
            setSharingFilterForPartners(strArr);
        } else {
            setSharingFilterForPartners("all");
        }
        onResponseError = (onValidateInAppFailure + 111) % 128;
    }

    public final void setSharingFilterForPartners(String... strArr) {
        this.afErrorLog = new AFb1eSDK(strArr);
        int i = onValidateInAppFailure + 105;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 1 : '.') == 1) {
            throw new ArithmeticException();
        }
    }

    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        int i = onValidateInAppFailure + 59;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? '3' : '[') == '[') {
            AFb1nSDK onResponseErrorNative2 = values().onResponseErrorNative();
            onResponseErrorNative2.valueOf = str;
            onResponseErrorNative2.AFInAppEventParameterName = map;
            return;
        }
        AFb1nSDK onResponseErrorNative3 = values().onResponseErrorNative();
        onResponseErrorNative3.valueOf = str;
        onResponseErrorNative3.AFInAppEventParameterName = map;
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener) {
        onResponseError = (onValidateInAppFailure + 89) % 128;
        subscribeForDeepLink(deepLinkListener, TimeUnit.SECONDS.toMillis(3));
        onValidateInAppFailure = (onResponseError + 69) % 128;
    }

    public final void performOnDeepLinking(Intent intent, Context context) {
        int i = onResponseError;
        int i2 = i + 5;
        onValidateInAppFailure = i2 % 128;
        if (i2 % 2 != 0) {
            throw new ArithmeticException();
        } else if (intent == null) {
            values().onResponseErrorNative().AFKeystoreWrapper("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
        } else {
            boolean z = false;
            if (context != null) {
                Context applicationContext = context.getApplicationContext();
                AFInAppEventType(applicationContext);
                values().valueOf().execute(new AFa1dSDK$$ExternalSyntheticLambda4(this, applicationContext, intent));
                return;
            }
            int i3 = i + 23;
            onValidateInAppFailure = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (z) {
                values().onResponseErrorNative().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            } else {
                values().onResponseErrorNative().AFKeystoreWrapper("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
                throw new ArithmeticException();
            }
        }
    }

    public final void addPushNotificationDeepLinkPath(String... strArr) {
        int i = onValidateInAppFailure + 105;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 'D' : 'E') == 'E') {
            List asList = Arrays.asList(strArr);
            List<List<String>> list = values().onResponseErrorNative().AFInAppEventType;
            if (!list.contains(asList)) {
                list.add(asList);
            }
            onResponseError = (onValidateInAppFailure + 41) % 128;
            return;
        }
        values().onResponseErrorNative().AFInAppEventType.contains(Arrays.asList(strArr));
        throw new ArithmeticException();
    }

    public final void setDisableAdvertisingIdentifiers(boolean z) {
        boolean z2;
        AFLogger.afDebugLog("setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z)));
        if ((!z ? 'M' : '4') != '4') {
            onResponseError = (onValidateInAppFailure + 125) % 128;
            z2 = true;
        } else {
            z2 = false;
        }
        AFa1fSDK.AFInAppEventType = Boolean.valueOf(z2);
        AppsFlyerProperties.getInstance().remove("advertiserIdEnabled");
        AppsFlyerProperties.getInstance().remove("advertiserId");
        onValidateInAppFailure = (onResponseError + 75) % 128;
    }

    public final void setDisableNetworkData(boolean z) {
        int i = onValidateInAppFailure + 45;
        onResponseError = i % 128;
        Throwable th = null;
        if (i % 2 != 0) {
            AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
            AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
            int i2 = onResponseError + 91;
            onValidateInAppFailure = i2 % 128;
            if ((i2 % 2 != 0 ? 'c' : 'a') != 'a') {
                th.hashCode();
                throw th;
            }
            return;
        }
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        AFInAppEventType(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        throw th;
    }

    public final void AFInAppEventType(Context context, Intent intent) {
        if (intent.getStringExtra("appsflyer_preinstall") != null) {
            values(intent.getStringExtra("appsflyer_preinstall"));
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String stringExtra = intent.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra)));
        if ((stringExtra != null ? 'V' : 'T') != 'T') {
            int i = onResponseError + 105;
            onValidateInAppFailure = i % 128;
            if (i % 2 == 0) {
                AFKeystoreWrapper(context).AFKeystoreWrapper("referrer", stringExtra);
                AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
                instance.set("AF_REFERRER", stringExtra);
                instance.AFInAppEventType = stringExtra;
                if ((AppsFlyerProperties.getInstance().AFKeystoreWrapper() ? '%' : '?') != '?') {
                    AFLogger.afInfoLog("onReceive: isLaunchCalled");
                    AFInAppEventParameterName(context, AFf1vSDK.onReceive);
                    values(context, stringExtra);
                    onValidateInAppFailure = (onResponseError + 113) % 128;
                    return;
                }
                return;
            }
            AFKeystoreWrapper(context).AFKeystoreWrapper("referrer", stringExtra);
            AppsFlyerProperties instance2 = AppsFlyerProperties.getInstance();
            instance2.set("AF_REFERRER", stringExtra);
            instance2.AFInAppEventType = stringExtra;
            AppsFlyerProperties.getInstance().AFKeystoreWrapper();
            Throwable th = null;
            th.hashCode();
            throw th;
        }
    }

    private static void values(JSONObject jSONObject) {
        int i;
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject.keys();
        while (true) {
            i = 0;
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(keys.next()));
                while (i < jSONArray.length()) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                    i++;
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext()) {
                int i2 = onResponseError + 65;
                onValidateInAppFailure = i2 % 128;
                if (i2 % 2 == 0) {
                    if (str != null) {
                        break loop2;
                    }
                    String next = keys2.next();
                    try {
                        JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                        onValidateInAppFailure = (onResponseError + 35) % 128;
                        int i3 = 0;
                        while (true) {
                            if ((i3 < jSONArray2.length() ? '9' : '8') != '9') {
                                continue;
                                break;
                            }
                            if (!(jSONArray2.getLong(i3) != ((Long) arrayList.get(0)).longValue())) {
                                break;
                            }
                            int i4 = onValidateInAppFailure + 29;
                            onResponseError = i4 % 128;
                            if (i4 % 2 != 0) {
                                if (jSONArray2.getLong(i3) == ((Long) arrayList.get(1)).longValue()) {
                                    break;
                                }
                            } else {
                                if (jSONArray2.getLong(i3) == ((Long) arrayList.get(1)).longValue()) {
                                    break;
                                }
                            }
                            if (jSONArray2.getLong(i3) == ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                break;
                            }
                            i3++;
                            str = next;
                        }
                    } catch (JSONException e2) {
                        AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                    }
                } else {
                    throw null;
                }
            }
            break loop2;
        }
        if (str != null) {
            i = 1;
        }
        if (i == 1) {
            onResponseError = (onValidateInAppFailure + 105) % 128;
            jSONObject.remove(str);
        }
    }

    public final void valueOf(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = AFInAppEventParameterName(context).getString("extraReferrers", (String) null);
            if (string == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(string);
                if (jSONObject2.has(str)) {
                    jSONArray2 = new JSONArray((String) jSONObject2.get(str));
                } else {
                    jSONArray2 = new JSONArray();
                    onValidateInAppFailure = (onResponseError + 59) % 128;
                }
                JSONObject jSONObject3 = jSONObject2;
                jSONArray = jSONArray2;
                jSONObject = jSONObject3;
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if ((((long) jSONObject.length()) >= 4 ? 11 : '%') == 11) {
                values(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            AFKeystoreWrapper(context).AFKeystoreWrapper("extraReferrers", jSONObject.toString());
            int i = onValidateInAppFailure + 113;
            onResponseError = i % 128;
            if ((i % 2 == 0 ? '6' : '$') == '6') {
                throw new ArithmeticException();
            }
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    public final void stop(boolean z, Context context) {
        onValidateInAppFailure = (onResponseError + 95) % 128;
        AFInAppEventType(context);
        values().AppsFlyer2dXConversionCallback().AFInAppEventParameterName = z;
        values().onInstallConversionDataLoadedNative().AFInAppEventParameterName();
        if (z) {
            onResponseError = (onValidateInAppFailure + 35) % 128;
            AFKeystoreWrapper(context).values("is_stop_tracking_used", true);
            onResponseError = (onValidateInAppFailure + 55) % 128;
        }
    }

    public final String getSdkVersion() {
        AFc1pSDK aFc1pSDK;
        int i = onResponseError + 9;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? ';' : 'H') != 'H') {
            aFc1pSDK = values();
            aFc1pSDK.afErrorLogForExcManagerOnly().AFKeystoreWrapper("getSdkVersion", new String[0]);
        } else {
            aFc1pSDK = values();
            aFc1pSDK.afErrorLogForExcManagerOnly().AFKeystoreWrapper("getSdkVersion", new String[0]);
        }
        aFc1pSDK.AFKeystoreWrapper();
        return AFc1vSDK.AFKeystoreWrapper();
    }

    public final void onPause(Context context) {
        onResponseError = (onValidateInAppFailure + 61) % 128;
        values().onAttributionFailureNative().AFInAppEventType(context);
        onValidateInAppFailure = (onResponseError + 101) % 128;
    }

    public final void updateServerUninstallToken(Context context, String str) {
        AFInAppEventType(context);
        AFe1jSDK aFe1jSDK = new AFe1jSDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.afWarnLog("[register] Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.afInfoLog("[register] Firebase Refreshed Token = ".concat(String.valueOf(str)));
        AFe1fSDK valueOf2 = aFe1jSDK.valueOf();
        if (valueOf2 == null || !str.equals(valueOf2.values)) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = valueOf2 == null || currentTimeMillis - valueOf2.AFInAppEventParameterName > TimeUnit.SECONDS.toMillis(2);
            AFe1fSDK aFe1fSDK = new AFe1fSDK(str, currentTimeMillis, !z);
            aFe1jSDK.values.AFKeystoreWrapper("afUninstallToken", aFe1fSDK.values);
            aFe1jSDK.values.AFInAppEventType("afUninstallToken_received_time", aFe1fSDK.AFInAppEventParameterName);
            aFe1jSDK.values.values("afUninstallToken_queued", aFe1fSDK.AFInAppEventType());
            if (z) {
                AFe1jSDK.AFInAppEventParameterName(str);
            }
        }
    }

    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        int i = (onResponseError + 57) % 128;
        onValidateInAppFailure = i;
        if (!z) {
            logLevel = AFLogger.LogLevel.NONE;
        } else {
            int i2 = i + 3;
            onResponseError = i2 % 128;
            if ((i2 % 2 == 0 ? 22 : 'K') == 'K') {
                logLevel = AFLogger.LogLevel.DEBUG;
            } else {
                AFLogger.LogLevel logLevel2 = AFLogger.LogLevel.DEBUG;
                Throwable th = null;
                th.hashCode();
                throw th;
            }
        }
        setLogLevel(logLevel);
    }

    public final void setOaidData(String str) {
        int i = onValidateInAppFailure + 125;
        onResponseError = i % 128;
        if (!(i % 2 == 0)) {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setOaidData", str);
        } else {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setOaidData", str);
        }
        AFa1fSDK.AFInAppEventParameterName = str;
        onValidateInAppFailure = (onResponseError + 73) % 128;
    }

    public final void setAndroidIdData(String str) {
        int i = onValidateInAppFailure + 125;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 19 : ';') != 19) {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setAndroidIdData", str);
        } else {
            AFb1uSDK afErrorLogForExcManagerOnly2 = values().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[1] = str;
            afErrorLogForExcManagerOnly2.AFKeystoreWrapper("setAndroidIdData", strArr);
        }
        this.afDebugLog = str;
    }

    private static void AFInAppEventType(String str, String str2) {
        int i = onResponseError + 17;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? '!' : 'E') != '!') {
            AppsFlyerProperties.getInstance().set(str, str2);
            return;
        }
        AppsFlyerProperties.getInstance().set(str, str2);
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private static void AFInAppEventType(String str, boolean z) {
        int i = onResponseError + 47;
        onValidateInAppFailure = i % 128;
        boolean z2 = false;
        if (!(i % 2 != 0)) {
            AppsFlyerProperties.getInstance().set(str, z);
            int i2 = onResponseError + 43;
            onValidateInAppFailure = i2 % 128;
            if (i2 % 2 != 0) {
                z2 = true;
            }
            if (z2) {
                throw null;
            }
            return;
        }
        AppsFlyerProperties.getInstance().set(str, z);
        throw new ArithmeticException();
    }

    private static String AFInAppEventParameterName(String str) {
        onResponseError = (onValidateInAppFailure + 117) % 128;
        String string = AppsFlyerProperties.getInstance().getString(str);
        onResponseError = (onValidateInAppFailure + 15) % 128;
        return string;
    }

    private static boolean values(String str, boolean z) {
        onValidateInAppFailure = (onResponseError + 11) % 128;
        boolean z2 = AppsFlyerProperties.getInstance().getBoolean(str, z);
        onResponseError = (onValidateInAppFailure + 49) % 128;
        return z2;
    }

    public final boolean AFInAppEventType() {
        int i = onValidateInAppFailure + 97;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 'B' : 'X') == 'X' ? values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) : !(!values(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false))) {
            if (AFInAppEventParameterName() == null) {
                int i2 = onValidateInAppFailure + 67;
                onResponseError = i2 % 128;
                return i2 % 2 != 0;
            }
        }
        return false;
    }

    public final void waitForCustomerUserId(boolean z) {
        onValidateInAppFailure = (onResponseError + 79) % 128;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        onResponseError = (onValidateInAppFailure + 63) % 128;
    }

    public final void setCustomerIdAndLogSession(String str, Context context) {
        boolean z = false;
        if (!(context != null)) {
            return;
        }
        if (AFInAppEventType()) {
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
            AFInAppEventParameterName(context, AFf1vSDK.setCustomerIdAndLogSession);
            String str2 = values().AppsFlyer2dXConversionCallback().valueOf;
            if (referrer == null) {
                referrer = "";
            }
            String str3 = referrer;
            if ((context instanceof Activity ? 'b' : 13) == 'b') {
                onResponseError = (onValidateInAppFailure + 53) % 128;
                ((Activity) context).getIntent();
            }
            valueOf(context, (String) null, (Map<String, Object>) null, str3, (String) null);
            int i = onResponseError + 19;
            onValidateInAppFailure = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                throw null;
            }
            return;
        }
        setCustomerUserId(str);
        AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public final String getOutOfStore(Context context) {
        int i = onResponseError + 113;
        onValidateInAppFailure = i % 128;
        ? r3 = 0;
        if ((i % 2 != 0 ? 30 : '0') == '0') {
            String string = AppsFlyerProperties.getInstance().getString("api_store_value");
            if (string != null) {
                onResponseError = (onValidateInAppFailure + 31) % 128;
                return string;
            }
            String AFKeystoreWrapper2 = AFKeystoreWrapper(context, "AF_STORE");
            if (!(AFKeystoreWrapper2 != null)) {
                AFLogger.afInfoLog("No out-of-store value set");
                return r3;
            }
            int i2 = onValidateInAppFailure + 39;
            onResponseError = i2 % 128;
            if (i2 % 2 != 0) {
                return AFKeystoreWrapper2;
            }
            r3.hashCode();
            throw r3;
        }
        AppsFlyerProperties.getInstance().getString("api_store_value");
        r3.hashCode();
        throw r3;
    }

    public final void setOutOfStore(String str) {
        int i = (onValidateInAppFailure + 45) % 128;
        onResponseError = i;
        if ((str != null ? '(' : '.') != '(') {
            AFLogger.valueOf("Cannot set setOutOfStore with null");
            return;
        }
        int i2 = i + 7;
        onValidateInAppFailure = i2 % 128;
        int i3 = i2 % 2;
        String lowerCase = str.toLowerCase(Locale.getDefault());
        AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
        AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003b, code lost:
        if ((r7 != null ? 'T' : 6) != 'T') goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r7 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if ((!r7.equals(com.appsflyer.AppsFlyerProperties.getInstance().getString(com.appsflyer.AppsFlyerProperties.ONELINK_ID)) ? '>' : ' ') != ' ') goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_DOMAIN);
        com.appsflyer.AppsFlyerProperties.getInstance().remove("onelinkVersion");
        com.appsflyer.AppsFlyerProperties.getInstance().remove(com.appsflyer.AppsFlyerProperties.ONELINK_SCHEME);
        onResponseError = (onValidateInAppFailure + 37) % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0094, code lost:
        AFInAppEventType(com.appsflyer.AppsFlyerProperties.ONELINK_ID, r7);
        onResponseError = (onValidateInAppFailure + 35) % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAppInviteOneLink(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = onResponseError
            int r0 = r0 + 41
            int r1 = r0 % 128
            onValidateInAppFailure = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r3 = "oneLinkSlug"
            java.lang.String r4 = "setAppInviteOneLink = "
            java.lang.String r5 = "setAppInviteOneLink"
            if (r0 == r2) goto L_0x003e
            com.appsflyer.internal.AFc1pSDK r0 = r6.values()
            com.appsflyer.internal.AFb1uSDK r0 = r0.afErrorLogForExcManagerOnly()
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r1] = r7
            r0.AFKeystoreWrapper(r5, r2)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r4.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            r0 = 84
            if (r7 == 0) goto L_0x003a
            r1 = 84
            goto L_0x003b
        L_0x003a:
            r1 = 6
        L_0x003b:
            if (r1 == r0) goto L_0x005a
            goto L_0x0071
        L_0x003e:
            com.appsflyer.internal.AFc1pSDK r0 = r6.values()
            com.appsflyer.internal.AFb1uSDK r0 = r0.afErrorLogForExcManagerOnly()
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r1] = r7
            r0.AFKeystoreWrapper(r5, r2)
            java.lang.String r0 = java.lang.String.valueOf(r7)
            java.lang.String r0 = r4.concat(r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            if (r7 == 0) goto L_0x0071
        L_0x005a:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r3)
            boolean r0 = r7.equals(r0)
            r1 = 32
            if (r0 != 0) goto L_0x006d
            r0 = 62
            goto L_0x006f
        L_0x006d:
            r0 = 32
        L_0x006f:
            if (r0 == r1) goto L_0x0094
        L_0x0071:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkDomain"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkVersion"
            r0.remove(r1)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "onelinkScheme"
            r0.remove(r1)
            int r0 = onValidateInAppFailure
            int r0 = r0 + 37
            int r0 = r0 % 128
            onResponseError = r0
        L_0x0094:
            AFInAppEventType((java.lang.String) r3, (java.lang.String) r7)
            int r7 = onValidateInAppFailure
            int r7 = r7 + 35
            int r7 = r7 % 128
            onResponseError = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.setAppInviteOneLink(java.lang.String):void");
    }

    public final void setAdditionalData(Map<String, Object> map) {
        int i = onValidateInAppFailure + 11;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? '(' : ' ') != ' ') {
            Throwable th = null;
            th.hashCode();
            throw th;
        } else if (map != null) {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            onResponseError = (onValidateInAppFailure + 67) % 128;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01af A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendPushNotificationData(android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "c"
            java.lang.String r2 = "pid"
            java.lang.String r3 = "sendPushNotificationData"
            r4 = 1
            r5 = 0
            r6 = 2
            if (r17 == 0) goto L_0x0047
            int r7 = onValidateInAppFailure
            int r7 = r7 + 39
            int r7 = r7 % 128
            onResponseError = r7
            android.content.Intent r7 = r17.getIntent()
            if (r7 == 0) goto L_0x0047
            com.appsflyer.internal.AFc1pSDK r7 = r16.values()
            com.appsflyer.internal.AFb1uSDK r7 = r7.afErrorLogForExcManagerOnly()
            java.lang.String[] r8 = new java.lang.String[r6]
            java.lang.String r9 = r17.getLocalClassName()
            r8[r5] = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "activity_intent_"
            r9.<init>(r10)
            android.content.Intent r10 = r17.getIntent()
            java.lang.String r10 = r10.toString()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8[r4] = r9
            r7.AFKeystoreWrapper(r3, r8)
            goto L_0x007b
        L_0x0047:
            r7 = 65
            if (r17 == 0) goto L_0x004e
            r8 = 94
            goto L_0x0050
        L_0x004e:
            r8 = 65
        L_0x0050:
            if (r8 == r7) goto L_0x006a
            com.appsflyer.internal.AFc1pSDK r7 = r16.values()
            com.appsflyer.internal.AFb1uSDK r7 = r7.afErrorLogForExcManagerOnly()
            java.lang.String[] r8 = new java.lang.String[r6]
            java.lang.String r9 = r17.getLocalClassName()
            r8[r5] = r9
            java.lang.String r9 = "activity_intent_null"
            r8[r4] = r9
            r7.AFKeystoreWrapper(r3, r8)
            goto L_0x007b
        L_0x006a:
            com.appsflyer.internal.AFc1pSDK r7 = r16.values()
            com.appsflyer.internal.AFb1uSDK r7 = r7.afErrorLogForExcManagerOnly()
            java.lang.String r8 = "activity_null"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            r7.AFKeystoreWrapper(r3, r8)
        L_0x007b:
            java.lang.String r3 = values((android.app.Activity) r17)
            r1.AFVersionDeclaration = r3
            if (r3 == 0) goto L_0x01af
            int r3 = onResponseError
            int r3 = r3 + 51
            int r7 = r3 % 128
            onValidateInAppFailure = r7
            int r3 = r3 % r6
            if (r3 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            if (r4 != 0) goto L_0x01aa
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r7 = r1.getLevel
            java.lang.String r8 = ")"
            if (r7 != 0) goto L_0x00ab
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.getLevel = r0
            r11 = r4
            goto L_0x016b
        L_0x00ab:
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0150 }
            java.lang.String r9 = "pushPayloadMaxAging"
            r10 = 1800000(0x1b7740, double:8.89318E-318)
            long r9 = r7.getLong(r9, r10)     // Catch:{ all -> 0x0150 }
            java.util.Map<java.lang.Long, java.lang.String> r7 = r1.getLevel     // Catch:{ all -> 0x0150 }
            java.util.Set r7 = r7.keySet()     // Catch:{ all -> 0x0150 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0150 }
            r11 = r4
        L_0x00c3:
            boolean r13 = r7.hasNext()     // Catch:{ all -> 0x014e }
            if (r13 == 0) goto L_0x016b
            java.lang.Object r13 = r7.next()     // Catch:{ all -> 0x014e }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ all -> 0x014e }
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x014e }
            java.lang.String r15 = r1.AFVersionDeclaration     // Catch:{ all -> 0x014e }
            r14.<init>(r15)     // Catch:{ all -> 0x014e }
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ all -> 0x014e }
            java.util.Map<java.lang.Long, java.lang.String> r6 = r1.getLevel     // Catch:{ all -> 0x014e }
            java.lang.Object r6 = r6.get(r13)     // Catch:{ all -> 0x014e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x014e }
            r15.<init>(r6)     // Catch:{ all -> 0x014e }
            java.lang.Object r6 = r14.opt(r2)     // Catch:{ all -> 0x014e }
            java.lang.Object r3 = r15.opt(r2)     // Catch:{ all -> 0x014e }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x014e }
            if (r3 == 0) goto L_0x0127
            int r3 = onResponseError
            int r3 = r3 + 67
            int r3 = r3 % 128
            onValidateInAppFailure = r3
            java.lang.Object r3 = r14.opt(r0)     // Catch:{ all -> 0x014e }
            java.lang.Object r6 = r15.opt(r0)     // Catch:{ all -> 0x014e }
            boolean r3 = r3.equals(r6)     // Catch:{ all -> 0x014e }
            if (r3 == 0) goto L_0x0127
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x014e }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x014e }
            r0.append(r15)     // Catch:{ all -> 0x014e }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x014e }
            r0.append(r14)     // Catch:{ all -> 0x014e }
            r0.append(r8)     // Catch:{ all -> 0x014e }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x014e }
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x014e }
            r0 = 0
            r1.AFVersionDeclaration = r0     // Catch:{ all -> 0x014e }
            return
        L_0x0127:
            long r14 = r13.longValue()     // Catch:{ all -> 0x014e }
            long r14 = r4 - r14
            r3 = 44
            int r6 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0136
            r6 = 44
            goto L_0x0138
        L_0x0136:
            r6 = 21
        L_0x0138:
            if (r6 != r3) goto L_0x013f
            java.util.Map<java.lang.Long, java.lang.String> r3 = r1.getLevel     // Catch:{ all -> 0x014e }
            r3.remove(r13)     // Catch:{ all -> 0x014e }
        L_0x013f:
            long r14 = r13.longValue()     // Catch:{ all -> 0x014e }
            int r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x014b
            long r11 = r13.longValue()     // Catch:{ all -> 0x014e }
        L_0x014b:
            r6 = 2
            goto L_0x00c3
        L_0x014e:
            r0 = move-exception
            goto L_0x0152
        L_0x0150:
            r0 = move-exception
            r11 = r4
        L_0x0152:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error while handling push notification measurement: "
            r2.<init>(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afErrorLog(r2, r0)
        L_0x016b:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r3 = 2
            int r0 = r0.getInt(r2, r3)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.getLevel
            int r2 = r2.size()
            if (r2 != r0) goto L_0x019b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r11)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.getLevel
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r0.remove(r2)
        L_0x019b:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.getLevel
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r3 = r1.AFVersionDeclaration
            r0.put(r2, r3)
            r16.start(r17)
            return
        L_0x01aa:
            r0 = 0
            r0.hashCode()
            throw r0
        L_0x01af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.sendPushNotificationData(android.app.Activity):void");
    }

    public final void setUserEmails(String... strArr) {
        int i = onValidateInAppFailure + 95;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? ',' : 17) != ',') {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setUserEmails", strArr);
            setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            onResponseError = (onValidateInAppFailure + 15) % 128;
            return;
        }
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setUserEmails", strArr);
        setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        throw null;
    }

    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        int length = strArr.length;
        String str = null;
        int i = 0;
        while (true) {
            if ((i < length ? ';' : 7) != ';') {
                hashMap.put(str, arrayList2);
                AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
                return;
            }
            String str2 = strArr[i];
            if (AnonymousClass2.AFInAppEventType[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFa1aSDK.AFKeystoreWrapper(str2));
                onResponseError = (onValidateInAppFailure + 97) % 128;
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
            i++;
            onValidateInAppFailure = (onResponseError + 125) % 128;
        }
    }

    /* renamed from: com.appsflyer.internal.AFa1dSDK$2  reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AFInAppEventType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AFInAppEventType = r0
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = AFInAppEventType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AnonymousClass2.<clinit>():void");
        }
    }

    public final void setCollectAndroidID(boolean z) {
        onValidateInAppFailure = (onResponseError + 123) % 128;
        boolean z2 = false;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setCollectAndroidID", String.valueOf(z));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AFInAppEventType(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
        int i = onValidateInAppFailure + 49;
        onResponseError = i % 128;
        if (i % 2 == 0) {
            z2 = true;
        }
        if (z2) {
            throw new ArithmeticException();
        }
    }

    public final void setCollectIMEI(boolean z) {
        int i = onValidateInAppFailure + 15;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 'R' : '<') != 'R') {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setCollectIMEI", String.valueOf(z));
        } else {
            AFb1uSDK afErrorLogForExcManagerOnly2 = values().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[0] = String.valueOf(z);
            afErrorLogForExcManagerOnly2.AFKeystoreWrapper("setCollectIMEI", strArr);
        }
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AFInAppEventType(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    @Deprecated
    public final void setCollectOaid(boolean z) {
        onValidateInAppFailure = (onResponseError + 7) % 128;
        boolean z2 = false;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setCollectOaid", String.valueOf(z));
        AFInAppEventType(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
        int i = onResponseError + 67;
        onValidateInAppFailure = i % 128;
        if (i % 2 != 0) {
            z2 = true;
        }
        if (z2) {
            Throwable th = null;
            th.hashCode();
            throw th;
        }
    }

    public final AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if ((this.init ? 'Q' : '[') != '[') {
            onValidateInAppFailure = (onResponseError + 9) % 128;
            return this;
        }
        this.init = true;
        values().AppsFlyer2dXConversionCallback().valueOf = str;
        AFb1tSDK.values(str);
        if (context != null) {
            onResponseError = (onValidateInAppFailure + 37) % 128;
            this.onInstallConversionFailureNative = (Application) context.getApplicationContext();
            AFInAppEventType(context);
            values().afDebugLog().AFInAppEventType = System.currentTimeMillis();
            values().onDeepLinking().AFInAppEventParameterName();
            values().afInfoLog().values(new AFa1dSDK$$ExternalSyntheticLambda0(this));
            afRDLog();
            this.onDeepLinking.AppsFlyer2dXConversionCallback().AFInAppEventType();
            AFb1fSDK.AFKeystoreWrapper = this.onInstallConversionFailureNative;
        } else {
            AFLogger.afWarnLog("context is null, Google Install Referrer will be not initialized");
        }
        AFb1uSDK afErrorLogForExcManagerOnly2 = values().afErrorLogForExcManagerOnly();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = (appsFlyerConversionListener == null ? ' ' : 'F') != 'F' ? "null" : "conversionDataListener";
        afErrorLogForExcManagerOnly2.AFKeystoreWrapper("init", strArr);
        AFLogger.AFKeystoreWrapper(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{"6.11.1", valueOf}));
        this.AFInAppEventParameterName = appsFlyerConversionListener;
        return this;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void values(AFe1rSDK aFe1rSDK) {
        onValidateInAppFailure = (onResponseError + 99) % 128;
        if (!(aFe1rSDK != AFe1rSDK.SUCCESS)) {
            onValidateInAppFailure = (onResponseError + 71) % 128;
            values().onDeepLinking().valueOf();
        }
        onResponseError = (onValidateInAppFailure + 53) % 128;
    }

    private void afRDLog() {
        AFg1vSDK AFVersionDeclaration2 = values().AFVersionDeclaration();
        AFg1wSDK afInfoLog2 = afInfoLog();
        Runnable valueOf2 = valueOf(afInfoLog2);
        AFVersionDeclaration2.AFInAppEventParameterName(afInfoLog2);
        AFVersionDeclaration2.AFInAppEventParameterName(new AFg1sSDK(valueOf2));
        AFVersionDeclaration2.AFInAppEventParameterName(new AFg1ySDK(valueOf2, values()));
        AFVersionDeclaration2.AFInAppEventParameterName(new AFg1tSDK(valueOf2, values()));
        if (!AFLogger()) {
            int i = onValidateInAppFailure + 91;
            onResponseError = i % 128;
            if (i % 2 != 0) {
                AFVersionDeclaration2.values(this.onInstallConversionFailureNative, valueOf2, values());
            } else {
                AFVersionDeclaration2.values(this.onInstallConversionFailureNative, valueOf2, values());
                throw null;
            }
        }
        AFg1uSDK[] AFInAppEventParameterName2 = AFVersionDeclaration2.AFInAppEventParameterName();
        int length = AFInAppEventParameterName2.length;
        onResponseError = (onValidateInAppFailure + 11) % 128;
        int i2 = 0;
        while (true) {
            if ((i2 < length ? '5' : 'Q') == '5') {
                AFInAppEventParameterName2[i2].valueOf(this.onInstallConversionFailureNative);
                i2++;
            } else {
                return;
            }
        }
    }

    private AFg1wSDK afInfoLog() {
        AFg1wSDK aFg1wSDK = new AFg1wSDK(new AFa1dSDK$$ExternalSyntheticLambda3(this), values().valueOf());
        onValidateInAppFailure = (onResponseError + 45) % 128;
        return aFg1wSDK;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void AFLogger$LogLevel() {
        onResponseError = (onValidateInAppFailure + 49) % 128;
        valueOf(values().values(), new AFa1dSDK$$ExternalSyntheticLambda1(this), 0, TimeUnit.MILLISECONDS);
        onValidateInAppFailure = (onResponseError + 93) % 128;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void getLevel() {
        try {
            AFf1uSDK aFf1uSDK = new AFf1uSDK();
            if (valueOf((AFa1rSDK) aFf1uSDK, AFInAppEventParameterName((Context) this.onInstallConversionFailureNative))) {
                int i = onValidateInAppFailure + 75;
                onResponseError = i % 128;
                if (!(i % 2 == 0)) {
                    AFInAppEventParameterName((AFa1rSDK) aFf1uSDK);
                    onResponseError = (onValidateInAppFailure + 115) % 128;
                    return;
                }
                AFInAppEventParameterName((AFa1rSDK) aFf1uSDK);
                throw new ArithmeticException();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    private Runnable valueOf(AFg1wSDK aFg1wSDK) {
        onResponseError = (onValidateInAppFailure + 33) % 128;
        AFa1dSDK$$ExternalSyntheticLambda2 aFa1dSDK$$ExternalSyntheticLambda2 = new AFa1dSDK$$ExternalSyntheticLambda2(this, aFg1wSDK);
        int i = onResponseError + 99;
        onValidateInAppFailure = i % 128;
        if (i % 2 == 0) {
            return aFa1dSDK$$ExternalSyntheticLambda2;
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if ((r7.AFLogger != com.appsflyer.internal.AFg1uSDK.AFa1xSDK.values) != true) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r7.AFLogger == com.appsflyer.internal.AFg1uSDK.AFa1xSDK.values) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void AFInAppEventType(com.appsflyer.internal.AFg1wSDK r7) {
        /*
            r6 = this;
            int r0 = onValidateInAppFailure
            int r0 = r0 + 115
            int r1 = r0 % 128
            onResponseError = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.lang.String r3 = "newGPReferrerSent"
            java.lang.String r4 = "appsFlyerCount"
            if (r0 == 0) goto L_0x003b
            android.app.Application r0 = r6.onInstallConversionFailureNative
            android.content.SharedPreferences r0 = AFInAppEventParameterName((android.content.Context) r0)
            com.appsflyer.internal.AFc1pSDK r5 = r6.values()
            com.appsflyer.internal.AFc1vSDK r5 = r5.AFKeystoreWrapper()
            com.appsflyer.internal.AFb1aSDK r5 = r5.values
            int r4 = r5.AFInAppEventType((java.lang.String) r4, (int) r2)
            boolean r0 = r0.getBoolean(r3, r2)
            com.appsflyer.internal.AFg1uSDK$AFa1xSDK r7 = r7.AFLogger
            com.appsflyer.internal.AFg1uSDK$AFa1xSDK r3 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.NOT_STARTED
            if (r7 != r3) goto L_0x0037
            r7 = 0
            goto L_0x0038
        L_0x0037:
            r7 = 1
        L_0x0038:
            if (r7 == r1) goto L_0x0062
            goto L_0x0059
        L_0x003b:
            android.app.Application r0 = r6.onInstallConversionFailureNative
            android.content.SharedPreferences r0 = AFInAppEventParameterName((android.content.Context) r0)
            com.appsflyer.internal.AFc1pSDK r5 = r6.values()
            com.appsflyer.internal.AFc1vSDK r5 = r5.AFKeystoreWrapper()
            com.appsflyer.internal.AFb1aSDK r5 = r5.values
            int r4 = r5.AFInAppEventType((java.lang.String) r4, (int) r2)
            boolean r0 = r0.getBoolean(r3, r1)
            com.appsflyer.internal.AFg1uSDK$AFa1xSDK r7 = r7.AFLogger
            com.appsflyer.internal.AFg1uSDK$AFa1xSDK r3 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.NOT_STARTED
            if (r7 != r3) goto L_0x0062
        L_0x0059:
            int r7 = onValidateInAppFailure
            int r7 = r7 + 75
            int r7 = r7 % 128
            onResponseError = r7
            r2 = 1
        L_0x0062:
            if (r4 != r1) goto L_0x0089
            int r7 = onResponseError
            int r7 = r7 + 85
            int r7 = r7 % 128
            onValidateInAppFailure = r7
            r7 = 29
            if (r2 != 0) goto L_0x0073
            r1 = 29
            goto L_0x0075
        L_0x0073:
            r1 = 72
        L_0x0075:
            if (r1 != r7) goto L_0x0079
            if (r0 == 0) goto L_0x0089
        L_0x0079:
            com.appsflyer.internal.AFf1uSDK r7 = new com.appsflyer.internal.AFf1uSDK
            r7.<init>()
            r6.AFInAppEventParameterName((com.appsflyer.internal.AFa1rSDK) r7)
            int r7 = onValidateInAppFailure
            int r7 = r7 + 109
            int r7 = r7 % 128
            onResponseError = r7
        L_0x0089:
            int r7 = onValidateInAppFailure
            int r7 = r7 + 7
            int r7 = r7 % 128
            onResponseError = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AFInAppEventType(com.appsflyer.internal.AFg1wSDK):void");
    }

    private boolean AFLogger() {
        int i = onValidateInAppFailure + 23;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 'L' : 24) != 'L') {
            return values().AFKeystoreWrapper().AFInAppEventParameterName("AF_PREINSTALL_DISABLED");
        }
        values().AFKeystoreWrapper().AFInAppEventParameterName("AF_PREINSTALL_DISABLED");
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private void valueOf(Context context) {
        this.onConversionDataSuccess = new HashMap();
        final long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass4 r2 = new AFa1uSDK.AFa1xSDK() {
            public final void AFKeystoreWrapper(String str, String str2, String str3) {
                if (str != null) {
                    AFLogger.afInfoLog("Facebook Deferred AppLink data received: ".concat(String.valueOf(str)));
                    AFa1dSDK.values(AFa1dSDK.this).put("link", str);
                    if (str2 != null) {
                        AFa1dSDK.values(AFa1dSDK.this).put("target_url", str2);
                    }
                    if (str3 != null) {
                        HashMap hashMap = new HashMap();
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("promo_code", str3);
                        hashMap.put("deeplink_context", hashMap2);
                        AFa1dSDK.values(AFa1dSDK.this).put("extras", hashMap);
                    }
                } else {
                    AFa1dSDK.values(AFa1dSDK.this).put("link", "");
                }
                AFa1dSDK.values(AFa1dSDK.this).put("ttr", String.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }

            public final void AFInAppEventParameterName(String str) {
                AFa1dSDK.values(AFa1dSDK.this).put("error", str);
            }
        };
        try {
            Class.forName("com.facebook.FacebookSdk").getMethod("sdkInitialize", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            Class<?> cls = Class.forName("com.facebook.applinks.AppLinkData");
            Class<?> cls2 = Class.forName("com.facebook.applinks.AppLinkData$CompletionHandler");
            Method method = cls.getMethod("fetchDeferredAppLinkData", new Class[]{Context.class, String.class, cls2});
            Object newProxyInstance = Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, new InvocationHandler(cls, r2) {
                private /* synthetic */ AFa1xSDK AFInAppEventType;
                private /* synthetic */ Class values;

                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invoke(
/*
Method generation error in method: com.appsflyer.internal.AFa1uSDK.1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFa1uSDK.1.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            String string = context.getString(context.getResources().getIdentifier("facebook_app_id", "string", context.getPackageName()));
            if ((TextUtils.isEmpty(string) ? 'c' : 'J') != 'c') {
                method.invoke((Object) null, new Object[]{context, string, newProxyInstance});
                onResponseError = (onValidateInAppFailure + 9) % 128;
                return;
            }
            int i = onResponseError + 31;
            onValidateInAppFailure = i % 128;
            if ((i % 2 != 0 ? 'H' : '@') != 'H') {
                r2.AFInAppEventParameterName("Facebook app id not defined in resources");
            } else {
                r2.AFInAppEventParameterName("Facebook app id not defined in resources");
                throw new ArithmeticException();
            }
        } catch (NoSuchMethodException e) {
            AFLogger.afErrorLogForExcManagerOnly("FB method missing error", e);
            r2.AFInAppEventParameterName(e.toString());
        } catch (InvocationTargetException e2) {
            AFLogger.afErrorLogForExcManagerOnly("FB invocation error", e2);
            r2.AFInAppEventParameterName(e2.toString());
        } catch (ClassNotFoundException e3) {
            AFLogger.afErrorLogForExcManagerOnly("FB class missing error", e3);
            r2.AFInAppEventParameterName(e3.toString());
        } catch (IllegalAccessException e4) {
            AFLogger.afErrorLogForExcManagerOnly("FB illegal access", e4);
            r2.AFInAppEventParameterName(e4.toString());
        }
    }

    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = onResponseError + 25;
        onValidateInAppFailure = i % 128;
        char c = i % 2 != 0 ? '2' : 'B';
        this.onDeepLinkingNative = z;
        if (c == '2') {
            Throwable th = null;
            th.hashCode();
            throw th;
        }
    }

    public final void start(Context context) {
        onResponseError = (onValidateInAppFailure + 119) % 128;
        start(context, (String) null);
        int i = onResponseError + 101;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? '6' : 'a') == '6') {
            throw new ArithmeticException();
        }
    }

    public final void start(Context context, String str) {
        onResponseError = (onValidateInAppFailure + 5) % 128;
        start(context, str, (AppsFlyerRequestListener) null);
        onResponseError = (onValidateInAppFailure + 29) % 128;
    }

    public final void start(Context context, String str, final AppsFlyerRequestListener appsFlyerRequestListener) {
        if (!values().onAttributionFailureNative().AFKeystoreWrapper()) {
            if (!this.init) {
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'start()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
                if (str == null) {
                    if (appsFlyerRequestListener != null) {
                        int i = onValidateInAppFailure + 97;
                        onResponseError = i % 128;
                        if ((i % 2 == 0 ? '&' : '`') != '&') {
                            appsFlyerRequestListener.onError(41, "No dev key");
                            return;
                        } else {
                            appsFlyerRequestListener.onError(36, "No dev key");
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            AFInAppEventType(context);
            final AFf1xSDK afDebugLog2 = values().afDebugLog();
            afDebugLog2.AFInAppEventParameterName(AFa1tSDK.AFInAppEventType(context));
            this.onInstallConversionFailureNative = (Application) context.getApplicationContext();
            boolean z = true;
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("start", str);
            String str2 = valueOf;
            AFLogger.afInfoLog(String.format("Starting AppsFlyer: (v%s.%s)", new Object[]{"6.11.1", str2}));
            StringBuilder sb = new StringBuilder("Build Number: ");
            sb.append(str2);
            AFLogger.afInfoLog(sb.toString());
            AppsFlyerProperties.getInstance().loadProperties(this.onInstallConversionFailureNative.getApplicationContext());
            if (!TextUtils.isEmpty(str)) {
                onValidateInAppFailure = (onResponseError + 5) % 128;
                values().AppsFlyer2dXConversionCallback().valueOf = str;
                AFb1tSDK.values(str);
            } else if (!(!TextUtils.isEmpty(values().AppsFlyer2dXConversionCallback().valueOf))) {
                onResponseError = (onValidateInAppFailure + 27) % 128;
                AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
                if (appsFlyerRequestListener != null) {
                    z = false;
                }
                if (!z) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            values().afInfoLog().values((AFe1qSDK) null);
            afWarnLog();
            AFLogger(this.onInstallConversionFailureNative.getBaseContext());
            if ((this.onDeepLinkingNative ? '/' : 17) != 17) {
                valueOf(this.onInstallConversionFailureNative.getApplicationContext());
            }
            AFc1wSDK aFc1wSDK = this.onDeepLinking;
            if (aFc1wSDK.values == null) {
                aFc1wSDK.values = new AFc1xSDK(aFc1wSDK.AFInAppEventParameterName(), aFc1wSDK.onResponseErrorNative());
            }
            aFc1wSDK.values.AFInAppEventType(context, new AFc1ySDK.AFa1xSDK() {
                public final void valueOf(Activity activity) {
                    afDebugLog2.AFInAppEventType();
                    AFa1dSDK.this.values().afInfoLog().values((AFe1qSDK) null);
                    AFa1dSDK.AFInAppEventType(AFa1dSDK.this);
                    int AFInAppEventType2 = AFa1dSDK.this.AFInAppEventType(AFa1dSDK.AFInAppEventParameterName((Context) activity), false);
                    AFLogger.afInfoLog("onBecameForeground");
                    if (AFInAppEventType2 < 2) {
                        AFa1dSDK.this.values().AFLogger$LogLevel().AFInAppEventParameterName();
                    }
                    AFf1oSDK aFf1oSDK = new AFf1oSDK();
                    if (activity != null) {
                        AFa1dSDK.this.values().onResponseErrorNative().values(aFf1oSDK.AFInAppEventType(), activity.getIntent(), activity.getApplication());
                    }
                    AFa1dSDK aFa1dSDK = AFa1dSDK.this;
                    aFf1oSDK.AFInAppEventParameterName = appsFlyerRequestListener;
                    aFa1dSDK.valueOf((AFa1rSDK) aFf1oSDK, activity);
                }

                public final void AFInAppEventType(Context context) {
                    AFLogger.afInfoLog("onBecameBackground");
                    AFf1xSDK aFf1xSDK = afDebugLog2;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (aFf1xSDK.afRDLog != 0) {
                        long j = currentTimeMillis - aFf1xSDK.afRDLog;
                        if (j > 0 && j < 1000) {
                            j = 1000;
                        }
                        aFf1xSDK.afWarnLog = TimeUnit.MILLISECONDS.toSeconds(j);
                        aFf1xSDK.AFKeystoreWrapper.AFInAppEventType("prev_session_dur", aFf1xSDK.afWarnLog);
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                    AFLogger.afInfoLog("callStatsBackground background call");
                    AFa1dSDK.this.AFKeystoreWrapper((WeakReference<Context>) new WeakReference(context));
                    AFa1dSDK.this.values().onDeepLinking().values();
                    AFb1uSDK afErrorLogForExcManagerOnly = AFa1dSDK.this.values().afErrorLogForExcManagerOnly();
                    if (afErrorLogForExcManagerOnly.afRDLog()) {
                        afErrorLogForExcManagerOnly.values();
                        if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                            afErrorLogForExcManagerOnly.AFInAppEventParameterName(context.getPackageName(), context.getPackageManager(), AFa1dSDK.this.values());
                        }
                        afErrorLogForExcManagerOnly.valueOf();
                    } else {
                        AFLogger.afDebugLog("RD status is OFF");
                    }
                    AFa1dSDK.this.values().AFLogger$LogLevel().AFKeystoreWrapper();
                }
            });
        }
    }

    private static void AFLogger(Context context) {
        try {
            if (((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0 ? '4' : 'R') == '4') {
                int i = onResponseError;
                onValidateInAppFailure = (i + 59) % 128;
                int i2 = i + 9;
                onValidateInAppFailure = i2 % 128;
                if ((i2 % 2 != 0 ? '8' : '-') != '8') {
                    AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                } else {
                    AFLogger.afInfoLog("appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", false);
                }
            } else {
                onValidateInAppFailure = (onResponseError + 33) % 128;
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("checkBackupRules Exception", e);
            AFLogger.afRDLog("checkBackupRules Exception: ".concat(String.valueOf(e)));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private static void afInfoLog(android.content.Context r4) {
        /*
            boolean r0 = com.appsflyer.internal.AFa1bSDK.valueOf()
            if (r0 == 0) goto L_0x000e
            java.lang.String r0 = "OPPO device found"
            com.appsflyer.AFLogger.afRDLog(r0)
            r0 = 23
            goto L_0x0010
        L_0x000e:
            r0 = 18
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x00b9
            r0 = 1
            java.lang.String r1 = "keyPropDisableAFKeystore"
            boolean r1 = values((java.lang.String) r1, (boolean) r0)
            if (r1 != 0) goto L_0x00b9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "OS SDK is="
            r1.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r1.append(r2)
            java.lang.String r2 = "; use KeyStore"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.appsflyer.AFLogger.afRDLog(r1)
            com.appsflyer.AFKeystoreWrapper r1 = new com.appsflyer.AFKeystoreWrapper
            r1.<init>(r4)
            boolean r2 = r1.values()
            if (r2 != 0) goto L_0x0056
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            java.lang.String r4 = com.appsflyer.internal.AFb1rSDK.valueOf(r0)
            r1.AFInAppEventParameterName = r4
            r4 = 0
            r1.values = r4
            java.lang.String r4 = r1.AFInAppEventType()
            r1.AFKeystoreWrapper(r4)
            goto L_0x009f
        L_0x0056:
            java.lang.String r4 = r1.AFInAppEventType()
            java.lang.Object r2 = r1.AFInAppEventType
            monitor-enter(r2)
            int r3 = r1.values     // Catch:{ all -> 0x00b6 }
            int r3 = r3 + r0
            r1.values = r3     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "Deleting key with alias: "
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ all -> 0x00b6 }
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r0 = r1.AFInAppEventType     // Catch:{ KeyStoreException -> 0x007c }
            monitor-enter(r0)     // Catch:{ KeyStoreException -> 0x007c }
            java.security.KeyStore r3 = r1.valueOf     // Catch:{ all -> 0x0079 }
            r3.deleteEntry(r4)     // Catch:{ all -> 0x0079 }
            monitor-exit(r0)
            goto L_0x0097
        L_0x0079:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ KeyStoreException -> 0x007c }
            throw r4     // Catch:{ KeyStoreException -> 0x007c }
        L_0x007c:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "Exception "
            r0.<init>(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = r4.getMessage()     // Catch:{ all -> 0x00b6 }
            r0.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = " occurred"
            r0.append(r3)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b6 }
            com.appsflyer.AFLogger.afErrorLog(r0, r4)     // Catch:{ all -> 0x00b6 }
        L_0x0097:
            monitor-exit(r2)
            java.lang.String r4 = r1.AFInAppEventType()
            r1.AFKeystoreWrapper(r4)
        L_0x009f:
            java.lang.String r4 = r1.AFKeystoreWrapper()
            java.lang.String r0 = "KSAppsFlyerId"
            AFInAppEventType((java.lang.String) r0, (java.lang.String) r4)
            int r4 = r1.valueOf()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "KSAppsFlyerRICounter"
            AFInAppEventType((java.lang.String) r0, (java.lang.String) r4)
            return
        L_0x00b6:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L_0x00b9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "OS SDK is="
            r4.<init>(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4.append(r0)
            java.lang.String r0 = "; no KeyStore usage"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            com.appsflyer.AFLogger.afRDLog(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.afInfoLog(android.content.Context):void");
    }

    public static String AFInAppEventParameterName() {
        onResponseError = (onValidateInAppFailure + 69) % 128;
        String AFInAppEventParameterName2 = AFInAppEventParameterName(AppsFlyerProperties.APP_USER_ID);
        int i = onValidateInAppFailure + 115;
        onResponseError = i % 128;
        if (!(i % 2 == 0)) {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    public final void setCustomerUserId(String str) {
        onValidateInAppFailure = (onResponseError + 121) % 128;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AFInAppEventType(AppsFlyerProperties.APP_USER_ID, str);
        AFInAppEventType(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        onResponseError = (onValidateInAppFailure + 77) % 128;
    }

    public final void setPhoneNumber(String str) {
        int i = onResponseError + 57;
        onValidateInAppFailure = i % 128;
        boolean z = i % 2 == 0;
        this.onAttributionFailureNative = AFa1aSDK.AFKeystoreWrapper(str);
        if (!z) {
            Throwable th = null;
            th.hashCode();
            throw th;
        }
    }

    private static String afErrorLog() {
        onResponseError = (onValidateInAppFailure + 81) % 128;
        String AFInAppEventParameterName2 = AFInAppEventParameterName(AppsFlyerProperties.APP_ID);
        int i = onResponseError + 105;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? 'Y' : 'X') != 'Y') {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    public final void setAppId(String str) {
        onResponseError = (onValidateInAppFailure + 17) % 128;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setAppId", str);
        AFInAppEventType(AppsFlyerProperties.APP_ID, str);
        onResponseError = (onValidateInAppFailure + 33) % 128;
    }

    public final void setExtension(String str) {
        int i = onValidateInAppFailure + 19;
        onResponseError = i % 128;
        if (i % 2 == 0) {
            AFb1uSDK afErrorLogForExcManagerOnly2 = values().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[1] = str;
            afErrorLogForExcManagerOnly2.AFKeystoreWrapper("setExtension", strArr);
        } else {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        onResponseError = (onValidateInAppFailure + 37) % 128;
    }

    public final void setIsUpdate(boolean z) {
        onResponseError = (onValidateInAppFailure + 15) % 128;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        int i = onResponseError + 117;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? 29 : '.') == 29) {
            throw null;
        }
    }

    public final void setCurrencyCode(String str) {
        onResponseError = (onValidateInAppFailure + 67) % 128;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        onValidateInAppFailure = (onResponseError + 103) % 128;
    }

    public final void logLocation(Context context, double d, double d2) {
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        AFInAppEventType(context, AFInAppEventType.LOCATION_COORDINATES, hashMap);
        onResponseError = (onValidateInAppFailure + 29) % 128;
    }

    /* access modifiers changed from: package-private */
    public final void AFKeystoreWrapper(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences AFInAppEventParameterName2 = AFInAppEventParameterName(weakReference.get());
            AppsFlyerProperties.getInstance().saveProperties(AFInAppEventParameterName2);
            long j = values().afDebugLog().afWarnLog;
            HashMap hashMap = new HashMap();
            String str = values().AppsFlyer2dXConversionCallback().valueOf;
            if (str == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String AFInAppEventParameterName3 = AFInAppEventParameterName("KSAppsFlyerId");
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
                int i = onResponseError + 53;
                onValidateInAppFailure = i % 128;
                char c = i % 2 != 0 ? '9' : 6;
                hashMap.put(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
                if (c == '9') {
                    throw new ArithmeticException();
                }
            }
            AFa1eSDK AFInAppEventParameterName4 = AFa1fSDK.AFInAppEventParameterName(weakReference.get().getContentResolver());
            if (AFInAppEventParameterName4 != null) {
                int i2 = onValidateInAppFailure + 5;
                onResponseError = i2 % 128;
                if (i2 % 2 != 0) {
                    hashMap.put("amazon_aid", AFInAppEventParameterName4.AFKeystoreWrapper);
                    hashMap.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName4.valueOf));
                } else {
                    hashMap.put("amazon_aid", AFInAppEventParameterName4.AFKeystoreWrapper);
                    hashMap.put("amazon_aid_limit", String.valueOf(AFInAppEventParameterName4.valueOf));
                    Throwable th = null;
                    th.hashCode();
                    throw th;
                }
            }
            String string = AppsFlyerProperties.getInstance().getString("advertiserId");
            if ((string != null ? 'S' : '+') == 'S') {
                hashMap.put("advertiserId", string);
            }
            hashMap.put("app_id", weakReference.get().getPackageName());
            hashMap.put("devkey", str);
            hashMap.put("uid", AFb1rSDK.valueOf(weakReference));
            hashMap.put("time_in_app", String.valueOf(j));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(AFInAppEventType(AFInAppEventParameterName2, false)));
            hashMap.put(AppsFlyerProperties.CHANNEL, values().AFKeystoreWrapper().AFInAppEventType());
            if (!(AFInAppEventParameterName3 != null)) {
                AFInAppEventParameterName3 = "";
            } else {
                onValidateInAppFailure = (onResponseError + 55) % 128;
            }
            hashMap.put("originalAppsflyerId", AFInAppEventParameterName3);
            if (this.onInstallConversionDataLoadedNative) {
                AFf1nSDK aFf1nSDK = new AFf1nSDK();
                aFf1nSDK.afRDLog = isStopped();
                AFe1uSDK aFe1uSDK = new AFe1uSDK((AFf1nSDK) aFf1nSDK.AFInAppEventType(values().AFKeystoreWrapper().values.AFInAppEventType("appsFlyerCount", 0)).values(hashMap).AFInAppEventParameterName(String.format(afRDLog, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), valueOf().getHostName()})), values());
                AFd1mSDK level = values().getLevel();
                level.AFKeystoreWrapper.execute(new Runnable(aFe1uSDK) {
                    private /* synthetic */ AFd1jSDK AFInAppEventType;

                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
                return;
            }
            AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            int i3 = onValidateInAppFailure + 55;
            onResponseError = i3 % 128;
            if (i3 % 2 == 0) {
                throw new ArithmeticException();
            }
        }
    }

    public final void logSession(Context context) {
        onResponseError = (onValidateInAppFailure + 117) % 128;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("logSession", new String[0]);
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper();
        AFInAppEventParameterName(context, AFf1vSDK.logSession);
        AFInAppEventType(context, (String) null, (Map<String, Object>) null);
        int i = onValidateInAppFailure + 53;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 9 : '8') == 9) {
            throw null;
        }
    }

    private void AFInAppEventParameterName(Context context, AFf1vSDK aFf1vSDK) {
        onValidateInAppFailure = (onResponseError + 35) % 128;
        AFInAppEventType(context);
        AFf1xSDK afDebugLog2 = values().afDebugLog();
        AFf1zSDK AFInAppEventType2 = AFa1tSDK.AFInAppEventType(context);
        if (!(!afDebugLog2.values())) {
            onValidateInAppFailure = (onResponseError + 105) % 128;
            afDebugLog2.valueOf.put("api_name", aFf1vSDK.toString());
            afDebugLog2.AFInAppEventParameterName(AFInAppEventType2);
        }
        afDebugLog2.AFInAppEventType();
        int i = onValidateInAppFailure + 101;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 29 : '/') != '/') {
            Throwable th = null;
            th.hashCode();
            throw th;
        }
    }

    public final void sendAdRevenue(Context context, Map<String, Object> map) {
        AFInAppEventType(context);
        AFf1ySDK aFf1ySDK = new AFf1ySDK();
        int AFInAppEventType2 = AFInAppEventType(AFInAppEventParameterName(context));
        aFf1ySDK.AFInAppEventType().put("ad_network", map);
        aFf1ySDK.AFInAppEventType().put("adrevenue_counter", Integer.valueOf(AFInAppEventType2));
        Activity activity = null;
        if ((context instanceof Activity ? (char) 14 : 22) != 14) {
            onResponseError = (onValidateInAppFailure + 9) % 128;
        } else {
            int i = onValidateInAppFailure + 109;
            onResponseError = i % 128;
            if (!(i % 2 == 0)) {
                activity = (Activity) context;
            } else {
                Activity activity2 = (Activity) context;
                throw null;
            }
        }
        valueOf((AFa1rSDK) aFf1ySDK, activity);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Throwable, com.appsflyer.attribution.AppsFlyerRequestListener, java.lang.Object] */
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        int i = onResponseError + 97;
        onValidateInAppFailure = i % 128;
        boolean z = i % 2 == 0;
        ? r2 = 0;
        logEvent(context, str, map, r2);
        if (!z) {
            r2.hashCode();
            throw r2;
        }
    }

    private void AFInAppEventType(Context context, String str, Map<String, Object> map) {
        Activity activity;
        AFf1tSDK aFf1tSDK = new AFf1tSDK();
        aFf1tSDK.afInfoLog = str;
        aFf1tSDK.AFKeystoreWrapper = map;
        if ((context instanceof Activity ? '2' : 'L') != '2') {
            activity = null;
        } else {
            int i = onValidateInAppFailure;
            int i2 = i + 7;
            onResponseError = i2 % 128;
            if ((i2 % 2 == 0 ? (char) 30 : 21) != 30) {
                activity = (Activity) context;
                onResponseError = (i + 29) % 128;
            } else {
                Activity activity2 = (Activity) context;
                throw new ArithmeticException();
            }
        }
        valueOf((AFa1rSDK) aFf1tSDK, activity);
    }

    /* access modifiers changed from: package-private */
    public final void valueOf(AFa1rSDK aFa1rSDK, Activity activity) {
        String str;
        Uri AFInAppEventType2;
        int i = onResponseError + 83;
        onValidateInAppFailure = i % 128;
        boolean z = false;
        Throwable th = null;
        if (!(i % 2 != 0)) {
            Context context = values().init().AFInAppEventType;
            String str2 = "";
            if ((activity != null ? '?' : 'R') == 'R' || activity.getIntent() == null || (AFInAppEventType2 = AFb1kSDK.AFInAppEventType(activity)) == null) {
                str = str2;
            } else {
                int i2 = onResponseError + 111;
                onValidateInAppFailure = i2 % 128;
                if (i2 % 2 == 0) {
                    str = AFInAppEventType2.toString();
                } else {
                    th.hashCode();
                    throw th;
                }
            }
            if (values().AppsFlyer2dXConversionCallback().valueOf == null) {
                onResponseError = (onValidateInAppFailure + 77) % 128;
                AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
                AppsFlyerRequestListener appsFlyerRequestListener = aFa1rSDK.AFInAppEventParameterName;
                if ((appsFlyerRequestListener != null ? (char) 15 : 22) == 15) {
                    onResponseError = (onValidateInAppFailure + 77) % 128;
                    appsFlyerRequestListener.onError(41, "No dev key");
                    return;
                }
                return;
            }
            String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
            if (referrer != null) {
                z = true;
            }
            if (z) {
                str2 = referrer;
            }
            aFa1rSDK.AFLogger = str2;
            aFa1rSDK.values = str;
            AFInAppEventType(aFa1rSDK);
            return;
        }
        Context context2 = values().init().AFInAppEventType;
        throw th;
    }

    public final void anonymizeUser(boolean z) {
        onValidateInAppFailure = (onResponseError + 69) % 128;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("anonymizeUser", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        onResponseError = (onValidateInAppFailure + 103) % 128;
    }

    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = onResponseError + 37;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? 'K' : '<') != 'K') {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("registerConversionListener", new String[0]);
        } else {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("registerConversionListener", new String[1]);
        }
        valueOf(appsFlyerConversionListener);
        int i2 = onResponseError + 111;
        onValidateInAppFailure = i2 % 128;
        if ((i2 % 2 != 0 ? 'Y' : 'N') == 'Y') {
            throw null;
        }
    }

    private void valueOf(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = onValidateInAppFailure;
        int i2 = i + 41;
        onResponseError = i2 % 128;
        boolean z = false;
        if (i2 % 2 == 0) {
            Throwable th = null;
            th.hashCode();
            throw th;
        } else if (appsFlyerConversionListener == null) {
            int i3 = i + 13;
            onResponseError = i3 % 128;
            if (i3 % 2 != 0) {
                z = true;
            }
            if (!z) {
                throw new ArithmeticException();
            }
        } else {
            this.AFInAppEventParameterName = appsFlyerConversionListener;
        }
    }

    public final void unregisterConversionListener() {
        int i = onResponseError + 41;
        onValidateInAppFailure = i % 128;
        boolean z = false;
        if ((i % 2 != 0 ? '!' : '8') != '!') {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("unregisterConversionListener", new String[0]);
        } else {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("unregisterConversionListener", new String[1]);
        }
        this.AFInAppEventParameterName = null;
        int i2 = onValidateInAppFailure + 123;
        onResponseError = i2 % 128;
        if (i2 % 2 != 0) {
            z = true;
        }
        if (!z) {
            throw new ArithmeticException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if ((r6 == null ? '.' : 29) != '.') goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r6 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        AFInAppEventType = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void registerValidatorListener(android.content.Context r5, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener r6) {
        /*
            r4 = this;
            int r5 = onValidateInAppFailure
            int r5 = r5 + 99
            int r0 = r5 % 128
            onResponseError = r0
            int r5 = r5 % 2
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L_0x0010
            r5 = 0
            goto L_0x0011
        L_0x0010:
            r5 = 1
        L_0x0011:
            java.lang.String r2 = "registerValidatorListener called"
            java.lang.String r3 = "registerValidatorListener"
            if (r5 == r1) goto L_0x0033
            com.appsflyer.internal.AFc1pSDK r5 = r4.values()
            com.appsflyer.internal.AFb1uSDK r5 = r5.afErrorLogForExcManagerOnly()
            java.lang.String[] r0 = new java.lang.String[r1]
            r5.AFKeystoreWrapper(r3, r0)
            com.appsflyer.AFLogger.afDebugLog(r2)
            r5 = 46
            if (r6 != 0) goto L_0x002e
            r0 = 46
            goto L_0x0030
        L_0x002e:
            r0 = 29
        L_0x0030:
            if (r0 == r5) goto L_0x0045
            goto L_0x005d
        L_0x0033:
            com.appsflyer.internal.AFc1pSDK r5 = r4.values()
            com.appsflyer.internal.AFb1uSDK r5 = r5.afErrorLogForExcManagerOnly()
            java.lang.String[] r0 = new java.lang.String[r0]
            r5.AFKeystoreWrapper(r3, r0)
            com.appsflyer.AFLogger.afDebugLog(r2)
            if (r6 != 0) goto L_0x005d
        L_0x0045:
            java.lang.String r5 = "registerValidatorListener null listener"
            com.appsflyer.AFLogger.afDebugLog(r5)
            int r5 = onValidateInAppFailure
            int r5 = r5 + 43
            int r6 = r5 % 128
            onResponseError = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0057
            return
        L_0x0057:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            r5.<init>()
            throw r5
        L_0x005d:
            AFInAppEventType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.registerValidatorListener(android.content.Context, com.appsflyer.AppsFlyerInAppPurchaseValidatorListener):void");
    }

    public static String AFInAppEventParameterName(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date(j));
        int i = onValidateInAppFailure + 61;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? ':' : 28) == 28) {
            return format;
        }
        throw new ArithmeticException();
    }

    private void valueOf(Context context, String str, Map<String, Object> map, String str2, String str3) {
        AFa1rSDK aFa1rSDK;
        if ((str != null ? ')' : 17) != 17) {
            int i = onValidateInAppFailure + 85;
            onResponseError = i % 128;
            if ((i % 2 == 0 ? 'H' : 'D') != 'D') {
                throw null;
            } else if (!str.trim().isEmpty()) {
                aFa1rSDK = new AFf1tSDK();
                AFInAppEventType(context);
                aFa1rSDK.afInfoLog = str;
                aFa1rSDK.AFKeystoreWrapper = map;
                aFa1rSDK.AFLogger = str2;
                aFa1rSDK.values = str3;
                AFInAppEventType(aFa1rSDK);
            }
        }
        aFa1rSDK = new AFf1oSDK();
        onValidateInAppFailure = (onResponseError + 9) % 128;
        AFInAppEventType(context);
        aFa1rSDK.afInfoLog = str;
        aFa1rSDK.AFKeystoreWrapper = map;
        aFa1rSDK.AFLogger = str2;
        aFa1rSDK.values = str3;
        AFInAppEventType(aFa1rSDK);
    }

    private boolean afDebugLog() {
        String str;
        onResponseError = (onValidateInAppFailure + 47) % 128;
        if (this.AFLogger > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.AFLogger;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            String AFInAppEventParameterName2 = AFInAppEventParameterName(simpleDateFormat, this.AFLogger);
            String AFInAppEventParameterName3 = AFInAppEventParameterName(simpleDateFormat, this.afWarnLog);
            if (!(currentTimeMillis >= this.AFLogger$LogLevel) && !isStopped()) {
                int i = onResponseError + 39;
                onValidateInAppFailure = i % 128;
                if (i % 2 != 0) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[5];
                    objArr[1] = AFInAppEventParameterName2;
                    objArr[1] = AFInAppEventParameterName3;
                    objArr[3] = Long.valueOf(currentTimeMillis);
                    objArr[5] = Long.valueOf(this.AFLogger$LogLevel);
                    AFLogger.afInfoLog(String.format(locale, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", objArr));
                    return false;
                }
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{AFInAppEventParameterName2, AFInAppEventParameterName3, Long.valueOf(currentTimeMillis), Long.valueOf(this.AFLogger$LogLevel)}));
                return true;
            } else if (!isStopped()) {
                int i2 = onValidateInAppFailure + 67;
                onResponseError = i2 % 128;
                if (i2 % 2 == 0) {
                    Locale locale2 = Locale.US;
                    Object[] objArr2 = new Object[5];
                    objArr2[1] = AFInAppEventParameterName2;
                    objArr2[0] = AFInAppEventParameterName3;
                    objArr2[3] = Long.valueOf(currentTimeMillis);
                    str = String.format(locale2, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", objArr2);
                } else {
                    str = String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{AFInAppEventParameterName2, AFInAppEventParameterName3, Long.valueOf(currentTimeMillis)});
                }
                AFLogger.afInfoLog(str);
            }
        } else {
            if ((!isStopped() ? 'G' : 16) == 'G') {
                onValidateInAppFailure = (onResponseError + 47) % 128;
                AFLogger.afInfoLog("Sending first launch for this session!");
            }
        }
        return false;
    }

    private void values(Context context, String str) {
        AFa1rSDK AFInAppEventType2 = new AFf1qSDK().AFInAppEventType(values().AFKeystoreWrapper().values.AFInAppEventType("appsFlyerCount", 0));
        AFInAppEventType2.AFLogger = str;
        if ((str != null ? '[' : 'N') == '[') {
            onResponseError = (onValidateInAppFailure + 69) % 128;
            if (!(str.length() <= 5)) {
                onValidateInAppFailure = (onResponseError + 111) % 128;
                if (valueOf(AFInAppEventType2, AFInAppEventParameterName(context))) {
                    valueOf(values().values(), new AFa1xSDK(this, AFInAppEventType2, (byte) 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020d, code lost:
        if ((r14 % 2 == 0) == false) goto L_0x0213;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0228  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(com.appsflyer.internal.AFa1rSDK r14) {
        /*
            r13 = this;
            com.appsflyer.internal.AFc1pSDK r0 = r13.values()
            com.appsflyer.internal.AFc1tSDK r0 = r0.init()
            android.content.Context r0 = r0.AFInAppEventType
            if (r0 != 0) goto L_0x0012
            java.lang.String r14 = "sendWithEvent - got null context. skipping event/launch."
            com.appsflyer.AFLogger.afDebugLog(r14)
            return
        L_0x0012:
            android.content.SharedPreferences r1 = AFInAppEventParameterName((android.content.Context) r0)
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2.saveProperties(r1)
            com.appsflyer.internal.AFc1pSDK r2 = r13.values()
            com.appsflyer.internal.AFe1hSDK r2 = r2.AppsFlyer2dXConversionCallback()
            boolean r2 = r2.values()
            if (r2 != 0) goto L_0x0044
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "sendWithEvent from activity: "
            r2.<init>(r3)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
        L_0x0044:
            boolean r0 = r14.valueOf()
            java.util.Map r2 = r13.valueOf((com.appsflyer.internal.AFa1rSDK) r14)
            java.lang.String r3 = "appsflyerKey"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0231
            int r4 = onValidateInAppFailure
            int r4 = r4 + 97
            int r5 = r4 % 128
            onResponseError = r5
            r5 = 2
            int r4 = r4 % r5
            r6 = 0
            if (r4 == 0) goto L_0x0230
            int r3 = r3.length()
            if (r3 == 0) goto L_0x0231
            boolean r3 = r13.isStopped()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0076
            java.lang.String r3 = "AppsFlyerLib.sendWithEvent"
            com.appsflyer.AFLogger.afInfoLog(r3)
        L_0x0076:
            r3 = 0
            int r1 = r13.AFInAppEventType((android.content.SharedPreferences) r1, (boolean) r3)
            com.appsflyer.internal.AFg1mSDK r7 = new com.appsflyer.internal.AFg1mSDK
            com.appsflyer.internal.AFc1wSDK r8 = r13.onDeepLinking
            r7.<init>(r8)
            java.lang.String r8 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r8)
            boolean r9 = r14.valueOf()
            boolean r10 = r14 instanceof com.appsflyer.internal.AFf1ySDK
            boolean r11 = r14 instanceof com.appsflyer.internal.AFf1qSDK
            boolean r12 = r14 instanceof com.appsflyer.internal.AFf1uSDK
            r12 = r12 ^ r4
            if (r12 != r4) goto L_0x0102
            r12 = 10
            if (r11 == 0) goto L_0x009b
            r11 = 12
            goto L_0x009d
        L_0x009b:
            r11 = 10
        L_0x009d:
            if (r11 == r12) goto L_0x00a0
            goto L_0x0102
        L_0x00a0:
            r11 = 56
            if (r10 == 0) goto L_0x00a6
            r12 = 3
            goto L_0x00a8
        L_0x00a6:
            r12 = 56
        L_0x00a8:
            if (r12 == r11) goto L_0x00cf
            java.lang.String r9 = com.appsflyer.internal.AFg1mSDK.afRDLog
            if (r9 != 0) goto L_0x00b0
            r11 = 0
            goto L_0x00b1
        L_0x00b0:
            r11 = 1
        L_0x00b1:
            if (r11 != 0) goto L_0x0116
            int r9 = onValidateInAppFailure
            int r9 = r9 + 87
            int r11 = r9 % 128
            onResponseError = r11
            int r9 = r9 % r5
            if (r9 == 0) goto L_0x00c7
            com.appsflyer.internal.AFg1qSDK r9 = r7.valueOf
            java.lang.String r11 = com.appsflyer.internal.AFg1mSDK.values
            java.lang.String r9 = r9.AFInAppEventType(r11)
            goto L_0x0116
        L_0x00c7:
            com.appsflyer.internal.AFg1qSDK r14 = r7.valueOf
            java.lang.String r0 = com.appsflyer.internal.AFg1mSDK.values
            r14.AFInAppEventType(r0)
            throw r6
        L_0x00cf:
            if (r9 == 0) goto L_0x00f5
            int r9 = onResponseError
            int r9 = r9 + 101
            int r9 = r9 % 128
            onValidateInAppFailure = r9
            if (r1 >= r5) goto L_0x00e8
            java.lang.String r9 = com.appsflyer.internal.AFg1mSDK.AFLogger
            if (r9 != 0) goto L_0x0116
            com.appsflyer.internal.AFg1qSDK r9 = r7.valueOf
            java.lang.String r11 = com.appsflyer.internal.AFg1mSDK.AFKeystoreWrapper
            java.lang.String r9 = r9.AFInAppEventType(r11)
            goto L_0x0116
        L_0x00e8:
            java.lang.String r9 = com.appsflyer.internal.AFg1mSDK.getLevel
            if (r9 != 0) goto L_0x0116
            com.appsflyer.internal.AFg1qSDK r9 = r7.valueOf
            java.lang.String r11 = com.appsflyer.internal.AFg1mSDK.afInfoLog
            java.lang.String r9 = r9.AFInAppEventType(r11)
            goto L_0x0116
        L_0x00f5:
            java.lang.String r9 = com.appsflyer.internal.AFg1mSDK.AFLogger$LogLevel
            if (r9 != 0) goto L_0x0116
            com.appsflyer.internal.AFg1qSDK r9 = r7.valueOf
            java.lang.String r11 = com.appsflyer.internal.AFg1mSDK.afDebugLog
            java.lang.String r9 = r9.AFInAppEventType(r11)
            goto L_0x0116
        L_0x0102:
            java.lang.String r9 = com.appsflyer.internal.AFg1mSDK.afErrorLog
            if (r9 != 0) goto L_0x0116
            int r9 = onResponseError
            int r9 = r9 + 25
            int r9 = r9 % 128
            onValidateInAppFailure = r9
            com.appsflyer.internal.AFg1qSDK r9 = r7.valueOf
            java.lang.String r11 = com.appsflyer.internal.AFg1mSDK.AFInAppEventParameterName
            java.lang.String r9 = r9.AFInAppEventType(r11)
        L_0x0116:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            com.appsflyer.internal.AFc1pSDK r9 = r7.AFInAppEventType
            com.appsflyer.internal.AFc1vSDK r9 = r9.AFKeystoreWrapper()
            com.appsflyer.internal.AFc1tSDK r9 = r9.AFInAppEventParameterName
            android.content.Context r9 = r9.AFInAppEventType
            java.lang.String r9 = r9.getPackageName()
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r9 = com.appsflyer.internal.AFg1mSDK.AFInAppEventParameterName(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            com.appsflyer.internal.AFc1pSDK r7 = r7.AFInAppEventType
            com.appsflyer.internal.AFc1vSDK r7 = r7.AFKeystoreWrapper()
            java.lang.String r7 = r7.AFInAppEventType()
            if (r7 == 0) goto L_0x015e
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = "&channel="
            java.lang.String r7 = r9.concat(r7)
            int r9 = onResponseError
            int r9 = r9 + 13
            int r9 = r9 % 128
            onValidateInAppFailure = r9
            goto L_0x015f
        L_0x015e:
            r7 = r6
        L_0x015f:
            if (r7 != 0) goto L_0x0162
            goto L_0x0163
        L_0x0162:
            r8 = r7
        L_0x0163:
            r10.append(r8)
            java.lang.String r7 = r10.toString()
            r13.AFInAppEventParameterName((java.util.Map<java.lang.String, java.lang.Object>) r2)
            com.appsflyer.internal.AFa1rSDK r14 = r14.AFInAppEventParameterName((java.lang.String) r7)
            com.appsflyer.internal.AFa1rSDK r14 = r14.values(r2)
            com.appsflyer.internal.AFa1dSDK$AFa1zSDK r2 = new com.appsflyer.internal.AFa1dSDK$AFa1zSDK
            com.appsflyer.internal.AFa1rSDK r14 = r14.AFInAppEventType((int) r1)
            r2.<init>(r13, r14, r3)
            if (r0 == r4) goto L_0x0182
            goto L_0x0210
        L_0x0182:
            com.appsflyer.internal.AFg1uSDK[] r14 = r13.afErrorLogForExcManagerOnly()
            int r0 = r14.length
            r1 = 0
            r7 = 0
        L_0x0189:
            if (r1 >= r0) goto L_0x01af
            r8 = r14[r1]
            com.appsflyer.internal.AFg1uSDK$AFa1xSDK r9 = r8.AFLogger
            com.appsflyer.internal.AFg1uSDK$AFa1xSDK r10 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.STARTED
            if (r9 != r10) goto L_0x01ac
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to get "
            r7.<init>(r9)
            java.lang.String r8 = r8.values
            r7.append(r8)
            java.lang.String r8 = " referrer, wait ..."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.appsflyer.AFLogger.afDebugLog(r7)
            r7 = 1
        L_0x01ac:
            int r1 = r1 + 1
            goto L_0x0189
        L_0x01af:
            boolean r14 = r13.onDeepLinkingNative
            r0 = 77
            if (r14 == 0) goto L_0x01b8
            r14 = 28
            goto L_0x01ba
        L_0x01b8:
            r14 = 77
        L_0x01ba:
            if (r14 == r0) goto L_0x01e8
            int r14 = onResponseError
            int r14 = r14 + 65
            int r0 = r14 % 128
            onValidateInAppFailure = r0
            int r14 = r14 % r5
            if (r14 != 0) goto L_0x01e4
            boolean r14 = r13.AFVersionDeclaration()
            if (r14 != 0) goto L_0x01e8
            int r14 = onResponseError
            int r14 = r14 + 107
            int r0 = r14 % 128
            onValidateInAppFailure = r0
            int r14 = r14 % r5
            java.lang.String r0 = "fetching Facebook deferred AppLink data, wait ..."
            if (r14 == 0) goto L_0x01df
            com.appsflyer.AFLogger.afDebugLog(r0)
            r7 = 0
            goto L_0x01e8
        L_0x01df:
            com.appsflyer.AFLogger.afDebugLog(r0)
            r7 = 1
            goto L_0x01e8
        L_0x01e4:
            r13.AFVersionDeclaration()
            throw r6
        L_0x01e8:
            com.appsflyer.internal.AFc1pSDK r14 = r13.values()
            com.appsflyer.internal.AFe1hSDK r14 = r14.AppsFlyer2dXConversionCallback()
            boolean r14 = r14.AFInAppEventParameterName()
            r0 = 89
            if (r14 == 0) goto L_0x01fb
            r14 = 89
            goto L_0x01fd
        L_0x01fb:
            r14 = 64
        L_0x01fd:
            if (r14 != r0) goto L_0x0212
            int r14 = onValidateInAppFailure
            int r14 = r14 + 59
            int r0 = r14 % 128
            onResponseError = r0
            int r14 = r14 % r5
            if (r14 != 0) goto L_0x020c
            r14 = 1
            goto L_0x020d
        L_0x020c:
            r14 = 0
        L_0x020d:
            if (r14 != 0) goto L_0x0210
            goto L_0x0213
        L_0x0210:
            r4 = 0
            goto L_0x0213
        L_0x0212:
            r4 = r7
        L_0x0213:
            com.appsflyer.internal.AFc1pSDK r14 = r13.values()
            java.util.concurrent.ScheduledExecutorService r14 = r14.values()
            if (r4 == 0) goto L_0x0228
            int r0 = onValidateInAppFailure
            int r0 = r0 + 33
            int r0 = r0 % 128
            onResponseError = r0
            r0 = 500(0x1f4, double:2.47E-321)
            goto L_0x022a
        L_0x0228:
            r0 = 0
        L_0x022a:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            valueOf(r14, r2, r0, r3)
            return
        L_0x0230:
            throw r6
        L_0x0231:
            java.lang.String r0 = "Not sending data yet, waiting for dev key"
            com.appsflyer.AFLogger.afDebugLog(r0)
            com.appsflyer.attribution.AppsFlyerRequestListener r14 = r14.AFInAppEventParameterName
            if (r14 == 0) goto L_0x0241
            r0 = 41
            java.lang.String r1 = "No dev key"
            r14.onError(r0, r1)
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AFInAppEventParameterName(com.appsflyer.internal.AFa1rSDK):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if ((r0 == 1 ? 'L' : '#') != '#') goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r0 == 1) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r0 == 0) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if ((r0 != 1) == false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean valueOf(com.appsflyer.internal.AFa1rSDK r5, android.content.SharedPreferences r6) {
        /*
            r4 = this;
            int r0 = onResponseError
            int r0 = r0 + 49
            int r1 = r0 % 128
            onValidateInAppFailure = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            int r0 = r4.AFInAppEventType((android.content.SharedPreferences) r6, (boolean) r2)
            if (r0 != 0) goto L_0x0026
            goto L_0x0020
        L_0x0015:
            int r0 = r4.AFInAppEventType((android.content.SharedPreferences) r6, (boolean) r1)
            if (r0 != r2) goto L_0x001d
            r3 = 0
            goto L_0x001e
        L_0x001d:
            r3 = 1
        L_0x001e:
            if (r3 != 0) goto L_0x0026
        L_0x0020:
            boolean r5 = r5 instanceof com.appsflyer.internal.AFf1uSDK
            if (r5 != 0) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            java.lang.String r3 = "newGPReferrerSent"
            boolean r6 = r6.getBoolean(r3, r1)
            if (r6 != 0) goto L_0x004b
            int r6 = onResponseError
            int r6 = r6 + 33
            int r3 = r6 % 128
            onValidateInAppFailure = r3
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0047
            r6 = 35
            if (r0 != r2) goto L_0x0042
            r0 = 76
            goto L_0x0044
        L_0x0042:
            r0 = 35
        L_0x0044:
            if (r0 == r6) goto L_0x004b
            goto L_0x0049
        L_0x0047:
            if (r0 != r2) goto L_0x004b
        L_0x0049:
            r6 = 1
            goto L_0x004c
        L_0x004b:
            r6 = 0
        L_0x004c:
            if (r6 != 0) goto L_0x0051
            if (r5 != 0) goto L_0x0051
            return r1
        L_0x0051:
            int r5 = onResponseError
            int r5 = r5 + 117
            int r5 = r5 % 128
            onValidateInAppFailure = r5
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.valueOf(com.appsflyer.internal.AFa1rSDK, android.content.SharedPreferences):boolean");
    }

    private void AFInAppEventParameterName(Map<String, Object> map) {
        boolean z = false;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) {
            z = true;
        }
        if (!z) {
            onValidateInAppFailure = (onResponseError + 73) % 128;
            if (map.get("advertiserId") != null) {
                try {
                    if ((AFb1qSDK.valueOf(this.afDebugLog) ? 'A' : ' ') == 'A') {
                        if ((map.remove("android_id") != null ? '&' : '+') != '+') {
                            onValidateInAppFailure = (onResponseError + 1) % 128;
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }
                    }
                    if (AFb1qSDK.valueOf(values().AppsFlyer2dXConversionCallback().AFKeystoreWrapper)) {
                        onResponseError = (onValidateInAppFailure + 109) % 128;
                        if (map.remove("imei") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                        }
                    }
                } catch (Exception e) {
                    AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", e);
                }
            }
        }
    }

    private boolean AFVersionDeclaration() {
        int i = onResponseError + 9;
        onValidateInAppFailure = i % 128;
        if (i % 2 == 0) {
            if ((this.onConversionDataSuccess != null ? 27 : '_') != 27 || this.onConversionDataSuccess.isEmpty()) {
                return false;
            }
            onResponseError = (onValidateInAppFailure + 59) % 128;
            return true;
        }
        throw new ArithmeticException();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0411, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0412, code lost:
        r7 = r0;
        r8 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0416, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        com.appsflyer.AFLogger.afErrorLog(r22, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0374 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0381 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0387 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x039a A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x03ac A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x03bd A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03e7 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0402 A[SYNTHETIC, Splitter:B:160:0x0402] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0416 A[ExcHandler: all (r0v12 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:160:0x0402] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x042e A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0441 A[Catch:{ Exception -> 0x0447 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e3 A[Catch:{ all -> 0x0582 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x05aa A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x05b3 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x05e6 A[SYNTHETIC, Splitter:B:246:0x05e6] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0618 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0637 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0665 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0667 A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x06be A[Catch:{ Exception -> 0x0128, all -> 0x0735 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> valueOf(com.appsflyer.internal.AFa1rSDK r29) {
        /*
            r28 = this;
            r1 = r28
            r2 = r29
            java.lang.String r3 = "is_stop_tracking_used"
            java.lang.String r4 = "af_deeplink"
            java.lang.String r5 = "advertiserId"
            java.lang.String r6 = "versionCode"
            java.lang.String r7 = "Exception while collecting facebook's attribution ID. "
            java.lang.String r8 = "appid"
            java.lang.String r9 = "sdkExtension"
            java.lang.String r10 = "extraReferrers"
            java.lang.String r11 = "yyyy-MM-dd_HHmmssZ"
            com.appsflyer.internal.AFc1pSDK r12 = r28.values()
            com.appsflyer.internal.AFc1tSDK r12 = r12.init()
            android.content.Context r12 = r12.AFInAppEventType
            com.appsflyer.internal.AFc1pSDK r13 = r28.values()
            com.appsflyer.internal.AFe1hSDK r13 = r13.AppsFlyer2dXConversionCallback()
            java.lang.String r13 = r13.valueOf
            java.lang.String r14 = r2.afInfoLog
            java.util.Map<java.lang.String, java.lang.Object> r15 = r2.AFKeystoreWrapper
            if (r15 != 0) goto L_0x0036
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            goto L_0x0038
        L_0x0036:
            java.util.Map<java.lang.String, java.lang.Object> r15 = r2.AFKeystoreWrapper
        L_0x0038:
            r16 = r3
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>(r15)
            java.lang.String r3 = r3.toString()
            java.lang.String r15 = r2.AFLogger
            r17 = r5
            android.content.SharedPreferences r5 = AFInAppEventParameterName((android.content.Context) r12)
            r18 = r4
            boolean r4 = r29.valueOf()
            r19 = r6
            java.lang.String r6 = r2.values
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.AFInAppEventType
            com.appsflyer.internal.AFa1fSDK.AFKeystoreWrapper(r12, r2)
            java.lang.Boolean r20 = com.appsflyer.internal.AFa1fSDK.AFInAppEventType
            if (r20 == 0) goto L_0x0076
            boolean r20 = r20.booleanValue()
            if (r20 != 0) goto L_0x0076
            r20 = r6
            java.util.Map r6 = AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2)
            r21 = r11
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            r22 = r7
            java.lang.String r7 = "ad_ids_disabled"
            r6.put(r7, r11)
            goto L_0x007c
        L_0x0076:
            r20 = r6
            r22 = r7
            r21 = r11
        L_0x007c:
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            long r6 = r6.getTime()
            java.lang.String r11 = ""
            r23 = r8
            r8 = 0
            int r11 = android.text.TextUtils.indexOf(r11, r11, r8)
            r8 = 1
            r24 = r3
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r11 = r11 + 127
            r8 = 0
            r25 = r13
            java.lang.String r13 = ""
            values(r8, r13, r8, r11, r3)
            r11 = 0
            r3 = r3[r11]
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.intern()
            java.lang.String r11 = java.lang.Long.toString(r6)
            r2.put(r3, r11)
            java.lang.String r3 = com.appsflyer.internal.AFc1uSDK.valueOf(r12, r6)
            if (r3 == 0) goto L_0x00b8
            java.lang.String r6 = "cksm_v1"
            r2.put(r6, r3)
        L_0x00b8:
            boolean r3 = r28.isStopped()     // Catch:{ all -> 0x0735 }
            if (r3 != 0) goto L_0x00d6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = "******* sendTrackingWithEvent: "
            r3.<init>(r6)     // Catch:{ all -> 0x0735 }
            if (r4 == 0) goto L_0x00ca
            java.lang.String r6 = "Launch"
            goto L_0x00cb
        L_0x00ca:
            r6 = r14
        L_0x00cb:
            r3.append(r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0735 }
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0735 }
            goto L_0x00db
        L_0x00d6:
            java.lang.String r3 = "Reporting has been stopped"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0735 }
        L_0x00db:
            com.appsflyer.internal.AFc1pSDK r3 = r28.values()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFb1xSDK r3 = r3.onInstallConversionDataLoadedNative()     // Catch:{ all -> 0x0735 }
            r3.AFKeystoreWrapper()     // Catch:{ all -> 0x0735 }
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = r12.getPackageName()     // Catch:{ Exception -> 0x0128 }
            r7 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r6, r7)     // Catch:{ Exception -> 0x0128 }
            java.lang.String[] r3 = r3.requestedPermissions     // Catch:{ Exception -> 0x0128 }
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ Exception -> 0x0128 }
            java.lang.String r6 = "android.permission.INTERNET"
            boolean r6 = r3.contains(r6)     // Catch:{ Exception -> 0x0128 }
            if (r6 != 0) goto L_0x0107
            java.lang.String r6 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ Exception -> 0x0128 }
        L_0x0107:
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = r3.contains(r6)     // Catch:{ Exception -> 0x0128 }
            if (r6 != 0) goto L_0x0114
            java.lang.String r6 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r6)     // Catch:{ Exception -> 0x0128 }
        L_0x0114:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0128 }
            r7 = 32
            if (r6 <= r7) goto L_0x012f
            java.lang.String r6 = "com.google.android.gms.permission.AD_ID"
            boolean r3 = r3.contains(r6)     // Catch:{ Exception -> 0x0128 }
            if (r3 != 0) goto L_0x012f
            java.lang.String r3 = "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r3)     // Catch:{ Exception -> 0x0128 }
            goto L_0x012f
        L_0x0128:
            r0 = move-exception
            r3 = r0
            java.lang.String r6 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.afErrorLog(r6, r3)     // Catch:{ all -> 0x0735 }
        L_0x012f:
            r3 = 0
            int r6 = android.view.KeyEvent.normalizeMetaState(r3)     // Catch:{ all -> 0x0735 }
            r7 = 1
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = ""
            int r6 = 127 - r6
            values(r8, r7, r8, r6, r11)     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = "af_events_api"
            r7 = r11[r3]     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = r7.intern()     // Catch:{ all -> 0x0735 }
            r2.put(r6, r3)     // Catch:{ all -> 0x0735 }
            r3 = 48
            char r3 = android.text.AndroidCharacter.getMirror(r3)     // Catch:{ all -> 0x0735 }
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = ""
            int r3 = 175 - r3
            values(r8, r6, r8, r3, r7)     // Catch:{ all -> 0x0735 }
            r3 = 0
            r6 = r7[r3]     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = r6.intern()     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ all -> 0x0735 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "device"
            java.lang.String r6 = android.os.Build.DEVICE     // Catch:{ all -> 0x0735 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "product"
            java.lang.String r6 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0735 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "sdk"
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0735 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "model"
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ all -> 0x0735 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "deviceType"
            java.lang.String r6 = android.os.Build.TYPE     // Catch:{ all -> 0x0735 }
            r2.put(r3, r6)     // Catch:{ all -> 0x0735 }
            AFKeystoreWrapper((android.content.Context) r12, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0735 }
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFc1pSDK r6 = r28.values()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFe1eSDK r6 = r6.afWarnLog()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFc1pSDK r7 = r28.values()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFf1xSDK r7 = r7.afDebugLog()     // Catch:{ all -> 0x0735 }
            if (r4 == 0) goto L_0x029e
            boolean r11 = afRDLog(r12)     // Catch:{ all -> 0x0735 }
            if (r11 == 0) goto L_0x0203
            boolean r11 = r3.isOtherSdkStringDisabled()     // Catch:{ all -> 0x0735 }
            if (r11 != 0) goto L_0x01cc
            com.appsflyer.internal.AFc1pSDK r11 = r28.values()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFb1bSDK r11 = r11.onResponseNative()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFb1bSDK$AFa1vSDK r11 = r11.valueOf(r12)     // Catch:{ all -> 0x0735 }
            float r11 = r11.AFKeystoreWrapper     // Catch:{ all -> 0x0735 }
            java.lang.String r13 = "batteryLevel"
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0735 }
            r2.put(r13, r11)     // Catch:{ all -> 0x0735 }
        L_0x01cc:
            afInfoLog((android.content.Context) r12)     // Catch:{ all -> 0x0735 }
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0735 }
            r13 = 23
            if (r11 < r13) goto L_0x01de
            java.lang.Class<android.app.UiModeManager> r11 = android.app.UiModeManager.class
            java.lang.Object r11 = r12.getSystemService(r11)     // Catch:{ all -> 0x0735 }
            android.app.UiModeManager r11 = (android.app.UiModeManager) r11     // Catch:{ all -> 0x0735 }
            goto L_0x01e6
        L_0x01de:
            java.lang.String r11 = "uimode"
            java.lang.Object r11 = r12.getSystemService(r11)     // Catch:{ all -> 0x0735 }
            android.app.UiModeManager r11 = (android.app.UiModeManager) r11     // Catch:{ all -> 0x0735 }
        L_0x01e6:
            if (r11 == 0) goto L_0x01f6
            int r11 = r11.getCurrentModeType()     // Catch:{ all -> 0x0735 }
            r13 = 4
            if (r11 != r13) goto L_0x01f6
            java.lang.String r11 = "tv"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0735 }
            r2.put(r11, r13)     // Catch:{ all -> 0x0735 }
        L_0x01f6:
            boolean r11 = com.appsflyer.internal.AFf1wSDK.AFKeystoreWrapper(r12)     // Catch:{ all -> 0x0735 }
            if (r11 == 0) goto L_0x0203
            java.lang.String r11 = "inst_app"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0735 }
            r2.put(r11, r13)     // Catch:{ all -> 0x0735 }
        L_0x0203:
            java.lang.String r11 = "timepassedsincelastlaunch"
            long r26 = r1.afErrorLogForExcManagerOnly(r12)     // Catch:{ all -> 0x0735 }
            java.lang.String r13 = java.lang.Long.toString(r26)     // Catch:{ all -> 0x0735 }
            r2.put(r11, r13)     // Catch:{ all -> 0x0735 }
            AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0735 }
            AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2, (com.appsflyer.internal.AFf1xSDK) r7)     // Catch:{ all -> 0x0735 }
            java.lang.String r11 = r1.onAttributionFailureNative     // Catch:{ all -> 0x0735 }
            if (r11 == 0) goto L_0x021f
            java.lang.String r13 = "phone"
            r2.put(r13, r11)     // Catch:{ all -> 0x0735 }
        L_0x021f:
            boolean r11 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0735 }
            java.lang.String r13 = "referrer"
            if (r11 != 0) goto L_0x022a
            r2.put(r13, r15)     // Catch:{ all -> 0x0735 }
        L_0x022a:
            java.lang.String r11 = r5.getString(r10, r8)     // Catch:{ all -> 0x0735 }
            if (r11 == 0) goto L_0x0233
            r2.put(r10, r11)     // Catch:{ all -> 0x0735 }
        L_0x0233:
            java.lang.String r10 = r3.getReferrer(r12)     // Catch:{ all -> 0x0735 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0735 }
            if (r11 != 0) goto L_0x0246
            java.lang.Object r11 = r2.get(r13)     // Catch:{ all -> 0x0735 }
            if (r11 != 0) goto L_0x0246
            r2.put(r13, r10)     // Catch:{ all -> 0x0735 }
        L_0x0246:
            long r10 = r7.afWarnLog     // Catch:{ all -> 0x0735 }
            r7 = r9
            r8 = 0
            int r15 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r15 == 0) goto L_0x0258
            java.lang.String r15 = "prev_session_dur"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x0735 }
            r2.put(r15, r10)     // Catch:{ all -> 0x0735 }
        L_0x0258:
            android.app.Application r10 = com.appsflyer.internal.AFb1fSDK.AFKeystoreWrapper     // Catch:{ all -> 0x0735 }
            java.lang.String r11 = "exception_number"
            if (r10 != 0) goto L_0x0261
            r8 = -1
            goto L_0x026b
        L_0x0261:
            android.app.Application r10 = com.appsflyer.internal.AFb1fSDK.AFKeystoreWrapper     // Catch:{ all -> 0x0735 }
            android.content.SharedPreferences r10 = AFInAppEventParameterName((android.content.Context) r10)     // Catch:{ all -> 0x0735 }
            long r8 = r10.getLong(r11, r8)     // Catch:{ all -> 0x0735 }
        L_0x026b:
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0735 }
            r2.put(r11, r8)     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFb1dSDK r8 = r1.onResponseNative     // Catch:{ all -> 0x0735 }
            if (r8 == 0) goto L_0x02a2
            java.util.Map<java.lang.String, java.lang.Object> r9 = r8.AFInAppEventType     // Catch:{ all -> 0x0735 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0735 }
            java.lang.String r10 = "partner_data"
            if (r9 != 0) goto L_0x0285
            java.util.Map<java.lang.String, java.lang.Object> r9 = r8.AFInAppEventType     // Catch:{ all -> 0x0735 }
            r2.put(r10, r9)     // Catch:{ all -> 0x0735 }
        L_0x0285:
            java.util.Map<java.lang.String, java.lang.Object> r9 = r8.AFKeystoreWrapper     // Catch:{ all -> 0x0735 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0735 }
            if (r9 != 0) goto L_0x02a2
            java.util.Map r9 = AFInAppEventType((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0735 }
            java.util.Map<java.lang.String, java.lang.Object> r11 = r8.AFKeystoreWrapper     // Catch:{ all -> 0x0735 }
            r9.put(r10, r11)     // Catch:{ all -> 0x0735 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0735 }
            r9.<init>()     // Catch:{ all -> 0x0735 }
            r8.AFKeystoreWrapper = r9     // Catch:{ all -> 0x0735 }
            goto L_0x02a2
        L_0x029e:
            r7 = r9
            AFInAppEventParameterName(r12, r2, r14)     // Catch:{ all -> 0x0735 }
        L_0x02a2:
            java.lang.String r8 = "KSAppsFlyerId"
            java.lang.String r8 = AFInAppEventParameterName((java.lang.String) r8)     // Catch:{ all -> 0x0735 }
            java.lang.String r9 = "KSAppsFlyerRICounter"
            java.lang.String r9 = AFInAppEventParameterName((java.lang.String) r9)     // Catch:{ all -> 0x0735 }
            if (r8 == 0) goto L_0x02c2
            if (r9 == 0) goto L_0x02c2
            int r10 = java.lang.Integer.parseInt(r9)     // Catch:{ all -> 0x0735 }
            if (r10 <= 0) goto L_0x02c2
            java.lang.String r10 = "reinstallCounter"
            r2.put(r10, r9)     // Catch:{ all -> 0x0735 }
            java.lang.String r9 = "originalAppsflyerId"
            r2.put(r9, r8)     // Catch:{ all -> 0x0735 }
        L_0x02c2:
            java.lang.String r8 = "additionalCustomData"
            java.lang.String r8 = AFInAppEventParameterName((java.lang.String) r8)     // Catch:{ all -> 0x0735 }
            if (r8 == 0) goto L_0x02cf
            java.lang.String r9 = "customData"
            r2.put(r9, r8)     // Catch:{ all -> 0x0735 }
        L_0x02cf:
            com.appsflyer.internal.AFc1wSDK r8 = r1.onDeepLinking     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFe1gSDK r8 = r8.afRDLog()     // Catch:{ all -> 0x0735 }
            java.util.Map r8 = r8.AFKeystoreWrapper()     // Catch:{ all -> 0x0735 }
            r2.putAll(r8)     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = r3.getString(r7)     // Catch:{ all -> 0x0735 }
            if (r8 == 0) goto L_0x02eb
            int r9 = r8.length()     // Catch:{ all -> 0x0735 }
            if (r9 <= 0) goto L_0x02eb
            r2.put(r7, r8)     // Catch:{ all -> 0x0735 }
        L_0x02eb:
            com.appsflyer.internal.AFc1pSDK r7 = r28.values()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFc1vSDK r7 = r7.AFKeystoreWrapper()     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = r7.AFInAppEventType()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFb1aSDK r8 = r1.AFKeystoreWrapper((android.content.Context) r12)     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = values((com.appsflyer.internal.AFb1aSDK) r8, (java.lang.String) r7)     // Catch:{ all -> 0x0735 }
            if (r8 == 0) goto L_0x0307
            boolean r9 = r8.equals(r7)     // Catch:{ all -> 0x0735 }
            if (r9 == 0) goto L_0x030b
        L_0x0307:
            if (r8 != 0) goto L_0x0310
            if (r7 == 0) goto L_0x0310
        L_0x030b:
            java.lang.String r8 = "af_latestchannel"
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0310:
            java.lang.String r7 = r1.afErrorLog(r12)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x0323
            java.lang.String r8 = "af_installstore"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = r7.toLowerCase(r9)     // Catch:{ all -> 0x0735 }
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0323:
            java.lang.String r7 = r1.AFVersionDeclaration(r12)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x0336
            java.lang.String r8 = "af_preinstall_name"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = r7.toLowerCase(r9)     // Catch:{ all -> 0x0735 }
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0336:
            java.lang.String r7 = r1.getLevel(r12)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x0349
            java.lang.String r8 = "af_currentstore"
            java.util.Locale r9 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = r7.toLowerCase(r9)     // Catch:{ all -> 0x0735 }
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0349:
            java.lang.String r7 = "appsflyerKey"
            if (r25 == 0) goto L_0x0359
            int r8 = r25.length()     // Catch:{ all -> 0x0735 }
            if (r8 <= 0) goto L_0x0359
            r8 = r25
            r2.put(r7, r8)     // Catch:{ all -> 0x0735 }
            goto L_0x036e
        L_0x0359:
            com.appsflyer.internal.AFc1pSDK r8 = r28.values()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFe1hSDK r8 = r8.AppsFlyer2dXConversionCallback()     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = r8.valueOf     // Catch:{ all -> 0x0735 }
            if (r8 == 0) goto L_0x0729
            int r9 = r8.length()     // Catch:{ all -> 0x0735 }
            if (r9 <= 0) goto L_0x0729
            r2.put(r7, r8)     // Catch:{ all -> 0x0735 }
        L_0x036e:
            java.lang.String r7 = AFInAppEventParameterName()     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x0379
            java.lang.String r8 = "appUserId"
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0379:
            java.lang.String r7 = "userEmails"
            java.lang.String r7 = r3.getString(r7)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x0387
            java.lang.String r8 = "user_emails"
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
            goto L_0x0398
        L_0x0387:
            java.lang.String r7 = "userEmail"
            java.lang.String r7 = AFInAppEventParameterName((java.lang.String) r7)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x0398
            java.lang.String r8 = "sha1_el"
            java.lang.String r7 = com.appsflyer.internal.AFa1aSDK.AFInAppEventParameterName((java.lang.String) r7)     // Catch:{ all -> 0x0735 }
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0398:
            if (r14 == 0) goto L_0x03a6
            java.lang.String r7 = "eventName"
            r2.put(r7, r14)     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = "eventValue"
            r8 = r24
            r2.put(r7, r8)     // Catch:{ all -> 0x0735 }
        L_0x03a6:
            java.lang.String r7 = afErrorLog()     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x03b5
            java.lang.String r7 = AFInAppEventParameterName((java.lang.String) r23)     // Catch:{ all -> 0x0735 }
            r8 = r23
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x03b5:
            java.lang.String r7 = "currencyCode"
            java.lang.String r7 = AFInAppEventParameterName((java.lang.String) r7)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x03df
            int r8 = r7.length()     // Catch:{ all -> 0x0735 }
            r9 = 3
            if (r8 == r9) goto L_0x03da
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0735 }
            java.lang.String r9 = "WARNING: currency code should be 3 characters!!! '"
            r8.<init>(r9)     // Catch:{ all -> 0x0735 }
            r8.append(r7)     // Catch:{ all -> 0x0735 }
            java.lang.String r9 = "' is not a legal value."
            r8.append(r9)     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0735 }
            com.appsflyer.AFLogger.afWarnLog(r8)     // Catch:{ all -> 0x0735 }
        L_0x03da:
            java.lang.String r8 = "currency"
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x03df:
            java.lang.String r7 = "IS_UPDATE"
            java.lang.String r7 = AFInAppEventParameterName((java.lang.String) r7)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x03ec
            java.lang.String r8 = "isUpdate"
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x03ec:
            boolean r7 = r1.isPreInstalledApp(r12)     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = "af_preinstalled"
            java.lang.String r7 = java.lang.Boolean.toString(r7)     // Catch:{ all -> 0x0735 }
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = "collectFacebookAttrId"
            r8 = 1
            boolean r7 = r3.getBoolean(r7, r8)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x0433
            android.content.pm.PackageManager r7 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x041e, all -> 0x0416 }
            java.lang.String r8 = "com.facebook.katana"
            r9 = 0
            r7.getApplicationInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x0411, all -> 0x0416 }
            java.lang.String r7 = r1.getAttributionId(r12)     // Catch:{ NameNotFoundException -> 0x0411, all -> 0x0416 }
            goto L_0x042c
        L_0x0411:
            r0 = move-exception
            r7 = r0
            r8 = r22
            goto L_0x0422
        L_0x0416:
            r0 = move-exception
            r7 = r0
            r8 = r22
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0735 }
            goto L_0x042b
        L_0x041e:
            r0 = move-exception
            r8 = r22
            r7 = r0
        L_0x0422:
            java.lang.String r9 = "com.facebook.katana not found"
            r10 = 1
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r9, r7, r10)     // Catch:{ all -> 0x0735 }
            com.appsflyer.AFLogger.afWarnLog(r8)     // Catch:{ all -> 0x0735 }
        L_0x042b:
            r7 = 0
        L_0x042c:
            if (r7 == 0) goto L_0x0433
            java.lang.String r8 = "fb"
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0433:
            r1.AFInAppEventParameterName((android.content.Context) r12, (java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0735 }
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x0447 }
            r7.<init>(r12)     // Catch:{ Exception -> 0x0447 }
            java.lang.String r7 = com.appsflyer.internal.AFb1rSDK.valueOf(r7)     // Catch:{ Exception -> 0x0447 }
            if (r7 == 0) goto L_0x045e
            java.lang.String r8 = "uid"
            r2.put(r8, r7)     // Catch:{ Exception -> 0x0447 }
            goto L_0x045e
        L_0x0447:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0735 }
            java.lang.String r9 = "ERROR: could not get uid "
            r8.<init>(r9)     // Catch:{ all -> 0x0735 }
            java.lang.String r9 = r7.getMessage()     // Catch:{ all -> 0x0735 }
            r8.append(r9)     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0735 }
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x045e:
            java.lang.String r7 = "lang"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x046c }
            java.lang.String r8 = r8.getDisplayLanguage()     // Catch:{ Exception -> 0x046c }
            r2.put(r7, r8)     // Catch:{ Exception -> 0x046c }
            goto L_0x0473
        L_0x046c:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0473:
            java.lang.String r7 = "lang_code"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r8 = r8.getLanguage()     // Catch:{ Exception -> 0x0481 }
            r2.put(r7, r8)     // Catch:{ Exception -> 0x0481 }
            goto L_0x0488
        L_0x0481:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x0488:
            java.lang.String r7 = "country"
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0496 }
            java.lang.String r8 = r8.getCountry()     // Catch:{ Exception -> 0x0496 }
            r2.put(r7, r8)     // Catch:{ Exception -> 0x0496 }
            goto L_0x049d
        L_0x0496:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.afErrorLog(r8, r7)     // Catch:{ all -> 0x0735 }
        L_0x049d:
            r1.valueOf((java.util.Map<java.lang.String, java.lang.Object>) r2, (boolean) r4)     // Catch:{ all -> 0x0735 }
            r1.values((android.content.Context) r12, (java.util.Map<java.lang.String, ? super java.lang.String>) r2)     // Catch:{ all -> 0x0735 }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0735 }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0735 }
            r9 = r21
            r7.<init>(r9, r8)     // Catch:{ all -> 0x0735 }
            android.content.pm.PackageManager r8 = r12.getPackageManager()     // Catch:{ Exception -> 0x04c5 }
            java.lang.String r10 = r12.getPackageName()     // Catch:{ Exception -> 0x04c5 }
            r11 = 0
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r10, r11)     // Catch:{ Exception -> 0x04c5 }
            long r10 = r8.firstInstallTime     // Catch:{ Exception -> 0x04c5 }
            java.lang.String r8 = "installDate"
            java.lang.String r10 = AFInAppEventParameterName((java.text.SimpleDateFormat) r7, (long) r10)     // Catch:{ Exception -> 0x04c5 }
            r2.put(r8, r10)     // Catch:{ Exception -> 0x04c5 }
            goto L_0x04cc
        L_0x04c5:
            r0 = move-exception
            r8 = r0
            java.lang.String r10 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.afErrorLog(r10, r8)     // Catch:{ all -> 0x0735 }
        L_0x04cc:
            android.content.pm.PackageManager r8 = r12.getPackageManager()     // Catch:{ all -> 0x0582 }
            java.lang.String r10 = r12.getPackageName()     // Catch:{ all -> 0x0582 }
            r11 = 0
            android.content.pm.PackageInfo r8 = r8.getPackageInfo(r10, r11)     // Catch:{ all -> 0x0582 }
            r10 = r19
            int r15 = r5.getInt(r10, r11)     // Catch:{ all -> 0x0582 }
            int r11 = r8.versionCode     // Catch:{ all -> 0x0582 }
            if (r11 <= r15) goto L_0x04ec
            com.appsflyer.internal.AFb1aSDK r11 = r1.AFKeystoreWrapper((android.content.Context) r12)     // Catch:{ all -> 0x0582 }
            int r15 = r8.versionCode     // Catch:{ all -> 0x0582 }
            r11.valueOf(r10, r15)     // Catch:{ all -> 0x0582 }
        L_0x04ec:
            com.appsflyer.internal.AFc1pSDK r10 = r28.values()     // Catch:{ all -> 0x0582 }
            com.appsflyer.internal.AFc1vSDK r10 = r10.AFKeystoreWrapper()     // Catch:{ all -> 0x0582 }
            java.lang.String r11 = "app_version_code"
            int r15 = r8.versionCode     // Catch:{ all -> 0x0582 }
            java.lang.String r15 = java.lang.Integer.toString(r15)     // Catch:{ all -> 0x0582 }
            r2.put(r11, r15)     // Catch:{ all -> 0x0582 }
            com.appsflyer.internal.AFc1tSDK r11 = r10.AFInAppEventParameterName     // Catch:{ all -> 0x0582 }
            android.content.Context r11 = r11.AFInAppEventType     // Catch:{ all -> 0x0582 }
            com.appsflyer.internal.AFc1tSDK r15 = r10.AFInAppEventParameterName     // Catch:{ all -> 0x0582 }
            android.content.Context r15 = r15.AFInAppEventType     // Catch:{ all -> 0x0582 }
            java.lang.String r15 = r15.getPackageName()     // Catch:{ all -> 0x0582 }
            java.lang.String r11 = com.appsflyer.internal.AFa1bSDK.values((android.content.Context) r11, (java.lang.String) r15)     // Catch:{ all -> 0x0582 }
            java.lang.String r15 = "app_version_name"
            r2.put(r15, r11)     // Catch:{ all -> 0x0582 }
            com.appsflyer.internal.AFc1tSDK r10 = r10.AFInAppEventParameterName     // Catch:{ all -> 0x0582 }
            android.content.Context r10 = r10.AFInAppEventType     // Catch:{ all -> 0x0582 }
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()     // Catch:{ all -> 0x0582 }
            int r10 = r10.targetSdkVersion     // Catch:{ all -> 0x0582 }
            java.lang.String r11 = "targetSDKver"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0582 }
            r2.put(r11, r10)     // Catch:{ all -> 0x0582 }
            long r10 = r8.firstInstallTime     // Catch:{ all -> 0x0582 }
            r15 = r14
            long r13 = r8.lastUpdateTime     // Catch:{ all -> 0x057d }
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x057d }
            r21 = r6
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ all -> 0x057b }
            r8.<init>(r9, r6)     // Catch:{ all -> 0x057b }
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x057b }
            r6.<init>(r10)     // Catch:{ all -> 0x057b }
            java.lang.String r6 = r8.format(r6)     // Catch:{ all -> 0x057b }
            java.lang.String r8 = "date1"
            r2.put(r8, r6)     // Catch:{ all -> 0x057b }
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x057b }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x057b }
            r6.<init>(r9, r8)     // Catch:{ all -> 0x057b }
            java.util.Date r8 = new java.util.Date     // Catch:{ all -> 0x057b }
            r8.<init>(r13)     // Catch:{ all -> 0x057b }
            java.lang.String r6 = r6.format(r8)     // Catch:{ all -> 0x057b }
            java.lang.String r8 = "date2"
            r2.put(r8, r6)     // Catch:{ all -> 0x057b }
            java.lang.String r6 = r1.AFInAppEventType((java.text.SimpleDateFormat) r7, (android.content.Context) r12)     // Catch:{ all -> 0x057b }
            float r7 = android.media.AudioTrack.getMaxVolume()     // Catch:{ all -> 0x057b }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ all -> 0x057b }
            java.lang.String r8 = ""
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            int r7 = 128 - r7
            r10 = 0
            values(r10, r8, r10, r7, r9)     // Catch:{ all -> 0x057b }
            r7 = 0
            r8 = r9[r7]     // Catch:{ all -> 0x057b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x057b }
            java.lang.String r7 = r8.intern()     // Catch:{ all -> 0x057b }
            r2.put(r7, r6)     // Catch:{ all -> 0x057b }
            goto L_0x058d
        L_0x057b:
            r0 = move-exception
            goto L_0x0580
        L_0x057d:
            r0 = move-exception
            r21 = r6
        L_0x0580:
            r6 = r0
            goto L_0x0587
        L_0x0582:
            r0 = move-exception
            r21 = r6
            r15 = r14
            goto L_0x0580
        L_0x0587:
            java.lang.String r7 = "Exception while collecting app version data "
            r8 = 1
            com.appsflyer.AFLogger.afErrorLog(r7, r6, r8)     // Catch:{ all -> 0x0735 }
        L_0x058d:
            boolean r6 = com.appsflyer.internal.AFe1jSDK.values(r12)     // Catch:{ all -> 0x0735 }
            r1.AppsFlyer2dXConversionCallback = r6     // Catch:{ all -> 0x0735 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = "didConfigureTokenRefreshService="
            r6.<init>(r7)     // Catch:{ all -> 0x0735 }
            boolean r7 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0735 }
            r6.append(r7)     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0735 }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x0735 }
            boolean r6 = r1.AppsFlyer2dXConversionCallback     // Catch:{ all -> 0x0735 }
            if (r6 != 0) goto L_0x05b1
            java.lang.String r6 = "tokenRefreshConfigured"
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0735 }
            r2.put(r6, r7)     // Catch:{ all -> 0x0735 }
        L_0x05b1:
            if (r4 == 0) goto L_0x05e4
            java.lang.String r6 = r1.AFVersionDeclaration     // Catch:{ all -> 0x0735 }
            if (r6 == 0) goto L_0x05da
            r6 = r18
            java.lang.Object r7 = r2.get(r6)     // Catch:{ all -> 0x0735 }
            if (r7 == 0) goto L_0x05c5
            java.lang.String r6 = "Skip 'af' payload as deeplink was found by path"
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x0735 }
            goto L_0x05da
        L_0x05c5:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = r1.AFVersionDeclaration     // Catch:{ all -> 0x0735 }
            r7.<init>(r8)     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = "isPush"
            java.lang.String r9 = "true"
            r7.put(r8, r9)     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0735 }
            r2.put(r6, r7)     // Catch:{ all -> 0x0735 }
        L_0x05da:
            r6 = 0
            r1.AFVersionDeclaration = r6     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = "open_referrer"
            r7 = r20
            r2.put(r6, r7)     // Catch:{ all -> 0x0735 }
        L_0x05e4:
            if (r4 != 0) goto L_0x0612
            com.appsflyer.internal.AFc1pSDK r6 = r28.values()     // Catch:{ Exception -> 0x05f6 }
            com.appsflyer.internal.AFg1nSDK r6 = r6.AFLogger$LogLevel()     // Catch:{ Exception -> 0x05f6 }
            java.util.Map r6 = r6.values()     // Catch:{ Exception -> 0x05f6 }
            r2.putAll(r6)     // Catch:{ Exception -> 0x05f6 }
            goto L_0x0612
        L_0x05f6:
            r0 = move-exception
            r6 = r0
            java.lang.String r7 = "error while getting sensors data"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r7, r6)     // Catch:{ all -> 0x0735 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = "Unexpected exception from AFSensorManager: "
            r7.<init>(r8)     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0735 }
            r7.append(r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x0735 }
            com.appsflyer.AFLogger.afRDLog(r6)     // Catch:{ all -> 0x0735 }
        L_0x0612:
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r17)     // Catch:{ all -> 0x0735 }
            if (r6 != 0) goto L_0x062d
            com.appsflyer.internal.AFa1fSDK.AFKeystoreWrapper(r12, r2)     // Catch:{ all -> 0x0735 }
            java.lang.String r6 = AFInAppEventParameterName((java.lang.String) r17)     // Catch:{ all -> 0x0735 }
            if (r6 == 0) goto L_0x0623
            r6 = 1
            goto L_0x0624
        L_0x0623:
            r6 = 0
        L_0x0624:
            java.lang.String r7 = "GAID_retry"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0735 }
            r2.put(r7, r6)     // Catch:{ all -> 0x0735 }
        L_0x062d:
            android.content.ContentResolver r6 = r12.getContentResolver()     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFa1eSDK r6 = com.appsflyer.internal.AFa1fSDK.AFInAppEventParameterName((android.content.ContentResolver) r6)     // Catch:{ all -> 0x0735 }
            if (r6 == 0) goto L_0x0649
            java.lang.String r7 = r6.AFKeystoreWrapper     // Catch:{ all -> 0x0735 }
            java.lang.String r8 = "amazon_aid"
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
            java.lang.Boolean r6 = r6.valueOf     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = "amazon_aid_limit"
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0735 }
            r2.put(r7, r6)     // Catch:{ all -> 0x0735 }
        L_0x0649:
            boolean r6 = com.appsflyer.internal.AFe1jSDK.AFInAppEventParameterName((android.content.SharedPreferences) r5)     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = "registeredUninstall"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0735 }
            r2.put(r7, r6)     // Catch:{ all -> 0x0735 }
            int r6 = r1.AFInAppEventType((android.content.SharedPreferences) r5, (boolean) r4)     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = "counter"
            java.lang.String r8 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x0735 }
            r2.put(r7, r8)     // Catch:{ all -> 0x0735 }
            if (r15 == 0) goto L_0x0667
            r7 = 1
            goto L_0x0668
        L_0x0667:
            r7 = 0
        L_0x0668:
            java.lang.String r8 = "iaecounter"
            int r7 = r1.valueOf((android.content.SharedPreferences) r5, (boolean) r7)     // Catch:{ all -> 0x0735 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0735 }
            r2.put(r8, r7)     // Catch:{ all -> 0x0735 }
            r7 = 1
            if (r4 == 0) goto L_0x067c
            if (r6 != r7) goto L_0x067c
            r3.values = r7     // Catch:{ all -> 0x0735 }
        L_0x067c:
            boolean r3 = values((android.content.SharedPreferences) r5)     // Catch:{ all -> 0x0735 }
            r3 = r3 ^ r7
            java.lang.String r7 = "isFirstCall"
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ all -> 0x0735 }
            r2.put(r7, r3)     // Catch:{ all -> 0x0735 }
            r1.values(r12, r4, r2, r6)     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFa1aSDK r3 = new com.appsflyer.internal.AFa1aSDK     // Catch:{ all -> 0x0735 }
            r3.<init>()     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0735 }
            java.lang.String r4 = "af_v"
            r2.put(r4, r3)     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFa1aSDK r3 = new com.appsflyer.internal.AFa1aSDK     // Catch:{ all -> 0x0735 }
            r3.<init>()     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = com.appsflyer.internal.AFa1aSDK.AFInAppEventParameterName((java.util.Map<java.lang.String, java.lang.Object>) r2)     // Catch:{ all -> 0x0735 }
            java.lang.String r4 = "af_v2"
            r2.put(r4, r3)     // Catch:{ all -> 0x0735 }
            boolean r3 = AFLogger$LogLevel(r12)     // Catch:{ all -> 0x0735 }
            java.lang.String r4 = "ivc"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0735 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0735 }
            r3 = r16
            boolean r4 = r5.contains(r3)     // Catch:{ all -> 0x0735 }
            if (r4 == 0) goto L_0x06cc
            java.lang.String r4 = "istu"
            r6 = 0
            boolean r3 = r5.getBoolean(r3, r6)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0735 }
            r2.put(r4, r3)     // Catch:{ all -> 0x0735 }
        L_0x06cc:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0735 }
            r3.<init>()     // Catch:{ all -> 0x0735 }
            java.lang.String r4 = "mcc"
            android.content.res.Resources r5 = r12.getResources()     // Catch:{ all -> 0x0735 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0735 }
            int r5 = r5.mcc     // Catch:{ all -> 0x0735 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0735 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0735 }
            java.lang.String r4 = "mnc"
            android.content.res.Resources r5 = r12.getResources()     // Catch:{ all -> 0x0735 }
            android.content.res.Configuration r5 = r5.getConfiguration()     // Catch:{ all -> 0x0735 }
            int r5 = r5.mnc     // Catch:{ all -> 0x0735 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0735 }
            r3.put(r4, r5)     // Catch:{ all -> 0x0735 }
            java.lang.String r4 = "cell"
            r2.put(r4, r3)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "sig"
            java.lang.String r4 = r21.valueOf()     // Catch:{ all -> 0x0735 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "last_boot_time"
            long r4 = r21.AFInAppEventParameterName()     // Catch:{ all -> 0x0735 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0735 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "disk"
            java.lang.String r4 = r21.values()     // Catch:{ all -> 0x0735 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0735 }
            com.appsflyer.internal.AFb1eSDK r3 = r1.afErrorLog     // Catch:{ all -> 0x0735 }
            if (r3 == 0) goto L_0x073f
            java.lang.String[] r3 = r3.AFKeystoreWrapper     // Catch:{ all -> 0x0735 }
            if (r3 == 0) goto L_0x073f
            java.lang.String r4 = "sharing_filter"
            r2.put(r4, r3)     // Catch:{ all -> 0x0735 }
            goto L_0x073f
        L_0x0729:
            java.lang.String r3 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0735 }
            java.lang.String r3 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0735 }
            r2 = 0
            return r2
        L_0x0735:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = r3.getLocalizedMessage()
            r5 = 1
            com.appsflyer.AFLogger.afErrorLog(r4, r3, r5)
        L_0x073f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.valueOf(com.appsflyer.internal.AFa1rSDK):java.util.Map");
    }

    private void valueOf(Map<String, Object> map, boolean z) {
        onValidateInAppFailure = (onResponseError + 37) % 128;
        map.put("platformextension", this.onAppOpenAttributionNative.AFInAppEventParameterName());
        if (!(!z)) {
            map.put("platform_extension_v2", values().onInstallConversionFailureNative().values());
            onValidateInAppFailure = (onResponseError + 89) % 128;
        }
        onResponseError = (onValidateInAppFailure + 61) % 128;
    }

    public static Map<String, Object> AFInAppEventType(Map<String, Object> map) {
        int i = onValidateInAppFailure + 107;
        onResponseError = i % 128;
        if (!(i % 2 != 0)) {
            map.containsKey("meta");
            throw null;
        } else if (map.containsKey("meta")) {
            onResponseError = (onValidateInAppFailure + 19) % 128;
            return (Map) map.get("meta");
        } else {
            HashMap hashMap = new HashMap();
            map.put("meta", hashMap);
            return hashMap;
        }
    }

    private static boolean values(SharedPreferences sharedPreferences) {
        int i = onValidateInAppFailure + 87;
        onResponseError = i % 128;
        boolean z = i % 2 == 0;
        boolean parseBoolean = Boolean.parseBoolean(sharedPreferences.getString("sentSuccessfully", (String) null));
        if (!z) {
            return parseBoolean;
        }
        throw new ArithmeticException();
    }

    private static void AFKeystoreWrapper(Context context, Map<String, Object> map) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        boolean z = false;
        if (windowManager != null) {
            int i = onValidateInAppFailure + 99;
            onResponseError = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (!z) {
                int rotation = windowManager.getDefaultDisplay().getRotation();
                map.put("sc_o", rotation != 0 ? rotation != 1 ? rotation != 2 ? rotation != 3 ? "" : "lr" : "pr" : "l" : "p");
                onResponseError = (onValidateInAppFailure + 99) % 128;
                return;
            }
            windowManager.getDefaultDisplay().getRotation();
            throw null;
        }
    }

    private void values(Context context, boolean z, Map<String, Object> map, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("cpu_abi", AFInAppEventType("ro.product.cpu.abi"));
        hashMap.put("cpu_abi2", AFInAppEventType("ro.product.cpu.abi2"));
        hashMap.put("arch", AFInAppEventType("os.arch"));
        hashMap.put("build_display_id", AFInAppEventType("ro.build.display.id"));
        if (z) {
            onValidateInAppFailure = (onResponseError + 47) % 128;
            valueOf(context, (Map<String, Object>) hashMap);
            if ((i <= 2 ? 'N' : 8) == 'N') {
                int i2 = onResponseError + 43;
                onValidateInAppFailure = i2 % 128;
                if ((i2 % 2 != 0 ? '\"' : 15) == 15) {
                    hashMap.putAll(values().AFLogger$LogLevel().valueOf());
                } else {
                    hashMap.putAll(values().AFLogger$LogLevel().valueOf());
                    throw new ArithmeticException();
                }
            }
        }
        hashMap.put("dim", values().onConversionDataSuccess().valueOf(context));
        map.put("deviceData", hashMap);
    }

    public final void values(Context context, Map<String, ? super String> map) {
        onValidateInAppFailure = (onResponseError + 23) % 128;
        boolean z = false;
        boolean values2 = values(AppsFlyerProperties.DISABLE_NETWORK_DATA, false);
        AFa1gSDK.AFa1wSDK AFInAppEventType2 = values().onDeepLinkingNative().AFInAppEventType(context);
        map.put("network", AFInAppEventType2.AFKeystoreWrapper);
        Throwable th = null;
        if (!values2) {
            int i = onResponseError + 47;
            onValidateInAppFailure = i % 128;
            if (i % 2 == 0) {
                if ((AFInAppEventType2.valueOf != null ? '=' : '?') == '=') {
                    map.put("operator", AFInAppEventType2.valueOf);
                }
            } else {
                String str = AFInAppEventType2.valueOf;
                throw th;
            }
        }
        if ((!values2 ? 'P' : '\\') != '\\') {
            int i2 = onResponseError + 121;
            onValidateInAppFailure = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
            if (z) {
                String str2 = AFInAppEventType2.AFInAppEventType;
                th.hashCode();
                throw th;
            } else if (AFInAppEventType2.AFInAppEventType != null) {
                map.put("carrier", AFInAppEventType2.AFInAppEventType);
            }
        }
    }

    private void valueOf(Context context, Map<String, Object> map) {
        AFb1bSDK.AFa1vSDK valueOf2 = values().onResponseNative().valueOf(context);
        map.put("btl", Float.toString(valueOf2.AFKeystoreWrapper));
        if (!(valueOf2.valueOf == null)) {
            int i = onValidateInAppFailure + 105;
            onResponseError = i % 128;
            if ((i % 2 == 0 ? (char) 26 : 25) != 26) {
                map.put("btch", valueOf2.valueOf);
            } else {
                map.put("btch", valueOf2.valueOf);
                throw new ArithmeticException();
            }
        }
        onResponseError = (onValidateInAppFailure + 93) % 128;
    }

    private static void AFKeystoreWrapper(Map<String, Object> map) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
        String string2 = AppsFlyerProperties.getInstance().getString("onelinkVersion");
        if ((string != null ? 28 : '.') == 28) {
            map.put("onelink_id", string);
        }
        if (string2 != null) {
            onValidateInAppFailure = (onResponseError + 93) % 128;
            map.put("onelink_ver", string2);
        }
        onValidateInAppFailure = (onResponseError + 125) % 128;
    }

    private static String values(Activity activity) {
        Intent intent;
        onResponseError = (onValidateInAppFailure + 121) % 128;
        String str = null;
        if (!(activity == null || (intent = activity.getIntent()) == null)) {
            int i = onValidateInAppFailure + 95;
            onResponseError = i % 128;
            boolean z = false;
            if (i % 2 != 0) {
                try {
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        z = true;
                    }
                    if (z && (str = extras.getString("af")) != null) {
                        onResponseError = (onValidateInAppFailure + 117) % 128;
                        AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(str)));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                    }
                } catch (Throwable th) {
                    AFLogger.afErrorLog(th.getMessage(), th);
                }
            } else {
                intent.getExtras();
                throw null;
            }
        }
        return str;
    }

    private int AFInAppEventType(SharedPreferences sharedPreferences) {
        onValidateInAppFailure = (onResponseError + 89) % 128;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(sharedPreferences, "appsFlyerAdRevenueCount", true);
        onResponseError = (onValidateInAppFailure + 39) % 128;
        return AFKeystoreWrapper2;
    }

    public final void valueOf(Context context, Map<String, Object> map, Uri uri) {
        AFInAppEventType(context);
        if (!map.containsKey("af_deeplink")) {
            onValidateInAppFailure = (onResponseError + 83) % 128;
            String valueOf2 = valueOf(uri.toString());
            AFb1nSDK onResponseErrorNative2 = values().onResponseErrorNative();
            if (onResponseErrorNative2.valueOf != null) {
                int i = onResponseError + 93;
                onValidateInAppFailure = i % 128;
                if (i % 2 != 0) {
                    Map<String, String> map2 = onResponseErrorNative2.AFInAppEventParameterName;
                    throw null;
                } else if (onResponseErrorNative2.AFInAppEventParameterName != null && valueOf2.contains(onResponseErrorNative2.valueOf)) {
                    Uri.Builder buildUpon = Uri.parse(valueOf2).buildUpon();
                    Uri.Builder buildUpon2 = Uri.EMPTY.buildUpon();
                    for (Map.Entry next : onResponseErrorNative2.AFInAppEventParameterName.entrySet()) {
                        buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                        buildUpon2.appendQueryParameter((String) next.getKey(), (String) next.getValue());
                        onResponseError = (onValidateInAppFailure + 81) % 128;
                    }
                    valueOf2 = buildUpon.build().toString();
                    map.put("appended_query_params", buildUpon2.build().getEncodedQuery());
                    onValidateInAppFailure = (onResponseError + 73) % 128;
                }
            }
            map.put("af_deeplink", valueOf2);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("link", uri.toString());
        AFe1wSDK aFe1wSDK = new AFe1wSDK(values(), UUID.randomUUID(), uri);
        if (aFe1wSDK.AFLogger$LogLevel()) {
            onResponseError = (onValidateInAppFailure + 97) % 128;
            map.put("isBrandedDomain", Boolean.TRUE);
        }
        AFa1bSDK.AFInAppEventType(context, hashMap, uri);
        if (aFe1wSDK.AFVersionDeclaration()) {
            aFe1wSDK.AFLogger = values((Map<String, String>) hashMap);
            AFd1mSDK level = values().getLevel();
            level.AFKeystoreWrapper.execute(new Runnable(aFe1wSDK) {
                private /* synthetic */ AFd1jSDK AFInAppEventType;

                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            return;
        }
        values().onResponseErrorNative().AFInAppEventType(hashMap);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private static String valueOf(String str) {
        int i = onResponseError + 41;
        onValidateInAppFailure = i % 128;
        ? r1 = 0;
        if (i % 2 != 0) {
            throw r1;
        } else if (str == null) {
            return r1;
        } else {
            if (str.matches("fb\\d*?://authorize.*")) {
                int i2 = onValidateInAppFailure + 49;
                onResponseError = i2 % 128;
                if (i2 % 2 == 0) {
                    str.contains("access_token");
                    throw r1;
                } else if (str.contains("access_token")) {
                    onValidateInAppFailure = (onResponseError + 53) % 128;
                    String AFKeystoreWrapper2 = AFKeystoreWrapper(str);
                    if (AFKeystoreWrapper2.length() == 0) {
                        return str;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (AFKeystoreWrapper2.contains("&")) {
                        arrayList = new ArrayList(Arrays.asList(AFKeystoreWrapper2.split("&")));
                    } else {
                        arrayList.add(AFKeystoreWrapper2);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int i3 = onResponseError + 49;
                        onValidateInAppFailure = i3 % 128;
                        if (i3 % 2 == 0) {
                            String str2 = (String) it.next();
                            if (str2.contains("access_token")) {
                                it.remove();
                            } else {
                                if (sb.length() != 0) {
                                    int i4 = onResponseError + 37;
                                    onValidateInAppFailure = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        sb.append("&");
                                    } else {
                                        sb.append("&");
                                        throw new ArithmeticException();
                                    }
                                } else if (!str2.startsWith("?")) {
                                    int i5 = onResponseError + 3;
                                    onValidateInAppFailure = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        sb.append("?");
                                    } else {
                                        sb.append("?");
                                        throw new ArithmeticException();
                                    }
                                }
                                sb.append(str2);
                            }
                        } else {
                            ((String) it.next()).contains("access_token");
                            r1.hashCode();
                            throw r1;
                        }
                    }
                    return str.replace(AFKeystoreWrapper2, sb.toString());
                }
            }
            return str;
        }
    }

    private static String AFKeystoreWrapper(String str) {
        int indexOf = str.indexOf(63);
        if (indexOf != -1) {
            return str.substring(indexOf);
        }
        int i = onResponseError;
        onValidateInAppFailure = (i + 21) % 128;
        int i2 = i + 105;
        onValidateInAppFailure = i2 % 128;
        if ((i2 % 2 != 0 ? 'B' : '9') != 'B') {
            return "";
        }
        throw new ArithmeticException();
    }

    private AFe1wSDK.AFa1wSDK values(final Map<String, String> map) {
        AnonymousClass3 r0 = new AFe1wSDK.AFa1wSDK() {
            public final void AFInAppEventType(String str) {
                AFa1dSDK.this.values().onResponseErrorNative().AFKeystoreWrapper(str, DeepLinkResult.Error.NETWORK);
            }

            public final void valueOf(Map<String, String> map) {
                for (String next : map.keySet()) {
                    map.put(next, map.get(next));
                }
                AFa1dSDK.this.values().onResponseErrorNative().AFInAppEventType(map);
            }
        };
        onResponseError = (onValidateInAppFailure + 71) % 128;
        return r0;
    }

    private static void AFInAppEventParameterName(Context context, Map<String, Object> map, String str) {
        onResponseError = (onValidateInAppFailure + 97) % 128;
        SharedPreferences AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        SharedPreferences.Editor edit = AFInAppEventParameterName2.edit();
        try {
            String string = AFInAppEventParameterName2.getString("prev_event_name", (String) null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("prev_event_timestamp", AFInAppEventParameterName2.getLong("prev_event_timestamp", -1));
                jSONObject.put("prev_event_name", string);
                map.put("prev_event", jSONObject);
            }
            edit.putString("prev_event_name", str).putLong("prev_event_timestamp", System.currentTimeMillis()).apply();
            onResponseError = (onValidateInAppFailure + 119) % 128;
        } catch (Exception e) {
            AFLogger.afErrorLog("Error while processing previous event.", e);
        }
    }

    public static boolean values(Context context) {
        onResponseError = (onValidateInAppFailure + 35) % 128;
        boolean z = false;
        try {
            if (!(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) != 0)) {
                int i = (onValidateInAppFailure + 63) % 128;
                onResponseError = i;
                int i2 = i + 1;
                onValidateInAppFailure = i2 % 128;
                if (i2 % 2 != 0) {
                    z = true;
                }
                if (!z) {
                    return true;
                }
                Throwable th = null;
                th.hashCode();
                throw th;
            }
            onResponseError = (onValidateInAppFailure + 25) % 128;
            try {
                context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
                return false;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        r5 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        r5 = 'P';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004d, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004f, code lost:
        if (r5 == 'P') goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r5 = onValidateInAppFailure + 77;
        onResponseError = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if ((r5 % 2) != 0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r11.put("imei", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r5 == true) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r1 = r1.getBoolean(com.appsflyer.AppsFlyerProperties.COLLECT_ANDROID_ID, false);
        r5 = r2.AFInAppEventParameterName("androidIdCached", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r1 == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if ((!com.appsflyer.internal.AFb1qSDK.valueOf(r9.afDebugLog)) == true) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        onResponseError = (onValidateInAppFailure + 37) % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (afDebugLog(r10) == false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        onResponseError = (onValidateInAppFailure + 47) % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r1 = android.provider.Settings.Secure.getString(r10.getContentResolver(), "android_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a3, code lost:
        if (r1 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (r3 == true) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        if (r5 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        com.appsflyer.AFLogger.afDebugLog("use cached AndroidId: ".concat(java.lang.String.valueOf(r5)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        if (r5 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r1.getBoolean(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bc, code lost:
        com.appsflyer.AFLogger.afDebugLog("use cached AndroidId: ".concat(java.lang.String.valueOf(r5)));
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c8, code lost:
        com.appsflyer.AFLogger.afErrorLog(r1.getMessage(), r1);
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = r9.afDebugLog;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d2, code lost:
        if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d4, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1.getBoolean(com.appsflyer.AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false) != false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r2 = values().afErrorLog();
        r4 = values().AppsFlyer2dXConversionCallback().AFKeystoreWrapper(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (com.appsflyer.internal.AFb1qSDK.valueOf(r4) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventParameterName(android.content.Context r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            r9 = this;
            java.lang.String r0 = "use cached AndroidId: "
            int r1 = onResponseError
            int r1 = r1 + 59
            int r2 = r1 % 128
            onValidateInAppFailure = r2
            int r1 = r1 % 2
            java.lang.String r2 = "deviceTrackingDisabled"
            r3 = 0
            if (r1 == 0) goto L_0x001c
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r4 = r1.getBoolean(r2, r3)
            if (r4 == 0) goto L_0x002c
            goto L_0x0026
        L_0x001c:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r4 = r1.getBoolean(r2, r3)
            if (r4 == 0) goto L_0x002c
        L_0x0026:
            java.lang.String r10 = "true"
            r11.put(r2, r10)
            return
        L_0x002c:
            com.appsflyer.internal.AFc1pSDK r2 = r9.values()
            com.appsflyer.internal.AFb1aSDK r2 = r2.afErrorLog()
            com.appsflyer.internal.AFc1pSDK r4 = r9.values()
            com.appsflyer.internal.AFe1hSDK r4 = r4.AppsFlyer2dXConversionCallback()
            java.lang.String r4 = r4.AFKeystoreWrapper(r2)
            boolean r5 = com.appsflyer.internal.AFb1qSDK.valueOf(r4)
            r6 = 80
            if (r5 != 0) goto L_0x004b
            r5 = 28
            goto L_0x004d
        L_0x004b:
            r5 = 80
        L_0x004d:
            r7 = 0
            r8 = 1
            if (r5 == r6) goto L_0x006c
            int r5 = onValidateInAppFailure
            int r5 = r5 + 77
            int r6 = r5 % 128
            onResponseError = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x005f
            r5 = 1
            goto L_0x0060
        L_0x005f:
            r5 = 0
        L_0x0060:
            java.lang.String r6 = "imei"
            r11.put(r6, r4)
            if (r5 == r8) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            r7.hashCode()
            throw r7
        L_0x006c:
            java.lang.String r4 = "collectAndroidId"
            boolean r1 = r1.getBoolean(r4, r3)
            java.lang.String r4 = "androidIdCached"
            java.lang.String r5 = r2.AFInAppEventParameterName(r4, r7)
            java.lang.String r6 = "android_id"
            if (r1 == 0) goto L_0x00d0
            java.lang.String r1 = r9.afDebugLog
            boolean r1 = com.appsflyer.internal.AFb1qSDK.valueOf(r1)
            r1 = r1 ^ r8
            if (r1 == r8) goto L_0x00d0
            int r1 = onValidateInAppFailure
            int r1 = r1 + 37
            int r1 = r1 % 128
            onResponseError = r1
            boolean r1 = afDebugLog(r10)
            if (r1 == 0) goto L_0x00d5
            int r1 = onValidateInAppFailure
            int r1 = r1 + 47
            int r1 = r1 % 128
            onResponseError = r1
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r6)     // Catch:{ Exception -> 0x00b9 }
            if (r1 == 0) goto L_0x00a6
            r3 = 1
        L_0x00a6:
            if (r3 == r8) goto L_0x00b7
            if (r5 == 0) goto L_0x00d5
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r1 = r0.concat(r1)     // Catch:{ Exception -> 0x00b9 }
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ Exception -> 0x00b9 }
            r7 = r5
            goto L_0x00d5
        L_0x00b7:
            r7 = r1
            goto L_0x00d5
        L_0x00b9:
            r1 = move-exception
            if (r5 == 0) goto L_0x00c8
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r0.concat(r3)
            com.appsflyer.AFLogger.afDebugLog(r0)
            r7 = r5
        L_0x00c8:
            java.lang.String r0 = r1.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L_0x00d5
        L_0x00d0:
            java.lang.String r0 = r9.afDebugLog
            if (r0 == 0) goto L_0x00d5
            r7 = r0
        L_0x00d5:
            if (r7 == 0) goto L_0x00de
            r2.AFKeystoreWrapper(r4, r7)
            r11.put(r6, r7)
            goto L_0x00e3
        L_0x00de:
            java.lang.String r0 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r0)
        L_0x00e3:
            com.appsflyer.internal.AFa1eSDK r10 = com.appsflyer.internal.AFa1fSDK.AFInAppEventParameterName((android.content.Context) r10)
            if (r10 == 0) goto L_0x0112
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Boolean r1 = r10.AFInAppEventParameterName
            java.lang.String r2 = "isManual"
            r0.put(r2, r1)
            java.lang.String r1 = r10.AFKeystoreWrapper
            java.lang.String r2 = "val"
            r0.put(r2, r1)
            java.lang.Boolean r10 = r10.valueOf
            if (r10 == 0) goto L_0x010d
            int r1 = onValidateInAppFailure
            int r1 = r1 + 47
            int r1 = r1 % 128
            onResponseError = r1
            java.lang.String r1 = "isLat"
            r0.put(r1, r10)
        L_0x010d:
            java.lang.String r10 = "oaid"
            r11.put(r10, r0)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AFInAppEventParameterName(android.content.Context, java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean afDebugLog(android.content.Context r4) {
        /*
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            r1 = 0
            java.lang.String r2 = "collectAndroidIdForceByUser"
            boolean r0 = r0.getBoolean(r2, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0034
            int r0 = onValidateInAppFailure
            int r0 = r0 + 41
            int r3 = r0 % 128
            onResponseError = r3
            int r0 = r0 % 2
            java.lang.String r3 = "collectIMEIForceByUser"
            if (r0 != 0) goto L_0x0027
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r1)
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0027:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            boolean r0 = r0.getBoolean(r3, r1)
            if (r0 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r0 = 0
            goto L_0x003d
        L_0x0034:
            int r0 = onValidateInAppFailure
            int r0 = r0 + 89
            int r0 = r0 % 128
            onResponseError = r0
            r0 = 1
        L_0x003d:
            if (r0 != 0) goto L_0x0046
            boolean r4 = values((android.content.Context) r4)
            if (r4 == 0) goto L_0x0046
            return r1
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.afDebugLog(android.content.Context):boolean");
    }

    private static boolean afRDLog(Context context) {
        onValidateInAppFailure = (onResponseError + 123) % 128;
        if (!AFInAppEventParameterName(context).contains("appsFlyerCount")) {
            int i = onValidateInAppFailure + 63;
            onResponseError = i % 128;
            if (i % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String afErrorLog(android.content.Context r6) {
        /*
            r5 = this;
            int r0 = onResponseError
            int r0 = r0 + 11
            int r1 = r0 % 128
            onValidateInAppFailure = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L_0x000f
            r0 = 1
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.String r2 = "INSTALL_STORE"
            r3 = 0
            if (r0 == r1) goto L_0x005a
            android.content.SharedPreferences r0 = AFInAppEventParameterName((android.content.Context) r6)
            boolean r1 = r0.contains(r2)
            if (r1 == 0) goto L_0x0024
            java.lang.String r6 = r0.getString(r2, r3)
            return r6
        L_0x0024:
            boolean r0 = afRDLog(r6)
            if (r0 == 0) goto L_0x004a
            int r0 = onResponseError
            r1 = 61
            int r0 = r0 + r1
            int r4 = r0 % 128
            onValidateInAppFailure = r4
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x003a
            r0 = 15
            goto L_0x003c
        L_0x003a:
            r0 = 61
        L_0x003c:
            if (r0 != r1) goto L_0x0043
            java.lang.String r3 = r5.getLevel(r6)
            goto L_0x0052
        L_0x0043:
            r5.getLevel(r6)
            r3.hashCode()
            throw r3
        L_0x004a:
            int r0 = onResponseError
            int r0 = r0 + 59
            int r0 = r0 % 128
            onValidateInAppFailure = r0
        L_0x0052:
            com.appsflyer.internal.AFb1aSDK r6 = r5.AFKeystoreWrapper((android.content.Context) r6)
            r6.AFKeystoreWrapper(r2, r3)
            return r3
        L_0x005a:
            android.content.SharedPreferences r6 = AFInAppEventParameterName((android.content.Context) r6)
            r6.contains(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.afErrorLog(android.content.Context):java.lang.String");
    }

    private String getLevel(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (!(string != null)) {
            return AFKeystoreWrapper(context, "AF_STORE");
        }
        int i = onResponseError;
        onValidateInAppFailure = (i + 43) % 128;
        onValidateInAppFailure = (i + 115) % 128;
        return string;
    }

    private static String AFInAppEventType(String str) {
        Object obj;
        int i = onResponseError + 9;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? 'b' : '_') != '_') {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                Class[] clsArr = new Class[0];
                clsArr[1] = String.class;
                obj = cls.getMethod("get", clsArr).invoke((Object) null, new Object[]{str});
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
                return null;
            }
        } else {
            obj = Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{str});
        }
        String str2 = (String) obj;
        onValidateInAppFailure = (onResponseError + 97) % 128;
        return str2;
    }

    private String AFKeystoreWrapper(Context context, String str) {
        int i = onResponseError;
        int i2 = i + 105;
        onValidateInAppFailure = i2 % 128;
        if (!(i2 % 2 != 0)) {
            if ((context == null ? 14 : '=') != 14) {
                AFInAppEventType(context);
                return values().AFKeystoreWrapper().values(str);
            }
            onValidateInAppFailure = (i + 45) % 128;
            return null;
        }
        throw null;
    }

    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            int i = onValidateInAppFailure + 109;
            onResponseError = i % 128;
            if ((i % 2 == 0 ? ':' : 7) == 7) {
                try {
                    jSONObject.put("pid", str);
                } catch (JSONException e) {
                    AFLogger.afErrorLog(e.getMessage(), e);
                }
            } else {
                jSONObject.put("pid", str);
                throw null;
            }
        }
        if (str2 != null) {
            jSONObject.put("c", str2);
        }
        if ((str3 != null ? '7' : 18) != 18) {
            jSONObject.put("af_siteid", str3);
        }
        if (jSONObject.has("pid")) {
            AFInAppEventType("preInstallName", jSONObject.toString());
            int i2 = onValidateInAppFailure + 123;
            onResponseError = i2 % 128;
            if (i2 % 2 == 0) {
                throw new ArithmeticException();
            }
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    private static void values(String str) {
        try {
            Throwable th = null;
            if ((new JSONObject(str).has("pid") ? 'F' : 12) != 'F') {
                AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                int i = onValidateInAppFailure + 75;
                onResponseError = i % 128;
                if ((i % 2 == 0 ? '!' : 'C') != 'C') {
                    throw th;
                }
                return;
            }
            int i2 = onValidateInAppFailure + 5;
            onResponseError = i2 % 128;
            if (i2 % 2 != 0) {
                AFInAppEventType("preInstallName", str);
                return;
            }
            AFInAppEventType("preInstallName", str);
            th.hashCode();
            throw th;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private String afWarnLog(Context context) {
        onResponseError = (onValidateInAppFailure + 9) % 128;
        File afInfoLog2 = afInfoLog(AFInAppEventType("ro.appsflyer.preinstall.path"));
        if (AFInAppEventType(afInfoLog2)) {
            afInfoLog2 = afInfoLog(AFKeystoreWrapper(context, "AF_PRE_INSTALL_PATH"));
            onValidateInAppFailure = (onResponseError + 1) % 128;
        }
        if (AFInAppEventType(afInfoLog2)) {
            afInfoLog2 = afInfoLog("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFInAppEventType(afInfoLog2)) {
            afInfoLog2 = afInfoLog("/etc/pre_install.appsflyer");
            onResponseError = (onValidateInAppFailure + 35) % 128;
        }
        ? r3 = 0;
        if (AFInAppEventType(afInfoLog2)) {
            return r3;
        }
        String valueOf2 = valueOf(afInfoLog2, context.getPackageName());
        int i = onValidateInAppFailure + 103;
        onResponseError = i % 128;
        boolean z = false;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            return valueOf2;
        }
        r3.hashCode();
        throw r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC, Splitter:B:16:0x003a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0031=Splitter:B:13:0x0031, B:21:0x0041=Splitter:B:21:0x0041} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String valueOf(java.io.File r5, java.lang.String r6) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x0040, all -> 0x002f }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0040, all -> 0x002f }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x0040, all -> 0x002f }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0040, all -> 0x002f }
            r3.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0040, all -> 0x002f }
            java.nio.charset.Charset r4 = java.nio.charset.Charset.defaultCharset()     // Catch:{ FileNotFoundException -> 0x0040, all -> 0x002f }
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException -> 0x0040, all -> 0x002f }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x0041, all -> 0x002d }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ FileNotFoundException -> 0x0041, all -> 0x002d }
            java.lang.String r5 = r1.getProperty(r6)     // Catch:{ FileNotFoundException -> 0x0041, all -> 0x002d }
            r2.close()     // Catch:{ all -> 0x0024 }
            goto L_0x002c
        L_0x0024:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
        L_0x002c:
            return r5
        L_0x002d:
            r5 = move-exception
            goto L_0x0031
        L_0x002f:
            r5 = move-exception
            r2 = r0
        L_0x0031:
            java.lang.String r6 = r5.getMessage()     // Catch:{ all -> 0x006c }
            com.appsflyer.AFLogger.afErrorLog(r6, r5)     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x006b
            r2.close()     // Catch:{ all -> 0x003e }
            goto L_0x006b
        L_0x003e:
            r5 = move-exception
            goto L_0x0064
        L_0x0040:
            r2 = r0
        L_0x0041:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r6.<init>(r1)     // Catch:{ all -> 0x006c }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x006c }
            r6.append(r5)     // Catch:{ all -> 0x006c }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x006c }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x006c }
            if (r2 == 0) goto L_0x006b
            r2.close()     // Catch:{ all -> 0x003e }
            int r5 = onResponseError
            int r5 = r5 + 29
            int r5 = r5 % 128
            onValidateInAppFailure = r5
            goto L_0x006b
        L_0x0064:
            java.lang.String r6 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r6, r5)
        L_0x006b:
            return r0
        L_0x006c:
            r5 = move-exception
            if (r2 == 0) goto L_0x007c
            r2.close()     // Catch:{ all -> 0x0073 }
            goto L_0x007c
        L_0x0073:
            r6 = move-exception
            java.lang.String r0 = r6.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
            goto L_0x0084
        L_0x007c:
            int r6 = onValidateInAppFailure
            int r6 = r6 + 71
            int r6 = r6 % 128
            onResponseError = r6
        L_0x0084:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.valueOf(java.io.File, java.lang.String):java.lang.String");
    }

    private static boolean AFInAppEventType(File file) {
        int i = onValidateInAppFailure;
        int i2 = i + 19;
        onResponseError = i2 % 128;
        if (i2 % 2 == 0) {
            throw new ArithmeticException();
        } else if (file == null) {
            return true;
        } else {
            onResponseError = (i + 87) % 128;
            return !file.exists();
        }
    }

    private static File afInfoLog(String str) {
        int i = onResponseError + 7;
        int i2 = i % 128;
        onValidateInAppFailure = i2;
        if ((i % 2 != 0 ? 'O' : 'P') != 'P') {
            throw new ArithmeticException();
        } else if (str == null) {
            return null;
        } else {
            int i3 = i2 + 105;
            onResponseError = i3 % 128;
            if (i3 % 2 != 0) {
                try {
                    if (str.trim().length() > 0) {
                        return new File(str.trim());
                    }
                    return null;
                } catch (Throwable th) {
                    AFLogger.afErrorLog(th.getMessage(), th);
                    return null;
                }
            } else {
                throw new ArithmeticException();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    private String AFVersionDeclaration(Context context) {
        String str;
        SharedPreferences AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        String AFInAppEventParameterName3 = AFInAppEventParameterName("preInstallName");
        ? r3 = 0;
        if (AFInAppEventParameterName3 != null) {
            int i = (onValidateInAppFailure + 71) % 128;
            onResponseError = i;
            int i2 = i + 5;
            onValidateInAppFailure = i2 % 128;
            if (i2 % 2 == 0) {
                return AFInAppEventParameterName3;
            }
            r3.hashCode();
            throw r3;
        }
        if (AFInAppEventParameterName2.contains("preInstallName")) {
            int i3 = onResponseError + 103;
            onValidateInAppFailure = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 18 : 4) == 4) {
                str = AFInAppEventParameterName2.getString("preInstallName", r3);
            } else {
                AFInAppEventParameterName2.getString("preInstallName", r3);
                throw new ArithmeticException();
            }
        } else {
            if (afRDLog(context)) {
                int i4 = onResponseError + 69;
                onValidateInAppFailure = i4 % 128;
                if (i4 % 2 == 0) {
                    AFInAppEventParameterName3 = afWarnLog(context);
                    if (AFInAppEventParameterName3 == null) {
                        AFInAppEventParameterName3 = AFKeystoreWrapper(context, "AF_PRE_INSTALL_NAME");
                    }
                } else {
                    afWarnLog(context);
                    throw r3;
                }
            }
            if (AFInAppEventParameterName3 != null) {
                AFKeystoreWrapper(context).AFKeystoreWrapper("preInstallName", AFInAppEventParameterName3);
            }
            str = AFInAppEventParameterName3;
        }
        if (str != null) {
            AFInAppEventType("preInstallName", str);
        }
        return str;
    }

    public final boolean isPreInstalledApp(Context context) {
        boolean z = true;
        try {
            if (((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0 ? '`' : '8') == '`') {
                onResponseError = (onValidateInAppFailure + 67) % 128;
                return true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
        int i = onResponseError + 81;
        onValidateInAppFailure = i % 128;
        if (i % 2 == 0) {
            z = false;
        }
        if (!z) {
            return false;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    public static String values(AFb1aSDK aFb1aSDK, String str) {
        onValidateInAppFailure = (onResponseError + 111) % 128;
        String AFInAppEventParameterName2 = aFb1aSDK.AFInAppEventParameterName("CACHED_CHANNEL", (String) null);
        boolean z = false;
        if (AFInAppEventParameterName2 == null) {
            aFb1aSDK.AFKeystoreWrapper("CACHED_CHANNEL", str);
            return str;
        }
        int i = onValidateInAppFailure + 103;
        onResponseError = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    private String AFInAppEventType(SimpleDateFormat simpleDateFormat, Context context) {
        String str;
        onValidateInAppFailure = (onResponseError + 61) % 128;
        String string = AFInAppEventParameterName(context).getString("appsFlyerFirstInstall", (String) null);
        if (!(string != null)) {
            if (afRDLog(context)) {
                AFLogger.afDebugLog("AppsFlyer: first launch detected");
                str = simpleDateFormat.format(new Date());
            } else {
                str = "";
            }
            string = str;
            AFKeystoreWrapper(context).AFKeystoreWrapper("appsFlyerFirstInstall", string);
            onResponseError = (onValidateInAppFailure + 125) % 128;
        }
        AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(string)));
        return string;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public final String getAttributionId(Context context) {
        ? r0 = 0;
        try {
            String AFInAppEventType2 = new AFb1zSDK(context, values()).AFInAppEventType();
            int i = onResponseError + 113;
            onValidateInAppFailure = i % 128;
            if ((i % 2 != 0 ? 'K' : 6) != 'K') {
                return AFInAppEventType2;
            }
            r0.hashCode();
            throw r0;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return r0;
        }
    }

    public static SharedPreferences AFInAppEventParameterName(Context context) {
        SharedPreferences sharedPreferences;
        AFa1dSDK valueOf2;
        Context applicationContext;
        String str;
        synchronized (AFa1dSDK.class) {
            onResponseError = (onValidateInAppFailure + 43) % 128;
            if ((valueOf().onResponseErrorNative == null ? ';' : 1) != 1) {
                int i = onValidateInAppFailure + 63;
                onResponseError = i % 128;
                if (!(i % 2 != 0)) {
                    valueOf2 = valueOf();
                    applicationContext = context.getApplicationContext();
                    str = "appsflyer-data";
                } else {
                    valueOf2 = valueOf();
                    applicationContext = context.getApplicationContext();
                    str = "appsflyer-data";
                }
                valueOf2.onResponseErrorNative = applicationContext.getSharedPreferences(str, 0);
            }
            sharedPreferences = valueOf().onResponseErrorNative;
        }
        return sharedPreferences;
    }

    public final AFb1aSDK AFKeystoreWrapper(Context context) {
        int i = onResponseError + 57;
        onValidateInAppFailure = i % 128;
        if (!(i % 2 != 0)) {
            AFInAppEventType(context);
            return values().afErrorLog();
        }
        AFInAppEventType(context);
        values().afErrorLog();
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    public final int AFInAppEventType(SharedPreferences sharedPreferences, boolean z) {
        int i = onValidateInAppFailure + 95;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? '5' : '$') != '5') {
            return AFKeystoreWrapper(sharedPreferences, "appsFlyerCount", z);
        }
        AFKeystoreWrapper(sharedPreferences, "appsFlyerCount", z);
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private int valueOf(SharedPreferences sharedPreferences, boolean z) {
        onResponseError = (onValidateInAppFailure + 21) % 128;
        int AFKeystoreWrapper2 = AFKeystoreWrapper(sharedPreferences, "appsFlyerInAppEventCount", z);
        int i = onValidateInAppFailure + 1;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? '$' : 10) != '$') {
            return AFKeystoreWrapper2;
        }
        throw null;
    }

    private int AFKeystoreWrapper(SharedPreferences sharedPreferences, String str, boolean z) {
        onValidateInAppFailure = (onResponseError + 17) % 128;
        int i = sharedPreferences.getInt(str, 0);
        if ((z ? '1' : 6) == '1') {
            i++;
            sharedPreferences.edit().putInt(str, i).apply();
            onValidateInAppFailure = (onResponseError + 15) % 128;
        }
        if ((values().afErrorLogForExcManagerOnly().afRDLog() ? 'O' : '>') == 'O') {
            values().afErrorLogForExcManagerOnly().AFInAppEventType(String.valueOf(i));
        }
        int i2 = onResponseError + 21;
        onValidateInAppFailure = i2 % 128;
        if ((i2 % 2 != 0 ? ',' : 'V') == 'V') {
            return i;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if ((r0 > 0 ? 0 : '@') != 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r0 > 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        onResponseError = (onValidateInAppFailure + 91) % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long afErrorLogForExcManagerOnly(android.content.Context r8) {
        /*
            r7 = this;
            int r0 = onResponseError
            int r0 = r0 + 67
            int r1 = r0 % 128
            onValidateInAppFailure = r1
            int r0 = r0 % 2
            r1 = 97
            if (r0 == 0) goto L_0x0011
            r0 = 25
            goto L_0x0013
        L_0x0011:
            r0 = 97
        L_0x0013:
            r2 = 0
            java.lang.String r4 = "AppsFlyerTimePassedSincePrevLaunch"
            if (r0 == r1) goto L_0x0037
            android.content.SharedPreferences r0 = AFInAppEventParameterName((android.content.Context) r8)
            long r0 = r0.getLong(r4, r2)
            long r5 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFb1aSDK r8 = r7.AFKeystoreWrapper((android.content.Context) r8)
            r8.AFInAppEventType((java.lang.String) r4, (long) r5)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0032
            r8 = 0
            goto L_0x0034
        L_0x0032:
            r8 = 64
        L_0x0034:
            if (r8 == 0) goto L_0x004e
            goto L_0x005b
        L_0x0037:
            android.content.SharedPreferences r0 = AFInAppEventParameterName((android.content.Context) r8)
            long r0 = r0.getLong(r4, r2)
            long r5 = java.lang.System.currentTimeMillis()
            com.appsflyer.internal.AFb1aSDK r8 = r7.AFKeystoreWrapper((android.content.Context) r8)
            r8.AFInAppEventType((java.lang.String) r4, (long) r5)
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x005b
        L_0x004e:
            long r5 = r5 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r0
            int r8 = onValidateInAppFailure
            int r8 = r8 + 113
            int r8 = r8 % 128
            onResponseError = r8
            return r5
        L_0x005b:
            int r8 = onValidateInAppFailure
            int r8 = r8 + 91
            int r8 = r8 % 128
            onResponseError = r8
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.afErrorLogForExcManagerOnly(android.content.Context):long");
    }

    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String str6;
        Context context2 = context;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        AFb1uSDK afErrorLogForExcManagerOnly2 = values().afErrorLogForExcManagerOnly();
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str7;
        strArr[3] = str8;
        strArr[4] = str9;
        if (map == null) {
            str6 = "";
        } else {
            str6 = map.toString();
        }
        strArr[5] = str6;
        afErrorLogForExcManagerOnly2.AFKeystoreWrapper("validateAndTrackInAppPurchase", strArr);
        if (!isStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str7);
            sb.append(" ");
            sb.append(str8);
            sb.append(" ");
            sb.append(str9);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str == null || str8 == null || str2 == null || str9 == null || str7 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFInAppEventType;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        new Thread(new AFa1jSDK(context.getApplicationContext(), values().AppsFlyer2dXConversionCallback().valueOf, str, str2, str3, str4, str5, map, context2 instanceof Activity ? ((Activity) context2).getIntent() : null)).start();
    }

    private static void valueOf(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        int i = onValidateInAppFailure + 49;
        onResponseError = i % 128;
        if (i % 2 != 0) {
            try {
                scheduledExecutorService.schedule(runnable, j, timeUnit);
                int i2 = onResponseError + 37;
                onValidateInAppFailure = i2 % 128;
                if ((i2 % 2 != 0 ? ')' : 'S') != 'S') {
                    throw null;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
            }
        } else {
            scheduledExecutorService.schedule(runnable, j, timeUnit);
            throw new ArithmeticException();
        }
    }

    @Deprecated
    public final boolean isStopped() {
        int i = onResponseError + 19;
        onValidateInAppFailure = i % 128;
        boolean z = false;
        Throwable th = null;
        if (i % 2 == 0) {
            boolean values2 = values().AppsFlyer2dXConversionCallback().values();
            int i2 = onValidateInAppFailure + 105;
            onResponseError = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return values2;
            }
            th.hashCode();
            throw th;
        }
        values().AppsFlyer2dXConversionCallback().values();
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x007e A[SYNTHETIC, Splitter:B:35:0x007e] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String AFKeystoreWrapper(java.net.HttpURLConnection r11) {
        /*
            java.lang.String r0 = "readServerResponse error"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 82
            java.io.InputStream r6 = r11.getErrorStream()     // Catch:{ all -> 0x005f }
            r7 = 35
            if (r6 != 0) goto L_0x0017
            r8 = 82
            goto L_0x0019
        L_0x0017:
            r8 = 35
        L_0x0019:
            if (r8 == r7) goto L_0x001f
            java.io.InputStream r6 = r11.getInputStream()     // Catch:{ all -> 0x005f }
        L_0x001f:
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x005f }
            java.nio.charset.Charset r8 = java.nio.charset.Charset.defaultCharset()     // Catch:{ all -> 0x005f }
            r7.<init>(r6, r8)     // Catch:{ all -> 0x005f }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x005a }
            r6.<init>(r7)     // Catch:{ all -> 0x005a }
            r2 = 0
        L_0x002e:
            java.lang.String r8 = r6.readLine()     // Catch:{ all -> 0x0058 }
            if (r8 == 0) goto L_0x004f
            if (r2 == 0) goto L_0x0045
            int r2 = onResponseError
            int r2 = r2 + 73
            int r2 = r2 % 128
            onValidateInAppFailure = r2
            r2 = 10
            java.lang.Character r2 = java.lang.Character.valueOf(r2)     // Catch:{ all -> 0x0058 }
            goto L_0x0047
        L_0x0045:
            java.lang.String r2 = ""
        L_0x0047:
            r1.append(r2)     // Catch:{ all -> 0x0058 }
            r1.append(r8)     // Catch:{ all -> 0x0058 }
            r2 = 1
            goto L_0x002e
        L_0x004f:
            r6.close()     // Catch:{ all -> 0x0056 }
        L_0x0052:
            r7.close()     // Catch:{ all -> 0x0056 }
            goto L_0x00a6
        L_0x0056:
            r11 = move-exception
            goto L_0x00a3
        L_0x0058:
            r2 = move-exception
            goto L_0x0063
        L_0x005a:
            r6 = move-exception
            r10 = r6
            r6 = r2
            r2 = r10
            goto L_0x0063
        L_0x005f:
            r6 = move-exception
            r7 = r2
            r2 = r6
            r6 = r7
        L_0x0063:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d5 }
            java.lang.String r9 = "Could not read connection response from: "
            r8.<init>(r9)     // Catch:{ all -> 0x00d5 }
            java.net.URL r11 = r11.getURL()     // Catch:{ all -> 0x00d5 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00d5 }
            r8.append(r11)     // Catch:{ all -> 0x00d5 }
            java.lang.String r11 = r8.toString()     // Catch:{ all -> 0x00d5 }
            com.appsflyer.AFLogger.afErrorLog(r11, r2)     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0081
            r6.close()     // Catch:{ all -> 0x0056 }
        L_0x0081:
            r11 = 2
            if (r7 == 0) goto L_0x0086
            r2 = 2
            goto L_0x0088
        L_0x0086:
            r2 = 82
        L_0x0088:
            if (r2 == r5) goto L_0x00a6
            int r2 = onValidateInAppFailure
            int r2 = r2 + 113
            int r5 = r2 % 128
            onResponseError = r5
            int r2 = r2 % r11
            if (r2 != 0) goto L_0x0096
            goto L_0x0097
        L_0x0096:
            r3 = 1
        L_0x0097:
            if (r3 == 0) goto L_0x009a
            goto L_0x0052
        L_0x009a:
            r7.close()     // Catch:{ all -> 0x0056 }
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException     // Catch:{ all -> 0x0056 }
            r11.<init>()     // Catch:{ all -> 0x0056 }
            throw r11     // Catch:{ all -> 0x0056 }
        L_0x00a3:
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r11)
        L_0x00a6:
            java.lang.String r11 = r1.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b0 }
            r0.<init>(r11)     // Catch:{ JSONException -> 0x00b0 }
            return r11
        L_0x00b0:
            r0 = move-exception
            java.lang.String r1 = "error while parsing readServerResponse"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r11)     // Catch:{ JSONException -> 0x00c5 }
            java.lang.String r11 = r0.toString()     // Catch:{ JSONException -> 0x00c5 }
            return r11
        L_0x00c5:
            r11 = move-exception
            java.lang.String r0 = "RESPONSE_NOT_JSON error"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r11)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.lang.String r11 = r11.toString()
            return r11
        L_0x00d5:
            r11 = move-exception
            if (r6 == 0) goto L_0x00de
            r6.close()     // Catch:{ all -> 0x00dc }
            goto L_0x00de
        L_0x00dc:
            r1 = move-exception
            goto L_0x00f8
        L_0x00de:
            if (r7 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r3 = 1
        L_0x00e2:
            if (r3 != 0) goto L_0x00fb
            int r1 = onResponseError
            int r1 = r1 + 23
            int r1 = r1 % 128
            onValidateInAppFailure = r1
            r7.close()     // Catch:{ all -> 0x00dc }
            int r0 = onResponseError
            int r0 = r0 + 73
            int r0 = r0 % 128
            onValidateInAppFailure = r0
            goto L_0x00fb
        L_0x00f8:
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r0, r1)
        L_0x00fb:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.AFKeystoreWrapper(java.net.HttpURLConnection):java.lang.String");
    }

    private static boolean AFLogger$LogLevel(Context context) {
        NetworkCapabilities networkCapabilities;
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                onResponseError = (onValidateInAppFailure + 45) % 128;
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    Network[] allNetworks = connectivityManager.getAllNetworks();
                    int length = allNetworks.length;
                    for (int i = 0; i < length; i++) {
                        int i2 = onValidateInAppFailure + 113;
                        onResponseError = i2 % 128;
                        if (i2 % 2 == 0) {
                            networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                            if (!networkCapabilities.hasTransport(2)) {
                                continue;
                            }
                        } else {
                            networkCapabilities = connectivityManager.getNetworkCapabilities(allNetworks[i]);
                            if (!networkCapabilities.hasTransport(4)) {
                                continue;
                            }
                        }
                        if ((!networkCapabilities.hasCapability(15) ? 'T' : 10) != 10) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator<T> it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                        onResponseError = (onValidateInAppFailure + 19) % 128;
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog("Failed collecting ivc data", e2);
                }
            }
        }
        onResponseError = (onValidateInAppFailure + 49) % 128;
        return false;
    }

    public final void setHost(String str, String str2) {
        String str3;
        if (AFb1qSDK.AFInAppEventParameterName(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i = (onResponseError + 29) % 128;
        onValidateInAppFailure = i;
        if ((str != null ? 3 : '0') != '0') {
            str3 = str.trim();
        } else {
            onResponseError = (i + 39) % 128;
            str3 = "";
        }
        AFd1qSDK.valueOf(new AFd1pSDK(str3, str2.trim()));
    }

    public final String getHostName() {
        onValidateInAppFailure = (onResponseError + 65) % 128;
        String valueOf2 = values().onAppOpenAttributionNative().valueOf();
        int i = onValidateInAppFailure + 105;
        onResponseError = i % 128;
        if ((i % 2 == 0 ? 26 : 'S') == 'S') {
            return valueOf2;
        }
        throw new ArithmeticException();
    }

    public final String getHostPrefix() {
        int i = onValidateInAppFailure + 111;
        onResponseError = i % 128;
        Throwable th = null;
        if (!(i % 2 == 0)) {
            String values2 = values().onAppOpenAttributionNative().values();
            int i2 = onResponseError + 107;
            onValidateInAppFailure = i2 % 128;
            if ((i2 % 2 != 0 ? '#' : 23) == 23) {
                return values2;
            }
            th.hashCode();
            throw th;
        }
        values().onAppOpenAttributionNative().values();
        th.hashCode();
        throw th;
    }

    public final void setMinTimeBetweenSessions(int i) {
        int i2 = onValidateInAppFailure + 75;
        onResponseError = i2 % 128;
        if ((i2 % 2 == 0 ? (char) 20 : 18) == 18) {
            this.AFLogger$LogLevel = TimeUnit.SECONDS.toMillis((long) i);
            onValidateInAppFailure = (onResponseError + 51) % 128;
            return;
        }
        this.AFLogger$LogLevel = TimeUnit.SECONDS.toMillis((long) i);
        throw new ArithmeticException();
    }

    private AFg1uSDK[] afErrorLogForExcManagerOnly() {
        onResponseError = (onValidateInAppFailure + 119) % 128;
        AFg1uSDK[] AFInAppEventParameterName2 = values().AFVersionDeclaration().AFInAppEventParameterName();
        int i = onResponseError + 117;
        onValidateInAppFailure = i % 128;
        if (!(i % 2 != 0)) {
            return AFInAppEventParameterName2;
        }
        throw null;
    }

    final class AFa1xSDK implements Runnable {
        private final AFa1rSDK valueOf;

        /* synthetic */ AFa1xSDK(AFa1dSDK aFa1dSDK, AFa1rSDK aFa1rSDK, byte b) {
            this(aFa1rSDK);
        }

        private AFa1xSDK(AFa1rSDK aFa1rSDK) {
            this.valueOf = aFa1rSDK;
        }

        public final void run() {
            AFa1dSDK.valueOf(AFa1dSDK.this, this.valueOf);
        }
    }

    final class AFa1zSDK implements Runnable {
        private final AFa1rSDK AFInAppEventParameterName;

        /* synthetic */ AFa1zSDK(AFa1dSDK aFa1dSDK, AFa1rSDK aFa1rSDK, byte b) {
            this(aFa1rSDK);
        }

        private AFa1zSDK(AFa1rSDK aFa1rSDK) {
            this.AFInAppEventParameterName = aFa1rSDK;
        }

        public final void run() {
            AFe1ySDK aFe1ySDK;
            if (this.AFInAppEventParameterName.valueOf()) {
                AFe1ySDK aFe1ySDK2 = new AFe1ySDK(this.AFInAppEventParameterName, AFa1dSDK.this.values());
                aFe1ySDK2.AFLogger$LogLevel = AFa1dSDK.values(AFa1dSDK.this);
                aFe1ySDK = aFe1ySDK2;
            } else {
                aFe1ySDK = new AFe1uSDK(this.AFInAppEventParameterName, AFa1dSDK.this.values());
            }
            AFd1mSDK level = AFa1dSDK.this.values().getLevel();
            level.AFKeystoreWrapper.execute(new Runnable(aFe1ySDK) {
                private /* synthetic */ AFd1jSDK AFInAppEventType;

                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
    }

    public final void setPluginInfo(PluginInfo pluginInfo) {
        int i = onResponseError + 107;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? '`' : 'K') != '`') {
            Objects.requireNonNull(pluginInfo);
            values().onInstallConversionFailureNative().valueOf(pluginInfo);
            int i2 = onResponseError + 25;
            onValidateInAppFailure = i2 % 128;
            boolean z = false;
            if (i2 % 2 != 0) {
                z = true;
            }
            if (z) {
                Throwable th = null;
                th.hashCode();
                throw th;
            }
            return;
        }
        Objects.requireNonNull(pluginInfo);
        values().onInstallConversionFailureNative().valueOf(pluginInfo);
        throw new ArithmeticException();
    }

    final class AFa1ySDK implements AFd1nSDK {
        public final void AFInAppEventType(AFd1jSDK<?> aFd1jSDK) {
        }

        private AFa1ySDK() {
        }

        /* synthetic */ AFa1ySDK(AFa1dSDK aFa1dSDK, byte b) {
            this();
        }

        public final void AFInAppEventParameterName(AFd1jSDK<?> aFd1jSDK) {
            if (aFd1jSDK instanceof AFe1ySDK) {
                AFa1dSDK.this.values().afDebugLog().AFInAppEventType(((AFe1uSDK) aFd1jSDK).AFLogger.afDebugLog);
            }
        }

        public final void AFInAppEventParameterName(AFd1jSDK<?> aFd1jSDK, AFd1sSDK aFd1sSDK) {
            JSONObject valueOf;
            AFe1fSDK valueOf2;
            if (aFd1jSDK instanceof AFe1uSDK) {
                AFe1uSDK aFe1uSDK = (AFe1uSDK) aFd1jSDK;
                boolean z = aFd1jSDK instanceof AFe1ySDK;
                if (z && values()) {
                    AFe1ySDK aFe1ySDK = (AFe1ySDK) aFd1jSDK;
                    boolean z2 = true;
                    if (!(aFe1ySDK.values == AFd1sSDK.SUCCESS || aFe1ySDK.AFInAppEventParameterName == 1)) {
                        z2 = false;
                    }
                    if (z2) {
                        AFe1dSDK aFe1dSDK = new AFe1dSDK(aFe1ySDK, AFa1dSDK.this.values().afErrorLog());
                        AFd1mSDK level = AFa1dSDK.this.values().getLevel();
                        level.AFKeystoreWrapper.execute(new Runnable(aFe1dSDK) {
                            private /* synthetic */ AFd1jSDK AFInAppEventType;

                            /*  JADX ERROR: Method generation error
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                */
                            /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                                */
                            public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
                            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.util.ArrayList.forEach(ArrayList.java:1259)
                            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                            
*/
                        });
                    }
                }
                if (aFd1sSDK == AFd1sSDK.SUCCESS) {
                    AFa1dSDK aFa1dSDK = AFa1dSDK.this;
                    aFa1dSDK.AFKeystoreWrapper((Context) AFa1dSDK.valueOf(aFa1dSDK)).AFKeystoreWrapper("sentSuccessfully", "true");
                    if (!(aFd1jSDK instanceof AFe1sSDK) && (valueOf2 = new AFe1jSDK(AFa1dSDK.valueOf(AFa1dSDK.this)).valueOf()) != null && valueOf2.AFInAppEventType()) {
                        String str = valueOf2.values;
                        AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                        AFe1jSDK.AFInAppEventParameterName(str);
                    }
                    AFd1tSDK<Result> aFd1tSDK = aFe1uSDK.afInfoLog;
                    if (!(aFd1tSDK == null || (valueOf = AFb1pSDK.valueOf((String) aFd1tSDK.getBody())) == null)) {
                        AFa1dSDK.AFKeystoreWrapper(AFa1dSDK.this, valueOf.optBoolean("send_background", false));
                    }
                    if (z) {
                        AFa1dSDK.valueOf(AFa1dSDK.this, System.currentTimeMillis());
                    }
                }
            } else if ((aFd1jSDK instanceof AFe1dSDK) && aFd1sSDK != AFd1sSDK.SUCCESS) {
                AFe1aSDK aFe1aSDK = new AFe1aSDK(AFa1dSDK.this.values());
                AFd1mSDK level2 = AFa1dSDK.this.values().getLevel();
                level2.AFKeystoreWrapper.execute(new Runnable(aFe1aSDK) {
                    private /* synthetic */ AFd1jSDK AFInAppEventType;

                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
            }
        }

        private boolean values() {
            return AFa1dSDK.this.AFInAppEventParameterName != null;
        }
    }

    public final void AFInAppEventType(Context context) {
        int i = onValidateInAppFailure + 13;
        onResponseError = i % 128;
        if (i % 2 != 0) {
            AFc1wSDK aFc1wSDK = this.onDeepLinking;
            boolean z = true;
            if (context != null) {
                AFc1tSDK aFc1tSDK = aFc1wSDK.AFKeystoreWrapper;
                if (context == null) {
                    z = false;
                }
                if (z) {
                    aFc1tSDK.AFInAppEventType = context.getApplicationContext();
                    onValidateInAppFailure = (onResponseError + 117) % 128;
                    return;
                }
                return;
            }
            return;
        }
        throw new ArithmeticException();
    }

    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        onValidateInAppFailure = (onResponseError + 7) % 128;
        AFInAppEventType(context);
        PurchaseHandler AFLogger2 = values().AFLogger();
        if (AFLogger2.values(map, purchaseValidationCallback, "subscriptions")) {
            AFd1hSDK aFd1hSDK = new AFd1hSDK(map, purchaseValidationCallback, AFLogger2.AFInAppEventType);
            AFd1mSDK aFd1mSDK = AFLogger2.AFInAppEventParameterName;
            aFd1mSDK.AFKeystoreWrapper.execute(new Runnable(aFd1hSDK) {
                private /* synthetic */ AFd1jSDK AFInAppEventType;

                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
        }
        int i = onResponseError + 89;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? '@' : 'R') == '@') {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r5.values(r6, r7, "purchases") != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (r5.values(r6, r7, r0) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendInAppPurchaseData(android.content.Context r5, java.util.Map<java.lang.String, java.lang.Object> r6, com.appsflyer.PurchaseHandler.PurchaseValidationCallback r7) {
        /*
            r4 = this;
            int r0 = onValidateInAppFailure
            int r0 = r0 + 39
            int r1 = r0 % 128
            onResponseError = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 0
            goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            java.lang.String r3 = "purchases"
            if (r0 == 0) goto L_0x002b
            r4.AFInAppEventType((android.content.Context) r5)
            com.appsflyer.internal.AFc1pSDK r5 = r4.values()
            com.appsflyer.PurchaseHandler r5 = r5.AFLogger()
            java.lang.String[] r0 = new java.lang.String[]{r3}
            boolean r0 = r5.values(r6, r7, r0)
            if (r0 == 0) goto L_0x0053
            goto L_0x0040
        L_0x002b:
            r4.AFInAppEventType((android.content.Context) r5)
            com.appsflyer.internal.AFc1pSDK r5 = r4.values()
            com.appsflyer.PurchaseHandler r5 = r5.AFLogger()
            java.lang.String[] r0 = new java.lang.String[r2]
            r0[r2] = r3
            boolean r0 = r5.values(r6, r7, r0)
            if (r0 == 0) goto L_0x0053
        L_0x0040:
            com.appsflyer.internal.AFd1cSDK r0 = new com.appsflyer.internal.AFd1cSDK
            com.appsflyer.internal.AFc1pSDK r3 = r5.AFInAppEventType
            r0.<init>(r6, r7, r3)
            com.appsflyer.internal.AFd1mSDK r5 = r5.AFInAppEventParameterName
            java.util.concurrent.Executor r6 = r5.AFKeystoreWrapper
            com.appsflyer.internal.AFd1mSDK$5 r7 = new com.appsflyer.internal.AFd1mSDK$5
            r7.<init>(r0)
            r6.execute(r7)
        L_0x0053:
            int r5 = onResponseError
            int r5 = r5 + 45
            int r6 = r5 % 128
            onValidateInAppFailure = r6
            int r5 = r5 % 2
            if (r5 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r1 = 1
        L_0x0061:
            if (r1 == 0) goto L_0x0064
            return
        L_0x0064:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.sendInAppPurchaseData(android.content.Context, java.util.Map, com.appsflyer.PurchaseHandler$PurchaseValidationCallback):void");
    }

    public final void subscribeForDeepLink(DeepLinkListener deepLinkListener, long j) {
        int i = onResponseError + 105;
        onValidateInAppFailure = i % 128;
        if (i % 2 == 0) {
            values().onResponseErrorNative().values = deepLinkListener;
            values().onResponseErrorNative().afRDLog = j;
            return;
        }
        values().onResponseErrorNative().values = deepLinkListener;
        values().onResponseErrorNative().afRDLog = j;
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    public final void setPartnerData(String str, Map<String, Object> map) {
        String str2;
        onResponseError = (onValidateInAppFailure + 83) % 128;
        if (this.onResponseNative == null) {
            this.onResponseNative = new AFb1dSDK();
        }
        AFb1dSDK aFb1dSDK = this.onResponseNative;
        if ((str != null ? 29 : 'Y') == 'Y' || str.isEmpty()) {
            AFLogger.afWarnLog("Partner ID is missing or `null`");
            return;
        }
        boolean z = false;
        if (map != null) {
            int i = onResponseError + 41;
            onValidateInAppFailure = i % 128;
            if (i % 2 != 0) {
                z = true;
            }
            if (z) {
                map.isEmpty();
                throw null;
            } else if (!map.isEmpty()) {
                StringBuilder sb = new StringBuilder("Setting partner data for ");
                sb.append(str);
                sb.append(": ");
                sb.append(map);
                AFLogger.afDebugLog(sb.toString());
                int length = new JSONObject(map).toString().length();
                if (length > 1000) {
                    AFLogger.afWarnLog("Partner data 1000 characters limit exceeded");
                    HashMap hashMap = new HashMap();
                    hashMap.put("error", "limit exceeded: ".concat(String.valueOf(length)));
                    aFb1dSDK.AFKeystoreWrapper.put(str, hashMap);
                    return;
                }
                aFb1dSDK.AFInAppEventType.put(str, map);
                aFb1dSDK.AFKeystoreWrapper.remove(str);
                return;
            }
        }
        if (aFb1dSDK.AFInAppEventType.remove(str) == null) {
            str2 = "Partner data is missing or `null`";
        } else {
            str2 = "Cleared partner data for ".concat(String.valueOf(str));
        }
        AFLogger.afWarnLog(str2);
    }

    public final void setImeiData(String str) {
        int i = onResponseError + 59;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? 13 : '^') != '^') {
            AFb1uSDK afErrorLogForExcManagerOnly2 = values().afErrorLogForExcManagerOnly();
            String[] strArr = new String[0];
            strArr[0] = str;
            afErrorLogForExcManagerOnly2.AFKeystoreWrapper("setImeiData", strArr);
        } else {
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("setImeiData", str);
        }
        values().AppsFlyer2dXConversionCallback().AFKeystoreWrapper = str;
    }

    public final void setResolveDeepLinkURLs(String... strArr) {
        onValidateInAppFailure = (onResponseError + 119) % 128;
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        AFb1nSDK onResponseErrorNative2 = values().onResponseErrorNative();
        onResponseErrorNative2.afDebugLog.clear();
        onResponseErrorNative2.afDebugLog.addAll(Arrays.asList(strArr));
        onResponseError = (onValidateInAppFailure + 115) % 128;
    }

    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i = onResponseError + 97;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? 9 : '6') != '6') {
            Object[] objArr = new Object[1];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)});
        }
        AFLogger.afDebugLog(str);
        values().onResponseErrorNative().afInfoLog = strArr;
    }

    public final void logEvent(Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap hashMap;
        Activity activity = null;
        if (map == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap(map);
        }
        AFInAppEventType(context);
        AFf1tSDK aFf1tSDK = new AFf1tSDK();
        aFf1tSDK.afInfoLog = str;
        aFf1tSDK.AFInAppEventParameterName = appsFlyerRequestListener;
        if (hashMap != null && hashMap.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap hashMap2 = new HashMap();
            Object obj = hashMap.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap hashMap3 = new HashMap();
                hashMap3.put("x", Float.valueOf(motionEvent.getX()));
                hashMap3.put("y", Float.valueOf(motionEvent.getY()));
                hashMap2.put("loc", hashMap3);
                hashMap2.put("pf", Float.valueOf(motionEvent.getPressure()));
                hashMap2.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                hashMap2.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.valueOf("Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map singletonMap = Collections.singletonMap("tch_data", hashMap2);
            hashMap.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFf1tSDK.values(singletonMap);
        }
        aFf1tSDK.AFKeystoreWrapper = hashMap;
        AFb1uSDK afErrorLogForExcManagerOnly2 = values().afErrorLogForExcManagerOnly();
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = new JSONObject(aFf1tSDK.AFKeystoreWrapper == null ? new HashMap() : aFf1tSDK.AFKeystoreWrapper).toString();
        afErrorLogForExcManagerOnly2.AFKeystoreWrapper("logEvent", strArr);
        if (str == null) {
            AFInAppEventParameterName(context, AFf1vSDK.logEvent);
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        valueOf((AFa1rSDK) aFf1tSDK, activity);
    }

    private void AFInAppEventType(AFa1rSDK aFa1rSDK) {
        boolean z = aFa1rSDK.afInfoLog == null;
        if (!AFInAppEventType()) {
            if ((z ? '+' : 'M') == '+') {
                if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                    AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
                } else if (afDebugLog()) {
                    onValidateInAppFailure = (onResponseError + 123) % 128;
                    AppsFlyerRequestListener appsFlyerRequestListener = aFa1rSDK.AFInAppEventParameterName;
                    if (appsFlyerRequestListener != null) {
                        appsFlyerRequestListener.onError(10, "Event timeout. Check 'minTimeBetweenSessions' param");
                        onResponseError = (onValidateInAppFailure + 29) % 128;
                        return;
                    }
                    return;
                }
                this.AFLogger = System.currentTimeMillis();
            }
            valueOf(values().values(), new AFa1xSDK(this, aFa1rSDK, (byte) 0), 0, TimeUnit.MILLISECONDS);
            return;
        }
        int i = onResponseError + 27;
        onValidateInAppFailure = i % 128;
        if (i % 2 != 0) {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
        } else {
            AFLogger.afInfoLog("CustomerUserId not set, reporting is disabled", true);
        }
    }

    private static void AFInAppEventType(Map<String, Object> map, AFf1xSDK aFf1xSDK) {
        HashMap hashMap = new HashMap(aFf1xSDK.AFInAppEventParameterName);
        aFf1xSDK.AFInAppEventParameterName.clear();
        aFf1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("gcd");
        if ((!hashMap.isEmpty() ? ':' : '5') == ':') {
            int i = onValidateInAppFailure + 77;
            onResponseError = i % 128;
            if (!(i % 2 == 0)) {
                AFInAppEventType(map).put("gcd", hashMap);
            } else {
                AFInAppEventType(map).put("gcd", hashMap);
                throw null;
            }
        }
    }

    private void afWarnLog() {
        onResponseError = (onValidateInAppFailure + 71) % 128;
        if (!AFd1dSDK.afDebugLog()) {
            AFc1pSDK values2 = values();
            AFd1mSDK level = values2.getLevel();
            level.AFKeystoreWrapper.execute(new Runnable(new AFd1dSDK(values2)) {
                private /* synthetic */ AFd1jSDK AFInAppEventType;

                /*  JADX ERROR: Method generation error
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                /*  JADX ERROR: Method generation error: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    */
                public final void run(
/*
Method generation error in method: com.appsflyer.internal.AFd1mSDK.5.run():void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFd1mSDK.5.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            int i = onValidateInAppFailure + 125;
            onResponseError = i % 128;
            if ((i % 2 == 0 ? (char) 31 : 3) == 31) {
                throw new ArithmeticException();
            }
        }
    }

    public final String getAppsFlyerUID(Context context) {
        onValidateInAppFailure = (onResponseError + 1) % 128;
        boolean z = false;
        values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("getAppsFlyerUID", new String[0]);
        if (context == null) {
            z = true;
        }
        if (z) {
            return null;
        }
        AFInAppEventType(context);
        String valueOf2 = AFb1rSDK.valueOf(new WeakReference(values().AFKeystoreWrapper().AFInAppEventParameterName.AFInAppEventType));
        onValidateInAppFailure = (onResponseError + 83) % 128;
        return valueOf2;
    }

    public final void setLogLevel(AFLogger.LogLevel logLevel) {
        int i = onResponseError + 119;
        onValidateInAppFailure = i % 128;
        if ((i % 2 != 0 ? '[' : 'U') == 'U') {
            boolean z = false;
            values().afErrorLogForExcManagerOnly().AFKeystoreWrapper("log", String.valueOf(logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()));
            AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
            int i2 = onResponseError + 43;
            onValidateInAppFailure = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            }
            if (z) {
                throw null;
            }
            return;
        }
        logLevel.getLevel();
        AFLogger.LogLevel.NONE.getLevel();
        throw null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void values(android.content.Context r8, android.content.Intent r9) {
        /*
            r7 = this;
            int r0 = onResponseError
            int r0 = r0 + 125
            int r1 = r0 % 128
            onValidateInAppFailure = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x009b
            r7.AFInAppEventType((android.content.Context) r8)
            com.appsflyer.internal.AFc1pSDK r0 = r7.values()
            com.appsflyer.internal.AFb1nSDK r0 = r0.onResponseErrorNative()
            com.appsflyer.internal.AFc1pSDK r1 = r7.values()
            com.appsflyer.internal.AFb1aSDK r1 = r1.afErrorLog()
            r2 = 8
            if (r9 == 0) goto L_0x0026
            r3 = 8
            goto L_0x0028
        L_0x0026:
            r3 = 48
        L_0x0028:
            r4 = 0
            if (r3 == r2) goto L_0x002c
            goto L_0x004d
        L_0x002c:
            int r2 = onResponseError
            int r2 = r2 + 105
            int r2 = r2 % 128
            onValidateInAppFailure = r2
            java.lang.String r2 = r9.getAction()
            java.lang.String r3 = "android.intent.action.VIEW"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x004d
            int r2 = onResponseError
            int r2 = r2 + 13
            int r2 = r2 % 128
            onValidateInAppFailure = r2
            android.net.Uri r2 = r9.getData()
            goto L_0x004e
        L_0x004d:
            r2 = r4
        L_0x004e:
            r3 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0054
            r6 = 1
            goto L_0x0055
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r6 == 0) goto L_0x006b
            java.lang.String r2 = r2.toString()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0062
            goto L_0x006b
        L_0x0062:
            int r2 = onResponseError
            int r2 = r2 + 53
            int r2 = r2 % 128
            onValidateInAppFailure = r2
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            java.lang.String r2 = "ddl_sent"
            boolean r1 = r1.values(r2)
            r2 = 79
            if (r1 == 0) goto L_0x0079
            r1 = 19
            goto L_0x007b
        L_0x0079:
            r1 = 79
        L_0x007b:
            if (r1 == r2) goto L_0x0092
            int r1 = onResponseError
            int r1 = r1 + 67
            int r2 = r1 % 128
            onValidateInAppFailure = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L_0x0091
            if (r3 != 0) goto L_0x0092
            java.lang.String r8 = "No direct deep link"
            r0.AFKeystoreWrapper(r8, r4)
            return
        L_0x0091:
            throw r4
        L_0x0092:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.values(r1, r9, r8)
            return
        L_0x009b:
            r7.AFInAppEventType((android.content.Context) r8)
            com.appsflyer.internal.AFc1pSDK r8 = r7.values()
            r8.onResponseErrorNative()
            com.appsflyer.internal.AFc1pSDK r8 = r7.values()
            r8.afErrorLog()
            java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.values(android.content.Context, android.content.Intent):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void values(java.lang.String r18, java.lang.String r19, int[] r20, int r21, java.lang.Object[] r22) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L_0x001e
            int r4 = $10
            int r4 = r4 + 61
            int r5 = r4 % 128
            $11 = r5
            int r4 = r4 % r2
            if (r4 == 0) goto L_0x001a
            java.lang.String r4 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r4)
            goto L_0x001e
        L_0x001a:
            r3.hashCode()
            throw r3
        L_0x001e:
            byte[] r0 = (byte[]) r0
            r4 = 46
            if (r18 == 0) goto L_0x0027
            r5 = 52
            goto L_0x0029
        L_0x0027:
            r5 = 46
        L_0x0029:
            if (r5 == r4) goto L_0x0030
            char[] r4 = r18.toCharArray()
            goto L_0x0032
        L_0x0030:
            r4 = r18
        L_0x0032:
            char[] r4 = (char[]) r4
            com.appsflyer.internal.AFh1ySDK r5 = new com.appsflyer.internal.AFh1ySDK
            r5.<init>()
            char[] r6 = onAppOpenAttribution
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L_0x00c0
            int r9 = $11
            int r9 = r9 + 81
            int r9 = r9 % 128
            $10 = r9
            int r9 = r6.length
            char[] r10 = new char[r9]
            r11 = 0
        L_0x004b:
            if (r11 >= r9) goto L_0x00bf
            char r12 = r6[r11]
            java.lang.Object[] r13 = new java.lang.Object[r7]     // Catch:{ all -> 0x00b6 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00b6 }
            r13[r8] = r12     // Catch:{ all -> 0x00b6 }
            java.util.Map<java.lang.Integer, java.lang.Object> r12 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00b6 }
            r14 = 926988223(0x3740b7bf, float:1.14868735E-5)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r12 = r12.get(r15)     // Catch:{ all -> 0x00b6 }
            if (r12 != 0) goto L_0x009c
            int r12 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x00b6 }
            int r12 = r12 >> 16
            r15 = 47725(0xba6d, float:6.6877E-41)
            int r12 = r12 + r15
            char r12 = (char) r12     // Catch:{ all -> 0x00b6 }
            int r15 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x00b6 }
            int r15 = r15 >> 16
            int r15 = r15 + 233
            int r16 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ all -> 0x00b6 }
            int r16 = r16 >> 16
            int r2 = 36 - r16
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r12, r15, r2)     // Catch:{ all -> 0x00b6 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x00b6 }
            java.lang.Class[] r12 = new java.lang.Class[r7]     // Catch:{ all -> 0x00b6 }
            java.lang.Class r15 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b6 }
            r12[r8] = r15     // Catch:{ all -> 0x00b6 }
            java.lang.String r15 = "h"
            java.lang.reflect.Method r12 = r2.getMethod(r15, r12)     // Catch:{ all -> 0x00b6 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00b6 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00b6 }
            r2.put(r14, r12)     // Catch:{ all -> 0x00b6 }
        L_0x009c:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r12.invoke(r3, r13)     // Catch:{ all -> 0x00b6 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x00b6 }
            char r2 = r2.charValue()     // Catch:{ all -> 0x00b6 }
            r10[r11] = r2
            int r11 = r11 + 1
            int r2 = $11
            int r2 = r2 + 89
            int r2 = r2 % 128
            $10 = r2
            r2 = 2
            goto L_0x004b
        L_0x00b6:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00be
            throw r1
        L_0x00be:
            throw r0
        L_0x00bf:
            r6 = r10
        L_0x00c0:
            int r2 = onConversionDataFail
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch:{ all -> 0x0283 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0283 }
            r9[r8] = r2     // Catch:{ all -> 0x0283 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0283 }
            r10 = -1572465360(0xffffffffa2461530, float:-2.684522E-18)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0283 }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x0283 }
            r11 = 0
            if (r2 != 0) goto L_0x010f
            r2 = 63768(0xf918, float:8.9358E-41)
            int r13 = android.widget.ExpandableListView.getPackedPositionGroup(r11)     // Catch:{ all -> 0x0283 }
            int r2 = r2 - r13
            char r2 = (char) r2     // Catch:{ all -> 0x0283 }
            int r13 = android.view.KeyEvent.getMaxKeyCode()     // Catch:{ all -> 0x0283 }
            int r13 = r13 >> 16
            int r13 = 305 - r13
            long r14 = android.widget.ExpandableListView.getPackedPositionForGroup(r8)     // Catch:{ all -> 0x0283 }
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            int r14 = r16 + 37
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r2, r13, r14)     // Catch:{ all -> 0x0283 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0283 }
            java.lang.Class[] r13 = new java.lang.Class[r7]     // Catch:{ all -> 0x0283 }
            java.lang.Class r14 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0283 }
            r13[r8] = r14     // Catch:{ all -> 0x0283 }
            java.lang.String r14 = "j"
            java.lang.reflect.Method r2 = r2.getMethod(r14, r13)     // Catch:{ all -> 0x0283 }
            java.util.Map<java.lang.Integer, java.lang.Object> r13 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0283 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0283 }
            r13.put(r10, r2)     // Catch:{ all -> 0x0283 }
        L_0x010f:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0283 }
            java.lang.Object r2 = r2.invoke(r3, r9)     // Catch:{ all -> 0x0283 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0283 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0283 }
            boolean r9 = onValidateInApp
            java.lang.String r10 = "i"
            r13 = -194173915(0xfffffffff46d2425, float:-7.5153043E31)
            if (r9 == 0) goto L_0x01ad
            int r1 = r0.length
            r5.AFInAppEventParameterName = r1
            int r1 = r5.AFInAppEventParameterName
            char[] r1 = new char[r1]
            r5.AFKeystoreWrapper = r8
        L_0x012d:
            int r4 = r5.AFKeystoreWrapper
            int r9 = r5.AFInAppEventParameterName
            r14 = 65
            if (r4 >= r9) goto L_0x0138
            r4 = 56
            goto L_0x013a
        L_0x0138:
            r4 = 65
        L_0x013a:
            if (r4 == r14) goto L_0x01a5
            int r4 = r5.AFKeystoreWrapper
            int r9 = r5.AFInAppEventParameterName
            int r9 = r9 - r7
            int r14 = r5.AFKeystoreWrapper
            int r9 = r9 - r14
            byte r9 = r0[r9]
            int r9 = r9 + r21
            char r9 = r6[r9]
            int r9 = r9 - r2
            char r9 = (char) r9
            r1[r4] = r9
            r4 = 2
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x019c }
            r9[r7] = r5     // Catch:{ all -> 0x019c }
            r9[r8] = r5     // Catch:{ all -> 0x019c }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x019c }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x019c }
            java.lang.Object r4 = r4.get(r14)     // Catch:{ all -> 0x019c }
            if (r4 != 0) goto L_0x0196
            long r14 = android.widget.ExpandableListView.getPackedPositionForGroup(r8)     // Catch:{ all -> 0x019c }
            int r4 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            char r4 = (char) r4     // Catch:{ all -> 0x019c }
            java.lang.String r14 = ""
            r15 = 48
            int r14 = android.text.TextUtils.lastIndexOf(r14, r15, r8)     // Catch:{ all -> 0x019c }
            int r14 = r14 + 74
            char r15 = android.text.AndroidCharacter.getMirror(r15)     // Catch:{ all -> 0x019c }
            int r15 = 84 - r15
            java.lang.Object r4 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r4, r14, r15)     // Catch:{ all -> 0x019c }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x019c }
            r14 = 2
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ all -> 0x019c }
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r15[r8] = r14     // Catch:{ all -> 0x019c }
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r15[r7] = r14     // Catch:{ all -> 0x019c }
            java.lang.reflect.Method r4 = r4.getMethod(r10, r15)     // Catch:{ all -> 0x019c }
            java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x019c }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x019c }
            r14.put(r15, r4)     // Catch:{ all -> 0x019c }
        L_0x0196:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x019c }
            r4.invoke(r3, r9)     // Catch:{ all -> 0x019c }
            goto L_0x012d
        L_0x019c:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01a4
            throw r1
        L_0x01a4:
            throw r0
        L_0x01a5:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r22[r8] = r0
            return
        L_0x01ad:
            boolean r0 = onAttributionFailure
            r0 = r0 ^ r7
            if (r0 == r7) goto L_0x023b
            int r0 = $11
            int r0 = r0 + 53
            int r0 = r0 % 128
            $10 = r0
            int r0 = r4.length
            r5.AFInAppEventParameterName = r0
            int r0 = r5.AFInAppEventParameterName
            char[] r0 = new char[r0]
            r5.AFKeystoreWrapper = r8
        L_0x01c3:
            int r1 = r5.AFKeystoreWrapper
            int r9 = r5.AFInAppEventParameterName
            if (r1 >= r9) goto L_0x0233
            int r1 = r5.AFKeystoreWrapper
            int r9 = r5.AFInAppEventParameterName
            int r9 = r9 - r7
            int r14 = r5.AFKeystoreWrapper
            int r9 = r9 - r14
            char r9 = r4[r9]
            int r9 = r9 - r21
            char r9 = r6[r9]
            int r9 = r9 - r2
            char r9 = (char) r9
            r0[r1] = r9
            r1 = 2
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch:{ all -> 0x022a }
            r9[r7] = r5     // Catch:{ all -> 0x022a }
            r9[r8] = r5     // Catch:{ all -> 0x022a }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x022a }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x022a }
            java.lang.Object r1 = r1.get(r14)     // Catch:{ all -> 0x022a }
            if (r1 != 0) goto L_0x0224
            float r1 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x022a }
            r14 = 0
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            char r1 = (char) r1     // Catch:{ all -> 0x022a }
            int r14 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x022a }
            int r14 = r14 >> 16
            int r14 = 73 - r14
            long r15 = android.os.Process.getElapsedCpuTime()     // Catch:{ all -> 0x022a }
            int r17 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            int r15 = 37 - r17
            java.lang.Object r1 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r1, r14, r15)     // Catch:{ all -> 0x022a }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x022a }
            r14 = 2
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ all -> 0x022a }
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r15[r8] = r14     // Catch:{ all -> 0x022a }
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            r15[r7] = r14     // Catch:{ all -> 0x022a }
            java.lang.reflect.Method r1 = r1.getMethod(r10, r15)     // Catch:{ all -> 0x022a }
            java.util.Map<java.lang.Integer, java.lang.Object> r14 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x022a }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x022a }
            r14.put(r15, r1)     // Catch:{ all -> 0x022a }
        L_0x0224:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x022a }
            r1.invoke(r3, r9)     // Catch:{ all -> 0x022a }
            goto L_0x01c3
        L_0x022a:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0232
            throw r1
        L_0x0232:
            throw r0
        L_0x0233:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r22[r8] = r1
            return
        L_0x023b:
            int r0 = r1.length
            r5.AFInAppEventParameterName = r0
            int r0 = r5.AFInAppEventParameterName
            char[] r0 = new char[r0]
            r5.AFKeystoreWrapper = r8
            int r4 = $10
            int r4 = r4 + 83
            int r4 = r4 % 128
            $11 = r4
        L_0x024c:
            int r4 = r5.AFKeystoreWrapper
            int r9 = r5.AFInAppEventParameterName
            if (r4 >= r9) goto L_0x0254
            r4 = 1
            goto L_0x0255
        L_0x0254:
            r4 = 0
        L_0x0255:
            if (r4 == 0) goto L_0x026f
            int r4 = r5.AFKeystoreWrapper
            int r9 = r5.AFInAppEventParameterName
            int r9 = r9 - r7
            int r10 = r5.AFKeystoreWrapper
            int r9 = r9 - r10
            r9 = r1[r9]
            int r9 = r9 - r21
            char r9 = r6[r9]
            int r9 = r9 - r2
            char r9 = (char) r9
            r0[r4] = r9
            int r4 = r5.AFKeystoreWrapper
            int r4 = r4 + r7
            r5.AFKeystoreWrapper = r4
            goto L_0x024c
        L_0x026f:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            int r0 = $11
            int r0 = r0 + r7
            int r2 = r0 % 128
            $10 = r2
            r2 = 2
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x0282
            r22[r8] = r1
            return
        L_0x0282:
            throw r3
        L_0x0283:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x028b
            throw r1
        L_0x028b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1dSDK.values(java.lang.String, java.lang.String, int[], int, java.lang.Object[]):void");
    }
}
