package com.gojek.narad.core.internal.di.module;

import dagger.Lazy;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.AnimatorRes;
import o.AnyRes;
import o.ContentView;
import o.DoNotInline;
import o.EmptySuper;
import o.ExpandedMenuView;
import o.GravityInt;
import o.R;
import o.Toolbar;
import o.WorkerThread;
import o.dispatchRestoreInstanceState;
import o.fromInclusive;
import o.getTintList;
import o.hasAttributeId;
import o.message;
import o.target;
import o.toInclusive;

public final class PushNotificationsSourceModule {
    static {
        new PushNotificationsSourceModule();
    }

    private PushNotificationsSourceModule() {
    }

    public static final DoNotInline onTransact(dispatchRestoreInstanceState.onTransact ontransact, dispatchRestoreInstanceState.read read, dispatchRestoreInstanceState dispatchrestoreinstancestate, WorkerThread workerThread, R.integer integer, getTintList gettintlist, message message, target target) {
        Intrinsics.checkNotNullParameter(ontransact, "");
        Intrinsics.checkNotNullParameter(read, "");
        Intrinsics.checkNotNullParameter(dispatchrestoreinstancestate, "");
        Intrinsics.checkNotNullParameter(workerThread, "");
        Intrinsics.checkNotNullParameter(integer, "");
        Intrinsics.checkNotNullParameter(gettintlist, "");
        message message2 = message;
        Intrinsics.checkNotNullParameter(message2, "");
        target target2 = target;
        Intrinsics.checkNotNullParameter(target2, "");
        return new EmptySuper(ontransact, read, dispatchrestoreinstancestate, workerThread, integer, gettintlist, message2, target2);
    }

    public static final fromInclusive onTransact(AnimatorRes animatorRes, AnyRes anyRes, Lazy<toInclusive> lazy, Lazy<toInclusive> lazy2, Lazy<toInclusive> lazy3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(animatorRes, "");
        Intrinsics.checkNotNullParameter(anyRes, "");
        Intrinsics.checkNotNullParameter(lazy, "");
        Intrinsics.checkNotNullParameter(lazy2, "");
        Intrinsics.checkNotNullParameter(lazy3, "");
        List asBinder = Toolbar.ExpandedActionViewMenuPresenter.asBinder(lazy.get());
        if (z && !(animatorRes instanceof GravityInt)) {
            asBinder.add(lazy2.get());
        }
        if (z2 && !(anyRes instanceof hasAttributeId)) {
            asBinder.add(lazy3.get());
        }
        return new fromInclusive(asBinder);
    }

    public static final ExpandedMenuView.onTransact onTransact(R.layout layout, ContentView contentView) {
        Intrinsics.checkNotNullParameter(layout, "");
        Intrinsics.checkNotNullParameter(contentView, "");
        return new ExpandedMenuView.onTransact(layout, contentView);
    }
}
