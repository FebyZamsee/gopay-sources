package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.embedding.engine.plugins.lifecycle.FlutterLifecycleAdapter;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import o.getSwitchMinWidth;

public class FilePickerPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {
    private static String RemoteActionCompatParcelizer = null;
    private static boolean asInterface = false;
    private static boolean read = false;
    /* access modifiers changed from: private */
    public getSwitchMinWidth AudioAttributesCompatParcelizer;
    private Application AudioAttributesImplApi21Parcelizer;
    private LifeCycleObserver AudioAttributesImplApi26Parcelizer;
    private Lifecycle IconCompatParcelizer;
    private ActivityPluginBinding asBinder;
    private FlutterPlugin.FlutterPluginBinding onConnectionFailed;
    private Activity onTransact;
    private MethodChannel write;

    class LifeCycleObserver implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {
        private final Activity asInterface;

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onCreate(LifecycleOwner lifecycleOwner) {
        }

        public void onPause(LifecycleOwner lifecycleOwner) {
        }

        public void onResume(LifecycleOwner lifecycleOwner) {
        }

        public void onStart(LifecycleOwner lifecycleOwner) {
        }

        LifeCycleObserver(Activity activity) {
            this.asInterface = activity;
        }

        public void onStop(LifecycleOwner lifecycleOwner) {
            onActivityStopped(this.asInterface);
        }

