package com.pichillilorenzo.flutter_inappwebview.types;

import androidx.webkit.ProxyConfig;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserScript {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Set<String> allowedOriginRules = new HashSet();
    private ContentWorld contentWorld;
    private String groupName;
    private UserScriptInjectionTime injectionTime;
    private String source;

    public UserScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld2, Set<String> set) {
        this.groupName = str;
        this.source = str2;
        this.injectionTime = userScriptInjectionTime;
        this.contentWorld = contentWorld2 == null ? ContentWorld.PAGE : contentWorld2;
        this.allowedOriginRules = set == null ? new HashSet<String>() {
            {
                add(ProxyConfig.MATCH_ALL_SCHEMES);
            }
        } : set;
    }

    public static UserScript fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new UserScript((String) map.get("groupName"), (String) map.get("source"), UserScriptInjectionTime.fromValue(((Integer) map.get("injectionTime")).intValue()), ContentWorld.fromMap((Map) map.get("contentWorld")), new HashSet((List) map.get("allowedOriginRules")));
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public UserScriptInjectionTime getInjectionTime() {
        return this.injectionTime;
    }

    public void setInjectionTime(UserScriptInjectionTime userScriptInjectionTime) {
        this.injectionTime = userScriptInjectionTime;
    }

    public ContentWorld getContentWorld() {
        return this.contentWorld;
    }

    public void setContentWorld(ContentWorld contentWorld2) {
        if (contentWorld2 == null) {
            contentWorld2 = ContentWorld.PAGE;
        }
        this.contentWorld = contentWorld2;
    }

    public Set<String> getAllowedOriginRules() {
        return this.allowedOriginRules;
    }

    public void setAllowedOriginRules(Set<String> set) {
        this.allowedOriginRules = set;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserScript userScript = (UserScript) obj;
        String str = this.groupName;
        if (str == null ? userScript.groupName != null : !str.equals(userScript.groupName)) {
            return false;
        }
        if (this.source.equals(userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld)) {
            return this.allowedOriginRules.equals(userScript.allowedOriginRules);
        }
        return false;
    }

    public int hashCode() {
        String str = this.groupName;
        int hashCode = str != null ? str.hashCode() : 0;
        return (((((((hashCode * 31) + this.source.hashCode()) * 31) + this.injectionTime.hashCode()) * 31) + this.contentWorld.hashCode()) * 31) + this.allowedOriginRules.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UserScript{groupName='");
        sb.append(this.groupName);
        sb.append("', source='");
        sb.append(this.source);
        sb.append("', injectionTime=");
        sb.append(this.injectionTime);
        sb.append(", contentWorld=");
        sb.append(this.contentWorld);
        sb.append(", allowedOriginRules=");
        sb.append(this.allowedOriginRules);
        sb.append('}');
        return sb.toString();
    }
}
