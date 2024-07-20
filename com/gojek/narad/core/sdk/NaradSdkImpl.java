package com.gojek.narad.core.sdk;

import android.content.Context;
import com.gojek.narad.core.internal.statetracker.AppStateTracker;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.AnimRes;
import o.AnimatorRes;
import o.AnyRes;
import o.BiometricManager;
import o.CheckResult;
import o.ContentView;
import o.Dimension;
import o.IdRes;
import o.InspectableProperty;
import o.R;
import o.RemoteActionCompatParcelizer;
import o.ReplaceWith;
import o.TooltipCompatHandler;
import o.fromInclusive;
import o.getCurrentContentInsetLeft;
import o.message;
import o.parameter;
import o.setState;
import o.target;
import o.valueOf;

public final class NaradSdkImpl implements R.string {
    public static final asBinder asInterface = new asBinder((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static volatile NaradSdkImpl read;
    private setState RemoteActionCompatParcelizer;
    @getCurrentContentInsetLeft
    public AppStateTracker appStateTracker;
    public InspectableProperty.ValueType asBinder;
    @getCurrentContentInsetLeft
    public parameter featureHandler;
    @getCurrentContentInsetLeft
    public target logger;
    @getCurrentContentInsetLeft
    public ContentView naradHealthMetricsHandler;
    @getCurrentContentInsetLeft
    public Dimension.Companion notificationCache;
    @getCurrentContentInsetLeft
    public ReplaceWith notificationRenderingHandler;
    @getCurrentContentInsetLeft
    public fromInclusive notificationSourceManager;
    @getCurrentContentInsetLeft
    public IdRes proxyFcmMessageReceiver;
    @getCurrentContentInsetLeft
    public message sdkAnalyticsHandler;

    public NaradSdkImpl(Context context, CheckResult checkResult, ActivityResultContracts.TakeVideo takeVideo, AnimatorRes animatorRes, AnyRes anyRes, ActivityResultContracts.TakePicturePreview takePicturePreview) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(checkResult, "");
        Intrinsics.checkNotNullParameter(takeVideo, "");
        Intrinsics.checkNotNullParameter(animatorRes, "");
        Intrinsics.checkNotNullParameter(anyRes, "");
        Intrinsics.checkNotNullParameter(takePicturePreview, "");
        this.asBinder = new valueOf.asInterface((byte) 0).asBinder(context, checkResult, takeVideo, animatorRes, anyRes, takePicturePreview);
        read = this;
        this.asBinder.asInterface(this);
        if (this.logger == null) {
            Intrinsics.asBinder("");
        }
        target.RemoteActionCompatParcelizer("SDK initialised");
        AppStateTracker appStateTracker2 = this.appStateTracker;
        if (appStateTracker2 == null) {
            Intrinsics.asBinder("");
            appStateTracker2 = null;
        }
        AppStateTracker.asBinder(new AppStateTracker.asInterface(appStateTracker2));
        ReplaceWith replaceWith = this.notificationRenderingHandler;
        if (replaceWith == null) {
            Intrinsics.asBinder("");
            replaceWith = null;
        }
        RemoteActionCompatParcelizer.onTransact.asInterface(replaceWith.onTransact.onTransact, replaceWith.read.asInterface(), (BiometricManager.DefaultInjector) null, new ReplaceWith.read(replaceWith, this.RemoteActionCompatParcelizer, (TooltipCompatHandler<? super ReplaceWith.read>) null), 2);
    }

    public static final class asBinder {
        public /* synthetic */ asBinder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private asBinder() {
        }
    }

    public final boolean onTransact(String str, AnimRes animRes) {
        Intrinsics.checkNotNullParameter(animRes, "");
        parameter parameter = this.featureHandler;
        if (parameter == null) {
            Intrinsics.asBinder("");
            parameter = null;
        }
        return parameter.read(str, animRes);
    }
}
