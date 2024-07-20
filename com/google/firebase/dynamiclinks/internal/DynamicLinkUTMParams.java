package com.google.firebase.dynamiclinks.internal;

import android.os.Bundle;
import android.text.TextUtils;

public class DynamicLinkUTMParams {
    private final DynamicLinkData dynamicLinkData;
    private final Bundle utmParamsBundle;

    public DynamicLinkUTMParams(DynamicLinkData dynamicLinkData2) {
        this.dynamicLinkData = dynamicLinkData2;
        this.utmParamsBundle = initUTMParamsBundle(dynamicLinkData2);
    }

    public Bundle asBundle() {
        return new Bundle(this.utmParamsBundle);
    }

    private static Bundle initUTMParamsBundle(DynamicLinkData dynamicLinkData2) {
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = new Bundle();
        if (dynamicLinkData2 == null || dynamicLinkData2.getExtensionBundle() == null || (bundle = dynamicLinkData2.getExtensionBundle().getBundle("scionData")) == null || (bundle2 = bundle.getBundle("_cmp")) == null) {
            return bundle3;
        }
        checkAndAdd("medium", "utm_medium", bundle2, bundle3);
        checkAndAdd("source", "utm_source", bundle2, bundle3);
        checkAndAdd("campaign", "utm_campaign", bundle2, bundle3);
        return bundle3;
    }

    private static void checkAndAdd(String str, String str2, Bundle bundle, Bundle bundle2) {
        String string = bundle.getString(str);
        if (!TextUtils.isEmpty(string)) {
            bundle2.putString(str2, string);
        }
    }
}
