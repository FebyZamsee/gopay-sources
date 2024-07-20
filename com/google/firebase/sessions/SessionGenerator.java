package com.google.firebase.sessions;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseKt;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricFragment;

public final class SessionGenerator {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private SessionDetails currentSession;
    private final String firstSessionId;
    private int sessionIndex;
    private final TimeProvider timeProvider;
    private final Function0<UUID> uuidGenerator;

    public SessionGenerator(TimeProvider timeProvider2, Function0<UUID> function0) {
        Intrinsics.checkNotNullParameter(timeProvider2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.timeProvider = timeProvider2;
        this.uuidGenerator = function0;
        this.firstSessionId = generateSessionId();
        this.sessionIndex = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SessionGenerator(TimeProvider timeProvider2, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(timeProvider2, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function0);
    }

    public final SessionDetails getCurrentSession() {
        SessionDetails sessionDetails = this.currentSession;
        if (sessionDetails != null) {
            return sessionDetails;
        }
        Intrinsics.asBinder("");
        return null;
    }

    public final SessionDetails generateNewSession() {
        int i = this.sessionIndex + 1;
        this.sessionIndex = i;
        this.currentSession = new SessionDetails(i == 0 ? this.firstSessionId : generateSessionId(), this.firstSessionId, this.sessionIndex, this.timeProvider.currentTimeUs());
        return getCurrentSession();
    }

    private final String generateSessionId() {
        String obj = this.uuidGenerator.invoke().toString();
        Intrinsics.checkNotNullExpressionValue(obj, "");
        String lowerCase = BiometricFragment.AnonymousClass5.onTransact(obj, "-", "", false).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return lowerCase;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SessionGenerator getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionGenerator.class);
            Intrinsics.checkNotNullExpressionValue(obj, "");
            return (SessionGenerator) obj;
        }
    }
}
