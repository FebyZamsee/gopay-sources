package com.google.firebase.sessions;

import android.os.Message;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BiometricManager;
import o.TooltipCompatHandler;
import o.getLayoutResource;

final class SessionLifecycleClient$sendLifecycleEvents$1 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
    final /* synthetic */ List<Message> $messages;
    int label;
    final /* synthetic */ SessionLifecycleClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionLifecycleClient$sendLifecycleEvents$1(SessionLifecycleClient sessionLifecycleClient, List<Message> list, TooltipCompatHandler<? super SessionLifecycleClient$sendLifecycleEvents$1> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
        this.this$0 = sessionLifecycleClient;
        this.$messages = list;
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        return new SessionLifecycleClient$sendLifecycleEvents$1(this.this$0, this.$messages, tooltipCompatHandler);
    }

    public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((SessionLifecycleClient$sendLifecycleEvents$1) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r0 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            boolean r0 = r7 instanceof o.setContentInsetsAbsolute.onTransact
            if (r0 != 0) goto L_0x000e
            goto L_0x002d
        L_0x000e:
            o.setContentInsetsAbsolute$onTransact r7 = (o.setContentInsetsAbsolute.onTransact) r7
            java.lang.Throwable r7 = r7.RemoteActionCompatParcelizer
            throw r7
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x001b:
            boolean r1 = r7 instanceof o.setContentInsetsAbsolute.onTransact
            if (r1 != 0) goto L_0x0100
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r7 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE
            r1 = r6
            o.TooltipCompatHandler r1 = (o.TooltipCompatHandler) r1
            r6.label = r2
            java.lang.Object r7 = r7.getRegisteredSubscribers$com_google_firebase_firebase_sessions(r1)
            if (r7 != r0) goto L_0x002d
            return r0
        L_0x002d:
            java.util.Map r7 = (java.util.Map) r7
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00fd
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L_0x004a
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004a
            goto L_0x0062
        L_0x004a:
            java.util.Iterator r7 = r7.iterator()
        L_0x004e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r7.next()
            com.google.firebase.sessions.api.SessionSubscriber r0 = (com.google.firebase.sessions.api.SessionSubscriber) r0
            boolean r0 = r0.isDataCollectionEnabled()
            if (r0 == 0) goto L_0x004e
            r7 = 0
            goto L_0x0063
        L_0x0062:
            r7 = 1
        L_0x0063:
            if (r7 != 0) goto L_0x00fd
            r7 = 2
            android.os.Message[] r0 = new android.os.Message[r7]
            com.google.firebase.sessions.SessionLifecycleClient r3 = r6.this$0
            java.util.List<android.os.Message> r4 = r6.$messages
            android.os.Message r7 = r3.getLatestByCode(r4, r7)
            r0[r1] = r7
            com.google.firebase.sessions.SessionLifecycleClient r7 = r6.this$0
            java.util.List<android.os.Message> r3 = r6.$messages
            android.os.Message r7 = r7.getLatestByCode(r3, r2)
            r0[r2] = r7
            java.util.List r7 = o.Toolbar.ExpandedActionViewMenuPresenter.asBinder(r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Collection r7 = o.Toolbar.ExpandedActionViewMenuPresenter.asBinder(r7, r3)
            java.util.List r7 = (java.util.List) r7
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1 r3 = new com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1$invokeSuspend$$inlined$sortedBy$1
            r3.<init>()
            java.util.Comparator r3 = (java.util.Comparator) r3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r4 = r7 instanceof java.util.Collection
            if (r4 == 0) goto L_0x00d2
            r4 = r7
            java.util.Collection r4 = (java.util.Collection) r4
            int r5 = r4.size()
            if (r5 > r2) goto L_0x00b5
            java.util.List r7 = o.Toolbar.ExpandedActionViewMenuPresenter.read(r7)
            goto L_0x00e5
        L_0x00b5:
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.Object[] r7 = r4.toArray(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r1 = r7.length
            if (r1 <= r2) goto L_0x00c7
            java.util.Arrays.sort(r7, r3)
        L_0x00c7:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.List r7 = java.util.Arrays.asList(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            goto L_0x00e5
        L_0x00d2:
            java.util.List r7 = o.Toolbar.ExpandedActionViewMenuPresenter.asInterface(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r7.size()
            if (r0 <= r2) goto L_0x00e5
            java.util.Collections.sort(r7, r3)
        L_0x00e5:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.google.firebase.sessions.SessionLifecycleClient r0 = r6.this$0
            java.util.Iterator r7 = r7.iterator()
        L_0x00ed:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00fd
            java.lang.Object r1 = r7.next()
            android.os.Message r1 = (android.os.Message) r1
            r0.sendMessageToServer(r1)
            goto L_0x00ed
        L_0x00fd:
            kotlin.Unit r7 = kotlin.Unit.asInterface
            return r7
        L_0x0100:
            o.setContentInsetsAbsolute$onTransact r7 = (o.setContentInsetsAbsolute.onTransact) r7
            java.lang.Throwable r7 = r7.RemoteActionCompatParcelizer
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
