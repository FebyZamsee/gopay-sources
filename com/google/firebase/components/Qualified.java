package com.google.firebase.components;

import java.lang.annotation.Annotation;

public final class Qualified<T> {
    private final Class<? extends Annotation> qualifier;
    private final Class<T> type;

    @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.qualifier = cls;
        this.type = cls2;
    }

    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (!this.type.equals(qualified.type)) {
            return false;
        }
        return this.qualifier.equals(qualified.qualifier);
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.qualifier.hashCode();
    }

    public final String toString() {
        if (this.qualifier == Unqualified.class) {
            return this.type.getName();
        }
        StringBuilder sb = new StringBuilder("@");
        sb.append(this.qualifier.getName());
        sb.append(" ");
        sb.append(this.type.getName());
        return sb.toString();
    }
}
