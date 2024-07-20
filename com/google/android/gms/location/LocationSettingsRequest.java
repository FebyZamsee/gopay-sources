package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new zzz();
    private final List zza;
    private final boolean zzb;
    private final boolean zzc;

    public static final class Builder {
        private final ArrayList zza = new ArrayList();
        private boolean zzb = false;
        private boolean zzc = false;

        public final Builder addAllLocationRequests(Collection<LocationRequest> collection) {
            for (LocationRequest next : collection) {
                if (next != null) {
                    this.zza.add(next);
                }
            }
            return this;
        }

        public final Builder addLocationRequest(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.zza.add(locationRequest);
            }
            return this;
        }

        public final LocationSettingsRequest build() {
            return new LocationSettingsRequest(this.zza, this.zzb, this.zzc);
        }

        public final Builder setAlwaysShow(boolean z) {
            this.zzb = z;
            return this;
        }

        public final Builder setNeedBle(boolean z) {
            this.zzc = z;
            return this;
        }
    }

    LocationSettingsRequest(List list, boolean z, boolean z2) {
        this.zza = list;
        this.zzb = z;
        this.zzc = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, Collections.unmodifiableList(this.zza), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
