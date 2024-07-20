package com.appsflyer.internal;

import androidx.browser.trusted.sharing.ShareTarget;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.updateNavigationIcon;

public final class AFc1cSDK extends AFd1vSDK {
    public static final AFa1xSDK AFa1xSDK = new AFa1xSDK((DefaultConstructorMarker) null);

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ AFc1cSDK(String str, Map map, byte[] bArr, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? ShareTarget.METHOD_GET : str2, (i & 16) != 0 ? false : z);
    }

    private AFc1cSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z) {
        super(str, bArr, str2, map, z);
    }

    public static final class AFa1xSDK {
        public /* synthetic */ AFa1xSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1xSDK() {
        }

        static String AFInAppEventParameterName(String str, String str2, String str3) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(AFc1hSDK.valueOf, new Object[]{AppsFlyerLib.getInstance().getHostPrefix(), AFa1dSDK.valueOf().getHostName()}));
            sb.append(str);
            sb.append(str3);
            sb.append("?device_id=");
            sb.append(str2);
            return sb.toString();
        }

        public static String AFInAppEventType(String str, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return AFa1aSDK.valueOf(AFa1aSDK.AFInAppEventType(str5, str3, sb.toString()), str4);
        }
    }

    public static final AFc1cSDK valueOf(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        String AFInAppEventParameterName = AFa1xSDK.AFInAppEventParameterName(str, str2, str3);
        String valueOf = String.valueOf(System.currentTimeMillis());
        AFc1cSDK aFc1cSDK = new AFc1cSDK(AFInAppEventParameterName, updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("Connection", "close"), new Pair("af_request_epoch_ms", valueOf), new Pair("af_sig", AFa1xSDK.AFInAppEventType(str, str3, str2, str4, valueOf))}), (byte[]) null, (String) null, false, 28, (DefaultConstructorMarker) null);
        aFc1cSDK.afRDLog = 10000;
        return aFc1cSDK;
    }
}
