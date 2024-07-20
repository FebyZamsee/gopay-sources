package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.Preferences;
import o.TooltipCompatHandler;
import o.VectorEnabledTintResources;

final class SettingsCache$updateConfigValue$1<T> extends VectorEnabledTintResources {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsCache$updateConfigValue$1(SettingsCache settingsCache, TooltipCompatHandler<? super SettingsCache$updateConfigValue$1> tooltipCompatHandler) {
        super(tooltipCompatHandler);
        this.this$0 = settingsCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateConfigValue((Preferences.Key) null, null, this);
    }
}
