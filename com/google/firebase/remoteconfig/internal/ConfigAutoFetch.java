package com.google.firebase.remoteconfig.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConfigAutoFetch {
    private final ConfigCacheClient activatedCache;
    private final ConfigFetchHandler configFetchHandler;
    private final Set<ConfigUpdateListener> eventListeners;
    private final HttpURLConnection httpURLConnection;
    private final Random random = new Random();
    private final ConfigUpdateListener retryCallback;
    private final ScheduledExecutorService scheduledExecutorService;

    public ConfigAutoFetch(HttpURLConnection httpURLConnection2, ConfigFetchHandler configFetchHandler2, ConfigCacheClient configCacheClient, Set<ConfigUpdateListener> set, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService2) {
        this.httpURLConnection = httpURLConnection2;
        this.configFetchHandler = configFetchHandler2;
        this.activatedCache = configCacheClient;
        this.eventListeners = set;
        this.retryCallback = configUpdateListener;
        this.scheduledExecutorService = scheduledExecutorService2;
    }

    private void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        synchronized (this) {
            for (ConfigUpdateListener onError : this.eventListeners) {
                onError.onError(firebaseRemoteConfigException);
            }
        }
    }

    private void executeAllListenerCallbacks(ConfigUpdate configUpdate) {
        synchronized (this) {
            for (ConfigUpdateListener onUpdate : this.eventListeners) {
                onUpdate.onUpdate(configUpdate);
            }
        }
    }

    private boolean isEventListenersEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.eventListeners.isEmpty();
        }
        return isEmpty;
    }

    private String parseAndValidateConfigUpdateMessage(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        return (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) ? "" : str.substring(indexOf, lastIndexOf + 1);
    }

    public void listenForNotifications() {
        HttpURLConnection httpURLConnection2 = this.httpURLConnection;
        if (httpURLConnection2 != null) {
            try {
                InputStream inputStream = httpURLConnection2.getInputStream();
                handleNotifications(inputStream);
                inputStream.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.httpURLConnection.disconnect();
                throw th;
            }
            this.httpURLConnection.disconnect();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r4.has("featureDisabled") == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        if (r4.getBoolean("featureDisabled") == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004a, code lost:
        r8.retryCallback.onError(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        if (isEventListenersEmpty() == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        if (r4.has("latestTemplateVersionNumber") == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        r5 = r8.configFetchHandler.getTemplateVersionNumber();
        r3 = r4.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (r3 <= r5) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        autoFetch(3, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r4 = new org.json.JSONObject(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void handleNotifications(java.io.InputStream r9) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r9, r4)
            r2.<init>(r3)
        L_0x0010:
            java.lang.String r3 = ""
        L_0x0012:
            java.lang.String r4 = r2.readLine()
            if (r4 == 0) goto L_0x008b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "}"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x0012
            java.lang.String r3 = r8.parseAndValidateConfigUpdateMessage(r3)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0012
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0079 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0079 }
            boolean r3 = r4.has(r1)     // Catch:{ JSONException -> 0x0079 }
            if (r3 == 0) goto L_0x0059
            boolean r3 = r4.getBoolean(r1)     // Catch:{ JSONException -> 0x0079 }
            if (r3 == 0) goto L_0x0059
            com.google.firebase.remoteconfig.ConfigUpdateListener r3 = r8.retryCallback     // Catch:{ JSONException -> 0x0079 }
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r4 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ JSONException -> 0x0079 }
            java.lang.String r5 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r6 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_UNAVAILABLE     // Catch:{ JSONException -> 0x0079 }
            r4.<init>((java.lang.String) r5, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r6)     // Catch:{ JSONException -> 0x0079 }
            r3.onError(r4)     // Catch:{ JSONException -> 0x0079 }
            goto L_0x008b
        L_0x0059:
            boolean r3 = r8.isEventListenersEmpty()     // Catch:{ JSONException -> 0x0079 }
            if (r3 == 0) goto L_0x0060
            goto L_0x008b
        L_0x0060:
            boolean r3 = r4.has(r0)     // Catch:{ JSONException -> 0x0079 }
            if (r3 == 0) goto L_0x0010
            com.google.firebase.remoteconfig.internal.ConfigFetchHandler r3 = r8.configFetchHandler     // Catch:{ JSONException -> 0x0079 }
            long r5 = r3.getTemplateVersionNumber()     // Catch:{ JSONException -> 0x0079 }
            long r3 = r4.getLong(r0)     // Catch:{ JSONException -> 0x0079 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0010
            r5 = 3
            r8.autoFetch(r5, r3)     // Catch:{ JSONException -> 0x0079 }
            goto L_0x0010
        L_0x0079:
            r3 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r4 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r3 = r3.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r5 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r6 = "Unable to parse config update message."
            r4.<init>(r6, r3, r5)
            r8.propagateErrors(r4)
            goto L_0x0010
        L_0x008b:
            r2.close()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.handleNotifications(java.io.InputStream):void");
    }

    private void autoFetch(final int i, final long j) {
        if (i == 0) {
            propagateErrors(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.scheduledExecutorService.schedule(new Runnable() {
            public void run() {
                ConfigAutoFetch.this.fetchLatestConfig(i, j);
            }
        }, (long) this.random.nextInt(4), TimeUnit.SECONDS);
    }

    public Task<Void> fetchLatestConfig(int i, long j) {
        Task<TContinuationResult> continueWithTask;
        synchronized (this) {
            int i2 = i - 1;
            Task<ConfigFetchHandler.FetchResponse> fetchNowWithTypeAndAttemptNumber = this.configFetchHandler.fetchNowWithTypeAndAttemptNumber(ConfigFetchHandler.FetchType.REALTIME, 3 - i2);
            Task<ConfigContainer> task = this.activatedCache.get();
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{fetchNowWithTypeAndAttemptNumber, task}).continueWithTask(this.scheduledExecutorService, new ConfigAutoFetch$$ExternalSyntheticLambda0(this, fetchNowWithTypeAndAttemptNumber, task, j, i2));
        }
        return continueWithTask;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$fetchLatestConfig$0$com-google-firebase-remoteconfig-internal-ConfigAutoFetch  reason: not valid java name */
    public /* synthetic */ Task m134lambda$fetchLatestConfig$0$comgooglefirebaseremoteconfiginternalConfigAutoFetch(Task task, Task task2, long j, int i, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", (Throwable) task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", (Throwable) task2.getException()));
        }
        ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task.getResult();
        ConfigContainer configContainer = (ConfigContainer) task2.getResult();
        if (!fetchResponseIsUpToDate(fetchResponse, j).booleanValue()) {
            autoFetch(i, j);
            return Tasks.forResult(null);
        } else if (fetchResponse.getFetchedConfigs() == null) {
            return Tasks.forResult(null);
        } else {
            if (configContainer == null) {
                configContainer = ConfigContainer.newBuilder().build();
            }
            Set<String> changedParams = configContainer.getChangedParams(fetchResponse.getFetchedConfigs());
            if (changedParams.isEmpty()) {
                return Tasks.forResult(null);
            }
            executeAllListenerCallbacks(ConfigUpdate.create(changedParams));
            return Tasks.forResult(null);
        }
    }

    private static Boolean fetchResponseIsUpToDate(ConfigFetchHandler.FetchResponse fetchResponse, long j) {
        boolean z = false;
        if (fetchResponse.getFetchedConfigs() != null) {
            if (fetchResponse.getFetchedConfigs().getTemplateVersionNumber() >= j) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (fetchResponse.getStatus() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
