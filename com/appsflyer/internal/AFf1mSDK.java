package com.appsflyer.internal;

import com.appsflyer.AFInAppEventType;

public final class AFf1mSDK extends AFf1lSDK {
    public AFf1mSDK() {
        super(AFInAppEventType.PURCHASE, Boolean.TRUE);
    }

    public final AFa1rSDK AFInAppEventParameterName(String str) {
        return super.AFInAppEventParameterName(AFKeystoreWrapper(str));
    }

    public final AFd1kSDK AFKeystoreWrapper() {
        return AFd1kSDK.PURCHASE_VALIDATE;
    }
}
