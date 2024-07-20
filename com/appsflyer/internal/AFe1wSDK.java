package com.appsflyer.internal;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;

public final class AFe1wSDK extends AFd1bSDK<Map<String, String>> {
    public AFa1wSDK AFLogger;
    private final boolean AFLogger$LogLevel;
    private String AFVersionDeclaration;
    private final AFc1hSDK afErrorLogForExcManagerOnly;
    private String afWarnLog;
    private String getLevel;
    private final UUID init;

    public interface AFa1wSDK {
        void AFInAppEventType(String str);

        void valueOf(Map<String, String> map);
    }

    public final long AFInAppEventType() {
        return 3000;
    }

    /* access modifiers changed from: protected */
    public final AppsFlyerRequestListener afDebugLog() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final boolean afErrorLog() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean getLevel() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AFe1wSDK(AFc1pSDK aFc1pSDK, UUID uuid, Uri uri) {
        super(AFd1kSDK.ONELINK, new AFd1kSDK[]{AFd1kSDK.RC_CDN}, aFc1pSDK, uuid.toString());
        Throwable cause;
        boolean z = false;
        this.afErrorLogForExcManagerOnly = aFc1pSDK.AFInAppEventType();
        this.init = uuid;
        if (!AFb1qSDK.valueOf(uri.getHost()) && !AFb1qSDK.valueOf(uri.getPath())) {
            try {
                Object[] objArr = new Object[2];
                objArr[1] = aFc1pSDK.onResponseErrorNative();
                objArr[0] = uri;
                Object obj = AFb1lSDK.AppsFlyer2dXConversionCallback.get(-1304269282);
                if (obj == null) {
                    obj = ((Class) AFb1lSDK.AFKeystoreWrapper((char) (KeyEvent.getMaxKeyCode() >> 16), Color.red(0) + 37, (SystemClock.currentThreadTimeMillis() > -1 ? 1 : (SystemClock.currentThreadTimeMillis() == -1 ? 0 : -1)) - 1)).getDeclaredConstructor(new Class[]{Uri.class, AFb1nSDK.class});
                    AFb1lSDK.AppsFlyer2dXConversionCallback.put(-1304269282, obj);
                }
                Object newInstance = ((Constructor) obj).newInstance(objArr);
                try {
                    Object obj2 = AFb1lSDK.AppsFlyer2dXConversionCallback.get(-1059841556);
                    if (obj2 == null) {
                        obj2 = ((Class) AFb1lSDK.AFKeystoreWrapper((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 38, (Process.getElapsedCpuTime() > 0 ? 1 : (Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1)).getMethod("AFInAppEventType", (Class[]) null);
                        AFb1lSDK.AppsFlyer2dXConversionCallback.put(-1059841556, obj2);
                    }
                    Object invoke = ((Method) obj2).invoke(newInstance, (Object[]) null);
                    try {
                        Object obj3 = AFb1lSDK.AppsFlyer2dXConversionCallback.get(1077606595);
                        if (obj3 == null) {
                            obj3 = ((Class) AFb1lSDK.AFKeystoreWrapper((char) (KeyEvent.getDeadChar(0, 0) + 56036), (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)) + 50, (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 38)).getMethod("AFKeystoreWrapper", (Class[]) null);
                            AFb1lSDK.AppsFlyer2dXConversionCallback.put(1077606595, obj3);
                        }
                        boolean booleanValue = ((Boolean) ((Method) obj3).invoke(invoke, (Object[]) null)).booleanValue();
                        try {
                            Object obj4 = AFb1lSDK.AppsFlyer2dXConversionCallback.get(-801284673);
                            if (obj4 == null) {
                                obj4 = ((Class) AFb1lSDK.AFKeystoreWrapper((char) (56036 - TextUtils.indexOf("", "")), 51 - Color.red(0), 37 - (ViewConfiguration.getJumpTapTimeout() >> 16))).getMethod("valueOf", (Class[]) null);
                                AFb1lSDK.AppsFlyer2dXConversionCallback.put(-801284673, obj4);
                            }
                            z = ((Boolean) ((Method) obj4).invoke(invoke, (Object[]) null)).booleanValue();
                            String[] split = uri.getPath().split("/");
                            if (booleanValue && split.length == 3) {
                                this.afWarnLog = split[1];
                                this.AFVersionDeclaration = split[2];
                                this.getLevel = uri.toString();
                            }
                        } catch (Throwable th) {
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } finally {
                        cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                    }
                } finally {
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                }
            } finally {
                Throwable cause3 = th.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
            }
        }
        this.AFLogger$LogLevel = z;
    }

    public final boolean AFVersionDeclaration() {
        return !TextUtils.isEmpty(this.afWarnLog) && !TextUtils.isEmpty(this.AFVersionDeclaration) && !this.afWarnLog.equals("app");
    }

    public final boolean AFLogger$LogLevel() {
        return this.AFLogger$LogLevel;
    }

    public final void values() {
        super.values();
        AFa1wSDK aFa1wSDK = this.AFLogger;
        if (aFa1wSDK == null) {
            return;
        }
        if (this.values != AFd1sSDK.SUCCESS || this.afInfoLog == null) {
            Throwable afInfoLog = afInfoLog();
            String str = "Can't get OneLink data";
            if (!(afInfoLog instanceof ParsingException)) {
                String str2 = this.getLevel;
                if (str2 != null) {
                    str = str2;
                }
                aFa1wSDK.AFInAppEventType(str);
            } else if (((ParsingException) afInfoLog).getRawResponse().isSuccessful()) {
                aFa1wSDK.AFInAppEventType("Can't parse one link data");
            } else {
                String str3 = this.getLevel;
                if (str3 != null) {
                    str = str3;
                }
                aFa1wSDK.AFInAppEventType(str);
            }
        } else {
            aFa1wSDK.valueOf((Map) this.afInfoLog.getBody());
        }
    }

    /* access modifiers changed from: protected */
    public final AFc1eSDK<Map<String, String>> values(String str) {
        return this.afErrorLogForExcManagerOnly.AFInAppEventType(this.afWarnLog, this.AFVersionDeclaration, this.init, str);
    }
}
