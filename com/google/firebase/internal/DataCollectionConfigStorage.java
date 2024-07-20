package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;

public class DataCollectionConfigStorage {
    private boolean dataCollectionDefaultEnabled = readAutoDataCollectionEnabled();
    private final Context deviceProtectedContext;
    private final Publisher publisher;
    private final SharedPreferences sharedPreferences;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher2) {
        Context directBootSafe = directBootSafe(context);
        this.deviceProtectedContext = directBootSafe;
        StringBuilder sb = new StringBuilder("com.google.firebase.common.prefs:");
        sb.append(str);
        this.sharedPreferences = directBootSafe.getSharedPreferences(sb.toString(), 0);
        this.publisher = publisher2;
    }

    private static Context directBootSafe(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return ContextCompat.createDeviceProtectedStorageContext(context);
    }

    public boolean isEnabled() {
        boolean z;
        synchronized (this) {
            z = this.dataCollectionDefaultEnabled;
        }
        return z;
    }

    private void updateDataCollectionDefaultEnabled(boolean z) {
        synchronized (this) {
            if (this.dataCollectionDefaultEnabled != z) {
                this.dataCollectionDefaultEnabled = z;
                this.publisher.publish(new Event(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
            }
        }
    }

    public void setEnabled(Boolean bool) {
        synchronized (this) {
            if (bool == null) {
                this.sharedPreferences.edit().remove("firebase_data_collection_default_enabled").apply();
                updateDataCollectionDefaultEnabled(readManifestDataCollectionEnabled());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.sharedPreferences.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                updateDataCollectionDefaultEnabled(equals);
            }
        }
    }

    private boolean readManifestDataCollectionEnabled() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.deviceProtectedContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.deviceProtectedContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private boolean readAutoDataCollectionEnabled() {
        if (this.sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            return this.sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return readManifestDataCollectionEnabled();
    }
}
