package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.PurchaseHandler;
import java.util.Map;
import org.json.JSONObject;

public final class AFd1cSDK extends AFd1fSDK {
    private final AFc1vSDK AFLogger;

    public AFd1cSDK(Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, AFc1pSDK aFc1pSDK) {
        super(AFd1kSDK.PURCHASE_VALIDATE, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, (String) null, map, purchaseValidationCallback);
        this.AFLogger = aFc1pSDK.AFKeystoreWrapper();
        this.AFKeystoreWrapper.add(AFd1kSDK.CONVERSION);
    }

    /* access modifiers changed from: protected */
    public final AFc1eSDK<String> values(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("https://%sviap.%s/api/v1/android/validate_purchase?app_id=", new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
        sb.append(this.AFLogger.AFInAppEventParameterName.AFInAppEventType.getPackageName());
        String obj = sb.toString();
        String jSONObject = new JSONObject(afWarnLog()).toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this);
        sb2.append(": preparing data: ");
        sb2.append(jSONObject);
        AFb1tSDK.AFInAppEventParameterName(sb2.toString());
        this.afRDLog.valueOf(obj, jSONObject);
        return this.afDebugLog.valueOf(afWarnLog(), str);
    }

    public final boolean AFInAppEventParameterName() {
        if (this.afInfoLog == null || this.afInfoLog.getStatusCode() != 503) {
            return super.AFInAppEventParameterName();
        }
        return true;
    }
}
