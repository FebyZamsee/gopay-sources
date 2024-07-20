package com.google.firebase;

import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.setOnBackInvokedDispatcher;

public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3<T> implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3<T> INSTANCE = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3<>();

    public final BiometricManager.Api30Impl create(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return setOnBackInvokedDispatcher.onTransact((Executor) obj);
    }
}
