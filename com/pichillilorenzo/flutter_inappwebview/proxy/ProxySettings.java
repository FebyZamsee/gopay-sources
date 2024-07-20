package com.pichillilorenzo.flutter_inappwebview.proxy;

import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.ImagesContract;
import com.pichillilorenzo.flutter_inappwebview.ISettings;
import com.pichillilorenzo.flutter_inappwebview.types.ProxyRuleExt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProxySettings implements ISettings<ProxyConfig> {
    List<String> bypassRules = new ArrayList();
    Boolean bypassSimpleHostnames = null;
    List<String> directs = new ArrayList();
    List<ProxyRuleExt> proxyRules = new ArrayList();
    Boolean removeImplicitRules = null;
    Boolean reverseBypassEnabled = Boolean.FALSE;

    public ProxySettings parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -2059288826:
                        if (str.equals("bypassSimpleHostnames")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1872895191:
                        if (str.equals("proxyRules")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1033831049:
                        if (str.equals("reverseBypassEnabled")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -940646418:
                        if (str.equals("removeImplicitRules")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1021951215:
                        if (str.equals("bypassRules")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1670504874:
                        if (str.equals("directs")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    this.bypassSimpleHostnames = (Boolean) value;
                } else if (c == 1) {
                    this.proxyRules = new ArrayList();
                    for (Map fromMap : (List) value) {
                        ProxyRuleExt fromMap2 = ProxyRuleExt.fromMap(fromMap);
                        if (fromMap2 != null) {
                            this.proxyRules.add(fromMap2);
                        }
                    }
                } else if (c == 2) {
                    this.reverseBypassEnabled = (Boolean) value;
                } else if (c == 3) {
                    this.removeImplicitRules = (Boolean) value;
                } else if (c == 4) {
                    this.bypassRules = (List) value;
                } else if (c == 5) {
                    this.directs = (List) value;
                }
            }
        }
        return this;
    }

    public Map<String, Object> toMap() {
        ArrayList arrayList = new ArrayList();
        for (ProxyRuleExt map : this.proxyRules) {
            arrayList.add(map.toMap());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("bypassRules", this.bypassRules);
        hashMap.put("directs", this.directs);
        hashMap.put("proxyRules", arrayList);
        hashMap.put("bypassSimpleHostnames", this.bypassSimpleHostnames);
        hashMap.put("removeImplicitRules", this.removeImplicitRules);
        hashMap.put("reverseBypassEnabled", this.reverseBypassEnabled);
        return hashMap;
    }

    public Map<String, Object> getRealSettings(ProxyConfig proxyConfig) {
        Map<String, Object> map = toMap();
        ArrayList arrayList = new ArrayList();
        for (ProxyConfig.ProxyRule next : proxyConfig.getProxyRules()) {
            HashMap hashMap = new HashMap();
            hashMap.put(ImagesContract.URL, next.getUrl());
            hashMap.put("schemeFilter", next.getSchemeFilter());
            arrayList.add(hashMap);
        }
        map.put("bypassRules", proxyConfig.getBypassRules());
        map.put("proxyRules", arrayList);
        map.put("reverseBypassEnabled", Boolean.valueOf(proxyConfig.isReverseBypassEnabled()));
        return map;
    }
}
