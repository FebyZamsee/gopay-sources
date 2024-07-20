package com.appsflyer.appsflyersdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.CreateOneLinkHttpTask;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.appsflyer.share.CrossPromotionHelper;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.ShareInviteHelper;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.analytics.Constants;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsflyerSdkPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {
    /* access modifiers changed from: private */
    public static DeepLinkResult cachedDeepLinkResult;
    /* access modifiers changed from: private */
    public static Map<String, String> cachedOnAppOpenAttribution;
    /* access modifiers changed from: private */
    public static String cachedOnAttributionFailure;
    /* access modifiers changed from: private */
    public static String cachedOnConversionDataFail;
    /* access modifiers changed from: private */
    public static Map<String, Object> cachedOnConversionDataSuccess;
    /* access modifiers changed from: private */
    public static boolean saveCallbacks;
    /* access modifiers changed from: private */
    public Activity activity;
    private final AppsFlyerConversionListener afConversionListener;
    private final DeepLinkListener afDeepLinkListener;
    private final MethodChannel.MethodCallHandler callbacksHandler;
    /* access modifiers changed from: private */
    public Boolean gcdCallback;
    private Boolean isFacebookDeferredApplinksEnabled;
    private Boolean isSetDisableAdvertisingIdentifiersEnable;
    private Application mApplication;
    /* access modifiers changed from: private */
    public MethodChannel mCallbackChannel;
    /* access modifiers changed from: private */
    public Map<String, Map<String, Object>> mCallbacks;
    private Context mContext;
    private EventChannel mEventChannel;
    private Intent mIntent;
    private MethodChannel mMethodChannel;
    /* access modifiers changed from: private */
    public Boolean oaoaCallback;
    PluginRegistry.NewIntentListener onNewIntentListener;
    /* access modifiers changed from: private */
    public Boolean udlCallback;
    final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public Boolean validatePurchaseCallback;

    public void onDetachedFromActivityForConfigChanges() {
    }

    public AppsflyerSdkPlugin() {
        Boolean bool = Boolean.FALSE;
        this.gcdCallback = bool;
        this.oaoaCallback = bool;
        this.udlCallback = bool;
        this.validatePurchaseCallback = bool;
        this.isFacebookDeferredApplinksEnabled = bool;
        this.isSetDisableAdvertisingIdentifiersEnable = bool;
        this.mCallbacks = new HashMap();
        this.onNewIntentListener = new PluginRegistry.NewIntentListener() {
            public boolean onNewIntent(Intent intent) {
                AppsflyerSdkPlugin.this.activity.setIntent(intent);
                return false;
            }
        };
        this.afConversionListener = new AppsFlyerConversionListener() {
            public void onConversionDataSuccess(Map<String, Object> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    Map unused = AppsflyerSdkPlugin.cachedOnConversionDataSuccess = map;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onInstallConversionData", "success");
                }
            }

            public void onConversionDataFail(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    String unused = AppsflyerSdkPlugin.cachedOnConversionDataFail = str;
                } else if (AppsflyerSdkPlugin.this.gcdCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(str, "failure"), "onInstallConversionData", "failure");
                }
            }

            public void onAppOpenAttribution(Map<String, String> map) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    Map unused = AppsflyerSdkPlugin.cachedOnAppOpenAttribution = map;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(AppsflyerSdkPlugin.this.replaceNullValues(map)), "onAppOpenAttribution", "success");
                }
            }

            public void onAttributionFailure(String str) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    String unused = AppsflyerSdkPlugin.cachedOnAttributionFailure = str;
                } else if (AppsflyerSdkPlugin.this.oaoaCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(AppsflyerSdkPlugin.this.buildJsonResponse(str, "failure"), "onAppOpenAttribution", "failure");
                }
            }
        };
        this.afDeepLinkListener = new DeepLinkListener() {
            public void onDeepLinking(DeepLinkResult deepLinkResult) {
                if (AppsflyerSdkPlugin.saveCallbacks) {
                    DeepLinkResult unused = AppsflyerSdkPlugin.cachedDeepLinkResult = deepLinkResult;
                } else if (AppsflyerSdkPlugin.this.udlCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(deepLinkResult, "onDeepLinking", "success");
                }
            }
        };
        this.callbacksHandler = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if ("startListening".equals(methodCall.method)) {
                    AppsflyerSdkPlugin.this.startListening(methodCall.arguments, result);
                } else {
                    result.notImplemented();
                }
            }
        };
    }

    private void onAttachedToEngine(Context context, BinaryMessenger binaryMessenger) {
        this.mContext = context;
        this.mEventChannel = new EventChannel(binaryMessenger, "af-events");
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "af-api");
        this.mMethodChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        MethodChannel methodChannel2 = new MethodChannel(binaryMessenger, "callbacks");
        this.mCallbackChannel = methodChannel2;
        methodChannel2.setMethodCallHandler(this.callbacksHandler);
    }

    /* access modifiers changed from: private */
    public void startListening(Object obj, MethodChannel.Result result) {
        String str = (String) obj;
        boolean equals = str.equals("onInstallConversionData");
        Boolean bool = Boolean.TRUE;
        if (equals) {
            this.gcdCallback = bool;
        }
        if (str.equals("onAppOpenAttribution")) {
            this.oaoaCallback = bool;
        }
        if (str.equals("onDeepLinking")) {
            this.udlCallback = bool;
        }
        if (str.equals("validatePurchase")) {
            this.validatePurchaseCallback = bool;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", str);
        this.mCallbacks.put(str, hashMap);
        result.success((Object) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r3, io.flutter.plugin.common.MethodChannel.Result r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.method
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -2012504269: goto L_0x01c6;
                case -1995722377: goto L_0x01bc;
                case -1820568830: goto L_0x01b2;
                case -1777356377: goto L_0x01a8;
                case -1489605040: goto L_0x019e;
                case -1437772080: goto L_0x0194;
                case -1267985549: goto L_0x018a;
                case -1253411310: goto L_0x0180;
                case -1191484736: goto L_0x0175;
                case -752931040: goto L_0x016a;
                case -559100112: goto L_0x015e;
                case -512438553: goto L_0x0152;
                case -479280098: goto L_0x0146;
                case -191766732: goto L_0x013a;
                case -144228848: goto L_0x012e;
                case -120258830: goto L_0x0122;
                case 3540994: goto L_0x0116;
                case 12497644: goto L_0x010a;
                case 23388530: goto L_0x00fe;
                case 24884786: goto L_0x00f2;
                case 312972995: goto L_0x00e6;
                case 572656008: goto L_0x00da;
                case 655665144: goto L_0x00ce;
                case 668311477: goto L_0x00c2;
                case 725535758: goto L_0x00b6;
                case 747368646: goto L_0x00aa;
                case 927926776: goto L_0x009e;
                case 1179298132: goto L_0x0092;
                case 1245101844: goto L_0x0086;
                case 1660731908: goto L_0x007a;
                case 1777143241: goto L_0x006e;
                case 1809410897: goto L_0x0062;
                case 1824508181: goto L_0x0056;
                case 1877854818: goto L_0x004a;
                case 1948321034: goto L_0x003e;
                case 1984636202: goto L_0x0032;
                case 1989757366: goto L_0x0026;
                case 1998705368: goto L_0x001a;
                case 2088314227: goto L_0x000e;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x01d0
        L_0x000e:
            java.lang.String r1 = "setAdditionalData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 38
            goto L_0x01d1
        L_0x001a:
            java.lang.String r1 = "getAppsFlyerUID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 37
            goto L_0x01d1
        L_0x0026:
            java.lang.String r1 = "logEvent"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 36
            goto L_0x01d1
        L_0x0032:
            java.lang.String r1 = "setHost"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 35
            goto L_0x01d1
        L_0x003e:
            java.lang.String r1 = "initSdk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 34
            goto L_0x01d1
        L_0x004a:
            java.lang.String r1 = "setCollectAndroidId"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 33
            goto L_0x01d1
        L_0x0056:
            java.lang.String r1 = "setIsUpdate"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 32
            goto L_0x01d1
        L_0x0062:
            java.lang.String r1 = "addPushNotificationDeepLinkPath"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 31
            goto L_0x01d1
        L_0x006e:
            java.lang.String r1 = "getHostName"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 30
            goto L_0x01d1
        L_0x007a:
            java.lang.String r1 = "setUserEmails"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 29
            goto L_0x01d1
        L_0x0086:
            java.lang.String r1 = "setImeiData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 28
            goto L_0x01d1
        L_0x0092:
            java.lang.String r1 = "setResolveDeepLinkURLs"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 27
            goto L_0x01d1
        L_0x009e:
            java.lang.String r1 = "generateInviteLink"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 26
            goto L_0x01d1
        L_0x00aa:
            java.lang.String r1 = "setCustomerUserId"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 25
            goto L_0x01d1
        L_0x00b6:
            java.lang.String r1 = "setCustomerIdAndLogSession"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 24
            goto L_0x01d1
        L_0x00c2:
            java.lang.String r1 = "setSharingFilterForAllPartners"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 23
            goto L_0x01d1
        L_0x00ce:
            java.lang.String r1 = "waitForCustomerUserId"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 22
            goto L_0x01d1
        L_0x00da:
            java.lang.String r1 = "setMinTimeBetweenSessions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 21
            goto L_0x01d1
        L_0x00e6:
            java.lang.String r1 = "updateServerUninstallToken"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 20
            goto L_0x01d1
        L_0x00f2:
            java.lang.String r1 = "setSharingFilter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 19
            goto L_0x01d1
        L_0x00fe:
            java.lang.String r1 = "setAndroidIdData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 18
            goto L_0x01d1
        L_0x010a:
            java.lang.String r1 = "setDisableAdvertisingIdentifiers"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 17
            goto L_0x01d1
        L_0x0116:
            java.lang.String r1 = "stop"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 16
            goto L_0x01d1
        L_0x0122:
            java.lang.String r1 = "setDisableNetworkData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 15
            goto L_0x01d1
        L_0x012e:
            java.lang.String r1 = "logCrossPromotionImpression"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 14
            goto L_0x01d1
        L_0x013a:
            java.lang.String r1 = "getSDKVersion"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 13
            goto L_0x01d1
        L_0x0146:
            java.lang.String r1 = "setOutOfStore"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 12
            goto L_0x01d1
        L_0x0152:
            java.lang.String r1 = "logCrossPromotionAndOpenStore"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 11
            goto L_0x01d1
        L_0x015e:
            java.lang.String r1 = "setCollectIMEI"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 10
            goto L_0x01d1
        L_0x016a:
            java.lang.String r1 = "setCurrencyCode"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 9
            goto L_0x01d1
        L_0x0175:
            java.lang.String r1 = "enableFacebookDeferredApplinks"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 8
            goto L_0x01d1
        L_0x0180:
            java.lang.String r1 = "getOutOfStore"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 7
            goto L_0x01d1
        L_0x018a:
            java.lang.String r1 = "setOneLinkCustomDomain"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 6
            goto L_0x01d1
        L_0x0194:
            java.lang.String r1 = "setPartnerData"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 5
            goto L_0x01d1
        L_0x019e:
            java.lang.String r1 = "getHostPrefix"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 4
            goto L_0x01d1
        L_0x01a8:
            java.lang.String r1 = "setPushNotification"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 3
            goto L_0x01d1
        L_0x01b2:
            java.lang.String r1 = "setSharingFilterForPartners"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 2
            goto L_0x01d1
        L_0x01bc:
            java.lang.String r1 = "validateAndLogInAppAndroidPurchase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 1
            goto L_0x01d1
        L_0x01c6:
            java.lang.String r1 = "setAppInviteOneLinkID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01d0
            r0 = 0
            goto L_0x01d1
        L_0x01d0:
            r0 = -1
        L_0x01d1:
            switch(r0) {
                case 0: goto L_0x0270;
                case 1: goto L_0x026c;
                case 2: goto L_0x0268;
                case 3: goto L_0x0264;
                case 4: goto L_0x0260;
                case 5: goto L_0x025c;
                case 6: goto L_0x0258;
                case 7: goto L_0x0254;
                case 8: goto L_0x0250;
                case 9: goto L_0x024c;
                case 10: goto L_0x0248;
                case 11: goto L_0x0244;
                case 12: goto L_0x0240;
                case 13: goto L_0x023c;
                case 14: goto L_0x0238;
                case 15: goto L_0x0234;
                case 16: goto L_0x0230;
                case 17: goto L_0x022c;
                case 18: goto L_0x0228;
                case 19: goto L_0x0224;
                case 20: goto L_0x0220;
                case 21: goto L_0x021c;
                case 22: goto L_0x0218;
                case 23: goto L_0x0214;
                case 24: goto L_0x0210;
                case 25: goto L_0x020c;
                case 26: goto L_0x0208;
                case 27: goto L_0x0204;
                case 28: goto L_0x0200;
                case 29: goto L_0x01fc;
                case 30: goto L_0x01f8;
                case 31: goto L_0x01f4;
                case 32: goto L_0x01f0;
                case 33: goto L_0x01ec;
                case 34: goto L_0x01e8;
                case 35: goto L_0x01e4;
                case 36: goto L_0x01e0;
                case 37: goto L_0x01dc;
                case 38: goto L_0x01d8;
                default: goto L_0x01d4;
            }
        L_0x01d4:
            r4.notImplemented()
            return
        L_0x01d8:
            r2.setAdditionalData(r3, r4)
            return
        L_0x01dc:
            r2.getAppsFlyerUID(r4)
            return
        L_0x01e0:
            r2.logEvent(r3, r4)
            return
        L_0x01e4:
            r2.setHost(r3, r4)
            return
        L_0x01e8:
            r2.initSdk(r3, r4)
            return
        L_0x01ec:
            r2.setCollectAndroidId(r3, r4)
            return
        L_0x01f0:
            r2.setIsUpdate(r3, r4)
            return
        L_0x01f4:
            r2.addPushNotificationDeepLinkPath(r3, r4)
            return
        L_0x01f8:
            r2.getHostName(r4)
            return
        L_0x01fc:
            r2.setUserEmails(r3, r4)
            return
        L_0x0200:
            r2.setImeiData(r3, r4)
            return
        L_0x0204:
            r2.setResolveDeepLinkURLs(r3, r4)
            return
        L_0x0208:
            r2.generateInviteLink(r3, r4)
            return
        L_0x020c:
            r2.setCustomerUserId(r3, r4)
            return
        L_0x0210:
            r2.setCustomerIdAndLogSession(r3, r4)
            return
        L_0x0214:
            r2.setSharingFilterForAllPartners(r4)
            return
        L_0x0218:
            r2.waitForCustomerUserId(r3, r4)
            return
        L_0x021c:
            r2.setMinTimeBetweenSessions(r3, r4)
            return
        L_0x0220:
            r2.updateServerUninstallToken(r3, r4)
            return
        L_0x0224:
            r2.setSharingFilter(r3, r4)
            return
        L_0x0228:
            r2.setAndroidIdData(r3, r4)
            return
        L_0x022c:
            r2.setDisableAdvertisingIdentifiers(r3, r4)
            return
        L_0x0230:
            r2.stop(r3, r4)
            return
        L_0x0234:
            r2.setDisableNetworkData(r3, r4)
            return
        L_0x0238:
            r2.logCrossPromotionImpression(r3, r4)
            return
        L_0x023c:
            r2.getSdkVersion(r4)
            return
        L_0x0240:
            r2.setOutOfStore(r3, r4)
            return
        L_0x0244:
            r2.logCrossPromotionAndOpenStore(r3, r4)
            return
        L_0x0248:
            r2.setCollectIMEI(r3, r4)
            return
        L_0x024c:
            r2.setCurrencyCode(r3, r4)
            return
        L_0x0250:
            r2.enableFacebookDeferredApplinks(r3, r4)
            return
        L_0x0254:
            r2.getOutOfStore(r4)
            return
        L_0x0258:
            r2.setOneLinkCustomDomain(r3, r4)
            return
        L_0x025c:
            r2.setPartnerData(r3, r4)
            return
        L_0x0260:
            r2.getHostPrefix(r4)
            return
        L_0x0264:
            r2.sendPushNotificationData(r3, r4)
            return
        L_0x0268:
            r2.setSharingFilterForPartners(r3, r4)
            return
        L_0x026c:
            r2.validateAndLogInAppPurchase(r3, r4)
            return
        L_0x0270:
            r2.setAppInivteOneLinkID(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.appsflyersdk.AppsflyerSdkPlugin.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    private void addPushNotificationDeepLinkPath(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.arguments != null) {
            ArrayList arrayList = (ArrayList) methodCall.arguments;
            AppsFlyerLib.getInstance().addPushNotificationDeepLinkPath((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        result.success((Object) null);
    }

    private void setDisableNetworkData(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setDisableNetworkData(((Boolean) methodCall.arguments).booleanValue());
        result.success((Object) null);
    }

    private void getOutOfStore(MethodChannel.Result result) {
        result.success(AppsFlyerLib.getInstance().getOutOfStore(this.mContext));
    }

    private void setOutOfStore(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.arguments;
        if (str != null) {
            AppsFlyerLib.getInstance().setOutOfStore(str);
        }
        result.success((Object) null);
    }

    private void setResolveDeepLinkURLs(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setResolveDeepLinkURLs((String[]) ((ArrayList) methodCall.arguments).toArray(new String[0]));
        result.success((Object) null);
    }

    private void setPartnerData(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("partnerId");
        HashMap hashMap = (HashMap) methodCall.argument("partnersData");
        if (hashMap != null) {
            AppsFlyerLib.getInstance().setPartnerData(str, hashMap);
        }
        result.success((Object) null);
    }

    private void setSharingFilterForPartners(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.arguments != null) {
            ArrayList arrayList = (ArrayList) methodCall.arguments;
            AppsFlyerLib.getInstance().setSharingFilterForPartners((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
        result.success((Object) null);
    }

    private void setDisableAdvertisingIdentifiers(MethodCall methodCall, MethodChannel.Result result) {
        Boolean valueOf = Boolean.valueOf(((Boolean) methodCall.arguments).booleanValue());
        this.isSetDisableAdvertisingIdentifiersEnable = valueOf;
        if (valueOf.booleanValue()) {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(true);
        } else {
            AppsFlyerLib.getInstance().setDisableAdvertisingIdentifiers(false);
        }
        result.success((Object) null);
    }

    private void enableFacebookDeferredApplinks(MethodCall methodCall, MethodChannel.Result result) {
        Boolean valueOf = Boolean.valueOf(((Boolean) methodCall.argument("isFacebookDeferredApplinksEnabled")).booleanValue());
        this.isFacebookDeferredApplinksEnabled = valueOf;
        if (valueOf.booleanValue()) {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(true);
        } else {
            AppsFlyerLib.getInstance().enableFacebookDeferredApplinks(false);
        }
        result.success((Object) null);
    }

    private void sendPushNotificationData(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().sendPushNotificationData(this.activity);
        result.success((Object) null);
    }

    private void setOneLinkCustomDomain(MethodCall methodCall, MethodChannel.Result result) {
        ArrayList arrayList = (ArrayList) methodCall.arguments;
        AppsFlyerLib.getInstance().setOneLinkCustomDomain((String[]) arrayList.toArray(new String[arrayList.size()]));
        result.success((Object) null);
    }

    private void logCrossPromotionAndOpenStore(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("appId");
        String str2 = (String) methodCall.argument("campaign");
        Map map = (Map) methodCall.argument("params");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logAndOpenStore(this.mContext, str, str2, map);
        }
        result.success((Object) null);
    }

    private void logCrossPromotionImpression(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("appId");
        String str2 = (String) methodCall.argument("campaign");
        Map map = (Map) methodCall.argument("data");
        if (str != null && !str.equals("")) {
            CrossPromotionHelper.logCrossPromoteImpression(this.mContext, str, str2, map);
        }
        result.success((Object) null);
    }

    private void setAppInivteOneLinkID(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("oneLinkID");
        if (str == null || str.length() == 0) {
            result.success((Object) null);
            return;
        }
        AppsFlyerLib.getInstance().setAppInviteOneLink(str);
        if (this.mCallbacks.containsKey("setAppInviteOneLinkIDCallback")) {
            runOnUIThread(buildJsonResponse("success", "success"), "setAppInviteOneLinkIDCallback", "success");
        }
    }

    private void generateInviteLink(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument(AppsFlyerProperties.CHANNEL);
        String str2 = (String) methodCall.argument("customerID");
        String str3 = (String) methodCall.argument("campaign");
        String str4 = (String) methodCall.argument("referrerName");
        String str5 = (String) methodCall.argument("referrerImageUrl");
        String str6 = (String) methodCall.argument("baseDeeplink");
        String str7 = (String) methodCall.argument("brandDomain");
        Map map = (Map) methodCall.argument("customParams");
        LinkGenerator generateInviteUrl = ShareInviteHelper.generateInviteUrl(this.mContext);
        if (str != null && !str.equals("")) {
            generateInviteUrl.setChannel(str);
        }
        if (str3 != null && !str3.equals("")) {
            generateInviteUrl.setCampaign(str3);
        }
        if (str4 != null && !str4.equals("")) {
            generateInviteUrl.setReferrerName(str4);
        }
        if (str5 != null && !str5.equals("")) {
            generateInviteUrl.setReferrerImageURL(str5);
        }
        if (str2 != null && !str2.equals("")) {
            generateInviteUrl.setReferrerCustomerId(str2);
        }
        if (str6 != null && !str6.equals("")) {
            generateInviteUrl.setBaseDeeplink(str6);
        }
        if (str7 != null && !str7.equals("")) {
            generateInviteUrl.setBrandDomain(str7);
        }
        if (map != null && !map.equals("")) {
            generateInviteUrl.addParameters(map);
        }
        generateInviteUrl.generateLink(this.mContext, (CreateOneLinkHttpTask.ResponseListener) new CreateOneLinkHttpTask.ResponseListener() {
            final JSONObject obj = new JSONObject();

            public void onResponse(String str) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkSuccess")) {
                    try {
                        this.obj.put("userInviteURL", str);
                        AppsflyerSdkPlugin.this.runOnUIThread(this.obj, "generateInviteLinkSuccess", "success");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }

            public void onResponseError(String str) {
                if (AppsflyerSdkPlugin.this.mCallbacks.containsKey("generateInviteLinkFailure")) {
                    try {
                        this.obj.put("error", str);
                        AppsflyerSdkPlugin.this.runOnUIThread(str, "generateInviteLinkFailure", "failure");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        result.success((Object) null);
    }

    /* access modifiers changed from: private */
    public void runOnUIThread(final Object obj, final String str, final String str2) {
        this.uiThreadHandler.post(new Runnable() {
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", str);
                    if (str.equals("onDeepLinking")) {
                        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
                        jSONObject.put("deepLinkStatus", deepLinkResult.getStatus().toString());
                        if (deepLinkResult.getError() != null) {
                            jSONObject.put("deepLinkError", deepLinkResult.getError().toString());
                        }
                        if (deepLinkResult.getStatus() == DeepLinkResult.Status.FOUND) {
                            jSONObject.put("deepLinkObj", deepLinkResult.getDeepLink().getClickEvent());
                        }
                    } else {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        jSONObject.put(NotificationCompat.CATEGORY_STATUS, str2);
                        jSONObject.put("data", obj.toString());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                AppsflyerSdkPlugin.this.mCallbackChannel.invokeMethod("callListener", jSONObject.toString());
            }
        });
    }

    private void setSharingFilterForAllPartners(MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
        result.success((Object) null);
    }

    private void setSharingFilter(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setSharingFilter(new String[0]);
        result.success((Object) null);
    }

    private void getAppsFlyerUID(MethodChannel.Result result) {
        result.success(AppsFlyerLib.getInstance().getAppsFlyerUID(this.mContext));
    }

    private void validateAndLogInAppPurchase(MethodCall methodCall, MethodChannel.Result result) {
        registerValidatorListener();
        AppsFlyerLib.getInstance().validateAndLogInAppPurchase(this.mContext, (String) methodCall.argument("publicKey"), (String) methodCall.argument("signature"), (String) methodCall.argument("purchaseData"), (String) methodCall.argument("price"), (String) methodCall.argument("currency"), (Map) methodCall.argument("additionalParameters"));
        result.success((Object) null);
    }

    private void registerValidatorListener() {
        AppsFlyerLib.getInstance().registerValidatorListener(this.mContext, new AppsFlyerInAppPurchaseValidatorListener() {
            public void onValidateInApp() {
                if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                    AppsflyerSdkPlugin.this.runOnUIThread(new JSONObject(), "validatePurchase", "success");
                }
            }

            public void onValidateInAppFailure(String str) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", str);
                    if (AppsflyerSdkPlugin.this.validatePurchaseCallback.booleanValue()) {
                        AppsflyerSdkPlugin.this.runOnUIThread(jSONObject, "validatePurchase", "failure");
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void setMinTimeBetweenSessions(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setMinTimeBetweenSessions(((Integer) methodCall.argument("seconds")).intValue());
        result.success((Object) null);
    }

    private void getHostPrefix(MethodChannel.Result result) {
        result.success(AppsFlyerLib.getInstance().getHostPrefix());
    }

    private void getSdkVersion(MethodChannel.Result result) {
        result.success(AppsFlyerLib.getInstance().getSdkVersion());
    }

    private void getHostName(MethodChannel.Result result) {
        result.success(AppsFlyerLib.getInstance().getHostName());
    }

    private void setCollectIMEI(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setCollectIMEI(((Boolean) methodCall.argument("isCollect")).booleanValue());
        result.success((Object) null);
    }

    private void setCollectAndroidId(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setCollectAndroidID(((Boolean) methodCall.argument("isCollect")).booleanValue());
        result.success((Object) null);
    }

    private void waitForCustomerUserId(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().waitForCustomerUserId(((Boolean) methodCall.argument("wait")).booleanValue());
        result.success((Object) null);
    }

    private void setAdditionalData(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setAdditionalData((HashMap) methodCall.argument("customData"));
        result.success((Object) null);
    }

    private void setUserEmails(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerProperties.EmailsCryptType emailsCryptType;
        List list = (List) methodCall.argument("emails");
        int intValue = ((Integer) methodCall.argument("cryptType")).intValue();
        if (intValue == 0) {
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.NONE;
        } else if (intValue == 1) {
            emailsCryptType = AppsFlyerProperties.EmailsCryptType.SHA256;
        } else {
            throw new InvalidParameterException("You can use only NONE or SHA256 for EmailsCryptType on android");
        }
        if (list != null) {
            AppsFlyerLib.getInstance().setUserEmails(emailsCryptType, (String[]) list.toArray(new String[0]));
        }
        result.success((Object) null);
    }

    private void setCustomerUserId(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setCustomerUserId((String) methodCall.argument("id"));
        result.success((Object) null);
    }

    private void setCustomerIdAndLogSession(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setCustomerIdAndLogSession((String) methodCall.argument("id"), this.mContext);
        result.success((Object) null);
    }

    private void setAndroidIdData(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setAndroidIdData((String) methodCall.argument("androidId"));
        result.success((Object) null);
    }

    private void setImeiData(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setImeiData((String) methodCall.argument("imei"));
        result.success((Object) null);
    }

    private void updateServerUninstallToken(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.mContext, (String) methodCall.argument("token"));
        result.success((Object) null);
    }

    private void stop(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().stop(((Boolean) methodCall.argument("isStopped")).booleanValue(), this.mContext);
        result.success((Object) null);
    }

    private void setIsUpdate(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setIsUpdate(((Boolean) methodCall.argument("isUpdate")).booleanValue());
        result.success((Object) null);
    }

    private void setCurrencyCode(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setCurrencyCode((String) methodCall.argument(AppsFlyerProperties.CURRENCY_CODE));
        result.success((Object) null);
    }

    private void setHost(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().setHost((String) methodCall.argument("hostPrefix"), (String) methodCall.argument("hostName"));
    }

    private void initSdk(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib instance = AppsFlyerLib.getInstance();
        String str = (String) methodCall.argument("afDevKey");
        AppsFlyerConversionListener appsFlyerConversionListener = null;
        if (str == null || str.equals("")) {
            result.error((String) null, "AF Dev Key is empty", "AF dev key cannot be empty");
        }
        if (((Boolean) methodCall.argument("disableAdvertisingIdentifier")).booleanValue()) {
            instance.setDisableAdvertisingIdentifiers(true);
        }
        if (((Boolean) methodCall.argument("GCD")).booleanValue()) {
            appsFlyerConversionListener = this.afConversionListener;
        }
        if (((Boolean) methodCall.argument("UDL")).booleanValue()) {
            instance.subscribeForDeepLink(this.afDeepLinkListener);
        }
        if (((Boolean) methodCall.argument("isDebug")).booleanValue()) {
            instance.setLogLevel(AFLogger.LogLevel.DEBUG);
            instance.setDebugLog(true);
        } else {
            instance.setDebugLog(false);
        }
        instance.setPluginInfo(new PluginInfo(Plugin.FLUTTER, "6.10.3"));
        instance.init(str, appsFlyerConversionListener, this.mContext);
        String str2 = (String) methodCall.argument("appInviteOneLink");
        if (str2 != null) {
            instance.setAppInviteOneLink(str2);
        }
        instance.start(this.activity);
        if (saveCallbacks) {
            saveCallbacks = false;
            sendCachedCallbacksToDart();
        }
        result.success("success");
    }

    private void logEvent(MethodCall methodCall, MethodChannel.Result result) {
        AppsFlyerLib.getInstance().logEvent(this.mContext, (String) methodCall.argument(Constants.EVENT_NAME), (Map) methodCall.argument("eventValues"));
        result.success(Boolean.TRUE);
    }

    private void sendCachedCallbacksToDart() {
        DeepLinkResult deepLinkResult = cachedDeepLinkResult;
        if (deepLinkResult != null) {
            this.afDeepLinkListener.onDeepLinking(deepLinkResult);
            cachedDeepLinkResult = null;
        }
        Map<String, Object> map = cachedOnConversionDataSuccess;
        if (map != null) {
            this.afConversionListener.onConversionDataSuccess(map);
            cachedOnConversionDataSuccess = null;
        }
        Map<String, String> map2 = cachedOnAppOpenAttribution;
        if (map2 != null) {
            this.afConversionListener.onAppOpenAttribution(map2);
            cachedOnAppOpenAttribution = null;
        }
        String str = cachedOnAttributionFailure;
        if (str != null) {
            this.afConversionListener.onAttributionFailure(str);
            cachedOnAttributionFailure = null;
        }
        String str2 = cachedOnConversionDataFail;
        if (str2 != null) {
            this.afConversionListener.onConversionDataFail(str2);
            cachedOnConversionDataFail = null;
        }
    }

    /* access modifiers changed from: private */
    public JSONObject buildJsonResponse(Object obj, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(NotificationCompat.CATEGORY_STATUS, str);
            jSONObject.put("data", obj.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    /* access modifiers changed from: private */
    public Map<String, Object> replaceNullValues(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            hashMap.put((String) next.getKey(), next.getValue() == null ? JSONObject.NULL : next.getValue());
            it.remove();
        }
        return hashMap;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        onAttachedToEngine(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.mMethodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.mMethodChannel = null;
        this.mEventChannel.setStreamHandler((EventChannel.StreamHandler) null);
        this.mEventChannel = null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activity = activityPluginBinding.getActivity();
        this.mIntent = activityPluginBinding.getActivity().getIntent();
        this.mApplication = activityPluginBinding.getActivity().getApplication();
        activityPluginBinding.addOnNewIntentListener(this.onNewIntentListener);
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        sendCachedCallbacksToDart();
        activityPluginBinding.addOnNewIntentListener(this.onNewIntentListener);
    }

    public void onDetachedFromActivity() {
        this.activity = null;
        saveCallbacks = true;
    }
}
