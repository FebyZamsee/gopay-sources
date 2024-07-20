package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

public final class CloudMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CloudMessage> CREATOR = new zza();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;
    Intent zza;
    private Map<String, String> zzb;

    @Target({ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public CloudMessage(Intent intent) {
        this.zza = intent;
    }

    private static int zza(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public final String getCollapseKey() {
        return this.zza.getStringExtra("collapse_key");
    }

    public final Map<String, String> getData() {
        Map<String, String> map;
        synchronized (this) {
            if (this.zzb == null) {
                Bundle extras = this.zza.getExtras();
                ArrayMap arrayMap = new ArrayMap();
                if (extras != null) {
                    for (String str : extras.keySet()) {
                        Object obj = extras.get(str);
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            if (!str.startsWith("google.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                                arrayMap.put(str, str2);
                            }
                        }
                    }
                }
                this.zzb = arrayMap;
            }
            map = this.zzb;
        }
        return map;
    }

    public final String getFrom() {
        return this.zza.getStringExtra("from");
    }

    public final Intent getIntent() {
        return this.zza;
    }

    public final String getMessageId() {
        String stringExtra = this.zza.getStringExtra("google.message_id");
        return stringExtra == null ? this.zza.getStringExtra("message_id") : stringExtra;
    }

    public final String getMessageType() {
        return this.zza.getStringExtra("message_type");
    }

    public final int getOriginalPriority() {
        String stringExtra = this.zza.getStringExtra("google.original_priority");
        if (stringExtra == null) {
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zza(stringExtra);
    }

    public final int getPriority() {
        String stringExtra = this.zza.getStringExtra("google.delivered_priority");
        if (stringExtra == null) {
            if ("1".equals(this.zza.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            stringExtra = this.zza.getStringExtra("google.priority");
        }
        return zza(stringExtra);
    }

    public final byte[] getRawData() {
        return this.zza.getByteArrayExtra("rawData");
    }

    public final String getSenderId() {
        return this.zza.getStringExtra("google.c.sender.id");
    }

    public final long getSentTime() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.sent_time") : null;
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final String getTo() {
        return this.zza.getStringExtra("google.to");
    }

    public final int getTtl() {
        Bundle extras = this.zza.getExtras();
        Object obj = extras != null ? extras.get("google.ttl") : null;
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
