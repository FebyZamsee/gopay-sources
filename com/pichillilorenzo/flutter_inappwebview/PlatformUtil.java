package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class PlatformUtil extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "PlatformUtil";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_platformutil";
    public InAppWebViewFlutterPlugin plugin;

    public PlatformUtil(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.hashCode();
        if (str.equals("formatDate")) {
            long longValue = ((Long) methodCall.argument("date")).longValue();
            String str2 = (String) methodCall.argument("format");
            Locale localeFromString = getLocaleFromString((String) methodCall.argument("locale"));
            String str3 = (String) methodCall.argument("timezone");
            if (str3 == null) {
                str3 = "UTC";
            }
            result.success(formatDate(longValue, str2, localeFromString, TimeZone.getTimeZone(str3)));
        } else if (!str.equals("getSystemVersion")) {
            result.notImplemented();
        } else {
            result.success(String.valueOf(Build.VERSION.SDK_INT));
        }
    }

    public static Locale getLocaleFromString(String str) {
        if (str == null) {
            return Locale.US;
        }
        String[] split = str.split("_");
        String str2 = split[0];
        String str3 = "";
        String str4 = split.length > 1 ? split[1] : str3;
        if (split.length > 2) {
            str3 = split[2];
        }
        return new Locale(str2, str4, str3);
    }

    public static String formatDate(long j, String str, Locale locale, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        return simpleDateFormat.format(new Date(j));
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }
}
