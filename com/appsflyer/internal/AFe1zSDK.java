package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLinkResult;

public final class AFe1zSDK extends AFd1jSDK<DeepLinkResult> {
    private final AFb1hSDK AFLogger;
    private DeepLinkResult afRDLog;

    public final boolean AFInAppEventParameterName() {
        return false;
    }

    public final long AFInAppEventType() {
        return 90000;
    }

    public AFe1zSDK(AFb1hSDK aFb1hSDK) {
        super(AFd1kSDK.DLSDK, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, "DdlSdk");
        this.AFLogger = aFb1hSDK;
    }

    /* renamed from: com.appsflyer.internal.AFe1zSDK$5  reason: invalid class name */
    static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] AFInAppEventParameterName;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.appsflyer.deeplink.DeepLinkResult$Status[] r0 = com.appsflyer.deeplink.DeepLinkResult.Status.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AFInAppEventParameterName = r0
                com.appsflyer.deeplink.DeepLinkResult$Status r1 = com.appsflyer.deeplink.DeepLinkResult.Status.FOUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = AFInAppEventParameterName     // Catch:{ NoSuchFieldError -> 0x001d }
                com.appsflyer.deeplink.DeepLinkResult$Status r1 = com.appsflyer.deeplink.DeepLinkResult.Status.NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = AFInAppEventParameterName     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.appsflyer.deeplink.DeepLinkResult$Status r1 = com.appsflyer.deeplink.DeepLinkResult.Status.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1zSDK.AnonymousClass5.<clinit>():void");
        }
    }

    public final AFd1sSDK valueOf() throws Exception {
        this.afRDLog = this.AFLogger.afRDLog();
        if (AnonymousClass5.AFInAppEventParameterName[this.afRDLog.getStatus().ordinal()] == 1) {
            return AFd1sSDK.SUCCESS;
        }
        if (this.afRDLog.getError() == DeepLinkResult.Error.TIMEOUT) {
            return AFd1sSDK.TIMEOUT;
        }
        return AFd1sSDK.FAILURE;
    }
}
