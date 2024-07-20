package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzie;
import com.google.android.gms.measurement.internal.zzii;
import com.google.android.gms.measurement.internal.zzij;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import io.flutter.plugins.firebase.crashlytics.Constants;
import o.AppCompatImageButton;
import o.getKeyListener;

public final class zzb {
    private static final AppCompatImageButton<String> zza = AppCompatImageButton.asBinder("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
    private static final getKeyListener<String> zzb = getKeyListener.asBinder("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
    private static final getKeyListener<String> zzc = getKeyListener.RemoteActionCompatParcelizer("auto", "app", "am");
    private static final getKeyListener<String> zzd = getKeyListener.RemoteActionCompatParcelizer("_r", "_dbg");
    private static final getKeyListener<String> zze;
    private static final getKeyListener<String> zzf = getKeyListener.RemoteActionCompatParcelizer("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static Bundle zza(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        Bundle bundle = new Bundle();
        if (conditionalUserProperty.origin != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, conditionalUserProperty.origin);
        }
        if (conditionalUserProperty.name != null) {
            bundle.putString("name", conditionalUserProperty.name);
        }
        if (conditionalUserProperty.value != null) {
            zzie.zza(bundle, conditionalUserProperty.value);
        }
        if (conditionalUserProperty.triggerEventName != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, conditionalUserProperty.triggerEventName);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, conditionalUserProperty.triggerTimeout);
        if (conditionalUserProperty.timedOutEventName != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, conditionalUserProperty.timedOutEventName);
        }
        if (conditionalUserProperty.timedOutEventParams != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, conditionalUserProperty.timedOutEventParams);
        }
        if (conditionalUserProperty.triggeredEventName != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, conditionalUserProperty.triggeredEventName);
        }
        if (conditionalUserProperty.triggeredEventParams != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, conditionalUserProperty.triggeredEventParams);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, conditionalUserProperty.timeToLive);
        if (conditionalUserProperty.expiredEventName != null) {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, conditionalUserProperty.expiredEventName);
        }
        if (conditionalUserProperty.expiredEventParams != null) {
            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, conditionalUserProperty.expiredEventParams);
        }
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, conditionalUserProperty.creationTimestamp);
        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, conditionalUserProperty.active);
        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, conditionalUserProperty.triggeredTimestamp);
        return bundle;
    }

    public static AnalyticsConnector.ConditionalUserProperty zza(Bundle bundle) {
        Preconditions.checkNotNull(bundle);
        AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
        conditionalUserProperty.origin = (String) Preconditions.checkNotNull((String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, String.class, null));
        conditionalUserProperty.name = (String) Preconditions.checkNotNull((String) zzie.zza(bundle, "name", String.class, null));
        conditionalUserProperty.value = zzie.zza(bundle, "value", Object.class, null);
        conditionalUserProperty.triggerEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
        conditionalUserProperty.triggerTimeout = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
        conditionalUserProperty.timedOutEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
        conditionalUserProperty.timedOutEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.triggeredEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
        conditionalUserProperty.triggeredEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.timeToLive = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
        conditionalUserProperty.expiredEventName = (String) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
        conditionalUserProperty.expiredEventParams = (Bundle) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
        conditionalUserProperty.active = ((Boolean) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
        conditionalUserProperty.creationTimestamp = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
        conditionalUserProperty.triggeredTimestamp = ((Long) zzie.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
        return conditionalUserProperty;
    }

    public static String zza(String str) {
        String zza2 = zzii.zza(str);
        return zza2 != null ? zza2 : str;
    }

    static {
        getKeyListener.read read = new getKeyListener.read().read(zzij.zza).read(zzij.zzb);
        read.RemoteActionCompatParcelizer = true;
        zze = getKeyListener.RemoteActionCompatParcelizer(read.asBinder, read.read);
    }

    public static void zza(String str, String str2, Bundle bundle) {
        if ("clx".equals(str) && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
            bundle.putLong("_r", 1);
        }
    }

    public static boolean zzb(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!zzf(str) || bundle == null) {
            return false;
        }
        getKeyListener<String> getkeylistener = zzd;
        getKeyListener getkeylistener2 = getkeylistener;
        int size = getkeylistener.size();
        int i = 0;
        while (i < size) {
            Object obj = getkeylistener.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        str.hashCode();
        int hashCode = str.hashCode();
        char c = 65535;
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    c = 2;
                }
            } else if (str.equals("fdl")) {
                c = 1;
            }
        } else if (str.equals(AppMeasurement.FCM_ORIGIN)) {
            c = 0;
        }
        if (c == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    public static boolean zzb(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        String str;
        if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
            return false;
        }
        if ((conditionalUserProperty.value != null && zzkf.zza(conditionalUserProperty.value) == null) || !zzf(str) || !zza(str, conditionalUserProperty.name)) {
            return false;
        }
        if (conditionalUserProperty.expiredEventName != null && (!zza(conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams) || !zzb(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
            return false;
        }
        if (conditionalUserProperty.triggeredEventName != null && (!zza(conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams) || !zzb(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
            return false;
        }
        if (conditionalUserProperty.timedOutEventName == null) {
            return true;
        }
        if (zza(conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams) && zzb(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams)) {
            return true;
        }
        return false;
    }

    public static boolean zza(String str, Bundle bundle) {
        if (zzb.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        getKeyListener<String> getkeylistener = zzd;
        getKeyListener getkeylistener2 = getkeylistener;
        int size = getkeylistener.size();
        int i = 0;
        while (i < size) {
            Object obj = getkeylistener.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean zze(String str) {
        return !zza.contains(str);
    }

    public static boolean zzf(String str) {
        return !zzc.contains(str);
    }

    public static boolean zza(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals(AppMeasurement.FCM_ORIGIN) || str.equals(AppMeasurement.FIAM_ORIGIN);
        }
        if (zze.contains(str2)) {
            return false;
        }
        getKeyListener<String> getkeylistener = zzf;
        getKeyListener getkeylistener2 = getkeylistener;
        int size = getkeylistener.size();
        int i = 0;
        while (i < size) {
            Object obj = getkeylistener.get(i);
            i++;
            if (str2.matches((String) obj)) {
                return false;
            }
        }
        return true;
    }
}
