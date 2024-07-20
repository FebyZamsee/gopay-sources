package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.cancelAuthentication;
import o.removeChildrenForExpandedActionView;
import o.setContentInsetsRelative;
import o.updateNavigationIcon;
import org.json.JSONObject;

public final class AFc1oSDK implements AFc1lSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFLogger$LogLevel = 0;
    private static char[] afRDLog = {40065, 40154, 40148, 40154, 40153};
    private static int afWarnLog = 1;
    private AFc1pSDK AFInAppEventParameterName;
    private final removeChildrenForExpandedActionView AFInAppEventType;
    private final removeChildrenForExpandedActionView AFKeystoreWrapper;
    private final removeChildrenForExpandedActionView AFLogger;
    private final removeChildrenForExpandedActionView afDebugLog;
    private final removeChildrenForExpandedActionView afErrorLog;
    private final String afInfoLog = "6.11.1";
    private final removeChildrenForExpandedActionView valueOf;
    private final removeChildrenForExpandedActionView values;

    public AFc1oSDK(AFc1pSDK aFc1pSDK) {
        Intrinsics.checkNotNullParameter(aFc1pSDK, "");
        this.AFInAppEventParameterName = aFc1pSDK;
        Function0 r5 = new Function0<AFe1oSDK>(this) {
            private /* synthetic */ AFc1oSDK AFInAppEventType;

            {
                this.AFInAppEventType = r1;
            }

            /* renamed from: AFInAppEventType */
            public final AFe1oSDK invoke() {
                AFe1oSDK afInfoLog = AFc1oSDK.AFInAppEventParameterName(this.AFInAppEventType).afInfoLog();
                Intrinsics.checkNotNullExpressionValue(afInfoLog, "");
                return afInfoLog;
            }
        };
        Intrinsics.checkNotNullParameter(r5, "");
        this.valueOf = new setContentInsetsRelative(r5, (Object) null, 2, (DefaultConstructorMarker) null);
        Function0 r52 = new Function0<AFc1vSDK>(this) {
            private /* synthetic */ AFc1oSDK values;

            {
                this.values = r1;
            }

            /* renamed from: AFInAppEventParameterName */
            public final AFc1vSDK invoke() {
                AFc1vSDK AFKeystoreWrapper = AFc1oSDK.AFInAppEventParameterName(this.values).AFKeystoreWrapper();
                Intrinsics.checkNotNullExpressionValue(AFKeystoreWrapper, "");
                return AFKeystoreWrapper;
            }
        };
        Intrinsics.checkNotNullParameter(r52, "");
        this.AFKeystoreWrapper = new setContentInsetsRelative(r52, (Object) null, 2, (DefaultConstructorMarker) null);
        Function0 r53 = new Function0<AFb1aSDK>(this) {
            private /* synthetic */ AFc1oSDK AFInAppEventType;

            {
                this.AFInAppEventType = r1;
            }

            /* renamed from: AFKeystoreWrapper */
            public final AFb1aSDK invoke() {
                AFb1aSDK afErrorLog = AFc1oSDK.AFInAppEventParameterName(this.AFInAppEventType).afErrorLog();
                Intrinsics.checkNotNullExpressionValue(afErrorLog, "");
                return afErrorLog;
            }
        };
        Intrinsics.checkNotNullParameter(r53, "");
        this.values = new setContentInsetsRelative(r53, (Object) null, 2, (DefaultConstructorMarker) null);
        Function0 r54 = new Function0<AFe1hSDK>(this) {
            private /* synthetic */ AFc1oSDK AFKeystoreWrapper;

            {
                this.AFKeystoreWrapper = r1;
            }

            /* renamed from: AFInAppEventParameterName */
            public final AFe1hSDK invoke() {
                AFe1hSDK AppsFlyer2dXConversionCallback = AFc1oSDK.AFInAppEventParameterName(this.AFKeystoreWrapper).AppsFlyer2dXConversionCallback();
                Intrinsics.checkNotNullExpressionValue(AppsFlyer2dXConversionCallback, "");
                return AppsFlyer2dXConversionCallback;
            }
        };
        Intrinsics.checkNotNullParameter(r54, "");
        this.AFInAppEventType = new setContentInsetsRelative(r54, (Object) null, 2, (DefaultConstructorMarker) null);
        Function0 r55 = new Function0<ExecutorService>(this) {
            private /* synthetic */ AFc1oSDK valueOf;

            {
                this.valueOf = r1;
            }

            /* renamed from: valueOf */
            public final ExecutorService invoke() {
                ExecutorService valueOf2 = AFc1oSDK.AFInAppEventParameterName(this.valueOf).valueOf();
                Intrinsics.checkNotNullExpressionValue(valueOf2, "");
                return valueOf2;
            }
        };
        Intrinsics.checkNotNullParameter(r55, "");
        this.afErrorLog = new setContentInsetsRelative(r55, (Object) null, 2, (DefaultConstructorMarker) null);
        Function0 r56 = new Function0<AFc1qSDK>(this) {
            private /* synthetic */ AFc1oSDK AFKeystoreWrapper;

            {
                this.AFKeystoreWrapper = r1;
            }

            /* renamed from: AFInAppEventParameterName */
            public final AFc1qSDK invoke() {
                AFc1tSDK init = AFc1oSDK.AFInAppEventParameterName(this.AFKeystoreWrapper).init();
                Intrinsics.checkNotNullExpressionValue(init, "");
                return new AFc1qSDK(init);
            }
        };
        Intrinsics.checkNotNullParameter(r56, "");
        this.AFLogger = new setContentInsetsRelative(r56, (Object) null, 2, (DefaultConstructorMarker) null);
        Function0 r57 = new Function0<AFc1mSDK>(this) {
            private /* synthetic */ AFc1oSDK values;

            {
                this.values = r1;
            }

            /* renamed from: AFKeystoreWrapper */
            public final AFc1mSDK invoke() {
                return new AFc1mSDK(this.values.AFKeystoreWrapper());
            }
        };
        Intrinsics.checkNotNullParameter(r57, "");
        this.afDebugLog = new setContentInsetsRelative(r57, (Object) null, 2, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ AFc1pSDK AFInAppEventParameterName(AFc1oSDK aFc1oSDK) {
        int i = (AFLogger$LogLevel + 41) % 128;
        afWarnLog = i;
        AFc1pSDK aFc1pSDK = aFc1oSDK.AFInAppEventParameterName;
        int i2 = i + 49;
        AFLogger$LogLevel = i2 % 128;
        if ((i2 % 2 != 0 ? '>' : 16) == 16) {
            return aFc1pSDK;
        }
        throw new ArithmeticException();
    }

    private final AFe1oSDK AFInAppEventType() {
        AFLogger$LogLevel = (afWarnLog + 97) % 128;
        AFe1oSDK aFe1oSDK = (AFe1oSDK) this.valueOf.getValue();
        AFLogger$LogLevel = (afWarnLog + 15) % 128;
        return aFe1oSDK;
    }

    private final AFc1vSDK afRDLog() {
        int i = AFLogger$LogLevel + 91;
        afWarnLog = i % 128;
        if ((i % 2 == 0 ? 17 : 'R') != 17) {
            return (AFc1vSDK) this.AFKeystoreWrapper.getValue();
        }
        AFc1vSDK aFc1vSDK = (AFc1vSDK) this.AFKeystoreWrapper.getValue();
        throw null;
    }

    private final AFb1aSDK AFLogger() {
        int i = AFLogger$LogLevel + 63;
        afWarnLog = i % 128;
        if ((i % 2 == 0 ? '!' : 'H') != '!') {
            AFb1aSDK aFb1aSDK = (AFb1aSDK) this.values.getValue();
            afWarnLog = (AFLogger$LogLevel + 55) % 128;
            return aFb1aSDK;
        }
        AFb1aSDK aFb1aSDK2 = (AFb1aSDK) this.values.getValue();
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private final AFe1hSDK afDebugLog() {
        int i = afWarnLog + 29;
        AFLogger$LogLevel = i % 128;
        if ((i % 2 != 0 ? 13 : '.') == '.') {
            AFe1hSDK aFe1hSDK = (AFe1hSDK) this.AFInAppEventType.getValue();
            afWarnLog = (AFLogger$LogLevel + 59) % 128;
            return aFe1hSDK;
        }
        AFe1hSDK aFe1hSDK2 = (AFe1hSDK) this.AFInAppEventType.getValue();
        throw new ArithmeticException();
    }

    private final ExecutorService afInfoLog() {
        afWarnLog = (AFLogger$LogLevel + 107) % 128;
        ExecutorService executorService = (ExecutorService) this.afErrorLog.getValue();
        AFLogger$LogLevel = (afWarnLog + 79) % 128;
        return executorService;
    }

    private String afErrorLog() {
        int i = afWarnLog + 65;
        int i2 = i % 128;
        AFLogger$LogLevel = i2;
        if (!(i % 2 != 0)) {
            String str = this.afInfoLog;
            afWarnLog = (i2 + 19) % 128;
            return str;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Throwable, java.lang.Object, com.appsflyer.internal.AFf1kSDK] */
    private final AFf1kSDK AFLogger$LogLevel() {
        AFf1gSDK aFf1gSDK = AFInAppEventType().AFInAppEventType.AFInAppEventParameterName;
        if (aFf1gSDK != null) {
            AFLogger$LogLevel = (afWarnLog + 93) % 128;
            AFf1hSDK aFf1hSDK = aFf1gSDK.AFInAppEventParameterName;
            if ((aFf1hSDK != null ? '*' : 30) == '*') {
                int i = afWarnLog + 29;
                AFLogger$LogLevel = i % 128;
                char c = i % 2 != 0 ? 'Q' : 'T';
                AFf1kSDK aFf1kSDK = aFf1hSDK.values;
                if (c == 'T') {
                    return aFf1kSDK;
                }
                throw new ArithmeticException();
            }
        }
        int i2 = AFLogger$LogLevel + 21;
        afWarnLog = i2 % 128;
        ? r1 = 0;
        if (i2 % 2 != 0) {
            return r1;
        }
        r1.hashCode();
        throw r1;
    }

    public final AFc1nSDK AFKeystoreWrapper() {
        afWarnLog = (AFLogger$LogLevel + 69) % 128;
        AFc1nSDK aFc1nSDK = (AFc1nSDK) this.AFLogger.getValue();
        afWarnLog = (AFLogger$LogLevel + 29) % 128;
        return aFc1nSDK;
    }

    private AFc1jSDK afErrorLogForExcManagerOnly() {
        int i = afWarnLog + 95;
        AFLogger$LogLevel = i % 128;
        boolean z = false;
        Throwable th = null;
        if (i % 2 == 0) {
            AFc1jSDK aFc1jSDK = (AFc1jSDK) this.afDebugLog.getValue();
            int i2 = afWarnLog + 15;
            AFLogger$LogLevel = i2 % 128;
            if (i2 % 2 == 0) {
                z = true;
            }
            if (z) {
                return aFc1jSDK;
            }
            th.hashCode();
            throw th;
        }
        AFc1jSDK aFc1jSDK2 = (AFc1jSDK) this.afDebugLog.getValue();
        throw th;
    }

    public final void AFInAppEventType(Throwable th, String str) {
        afWarnLog = (AFLogger$LogLevel + 39) % 128;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        afInfoLog().execute(new AFc1oSDK$$ExternalSyntheticLambda0(this, th, str));
        int i = AFLogger$LogLevel + 1;
        afWarnLog = i % 128;
        if (i % 2 == 0) {
            Throwable th2 = null;
            th2.hashCode();
            throw th2;
        }
    }

    /* access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFc1oSDK aFc1oSDK, Throwable th, String str) {
        AFLogger$LogLevel = (afWarnLog + 3) % 128;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFf1kSDK AFLogger$LogLevel2 = aFc1oSDK.AFLogger$LogLevel();
        boolean z = true;
        if ((AFLogger$LogLevel2 != null ? '6' : 'Q') == '6' && aFc1oSDK.AFInAppEventParameterName(AFLogger$LogLevel2)) {
            int i = (AFLogger$LogLevel + 107) % 128;
            afWarnLog = i;
            AFLogger$LogLevel = (i + 5) % 128;
        } else {
            z = false;
        }
        if ((z ? '7' : 'S') != 'S') {
            aFc1oSDK.AFKeystoreWrapper().values(th, str);
            afWarnLog = (AFLogger$LogLevel + 27) % 128;
        }
    }

    public final void AFInAppEventParameterName() {
        int i = AFLogger$LogLevel + 121;
        afWarnLog = i % 128;
        if ((i % 2 == 0 ? '9' : 'M') == 'M') {
            afInfoLog().execute(new AFc1oSDK$$ExternalSyntheticLambda3(this));
        } else {
            afInfoLog().execute(new AFc1oSDK$$ExternalSyntheticLambda3(this));
            throw new ArithmeticException();
        }
    }

    /* access modifiers changed from: private */
    public static final void valueOf(AFc1oSDK aFc1oSDK) {
        int i = afWarnLog + 121;
        AFLogger$LogLevel = i % 128;
        boolean z = i % 2 == 0;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        aFc1oSDK.AFVersionDeclaration();
        if (!z) {
            throw null;
        }
    }

    public final void values() {
        int i = afWarnLog + 91;
        AFLogger$LogLevel = i % 128;
        if (i % 2 == 0) {
            afInfoLog().execute(new AFc1oSDK$$ExternalSyntheticLambda1(this));
        } else {
            afInfoLog().execute(new AFc1oSDK$$ExternalSyntheticLambda1(this));
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public static final void AFInAppEventType(AFc1oSDK aFc1oSDK) {
        afWarnLog = (AFLogger$LogLevel + 123) % 128;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        aFc1oSDK.getLevel();
        afWarnLog = (AFLogger$LogLevel + 27) % 128;
    }

    public final void valueOf() {
        int i = afWarnLog + 91;
        AFLogger$LogLevel = i % 128;
        char c = 2;
        if (i % 2 == 0) {
            c = 7;
        }
        ExecutorService afInfoLog2 = afInfoLog();
        if (c == 7) {
            afInfoLog2.execute(new AFc1oSDK$$ExternalSyntheticLambda2(this));
            afWarnLog = (AFLogger$LogLevel + 15) % 128;
            return;
        }
        afInfoLog2.execute(new AFc1oSDK$$ExternalSyntheticLambda2(this));
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    /* access modifiers changed from: private */
    public static final void AFKeystoreWrapper(AFc1oSDK aFc1oSDK) {
        AFLogger$LogLevel = (afWarnLog + 69) % 128;
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        aFc1oSDK.afWarnLog();
        int i = afWarnLog + 13;
        AFLogger$LogLevel = i % 128;
        if ((i % 2 != 0 ? '*' : 'N') != 'N') {
            throw null;
        }
    }

    private final void AFVersionDeclaration() {
        long j;
        synchronized (this) {
            AFLogger$LogLevel = (afWarnLog + 123) % 128;
            AFf1kSDK AFLogger$LogLevel2 = AFLogger$LogLevel();
            String str = null;
            if (AFLogger$LogLevel2 != null) {
                int i = AFLogger$LogLevel + 113;
                afWarnLog = i % 128;
                if (i % 2 != 0) {
                    j = AFLogger$LogLevel2.AFInAppEventParameterName;
                } else {
                    long j2 = AFLogger$LogLevel2.AFInAppEventParameterName;
                    throw null;
                }
            } else {
                j = -1;
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            try {
                AFf1kSDK AFLogger$LogLevel3 = AFLogger$LogLevel();
                if ((AFLogger$LogLevel3 != null ? '2' : '!') == '2') {
                    str = AFLogger$LogLevel3.values;
                }
                if (str == null) {
                    AFLogger$LogLevel = (afWarnLog + 65) % 128;
                    str = "";
                }
            } catch (NullPointerException unused) {
                str = "NOT_DETECTED";
            }
            if (j < currentTimeMillis) {
                Intrinsics.checkNotNullParameter("TTL is already passed", "");
                AFLogger.afRDLog("[Exception Manager]: TTL is already passed");
                AFLogger().AFKeystoreWrapper("af_send_exc_to_server_window");
                AFKeystoreWrapper().AFInAppEventParameterName();
                int i2 = afWarnLog + 9;
                AFLogger$LogLevel = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new ArithmeticException();
                }
            } else if (AFc1fSDK.valueOf(str) == -1 || AFc1fSDK.valueOf(str) > AFc1fSDK.valueOf(afErrorLog())) {
                AFLogger().AFKeystoreWrapper("af_send_exc_to_server_window");
                AFKeystoreWrapper().AFInAppEventParameterName();
            } else {
                AFLogger$LogLevel = (afWarnLog + 123) % 128;
                AFKeystoreWrapper().AFInAppEventType(afErrorLog());
            }
        }
    }

    private final void getLevel() {
        AFf1kSDK AFLogger$LogLevel2 = AFLogger$LogLevel();
        if (AFLogger$LogLevel2 != null) {
            int i = AFLogger$LogLevel + 55;
            afWarnLog = i % 128;
            if (i % 2 == 0) {
                AFKeystoreWrapper(AFLogger$LogLevel2);
                throw null;
            } else if (!(!AFKeystoreWrapper(AFLogger$LogLevel2))) {
                AFLogger$LogLevel = (afWarnLog + 101) % 128;
                String str = afDebugLog().valueOf;
                if (str != null) {
                    String jSONObject = new JSONObject(AFInAppEventParameterName(valueOf(AFLogger$LogLevel2), AFKeystoreWrapper().AFInAppEventType())).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject, "");
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFKeystoreWrapper(jSONObject, str);
                    return;
                }
                int i2 = afWarnLog + 77;
                AFLogger$LogLevel = i2 % 128;
                if (i2 % 2 != 0) {
                    throw new ArithmeticException();
                }
            } else {
                Intrinsics.checkNotNullParameter("skipping", "");
                AFLogger.afRDLog("[Exception Manager]: skipping");
            }
        }
    }

    private final void afWarnLog() {
        synchronized (this) {
            int i = afWarnLog + 23;
            AFLogger$LogLevel = i % 128;
            if ((i % 2 != 0 ? 28 : '\'') == '\'') {
                AFf1kSDK AFLogger$LogLevel2 = AFLogger$LogLevel();
                if (AFLogger$LogLevel2 != null) {
                    AFLogger$LogLevel = (afWarnLog + 121) % 128;
                    boolean z = true;
                    if (AFLogger$LogLevel2.AFKeystoreWrapper == -1) {
                        AFLogger$LogLevel = (afWarnLog + 45) % 128;
                        AFLogger().AFKeystoreWrapper("af_send_exc_to_server_window");
                        return;
                    }
                    if (AFLogger().values("af_send_exc_to_server_window", -1) == -1) {
                        z = false;
                    }
                    if (!z) {
                        int i2 = AFLogger$LogLevel2.valueOf;
                        int i3 = AFLogger$LogLevel2.AFKeystoreWrapper;
                        long currentTimeMillis = System.currentTimeMillis();
                        long millis = TimeUnit.DAYS.toMillis((long) i3);
                        AFb1aSDK AFLogger2 = AFLogger();
                        AFLogger2.AFInAppEventType("af_send_exc_to_server_window", currentTimeMillis + millis);
                        AFLogger2.valueOf("af_send_exc_min", i2);
                    }
                    afWarnLog = (AFLogger$LogLevel + 115) % 128;
                    return;
                }
                return;
            }
            AFLogger$LogLevel();
            Throwable th = null;
            th.hashCode();
            throw th;
        }
    }

    private final Map<String, String> valueOf(AFf1kSDK aFf1kSDK) {
        Object[] objArr = new Object[1];
        AFInAppEventType("\u0000\u0000\u0001\u0001\u0000", true, new int[]{0, 5, 0, 0}, objArr);
        Map<String, String> onTransact = updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair(((String) objArr[0]).intern(), Build.BRAND), new Pair("model", Build.MODEL), new Pair("app_id", afRDLog().AFInAppEventParameterName.AFInAppEventType.getPackageName()), new Pair("p_ex", new AFb1vSDK().AFInAppEventParameterName()), new Pair("api", String.valueOf(Build.VERSION.SDK_INT)), new Pair("sdk", afErrorLog()), new Pair("uid", AFb1rSDK.valueOf(new WeakReference(afRDLog().AFInAppEventParameterName.AFInAppEventType))), new Pair("exc_config", aFf1kSDK.values())});
        int i = afWarnLog + 41;
        AFLogger$LogLevel = i % 128;
        if ((i % 2 != 0 ? 'B' : '6') == '6') {
            return onTransact;
        }
        Throwable th = null;
        th.hashCode();
        throw th;
    }

    private static Map<String, Object> AFInAppEventParameterName(Map<String, ? extends Object> map, List<AFc1rSDK> list) {
        Map<String, Object> map2;
        int i = AFLogger$LogLevel + 119;
        afWarnLog = i % 128;
        if ((i % 2 == 0 ? '<' : 17) != 17) {
            Pair[] pairArr = new Pair[4];
            pairArr[1] = new Pair("deviceInfo", map);
            pairArr[0] = new Pair("excs", AFc1kSDK.valueOf(list));
            map2 = updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) pairArr);
        } else {
            map2 = updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("deviceInfo", map), new Pair("excs", AFc1kSDK.valueOf(list))});
        }
        AFLogger$LogLevel = (afWarnLog + 113) % 128;
        return map2;
    }

    private final boolean AFKeystoreWrapper(AFf1kSDK aFf1kSDK) {
        int AFInAppEventType2;
        long currentTimeMillis = System.currentTimeMillis();
        long values2 = AFLogger().values("af_send_exc_to_server_window", -1);
        if (aFf1kSDK.AFInAppEventParameterName >= currentTimeMillis / 1000) {
            if (values2 != -1) {
                int i = AFLogger$LogLevel + 105;
                afWarnLog = i % 128;
                if ((i % 2 == 0 ? ' ' : 'H') == 'H') {
                    if ((values2 < currentTimeMillis ? '$' : 29) == 29 && (AFInAppEventType2 = AFLogger().AFInAppEventType("af_send_exc_min", -1)) != -1) {
                        int i2 = AFLogger$LogLevel + 37;
                        afWarnLog = i2 % 128;
                        if (i2 % 2 == 0) {
                            AFKeystoreWrapper().values();
                            Throwable th = null;
                            th.hashCode();
                            throw th;
                        } else if (AFKeystoreWrapper().values() >= AFInAppEventType2) {
                            String str = aFf1kSDK.values;
                            Intrinsics.checkNotNullExpressionValue(str, "");
                            if (AFc1fSDK.valueOf(str) != AFc1fSDK.valueOf(afErrorLog())) {
                                return false;
                            }
                            AFLogger$LogLevel = (afWarnLog + 23) % 128;
                            return true;
                        }
                    }
                } else {
                    throw new ArithmeticException();
                }
            }
            return false;
        }
        int i3 = afWarnLog + 55;
        AFLogger$LogLevel = i3 % 128;
        return i3 % 2 != 0;
    }

    private final boolean AFInAppEventParameterName(AFf1kSDK aFf1kSDK) {
        afWarnLog = (AFLogger$LogLevel + 69) % 128;
        long currentTimeMillis = System.currentTimeMillis();
        long values2 = AFLogger().values("af_send_exc_to_server_window", -1);
        if (aFf1kSDK.AFInAppEventParameterName >= currentTimeMillis / 1000) {
            AFLogger$LogLevel = (afWarnLog + 59) % 128;
            if ((values2 != -1 ? 4 : ',') == 4) {
                if (!(values2 < currentTimeMillis)) {
                    String str = aFf1kSDK.values;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    if (AFc1fSDK.valueOf(str) == AFc1fSDK.valueOf(afErrorLog())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void AFKeystoreWrapper(String str, String str2) {
        afWarnLog = (AFLogger$LogLevel + 75) % 128;
        byte[] bytes = str.getBytes(cancelAuthentication.onTransact);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        Pair pair = new Pair("Authorization", AFa1aSDK.valueOf(str, str2));
        Intrinsics.checkNotNullParameter(pair, "");
        Map singletonMap = Collections.singletonMap(pair.RemoteActionCompatParcelizer, pair.onTransact);
        Intrinsics.checkNotNullExpressionValue(singletonMap, "");
        afErrorLogForExcManagerOnly().AFInAppEventParameterName(bytes, singletonMap, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE);
        int i = AFLogger$LogLevel + 47;
        afWarnLog = i % 128;
        if ((i % 2 == 0 ? ',' : '-') != '-') {
            throw new ArithmeticException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void AFInAppEventType(java.lang.String r21, boolean r22, int[] r23, java.lang.Object[] r24) {
        /*
            r0 = r21
            r1 = 0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0023
            int r5 = $11
            int r5 = r5 + 55
            int r6 = r5 % 128
            $10 = r6
            int r5 = r5 % r2
            if (r5 == 0) goto L_0x0015
            r5 = 0
            goto L_0x0016
        L_0x0015:
            r5 = 1
        L_0x0016:
            if (r5 == 0) goto L_0x001f
            java.lang.String r5 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r5)
            goto L_0x0023
        L_0x001f:
            r1.hashCode()
            throw r1
        L_0x0023:
            byte[] r0 = (byte[]) r0
            com.appsflyer.internal.AFh1vSDK r5 = new com.appsflyer.internal.AFh1vSDK
            r5.<init>()
            r6 = r23[r4]
            r7 = r23[r3]
            r8 = r23[r2]
            r9 = 3
            r9 = r23[r9]
            char[] r10 = afRDLog
            r11 = 34
            if (r10 == 0) goto L_0x003c
            r12 = 34
            goto L_0x003e
        L_0x003c:
            r12 = 94
        L_0x003e:
            java.lang.String r13 = ""
            if (r12 == r11) goto L_0x0044
            goto L_0x00c2
        L_0x0044:
            int r12 = r10.length
            char[] r14 = new char[r12]
            r15 = 0
        L_0x0048:
            if (r15 >= r12) goto L_0x004f
            r16 = 84
            r2 = 84
            goto L_0x0051
        L_0x004f:
            r2 = 34
        L_0x0051:
            if (r2 == r11) goto L_0x00c1
            char r2 = r10[r15]
            java.lang.Object[] r11 = new java.lang.Object[r3]     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00b8 }
            r11[r4] = r2     // Catch:{ all -> 0x00b8 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00b8 }
            r17 = -1590198020(0xffffffffa13780fc, float:-6.217352E-19)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x00a1
            r1 = 52321(0xcc61, float:7.3317E-41)
            r2 = 0
            float r18 = android.util.TypedValue.complexToFraction(r4, r2, r2)     // Catch:{ all -> 0x00b8 }
            int r2 = (r18 > r2 ? 1 : (r18 == r2 ? 0 : -1))
            int r1 = r1 - r2
            char r1 = (char) r1     // Catch:{ all -> 0x00b8 }
            int r2 = android.text.TextUtils.getCapsMode(r13, r4, r4)     // Catch:{ all -> 0x00b8 }
            int r2 = 196 - r2
            int r18 = android.view.View.MeasureSpec.getSize(r4)     // Catch:{ all -> 0x00b8 }
            int r4 = r18 + 37
            java.lang.Object r1 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r1, r2, r4)     // Catch:{ all -> 0x00b8 }
            java.lang.Class r1 = (java.lang.Class) r1     // Catch:{ all -> 0x00b8 }
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x00b8 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b8 }
            r18 = 0
            r2[r18] = r4     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = "g"
            java.lang.reflect.Method r1 = r1.getMethod(r4, r2)     // Catch:{ all -> 0x00b8 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x00b8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x00b8 }
            r2.put(r4, r1)     // Catch:{ all -> 0x00b8 }
        L_0x00a1:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch:{ all -> 0x00b8 }
            r2 = 0
            java.lang.Object r1 = r1.invoke(r2, r11)     // Catch:{ all -> 0x00b8 }
            java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ all -> 0x00b8 }
            char r1 = r1.charValue()     // Catch:{ all -> 0x00b8 }
            r14[r15] = r1
            int r15 = r15 + 1
            r1 = 0
            r2 = 2
            r4 = 0
            r11 = 34
            goto L_0x0048
        L_0x00b8:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x00c0
            throw r1
        L_0x00c0:
            throw r0
        L_0x00c1:
            r10 = r14
        L_0x00c2:
            char[] r1 = new char[r7]
            r2 = 0
            java.lang.System.arraycopy(r10, r6, r1, r2, r7)
            if (r0 == 0) goto L_0x024a
            char[] r4 = new char[r7]
            r5.valueOf = r2
            r2 = 0
        L_0x00cf:
            int r6 = r5.valueOf
            if (r6 >= r7) goto L_0x0249
            int r6 = $10
            int r6 = r6 + 89
            int r6 = r6 % 128
            $11 = r6
            int r6 = r5.valueOf
            byte r6 = r0[r6]
            r10 = 65
            if (r6 != r3) goto L_0x00e6
            r6 = 33
            goto L_0x00e8
        L_0x00e6:
            r6 = 65
        L_0x00e8:
            if (r6 == r10) goto L_0x016a
            int r6 = $10
            int r6 = r6 + 63
            int r6 = r6 % 128
            $11 = r6
            int r6 = r5.valueOf
            int r10 = r5.valueOf
            char r10 = r1[r10]
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0161 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0161 }
            r12[r3] = r2     // Catch:{ all -> 0x0161 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0161 }
            r10 = 0
            r12[r10] = r2     // Catch:{ all -> 0x0161 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0161 }
            r10 = 1784971396(0x6a648084, float:6.9060496E25)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0161 }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x0161 }
            if (r2 != 0) goto L_0x0151
            int r2 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x0161 }
            int r2 = r2 >> 8
            r11 = 47725(0xba6d, float:6.6877E-41)
            int r2 = r2 + r11
            char r2 = (char) r2     // Catch:{ all -> 0x0161 }
            int r11 = android.os.Process.getGidForName(r13)     // Catch:{ all -> 0x0161 }
            int r11 = 232 - r11
            int r14 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ all -> 0x0161 }
            int r14 = r14 >> 16
            int r14 = 36 - r14
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r2, r11, r14)     // Catch:{ all -> 0x0161 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0161 }
            r11 = 2
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x0161 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0161 }
            r15 = 0
            r14[r15] = r11     // Catch:{ all -> 0x0161 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0161 }
            r14[r3] = r11     // Catch:{ all -> 0x0161 }
            java.lang.String r11 = "f"
            java.lang.reflect.Method r2 = r2.getMethod(r11, r14)     // Catch:{ all -> 0x0161 }
            java.util.Map<java.lang.Integer, java.lang.Object> r11 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0161 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0161 }
            r11.put(r10, r2)     // Catch:{ all -> 0x0161 }
        L_0x0151:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0161 }
            r10 = 0
            java.lang.Object r2 = r2.invoke(r10, r12)     // Catch:{ all -> 0x0161 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x0161 }
            char r2 = r2.charValue()     // Catch:{ all -> 0x0161 }
            r4[r6] = r2
            goto L_0x01db
        L_0x0161:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0169
            throw r1
        L_0x0169:
            throw r0
        L_0x016a:
            int r6 = r5.valueOf
            int r10 = r5.valueOf
            char r10 = r1[r10]
            r11 = 2
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ all -> 0x0240 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0240 }
            r12[r3] = r2     // Catch:{ all -> 0x0240 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0240 }
            r10 = 0
            r12[r10] = r2     // Catch:{ all -> 0x0240 }
            java.util.Map<java.lang.Integer, java.lang.Object> r2 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0240 }
            r10 = -1969424820(0xffffffff8a9cf64c, float:-1.51149E-32)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0240 }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x0240 }
            if (r2 != 0) goto L_0x01cc
            int r2 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()     // Catch:{ all -> 0x0240 }
            int r2 = r2 >> 24
            int r2 = 5147 - r2
            char r2 = (char) r2     // Catch:{ all -> 0x0240 }
            int r11 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x0240 }
            int r11 = r11 >> 8
            int r11 = r11 + 342
            r14 = 0
            long r19 = android.widget.ExpandableListView.getPackedPositionForChild(r14, r14)     // Catch:{ all -> 0x0240 }
            r14 = 0
            int r17 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            int r14 = r17 + 38
            java.lang.Object r2 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r2, r11, r14)     // Catch:{ all -> 0x0240 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ all -> 0x0240 }
            r11 = 2
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ all -> 0x0240 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0240 }
            r15 = 0
            r14[r15] = r11     // Catch:{ all -> 0x0240 }
            java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0240 }
            r14[r3] = r11     // Catch:{ all -> 0x0240 }
            java.lang.String r11 = "k"
            java.lang.reflect.Method r2 = r2.getMethod(r11, r14)     // Catch:{ all -> 0x0240 }
            java.util.Map<java.lang.Integer, java.lang.Object> r11 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0240 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0240 }
            r11.put(r10, r2)     // Catch:{ all -> 0x0240 }
        L_0x01cc:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0240 }
            r10 = 0
            java.lang.Object r2 = r2.invoke(r10, r12)     // Catch:{ all -> 0x0240 }
            java.lang.Character r2 = (java.lang.Character) r2     // Catch:{ all -> 0x0240 }
            char r2 = r2.charValue()     // Catch:{ all -> 0x0240 }
            r4[r6] = r2
        L_0x01db:
            int r2 = r5.valueOf
            char r2 = r4[r2]
            r6 = 2
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ all -> 0x0237 }
            r10[r3] = r5     // Catch:{ all -> 0x0237 }
            r6 = 0
            r10[r6] = r5     // Catch:{ all -> 0x0237 }
            java.util.Map<java.lang.Integer, java.lang.Object> r6 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0237 }
            r11 = -1158403531(0xffffffffbaf42a35, float:-0.0018628301)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0237 }
            java.lang.Object r6 = r6.get(r12)     // Catch:{ all -> 0x0237 }
            if (r6 != 0) goto L_0x022f
            int r6 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x0237 }
            int r6 = r6 >> 16
            int r6 = r6 + 23637
            char r6 = (char) r6     // Catch:{ all -> 0x0237 }
            r12 = 0
            int r14 = android.graphics.Color.blue(r12)     // Catch:{ all -> 0x0237 }
            int r14 = r14 + 160
            int r12 = android.view.ViewConfiguration.getPressedStateDuration()     // Catch:{ all -> 0x0237 }
            int r12 = r12 >> 16
            int r12 = r12 + 36
            java.lang.Object r6 = com.appsflyer.internal.AFa1wSDK.AFKeystoreWrapper(r6, r14, r12)     // Catch:{ all -> 0x0237 }
            java.lang.Class r6 = (java.lang.Class) r6     // Catch:{ all -> 0x0237 }
            r12 = 2
            java.lang.Class[] r14 = new java.lang.Class[r12]     // Catch:{ all -> 0x0237 }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r15 = 0
            r14[r15] = r12     // Catch:{ all -> 0x0237 }
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r14[r3] = r12     // Catch:{ all -> 0x0237 }
            java.lang.String r12 = "m"
            java.lang.reflect.Method r6 = r6.getMethod(r12, r14)     // Catch:{ all -> 0x0237 }
            java.util.Map<java.lang.Integer, java.lang.Object> r12 = com.appsflyer.internal.AFa1wSDK.onInstallConversionFailureNative     // Catch:{ all -> 0x0237 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0237 }
            r12.put(r11, r6)     // Catch:{ all -> 0x0237 }
        L_0x022f:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch:{ all -> 0x0237 }
            r11 = 0
            r6.invoke(r11, r10)     // Catch:{ all -> 0x0237 }
            goto L_0x00cf
        L_0x0237:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x023f
            throw r1
        L_0x023f:
            throw r0
        L_0x0240:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            if (r1 == 0) goto L_0x0248
            throw r1
        L_0x0248:
            throw r0
        L_0x0249:
            r1 = r4
        L_0x024a:
            if (r9 <= 0) goto L_0x027d
            int r0 = $10
            int r0 = r0 + 13
            int r2 = r0 % 128
            $11 = r2
            r2 = 2
            int r0 = r0 % r2
            if (r0 != 0) goto L_0x025a
            r0 = 0
            goto L_0x025b
        L_0x025a:
            r0 = 1
        L_0x025b:
            if (r0 == r3) goto L_0x026e
            char[] r0 = new char[r7]
            java.lang.System.arraycopy(r1, r3, r0, r3, r7)
            int r2 = r7 + r9
            java.lang.System.arraycopy(r0, r3, r1, r2, r9)
            int r2 = r7 >>> r9
            r4 = 0
            java.lang.System.arraycopy(r0, r9, r1, r4, r2)
            goto L_0x027e
        L_0x026e:
            r4 = 0
            char[] r0 = new char[r7]
            java.lang.System.arraycopy(r1, r4, r0, r4, r7)
            int r2 = r7 - r9
            java.lang.System.arraycopy(r0, r4, r1, r2, r9)
            java.lang.System.arraycopy(r0, r9, r1, r4, r2)
            goto L_0x027e
        L_0x027d:
            r4 = 0
        L_0x027e:
            if (r22 == 0) goto L_0x02a2
            char[] r0 = new char[r7]
            r5.valueOf = r4
        L_0x0284:
            int r2 = r5.valueOf
            if (r2 >= r7) goto L_0x02a1
            int r2 = $10
            int r2 = r2 + 105
            int r2 = r2 % 128
            $11 = r2
            int r2 = r5.valueOf
            int r4 = r5.valueOf
            int r4 = r7 - r4
            int r4 = r4 - r3
            char r4 = r1[r4]
            r0[r2] = r4
            int r2 = r5.valueOf
            int r2 = r2 + r3
            r5.valueOf = r2
            goto L_0x0284
        L_0x02a1:
            r1 = r0
        L_0x02a2:
            r0 = 91
            if (r8 <= 0) goto L_0x02a9
            r2 = 91
            goto L_0x02ab
        L_0x02a9:
            r2 = 54
        L_0x02ab:
            if (r2 != r0) goto L_0x02d7
            int r0 = $10
            int r0 = r0 + 41
            int r0 = r0 % 128
            $11 = r0
            r0 = 0
            r5.valueOf = r0
        L_0x02b8:
            int r0 = r5.valueOf
            if (r0 >= r7) goto L_0x02d7
            int r0 = r5.valueOf
            int r2 = r5.valueOf
            char r2 = r1[r2]
            r4 = 2
            r6 = r23[r4]
            int r2 = r2 - r6
            char r2 = (char) r2
            r1[r0] = r2
            int r0 = r5.valueOf
            int r0 = r0 + r3
            r5.valueOf = r0
            int r0 = $11
            int r0 = r0 + 67
            int r0 = r0 % 128
            $10 = r0
            goto L_0x02b8
        L_0x02d7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            r1 = 0
            r24[r1] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1oSDK.AFInAppEventType(java.lang.String, boolean, int[], java.lang.Object[]):void");
    }
}
