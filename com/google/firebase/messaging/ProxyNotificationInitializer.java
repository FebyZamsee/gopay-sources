package com.google.firebase.messaging;

import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

final class ProxyNotificationInitializer {
    static Task<Void> setEnableProxyNotification(Executor executor, Context context, boolean z) {
        if (!PlatformVersion.isAtLeastQ()) {
            return Tasks.forResult(null);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new ProxyNotificationInitializer$$ExternalSyntheticLambda0(context, z, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$setEnableProxyNotification$0(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        try {
            if (allowedToUse(context)) {
                ProxyNotificationPreferences.setProxyNotificationsInitialized(context, true);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
                taskCompletionSource.trySetResult(null);
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }

    private static boolean shouldEnableProxyNotification(Context context) {
        ApplicationInfo applicationInfo;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_notification_delegation_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    static void initialize(Context context) {
        if (!ProxyNotificationPreferences.isProxyNotificationInitialized(context)) {
            setEnableProxyNotification(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), context, shouldEnableProxyNotification(context));
        }
    }

    private static boolean allowedToUse(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }
}
