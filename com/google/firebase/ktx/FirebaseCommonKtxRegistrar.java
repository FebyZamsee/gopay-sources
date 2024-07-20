package com.google.firebase.ktx;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;

public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    public final List<Component<?>> getComponents() {
        Component<BiometricManager.Api30Impl> build = Component.builder(Qualified.qualified(Background.class, BiometricManager.Api30Impl.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build, "");
        Component<BiometricManager.Api30Impl> build2 = Component.builder(Qualified.qualified(Lightweight.class, BiometricManager.Api30Impl.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build2, "");
        Component<BiometricManager.Api30Impl> build3 = Component.builder(Qualified.qualified(Blocking.class, BiometricManager.Api30Impl.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build3, "");
        Component<BiometricManager.Api30Impl> build4 = Component.builder(Qualified.qualified(UiThread.class, BiometricManager.Api30Impl.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4.INSTANCE).build();
        Intrinsics.checkNotNullExpressionValue(build4, "");
        Component[] componentArr = {build, build2, build3, build4};
        Intrinsics.checkNotNullParameter(componentArr, "");
        Intrinsics.checkNotNullParameter(componentArr, "");
        List<Component<?>> asList = Arrays.asList(componentArr);
        Intrinsics.checkNotNullExpressionValue(asList, "");
        return asList;
    }
}
