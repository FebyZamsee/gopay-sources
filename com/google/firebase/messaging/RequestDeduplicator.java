package com.google.firebase.messaging;

import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

class RequestDeduplicator {
    private final Executor executor;
    private final Map<String, Task<String>> getTokenRequests = new ArrayMap();

    interface GetTokenRequest {
        Task<String> start();
    }

    RequestDeduplicator(Executor executor2) {
        this.executor = executor2;
    }

    /* access modifiers changed from: package-private */
    public Task<String> getOrStartGetTokenRequest(String str, GetTokenRequest getTokenRequest) {
        synchronized (this) {
            Task<String> task = this.getTokenRequests.get(str);
            if (task != null) {
                return task;
            }
            Task<TContinuationResult> continueWithTask = getTokenRequest.start().continueWithTask(this.executor, new RequestDeduplicator$$ExternalSyntheticLambda0(this, str));
            this.getTokenRequests.put(str, continueWithTask);
            return continueWithTask;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$getOrStartGetTokenRequest$0$com-google-firebase-messaging-RequestDeduplicator  reason: not valid java name */
    public /* synthetic */ Task m120lambda$getOrStartGetTokenRequest$0$comgooglefirebasemessagingRequestDeduplicator(String str, Task task) throws Exception {
        synchronized (this) {
            this.getTokenRequests.remove(str);
        }
        return task;
    }
}
