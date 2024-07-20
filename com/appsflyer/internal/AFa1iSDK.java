package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.appsflyer.AFLogger;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@Deprecated
final class AFa1iSDK {
    AFa1iSDK() {
    }

    static AFa1xSDK valueOf(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            AFa1zSDK aFa1zSDK = new AFa1zSDK((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (!context.bindService(intent, aFa1zSDK, 1)) {
                    if (context != null) {
                        context.unbindService(aFa1zSDK);
                    }
                    throw new IOException("Google Play connection failed");
                } else if (!aFa1zSDK.AFInAppEventType) {
                    aFa1zSDK.AFInAppEventType = true;
                    IBinder poll = aFa1zSDK.values.poll(10, TimeUnit.SECONDS);
                    if (poll != null) {
                        AFa1wSDK aFa1wSDK = new AFa1wSDK(poll);
                        return new AFa1xSDK(aFa1wSDK.valueOf(), aFa1wSDK.AFInAppEventParameterName());
                    }
                    throw new TimeoutException("Timed out waiting for the service connection");
                } else {
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
            } finally {
                if (context != null) {
                    context.unbindService(aFa1zSDK);
                }
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    static final class AFa1xSDK {
        final String AFInAppEventParameterName;
        private final boolean values;

        AFa1xSDK(String str, boolean z) {
            this.AFInAppEventParameterName = str;
            this.values = z;
        }

        /* access modifiers changed from: package-private */
        public final boolean AFInAppEventParameterName() {
            return this.values;
        }
    }

    static final class AFa1zSDK implements ServiceConnection {
        boolean AFInAppEventType;
        final LinkedBlockingQueue<IBinder> values;

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        private AFa1zSDK() {
            this.values = new LinkedBlockingQueue<>(1);
            this.AFInAppEventType = false;
        }

        /* synthetic */ AFa1zSDK(byte b) {
            this();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.values.put(iBinder);
            } catch (InterruptedException e) {
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }
    }

    static final class AFa1wSDK implements IInterface {
        private final IBinder values;

        AFa1wSDK(IBinder iBinder) {
            this.values = iBinder;
        }

        public final IBinder asBinder() {
            return this.values;
        }

        public final String valueOf() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.values.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean AFInAppEventParameterName() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.values.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
}
