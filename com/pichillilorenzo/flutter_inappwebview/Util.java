package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.pichillilorenzo.flutter_inappwebview.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview.types.SyncBaseCallbackResultImpl;
import io.flutter.plugin.common.MethodChannel;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class Util {
    public static final String ANDROID_ASSET_URL = "file:///android_asset/";
    static final String LOG_TAG = "Util";
    public static final int RemoteActionCompatParcelizer = 252;
    private static int asBinder = 0;
    private static byte[] asInterface = {39, -49, 66, 81, -61, 1, 15, -6, 60, 8, 19, 8, -5, 3, 9, 0, 4, 25, -9};
    private static int onTransact = 1;

    public static void log(String str, String str2) {
    }

    private Util() {
    }

    public static String getUrlAsset(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str) throws IOException {
        IOException e;
        String lookupKeyForAsset = inAppWebViewFlutterPlugin.registrar != null ? inAppWebViewFlutterPlugin.registrar.lookupKeyForAsset(str) : inAppWebViewFlutterPlugin.flutterAssets.getAssetFilePathByName(str);
        InputStream fileAsset = getFileAsset(inAppWebViewFlutterPlugin, str);
        if (fileAsset != null) {
            try {
                fileAsset.close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        e = null;
        if (e == null) {
            StringBuilder sb = new StringBuilder(ANDROID_ASSET_URL);
            sb.append(lookupKeyForAsset);
            return sb.toString();
        }
        throw e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        if ((r0 != null ? '%' : 11) != 11) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002a, code lost:
        if (r7.registrar != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        r8 = r7.flutterAssets.getAssetFilePathByName(r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.InputStream getFileAsset(com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r7, java.lang.String r8) throws java.io.IOException {
        /*
            int r0 = onTransact     // Catch:{ Exception -> 0x00ac }
            int r0 = r0 + 29
            int r1 = r0 % 128
            asBinder = r1     // Catch:{ Exception -> 0x00aa }
            r1 = 2
            int r0 = r0 % r1
            r2 = 42
            if (r0 == 0) goto L_0x0011
            r0 = 99
            goto L_0x0013
        L_0x0011:
            r0 = 42
        L_0x0013:
            r3 = 0
            r4 = 0
            if (r0 == r2) goto L_0x0028
            io.flutter.plugin.common.PluginRegistry$Registrar r0 = r7.registrar
            int r2 = r3.length     // Catch:{ all -> 0x0026 }
            r2 = 11
            if (r0 == 0) goto L_0x0021
            r0 = 37
            goto L_0x0023
        L_0x0021:
            r0 = 11
        L_0x0023:
            if (r0 == r2) goto L_0x004a
            goto L_0x002c
        L_0x0026:
            r7 = move-exception
            throw r7
        L_0x0028:
            io.flutter.plugin.common.PluginRegistry$Registrar r0 = r7.registrar
            if (r0 == 0) goto L_0x004a
        L_0x002c:
            int r0 = onTransact
            int r0 = r0 + 13
            int r2 = r0 % 128
            asBinder = r2
            int r0 = r0 % r1
            if (r0 == 0) goto L_0x0043
            io.flutter.plugin.common.PluginRegistry$Registrar r0 = r7.registrar
            java.lang.String r8 = r0.lookupKeyForAsset(r8)
            r0 = 57
            int r0 = r0 / r4
            goto L_0x0050
        L_0x0041:
            r7 = move-exception
            throw r7
        L_0x0043:
            io.flutter.plugin.common.PluginRegistry$Registrar r0 = r7.registrar
            java.lang.String r8 = r0.lookupKeyForAsset(r8)
            goto L_0x0050
        L_0x004a:
            io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterAssets r0 = r7.flutterAssets
            java.lang.String r8 = r0.getAssetFilePathByName(r8)
        L_0x0050:
            android.content.Context r7 = r7.applicationContext
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.AssetManager r7 = r7.getAssets()
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a1 }
            r2 = 1
            r0[r2] = r8     // Catch:{ all -> 0x00a1 }
            r0[r4] = r7     // Catch:{ all -> 0x00a1 }
            r7 = 51420(0xc8dc, float:7.2055E-41)
            float r8 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x00a1 }
            r5 = 0
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            int r7 = r7 - r8
            char r7 = (char) r7     // Catch:{ all -> 0x00a1 }
            float r8 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x00a1 }
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            int r8 = r8 + 19
            int r5 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x00a1 }
            int r5 = r5 >> 16
            java.lang.Object r7 = o.onItemClicked.onTransact(r7, r8, r5)     // Catch:{ all -> 0x00a1 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x00a1 }
            java.lang.String r8 = "read"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x00a1 }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r5[r4] = r6     // Catch:{ all -> 0x00a1 }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5[r2] = r4     // Catch:{ all -> 0x00a1 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r5)     // Catch:{ all -> 0x00a1 }
            java.lang.Object r7 = r7.invoke(r3, r0)     // Catch:{ all -> 0x00a1 }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ all -> 0x00a1 }
            int r8 = asBinder
            int r8 = r8 + 61
            int r0 = r8 % 128
            onTransact = r0
            int r8 = r8 % r1
            return r7
        L_0x00a1:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()
            if (r8 == 0) goto L_0x00a9
            throw r8
        L_0x00a9:
            throw r7
        L_0x00aa:
            r7 = move-exception
            throw r7
        L_0x00ac:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.Util.getFileAsset(com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin, java.lang.String):java.io.InputStream");
    }

    public static <T> T invokeMethodAndWaitResult(final MethodChannel methodChannel, final String str, final Object obj, final SyncBaseCallbackResultImpl<T> syncBaseCallbackResultImpl) throws InterruptedException {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                MethodChannel.this.invokeMethod(str, obj, syncBaseCallbackResultImpl);
            }
        });
        syncBaseCallbackResultImpl.latch.await();
        return syncBaseCallbackResultImpl.result;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r2 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        if (r2 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
        r2.printStackTrace();
        r2.getMessage();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.pichillilorenzo.flutter_inappwebview.Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate(com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.InputStream r2 = getFileAsset(r2, r3)     // Catch:{ IOException -> 0x0006 }
            goto L_0x0007
        L_0x0006:
            r2 = r0
        L_0x0007:
            if (r2 != 0) goto L_0x000f
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0056 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0056 }
            r2 = r1
        L_0x000f:
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r5)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0019
            r1 = r4
            goto L_0x001a
        L_0x0019:
            r1 = r5
        L_0x001a:
            char[] r1 = r1.toCharArray()     // Catch:{ Exception -> 0x0056 }
            r3.load(r2, r1)     // Catch:{ Exception -> 0x0056 }
            java.util.Enumeration r1 = r3.aliases()     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r1 = r1.nextElement()     // Catch:{ Exception -> 0x0056 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0056 }
            if (r4 != 0) goto L_0x002e
            r4 = r5
        L_0x002e:
            char[] r4 = r4.toCharArray()     // Catch:{ Exception -> 0x0056 }
            java.security.Key r4 = r3.getKey(r1, r4)     // Catch:{ Exception -> 0x0056 }
            boolean r5 = r4 instanceof java.security.PrivateKey
            if (r5 == 0) goto L_0x004e
            java.security.PrivateKey r4 = (java.security.PrivateKey) r4     // Catch:{ Exception -> 0x0056 }
            java.security.cert.Certificate r3 = r3.getCertificate(r1)     // Catch:{ Exception -> 0x0056 }
            r5 = 1
            java.security.cert.X509Certificate[] r5 = new java.security.cert.X509Certificate[r5]     // Catch:{ Exception -> 0x0056 }
            r1 = 0
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch:{ Exception -> 0x0056 }
            r5[r1] = r3     // Catch:{ Exception -> 0x0056 }
            com.pichillilorenzo.flutter_inappwebview.Util$PrivateKeyAndCertificates r3 = new com.pichillilorenzo.flutter_inappwebview.Util$PrivateKeyAndCertificates     // Catch:{ Exception -> 0x0056 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0056 }
            r0 = r3
        L_0x004e:
            r2.close()     // Catch:{ Exception -> 0x0056 }
            if (r2 == 0) goto L_0x006a
            goto L_0x005f
        L_0x0054:
            r3 = move-exception
            goto L_0x006b
        L_0x0056:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ all -> 0x0054 }
            r3.getMessage()     // Catch:{ all -> 0x0054 }
            if (r2 == 0) goto L_0x006a
        L_0x005f:
            r2.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x006a
        L_0x0063:
            r2 = move-exception
            r2.printStackTrace()
            r2.getMessage()
        L_0x006a:
            return r0
        L_0x006b:
            if (r2 == 0) goto L_0x0078
            r2.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0078
        L_0x0071:
            r2 = move-exception
            r2.printStackTrace()
            r2.getMessage()
        L_0x0078:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.Util.loadPrivateKeyAndCertificate(com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin, java.lang.String, java.lang.String, java.lang.String):com.pichillilorenzo.flutter_inappwebview.Util$PrivateKeyAndCertificates");
    }

    public static class PrivateKeyAndCertificates {
        public X509Certificate[] certificates;
        public PrivateKey privateKey;

        public PrivateKeyAndCertificates(PrivateKey privateKey2, X509Certificate[] x509CertificateArr) {
            this.privateKey = privateKey2;
            this.certificates = x509CertificateArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.HttpURLConnection makeHttpRequest(java.lang.String r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x005c }
            r1.<init>(r3)     // Catch:{ Exception -> 0x005c }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Exception -> 0x005c }
            java.lang.Object r3 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r3)     // Catch:{ Exception -> 0x005c }
            java.net.URLConnection r3 = (java.net.URLConnection) r3     // Catch:{ Exception -> 0x005c }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x005c }
            r3.setRequestMethod(r4)     // Catch:{ Exception -> 0x005a }
            if (r5 == 0) goto L_0x003b
            java.util.Set r5 = r5.entrySet()     // Catch:{ Exception -> 0x005a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x005a }
        L_0x001f:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x005a }
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x005a }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x005a }
            java.lang.Object r2 = r1.getKey()     // Catch:{ Exception -> 0x005a }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x005a }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x005a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x005a }
            r3.setRequestProperty(r2, r1)     // Catch:{ Exception -> 0x005a }
            goto L_0x001f
        L_0x003b:
            r5 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r5)     // Catch:{ Exception -> 0x005a }
            r3.setReadTimeout(r5)     // Catch:{ Exception -> 0x005a }
            r5 = 1
            r3.setDoInput(r5)     // Catch:{ Exception -> 0x005a }
            r3.setInstanceFollowRedirects(r5)     // Catch:{ Exception -> 0x005a }
            java.lang.String r5 = "GET"
            boolean r4 = r5.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x005a }
            if (r4 == 0) goto L_0x0056
            r4 = 0
            r3.setDoOutput(r4)     // Catch:{ Exception -> 0x005a }
        L_0x0056:
            r3.connect()     // Catch:{ Exception -> 0x005a }
            return r3
        L_0x005a:
            r4 = move-exception
            goto L_0x005f
        L_0x005c:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L_0x005f:
            boolean r5 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 != 0) goto L_0x0069
            r4.printStackTrace()
            r4.getMessage()
        L_0x0069:
            if (r3 == 0) goto L_0x006e
            r3.disconnect()
        L_0x006e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.Util.makeHttpRequest(java.lang.String, java.lang.String, java.util.Map):java.net.HttpURLConnection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.X509Certificate getX509CertFromSslCertHack(android.net.http.SslCertificate r9) {
        /*
            android.os.Bundle r9 = android.net.http.SslCertificate.saveState(r9)
            byte[] r0 = asInterface
            r1 = 15
            byte r1 = r0[r1]
            byte r1 = (byte) r1
            byte r2 = (byte) r1
            byte r3 = (byte) r2
            int r3 = r3 * 3
            int r3 = 4 - r3
            int r1 = r1 * 2
            int r1 = 16 - r1
            int r2 = r2 * 4
            int r2 = 120 - r2
            byte[] r4 = new byte[r1]
            int r1 = r1 + -1
            r5 = 0
            if (r0 != 0) goto L_0x0024
            r6 = r4
            r7 = 0
            r4 = r3
            goto L_0x0052
        L_0x0024:
            r6 = 0
        L_0x0025:
            byte r7 = (byte) r2
            r4[r6] = r7
            if (r6 != r1) goto L_0x0049
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r5)
            byte[] r9 = r9.getByteArray(r0)
            r0 = 0
            if (r9 == 0) goto L_0x0048
            java.lang.String r1 = "X.509"
            java.security.cert.CertificateFactory r1 = java.security.cert.CertificateFactory.getInstance(r1)     // Catch:{ CertificateException -> 0x0048 }
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0048 }
            r2.<init>(r9)     // Catch:{ CertificateException -> 0x0048 }
            java.security.cert.Certificate r9 = r1.generateCertificate(r2)     // Catch:{ CertificateException -> 0x0048 }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ CertificateException -> 0x0048 }
            r0 = r9
        L_0x0048:
            return r0
        L_0x0049:
            int r6 = r6 + 1
            byte r7 = r0[r3]
            r8 = r4
            r4 = r3
            r3 = r7
            r7 = r6
            r6 = r8
        L_0x0052:
            int r2 = r2 + r3
            int r2 = r2 + -6
            int r3 = r4 + 1
            r4 = r6
            r6 = r7
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.Util.getX509CertFromSslCertHack(android.net.http.SslCertificate):java.security.cert.X509Certificate");
    }

    public static String JSONStringify(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString();
        }
        if (obj instanceof List) {
            return new JSONArray((List) obj).toString();
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        return JSONObject.wrap(obj).toString();
    }

    public static boolean objEquals(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static String replaceAll(String str, String str2, String str3) {
        return TextUtils.join(str3, str.split(Pattern.quote(str2)));
    }

    public static float getPixelDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static Size2D getFullscreenSize(Context context) {
        Size2D size2D = new Size2D(-1.0d, -1.0d);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
                int i = insetsIgnoringVisibility.right;
                int i2 = insetsIgnoringVisibility.left;
                int i3 = insetsIgnoringVisibility.top;
                int i4 = insetsIgnoringVisibility.bottom;
                Rect bounds = currentWindowMetrics.getBounds();
                size2D.setWidth((double) (bounds.width() - (i + i2)));
                size2D.setHeight((double) (bounds.height() - (i3 + i4)));
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                size2D.setWidth((double) displayMetrics.widthPixels);
                size2D.setHeight((double) displayMetrics.heightPixels);
            }
        }
        return size2D;
    }

    public static boolean isClass(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean isIPv6(String str) {
        try {
            Inet6Address.getByName(str);
            return true;
        } catch (UnknownHostException unused) {
            return false;
        }
    }

    public static String normalizeIPv6(String str) throws Exception {
        if (isIPv6(str)) {
            return InetAddress.getByName(str).getCanonicalHostName();
        }
        StringBuilder sb = new StringBuilder("Invalid address: ");
        sb.append(str);
        throw new Exception(sb.toString());
    }

    public static <T> T getOrDefault(Map<String, Object> map, String str, T t) {
        return map.containsKey(str) ? map.get(str) : t;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|16|17|18|19) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0028 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] readAllBytes(java.io.InputStream r7) {
        /*
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r1]
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
        L_0x000d:
            r4 = 0
            int r5 = r7.read(r2, r4, r1)     // Catch:{ IOException -> 0x002c, all -> 0x0024 }
            r6 = -1
            if (r5 == r6) goto L_0x0019
            r3.write(r2, r4, r5)     // Catch:{ IOException -> 0x002c, all -> 0x0024 }
            goto L_0x000d
        L_0x0019:
            byte[] r0 = r3.toByteArray()     // Catch:{ IOException -> 0x002c, all -> 0x0024 }
            r7.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            r3.close()     // Catch:{ IOException -> 0x003d }
            goto L_0x003d
        L_0x0024:
            r0 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r3.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r0
        L_0x002c:
            r1 = move-exception
            r7.close()     // Catch:{ IOException -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            r7 = move-exception
            r1.addSuppressed(r7)
        L_0x0035:
            r3.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r7 = move-exception
            r1.addSuppressed(r7)
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.Util.readAllBytes(java.io.InputStream):byte[]");
    }

    public static <O> Object invokeMethodIfExists(O o2, String str, Object... objArr) {
        Method[] methods = o2.getClass().getMethods();
        int length = methods.length;
        int i = 0;
        while (i < length) {
            Method method = methods[i];
            if (method.getName().equals(str)) {
                try {
                    return method.invoke(o2, objArr);
                } catch (IllegalAccessException | InvocationTargetException unused) {
                    return null;
                }
            } else {
                i++;
            }
        }
        return null;
    }

    public static Drawable drawableFromBytes(Context context, byte[] bArr) {
        return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
    }
}
