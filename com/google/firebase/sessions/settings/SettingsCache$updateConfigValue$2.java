package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.setContentInsetsAbsolute;

final class SettingsCache$updateConfigValue$2 extends getLayoutResource implements Function2<MutablePreferences, TooltipCompatHandler<? super Unit>, Object> {
    final /* synthetic */ Preferences.Key<T> $key;
    final /* synthetic */ T $value;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsCache$updateConfigValue$2(T t, Preferences.Key<T> key, SettingsCache settingsCache, TooltipCompatHandler<? super SettingsCache$updateConfigValue$2> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
        this.$value = t;
        this.$key = key;
        this.this$0 = settingsCache;
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        SettingsCache$updateConfigValue$2 settingsCache$updateConfigValue$2 = new SettingsCache$updateConfigValue$2(this.$value, this.$key, this.this$0, tooltipCompatHandler);
        settingsCache$updateConfigValue$2.L$0 = obj;
        return settingsCache$updateConfigValue$2;
    }

    public final Object invoke(MutablePreferences mutablePreferences, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((SettingsCache$updateConfigValue$2) create(mutablePreferences, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    public final Object invokeSuspend(Object obj) {
        TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            T t = this.$value;
            if (t != null) {
                mutablePreferences.set(this.$key, t);
            } else {
                mutablePreferences.remove(this.$key);
            }
            this.this$0.updateSessionConfigs(mutablePreferences);
            return Unit.asInterface;
        } else {
            throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
        }
    }
}
