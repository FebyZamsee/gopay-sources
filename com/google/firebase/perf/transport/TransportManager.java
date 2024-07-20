package com.google.firebase.perf.transport;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfMetricOrBuilder;
import com.google.firebase.perf.v1.TraceMetric;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.getTabAt;

public class TransportManager implements AppStateMonitor.AppStateCallback {
    private static final TransportManager instance = new TransportManager();
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private Context appContext;
    private AppStateMonitor appStateMonitor;
    private ApplicationInfo.Builder applicationInfoBuilder;
    private final Map<String, Integer> cacheMap;
    private ConfigResolver configResolver;
    private ExecutorService executorService = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
    private FirebaseApp firebaseApp;
    private FirebaseInstallationsApi firebaseInstallationsApi;
    private FirebasePerformance firebasePerformance;
    private FlgTransport flgTransport;
    private Provider<getTabAt> flgTransportFactoryProvider;
    private boolean isForegroundState = false;
    private final AtomicBoolean isTransportInitialized = new AtomicBoolean(false);
    private String packageName;
    private final ConcurrentLinkedQueue<PendingPerfEvent> pendingEventsQueue = new ConcurrentLinkedQueue<>();
    private String projectId;
    private RateLimiter rateLimiter;

    private TransportManager() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.cacheMap = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    public static TransportManager getInstance() {
        return instance;
    }

