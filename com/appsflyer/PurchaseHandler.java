package com.appsflyer;

import com.appsflyer.internal.AFa1aSDK;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFc1vSDK;
import com.appsflyer.internal.AFd1mSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

public final class PurchaseHandler {
    public final AFd1mSDK AFInAppEventParameterName;
    public final AFc1pSDK AFInAppEventType;
    private final AFc1vSDK values;

    public interface PurchaseValidationCallback {
        void onFailure(Throwable th);

        void onResponse(ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(AFc1pSDK aFc1pSDK) {
        this.AFInAppEventType = aFc1pSDK;
        this.values = aFc1pSDK.AFKeystoreWrapper();
        this.AFInAppEventParameterName = aFc1pSDK.getLevel();
    }

    public final boolean values(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean AFInAppEventParameterName2 = AFa1aSDK.AFInAppEventParameterName(map, strArr, this.values);
        if (!AFInAppEventParameterName2 && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return AFInAppEventParameterName2;
    }
}
