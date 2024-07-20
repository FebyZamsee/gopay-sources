package com.gojek.narad.core.internal.statetracker;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.RequiresPermission;
import o.allOf;
import o.backward;
import o.dispatchRestoreInstanceState;
import o.getMinHeight;

public final class AppStateTracker implements LifecycleObserver {
    public final Set<RequiresPermission.Write> onTransact = new LinkedHashSet();
    public allOf read = allOf.Background;

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onAppForeground() {
        asInterface(true);
        for (RequiresPermission.Write RemoteActionCompatParcelizer : this.onTransact) {
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onAppBackground() {
        asInterface(false);
        for (RequiresPermission.Write asBinder : this.onTransact) {
            asBinder.asBinder();
        }
    }

    public static void asBinder(Function0<Unit> function0) {
        try {
            if (Intrinsics.RemoteActionCompatParcelizer(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                function0.invoke();
            } else {
                new Handler(Looper.getMainLooper()).post(new dispatchRestoreInstanceState.write(function0));
            }
        } catch (Exception unused) {
        }
    }

    public static final class asInterface extends backward implements Function0<Unit> {
        private /* synthetic */ AppStateTracker RemoteActionCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public asInterface(AppStateTracker appStateTracker) {
            super(0);
            this.RemoteActionCompatParcelizer = appStateTracker;
        }

        public final /* synthetic */ Object invoke() {
            ProcessLifecycleOwner.get().getLifecycle().addObserver(this.RemoteActionCompatParcelizer);
            return Unit.asInterface;
        }
    }

    public static final class read extends backward implements Function0<Unit> {
        private /* synthetic */ AppStateTracker read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(AppStateTracker appStateTracker) {
            super(0);
            this.read = appStateTracker;
        }

        public final /* synthetic */ Object invoke() {
            ProcessLifecycleOwner.get().getLifecycle().removeObserver(this.read);
            return Unit.asInterface;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }

    private final void asInterface(boolean z) {
        allOf allof;
        if (z) {
            allof = allOf.Foreground;
        } else {
            allof = allOf.Background;
        }
        this.read = allof;
        getMinHeight.RemoteActionCompatParcelizer onTransact2 = getMinHeight.onTransact("YYYY");
        StringBuilder sb = new StringBuilder("App State - ");
        sb.append(this.read.read);
        onTransact2.onTransact(sb.toString(), new Object[0]);
    }
}
