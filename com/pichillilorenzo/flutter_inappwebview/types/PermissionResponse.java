package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.List;
import java.util.Map;

public class PermissionResponse {
    private Integer action;
    private List<String> resources;

    public PermissionResponse(List<String> list, Integer num) {
        this.resources = list;
        this.action = num;
    }

    public static PermissionResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new PermissionResponse((List) map.get("resources"), (Integer) map.get("action"));
    }

    public List<String> getResources() {
        return this.resources;
    }

    public void setResources(List<String> list) {
        this.resources = list;
    }

    public Integer getAction() {
        return this.action;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionResponse permissionResponse = (PermissionResponse) obj;
        if (!this.resources.equals(permissionResponse.resources)) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = permissionResponse.action;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.resources.hashCode();
        Integer num = this.action;
        return (hashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PermissionResponse{resources=");
        sb.append(this.resources);
        sb.append(", action=");
        sb.append(this.action);
        sb.append('}');
        return sb.toString();
    }
}
