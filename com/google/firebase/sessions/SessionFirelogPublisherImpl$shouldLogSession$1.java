package com.google.firebase.sessions;

import o.TooltipCompatHandler;
import o.VectorEnabledTintResources;

final class SessionFirelogPublisherImpl$shouldLogSession$1 extends VectorEnabledTintResources {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionFirelogPublisherImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, TooltipCompatHandler<? super SessionFirelogPublisherImpl$shouldLogSession$1> tooltipCompatHandler) {
        super(tooltipCompatHandler);
        this.this$0 = sessionFirelogPublisherImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.shouldLogSession(this);
    }
}
