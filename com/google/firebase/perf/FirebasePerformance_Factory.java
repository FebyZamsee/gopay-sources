package com.google.firebase.perf;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import o.getLogo;
import o.getTabAt;
import o.getType;

public final class FirebasePerformance_Factory implements getType<FirebasePerformance> {
    private final getLogo<ConfigResolver> configResolverProvider;
    private final getLogo<FirebaseApp> firebaseAppProvider;
    private final getLogo<FirebaseInstallationsApi> firebaseInstallationsApiProvider;
    private final getLogo<Provider<RemoteConfigComponent>> firebaseRemoteConfigProvider;
    private final getLogo<RemoteConfigManager> remoteConfigManagerProvider;
    private final getLogo<SessionManager> sessionManagerProvider;
    private final getLogo<Provider<getTabAt>> transportFactoryProvider;

    public FirebasePerformance_Factory(getLogo<FirebaseApp> getlogo, getLogo<Provider<RemoteConfigComponent>> getlogo2, getLogo<FirebaseInstallationsApi> getlogo3, getLogo<Provider<getTabAt>> getlogo4, getLogo<RemoteConfigManager> getlogo5, getLogo<ConfigResolver> getlogo6, getLogo<SessionManager> getlogo7) {
        this.firebaseAppProvider = getlogo;
        this.firebaseRemoteConfigProvider = getlogo2;
        this.firebaseInstallationsApiProvider = getlogo3;
        this.transportFactoryProvider = getlogo4;
        this.remoteConfigManagerProvider = getlogo5;
        this.configResolverProvider = getlogo6;
        this.sessionManagerProvider = getlogo7;
    }

    public final FirebasePerformance get() {
        return newInstance(this.firebaseAppProvider.get(), this.firebaseRemoteConfigProvider.get(), this.firebaseInstallationsApiProvider.get(), this.transportFactoryProvider.get(), this.remoteConfigManagerProvider.get(), this.configResolverProvider.get(), this.sessionManagerProvider.get());
    }

    public static FirebasePerformance_Factory create(getLogo<FirebaseApp> getlogo, getLogo<Provider<RemoteConfigComponent>> getlogo2, getLogo<FirebaseInstallationsApi> getlogo3, getLogo<Provider<getTabAt>> getlogo4, getLogo<RemoteConfigManager> getlogo5, getLogo<ConfigResolver> getlogo6, getLogo<SessionManager> getlogo7) {
        return new FirebasePerformance_Factory(getlogo, getlogo2, getlogo3, getlogo4, getlogo5, getlogo6, getlogo7);
    }

    public static FirebasePerformance newInstance(FirebaseApp firebaseApp, Provider<RemoteConfigComponent> provider, FirebaseInstallationsApi firebaseInstallationsApi, Provider<getTabAt> provider2, RemoteConfigManager remoteConfigManager, ConfigResolver configResolver, SessionManager sessionManager) {
        return new FirebasePerformance(firebaseApp, provider, firebaseInstallationsApi, provider2, remoteConfigManager, configResolver, sessionManager);
    }
}
