package com.google.firebase.dynamiclinks.internal;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    public final List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(FirebaseDynamicLinks.class).name("fire-dl").add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optionalProvider(AnalyticsConnector.class)).factory(new FirebaseDynamicLinkRegistrar$$ExternalSyntheticLambda0()).build(), LibraryVersionComponent.create("fire-dl", "21.2.0")});
    }

    static /* synthetic */ FirebaseDynamicLinks lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseDynamicLinksImpl((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(AnalyticsConnector.class));
    }
}
