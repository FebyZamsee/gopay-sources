package com.appsflyer.internal;

import android.hardware.SensorEvent;

public final /* synthetic */ class AFg1oSDK$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ AFg1oSDK f$0;
    public final /* synthetic */ SensorEvent f$1;

    public /* synthetic */ AFg1oSDK$$ExternalSyntheticLambda0(AFg1oSDK aFg1oSDK, SensorEvent sensorEvent) {
        this.f$0 = aFg1oSDK;
        this.f$1 = sensorEvent;
    }

    public final void run() {
        this.f$0.AFKeystoreWrapper(this.f$1);
    }
}
