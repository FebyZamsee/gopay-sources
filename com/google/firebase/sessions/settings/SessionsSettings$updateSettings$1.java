package com.google.firebase.sessions.settings;

import o.TooltipCompatHandler;
import o.VectorEnabledTintResources;

final class SessionsSettings$updateSettings$1 extends VectorEnabledTintResources {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SessionsSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionsSettings$updateSettings$1(SessionsSettings sessionsSettings, TooltipCompatHandler<? super SessionsSettings$updateSettings$1> tooltipCompatHandler) {
        super(tooltipCompatHandler);
        this.this$0 = sessionsSettings;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateSettings(this);
    }
}
