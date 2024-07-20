package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ConfigStorageClient {
    private static final Map<String, ConfigStorageClient> clientInstances = new HashMap();
    private final Context context;
    private final String fileName;

    private ConfigStorageClient(Context context2, String str) {
        this.context = context2;
        this.fileName = str;
    }

    public Void write(ConfigContainer configContainer) throws IOException {
        synchronized (this) {
            FileOutputStream openFileOutput = this.context.openFileOutput(this.fileName, 0);
            try {
                openFileOutput.write(configContainer.toString().getBytes("UTF-8"));
            } finally {
                openFileOutput.close();
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[SYNTHETIC, Splitter:B:16:0x0035] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[Catch:{ FileNotFoundException | JSONException -> 0x0039, all -> 0x0032 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.ConfigContainer read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.context     // Catch:{ FileNotFoundException | JSONException -> 0x0039, all -> 0x0032 }
            java.lang.String r2 = r6.fileName     // Catch:{ FileNotFoundException | JSONException -> 0x0039, all -> 0x0032 }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0039, all -> 0x0032 }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            com.google.firebase.remoteconfig.internal.ConfigContainer r0 = com.google.firebase.remoteconfig.internal.ConfigContainer.copyOf(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0030, all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            r1.close()     // Catch:{ all -> 0x0040 }
        L_0x0029:
            monitor-exit(r6)
            return r0
        L_0x002b:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L_0x0033
        L_0x0030:
            goto L_0x003a
        L_0x0032:
            r1 = move-exception
        L_0x0033:
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ all -> 0x0040 }
        L_0x0038:
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0039:
            r1 = r0
        L_0x003a:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x0040 }
            goto L_0x0043
        L_0x0040:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0043:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigStorageClient.read():com.google.firebase.remoteconfig.internal.ConfigContainer");
    }

    public Void clear() {
        synchronized (this) {
            this.context.deleteFile(this.fileName);
        }
        return null;
    }

    public static ConfigStorageClient getInstance(Context context2, String str) {
        ConfigStorageClient configStorageClient;
        synchronized (ConfigStorageClient.class) {
            Map<String, ConfigStorageClient> map = clientInstances;
            if (!map.containsKey(str)) {
                map.put(str, new ConfigStorageClient(context2, str));
            }
            configStorageClient = map.get(str);
        }
        return configStorageClient;
    }

    /* access modifiers changed from: package-private */
    public String getFileName() {
        return this.fileName;
    }
}
