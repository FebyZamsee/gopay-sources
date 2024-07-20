package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.List;

public final class AFg1vSDK {
    private final List<AFg1uSDK> AFInAppEventParameterName = new ArrayList();

    public final void AFInAppEventParameterName(AFg1uSDK aFg1uSDK) {
        synchronized (this) {
            this.AFInAppEventParameterName.add(aFg1uSDK);
        }
    }

    public final AFg1uSDK[] AFInAppEventParameterName() {
        AFg1uSDK[] aFg1uSDKArr;
        synchronized (this) {
            aFg1uSDKArr = (AFg1uSDK[]) this.AFInAppEventParameterName.toArray(new AFg1uSDK[0]);
        }
        return aFg1uSDKArr;
    }

    public final void values(Context context, Runnable runnable, AFc1pSDK aFc1pSDK) {
        List<ResolveInfo> queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (queryIntentContentProviders != null && !queryIntentContentProviders.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentContentProviders) {
                ProviderInfo providerInfo = resolveInfo.providerInfo;
                if (providerInfo != null) {
                    arrayList.add(new AFf1aSDK(providerInfo, runnable, aFc1pSDK));
                } else {
                    AFLogger.afWarnLog("[Preinstall]: com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                }
            }
            if (!arrayList.isEmpty()) {
                this.AFInAppEventParameterName.addAll(arrayList);
                StringBuilder sb = new StringBuilder("[Preinstall]: Detected ");
                sb.append(arrayList.size());
                sb.append(" valid preinstall provider(s)");
                AFLogger.afDebugLog(sb.toString());
            }
        }
    }
}
