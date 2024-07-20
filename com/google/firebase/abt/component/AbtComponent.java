package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.util.HashMap;
import java.util.Map;

public class AbtComponent {
    private final Map<String, FirebaseABTesting> abtOriginInstances = new HashMap();
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Context appContext;

    protected AbtComponent(Context context, Provider<AnalyticsConnector> provider) {
        this.appContext = context;
        this.analyticsConnector = provider;
    }

    public FirebaseABTesting get(String str) {
        FirebaseABTesting firebaseABTesting;
        synchronized (this) {
            if (!this.abtOriginInstances.containsKey(str)) {
                this.abtOriginInstances.put(str, createAbtInstance(str));
            }
            firebaseABTesting = this.abtOriginInstances.get(str);
        }
        return firebaseABTesting;
    }

    /* access modifiers changed from: protected */
    public FirebaseABTesting createAbtInstance(String str) {
        return new FirebaseABTesting(this.appContext, this.analyticsConnector, str);
    }
}
