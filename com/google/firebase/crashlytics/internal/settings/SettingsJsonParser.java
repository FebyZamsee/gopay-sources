package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import org.json.JSONException;
import org.json.JSONObject;

public class SettingsJsonParser {
    private final CurrentTimeProvider currentTimeProvider;

    SettingsJsonParser(CurrentTimeProvider currentTimeProvider2) {
        this.currentTimeProvider = currentTimeProvider2;
    }

    public Settings parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return getJsonTransformForVersion(jSONObject.getInt("settings_version")).buildFromJson(this.currentTimeProvider, jSONObject);
    }

    private static SettingsJsonTransform getJsonTransformForVersion(int i) {
        if (i == 3) {
            return new SettingsV3JsonTransform();
        }
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Could not determine SettingsJsonTransform for settings version ");
        sb.append(i);
        sb.append(". Using default settings values.");
        logger.e(sb.toString());
        return new DefaultSettingsJsonTransform();
    }
}
