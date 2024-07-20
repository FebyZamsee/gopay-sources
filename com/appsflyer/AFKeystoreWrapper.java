package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.internal.AFa1bSDK;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import javax.security.auth.x500.X500Principal;

public class AFKeystoreWrapper {
    public String AFInAppEventParameterName;
    public final Object AFInAppEventType = new Object();
    private Context AFKeystoreWrapper;
    public KeyStore valueOf;
    public int values;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        this.AFInAppEventParameterName = "";
        this.values = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.valueOf = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        r1 = r4.split(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r1.length != 3) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        com.appsflyer.AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = r1[1].trim().split("=");
        r1 = r1[2].trim().split("=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r2.length != 2) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        if (r1.length != 2) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r7.AFInAppEventParameterName = r2[1].trim();
        r7.values = java.lang.Integer.parseInt(r1[1].trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r2 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean values() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.AFInAppEventType
            monitor-enter(r0)
            java.security.KeyStore r1 = r7.valueOf     // Catch:{ all -> 0x008c }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x008a
            java.util.Enumeration r1 = r1.aliases()     // Catch:{ all -> 0x0070 }
        L_0x000d:
            boolean r4 = r1.hasMoreElements()     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r1.nextElement()     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0070 }
            if (r4 == 0) goto L_0x000d
            boolean r5 = values(r4)     // Catch:{ all -> 0x0070 }
            if (r5 == 0) goto L_0x000d
            java.lang.String r1 = ","
            java.lang.String[] r1 = r4.split(r1)     // Catch:{ all -> 0x0070 }
            int r5 = r1.length     // Catch:{ all -> 0x0070 }
            r6 = 3
            if (r5 != r6) goto L_0x008a
            java.lang.String r5 = "Found a matching AF key with alias:\n"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x0070 }
            com.appsflyer.AFLogger.afInfoLog(r4)     // Catch:{ all -> 0x0070 }
            r2 = r1[r3]     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "="
            java.lang.String[] r2 = r2.split(r4)     // Catch:{ all -> 0x006d }
            r4 = 2
            r1 = r1[r4]     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x006d }
            java.lang.String r5 = "="
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ all -> 0x006d }
            int r5 = r2.length     // Catch:{ all -> 0x006d }
            if (r5 != r4) goto L_0x006b
            int r5 = r1.length     // Catch:{ all -> 0x006d }
            if (r5 != r4) goto L_0x006b
            r2 = r2[r3]     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.trim()     // Catch:{ all -> 0x006d }
            r7.AFInAppEventParameterName = r2     // Catch:{ all -> 0x006d }
            r1 = r1[r3]     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x006d }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x006d }
            r7.values = r1     // Catch:{ all -> 0x006d }
        L_0x006b:
            r2 = 1
            goto L_0x008a
        L_0x006d:
            r1 = move-exception
            r2 = 1
            goto L_0x0071
        L_0x0070:
            r1 = move-exception
        L_0x0071:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "Couldn't list KeyStore Aliases: "
            r3.<init>(r4)     // Catch:{ all -> 0x008c }
            java.lang.Class r4 = r1.getClass()     // Catch:{ all -> 0x008c }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x008c }
            r3.append(r4)     // Catch:{ all -> 0x008c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x008c }
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r0)
            return r2
        L_0x008c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AFKeystoreWrapper.values():boolean");
    }

    public final void AFKeystoreWrapper(String str) {
        AlgorithmParameterSpec algorithmParameterSpec;
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar instance = Calendar.getInstance();
            Calendar instance2 = Calendar.getInstance();
            instance2.add(1, 5);
            synchronized (this.AFInAppEventType) {
                if (!this.valueOf.containsAlias(str)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        algorithmParameterSpec = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(instance.getTime()).setCertificateNotAfter(instance2.getTime()).build();
                    } else {
                        algorithmParameterSpec = !AFa1bSDK.valueOf() ? new KeyPairGeneratorSpec.Builder(this.AFKeystoreWrapper).setAlias(str).setSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setSerialNumber(BigInteger.ONE).setStartDate(instance.getTime()).setEndDate(instance2.getTime()).build() : null;
                    }
                    KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    instance3.initialize(algorithmParameterSpec);
                    instance3.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    private static boolean values(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final String AFInAppEventType() {
        StringBuilder sb = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        synchronized (this.AFInAppEventType) {
            sb.append(this.AFInAppEventParameterName);
            sb.append(",KSAppsFlyerRICounter=");
            sb.append(this.values);
        }
        return sb.toString();
    }

    public final String AFKeystoreWrapper() {
        String str;
        synchronized (this.AFInAppEventType) {
            str = this.AFInAppEventParameterName;
        }
        return str;
    }

    public final int valueOf() {
        int i;
        synchronized (this.AFInAppEventType) {
            i = this.values;
        }
        return i;
    }
}
