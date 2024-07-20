package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.logging.ConsoleUrlGenerator;
import com.google.firebase.perf.metrics.HttpMetric;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.getCurrentContentInsetLeft;
import o.getNavigationContentDescription;
import o.getTabAt;

@getNavigationContentDescription
public class FirebasePerformance {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ConfigResolver configResolver;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private final Provider<RemoteConfigComponent> firebaseRemoteConfigProvider;
    private final Map<String, String> mCustomAttributes = new ConcurrentHashMap();
    private final ImmutableBundle mMetadataBundle;
    private Boolean mPerformanceCollectionForceEnabledState = null;
    private final Provider<getTabAt> transportFactoryProvider;

    public static FirebasePerformance getInstance() {
        return (FirebasePerformance) FirebaseApp.getInstance().get(FirebasePerformance.class);
    }

    @getCurrentContentInsetLeft
    FirebasePerformance(FirebaseApp firebaseApp2, Provider<RemoteConfigComponent> provider, FirebaseInstallationsApi firebaseInstallationsApi2, Provider<getTabAt> provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver2, SessionManager sessionManager) {
        this.firebaseApp = firebaseApp2;
        this.firebaseRemoteConfigProvider = provider;
        this.firebaseInstallationsApi = firebaseInstallationsApi2;
        this.transportFactoryProvider = provider2;
        if (firebaseApp2 == null) {
            this.mPerformanceCollectionForceEnabledState = Boolean.FALSE;
            this.configResolver = configResolver2;
            this.mMetadataBundle = new ImmutableBundle(new Bundle());
            return;
        }
        TransportManager.getInstance().initialize(firebaseApp2, firebaseInstallationsApi2, provider2);
        Context applicationContext = firebaseApp2.getApplicationContext();
        ImmutableBundle extractMetadata = extractMetadata(applicationContext);
        this.mMetadataBundle = extractMetadata;
        remoteConfigManager.setFirebaseRemoteConfigProvider(provider);
        this.configResolver = configResolver2;
        configResolver2.setMetadataBundle(extractMetadata);
        configResolver2.setApplicationContext(applicationContext);
        sessionManager.setApplicationContext(applicationContext);
        this.mPerformanceCollectionForceEnabledState = configResolver2.getIsPerformanceCollectionEnabled();
        AndroidLogger androidLogger = logger;
        if (androidLogger.isLogcatEnabled() && isPerformanceCollectionEnabled()) {
            androidLogger.info(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", new Object[]{ConsoleUrlGenerator.generateDashboardUrl(firebaseApp2.getOptions().getProjectId(), applicationContext.getPackageName())}));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPerformanceCollectionEnabled(java.lang.Boolean r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.firebase.FirebaseApp.getInstance()     // Catch:{ IllegalStateException -> 0x0053 }
            com.google.firebase.perf.config.ConfigResolver r0 = r1.configResolver     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = r0.getIsPerformanceCollectionDeactivated()     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0019
            com.google.firebase.perf.logging.AndroidLogger r2 = logger     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Firebase Performance is permanently disabled"
            r2.info(r0)     // Catch:{ all -> 0x0050 }
            monitor-exit(r1)
            return
        L_0x0019:
            com.google.firebase.perf.config.ConfigResolver r0 = r1.configResolver     // Catch:{ all -> 0x0050 }
            r0.setIsPerformanceCollectionEnabled(r2)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0023
            r1.mPerformanceCollectionForceEnabledState = r2     // Catch:{ all -> 0x0050 }
            goto L_0x002b
        L_0x0023:
            com.google.firebase.perf.config.ConfigResolver r2 = r1.configResolver     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r2 = r2.getIsPerformanceCollectionEnabled()     // Catch:{ all -> 0x0050 }
            r1.mPerformanceCollectionForceEnabledState = r2     // Catch:{ all -> 0x0050 }
        L_0x002b:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = r1.mPerformanceCollectionForceEnabledState     // Catch:{ all -> 0x0050 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x003d
            com.google.firebase.perf.logging.AndroidLogger r2 = logger     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Firebase Performance is Enabled"
            r2.info(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x004e
        L_0x003d:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0050 }
            java.lang.Boolean r0 = r1.mPerformanceCollectionForceEnabledState     // Catch:{ all -> 0x0050 }
            boolean r2 = r2.equals(r0)     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x004e
            com.google.firebase.perf.logging.AndroidLogger r2 = logger     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "Firebase Performance is Disabled"
            r2.info(r0)     // Catch:{ all -> 0x0050 }
        L_0x004e:
            monitor-exit(r1)
            return
        L_0x0050:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0053:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.FirebasePerformance.setPerformanceCollectionEnabled(java.lang.Boolean):void");
    }

    public boolean isPerformanceCollectionEnabled() {
        Boolean bool = this.mPerformanceCollectionForceEnabledState;
        if (bool != null) {
            return bool.booleanValue();
        }
        return FirebaseApp.getInstance().isDataCollectionDefaultEnabled();
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.mCustomAttributes);
    }

    public Trace newTrace(String str) {
        return Trace.create(str);
    }

    public HttpMetric newHttpMetric(String str, String str2) {
        return new HttpMetric(str, str2, TransportManager.getInstance(), new Timer());
    }

    private static ImmutableBundle extractMetadata(Context context) {
        Bundle bundle;
        ImmutableBundle immutableBundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            e.getMessage();
            bundle = null;
        }
        if (bundle == null) {
            immutableBundle = new ImmutableBundle();
        }
        return immutableBundle;
    }
}
