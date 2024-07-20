package com.google.firebase.sessions;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferencesKt;
import com.google.firebase.sessions.SessionDatastoreImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o.BiometricManager;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.setContentInsetsAbsolute;

final class SessionDatastoreImpl$updateSessionId$1 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
    final /* synthetic */ String $sessionId;
    int label;
    final /* synthetic */ SessionDatastoreImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SessionDatastoreImpl$updateSessionId$1(SessionDatastoreImpl sessionDatastoreImpl, String str, TooltipCompatHandler<? super SessionDatastoreImpl$updateSessionId$1> tooltipCompatHandler) {
        super(2, tooltipCompatHandler);
        this.this$0 = sessionDatastoreImpl;
        this.$sessionId = str;
    }

    public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
        return new SessionDatastoreImpl$updateSessionId$1(this.this$0, this.$sessionId, tooltipCompatHandler);
    }

    public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        return ((SessionDatastoreImpl$updateSessionId$1) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
    }

    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1  reason: invalid class name */
    static final class AnonymousClass1 extends getLayoutResource implements Function2<MutablePreferences, TooltipCompatHandler<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            AnonymousClass1 r0 = new AnonymousClass1(str, tooltipCompatHandler);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(MutablePreferences mutablePreferences, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
            return ((AnonymousClass1) create(mutablePreferences, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                ((MutablePreferences) this.L$0).set(SessionDatastoreImpl.FirebaseSessionDataKeys.INSTANCE.getSESSION_ID(), str);
                return Unit.asInterface;
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
        }
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
            DataStore access$getDataStore = SessionDatastoreImpl.Companion.getDataStore(this.this$0.context);
            final String str = this.$sessionId;
            this.label = 1;
            if (PreferencesKt.edit(access$getDataStore, new AnonymousClass1((TooltipCompatHandler<? super AnonymousClass1>) null), this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                return tooltipCompatHandler$$ExternalSyntheticLambda1;
            }
        } else {
            throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
        }
        return Unit.asInterface;
    }
}
