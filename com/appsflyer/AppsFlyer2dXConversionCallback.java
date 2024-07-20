package com.appsflyer;

import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.share.LinkGenerator;
import java.util.Map;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener, DeepLinkListener, LinkGenerator.ResponseListener {
    public native void onAppOpenAttributionNative(Object obj);

    public native void onAttributionFailureNative(Object obj);

    public native void onDeepLinkingNative(DeepLinkResult deepLinkResult);

    public native void onInstallConversionDataLoadedNative(Object obj);

    public native void onInstallConversionFailureNative(Object obj);

    public native void onResponseErrorNative(String str);

    public native void onResponseNative(String str);

    public void onConversionDataSuccess(Map<String, Object> map) {
        onInstallConversionDataLoadedNative(map);
    }

    public void onConversionDataFail(String str) {
        AFInAppEventType("onAttributionFailure", str);
    }

    public void onAppOpenAttribution(Map<String, String> map) {
        onAppOpenAttributionNative(map);
    }

    public void onAttributionFailure(String str) {
        AFInAppEventType("onInstallConversionFailure", str);
    }

    public void onDeepLinking(DeepLinkResult deepLinkResult) {
        onDeepLinkingNative(deepLinkResult);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037 A[Catch:{ JSONException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d A[Catch:{ JSONException -> 0x0041 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void AFInAppEventType(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0041 }
            r0.<init>()     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r1 = "status"
            java.lang.String r2 = "failure"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r1 = "data"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0041 }
            int r5 = r4.hashCode()     // Catch:{ JSONException -> 0x0041 }
            r1 = -1390007222(0xffffffffad262c4a, float:-9.445842E-12)
            r2 = 1
            if (r5 == r1) goto L_0x002a
            r1 = 1050716216(0x3ea0a838, float:0.3137834)
            if (r5 != r1) goto L_0x0034
            java.lang.String r5 = "onInstallConversionFailure"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x0041 }
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r5 = "onAttributionFailure"
            boolean r4 = r4.equals(r5)     // Catch:{ JSONException -> 0x0041 }
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            if (r4 == 0) goto L_0x003d
            if (r4 != r2) goto L_0x003c
            r3.onAttributionFailureNative(r0)     // Catch:{ JSONException -> 0x0041 }
        L_0x003c:
            return
        L_0x003d:
            r3.onInstallConversionFailureNative(r0)     // Catch:{ JSONException -> 0x0041 }
            return
        L_0x0041:
            r4 = move-exception
            java.lang.String r5 = "2dx error"
            com.appsflyer.AFLogger.afErrorLogForExcManagerOnly(r5, r4)
            r4.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyer2dXConversionCallback.AFInAppEventType(java.lang.String, java.lang.String):void");
    }

    public void onResponse(String str) {
        onResponseNative(str);
    }

    public void onResponseError(String str) {
        onResponseErrorNative(str);
    }
}
