package com.appsflyer.internal.platform_extension;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PluginInfo {
    private final String AFInAppEventParameterName;
    private final Map<String, String> AFInAppEventType;
    private final Plugin valueOf;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PluginInfo(Plugin plugin, String str) {
        this(plugin, str, (Map) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
    }

    public static /* synthetic */ PluginInfo copy$default(PluginInfo pluginInfo, Plugin plugin, String str, Map<String, String> map, int i, Object obj) {
        if ((i & 1) != 0) {
            plugin = pluginInfo.valueOf;
        }
        if ((i & 2) != 0) {
            str = pluginInfo.AFInAppEventParameterName;
        }
        if ((i & 4) != 0) {
            map = pluginInfo.AFInAppEventType;
        }
        return pluginInfo.copy(plugin, str, map);
    }

    public final Plugin component1() {
        return this.valueOf;
    }

    public final String component2() {
        return this.AFInAppEventParameterName;
    }

    public final Map<String, String> component3() {
        return this.AFInAppEventType;
    }

    public final PluginInfo copy(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new PluginInfo(plugin, str, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginInfo)) {
            return false;
        }
        PluginInfo pluginInfo = (PluginInfo) obj;
        return this.valueOf == pluginInfo.valueOf && Intrinsics.RemoteActionCompatParcelizer(this.AFInAppEventParameterName, pluginInfo.AFInAppEventParameterName) && Intrinsics.RemoteActionCompatParcelizer(this.AFInAppEventType, pluginInfo.AFInAppEventType);
    }

    public final int hashCode() {
        return (((this.valueOf.hashCode() * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.AFInAppEventType.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PluginInfo(plugin=");
        sb.append(this.valueOf);
        sb.append(", version=");
        sb.append(this.AFInAppEventParameterName);
        sb.append(", additionalParams=");
        sb.append(this.AFInAppEventType);
        sb.append(')');
        return sb.toString();
    }

    public PluginInfo(Plugin plugin, String str, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(plugin, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.valueOf = plugin;
        this.AFInAppEventParameterName = str;
        this.AFInAppEventType = map;
    }

    public final Plugin getPlugin() {
        return this.valueOf;
    }

    public final String getVersion() {
        return this.AFInAppEventParameterName;
    }

    public final Map<String, String> getAdditionalParams() {
        return this.AFInAppEventType;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PluginInfo(com.appsflyer.internal.platform_extension.Plugin r1, java.lang.String r2, java.util.Map r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L_0x000b
            o.Toolbar$LayoutParams r3 = o.Toolbar.LayoutParams.RemoteActionCompatParcelizer
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r3)
            java.util.Map r3 = (java.util.Map) r3
        L_0x000b:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.platform_extension.PluginInfo.<init>(com.appsflyer.internal.platform_extension.Plugin, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
