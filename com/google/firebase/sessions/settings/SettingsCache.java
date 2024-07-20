package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.setContentInsetsAbsolute;
import o.setPendingHandler;

public final class SettingsCache {
    @Deprecated
    private static final Preferences.Key<Integer> CACHE_DURATION_SECONDS = PreferencesKeys.intKey("firebase_sessions_cache_duration");
    @Deprecated
    private static final Preferences.Key<Long> CACHE_UPDATED_TIME = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    @Deprecated
    private static final Preferences.Key<Integer> RESTART_TIMEOUT_SECONDS = PreferencesKeys.intKey("firebase_sessions_restart_timeout");
    @Deprecated
    private static final Preferences.Key<Double> SAMPLING_RATE = PreferencesKeys.doubleKey("firebase_sessions_sampling_rate");
    @Deprecated
    private static final Preferences.Key<Boolean> SESSIONS_ENABLED = PreferencesKeys.booleanKey("firebase_sessions_enabled");
    /* access modifiers changed from: private */
    public final DataStore<Preferences> dataStore;
    private SessionConfigs sessionConfigs;

    public SettingsCache(DataStore<Preferences> dataStore2) {
        Intrinsics.checkNotNullParameter(dataStore2, "");
        this.dataStore = dataStore2;
        Object unused = RemoteActionCompatParcelizer.onTransact.onTransact((CoroutineContext) setPendingHandler.read, new AnonymousClass1(this, (TooltipCompatHandler<? super AnonymousClass1>) null));
    }

    /* access modifiers changed from: private */
    public final void updateSessionConfigs(Preferences preferences) {
        this.sessionConfigs = new SessionConfigs((Boolean) preferences.get(SESSIONS_ENABLED), (Double) preferences.get(SAMPLING_RATE), (Integer) preferences.get(RESTART_TIMEOUT_SECONDS), (Integer) preferences.get(CACHE_DURATION_SECONDS), (Long) preferences.get(CACHE_UPDATED_TIME));
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        SessionConfigs sessionConfigs3 = null;
        if (sessionConfigs2 == null) {
            Intrinsics.asBinder("");
            sessionConfigs2 = null;
        }
        Long cacheUpdatedTime = sessionConfigs2.getCacheUpdatedTime();
        SessionConfigs sessionConfigs4 = this.sessionConfigs;
        if (sessionConfigs4 == null) {
            Intrinsics.asBinder("");
        } else {
            sessionConfigs3 = sessionConfigs4;
        }
        Integer cacheDuration = sessionConfigs3.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / 1000 >= ((long) cacheDuration.intValue());
    }

    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 == null) {
            Intrinsics.asBinder("");
            sessionConfigs2 = null;
        }
        return sessionConfigs2.getSessionEnabled();
    }

    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 == null) {
            Intrinsics.asBinder("");
            sessionConfigs2 = null;
        }
        return sessionConfigs2.getSessionSamplingRate();
    }

    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs2 = this.sessionConfigs;
        if (sessionConfigs2 == null) {
            Intrinsics.asBinder("");
            sessionConfigs2 = null;
        }
        return sessionConfigs2.getSessionRestartTimeout();
    }

    public final Object updateSettingsEnabled(Boolean bool, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        Object updateConfigValue = updateConfigValue(SESSIONS_ENABLED, bool, tooltipCompatHandler);
        return updateConfigValue == TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED ? updateConfigValue : Unit.asInterface;
    }

    public final Object updateSamplingRate(Double d, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        Object updateConfigValue = updateConfigValue(SAMPLING_RATE, d, tooltipCompatHandler);
        return updateConfigValue == TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED ? updateConfigValue : Unit.asInterface;
    }

    public final Object updateSessionRestartTimeout(Integer num, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        Object updateConfigValue = updateConfigValue(RESTART_TIMEOUT_SECONDS, num, tooltipCompatHandler);
        return updateConfigValue == TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED ? updateConfigValue : Unit.asInterface;
    }

    public final Object updateSessionCacheDuration(Integer num, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        Object updateConfigValue = updateConfigValue(CACHE_DURATION_SECONDS, num, tooltipCompatHandler);
        return updateConfigValue == TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED ? updateConfigValue : Unit.asInterface;
    }

    public final Object updateSessionCacheUpdatedTime(Long l, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        Object updateConfigValue = updateConfigValue(CACHE_UPDATED_TIME, l, tooltipCompatHandler);
        return updateConfigValue == TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED ? updateConfigValue : Unit.asInterface;
    }

    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* renamed from: com.google.firebase.sessions.settings.SettingsCache$1  reason: invalid class name */
    static final class AnonymousClass1 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ SettingsCache this$0;

        {
            this.this$0 = r1;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new AnonymousClass1(this.this$0, tooltipCompatHandler);
        }

        public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
            return ((AnonymousClass1) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            SettingsCache settingsCache;
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    settingsCache = (SettingsCache) this.L$0;
                    if (obj instanceof setContentInsetsAbsolute.onTransact) {
                        throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                SettingsCache settingsCache2 = this.this$0;
                this.L$0 = settingsCache2;
                this.label = 1;
                Object onTransact = RemoteActionCompatParcelizer.onTransact.onTransact(settingsCache2.dataStore.getData(), this);
                if (onTransact == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
                settingsCache = settingsCache2;
                obj = onTransact;
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            settingsCache.updateSessionConfigs(((Preferences) obj).toPreferences());
            return Unit.asInterface;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object updateConfigValue(androidx.datastore.preferences.core.Preferences.Key<T> r6, T r7, o.TooltipCompatHandler<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = (com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 + r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1 r0 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$1
            r0.<init>(r5, r8)
        L_0x0019:
            java.lang.Object r8 = r0.result
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r1 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            boolean r6 = r8 instanceof o.setContentInsetsAbsolute.onTransact     // Catch:{ IOException -> 0x004d }
            if (r6 != 0) goto L_0x0029
            goto L_0x004d
        L_0x0029:
            o.setContentInsetsAbsolute$onTransact r8 = (o.setContentInsetsAbsolute.onTransact) r8     // Catch:{ IOException -> 0x004d }
            java.lang.Throwable r6 = r8.RemoteActionCompatParcelizer     // Catch:{ IOException -> 0x004d }
            throw r6     // Catch:{ IOException -> 0x004d }
        L_0x002e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0036:
            boolean r2 = r8 instanceof o.setContentInsetsAbsolute.onTransact
            if (r2 != 0) goto L_0x0050
            androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> r8 = r5.dataStore     // Catch:{ IOException -> 0x004d }
            com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2 r2 = new com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2     // Catch:{ IOException -> 0x004d }
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch:{ IOException -> 0x004d }
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch:{ IOException -> 0x004d }
            r0.label = r3     // Catch:{ IOException -> 0x004d }
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)     // Catch:{ IOException -> 0x004d }
            if (r6 != r1) goto L_0x004d
            return r1
        L_0x004d:
            kotlin.Unit r6 = kotlin.Unit.asInterface
            return r6
        L_0x0050:
            o.setContentInsetsAbsolute$onTransact r8 = (o.setContentInsetsAbsolute.onTransact) r8
            java.lang.Throwable r6 = r8.RemoteActionCompatParcelizer
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SettingsCache.updateConfigValue(androidx.datastore.preferences.core.Preferences$Key, java.lang.Object, o.TooltipCompatHandler):java.lang.Object");
    }
}
