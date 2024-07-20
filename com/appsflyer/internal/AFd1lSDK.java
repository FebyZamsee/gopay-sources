package com.appsflyer.internal;

import java.util.TimerTask;

public final class AFd1lSDK extends TimerTask {
    private final Thread AFInAppEventParameterName;

    public AFd1lSDK(Thread thread) {
        this.AFInAppEventParameterName = thread;
    }

    public final void run() {
        this.AFInAppEventParameterName.interrupt();
    }
}
