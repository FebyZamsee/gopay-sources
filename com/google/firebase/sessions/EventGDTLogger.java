package com.google.firebase.sessions;

import com.google.firebase.inject.Provider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.cancelAuthentication;
import o.getNavigationMode;
import o.getSelectedNavigationIndex;
import o.getSubtitle;
import o.getTabAt;

public final class EventGDTLogger implements EventGDTLoggerInterface {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final Provider<getTabAt> transportFactoryProvider;

    public EventGDTLogger(Provider<getTabAt> provider) {
        Intrinsics.checkNotNullParameter(provider, "");
        this.transportFactoryProvider = provider;
    }

    public final void log(SessionEvent sessionEvent) {
        Intrinsics.checkNotNullParameter(sessionEvent, "");
        Class<SessionEvent> cls = SessionEvent.class;
        this.transportFactoryProvider.get().RemoteActionCompatParcelizer("FIREBASE_APPQUALITY_SESSION", new getSubtitle("json"), new EventGDTLogger$$ExternalSyntheticLambda0(this)).asBinder(new getSelectedNavigationIndex((Integer) null, sessionEvent, getNavigationMode.DEFAULT));
    }

    /* access modifiers changed from: private */
    public final byte[] encode(SessionEvent sessionEvent) {
        String encode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(sessionEvent);
        Intrinsics.checkNotNullExpressionValue(encode, "");
        byte[] bytes = encode.getBytes(cancelAuthentication.onTransact);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return bytes;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
