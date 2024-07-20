package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

public class ContentWorld {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ContentWorld DEFAULT_CLIENT = new ContentWorld("defaultClient");
    public static final ContentWorld PAGE = new ContentWorld("page");
    private String name;

    private ContentWorld(String str) {
        this.name = str;
    }

    public static ContentWorld world(String str) {
        return new ContentWorld(str);
    }

    public static ContentWorld fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ContentWorld((String) map.get("name"));
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((ContentWorld) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentWorld{name='");
        sb.append(this.name);
        sb.append("'}");
        return sb.toString();
    }
}
