package com.google.firebase;

import kotlin.jvm.internal.Intrinsics;

public final class FirebaseKt {
    public static final FirebaseApp getApp(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "");
        FirebaseApp instance = FirebaseApp.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "");
        return instance;
    }
}
