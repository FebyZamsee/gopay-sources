package com.appsflyer.internal;

import android.content.Context;
import androidx.core.os.EnvironmentCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFe1nSDK;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class AFe1hSDK {
    public volatile boolean AFInAppEventParameterName = false;
    Map<String, Object> AFInAppEventType;
    public volatile String AFKeystoreWrapper;
    private boolean afInfoLog = false;
    private final AFe1nSDK afRDLog;
    public volatile String valueOf;
    public final AFc1tSDK values;

    public AFe1hSDK(AFc1tSDK aFc1tSDK, AFe1nSDK aFe1nSDK) {
        this.values = aFc1tSDK;
        this.afRDLog = aFe1nSDK;
    }

    public final boolean values() {
        return this.AFInAppEventParameterName;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String AFKeystoreWrapper(com.appsflyer.internal.AFb1aSDK r10) {
        /*
            r9 = this;
            java.lang.String r0 = "use cached IMEI: "
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            r2 = 0
            java.lang.String r3 = "collectIMEI"
            boolean r1 = r1.getBoolean(r3, r2)
            java.lang.String r3 = "imeiCached"
            r4 = 0
            java.lang.String r5 = r10.AFInAppEventParameterName(r3, r4)
            if (r1 == 0) goto L_0x00a4
            java.lang.String r1 = r9.AFKeystoreWrapper
            boolean r1 = com.appsflyer.internal.AFb1qSDK.valueOf(r1)
            if (r1 == 0) goto L_0x00a4
            com.appsflyer.internal.AFc1tSDK r1 = r9.values
            android.content.Context r1 = r1.AFInAppEventType
            if (r1 == 0) goto L_0x00ab
            boolean r6 = AFInAppEventParameterName(r1)
            if (r6 == 0) goto L_0x00ab
            java.lang.String r6 = "phone"
            java.lang.Object r1 = r1.getSystemService(r6)     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            java.lang.Class r6 = r1.getClass()     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            java.lang.String r7 = "getDeviceId"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            java.lang.reflect.Method r6 = r6.getMethod(r7, r8)     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            java.lang.Object r1 = r6.invoke(r1, r2)     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            if (r1 == 0) goto L_0x004a
            r5 = r1
            goto L_0x00ac
        L_0x004a:
            if (r5 == 0) goto L_0x00ab
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            java.lang.String r1 = r0.concat(r1)     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ InvocationTargetException -> 0x007e, Exception -> 0x0058 }
            goto L_0x00ac
        L_0x0058:
            r1 = move-exception
            if (r5 == 0) goto L_0x0067
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r0.concat(r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L_0x0068
        L_0x0067:
            r5 = r4
        L_0x0068:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "WARNING: Can't collect IMEI: other reason: "
            r0.<init>(r2)
            java.lang.String r2 = r1.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L_0x00ac
        L_0x007e:
            r1 = move-exception
            if (r5 == 0) goto L_0x008d
            java.lang.String r2 = java.lang.String.valueOf(r5)
            java.lang.String r0 = r0.concat(r2)
            com.appsflyer.AFLogger.afDebugLog(r0)
            goto L_0x008e
        L_0x008d:
            r5 = r4
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "WARNING: Can't collect IMEI because of missing permissions: "
            r0.<init>(r2)
            java.lang.String r2 = r1.getMessage()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
            goto L_0x00ac
        L_0x00a4:
            java.lang.String r0 = r9.AFKeystoreWrapper
            if (r0 == 0) goto L_0x00ab
            java.lang.String r5 = r9.AFKeystoreWrapper
            goto L_0x00ac
        L_0x00ab:
            r5 = r4
        L_0x00ac:
            boolean r0 = com.appsflyer.internal.AFb1qSDK.valueOf(r5)
            if (r0 != 0) goto L_0x00b6
            r10.AFKeystoreWrapper(r3, r5)
            return r5
        L_0x00b6:
            java.lang.String r10 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1hSDK.AFKeystoreWrapper(com.appsflyer.internal.AFb1aSDK):java.lang.String");
    }

    public final Map<String, Object> AFKeystoreWrapper() {
        HashMap hashMap = new HashMap();
        if (valueOf()) {
            hashMap.put("lvl", this.AFInAppEventType);
        } else if (this.afInfoLog) {
            HashMap hashMap2 = new HashMap();
            this.AFInAppEventType = hashMap2;
            hashMap2.put("error", "operation timed out.");
            hashMap.put("lvl", this.AFInAppEventType);
        }
        return hashMap;
    }

    private boolean valueOf() {
        Map<String, Object> map = this.AFInAppEventType;
        return map != null && !map.isEmpty();
    }

    public final boolean AFInAppEventParameterName() {
        return this.afInfoLog && !valueOf();
    }

    public final boolean AFInAppEventType() {
        try {
            Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
            final long currentTimeMillis = System.currentTimeMillis();
            AFe1nSDK aFe1nSDK = this.afRDLog;
            Context context = this.values.AFInAppEventType;
            AnonymousClass5 r6 = new AFe1nSDK.AFa1vSDK() {
                public final void values(String str, String str2) {
                    AFe1hSDK.this.AFInAppEventType = new ConcurrentHashMap();
                    AFe1hSDK.this.AFInAppEventType.put("signedData", str);
                    AFe1hSDK.this.AFInAppEventType.put("signature", str2);
                    AFe1hSDK.this.AFInAppEventType.put("ttr", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
                }

                public final void AFInAppEventType(String str, Exception exc) {
                    AFe1hSDK.this.AFInAppEventType = new ConcurrentHashMap();
                    String message = exc.getMessage();
                    if (message == null) {
                        message = EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    AFe1hSDK.this.AFInAppEventType.put("error", message);
                    AFLogger.afErrorLog(str, exc, true, true, false);
                }
            };
            try {
                Class<?> cls = Class.forName("com.appsflyer.lvl.AppsFlyerLVL");
                Class<?> cls2 = Class.forName("com.appsflyer.lvl.AppsFlyerLVL$resultListener");
                Method method = cls.getMethod("checkLicense", new Class[]{Long.TYPE, Context.class, cls2});
                AFe1nSDK.AnonymousClass3 r10 = new InvocationHandler(r6) {
                    private /* synthetic */ AFa1vSDK AFKeystoreWrapper;

                    {
                        this.AFKeystoreWrapper = r2;
                    }

                    public final Object invoke(Object obj, Method method, Object[] objArr) {
                        if (method.getName().equals("onLvlResult")) {
                            String str = objArr[0];
                            String str2 = str != null ? str : null;
                            String str3 = objArr[1];
                            String str4 = str3 != null ? str3 : null;
                            AFa1vSDK aFa1vSDK = this.AFKeystoreWrapper;
                            if (aFa1vSDK == null) {
                                AFLogger.afDebugLog("onLvlResult invocation succeeded, but listener is null");
                            } else if (str2 != null && str4 != null) {
                                aFa1vSDK.values(str2, str4);
                            } else if (str4 == null) {
                                aFa1vSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                            } else {
                                aFa1vSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                            }
                        } else if (method.getName().equals("onLvlFailure")) {
                            AFa1vSDK aFa1vSDK2 = this.AFKeystoreWrapper;
                            if (aFa1vSDK2 != null) {
                                Exception exc = objArr[0];
                                if (exc != null) {
                                    aFa1vSDK2.AFInAppEventType("onLvlFailure with exception", exc);
                                } else {
                                    aFa1vSDK2.AFInAppEventType("onLvlFailure", new Exception(EnvironmentCompat.MEDIA_UNKNOWN));
                                }
                            } else {
                                AFLogger.afDebugLog("onLvlFailure: listener is null");
                            }
                        } else {
                            AFa1vSDK aFa1vSDK3 = this.AFKeystoreWrapper;
                            if (aFa1vSDK3 != null) {
                                aFa1vSDK3.AFInAppEventType("lvlInvocation failed", new Exception("com.appsflyer.lvl.AppsFlyerLVL$resultListener invocation failed"));
                            }
                        }
                        return null;
                    }
                };
                method.invoke((Object) null, new Object[]{Long.valueOf(currentTimeMillis), context, Proxy.newProxyInstance(cls2.getClassLoader(), new Class[]{cls2}, r10)});
            } catch (ClassNotFoundException e) {
                r6.AFInAppEventType(e.getClass().getSimpleName(), e);
            } catch (NoSuchMethodException e2) {
                r6.AFInAppEventType(e2.getClass().getSimpleName(), e2);
            } catch (IllegalAccessException e3) {
                r6.AFInAppEventType(e3.getClass().getSimpleName(), e3);
            } catch (InvocationTargetException e4) {
                r6.AFInAppEventType(e4.getClass().getSimpleName(), e4);
            }
            this.afInfoLog = true;
        } catch (ClassNotFoundException unused) {
            this.afInfoLog = false;
        }
        return this.afInfoLog;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (!(AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false))) {
            AFa1dSDK.valueOf();
            if (AFa1dSDK.values(context)) {
                return false;
            }
        }
        return true;
    }
}
