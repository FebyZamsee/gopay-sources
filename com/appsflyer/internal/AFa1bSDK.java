package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

public final class AFa1bSDK {
    public static boolean values(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    public static boolean AFInAppEventParameterName(Context context, String str) {
        int checkPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(checkPermission);
        AFLogger.afRDLog(sb.toString());
        return checkPermission == 0;
    }

    public static boolean valueOf() {
        return Build.BRAND.equals("OPPO");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        if (r2.equals("c") != false) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.Map<java.lang.String, java.lang.String> AFInAppEventType(android.content.Context r11, java.util.Map<java.lang.String, java.lang.String> r12, android.net.Uri r13) {
        /*
            java.lang.String r0 = "install_time"
            java.util.Set r1 = r13.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x000a:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "agency"
            java.lang.String r4 = "media_source"
            r5 = 0
            if (r2 == 0) goto L_0x0068
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r13.getQueryParameter(r2)
            boolean r7 = r12.containsKey(r2)
            if (r7 != 0) goto L_0x0063
            int r7 = r2.hashCode()
            r8 = -1420799080(0xffffffffab505398, float:-7.4012454E-13)
            r9 = 1
            r10 = 2
            if (r7 == r8) goto L_0x004c
            r8 = 99
            if (r7 == r8) goto L_0x0043
            r5 = 110987(0x1b18b, float:1.55526E-40)
            if (r7 != r5) goto L_0x0056
            java.lang.String r5 = "pid"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0043:
            java.lang.String r7 = "c"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L_0x0056
            goto L_0x0057
        L_0x004c:
            java.lang.String r5 = "af_prt"
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0056
            r5 = 2
            goto L_0x0057
        L_0x0056:
            r5 = -1
        L_0x0057:
            if (r5 == 0) goto L_0x0060
            if (r5 == r9) goto L_0x005e
            if (r5 != r10) goto L_0x0063
            goto L_0x0064
        L_0x005e:
            r3 = r4
            goto L_0x0064
        L_0x0060:
            java.lang.String r3 = "campaign"
            goto L_0x0064
        L_0x0063:
            r3 = r2
        L_0x0064:
            r12.put(r3, r6)
            goto L_0x000a
        L_0x0068:
            boolean r1 = r12.containsKey(r0)     // Catch:{ Exception -> 0x009b }
            if (r1 != 0) goto L_0x00a1
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x009b }
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ Exception -> 0x009b }
            r1.<init>(r2, r6)     // Catch:{ Exception -> 0x009b }
            android.content.pm.PackageManager r2 = r11.getPackageManager()     // Catch:{ Exception -> 0x009b }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ Exception -> 0x009b }
            android.content.pm.PackageInfo r11 = r2.getPackageInfo(r11, r5)     // Catch:{ Exception -> 0x009b }
            long r5 = r11.firstInstallTime     // Catch:{ Exception -> 0x009b }
            java.lang.String r11 = "UTC"
            java.util.TimeZone r11 = java.util.TimeZone.getTimeZone(r11)     // Catch:{ Exception -> 0x009b }
            r1.setTimeZone(r11)     // Catch:{ Exception -> 0x009b }
            java.util.Date r11 = new java.util.Date     // Catch:{ Exception -> 0x009b }
            r11.<init>(r5)     // Catch:{ Exception -> 0x009b }
            java.lang.String r11 = r1.format(r11)     // Catch:{ Exception -> 0x009b }
            r12.put(r0, r11)     // Catch:{ Exception -> 0x009b }
            goto L_0x00a1
        L_0x009b:
            r11 = move-exception
            java.lang.String r0 = "Could not fetch install time. "
            com.appsflyer.AFLogger.afErrorLog(r0, r11)
        L_0x00a1:
            java.lang.String r11 = "af_deeplink"
            boolean r11 = r12.containsKey(r11)
            if (r11 == 0) goto L_0x00b6
            java.lang.String r11 = "af_status"
            boolean r0 = r12.containsKey(r11)
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "Non-organic"
            r12.put(r11, r0)
        L_0x00b6:
            boolean r11 = r12.containsKey(r3)
            if (r11 == 0) goto L_0x00bf
            r12.remove(r4)
        L_0x00bf:
            java.lang.String r11 = r13.getPath()
            if (r11 == 0) goto L_0x00ca
            java.lang.String r0 = "path"
            r12.put(r0, r11)
        L_0x00ca:
            java.lang.String r11 = r13.getScheme()
            if (r11 == 0) goto L_0x00d5
            java.lang.String r0 = "scheme"
            r12.put(r0, r11)
        L_0x00d5:
            java.lang.String r11 = r13.getHost()
            if (r11 == 0) goto L_0x00e0
            java.lang.String r13 = "host"
            r12.put(r13, r11)
        L_0x00e0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1bSDK.AFInAppEventType(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    public static String values(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException, CertificateException, NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        instance.update(((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getEncoded());
        return String.format("%032X", new Object[]{new BigInteger(1, instance.digest())});
    }

    public static long AFKeystoreWrapper(Context context, String str) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return (long) packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0;
        }
    }

    public static String values(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }
}
