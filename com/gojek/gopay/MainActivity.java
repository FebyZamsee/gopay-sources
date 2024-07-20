package com.gojek.gopay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.android.FlutterFragmentActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.GeneratedPluginRegistrant;
import kotlin.jvm.internal.Intrinsics;
import o.FullyDrawnReporterKt;
import o.addReporter;
import o.initializeReflectiveFields;
import o.reportWhenComplete;
import o.reportWhenComplete$$forInline;
import o.valueOf;

public class MainActivity extends FlutterFragmentActivity {
    private String asBinder;
    /* access modifiers changed from: private */
    public EventChannel.EventSink onTransact;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String dataString = getIntent().getDataString();
        if (dataString != null) {
            this.asBinder = dataString;
        }
    }

    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(flutterEngine, "");
        GeneratedPluginRegistrant.registerWith(flutterEngine);
        new MethodChannel(flutterEngine.getDartExecutor(), "gopay.deeplink/channel").setMethodCallHandler(new addReporter(this));
        new EventChannel(flutterEngine.getDartExecutor(), "gopay.deeplink/events").setStreamHandler(new asInterface(this));
        Activity activity = this;
        reportWhenComplete reportwhencomplete = new reportWhenComplete(activity);
        DartExecutor dartExecutor = flutterEngine.getDartExecutor();
        Intrinsics.checkNotNullExpressionValue(dartExecutor, "");
        reportwhencomplete.asInterface(dartExecutor);
        FullyDrawnReporterKt fullyDrawnReporterKt = new FullyDrawnReporterKt(activity);
        DartExecutor dartExecutor2 = flutterEngine.getDartExecutor();
        Intrinsics.checkNotNullExpressionValue(dartExecutor2, "");
        Intrinsics.checkNotNullParameter(dartExecutor2, "");
        new MethodChannel(dartExecutor2, fullyDrawnReporterKt.read).setMethodCallHandler(new reportWhenComplete$$forInline(fullyDrawnReporterKt));
        valueOf valueof = new valueOf(activity);
        DartExecutor dartExecutor3 = flutterEngine.getDartExecutor();
        Intrinsics.checkNotNullExpressionValue(dartExecutor3, "");
        Intrinsics.checkNotNullParameter(dartExecutor3, "");
        new MethodChannel(dartExecutor3, valueof.onTransact).setMethodCallHandler(new initializeReflectiveFields(valueof));
    }

    public static final class asInterface implements EventChannel.StreamHandler {
        private /* synthetic */ MainActivity asBinder;

        asInterface(MainActivity mainActivity) {
            this.asBinder = mainActivity;
        }

        public final void onListen(Object obj, EventChannel.EventSink eventSink) {
            this.asBinder.onTransact = eventSink;
        }

        public final void onCancel(Object obj) {
            this.asBinder.onTransact = null;
        }
    }

    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        String dataString = intent.getDataString();
        if (dataString != null) {
            EventChannel.EventSink eventSink = this.onTransact;
            if (eventSink == null) {
                this.asBinder = dataString;
            } else if (eventSink != null) {
                eventSink.success(dataString);
            }
        }
    }

    public static /* synthetic */ void read(MainActivity mainActivity, MethodCall methodCall, MethodChannel.Result result) {
        String str;
        Intrinsics.checkNotNullParameter(mainActivity, "");
        Intrinsics.checkNotNullParameter(methodCall, "");
        Intrinsics.checkNotNullParameter(result, "");
        if (Intrinsics.RemoteActionCompatParcelizer(methodCall.method, "initialLink") && (str = mainActivity.asBinder) != null) {
            result.success(str);
        }
    }
}
