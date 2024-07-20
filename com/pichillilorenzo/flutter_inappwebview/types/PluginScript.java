package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Set;

public class PluginScript extends UserScript {
    private boolean requiredInAllContentWorlds;

    public PluginScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, boolean z, Set<String> set) {
        super(str, str2, userScriptInjectionTime, contentWorld, set);
        this.requiredInAllContentWorlds = z;
    }

    public boolean isRequiredInAllContentWorlds() {
        return this.requiredInAllContentWorlds;
    }

    public void setRequiredInAllContentWorlds(boolean z) {
        this.requiredInAllContentWorlds = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj) || this.requiredInAllContentWorlds != ((PluginScript) obj).requiredInAllContentWorlds) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + (this.requiredInAllContentWorlds ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PluginScript{requiredInContentWorld=");
        sb.append(this.requiredInAllContentWorlds);
        sb.append("} ");
        sb.append(super.toString());
        return sb.toString();
    }
}
