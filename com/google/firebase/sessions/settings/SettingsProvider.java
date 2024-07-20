package com.google.firebase.sessions.settings;

import kotlin.Unit;
import o.BiometricFragment;
import o.TooltipCompatHandler;

public interface SettingsProvider {
    Double getSamplingRate();

    Boolean getSessionEnabled();

    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    BiometricFragment.AnonymousClass6 m160getSessionRestartTimeoutFghU774();

    Object updateSettings(TooltipCompatHandler<? super Unit> tooltipCompatHandler);

    public static final class DefaultImpls {
        public static Object updateSettings(SettingsProvider settingsProvider, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
            return Unit.asInterface;
        }
    }
}
