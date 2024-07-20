package com.appsflyer.internal;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AFd1jSDK<Result> implements Comparable<AFd1jSDK<?>>, Callable<AFd1sSDK> {
    private static final AtomicInteger afRDLog = new AtomicInteger();
    public volatile int AFInAppEventParameterName;
    public final Set<AFd1kSDK> AFInAppEventType;
    public final Set<AFd1kSDK> AFKeystoreWrapper = new HashSet();
    private Throwable AFLogger;
    private final String afDebugLog;
    private long afErrorLog;
    private boolean afErrorLogForExcManagerOnly;
    private final int afInfoLog;
    public final AFd1kSDK valueOf;
    public AFd1sSDK values;

    /* access modifiers changed from: protected */
    public abstract boolean AFInAppEventParameterName();

    /* access modifiers changed from: protected */
    public abstract long AFInAppEventType();

    /* access modifiers changed from: protected */
    public abstract AFd1sSDK valueOf() throws Exception;

    /* access modifiers changed from: protected */
    public void values() {
    }

    /* access modifiers changed from: protected */
    public void values(Throwable th) {
    }

    public AFd1jSDK(AFd1kSDK aFd1kSDK, AFd1kSDK[] aFd1kSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFInAppEventType = hashSet;
        int incrementAndGet = afRDLog.incrementAndGet();
        this.afInfoLog = incrementAndGet;
        this.afErrorLogForExcManagerOnly = false;
        this.AFInAppEventParameterName = 0;
        this.valueOf = aFd1kSDK;
        Collections.addAll(hashSet, aFd1kSDKArr);
        if (str != null) {
            this.afDebugLog = str;
        } else {
            this.afDebugLog = String.valueOf(incrementAndGet);
        }
    }

    public void AFKeystoreWrapper() {
        this.afErrorLogForExcManagerOnly = true;
    }

    /* access modifiers changed from: protected */
    public final boolean afRDLog() {
        return this.afErrorLogForExcManagerOnly;
    }

    /* renamed from: AFLogger */
    public final AFd1sSDK call() throws Exception {
        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
        this.values = null;
        this.AFLogger = null;
        long currentTimeMillis = System.currentTimeMillis();
        this.AFInAppEventParameterName++;
        try {
            AFd1sSDK valueOf2 = valueOf();
            this.values = valueOf2;
            this.afErrorLog = System.currentTimeMillis() - currentTimeMillis;
            values();
            return valueOf2;
        } catch (Throwable th) {
            this.afErrorLog = System.currentTimeMillis() - currentTimeMillis;
            values();
            throw th;
        }
    }

    public final Throwable afInfoLog() {
        return this.AFLogger;
    }

    /* renamed from: AFInAppEventType */
    public final int compareTo(AFd1jSDK<?> aFd1jSDK) {
        int i = this.valueOf.onAppOpenAttributionNative - aFd1jSDK.valueOf.onAppOpenAttributionNative;
        if (i != 0) {
            return i;
        }
        if (this.afDebugLog.equals(aFd1jSDK.afDebugLog)) {
            return 0;
        }
        return this.afInfoLog - aFd1jSDK.afInfoLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1jSDK aFd1jSDK = (AFd1jSDK) obj;
        if (this.valueOf != aFd1jSDK.valueOf) {
            return false;
        }
        return this.afDebugLog.equals(aFd1jSDK.afDebugLog);
    }

    public final int hashCode() {
        return (this.valueOf.hashCode() * 31) + this.afDebugLog.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.valueOf);
        sb.append("-");
        sb.append(this.afDebugLog);
        String obj = sb.toString();
        if (String.valueOf(this.afInfoLog).equals(this.afDebugLog)) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append("-");
        sb2.append(this.afInfoLog);
        return sb2.toString();
    }
}
