package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public class NotificationParams {
    private final Bundle data;

    public NotificationParams(Bundle bundle) {
        if (bundle != null) {
            this.data = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* access modifiers changed from: package-private */
    public Integer getNotificationCount() {
        Integer integer = getInteger("gcm.n.notification_count");
        if (integer != null && integer.intValue() >= 0) {
            return integer;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Integer getNotificationPriority() {
        Integer integer = getInteger("gcm.n.notification_priority");
        if (integer != null && integer.intValue() >= -2 && integer.intValue() <= 2) {
            return integer;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Integer getVisibility() {
        Integer integer = getInteger("gcm.n.visibility");
        if (integer != null && integer.intValue() >= -1 && integer.intValue() <= 1) {
            return integer;
        }
        return null;
    }

    public String getString(String str) {
        return this.data.getString(normalizePrefix(str));
    }

    private String normalizePrefix(String str) {
        if (!this.data.containsKey(str) && str.startsWith("gcm.n.")) {
            String keyWithOldPrefix = keyWithOldPrefix(str);
            if (this.data.containsKey(keyWithOldPrefix)) {
                return keyWithOldPrefix;
            }
        }
        return str;
    }

    public boolean getBoolean(String str) {
        String string = getString(str);
        return "1".equals(string) || Boolean.parseBoolean(string);
    }

    public Integer getInteger(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(string));
        } catch (NumberFormatException unused) {
            userFriendlyKey(str);
            return null;
        }
    }

    public Long getLong(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(string));
        } catch (NumberFormatException unused) {
            userFriendlyKey(str);
            return null;
        }
    }

    public String getLocalizationResourceForKey(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_loc_key");
        return getString(sb.toString());
    }

    public Object[] getLocalizationArgsForKey(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_loc_args");
        JSONArray jSONArray = getJSONArray(sb.toString());
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        return strArr;
    }

    public JSONArray getJSONArray(String str) {
        String string = getString(str);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            userFriendlyKey(str);
            return null;
        }
    }

    private static String userFriendlyKey(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public Uri getLink() {
        String string = getString("gcm.n.link_android");
        if (TextUtils.isEmpty(string)) {
            string = getString("gcm.n.link");
        }
        if (!TextUtils.isEmpty(string)) {
            return Uri.parse(string);
        }
        return null;
    }

    public String getSoundResourceName() {
        String string = getString("gcm.n.sound2");
        return TextUtils.isEmpty(string) ? getString("gcm.n.sound") : string;
    }

    public long[] getVibrateTimings() {
        JSONArray jSONArray = getJSONArray("gcm.n.vibrate_timings");
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() > 1) {
                int length = jSONArray.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = jSONArray.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public int[] getLightSettings() {
        JSONArray jSONArray = getJSONArray("gcm.n.light_settings");
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArray.length() == 3) {
                iArr[0] = getLightColor(jSONArray.optString(0));
                iArr[1] = jSONArray.optInt(1);
                iArr[2] = jSONArray.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            return null;
        } catch (IllegalArgumentException e) {
            e.getMessage();
            return null;
        }
    }

    public Bundle paramsWithReservedKeysRemoved() {
        Bundle bundle = new Bundle(this.data);
        for (String str : this.data.keySet()) {
            if (isReservedKey(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle paramsForAnalyticsIntent() {
        Bundle bundle = new Bundle(this.data);
        for (String str : this.data.keySet()) {
            if (!isAnalyticsKey(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public String getLocalizedString(Resources resources, String str, String str2) {
        String localizationResourceForKey = getLocalizationResourceForKey(str2);
        if (TextUtils.isEmpty(localizationResourceForKey)) {
            return null;
        }
        int identifier = resources.getIdentifier(localizationResourceForKey, "string", str);
        if (identifier == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("_loc_key");
            userFriendlyKey(sb.toString());
            return null;
        }
        Object[] localizationArgsForKey = getLocalizationArgsForKey(str2);
        if (localizationArgsForKey == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, localizationArgsForKey);
        } catch (MissingFormatArgumentException unused) {
            userFriendlyKey(str2);
            Arrays.toString(localizationArgsForKey);
            return null;
        }
    }

    public String getPossiblyLocalizedString(Resources resources, String str, String str2) {
        String string = getString(str2);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return getLocalizedString(resources, str, str2);
    }

    public String getNotificationChannelId() {
        return getString("gcm.n.android_channel_id");
    }

    private static boolean isAnalyticsKey(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    private static boolean isReservedKey(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static int getLightColor(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public static boolean isNotification(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(keyWithOldPrefix("gcm.n.e")));
    }

    private static String keyWithOldPrefix(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }
}
