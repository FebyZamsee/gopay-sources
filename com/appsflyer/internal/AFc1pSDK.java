package com.appsflyer.internal;

import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public interface AFc1pSDK {
    AFc1hSDK AFInAppEventType();

    AFc1vSDK AFKeystoreWrapper();

    PurchaseHandler AFLogger();

    AFg1nSDK AFLogger$LogLevel();

    AFg1vSDK AFVersionDeclaration();

    AFe1hSDK AppsFlyer2dXConversionCallback();

    AFf1xSDK afDebugLog();

    AFb1aSDK afErrorLog();

    AFb1uSDK afErrorLogForExcManagerOnly();

    AFe1oSDK afInfoLog();

    AFe1eSDK afWarnLog();

    AFd1mSDK getLevel();

    AFc1tSDK init();

    AFd1qSDK onAppOpenAttributionNative();

    AFc1ySDK onAttributionFailureNative();

    AFa1kSDK onConversionDataSuccess();

    AFc1lSDK onDeepLinking();

    AFa1gSDK onDeepLinkingNative();

    AFb1xSDK onInstallConversionDataLoadedNative();

    AFf1bSDK onInstallConversionFailureNative();

    AFb1nSDK onResponseErrorNative();

    AFb1bSDK onResponseNative();

    ExecutorService valueOf();

    ScheduledExecutorService values();
}
