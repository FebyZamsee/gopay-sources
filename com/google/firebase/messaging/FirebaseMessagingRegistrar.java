package com.google.firebase.messaging;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.util.Arrays;
import java.util.List;
import o.getTabAt;

public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseMessaging.class).name("fire-fcm").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optional(FirebaseInstanceIdInternal.class)).add(Dependency.optionalProvider(UserAgentPublisher.class)).add(Dependency.optionalProvider(HeartBeatInfo.class)).add(Dependency.optional(getTabAt.class)).add(Dependency.required((Class<?>) FirebaseInstallationsApi.class)).add(Dependency.required((Class<?>) Subscriber.class)).factory(new FirebaseMessagingRegistrar$$ExternalSyntheticLambda0()).alwaysEager().build(), LibraryVersionComponent.create("fire-fcm", "23.3.1")});
    }

    static /* synthetic */ FirebaseMessaging lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseMessaging((FirebaseApp) componentContainer.get(FirebaseApp.class), (FirebaseInstanceIdInternal) componentContainer.get(FirebaseInstanceIdInternal.class), componentContainer.getProvider(UserAgentPublisher.class), componentContainer.getProvider(HeartBeatInfo.class), (FirebaseInstallationsApi) componentContainer.get(FirebaseInstallationsApi.class), (getTabAt) componentContainer.get(getTabAt.class), (Subscriber) componentContainer.get(Subscriber.class));
    }
}