        public void onDestroy(LifecycleOwner lifecycleOwner) {
            onActivityDestroyed(this.asInterface);
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.asInterface == activity && activity.getApplicationContext() != null) {
                ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r10, io.flutter.plugin.common.MethodChannel.Result r11) {
        /*
            r9 = this;
            android.app.Activity r0 = r9.onTransact
            r1 = 0
            if (r0 != 0) goto L_0x000d
            java.lang.String r10 = "no_activity"
            java.lang.String r0 = "file picker plugin requires a foreground activity"
            r11.error(r10, r0, r1)
            return
        L_0x000d:
            com.mr.flutter.plugin.filepicker.FilePickerPlugin$asInterface r0 = new com.mr.flutter.plugin.filepicker.FilePickerPlugin$asInterface
            r0.<init>(r11)
            java.lang.Object r11 = r10.arguments
            java.util.HashMap r11 = (java.util.HashMap) r11
            java.lang.String r2 = r10.method
            if (r2 == 0) goto L_0x0036
            java.lang.String r2 = r10.method
            java.lang.String r3 = "clear"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0036
            android.app.Activity r10 = r9.onTransact
            android.content.Context r10 = r10.getApplicationContext()
            boolean r10 = com.google.android.exoplayer2.audio.DefaultAudioSink.RemoteActionCompatParcelizer.read(r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r0.success(r10)
            return
        L_0x0036:
            java.lang.String r2 = r10.method
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = -1
            java.lang.String r5 = "custom"
            r6 = 1
            java.lang.String r7 = "dir"
            r8 = 0
            switch(r3) {
                case -1349088399: goto L_0x0084;
                case 96748: goto L_0x007a;
                case 99469: goto L_0x0072;
                case 93166550: goto L_0x0068;
                case 100313435: goto L_0x005e;
                case 103772132: goto L_0x0054;
                case 112202875: goto L_0x004a;
                default: goto L_0x0049;
            }
        L_0x0049:
            goto L_0x008b
        L_0x004a:
            java.lang.String r3 = "video"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008b
            r4 = 6
            goto L_0x008b
        L_0x0054:
            java.lang.String r3 = "media"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008b
            r4 = 5
            goto L_0x008b
        L_0x005e:
            java.lang.String r3 = "image"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008b
            r4 = 4
            goto L_0x008b
        L_0x0068:
            java.lang.String r3 = "audio"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008b
            r4 = 3
            goto L_0x008b
        L_0x0072:
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x008b
            r4 = 2
            goto L_0x008b
        L_0x007a:
            java.lang.String r3 = "any"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x008b
            r4 = 1
            goto L_0x008b
        L_0x0084:
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x008b
            r4 = 0
        L_0x008b:
            switch(r4) {
                case 0: goto L_0x009e;
                case 1: goto L_0x009e;
                case 2: goto L_0x009c;
                case 3: goto L_0x0099;
                case 4: goto L_0x0096;
                case 5: goto L_0x0093;
                case 6: goto L_0x0090;
                default: goto L_0x008e;
            }
        L_0x008e:
            r2 = r1
            goto L_0x00a0
        L_0x0090:
            java.lang.String r2 = "video/*"
            goto L_0x00a0
        L_0x0093:
            java.lang.String r2 = "image/*,video/*"
            goto L_0x00a0
        L_0x0096:
            java.lang.String r2 = "image/*"
            goto L_0x00a0
        L_0x0099:
            java.lang.String r2 = "audio/*"
            goto L_0x00a0
        L_0x009c:
            r2 = r7
            goto L_0x00a0
        L_0x009e:
            java.lang.String r2 = "*/*"
        L_0x00a0:
            RemoteActionCompatParcelizer = r2
            if (r2 != 0) goto L_0x00a8
            r0.notImplemented()
            goto L_0x0108
        L_0x00a8:
            if (r2 == r7) goto L_0x0108
            java.lang.String r2 = "allowMultipleSelection"
            java.lang.Object r2 = r11.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            asInterface = r2
            java.lang.String r2 = "withData"
            java.lang.Object r2 = r11.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            read = r2
            java.lang.String r2 = "allowedExtensions"
            java.lang.Object r11 = r11.get(r2)
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            if (r11 == 0) goto L_0x0108
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L_0x0108
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L_0x00dc:
            int r4 = r11.size()
            if (r3 >= r4) goto L_0x00ff
            android.webkit.MimeTypeMap r4 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.Object r7 = r11.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = r4.getMimeTypeFromExtension(r7)
            if (r4 != 0) goto L_0x00f9
            java.lang.Object r4 = r11.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x00fc
        L_0x00f9:
            r2.add(r4)
        L_0x00fc:
            int r3 = r3 + 1
            goto L_0x00dc
        L_0x00ff:
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.Object[] r11 = r2.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            goto L_0x0109
        L_0x0108:
            r11 = r1
        L_0x0109:
            java.lang.String r2 = r10.method
            if (r2 == 0) goto L_0x0122
            java.lang.String r10 = r10.method
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0122
            if (r11 == 0) goto L_0x011a
            int r10 = r11.length
            if (r10 != 0) goto L_0x0122
        L_0x011a:
            java.lang.String r10 = "FilePicker"
            java.lang.String r11 = "Unsupported filter. Make sure that you are only using the extension without the dot, (ie., jpg instead of .jpg). This could also have happened because you are using an unsupported file extension.  If the problem persists, you may want to consider using FileType.all instead."
            r0.error(r10, r11, r1)
            return
        L_0x0122:
            o.getSwitchMinWidth r10 = r9.AudioAttributesCompatParcelizer
            java.lang.String r2 = RemoteActionCompatParcelizer
            boolean r3 = asInterface
            boolean r4 = read
            io.flutter.plugin.common.MethodChannel$Result r5 = r10.AudioAttributesImplApi21Parcelizer
            if (r5 == 0) goto L_0x0130
            r6 = 0
            goto L_0x0132
        L_0x0130:
            r10.AudioAttributesImplApi21Parcelizer = r0
        L_0x0132:
            if (r6 != 0) goto L_0x013c
            java.lang.String r10 = "already_active"
            java.lang.String r11 = "File picker is already active"
            r0.error(r10, r11, r1)
            return
        L_0x013c:
            r10.IconCompatParcelizer = r2
            r10.RemoteActionCompatParcelizer = r3
            r10.read = r4
            r10.asInterface = r11
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r11 >= r0) goto L_0x015c
            o.getSwitchMinWidth$asBinder r11 = r10.AudioAttributesCompatParcelizer
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r11 = r11.RemoteActionCompatParcelizer(r0)
            if (r11 != 0) goto L_0x015c
            o.getSwitchMinWidth$asBinder r10 = r10.AudioAttributesCompatParcelizer
            int r11 = o.getSwitchMinWidth.onTransact
            r10.asInterface(r0, r11)
            return
        L_0x015c:
            r10.read()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mr.flutter.plugin.filepicker.FilePickerPlugin.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    static class asInterface implements MethodChannel.Result {
        /* access modifiers changed from: private */
        public final MethodChannel.Result RemoteActionCompatParcelizer;
        private final Handler read = new Handler(Looper.getMainLooper());

        asInterface(MethodChannel.Result result) {
            this.RemoteActionCompatParcelizer = result;
        }

        public final void success(final Object obj) {
            this.read.post(new Runnable() {
                public final void run() {
                    asInterface.this.RemoteActionCompatParcelizer.success(obj);
                }
            });
        }

        public final void error(final String str, final String str2, final Object obj) {
            this.read.post(new Runnable() {
                public final void run() {
                    asInterface.this.RemoteActionCompatParcelizer.error(str, str2, obj);
                }
            });
        }

        public final void notImplemented() {
            this.read.post(new Runnable() {
                public final void run() {
                    asInterface.this.RemoteActionCompatParcelizer.notImplemented();
                }
            });
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.onConnectionFailed = flutterPluginBinding;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.onConnectionFailed = null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.asBinder = activityPluginBinding;
        BinaryMessenger binaryMessenger = this.onConnectionFailed.getBinaryMessenger();
        Activity activity = this.asBinder.getActivity();
        ActivityPluginBinding activityPluginBinding2 = this.asBinder;
        this.onTransact = activity;
        this.AudioAttributesImplApi21Parcelizer = (Application) this.onConnectionFailed.getApplicationContext();
        this.AudioAttributesCompatParcelizer = new getSwitchMinWidth(activity);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepicker");
        this.write = methodChannel;
        methodChannel.setMethodCallHandler(this);
        new EventChannel(binaryMessenger, "miguelruivo.flutter.plugins.filepickerevent").setStreamHandler(new EventChannel.StreamHandler() {
            public final void onListen(Object obj, EventChannel.EventSink eventSink) {
                FilePickerPlugin.this.AudioAttributesCompatParcelizer.asBinder = eventSink;
            }

            public final void onCancel(Object obj) {
                FilePickerPlugin.this.AudioAttributesCompatParcelizer.asBinder = null;
            }
        });
        this.AudioAttributesImplApi26Parcelizer = new LifeCycleObserver(activity);
        activityPluginBinding2.addActivityResultListener(this.AudioAttributesCompatParcelizer);
        activityPluginBinding2.addRequestPermissionsResultListener(this.AudioAttributesCompatParcelizer);
        Lifecycle activityLifecycle = FlutterLifecycleAdapter.getActivityLifecycle(activityPluginBinding2);
        this.IconCompatParcelizer = activityLifecycle;
        activityLifecycle.addObserver(this.AudioAttributesImplApi26Parcelizer);
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    public void onDetachedFromActivity() {
        this.asBinder.removeActivityResultListener(this.AudioAttributesCompatParcelizer);
        this.asBinder.removeRequestPermissionsResultListener(this.AudioAttributesCompatParcelizer);
        this.asBinder = null;
        LifeCycleObserver lifeCycleObserver = this.AudioAttributesImplApi26Parcelizer;
        if (lifeCycleObserver != null) {
            this.IconCompatParcelizer.removeObserver(lifeCycleObserver);
            this.AudioAttributesImplApi21Parcelizer.unregisterActivityLifecycleCallbacks(this.AudioAttributesImplApi26Parcelizer);
        }
        this.IconCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer.asBinder = null;
        this.AudioAttributesCompatParcelizer = null;
        this.write.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.write = null;
        this.AudioAttributesImplApi21Parcelizer = null;
    }
}
