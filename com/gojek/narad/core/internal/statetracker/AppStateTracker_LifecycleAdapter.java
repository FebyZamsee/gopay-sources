package com.gojek.narad.core.internal.statetracker;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MethodCallsLogger;

public class AppStateTracker_LifecycleAdapter implements GeneratedAdapter {
    private AppStateTracker asBinder;

    AppStateTracker_LifecycleAdapter(AppStateTracker appStateTracker) {
        this.asBinder = appStateTracker;
    }

    public void callMethods(LifecycleOwner lifecycleOwner, Lifecycle.Event event, boolean z, MethodCallsLogger methodCallsLogger) {
        boolean z2 = methodCallsLogger != null;
        if (!z) {
            if (event == Lifecycle.Event.ON_START) {
                if (!z2 || methodCallsLogger.approveCall("onAppForeground", 1)) {
                    this.asBinder.onAppForeground();
                }
            } else if (event != Lifecycle.Event.ON_STOP) {
            } else {
                if (!z2 || methodCallsLogger.approveCall("onAppBackground", 1)) {
                    this.asBinder.onAppBackground();
                }
            }
        }
    }
}
