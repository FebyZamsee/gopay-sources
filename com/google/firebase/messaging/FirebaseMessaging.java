package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.Store;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.getTabAt;

public class FirebaseMessaging {
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private static Store store;
    static ScheduledExecutorService syncExecutor;
    static getTabAt transportFactory;
    private final AutoInit autoInit;
    private final Context context;
    private final Executor fileExecutor;
    /* access modifiers changed from: private */
    public final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi fis;
    private final GmsRpc gmsRpc;
    private final FirebaseInstanceIdInternal iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Executor taskExecutor;
    private final Task<TopicsSubscriber> topicsSubscriberTask;

    public static FirebaseMessaging getInstance() {
        FirebaseMessaging instance;
        synchronized (FirebaseMessaging.class) {
            instance = getInstance(FirebaseApp.getInstance());
        }
        return instance;
    }

    private static Store getStore(Context context2) {
        Store store2;
        synchronized (FirebaseMessaging.class) {
            if (store == null) {
                store = new Store(context2);
            }
            store2 = store;
        }
        return store2;
    }

    static FirebaseMessaging getInstance(FirebaseApp firebaseApp2) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp2.get(cls);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    FirebaseMessaging(FirebaseApp firebaseApp2, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider<UserAgentPublisher> provider, Provider<HeartBeatInfo> provider2, FirebaseInstallationsApi firebaseInstallationsApi, getTabAt gettabat, Subscriber subscriber) {
        this(firebaseApp2, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, gettabat, subscriber, new Metadata(firebaseApp2.getApplicationContext()));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    FirebaseMessaging(com.google.firebase.FirebaseApp r12, com.google.firebase.iid.internal.FirebaseInstanceIdInternal r13, com.google.firebase.inject.Provider<com.google.firebase.platforminfo.UserAgentPublisher> r14, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatInfo> r15, com.google.firebase.installations.FirebaseInstallationsApi r16, o.getTabAt r17, com.google.firebase.events.Subscriber r18, com.google.firebase.messaging.Metadata r19) {
        /*
            r11 = this;
            com.google.firebase.messaging.GmsRpc r7 = new com.google.firebase.messaging.GmsRpc
            r0 = r7
            r1 = r12
            r2 = r19
            r3 = r14
            r4 = r15
            r5 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r8 = com.google.firebase.messaging.FcmExecutors.newTaskExecutor()
            java.util.concurrent.ScheduledExecutorService r9 = com.google.firebase.messaging.FcmExecutors.newInitExecutor()
            java.util.concurrent.Executor r10 = com.google.firebase.messaging.FcmExecutors.newFileIOExecutor()
            r0 = r11
            r2 = r13
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessaging.<init>(com.google.firebase.FirebaseApp, com.google.firebase.iid.internal.FirebaseInstanceIdInternal, com.google.firebase.inject.Provider, com.google.firebase.inject.Provider, com.google.firebase.installations.FirebaseInstallationsApi, o.getTabAt, com.google.firebase.events.Subscriber, com.google.firebase.messaging.Metadata):void");
    }

    FirebaseMessaging(FirebaseApp firebaseApp2, FirebaseInstanceIdInternal firebaseInstanceIdInternal, FirebaseInstallationsApi firebaseInstallationsApi, getTabAt gettabat, Subscriber subscriber, Metadata metadata2, GmsRpc gmsRpc2, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = gettabat;
        this.firebaseApp = firebaseApp2;
        this.iid = firebaseInstanceIdInternal;
        this.fis = firebaseInstallationsApi;
        this.autoInit = new AutoInit(subscriber);
        Context applicationContext = firebaseApp2.getApplicationContext();
        this.context = applicationContext;
        FcmLifecycleCallbacks fcmLifecycleCallbacks = new FcmLifecycleCallbacks();
        this.lifecycleCallbacks = fcmLifecycleCallbacks;
        this.metadata = metadata2;
        this.taskExecutor = executor;
        this.gmsRpc = gmsRpc2;
        this.requestDeduplicator = new RequestDeduplicator(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context applicationContext2 = firebaseApp2.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(fcmLifecycleCallbacks);
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new FirebaseMessaging$$ExternalSyntheticLambda2(this));
        }
        executor2.execute(new FirebaseMessaging$$ExternalSyntheticLambda3(this));
        Task<TopicsSubscriber> createInstance = TopicsSubscriber.createInstance(this, metadata2, gmsRpc2, applicationContext, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = createInstance;
        createInstance.addOnSuccessListener(executor2, (OnSuccessListener<? super TopicsSubscriber>) new FirebaseMessaging$$ExternalSyntheticLambda4(this));
        executor2.execute(new FirebaseMessaging$$ExternalSyntheticLambda5(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$1$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m114lambda$new$1$comgooglefirebasemessagingFirebaseMessaging() {
        if (isAutoInitEnabled()) {
            startSyncIfNecessary();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$2$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m115lambda$new$2$comgooglefirebasemessagingFirebaseMessaging(TopicsSubscriber topicsSubscriber) {
        if (isAutoInitEnabled()) {
            topicsSubscriber.startTopicsSyncIfNecessary();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$3$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m116lambda$new$3$comgooglefirebasemessagingFirebaseMessaging() {
        ProxyNotificationInitializer.initialize(this.context);
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new FirebaseMessaging$$ExternalSyntheticLambda10(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getToken$4$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ void m113lambda$getToken$4$comgooglefirebasemessagingFirebaseMessaging(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(blockingGetToken());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    public static getTabAt getTransportFactory() {
        return transportFactory;
    }

    /* access modifiers changed from: package-private */
    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    /* access modifiers changed from: package-private */
    public Context getApplicationContext() {
        return this.context;
    }

    /* access modifiers changed from: package-private */
    public void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    /* access modifiers changed from: package-private */
    public void syncWithDelaySecondsInternal(long j) {
        synchronized (this) {
            enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(30, 2 * j), MAX_DELAY_SEC)), j);
            this.syncScheduledOrRunning = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            if (syncExecutor == null) {
                syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: private */
    public void startSyncIfNecessary() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    private void startSync() {
        synchronized (this) {
            if (!this.syncScheduledOrRunning) {
                syncWithDelaySecondsInternal(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Store.Token getTokenWithoutTriggeringSync() {
        return getStore(this.context).getToken(getSubtype(), Metadata.getDefaultSenderId(this.firebaseApp));
    }

    /* access modifiers changed from: package-private */
    public String blockingGetToken() throws IOException {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.iid;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        } else {
            Store.Token tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
            if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
                return tokenWithoutTriggeringSync.token;
            }
            String defaultSenderId = Metadata.getDefaultSenderId(this.firebaseApp);
            try {
                return (String) Tasks.await(this.requestDeduplicator.getOrStartGetTokenRequest(defaultSenderId, new FirebaseMessaging$$ExternalSyntheticLambda7(this, defaultSenderId, tokenWithoutTriggeringSync)));
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$blockingGetToken$10$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ Task m111lambda$blockingGetToken$10$comgooglefirebasemessagingFirebaseMessaging(String str, Store.Token token) {
        return this.gmsRpc.getToken().onSuccessTask(this.fileExecutor, new FirebaseMessaging$$ExternalSyntheticLambda1(this, str, token));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$blockingGetToken$9$com-google-firebase-messaging-FirebaseMessaging  reason: not valid java name */
    public /* synthetic */ Task m112lambda$blockingGetToken$9$comgooglefirebasemessagingFirebaseMessaging(String str, Store.Token token, String str2) throws Exception {
        getStore(this.context).saveToken(getSubtype(), str, str2, this.metadata.getAppVersionCode());
        if (token == null || !str2.equals(token.token)) {
            invokeOnTokenRefresh(str2);
        }
        return Tasks.forResult(str2);
    }

    private String getSubtype() {
        if ("[DEFAULT]".equals(this.firebaseApp.getName())) {
            return "";
        }
        return this.firebaseApp.getPersistenceKey();
    }

    /* access modifiers changed from: package-private */
    public boolean tokenNeedsRefresh(Store.Token token) {
        return token == null || token.needsRefresh(this.metadata.getAppVersionCode());
    }

    private void invokeOnTokenRefresh(String str) {
        if ("[DEFAULT]".equals(this.firebaseApp.getName())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                this.firebaseApp.getName();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.context).process(intent);
        }
    }

    class AutoInit {
        private Boolean autoInitEnabled;
        private EventHandler<DataCollectionDefaultChange> dataCollectionDefaultChangeEventHandler;
        private boolean initialized;
        private final Subscriber subscriber;

        AutoInit(Subscriber subscriber2) {
            this.subscriber = subscriber2;
        }

        /* access modifiers changed from: package-private */
        public void initialize() {
            synchronized (this) {
                if (!this.initialized) {
                    Boolean readEnabled = readEnabled();
                    this.autoInitEnabled = readEnabled;
                    if (readEnabled == null) {
                        FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0 firebaseMessaging$AutoInit$$ExternalSyntheticLambda0 = new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(this);
                        this.dataCollectionDefaultChangeEventHandler = firebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
                        this.subscriber.subscribe(DataCollectionDefaultChange.class, firebaseMessaging$AutoInit$$ExternalSyntheticLambda0);
                    }
                    this.initialized = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$initialize$0$com-google-firebase-messaging-FirebaseMessaging$AutoInit  reason: not valid java name */
        public /* synthetic */ void m117lambda$initialize$0$comgooglefirebasemessagingFirebaseMessaging$AutoInit(Event event) {
            if (isEnabled()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isEnabled() {
            boolean z;
            synchronized (this) {
                initialize();
                Boolean bool = this.autoInitEnabled;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = FirebaseMessaging.this.firebaseApp.isDataCollectionDefaultEnabled();
                }
            }
            return z;
        }

        private Boolean readEnabled() {
            ApplicationInfo applicationInfo;
            Context applicationContext = FirebaseMessaging.this.firebaseApp.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }
}
