package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class SaveAccountLinkingTokenResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenResult> CREATOR = new zbh();
    private final PendingIntent zba;

    public SaveAccountLinkingTokenResult(PendingIntent pendingIntent) {
        this.zba = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenResult)) {
            return false;
        }
        return Objects.equal(this.zba, ((SaveAccountLinkingTokenResult) obj).zba);
    }

    public PendingIntent getPendingIntent() {
        return this.zba;
    }

    public boolean hasResolution() {
        return this.zba != null;
    }

    public int hashCode() {
        return Objects.hashCode(this.zba);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}