package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.appsflyer.internal.AFc1ySDK;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

public final class AFc1xSDK implements AFc1ySDK {
    private final AFb1nSDK AFKeystoreWrapper;
    private final Executor valueOf;
    private AFb1cSDK values;

    public AFc1xSDK(Executor executor, AFb1nSDK aFb1nSDK) {
        Intrinsics.checkNotNullParameter(executor, "");
        Intrinsics.checkNotNullParameter(aFb1nSDK, "");
        this.valueOf = executor;
        this.AFKeystoreWrapper = aFb1nSDK;
    }

    public final void AFInAppEventType(Context context, AFc1ySDK.AFa1xSDK aFa1xSDK) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFa1xSDK, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (this.values != null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.values);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
        }
        this.values = null;
        AFb1cSDK aFb1cSDK = new AFb1cSDK(this.valueOf, this.AFKeystoreWrapper, aFa1xSDK);
        this.values = aFb1cSDK;
        if (context instanceof Activity) {
            aFb1cSDK.onActivityResumed((Activity) context);
        }
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 != null) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(this.values);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
    }

    public final boolean AFKeystoreWrapper() {
        return this.values != null;
    }

    public final void AFInAppEventType(Context context) {
        AFc1ySDK.AFa1xSDK aFa1xSDK;
        Intrinsics.checkNotNullParameter(context, "");
        AFb1cSDK aFb1cSDK = this.values;
        if (aFb1cSDK != null && (aFa1xSDK = aFb1cSDK.values) != null) {
            aFa1xSDK.AFInAppEventType(context);
        }
    }
}
