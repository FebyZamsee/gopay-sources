package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;

public abstract class AFd1bSDK<Result> extends AFd1jSDK<AFd1tSDK<Result>> {
    private AFb1xSDK AFLogger;
    protected final AFc1hSDK afDebugLog;
    public final AFe1hSDK afErrorLog;
    public AFd1tSDK<Result> afInfoLog;
    protected final AFb1uSDK afRDLog;
    private String afWarnLog;

    public long AFInAppEventType() {
        return 60000;
    }

    /* access modifiers changed from: protected */
    public abstract AppsFlyerRequestListener afDebugLog();

    /* access modifiers changed from: protected */
    public abstract boolean afErrorLog();

    /* access modifiers changed from: protected */
    public boolean getLevel() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract AFc1eSDK<Result> values(String str);

    private AFd1bSDK(AFd1kSDK aFd1kSDK, AFd1kSDK[] aFd1kSDKArr, AFc1hSDK aFc1hSDK, AFe1hSDK aFe1hSDK, AFb1uSDK aFb1uSDK, AFb1xSDK aFb1xSDK, String str) {
        super(aFd1kSDK, aFd1kSDKArr, str);
        this.afDebugLog = aFc1hSDK;
        this.afErrorLog = aFe1hSDK;
        this.afRDLog = aFb1uSDK;
        this.AFLogger = aFb1xSDK;
    }

    public AFd1bSDK(AFd1kSDK aFd1kSDK, AFd1kSDK[] aFd1kSDKArr, AFc1pSDK aFc1pSDK, String str) {
        this(aFd1kSDK, aFd1kSDKArr, aFc1pSDK.AFInAppEventType(), aFc1pSDK.AppsFlyer2dXConversionCallback(), aFc1pSDK.afErrorLogForExcManagerOnly(), aFc1pSDK.onInstallConversionDataLoadedNative(), str);
    }

    public AFd1bSDK(AFd1kSDK aFd1kSDK, AFd1kSDK[] aFd1kSDKArr, AFc1pSDK aFc1pSDK, String str, String str2) {
        this(aFd1kSDK, aFd1kSDKArr, aFc1pSDK.AFInAppEventType(), aFc1pSDK.AppsFlyer2dXConversionCallback(), aFc1pSDK.afErrorLogForExcManagerOnly(), aFc1pSDK.onInstallConversionDataLoadedNative(), str);
        this.afWarnLog = str2;
    }

    public final void AFKeystoreWrapper() {
        String str;
        super.AFKeystoreWrapper();
        if (afErrorLog() && (str = this.afErrorLog.valueOf) != null && !str.trim().isEmpty()) {
            AFInAppEventParameterName(values(str).AFInAppEventType);
        }
    }

    public AFd1sSDK valueOf() throws Exception {
        if (!getLevel() || !this.afErrorLog.values()) {
            String str = this.afErrorLog.valueOf;
            if (str == null || str.trim().isEmpty()) {
                AppsFlyerRequestListener afDebugLog2 = afDebugLog();
                if (afDebugLog2 != null) {
                    afDebugLog2.onError(41, "No dev key");
                }
                throw new AFd1eSDK();
            }
            AFc1eSDK values = values(str);
            if (afErrorLog()) {
                AFInAppEventParameterName(values.AFInAppEventType);
            }
            AFd1tSDK<Result> valueOf = values.valueOf();
            this.afInfoLog = valueOf;
            this.afRDLog.AFInAppEventType(values.AFInAppEventType.valueOf, valueOf.getStatusCode(), valueOf.getBody().toString());
            AppsFlyerRequestListener afDebugLog3 = afDebugLog();
            if (afDebugLog3 != null) {
                if (valueOf.isSuccessful()) {
                    afDebugLog3.onSuccess();
                } else {
                    StringBuilder sb = new StringBuilder("Status code failure ");
                    sb.append(valueOf.getStatusCode());
                    afDebugLog3.onError(50, sb.toString());
                }
            }
            if (valueOf.isSuccessful()) {
                return AFd1sSDK.SUCCESS;
            }
            return AFd1sSDK.FAILURE;
        }
        AppsFlyerRequestListener afDebugLog4 = afDebugLog();
        if (afDebugLog4 != null) {
            afDebugLog4.onError(11, "Skipping event because 'isStopped' is true");
        }
        throw new AFd1iSDK();
    }

    public boolean AFInAppEventParameterName() {
        if (afInfoLog() instanceof AFd1iSDK) {
            return false;
        }
        if (this.values == AFd1sSDK.TIMEOUT) {
            return true;
        }
        Throwable afInfoLog2 = afInfoLog();
        if (!(afInfoLog2 instanceof IOException) || (afInfoLog2 instanceof ParsingException)) {
            return false;
        }
        return true;
    }

    public final void values(Throwable th) {
        AFLogger.afErrorLog("Error while sending request to server: ".concat(String.valueOf(th)), th, true, !(th instanceof HttpException));
        AppsFlyerRequestListener afDebugLog2 = afDebugLog();
        if (afDebugLog2 != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            afDebugLog2.onError(40, message);
        }
    }

    private void AFInAppEventParameterName(AFd1vSDK aFd1vSDK) {
        String str = this.afWarnLog;
        this.afWarnLog = this.AFLogger.AFInAppEventType(new AFb1wSDK(aFd1vSDK.valueOf, aFd1vSDK.values(), "6.11.1", this.valueOf));
        if (str != null) {
            this.AFLogger.AFInAppEventParameterName(str);
        }
    }

    public void values() {
        String str;
        if (this.values == AFd1sSDK.SUCCESS) {
            String str2 = this.afWarnLog;
            if (str2 != null) {
                this.AFLogger.AFInAppEventParameterName(str2);
            }
        } else if (!AFInAppEventParameterName() && (str = this.afWarnLog) != null) {
            this.AFLogger.AFInAppEventParameterName(str);
        }
    }
}
