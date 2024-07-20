package com.gojek.gopay;

import android.os.Bundle;
import io.flutter.embedding.engine.FlutterEngine;
import kotlin.jvm.internal.Intrinsics;

public final class GoogleActivity extends MainActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public final void configureFlutterEngine(FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(flutterEngine, "");
        super.configureFlutterEngine(flutterEngine);
    }
}
