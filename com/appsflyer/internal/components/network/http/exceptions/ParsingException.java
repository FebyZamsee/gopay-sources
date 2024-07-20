package com.appsflyer.internal.components.network.http.exceptions;

import com.appsflyer.internal.AFd1tSDK;
import java.io.IOException;

public class ParsingException extends IOException {
    private final AFd1tSDK<String> valueOf;

    public ParsingException(String str, Throwable th, AFd1tSDK<String> aFd1tSDK) {
        super(str, th);
        this.valueOf = aFd1tSDK;
    }

    public AFd1tSDK<String> getRawResponse() {
        return this.valueOf;
    }
}
