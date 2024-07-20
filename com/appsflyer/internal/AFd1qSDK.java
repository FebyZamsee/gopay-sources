package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.BiometricFragment;
import o.Function;
import o.cancelAuthentication;
import o.removeChildrenForExpandedActionView;
import o.setContentInsetsRelative;

public class AFd1qSDK {
    public static String AFInAppEventType = "https://%scdn-%ssettings.%s/android/v1/%s/settings";
    public static String AFKeystoreWrapper = "https://%scdn-%stestsettings.%s/android/v1/%s/settings";
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static AFd1pSDK afDebugLog;
    /* access modifiers changed from: private */
    public static final List<String> afRDLog;
    /* access modifiers changed from: private */
    public final AFb1aSDK AFInAppEventParameterName;
    private final removeChildrenForExpandedActionView afInfoLog;
    public final removeChildrenForExpandedActionView valueOf;
    /* access modifiers changed from: private */
    public final AFc1vSDK values;

    public final /* synthetic */ class AFa1xSDK {
        public static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[AFd1oSDK.values().length];
            iArr[AFd1oSDK.DEFAULT.ordinal()] = 1;
            iArr[AFd1oSDK.API.ordinal()] = 2;
            iArr[AFd1oSDK.RC.ordinal()] = 3;
            values = iArr;
        }
    }

    public static final void valueOf(AFd1pSDK aFd1pSDK) {
        AFa1ySDK.values(aFd1pSDK);
    }

    public AFd1qSDK(AFc1vSDK aFc1vSDK, AFb1aSDK aFb1aSDK) {
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        Intrinsics.checkNotNullParameter(aFb1aSDK, "");
        this.values = aFc1vSDK;
        this.AFInAppEventParameterName = aFb1aSDK;
        Function0 r4 = new Function0<String>(this) {
            private /* synthetic */ AFd1qSDK AFInAppEventType;

            {
                this.AFInAppEventType = r1;
            }

            /* renamed from: AFKeystoreWrapper */
            public final String invoke() {
                String values = AFa1dSDK.values(this.AFInAppEventType.AFInAppEventParameterName, this.AFInAppEventType.values.AFInAppEventType());
                CharSequence charSequence = values;
                String str = "";
                if (!(charSequence == null || BiometricFragment.AnonymousClass5.asBinder(charSequence))) {
                    String obj = BiometricFragment.AnonymousClass5.onTransact(charSequence).toString();
                    AFa1ySDK aFa1ySDK = AFd1qSDK.AFa1ySDK;
                    List<String> AFKeystoreWrapper = AFa1ySDK.AFKeystoreWrapper();
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, str);
                    String lowerCase = obj.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, str);
                    if (!AFKeystoreWrapper.contains(lowerCase)) {
                        values = "-".concat(String.valueOf(obj));
                    } else {
                        Function function = Function.asBinder;
                        String format = String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", Arrays.copyOf(new Object[]{obj}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, str);
                        AFLogger.afWarnLog(format);
                        values = str;
                    }
                }
                if (values != null) {
                    str = values;
                }
                return BiometricFragment.AnonymousClass5.onTransact(str).toString();
            }
        };
        Intrinsics.checkNotNullParameter(r4, "");
        this.afInfoLog = new setContentInsetsRelative(r4, (Object) null, 2, (DefaultConstructorMarker) null);
        Function0 r42 = new Function0<String>(this) {
            private /* synthetic */ AFd1qSDK AFKeystoreWrapper;

            {
                this.AFKeystoreWrapper = r1;
            }

            /* renamed from: AFInAppEventType */
            public final String invoke() {
                String packageName = this.AFKeystoreWrapper.values.AFInAppEventParameterName.AFInAppEventType.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "");
                return AFd1qSDK.values(packageName, AFd1qSDK.AFInAppEventType(this.AFKeystoreWrapper));
            }
        };
        Intrinsics.checkNotNullParameter(r42, "");
        this.valueOf = new setContentInsetsRelative(r42, (Object) null, 2, (DefaultConstructorMarker) null);
    }

    public static final class AFa1ySDK {
        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AFa1ySDK() {
        }

        public static List<String> AFKeystoreWrapper() {
            return AFd1qSDK.afRDLog;
        }

        public static void values(AFd1pSDK aFd1pSDK) {
            AFd1qSDK.afDebugLog = aFd1pSDK;
        }
    }

    static {
        String[] strArr = {"googleplay", "playstore", "googleplaystore"};
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        List<String> asList = Arrays.asList(strArr);
        Intrinsics.checkNotNullExpressionValue(asList, "");
        afRDLog = asList;
    }

    public static boolean AFInAppEventType() {
        return afDebugLog == null;
    }

    public final String values() {
        AFd1oSDK aFd1oSDK;
        String str;
        if (AFInAppEventType()) {
            aFd1oSDK = AFd1oSDK.DEFAULT;
        } else {
            aFd1oSDK = AFd1oSDK.API;
        }
        int i = AFa1xSDK.values[aFd1oSDK.ordinal()];
        if (i == 1) {
            return (String) this.valueOf.getValue();
        }
        if (i == 2) {
            AFd1pSDK aFd1pSDK = afDebugLog;
            if (aFd1pSDK != null) {
                str = aFd1pSDK.values;
            } else {
                str = null;
            }
            if (str == null) {
                return "";
            }
            return str;
        } else if (i == 3) {
            return "";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final String valueOf() {
        AFd1oSDK aFd1oSDK;
        if (AFInAppEventType()) {
            aFd1oSDK = AFd1oSDK.DEFAULT;
        } else {
            aFd1oSDK = AFd1oSDK.API;
        }
        int i = AFa1xSDK.values[aFd1oSDK.ordinal()];
        if (i == 1) {
            return "appsflyersdk.com";
        }
        if (i == 2) {
            AFd1pSDK aFd1pSDK = afDebugLog;
            String str = aFd1pSDK != null ? aFd1pSDK.valueOf : null;
            if (str == null) {
                return "";
            }
            return str;
        } else if (i == 3) {
            return "";
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final /* synthetic */ String values(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        String obj = sb2.toString();
        Intrinsics.checkNotNullParameter(obj, "");
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        byte[] bytes = obj.getBytes(cancelAuthentication.onTransact);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] digest = instance.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "");
        String encodeToString = Base64.encodeToString(digest, 2);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "");
        String lowerCase = encodeToString.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String substring = new Regex("[^\\w]+").replace(lowerCase, "").substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(substring, "");
        sb.append(substring);
        sb.append('-');
        return sb.toString();
    }

    public static final /* synthetic */ String AFInAppEventType(AFd1qSDK aFd1qSDK) {
        return (String) aFd1qSDK.afInfoLog.getValue();
    }
}
