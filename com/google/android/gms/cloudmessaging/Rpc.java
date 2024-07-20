package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc = zzz.zza;
    private static final Pattern zzd = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final SimpleArrayMap<String, TaskCompletionSource<Bundle>> zze = new SimpleArrayMap<>();
    private final Context zzf;
    private final zzt zzg;
    private final ScheduledExecutorService zzh;
    private Messenger zzi;
    private Messenger zzj;
    private zzd zzk;

    public Rpc(Context context) {
        this.zzf = context;
        this.zzg = new zzt(context);
        this.zzi = new Messenger(new zzaa(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.zzh = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task zza(Bundle bundle) throws Exception {
        if (zzi(bundle)) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    static /* synthetic */ void zzc(Rpc rpc, Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(new zzc());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof zzd) {
                    rpc.zzk = (zzd) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    rpc.zzj = (Messenger) parcelableExtra;
                }
            }
            Intent intent2 = (Intent) message.obj;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra == null) {
                    String stringExtra2 = intent2.getStringExtra("error");
                    if (stringExtra2 == null) {
                        intent2.getExtras();
                    } else if (stringExtra2.startsWith("|")) {
                        String[] split = stringExtra2.split("\\|");
                        if (split.length > 2 && "ID".equals(split[1])) {
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            rpc.zzh(str, intent2.putExtra("error", str2).getExtras());
                        }
                    } else {
                        synchronized (rpc.zze) {
                            for (int i = 0; i < rpc.zze.size(); i++) {
                                rpc.zzh(rpc.zze.keyAt(i), intent2.getExtras());
                            }
                        }
                    }
                } else {
                    Matcher matcher = zzd.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            rpc.zzh(group, extras);
                        }
                    } else if (!Log.isLoggable("Rpc", 3)) {
                    }
                }
            } else if (!Log.isLoggable("Rpc", 3)) {
            }
        }
    }

    private final Task<Bundle> zze(Bundle bundle) {
        String zzf2 = zzf();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.zze) {
            this.zze.put(zzf2, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.zzg.zzb() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        zzg(this.zzf, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(zzf2).length() + 5);
        sb.append("|ID|");
        sb.append(zzf2);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            intent.getExtras();
        }
        intent.putExtra("google.messenger", this.zzi);
        if (!(this.zzj == null && this.zzk == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.zzj;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.zzk.zzb(obtain);
                }
            } catch (RemoteException unused) {
            }
            taskCompletionSource.getTask().addOnCompleteListener(zzc, new zzw(this, zzf2, this.zzh.schedule(new zzy(taskCompletionSource), 30, TimeUnit.SECONDS)));
            return taskCompletionSource.getTask();
        }
        if (this.zzg.zzb() == 2) {
            this.zzf.sendBroadcast(intent);
        } else {
            this.zzf.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(zzc, new zzw(this, zzf2, this.zzh.schedule(new zzy(taskCompletionSource), 30, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    private static String zzf() {
        String num;
        synchronized (Rpc.class) {
            int i = zza;
            zza = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private static void zzg(Context context, Intent intent) {
        synchronized (Rpc.class) {
            if (zzb == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                zzb = zza.zza(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", zzb);
        }
    }

    private final void zzh(String str, Bundle bundle) {
        synchronized (this.zze) {
            TaskCompletionSource remove = this.zze.remove(str);
            if (remove != null) {
                remove.setResult(bundle);
            }
        }
    }

    private static boolean zzi(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task<Bundle> send(Bundle bundle) {
        if (this.zzg.zza() >= 12000000) {
            return zzs.zzb(this.zzf).zzd(1, bundle).continueWith(zzc, zzv.zza);
        }
        if (this.zzg.zzb() != 0) {
            return zze(bundle).continueWithTask(zzc, new zzu(this, bundle));
        }
        return Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    public final /* synthetic */ Task zzb(Bundle bundle, Task task) throws Exception {
        if (task.isSuccessful() && zzi((Bundle) task.getResult())) {
            return zze(bundle).onSuccessTask(zzc, zzx.zza);
        }
        return task;
    }

    public final /* synthetic */ void zzd(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.zze) {
            this.zze.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
