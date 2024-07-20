package com.pichillilorenzo.flutter_inappwebview;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.webkit.CookieManagerCompat;
import androidx.webkit.WebViewFeature;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public class MyCookieManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r13, io.flutter.plugin.common.MethodChannel.Result r14) {
        /*
            r12 = this;
            init()
            java.lang.String r1 = r13.method
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1222815761: goto L_0x003c;
                case 126640486: goto L_0x0032;
                case 747417188: goto L_0x0028;
                case 822411705: goto L_0x001e;
                case 1989049945: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0046
        L_0x0014:
            java.lang.String r2 = "getCookies"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
            r1 = 4
            goto L_0x0047
        L_0x001e:
            java.lang.String r2 = "deleteAllCookies"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
            r1 = 3
            goto L_0x0047
        L_0x0028:
            java.lang.String r2 = "deleteCookies"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
            r1 = 2
            goto L_0x0047
        L_0x0032:
            java.lang.String r2 = "setCookie"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
            r1 = 1
            goto L_0x0047
        L_0x003c:
            java.lang.String r2 = "deleteCookie"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0046
            r1 = 0
            goto L_0x0047
        L_0x0046:
            r1 = -1
        L_0x0047:
            java.lang.String r2 = "name"
            java.lang.String r7 = "path"
            java.lang.String r8 = "domain"
            java.lang.String r9 = "url"
            if (r1 == 0) goto L_0x00de
            if (r1 == r6) goto L_0x0085
            if (r1 == r5) goto L_0x006f
            if (r1 == r4) goto L_0x006b
            if (r1 == r3) goto L_0x005d
            r14.notImplemented()
            return
        L_0x005d:
            java.lang.Object r0 = r13.argument(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = r12.getCookies(r0)
            r14.success(r0)
            return
        L_0x006b:
            r12.deleteAllCookies(r14)
            return
        L_0x006f:
            java.lang.Object r1 = r13.argument(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r13.argument(r8)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r13.argument(r7)
            java.lang.String r0 = (java.lang.String) r0
            r12.deleteCookies(r1, r2, r0, r14)
            return
        L_0x0085:
            java.lang.Object r1 = r13.argument(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r13.argument(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "value"
            java.lang.Object r3 = r13.argument(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r13.argument(r8)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r13.argument(r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = "expiresDate"
            java.lang.Object r6 = r13.argument(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00b6
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r6)
            r6 = r7
            goto L_0x00b7
        L_0x00b6:
            r6 = 0
        L_0x00b7:
            java.lang.String r7 = "maxAge"
            java.lang.Object r7 = r13.argument(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.lang.String r8 = "isSecure"
            java.lang.Object r8 = r13.argument(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            java.lang.String r9 = "isHttpOnly"
            java.lang.Object r9 = r13.argument(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.String r10 = "sameSite"
            java.lang.Object r0 = r13.argument(r10)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            r0 = r12
            r11 = r14
            r0.setCookie(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x00de:
            java.lang.Object r1 = r13.argument(r9)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r13.argument(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r13.argument(r8)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r13.argument(r7)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            r0 = r12
            r5 = r14
            r0.deleteCookie(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.MyCookieManager.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                if (e.getMessage() != null && e.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    return null;
                }
                throw e;
            }
        }
        return cookieManager;
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Boolean bool, Boolean bool2, String str6, final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("=");
            sb.append(str3);
            sb.append("; Path=");
            sb.append(str5);
            String obj = sb.toString();
            if (str4 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("; Domain=");
                sb2.append(str4);
                obj = sb2.toString();
            }
            if (l != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj);
                sb3.append("; Expires=");
                sb3.append(getCookieExpirationDate(l));
                obj = sb3.toString();
            }
            if (num != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(obj);
                sb4.append("; Max-Age=");
                sb4.append(num.toString());
                obj = sb4.toString();
            }
            if (bool != null && bool.booleanValue()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(obj);
                sb5.append("; Secure");
                obj = sb5.toString();
            }
            if (bool2 != null && bool2.booleanValue()) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(obj);
                sb6.append("; HttpOnly");
                obj = sb6.toString();
            }
            if (str6 != null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj);
                sb7.append("; SameSite=");
                sb7.append(str6);
                obj = sb7.toString();
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append(obj);
            sb8.append(";");
            cookieManager.setCookie(str, sb8.toString(), new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                    result.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
        }
    }

    public List<Map<String, Object>> getCookies(String str) {
        String str2;
        String str3 = str;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return arrayList;
        }
        List arrayList2 = new ArrayList();
        String str4 = WebViewFeature.GET_COOKIE_INFO;
        if (WebViewFeature.isFeatureSupported(str4)) {
            arrayList2 = CookieManagerCompat.getCookieInfo(cookieManager, str3);
        } else {
            String cookie = cookieManager.getCookie(str3);
            if (cookie != null) {
                arrayList2 = Arrays.asList(cookie.split(";"));
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split(";");
            if (split.length != 0) {
                String[] split2 = split[0].split("=", 2);
                String trim = split2[0].trim();
                String trim2 = split2.length > 1 ? split2[1].trim() : "";
                HashMap hashMap = new HashMap();
                hashMap.put("name", trim);
                hashMap.put("value", trim2);
                hashMap.put("expiresDate", (Object) null);
                hashMap.put("isSessionOnly", (Object) null);
                hashMap.put("domain", (Object) null);
                hashMap.put("sameSite", (Object) null);
                hashMap.put("isSecure", (Object) null);
                hashMap.put("isHttpOnly", (Object) null);
                hashMap.put("path", (Object) null);
                if (WebViewFeature.isFeatureSupported(str4)) {
                    hashMap.put("isSecure", Boolean.FALSE);
                    hashMap.put("isHttpOnly", Boolean.FALSE);
                    int i = 1;
                    while (i < split.length) {
                        Iterator it2 = it;
                        String[] split3 = split[i].split("=", 2);
                        String trim3 = split3[0].trim();
                        String str5 = str4;
                        String[] strArr = split;
                        if (split3.length > 1) {
                            str2 = split3[1].trim();
                        } else {
                            str2 = "";
                        }
                        if (trim3.equalsIgnoreCase("Expires")) {
                            try {
                                Date parse = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(str2);
                                if (parse != null) {
                                    hashMap.put("expiresDate", Long.valueOf(parse.getTime()));
                                }
                            } catch (ParseException e) {
                                e.printStackTrace();
                                e.getMessage();
                            }
                        } else if (trim3.equalsIgnoreCase("Max-Age")) {
                            try {
                                hashMap.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(str2)));
                            } catch (NumberFormatException e2) {
                                e2.printStackTrace();
                                e2.getMessage();
                            }
                        } else if (trim3.equalsIgnoreCase("Domain")) {
                            hashMap.put("domain", str2);
                        } else if (trim3.equalsIgnoreCase("SameSite")) {
                            hashMap.put("sameSite", str2);
                        } else if (trim3.equalsIgnoreCase("Secure")) {
                            hashMap.put("isSecure", Boolean.TRUE);
                        } else if (trim3.equalsIgnoreCase("HttpOnly")) {
                            hashMap.put("isHttpOnly", Boolean.TRUE);
                        } else if (trim3.equalsIgnoreCase("Path")) {
                            hashMap.put("path", str2);
                        }
                        i++;
                        str4 = str5;
                        it = it2;
                        split = strArr;
                    }
                }
                arrayList.add(hashMap);
                str4 = str4;
                it = it;
            }
        }
        return arrayList;
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("=; Path=");
            sb.append(str4);
            sb.append("; Max-Age=-1");
            String obj = sb.toString();
            if (str3 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("; Domain=");
                sb2.append(str3);
                obj = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(";");
            cookieManager.setCookie(str, sb3.toString(), new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                    result.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
        }
    }

    public void deleteCookies(String str, String str2, String str3, MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            String cookie = cookieManager2.getCookie(str);
            if (cookie != null) {
                for (String split : cookie.split(";")) {
                    String trim = split.split("=", 2)[0].trim();
                    StringBuilder sb = new StringBuilder();
                    sb.append(trim);
                    sb.append("=; Path=");
                    sb.append(str3);
                    sb.append("; Max-Age=-1");
                    String obj = sb.toString();
                    if (str2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(obj);
                        sb2.append("; Domain=");
                        sb2.append(str2);
                        obj = sb2.toString();
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append(";");
                    cookieManager.setCookie(str, sb3.toString(), (ValueCallback) null);
                }
                cookieManager.flush();
            }
            result.success(Boolean.TRUE);
        }
    }

    public void deleteAllCookies(final MethodChannel.Result result) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            cookieManager2.removeAllCookies(new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                    result.success(Boolean.TRUE);
                }
            });
            cookieManager.flush();
        }
    }

    public static String getCookieExpirationDate(Long l) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l.longValue()));
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
}
