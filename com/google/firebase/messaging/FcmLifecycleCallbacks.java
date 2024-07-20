package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    private final Set<Intent> seenIntents = Collections.newSetFromMap(new WeakHashMap());

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    FcmLifecycleCallbacks() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.seenIntents.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new FcmLifecycleCallbacks$$ExternalSyntheticLambda0(this, intent));
            } else {
                m110lambda$onActivityCreated$0$comgooglefirebasemessagingFcmLifecycleCallbacks(intent);
            }
        }
    }

    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.seenIntents.remove(activity.getIntent());
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: logNotificationOpen */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m110lambda$onActivityCreated$0$comgooglefirebasemessagingFcmLifecycleCallbacks(android.content.Intent r2) {
        /*
            r1 = this;
            android.os.Bundle r2 = r2.getExtras()     // Catch:{ RuntimeException -> 0x000d }
            if (r2 == 0) goto L_0x000d
            java.lang.String r0 = "gcm.n.analytics_data"
            android.os.Bundle r2 = r2.getBundle(r0)     // Catch:{ RuntimeException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            boolean r0 = com.google.firebase.messaging.MessagingAnalytics.shouldUploadScionMetrics((android.os.Bundle) r2)
            if (r0 == 0) goto L_0x0017
            com.google.firebase.messaging.MessagingAnalytics.logNotificationOpen(r2)
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FcmLifecycleCallbacks.m110lambda$onActivityCreated$0$comgooglefirebasemessagingFcmLifecycleCallbacks(android.content.Intent):void");
    }
}
