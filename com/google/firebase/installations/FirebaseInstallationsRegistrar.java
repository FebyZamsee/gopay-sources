package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseInstallationsApi.class).name("fire-installations").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optionalProvider(HeartBeatController.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, ExecutorService.class))).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new FirebaseInstallationsRegistrar$$ExternalSyntheticLambda0()).build(), HeartBeatConsumerComponent.create(), LibraryVersionComponent.create("fire-installations", "17.2.0")});
    }

    static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(HeartBeatController.class), (ExecutorService) componentContainer.get(Qualified.qualified(Background.class, ExecutorService.class)), FirebaseExecutors.newSequentialExecutor((Executor) componentContainer.get(Qualified.qualified(Blocking.class, Executor.class))));
    }
}