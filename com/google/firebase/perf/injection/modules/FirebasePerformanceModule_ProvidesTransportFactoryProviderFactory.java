package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import o.getTabAt;
import o.getType;

public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory implements getType<Provider<getTabAt>> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final Provider<getTabAt> get() {
        return providesTransportFactoryProvider(this.module);
    }

    public static FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(firebasePerformanceModule);
    }

    public static Provider<getTabAt> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        Provider<getTabAt> providesTransportFactoryProvider = firebasePerformanceModule.providesTransportFactoryProvider();
        if (providesTransportFactoryProvider != null) {
            return providesTransportFactoryProvider;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
