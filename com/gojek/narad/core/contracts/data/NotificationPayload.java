package com.gojek.narad.core.contracts.data;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import o.AnimRes;

public final class NotificationPayload implements Serializable {
    private final Integer badge;
    private final String collapseId;
    private final HashMap<String, Object> data;
    private final long deviceTimeInMillis;
    private final boolean isNaradNotification;
    private final String message;
    private final String notificationId;
    private final String priority;
    private final String serverTimestamp;
    private final boolean silent;
    private final String sound;
    private final AnimRes source;
    private final String title;
    private final String transactionId;

    public static /* synthetic */ NotificationPayload copy$default(NotificationPayload notificationPayload, AnimRes animRes, String str, String str2, String str3, long j, String str4, String str5, String str6, HashMap hashMap, String str7, String str8, boolean z, Integer num, boolean z2, int i, Object obj) {
        NotificationPayload notificationPayload2 = notificationPayload;
        int i2 = i;
        return notificationPayload.copy((i2 & 1) != 0 ? notificationPayload2.source : animRes, (i2 & 2) != 0 ? notificationPayload2.notificationId : str, (i2 & 4) != 0 ? notificationPayload2.transactionId : str2, (i2 & 8) != 0 ? notificationPayload2.serverTimestamp : str3, (i2 & 16) != 0 ? notificationPayload2.deviceTimeInMillis : j, (i2 & 32) != 0 ? notificationPayload2.priority : str4, (i2 & 64) != 0 ? notificationPayload2.collapseId : str5, (i2 & 128) != 0 ? notificationPayload2.sound : str6, (i2 & 256) != 0 ? notificationPayload2.data : hashMap, (i2 & 512) != 0 ? notificationPayload2.title : str7, (i2 & 1024) != 0 ? notificationPayload2.message : str8, (i2 & 2048) != 0 ? notificationPayload2.silent : z, (i2 & 4096) != 0 ? notificationPayload2.badge : num, (i2 & 8192) != 0 ? notificationPayload2.isNaradNotification : z2);
    }

    public final AnimRes component1() {
        return this.source;
    }

    public final String component10() {
        return this.title;
    }

    public final String component11() {
        return this.message;
    }

    public final boolean component12() {
        return this.silent;
    }

    public final Integer component13() {
        return this.badge;
    }

    public final boolean component14() {
        return this.isNaradNotification;
    }

    public final String component2() {
        return this.notificationId;
    }

    public final String component3() {
        return this.transactionId;
    }

    public final String component4() {
        return this.serverTimestamp;
    }

    public final long component5() {
        return this.deviceTimeInMillis;
    }

    public final String component6() {
        return this.priority;
    }

    public final String component7() {
        return this.collapseId;
    }

    public final String component8() {
        return this.sound;
    }

    public final HashMap<String, Object> component9() {
        return this.data;
    }

