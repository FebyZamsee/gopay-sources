package com.appsflyer.internal;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class AFc1wSDK$$ExternalSyntheticLambda0 implements RejectedExecutionHandler {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        AFc1wSDK.AFInAppEventParameterName(runnable, threadPoolExecutor);
    }
}
