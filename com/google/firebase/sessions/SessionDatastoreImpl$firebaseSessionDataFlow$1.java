package com.google.firebase.sessions;

import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.Unit;
import o.ArchTaskExecutor$$ExternalSyntheticLambda0;
import o.CryptoObjectUtils;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.setContentInsetsAbsolute;

final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends getLayoutResource implements ArchTaskExecutor$$ExternalSyntheticLambda0<CryptoObjectUtils<? super Preferences>, Throwable, TooltipCompatHandler<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    SessionDatastoreImpl$firebaseSessionDataFlow$1(TooltipCompatHandler<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> tooltipCompatHandler) {
        super(3, tooltipCompatHandler);
    }

    public final Object invoke(CryptoObjectUtils<? super Preferences> cryptoObjectUtils, Throwable th, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(tooltipCompatHandler);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$0 = cryptoObjectUtils;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.L$1 = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(Unit.asInterface);
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
            Throwable th = (Throwable) this.L$1;
            this.L$0 = null;
            this.label = 1;
            if (((CryptoObjectUtils) this.L$0).emit(PreferencesFactory.createEmpty(), this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                return tooltipCompatHandler$$ExternalSyntheticLambda1;
            }
        } else {
            throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
        }
        return Unit.asInterface;
    }
}
