package com.pichillilorenzo.flutter_inappwebview.print_job;

import com.pichillilorenzo.flutter_inappwebview.ISettings;
import com.pichillilorenzo.flutter_inappwebview.types.MediaSizeExt;
import com.pichillilorenzo.flutter_inappwebview.types.ResolutionExt;
import java.util.HashMap;
import java.util.Map;

public class PrintJobSettings implements ISettings<PrintJobController> {
    public static final String LOG_TAG = "PrintJobSettings";
    public Integer colorMode;
    public Integer duplexMode;
    public Boolean handledByClient = Boolean.FALSE;
    public String jobName;
    public MediaSizeExt mediaSize;
    public Integer orientation;
    public ResolutionExt resolution;

    public PrintJobSettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1600030548:
                        if (str.equals("resolution")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1498106493:
                        if (str.equals("duplexMode")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1439500848:
                        if (str.equals("orientation")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -1438096408:
                        if (str.equals("jobName")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -244986274:
                        if (str.equals("handledByClient")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1980724134:
                        if (str.equals("colorMode")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2140418565:
                        if (str.equals("mediaSize")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.resolution = ResolutionExt.fromMap((Map) value);
                        break;
                    case 1:
                        this.duplexMode = (Integer) value;
                        break;
                    case 2:
                        this.orientation = (Integer) value;
                        break;
                    case 3:
                        this.jobName = (String) value;
                        break;
                    case 4:
                        this.handledByClient = (Boolean) value;
                        break;
                    case 5:
                        this.colorMode = (Integer) value;
                        break;
                    case 6:
                        this.mediaSize = MediaSizeExt.fromMap((Map) value);
                        break;
                }
            }
        }
        return this;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("handledByClient", this.handledByClient);
        hashMap.put("jobName", this.jobName);
        hashMap.put("orientation", this.orientation);
        MediaSizeExt mediaSizeExt = this.mediaSize;
        Map<String, Object> map = null;
        hashMap.put("mediaSize", mediaSizeExt != null ? mediaSizeExt.toMap() : null);
        hashMap.put("colorMode", this.colorMode);
        hashMap.put("duplexMode", this.duplexMode);
        ResolutionExt resolutionExt = this.resolution;
        if (resolutionExt != null) {
            map = resolutionExt.toMap();
        }
        hashMap.put("resolution", map);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(PrintJobController printJobController) {
        return toMap();
    }
}
