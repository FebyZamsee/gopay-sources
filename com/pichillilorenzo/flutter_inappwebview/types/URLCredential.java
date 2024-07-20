package com.pichillilorenzo.flutter_inappwebview.types;

import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import java.util.HashMap;
import java.util.Map;

public class URLCredential {
    private Long id;
    private String password;
    private Long protectionSpaceId;
    private String username;

    public URLCredential(String str, String str2) {
        this.username = str;
        this.password = str2;
    }

    public URLCredential(Long l, String str, String str2, Long l2) {
        this.id = l;
        this.username = str;
        this.password = str2;
        this.protectionSpaceId = l2;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, this.username);
        hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.password);
        hashMap.put("certificates", (Object) null);
        hashMap.put("persistence", (Object) null);
        return hashMap;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long l) {
        this.id = l;
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

    public Long getProtectionSpaceId() {
        return this.protectionSpaceId;
    }

    public void setProtectionSpaceId(Long l) {
        this.protectionSpaceId = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLCredential uRLCredential = (URLCredential) obj;
        String str = this.username;
        if (str == null ? uRLCredential.username != null : !str.equals(uRLCredential.username)) {
            return false;
        }
        String str2 = this.password;
        String str3 = uRLCredential.password;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.username;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.password;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("URLCredential{username='");
        sb.append(this.username);
        sb.append("', password='");
        sb.append(this.password);
        sb.append("'}");
        return sb.toString();
    }
}
