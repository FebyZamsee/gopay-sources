package com.appsflyer.internal;

public final class AFf1rSDK extends AFa1rSDK {
    public final AFd1kSDK afRDLog;

    @Deprecated
    public AFf1rSDK() {
        this.afRDLog = null;
    }

    public AFf1rSDK(String str, byte[] bArr, String str2, AFd1kSDK aFd1kSDK) {
        super((String) null, str, Boolean.FALSE);
        this.valueOf = str2;
        AFInAppEventType(bArr);
        this.afRDLog = aFd1kSDK;
    }

    public final AFd1kSDK AFKeystoreWrapper() {
        AFd1kSDK aFd1kSDK = this.afRDLog;
        if (aFd1kSDK != null) {
            return aFd1kSDK;
        }
        return AFd1kSDK.CACHED_EVENT;
    }
}
