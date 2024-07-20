package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final SessionsActivityLifecycleCallbacks INSTANCE = new SessionsActivityLifecycleCallbacks();
    private static boolean hasPendingForeground;
    private static SessionLifecycleClient lifecycleClient;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    private SessionsActivityLifecycleCallbacks() {
    }

    public final void setLifecycleClient(SessionLifecycleClient sessionLifecycleClient) {
        lifecycleClient = sessionLifecycleClient;
        if (sessionLifecycleClient != null && hasPendingForeground) {
            hasPendingForeground = false;
            sessionLifecycleClient.foregrounded();
        }
    }

    public final void onActivityResumed(Activity activity) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "");
        SessionLifecycleClient sessionLifecycleClient = lifecycleClient;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.foregrounded();
            unit = Unit.asInterface;
        } else {
            unit = null;
        }
        if (unit == null) {
            SessionsActivityLifecycleCallbacks sessionsActivityLifecycleCallbacks = this;
            hasPendingForeground = true;
        }
    }

    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        SessionLifecycleClient sessionLifecycleClient = lifecycleClient;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.backgrounded();
        }
    }
}
