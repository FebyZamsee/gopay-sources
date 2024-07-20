package com.appsflyer.internal;

import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class AFb1mSDK implements AFb1uSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AFLogger = 'ヷ';
    private static int AFLogger$LogLevel = 0;
    private static char afDebugLog = '䥮';
    private static char afErrorLogForExcManagerOnly = 'Ḹ';
    private static char afRDLog = '䷉';
    private static int getLevel = 1;
    private boolean AFInAppEventParameterName = false;
    private final Map<String, Object> AFInAppEventType = new HashMap();
    private List<String> AFKeystoreWrapper = new ArrayList();
    private String afErrorLog = "-1";
    private boolean afInfoLog = (true ^ AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false));
    private int valueOf = 0;
    private boolean values = true;

    public final void AFInAppEventType(String str) {
        synchronized (this) {
            int i = (AFLogger$LogLevel + 115) % 128;
            getLevel = i;
            this.afErrorLog = str;
            int i2 = i + 15;
            AFLogger$LogLevel = i2 % 128;
            if (i2 % 2 != 0) {
                throw new ArithmeticException();
            }
        }
    }

    public final void AFInAppEventParameterName() {
        synchronized (this) {
            this.AFInAppEventParameterName = true;
            AFInAppEventType("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            int i = AFLogger$LogLevel + 91;
            getLevel = i % 128;
            if ((i % 2 == 0 ? 13 : '9') != '9') {
                throw new ArithmeticException();
            }
        }
    }

    public final void values() {
        synchronized (this) {
            AFInAppEventType("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            this.AFInAppEventParameterName = false;
            this.values = false;
            int i = getLevel + 5;
            AFLogger$LogLevel = i % 128;
            if ((i % 2 != 0 ? 'G' : 12) != 12) {
                throw new ArithmeticException();
            }
        }
    }

    public final void valueOf() {
        synchronized (this) {
            AFLogger$LogLevel = (getLevel + 69) % 128;
            this.AFInAppEventType.clear();
            this.AFKeystoreWrapper.clear();
            this.valueOf = 0;
            getLevel = (AFLogger$LogLevel + 3) % 128;
        }
    }

    public final void AFInAppEventParameterName(String str, PackageManager packageManager, AFc1pSDK aFc1pSDK) {
        try {
            AFe1tSDK aFe1tSDK = new AFe1tSDK(AFKeystoreWrapper(str, packageManager, aFc1pSDK), aFc1pSDK);
            AFd1mSDK level = aFc1pSDK.getLevel();
            level.AFKeystoreWrapper.execute(new Runnable(aFe1tSDK) {
                private /* synthetic */ AFd1jSDK AFInAppEventType;

                {
                    this.AFInAppEventType = r2;
                }

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
            AFLogger$LogLevel = (getLevel + 11) % 128;
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }

    private Map<String, Object> AFKeystoreWrapper(String str, PackageManager packageManager, AFc1pSDK aFc1pSDK) {
        getLevel = (AFLogger$LogLevel + 113) % 128;
        AFKeystoreWrapper(str, packageManager, aFc1pSDK.AppsFlyer2dXConversionCallback());
        Map<String, Object> AFLogger2 = AFLogger();
        getLevel = (AFLogger$LogLevel + 9) % 128;
        return AFLogger2;
    }

    private boolean afInfoLog() {
        if ((this.afInfoLog ? 'R' : 'E') != 'R') {
            return false;
        }
        int i = getLevel;
        AFLogger$LogLevel = (i + 103) % 128;
        if (!this.values) {
            AFLogger$LogLevel = (i + 1) % 128;
            if (!this.AFInAppEventParameterName) {
                return false;
            }
        }
        getLevel = (AFLogger$LogLevel + 5) % 128;
        return true;
    }

    private void AFInAppEventType(String str, String str2, String str3) {
        synchronized (this) {
            getLevel = (AFLogger$LogLevel + 101) % 128;
            try {
                Map<String, Object> map = this.AFInAppEventType;
                boolean z = true;
                Object[] objArr = new Object[1];
                AFKeystoreWrapper("빩꼲椒", 5 - KeyEvent.keyCodeFromString(""), objArr);
                map.put(((String) objArr[0]).intern(), Build.BRAND);
                this.AFInAppEventType.put("model", Build.MODEL);
                this.AFInAppEventType.put("platform", "Android");
                this.AFInAppEventType.put("platform_version", Build.VERSION.RELEASE);
                if ((str != null ? 16 : '<') != '<') {
                    int i = AFLogger$LogLevel + 55;
                    getLevel = i % 128;
                    if ((i % 2 == 0 ? '@' : ' ') != '@') {
                        if (!(str.length() <= 0)) {
                            this.AFInAppEventType.put("advertiserId", str);
                        }
                    } else {
                        throw null;
                    }
                }
                if ((str2 != null ? (char) 6 : 11) == 6) {
                    if (str2.length() > 0) {
                        z = false;
                    }
                    if (!z) {
                        getLevel = (AFLogger$LogLevel + 17) % 128;
                        this.AFInAppEventType.put("imei", str2);
                    }
                }
                if (str3 != null && str3.length() > 0) {
                    this.AFInAppEventType.put("android_id", str3);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void AFInAppEventParameterName(String str, String str2, String str3, String str4) {
        synchronized (this) {
            try {
                this.AFInAppEventType.put("sdk_version", str);
                if (str2 != null) {
                    if (!(str2.length() <= 0)) {
                        this.AFInAppEventType.put("devkey", str2);
                        try {
                            getLevel = (AFLogger$LogLevel + 75) % 128;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                if (str3 != null) {
                    AFLogger$LogLevel = (getLevel + 19) % 128;
                    if ((str3.length() > 0 ? ']' : 'C') == ']') {
                        getLevel = (AFLogger$LogLevel + 29) % 128;
                        this.AFInAppEventType.put("originalAppsFlyerId", str3);
                        AFLogger$LogLevel = (getLevel + 115) % 128;
                    }
                }
                if (str4 != null) {
                    int i = AFLogger$LogLevel + 117;
                    getLevel = i % 128;
                    if ((i % 2 == 0 ? 28 : '^') != '^') {
                        throw null;
                    } else if (str4.length() > 0) {
                        this.AFInAppEventType.put("uid", str4);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void valueOf(String str, String str2, String str3, String str4) {
        synchronized (this) {
            int i = (AFLogger$LogLevel + 19) % 128;
            getLevel = i;
            boolean z = false;
            Throwable th = null;
            if (str != null) {
                int i2 = i + 27;
                AFLogger$LogLevel = i2 % 128;
                if (i2 % 2 == 0) {
                    try {
                        if (str.length() > 0) {
                            this.AFInAppEventType.put("app_id", str);
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                } else {
                    th.hashCode();
                    throw th;
                }
            }
            if (str2 != null) {
                if ((str2.length() > 0 ? '1' : 'V') != 'V') {
                    int i3 = getLevel + 5;
                    AFLogger$LogLevel = i3 % 128;
                    if (i3 % 2 == 0) {
                        this.AFInAppEventType.put("app_version", str2);
                    } else {
                        this.AFInAppEventType.put("app_version", str2);
                        th.hashCode();
                        throw th;
                    }
                }
            }
            if (str3 != null) {
                int i4 = getLevel + 9;
                AFLogger$LogLevel = i4 % 128;
                if (i4 % 2 == 0) {
                    if (str3.length() <= 0) {
                        z = true;
                    }
                    if (!z) {
                        this.AFInAppEventType.put(AppsFlyerProperties.CHANNEL, str3);
                    }
                } else {
                    th.hashCode();
                    throw th;
                }
            }
            if (str4 != null) {
                if ((str4.length() > 0 ? 'T' : 'H') == 'T') {
                    this.AFInAppEventType.put("preInstall", str4);
                }
            }
        }
    }

    public final void AFKeystoreWrapper(String str, String... strArr) {
        AFLogger$LogLevel = (getLevel + 107) % 128;
        AFInAppEventType("public_api_call", str, strArr);
        getLevel = (AFLogger$LogLevel + 57) % 128;
    }

    public final void AFInAppEventType(Throwable th) {
        String str;
        StackTraceElement[] stackTraceElementArr;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        if (cause == null) {
            AFLogger$LogLevel = (getLevel + 125) % 128;
            str = th.getMessage();
        } else {
            str = cause.getMessage();
        }
        if (!(cause != null)) {
            stackTraceElementArr = th.getStackTrace();
            AFLogger$LogLevel = (getLevel + 109) % 128;
        } else {
            stackTraceElementArr = cause.getStackTrace();
        }
        AFInAppEventType(Constants.EXCEPTION, simpleName, valueOf(str, stackTraceElementArr));
        int i = getLevel + 95;
        AFLogger$LogLevel = i % 128;
        if ((i % 2 != 0 ? 'F' : ')') != ')') {
            throw new ArithmeticException();
        }
    }

    public final void valueOf(String str, String str2) {
        AFLogger$LogLevel = (getLevel + 115) % 128;
        boolean z = false;
        AFInAppEventType("server_request", str, str2);
        int i = getLevel + 103;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            z = true;
        }
        if (!z) {
            throw null;
        }
    }

    public final void AFInAppEventType(String str, int i, String str2) {
        getLevel = (AFLogger$LogLevel + 65) % 128;
        AFInAppEventType("server_response", str, String.valueOf(i), str2);
        int i2 = AFLogger$LogLevel + 9;
        getLevel = i2 % 128;
        if ((i2 % 2 == 0 ? ',' : 8) == ',') {
            throw new ArithmeticException();
        }
    }

    public final void AFInAppEventType(String str, String str2) {
        int i = getLevel + 39;
        AFLogger$LogLevel = i % 128;
        int i2 = i % 2;
        AFInAppEventType((String) null, str, str2);
    }

    private void AFInAppEventType(String str, String str2, String... strArr) {
        String str3;
        synchronized (this) {
            Throwable th = null;
            if (afInfoLog()) {
                char c = '=';
                int i = AFLogger$LogLevel + 61;
                getLevel = i % 128;
                if (!(i % 2 != 0)) {
                    th.hashCode();
                    throw th;
                } else if (this.valueOf < 98304) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        String join = TextUtils.join(", ", strArr);
                        if (str != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append(" ");
                            sb.append(Thread.currentThread().getId());
                            sb.append(" _/AppsFlyer_6.11.1 [");
                            sb.append(str);
                            sb.append("] ");
                            sb.append(str2);
                            sb.append(" ");
                            sb.append(join);
                            str3 = sb.toString();
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(currentTimeMillis);
                            sb2.append(" ");
                            sb2.append(Thread.currentThread().getId());
                            sb2.append(" ");
                            sb2.append(str2);
                            sb2.append("/AppsFlyer_6.11.1 ");
                            sb2.append(join);
                            str3 = sb2.toString();
                        }
                        this.AFKeystoreWrapper.add(str3);
                        this.valueOf += str3.length() << 1;
                        int i2 = AFLogger$LogLevel + 5;
                        getLevel = i2 % 128;
                        if (i2 % 2 != 0) {
                            c = '7';
                        }
                        if (c != '7') {
                            throw th;
                        }
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
            int i3 = AFLogger$LogLevel + 83;
            getLevel = i3 % 128;
            if ((i3 % 2 == 0 ? '\"' : 'Z') == '\"') {
                throw th;
            }
        }
    }

    private Map<String, Object> AFLogger() {
        Map<String, Object> map;
        synchronized (this) {
            int i = AFLogger$LogLevel + 87;
            getLevel = i % 128;
            boolean z = false;
            if (!(i % 2 == 0)) {
                this.AFInAppEventType.put("data", this.AFKeystoreWrapper);
                afErrorLog();
                map = this.AFInAppEventType;
                int i2 = getLevel + 37;
                AFLogger$LogLevel = i2 % 128;
                if (i2 % 2 == 0) {
                    z = true;
                }
                if (!z) {
                    Throwable th = null;
                    th.hashCode();
                    throw th;
                }
            } else {
                this.AFInAppEventType.put("data", this.AFKeystoreWrapper);
                afErrorLog();
                throw new ArithmeticException();
            }
        }
        return map;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x007d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFKeystoreWrapper(java.lang.String r5, android.content.pm.PackageManager r6, com.appsflyer.internal.AFe1hSDK r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = AFLogger$LogLevel     // Catch:{ all -> 0x00a0 }
            int r0 = r0 + 77
            int r0 = r0 % 128
            getLevel = r0     // Catch:{ all -> 0x00a0 }
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = "remote_debug_static_data"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x00a0 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r4.AFInAppEventType     // Catch:{ all -> 0x00a0 }
            r2.clear()     // Catch:{ all -> 0x00a0 }
            if (r1 == 0) goto L_0x0029
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.AFInAppEventType     // Catch:{ all -> 0x0095 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0095 }
            r6.<init>(r1)     // Catch:{ all -> 0x0095 }
            java.util.Map r6 = com.appsflyer.internal.AFa1tSDK.AFKeystoreWrapper((org.json.JSONObject) r6)     // Catch:{ all -> 0x0095 }
            r5.putAll(r6)     // Catch:{ all -> 0x0095 }
            goto L_0x0095
        L_0x0029:
            com.appsflyer.internal.AFa1dSDK r1 = com.appsflyer.internal.AFa1dSDK.valueOf()     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = "advertiserId"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r7 = r7.AFKeystoreWrapper     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = r1.afDebugLog     // Catch:{ all -> 0x00a0 }
            r4.AFInAppEventType((java.lang.String) r2, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ all -> 0x00a0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = "6.11.1."
            r7.<init>(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = com.appsflyer.internal.AFa1dSDK.valueOf     // Catch:{ all -> 0x00a0 }
            r7.append(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00a0 }
            com.appsflyer.internal.AFc1pSDK r1 = r1.values()     // Catch:{ all -> 0x00a0 }
            com.appsflyer.internal.AFe1hSDK r1 = r1.AppsFlyer2dXConversionCallback()     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = r1.valueOf     // Catch:{ all -> 0x00a0 }
            java.lang.String r2 = "KSAppsFlyerId"
            java.lang.String r2 = r0.getString(r2)     // Catch:{ all -> 0x00a0 }
            java.lang.String r3 = "uid"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ all -> 0x00a0 }
            r4.AFInAppEventParameterName(r7, r1, r2, r3)     // Catch:{ all -> 0x00a0 }
            r7 = 0
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r5, r7)     // Catch:{ all -> 0x007d }
            int r6 = r6.versionCode     // Catch:{ all -> 0x007d }
            java.lang.String r7 = "channel"
            java.lang.String r7 = r0.getString(r7)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = "preInstallName"
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x007d }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x007d }
            r4.valueOf(r5, r6, r7, r1)     // Catch:{ all -> 0x007d }
        L_0x007d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x00a0 }
            java.util.Map<java.lang.String, java.lang.Object> r6 = r4.AFInAppEventType     // Catch:{ all -> 0x00a0 }
            r5.<init>(r6)     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = "remote_debug_static_data"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a0 }
            r0.set((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ all -> 0x00a0 }
            int r5 = AFLogger$LogLevel     // Catch:{ all -> 0x00a0 }
            int r5 = r5 + 111
            int r5 = r5 % 128
            getLevel = r5     // Catch:{ all -> 0x00a0 }
        L_0x0095:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.AFInAppEventType     // Catch:{ all -> 0x00a0 }
            java.lang.String r6 = "launch_counter"
            java.lang.String r7 = r4.afErrorLog     // Catch:{ all -> 0x00a0 }
            r5.put(r6, r7)     // Catch:{ all -> 0x00a0 }
            monitor-exit(r4)
            return
        L_0x00a0:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1mSDK.AFKeystoreWrapper(java.lang.String, android.content.pm.PackageManager, com.appsflyer.internal.AFe1hSDK):void");
    }

    private static String[] valueOf(String str, StackTraceElement[] stackTraceElementArr) {
        int i = getLevel;
        int i2 = i + 49;
        AFLogger$LogLevel = i2 % 128;
        Throwable th = null;
        if (i2 % 2 == 0) {
            int i3 = 1;
            if (!(stackTraceElementArr != null)) {
                AFLogger$LogLevel = (i + 19) % 128;
                String[] strArr = {str};
                int i4 = i + 65;
                AFLogger$LogLevel = i4 % 128;
                if (i4 % 2 == 0) {
                    return strArr;
                }
                th.hashCode();
                throw th;
            }
            String[] strArr2 = new String[(stackTraceElementArr.length + 1)];
            strArr2[0] = str;
            while (true) {
                if ((i3 < stackTraceElementArr.length ? '4' : 'J') != '4') {
                    break;
                }
                AFLogger$LogLevel = (getLevel + 25) % 128;
                strArr2[i3] = stackTraceElementArr[i3].toString();
                i3++;
            }
            int i5 = getLevel + 125;
            AFLogger$LogLevel = i5 % 128;
            if (i5 % 2 == 0) {
                return strArr2;
            }
            throw th;
        }
        throw th;
    }

    private void afErrorLog() {
        synchronized (this) {
            this.AFKeystoreWrapper = new ArrayList();
            boolean z = false;
            this.valueOf = 0;
            int i = AFLogger$LogLevel + 59;
            getLevel = i % 128;
            if (i % 2 == 0) {
                z = true;
            }
            if (z) {
                Throwable th = null;
                th.hashCode();
                throw th;
            }
        }
    }

    public final void AFInAppEventType() {
        synchronized (this) {
            getLevel = (AFLogger$LogLevel + 93) % 128;
            this.values = false;
            afErrorLog();
            getLevel = (AFLogger$LogLevel + 111) % 128;
        }
    }

    public final void AFKeystoreWrapper() {
        int i = getLevel + 45;
        int i2 = i % 128;
        AFLogger$LogLevel = i2;
        if (!(i % 2 == 0)) {
            this.afInfoLog = true;
        } else {
            this.afInfoLog = false;
        }
        getLevel = (i2 + 99) % 128;
    }

    public final boolean afRDLog() {
        int i = getLevel + 47;
        AFLogger$LogLevel = i % 128;
        if (!(i % 2 != 0)) {
            return this.AFInAppEventParameterName;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private static void AFKeystoreWrapper(String str, int i, Object[] objArr) {
        Throwable cause;
        int i2 = $10 + 85;
        $11 = i2 % 128;
        if ((i2 % 2 == 0 ? 31 : 'K') != 31) {
            char[] cArr = (char[]) (str != null ? str.toCharArray() : str);
            AFg1bSDK aFg1bSDK = new AFg1bSDK();
            char[] cArr2 = new char[cArr.length];
            aFg1bSDK.values = 0;
            char[] cArr3 = new char[2];
            while (aFg1bSDK.values < cArr.length) {
                cArr3[0] = cArr[aFg1bSDK.values];
                cArr3[1] = cArr[aFg1bSDK.values + 1];
                int i3 = 58224;
                int i4 = 0;
                while (true) {
                    if (!(i4 < 16)) {
                        break;
                    }
                    $11 = ($10 + 111) % 128;
                    char c = cArr3[1];
                    char c2 = cArr3[0];
                    char c3 = (char) ((int) (((long) afRDLog) ^ -4811251968381114924L));
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(afErrorLogForExcManagerOnly);
                        objArr2[2] = Integer.valueOf(c2 >>> 5);
                        objArr2[1] = Integer.valueOf(((c2 << 4) + c3) ^ (c2 + i3));
                        objArr2[0] = Integer.valueOf(c);
                        Object obj = AFa1wSDK.onInstallConversionFailureNative.get(537658797);
                        if (obj == null) {
                            obj = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (5146 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getScrollBarSize() >> 8) + 342, TextUtils.indexOf("", '0', 0) + 38)).getMethod("l", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                            AFa1wSDK.onInstallConversionFailureNative.put(537658797, obj);
                        }
                        char charValue = ((Character) ((Method) obj).invoke((Object) null, objArr2)).charValue();
                        cArr3[1] = charValue;
                        char c4 = cArr3[0];
                        char c5 = (char) ((int) (((long) afDebugLog) ^ -4811251968381114924L));
                        try {
                            Object[] objArr3 = new Object[4];
                            objArr3[3] = Integer.valueOf(AFLogger);
                            objArr3[2] = Integer.valueOf(charValue >>> 5);
                            objArr3[1] = Integer.valueOf(((charValue << 4) + c5) ^ (charValue + i3));
                            objArr3[0] = Integer.valueOf(c4);
                            Object obj2 = AFa1wSDK.onInstallConversionFailureNative.get(537658797);
                            if (obj2 == null) {
                                obj2 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (5147 - KeyEvent.getDeadChar(0, 0)), 342 - Color.green(0), 37 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("l", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                                AFa1wSDK.onInstallConversionFailureNative.put(537658797, obj2);
                            }
                            cArr3[0] = ((Character) ((Method) obj2).invoke((Object) null, objArr3)).charValue();
                            i3 -= 40503;
                            i4++;
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
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = aFg1bSDK;
                    objArr4[0] = aFg1bSDK;
                    Object obj3 = AFa1wSDK.onInstallConversionFailureNative.get(-1282540758);
                    if (obj3 == null) {
                        obj3 = ((Class) AFa1wSDK.AFKeystoreWrapper((char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), View.MeasureSpec.makeMeasureSpec(0, 0) + 73, (ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)) + 36)).getMethod("n", new Class[]{Object.class, Object.class});
                        AFa1wSDK.onInstallConversionFailureNative.put(-1282540758, obj3);
                    }
                    ((Method) obj3).invoke((Object) null, objArr4);
                    $11 = ($10 + 7) % 128;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
            objArr[0] = new String(cArr2, 0, i);
            return;
        }
        throw new ArithmeticException();
    }
}
