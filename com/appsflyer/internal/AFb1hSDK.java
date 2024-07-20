package com.appsflyer.internal;

import android.net.Uri;
import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.deeplink.DeepLink;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFg1uSDK;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

public final class AFb1hSDK extends AFf1sSDK {
    private static String AFLogger$LogLevel = "https://%sdlsdk.%s/v1.0/android/";
    private final CountDownLatch AFVersionDeclaration = new CountDownLatch(1);
    private final AFg1vSDK AppsFlyer2dXConversionCallback;
    private final List<AFg1uSDK> afErrorLogForExcManagerOnly = new ArrayList();
    private final AFf1xSDK afWarnLog;
    private final AFc1vSDK getLevel;
    private final AFe1hSDK init;
    private final ExecutorService onAppOpenAttributionNative;
    private int onConversionDataSuccess;
    private boolean onDeepLinkingNative;
    private final AFb1nSDK onInstallConversionDataLoadedNative;
    private final AFb1uSDK onInstallConversionFailureNative;
    private int onResponseErrorNative;
    private int onResponseNative;

    public AFb1hSDK(AFc1pSDK aFc1pSDK) {
        super((String) null, AFLogger$LogLevel, Boolean.FALSE, Boolean.TRUE, (Boolean) null);
        this.afWarnLog = aFc1pSDK.afDebugLog();
        this.getLevel = aFc1pSDK.AFKeystoreWrapper();
        this.init = aFc1pSDK.AppsFlyer2dXConversionCallback();
        this.AppsFlyer2dXConversionCallback = aFc1pSDK.AFVersionDeclaration();
        this.onAppOpenAttributionNative = aFc1pSDK.valueOf();
        this.onInstallConversionFailureNative = aFc1pSDK.afErrorLogForExcManagerOnly();
        this.onInstallConversionDataLoadedNative = aFc1pSDK.onResponseErrorNative();
    }

