package com.baseflow.geolocator.location;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class BackgroundNotification {
    private NotificationCompat.Builder builder;
    private final String channelId;
    private final Context context;
    private final Integer notificationId;

    public BackgroundNotification(Context context2, String str, Integer num, ForegroundNotificationOptions foregroundNotificationOptions) {
        this.context = context2;
        this.notificationId = num;
        this.channelId = str;
        this.builder = new NotificationCompat.Builder(context2, str).setPriority(1);
        updateNotification(foregroundNotificationOptions, false);
    }

    private int getDrawableId(String str, String str2) {
        return this.context.getResources().getIdentifier(str, str2, this.context.getPackageName());
    }

    private PendingIntent buildBringToFrontIntent() {
        Intent launchIntentForPackage = this.context.getPackageManager().getLaunchIntentForPackage(this.context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.setFlags(270532608);
        return PendingIntent.getActivity(this.context, 0, launchIntentForPackage, Build.VERSION.SDK_INT > 23 ? 201326592 : 134217728);
    }

    public void updateChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManagerCompat from = NotificationManagerCompat.from(this.context);
            NotificationChannel notificationChannel = new NotificationChannel(this.channelId, str, 0);
            notificationChannel.setLockscreenVisibility(0);
            from.createNotificationChannel(notificationChannel);
        }
    }

    private void updateNotification(ForegroundNotificationOptions foregroundNotificationOptions, boolean z) {
        int drawableId = getDrawableId(foregroundNotificationOptions.getNotificationIcon().getName(), foregroundNotificationOptions.getNotificationIcon().getDefType());
        if (drawableId == 0) {
            getDrawableId("ic_launcher.png", "mipmap");
        }
        this.builder = this.builder.setContentTitle(foregroundNotificationOptions.getNotificationTitle()).setSmallIcon(drawableId).setContentText(foregroundNotificationOptions.getNotificationText()).setContentIntent(buildBringToFrontIntent()).setOngoing(foregroundNotificationOptions.isSetOngoing());
        if (z) {
            NotificationManagerCompat.from(this.context).notify(this.notificationId.intValue(), this.builder.build());
        }
    }

    public void updateOptions(ForegroundNotificationOptions foregroundNotificationOptions, boolean z) {
        updateNotification(foregroundNotificationOptions, z);
    }

    public Notification build() {
        return this.builder.build();
    }
}
