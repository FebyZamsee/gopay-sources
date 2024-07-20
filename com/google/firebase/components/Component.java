package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Component<T> {
    private final Set<Dependency> dependencies;
    private final ComponentFactory<T> factory;
    private final int instantiation;
    private final String name;
    private final Set<Qualified<? super T>> providedInterfaces;
    private final Set<Class<?>> publishedEvents;
    private final int type;

    static /* synthetic */ Object lambda$intoSet$3(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    static /* synthetic */ Object lambda$of$1(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    private Component(String str, Set<Qualified<? super T>> set, Set<Dependency> set2, int i, int i2, ComponentFactory<T> componentFactory, Set<Class<?>> set3) {
        this.name = str;
        this.providedInterfaces = Collections.unmodifiableSet(set);
        this.dependencies = Collections.unmodifiableSet(set2);
        this.instantiation = i;
        this.type = i2;
        this.factory = componentFactory;
        this.publishedEvents = Collections.unmodifiableSet(set3);
    }

    public final String getName() {
        return this.name;
    }

    public final Set<Qualified<? super T>> getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public final Set<Dependency> getDependencies() {
        return this.dependencies;
    }

    public final ComponentFactory<T> getFactory() {
        return this.factory;
    }

    public final Set<Class<?>> getPublishedEvents() {
        return this.publishedEvents;
    }

    public final boolean isAlwaysEager() {
        return this.instantiation == 1;
    }

    public final boolean isEagerInDefaultApp() {
        return this.instantiation == 2;
    }

    public final boolean isValue() {
        return this.type == 0;
    }

    public final Component<T> withFactory(ComponentFactory<T> componentFactory) {
        return new Component(this.name, this.providedInterfaces, this.dependencies, this.instantiation, this.type, componentFactory, this.publishedEvents);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.providedInterfaces.toArray()));
        sb.append(">{");
        sb.append(this.instantiation);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.dependencies.toArray()));
        sb.append("}");
        return sb.toString();
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>((Class) cls, (Class[]) clsArr);
    }

    public static <T> Builder<T> builder(Qualified<T> qualified) {
        return new Builder<>((Qualified) qualified, new Qualified[0]);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return new Builder<>((Qualified) qualified, (Qualified[]) qualifiedArr);
    }

    @SafeVarargs
    public static <T> Component<T> of(T t, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new Component$$ExternalSyntheticLambda0(t)).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).intoSet();
    }

    public static <T> Component<T> intoSet(T t, Class<T> cls) {
        return intoSetBuilder(cls).factory(new Component$$ExternalSyntheticLambda1(t)).build();
    }

    public static class Builder<T> {
        private final Set<Dependency> dependencies;
        private ComponentFactory<T> factory;
        private int instantiation;
        private String name;
        private final Set<Qualified<? super T>> providedInterfaces;
        private final Set<Class<?>> publishedEvents;
        private int type;

        @SafeVarargs
        private Builder(Class<T> cls, Class<? super T>... clsArr) {
            this.name = null;
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(Qualified.unqualified(cls));
            for (Class<? super T> cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
                this.providedInterfaces.add(Qualified.unqualified(cls2));
            }
        }

        @SafeVarargs
        private Builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
            this.name = null;
            HashSet hashSet = new HashSet();
            this.providedInterfaces = hashSet;
            this.dependencies = new HashSet();
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            Preconditions.checkNotNull(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified<? super T> checkNotNull : qualifiedArr) {
                Preconditions.checkNotNull(checkNotNull, "Null interface");
            }
            Collections.addAll(this.providedInterfaces, qualifiedArr);
        }

        public Builder<T> name(String str) {
            this.name = str;
            return this;
        }

        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            validateInterface(dependency.getInterface());
            this.dependencies.add(dependency);
            return this;
        }

        public Builder<T> alwaysEager() {
            return setInstantiation(1);
        }

        public Builder<T> eagerInDefaultApp() {
            return setInstantiation(2);
        }

        private Builder<T> setInstantiation(int i) {
            Preconditions.checkState(this.instantiation == 0, "Instantiation type has already been set.");
            this.instantiation = i;
            return this;
        }

        private void validateInterface(Qualified<?> qualified) {
            Preconditions.checkArgument(!this.providedInterfaces.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.factory = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        /* access modifiers changed from: private */
        public Builder<T> intoSet() {
            this.type = 1;
            return this;
        }

        public Component<T> build() {
            Preconditions.checkState(this.factory != null, "Missing required property: factory.");
            return new Component(this.name, new HashSet(this.providedInterfaces), new HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents);
        }
    }
}
