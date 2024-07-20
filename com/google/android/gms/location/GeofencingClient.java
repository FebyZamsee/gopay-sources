package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import java.util.List;

public interface GeofencingClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    Task<Void> addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent);

    Task<Void> removeGeofences(PendingIntent pendingIntent);

    Task<Void> removeGeofences(List<String> list);
}
