package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.session.SessionManager;
import o.getType;

public final class FirebasePerformanceModule_ProvidesSessionManagerFactory implements getType<SessionManager> {
    private final FirebasePerformanceModule module;

    public FirebasePerformanceModule_ProvidesSessionManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public final SessionManager get() {
        return providesSessionManager(this.module);
    }

    public static FirebasePerformanceModule_ProvidesSessionManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesSessionManagerFactory(firebasePerformanceModule);
    }

    public static SessionManager providesSessionManager(FirebasePerformanceModule firebasePerformanceModule) {
        SessionManager providesSessionManager = firebasePerformanceModule.providesSessionManager();
        if (providesSessionManager != null) {
            return providesSessionManager;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
