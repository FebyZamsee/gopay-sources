package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.AppData;
import com.google.firebase.crashlytics.internal.common.BuildIdInfo;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.ExecutorUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.inject.Deferred;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class FirebaseCrashlytics {
    final CrashlyticsCore core;

    static FirebaseCrashlytics init(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, Deferred<CrashlyticsNativeComponent> deferred, Deferred<AnalyticsConnector> deferred2, Deferred<FirebaseRemoteConfigInterop> deferred3) {
        Context applicationContext = firebaseApp.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Initializing Firebase Crashlytics ");
        sb.append(CrashlyticsCore.getVersion());
        sb.append(" for ");
        sb.append(packageName);
        logger.i(sb.toString());
        FileStore fileStore = new FileStore(applicationContext);
        DataCollectionArbiter dataCollectionArbiter = new DataCollectionArbiter(firebaseApp);
        IdManager idManager = new IdManager(applicationContext, packageName, firebaseInstallationsApi, dataCollectionArbiter);
        CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = new CrashlyticsNativeComponentDeferredProxy(deferred);
        AnalyticsDeferredProxy analyticsDeferredProxy = new AnalyticsDeferredProxy(deferred2);
        ExecutorService buildSingleThreadExecutorService = ExecutorUtils.buildSingleThreadExecutorService("Crashlytics Exception Handler");
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = new CrashlyticsAppQualitySessionsSubscriber(dataCollectionArbiter, fileStore);
        FirebaseSessionsDependencies.register(crashlyticsAppQualitySessionsSubscriber);
        RemoteConfigDeferredProxy remoteConfigDeferredProxy = new RemoteConfigDeferredProxy(deferred3);
        CrashlyticsCore crashlyticsCore = r4;
        IdManager idManager2 = idManager;
        CrashlyticsCore crashlyticsCore2 = new CrashlyticsCore(firebaseApp, idManager, crashlyticsNativeComponentDeferredProxy, dataCollectionArbiter, analyticsDeferredProxy.getDeferredBreadcrumbSource(), analyticsDeferredProxy.getAnalyticsEventLogger(), fileStore, buildSingleThreadExecutorService, crashlyticsAppQualitySessionsSubscriber, remoteConfigDeferredProxy);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        String mappingFileId = CommonUtils.getMappingFileId(applicationContext);
        List<BuildIdInfo> buildIdInfo = CommonUtils.getBuildIdInfo(applicationContext);
        Logger logger2 = Logger.getLogger();
        StringBuilder sb2 = new StringBuilder("Mapping file ID is: ");
        sb2.append(mappingFileId);
        logger2.d(sb2.toString());
        for (BuildIdInfo next : buildIdInfo) {
            Logger.getLogger().d(String.format("Build id for %s on %s: %s", new Object[]{next.getLibraryName(), next.getArch(), next.getBuildId()}));
        }
        DataCollectionArbiter dataCollectionArbiter2 = dataCollectionArbiter;
        try {
            AppData create = AppData.create(applicationContext, idManager2, applicationId, mappingFileId, buildIdInfo, new DevelopmentPlatformProvider(applicationContext));
            Logger logger3 = Logger.getLogger();
            StringBuilder sb3 = new StringBuilder("Installer package name is: ");
            sb3.append(create.installerPackageName);
            logger3.v(sb3.toString());
            ExecutorService buildSingleThreadExecutorService2 = ExecutorUtils.buildSingleThreadExecutorService("com.google.firebase.crashlytics.startup");
            final SettingsController create2 = SettingsController.create(applicationContext, applicationId, idManager2, new HttpRequestFactory(), create.versionCode, create.versionName, fileStore, dataCollectionArbiter2);
            create2.loadSettingsData(buildSingleThreadExecutorService2).continueWith(buildSingleThreadExecutorService2, new Continuation<Void, Object>() {
                public Object then(Task<Void> task) throws Exception {
                    if (task.isSuccessful()) {
                        return null;
                    }
                    Logger.getLogger().e("Error fetching settings.", task.getException());
                    return null;
                }
            });
            final CrashlyticsCore crashlyticsCore3 = crashlyticsCore;
            final boolean onPreExecute = crashlyticsCore3.onPreExecute(create, create2);
            Tasks.call(buildSingleThreadExecutorService2, new Callable<Void>() {
                public Void call() throws Exception {
                    if (!onPreExecute) {
                        return null;
                    }
                    crashlyticsCore3.doBackgroundInitializationAsync(create2);
                    return null;
                }
            });
            return new FirebaseCrashlytics(crashlyticsCore3);
        } catch (PackageManager.NameNotFoundException e) {
            Logger.getLogger().e("Error retrieving app package info.", e);
            return null;
        }
    }

    private FirebaseCrashlytics(CrashlyticsCore crashlyticsCore) {
        this.core = crashlyticsCore;
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) FirebaseApp.getInstance().get(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public void recordException(Throwable th) {
        if (th == null) {
            Logger.getLogger().w("A null value was passed to recordException. Ignoring.");
        } else {
            this.core.logException(th);
        }
    }

    public void log(String str) {
        this.core.log(str);
    }

    public void setUserId(String str) {
        this.core.setUserId(str);
    }

    public void setCustomKey(String str, String str2) {
        this.core.setCustomKey(str, str2);
    }

    public Task<Boolean> checkForUnsentReports() {
        return this.core.checkForUnsentReports();
    }

    public void sendUnsentReports() {
        this.core.sendUnsentReports();
    }

    public void deleteUnsentReports() {
        this.core.deleteUnsentReports();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.core.didCrashOnPreviousExecution();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.core.setCrashlyticsCollectionEnabled(Boolean.valueOf(z));
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.core.setCrashlyticsCollectionEnabled(bool);
    }
}
