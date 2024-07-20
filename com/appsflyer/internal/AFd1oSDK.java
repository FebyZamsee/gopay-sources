package com.appsflyer.internal;

public enum AFd1oSDK {
    API("api"),
    RC("rc"),
    DEFAULT("");
    
    public final String AFInAppEventType;

    private AFd1oSDK(String str) {
        this.AFInAppEventType = str;
    }
}
