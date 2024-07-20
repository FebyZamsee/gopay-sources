package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks;
import com.google.firebase.dynamiclinks.internal.IDynamicLinksService;

public class DynamicLinksClient extends GmsClient<IDynamicLinksService> {
    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    public String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    public boolean usesClientTelemetry() {
        return true;
    }

    public DynamicLinksClient(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 131, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    /* access modifiers changed from: protected */
    public IDynamicLinksService createServiceInterface(IBinder iBinder) {
        return IDynamicLinksService.Stub.asInterface(iBinder);
    }

    /* access modifiers changed from: package-private */
    public void getDynamicLink(IDynamicLinksCallbacks.Stub stub, String str) {
        try {
            ((IDynamicLinksService) getService()).getDynamicLink(stub, str);
        } catch (RemoteException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void createShortDynamicLink(IDynamicLinksCallbacks.Stub stub, Bundle bundle) {
        try {
            ((IDynamicLinksService) getService()).createShortDynamicLink(stub, bundle);
        } catch (RemoteException unused) {
        }
    }
}
