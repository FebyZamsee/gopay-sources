package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class TopicsSubscriber {
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    private final Context context;
    private final FirebaseMessaging firebaseMessaging;
    private final Metadata metadata;
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> pendingOperations = new ArrayMap();
    private final GmsRpc rpc;
    private final TopicsStore store;
    private final ScheduledExecutorService syncExecutor;
    private boolean syncScheduledOrRunning = false;

    static Task<TopicsSubscriber> createInstance(FirebaseMessaging firebaseMessaging2, Metadata metadata2, GmsRpc gmsRpc, Context context2, ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new TopicsSubscriber$$ExternalSyntheticLambda0(context2, scheduledExecutorService, firebaseMessaging2, metadata2, gmsRpc));
    }

    static /* synthetic */ TopicsSubscriber lambda$createInstance$0(Context context2, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging2, Metadata metadata2, GmsRpc gmsRpc) throws Exception {
        return new TopicsSubscriber(firebaseMessaging2, metadata2, TopicsStore.getInstance(context2, scheduledExecutorService), gmsRpc, context2, scheduledExecutorService);
    }

    private TopicsSubscriber(FirebaseMessaging firebaseMessaging2, Metadata metadata2, TopicsStore topicsStore, GmsRpc gmsRpc, Context context2, ScheduledExecutorService scheduledExecutorService) {
        this.firebaseMessaging = firebaseMessaging2;
        this.metadata = metadata2;
        this.store = topicsStore;
        this.rpc = gmsRpc;
        this.context = context2;
        this.syncExecutor = scheduledExecutorService;
    }

    /* access modifiers changed from: package-private */
    public boolean hasPendingOperation() {
        return this.store.getNextTopicOperation() != null;
    }

    /* access modifiers changed from: package-private */
    public void startTopicsSyncIfNecessary() {
        if (hasPendingOperation()) {
            startSync();
        }
    }

    private void startSync() {
        if (!isSyncScheduledOrRunning()) {
            syncWithDelaySecondsInternal(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void syncWithDelaySecondsInternal(long j) {
        scheduleSyncTaskWithDelaySeconds(new TopicsSyncTask(this, this.context, this.metadata, Math.min(Math.max(30, 2 * j), MAX_DELAY_SEC)), j);
        setSyncScheduledOrRunning(true);
    }

    /* access modifiers changed from: package-private */
    public void scheduleSyncTaskWithDelaySeconds(Runnable runnable, long j) {
        this.syncExecutor.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (performTopicOperation(r0) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean syncTopics() throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            com.google.firebase.messaging.TopicsStore r0 = r2.store     // Catch:{ all -> 0x0021 }
            com.google.firebase.messaging.TopicOperation r0 = r0.getNextTopicOperation()     // Catch:{ all -> 0x0021 }
            if (r0 != 0) goto L_0x000f
            isDebugLogEnabled()     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x000f:
            monitor-exit(r2)
            boolean r1 = r2.performTopicOperation(r0)
            if (r1 != 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            com.google.firebase.messaging.TopicsStore r1 = r2.store
            r1.removeTopicOperation(r0)
            r2.markCompletePendingOperation(r0)
            goto L_0x0000
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.syncTopics():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void markCompletePendingOperation(com.google.firebase.messaging.TopicOperation r5) {
        /*
            r4 = this;
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r0 = r4.pendingOperations
            monitor-enter(r0)
            java.lang.String r5 = r5.serialize()     // Catch:{ all -> 0x0032 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.pendingOperations     // Catch:{ all -> 0x0032 }
            boolean r1 = r1.containsKey(r5)     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)
            return
        L_0x0011:
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.pendingOperations     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0032 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r1.poll()     // Catch:{ all -> 0x0032 }
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2     // Catch:{ all -> 0x0032 }
            if (r2 == 0) goto L_0x0025
            r3 = 0
            r2.setResult(r3)     // Catch:{ all -> 0x0032 }
        L_0x0025:
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x0030
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r4.pendingOperations     // Catch:{ all -> 0x0032 }
            r1.remove(r5)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.markCompletePendingOperation(com.google.firebase.messaging.TopicOperation):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[Catch:{ IOException -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041 A[Catch:{ IOException -> 0x0052 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performTopicOperation(com.google.firebase.messaging.TopicOperation r6) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.getOperation()     // Catch:{ IOException -> 0x0052 }
            int r2 = r1.hashCode()     // Catch:{ IOException -> 0x0052 }
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L_0x001c
            r3 = 85
            if (r2 != r3) goto L_0x0026
            java.lang.String r2 = "U"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0052 }
            if (r1 == 0) goto L_0x0026
            r1 = 1
            goto L_0x0027
        L_0x001c:
            java.lang.String r2 = "S"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0052 }
            if (r1 == 0) goto L_0x0026
            r1 = 0
            goto L_0x0027
        L_0x0026:
            r1 = -1
        L_0x0027:
            if (r1 == 0) goto L_0x0041
            if (r1 == r4) goto L_0x0030
            boolean r6 = isDebugLogEnabled()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0051
        L_0x0030:
            java.lang.String r1 = r6.getTopic()     // Catch:{ IOException -> 0x0052 }
            r5.blockingUnsubscribeFromTopic(r1)     // Catch:{ IOException -> 0x0052 }
            boolean r1 = isDebugLogEnabled()     // Catch:{ IOException -> 0x0052 }
            if (r1 == 0) goto L_0x0051
            r6.getTopic()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0051
        L_0x0041:
            java.lang.String r1 = r6.getTopic()     // Catch:{ IOException -> 0x0052 }
            r5.blockingSubscribeToTopic(r1)     // Catch:{ IOException -> 0x0052 }
            boolean r1 = isDebugLogEnabled()     // Catch:{ IOException -> 0x0052 }
            if (r1 == 0) goto L_0x0051
            r6.getTopic()     // Catch:{ IOException -> 0x0052 }
        L_0x0051:
            return r4
        L_0x0052:
            r6 = move-exception
            java.lang.String r1 = r6.getMessage()
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = r6.getMessage()
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto L_0x0072
            return r0
        L_0x0072:
            throw r6
        L_0x0073:
            r6.getMessage()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.TopicsSubscriber.performTopicOperation(com.google.firebase.messaging.TopicOperation):boolean");
    }

    private void blockingSubscribeToTopic(String str) throws IOException {
        awaitTask(this.rpc.subscribeToTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    private void blockingUnsubscribeFromTopic(String str) throws IOException {
        awaitTask(this.rpc.unsubscribeFromTopic(this.firebaseMessaging.blockingGetToken(), str));
    }

    private static <T> void awaitTask(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isSyncScheduledOrRunning() {
        boolean z;
        synchronized (this) {
            z = this.syncScheduledOrRunning;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public void setSyncScheduledOrRunning(boolean z) {
        synchronized (this) {
            this.syncScheduledOrRunning = z;
        }
    }

    static boolean isDebugLogEnabled() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }
}
