package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.util.concurrent.ExecutionException;
import o.getNavigationMode;
import o.getSelectedNavigationIndex;
import o.getSubtitle;
import o.getTabAt;

public class MessagingAnalytics {
    public static void logNotificationReceived(Intent intent) {
        if (shouldUploadScionMetrics(intent)) {
            logToScion("_nr", intent.getExtras());
        }
        if (shouldUploadFirelogAnalytics(intent)) {
            logToFirelog(MessagingClientEvent.Event.MESSAGE_DELIVERED, intent, FirebaseMessaging.getTransportFactory());
        }
    }

    public static void logNotificationOpen(Bundle bundle) {
        setUserPropertyIfRequired(bundle);
        logToScion("_no", bundle);
    }

    public static void logNotificationDismiss(Intent intent) {
        logToScion("_nd", intent.getExtras());
    }

    public static void logNotificationForeground(Intent intent) {
        logToScion("_nf", intent.getExtras());
    }

    public static boolean shouldUploadScionMetrics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return shouldUploadScionMetrics(intent.getExtras());
    }

    public static boolean shouldUploadScionMetrics(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent) {
        if (intent == null || isDirectBootMessage(intent)) {
            return false;
        }
        return deliveryMetricsExportToBigQueryEnabled();
    }

    private static boolean isDirectBootMessage(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean deliveryMetricsExportToBigQueryEnabled() {
        /*
            java.lang.String r0 = "delivery_metrics_exported_to_big_query_enabled"
            r1 = 0
            com.google.firebase.FirebaseApp.getInstance()     // Catch:{ IllegalStateException -> 0x0046 }
            com.google.firebase.FirebaseApp r2 = com.google.firebase.FirebaseApp.getInstance()
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.SharedPreferences r3 = r2.getSharedPreferences(r3, r1)
            java.lang.String r4 = "export_to_big_query"
            boolean r5 = r3.contains(r4)
            if (r5 == 0) goto L_0x0021
            boolean r0 = r3.getBoolean(r4, r1)
            return r0
        L_0x0021:
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r3 = r2.metaData     // Catch:{  }
            boolean r3 = r3.containsKey(r0)     // Catch:{  }
            if (r3 == 0) goto L_0x0046
            android.os.Bundle r2 = r2.metaData     // Catch:{  }
            boolean r0 = r2.getBoolean(r0, r1)     // Catch:{  }
            return r0
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled():boolean");
    }

    private static void setUserPropertyIfRequired(Bundle bundle) {
        AnalyticsConnector analyticsConnector;
        if (bundle != null && "1".equals(bundle.getString("google.c.a.tc")) && (analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class)) != null) {
            String string = bundle.getString("google.c.a.c_id");
            analyticsConnector.setUserProperty(AppMeasurement.FCM_ORIGIN, "_ln", string);
            Bundle bundle2 = new Bundle();
            bundle2.putString("source", "Firebase");
            bundle2.putString("medium", "notification");
            bundle2.putString("campaign", string);
            analyticsConnector.logEvent(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
        }
    }

    static void logToScion(String str, Bundle bundle) {
        try {
            FirebaseApp.getInstance();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String composerId = getComposerId(bundle);
            if (composerId != null) {
                bundle2.putString("_nmid", composerId);
            }
            String composerLabel = getComposerLabel(bundle);
            if (composerLabel != null) {
                bundle2.putString("_nmn", composerLabel);
            }
            String messageLabel = getMessageLabel(bundle);
            if (!TextUtils.isEmpty(messageLabel)) {
                bundle2.putString("label", messageLabel);
            }
            String messageChannel = getMessageChannel(bundle);
            if (!TextUtils.isEmpty(messageChannel)) {
                bundle2.putString("message_channel", messageChannel);
            }
            String topic = getTopic(bundle);
            if (topic != null) {
                bundle2.putString("_nt", topic);
            }
            String messageTime = getMessageTime(bundle);
            if (messageTime != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(messageTime));
                } catch (NumberFormatException unused) {
                }
            }
            String useDeviceTime = getUseDeviceTime(bundle);
            if (useDeviceTime != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(useDeviceTime));
                } catch (NumberFormatException unused2) {
                }
            }
            String messageTypeForScion = getMessageTypeForScion(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", messageTypeForScion);
            }
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if (analyticsConnector != null) {
                analyticsConnector.logEvent(AppMeasurement.FCM_ORIGIN, str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    private static void logToFirelog(MessagingClientEvent.Event event, Intent intent, getTabAt gettabat) {
        MessagingClientEvent eventToProto;
        if (gettabat != null && (eventToProto = eventToProto(event, intent)) != null) {
            try {
                Class<MessagingClientEventExtension> cls = MessagingClientEventExtension.class;
                gettabat.RemoteActionCompatParcelizer("FCM_CLIENT_EVENT_LOGGING", new getSubtitle("proto"), new MessagingAnalytics$$ExternalSyntheticLambda0()).asBinder(new getSelectedNavigationIndex((Integer) null, MessagingClientEventExtension.newBuilder().setMessagingClientEvent(eventToProto).build(), getNavigationMode.DEFAULT));
            } catch (RuntimeException unused) {
            }
        }
    }

    static int getTtl(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    static String getCollapseKey(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    static String getComposerId(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    static String getComposerLabel(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    static String getMessageLabel(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    static String getMessageChannel(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    static String getMessageTime(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    static String getMessageId(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    static String getPackageName() {
        return FirebaseApp.getInstance().getApplicationContext().getPackageName();
    }

    static String getInstanceId(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance(FirebaseApp.getInstance()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    static String getMessageTypeForScion(Bundle bundle) {
        return (bundle == null || !NotificationParams.isNotification(bundle)) ? "data" : "display";
    }

    static MessagingClientEvent.MessageType getMessageTypeForFirelog(Bundle bundle) {
        if (bundle == null || !NotificationParams.isNotification(bundle)) {
            return MessagingClientEvent.MessageType.DATA_MESSAGE;
        }
        return MessagingClientEvent.MessageType.DISPLAY_NOTIFICATION;
    }

    static String getTopic(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    static String getUseDeviceTime(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    static long getProjectNumber(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException unused) {
            }
        }
        FirebaseApp instance = FirebaseApp.getInstance();
        String gcmSenderId = instance.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            try {
                return Long.parseLong(gcmSenderId);
            } catch (NumberFormatException unused2) {
            }
        }
        String applicationId = instance.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:")) {
            try {
                return Long.parseLong(applicationId);
            } catch (NumberFormatException unused3) {
                return 0;
            }
        } else {
            String[] split = applicationId.split(":");
            if (split.length < 2) {
                return 0;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0;
            }
            return Long.parseLong(str);
        }
    }

    static MessagingClientEvent eventToProto(MessagingClientEvent.Event event, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        MessagingClientEvent.Builder messageType = MessagingClientEvent.newBuilder().setTtl(getTtl(extras)).setEvent(event).setInstanceId(getInstanceId(extras)).setPackageName(getPackageName()).setSdkPlatform(MessagingClientEvent.SDKPlatform.ANDROID).setMessageType(getMessageTypeForFirelog(extras));
        String messageId = getMessageId(extras);
        if (messageId != null) {
            messageType.setMessageId(messageId);
        }
        String topic = getTopic(extras);
        if (topic != null) {
            messageType.setTopic(topic);
        }
        String collapseKey = getCollapseKey(extras);
        if (collapseKey != null) {
            messageType.setCollapseKey(collapseKey);
        }
        String messageLabel = getMessageLabel(extras);
        if (messageLabel != null) {
            messageType.setAnalyticsLabel(messageLabel);
        }
        String composerLabel = getComposerLabel(extras);
        if (composerLabel != null) {
            messageType.setComposerLabel(composerLabel);
        }
        long projectNumber = getProjectNumber(extras);
        if (projectNumber > 0) {
            messageType.setProjectNumber(projectNumber);
        }
        return messageType.build();
    }
}
