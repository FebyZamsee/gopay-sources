package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class Store {
    final SharedPreferences store;

    public Store(Context context) {
        this.store = context.getSharedPreferences("com.google.android.gms.appid", 0);
        checkForRestore(context, "com.google.android.gms.appid-no-backup");
    }

    private void checkForRestore(Context context, String str) {
        File file = new File(ContextCompat.getNoBackupFilesDir(context), str);
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !isEmpty()) {
                    deleteAll();
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    e.getMessage();
                }
            }
        }
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.store.getAll().isEmpty();
        }
        return isEmpty;
    }

    private String createTokenKey(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public void deleteAll() {
        synchronized (this) {
            this.store.edit().clear().commit();
        }
    }

    public Token getToken(String str, String str2) {
        Token parse;
        synchronized (this) {
            parse = Token.parse(this.store.getString(createTokenKey(str, str2), (String) null));
        }
        return parse;
    }

    public void saveToken(String str, String str2, String str3, String str4) {
        synchronized (this) {
            String encode = Token.encode(str3, str4, System.currentTimeMillis());
            if (encode != null) {
                SharedPreferences.Editor edit = this.store.edit();
                edit.putString(createTokenKey(str, str2), encode);
                edit.commit();
            }
        }
    }

    static class Token {
        private static final long REFRESH_PERIOD_MILLIS = TimeUnit.DAYS.toMillis(7);
        final String appVersion;
        final long timestamp;
        final String token;

        private Token(String str, String str2, long j) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j;
        }

        static Token parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong(Constants.TIMESTAMP));
            } catch (JSONException unused) {
                return null;
            }
        }

        static String encode(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(Constants.TIMESTAMP, j);
                return jSONObject.toString();
            } catch (JSONException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean needsRefresh(String str) {
            return System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }
}
