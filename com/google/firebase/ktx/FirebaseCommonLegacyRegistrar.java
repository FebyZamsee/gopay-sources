package com.google.firebase.ktx;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    public final List<Component<?>> getComponents() {
        List<Component<?>> singletonList = Collections.singletonList(LibraryVersionComponent.create("fire-core-ktx", "20.4.2"));
        Intrinsics.checkNotNullExpressionValue(singletonList, "");
        return singletonList;
    }
}
