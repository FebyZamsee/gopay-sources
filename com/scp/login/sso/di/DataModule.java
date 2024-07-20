package com.scp.login.sso.di;

import android.content.Context;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import o.getContentPaddingLeft;
import o.getPreventCornerOverlap;
import o.getThumbDrawable;
import o.getThumbTintList;
import o.getThumbTintMode;
import o.getTrackDrawable;
import o.getTrackTintList;
import o.getTrackTintMode;
import o.getUseCompatPadding;
import o.onCreateDrawableState;
import o.onEmojiCompatInitializedForSwitchText;
import o.onPopulateAccessibilityEvent;
import o.positionSelectorLikeTouchCompat;
import o.setShowText;
import o.setSwitchPadding;
import o.setSwitchTextAppearance;
import o.setSwitchTypeface;
import o.setTextOn;
import o.touchModeDrawsInPressedStateCompat;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

public final class DataModule {
    private final Context asBinder;

    public DataModule(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.asBinder = context;
    }

    public final onEmojiCompatInitializedForSwitchText asInterface() {
        return new getThumbTintList(this.asBinder);
    }

    public final onCreateDrawableState read(onEmojiCompatInitializedForSwitchText onemojicompatinitializedforswitchtext) {
        Intrinsics.checkNotNullParameter(onemojicompatinitializedforswitchtext, "");
        return new getTrackTintMode(onemojicompatinitializedforswitchtext);
    }

    public final getTrackTintList asBinder() {
        return new getTrackDrawable();
    }

    public final setSwitchPadding RemoteActionCompatParcelizer() {
        return new onPopulateAccessibilityEvent(this.asBinder);
    }

    public final setSwitchTextAppearance onTransact(setSwitchPadding setswitchpadding) {
        Intrinsics.checkNotNullParameter(setswitchpadding, "");
        setSwitchTypeface setswitchtypeface = setSwitchTypeface.asBinder;
        Intrinsics.checkNotNullParameter(setswitchpadding, "");
        setSwitchTypeface.read = setswitchpadding;
        OkHttpClient build = new OkHttpClient.Builder().addInterceptor((Interceptor) setSwitchTypeface.asInterface.getValue()).connectTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS).build();
        touchModeDrawsInPressedStateCompat touchmodedrawsinpressedstatecompat = new touchModeDrawsInPressedStateCompat();
        touchmodedrawsinpressedstatecompat.RemoteActionCompatParcelizer = true;
        touchmodedrawsinpressedstatecompat.asBinder = positionSelectorLikeTouchCompat.asBinder;
        Gson onTransact = touchmodedrawsinpressedstatecompat.onTransact();
        Intrinsics.checkNotNullExpressionValue(onTransact, "");
        getContentPaddingLeft.read read = new getContentPaddingLeft.read();
        read.onTransact = (Call.Factory) getUseCompatPadding.onTransact((Call.Factory) getUseCompatPadding.onTransact(build, "client == null"), "factory == null");
        read.RemoteActionCompatParcelizer.add(getUseCompatPadding.onTransact(new getPreventCornerOverlap(onTransact), "factory == null"));
        getUseCompatPadding.onTransact("https://accounts-integration.goto-products.com/", "baseUrl == null");
        getContentPaddingLeft onTransact2 = read.read(HttpUrl.get("https://accounts-integration.goto-products.com/")).onTransact();
        Intrinsics.checkNotNullExpressionValue(onTransact2, "");
        Object RemoteActionCompatParcelizer = onTransact2.RemoteActionCompatParcelizer(setSwitchTextAppearance.class);
        Intrinsics.checkNotNullExpressionValue(RemoteActionCompatParcelizer, "");
        return (setSwitchTextAppearance) RemoteActionCompatParcelizer;
    }

    public final setTextOn asInterface(setSwitchTextAppearance setswitchtextappearance, setSwitchPadding setswitchpadding) {
        Intrinsics.checkNotNullParameter(setswitchtextappearance, "");
        Intrinsics.checkNotNullParameter(setswitchpadding, "");
        return new setShowText(setswitchtextappearance, setswitchpadding);
    }

    public final getThumbTintMode asBinder(onCreateDrawableState oncreatedrawablestate, setTextOn settexton, getTrackTintList gettracktintlist) {
        Intrinsics.checkNotNullParameter(oncreatedrawablestate, "");
        Intrinsics.checkNotNullParameter(settexton, "");
        Intrinsics.checkNotNullParameter(gettracktintlist, "");
        return new getThumbDrawable(settexton, oncreatedrawablestate, gettracktintlist);
    }
}
