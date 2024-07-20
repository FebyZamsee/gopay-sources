package com.pichillilorenzo.flutter_inappwebview.tracing;

import androidx.webkit.TracingController;
import com.pichillilorenzo.flutter_inappwebview.ISettings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TracingSettings implements ISettings<TracingController> {
    public static final String LOG_TAG = "TracingSettings";
    public List<Object> categories = new ArrayList();
    public Integer tracingMode;

    public TracingSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                if (str.equals("tracingMode")) {
                    this.tracingMode = (Integer) value;
                } else if (str.equals("categories")) {
                    this.categories = (List) value;
                }
            }
        }
        return this;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("categories", this.categories);
        hashMap.put("tracingMode", this.tracingMode);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(TracingController tracingController) {
        return toMap();
    }
}
