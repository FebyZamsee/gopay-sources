package com.appsflyer.internal;

public abstract class AFf1sSDK extends AFa1rSDK {
    private final boolean AFLogger$LogLevel;
    public boolean afRDLog;
    private final boolean afWarnLog;

    AFf1sSDK() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AFf1sSDK(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        super(str, str2, Boolean.valueOf(bool3 != null ? bool3.booleanValue() : false));
        boolean z = true;
        this.AFLogger$LogLevel = bool != null ? bool.booleanValue() : true;
        this.afWarnLog = bool2 != null ? bool2.booleanValue() : z;
    }

    public final boolean afWarnLog() {
        return this.afRDLog;
    }

    public final boolean AFLogger$LogLevel() {
        return this.AFLogger$LogLevel;
    }

    public final boolean getLevel() {
        return this.afWarnLog;
    }
}
