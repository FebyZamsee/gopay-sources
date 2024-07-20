package com.gojek.narad.core.internal.di.module;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import o.AnimatorRes;
import o.ColorLong;
import o.GuardedBy;
import o.HalfFloat;
import o.InspectableProperty;
import o.R;
import o.getTintList;
import o.to;

public final class CourierModule {
    static {
        new CourierModule();
    }

    private CourierModule() {
    }

    public static final GuardedBy read(Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "");
        return new GuardedBy(gson);
    }

    public static final HalfFloat RemoteActionCompatParcelizer(R.integer integer, GuardedBy guardedBy, getTintList gettintlist, InspectableProperty inspectableProperty, ColorLong colorLong, String str, boolean z) {
        Intrinsics.checkNotNullParameter(integer, "");
        Intrinsics.checkNotNullParameter(guardedBy, "");
        Intrinsics.checkNotNullParameter(gettintlist, "");
        Intrinsics.checkNotNullParameter(inspectableProperty, "");
        Intrinsics.checkNotNullParameter(colorLong, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new to(integer, guardedBy, gettintlist, inspectableProperty, str, colorLong, z);
    }

    public static final InspectableProperty read(AnimatorRes animatorRes) {
        Intrinsics.checkNotNullParameter(animatorRes, "");
        return (InspectableProperty) animatorRes.onTransact(InspectableProperty.class);
    }

    public static final String asBinder(AnimatorRes animatorRes) {
        Intrinsics.checkNotNullParameter(animatorRes, "");
        return animatorRes.asBinder();
    }

    public static final boolean RemoteActionCompatParcelizer(AnimatorRes animatorRes) {
        Intrinsics.checkNotNullParameter(animatorRes, "");
        return animatorRes.RemoteActionCompatParcelizer();
    }
}
