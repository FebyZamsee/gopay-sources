package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

public final class AFd1aSDK extends AFd1bSDK<String> {
    private final String AFLogger;
    private final AFg1hSDK afWarnLog;

    /* access modifiers changed from: protected */
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean afErrorLog() {
        return false;
    }

    public AFd1aSDK(AFc1pSDK aFc1pSDK, String str, AFg1hSDK aFg1hSDK) {
        super(AFd1kSDK.IMPRESSIONS, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, str);
        this.AFLogger = str;
        this.afWarnLog = aFg1hSDK;
    }

    /* access modifiers changed from: protected */
    public final AFc1eSDK<String> values(String str) {
        return this.afDebugLog.valueOf(this.AFLogger);
    }

    public final void values() {
        super.values();
        AFd1tSDK<Result> aFd1tSDK = this.afInfoLog;
        if (aFd1tSDK != null) {
            int statusCode = aFd1tSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb = new StringBuilder("Cross promotion impressions success: ");
                sb.append(this.AFLogger);
                AFLogger.afInfoLog(sb.toString(), false);
            } else if (statusCode == 301 || statusCode == 302) {
                StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                sb2.append(this.AFLogger);
                AFLogger.afInfoLog(sb2.toString(), false);
                String AFInAppEventParameterName = aFd1tSDK.AFInAppEventParameterName("Location");
                AFg1hSDK aFg1hSDK = this.afWarnLog;
                if (aFg1hSDK != null && AFInAppEventParameterName != null) {
                    aFg1hSDK.valueOf = AFInAppEventParameterName;
                    AFg1hSDK aFg1hSDK2 = this.afWarnLog;
                    Context context = aFg1hSDK2.AFKeystoreWrapper.get();
                    if (context != null) {
                        try {
                            if (aFg1hSDK2.valueOf != null) {
                                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFg1hSDK2.valueOf)).setFlags(268435456));
                            }
                        } catch (Exception e) {
                            AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e)), e);
                        }
                    }
                }
            } else {
                StringBuilder sb3 = new StringBuilder("call to ");
                sb3.append(this.AFLogger);
                sb3.append(" failed: ");
                sb3.append(statusCode);
                AFLogger.afInfoLog(sb3.toString());
            }
        }
    }
}
