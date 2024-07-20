package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.internal.Logger;

public final class FlutterFirebaseCrashlyticsInternal {
    public static void recordFatalException(Throwable th) {
        if (th == null) {
            Logger.getLogger().w("A null value was passed to recordFatalException. Ignoring.");
        } else {
            FirebaseCrashlytics.getInstance().core.logFatalException(th);
        }
    }

    public static void setFlutterBuildId(String str) {
        FirebaseCrashlytics.getInstance().core.setInternalKey("com.crashlytics.flutter.build-id.0", str);
    }
}