    public final DeepLinkResult afRDLog() {
        DeepLinkResult.Error error;
        AFLogger.afDebugLog("[DDL] start");
        FutureTask futureTask = new FutureTask(new Callable<DeepLinkResult>() {
            public final /* synthetic */ Object call() throws Exception {
                AFb1hSDK.AFInAppEventParameterName(AFb1hSDK.this);
                AFb1hSDK.this.afErrorLogForExcManagerOnly();
                return AFb1hSDK.valueOf(AFb1hSDK.this);
            }
        });
        this.onAppOpenAttributionNative.execute(futureTask);
        try {
            DeepLinkResult deepLinkResult = (DeepLinkResult) futureTask.get(this.onInstallConversionDataLoadedNative.afRDLog, TimeUnit.MILLISECONDS);
            this.afWarnLog.AFKeystoreWrapper(deepLinkResult, this.onInstallConversionDataLoadedNative.afRDLog);
            this.onInstallConversionDataLoadedNative.AFInAppEventParameterName(deepLinkResult);
            return deepLinkResult;
        } catch (InterruptedException | ExecutionException e) {
            AFLogger.afErrorLog("[DDL] Error occurred", e, true);
            if (e.getCause() instanceof IOException) {
                error = DeepLinkResult.Error.NETWORK;
            } else {
                error = DeepLinkResult.Error.UNEXPECTED;
            }
            DeepLinkResult deepLinkResult2 = new DeepLinkResult((DeepLink) null, error);
            this.afWarnLog.AFKeystoreWrapper(deepLinkResult2, this.onInstallConversionDataLoadedNative.afRDLog);
            this.onInstallConversionDataLoadedNative.AFInAppEventParameterName(deepLinkResult2);
            return deepLinkResult2;
        } catch (TimeoutException e2) {
            AFLogger.afErrorLogForExcManagerOnly("[DDL] Timeout", e2);
            StringBuilder sb = new StringBuilder("[DDL] Timeout, didn't manage to find deferred deep link after ");
            sb.append(this.onConversionDataSuccess);
            sb.append(" attempt(s) within ");
            sb.append(this.onInstallConversionDataLoadedNative.afRDLog);
            sb.append(" milliseconds");
            AFLogger.afDebugLog(sb.toString());
            DeepLinkResult deepLinkResult3 = new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.TIMEOUT);
            this.afWarnLog.AFKeystoreWrapper(deepLinkResult3, this.onInstallConversionDataLoadedNative.afRDLog);
            this.onInstallConversionDataLoadedNative.AFInAppEventParameterName(deepLinkResult3);
            return deepLinkResult3;
        }
    }

    private boolean AFVersionDeclaration() {
        int i;
        List list = (List) this.AFInAppEventType.get("referrers");
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i >= this.onResponseNative || this.AFInAppEventType.containsKey("referrers")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void afErrorLogForExcManagerOnly() {
        String[] strArr;
        boolean z = true;
        this.onConversionDataSuccess++;
        StringBuilder sb = new StringBuilder("[DDL] Preparing request ");
        sb.append(this.onConversionDataSuccess);
        AFLogger.afDebugLog(sb.toString());
        if (this.onConversionDataSuccess == 1) {
            AFa1dSDK valueOf = AFa1dSDK.valueOf();
            Map<String, Object> map = this.AFInAppEventType;
            if (this.getLevel.values.AFInAppEventType("appsFlyerCount", 0) != 0) {
                z = false;
            }
            map.put("is_first", Boolean.valueOf(z));
            Map<String, Object> map2 = this.AFInAppEventType;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Locale.getDefault().getLanguage());
            sb2.append("-");
            sb2.append(Locale.getDefault().getCountry());
            map2.put("lang", sb2.toString());
            this.AFInAppEventType.put("os", Build.VERSION.RELEASE);
            this.AFInAppEventType.put("type", Build.MODEL);
            this.AFInAppEventType.put("request_id", AFb1rSDK.valueOf(new WeakReference(this.getLevel.AFInAppEventParameterName.AFInAppEventType)));
            AFb1eSDK aFb1eSDK = valueOf.afErrorLog;
            if (!(aFb1eSDK == null || (strArr = aFb1eSDK.AFKeystoreWrapper) == null)) {
                this.AFInAppEventType.put("sharing_filter", strArr);
            }
            Map<String, Object> AFKeystoreWrapper = AFKeystoreWrapper(AFa1fSDK.AFKeystoreWrapper(this.getLevel.AFInAppEventParameterName.AFInAppEventType, new HashMap()));
            Map<String, Object> AFKeystoreWrapper2 = AFKeystoreWrapper(AFa1fSDK.AFInAppEventParameterName(this.getLevel.AFInAppEventParameterName.AFInAppEventType));
            if (AFKeystoreWrapper != null) {
                this.AFInAppEventType.put("gaid", AFKeystoreWrapper);
            }
            if (AFKeystoreWrapper2 != null) {
                this.AFInAppEventType.put("oaid", AFKeystoreWrapper2);
            }
        }
        Map<String, Object> map3 = this.AFInAppEventType;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        long currentTimeMillis = System.currentTimeMillis();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map3.put(Constants.TIMESTAMP, simpleDateFormat.format(new Date(currentTimeMillis)));
        this.AFInAppEventType.put("request_count", Integer.valueOf(this.onConversionDataSuccess));
        ArrayList arrayList = new ArrayList();
        for (AFg1uSDK AFInAppEventParameterName : this.afErrorLogForExcManagerOnly) {
            Map<String, String> AFInAppEventParameterName2 = AFInAppEventParameterName(AFInAppEventParameterName);
            if (AFInAppEventParameterName2 != null) {
                arrayList.add(AFInAppEventParameterName2);
            }
        }
        if (!arrayList.isEmpty()) {
            this.AFInAppEventType.put("referrers", arrayList);
        }
        AFInAppEventParameterName(AppsFlyer2dXConversionCallback());
    }

    private String AppsFlyer2dXConversionCallback() {
        String str = this.init.valueOf;
        String packageName = this.getLevel.AFInAppEventParameterName.AFInAppEventType.getPackageName();
        String AFInAppEventType = this.getLevel.AFInAppEventType();
        String concat = (AFInAppEventType == null || AFInAppEventType.trim().isEmpty()) ? "" : "-".concat(String.valueOf(AFInAppEventType));
        Uri.Builder buildUpon = Uri.parse(String.format(AFLogger$LogLevel, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()})).buildUpon();
        StringBuilder sb = new StringBuilder();
        sb.append(packageName);
        sb.append(concat);
        Uri.Builder appendPath = buildUpon.appendPath(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.AFInAppEventType.get(Constants.TIMESTAMP));
        sb2.append(str);
        return appendPath.appendQueryParameter("af_sig", AFa1aSDK.valueOf(sb2.toString(), str)).appendQueryParameter("sdk_version", AFa1dSDK.AFKeystoreWrapper).build().toString();
    }

    /* renamed from: com.appsflyer.internal.AFb1hSDK$4  reason: invalid class name */
    static final /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.appsflyer.internal.AFg1uSDK$AFa1xSDK[] r0 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AFInAppEventParameterName = r0
                com.appsflyer.internal.AFg1uSDK$AFa1xSDK r1 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = AFInAppEventParameterName     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.AFg1uSDK$AFa1xSDK r1 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1hSDK.AnonymousClass4.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public void AFInAppEventType(AFg1uSDK aFg1uSDK) {
        if (AFKeystoreWrapper(aFg1uSDK)) {
            this.afErrorLogForExcManagerOnly.add(aFg1uSDK);
            this.AFVersionDeclaration.countDown();
            StringBuilder sb = new StringBuilder("[DDL] Added non-organic ");
            sb.append(aFg1uSDK.getClass().getSimpleName());
            AFLogger.afDebugLog(sb.toString());
            return;
        }
        int i = this.onResponseErrorNative + 1;
        this.onResponseErrorNative = i;
        if (i == this.onResponseNative) {
            this.AFVersionDeclaration.countDown();
        }
    }

    private static boolean AFKeystoreWrapper(AFg1uSDK aFg1uSDK) {
        Long l = (Long) aFg1uSDK.valueOf.get("click_ts");
        if (l != null && System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l.longValue()) < TimeUnit.DAYS.toMillis(1)) {
            return true;
        }
        return false;
    }

    public final AFd1kSDK AFKeystoreWrapper() {
        return AFd1kSDK.DLSDK;
    }

    private Map<String, Object> AFKeystoreWrapper(final AFa1eSDK aFa1eSDK) {
        Boolean bool;
        boolean z = false;
        if (!(aFa1eSDK == null || aFa1eSDK.AFKeystoreWrapper == null || ((bool = aFa1eSDK.valueOf) != null && bool.booleanValue()))) {
            z = true;
        }
        if (z) {
            return new HashMap<String, Object>() {
                {
                    put("type", "unhashed");
                    put("value", aFa1eSDK.AFKeystoreWrapper);
                }
            };
        }
        return null;
    }

    private static Map<String, String> AFInAppEventParameterName(AFg1uSDK aFg1uSDK) {
        if (aFg1uSDK.AFLogger != AFg1uSDK.AFa1xSDK.FINISHED) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = (String) aFg1uSDK.valueOf.get("referrer");
        if (str == null) {
            return null;
        }
        hashMap.put("source", (String) aFg1uSDK.valueOf.get("source"));
        hashMap.put("value", str);
        return hashMap;
    }

    static /* synthetic */ void AFInAppEventParameterName(AFb1hSDK aFb1hSDK) {
        ArrayList<AFg1uSDK> arrayList = new ArrayList<>();
        for (AFg1uSDK aFg1uSDK : aFb1hSDK.AppsFlyer2dXConversionCallback.AFInAppEventParameterName()) {
            if (!(aFg1uSDK == null || aFg1uSDK.AFLogger == AFg1uSDK.AFa1xSDK.NOT_STARTED)) {
                arrayList.add(aFg1uSDK);
            }
        }
        aFb1hSDK.onResponseNative = arrayList.size();
        for (final AFg1uSDK aFg1uSDK2 : arrayList) {
            int i = AnonymousClass4.AFInAppEventParameterName[aFg1uSDK2.AFLogger.ordinal()];
            if (i == 1) {
                StringBuilder sb = new StringBuilder("[DDL] ");
                sb.append(aFg1uSDK2.valueOf.get("source"));
                sb.append(" referrer collected earlier");
                AFLogger.afDebugLog(sb.toString());
                aFb1hSDK.AFInAppEventType(aFg1uSDK2);
            } else if (i == 2) {
                aFg1uSDK2.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        StringBuilder sb = new StringBuilder("[DDL] ");
                        sb.append(aFg1uSDK2.valueOf.get("source"));
                        sb.append(" referrer collected via observer");
                        AFLogger.afDebugLog(sb.toString());
                        AFb1hSDK.this.AFInAppEventType((AFg1uSDK) observable);
                    }
                });
            }
        }
    }

    static /* synthetic */ DeepLinkResult valueOf(AFb1hSDK aFb1hSDK) throws IOException, JSONException, InterruptedException {
        DeepLink deepLink;
        while (true) {
            AFf1xSDK aFf1xSDK = aFb1hSDK.afWarnLog;
            int i = aFb1hSDK.onConversionDataSuccess;
            if (i <= 0 || i > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i))));
            } else {
                int i2 = i - 1;
                aFf1xSDK.afErrorLog[i2] = System.currentTimeMillis();
                if (i2 == 0) {
                    if (aFf1xSDK.afRDLog != 0) {
                        aFf1xSDK.values.put("from_fg", Long.valueOf(aFf1xSDK.afErrorLog[i2] - aFf1xSDK.afRDLog));
                        aFf1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("ddl", new JSONObject(aFf1xSDK.values).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: fg ts is missing");
                    }
                }
            }
            HttpURLConnection AFKeystoreWrapper = new AFa1cSDK(aFb1hSDK, aFb1hSDK.onInstallConversionFailureNative).AFKeystoreWrapper(aFb1hSDK.init.valueOf);
            AFf1xSDK aFf1xSDK2 = aFb1hSDK.afWarnLog;
            int i3 = aFb1hSDK.onConversionDataSuccess;
            if (i3 <= 0 || i3 > 2) {
                AFLogger.afErrorLogForExcManagerOnly("Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i3))));
            } else {
                int i4 = i3 - 1;
                aFf1xSDK2.afDebugLog[i4] = System.currentTimeMillis();
                if (aFf1xSDK2.afErrorLog[i4] != 0) {
                    aFf1xSDK2.afInfoLog[i4] = aFf1xSDK2.afDebugLog[i4] - aFf1xSDK2.afErrorLog[i4];
                    aFf1xSDK2.values.put("net", aFf1xSDK2.afInfoLog);
                    aFf1xSDK2.AFKeystoreWrapper.AFKeystoreWrapper("ddl", new JSONObject(aFf1xSDK2.values).toString());
                } else {
                    StringBuilder sb = new StringBuilder("Metrics: ddlStart[");
                    sb.append(i4);
                    sb.append("] ts is missing");
                    AFLogger.afInfoLog(sb.toString());
                }
            }
            if (AFKeystoreWrapper.getResponseCode() == 200) {
                JSONObject jSONObject = new JSONObject(AFa1dSDK.AFKeystoreWrapper(AFKeystoreWrapper));
                aFb1hSDK.onDeepLinkingNative = jSONObject.optBoolean("is_second_ping", true);
                if (!jSONObject.optBoolean("found")) {
                    deepLink = null;
                } else {
                    deepLink = DeepLink.AFKeystoreWrapper(jSONObject.optJSONObject("click_event"));
                    deepLink.AFKeystoreWrapper.put("is_deferred", true);
                }
                if (deepLink != null) {
                    return new DeepLinkResult(deepLink, (DeepLinkResult.Error) null);
                }
                if (aFb1hSDK.onConversionDataSuccess <= 1 && aFb1hSDK.AFVersionDeclaration() && aFb1hSDK.onDeepLinkingNative) {
                    AFLogger.afDebugLog("[DDL] Waiting for referrers...");
                    aFb1hSDK.AFVersionDeclaration.await();
                    AFf1xSDK aFf1xSDK3 = aFb1hSDK.afWarnLog;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (aFf1xSDK3.afDebugLog[0] != 0) {
                        aFf1xSDK3.values.put("rfr_wait", Long.valueOf(currentTimeMillis - aFf1xSDK3.afDebugLog[0]));
                        aFf1xSDK3.AFKeystoreWrapper.AFKeystoreWrapper("ddl", new JSONObject(aFf1xSDK3.values).toString());
                    } else {
                        AFLogger.afInfoLog("Metrics: ddlEnd[0] ts is missing");
                    }
                    if (aFb1hSDK.onResponseErrorNative == aFb1hSDK.onResponseNative) {
                        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
                    }
                    aFb1hSDK.afErrorLogForExcManagerOnly();
                }
            } else {
                StringBuilder sb2 = new StringBuilder("[DDL] Error occurred. Server response code = ");
                sb2.append(AFKeystoreWrapper.getResponseCode());
                AFLogger.afDebugLog(sb2.toString());
                return new DeepLinkResult((DeepLink) null, DeepLinkResult.Error.HTTP_STATUS_CODE);
            }
        }
        return new DeepLinkResult((DeepLink) null, (DeepLinkResult.Error) null);
    }
}
