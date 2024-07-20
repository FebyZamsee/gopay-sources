package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

public class SafeBrowsingResponse {
    private Integer action;
    private boolean report;

    public SafeBrowsingResponse(boolean z, Integer num) {
        this.report = z;
        this.action = num;
    }

    public static SafeBrowsingResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new SafeBrowsingResponse(((Boolean) map.get("report")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean isReport() {
        return this.report;
    }

    public void setReport(boolean z) {
        this.report = z;
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
        SafeBrowsingResponse safeBrowsingResponse = (SafeBrowsingResponse) obj;
        if (this.report != safeBrowsingResponse.report) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = safeBrowsingResponse.action;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.report;
        Integer num = this.action;
        return ((z ? 1 : 0) * true) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SafeBrowsingResponse{report=");
        sb.append(this.report);
        sb.append(", action=");
        sb.append(this.action);
        sb.append('}');
        return sb.toString();
    }
}
