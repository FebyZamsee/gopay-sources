package com.google.android.play.core.assetpacks;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import java.util.IllegalFormatException;
import java.util.Locale;
import o.ActionBarOverlayLayout;
import o.initTitle;
import o.onNestedFling;

public class ExtractionForegroundService extends Service {
    public Context RemoteActionCompatParcelizer;
    private NotificationManager asInterface;
    private final ActionBarOverlayLayout.AnonymousClass1 onTransact = new Object("ExtractionForegroundService") {
        public final String asInterface;

        {
            int myUid = Process.myUid();
            int myPid = Process.myPid();
            StringBuilder sb = new StringBuilder(39);
            sb.append("UID: [");
            sb.append(myUid);
            sb.append("]  PID: [");
            sb.append(myPid);
            sb.append("] ");
            String valueOf = String.valueOf(sb.toString());
            String valueOf2 = String.valueOf(r5);
            this.asInterface = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }

        public static String asInterface(String str, String str2, Object... objArr) {
            if (objArr.length > 0) {
                try {
                    str2 = String.format(Locale.US, str2, objArr);
                } catch (IllegalFormatException unused) {
                    String join = TextUtils.join(", ", objArr);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                    sb.append(str2);
                    sb.append(" [");
                    sb.append(join);
                    sb.append("]");
                    str2 = sb.toString();
                }
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
            sb2.append(str);
            sb2.append(" : ");
            sb2.append(str2);
            return sb2.toString();
        }
    };
    public onNestedFling read;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        initTitle.RemoteActionCompatParcelizer(getApplicationContext()).asInterface(this);
        this.asInterface = (NotificationManager) this.RemoteActionCompatParcelizer.getSystemService("notification");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final int onStartCommand(android.content.Intent r8, int r9, int r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r9 = "notification_title"
            java.lang.String r9 = r8.getStringExtra(r9)     // Catch:{ all -> 0x012c }
            java.lang.String r10 = "notification_subtext"
            java.lang.String r10 = r8.getStringExtra(r10)     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "notification_timeout"
            r1 = 600000(0x927c0, double:2.964394E-318)
            long r0 = r8.getLongExtra(r0, r1)     // Catch:{ all -> 0x012c }
            java.lang.String r2 = "notification_on_click_intent"
            android.os.Parcelable r2 = r8.getParcelableExtra(r2)     // Catch:{ all -> 0x012c }
            android.app.PendingIntent r2 = (android.app.PendingIntent) r2     // Catch:{ all -> 0x012c }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012c }
            r4 = 26
            if (r3 < r4) goto L_0x0032
            android.app.Notification$Builder r3 = new android.app.Notification$Builder     // Catch:{ all -> 0x012c }
            android.content.Context r5 = r7.RemoteActionCompatParcelizer     // Catch:{ all -> 0x012c }
            java.lang.String r6 = "playcore-assetpacks-service-notification-channel"
            r3.<init>(r5, r6)     // Catch:{ all -> 0x012c }
            android.app.Notification$Builder r0 = r3.setTimeoutAfter(r0)     // Catch:{ all -> 0x012c }
            goto L_0x003e
        L_0x0032:
            android.app.Notification$Builder r0 = new android.app.Notification$Builder     // Catch:{ all -> 0x012c }
            android.content.Context r1 = r7.RemoteActionCompatParcelizer     // Catch:{ all -> 0x012c }
            r0.<init>(r1)     // Catch:{ all -> 0x012c }
            r1 = -2
            android.app.Notification$Builder r0 = r0.setPriority(r1)     // Catch:{ all -> 0x012c }
        L_0x003e:
            if (r2 == 0) goto L_0x0043
            r0.setContentIntent(r2)     // Catch:{ all -> 0x012c }
        L_0x0043:
            r1 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r1 = r0.setSmallIcon(r1)     // Catch:{ all -> 0x012c }
            r2 = 0
            android.app.Notification$Builder r1 = r1.setOngoing(r2)     // Catch:{ all -> 0x012c }
            if (r9 != 0) goto L_0x0054
            java.lang.String r3 = "Downloading additional file"
            goto L_0x0055
        L_0x0054:
            r3 = r9
        L_0x0055:
            android.app.Notification$Builder r1 = r1.setContentTitle(r3)     // Catch:{ all -> 0x012c }
            if (r10 != 0) goto L_0x005d
            java.lang.String r9 = "Transferring"
        L_0x005d:
            r1.setSubText(r9)     // Catch:{ all -> 0x012c }
            java.lang.String r9 = "notification_color"
            int r9 = r8.getIntExtra(r9, r2)     // Catch:{ all -> 0x012c }
            if (r9 == 0) goto L_0x0070
            android.app.Notification$Builder r9 = r0.setColor(r9)     // Catch:{ all -> 0x012c }
            r10 = -1
            r9.setVisibility(r10)     // Catch:{ all -> 0x012c }
        L_0x0070:
            android.app.Notification r9 = r0.build()     // Catch:{ all -> 0x012c }
            o.ActionBarOverlayLayout$1 r10 = r7.onTransact     // Catch:{ all -> 0x012c }
            java.lang.String r0 = "Starting foreground installation service."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x012c }
            java.lang.String r3 = "PlayCore"
            r5 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r5)     // Catch:{ all -> 0x012c }
            if (r3 == 0) goto L_0x0088
            java.lang.String r10 = r10.asInterface     // Catch:{ all -> 0x012c }
            o.ActionBarOverlayLayout.AnonymousClass1.asInterface(r10, r0, r1)     // Catch:{ all -> 0x012c }
        L_0x0088:
            o.onNestedFling r10 = r7.read     // Catch:{ all -> 0x012c }
            o.animateToVisibility r0 = r10.asBinder     // Catch:{ all -> 0x012c }
            boolean r0 = r0.asBinder()     // Catch:{ all -> 0x012c }
            o.animateToVisibility r1 = r10.asBinder     // Catch:{ all -> 0x012c }
            monitor-enter(r1)     // Catch:{ all -> 0x012c }
            r3 = 1
            r1.AudioAttributesImplApi21Parcelizer = r3     // Catch:{ all -> 0x0129 }
            r1.RemoteActionCompatParcelizer()     // Catch:{ all -> 0x0129 }
            monitor-exit(r1)     // Catch:{ all -> 0x012c }
            if (r0 != 0) goto L_0x00ac
            o.getPopupTheme<java.util.concurrent.Executor> r0 = r10.asInterface     // Catch:{ all -> 0x012c }
            java.lang.Object r0 = r0.RemoteActionCompatParcelizer()     // Catch:{ all -> 0x012c }
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch:{ all -> 0x012c }
            o.checkLayoutParams r1 = new o.checkLayoutParams     // Catch:{ all -> 0x012c }
            r1.<init>(r10)     // Catch:{ all -> 0x012c }
            r0.execute(r1)     // Catch:{ all -> 0x012c }
        L_0x00ac:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012c }
            r0 = 2
            if (r10 < r4) goto L_0x00cd
            java.lang.String r10 = "notification_channel_name"
            java.lang.String r10 = r8.getStringExtra(r10)     // Catch:{ all -> 0x012c }
            monitor-enter(r7)     // Catch:{ all -> 0x012c }
            if (r10 != 0) goto L_0x00bc
            java.lang.String r10 = "File downloads by Play"
        L_0x00bc:
            android.app.NotificationChannel r1 = new android.app.NotificationChannel     // Catch:{ all -> 0x00ca }
            java.lang.String r4 = "playcore-assetpacks-service-notification-channel"
            r1.<init>(r4, r10, r0)     // Catch:{ all -> 0x00ca }
            android.app.NotificationManager r10 = r7.asInterface     // Catch:{ all -> 0x00ca }
            r10.createNotificationChannel(r1)     // Catch:{ all -> 0x00ca }
            monitor-exit(r7)     // Catch:{ all -> 0x012c }
            goto L_0x00cd
        L_0x00ca:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x012c }
            throw r8     // Catch:{ all -> 0x012c }
        L_0x00cd:
            r10 = -1883842196(0xffffffff8fb6d96c, float:-1.8030333E-29)
            r7.startForeground(r10, r9)     // Catch:{ all -> 0x012c }
            monitor-exit(r7)
            java.lang.String r9 = "action_type"
            int r8 = r8.getIntExtra(r9, r2)
            if (r8 != r0) goto L_0x010e
            monitor-enter(r7)
            o.ActionBarOverlayLayout$1 r8 = r7.onTransact     // Catch:{ all -> 0x010b }
            java.lang.String r9 = "Stopping service."
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x010b }
            java.lang.String r1 = "PlayCore"
            boolean r1 = android.util.Log.isLoggable(r1, r5)     // Catch:{ all -> 0x010b }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r8 = r8.asInterface     // Catch:{ all -> 0x010b }
            o.ActionBarOverlayLayout.AnonymousClass1.asInterface(r8, r9, r10)     // Catch:{ all -> 0x010b }
        L_0x00f0:
            o.onNestedFling r8 = r7.read     // Catch:{ all -> 0x010b }
            o.animateToVisibility r9 = r8.asBinder     // Catch:{ all -> 0x010b }
            r9.asBinder()     // Catch:{ all -> 0x010b }
            o.animateToVisibility r8 = r8.asBinder     // Catch:{ all -> 0x010b }
            monitor-enter(r8)     // Catch:{ all -> 0x010b }
            r8.AudioAttributesImplApi21Parcelizer = r2     // Catch:{ all -> 0x0108 }
            r8.RemoteActionCompatParcelizer()     // Catch:{ all -> 0x0108 }
            monitor-exit(r8)     // Catch:{ all -> 0x010b }
            r7.stopForeground(r3)     // Catch:{ all -> 0x010b }
            r7.stopSelf()     // Catch:{ all -> 0x010b }
            monitor-exit(r7)
            goto L_0x0128
        L_0x0108:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x010b }
            throw r9     // Catch:{ all -> 0x010b }
        L_0x010b:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        L_0x010e:
            o.ActionBarOverlayLayout$1 r9 = r7.onTransact
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10[r2] = r8
            r8 = 6
            java.lang.String r1 = "PlayCore"
            boolean r8 = android.util.Log.isLoggable(r1, r8)
            if (r8 == 0) goto L_0x0128
            java.lang.String r8 = r9.asInterface
            java.lang.String r9 = "Unknown action type received: %d"
            o.ActionBarOverlayLayout.AnonymousClass1.asInterface(r8, r9, r10)
        L_0x0128:
            return r0
        L_0x0129:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012c }
            throw r8     // Catch:{ all -> 0x012c }
        L_0x012c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.ExtractionForegroundService.onStartCommand(android.content.Intent, int, int):int");
    }
}
