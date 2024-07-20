package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import io.flutter.plugins.firebase.crashlytics.Constants;

final class zabs {
    /* access modifiers changed from: private */
    public final ApiKey zaa;
    /* access modifiers changed from: private */
    public final Feature zab;

    /* synthetic */ zabs(ApiKey apiKey, Feature feature, zabr zabr) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zabs)) {
            return false;
        }
        zabs zabs = (zabs) obj;
        return Objects.equal(this.zaa, zabs.zaa) && Objects.equal(this.zab, zabs.zab);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa, this.zab);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(Constants.KEY, this.zaa).add("feature", this.zab).toString();
    }
}