    public void initialize(FirebaseApp firebaseApp2, FirebaseInstallationsApi firebaseInstallationsApi2, Provider<getTabAt> provider) {
        this.firebaseApp = firebaseApp2;
        this.projectId = firebaseApp2.getOptions().getProjectId();
        this.firebaseInstallationsApi = firebaseInstallationsApi2;
        this.flgTransportFactoryProvider = provider;
        this.executorService.execute(new TransportManager$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    public void syncInit() {
        Context applicationContext = this.firebaseApp.getApplicationContext();
        this.appContext = applicationContext;
        this.packageName = applicationContext.getPackageName();
        this.configResolver = ConfigResolver.getInstance();
        this.rateLimiter = new RateLimiter(this.appContext, new Rate(100, 1, TimeUnit.MINUTES), 500);
        this.appStateMonitor = AppStateMonitor.getInstance();
        this.flgTransport = new FlgTransport(this.flgTransportFactoryProvider, this.configResolver.getAndCacheLogSourceName());
        finishInitialization();
    }

    private void finishInitialization() {
        this.appStateMonitor.registerForAppState(new WeakReference(instance));
        ApplicationInfo.Builder newBuilder = ApplicationInfo.newBuilder();
        this.applicationInfoBuilder = newBuilder;
        newBuilder.setGoogleAppId(this.firebaseApp.getOptions().getApplicationId()).setAndroidAppInfo(AndroidApplicationInfo.newBuilder().setPackageName(this.packageName).setSdkVersion(BuildConfig.FIREPERF_VERSION_NAME).setVersionName(getVersionName(this.appContext)));
        this.isTransportInitialized.set(true);
        while (!this.pendingEventsQueue.isEmpty()) {
            PendingPerfEvent poll = this.pendingEventsQueue.poll();
            if (poll != null) {
                this.executorService.execute(new TransportManager$$ExternalSyntheticLambda4(this, poll));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$finishInitialization$0$com-google-firebase-perf-transport-TransportManager  reason: not valid java name */
    public /* synthetic */ void m69lambda$finishInitialization$0$comgooglefirebaseperftransportTransportManager(PendingPerfEvent pendingPerfEvent) {
        syncLog(pendingPerfEvent.perfMetricBuilder, pendingPerfEvent.appState);
    }

    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        this.isForegroundState = applicationProcessState == ApplicationProcessState.FOREGROUND;
        if (isInitialized()) {
            this.executorService.execute(new TransportManager$$ExternalSyntheticLambda3(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onUpdateAppState$1$com-google-firebase-perf-transport-TransportManager  reason: not valid java name */
    public /* synthetic */ void m73lambda$onUpdateAppState$1$comgooglefirebaseperftransportTransportManager() {
        this.rateLimiter.changeRate(this.isForegroundState);
    }

    public boolean isInitialized() {
        return this.isTransportInitialized.get();
    }

    public void log(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new TransportManager$$ExternalSyntheticLambda0(this, traceMetric, applicationProcessState));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$log$2$com-google-firebase-perf-transport-TransportManager  reason: not valid java name */
    public /* synthetic */ void m70lambda$log$2$comgooglefirebaseperftransportTransportManager(TraceMetric traceMetric, ApplicationProcessState applicationProcessState) {
        syncLog(PerfMetric.newBuilder().setTraceMetric(traceMetric), applicationProcessState);
    }

    public void log(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new TransportManager$$ExternalSyntheticLambda2(this, networkRequestMetric, applicationProcessState));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$log$3$com-google-firebase-perf-transport-TransportManager  reason: not valid java name */
    public /* synthetic */ void m71lambda$log$3$comgooglefirebaseperftransportTransportManager(NetworkRequestMetric networkRequestMetric, ApplicationProcessState applicationProcessState) {
        syncLog(PerfMetric.newBuilder().setNetworkRequestMetric(networkRequestMetric), applicationProcessState);
    }

    public void log(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        this.executorService.execute(new TransportManager$$ExternalSyntheticLambda5(this, gaugeMetric, applicationProcessState));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$log$4$com-google-firebase-perf-transport-TransportManager  reason: not valid java name */
    public /* synthetic */ void m72lambda$log$4$comgooglefirebaseperftransportTransportManager(GaugeMetric gaugeMetric, ApplicationProcessState applicationProcessState) {
        syncLog(PerfMetric.newBuilder().setGaugeMetric(gaugeMetric), applicationProcessState);
    }

    private void syncLog(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        if (isInitialized()) {
            PerfMetric applicationInfoAndBuild = setApplicationInfoAndBuild(builder, applicationProcessState);
            if (isAllowedToDispatch(applicationInfoAndBuild)) {
                dispatchLog(applicationInfoAndBuild);
                SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
            }
        } else if (isAllowedToCache(builder)) {
            logger.debug("Transport is not initialized yet, %s will be queued for to be dispatched later", getLogcatMsg((PerfMetricOrBuilder) builder));
            this.pendingEventsQueue.add(new PendingPerfEvent(builder, applicationProcessState));
        }
    }

    private boolean isAllowedToCache(PerfMetricOrBuilder perfMetricOrBuilder) {
        int intValue = this.cacheMap.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.cacheMap.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.cacheMap.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (perfMetricOrBuilder.hasTraceMetric() && intValue > 0) {
            this.cacheMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (perfMetricOrBuilder.hasNetworkRequestMetric() && intValue2 > 0) {
            this.cacheMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (!perfMetricOrBuilder.hasGaugeMetric() || intValue3 <= 0) {
            logger.debug("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", getLogcatMsg(perfMetricOrBuilder), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        } else {
            this.cacheMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        }
    }

    private boolean isAllowedToDispatch(PerfMetric perfMetric) {
        if (!this.configResolver.isPerformanceMonitoringEnabled()) {
            logger.info("Performance collection is not enabled, dropping %s", getLogcatMsg((PerfMetricOrBuilder) perfMetric));
            return false;
        } else if (!perfMetric.getApplicationInfo().hasAppInstanceId()) {
            logger.warn("App Instance ID is null or empty, dropping %s", getLogcatMsg((PerfMetricOrBuilder) perfMetric));
            return false;
        } else if (!PerfMetricValidator.isValid(perfMetric, this.appContext)) {
            logger.warn("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", getLogcatMsg((PerfMetricOrBuilder) perfMetric));
            return false;
        } else if (!this.rateLimiter.isEventSampled(perfMetric)) {
            incrementDropCount(perfMetric);
            logger.info("Event dropped due to device sampling - %s", getLogcatMsg((PerfMetricOrBuilder) perfMetric));
            return false;
        } else if (!this.rateLimiter.isEventRateLimited(perfMetric)) {
            return true;
        } else {
            incrementDropCount(perfMetric);
            logger.info("Rate limited (per device) - %s", getLogcatMsg((PerfMetricOrBuilder) perfMetric));
            return false;
        }
    }

    private void dispatchLog(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            logger.info("Logging %s. In a minute, visit the Firebase console to view your data: %s", getLogcatMsg((PerfMetricOrBuilder) perfMetric), getConsoleUrl(perfMetric.getTraceMetric()));
        } else {
            logger.info("Logging %s", getLogcatMsg((PerfMetricOrBuilder) perfMetric));
        }
        this.flgTransport.log(perfMetric);
    }

    private static String getVersionName(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName == null ? "" : packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    private PerfMetric setApplicationInfoAndBuild(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        updateFirebaseInstallationIdIfPossibleAndNeeded();
        ApplicationInfo.Builder applicationProcessState2 = this.applicationInfoBuilder.setApplicationProcessState(applicationProcessState);
        if (builder.hasTraceMetric() || builder.hasNetworkRequestMetric()) {
            applicationProcessState2 = ((ApplicationInfo.Builder) applicationProcessState2.clone()).putAllCustomAttributes(getGlobalCustomAttributes());
        }
        return (PerfMetric) builder.setApplicationInfo(applicationProcessState2).build();
    }

    private Map<String, String> getGlobalCustomAttributes() {
        updateFirebasePerformanceIfPossibleAndNeeded();
        FirebasePerformance firebasePerformance2 = this.firebasePerformance;
        if (firebasePerformance2 != null) {
            return firebasePerformance2.getAttributes();
        }
        return Collections.emptyMap();
    }

    private void updateFirebasePerformanceIfPossibleAndNeeded() {
        if (this.firebasePerformance == null && isInitialized()) {
            this.firebasePerformance = FirebasePerformance.getInstance();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateFirebaseInstallationIdIfPossibleAndNeeded() {
        /*
            r6 = this;
            com.google.firebase.perf.config.ConfigResolver r0 = r6.configResolver
            boolean r0 = r0.isPerformanceMonitoringEnabled()
            if (r0 == 0) goto L_0x006f
            com.google.firebase.perf.v1.ApplicationInfo$Builder r0 = r6.applicationInfoBuilder
            boolean r0 = r0.hasAppInstanceId()
            if (r0 == 0) goto L_0x0015
            boolean r0 = r6.isForegroundState
            if (r0 != 0) goto L_0x0015
            return
        L_0x0015:
            r0 = 0
            r1 = 1
            com.google.firebase.installations.FirebaseInstallationsApi r2 = r6.firebaseInstallationsApi     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            r3 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2, r3, r5)     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ ExecutionException -> 0x004b, InterruptedException -> 0x003a, TimeoutException -> 0x0029 }
            goto L_0x005c
        L_0x0029:
            r2 = move-exception
            com.google.firebase.perf.logging.AndroidLogger r3 = logger
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.error(r0, r1)
            goto L_0x005b
        L_0x003a:
            r2 = move-exception
            com.google.firebase.perf.logging.AndroidLogger r3 = logger
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.error(r0, r1)
            goto L_0x005b
        L_0x004b:
            r2 = move-exception
            com.google.firebase.perf.logging.AndroidLogger r3 = logger
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.error(r0, r1)
        L_0x005b:
            r2 = 0
        L_0x005c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0068
            com.google.firebase.perf.v1.ApplicationInfo$Builder r0 = r6.applicationInfoBuilder
            r0.setAppInstanceId(r2)
            return
        L_0x0068:
            com.google.firebase.perf.logging.AndroidLogger r0 = logger
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.warn(r1)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.transport.TransportManager.updateFirebaseInstallationIdIfPossibleAndNeeded():void");
    }

    private void incrementDropCount(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric()) {
            this.appStateMonitor.incrementCount(Constants.CounterNames.TRACE_EVENT_RATE_LIMITED.toString(), 1);
        } else if (perfMetric.hasNetworkRequestMetric()) {
            this.appStateMonitor.incrementCount(Constants.CounterNames.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1);
        }
    }

    private static String getLogcatMsg(PerfMetricOrBuilder perfMetricOrBuilder) {
        if (perfMetricOrBuilder.hasTraceMetric()) {
            return getLogcatMsg(perfMetricOrBuilder.getTraceMetric());
        }
        if (perfMetricOrBuilder.hasNetworkRequestMetric()) {
            return getLogcatMsg(perfMetricOrBuilder.getNetworkRequestMetric());
        }
        return perfMetricOrBuilder.hasGaugeMetric() ? getLogcatMsg(perfMetricOrBuilder.getGaugeMetric()) : "log";
    }

    private static String getLogcatMsg(TraceMetric traceMetric) {
        long durationUs = traceMetric.getDurationUs();
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[]{traceMetric.getName(), new DecimalFormat("#.####").format(((double) durationUs) / 1000.0d)});
    }

    private static String getLogcatMsg(NetworkRequestMetric networkRequestMetric) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[]{networkRequestMetric.getUrl(), networkRequestMetric.hasHttpResponseCode() ? String.valueOf(networkRequestMetric.getHttpResponseCode()) : "UNKNOWN", new DecimalFormat("#.####").format(((double) (networkRequestMetric.hasTimeToResponseCompletedUs() ? networkRequestMetric.getTimeToResponseCompletedUs() : 0)) / 1000.0d)});
    }

    private static String getLogcatMsg(GaugeMetric gaugeMetric) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[]{Boolean.valueOf(gaugeMetric.hasGaugeMetadata()), Integer.valueOf(gaugeMetric.getCpuMetricReadingsCount()), Integer.valueOf(gaugeMetric.getAndroidMemoryReadingsCount())});
    }

    private String getConsoleUrl(TraceMetric traceMetric) {
        String name = traceMetric.getName();
        if (name.startsWith("_st_")) {
            return ConsoleUrlGenerator.generateScreenTraceUrl(this.projectId, this.packageName, name);
        }
        return ConsoleUrlGenerator.generateCustomTraceUrl(this.projectId, this.packageName, name);
    }
}
