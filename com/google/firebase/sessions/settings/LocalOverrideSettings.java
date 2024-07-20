package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SettingsProvider;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricFragment;
import o.TooltipCompatHandler;
import o.setOnBackInvokedDispatcher;

public final class LocalOverrideSettings implements SettingsProvider {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Bundle metadata;

    public LocalOverrideSettings(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.metadata = bundle == null ? Bundle.EMPTY : bundle;
    }

    public final Object updateSettings(TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return SettingsProvider.DefaultImpls.updateSettings(this, tooltipCompatHandler);
    }

    public final Boolean getSessionEnabled() {
        if (this.metadata.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.metadata.getBoolean("firebase_sessions_enabled"));
        }
        Boolean bool = null;
        return null;
    }

    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    public final BiometricFragment.AnonymousClass6 m156getSessionRestartTimeoutFghU774() {
        if (this.metadata.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return BiometricFragment.AnonymousClass6.read(setOnBackInvokedDispatcher.onTransact(this.metadata.getInt("firebase_sessions_sessions_restart_timeout"), BiometricFragment.AnonymousClass8.SECONDS));
        }
        BiometricFragment.AnonymousClass6 r0 = null;
        return null;
    }

    public final Double getSamplingRate() {
        if (this.metadata.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.metadata.getDouble("firebase_sessions_sampling_rate"));
        }
        Double d = null;
        return null;
    }

    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
