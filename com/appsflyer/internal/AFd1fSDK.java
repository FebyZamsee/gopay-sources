package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public abstract class AFd1fSDK extends AFd1bSDK<String> {
    private final AFc1vSDK AFLogger;
    private final PurchaseHandler.PurchaseValidationCallback AFLogger$LogLevel;
    private final Map<String, Object> AFVersionDeclaration;
    private final AFb1aSDK getLevel;

    /* access modifiers changed from: protected */
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean afErrorLog() {
        return true;
    }

    public AFd1fSDK(AFd1kSDK aFd1kSDK, AFd1kSDK[] aFd1kSDKArr, AFc1pSDK aFc1pSDK, String str, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        super(aFd1kSDK, aFd1kSDKArr, aFc1pSDK, str);
        String str2;
        String str3;
        AFc1vSDK AFKeystoreWrapper = aFc1pSDK.AFKeystoreWrapper();
        this.AFLogger = AFKeystoreWrapper;
        AFb1aSDK afErrorLog = aFc1pSDK.afErrorLog();
        this.getLevel = afErrorLog;
        HashMap hashMap = new HashMap(new HashMap(map));
        hashMap.put("app_id", AFKeystoreWrapper.AFInAppEventParameterName.AFInAppEventType.getPackageName());
        String valueOf = AFc1vSDK.valueOf();
        if (valueOf != null) {
            hashMap.put("cuid", valueOf);
        }
        hashMap.put("app_version_name", AFa1bSDK.values(AFKeystoreWrapper.AFInAppEventParameterName.AFInAppEventType, AFKeystoreWrapper.AFInAppEventParameterName.AFInAppEventType.getPackageName()));
        HashMap hashMap2 = new HashMap();
        AFa1eSDK AFKeystoreWrapper2 = AFa1fSDK.AFKeystoreWrapper(AFKeystoreWrapper.AFInAppEventParameterName.AFInAppEventType, new HashMap());
        String str4 = null;
        if (AFKeystoreWrapper2 != null) {
            str2 = AFKeystoreWrapper2.AFKeystoreWrapper;
        } else {
            str2 = null;
        }
        if (!AFb1qSDK.valueOf(str2)) {
            hashMap2.put("advertising_id", str2);
        }
        AFa1eSDK AFInAppEventParameterName = AFa1fSDK.AFInAppEventParameterName(AFKeystoreWrapper.AFInAppEventParameterName.AFInAppEventType.getContentResolver());
        if (AFInAppEventParameterName != null) {
            str3 = AFInAppEventParameterName.AFKeystoreWrapper;
        } else {
            str3 = null;
        }
        if (!AFb1qSDK.valueOf(str3)) {
            hashMap2.put("oaid", str3);
        }
        AFa1eSDK AFInAppEventParameterName2 = AFa1fSDK.AFInAppEventParameterName(AFKeystoreWrapper.AFInAppEventParameterName.AFInAppEventType.getContentResolver());
        str4 = AFInAppEventParameterName2 != null ? AFInAppEventParameterName2.AFKeystoreWrapper : str4;
        if (!AFb1qSDK.valueOf(str4)) {
            hashMap2.put("amazon_aid", str4);
        }
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            String AFKeystoreWrapper3 = this.afErrorLog.AFKeystoreWrapper(afErrorLog);
            if (!AFb1qSDK.valueOf(AFKeystoreWrapper3)) {
                hashMap2.put("imei", AFKeystoreWrapper3);
            }
        }
        hashMap2.put("appsflyer_id", AFb1rSDK.valueOf(new WeakReference(AFKeystoreWrapper.AFInAppEventParameterName.AFInAppEventType)));
        StringBuilder sb = new StringBuilder();
        sb.append(Build.VERSION.SDK_INT);
        hashMap2.put("os_version", sb.toString());
        hashMap2.put("sdk_version", AFa1dSDK.AFKeystoreWrapper);
        hashMap.put("device_data", hashMap2);
        this.AFVersionDeclaration = hashMap;
        this.AFLogger$LogLevel = purchaseValidationCallback;
    }

    public final void values() {
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback;
        PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback2;
        super.values();
        Throwable afInfoLog = afInfoLog();
        if (!(afInfoLog == null || (purchaseValidationCallback2 = this.AFLogger$LogLevel) == null)) {
            purchaseValidationCallback2.onFailure(afInfoLog);
        }
        AFd1tSDK<Result> aFd1tSDK = this.afInfoLog;
        if (aFd1tSDK != null && (purchaseValidationCallback = this.AFLogger$LogLevel) != null) {
            purchaseValidationCallback.onResponse(aFd1tSDK);
        }
    }

    /* access modifiers changed from: protected */
    public final Map<String, Object> afWarnLog() {
        return this.AFVersionDeclaration;
    }
}
