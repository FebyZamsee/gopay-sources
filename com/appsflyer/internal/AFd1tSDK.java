package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AFd1tSDK<Body> implements ResponseNetwork<Body> {
    final Map<String, List<String>> AFInAppEventParameterName;
    public final AFd1ySDK AFInAppEventType;
    final boolean AFKeystoreWrapper;
    private final Body valueOf;
    final int values;

    public AFd1tSDK(Body body, int i, boolean z, Map<String, List<String>> map, AFd1ySDK aFd1ySDK) {
        this.valueOf = body;
        this.values = i;
        this.AFKeystoreWrapper = z;
        this.AFInAppEventParameterName = new HashMap(map);
        this.AFInAppEventType = aFd1ySDK;
    }

    public Body getBody() {
        return this.valueOf;
    }

    public int getStatusCode() {
        return this.values;
    }

    public boolean isSuccessful() {
        return this.AFKeystoreWrapper;
    }

    public List<String> getHeaderField(String str) {
        for (String next : this.AFInAppEventParameterName.keySet()) {
            if (next != null && next.equalsIgnoreCase(str)) {
                return this.AFInAppEventParameterName.get(next);
            }
        }
        return null;
    }

    public final String AFInAppEventParameterName(String str) {
        List<String> headerField = getHeaderField(str);
        if (headerField == null || headerField.isEmpty()) {
            return null;
        }
        Iterator<String> it = headerField.iterator();
        StringBuilder sb = new StringBuilder(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFd1tSDK aFd1tSDK = (AFd1tSDK) obj;
        if (this.values == aFd1tSDK.values && this.AFKeystoreWrapper == aFd1tSDK.AFKeystoreWrapper && this.valueOf.equals(aFd1tSDK.valueOf) && this.AFInAppEventParameterName.equals(aFd1tSDK.AFInAppEventParameterName)) {
            return this.AFInAppEventType.equals(aFd1tSDK.AFInAppEventType);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.valueOf.hashCode();
        int i = this.values;
        boolean z = this.AFKeystoreWrapper;
        return (((((((hashCode * 31) + i) * 31) + (z ? 1 : 0)) * 31) + this.AFInAppEventParameterName.hashCode()) * 31) + this.AFInAppEventType.hashCode();
    }
}
