package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.Arrays;
import java.util.List;
import o.getTabAt;
import o.getTabCount;
import o.setListNavigationCallbacks;
import o.setSelectedNavigationItem;

public class TransportRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Arrays.asList(new Component[]{Component.builder(getTabAt.class).name("fire-transport").add(Dependency.required((Class<?>) Context.class)).factory(new TransportRegistrar$$ExternalSyntheticLambda0()).build(), LibraryVersionComponent.create("fire-transport", "18.1.8")});
    }

    static /* synthetic */ getTabAt lambda$getComponents$0(ComponentContainer componentContainer) {
        setSelectedNavigationItem.asInterface((Context) componentContainer.get(Context.class));
        setListNavigationCallbacks setlistnavigationcallbacks = setSelectedNavigationItem.onTransact;
        if (setlistnavigationcallbacks != null) {
            return setlistnavigationcallbacks.RemoteActionCompatParcelizer().onTransact(getTabCount.RemoteActionCompatParcelizer);
        }
        throw new IllegalStateException("Not initialized!");
    }
}
