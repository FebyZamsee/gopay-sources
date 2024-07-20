package com.gojek.alarm.pingsender;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.gojek.courier.utils.AppStateProvider;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0;
import o.AsyncLayoutInflater;
import o.C$r8$lambda$KrBLxNpMJdSxVU3Lsj65hn0UyA;
import o.CustomTabsService;
import o.CustomTabsService$1$$ExternalSyntheticLambda0;
import o.CustomTabsServiceConnection;
import o.OnBackPressedDispatcherKt;
import o.createPostMessageExtraBundle;
import o.removeOnReportDrawnListener;
import o.reportRunnable$lambda$2;

public final class AlarmPingSender implements ActivityResultContracts.PickMultipleVisualMedia, LifecycleObserver {
    private volatile boolean AudioAttributesCompatParcelizer;
    /* access modifiers changed from: private */
    public final removeOnReportDrawnListener AudioAttributesImplApi21Parcelizer;
    /* access modifiers changed from: private */
    public CustomTabsService.Relation AudioAttributesImplApi26Parcelizer;
    /* access modifiers changed from: private */
    public ActivityResultContracts.PickMultipleVisualMedia.Companion AudioAttributesImplBaseParcelizer;
    /* access modifiers changed from: private */
    public createPostMessageExtraBundle IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final AppStateProvider RemoteActionCompatParcelizer;
    /* access modifiers changed from: private */
    public final AtomicInteger asBinder;
    /* access modifiers changed from: private */
    public final C$r8$lambda$KrBLxNpMJdSxVU3Lsj65hn0UyA asInterface;
    private PendingIntent onConnectionSuspended;
    /* access modifiers changed from: private */
    public final Context onTransact;
    private final asInterface read;
    private final reportRunnable$lambda$2 write;

    static {
        new onTransact((DefaultConstructorMarker) null);
    }

    private AlarmPingSender(Context context, C$r8$lambda$KrBLxNpMJdSxVU3Lsj65hn0UyA r3, removeOnReportDrawnListener removeonreportdrawnlistener, reportRunnable$lambda$2 reportrunnable_lambda_2, AppStateProvider appStateProvider) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(r3, "");
        Intrinsics.checkNotNullParameter(removeonreportdrawnlistener, "");
        Intrinsics.checkNotNullParameter(reportrunnable_lambda_2, "");
        Intrinsics.checkNotNullParameter(appStateProvider, "");
        this.onTransact = context;
        this.asInterface = r3;
        this.AudioAttributesImplApi21Parcelizer = removeonreportdrawnlistener;
        this.write = reportrunnable_lambda_2;
        this.RemoteActionCompatParcelizer = appStateProvider;
        this.read = new asInterface(this);
        this.AudioAttributesImplBaseParcelizer = new AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0();
        this.asBinder = new AtomicInteger(0);
        new Handler(Looper.getMainLooper()).post(new OnBackPressedDispatcherKt.asBinder(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AlarmPingSender(Context context, C$r8$lambda$KrBLxNpMJdSxVU3Lsj65hn0UyA r8, removeOnReportDrawnListener removeonreportdrawnlistener, reportRunnable$lambda$2 reportrunnable_lambda_2, AppStateProvider appStateProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r8, (i & 4) != 0 ? new removeOnReportDrawnListener() : removeonreportdrawnlistener, (i & 8) != 0 ? new reportRunnable$lambda$2() : reportrunnable_lambda_2, (i & 16) != 0 ? new AppStateProvider() : appStateProvider);
    }

    public final void asBinder(createPostMessageExtraBundle createpostmessageextrabundle, CustomTabsService.Relation relation) {
        Intrinsics.checkNotNullParameter(createpostmessageextrabundle, "");
        Intrinsics.checkNotNullParameter(relation, "");
        this.IconCompatParcelizer = createpostmessageextrabundle;
        this.AudioAttributesImplApi26Parcelizer = relation;
    }

    public final void RemoteActionCompatParcelizer() {
        CustomTabsService.Relation relation = this.AudioAttributesImplApi26Parcelizer;
        CustomTabsService.Relation relation2 = null;
        if (relation == null) {
            Intrinsics.asBinder("");
            relation = null;
        }
        relation.asBinder("AlarmPingSender", Intrinsics.read("Register alarmreceiver to MqttService", "com.gojek.mqtt.pingSender"));
        try {
            this.onTransact.registerReceiver(this.read, new IntentFilter("com.gojek.mqtt.pingSender"));
            Context context = this.onTransact;
            Intent intent = new Intent("com.gojek.mqtt.pingSender");
            int i = 134217728;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 201326592;
            }
            this.onConnectionSuspended = PendingIntent.getBroadcast(context, 0, intent, i);
            createPostMessageExtraBundle createpostmessageextrabundle = this.IconCompatParcelizer;
            if (createpostmessageextrabundle == null) {
                Intrinsics.asBinder("");
                createpostmessageextrabundle = null;
            }
            onTransact(createpostmessageextrabundle.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer);
            this.AudioAttributesCompatParcelizer = true;
        } catch (SecurityException e) {
            CustomTabsService.Relation relation3 = this.AudioAttributesImplApi26Parcelizer;
            if (relation3 == null) {
                Intrinsics.asBinder("");
            } else {
                relation2 = relation3;
            }
            relation2.onTransact("AlarmPingSender", "Security Exception while registering Alarm Broadcast Receiver");
            this.AudioAttributesImplBaseParcelizer.asBinder(e);
        }
    }

