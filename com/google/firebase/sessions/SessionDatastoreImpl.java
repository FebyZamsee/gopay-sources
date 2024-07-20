package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.BiometricViewModel;
import o.CancellationSignalProvider;
import o.CryptoObjectUtils;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getLayoutResource;
import o.hasNext;
import o.isSomeBiometricAllowed;
import o.nextNode;
import o.releaseRequest;
import o.setContentInsetsAbsolute;
import o.setOnBackInvokedDispatcher;

public final class SessionDatastoreImpl implements SessionDatastore {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final releaseRequest<Context, DataStore<Preferences>> dataStore$delegate = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), (ReplaceFileCorruptionHandler) null, (Function1) null, (BiometricManager.Authenticators) null, 14, (Object) null);
    private final CoroutineContext backgroundDispatcher;
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final AtomicReference<FirebaseSessionsData> currentSessionFromDatastore = new AtomicReference<>();
    /* access modifiers changed from: private */
    public final BiometricViewModel.CallbackListener<FirebaseSessionsData> firebaseSessionDataFlow;

    public SessionDatastoreImpl(Context context2, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(context2, "");
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        this.context = context2;
        this.backgroundDispatcher = coroutineContext;
        this.firebaseSessionDataFlow = new SessionDatastoreImpl$special$$inlined$map$1(new CancellationSignalProvider.Injector(Companion.getDataStore(context2).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1((TooltipCompatHandler<? super SessionDatastoreImpl$firebaseSessionDataFlow$1>) null)), this);
        RemoteActionCompatParcelizer.onTransact.asInterface(setOnBackInvokedDispatcher.asInterface(coroutineContext), (CoroutineContext) null, (BiometricManager.DefaultInjector) null, new AnonymousClass1(this, (TooltipCompatHandler<? super AnonymousClass1>) null), 3);
    }

    static final class FirebaseSessionDataKeys {
        public static final FirebaseSessionDataKeys INSTANCE = new FirebaseSessionDataKeys();
        private static final Preferences.Key<String> SESSION_ID = PreferencesKeys.stringKey("session_id");

        private FirebaseSessionDataKeys() {
        }

        public final Preferences.Key<String> getSESSION_ID() {
            return SESSION_ID;
        }
    }

    public final void updateSessionId(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        RemoteActionCompatParcelizer.onTransact.asInterface(setOnBackInvokedDispatcher.asInterface(this.backgroundDispatcher), (CoroutineContext) null, (BiometricManager.DefaultInjector) null, new SessionDatastoreImpl$updateSessionId$1(this, str, (TooltipCompatHandler<? super SessionDatastoreImpl$updateSessionId$1>) null), 3);
    }

    public final String getCurrentSessionId() {
        FirebaseSessionsData firebaseSessionsData = this.currentSessionFromDatastore.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final FirebaseSessionsData mapSessionsData(Preferences preferences) {
        return new FirebaseSessionsData((String) preferences.get(FirebaseSessionDataKeys.INSTANCE.getSESSION_ID()));
    }

    static final class Companion {
        static final /* synthetic */ isSomeBiometricAllowed<Object>[] $$delegatedProperties = {nextNode.RemoteActionCompatParcelizer(new hasNext(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final DataStore<Preferences> getDataStore(Context context) {
            return (DataStore) SessionDatastoreImpl.dataStore$delegate.getValue(context, $$delegatedProperties[0]);
        }
    }

    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1  reason: invalid class name */
    static final class AnonymousClass1 extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        int label;
        final /* synthetic */ SessionDatastoreImpl this$0;

        {
            this.this$0 = r1;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new AnonymousClass1(this.this$0, tooltipCompatHandler);
        }

        public final Object invoke(BiometricManager.Authenticators authenticators, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
            return ((AnonymousClass1) create(authenticators, tooltipCompatHandler)).invokeSuspend(Unit.asInterface);
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
                BiometricViewModel.CallbackListener access$getFirebaseSessionDataFlow$p = this.this$0.firebaseSessionDataFlow;
                final SessionDatastoreImpl sessionDatastoreImpl = this.this$0;
                this.label = 1;
                if (access$getFirebaseSessionDataFlow$p.collect(new CryptoObjectUtils() {
                    public final Object emit(FirebaseSessionsData firebaseSessionsData, TooltipCompatHandler<? super Unit> tooltipCompatHandler) {
                        sessionDatastoreImpl.currentSessionFromDatastore.set(firebaseSessionsData);
                        return Unit.asInterface;
                    }
                }, this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            return Unit.asInterface;
        }
    }
}
