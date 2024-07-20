package com.google.firebase.sessions;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BiometricManager;
import o.TooltipCompatHandler;
import o.getLayoutResource;

final class SessionFirelogPublisherImpl$logSession$1 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
    final /* synthetic */ SessionDetails $sessionDetails;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$logSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionDetails sessionDetails, TooltipCompatHandler<? super SessionFirelogPublisherImpl$logSession$1> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
        this.this$0 = sessionFirelogPublisherImpl;
        this.$sessionDetails = sessionDetails;
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        return new SessionFirelogPublisherImpl$logSession$1(this.this$0, this.$sessionDetails, tooltipCompatHandler);
    }

    public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((SessionFirelogPublisherImpl$logSession$1) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r2 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r3 = r0.label
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = ""
            if (r3 == 0) goto L_0x0084
            if (r3 == r6) goto L_0x007a
            if (r3 == r5) goto L_0x0053
            if (r3 != r4) goto L_0x004b
            java.lang.Object r2 = r0.L$7
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r3 = r0.L$6
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.L$5
            com.google.firebase.sessions.ProcessDetails r4 = (com.google.firebase.sessions.ProcessDetails) r4
            java.lang.Object r5 = r0.L$4
            com.google.firebase.sessions.settings.SessionsSettings r5 = (com.google.firebase.sessions.settings.SessionsSettings) r5
            java.lang.Object r6 = r0.L$3
            com.google.firebase.sessions.SessionDetails r6 = (com.google.firebase.sessions.SessionDetails) r6
            java.lang.Object r8 = r0.L$2
            com.google.firebase.FirebaseApp r8 = (com.google.firebase.FirebaseApp) r8
            java.lang.Object r9 = r0.L$1
            com.google.firebase.sessions.SessionEvents r9 = (com.google.firebase.sessions.SessionEvents) r9
            java.lang.Object r10 = r0.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r10 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r10
            boolean r11 = r1 instanceof o.setContentInsetsAbsolute.onTransact
            if (r11 != 0) goto L_0x0046
            r14 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r2 = r10
            r10 = r6
            r16 = r9
            r9 = r8
        L_0x0042:
            r8 = r16
            goto L_0x012a
        L_0x0046:
            o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
            java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
            throw r1
        L_0x004b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0053:
            java.lang.Object r3 = r0.L$6
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r5 = r0.L$5
            com.google.firebase.sessions.ProcessDetails r5 = (com.google.firebase.sessions.ProcessDetails) r5
            java.lang.Object r6 = r0.L$4
            com.google.firebase.sessions.settings.SessionsSettings r6 = (com.google.firebase.sessions.settings.SessionsSettings) r6
            java.lang.Object r8 = r0.L$3
            com.google.firebase.sessions.SessionDetails r8 = (com.google.firebase.sessions.SessionDetails) r8
            java.lang.Object r9 = r0.L$2
            com.google.firebase.FirebaseApp r9 = (com.google.firebase.FirebaseApp) r9
            java.lang.Object r10 = r0.L$1
            com.google.firebase.sessions.SessionEvents r10 = (com.google.firebase.sessions.SessionEvents) r10
            java.lang.Object r11 = r0.L$0
            com.google.firebase.sessions.SessionFirelogPublisherImpl r11 = (com.google.firebase.sessions.SessionFirelogPublisherImpl) r11
            boolean r12 = r1 instanceof o.setContentInsetsAbsolute.onTransact
            if (r12 != 0) goto L_0x0075
            goto L_0x00ff
        L_0x0075:
            o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
            java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
            throw r1
        L_0x007a:
            boolean r3 = r1 instanceof o.setContentInsetsAbsolute.onTransact
            if (r3 != 0) goto L_0x007f
            goto L_0x0096
        L_0x007f:
            o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
            java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
            throw r1
        L_0x0084:
            boolean r3 = r1 instanceof o.setContentInsetsAbsolute.onTransact
            if (r3 != 0) goto L_0x013a
            com.google.firebase.sessions.SessionFirelogPublisherImpl r1 = r0.this$0
            r3 = r0
            o.TooltipCompatHandler r3 = (o.TooltipCompatHandler) r3
            r0.label = r6
            java.lang.Object r1 = r1.shouldLogSession(r3)
            if (r1 != r2) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0137
            com.google.firebase.sessions.SessionFirelogPublisherImpl r1 = r0.this$0
            com.google.firebase.sessions.SessionEvents r3 = com.google.firebase.sessions.SessionEvents.INSTANCE
            com.google.firebase.sessions.SessionFirelogPublisherImpl r6 = r0.this$0
            com.google.firebase.FirebaseApp r6 = r6.firebaseApp
            com.google.firebase.sessions.SessionDetails r8 = r0.$sessionDetails
            com.google.firebase.sessions.SessionFirelogPublisherImpl r9 = r0.this$0
            com.google.firebase.sessions.settings.SessionsSettings r9 = r9.sessionSettings
            com.google.firebase.sessions.ProcessDetailsProvider r10 = com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE
            com.google.firebase.sessions.SessionFirelogPublisherImpl r11 = r0.this$0
            com.google.firebase.FirebaseApp r11 = r11.firebaseApp
            android.content.Context r11 = r11.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r7)
            com.google.firebase.sessions.ProcessDetails r10 = r10.getCurrentProcessDetails(r11)
            com.google.firebase.sessions.ProcessDetailsProvider r11 = com.google.firebase.sessions.ProcessDetailsProvider.INSTANCE
            com.google.firebase.sessions.SessionFirelogPublisherImpl r12 = r0.this$0
            com.google.firebase.FirebaseApp r12 = r12.firebaseApp
            android.content.Context r12 = r12.getApplicationContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r7)
            java.util.List r11 = r11.getAppProcessDetails(r12)
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r12 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            r13 = r0
            o.TooltipCompatHandler r13 = (o.TooltipCompatHandler) r13
            r0.L$0 = r1
            r0.L$1 = r3
            r0.L$2 = r6
            r0.L$3 = r8
            r0.L$4 = r9
            r0.L$5 = r10
            r0.L$6 = r11
            r0.label = r5
            java.lang.Object r5 = r12.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r13)
            if (r5 != r2) goto L_0x00f2
            return r2
        L_0x00f2:
            r16 = r11
            r11 = r1
            r1 = r5
            r5 = r10
            r10 = r3
            r3 = r16
            r17 = r9
            r9 = r6
            r6 = r17
        L_0x00ff:
            java.util.Map r1 = (java.util.Map) r1
            com.google.firebase.sessions.SessionFirelogPublisherImpl r12 = r0.this$0
            r13 = r0
            o.TooltipCompatHandler r13 = (o.TooltipCompatHandler) r13
            r0.L$0 = r11
            r0.L$1 = r10
            r0.L$2 = r9
            r0.L$3 = r8
            r0.L$4 = r6
            r0.L$5 = r5
            r0.L$6 = r3
            r0.L$7 = r1
            r0.label = r4
            java.lang.Object r4 = r12.getFirebaseInstallationId(r13)
            if (r4 != r2) goto L_0x011f
            return r2
        L_0x011f:
            r14 = r1
            r13 = r3
            r1 = r4
            r12 = r5
            r2 = r11
            r11 = r6
            r16 = r10
            r10 = r8
            goto L_0x0042
        L_0x012a:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r7)
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
            com.google.firebase.sessions.SessionEvent r1 = r8.buildSession(r9, r10, r11, r12, r13, r14, r15)
            r2.attemptLoggingSessionEvent(r1)
        L_0x0137:
            kotlin.Unit r1 = kotlin.Unit.asInterface
            return r1
        L_0x013a:
            o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
            java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
