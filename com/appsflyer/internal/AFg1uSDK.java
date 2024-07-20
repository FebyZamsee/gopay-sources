package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public abstract class AFg1uSDK extends Observable {
    final Runnable AFKeystoreWrapper;
    public AFa1xSDK AFLogger = AFa1xSDK.NOT_STARTED;
    long afDebugLog;
    public final String afErrorLog;
    public final Map<String, Object> valueOf = new HashMap();
    public final String values;

    public enum AFa1xSDK {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public abstract void valueOf(Context context);

    public AFg1uSDK(String str, String str2, Runnable runnable) {
        this.AFKeystoreWrapper = runnable;
        this.values = str2;
        this.afErrorLog = str;
    }

    public final void AFInAppEventType() {
        this.valueOf.put("source", this.values);
        this.valueOf.put("type", this.afErrorLog);
        this.valueOf.put("latency", Long.valueOf(System.currentTimeMillis() - this.afDebugLog));
        this.AFLogger = AFa1xSDK.FINISHED;
        setChanged();
        notifyObservers();
    }
}
