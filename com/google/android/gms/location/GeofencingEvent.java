package com.google.android.gms.location;

import android.location.Location;
import java.util.List;

public class GeofencingEvent {
    private final int zza;
    private final int zzb;
    private final List zzc;
    private final Location zzd;

    private GeofencingEvent(int i, int i2, List list, Location location) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = list;
        this.zzd = location;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.GeofencingEvent fromIntent(android.content.Intent r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = -1
            java.lang.String r2 = "gms_error_code"
            int r2 = r12.getIntExtra(r2, r1)
            java.lang.String r3 = "com.google.android.location.intent.extra.transition"
            int r3 = r12.getIntExtra(r3, r1)
            r4 = 4
            if (r3 != r1) goto L_0x0015
            goto L_0x001f
        L_0x0015:
            r5 = 1
            if (r3 == r5) goto L_0x0020
            r5 = 2
            if (r3 == r5) goto L_0x0020
            if (r3 != r4) goto L_0x001f
            r3 = 4
            goto L_0x0020
        L_0x001f:
            r3 = -1
        L_0x0020:
            java.lang.String r4 = "com.google.android.location.intent.extra.geofence_list"
            java.io.Serializable r4 = r12.getSerializableExtra(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x002c
            r5 = r0
            goto L_0x005f
        L_0x002c:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            r5.<init>(r6)
            int r6 = r4.size()
            r7 = 0
            r8 = 0
        L_0x003b:
            if (r8 >= r6) goto L_0x005f
            java.lang.Object r9 = r4.get(r8)
            byte[] r9 = (byte[]) r9
            android.os.Parcel r10 = android.os.Parcel.obtain()
            int r11 = r9.length
            r10.unmarshall(r9, r7, r11)
            r10.setDataPosition(r7)
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzdh> r9 = com.google.android.gms.internal.location.zzdh.CREATOR
            java.lang.Object r9 = r9.createFromParcel(r10)
            com.google.android.gms.internal.location.zzdh r9 = (com.google.android.gms.internal.location.zzdh) r9
            r10.recycle()
            r5.add(r9)
            int r8 = r8 + 1
            goto L_0x003b
        L_0x005f:
            java.lang.String r4 = "com.google.android.location.intent.extra.triggering_location"
            android.os.Parcelable r12 = r12.getParcelableExtra(r4)
            android.location.Location r12 = (android.location.Location) r12
            if (r5 != 0) goto L_0x006c
            if (r2 != r1) goto L_0x006c
            return r0
        L_0x006c:
            com.google.android.gms.location.GeofencingEvent r0 = new com.google.android.gms.location.GeofencingEvent
            r0.<init>(r2, r3, r5, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.GeofencingEvent.fromIntent(android.content.Intent):com.google.android.gms.location.GeofencingEvent");
    }

    public int getErrorCode() {
        return this.zza;
    }

    public int getGeofenceTransition() {
        return this.zzb;
    }

    public List<Geofence> getTriggeringGeofences() {
        return this.zzc;
    }

    public Location getTriggeringLocation() {
        return this.zzd;
    }

    public boolean hasError() {
        return this.zza != -1;
    }
}