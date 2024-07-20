package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;

public class AbtRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(AbtComponent.class).name("fire-abt").add(Dependency.required((Class<?>) Context.class)).add(Dependency.optionalProvider(AnalyticsConnector.class)).factory(new AbtRegistrar$$ExternalSyntheticLambda0()).build(), LibraryVersionComponent.create("fire-abt", "21.1.1")});
    }

    static /* synthetic */ AbtComponent lambda$getComponents$0(ComponentContainer componentContainer) {
        return new AbtComponent((Context) componentContainer.get(Context.class), componentContainer.getProvider(AnalyticsConnector.class));
    }
}
