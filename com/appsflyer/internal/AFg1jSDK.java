package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import kotlin.jvm.internal.Intrinsics;

public final class AFg1jSDK implements AFg1qSDK {
    public final String AFInAppEventType(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String format = String.format(str, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()});
        Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