    public final void asBinder() {
        createPostMessageExtraBundle createpostmessageextrabundle = null;
        try {
            Object systemService = this.onTransact.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (systemService != null) {
                AlarmManager alarmManager = (AlarmManager) systemService;
                PendingIntent pendingIntent = this.onConnectionSuspended;
                if (pendingIntent != null) {
                    alarmManager.cancel(pendingIntent);
                }
                CustomTabsService.Relation relation = this.AudioAttributesImplApi26Parcelizer;
                if (relation == null) {
                    Intrinsics.asBinder("");
                    relation = null;
                }
                createPostMessageExtraBundle createpostmessageextrabundle2 = this.IconCompatParcelizer;
                if (createpostmessageextrabundle2 == null) {
                    Intrinsics.asBinder("");
                } else {
                    createpostmessageextrabundle = createpostmessageextrabundle2;
                }
                relation.asBinder("AlarmPingSender", Intrinsics.read("Unregister alarmreceiver to MqttService", createpostmessageextrabundle.asBinder.asBinder()));
                if (this.AudioAttributesCompatParcelizer) {
                    this.AudioAttributesCompatParcelizer = false;
                    try {
                        this.onTransact.unregisterReceiver(this.read);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                this.asBinder.set(0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        } catch (Exception e) {
            CustomTabsService.Relation relation2 = this.AudioAttributesImplApi26Parcelizer;
            if (relation2 == null) {
                Intrinsics.asBinder("");
                relation2 = null;
            }
            relation2.asBinder("AlarmPingSender", Intrinsics.read("Unregister alarmreceiver to MqttService", e));
        }
    }

    public final void onTransact(long j) {
        long j2;
        int i;
        CustomTabsService.Relation relation = null;
        if (this.onConnectionSuspended == null) {
            CustomTabsService.Relation relation2 = this.AudioAttributesImplApi26Parcelizer;
            if (relation2 == null) {
                Intrinsics.asBinder("");
            } else {
                relation = relation2;
            }
            relation.asBinder("AlarmPingSender", "Pending intent is null");
            return;
        }
        try {
            if (this.asInterface.write) {
                j2 = SystemClock.elapsedRealtime();
            } else {
                j2 = System.currentTimeMillis();
            }
            long j3 = j2 + j;
            CustomTabsService.Relation relation3 = this.AudioAttributesImplApi26Parcelizer;
            if (relation3 == null) {
                Intrinsics.asBinder("");
                relation3 = null;
            }
            relation3.asBinder("AlarmPingSender", Intrinsics.read("Schedule next alarm at ", Long.valueOf(j3)));
            Object systemService = this.onTransact.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (systemService != null) {
                AlarmManager alarmManager = (AlarmManager) systemService;
                C$r8$lambda$KrBLxNpMJdSxVU3Lsj65hn0UyA r6 = this.asInterface;
                if (!r6.onTransact || !r6.write) {
                    if (!r6.onTransact || r6.write) {
                        if (!r6.onTransact && r6.write) {
                            i = 3;
                        } else if (!r6.onTransact && !r6.write) {
                            i = 1;
                        }
                    }
                    i = 0;
                } else {
                    i = 2;
                }
                if (!this.asInterface.read || !reportRunnable$lambda$2.asBinder()) {
                    alarmManager.setExact(i, j3, this.onConnectionSuspended);
                } else {
                    alarmManager.setExactAndAllowWhileIdle(i, j3, this.onConnectionSuspended);
                }
                ActivityResultContracts.PickMultipleVisualMedia.Companion companion = this.AudioAttributesImplBaseParcelizer;
                long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
                createPostMessageExtraBundle createpostmessageextrabundle = this.IconCompatParcelizer;
                if (createpostmessageextrabundle == null) {
                    Intrinsics.asBinder("");
                    createpostmessageextrabundle = null;
                }
                companion.read(seconds, TimeUnit.MILLISECONDS.toSeconds(createpostmessageextrabundle.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.AlarmManager");
        } catch (Exception e) {
            CustomTabsService.Relation relation4 = this.AudioAttributesImplApi26Parcelizer;
            if (relation4 == null) {
                Intrinsics.asBinder("");
            } else {
                relation = relation4;
            }
            relation.asBinder("AlarmPingSender", Intrinsics.read(" Exception while sceduling Alaram due to ", e));
            this.AudioAttributesImplBaseParcelizer.asBinder(e);
        }
    }

    public final void onTransact(ActivityResultContracts.PickMultipleVisualMedia.Companion companion) {
        Intrinsics.checkNotNullParameter(companion, "");
        this.AudioAttributesImplBaseParcelizer = companion;
    }

    final class asInterface extends BroadcastReceiver {
        private /* synthetic */ AlarmPingSender RemoteActionCompatParcelizer;
        PowerManager.WakeLock asBinder;

        public asInterface(AlarmPingSender alarmPingSender) {
            Intrinsics.checkNotNullParameter(alarmPingSender, "");
            this.RemoteActionCompatParcelizer = alarmPingSender;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: o.createPostMessageExtraBundle} */
        /* JADX WARNING: type inference failed for: r11v1 */
        /* JADX WARNING: type inference failed for: r11v5, types: [o.CustomTabsService$Relation] */
        /* JADX WARNING: type inference failed for: r11v6 */
        /* JADX WARNING: type inference failed for: r11v7, types: [o.CustomTabsService$Relation] */
        /* JADX WARNING: type inference failed for: r11v8 */
        /* JADX WARNING: type inference failed for: r11v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceive(android.content.Context r10, android.content.Intent r11) {
            /*
                r9 = this;
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.CustomTabsService$Relation r10 = r10.AudioAttributesImplApi26Parcelizer
                r11 = 0
                if (r10 != 0) goto L_0x0015
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                r10 = r11
            L_0x0015:
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.String r2 = "Check time :"
                java.lang.String r1 = kotlin.jvm.internal.Intrinsics.read(r2, r1)
                java.lang.String r2 = "AlarmPingSender"
                r10.asBinder(r2, r1)
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.CustomTabsService$Relation r10 = r10.AudioAttributesImplApi26Parcelizer
                if (r10 != 0) goto L_0x0033
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
            L_0x0033:
                o.AsyncLayoutInflater$read r8 = new o.AsyncLayoutInflater$read
                r8.<init>()
                r8.onTransact = r0
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.createPostMessageExtraBundle r10 = r10.IconCompatParcelizer
                if (r10 != 0) goto L_0x0046
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                r10 = r11
            L_0x0046:
                o.requestPostMessageChannelWithExtras r10 = r10.asBinder
                if (r10 == 0) goto L_0x0061
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.createPostMessageExtraBundle r10 = r10.IconCompatParcelizer
                if (r10 != 0) goto L_0x0056
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                r10 = r11
            L_0x0056:
                o.requestPostMessageChannelWithExtras r10 = r10.asBinder
                java.lang.String r10 = r10.read()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
                r8.onTransact = r10
            L_0x0061:
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.ActivityResultContracts$PickMultipleVisualMedia$Companion r10 = r10.AudioAttributesImplBaseParcelizer
                T r1 = r8.onTransact
                java.lang.String r1 = (java.lang.String) r1
                com.gojek.alarm.pingsender.AlarmPingSender r3 = r9.RemoteActionCompatParcelizer
                o.createPostMessageExtraBundle r3 = r3.IconCompatParcelizer
                if (r3 != 0) goto L_0x0077
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                r3 = r11
            L_0x0077:
                o.getBinder r3 = r3.RemoteActionCompatParcelizer
                long r3 = r3.AudioAttributesImplApi21Parcelizer
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r3 = r5.toSeconds(r3)
                r10.asBinder(r1, r3)
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.createPostMessageExtraBundle r10 = r10.IconCompatParcelizer
                if (r10 != 0) goto L_0x0090
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                r10 = r11
            L_0x0090:
                o.createMockSessionForTesting r10 = r10.RemoteActionCompatParcelizer()
                o.CustomTabsServiceConnection r10 = (o.CustomTabsServiceConnection) r10
                if (r10 != 0) goto L_0x00c2
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                r10.asBinder.set(0)
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.ActivityResultContracts$PickMultipleVisualMedia$Companion r10 = r10.AudioAttributesImplBaseParcelizer
                T r1 = r8.onTransact
                java.lang.String r1 = (java.lang.String) r1
                com.gojek.alarm.pingsender.AlarmPingSender r2 = r9.RemoteActionCompatParcelizer
                o.createPostMessageExtraBundle r2 = r2.IconCompatParcelizer
                if (r2 != 0) goto L_0x00b3
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                goto L_0x00b4
            L_0x00b3:
                r11 = r2
            L_0x00b4:
                o.getBinder r11 = r11.RemoteActionCompatParcelizer
                long r2 = r11.AudioAttributesImplApi21Parcelizer
                java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS
                long r2 = r11.toSeconds(r2)
                r10.RemoteActionCompatParcelizer(r1, r2)
                return
            L_0x00c2:
                com.gojek.alarm.pingsender.AlarmPingSender r1 = r9.RemoteActionCompatParcelizer
                o.$r8$lambda$K-rBLxNpMJdSxVU3Lsj65hn0UyA r1 = r1.asInterface
                boolean r1 = r1.asInterface
                if (r1 == 0) goto L_0x0134
                com.gojek.alarm.pingsender.AlarmPingSender r1 = r9.RemoteActionCompatParcelizer
                com.gojek.courier.utils.AppStateProvider r1 = r1.RemoteActionCompatParcelizer
                boolean r1 = r1.isAppInForeground()
                if (r1 != 0) goto L_0x0134
                com.gojek.alarm.pingsender.AlarmPingSender r1 = r9.RemoteActionCompatParcelizer
                java.util.concurrent.atomic.AtomicInteger r1 = r1.asBinder
                int r1 = r1.get()
                com.gojek.alarm.pingsender.AlarmPingSender r3 = r9.RemoteActionCompatParcelizer
                o.$r8$lambda$K-rBLxNpMJdSxVU3Lsj65hn0UyA r3 = r3.asInterface
                int r3 = r3.RemoteActionCompatParcelizer
                if (r1 < r3) goto L_0x0108
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.CustomTabsService$Relation r10 = r10.AudioAttributesImplApi26Parcelizer
                if (r10 != 0) goto L_0x00f8
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                goto L_0x00f9
            L_0x00f8:
                r11 = r10
            L_0x00f9:
                java.lang.String r10 = "background alarm pings limit reached. Not scheduling now"
                r11.asBinder(r2, r10)
                com.gojek.alarm.pingsender.AlarmPingSender r10 = r9.RemoteActionCompatParcelizer
                o.ActivityResultContracts$PickMultipleVisualMedia$Companion r10 = r10.AudioAttributesImplBaseParcelizer
                r10.asInterface()
                return
            L_0x0108:
                com.gojek.alarm.pingsender.AlarmPingSender r1 = r9.RemoteActionCompatParcelizer
                java.util.concurrent.atomic.AtomicInteger r1 = r1.asBinder
                r1.getAndIncrement()
                com.gojek.alarm.pingsender.AlarmPingSender r1 = r9.RemoteActionCompatParcelizer
                o.CustomTabsService$Relation r1 = r1.AudioAttributesImplApi26Parcelizer
                if (r1 != 0) goto L_0x011d
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                r1 = r11
            L_0x011d:
                com.gojek.alarm.pingsender.AlarmPingSender r3 = r9.RemoteActionCompatParcelizer
                java.util.concurrent.atomic.AtomicInteger r3 = r3.asBinder
                int r3 = r3.get()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.String r4 = "background alarm pings counter increased to "
                java.lang.String r3 = kotlin.jvm.internal.Intrinsics.read(r4, r3)
                r1.asBinder(r2, r3)
            L_0x0134:
                com.gojek.alarm.pingsender.AlarmPingSender r1 = r9.RemoteActionCompatParcelizer     // Catch:{ Exception -> 0x017c }
                o.$r8$lambda$K-rBLxNpMJdSxVU3Lsj65hn0UyA r1 = r1.asInterface     // Catch:{ Exception -> 0x017c }
                int r1 = r1.asBinder     // Catch:{ Exception -> 0x017c }
                if (r1 <= 0) goto L_0x0193
                android.os.PowerManager$WakeLock r3 = r9.asBinder     // Catch:{ Exception -> 0x017c }
                if (r3 != 0) goto L_0x0174
                com.gojek.alarm.pingsender.AlarmPingSender r3 = r9.RemoteActionCompatParcelizer     // Catch:{ Exception -> 0x017c }
                android.content.Context r3 = r3.onTransact     // Catch:{ Exception -> 0x017c }
                java.lang.String r4 = "power"
                java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x017c }
                if (r3 == 0) goto L_0x016c
                android.os.PowerManager r3 = (android.os.PowerManager) r3     // Catch:{ Exception -> 0x017c }
                r4 = 1
                java.lang.String r5 = "com.gojek.mqtt.client"
                android.os.PowerManager$WakeLock r3 = r3.newWakeLock(r4, r5)     // Catch:{ Exception -> 0x017c }
                r9.asBinder = r3     // Catch:{ Exception -> 0x017c }
                kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r3)     // Catch:{ Exception -> 0x017c }
                r4 = 0
                r3.setReferenceCounted(r4)     // Catch:{ Exception -> 0x017c }
                android.os.PowerManager$WakeLock r3 = r9.asBinder     // Catch:{ Exception -> 0x017c }
                kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r3)     // Catch:{ Exception -> 0x017c }
                long r4 = (long) r1     // Catch:{ Exception -> 0x017c }
                r3.acquire(r4)     // Catch:{ Exception -> 0x017c }
                goto L_0x0193
            L_0x016c:
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x017c }
                java.lang.String r3 = "null cannot be cast to non-null type android.os.PowerManager"
                r1.<init>(r3)     // Catch:{ Exception -> 0x017c }
                throw r1     // Catch:{ Exception -> 0x017c }
            L_0x0174:
                kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r3)     // Catch:{ Exception -> 0x017c }
                long r4 = (long) r1     // Catch:{ Exception -> 0x017c }
                r3.acquire(r4)     // Catch:{ Exception -> 0x017c }
                goto L_0x0193
            L_0x017c:
                r1 = move-exception
                com.gojek.alarm.pingsender.AlarmPingSender r3 = r9.RemoteActionCompatParcelizer
                o.CustomTabsService$Relation r3 = r3.AudioAttributesImplApi26Parcelizer
                if (r3 != 0) goto L_0x0189
                kotlin.jvm.internal.Intrinsics.asBinder(r0)
                goto L_0x018a
            L_0x0189:
                r11 = r3
            L_0x018a:
                java.lang.String r0 = "Exception while AlaramBroadcast receive"
                java.lang.String r0 = kotlin.jvm.internal.Intrinsics.read(r0, r1)
                r11.asBinder(r2, r0)
            L_0x0193:
                com.gojek.alarm.pingsender.AlarmPingSender r11 = r9.RemoteActionCompatParcelizer
                o.removeOnReportDrawnListener unused = r11.AudioAttributesImplApi21Parcelizer
                long r6 = o.removeOnReportDrawnListener.read()
                com.gojek.alarm.pingsender.AlarmPingSender$asInterface$read r11 = new com.gojek.alarm.pingsender.AlarmPingSender$asInterface$read
                com.gojek.alarm.pingsender.AlarmPingSender r4 = r9.RemoteActionCompatParcelizer
                r3 = r11
                r5 = r9
                r3.<init>(r4, r5, r6, r8)
                o.CustomTabsService$1$$ExternalSyntheticLambda0 r11 = (o.CustomTabsService$1$$ExternalSyntheticLambda0) r11
                r10.onTransact(r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gojek.alarm.pingsender.AlarmPingSender.asInterface.onReceive(android.content.Context, android.content.Intent):void");
        }

        public static final class read implements CustomTabsService$1$$ExternalSyntheticLambda0 {
            private /* synthetic */ long asBinder;
            private /* synthetic */ AlarmPingSender asInterface;
            private /* synthetic */ asInterface onTransact;
            private /* synthetic */ AsyncLayoutInflater.read<String> read;

            read(AlarmPingSender alarmPingSender, asInterface asinterface, long j, AsyncLayoutInflater.read<String> read2) {
                this.asInterface = alarmPingSender;
                this.onTransact = asinterface;
                this.asBinder = j;
                this.read = read2;
            }

            public final void asInterface(CustomTabsServiceConnection customTabsServiceConnection) {
                Intrinsics.checkNotNullParameter(customTabsServiceConnection, "");
                CustomTabsService.Relation write = this.asInterface.AudioAttributesImplApi26Parcelizer;
                createPostMessageExtraBundle createpostmessageextrabundle = null;
                if (write == null) {
                    Intrinsics.asBinder("");
                    write = null;
                }
                write.asBinder("AlarmPingSender", Intrinsics.read("Success. Release lock(com.gojek.mqtt.client):", Long.valueOf(System.currentTimeMillis())));
                if (this.onTransact.asBinder != null) {
                    PowerManager.WakeLock wakeLock = this.onTransact.asBinder;
                    Intrinsics.onTransact((Object) wakeLock);
                    if (wakeLock.isHeld()) {
                        PowerManager.WakeLock wakeLock2 = this.onTransact.asBinder;
                        Intrinsics.onTransact((Object) wakeLock2);
                        wakeLock2.release();
                    }
                }
                removeOnReportDrawnListener unused = this.asInterface.AudioAttributesImplApi21Parcelizer;
                long millis = TimeUnit.NANOSECONDS.toMillis(removeOnReportDrawnListener.read() - this.asBinder);
                ActivityResultContracts.PickMultipleVisualMedia.Companion AudioAttributesImplApi21Parcelizer = this.asInterface.AudioAttributesImplBaseParcelizer;
                String str = (String) this.read.onTransact;
                createPostMessageExtraBundle AudioAttributesCompatParcelizer = this.asInterface.IconCompatParcelizer;
                if (AudioAttributesCompatParcelizer == null) {
                    Intrinsics.asBinder("");
                } else {
                    createpostmessageextrabundle = AudioAttributesCompatParcelizer;
                }
                AudioAttributesImplApi21Parcelizer.read(str, millis, TimeUnit.MILLISECONDS.toSeconds(createpostmessageextrabundle.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer));
            }

            public final void onTransact(CustomTabsServiceConnection customTabsServiceConnection, Throwable th) {
                Intrinsics.checkNotNullParameter(customTabsServiceConnection, "");
                Intrinsics.checkNotNullParameter(th, "");
                CustomTabsService.Relation write = this.asInterface.AudioAttributesImplApi26Parcelizer;
                createPostMessageExtraBundle createpostmessageextrabundle = null;
                if (write == null) {
                    Intrinsics.asBinder("");
                    write = null;
                }
                write.asInterface("AlarmPingSender", Intrinsics.read("Failure. Release lock(com.gojek.mqtt.client):", Long.valueOf(System.currentTimeMillis())));
                if (this.onTransact.asBinder != null) {
                    PowerManager.WakeLock wakeLock = this.onTransact.asBinder;
                    Intrinsics.onTransact((Object) wakeLock);
                    if (wakeLock.isHeld()) {
                        PowerManager.WakeLock wakeLock2 = this.onTransact.asBinder;
                        Intrinsics.onTransact((Object) wakeLock2);
                        wakeLock2.release();
                    }
                }
                removeOnReportDrawnListener unused = this.asInterface.AudioAttributesImplApi21Parcelizer;
                long millis = TimeUnit.NANOSECONDS.toMillis(removeOnReportDrawnListener.read() - this.asBinder);
                ActivityResultContracts.PickMultipleVisualMedia.Companion AudioAttributesImplApi21Parcelizer = this.asInterface.AudioAttributesImplBaseParcelizer;
                String str = (String) this.read.onTransact;
                createPostMessageExtraBundle AudioAttributesCompatParcelizer = this.asInterface.IconCompatParcelizer;
                if (AudioAttributesCompatParcelizer == null) {
                    Intrinsics.asBinder("");
                } else {
                    createpostmessageextrabundle = AudioAttributesCompatParcelizer;
                }
                AudioAttributesImplApi21Parcelizer.read(str, millis, th, TimeUnit.MILLISECONDS.toSeconds(createpostmessageextrabundle.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer));
            }
        }
    }

    public static final class onTransact {
        public /* synthetic */ onTransact(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onTransact() {
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(AlarmPingSender alarmPingSender) {
        Intrinsics.checkNotNullParameter(alarmPingSender, "");
        ProcessLifecycleOwner.get().getLifecycle().addObserver(alarmPingSender);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onForeground() {
        this.asBinder.set(0);
    }
}
