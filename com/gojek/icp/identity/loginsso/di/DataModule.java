package com.gojek.icp.identity.loginsso.di;

import android.content.Context;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import o.OnBackPressedDispatcher;
import o.OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0;
import o.OnBackPressedDispatcherKt;
import o.OnBackPressedDispatcherOwner;
import o.R;
import o.ViewTreeFullyDrawnReporterOwner;
import o.createOnBackInvokedCallback$lambda$0;
import o.getContentPaddingLeft;
import o.getDividerDrawable;
import o.getPreventCornerOverlap;
import o.getUseCompatPadding;
import o.positionSelectorLikeTouchCompat;
import o.registerOnBackInvokedCallback;
import o.setScrollIndicators;
import o.touchModeDrawsInPressedStateCompat;
import o.updateMenuView;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public final class DataModule {
    private final Context RemoteActionCompatParcelizer;

    public DataModule(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.RemoteActionCompatParcelizer = context;
    }

    public final OnBackPressedDispatcherKt read() {
        return new OnBackPressedDispatcher$Api33Impl$$ExternalSyntheticLambda0(this.RemoteActionCompatParcelizer);
    }

    public final updateMenuView.asBinder read(OnBackPressedDispatcherKt onBackPressedDispatcherKt) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherKt, "");
        return new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(onBackPressedDispatcherKt);
    }

    public final getDividerDrawable.RemoteActionCompatParcelizer.asInterface onTransact() {
        return new setScrollIndicators.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final OnBackPressedDispatcherOwner asBinder(getDividerDrawable.RemoteActionCompatParcelizer.asInterface asinterface) {
        Intrinsics.checkNotNullParameter(asinterface, "");
        R r = R.RemoteActionCompatParcelizer;
        Intrinsics.checkNotNullParameter(asinterface, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        R.read = asinterface;
        OkHttpClient build = new OkHttpClient.Builder().addInterceptor((Interceptor) R.onTransact.getValue()).connectTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS).build();
        touchModeDrawsInPressedStateCompat touchmodedrawsinpressedstatecompat = new touchModeDrawsInPressedStateCompat();
        touchmodedrawsinpressedstatecompat.RemoteActionCompatParcelizer = true;
        touchmodedrawsinpressedstatecompat.asBinder = positionSelectorLikeTouchCompat.asBinder;
        Gson onTransact = touchmodedrawsinpressedstatecompat.onTransact();
        Intrinsics.checkNotNullExpressionValue(onTransact, "");
        getContentPaddingLeft.read read = new getContentPaddingLeft.read();
        read.onTransact = (Call.Factory) getUseCompatPadding.onTransact((Call.Factory) getUseCompatPadding.onTransact(build, "client == null"), "factory == null");
        read.RemoteActionCompatParcelizer.add(getUseCompatPadding.onTransact(new getPreventCornerOverlap(onTransact), "factory == null"));
        getUseCompatPadding.onTransact("https://integration-api.gojekapi.com/", "baseUrl == null");
        getContentPaddingLeft onTransact2 = read.read(HttpUrl.get("https://integration-api.gojekapi.com/")).onTransact();
        Intrinsics.checkNotNullExpressionValue(onTransact2, "");
        Object RemoteActionCompatParcelizer2 = onTransact2.RemoteActionCompatParcelizer(OnBackPressedDispatcherOwner.class);
        Intrinsics.checkNotNullExpressionValue(RemoteActionCompatParcelizer2, "");
        return (OnBackPressedDispatcherOwner) RemoteActionCompatParcelizer2;
    }

    public final BottomAppBar.RemoteActionCompatParcelizer asInterface(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner, getDividerDrawable.RemoteActionCompatParcelizer.asInterface asinterface) {
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "");
        Intrinsics.checkNotNullParameter(asinterface, "");
        return new ViewTreeFullyDrawnReporterOwner(onBackPressedDispatcherOwner, asinterface);
    }

    public final createOnBackInvokedCallback$lambda$0 asBinder(updateMenuView.asBinder asbinder, BottomAppBar.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Intrinsics.checkNotNullParameter(asbinder, "");
        Intrinsics.checkNotNullParameter(remoteActionCompatParcelizer, "");
        return new registerOnBackInvokedCallback(remoteActionCompatParcelizer, asbinder);
    }
}
