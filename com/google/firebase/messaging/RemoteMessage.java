package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.messaging.Constants;
import java.util.Map;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    Bundle bundle;
    private Map<String, String> data;

    public RemoteMessage(Bundle bundle2) {
        this.bundle = bundle2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        RemoteMessageCreator.writeToParcel(this, parcel, i);
    }

    public final Map<String, String> getData() {
        if (this.data == null) {
            this.data = Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.bundle);
        }
        return this.data;
    }

    public final int getPriority() {
        String string = this.bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(this.bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = this.bundle.getString("google.priority");
        }
        return getMessagePriority(string);
    }

    private int getMessagePriority(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }
}
