package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.upstream.cache.Cache;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.updateNavigationIcon;

public final class CacheDataSink implements ActivityResultContracts.StartIntentSenderForResult.Companion {
    private final String RemoteActionCompatParcelizer;
    private final String asBinder;
    private final String onTransact;
    private final String read;

    public static final class CacheDataSinkException extends Cache.CacheException {
    }

    public final String asBinder() {
        return "Notification Payload Parse Error";
    }

    public CacheDataSink(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.onTransact = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.asBinder = str4;
    }

    public final Map<String, Object> asInterface() {
        return updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("payload", this.onTransact), new Pair(Constants.EXCEPTION, this.read), new Pair("errorClass", this.RemoteActionCompatParcelizer), new Pair("errorFunction", this.asBinder)});
    }
}
