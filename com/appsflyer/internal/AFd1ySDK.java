package com.appsflyer.internal;

public class AFd1ySDK {
    public final long valueOf;

    public AFd1ySDK(long j) {
        this.valueOf = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.valueOf == ((AFd1ySDK) obj).valueOf) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.valueOf;
        return (int) (j ^ (j >>> 32));
    }
}
