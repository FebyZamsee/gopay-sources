package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzau implements FusedLocationProviderApi {
    static /* synthetic */ TaskCompletionSource zza(BaseImplementation.ResultHolder resultHolder) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.getTask().addOnCompleteListener(new zzah(resultHolder));
        return taskCompletionSource;
    }

    public final PendingResult<Status> flushLocations(GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new zzaj(this, googleApiClient));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        r15 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location getLastLocation(com.google.android.gms.common.api.GoogleApiClient r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            if (r15 == 0) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            java.lang.String r3 = "GoogleApiClient parameter is required."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r2, r3)
            com.google.android.gms.common.api.Api$ClientKey r2 = com.google.android.gms.internal.location.zzbp.zza
            com.google.android.gms.common.api.Api$Client r15 = r15.getClient(r2)
            com.google.android.gms.internal.location.zzda r15 = (com.google.android.gms.internal.location.zzda) r15
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r1)
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource
            r4.<init>()
            r5 = 0
            com.google.android.gms.location.LastLocationRequest$Builder r6 = new com.google.android.gms.location.LastLocationRequest$Builder     // Catch:{ Exception -> 0x007a }
            r6.<init>()     // Catch:{ Exception -> 0x007a }
            com.google.android.gms.location.LastLocationRequest r6 = r6.build()     // Catch:{ Exception -> 0x007a }
            r15.zzt(r6, r4)     // Catch:{ Exception -> 0x007a }
            com.google.android.gms.tasks.Task r15 = r4.getTask()
            com.google.android.gms.internal.location.zzai r4 = new com.google.android.gms.internal.location.zzai
            r4.<init>(r2, r3)
            r15.addOnCompleteListener(r4)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 30
            long r6 = r15.toNanos(r6)     // Catch:{ all -> 0x006e }
            long r8 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006e }
            r10 = r6
        L_0x0049:
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x0062 }
            boolean r15 = r3.await(r10, r15)     // Catch:{ InterruptedException -> 0x0062 }
            if (r0 == 0) goto L_0x0058
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0058:
            if (r15 == 0) goto L_0x0061
            java.lang.Object r15 = r2.get()
            android.location.Location r15 = (android.location.Location) r15
            return r15
        L_0x0061:
            return r5
        L_0x0062:
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x006c }
            long r12 = r8 + r6
            long r10 = r12 - r10
            r0 = 1
            goto L_0x0049
        L_0x006c:
            r15 = move-exception
            goto L_0x0070
        L_0x006e:
            r15 = move-exception
            r1 = r0
        L_0x0070:
            if (r1 == 0) goto L_0x0079
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0079:
            throw r15
        L_0x007a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzau.getLastLocation(com.google.android.gms.common.api.GoogleApiClient):android.location.Location");
    }

    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient) {
        Preconditions.checkArgument(googleApiClient != null, "GoogleApiClient parameter is required.");
        try {
            return ((zzda) googleApiClient.getClient(zzbp.zza)).zzp();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zzao(this, googleApiClient, pendingIntent));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        return googleApiClient.execute(new zzam(this, googleApiClient, pendingIntent, locationRequest));
    }

    public final PendingResult<Status> setMockLocation(GoogleApiClient googleApiClient, Location location) {
        return googleApiClient.execute(new zzar(this, googleApiClient, location));
    }

    public final PendingResult<Status> setMockMode(GoogleApiClient googleApiClient, boolean z) {
        return googleApiClient.execute(new zzaq(this, googleApiClient, z));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationCallback locationCallback) {
        return googleApiClient.execute(new zzap(this, googleApiClient, locationCallback));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new zzal(this, googleApiClient, ListenerHolders.createListenerHolder(locationCallback, looper, "LocationCallback"), locationRequest));
    }

    public final PendingResult<Status> removeLocationUpdates(GoogleApiClient googleApiClient, LocationListener locationListener) {
        return googleApiClient.execute(new zzan(this, googleApiClient, locationListener));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        Looper myLooper = Looper.myLooper();
        Preconditions.checkNotNull(myLooper, "invalid null looper");
        return googleApiClient.execute(new zzak(this, googleApiClient, ListenerHolders.createListenerHolder(locationListener, myLooper, "LocationListener"), locationRequest));
    }

    public final PendingResult<Status> requestLocationUpdates(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            Preconditions.checkNotNull(looper, "invalid null looper");
        }
        return googleApiClient.execute(new zzak(this, googleApiClient, ListenerHolders.createListenerHolder(locationListener, looper, "LocationListener"), locationRequest));
    }
}
