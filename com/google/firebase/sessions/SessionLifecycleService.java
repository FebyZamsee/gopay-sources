package com.google.firebase.sessions;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricFragment;

public final class SessionLifecycleService extends Service {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final HandlerThread handlerThread = new HandlerThread("FirebaseSessions_HandlerThread");
    private MessageHandler messageHandler;
    private Messenger messenger;

    public static final class MessageHandler extends Handler {
        private final ArrayList<Messenger> boundClients = new ArrayList<>();
        private boolean hasForegrounded;
        private long lastMsgTimeMs;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MessageHandler(Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(looper, "");
        }

        public final void handleMessage(Message message) {
            Intrinsics.checkNotNullParameter(message, "");
            if (this.lastMsgTimeMs > message.getWhen()) {
                message.getWhen();
                return;
            }
            int i = message.what;
            if (i == 1) {
                handleForegrounding(message);
            } else if (i == 2) {
                handleBackgrounding(message);
            } else if (i != 4) {
                super.handleMessage(message);
            } else {
                handleClientBound(message);
            }
        }

        private final void handleForegrounding(Message message) {
            message.getWhen();
            if (!this.hasForegrounded) {
                this.hasForegrounded = true;
                newSession();
            } else if (isSessionRestart(message.getWhen())) {
                newSession();
            }
            this.lastMsgTimeMs = message.getWhen();
        }

        private final void handleBackgrounding(Message message) {
            message.getWhen();
            this.lastMsgTimeMs = message.getWhen();
        }

        private final void handleClientBound(Message message) {
            this.boundClients.add(message.replyTo);
            Messenger messenger = message.replyTo;
            Intrinsics.checkNotNullExpressionValue(messenger, "");
            maybeSendSessionToClient(messenger);
            Messenger messenger2 = message.replyTo;
            message.getWhen();
            this.boundClients.size();
        }

        private final void newSession() {
            SessionGenerator.Companion.getInstance().generateNewSession();
            SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId();
            broadcastSession();
            SessionDatastore.Companion.getInstance().updateSessionId(SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId());
        }

        private final void broadcastSession() {
            SessionGenerator.Companion.getInstance().getCurrentSession();
            SessionFirelogPublisher.Companion.getInstance().logSession(SessionGenerator.Companion.getInstance().getCurrentSession());
            for (Messenger messenger : new ArrayList(this.boundClients)) {
                Intrinsics.checkNotNullExpressionValue(messenger, "");
                maybeSendSessionToClient(messenger);
            }
        }

        private final void maybeSendSessionToClient(Messenger messenger) {
            if (this.hasForegrounded) {
                sendSessionToClient(messenger, SessionGenerator.Companion.getInstance().getCurrentSession().getSessionId());
                return;
            }
            String currentSessionId = SessionDatastore.Companion.getInstance().getCurrentSessionId();
            if (currentSessionId != null) {
                sendSessionToClient(messenger, currentSessionId);
            }
        }

        private final void sendSessionToClient(Messenger messenger, String str) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("SessionUpdateExtra", str);
                Message obtain = Message.obtain((Handler) null, 3, 0, 0);
                obtain.setData(bundle);
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
                this.boundClients.remove(messenger);
            } catch (Exception e) {
                Throwable th = e;
            }
        }

        private final boolean isSessionRestart(long j) {
            return j - this.lastMsgTimeMs > BiometricFragment.AnonymousClass6.onTransact(SessionsSettings.Companion.getInstance().m159getSessionRestartTimeoutUwyO8pc());
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.handlerThread.start();
        Looper looper = this.handlerThread.getLooper();
        Intrinsics.checkNotNullExpressionValue(looper, "");
        this.messageHandler = new MessageHandler(looper);
        this.messenger = new Messenger(this.messageHandler);
    }

    public final IBinder onBind(Intent intent) {
        if (intent == null) {
            return null;
        }
        intent.getAction();
        Messenger clientCallback = getClientCallback(intent);
        if (clientCallback != null) {
            Message obtain = Message.obtain((Handler) null, 4, 0, 0);
            obtain.replyTo = clientCallback;
            MessageHandler messageHandler2 = this.messageHandler;
            if (messageHandler2 != null) {
                messageHandler2.sendMessage(obtain);
            }
        }
        Messenger messenger2 = this.messenger;
        if (messenger2 != null) {
            return messenger2.getBinder();
        }
        return null;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.handlerThread.quit();
    }

    private final Messenger getClientCallback(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger", Messenger.class);
        }
        return (Messenger) intent.getParcelableExtra("ClientCallbackMessenger");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