    public final NotificationPayload copy(AnimRes animRes, String str, String str2, String str3, long j, String str4, String str5, String str6, HashMap<String, Object> hashMap, String str7, String str8, boolean z, Integer num, boolean z2) {
        AnimRes animRes2 = animRes;
        Intrinsics.checkNotNullParameter(animRes2, "");
        HashMap<String, Object> hashMap2 = hashMap;
        Intrinsics.checkNotNullParameter(hashMap2, "");
        return new NotificationPayload(animRes2, str, str2, str3, j, str4, str5, str6, hashMap2, str7, str8, z, num, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationPayload)) {
            return false;
        }
        NotificationPayload notificationPayload = (NotificationPayload) obj;
        return this.source == notificationPayload.source && Intrinsics.RemoteActionCompatParcelizer(this.notificationId, notificationPayload.notificationId) && Intrinsics.RemoteActionCompatParcelizer(this.transactionId, notificationPayload.transactionId) && Intrinsics.RemoteActionCompatParcelizer(this.serverTimestamp, notificationPayload.serverTimestamp) && this.deviceTimeInMillis == notificationPayload.deviceTimeInMillis && Intrinsics.RemoteActionCompatParcelizer(this.priority, notificationPayload.priority) && Intrinsics.RemoteActionCompatParcelizer(this.collapseId, notificationPayload.collapseId) && Intrinsics.RemoteActionCompatParcelizer(this.sound, notificationPayload.sound) && Intrinsics.RemoteActionCompatParcelizer(this.data, notificationPayload.data) && Intrinsics.RemoteActionCompatParcelizer(this.title, notificationPayload.title) && Intrinsics.RemoteActionCompatParcelizer(this.message, notificationPayload.message) && this.silent == notificationPayload.silent && Intrinsics.RemoteActionCompatParcelizer(this.badge, notificationPayload.badge) && this.isNaradNotification == notificationPayload.isNaradNotification;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationPayload(source=");
        sb.append(this.source);
        sb.append(", notificationId=");
        sb.append(this.notificationId);
        sb.append(", transactionId=");
        sb.append(this.transactionId);
        sb.append(", serverTimestamp=");
        sb.append(this.serverTimestamp);
        sb.append(", deviceTimeInMillis=");
        sb.append(this.deviceTimeInMillis);
        sb.append(", priority=");
        sb.append(this.priority);
        sb.append(", collapseId=");
        sb.append(this.collapseId);
        sb.append(", sound=");
        sb.append(this.sound);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", silent=");
        sb.append(this.silent);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", isNaradNotification=");
        sb.append(this.isNaradNotification);
        sb.append(')');
        return sb.toString();
    }

    public NotificationPayload(AnimRes animRes, String str, String str2, String str3, long j, String str4, String str5, String str6, HashMap<String, Object> hashMap, String str7, String str8, boolean z, Integer num, boolean z2) {
        Intrinsics.checkNotNullParameter(animRes, "");
        Intrinsics.checkNotNullParameter(hashMap, "");
        this.source = animRes;
        this.notificationId = str;
        this.transactionId = str2;
        this.serverTimestamp = str3;
        this.deviceTimeInMillis = j;
        this.priority = str4;
        this.collapseId = str5;
        this.sound = str6;
        this.data = hashMap;
        this.title = str7;
        this.message = str8;
        this.silent = z;
        this.badge = num;
        this.isNaradNotification = z2;
    }

    public final AnimRes getSource() {
        return this.source;
    }

    public final String getNotificationId() {
        return this.notificationId;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getServerTimestamp() {
        return this.serverTimestamp;
    }

    public final long getDeviceTimeInMillis() {
        return this.deviceTimeInMillis;
    }

    public final String getPriority() {
        return this.priority;
    }

    public final String getCollapseId() {
        return this.collapseId;
    }

    public final String getSound() {
        return this.sound;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NotificationPayload(o.AnimRes r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.util.HashMap r29, java.lang.String r30, java.lang.String r31, boolean r32, java.lang.Integer r33, boolean r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r21
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r22
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r23
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r26
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r27
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r28
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003e
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r13 = r1
            goto L_0x0040
        L_0x003e:
            r13 = r29
        L_0x0040:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0046
            r14 = r2
            goto L_0x0048
        L_0x0046:
            r14 = r30
        L_0x0048:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004e
            r15 = r2
            goto L_0x0050
        L_0x004e:
            r15 = r31
        L_0x0050:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0058
            r16 = 0
            goto L_0x005a
        L_0x0058:
            r16 = r32
        L_0x005a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0065
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r17 = r1
            goto L_0x0067
        L_0x0065:
            r17 = r33
        L_0x0067:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x006e
            r18 = 0
            goto L_0x0070
        L_0x006e:
            r18 = r34
        L_0x0070:
            r3 = r19
            r4 = r20
            r8 = r24
            r3.<init>(r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gojek.narad.core.contracts.data.NotificationPayload.<init>(o.AnimRes, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, boolean, java.lang.Integer, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final HashMap<String, Object> getData() {
        return this.data;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getSilent() {
        return this.silent;
    }

    public final Integer getBadge() {
        return this.badge;
    }

    public final boolean isNaradNotification() {
        return this.isNaradNotification;
    }

    public final int hashCode() {
        int hashCode = this.source.hashCode();
        String str = this.notificationId;
        int i = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.transactionId;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.serverTimestamp;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        long j = this.deviceTimeInMillis;
        int i2 = (int) (j ^ (j >>> 32));
        String str4 = this.priority;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.collapseId;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.sound;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        int hashCode8 = this.data.hashCode();
        String str7 = this.title;
        int hashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.message;
        int hashCode10 = str8 == null ? 0 : str8.hashCode();
        boolean z = this.silent;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        Integer num = this.badge;
        if (num != null) {
            i = num.hashCode();
        }
        boolean z3 = this.isNaradNotification;
        if (!z3) {
            z2 = z3;
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + (z ? 1 : 0)) * 31) + i) * 31) + (z2 ? 1 : 0);
    }
}
