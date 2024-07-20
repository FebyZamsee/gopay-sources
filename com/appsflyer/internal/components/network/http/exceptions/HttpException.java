package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1ySDK;
import java.io.IOException;

public class HttpException extends IOException {
    private final AFd1ySDK AFInAppEventParameterName;

    public HttpException(Throwable th, AFd1ySDK aFd1ySDK) {
        super(th.getMessage(), th);
        this.AFInAppEventParameterName = aFd1ySDK;
    }

    public AFd1ySDK getMetrics() {
        return this.AFInAppEventParameterName;
    }
}
