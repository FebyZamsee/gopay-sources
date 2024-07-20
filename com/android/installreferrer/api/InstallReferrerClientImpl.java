package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import o.MenuBuilder;

final class InstallReferrerClientImpl extends InstallReferrerClient {
    /* access modifiers changed from: private */
    public int RemoteActionCompatParcelizer = 0;
    private ServiceConnection asBinder;
    private final Context onTransact;
    /* access modifiers changed from: private */
    public MenuBuilder read;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    final class read implements ServiceConnection {
        private final InstallReferrerStateListener asBinder;

        private read(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.asBinder = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        /* synthetic */ read(InstallReferrerClientImpl installReferrerClientImpl, InstallReferrerStateListener installReferrerStateListener, byte b) {
            this(installReferrerStateListener);
        }

        /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
            /*
                r2 = this;
                java.lang.String r3 = "InstallReferrerClient"
                java.lang.String r0 = "Install Referrer service connected."
                com.android.installreferrer.commons.InstallReferrerCommons.logVerbose(r3, r0)
                com.android.installreferrer.api.InstallReferrerClientImpl r3 = com.android.installreferrer.api.InstallReferrerClientImpl.this
                if (r4 != 0) goto L_0x000d
                r4 = 0
                goto L_0x0021
            L_0x000d:
                java.lang.String r0 = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService"
                android.os.IInterface r0 = r4.queryLocalInterface(r0)
                boolean r1 = r0 instanceof o.MenuBuilder
                if (r1 == 0) goto L_0x001b
                r4 = r0
                o.MenuBuilder r4 = (o.MenuBuilder) r4
                goto L_0x0021
            L_0x001b:
                o.MenuBuilder$asInterface$read r0 = new o.MenuBuilder$asInterface$read
                r0.<init>(r4)
                r4 = r0
            L_0x0021:
                o.MenuBuilder unused = r3.read = r4
                com.android.installreferrer.api.InstallReferrerClientImpl r3 = com.android.installreferrer.api.InstallReferrerClientImpl.this
                r4 = 2
                int unused = r3.RemoteActionCompatParcelizer = r4
                com.android.installreferrer.api.InstallReferrerStateListener r3 = r2.asBinder
                r4 = 0
                r3.onInstallReferrerSetupFinished(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.installreferrer.api.InstallReferrerClientImpl.read.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            MenuBuilder unused = InstallReferrerClientImpl.this.read = null;
            int unused2 = InstallReferrerClientImpl.this.RemoteActionCompatParcelizer = 0;
            this.asBinder.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.onTransact = context.getApplicationContext();
    }

    public final boolean isReady() {
        return (this.RemoteActionCompatParcelizer != 2 || this.read == null || this.asBinder == null) ? false : true;
    }

    public final void endConnection() {
        this.RemoteActionCompatParcelizer = 3;
        if (this.asBinder != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.onTransact.unbindService(this.asBinder);
            this.asBinder = null;
        }
        this.read = null;
    }

    public final ReferrerDetails getInstallReferrer() throws RemoteException {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.onTransact.getPackageName());
            try {
                return new ReferrerDetails(this.read.onTransact(bundle));
            } catch (RemoteException e) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.RemoteActionCompatParcelizer = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    private boolean read() {
        try {
            return this.onTransact.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.onTransact.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null || !read()) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                        this.RemoteActionCompatParcelizer = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    Intent intent2 = new Intent(intent);
                    read read2 = new read(this, installReferrerStateListener, (byte) 0);
                    this.asBinder = read2;
                    if (this.onTransact.bindService(intent2, read2, 1)) {
                        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                        return;
                    }
                    InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                    this.RemoteActionCompatParcelizer = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(1);
                    return;
                }
            }
            this.RemoteActionCompatParcelizer = 0;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        }
    }
}
