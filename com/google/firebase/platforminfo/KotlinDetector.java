package com.google.firebase.platforminfo;

import o.setBackInvokedCallbackEnabled;

public final class KotlinDetector {
    public static String detectVersion() {
        try {
            return setBackInvokedCallbackEnabled.onTransact.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
