package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

public final class CrashlyticsNativeComponentDeferredProxy implements CrashlyticsNativeComponent {
    private static final NativeSessionFileProvider MISSING_NATIVE_SESSION_FILE_PROVIDER = new MissingNativeSessionFileProvider();
    private final AtomicReference<CrashlyticsNativeComponent> availableNativeComponent = new AtomicReference<>((Object) null);
    private final Deferred<CrashlyticsNativeComponent> deferredNativeComponent;

    public CrashlyticsNativeComponentDeferredProxy(Deferred<CrashlyticsNativeComponent> deferred) {
        this.deferredNativeComponent = deferred;
        deferred.whenAvailable(new CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$com-google-firebase-crashlytics-internal-CrashlyticsNativeComponentDeferredProxy  reason: not valid java name */
    public final /* synthetic */ void m91lambda$new$0$comgooglefirebasecrashlyticsinternalCrashlyticsNativeComponentDeferredProxy(Provider provider) {
        Logger.getLogger().d("Crashlytics native component now available.");
        this.availableNativeComponent.set((CrashlyticsNativeComponent) provider.get());
    }

    public final boolean hasCrashDataForCurrentSession() {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForCurrentSession();
    }

    public final boolean hasCrashDataForSession(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        return crashlyticsNativeComponent != null && crashlyticsNativeComponent.hasCrashDataForSession(str);
    }

    public final void prepareNativeSession(String str, String str2, long j, StaticSessionData staticSessionData) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Deferring native open session: ");
        sb.append(str);
        logger.v(sb.toString());
        this.deferredNativeComponent.whenAvailable(new CrashlyticsNativeComponentDeferredProxy$$ExternalSyntheticLambda1(str, str2, j, staticSessionData));
    }

    public final NativeSessionFileProvider getSessionFileProvider(String str) {
        CrashlyticsNativeComponent crashlyticsNativeComponent = this.availableNativeComponent.get();
        if (crashlyticsNativeComponent == null) {
            return MISSING_NATIVE_SESSION_FILE_PROVIDER;
        }
        return crashlyticsNativeComponent.getSessionFileProvider(str);
    }

    static final class MissingNativeSessionFileProvider implements NativeSessionFileProvider {
        public final File getAppFile() {
            return null;
        }

        public final CrashlyticsReport.ApplicationExitInfo getApplicationExitInto() {
            return null;
        }

        public final File getDeviceFile() {
            return null;
        }

        public final File getMetadataFile() {
            return null;
        }

        public final File getMinidumpFile() {
            return null;
        }

        public final File getOsFile() {
            return null;
        }

        public final File getSessionFile() {
            return null;
        }

        private MissingNativeSessionFileProvider() {
        }
    }
}
