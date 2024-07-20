package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.network.HttpResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

class DefaultSettingsSpiCall implements SettingsSpiCall {
    private final Logger logger;
    private final HttpRequestFactory requestFactory;
    private final String url;

    /* access modifiers changed from: package-private */
    public boolean requestWasSuccessful(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    public DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory) {
        this(str, httpRequestFactory, Logger.getLogger());
    }

    DefaultSettingsSpiCall(String str, HttpRequestFactory httpRequestFactory, Logger logger2) {
        if (str != null) {
            this.logger = logger2;
            this.requestFactory = httpRequestFactory;
            this.url = str;
            return;
        }
        throw new IllegalArgumentException("url must not be null.");
    }

    /* access modifiers changed from: protected */
    public HttpGetRequest createHttpGetRequest(Map<String, String> map) {
        HttpGetRequest buildHttpGetRequest = this.requestFactory.buildHttpGetRequest(this.url, map);
        StringBuilder sb = new StringBuilder("Crashlytics Android SDK/");
        sb.append(CrashlyticsCore.getVersion());
        return buildHttpGetRequest.header("User-Agent", sb.toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public JSONObject invoke(SettingsRequest settingsRequest, boolean z) {
        if (z) {
            try {
                Map<String, String> queryParamsFor = getQueryParamsFor(settingsRequest);
                HttpGetRequest applyHeadersTo = applyHeadersTo(createHttpGetRequest(queryParamsFor), settingsRequest);
                Logger logger2 = this.logger;
                StringBuilder sb = new StringBuilder("Requesting settings from ");
                sb.append(this.url);
                logger2.d(sb.toString());
                Logger logger3 = this.logger;
                StringBuilder sb2 = new StringBuilder("Settings query params were: ");
                sb2.append(queryParamsFor);
                logger3.v(sb2.toString());
                return handleResponse(applyHeadersTo.execute());
            } catch (IOException e) {
                this.logger.e("Settings request failed.", e);
                return null;
            }
        } else {
            throw new RuntimeException("An invalid data collection token was used.");
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject handleResponse(HttpResponse httpResponse) {
        int code = httpResponse.code();
        Logger logger2 = this.logger;
        StringBuilder sb = new StringBuilder("Settings response code was: ");
        sb.append(code);
        logger2.v(sb.toString());
        if (requestWasSuccessful(code)) {
            return getJsonObjectFrom(httpResponse.body());
        }
        Logger logger3 = this.logger;
        StringBuilder sb2 = new StringBuilder("Settings request failed; (status: ");
        sb2.append(code);
        sb2.append(") from ");
        sb2.append(this.url);
        logger3.e(sb2.toString());
        return null;
    }

    private JSONObject getJsonObjectFrom(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            Logger logger2 = this.logger;
            StringBuilder sb = new StringBuilder("Failed to parse settings JSON from ");
            sb.append(this.url);
            logger2.w(sb.toString(), e);
            Logger logger3 = this.logger;
            StringBuilder sb2 = new StringBuilder("Settings response ");
            sb2.append(str);
            logger3.w(sb2.toString());
            return null;
        }
    }

    private Map<String, String> getQueryParamsFor(SettingsRequest settingsRequest) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", settingsRequest.buildVersion);
        hashMap.put("display_version", settingsRequest.displayVersion);
        hashMap.put("source", Integer.toString(settingsRequest.source));
        String str = settingsRequest.instanceId;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    private HttpGetRequest applyHeadersTo(HttpGetRequest httpGetRequest, SettingsRequest settingsRequest) {
        applyNonNullHeader(httpGetRequest, "X-CRASHLYTICS-GOOGLE-APP-ID", settingsRequest.googleAppId);
        applyNonNullHeader(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        applyNonNullHeader(httpGetRequest, "X-CRASHLYTICS-API-CLIENT-VERSION", CrashlyticsCore.getVersion());
        applyNonNullHeader(httpGetRequest, "Accept", "application/json");
        applyNonNullHeader(httpGetRequest, "X-CRASHLYTICS-DEVICE-MODEL", settingsRequest.deviceModel);
        applyNonNullHeader(httpGetRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", settingsRequest.osBuildVersion);
        applyNonNullHeader(httpGetRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", settingsRequest.osDisplayVersion);
        applyNonNullHeader(httpGetRequest, "X-CRASHLYTICS-INSTALLATION-ID", settingsRequest.installIdProvider.getInstallIds().getCrashlyticsInstallId());
        return httpGetRequest;
    }

    private void applyNonNullHeader(HttpGetRequest httpGetRequest, String str, String str2) {
        if (str2 != null) {
            httpGetRequest.header(str, str2);
        }
    }
}
