package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class AFe1ySDK extends AFe1uSDK {
    public Map<String, Object> AFLogger$LogLevel;
    private final AFb1aSDK AFVersionDeclaration;
    private final AFf1xSDK afErrorLogForExcManagerOnly;
    private final AFg1vSDK getLevel;
    private final AppsFlyerProperties onAppOpenAttributionNative = AppsFlyerProperties.getInstance();
    private final AFe1oSDK onInstallConversionDataLoadedNative;

    public AFe1ySDK(AFa1rSDK aFa1rSDK, AFc1pSDK aFc1pSDK) {
        super(aFa1rSDK, aFc1pSDK);
        this.getLevel = aFc1pSDK.AFVersionDeclaration();
        this.AFVersionDeclaration = aFc1pSDK.afErrorLog();
        this.afErrorLogForExcManagerOnly = aFc1pSDK.afDebugLog();
        this.onInstallConversionDataLoadedNative = aFc1pSDK.afInfoLog();
        this.AFKeystoreWrapper.add(AFd1kSDK.RESOLVE_ESP);
        this.AFKeystoreWrapper.add(AFd1kSDK.DLSDK);
    }

    public final void values() {
        super.values();
        AFf1xSDK aFf1xSDK = this.afErrorLogForExcManagerOnly;
        int i = this.AFLogger.afDebugLog;
        long currentTimeMillis = System.currentTimeMillis();
        if (i != 1) {
            return;
        }
        if (aFf1xSDK.AFLogger != 0) {
            aFf1xSDK.valueOf.put("net", Long.valueOf(currentTimeMillis - aFf1xSDK.AFLogger));
            aFf1xSDK.AFKeystoreWrapper.AFKeystoreWrapper("first_launch", new JSONObject(aFf1xSDK.valueOf).toString());
            return;
        }
        AFLogger.afInfoLog("Metrics: launch start ts is missing");
    }

    /* access modifiers changed from: protected */
    public final void valueOf(AFa1rSDK aFa1rSDK) {
        super.valueOf(aFa1rSDK);
        int i = aFa1rSDK.afDebugLog;
        this.afErrorLogForExcManagerOnly.AFInAppEventType(i);
        Map map = (Map) aFa1rSDK.AFInAppEventType().get("meta");
        if (map == null) {
            map = new HashMap();
            aFa1rSDK.AFInAppEventType().put("meta", map);
        }
        AFf1eSDK AFInAppEventParameterName = this.onInstallConversionDataLoadedNative.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("cdn_token", AFInAppEventParameterName.AFInAppEventParameterName);
            if (AFInAppEventParameterName.values != null) {
                hashMap.put("c_ver", AFInAppEventParameterName.values);
            }
            if (AFInAppEventParameterName.valueOf > 0) {
                hashMap.put("latency", Long.valueOf(AFInAppEventParameterName.valueOf));
            }
            if (AFInAppEventParameterName.AFInAppEventType > 0) {
                hashMap.put("delay", Long.valueOf(AFInAppEventParameterName.AFInAppEventType));
            }
            if (AFInAppEventParameterName.AFKeystoreWrapper > 0) {
                hashMap.put("res_code", Integer.valueOf(AFInAppEventParameterName.AFKeystoreWrapper));
            }
            if (AFInAppEventParameterName.afErrorLog != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(AFInAppEventParameterName.afErrorLog.getClass().getSimpleName());
                sb.append(": ");
                sb.append(AFInAppEventParameterName.afErrorLog.getMessage());
                hashMap.put("error", sb.toString());
            }
            if (AFInAppEventParameterName.afInfoLog != null) {
                hashMap.put("sig", AFInAppEventParameterName.afInfoLog.toString());
            }
            if (AFInAppEventParameterName.afRDLog != null) {
                hashMap.put("cdn_cache_status", AFInAppEventParameterName.afRDLog);
            }
            map.put("rc", hashMap);
        }
        if (i == 1) {
            if (this.onAppOpenAttributionNative.getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
                aFa1rSDK.AFInAppEventType().put("wait_cid", Boolean.toString(true));
            }
            HashMap hashMap2 = new HashMap(this.afErrorLogForExcManagerOnly.values);
            this.afErrorLogForExcManagerOnly.AFKeystoreWrapper.AFKeystoreWrapper("ddl");
            if (!hashMap2.isEmpty()) {
                map.put("ddl", hashMap2);
            }
            HashMap hashMap3 = new HashMap(this.afErrorLogForExcManagerOnly.valueOf);
            if (!hashMap3.isEmpty()) {
                map.put("first_launch", hashMap3);
            }
        } else if (i == 2) {
            HashMap hashMap4 = new HashMap(this.afErrorLogForExcManagerOnly.valueOf);
            if (!hashMap4.isEmpty()) {
                map.put("first_launch", hashMap4);
            }
            this.afErrorLogForExcManagerOnly.AFKeystoreWrapper.AFKeystoreWrapper("first_launch");
        }
        if (map.isEmpty()) {
            aFa1rSDK.AFInAppEventType().remove("meta");
        }
        if (i <= 2) {
            ArrayList arrayList = new ArrayList();
            for (AFg1uSDK aFg1uSDK : this.getLevel.AFInAppEventParameterName()) {
                boolean z = aFg1uSDK instanceof AFg1wSDK;
                int i2 = AnonymousClass1.AFInAppEventType[aFg1uSDK.AFLogger.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        aFa1rSDK.values("rfr", ((AFg1wSDK) aFg1uSDK).AFInAppEventParameterName);
                        this.AFVersionDeclaration.values(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(aFg1uSDK.valueOf);
                } else if (i2 == 2 && i == 2 && !z) {
                    HashMap hashMap5 = new HashMap();
                    hashMap5.put("source", aFg1uSDK.values);
                    hashMap5.put("response", "TIMEOUT");
                    hashMap5.put("type", aFg1uSDK.afErrorLog);
                    arrayList.add(hashMap5);
                }
            }
            if (!arrayList.isEmpty()) {
                aFa1rSDK.values("referrers", arrayList);
            }
            Map<String, Object> map2 = this.AFLogger$LogLevel;
            if (map2 != null) {
                aFa1rSDK.values("fb_ddl", map2);
            }
        }
    }

    /* renamed from: com.appsflyer.internal.AFe1ySDK$1  reason: invalid class name */
    static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] AFInAppEventType;

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
                AFInAppEventType = r0
                com.appsflyer.internal.AFg1uSDK$AFa1xSDK r1 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.FINISHED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = AFInAppEventType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.internal.AFg1uSDK$AFa1xSDK r1 = com.appsflyer.internal.AFg1uSDK.AFa1xSDK.STARTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1ySDK.AnonymousClass1.<clinit>():void");
        }
    }
}
