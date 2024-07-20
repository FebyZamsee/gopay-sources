package com.google.firebase.sessions;

import android.content.ServiceConnection;
import android.os.Messenger;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import kotlin.jvm.internal.Intrinsics;

public interface SessionLifecycleServiceBinder {
    public static final Companion Companion = Companion.$$INSTANCE;

    void bindToService(Messenger messenger, ServiceConnection serviceConnection);

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final SessionLifecycleServiceBinder getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionLifecycleServiceBinder.class);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return (SessionLifecycleServiceBinder) obj;
        }
    }
}
