package com.google.android.gms.common.api;

import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public class AvailabilityException extends Exception {
    private final ArrayMap zaa;

    public AvailabilityException(ArrayMap arrayMap) {
        this.zaa = arrayMap;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        String zaa2 = apiKey.zaa();
        StringBuilder sb = new StringBuilder("The given API (");
        sb.append(zaa2);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (ApiKey apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            String zaa2 = apiKey.zaa();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder();
            sb.append(zaa2);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        String zaa2 = apiKey.zaa();
        StringBuilder sb = new StringBuilder("The given API (");
        sb.append(zaa2);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
