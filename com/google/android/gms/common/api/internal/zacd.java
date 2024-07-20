package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    static zacd zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        if (!googleApiManager.zaF()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config == null) {
            z = true;
        } else if (!config.getMethodInvocationTelemetryEnabled()) {
            return null;
        } else {
            z = config.getMethodTimingTelemetryEnabled();
            zabq zak = googleApiManager.zak(apiKey);
            if (zak != null) {
                if (!(zak.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab2 = zab(zak, baseGmsClient, i);
                    if (zab2 == null) {
                        return null;
                    }
                    zak.zaq();
                    z = zab2.getMethodTimingTelemetryEnabled();
                }
            }
        }
        return new zacd(googleApiManager, i, apiKey, z ? System.currentTimeMillis() : 0, z ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabq, BaseGmsClient baseGmsClient, int i) {
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled()) {
            return null;
        }
        int[] methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist();
        if (methodInvocationMethodKeyAllowlist == null) {
            int[] methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist();
            if (methodInvocationMethodKeyDisallowlist != null && ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i)) {
                return null;
            }
        } else if (!ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i)) {
            return null;
        }
        if (zabq.zac() < telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return telemetryConfiguration;
        }
        return null;
    }

    public final void onComplete(Task task) {
        zabq zak;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        long j2;
        int i7;
        int i8;
        if (this.zaa.zaF()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zak = this.zaa.zak(this.zac)) != null && (zak.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zak.zaf();
                boolean z = true;
                boolean z2 = this.zad > 0;
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                if (config != null) {
                    boolean methodTimingTelemetryEnabled = z2 & config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i3 = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab2 = zab(zak, baseGmsClient, this.zab);
                        if (zab2 != null) {
                            if (!zab2.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                                z = false;
                            }
                            maxMethodInvocationsInBatch = zab2.getMaxMethodInvocationsLogged();
                            methodTimingTelemetryEnabled = z;
                        } else {
                            return;
                        }
                    }
                    i2 = batchPeriodMillis;
                    i = maxMethodInvocationsInBatch;
                } else {
                    i3 = 0;
                    i2 = 5000;
                    i = 100;
                }
                GoogleApiManager googleApiManager = this.zaa;
                if (task.isSuccessful()) {
                    i5 = 0;
                    i4 = 0;
                } else {
                    if (task.isCanceled()) {
                        i7 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            int statusCode = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult == null) {
                                i8 = -1;
                            } else {
                                i8 = connectionResult.getErrorCode();
                            }
                            i4 = i8;
                            i5 = statusCode;
                        } else {
                            i7 = 101;
                        }
                    }
                    i5 = i7;
                    i4 = -1;
                }
                if (z2) {
                    long j3 = this.zad;
                    j = System.currentTimeMillis();
                    j2 = j3;
                    i6 = (int) (SystemClock.elapsedRealtime() - this.zae);
                } else {
                    j2 = 0;
                    j = 0;
                    i6 = -1;
                }
                googleApiManager.zay(new MethodInvocation(this.zab, i5, i4, j2, j, (String) null, (String) null, gCoreServiceId, i6), i3, (long) i2, i);
            }
        }
    }
}
