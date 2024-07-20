package com.pichillilorenzo.flutter_inappwebview.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview.ISettings;
import java.util.HashMap;
import java.util.Map;

public class PullToRefreshSettings implements ISettings<PullToRefreshLayout> {
    public static final String LOG_TAG = "PullToRefreshSettings";
    public String backgroundColor;
    public String color;
    public Integer distanceToTriggerSync;
    public Boolean enabled = Boolean.TRUE;
    public Integer size;
    public Integer slingshotDistance;

    public PullToRefreshSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1878912765:
                        if (str.equals("distanceToTriggerSync")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1609594047:
                        if (str.equals("enabled")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3530753:
                        if (str.equals("size")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 94842723:
                        if (str.equals("color")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1287124693:
                        if (str.equals("backgroundColor")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1719097976:
                        if (str.equals("slingshotDistance")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    this.distanceToTriggerSync = (Integer) value;
                } else if (c == 1) {
                    this.enabled = (Boolean) value;
                } else if (c == 2) {
                    this.size = (Integer) value;
                } else if (c == 3) {
                    this.color = (String) value;
                } else if (c == 4) {
                    this.backgroundColor = (String) value;
                } else if (c == 5) {
                    this.slingshotDistance = (Integer) value;
                }
            }
        }
        return this;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", this.enabled);
        hashMap.put("color", this.color);
        hashMap.put("backgroundColor", this.backgroundColor);
        hashMap.put("distanceToTriggerSync", this.distanceToTriggerSync);
        hashMap.put("slingshotDistance", this.slingshotDistance);
        hashMap.put("size", this.size);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(PullToRefreshLayout pullToRefreshLayout) {
        return toMap();
    }
}
