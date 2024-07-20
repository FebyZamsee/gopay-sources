package com.google.firebase.sessions;

import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BiometricManager;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.setContentInsetsAbsolute;

final class SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(String str, TooltipCompatHandler<? super SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
        this.$sessionId = str;
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        return new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(this.$sessionId, tooltipCompatHandler);
    }

    public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    public final Object invokeSuspend(Object obj) {
        TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
        } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
            this.label = 1;
            obj = FirebaseSessionsDependencies.INSTANCE.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                return tooltipCompatHandler$$ExternalSyntheticLambda1;
            }
        } else {
            throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
        }
        String str = this.$sessionId;
        for (SessionSubscriber sessionSubscriber : ((Map) obj).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            sessionSubscriber.getSessionSubscriberName();
        }
        return Unit.asInterface;
    }
}
