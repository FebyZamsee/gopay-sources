package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.BiometricFragment;
import o.openBrowserAction;
import o.openFallbackBrowserActionsMenu;
import o.setOnBackInvokedDispatcher;

public final class RemoteSettings implements SettingsProvider {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final ApplicationInfo appInfo;
    private final CoroutineContext backgroundDispatcher;
    private final CrashlyticsSettingsFetcher configsFetcher;
    private final openFallbackBrowserActionsMenu fetchInProgress = openBrowserAction.read();
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    /* access modifiers changed from: private */
    public final SettingsCache settingsCache;

    public RemoteSettings(CoroutineContext coroutineContext, FirebaseInstallationsApi firebaseInstallationsApi2, ApplicationInfo applicationInfo, CrashlyticsSettingsFetcher crashlyticsSettingsFetcher, DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi2, "");
        Intrinsics.checkNotNullParameter(applicationInfo, "");
        Intrinsics.checkNotNullParameter(crashlyticsSettingsFetcher, "");
        Intrinsics.checkNotNullParameter(dataStore, "");
        this.backgroundDispatcher = coroutineContext;
        this.firebaseInstallationsApi = firebaseInstallationsApi2;
        this.appInfo = applicationInfo;
        this.configsFetcher = crashlyticsSettingsFetcher;
        this.settingsCache = new SettingsCache(dataStore);
    }

    public final Boolean getSessionEnabled() {
        return this.settingsCache.sessionsEnabled();
    }

    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    public final BiometricFragment.AnonymousClass6 m157getSessionRestartTimeoutFghU774() {
        Integer sessionRestartTimeout = this.settingsCache.sessionRestartTimeout();
        if (sessionRestartTimeout == null) {
            return null;
        }
        BiometricFragment.AnonymousClass6.asInterface asinterface = BiometricFragment.AnonymousClass6.RemoteActionCompatParcelizer;
        return BiometricFragment.AnonymousClass6.read(setOnBackInvokedDispatcher.onTransact(sessionRestartTimeout.intValue(), BiometricFragment.AnonymousClass8.SECONDS));
    }

    public final Double getSamplingRate() {
        return this.settingsCache.sessionSamplingRate();
    }

    private final String removeForwardSlashesIn(String str) {
        return new Regex("/").replace(str, "");
    }

    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009e A[Catch:{ all -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a4 A[SYNTHETIC, Splitter:B:51:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00be A[Catch:{ all -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object updateSettings(o.TooltipCompatHandler<? super kotlin.Unit> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1
            if (r0 == 0) goto L_0x0014
            r0 = r13
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r0 = (com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r13 = r0.label
            int r13 = r13 + r2
            r0.label = r13
            goto L_0x0019
        L_0x0014:
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1 r0 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$1
            r0.<init>(r12, r13)
        L_0x0019:
            java.lang.Object r13 = r0.result
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r1 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            java.lang.String r4 = ""
            r5 = 1
            r6 = 2
            r7 = 0
            if (r2 == 0) goto L_0x006e
            if (r2 == r5) goto L_0x005c
            if (r2 == r6) goto L_0x0047
            if (r2 != r3) goto L_0x003f
            java.lang.Object r0 = r0.L$0
            o.openFallbackBrowserActionsMenu r0 = (o.openFallbackBrowserActionsMenu) r0
            boolean r1 = r13 instanceof o.setContentInsetsAbsolute.onTransact     // Catch:{ all -> 0x003c }
            if (r1 != 0) goto L_0x0037
            goto L_0x014d
        L_0x0037:
            o.setContentInsetsAbsolute$onTransact r13 = (o.setContentInsetsAbsolute.onTransact) r13     // Catch:{ all -> 0x003c }
            java.lang.Throwable r13 = r13.RemoteActionCompatParcelizer     // Catch:{ all -> 0x003c }
            throw r13     // Catch:{ all -> 0x003c }
        L_0x003c:
            r13 = move-exception
            goto L_0x0156
        L_0x003f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0047:
            java.lang.Object r2 = r0.L$1
            o.openFallbackBrowserActionsMenu r2 = (o.openFallbackBrowserActionsMenu) r2
            java.lang.Object r8 = r0.L$0
            com.google.firebase.sessions.settings.RemoteSettings r8 = (com.google.firebase.sessions.settings.RemoteSettings) r8
            boolean r9 = r13 instanceof o.setContentInsetsAbsolute.onTransact     // Catch:{ all -> 0x0059 }
            if (r9 != 0) goto L_0x0054
            goto L_0x00ba
        L_0x0054:
            o.setContentInsetsAbsolute$onTransact r13 = (o.setContentInsetsAbsolute.onTransact) r13     // Catch:{ all -> 0x0059 }
            java.lang.Throwable r13 = r13.RemoteActionCompatParcelizer     // Catch:{ all -> 0x0059 }
            throw r13     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r13 = move-exception
            goto L_0x0155
        L_0x005c:
            java.lang.Object r2 = r0.L$1
            o.openFallbackBrowserActionsMenu r2 = (o.openFallbackBrowserActionsMenu) r2
            java.lang.Object r8 = r0.L$0
            com.google.firebase.sessions.settings.RemoteSettings r8 = (com.google.firebase.sessions.settings.RemoteSettings) r8
            boolean r9 = r13 instanceof o.setContentInsetsAbsolute.onTransact
            if (r9 != 0) goto L_0x0069
            goto L_0x0096
        L_0x0069:
            o.setContentInsetsAbsolute$onTransact r13 = (o.setContentInsetsAbsolute.onTransact) r13
            java.lang.Throwable r13 = r13.RemoteActionCompatParcelizer
            throw r13
        L_0x006e:
            boolean r2 = r13 instanceof o.setContentInsetsAbsolute.onTransact
            if (r2 != 0) goto L_0x015a
            o.openFallbackBrowserActionsMenu r13 = r12.fetchInProgress
            boolean r13 = r13.RemoteActionCompatParcelizer()
            if (r13 != 0) goto L_0x0085
            com.google.firebase.sessions.settings.SettingsCache r13 = r12.settingsCache
            boolean r13 = r13.hasCacheExpired$com_google_firebase_firebase_sessions()
            if (r13 != 0) goto L_0x0085
            kotlin.Unit r13 = kotlin.Unit.asInterface
            return r13
        L_0x0085:
            o.openFallbackBrowserActionsMenu r13 = r12.fetchInProgress
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r5
            java.lang.Object r2 = r13.asInterface(r7, r0)
            if (r2 != r1) goto L_0x0094
            return r1
        L_0x0094:
            r8 = r12
            r2 = r13
        L_0x0096:
            com.google.firebase.sessions.settings.SettingsCache r13 = r8.settingsCache     // Catch:{ all -> 0x0059 }
            boolean r13 = r13.hasCacheExpired$com_google_firebase_firebase_sessions()     // Catch:{ all -> 0x0059 }
            if (r13 != 0) goto L_0x00a4
            kotlin.Unit r13 = kotlin.Unit.asInterface     // Catch:{ all -> 0x0059 }
            r2.read(r7)
            return r13
        L_0x00a4:
            com.google.firebase.installations.FirebaseInstallationsApi r13 = r8.firebaseInstallationsApi     // Catch:{ all -> 0x0059 }
            com.google.android.gms.tasks.Task r13 = r13.getId()     // Catch:{ all -> 0x0059 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)     // Catch:{ all -> 0x0059 }
            r0.L$0 = r8     // Catch:{ all -> 0x0059 }
            r0.L$1 = r2     // Catch:{ all -> 0x0059 }
            r0.label = r6     // Catch:{ all -> 0x0059 }
            java.lang.Object r13 = o.BrowserActionsIntent.Builder.read(r13, r7, r0)     // Catch:{ all -> 0x0059 }
            if (r13 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0059 }
            if (r13 != 0) goto L_0x00c4
            kotlin.Unit r13 = kotlin.Unit.asInterface     // Catch:{ all -> 0x0059 }
            r2.read(r7)
            return r13
        L_0x00c4:
            r9 = 5
            kotlin.Pair[] r9 = new kotlin.Pair[r9]     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "X-Crashlytics-Installation-ID"
            kotlin.Pair r11 = new kotlin.Pair     // Catch:{ all -> 0x0059 }
            r11.<init>(r10, r13)     // Catch:{ all -> 0x0059 }
            r13 = 0
            r9[r13] = r11     // Catch:{ all -> 0x0059 }
            o.Function r10 = o.Function.asBinder     // Catch:{ all -> 0x0059 }
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0059 }
            java.lang.String r11 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0059 }
            r10[r13] = r11     // Catch:{ all -> 0x0059 }
            java.lang.String r13 = android.os.Build.MODEL     // Catch:{ all -> 0x0059 }
            r10[r5] = r13     // Catch:{ all -> 0x0059 }
            java.lang.String r13 = "%s/%s"
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r6)     // Catch:{ all -> 0x0059 }
            java.lang.String r13 = java.lang.String.format(r13, r10)     // Catch:{ all -> 0x0059 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)     // Catch:{ all -> 0x0059 }
            java.lang.String r13 = r8.removeForwardSlashesIn(r13)     // Catch:{ all -> 0x0059 }
            java.lang.String r10 = "X-Crashlytics-Device-Model"
            kotlin.Pair r11 = new kotlin.Pair     // Catch:{ all -> 0x0059 }
            r11.<init>(r10, r13)     // Catch:{ all -> 0x0059 }
            r9[r5] = r11     // Catch:{ all -> 0x0059 }
            java.lang.String r13 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x0059 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r13 = r8.removeForwardSlashesIn(r13)     // Catch:{ all -> 0x0059 }
            kotlin.Pair r10 = new kotlin.Pair     // Catch:{ all -> 0x0059 }
            r10.<init>(r5, r13)     // Catch:{ all -> 0x0059 }
            r9[r6] = r10     // Catch:{ all -> 0x0059 }
            java.lang.String r13 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0059 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r4)     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r13 = r8.removeForwardSlashesIn(r13)     // Catch:{ all -> 0x0059 }
            kotlin.Pair r5 = new kotlin.Pair     // Catch:{ all -> 0x0059 }
            r5.<init>(r4, r13)     // Catch:{ all -> 0x0059 }
            r9[r3] = r5     // Catch:{ all -> 0x0059 }
            r13 = 4
            java.lang.String r4 = "X-Crashlytics-API-Client-Version"
            com.google.firebase.sessions.ApplicationInfo r5 = r8.appInfo     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r5.getSessionSdkVersion()     // Catch:{ all -> 0x0059 }
            kotlin.Pair r6 = new kotlin.Pair     // Catch:{ all -> 0x0059 }
            r6.<init>(r4, r5)     // Catch:{ all -> 0x0059 }
            r9[r13] = r6     // Catch:{ all -> 0x0059 }
            java.util.Map r13 = o.updateNavigationIcon.onTransact((kotlin.Pair<? extends K, ? extends V>[]) r9)     // Catch:{ all -> 0x0059 }
            com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher r4 = r8.configsFetcher     // Catch:{ all -> 0x0059 }
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1 r5 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1     // Catch:{ all -> 0x0059 }
            r5.<init>(r8, r7)     // Catch:{ all -> 0x0059 }
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch:{ all -> 0x0059 }
            com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2 r6 = new com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2     // Catch:{ all -> 0x0059 }
            r6.<init>(r7)     // Catch:{ all -> 0x0059 }
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6     // Catch:{ all -> 0x0059 }
            r0.L$0 = r2     // Catch:{ all -> 0x0059 }
            r0.L$1 = r7     // Catch:{ all -> 0x0059 }
            r0.label = r3     // Catch:{ all -> 0x0059 }
            java.lang.Object r13 = r4.doConfigFetch(r13, r5, r6, r0)     // Catch:{ all -> 0x0059 }
            if (r13 != r1) goto L_0x014c
            return r1
        L_0x014c:
            r0 = r2
        L_0x014d:
            kotlin.Unit r13 = kotlin.Unit.asInterface     // Catch:{ all -> 0x003c }
            r0.read(r7)
            kotlin.Unit r13 = kotlin.Unit.asInterface
            return r13
        L_0x0155:
            r0 = r2
        L_0x0156:
            r0.read(r7)
            throw r13
        L_0x015a:
            o.setContentInsetsAbsolute$onTransact r13 = (o.setContentInsetsAbsolute.onTransact) r13
            java.lang.Throwable r13 = r13.RemoteActionCompatParcelizer
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.RemoteSettings.updateSettings(o.TooltipCompatHandler):java.lang.Object");
    }
}
