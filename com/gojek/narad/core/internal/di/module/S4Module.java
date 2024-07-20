package com.gojek.narad.core.internal.di.module;

import kotlin.jvm.internal.Intrinsics;
import o.AnyRes;

public final class S4Module {
    static {
        new S4Module();
    }

    private S4Module() {
    }

    public static final boolean asBinder(AnyRes anyRes) {
        Intrinsics.checkNotNullParameter(anyRes, "");
        return anyRes.RemoteActionCompatParcelizer();
    }
}
