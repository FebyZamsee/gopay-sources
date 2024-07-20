package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import io.flutter.plugins.firebase.analytics.Constants;
import org.json.JSONException;
import org.json.JSONObject;

public class BreadcrumbAnalyticsEventReceiver implements AnalyticsEventReceiver, BreadcrumbSource {
    private BreadcrumbHandler breadcrumbHandler;

    public void onEvent(String str, Bundle bundle) {
        BreadcrumbHandler breadcrumbHandler2 = this.breadcrumbHandler;
        if (breadcrumbHandler2 != null) {
            try {
                StringBuilder sb = new StringBuilder("$A$:");
                sb.append(serializeEvent(str, bundle));
                breadcrumbHandler2.handleBreadcrumb(sb.toString());
            } catch (JSONException unused) {
                Logger.getLogger().w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler2) {
        this.breadcrumbHandler = breadcrumbHandler2;
        Logger.getLogger().d("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    private static String serializeEvent(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(Constants.PARAMETERS, jSONObject2);
        return jSONObject.toString();
    }
}
