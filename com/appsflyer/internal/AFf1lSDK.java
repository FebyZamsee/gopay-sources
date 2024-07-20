package com.appsflyer.internal;

public abstract class AFf1lSDK extends AFf1sSDK {
    public final boolean AFLogger() {
        return false;
    }

    public final boolean afDebugLog() {
        return false;
    }

    public final boolean afErrorLog() {
        return false;
    }

    AFf1lSDK() {
        this((String) null, (Boolean) null);
    }

    AFf1lSDK(String str, Boolean bool) {
        super(str, (String) null, Boolean.FALSE, (Boolean) null, bool);
    }
}
