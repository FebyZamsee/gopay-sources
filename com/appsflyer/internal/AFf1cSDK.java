package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.updateNavigationIcon;

public final class AFf1cSDK implements AFf1bSDK {
    private PluginInfo values = new PluginInfo(Plugin.NATIVE, "6.11.1", (Map) null, 4, (DefaultConstructorMarker) null);

    public final void valueOf(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.values = pluginInfo;
    }

    public final Map<String, Object> values() {
        Pair[] pairArr = {new Pair("platform", this.values.getPlugin().getPluginName()), new Pair("version", this.values.getVersion())};
        Intrinsics.checkNotNullParameter(pairArr, "");
        Map<String, Object> linkedHashMap = new LinkedHashMap<>(updateNavigationIcon.RemoteActionCompatParcelizer(2));
        updateNavigationIcon.asInterface(linkedHashMap, pairArr);
        if (!this.values.getAdditionalParams().isEmpty()) {
            linkedHashMap.put("extras", this.values.getAdditionalParams());
        }
        return linkedHashMap;
    }
}
