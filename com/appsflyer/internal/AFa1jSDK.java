package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class AFa1jSDK implements Runnable {
    private static String AFInAppEventParameterName = "https://%ssdk-services.%s/validate-android-signature";
    private static String valueOf;
    private final WeakReference<Context> AFInAppEventType;
    private final String AFKeystoreWrapper;
    /* access modifiers changed from: private */
    public final String AFLogger;
    private final String afDebugLog;
    /* access modifiers changed from: private */
    public final String afErrorLog;
    private final Map<String, String> afErrorLogForExcManagerOnly;
    /* access modifiers changed from: private */
    public final String afInfoLog;
    private final String afRDLog;
    private final Intent values;

    static {
        StringBuilder sb = new StringBuilder("https://%svalidate.%s/api/v");
        sb.append(AFa1dSDK.AFKeystoreWrapper);
        sb.append("/androidevent?buildnumber=6.11.1&app_id=");
        valueOf = sb.toString();
    }

    AFa1jSDK(Context context, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Intent intent) {
        this.AFInAppEventType = new WeakReference<>(context);
        this.AFKeystoreWrapper = str;
        this.afDebugLog = str2;
        this.afErrorLog = str4;
        this.afInfoLog = str5;
        this.AFLogger = str6;
        this.afErrorLogForExcManagerOnly = map;
        this.afRDLog = str3;
        this.values = intent;
    }

    public final void run() {
        String str = this.AFKeystoreWrapper;
        if (str != null && str.length() != 0 && !AppsFlyerLib.getInstance().isStopped()) {
            try {
                Context context = this.AFInAppEventType.get();
                if (context != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("public-key", this.afDebugLog);
                    hashMap.put("sig-data", this.afErrorLog);
                    hashMap.put("signature", this.afRDLog);
                    HashMap hashMap2 = new HashMap(hashMap);
                    Map<String, String> map = this.afErrorLogForExcManagerOnly;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.format(valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
                    sb.append(context.getPackageName());
                    String obj = sb.toString();
                    String string = AFa1dSDK.AFInAppEventParameterName(context).getString("referrer", "");
                    AFf1mSDK aFf1mSDK = new AFf1mSDK();
                    aFf1mSDK.AFLogger = string;
                    AFf1mSDK aFf1mSDK2 = aFf1mSDK;
                    AFa1dSDK valueOf2 = AFa1dSDK.valueOf();
                    Map<String, Object> valueOf3 = valueOf2.valueOf((AFa1rSDK) aFf1mSDK);
                    valueOf3.put("price", this.afInfoLog);
                    valueOf3.put("currency", this.AFLogger);
                    valueOf3.put("receipt_data", hashMap2);
                    if (map != null) {
                        valueOf3.put("extra_prms", map);
                    }
                    valueOf3.putAll(valueOf2.values().AppsFlyer2dXConversionCallback().AFKeystoreWrapper());
                    AFInAppEventType(context, (AFf1mSDK) aFf1mSDK.values(valueOf3).AFInAppEventParameterName(obj));
                    hashMap.put("dev_key", this.AFKeystoreWrapper);
                    hashMap.put("app_id", context.getPackageName());
                    hashMap.put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(context));
                    String string2 = AppsFlyerProperties.getInstance().getString("advertiserId");
                    if (string2 != null) {
                        hashMap.put("advertiserId", string2);
                    }
                    AFf1pSDK aFf1pSDK = (AFf1pSDK) new AFf1pSDK().values(hashMap).AFInAppEventParameterName(String.format(AFInAppEventParameterName, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
                    final AFe1uSDK AFInAppEventType2 = AFInAppEventType(context, aFf1pSDK);
                    aFf1pSDK.AFInAppEventParameterName = new AppsFlyerRequestListener() {
                        public final void onSuccess() {
                            try {
                                JSONObject jSONObject = new JSONObject((String) AFInAppEventType2.afInfoLog.getBody());
                                AFLogger.afInfoLog("Validate response ok: ".concat(String.valueOf(jSONObject)));
                                AFa1jSDK.valueOf(jSONObject.optBoolean("result"), AFa1jSDK.this.afErrorLog, AFa1jSDK.this.afInfoLog, AFa1jSDK.this.AFLogger, jSONObject.toString());
                            } catch (Exception e) {
                                AFLogger.afErrorLog("Failed Validate request: ".concat(String.valueOf(e)), e);
                                AFa1jSDK.valueOf(false, AFa1jSDK.this.afErrorLog, AFa1jSDK.this.afInfoLog, AFa1jSDK.this.AFLogger, e.getMessage());
                            }
                        }

                        public final void onError(int i, String str) {
                            AFd1tSDK<Result> aFd1tSDK;
                            if (i == 50 && (aFd1tSDK = AFInAppEventType2.afInfoLog) != null) {
                                str = aFd1tSDK.toString();
                            }
                            AFa1jSDK.valueOf(false, AFa1jSDK.this.afErrorLog, AFa1jSDK.this.afInfoLog, AFa1jSDK.this.AFLogger, str);
                        }
                    };
                }
            } catch (Throwable th) {
                if (AFa1dSDK.AFInAppEventType != null) {
                    AFLogger.afErrorLog("Failed Validate request + ex", th);
                    valueOf(false, this.afErrorLog, this.afInfoLog, this.AFLogger, th.getMessage());
                }
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
    }

    private static AFe1uSDK AFInAppEventType(Context context, AFf1lSDK aFf1lSDK) {
        AFa1dSDK.valueOf().AFInAppEventType(context);
        AFc1pSDK values2 = AFa1dSDK.valueOf().values();
        aFf1lSDK.AFInAppEventType(values2.AFKeystoreWrapper().values.AFInAppEventType("appsFlyerCount", 0));
        AFe1uSDK aFe1uSDK = new AFe1uSDK(aFf1lSDK, values2);
        AFd1mSDK level = values2.getLevel();
        level.AFKeystoreWrapper.execute(new Runnable(aFe1uSDK) {
            private /* synthetic */ AFd1jSDK AFInAppEventType;

            {
                this.AFInAppEventType = r2;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c6, code lost:
                if (r1 == false) goto L_0x016a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c8, code lost:
                r6.AFKeystoreWrapper.afRDLog.add(r6.AFInAppEventType.valueOf);
                r0 = new java.lang.StringBuilder("QUEUE: new task added: ");
                r0.append(r6.AFInAppEventType);
                com.appsflyer.AFLogger.afDebugLog(r0.toString());
                r0 = r6.AFKeystoreWrapper.valueOf.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f2, code lost:
                if (r0.hasNext() == false) goto L_0x00fb;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
                r1 = r0.next();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:35:0x00fb, code lost:
                r0 = r6.AFKeystoreWrapper;
                r0.AFInAppEventType.submit(new com.appsflyer.internal.AFd1mSDK.AnonymousClass1(r0));
                r0 = r6.AFKeystoreWrapper;
                r1 = r0.afInfoLog;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x010b, code lost:
                monitor-enter(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
                r2 = (r0.afInfoLog.size() + r0.AFLogger.size()) - 40;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x011b, code lost:
                if (r2 <= 0) goto L_0x0165;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:40:0x011d, code lost:
                r3 = !r0.AFLogger.isEmpty();
                r4 = !r0.afInfoLog.isEmpty();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x012d, code lost:
                if (r4 == false) goto L_0x0153;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:42:0x012f, code lost:
                if (r3 == false) goto L_0x0153;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:44:0x0145, code lost:
                if (((com.appsflyer.internal.AFd1jSDK) r0.afInfoLog.first()).AFInAppEventType((com.appsflyer.internal.AFd1jSDK) r0.AFLogger.first()) <= 0) goto L_0x014d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0147, code lost:
                r0.AFInAppEventType(r0.afInfoLog);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:46:0x014d, code lost:
                r0.AFInAppEventType(r0.AFLogger);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:47:0x0153, code lost:
                if (r4 == false) goto L_0x015b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:48:0x0155, code lost:
                r0.AFInAppEventType(r0.afInfoLog);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x015b, code lost:
                if (r3 == false) goto L_0x0162;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:50:0x015d, code lost:
                r0.AFInAppEventType(r0.AFLogger);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:51:0x0162, code lost:
                r2 = r2 - 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:52:0x0165, code lost:
                monitor-exit(r1);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:53:0x0166, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:57:0x016a, code lost:
                r0 = new java.lang.StringBuilder("QUEUE: tried to add already pending task: ");
                r0.append(r6.AFInAppEventType);
                com.appsflyer.AFLogger.afWarnLog(r0.toString());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x017d, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r0 = r0.afInfoLog
                    monitor-enter(r0)
                    com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.Set<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.afDebugLog     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0193 }
                    if (r1 == 0) goto L_0x0026
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                    java.lang.String r2 = "QUEUE: tried to add already running task: "
                    r1.<init>(r2)     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    r1.append(r2)     // Catch:{ all -> 0x0193 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0193 }
                    com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0193 }
                    monitor-exit(r0)
                    return
                L_0x0026:
                    com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.afInfoLog     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0193 }
                    if (r1 != 0) goto L_0x017e
                    com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.AFLogger     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0193 }
                    if (r1 == 0) goto L_0x0040
                    goto L_0x017e
                L_0x0040:
                    com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    java.util.Set<com.appsflyer.internal.AFd1kSDK> r3 = r2.AFKeystoreWrapper     // Catch:{ all -> 0x0193 }
                    java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0193 }
                L_0x004a:
                    boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0193 }
                    if (r4 == 0) goto L_0x0064
                    java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1kSDK r4 = (com.appsflyer.internal.AFd1kSDK) r4     // Catch:{ all -> 0x0193 }
                    java.util.Set<com.appsflyer.internal.AFd1kSDK> r5 = r1.afRDLog     // Catch:{ all -> 0x0193 }
                    boolean r5 = r5.contains(r4)     // Catch:{ all -> 0x0193 }
                    if (r5 == 0) goto L_0x004a
                    java.util.Set<com.appsflyer.internal.AFd1kSDK> r5 = r2.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    r5.add(r4)     // Catch:{ all -> 0x0193 }
                    goto L_0x004a
                L_0x0064:
                    com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    boolean r1 = r1.valueOf((com.appsflyer.internal.AFd1jSDK<?>) r2)     // Catch:{ all -> 0x0193 }
                    if (r1 == 0) goto L_0x0079
                    com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.afInfoLog     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    boolean r1 = r1.add(r2)     // Catch:{ all -> 0x0193 }
                    goto L_0x009d
                L_0x0079:
                    com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.AFLogger     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    boolean r1 = r1.add(r2)     // Catch:{ all -> 0x0193 }
                    if (r1 == 0) goto L_0x009d
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                    java.lang.String r3 = "QUEUE: new task was blocked: "
                    r2.<init>(r3)     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r3 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    r2.append(r3)     // Catch:{ all -> 0x0193 }
                    java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0193 }
                    com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    r2.AFKeystoreWrapper()     // Catch:{ all -> 0x0193 }
                L_0x009d:
                    if (r1 == 0) goto L_0x00b2
                    com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r2 = r2.afInfoLog     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1mSDK r3 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.List<com.appsflyer.internal.AFd1jSDK<?>> r3 = r3.afErrorLog     // Catch:{ all -> 0x0193 }
                    r2.addAll(r3)     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x0193 }
                    java.util.List<com.appsflyer.internal.AFd1jSDK<?>> r2 = r2.afErrorLog     // Catch:{ all -> 0x0193 }
                    r2.clear()     // Catch:{ all -> 0x0193 }
                    goto L_0x00c5
                L_0x00b2:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                    java.lang.String r3 = "QUEUE: task not added, it's already in the queue: "
                    r2.<init>(r3)     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r3 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    r2.append(r3)     // Catch:{ all -> 0x0193 }
                    java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0193 }
                    com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0193 }
                L_0x00c5:
                    monitor-exit(r0)
                    if (r1 == 0) goto L_0x016a
                    com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                    java.util.Set<com.appsflyer.internal.AFd1kSDK> r0 = r0.afRDLog
                    com.appsflyer.internal.AFd1jSDK r1 = r6.AFInAppEventType
                    com.appsflyer.internal.AFd1kSDK r1 = r1.valueOf
                    r0.add(r1)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "QUEUE: new task added: "
                    r0.<init>(r1)
                    com.appsflyer.internal.AFd1jSDK r1 = r6.AFInAppEventType
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    com.appsflyer.AFLogger.afDebugLog(r0)
                    com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                    java.util.List<com.appsflyer.internal.AFd1nSDK> r0 = r0.valueOf
                    java.util.Iterator r0 = r0.iterator()
                L_0x00ee:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x00fb
                    java.lang.Object r1 = r0.next()
                    com.appsflyer.internal.AFd1nSDK r1 = (com.appsflyer.internal.AFd1nSDK) r1
                    goto L_0x00ee
                L_0x00fb:
                    com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                    java.util.concurrent.ExecutorService r1 = r0.AFInAppEventType
                    com.appsflyer.internal.AFd1mSDK$1 r2 = new com.appsflyer.internal.AFd1mSDK$1
                    r2.<init>()
                    r1.submit(r2)
                    com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r0.afInfoLog
                    monitor-enter(r1)
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r2 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                    int r2 = r2.size()     // Catch:{ all -> 0x0167 }
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                    int r3 = r3.size()     // Catch:{ all -> 0x0167 }
                    int r2 = r2 + r3
                    int r2 = r2 + -40
                L_0x011b:
                    if (r2 <= 0) goto L_0x0165
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                    boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0167 }
                    r3 = r3 ^ 1
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r4 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                    boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0167 }
                    r4 = r4 ^ 1
                    if (r4 == 0) goto L_0x0153
                    if (r3 == 0) goto L_0x0153
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                    java.lang.Object r3 = r3.first()     // Catch:{ all -> 0x0167 }
                    com.appsflyer.internal.AFd1jSDK r3 = (com.appsflyer.internal.AFd1jSDK) r3     // Catch:{ all -> 0x0167 }
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r4 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                    java.lang.Object r4 = r4.first()     // Catch:{ all -> 0x0167 }
                    com.appsflyer.internal.AFd1jSDK r4 = (com.appsflyer.internal.AFd1jSDK) r4     // Catch:{ all -> 0x0167 }
                    int r3 = r3.AFInAppEventType(r4)     // Catch:{ all -> 0x0167 }
                    if (r3 <= 0) goto L_0x014d
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                    r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                    goto L_0x0162
                L_0x014d:
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                    r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                    goto L_0x0162
                L_0x0153:
                    if (r4 == 0) goto L_0x015b
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.afInfoLog     // Catch:{ all -> 0x0167 }
                    r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                    goto L_0x0162
                L_0x015b:
                    if (r3 == 0) goto L_0x0162
                    java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r3 = r0.AFLogger     // Catch:{ all -> 0x0167 }
                    r0.AFInAppEventType(r3)     // Catch:{ all -> 0x0167 }
                L_0x0162:
                    int r2 = r2 + -1
                    goto L_0x011b
                L_0x0165:
                    monitor-exit(r1)
                    return
                L_0x0167:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                L_0x016a:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "QUEUE: tried to add already pending task: "
                    r0.<init>(r1)
                    com.appsflyer.internal.AFd1jSDK r1 = r6.AFInAppEventType
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    com.appsflyer.AFLogger.afWarnLog(r0)
                    return
                L_0x017e:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0193 }
                    java.lang.String r2 = "QUEUE: tried to add already scheduled task: "
                    r1.<init>(r2)     // Catch:{ all -> 0x0193 }
                    com.appsflyer.internal.AFd1jSDK r2 = r6.AFInAppEventType     // Catch:{ all -> 0x0193 }
                    r1.append(r2)     // Catch:{ all -> 0x0193 }
                    java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0193 }
                    com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0193 }
                    monitor-exit(r0)
                    return
                L_0x0193:
                    r1 = move-exception
                    monitor-exit(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.AnonymousClass5.run():void");
            }
        });
        return aFe1uSDK;
    }

    /* access modifiers changed from: private */
    public static void valueOf(boolean z, String str, String str2, String str3, String str4) {
        if (AFa1dSDK.AFInAppEventType != null) {
            StringBuilder sb = new StringBuilder("Validate callback parameters: ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            AFLogger.afDebugLog(sb.toString());
            if (z) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(str4)));
                AFa1dSDK.AFInAppEventType.onValidateInApp();
                return;
            }
            AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(str4)));
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = AFa1dSDK.AFInAppEventType;
            if (str4 == null) {
                str4 = "Failed validating";
            }
            appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure(str4);
        }
    }
}
