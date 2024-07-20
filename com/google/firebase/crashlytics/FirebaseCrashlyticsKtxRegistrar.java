package com.google.firebase.crashlytics;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.Toolbar$Api33Impl$$ExternalSyntheticLambda0;

public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final List<Component<?>> getComponents() {
        return Toolbar$Api33Impl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer;
    }
}
