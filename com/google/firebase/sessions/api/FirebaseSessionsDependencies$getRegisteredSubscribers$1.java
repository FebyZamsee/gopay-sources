package com.google.firebase.sessions.api;

import o.TooltipCompatHandler;
import o.VectorEnabledTintResources;

final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends VectorEnabledTintResources {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FirebaseSessionsDependencies this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, TooltipCompatHandler<? super FirebaseSessionsDependencies$getRegisteredSubscribers$1> tooltipCompatHandler) {
        super(tooltipCompatHandler);
        this.this$0 = firebaseSessionsDependencies;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}