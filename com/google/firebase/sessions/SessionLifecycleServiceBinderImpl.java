package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import com.google.firebase.FirebaseApp;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SessionLifecycleServiceBinderImpl implements SessionLifecycleServiceBinder {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final FirebaseApp firebaseApp;

    public SessionLifecycleServiceBinderImpl(FirebaseApp firebaseApp2) {
        Intrinsics.checkNotNullParameter(firebaseApp2, "");
        this.firebaseApp = firebaseApp2;
    }

    public final void bindToService(Messenger messenger, ServiceConnection serviceConnection) {
        Intrinsics.checkNotNullParameter(messenger, "");
        Intrinsics.checkNotNullParameter(serviceConnection, "");
        Context applicationContext = this.firebaseApp.getApplicationContext().getApplicationContext();
        Intent intent = new Intent(applicationContext, SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        applicationContext.bindService(intent, serviceConnection, 65);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
