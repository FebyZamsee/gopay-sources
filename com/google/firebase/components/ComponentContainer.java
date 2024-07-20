package com.google.firebase.components;

import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Set;

public interface ComponentContainer {
    <T> T get(Qualified<T> qualified);

    <T> T get(Class<T> cls);

    <T> Deferred<T> getDeferred(Qualified<T> qualified);

    <T> Deferred<T> getDeferred(Class<T> cls);

    <T> Provider<T> getProvider(Qualified<T> qualified);

    <T> Provider<T> getProvider(Class<T> cls);

    <T> Set<T> setOf(Qualified<T> qualified);

    <T> Set<T> setOf(Class<T> cls);

    <T> Provider<Set<T>> setOfProvider(Qualified<T> qualified);

    /* renamed from: com.google.firebase.components.ComponentContainer$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Object $default$get(ComponentContainer componentContainer, Class cls) {
            return componentContainer.get(Qualified.unqualified(cls));
        }

        public static Provider $default$getProvider(ComponentContainer componentContainer, Class cls) {
            return componentContainer.getProvider(Qualified.unqualified(cls));
        }

        public static Deferred $default$getDeferred(ComponentContainer componentContainer, Class cls) {
            return componentContainer.getDeferred(Qualified.unqualified(cls));
        }

        public static Set $default$setOf(ComponentContainer componentContainer, Class cls) {
            return componentContainer.setOf(Qualified.unqualified(cls));
        }

        public static Object $default$get(ComponentContainer componentContainer, Qualified qualified) {
            Provider provider = componentContainer.getProvider(qualified);
            if (provider == null) {
                return null;
            }
            return provider.get();
        }

        public static Set $default$setOf(ComponentContainer componentContainer, Qualified qualified) {
            return (Set) componentContainer.setOfProvider(qualified).get();
        }
    }
}
