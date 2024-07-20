package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new zzm();
    private static final String zza = "PatternItem";
    private final int zzb;
    private final Float zzc;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        StringBuilder sb = new StringBuilder("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(f);
        Preconditions.checkArgument(z, sb.toString());
        this.zzb = i;
        this.zzc = f;
    }

    static List zza(List list) {
        PatternItem patternItem;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PatternItem patternItem2 = (PatternItem) it.next();
            if (patternItem2 == null) {
                patternItem2 = null;
            } else {
                int i = patternItem2.zzb;
                boolean z = false;
                if (i == 0) {
                    if (patternItem2.zzc != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    patternItem = new Dash(patternItem2.zzc.floatValue());
                } else if (i == 1) {
                    patternItem2 = new Dot();
                } else if (i == 2) {
                    if (patternItem2.zzc != null) {
                        z = true;
                    }
                    Preconditions.checkState(z, "length must not be null.");
                    patternItem = new Gap(patternItem2.zzc.floatValue());
                }
                patternItem2 = patternItem;
            }
            arrayList.add(patternItem2);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.zzb == patternItem.zzb && Objects.equal(this.zzc, patternItem.zzc);
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzb), this.zzc);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[PatternItem: type=");
        sb.append(this.zzb);
        sb.append(" length=");
        sb.append(this.zzc);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}