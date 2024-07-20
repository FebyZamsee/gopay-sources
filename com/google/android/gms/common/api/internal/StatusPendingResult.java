package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class StatusPendingResult extends BasePendingResult<Status> {
    @Deprecated
    public StatusPendingResult(Looper looper) {
        super(looper);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    public StatusPendingResult(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }
}
