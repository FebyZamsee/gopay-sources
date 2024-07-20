package com.pichillilorenzo.flutter_inappwebview.content_blocker;

import java.util.Map;

public class ContentBlockerAction {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String selector;
    private ContentBlockerActionType type;

    ContentBlockerAction(ContentBlockerActionType contentBlockerActionType, String str) {
        this.type = contentBlockerActionType;
        contentBlockerActionType.equals(ContentBlockerActionType.CSS_DISPLAY_NONE);
        this.selector = str;
    }

    public static ContentBlockerAction fromMap(Map<String, Object> map) {
        return new ContentBlockerAction(ContentBlockerActionType.fromValue((String) map.get("type")), (String) map.get("selector"));
    }

    public ContentBlockerActionType getType() {
        return this.type;
    }

    public void setType(ContentBlockerActionType contentBlockerActionType) {
        this.type = contentBlockerActionType;
    }

    public String getSelector() {
        return this.selector;
    }

    public void setSelector(String str) {
        this.selector = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentBlockerAction contentBlockerAction = (ContentBlockerAction) obj;
        if (this.type != contentBlockerAction.type) {
            return false;
        }
        String str = this.selector;
        String str2 = contentBlockerAction.selector;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode();
        String str = this.selector;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentBlockerAction{type=");
        sb.append(this.type);
        sb.append(", selector='");
        sb.append(this.selector);
        sb.append("'}");
        return sb.toString();
    }
}
