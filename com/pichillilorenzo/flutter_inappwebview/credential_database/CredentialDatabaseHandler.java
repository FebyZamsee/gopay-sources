package com.pichillilorenzo.flutter_inappwebview.credential_database;

import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview.types.URLProtectionSpace;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;

public class CredentialDatabaseHandler extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "CredentialDatabaseHandler";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
    public static CredentialDatabase credentialDatabase;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        MethodCall methodCall2 = methodCall;
        MethodChannel.Result result2 = result;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = methodCall2.method;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1851697792:
                if (str.equals("clearAllAuthCredentials")) {
                    c = 0;
                    break;
                }
                break;
            case -410271914:
                if (str.equals("getHttpAuthCredentials")) {
                    c = 1;
                    break;
                }
                break;
            case 589173355:
                if (str.equals("removeHttpAuthCredential")) {
                    c = 2;
                    break;
                }
                break;
            case 998955721:
                if (str.equals("setHttpAuthCredential")) {
                    c = 3;
                    break;
                }
                break;
            case 1084504936:
                if (str.equals("removeHttpAuthCredentials")) {
                    c = 4;
                    break;
                }
                break;
            case 1930845769:
                if (str.equals("getAllAuthCredentials")) {
                    c = 5;
                    break;
                }
                break;
        }
        if (c == 0) {
            CredentialDatabase credentialDatabase2 = credentialDatabase;
            if (credentialDatabase2 != null) {
                credentialDatabase2.clearAllAuthCredentials();
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                if (!(inAppWebViewFlutterPlugin2 == null || inAppWebViewFlutterPlugin2.applicationContext == null)) {
                    WebViewDatabase.getInstance(this.plugin.applicationContext).clearHttpAuthUsernamePassword();
                }
                result2.success(Boolean.TRUE);
                return;
            }
            result2.success(Boolean.FALSE);
        } else if (c == 1) {
            ArrayList arrayList = new ArrayList();
            if (credentialDatabase != null) {
                for (URLCredential map : credentialDatabase.getHttpAuthCredentials((String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))) {
                    arrayList.add(map.toMap());
                }
            }
            result2.success(arrayList);
        } else if (c != 2) {
            if (c != 3) {
                if (c != 4) {
                    if (c != 5) {
                        result.notImplemented();
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    CredentialDatabase credentialDatabase3 = credentialDatabase;
                    if (credentialDatabase3 != null) {
                        for (URLProtectionSpace next : credentialDatabase3.protectionSpaceDao.getAll()) {
                            ArrayList arrayList3 = new ArrayList();
                            for (URLCredential map2 : credentialDatabase.credentialDao.getAllByProtectionSpaceId(next.getId())) {
                                arrayList3.add(map2.toMap());
                            }
                            HashMap hashMap = new HashMap();
                            hashMap.put("protectionSpace", next.toMap());
                            hashMap.put("credentials", arrayList3);
                            arrayList2.add(hashMap);
                        }
                    }
                    result2.success(arrayList2);
                } else if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredentials((String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                    result2.success(Boolean.TRUE);
                } else {
                    result2.success(Boolean.FALSE);
                }
            } else if (credentialDatabase != null) {
                credentialDatabase.setHttpAuthCredential((String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall2.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall2.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                result2.success(Boolean.TRUE);
            } else {
                result2.success(Boolean.FALSE);
            }
        } else if (credentialDatabase != null) {
            credentialDatabase.removeHttpAuthCredential((String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall2.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall2.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall2.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
            result2.success(Boolean.TRUE);
        } else {
            result2.success(Boolean.FALSE);
        }
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
        credentialDatabase = null;
    }
}
