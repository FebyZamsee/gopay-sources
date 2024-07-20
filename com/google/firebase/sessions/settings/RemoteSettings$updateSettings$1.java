package com.google.firebase.sessions.settings;

import o.TooltipCompatHandler;
import o.VectorEnabledTintResources;

final class RemoteSettings$updateSettings$1 extends VectorEnabledTintResources {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteSettings this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RemoteSettings$updateSettings$1(RemoteSettings remoteSettings, TooltipCompatHandler<? super RemoteSettings$updateSettings$1> tooltipCompatHandler) {
        super(tooltipCompatHandler);
        this.this$0 = remoteSettings;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateSettings(this);
    }
}
