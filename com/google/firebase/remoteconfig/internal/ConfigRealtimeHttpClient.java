package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class ConfigRealtimeHttpClient {
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private final int ORIGINAL_RETRIES = 8;
    ConfigCacheClient activatedCache;
    private final Clock clock;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private int httpRetriesRemaining;
    private boolean isHttpConnectionRunning;
    private boolean isInBackground;
    private boolean isRealtimeDisabled;
    private final Set<ConfigUpdateListener> listeners;
    private final ConfigMetadataClient metadataClient;
    private final String namespace;
    private final Random random;
    private final ScheduledExecutorService scheduledExecutorService;

    private boolean isStatusCodeRetryable(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp2, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler2, ConfigCacheClient configCacheClient, Context context2, String str, Set<ConfigUpdateListener> set, ConfigMetadataClient configMetadataClient, ScheduledExecutorService scheduledExecutorService2) {
        this.listeners = set;
        this.isHttpConnectionRunning = false;
        this.scheduledExecutorService = scheduledExecutorService2;
        this.random = new Random();
        this.httpRetriesRemaining = Math.max(8 - configMetadataClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.clock = DefaultClock.getInstance();
        this.firebaseApp = firebaseApp2;
        this.configFetchHandler = configFetchHandler2;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context2;
        this.namespace = str;
        this.metadataClient = configMetadataClient;
        this.isRealtimeDisabled = false;
        this.isInBackground = false;
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context2 = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context2, context2.getPackageName());
            if (packageCertificateHashBytes == null) {
                return null;
            }
            return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty("X-Android-Package", this.context.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private JSONObject createRequestBody(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        hashMap.put("namespace", this.namespace);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        hashMap.put("appId", this.firebaseApp.getOptions().getApplicationId());
        hashMap.put("sdkVersion", "21.6.0");
        hashMap.put("appInstanceId", str);
        return new JSONObject(hashMap);
    }

    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* access modifiers changed from: private */
    public void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        synchronized (this) {
            for (ConfigUpdateListener onError : this.listeners) {
                onError.onError(firebaseRemoteConfigException);
            }
        }
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int numFailedStreams = this.metadataClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.metadataClient.setRealtimeBackoffMetadata(numFailedStreams, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
    }

    private long getRandomizedBackoffDurationInMillis(int i) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i - 1]);
        return (millis / 2) + ((long) this.random.nextInt((int) millis));
    }

    /* access modifiers changed from: private */
    public void enableBackoff() {
        synchronized (this) {
            this.isRealtimeDisabled = true;
        }
    }

    private boolean canMakeHttpStreamConnection() {
        boolean z;
        synchronized (this) {
            z = !this.listeners.isEmpty() && !this.isHttpConnectionRunning && !this.isRealtimeDisabled && !this.isInBackground;
        }
        return z;
    }

    private String getRealtimeURL(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", new Object[]{extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), str});
    }

    private URL getUrl() {
        try {
            return new URL(getRealtimeURL(this.namespace));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public Task<HttpURLConnection> createRealtimeConnection() {
        Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
        Task<String> id = this.firebaseInstallations.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id}).continueWithTask(this.scheduledExecutorService, new ConfigRealtimeHttpClient$$ExternalSyntheticLambda1(this, token, id));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$createRealtimeConnection$0$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient  reason: not valid java name */
    public /* synthetic */ Task m142lambda$createRealtimeConnection$0$comgooglefirebaseremoteconfiginternalConfigRealtimeHttpClient(Task task, Task task2, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", (Throwable) task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", (Throwable) task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) getUrl().openConnection();
            setRequestParams(httpURLConnection, (String) task2.getResult(), ((InstallationTokenResult) task.getResult()).getToken());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", (Throwable) e));
        }
    }

    public void startHttpConnection() {
        makeRealtimeHttpConnection(0);
    }

    public void retryHttpConnectionWhenBackoffEnds() {
        synchronized (this) {
            makeRealtimeHttpConnection(Math.max(0, this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new Date(this.clock.currentTimeMillis()).getTime()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void makeRealtimeHttpConnection(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.canMakeHttpStreamConnection()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            int r0 = r3.httpRetriesRemaining     // Catch:{ all -> 0x0030 }
            if (r0 <= 0) goto L_0x001e
            int r0 = r0 + -1
            r3.httpRetriesRemaining = r0     // Catch:{ all -> 0x0030 }
            java.util.concurrent.ScheduledExecutorService r0 = r3.scheduledExecutorService     // Catch:{ all -> 0x0030 }
            com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$1 r1 = new com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient$1     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0030 }
            r0.schedule(r1, r4, r2)     // Catch:{ all -> 0x0030 }
            goto L_0x002e
        L_0x001e:
            boolean r4 = r3.isInBackground     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x002e
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r4 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = "Unable to connect to the server. Check your connection and try again."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r0 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR     // Catch:{ all -> 0x0030 }
            r4.<init>((java.lang.String) r5, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r0)     // Catch:{ all -> 0x0030 }
            r3.propagateErrors(r4)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.makeRealtimeHttpConnection(long):void");
    }

    /* access modifiers changed from: package-private */
    public void setRealtimeBackgroundState(boolean z) {
        this.isInBackground = z;
    }

    private void resetRetryCount() {
        synchronized (this) {
            this.httpRetriesRemaining = 8;
        }
    }

    private void setIsHttpConnectionRunning(boolean z) {
        synchronized (this) {
            this.isHttpConnectionRunning = z;
        }
    }

    public ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        ConfigAutoFetch configAutoFetch;
        synchronized (this) {
            HttpURLConnection httpURLConnection2 = httpURLConnection;
            configAutoFetch = new ConfigAutoFetch(httpURLConnection2, this.configFetchHandler, this.activatedCache, this.listeners, new ConfigUpdateListener() {
                public void onUpdate(ConfigUpdate configUpdate) {
                }

                public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                    ConfigRealtimeHttpClient.this.enableBackoff();
                    ConfigRealtimeHttpClient.this.propagateErrors(firebaseRemoteConfigException);
                }
            }, this.scheduledExecutorService);
        }
        return configAutoFetch;
    }

    private String parseForbiddenErrorResponseMessage(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    public void beginRealtimeHttpStream() {
        if (canMakeHttpStreamConnection()) {
            if (new Date(this.clock.currentTimeMillis()).before(this.metadataClient.getRealtimeBackoffMetadata().getBackoffEndTime())) {
                retryHttpConnectionWhenBackoffEnds();
                return;
            }
            Task<HttpURLConnection> createRealtimeConnection = createRealtimeConnection();
            Tasks.whenAllComplete((Task<?>[]) new Task[]{createRealtimeConnection}).continueWith(this.scheduledExecutorService, new ConfigRealtimeHttpClient$$ExternalSyntheticLambda0(this, createRealtimeConnection));
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0134  */
    /* renamed from: lambda$beginRealtimeHttpStream$1$com-google-firebase-remoteconfig-internal-ConfigRealtimeHttpClient  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ com.google.android.gms.tasks.Task m141lambda$beginRealtimeHttpStream$1$comgooglefirebaseremoteconfiginternalConfigRealtimeHttpClient(com.google.android.gms.tasks.Task r13, com.google.android.gms.tasks.Task r14) throws java.lang.Exception {
        /*
            r12 = this;
            java.lang.String r14 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            r0 = 403(0x193, float:5.65E-43)
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            r3 = 1
            r4 = 0
            boolean r5 = r13.isSuccessful()     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
            if (r5 == 0) goto L_0x0095
            r12.setIsHttpConnectionRunning(r3)     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
            java.lang.Object r13 = r13.getResult()     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
            int r5 = r13.getResponseCode()     // Catch:{ IOException -> 0x0093, all -> 0x008d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0093, all -> 0x008d }
            int r6 = r5.intValue()     // Catch:{ IOException -> 0x008a, all -> 0x0085 }
            if (r6 != r1) goto L_0x0035
            r12.resetRetryCount()     // Catch:{ IOException -> 0x008a, all -> 0x0085 }
            com.google.firebase.remoteconfig.internal.ConfigMetadataClient r6 = r12.metadataClient     // Catch:{ IOException -> 0x008a, all -> 0x0085 }
            r6.resetRealtimeBackoff()     // Catch:{ IOException -> 0x008a, all -> 0x0085 }
            com.google.firebase.remoteconfig.internal.ConfigAutoFetch r6 = r12.startAutoFetch(r13)     // Catch:{ IOException -> 0x008a, all -> 0x0085 }
            r6.listenForNotifications()     // Catch:{ IOException -> 0x008a, all -> 0x0085 }
        L_0x0035:
            r12.closeRealtimeHttpStream(r13)
            r12.setIsHttpConnectionRunning(r4)
            if (r5 == 0) goto L_0x0049
            int r6 = r5.intValue()
            boolean r6 = r12.isStatusCodeRetryable(r6)
            if (r6 != 0) goto L_0x0049
            r6 = 0
            goto L_0x004a
        L_0x0049:
            r6 = 1
        L_0x004a:
            if (r6 == 0) goto L_0x005a
            com.google.android.gms.common.util.Clock r7 = r12.clock
            java.util.Date r8 = new java.util.Date
            long r9 = r7.currentTimeMillis()
            r8.<init>(r9)
            r12.updateBackoffMetadataWithLastFailedStreamConnectionTime(r8)
        L_0x005a:
            if (r6 != 0) goto L_0x014b
            int r6 = r5.intValue()
            if (r6 == r1) goto L_0x014b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r5
            java.lang.String r14 = java.lang.String.format(r14, r1)
            int r1 = r5.intValue()
            if (r1 != r0) goto L_0x0078
            java.io.InputStream r13 = r13.getErrorStream()
            java.lang.String r14 = r12.parseForbiddenErrorResponseMessage(r13)
        L_0x0078:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r13 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r0 = r5.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r1 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR
            r13.<init>((int) r0, (java.lang.String) r14, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r1)
            goto L_0x0147
        L_0x0085:
            r2 = move-exception
            r11 = r2
            r2 = r13
            r13 = r11
            goto L_0x00a1
        L_0x008a:
            goto L_0x00f9
        L_0x008d:
            r5 = move-exception
            r11 = r2
            r2 = r13
            r13 = r5
            r5 = r11
            goto L_0x00a1
        L_0x0093:
            r5 = r2
            goto L_0x00f9
        L_0x0095:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
            java.lang.Exception r13 = r13.getException()     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
            r5.<init>(r13)     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
            throw r5     // Catch:{ IOException -> 0x00f7, all -> 0x009f }
        L_0x009f:
            r13 = move-exception
            r5 = r2
        L_0x00a1:
            r12.closeRealtimeHttpStream(r2)
            r12.setIsHttpConnectionRunning(r4)
            if (r5 == 0) goto L_0x00b5
            int r6 = r5.intValue()
            boolean r6 = r12.isStatusCodeRetryable(r6)
            if (r6 != 0) goto L_0x00b5
            r6 = 0
            goto L_0x00b6
        L_0x00b5:
            r6 = 1
        L_0x00b6:
            if (r6 == 0) goto L_0x00c6
            com.google.android.gms.common.util.Clock r7 = r12.clock
            java.util.Date r8 = new java.util.Date
            long r9 = r7.currentTimeMillis()
            r8.<init>(r9)
            r12.updateBackoffMetadataWithLastFailedStreamConnectionTime(r8)
        L_0x00c6:
            if (r6 != 0) goto L_0x00f3
            int r6 = r5.intValue()
            if (r6 == r1) goto L_0x00f3
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r5
            java.lang.String r14 = java.lang.String.format(r14, r1)
            int r1 = r5.intValue()
            if (r1 != r0) goto L_0x00e4
            java.io.InputStream r14 = r2.getErrorStream()
            java.lang.String r14 = r12.parseForbiddenErrorResponseMessage(r14)
        L_0x00e4:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r0 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r1 = r5.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r2 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR
            r0.<init>((int) r1, (java.lang.String) r14, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r2)
            r12.propagateErrors(r0)
            goto L_0x00f6
        L_0x00f3:
            r12.retryHttpConnectionWhenBackoffEnds()
        L_0x00f6:
            throw r13
        L_0x00f7:
            r13 = r2
            r5 = r13
        L_0x00f9:
            r12.closeRealtimeHttpStream(r13)
            r12.setIsHttpConnectionRunning(r4)
            if (r5 == 0) goto L_0x010d
            int r6 = r5.intValue()
            boolean r6 = r12.isStatusCodeRetryable(r6)
            if (r6 != 0) goto L_0x010d
            r6 = 0
            goto L_0x010e
        L_0x010d:
            r6 = 1
        L_0x010e:
            if (r6 == 0) goto L_0x011e
            com.google.android.gms.common.util.Clock r7 = r12.clock
            java.util.Date r8 = new java.util.Date
            long r9 = r7.currentTimeMillis()
            r8.<init>(r9)
            r12.updateBackoffMetadataWithLastFailedStreamConnectionTime(r8)
        L_0x011e:
            if (r6 != 0) goto L_0x014b
            int r6 = r5.intValue()
            if (r6 == r1) goto L_0x014b
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r5
            java.lang.String r14 = java.lang.String.format(r14, r1)
            int r1 = r5.intValue()
            if (r1 != r0) goto L_0x013c
            java.io.InputStream r13 = r13.getErrorStream()
            java.lang.String r14 = r12.parseForbiddenErrorResponseMessage(r13)
        L_0x013c:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r13 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r0 = r5.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$Code r1 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR
            r13.<init>((int) r0, (java.lang.String) r14, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.Code) r1)
        L_0x0147:
            r12.propagateErrors(r13)
            goto L_0x014e
        L_0x014b:
            r12.retryHttpConnectionWhenBackoffEnds()
        L_0x014e:
            com.google.android.gms.tasks.Task r13 = com.google.android.gms.tasks.Tasks.forResult(r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.m141lambda$beginRealtimeHttpStream$1$comgooglefirebaseremoteconfiginternalConfigRealtimeHttpClient(com.google.android.gms.tasks.Task, com.google.android.gms.tasks.Task):com.google.android.gms.tasks.Task");
    }

    public void closeRealtimeHttpStream(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }
}
