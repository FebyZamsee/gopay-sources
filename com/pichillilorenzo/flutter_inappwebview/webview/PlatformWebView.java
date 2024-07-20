package com.pichillilorenzo.flutter_inappwebview.webview;

import io.flutter.plugin.platform.PlatformView;
import java.util.HashMap;

public interface PlatformWebView extends PlatformView {
    void makeInitialLoad(HashMap<String, Object> hashMap);
}
