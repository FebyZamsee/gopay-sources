package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class KeysMap {
    private final Map<String, String> keys = new HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    public Map<String, String> getKeys() {
        Map<String, String> unmodifiableMap;
        synchronized (this) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.keys));
        }
        return unmodifiableMap;
    }

    public boolean setKey(String str, String str2) {
        synchronized (this) {
            String sanitizeKey = sanitizeKey(str);
            if (this.keys.size() >= this.maxEntries) {
                if (!this.keys.containsKey(sanitizeKey)) {
                    Logger logger = Logger.getLogger();
                    StringBuilder sb = new StringBuilder("Ignored entry \"");
                    sb.append(str);
                    sb.append("\" when adding custom keys. Maximum allowable: ");
                    sb.append(this.maxEntries);
                    logger.w(sb.toString());
                    return false;
                }
            }
            String sanitizeString = sanitizeString(str2, this.maxEntryLength);
            if (CommonUtils.nullSafeEquals(this.keys.get(sanitizeKey), sanitizeString)) {
                return false;
            }
            Map<String, String> map = this.keys;
            if (str2 == null) {
                sanitizeString = "";
            }
            map.put(sanitizeKey, sanitizeString);
            return true;
        }
    }

    public void setKeys(Map<String, String> map) {
        synchronized (this) {
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String sanitizeKey = sanitizeKey((String) next.getKey());
                if (this.keys.size() >= this.maxEntries) {
                    if (!this.keys.containsKey(sanitizeKey)) {
                        i++;
                    }
                }
                String str = (String) next.getValue();
                this.keys.put(sanitizeKey, str == null ? "" : sanitizeString(str, this.maxEntryLength));
            }
            if (i > 0) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder();
                sb.append("Ignored ");
                sb.append(i);
                sb.append(" entries when adding custom keys. Maximum allowable: ");
                sb.append(this.maxEntries);
                logger.w(sb.toString());
            }
        }
    }

    private String sanitizeKey(String str) {
        if (str != null) {
            return sanitizeString(str, this.maxEntryLength);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String sanitizeString(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }
}
