package com.google.firebase.sessions.settings;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.setContentInsetsAbsolute;

final class RemoteSettings$updateSettings$2$2 extends getLayoutResource implements Function2<String, TooltipCompatHandler<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    RemoteSettings$updateSettings$2$2(TooltipCompatHandler<? super RemoteSettings$updateSettings$2$2> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(tooltipCompatHandler);
        remoteSettings$updateSettings$2$2.L$0 = obj;
        return remoteSettings$updateSettings$2$2;
    }

    public final Object invoke(String str, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((RemoteSettings$updateSettings$2$2) create(str, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    public final Object invokeSuspend(Object obj) {
        TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
            String str = (String) this.L$0;
            return Unit.asInterface;
        } else {
            throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
        }
    }
}
