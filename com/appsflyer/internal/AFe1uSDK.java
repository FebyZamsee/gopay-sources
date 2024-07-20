package com.appsflyer.internal;

import android.content.Context;
import android.graphics.ImageFormat;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.AFc1uSDK;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o.BiometricFragment;
import org.json.JSONObject;

public class AFe1uSDK extends AFd1bSDK<String> {
    private static final AFd1kSDK[] AppsFlyer2dXConversionCallback = {AFd1kSDK.DLSDK, AFd1kSDK.ONELINK, AFd1kSDK.MONITORSDK, AFd1kSDK.REGISTER};
    public final AFa1rSDK AFLogger;
    private final AFe1oSDK AFLogger$LogLevel;
    private final AFd1qSDK AFVersionDeclaration;
    private final AFc1vSDK afErrorLogForExcManagerOnly;
    protected final AFb1aSDK afWarnLog;
    private final AFc1tSDK getLevel;

    /* access modifiers changed from: protected */
    public boolean afErrorLog() {
        return true;
    }

    public AFe1uSDK(AFa1rSDK aFa1rSDK, AFc1pSDK aFc1pSDK) {
        this(aFa1rSDK, aFc1pSDK, (String) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AFe1uSDK(AFa1rSDK aFa1rSDK, AFc1pSDK aFc1pSDK, String str) {
        super(aFa1rSDK.AFKeystoreWrapper(), new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, str);
        int i = 0;
        this.AFLogger = aFa1rSDK;
        this.AFVersionDeclaration = aFc1pSDK.onAppOpenAttributionNative();
        this.afWarnLog = aFc1pSDK.afErrorLog();
        this.AFLogger$LogLevel = aFc1pSDK.afInfoLog();
        this.getLevel = aFc1pSDK.init();
        this.afErrorLogForExcManagerOnly = aFc1pSDK.AFKeystoreWrapper();
        AFd1kSDK[] aFd1kSDKArr = AppsFlyer2dXConversionCallback;
        int length = aFd1kSDKArr.length;
        while (i < length) {
            if (this.valueOf != aFd1kSDKArr[i]) {
                i++;
            } else {
                return;
            }
        }
        int i2 = this.AFLogger.afDebugLog;
        AFd1kSDK aFd1kSDK = this.valueOf;
        if (i2 > 0) {
            this.AFKeystoreWrapper.add(AFd1kSDK.CONVERSION);
        } else if (aFd1kSDK != AFd1kSDK.CONVERSION) {
            this.AFInAppEventType.add(AFd1kSDK.CONVERSION);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[Catch:{ all -> 0x00d3, NullPointerException -> 0x00e1, all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c1 A[SYNTHETIC, Splitter:B:31:0x00c1] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c7 A[Catch:{ NullPointerException -> 0x00d0, all -> 0x00cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.appsflyer.internal.AFc1eSDK<java.lang.String> values(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r2 = "*Non-printing character*"
            java.lang.String r3 = "JSON toString of eventParams map returns null"
            java.lang.String r4 = "\\p{C}"
            java.lang.String r5 = "Unexpected error"
            java.lang.String r6 = ""
            com.appsflyer.internal.AFa1rSDK r0 = r1.AFLogger
            r1.valueOf(r0)
            com.appsflyer.internal.AFa1rSDK r0 = r1.AFLogger
            java.util.Map r0 = r0.AFInAppEventType()
            java.lang.String r7 = "meta"
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x003d
            com.appsflyer.internal.AFe1oSDK r0 = r1.AFLogger$LogLevel     // Catch:{ NullPointerException -> 0x002c }
            com.appsflyer.internal.AFe1kSDK r0 = r0.AFInAppEventType     // Catch:{ NullPointerException -> 0x002c }
            com.appsflyer.internal.AFf1gSDK r0 = r0.AFInAppEventParameterName     // Catch:{ NullPointerException -> 0x002c }
            com.appsflyer.internal.AFf1hSDK r0 = r0.AFInAppEventParameterName     // Catch:{ NullPointerException -> 0x002c }
            com.appsflyer.internal.AFf1iSDK r0 = r0.AFInAppEventParameterName     // Catch:{ NullPointerException -> 0x002c }
            double r8 = r0.values     // Catch:{ NullPointerException -> 0x002c }
            goto L_0x002e
        L_0x002c:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x002e:
            boolean r0 = com.appsflyer.internal.AFa1rSDK.AFInAppEventParameterName((double) r8)
            if (r0 == 0) goto L_0x003d
            com.appsflyer.internal.AFa1rSDK r0 = r1.AFLogger
            java.util.Map r0 = r0.AFInAppEventType()
            r0.remove(r7)
        L_0x003d:
            com.appsflyer.internal.AFa1rSDK r0 = r1.AFLogger
            java.lang.String r7 = r0.afErrorLog
            com.appsflyer.internal.AFa1rSDK r0 = r1.AFLogger
            java.util.Map r8 = r0.AFInAppEventType()
            r9 = 0
            r10 = 1
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ NullPointerException -> 0x006d, all -> 0x0065 }
            r0.<init>(r8)     // Catch:{ NullPointerException -> 0x006d, all -> 0x0065 }
            java.lang.String r11 = r0.toString()     // Catch:{ NullPointerException -> 0x006d, all -> 0x0065 }
            if (r11 == 0) goto L_0x005a
            java.lang.String r0 = r11.replaceAll(r4, r2)     // Catch:{ NullPointerException -> 0x0063, all -> 0x0060 }
            goto L_0x00e8
        L_0x005a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ NullPointerException -> 0x0063, all -> 0x0060 }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x0063, all -> 0x0060 }
            throw r0     // Catch:{ NullPointerException -> 0x0063, all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            r9 = r11
            goto L_0x0066
        L_0x0063:
            r0 = move-exception
            goto L_0x006f
        L_0x0065:
            r0 = move-exception
        L_0x0066:
            com.appsflyer.AFLogger.afErrorLog(r5, r0, r10)
            r0 = r6
            r11 = r9
            goto L_0x00e8
        L_0x006d:
            r0 = move-exception
            r11 = r9
        L_0x006f:
            java.lang.String r12 = "JSONObject return null String object. Trying to create AFJsonObject."
            com.appsflyer.AFLogger.afErrorLog(r12, r0, r10)
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x00d3 }
            r12 = 0
            r0[r12] = r8     // Catch:{ all -> 0x00d3 }
            java.util.Map<java.lang.Integer, java.lang.Object> r8 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00d3 }
            r13 = -907605519(0xffffffffc9e709f1, float:-1892670.1)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r8 = r8.get(r14)     // Catch:{ all -> 0x00d3 }
            if (r8 != 0) goto L_0x00b6
            int r8 = android.view.View.MeasureSpec.getSize(r12)     // Catch:{ all -> 0x00d3 }
            char r8 = (char) r8     // Catch:{ all -> 0x00d3 }
            int r14 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x00d3 }
            int r14 = r14 >> 16
            int r14 = r14 + 73
            int r15 = android.view.View.resolveSize(r12, r12)     // Catch:{ all -> 0x00d3 }
            int r15 = r15 + 36
            java.lang.Object r8 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r8, r14, r15)     // Catch:{ all -> 0x00d3 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x00d3 }
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x00d3 }
            java.lang.Class<java.util.Map> r15 = java.util.Map.class
            r14[r12] = r15     // Catch:{ all -> 0x00d3 }
            java.lang.String r12 = "values"
            java.lang.reflect.Method r8 = r8.getMethod(r12, r14)     // Catch:{ all -> 0x00d3 }
            java.util.Map<java.lang.Integer, java.lang.Object> r12 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00d3 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00d3 }
            r12.put(r13, r8)     // Catch:{ all -> 0x00d3 }
        L_0x00b6:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch:{ all -> 0x00d3 }
            java.lang.Object r0 = r8.invoke(r9, r0)     // Catch:{ all -> 0x00d3 }
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x00d3 }
            if (r8 == 0) goto L_0x00c7
            java.lang.String r0 = r8.replaceAll(r4, r2)     // Catch:{ NullPointerException -> 0x00d0, all -> 0x00cd }
            r11 = r8
            goto L_0x00e8
        L_0x00c7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ NullPointerException -> 0x00d0, all -> 0x00cd }
            r0.<init>(r3)     // Catch:{ NullPointerException -> 0x00d0, all -> 0x00cd }
            throw r0     // Catch:{ NullPointerException -> 0x00d0, all -> 0x00cd }
        L_0x00cd:
            r0 = move-exception
            r11 = r8
            goto L_0x00dd
        L_0x00d0:
            r0 = move-exception
            r11 = r8
            goto L_0x00e2
        L_0x00d3:
            r0 = move-exception
            java.lang.Throwable r2 = r0.getCause()     // Catch:{ NullPointerException -> 0x00e1, all -> 0x00dc }
            if (r2 == 0) goto L_0x00db
            throw r2     // Catch:{ NullPointerException -> 0x00e1, all -> 0x00dc }
        L_0x00db:
            throw r0     // Catch:{ NullPointerException -> 0x00e1, all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
        L_0x00dd:
            com.appsflyer.AFLogger.afErrorLog(r5, r0, r10)
            goto L_0x00e7
        L_0x00e1:
            r0 = move-exception
        L_0x00e2:
            java.lang.String r2 = "AFJsonObject return null String object."
            com.appsflyer.AFLogger.afErrorLog(r2, r0, r10)
        L_0x00e7:
            r0 = r6
        L_0x00e8:
            if (r11 != 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r6 = r11
        L_0x00ec:
            boolean r2 = r0.equals(r6)
            if (r2 != 0) goto L_0x00f8
            java.lang.String r2 = "Payload contains non-printing characters"
            com.appsflyer.AFLogger.afWarnLog(r2)
            goto L_0x00f9
        L_0x00f8:
            r0 = r6
        L_0x00f9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r3 = ": preparing data: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            com.appsflyer.internal.AFb1tSDK.AFInAppEventParameterName(r2)
            com.appsflyer.internal.AFb1uSDK r2 = r1.afRDLog
            r2.valueOf(r7, r0)
            com.appsflyer.internal.AFc1hSDK r0 = r1.afDebugLog
            com.appsflyer.internal.AFa1rSDK r2 = r1.AFLogger
            com.appsflyer.internal.AFc1tSDK r3 = r1.getLevel
            r4 = r17
            com.appsflyer.internal.AFc1eSDK r0 = r0.AFKeystoreWrapper((com.appsflyer.internal.AFa1rSDK) r2, (java.lang.String) r4, (com.appsflyer.internal.AFc1tSDK) r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1uSDK.values(java.lang.String):com.appsflyer.internal.AFc1eSDK");
    }

    /* access modifiers changed from: protected */
    public final AppsFlyerRequestListener afDebugLog() {
        return this.AFLogger.AFInAppEventParameterName;
    }

    /* access modifiers changed from: protected */
    public void valueOf(AFa1rSDK aFa1rSDK) {
        AFd1oSDK aFd1oSDK;
        boolean z = true;
        if (aFa1rSDK.afErrorLog()) {
            aFa1rSDK.values(new AFc1uSDK.AFa1xSDK(aFa1rSDK.AFInAppEventType(), this.afErrorLog.values.AFInAppEventType));
            AFe1hSDK aFe1hSDK = this.afErrorLog;
            Map<String, Object> AFInAppEventType = aFa1rSDK.AFInAppEventType();
            try {
                Object[] objArr = new Object[2];
                objArr[1] = aFe1hSDK.values.AFInAppEventType;
                objArr[0] = AFInAppEventType;
                Object obj = AFb1lSDK.AppsFlyer2dXConversionCallback.get(-1179909678);
                if (obj == null) {
                    obj = ((Class) AFb1lSDK.AFKeystoreWrapper((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getSize(0) + 37, 87 - ImageFormat.getBitsPerPixel(0))).getDeclaredConstructor(new Class[]{Map.class, Context.class});
                    AFb1lSDK.AppsFlyer2dXConversionCallback.put(-1179909678, obj);
                }
                aFa1rSDK.values((Map) ((Constructor) obj).newInstance(objArr));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (aFa1rSDK.AFLogger()) {
            aFa1rSDK.values(this.afErrorLog.AFKeystoreWrapper());
        }
        Set<AFd1kSDK> set = this.AFInAppEventType;
        boolean z2 = set.contains(AFd1kSDK.LAUNCH) || set.contains(AFd1kSDK.CONVERSION);
        if (afRDLog() && z2) {
            aFa1rSDK.AFInAppEventType(this.afWarnLog.AFInAppEventType("appsFlyerCount", 0));
        }
        try {
            if (aFa1rSDK.AFInAppEventType().containsKey("appsflyerKey") && aFa1rSDK.afErrorLog()) {
                new AFa1aSDK();
                aFa1rSDK.values("af_v", AFa1aSDK.AFKeystoreWrapper(aFa1rSDK.AFInAppEventType()));
                new AFa1aSDK();
                aFa1rSDK.values("af_v2", AFa1aSDK.AFInAppEventParameterName(aFa1rSDK.AFInAppEventType()));
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLog("QUEUE: failed to update the event, is missing DevKey? Error: ".concat(String.valueOf(th2)), th2);
        }
        if (aFa1rSDK.afInfoLog()) {
            Map<String, Object> values = values(aFa1rSDK);
            AFd1qSDK aFd1qSDK = this.AFVersionDeclaration;
            String valueOf = aFd1qSDK.valueOf();
            String values2 = aFd1qSDK.values();
            if (AFd1qSDK.AFInAppEventType()) {
                aFd1oSDK = AFd1oSDK.DEFAULT;
            } else {
                aFd1oSDK = AFd1oSDK.API;
            }
            AFd1rSDK aFd1rSDK = new AFd1rSDK(valueOf, values2, aFd1oSDK);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", aFd1rSDK.AFInAppEventType);
            if (aFd1rSDK.AFInAppEventParameterName != AFd1oSDK.DEFAULT) {
                jSONObject.put(Constants.METHOD, aFd1rSDK.AFInAppEventParameterName.AFInAppEventType);
            }
            CharSequence charSequence = aFd1rSDK.AFKeystoreWrapper;
            if (charSequence != null && !BiometricFragment.AnonymousClass5.asBinder(charSequence)) {
                z = false;
            }
            if (!z) {
                jSONObject.put("prefix", aFd1rSDK.AFKeystoreWrapper);
            }
            values.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, jSONObject);
        }
        if (this.afErrorLogForExcManagerOnly.AFInAppEventParameterName("AF_PREINSTALL_DISABLED")) {
            values(aFa1rSDK).put("preinstall_disabled", Boolean.TRUE);
        }
    }

    private static Map<String, Object> values(AFa1rSDK aFa1rSDK) {
        Map<String, Object> map = (Map) aFa1rSDK.AFInAppEventType().get("meta");
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        aFa1rSDK.AFInAppEventType().put("meta", hashMap);
        return hashMap;
    }
}
