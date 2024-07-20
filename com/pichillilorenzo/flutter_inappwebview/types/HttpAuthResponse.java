package com.pichillilorenzo.flutter_inappwebview.types;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import java.util.Map;

public class HttpAuthResponse {
    private Integer action;
    private String password;
    boolean permanentPersistence;
    private String username;

    public HttpAuthResponse(String str, String str2, boolean z, Integer num) {
        this.username = str;
        this.password = str2;
        this.permanentPersistence = z;
        this.action = num;
    }

    public static HttpAuthResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new HttpAuthResponse((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD), ((Boolean) map.get("permanentPersistence")).booleanValue(), (Integer) map.get("action"));
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public boolean isPermanentPersistence() {
        return this.permanentPersistence;
    }

    public void setPermanentPersistence(boolean z) {
        this.permanentPersistence = z;
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
        HttpAuthResponse httpAuthResponse = (HttpAuthResponse) obj;
        if (this.permanentPersistence != httpAuthResponse.permanentPersistence || !this.username.equals(httpAuthResponse.username) || !this.password.equals(httpAuthResponse.password)) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = httpAuthResponse.action;
        if (num != null) {
            return num.equals(num2);
        }
        if (num2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.username.hashCode();
        int hashCode2 = this.password.hashCode();
        boolean z = this.permanentPersistence;
        Integer num = this.action;
        return (((((hashCode * 31) + hashCode2) * 31) + (z ? 1 : 0)) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HttpAuthResponse{username='");
        sb.append(this.username);
        sb.append("', password='");
        sb.append(this.password);
        sb.append("', permanentPersistence=");
        sb.append(this.permanentPersistence);
        sb.append(", action=");
        sb.append(this.action);
        sb.append('}');
        return sb.toString();
    }
}
