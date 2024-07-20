package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1ySDK;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

final class AFb1cSDK implements Application.ActivityLifecycleCallbacks {
    /* access modifiers changed from: package-private */
    public boolean AFInAppEventParameterName;
    /* access modifiers changed from: private */
    public boolean AFInAppEventType;
    private final AFb1nSDK AFKeystoreWrapper;
    private final Executor valueOf;
    final AFc1ySDK.AFa1xSDK values;

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

    public AFb1cSDK(Executor executor, AFb1nSDK aFb1nSDK, AFc1ySDK.AFa1xSDK aFa1xSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFb1nSDK, "");
        Intrinsics.checkNotNullParameter(aFa1xSDK, "");
        this.valueOf = executor;
        this.AFKeystoreWrapper = aFb1nSDK;
        this.values = aFa1xSDK;
    }

    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.valueOf.execute(new AFb1cSDK$$ExternalSyntheticLambda0(this, activity));
    }

    /* access modifiers changed from: private */
    public static final void values(AFb1cSDK aFb1cSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        if (!aFb1cSDK.AFInAppEventParameterName) {
            try {
                aFb1cSDK.values.valueOf(activity);
            } catch (Exception e) {
                AFLogger.afErrorLog("Listener thrown an exception: ", e, true);
            }
        }
        aFb1cSDK.AFInAppEventType = false;
        aFb1cSDK.AFInAppEventParameterName = true;
    }

    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.valueOf.execute(new AFb1cSDK$$ExternalSyntheticLambda2(this, activity));
    }

    /* access modifiers changed from: private */
    public static final void AFInAppEventType(AFb1cSDK aFb1cSDK, Activity activity) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        aFb1cSDK.AFInAppEventType = true;
        Context applicationContext = activity.getApplicationContext();
        try {
            AFc1ySDK.AFa1vSDK aFa1vSDK = AFc1ySDK.AFa1vSDK;
            new Timer().schedule(new AFa1ySDK(aFb1cSDK, applicationContext), AFc1ySDK.AFa1vSDK.valueOf());
        } catch (Throwable th) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", th);
        }
    }

    public static final class AFa1ySDK extends TimerTask {
        private /* synthetic */ AFb1cSDK AFKeystoreWrapper;
        private /* synthetic */ Context values;

        AFa1ySDK(AFb1cSDK aFb1cSDK, Context context) {
            this.AFKeystoreWrapper = aFb1cSDK;
            this.values = context;
        }

        public final void run() {
            if (this.AFKeystoreWrapper.AFInAppEventParameterName && this.AFKeystoreWrapper.AFInAppEventType) {
                this.AFKeystoreWrapper.AFInAppEventParameterName = false;
                try {
                    this.AFKeystoreWrapper.values.AFInAppEventType(this.values);
                } catch (Exception e) {
                    AFLogger.afErrorLog("Listener threw exception! ", e);
                }
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.valueOf.execute(new AFb1cSDK$$ExternalSyntheticLambda1(this, activity));
    }

    /* access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFb1cSDK aFb1cSDK, Activity activity) {
        Uri uri;
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        Intrinsics.checkNotNullParameter(activity, "");
        AFb1nSDK aFb1nSDK = aFb1cSDK.AFKeystoreWrapper;
        Intent intent = activity.getIntent();
        if (intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) {
            uri = null;
        } else {
            uri = intent.getData();
        }
        if (uri != null && intent != AFb1nSDK.AFKeystoreWrapper) {
            AFb1nSDK.AFKeystoreWrapper = intent;
        }
    }
}
