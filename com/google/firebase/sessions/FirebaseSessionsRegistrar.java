package com.google.firebase.sessions;

import android.content.Context;
import androidx.test.internal.runner.tracker.UsageTrackerRegistry;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.getTabAt;

public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    private static final Qualified<BiometricManager.Api30Impl> backgroundDispatcher = Qualified.qualified(Background.class, BiometricManager.Api30Impl.class);
    @Deprecated
    private static final Qualified<BiometricManager.Api30Impl> blockingDispatcher = Qualified.qualified(Blocking.class, BiometricManager.Api30Impl.class);
    @Deprecated
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.unqualified(FirebaseApp.class);
    @Deprecated
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.unqualified(FirebaseInstallationsApi.class);
    @Deprecated
    private static final Qualified<SessionFirelogPublisher> sessionFirelogPublisher = Qualified.unqualified(SessionFirelogPublisher.class);
    @Deprecated
    private static final Qualified<SessionGenerator> sessionGenerator = Qualified.unqualified(SessionGenerator.class);
    @Deprecated
    private static final Qualified<SessionsSettings> sessionsSettings = Qualified.unqualified(SessionsSettings.class);
    @Deprecated
    private static final Qualified<getTabAt> transportFactory = Qualified.unqualified(getTabAt.class);

    public final List<Component<? extends Object>> getComponents() {
        Component.Builder<FirebaseSessions> name = Component.builder(FirebaseSessions.class).name("fire-sessions");
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder<FirebaseSessions> add = name.add(Dependency.required((Qualified<?>) qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder<FirebaseSessions> add2 = add.add(Dependency.required((Qualified<?>) qualified2));
        Qualified<BiometricManager.Api30Impl> qualified3 = backgroundDispatcher;
        Component.Builder<SessionFirelogPublisher> add3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required((Qualified<?>) qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        Component[] componentArr = {add2.add(Dependency.required((Qualified<?>) qualified3)).factory(new FirebaseSessionsRegistrar$$ExternalSyntheticLambda0()).eagerInDefaultApp().build(), Component.builder(SessionGenerator.class).name("session-generator").factory(new FirebaseSessionsRegistrar$$ExternalSyntheticLambda1()).build(), add3.add(Dependency.required((Qualified<?>) qualified4)).add(Dependency.required((Qualified<?>) qualified2)).add(Dependency.requiredProvider((Qualified<?>) transportFactory)).add(Dependency.required((Qualified<?>) qualified3)).factory(new FirebaseSessionsRegistrar$$ExternalSyntheticLambda2()).build(), Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required((Qualified<?>) qualified)).add(Dependency.required((Qualified<?>) blockingDispatcher)).add(Dependency.required((Qualified<?>) qualified3)).add(Dependency.required((Qualified<?>) qualified4)).factory(new FirebaseSessionsRegistrar$$ExternalSyntheticLambda3()).build(), Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required((Qualified<?>) qualified)).add(Dependency.required((Qualified<?>) qualified3)).factory(new FirebaseSessionsRegistrar$$ExternalSyntheticLambda4()).build(), Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required((Qualified<?>) qualified)).factory(new FirebaseSessionsRegistrar$$ExternalSyntheticLambda5()).build(), LibraryVersionComponent.create("fire-sessions", UsageTrackerRegistry.AxtVersions.RUNNER_VERSION)};
        Intrinsics.checkNotNullParameter(componentArr, "");
        Intrinsics.checkNotNullParameter(componentArr, "");
        List<Component<? extends Object>> asList = Arrays.asList(componentArr);
        Intrinsics.checkNotNullExpressionValue(asList, "");
        return asList;
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0  reason: not valid java name */
    public static final FirebaseSessions m150getComponents$lambda0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        Object obj2 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (CoroutineContext) obj3);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1  reason: not valid java name */
    public static final SessionGenerator m151getComponents$lambda1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, (Function0) null, 2, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2  reason: not valid java name */
    public static final SessionFirelogPublisher m152getComponents$lambda2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        Object obj3 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj3, "");
        Provider<getTabAt> provider = componentContainer.getProvider(transportFactory);
        Intrinsics.checkNotNullExpressionValue(provider, "");
        Object obj4 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj4, "");
        return new SessionFirelogPublisherImpl((FirebaseApp) obj, (FirebaseInstallationsApi) obj2, (SessionsSettings) obj3, new EventGDTLogger(provider), (CoroutineContext) obj4);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3  reason: not valid java name */
    public static final SessionsSettings m153getComponents$lambda3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        Object obj2 = componentContainer.get(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj2, "");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj4, "");
        return new SessionsSettings((FirebaseApp) obj, (CoroutineContext) obj2, (CoroutineContext) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4  reason: not valid java name */
    public static final SessionDatastore m154getComponents$lambda4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        Object obj = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return new SessionDatastoreImpl(applicationContext, (CoroutineContext) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5  reason: not valid java name */
    public static final SessionLifecycleServiceBinder m155getComponents$lambda5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
