package com.google.firebase.sessions.settings;

import android.net.Uri;
import androidx.webkit.ProxyConfig;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import org.json.JSONObject;

public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ApplicationInfo appInfo;
    private final String baseUrl;
    private final CoroutineContext blockingDispatcher;

    public RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str) {
        Intrinsics.checkNotNullParameter(applicationInfo, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.appInfo = applicationInfo;
        this.blockingDispatcher = coroutineContext;
        this.baseUrl = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationInfo, coroutineContext, (i & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }

    public final Object doConfigFetch(Map<String, String> map, Function2<? super JSONObject, ? super TooltipCompatHandler<? super Unit>, ? extends Object> function2, Function2<? super String, ? super TooltipCompatHandler<? super Unit>, ? extends Object> function22, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        Object RemoteActionCompatParcelizer = RemoteActionCompatParcelizer.onTransact.RemoteActionCompatParcelizer(this.blockingDispatcher, new RemoteSettingsFetcher$doConfigFetch$2(this, map, function2, function22, (TooltipCompatHandler<? super RemoteSettingsFetcher$doConfigFetch$2>) null), tooltipCompatHandler);
        return RemoteActionCompatParcelizer == TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED ? RemoteActionCompatParcelizer : Unit.asInterface;
    }

    /* access modifiers changed from: private */
    public final URL settingsUrl() {
        return new URL(new Uri.Builder().scheme(ProxyConfig.MATCH_HTTPS).authority(this.baseUrl).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.appInfo.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.appInfo.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.appInfo.getAndroidAppInfo().getVersionName()).build().toString());
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
