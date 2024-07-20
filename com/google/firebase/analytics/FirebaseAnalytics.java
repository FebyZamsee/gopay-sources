package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallations;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class FirebaseAnalytics {
    private static volatile FirebaseAnalytics zza;
    /* access modifiers changed from: private */
    public final zzdf zzb;
    private ExecutorService zzc;

    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    public static zzjz getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzdf zza2 = zzdf.zza(context, (String) null, (String) null, (String) null, bundle);
        if (zza2 == null) {
            return null;
        }
        return new zzc(zza2);
    }

    public final Task<String> getAppInstanceId() {
        try {
            return Tasks.call(zza(), new zza(this));
        } catch (RuntimeException e) {
            this.zzb.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e);
        }
    }

    public final Task<Long> getSessionId() {
        try {
            return Tasks.call(zza(), new zzd(this));
        } catch (RuntimeException e) {
            this.zzb.zza(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
            return Tasks.forException(e);
        }
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (zza == null) {
            synchronized (FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new FirebaseAnalytics(zzdf.zza(context));
                }
            }
        }
        return zza;
    }

    public final String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(FirebaseInstallations.getInstance().getId(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    private final ExecutorService zza() {
        ExecutorService executorService;
        synchronized (FirebaseAnalytics.class) {
            if (this.zzc == null) {
                this.zzc = new zzb(this, 0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }
            executorService = this.zzc;
        }
        return executorService;
    }

    private FirebaseAnalytics(zzdf zzdf) {
        Preconditions.checkNotNull(zzdf);
        this.zzb = zzdf;
    }

    public final void logEvent(String str, Bundle bundle) {
        this.zzb.zza(str, bundle);
    }

    public final void resetAnalyticsData() {
        this.zzb.zzj();
    }

    public final void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.zza(Boolean.valueOf(z));
    }

    public final void setConsent(Map<ConsentType, ConsentStatus> map) {
        Bundle bundle = new Bundle();
        ConsentStatus consentStatus = map.get(ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int ordinal = consentStatus.ordinal();
            if (ordinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (ordinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        ConsentStatus consentStatus2 = map.get(ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int ordinal2 = consentStatus2.ordinal();
            if (ordinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (ordinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        ConsentStatus consentStatus3 = map.get(ConsentType.AD_USER_DATA);
        if (consentStatus3 != null) {
            int ordinal3 = consentStatus3.ordinal();
            if (ordinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (ordinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        ConsentStatus consentStatus4 = map.get(ConsentType.AD_PERSONALIZATION);
        if (consentStatus4 != null) {
            int ordinal4 = consentStatus4.ordinal();
            if (ordinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (ordinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.zzb.zzc(bundle);
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        this.zzb.zza(activity, str, str2);
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        this.zzb.zzd(bundle);
    }

    public final void setSessionTimeoutDuration(long j) {
        this.zzb.zza(j);
    }

    public final void setUserId(String str) {
        this.zzb.zzd(str);
    }

    public final void setUserProperty(String str, String str2) {
        this.zzb.zzb(str, str2);
    }
}
