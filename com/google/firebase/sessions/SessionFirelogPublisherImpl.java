package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.setOnBackInvokedDispatcher;

public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final double randomValueForSampling = Math.random();
    private final CoroutineContext backgroundDispatcher;
    private final EventGDTLoggerInterface eventGDTLogger;
    /* access modifiers changed from: private */
    public final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    /* access modifiers changed from: private */
    public final SessionsSettings sessionSettings;

    public SessionFirelogPublisherImpl(FirebaseApp firebaseApp2, FirebaseInstallationsApi firebaseInstallationsApi, SessionsSettings sessionsSettings, EventGDTLoggerInterface eventGDTLoggerInterface, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(firebaseApp2, "");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "");
        Intrinsics.checkNotNullParameter(sessionsSettings, "");
        Intrinsics.checkNotNullParameter(eventGDTLoggerInterface, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.firebaseApp = firebaseApp2;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.sessionSettings = sessionsSettings;
        this.eventGDTLogger = eventGDTLoggerInterface;
        this.backgroundDispatcher = coroutineContext;
    }

    public final void logSession(SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "");
        RemoteActionCompatParcelizer.onTransact.asInterface(setOnBackInvokedDispatcher.asInterface(this.backgroundDispatcher), (CoroutineContext) null, (BiometricManager.DefaultInjector) null, new SessionFirelogPublisherImpl$logSession$1(this, sessionDetails, (TooltipCompatHandler<? super SessionFirelogPublisherImpl$logSession$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void attemptLoggingSessionEvent(SessionEvent sessionEvent) {
        try {
            this.eventGDTLogger.log(sessionEvent);
            sessionEvent.getSessionData().getSessionId();
        } catch (RuntimeException e) {
            Throwable th = e;
        }
    }

    private final boolean shouldCollectEvents() {
        return randomValueForSampling <= this.sessionSettings.getSamplingRate();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getFirebaseInstallationId(o.TooltipCompatHandler<? super java.lang.String> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1
            if (r0 == 0) goto L_0x0014
            r0 = r6
            com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 + r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$getFirebaseInstallationId$1
            r0.<init>(r5, r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r1 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            boolean r0 = r6 instanceof o.setContentInsetsAbsolute.onTransact     // Catch:{ Exception -> 0x0053 }
            if (r0 != 0) goto L_0x002b
            goto L_0x004f
        L_0x002b:
            o.setContentInsetsAbsolute$onTransact r6 = (o.setContentInsetsAbsolute.onTransact) r6     // Catch:{ Exception -> 0x0053 }
            java.lang.Throwable r6 = r6.RemoteActionCompatParcelizer     // Catch:{ Exception -> 0x0053 }
            throw r6     // Catch:{ Exception -> 0x0053 }
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0038:
            boolean r2 = r6 instanceof o.setContentInsetsAbsolute.onTransact
            if (r2 != 0) goto L_0x0057
            com.google.firebase.installations.FirebaseInstallationsApi r6 = r5.firebaseInstallations     // Catch:{ Exception -> 0x0053 }
            com.google.android.gms.tasks.Task r6 = r6.getId()     // Catch:{ Exception -> 0x0053 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)     // Catch:{ Exception -> 0x0053 }
            r0.label = r4     // Catch:{ Exception -> 0x0053 }
            r2 = 0
            java.lang.Object r6 = o.BrowserActionsIntent.Builder.read(r6, r2, r0)     // Catch:{ Exception -> 0x0053 }
            if (r6 != r1) goto L_0x004f
            return r1
        L_0x004f:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0053 }
            r3 = r6
            goto L_0x0056
        L_0x0053:
            r6 = move-exception
            java.lang.Throwable r6 = (java.lang.Throwable) r6
        L_0x0056:
            return r3
        L_0x0057:
            o.setContentInsetsAbsolute$onTransact r6 = (o.setContentInsetsAbsolute.onTransact) r6
            java.lang.Throwable r6 = r6.RemoteActionCompatParcelizer
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.getFirebaseInstallationId(o.TooltipCompatHandler):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object shouldLogSession(o.TooltipCompatHandler<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            if (r0 == 0) goto L_0x0014
            r0 = r5
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r5 = r0.label
            int r5 = r5 + r2
            r0.label = r5
            goto L_0x0019
        L_0x0014:
            com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1 r0 = new com.google.firebase.sessions.SessionFirelogPublisherImpl$shouldLogSession$1
            r0.<init>(r4, r5)
        L_0x0019:
            java.lang.Object r5 = r0.result
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r1 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.lang.Object r0 = r0.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r0 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r0
            boolean r1 = r5 instanceof o.setContentInsetsAbsolute.onTransact
            if (r1 != 0) goto L_0x002d
            goto L_0x004c
        L_0x002d:
            o.setContentInsetsAbsolute$onTransact r5 = (o.setContentInsetsAbsolute.onTransact) r5
            java.lang.Throwable r5 = r5.RemoteActionCompatParcelizer
            throw r5
        L_0x0032:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x003a:
            boolean r2 = r5 instanceof o.setContentInsetsAbsolute.onTransact
            if (r2 != 0) goto L_0x0063
            com.google.firebase.sessions.settings.SessionsSettings r5 = r4.sessionSettings
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.updateSettings(r0)
            if (r5 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r4
        L_0x004c:
            com.google.firebase.sessions.settings.SessionsSettings r5 = r0.sessionSettings
            boolean r5 = r5.getSessionsEnabled()
            if (r5 != 0) goto L_0x0057
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x0057:
            boolean r5 = r0.shouldCollectEvents()
            if (r5 != 0) goto L_0x0060
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L_0x0060:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L_0x0063:
            o.setContentInsetsAbsolute$onTransact r5 = (o.setContentInsetsAbsolute.onTransact) r5
            java.lang.Throwable r5 = r5.RemoteActionCompatParcelizer
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl.shouldLogSession(o.TooltipCompatHandler):java.lang.Object");
    }
}
