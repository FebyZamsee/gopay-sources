package com.google.firebase.perf.config;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class RemoteConfigManager {
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ConcurrentHashMap<String, FirebaseRemoteConfigValue> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final DeviceCacheManager cache;
    private final Executor executor;
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private Provider<RemoteConfigComponent> firebaseRemoteConfigProvider;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private RemoteConfigManager() {
        /*
            r10 = this;
            com.google.firebase.perf.config.DeviceCacheManager r1 = com.google.firebase.perf.config.DeviceCacheManager.getInstance()
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            r3 = 0
            r4 = 1
            r5 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r7, r8)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2 = 25000(0x61a8, float:3.5032E-41)
            int r0 = r0.nextInt(r2)
            long r2 = (long) r0
            long r6 = getInitialStartupMillis()
            r4 = 5000(0x1388, double:2.4703E-320)
            long r4 = r4 + r2
            r3 = 0
            r0 = r10
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.<init>():void");
    }

    static long getInitialStartupMillis() {
        StartupTime startupTime = (StartupTime) FirebaseApp.getInstance().get(StartupTime.class);
        if (startupTime != null) {
            return startupTime.getEpochMillis();
        }
        return System.currentTimeMillis();
    }

    RemoteConfigManager(DeviceCacheManager deviceCacheManager, Executor executor2, FirebaseRemoteConfig firebaseRemoteConfig2, long j, long j2) {
        ConcurrentHashMap<String, FirebaseRemoteConfigValue> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
        this.cache = deviceCacheManager;
        this.executor = executor2;
        this.firebaseRemoteConfig = firebaseRemoteConfig2;
        if (firebaseRemoteConfig2 == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(firebaseRemoteConfig2.getAll());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    public void setFirebaseRemoteConfigProvider(Provider<RemoteConfigComponent> provider) {
        this.firebaseRemoteConfigProvider = provider;
    }

    public Optional<Double> getDouble(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config double value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.of(Double.valueOf(remoteConfigValue.asDouble()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config long value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.of(Long.valueOf(remoteConfigValue.asLong()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config boolean value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.of(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config String value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return Optional.of(remoteConfigValue.asString());
        }
        return Optional.absent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r7, T r8) {
        /*
            r6 = this;
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r0 = r6.getRemoteConfigValue(r7)
            if (r0 == 0) goto L_0x006e
            boolean r1 = r8 instanceof java.lang.Boolean
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0018
            boolean r1 = r0.asBoolean()     // Catch:{ IllegalArgumentException -> 0x0016 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0016 }
        L_0x0014:
            r8 = r7
            goto L_0x006e
        L_0x0016:
            goto L_0x0052
        L_0x0018:
            boolean r1 = r8 instanceof java.lang.Double
            if (r1 == 0) goto L_0x0025
            double r4 = r0.asDouble()     // Catch:{ IllegalArgumentException -> 0x0016 }
            java.lang.Double r7 = java.lang.Double.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0016 }
            goto L_0x0014
        L_0x0025:
            boolean r1 = r8 instanceof java.lang.Long
            if (r1 != 0) goto L_0x0049
            boolean r1 = r8 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x0049
            boolean r1 = r8 instanceof java.lang.String
            if (r1 == 0) goto L_0x0036
            java.lang.String r7 = r0.asString()     // Catch:{ IllegalArgumentException -> 0x0016 }
            goto L_0x0014
        L_0x0036:
            java.lang.String r1 = r0.asString()     // Catch:{ IllegalArgumentException -> 0x0016 }
            com.google.firebase.perf.logging.AndroidLogger r4 = logger     // Catch:{ IllegalArgumentException -> 0x0047 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ IllegalArgumentException -> 0x0047 }
            r5[r3] = r8     // Catch:{ IllegalArgumentException -> 0x0047 }
            java.lang.String r8 = "No matching type found for the defaultValue: '%s', using String."
            r4.debug(r8, r5)     // Catch:{ IllegalArgumentException -> 0x0047 }
            r8 = r1
            goto L_0x006e
        L_0x0047:
            r8 = r1
            goto L_0x0052
        L_0x0049:
            long r4 = r0.asLong()     // Catch:{ IllegalArgumentException -> 0x0016 }
            java.lang.Long r7 = java.lang.Long.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0016 }
            goto L_0x0014
        L_0x0052:
            java.lang.String r1 = r0.asString()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x006e
            com.google.firebase.perf.logging.AndroidLogger r1 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.asString()
            r4[r3] = r0
            r4[r2] = r7
            java.lang.String r7 = "Could not parse value: '%s' for key: '%s'."
            r1.debug(r7, r4)
        L_0x006e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    private FirebaseRemoteConfigValue getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(str);
        if (firebaseRemoteConfigValue.getSource() != 2) {
            return null;
        }
        logger.debug("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", firebaseRemoteConfigValue.asString(), str);
        return firebaseRemoteConfigValue;
    }

    public boolean isLastFetchFailed() {
        FirebaseRemoteConfig firebaseRemoteConfig2 = this.firebaseRemoteConfig;
        if (firebaseRemoteConfig2 == null || firebaseRemoteConfig2.getInfo().getLastFetchStatus() == 1 || this.firebaseRemoteConfig.getInfo().getLastFetchStatus() == 2) {
            return true;
        }
        return false;
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.getAll());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.fetchAndActivate().addOnSuccessListener(this.executor, new RemoteConfigManager$$ExternalSyntheticLambda0(this)).addOnFailureListener(this.executor, (OnFailureListener) new RemoteConfigManager$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0$com-google-firebase-perf-config-RemoteConfigManager  reason: not valid java name */
    public /* synthetic */ void m123lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0$comgooglefirebaseperfconfigRemoteConfigManager(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.getAll());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1$com-google-firebase-perf-config-RemoteConfigManager  reason: not valid java name */
    public /* synthetic */ void m124lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1$comgooglefirebaseperfconfigRemoteConfigManager(Exception exc) {
        logger.warn("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
    }

    /* access modifiers changed from: protected */
    public void syncConfigValues(Map<String, FirebaseRemoteConfigValue> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        ConfigurationConstants.ExperimentTTID instance2 = ConfigurationConstants.ExperimentTTID.getInstance();
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(instance2.getRemoteConfigFlag());
        if (firebaseRemoteConfigValue != null) {
            try {
                this.cache.setValue(instance2.getDeviceCacheFlag(), firebaseRemoteConfigValue.asBoolean());
            } catch (Exception unused) {
                logger.debug("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
        } else {
            logger.debug("ExperimentTTID remote config flag does not exist.");
        }
    }

    /* access modifiers changed from: protected */
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        Provider<RemoteConfigComponent> provider;
        RemoteConfigComponent remoteConfigComponent;
        if (!(this.firebaseRemoteConfig != null || (provider = this.firebaseRemoteConfigProvider) == null || (remoteConfigComponent = provider.get()) == null)) {
            this.firebaseRemoteConfig = remoteConfigComponent.get("fireperf");
        }
        return this.firebaseRemoteConfig != null;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }
}
