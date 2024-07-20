package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.privacysandbox.ads.adservices.adid.AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

public class FcmBroadcastProcessor {
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock = new Object();
    private final Context context;
    private final Executor executor = new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0();

    public FcmBroadcastProcessor(Context context2) {
        this.context = context2;
    }

    public Task<Integer> process(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return startMessagingService(this.context, intent);
    }

    public Task<Integer> startMessagingService(Context context2, Intent intent) {
        boolean z = true;
        boolean z2 = PlatformVersion.isAtLeastO() && context2.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (!z2 || z) {
            return Tasks.call(this.executor, new FcmBroadcastProcessor$$ExternalSyntheticLambda0(context2, intent)).continueWithTask(this.executor, new FcmBroadcastProcessor$$ExternalSyntheticLambda1(context2, intent, z));
        }
        return bindToMessagingService(context2, intent, false);
    }

    static /* synthetic */ Task lambda$startMessagingService$2(Context context2, Intent intent, boolean z, Task task) throws Exception {
        return (!PlatformVersion.isAtLeastO() || ((Integer) task.getResult()).intValue() != 402) ? task : bindToMessagingService(context2, intent, z).continueWith(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), new FcmBroadcastProcessor$$ExternalSyntheticLambda2());
    }

    static /* synthetic */ Integer lambda$startMessagingService$1(Task task) throws Exception {
        return 403;
    }

    private static Task<Integer> bindToMessagingService(Context context2, Intent intent, boolean z) {
        WithinAppServiceConnection serviceConnection = getServiceConnection(context2, "com.google.firebase.MESSAGING_EVENT");
        if (!z) {
            return serviceConnection.sendIntent(intent).continueWith(new AdIdManager$Api33Ext4Impl$$ExternalSyntheticLambda0(), new FcmBroadcastProcessor$$ExternalSyntheticLambda3());
        }
        if (ServiceStarter.getInstance().hasWakeLockPermission(context2)) {
            WakeLockHolder.sendWakefulServiceIntent(context2, serviceConnection, intent);
        } else {
            serviceConnection.sendIntent(intent);
        }
        return Tasks.forResult(-1);
    }

    static /* synthetic */ Integer lambda$bindToMessagingService$3(Task task) throws Exception {
        return -1;
    }

    private static WithinAppServiceConnection getServiceConnection(Context context2, String str) {
        WithinAppServiceConnection withinAppServiceConnection;
        synchronized (lock) {
            if (fcmServiceConn == null) {
                fcmServiceConn = new WithinAppServiceConnection(context2, str);
            }
            withinAppServiceConnection = fcmServiceConn;
        }
        return withinAppServiceConnection;
    }
}