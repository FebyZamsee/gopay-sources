package com.google.firebase.sessions;

import o.TooltipCompatHandler;
import o.VectorEnabledTintResources;

final class SessionFirelogPublisherImpl$getFirebaseInstallationId$1 extends VectorEnabledTintResources {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$getFirebaseInstallationId$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, TooltipCompatHandler<? super SessionFirelogPublisherImpl$getFirebaseInstallationId$1> tooltipCompatHandler) {
        super(tooltipCompatHandler);
        this.this$0 = sessionFirelogPublisherImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getFirebaseInstallationId(this);
    }
}
