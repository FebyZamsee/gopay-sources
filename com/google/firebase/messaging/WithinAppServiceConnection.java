package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class WithinAppServiceConnection implements ServiceConnection {
    private WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue<BindRequest> intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    static class BindRequest {
        final Intent intent;
        private final TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();

        BindRequest(Intent intent2) {
            this.intent = intent2;
        }

        /* access modifiers changed from: package-private */
        public void arrangeTimeout(ScheduledExecutorService scheduledExecutorService) {
            getTask().addOnCompleteListener((Executor) scheduledExecutorService, new WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda1(scheduledExecutorService.schedule(new WithinAppServiceConnection$BindRequest$$ExternalSyntheticLambda0(this), 20, TimeUnit.SECONDS)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$arrangeTimeout$0$com-google-firebase-messaging-WithinAppServiceConnection$BindRequest  reason: not valid java name */
        public /* synthetic */ void m121lambda$arrangeTimeout$0$comgooglefirebasemessagingWithinAppServiceConnection$BindRequest() {
            this.intent.getAction();
            finish();
        }

        /* access modifiers changed from: package-private */
        public Task<Void> getTask() {
            return this.taskCompletionSource.getTask();
        }

        /* access modifiers changed from: package-private */
        public void finish() {
            this.taskCompletionSource.trySetResult(null);
        }
    }

    WithinAppServiceConnection(Context context2, String str) {
        this(context2, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    WithinAppServiceConnection(Context context2, String str, ScheduledExecutorService scheduledExecutorService2) {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        Context applicationContext = context2.getApplicationContext();
        this.context = applicationContext;
        this.connectionIntent = new Intent(str).setPackage(applicationContext.getPackageName());
        this.scheduledExecutorService = scheduledExecutorService2;
    }

    /* access modifiers changed from: package-private */
    public Task<Void> sendIntent(Intent intent) {
        Task<Void> task;
        synchronized (this) {
            BindRequest bindRequest = new BindRequest(intent);
            bindRequest.arrangeTimeout(this.scheduledExecutorService);
            this.intentQueue.add(bindRequest);
            flushQueue();
            task = bindRequest.getTask();
        }
        return task;
    }

    private void flushQueue() {
        synchronized (this) {
            while (!this.intentQueue.isEmpty()) {
                WithinAppServiceBinder withinAppServiceBinder = this.binder;
                if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                    startConnectionIfNeeded();
                    return;
                } else {
                    this.binder.send(this.intentQueue.poll());
                }
            }
        }
    }

    private void startConnectionIfNeeded() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 3);
        if (!this.connectionInProgress) {
            this.connectionInProgress = true;
            try {
                if (ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
                    return;
                }
            } catch (SecurityException unused) {
            }
            this.connectionInProgress = false;
            finishAllInQueue();
        }
    }

    private void finishAllInQueue() {
        while (!this.intentQueue.isEmpty()) {
            this.intentQueue.poll().finish();
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.connectionInProgress = false;
            if (!(iBinder instanceof WithinAppServiceBinder)) {
                finishAllInQueue();
                return;
            }
            this.binder = (WithinAppServiceBinder) iBinder;
            flushQueue();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        flushQueue();
    }
}
