package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.injection.components.DaggerFirebasePerformanceComponent;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import o.getTabAt;

public class FirebasePerfRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        Qualified<Executor> qualified = Qualified.qualified(UiThread.class, Executor.class);
        return Arrays.asList(new Component[]{Component.builder(FirebasePerformance.class).name("fire-perf").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.requiredProvider((Class<?>) RemoteConfigComponent.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.requiredProvider((Class<?>) getTabAt.class)).add(Dependency.required((Class<?>) FirebasePerfEarly.class)).factory(new FirebasePerfRegistrar$$ExternalSyntheticLambda0()).build(), Component.builder(FirebasePerfEarly.class).name("fire-perf-early").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optionalProvider(StartupTime.class)).add(Dependency.required((Qualified<?>) qualified)).eagerInDefaultApp().factory(new FirebasePerfRegistrar$$ExternalSyntheticLambda1(qualified)).build(), LibraryVersionComponent.create("fire-perf", "20.5.1")});
    }

    static /* synthetic */ FirebasePerfEarly lambda$getComponents$0(Qualified qualified, ComponentContainer componentContainer) {
        return new FirebasePerfEarly((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(StartupTime.class).get(), (Executor) componentContainer.get(qualified));
    }

    /* access modifiers changed from: private */
    public static FirebasePerformance providesFirebasePerformance(ComponentContainer componentContainer) {
        componentContainer.get(FirebasePerfEarly.class);
        return DaggerFirebasePerformanceComponent.builder().firebasePerformanceModule(new FirebasePerformanceModule((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), componentContainer.getProvider(RemoteConfigComponent.class), componentContainer.getProvider(getTabAt.class))).build().getFirebasePerformance();
    }
}
