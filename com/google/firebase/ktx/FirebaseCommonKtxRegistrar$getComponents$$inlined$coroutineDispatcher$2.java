package com.google.firebase.ktx;

import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.setOnBackInvokedDispatcher;

public final class FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<T> implements ComponentFactory {
    public static final FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<T> INSTANCE = new FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2<>();

    public final BiometricManager.Api30Impl create(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
        Intrinsics.checkNotNullExpressionValue(obj, "");
        return setOnBackInvokedDispatcher.onTransact((Executor) obj);
    }
}
