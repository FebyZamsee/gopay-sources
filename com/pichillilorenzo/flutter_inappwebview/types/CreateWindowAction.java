package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

public class CreateWindowAction extends NavigationAction {
    boolean isDialog;
    int windowId;

    public CreateWindowAction(URLRequest uRLRequest, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        super(uRLRequest, z, z2, z3);
        this.windowId = i;
        this.isDialog = z4;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("windowId", Integer.valueOf(this.windowId));
        map.put("isDialog", Boolean.valueOf(this.isDialog));
        map.put("windowFeatures", (Object) null);
        return map;
    }

    public int getWindowId() {
        return this.windowId;
    }

    public void setWindowId(int i) {
        this.windowId = i;
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void setDialog(boolean z) {
        this.isDialog = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CreateWindowAction createWindowAction = (CreateWindowAction) obj;
        if (this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CreateWindowAction{windowId=");
        sb.append(this.windowId);
        sb.append(", isDialog=");
        sb.append(this.isDialog);
        sb.append(", request=");
        sb.append(this.request);
        sb.append(", isForMainFrame=");
        sb.append(this.isForMainFrame);
        sb.append(", hasGesture=");
        sb.append(this.hasGesture);
        sb.append(", isRedirect=");
        sb.append(this.isRedirect);
        sb.append('}');
        return sb.toString();
    }
}
