package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricFragment;
import o.BiometricManager;
import o.hasNext;
import o.isSomeBiometricAllowed;
import o.nextNode;
import o.releaseRequest;
import o.setOnBackInvokedDispatcher;

public final class SessionsSettings {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final releaseRequest<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), (ReplaceFileCorruptionHandler) null, (Function1) null, (BiometricManager.Authenticators) null, 14, (Object) null);
    private final SettingsProvider localOverrideSettings;
    private final SettingsProvider remoteSettings;

    private final boolean isValidSamplingRate(double d) {
        return 0.0d <= d && d <= 1.0d;
    }

    public SessionsSettings(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        Intrinsics.checkNotNullParameter(settingsProvider, "");
        Intrinsics.checkNotNullParameter(settingsProvider2, "");
        this.localOverrideSettings = settingsProvider;
        this.remoteSettings = settingsProvider2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private SessionsSettings(android.content.Context r16, kotlin.coroutines.CoroutineContext r17, kotlin.coroutines.CoroutineContext r18, com.google.firebase.installations.FirebaseInstallationsApi r19, com.google.firebase.sessions.ApplicationInfo r20) {
        /*
            r15 = this;
            r0 = r16
            com.google.firebase.sessions.settings.LocalOverrideSettings r1 = new com.google.firebase.sessions.settings.LocalOverrideSettings
            r1.<init>(r0)
            com.google.firebase.sessions.settings.SettingsProvider r1 = (com.google.firebase.sessions.settings.SettingsProvider) r1
            com.google.firebase.sessions.settings.RemoteSettingsFetcher r8 = new com.google.firebase.sessions.settings.RemoteSettingsFetcher
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r3 = r20
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7)
            r13 = r8
            com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher r13 = (com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher) r13
            com.google.firebase.sessions.settings.SessionsSettings$Companion r2 = Companion
            androidx.datastore.core.DataStore r14 = r2.getDataStore(r0)
            com.google.firebase.sessions.settings.RemoteSettings r0 = new com.google.firebase.sessions.settings.RemoteSettings
            r9 = r0
            r10 = r18
            r11 = r19
            r12 = r20
            r9.<init>(r10, r11, r12, r13, r14)
            com.google.firebase.sessions.settings.SettingsProvider r0 = (com.google.firebase.sessions.settings.SettingsProvider) r0
            r2 = r15
            r15.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.<init>(android.content.Context, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, com.google.firebase.installations.FirebaseInstallationsApi, com.google.firebase.sessions.ApplicationInfo):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SessionsSettings(com.google.firebase.FirebaseApp r8, kotlin.coroutines.CoroutineContext r9, kotlin.coroutines.CoroutineContext r10, com.google.firebase.installations.FirebaseInstallationsApi r11) {
        /*
            r7 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.content.Context r2 = r8.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            com.google.firebase.sessions.SessionEvents r0 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.sessions.ApplicationInfo r6 = r0.getApplicationInfo(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.<init>(com.google.firebase.FirebaseApp, kotlin.coroutines.CoroutineContext, kotlin.coroutines.CoroutineContext, com.google.firebase.installations.FirebaseInstallationsApi):void");
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.localOverrideSettings.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.remoteSettings.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    public final double getSamplingRate() {
        Double samplingRate = this.localOverrideSettings.getSamplingRate();
        if (samplingRate != null) {
            double doubleValue = samplingRate.doubleValue();
            if (isValidSamplingRate(doubleValue)) {
                return doubleValue;
            }
        }
        Double samplingRate2 = this.remoteSettings.getSamplingRate();
        if (samplingRate2 == null) {
            return 1.0d;
        }
        double doubleValue2 = samplingRate2.doubleValue();
        if (isValidSamplingRate(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: getSessionRestartTimeout-UwyO8pc  reason: not valid java name */
    public final long m159getSessionRestartTimeoutUwyO8pc() {
        BiometricFragment.AnonymousClass6 r0 = this.localOverrideSettings.m160getSessionRestartTimeoutFghU774();
        if (r0 != null) {
            long j = r0.read;
            if (m158isValidSessionRestartTimeoutLRDsOJo(j)) {
                return j;
            }
        }
        BiometricFragment.AnonymousClass6 r02 = this.remoteSettings.m160getSessionRestartTimeoutFghU774();
        if (r02 != null) {
            long j2 = r02.read;
            if (m158isValidSessionRestartTimeoutLRDsOJo(j2)) {
                return j2;
            }
        }
        BiometricFragment.AnonymousClass6.asInterface asinterface = BiometricFragment.AnonymousClass6.RemoteActionCompatParcelizer;
        return setOnBackInvokedDispatcher.onTransact(30, BiometricFragment.AnonymousClass8.MINUTES);
    }

    /* renamed from: isValidSessionRestartTimeout-LRDsOJo  reason: not valid java name */
    private final boolean m158isValidSessionRestartTimeoutLRDsOJo(long j) {
        return BiometricFragment.AnonymousClass6.RemoteActionCompatParcelizer(j) && BiometricFragment.AnonymousClass6.asInterface(j);
    }

    public static final class Companion {
        static final /* synthetic */ isSomeBiometricAllowed<Object>[] $$delegatedProperties = {nextNode.RemoteActionCompatParcelizer(new hasNext(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return (SessionsSettings) obj;
        }

        /* access modifiers changed from: private */
        public final DataStore<Preferences> getDataStore(Context context) {
            return (DataStore) SessionsSettings.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateSettings(o.TooltipCompatHandler<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            if (r0 == 0) goto L_0x0014
            r0 = r6
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 + r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.SessionsSettings$updateSettings$1
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r1 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0047
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            boolean r0 = r6 instanceof o.setContentInsetsAbsolute.onTransact
            if (r0 != 0) goto L_0x002c
            goto L_0x0067
        L_0x002c:
            o.setContentInsetsAbsolute$onTransact r6 = (o.setContentInsetsAbsolute.onTransact) r6
            java.lang.Throwable r6 = r6.RemoteActionCompatParcelizer
            throw r6
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            java.lang.Object r2 = r0.L$0
            com.google.firebase.sessions.settings.SessionsSettings r2 = (com.google.firebase.sessions.settings.SessionsSettings) r2
            boolean r4 = r6 instanceof o.setContentInsetsAbsolute.onTransact
            if (r4 != 0) goto L_0x0042
            goto L_0x0059
        L_0x0042:
            o.setContentInsetsAbsolute$onTransact r6 = (o.setContentInsetsAbsolute.onTransact) r6
            java.lang.Throwable r6 = r6.RemoteActionCompatParcelizer
            throw r6
        L_0x0047:
            boolean r2 = r6 instanceof o.setContentInsetsAbsolute.onTransact
            if (r2 != 0) goto L_0x006a
            com.google.firebase.sessions.settings.SettingsProvider r6 = r5.localOverrideSettings
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L_0x0058
            return r1
        L_0x0058:
            r2 = r5
        L_0x0059:
            com.google.firebase.sessions.settings.SettingsProvider r6 = r2.remoteSettings
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.updateSettings(r0)
            if (r6 != r1) goto L_0x0067
            return r1
        L_0x0067:
            kotlin.Unit r6 = kotlin.Unit.asInterface
            return r6
        L_0x006a:
            o.setContentInsetsAbsolute$onTransact r6 = (o.setContentInsetsAbsolute.onTransact) r6
            java.lang.Throwable r6 = r6.RemoteActionCompatParcelizer
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.SessionsSettings.updateSettings(o.TooltipCompatHandler):java.lang.Object");
    }
}
