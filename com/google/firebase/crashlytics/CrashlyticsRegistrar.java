package com.google.firebase.crashlytics;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        FirebaseSessionsDependencies.INSTANCE.addDependency(SessionSubscriber.Name.CRASHLYTICS);
    }

    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseCrashlytics.class).name("fire-cls").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.deferred(CrashlyticsNativeComponent.class)).add(Dependency.deferred(AnalyticsConnector.class)).add(Dependency.deferred(FirebaseRemoteConfigInterop.class)).factory(new CrashlyticsRegistrar$$ExternalSyntheticLambda0(this)).eagerInDefaultApp().build(), LibraryVersionComponent.create("fire-cls", "18.6.0")});
    }

    /* access modifiers changed from: private */
    public FirebaseCrashlytics buildCrashlytics(ComponentContainer componentContainer) {
        return FirebaseCrashlytics.init((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), componentContainer.getDeferred(CrashlyticsNativeComponent.class), componentContainer.getDeferred(AnalyticsConnector.class), componentContainer.getDeferred(FirebaseRemoteConfigInterop.class));
    }
}
