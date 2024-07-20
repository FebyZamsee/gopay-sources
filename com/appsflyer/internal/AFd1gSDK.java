package com.appsflyer.internal;

import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class AFd1gSDK extends AFd1bSDK<String> {
    private final AFc1vSDK AFLogger;
    private final UUID AFLogger$LogLevel;
    private final Map<String, String> AFVersionDeclaration;
    private final LinkGenerator.ResponseListener afErrorLogForExcManagerOnly;
    private final String afWarnLog;
    private final String getLevel;

    public final long AFInAppEventType() {
        return 3000;
    }

    /* access modifiers changed from: protected */
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean afErrorLog() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean getLevel() {
        return false;
    }

    public AFd1gSDK(AFc1pSDK aFc1pSDK, UUID uuid, String str, Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener) {
        super(AFd1kSDK.ONELINK, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, uuid.toString());
        this.AFLogger = aFc1pSDK.AFKeystoreWrapper();
        this.AFLogger$LogLevel = uuid;
        this.getLevel = str;
        this.AFVersionDeclaration = new HashMap(map);
        this.afErrorLogForExcManagerOnly = responseListener;
        this.afWarnLog = str2;
    }

    public final void values() {
        super.values();
        LinkGenerator.ResponseListener responseListener = this.afErrorLogForExcManagerOnly;
        if (responseListener == null) {
            return;
        }
        if (this.values != AFd1sSDK.SUCCESS || this.afInfoLog == null) {
            Throwable afInfoLog = afInfoLog();
            if (!(afInfoLog instanceof ParsingException)) {
                responseListener.onResponse(afWarnLog());
            } else if (((ParsingException) afInfoLog).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(afWarnLog());
            }
        } else {
            responseListener.onResponse((String) this.afInfoLog.getBody());
        }
    }

    /* access modifiers changed from: protected */
    public final AFc1eSDK<String> values(String str) {
        return this.afDebugLog.values(this.getLevel, this.AFVersionDeclaration, this.afWarnLog, this.AFLogger$LogLevel, str);
    }

    private String afWarnLog() {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
        String packageName = this.AFLogger.AFInAppEventParameterName.AFInAppEventType.getPackageName();
        LinkGenerator addParameters = new LinkGenerator("af_app_invites").setBaseURL(this.getLevel, string, packageName).addParameter("af_siteid", packageName).addParameters(this.AFVersionDeclaration);
        AFa1dSDK.valueOf();
        String AFInAppEventParameterName = AFa1dSDK.AFInAppEventParameterName();
        if (AFInAppEventParameterName != null) {
            addParameters.setReferrerCustomerId(AFInAppEventParameterName);
        }
        return addParameters.generateLink();
    }
}
