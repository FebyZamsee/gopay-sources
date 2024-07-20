package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.CommonNotificationBuilder;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class DisplayNotification {
    private final Context context;
    private final ExecutorService networkIoExecutor;
    private final NotificationParams params;

    public DisplayNotification(Context context2, NotificationParams notificationParams, ExecutorService executorService) {
        this.networkIoExecutor = executorService;
        this.context = context2;
        this.params = notificationParams;
    }

    private boolean isAppForeground() {
        if (((KeyguardManager) this.context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                if (next.importance == 100) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean handleNotification() {
        if (this.params.getBoolean("gcm.n.noui")) {
            return true;
        }
        if (isAppForeground()) {
            return false;
        }
        ImageDownload startImageDownloadInBackground = startImageDownloadInBackground();
        CommonNotificationBuilder.DisplayNotificationInfo createNotificationInfo = CommonNotificationBuilder.createNotificationInfo(this.context, this.params);
        waitForAndApplyImageDownload(createNotificationInfo.notificationBuilder, startImageDownloadInBackground);
        showNotification(createNotificationInfo);
        return true;
    }

    private ImageDownload startImageDownloadInBackground() {
        ImageDownload create = ImageDownload.create(this.params.getString("gcm.n.image"));
        if (create != null) {
            create.start(this.networkIoExecutor);
        }
        return create;
    }

    private void waitForAndApplyImageDownload(NotificationCompat.Builder builder, ImageDownload imageDownload) {
        if (imageDownload != null) {
            try {
                Bitmap bitmap = (Bitmap) Tasks.await(imageDownload.getTask(), 5, TimeUnit.SECONDS);
                builder.setLargeIcon(bitmap);
                Bitmap bitmap2 = null;
                builder.setStyle(new NotificationCompat.BigPictureStyle().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
            } catch (ExecutionException e) {
                e.getCause();
            } catch (InterruptedException unused) {
                imageDownload.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                imageDownload.close();
            }
        }
    }

    private void showNotification(CommonNotificationBuilder.DisplayNotificationInfo displayNotificationInfo) {
        ((NotificationManager) this.context.getSystemService("notification")).notify(displayNotificationInfo.tag, displayNotificationInfo.id, displayNotificationInfo.notificationBuilder.build());
    }
}
