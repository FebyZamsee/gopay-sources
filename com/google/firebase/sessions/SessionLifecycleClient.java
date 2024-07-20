package com.google.firebase.sessions;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.getCanceledFrom;
import o.setOnBackInvokedDispatcher;

public final class SessionLifecycleClient {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final CoroutineContext backgroundDispatcher;
    /* access modifiers changed from: private */
    public final LinkedBlockingDeque<Message> queuedMessages = new LinkedBlockingDeque<>(20);
    /* access modifiers changed from: private */
    public Messenger service;
    /* access modifiers changed from: private */
    public boolean serviceBound;
    private final SessionLifecycleClient$serviceConnection$1 serviceConnection = new SessionLifecycleClient$serviceConnection$1(this);

    public SessionLifecycleClient(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.backgroundDispatcher = coroutineContext;
    }

    public static final class ClientUpdateHandler extends Handler {
        private final CoroutineContext backgroundDispatcher;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ClientUpdateHandler(CoroutineContext coroutineContext) {
            super(Looper.getMainLooper());
            Intrinsics.checkNotNullParameter(coroutineContext, "");
            this.backgroundDispatcher = coroutineContext;
        }

        public final void handleMessage(Message message) {
            String string;
            String str = "";
            Intrinsics.checkNotNullParameter(message, str);
            if (message.what == 3) {
                Bundle data = message.getData();
                if (!(data == null || (string = data.getString("SessionUpdateExtra")) == null)) {
                    str = string;
                }
                handleSessionUpdate(str);
                return;
            }
            super.handleMessage(message);
        }

        private final void handleSessionUpdate(String str) {
            RemoteActionCompatParcelizer.onTransact.asInterface(setOnBackInvokedDispatcher.asInterface(this.backgroundDispatcher), (CoroutineContext) null, (BiometricManager.DefaultInjector) null, new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(str, (TooltipCompatHandler<? super SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1>) null), 3);
        }
    }

    public final void bindToService() {
        SessionLifecycleServiceBinder.Companion.getInstance().bindToService(new Messenger(new ClientUpdateHandler(this.backgroundDispatcher)), this.serviceConnection);
    }

    public final void foregrounded() {
        sendLifecycleEvent(1);
    }

    public final void backgrounded() {
        sendLifecycleEvent(2);
    }

    private final void sendLifecycleEvent(int i) {
        List<Message> drainQueue = drainQueue();
        Message obtain = Message.obtain((Handler) null, i, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtain, "");
        drainQueue.add(obtain);
        sendLifecycleEvents(drainQueue);
    }

    /* access modifiers changed from: private */
    public final getCanceledFrom sendLifecycleEvents(List<Message> list) {
        return RemoteActionCompatParcelizer.onTransact.asInterface(setOnBackInvokedDispatcher.asInterface(this.backgroundDispatcher), (CoroutineContext) null, (BiometricManager.DefaultInjector) null, new SessionLifecycleClient$sendLifecycleEvents$1(this, list, (TooltipCompatHandler<? super SessionLifecycleClient$sendLifecycleEvents$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void sendMessageToServer(Message message) {
        if (this.service != null) {
            try {
                int i = message.what;
                Messenger messenger = this.service;
                if (messenger != null) {
                    messenger.send(message);
                    return;
                }
                return;
            } catch (RemoteException e) {
                int i2 = message.what;
                Throwable th = e;
            }
        }
        queueMessage(message);
    }

    private final void queueMessage(Message message) {
        if (this.queuedMessages.offer(message)) {
            int i = message.what;
            this.queuedMessages.size();
            return;
        }
        int i2 = message.what;
    }

    /* access modifiers changed from: private */
    public final List<Message> drainQueue() {
        List<Message> arrayList = new ArrayList<>();
        this.queuedMessages.drainTo(arrayList);
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.os.Message} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Message getLatestByCode(java.util.List<android.os.Message> r7, int r8) {
        /*
            r6 = this;
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r7 = r7.iterator()
        L_0x000d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r7.next()
            r2 = r1
            android.os.Message r2 = (android.os.Message) r2
            int r2 = r2.what
            if (r2 != r8) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            if (r2 == 0) goto L_0x000d
            r0.add(r1)
            goto L_0x000d
        L_0x0027:
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r7 = r0.iterator()
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x0037
            r7 = 0
            goto L_0x0060
        L_0x0037:
            java.lang.Object r8 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x005f
            r0 = r8
            android.os.Message r0 = (android.os.Message) r0
            long r0 = r0.getWhen()
        L_0x0048:
            java.lang.Object r2 = r7.next()
            r3 = r2
            android.os.Message r3 = (android.os.Message) r3
            long r3 = r3.getWhen()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0059
            r8 = r2
            r0 = r3
        L_0x0059:
            boolean r2 = r7.hasNext()
            if (r2 != 0) goto L_0x0048
        L_0x005f:
            r7 = r8
        L_0x0060:
            android.os.Message r7 = (android.os.Message) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionLifecycleClient.getLatestByCode(java.util.List, int):android.os.Message");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
