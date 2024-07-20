package com.google.firebase.remoteconfig;

import java.util.Set;

final class AutoValue_ConfigUpdate extends ConfigUpdate {
    private final Set<String> updatedKeys;

    AutoValue_ConfigUpdate(Set<String> set) {
        if (set != null) {
            this.updatedKeys = set;
            return;
        }
        throw new NullPointerException("Null updatedKeys");
    }

    public final Set<String> getUpdatedKeys() {
        return this.updatedKeys;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigUpdate{updatedKeys=");
        sb.append(this.updatedKeys);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigUpdate) {
            return this.updatedKeys.equals(((ConfigUpdate) obj).getUpdatedKeys());
        }
        return false;
    }

    public final int hashCode() {
        return this.updatedKeys.hashCode() ^ 1000003;
    }
}
