package com.google.firebase.sessions;

import kotlin.Unit;
import o.BiometricViewModel;
import o.CryptoObjectUtils;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;

public final class SessionDatastoreImpl$special$$inlined$map$1 implements BiometricViewModel.CallbackListener<FirebaseSessionsData> {
    final /* synthetic */ BiometricViewModel.CallbackListener $this_unsafeTransform$inlined;
    final /* synthetic */ SessionDatastoreImpl this$0;

    public SessionDatastoreImpl$special$$inlined$map$1(BiometricViewModel.CallbackListener callbackListener, SessionDatastoreImpl sessionDatastoreImpl) {
        this.$this_unsafeTransform$inlined = callbackListener;
        this.this$0 = sessionDatastoreImpl;
    }

    public final Object collect(final CryptoObjectUtils cryptoObjectUtils, TooltipCompatHandler tooltipCompatHandler) {
        BiometricViewModel.CallbackListener callbackListener = this.$this_unsafeTransform$inlined;
        final SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
        Object collect = callbackListener.collect(new CryptoObjectUtils() {
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, o.TooltipCompatHandler r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                    if (r0 == 0) goto L_0x0014
                    r0 = r6
                    com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1 r0 = (com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L_0x0014
                    int r6 = r0.label
                    int r6 = r6 + r2
                    r0.label = r6
                    goto L_0x0019
                L_0x0014:
                    com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1 r0 = new com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0019:
                    java.lang.Object r6 = r0.result
                    o.TooltipCompatHandler$$ExternalSyntheticLambda1 r1 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0036
                    if (r2 != r3) goto L_0x002e
                    boolean r5 = r6 instanceof o.setContentInsetsAbsolute.onTransact
                    if (r5 != 0) goto L_0x0029
                    goto L_0x0050
                L_0x0029:
                    o.setContentInsetsAbsolute$onTransact r6 = (o.setContentInsetsAbsolute.onTransact) r6
                    java.lang.Throwable r5 = r6.RemoteActionCompatParcelizer
                    throw r5
                L_0x002e:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0036:
                    boolean r2 = r6 instanceof o.setContentInsetsAbsolute.onTransact
                    if (r2 != 0) goto L_0x0053
                    o.CryptoObjectUtils r6 = r4
                    r2 = r0
                    o.TooltipCompatHandler r2 = (o.TooltipCompatHandler) r2
                    androidx.datastore.preferences.core.Preferences r5 = (androidx.datastore.preferences.core.Preferences) r5
                    com.google.firebase.sessions.SessionDatastoreImpl r2 = r2
                    com.google.firebase.sessions.FirebaseSessionsData r5 = r2.mapSessionsData(r5)
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0050
                    return r1
                L_0x0050:
                    kotlin.Unit r5 = kotlin.Unit.asInterface
                    return r5
                L_0x0053:
                    o.setContentInsetsAbsolute$onTransact r6 = (o.setContentInsetsAbsolute.onTransact) r6
                    java.lang.Throwable r5 = r6.RemoteActionCompatParcelizer
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, o.TooltipCompatHandler):java.lang.Object");
            }
        }, tooltipCompatHandler);
        return collect == TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED ? collect : Unit.asInterface;
    }
}
