package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

public final class AFc1eSDK<ResponseBody> {
    private final ExecutorService AFInAppEventParameterName;
    public final AFd1vSDK AFInAppEventType;
    private final AFd1zSDK AFKeystoreWrapper;
    private final AFd1wSDK<ResponseBody> valueOf;
    private final AtomicBoolean values = new AtomicBoolean(false);

    public AFc1eSDK(AFd1vSDK aFd1vSDK, ExecutorService executorService, AFd1zSDK aFd1zSDK, AFd1wSDK<ResponseBody> aFd1wSDK) {
        this.AFInAppEventType = aFd1vSDK;
        this.AFInAppEventParameterName = executorService;
        this.AFKeystoreWrapper = aFd1zSDK;
        this.valueOf = aFd1wSDK;
    }

    public final AFd1tSDK<ResponseBody> valueOf() throws IOException {
        if (!this.values.getAndSet(true)) {
            AFd1tSDK<String> AFInAppEventParameterName2 = this.AFKeystoreWrapper.AFInAppEventParameterName(this.AFInAppEventType);
            try {
                return new AFd1tSDK(this.valueOf.values(AFInAppEventParameterName2.getBody()), AFInAppEventParameterName2.values, AFInAppEventParameterName2.AFKeystoreWrapper, AFInAppEventParameterName2.AFInAppEventParameterName, AFInAppEventParameterName2.AFInAppEventType);
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("could not parse raw response - execute", e);
                throw new ParsingException(e.getMessage(), e, AFInAppEventParameterName2);
            }
        } else {
            throw new IllegalStateException("Http call is already executed");
        }
    }
}
