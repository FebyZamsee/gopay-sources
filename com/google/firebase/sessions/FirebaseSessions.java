package com.google.firebase.sessions;

import android.app.Application;
import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.sessions.settings.SessionsSettings;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.getLayoutResource;
import o.setOnBackInvokedDispatcher;

public final class FirebaseSessions {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final FirebaseApp firebaseApp;
    /* access modifiers changed from: private */
    public final SessionsSettings settings;

    public FirebaseSessions(FirebaseApp firebaseApp2, SessionsSettings sessionsSettings, final CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(firebaseApp2, "");
        Intrinsics.checkNotNullParameter(sessionsSettings, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.firebaseApp = firebaseApp2;
        this.settings = sessionsSettings;
        Context applicationContext = firebaseApp2.getApplicationContext().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(SessionsActivityLifecycleCallbacks.INSTANCE);
            RemoteActionCompatParcelizer.onTransact.asInterface(setOnBackInvokedDispatcher.asInterface(coroutineContext), (CoroutineContext) null, (BiometricManager.DefaultInjector) null, new AnonymousClass1(this, (TooltipCompatHandler<? super AnonymousClass1>) null), 3);
        }
    }

    /* renamed from: com.google.firebase.sessions.FirebaseSessions$1  reason: invalid class name */
    static final class AnonymousClass1 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        int label;
        final /* synthetic */ FirebaseSessions this$0;

        {
            this.this$0 = r1;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new AnonymousClass1(this.this$0, coroutineContext, tooltipCompatHandler);
        }

        public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
            return ((AnonymousClass1) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
        }

        /* access modifiers changed from: private */
        /* renamed from: invokeSuspend$lambda-1  reason: not valid java name */
        public static final void m145invokeSuspend$lambda1(String str, FirebaseOptions firebaseOptions) {
            SessionsActivityLifecycleCallbacks.INSTANCE.setLifecycleClient((SessionLifecycleClient) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                o.TooltipCompatHandler$$ExternalSyntheticLambda1 r0 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0028
                if (r1 == r3) goto L_0x001e
                if (r1 != r2) goto L_0x0016
                boolean r0 = r5 instanceof o.setContentInsetsAbsolute.onTransact
                if (r0 != 0) goto L_0x0011
                goto L_0x007b
            L_0x0011:
                o.setContentInsetsAbsolute$onTransact r5 = (o.setContentInsetsAbsolute.onTransact) r5
                java.lang.Throwable r5 = r5.RemoteActionCompatParcelizer
                throw r5
            L_0x0016:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001e:
                boolean r1 = r5 instanceof o.setContentInsetsAbsolute.onTransact
                if (r1 != 0) goto L_0x0023
                goto L_0x003a
            L_0x0023:
                o.setContentInsetsAbsolute$onTransact r5 = (o.setContentInsetsAbsolute.onTransact) r5
                java.lang.Throwable r5 = r5.RemoteActionCompatParcelizer
                throw r5
            L_0x0028:
                boolean r1 = r5 instanceof o.setContentInsetsAbsolute.onTransact
                if (r1 != 0) goto L_0x00a7
                com.google.firebase.sessions.api.FirebaseSessionsDependencies r5 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
                r1 = r4
                o.TooltipCompatHandler r1 = (o.TooltipCompatHandler) r1
                r4.label = r3
                java.lang.Object r5 = r5.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r1)
                if (r5 != r0) goto L_0x003a
                return r0
            L_0x003a:
                java.util.Map r5 = (java.util.Map) r5
                java.util.Collection r5 = r5.values()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r1 = r5 instanceof java.util.Collection
                if (r1 == 0) goto L_0x0050
                r1 = r5
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x0050
                goto L_0x0067
            L_0x0050:
                java.util.Iterator r5 = r5.iterator()
            L_0x0054:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L_0x0067
                java.lang.Object r1 = r5.next()
                com.google.firebase.sessions.api.SessionSubscriber r1 = (com.google.firebase.sessions.api.SessionSubscriber) r1
                boolean r1 = r1.isDataCollectionEnabled()
                if (r1 == 0) goto L_0x0054
                r3 = 0
            L_0x0067:
                if (r3 != 0) goto L_0x00a4
                com.google.firebase.sessions.FirebaseSessions r5 = r4.this$0
                com.google.firebase.sessions.settings.SessionsSettings r5 = r5.settings
                r1 = r4
                o.TooltipCompatHandler r1 = (o.TooltipCompatHandler) r1
                r4.label = r2
                java.lang.Object r5 = r5.updateSettings(r1)
                if (r5 != r0) goto L_0x007b
                return r0
            L_0x007b:
                com.google.firebase.sessions.FirebaseSessions r5 = r4.this$0
                com.google.firebase.sessions.settings.SessionsSettings r5 = r5.settings
                boolean r5 = r5.getSessionsEnabled()
                if (r5 == 0) goto L_0x00a4
                com.google.firebase.sessions.SessionLifecycleClient r5 = new com.google.firebase.sessions.SessionLifecycleClient
                kotlin.coroutines.CoroutineContext r0 = r4
                r5.<init>(r0)
                r5.bindToService()
                com.google.firebase.sessions.SessionsActivityLifecycleCallbacks r0 = com.google.firebase.sessions.SessionsActivityLifecycleCallbacks.INSTANCE
                r0.setLifecycleClient(r5)
                com.google.firebase.sessions.FirebaseSessions r5 = r4.this$0
                com.google.firebase.FirebaseApp r5 = r5.firebaseApp
                com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0 r0 = new com.google.firebase.sessions.FirebaseSessions$1$$ExternalSyntheticLambda0
                r0.<init>()
                r5.addLifecycleEventListener(r0)
            L_0x00a4:
                kotlin.Unit r5 = kotlin.Unit.asInterface
                return r5
            L_0x00a7:
                o.setContentInsetsAbsolute$onTransact r5 = (o.setContentInsetsAbsolute.onTransact) r5
                java.lang.Throwable r5 = r5.RemoteActionCompatParcelizer
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.FirebaseSessions.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
