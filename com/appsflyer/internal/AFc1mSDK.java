package com.appsflyer.internal;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1mSDK implements AFc1jSDK {
    private final AFc1nSDK AFInAppEventType;

    public AFc1mSDK(AFc1nSDK aFc1nSDK) {
        Intrinsics.checkNotNullParameter(aFc1nSDK, "");
        this.AFInAppEventType = aFc1nSDK;
    }

    public final void AFInAppEventParameterName(byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        if (new AFc1iSDK(bArr, map, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE).valueOf()) {
            this.AFInAppEventType.AFInAppEventParameterName();
        }
    }
}
