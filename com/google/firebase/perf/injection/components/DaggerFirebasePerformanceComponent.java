package com.google.firebase.perf.injection.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.FirebasePerformance_Factory;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesConfigResolverFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseAppFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesSessionManagerFactory;
import com.google.firebase.perf.injection.modules.FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import o.getLogo;
import o.getResourceId;
import o.getTabAt;
import o.read;

public final class DaggerFirebasePerformanceComponent implements FirebasePerformanceComponent {
    private getLogo<FirebasePerformance> firebasePerformanceProvider;
    private getLogo<ConfigResolver> providesConfigResolverProvider;
    private getLogo<FirebaseApp> providesFirebaseAppProvider;
    private getLogo<FirebaseInstallationsApi> providesFirebaseInstallationsProvider;
    private getLogo<Provider<RemoteConfigComponent>> providesRemoteConfigComponentProvider;
    private getLogo<RemoteConfigManager> providesRemoteConfigManagerProvider;
    private getLogo<SessionManager> providesSessionManagerProvider;
    private getLogo<Provider<getTabAt>> providesTransportFactoryProvider;

    private DaggerFirebasePerformanceComponent(FirebasePerformanceModule firebasePerformanceModule) {
        initialize(firebasePerformanceModule);
    }

    public static Builder builder() {
        return new Builder();
    }

    private void initialize(FirebasePerformanceModule firebasePerformanceModule) {
        this.providesFirebaseAppProvider = FirebasePerformanceModule_ProvidesFirebaseAppFactory.create(firebasePerformanceModule);
        this.providesRemoteConfigComponentProvider = FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory.create(firebasePerformanceModule);
        this.providesFirebaseInstallationsProvider = FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory.create(firebasePerformanceModule);
        this.providesTransportFactoryProvider = FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory.create(firebasePerformanceModule);
        this.providesRemoteConfigManagerProvider = FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory.create(firebasePerformanceModule);
        this.providesConfigResolverProvider = FirebasePerformanceModule_ProvidesConfigResolverFactory.create(firebasePerformanceModule);
        FirebasePerformanceModule_ProvidesSessionManagerFactory create = FirebasePerformanceModule_ProvidesSessionManagerFactory.create(firebasePerformanceModule);
        this.providesSessionManagerProvider = create;
        this.firebasePerformanceProvider = getResourceId.RemoteActionCompatParcelizer(FirebasePerformance_Factory.create(this.providesFirebaseAppProvider, this.providesRemoteConfigComponentProvider, this.providesFirebaseInstallationsProvider, this.providesTransportFactoryProvider, this.providesRemoteConfigManagerProvider, this.providesConfigResolverProvider, create));
    }

    public final FirebasePerformance getFirebasePerformance() {
        return this.firebasePerformanceProvider.get();
    }

    public static final class Builder {
        private FirebasePerformanceModule firebasePerformanceModule;

        private Builder() {
        }

        public final Builder firebasePerformanceModule(FirebasePerformanceModule firebasePerformanceModule2) {
            this.firebasePerformanceModule = firebasePerformanceModule2;
            return this;
        }

        public final FirebasePerformanceComponent build() {
            read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.firebasePerformanceModule, FirebasePerformanceModule.class);
            return new DaggerFirebasePerformanceComponent(this.firebasePerformanceModule);
        }
    }
}
