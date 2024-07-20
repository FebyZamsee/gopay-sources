package com.google.android.gms.internal.p001authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api.zbag  reason: invalid package */
public final class zbag extends zba implements IInterface {
    zbag(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zby zby, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zby);
        zbc.zbb(zba, beginSignInRequest);
        zbb(1, zba);
    }

    public final void zbd(zbab zbab, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, zbab);
        zbc.zbb(zba, getSignInIntentRequest);
        zbb(3, zba);
    }

    public final void zbe(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zba = zba();
        zbc.zbc(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}
