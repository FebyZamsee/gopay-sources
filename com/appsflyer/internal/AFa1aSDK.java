package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AFLogger;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

public final class AFa1aSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventType = 0;
    private static int valueOf = 1;
    private static char[] values = {40075, 40128, 40129, 40138, 40141, 40136, 40138, 40143, 39984, 40137, 40132, 40141};

    public static String AFInAppEventParameterName(String str) {
        String str2;
        valueOf = (AFInAppEventType + 35) % 128;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.reset();
            instance.update(str.getBytes(Charset.defaultCharset()));
            str2 = AFInAppEventType(instance.digest());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error turning ");
            sb.append(str.substring(0, 6));
            sb.append(".. to SHA1");
            AFLogger.afErrorLog(sb.toString(), e);
            str2 = null;
        }
        valueOf = (AFInAppEventType + 107) % 128;
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r3 = AFInAppEventType(r0.digest());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String AFInAppEventType(java.lang.String r5) {
        /*
            int r0 = valueOf
            int r0 = r0 + 41
            int r1 = r0 % 128
            AFInAppEventType = r1
            int r0 = r0 % 2
            r1 = 47
            if (r0 == 0) goto L_0x0011
            r0 = 23
            goto L_0x0013
        L_0x0011:
            r0 = 47
        L_0x0013:
            java.lang.String r2 = "MD5"
            r3 = 0
            if (r0 != r1) goto L_0x003b
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x005e }
            r0.reset()     // Catch:{ Exception -> 0x005e }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x005e }
            byte[] r1 = r5.getBytes(r1)     // Catch:{ Exception -> 0x005e }
            r0.update(r1)     // Catch:{ Exception -> 0x005e }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x005e }
            java.lang.String r5 = AFInAppEventType((byte[]) r0)     // Catch:{ Exception -> 0x005e }
            int r0 = AFInAppEventType
            int r0 = r0 + 91
            int r0 = r0 % 128
            valueOf = r0
            goto L_0x007d
        L_0x003b:
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x005e }
            r0.reset()     // Catch:{ Exception -> 0x005e }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x005e }
            byte[] r1 = r5.getBytes(r1)     // Catch:{ Exception -> 0x005e }
            r0.update(r1)     // Catch:{ Exception -> 0x005e }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x005e }
            java.lang.String r0 = AFInAppEventType((byte[]) r0)     // Catch:{ Exception -> 0x005e }
            r3.hashCode()     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
            throw r3     // Catch:{ Exception -> 0x005b, all -> 0x0059 }
        L_0x0059:
            r5 = move-exception
            throw r5
        L_0x005b:
            r1 = move-exception
            r3 = r0
            goto L_0x0060
        L_0x005e:
            r0 = move-exception
            r1 = r0
        L_0x0060:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Error turning "
            r0.<init>(r2)
            r2 = 0
            r4 = 6
            java.lang.String r5 = r5.substring(r2, r4)
            r0.append(r5)
            java.lang.String r5 = ".. to MD5"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r5, r1)
            r5 = r3
        L_0x007d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFInAppEventType(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String AFKeystoreWrapper(java.lang.String r5) {
        /*
            int r0 = AFInAppEventType
            int r0 = r0 + 93
            int r1 = r0 % 128
            valueOf = r1
            int r0 = r0 % 2
            r1 = 6
            if (r0 != 0) goto L_0x000f
            r0 = 5
            goto L_0x0010
        L_0x000f:
            r0 = 6
        L_0x0010:
            java.lang.String r2 = "SHA-256"
            r3 = 0
            if (r0 != r1) goto L_0x002d
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x004a }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x004a }
            byte[] r2 = r5.getBytes(r2)     // Catch:{ Exception -> 0x004a }
            r0.update(r2)     // Catch:{ Exception -> 0x004a }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x004a }
            java.lang.String r5 = AFInAppEventParameterName((byte[]) r0)     // Catch:{ Exception -> 0x004a }
            goto L_0x0068
        L_0x002d:
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x004a }
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x004a }
            byte[] r2 = r5.getBytes(r2)     // Catch:{ Exception -> 0x004a }
            r0.update(r2)     // Catch:{ Exception -> 0x004a }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x004a }
            java.lang.String r0 = AFInAppEventParameterName((byte[]) r0)     // Catch:{ Exception -> 0x004a }
            throw r3     // Catch:{ Exception -> 0x0047, all -> 0x0045 }
        L_0x0045:
            r5 = move-exception
            throw r5
        L_0x0047:
            r2 = move-exception
            r3 = r0
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            r2 = r0
        L_0x004c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Error turning "
            r0.<init>(r4)
            r4 = 0
            java.lang.String r5 = r5.substring(r4, r1)
            r0.append(r5)
            java.lang.String r5 = ".. to SHA-256"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.appsflyer.AFLogger.afErrorLog(r5, r2)
            r5 = r3
        L_0x0068:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.AFKeystoreWrapper(java.lang.String):java.lang.String");
    }

    private static String AFInAppEventParameterName(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (!(i < length)) {
                return sb.toString();
            }
            int i2 = valueOf + 67;
            AFInAppEventType = i2 % 128;
            if ((i2 % 2 != 0 ? '[' : 'U') != 'U') {
                sb.append(Integer.toString((bArr[i] | 30505) << 10965, 33).substring(0));
                i += 21;
            } else {
                sb.append(Integer.toString((bArr[i] & 255) + 256, 16).substring(1));
                i++;
            }
            AFInAppEventType = (valueOf + 53) % 128;
        }
    }

    private static String AFInAppEventType(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        valueOf = (AFInAppEventType + 85) % 128;
        int i = 0;
        while (i < length) {
            int i2 = valueOf + 89;
            AFInAppEventType = i2 % 128;
            if ((i2 % 2 != 0 ? '8' : 'S') != '8') {
                formatter.format("%02x", new Object[]{Byte.valueOf(bArr[i])});
                i++;
            } else {
                Object[] objArr = new Object[1];
                objArr[1] = Byte.valueOf(bArr[i]);
                formatter.format("%02x", objArr);
                i += 127;
            }
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    public static String valueOf(String str, String str2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(str2.getBytes(Charset.defaultCharset()), "HmacSHA256"));
            String lowerCase = AFInAppEventParameterName(instance.doFinal(str.getBytes(Charset.defaultCharset()))).toLowerCase(Locale.getDefault());
            valueOf = (AFInAppEventType + 109) % 128;
            return lowerCase;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            AFLogger.afErrorLog(e.getMessage(), e, true);
            return e.getMessage();
        }
    }

    public static boolean AFInAppEventParameterName(Map<String, Object> map, String[] strArr, AFc1vSDK aFc1vSDK) throws IllegalStateException {
        valueOf = (AFInAppEventType + 85) % 128;
        if ((map != null ? (char) 10 : 17) == 17 || !(!map.isEmpty())) {
            int i = AFInAppEventType + 65;
            valueOf = i % 128;
            if (i % 2 != 0) {
                return false;
            }
            throw new ArithmeticException();
        }
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if ((!map.containsKey(strArr[i2]) ? 'U' : 19) != 19) {
                    return false;
                }
                i2++;
            } else {
                String str = (String) map.remove("sig");
                if (str == null) {
                    int i3 = valueOf + 67;
                    AFInAppEventType = i3 % 128;
                    return !(i3 % 2 == 0);
                }
                String AFKeystoreWrapper = AFc1vSDK.AFKeystoreWrapper();
                StringBuilder sb = new StringBuilder();
                sb.append(new JSONObject(map));
                sb.append(AFKeystoreWrapper);
                boolean equals = valueOf(sb.toString(), AFb1rSDK.valueOf(new WeakReference(aFc1vSDK.AFInAppEventParameterName.AFInAppEventType))).equals(str);
                int i4 = AFInAppEventType + 51;
                valueOf = i4 % 128;
                if (i4 % 2 != 0) {
                    return equals;
                }
                Throwable th = null;
                th.hashCode();
                throw th;
            }
        }
    }

    public static String AFKeystoreWrapper(Map<String, Object> map) {
        Object[] objArr = new Object[1];
        values("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 16, 0}, objArr);
        String str = (String) map.get(((String) objArr[0]).intern());
        StringBuilder sb = new StringBuilder();
        sb.append(((String) map.get("appsflyerKey")).substring(0, 7));
        sb.append(((String) map.get("uid")).substring(0, 7));
        sb.append(str.substring(str.length() - 7));
        String AFInAppEventParameterName = AFInAppEventParameterName(sb.toString());
        valueOf = (AFInAppEventType + 87) % 128;
        return AFInAppEventParameterName;
    }

    public static String AFInAppEventParameterName(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) map.get("appsflyerKey"));
        Object[] objArr = new Object[1];
        values("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 16, 0}, objArr);
        sb.append(map.get(((String) objArr[0]).intern()));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(map.get("uid"));
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(map.get("installDate"));
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(map.get("counter"));
        String obj4 = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj4);
        sb5.append(map.get("iaecounter"));
        String AFInAppEventParameterName = AFInAppEventParameterName(AFInAppEventType(sb5.toString()));
        valueOf = (AFInAppEventType + 33) % 128;
        return AFInAppEventParameterName;
    }

    public static String AFInAppEventType(String... strArr) {
        int i = valueOf + 101;
        AFInAppEventType = i % 128;
        Throwable th = null;
        if (i % 2 == 0) {
            String join = TextUtils.join("⁣", strArr);
            int i2 = valueOf + 53;
            AFInAppEventType = i2 % 128;
            if ((i2 % 2 != 0 ? 'P' : '`') == '`') {
                return join;
            }
            throw th;
        }
        TextUtils.join("⁣", strArr);
        th.hashCode();
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ec  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0307  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void values(java.lang.String r20, boolean r21, int[] r22, java.lang.Object[] r23) {
        /*
            r0 = r20
            if (r0 == 0) goto L_0x000a
            java.lang.String r1 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r1)
        L_0x000a:
            byte[] r0 = (byte[]) r0
            com.appsflyer.internal.AFh1vSDK r1 = new com.appsflyer.internal.AFh1vSDK
            r1.<init>()
            r2 = 0
            r3 = r22[r2]
            r4 = 1
            r5 = r22[r4]
            r6 = 2
            r7 = r22[r6]
            r8 = 3
            r8 = r22[r8]
            char[] r9 = values
            java.lang.String r11 = ""
            if (r9 == 0) goto L_0x0123
            int r12 = $11
            int r12 = r12 + 89
            int r13 = r12 % 128
            $10 = r13
            int r12 = r12 % r6
            r13 = 64
            if (r12 == 0) goto L_0x0033
            r12 = 62
            goto L_0x0035
        L_0x0033:
            r12 = 64
        L_0x0035:
            if (r12 == r13) goto L_0x003b
            int r12 = r9.length
            char[] r13 = new char[r12]
            goto L_0x003e
        L_0x003b:
            int r12 = r9.length
            char[] r13 = new char[r12]
        L_0x003e:
            r14 = 0
        L_0x003f:
            if (r14 >= r12) goto L_0x0122
            int r15 = $11
            int r15 = r15 + 111
            int r10 = r15 % 128
            $10 = r10
            int r15 = r15 % r6
            java.lang.String r10 = "g"
            r16 = -1590198020(0xffffffffa13780fc, float:-6.217352E-19)
            if (r15 == 0) goto L_0x00b5
            char r15 = r9[r14]
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x00ac }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x00ac }
            r6[r2] = r15     // Catch:{ all -> 0x00ac }
            java.util.Map<java.lang.Integer, java.lang.Object> r15 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00ac }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00ac }
            java.lang.Object r4 = r15.get(r4)     // Catch:{ all -> 0x00ac }
            if (r4 != 0) goto L_0x009c
            r4 = 52321(0xcc61, float:7.3317E-41)
            float r15 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x00ac }
            r17 = 0
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            int r4 = r4 - r15
            char r4 = (char) r4     // Catch:{ all -> 0x00ac }
            int r15 = android.view.View.MeasureSpec.getSize(r2)     // Catch:{ all -> 0x00ac }
            int r15 = 196 - r15
            int r17 = android.text.TextUtils.getCapsMode(r11, r2, r2)     // Catch:{ all -> 0x00ac }
            int r2 = 37 - r17
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r4, r15, r2)     // Catch:{ all -> 0x00ac }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x00ac }
            r4 = 1
            java.lang.Class[] r15 = new java.lang.Class[r4]     // Catch:{ all -> 0x00ac }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ac }
            r17 = 0
            r15[r17] = r4     // Catch:{ all -> 0x00ac }
            java.lang.reflect.Method r4 = r2.getMethod(r10, r15)     // Catch:{ all -> 0x00ac }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00ac }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x00ac }
            r2.put(r10, r4)     // Catch:{ all -> 0x00ac }
        L_0x009c:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x00ac }
            r2 = 0
            java.lang.Object r4 = r4.invoke(r2, r6)     // Catch:{ all -> 0x00ac }
            java.lang.Character r4 = (java.lang.Character) r4     // Catch:{ all -> 0x00ac }
            char r2 = r4.charValue()     // Catch:{ all -> 0x00ac }
            r13[r14] = r2
            goto L_0x0114
        L_0x00ac:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00b4
            throw r1
        L_0x00b4:
            throw r0
        L_0x00b5:
            char r2 = r9[r14]
            r4 = 1
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x0119 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0119 }
            r4 = 0
            r6[r4] = r2     // Catch:{ all -> 0x0119 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0119 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0119 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ all -> 0x0119 }
            if (r2 != 0) goto L_0x0103
            r2 = 48
            int r2 = android.text.TextUtils.indexOf(r11, r2)     // Catch:{ all -> 0x0119 }
            r4 = 52322(0xcc62, float:7.3319E-41)
            int r2 = r2 + r4
            char r2 = (char) r2     // Catch:{ all -> 0x0119 }
            r4 = 0
            int r15 = android.view.KeyEvent.getDeadChar(r4, r4)     // Catch:{ all -> 0x0119 }
            int r15 = r15 + 196
            int r4 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x0119 }
            int r4 = r4 >> 16
            int r4 = 37 - r4
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r2, r15, r4)     // Catch:{ all -> 0x0119 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0119 }
            r4 = 1
            java.lang.Class[] r15 = new java.lang.Class[r4]     // Catch:{ all -> 0x0119 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0119 }
            r17 = 0
            r15[r17] = r4     // Catch:{ all -> 0x0119 }
            java.lang.reflect.Method r2 = r2.getMethod(r10, r15)     // Catch:{ all -> 0x0119 }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0119 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0119 }
            r4.put(r10, r2)     // Catch:{ all -> 0x0119 }
        L_0x0103:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0119 }
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r6)     // Catch:{ all -> 0x0119 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x0119 }
            char r2 = r2.charValue()     // Catch:{ all -> 0x0119 }
            r13[r14] = r2
            int r14 = r14 + 1
        L_0x0114:
            r2 = 0
            r4 = 1
            r6 = 2
            goto L_0x003f
        L_0x0119:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0121
            throw r1
        L_0x0121:
            throw r0
        L_0x0122:
            r9 = r13
        L_0x0123:
            char[] r2 = new char[r5]
            r4 = 0
            java.lang.System.arraycopy(r9, r3, r2, r4, r5)
            if (r0 == 0) goto L_0x02a8
            int r3 = $11
            int r3 = r3 + 95
            int r6 = r3 % 128
            $10 = r6
            r6 = 2
            int r3 = r3 % r6
            char[] r3 = new char[r5]
            r1.valueOf = r4
            r4 = 0
        L_0x013a:
            int r6 = r1.valueOf
            if (r6 >= r5) goto L_0x02a7
            int r6 = r1.valueOf
            byte r6 = r0[r6]
            r9 = 1
            if (r6 != r9) goto L_0x01c8
            int r6 = $10
            int r6 = r6 + 63
            int r6 = r6 % 128
            $11 = r6
            int r6 = r1.valueOf
            int r9 = r1.valueOf
            char r9 = r2[r9]
            r10 = 2
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x01bf }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x01bf }
            r10 = 1
            r12[r10] = r4     // Catch:{ all -> 0x01bf }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01bf }
            r9 = 0
            r12[r9] = r4     // Catch:{ all -> 0x01bf }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x01bf }
            r9 = 1784971396(0x6a648084, float:6.9060496E25)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01bf }
            java.lang.Object r4 = r4.get(r10)     // Catch:{ all -> 0x01bf }
            if (r4 != 0) goto L_0x01af
            r4 = 47725(0xba6d, float:6.6877E-41)
            int r10 = android.view.ViewConfiguration.getScrollDefaultDelay()     // Catch:{ all -> 0x01bf }
            int r10 = r10 >> 16
            int r4 = r4 - r10
            char r4 = (char) r4     // Catch:{ all -> 0x01bf }
            r10 = 0
            int r13 = android.graphics.Color.red(r10)     // Catch:{ all -> 0x01bf }
            int r10 = 233 - r13
            int r13 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x01bf }
            int r13 = r13 >> 8
            int r13 = 36 - r13
            java.lang.Object r4 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r4, r10, r13)     // Catch:{ all -> 0x01bf }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x01bf }
            r10 = 2
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x01bf }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01bf }
            r14 = 0
            r13[r14] = r10     // Catch:{ all -> 0x01bf }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01bf }
            r14 = 1
            r13[r14] = r10     // Catch:{ all -> 0x01bf }
            java.lang.String r10 = "f"
            java.lang.reflect.Method r4 = r4.getMethod(r10, r13)     // Catch:{ all -> 0x01bf }
            java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x01bf }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x01bf }
            r10.put(r9, r4)     // Catch:{ all -> 0x01bf }
        L_0x01af:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x01bf }
            r9 = 0
            java.lang.Object r4 = r4.invoke(r9, r12)     // Catch:{ all -> 0x01bf }
            java.lang.Character r4 = (java.lang.Character) r4     // Catch:{ all -> 0x01bf }
            char r4 = r4.charValue()     // Catch:{ all -> 0x01bf }
            r3[r6] = r4
            goto L_0x0236
        L_0x01bf:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x01c7
            throw r1
        L_0x01c7:
            throw r0
        L_0x01c8:
            int r6 = r1.valueOf
            int r9 = r1.valueOf
            char r9 = r2[r9]
            r10 = 2
            java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x029e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x029e }
            r10 = 1
            r12[r10] = r4     // Catch:{ all -> 0x029e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x029e }
            r9 = 0
            r12[r9] = r4     // Catch:{ all -> 0x029e }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x029e }
            r9 = -1969424820(0xffffffff8a9cf64c, float:-1.51149E-32)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x029e }
            java.lang.Object r4 = r4.get(r10)     // Catch:{ all -> 0x029e }
            if (r4 != 0) goto L_0x0227
            int r4 = android.text.TextUtils.indexOf(r11, r11)     // Catch:{ all -> 0x029e }
            int r4 = 5147 - r4
            char r4 = (char) r4     // Catch:{ all -> 0x029e }
            long r13 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ all -> 0x029e }
            r15 = -1
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            int r10 = r10 + 341
            r13 = 0
            int r14 = android.text.TextUtils.getCapsMode(r11, r13, r13)     // Catch:{ all -> 0x029e }
            int r14 = 37 - r14
            java.lang.Object r4 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r4, r10, r14)     // Catch:{ all -> 0x029e }
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ all -> 0x029e }
            r10 = 2
            java.lang.Class[] r14 = new java.lang.Class[r10]     // Catch:{ all -> 0x029e }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x029e }
            r14[r13] = r10     // Catch:{ all -> 0x029e }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x029e }
            r13 = 1
            r14[r13] = r10     // Catch:{ all -> 0x029e }
            java.lang.String r10 = "k"
            java.lang.reflect.Method r4 = r4.getMethod(r10, r14)     // Catch:{ all -> 0x029e }
            java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x029e }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x029e }
            r10.put(r9, r4)     // Catch:{ all -> 0x029e }
        L_0x0227:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch:{ all -> 0x029e }
            r9 = 0
            java.lang.Object r4 = r4.invoke(r9, r12)     // Catch:{ all -> 0x029e }
            java.lang.Character r4 = (java.lang.Character) r4     // Catch:{ all -> 0x029e }
            char r4 = r4.charValue()     // Catch:{ all -> 0x029e }
            r3[r6] = r4
        L_0x0236:
            int r4 = r1.valueOf
            char r4 = r3[r4]
            r6 = 2
            java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ all -> 0x0295 }
            r6 = 1
            r9[r6] = r1     // Catch:{ all -> 0x0295 }
            r6 = 0
            r9[r6] = r1     // Catch:{ all -> 0x0295 }
            java.util.Map<java.lang.Integer, java.lang.Object> r10 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0295 }
            r12 = -1158403531(0xffffffffbaf42a35, float:-0.0018628301)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0295 }
            java.lang.Object r10 = r10.get(r13)     // Catch:{ all -> 0x0295 }
            if (r10 != 0) goto L_0x028d
            int r10 = android.graphics.drawable.Drawable.resolveOpacity(r6, r6)     // Catch:{ all -> 0x0295 }
            int r10 = r10 + 23637
            char r10 = (char) r10     // Catch:{ all -> 0x0295 }
            int r13 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ all -> 0x0295 }
            int r13 = r13 >> 16
            int r13 = r13 + 160
            long r14 = android.widget.ExpandableListView.getPackedPositionForChild(r6, r6)     // Catch:{ all -> 0x0295 }
            r18 = 0
            int r6 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            int r6 = 35 - r6
            java.lang.Object r6 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r10, r13, r6)     // Catch:{ all -> 0x0295 }
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x0295 }
            r10 = 2
            java.lang.Class[] r13 = new java.lang.Class[r10]     // Catch:{ all -> 0x0295 }
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r14 = 0
            r13[r14] = r10     // Catch:{ all -> 0x0295 }
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r14 = 1
            r13[r14] = r10     // Catch:{ all -> 0x0295 }
            java.lang.String r10 = "m"
            java.lang.reflect.Method r10 = r6.getMethod(r10, r13)     // Catch:{ all -> 0x0295 }
            java.util.Map<java.lang.Integer, java.lang.Object> r6 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0295 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0295 }
            r6.put(r12, r10)     // Catch:{ all -> 0x0295 }
        L_0x028d:
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch:{ all -> 0x0295 }
            r6 = 0
            r10.invoke(r6, r9)     // Catch:{ all -> 0x0295 }
            goto L_0x013a
        L_0x0295:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x029d
            throw r1
        L_0x029d:
            throw r0
        L_0x029e:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x02a6
            throw r1
        L_0x02a6:
            throw r0
        L_0x02a7:
            r2 = r3
        L_0x02a8:
            r0 = 60
            if (r8 <= 0) goto L_0x02af
            r3 = 60
            goto L_0x02b0
        L_0x02af:
            r3 = 5
        L_0x02b0:
            if (r3 != r0) goto L_0x02e7
            int r0 = $10
            int r0 = r0 + 105
            int r3 = r0 % 128
            $11 = r3
            r3 = 2
            int r0 = r0 % r3
            r3 = 87
            if (r0 != 0) goto L_0x02c3
            r0 = 87
            goto L_0x02c5
        L_0x02c3:
            r0 = 13
        L_0x02c5:
            if (r0 == r3) goto L_0x02d6
            char[] r0 = new char[r5]
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r5)
            int r4 = r5 - r8
            java.lang.System.arraycopy(r0, r3, r2, r4, r8)
            java.lang.System.arraycopy(r0, r8, r2, r3, r4)
            goto L_0x02e7
        L_0x02d6:
            char[] r0 = new char[r5]
            r3 = 1
            java.lang.System.arraycopy(r2, r3, r0, r3, r5)
            int r4 = r5 - r8
            java.lang.System.arraycopy(r0, r3, r2, r4, r8)
            int r4 = r5 / r8
            java.lang.System.arraycopy(r0, r8, r2, r3, r4)
            goto L_0x02e8
        L_0x02e7:
            r3 = 1
        L_0x02e8:
            r0 = r21 ^ 1
            if (r0 != 0) goto L_0x0305
            char[] r0 = new char[r5]
            r4 = 0
        L_0x02ef:
            r1.valueOf = r4
            int r4 = r1.valueOf
            if (r4 >= r5) goto L_0x0304
            int r4 = r1.valueOf
            int r6 = r1.valueOf
            int r6 = r5 - r6
            int r6 = r6 - r3
            char r6 = r2[r6]
            r0[r4] = r6
            int r4 = r1.valueOf
            int r4 = r4 + r3
            goto L_0x02ef
        L_0x0304:
            r2 = r0
        L_0x0305:
            if (r7 <= 0) goto L_0x0320
            r0 = 0
        L_0x0308:
            r1.valueOf = r0
            int r0 = r1.valueOf
            if (r0 >= r5) goto L_0x0320
            int r0 = r1.valueOf
            int r3 = r1.valueOf
            char r3 = r2[r3]
            r4 = 2
            r6 = r22[r4]
            int r3 = r3 - r6
            char r3 = (char) r3
            r2[r0] = r3
            int r0 = r1.valueOf
            r3 = 1
            int r0 = r0 + r3
            goto L_0x0308
        L_0x0320:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            r1 = 0
            r23[r1] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1aSDK.values(java.lang.String, boolean, int[], java.lang.Object[]):void");
    }
}
