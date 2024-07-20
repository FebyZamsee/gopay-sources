package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.Map;

public final class AFd1hSDK extends AFd1fSDK {
    public AFd1hSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1pSDK aFc1pSDK) {
        super(AFd1kSDK.ARS_VALIDATE, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, (String) null, map, purchaseValidationCallback);
        this.AFKeystoreWrapper.add(AFd1kSDK.CONVERSION);
    }

    /* access modifiers changed from: protected */
    public final AFc1eSDK<String> values(String str) {
        return this.afDebugLog.AFKeystoreWrapper(afWarnLog(), str);
    }
}
