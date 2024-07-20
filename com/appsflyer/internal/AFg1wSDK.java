package com.appsflyer.internal;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1uSDK;
import java.util.HashMap;
import java.util.Map;
import java.util.Observer;
import java.util.concurrent.ExecutorService;

public class AFg1wSDK extends AFg1xSDK {
    public final Map<String, Object> AFInAppEventParameterName = new HashMap();
    /* access modifiers changed from: private */
    public final ExecutorService AFInAppEventType;

    public AFg1wSDK(Runnable runnable, ExecutorService executorService) {
        super("store", "google", runnable);
        this.AFInAppEventType = executorService;
    }

    private static boolean AFInAppEventParameterName(Context context) {
        if (!values(context)) {
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if (AFa1bSDK.AFInAppEventParameterName(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("InstallReferrerClient not found", e);
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    public final void valueOf(final Context context) {
        if (AFInAppEventParameterName(context)) {
            this.afDebugLog = System.currentTimeMillis();
            this.AFLogger = AFg1uSDK.AFa1xSDK.STARTED;
            addObserver(new Observer() {
                public final void update(
/*
Method generation error in method: com.appsflyer.internal.AFg1uSDK.2.update(java.util.Observable, java.lang.Object):void, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.appsflyer.internal.AFg1uSDK.2.update(java.util.Observable, java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            try {
                final InstallReferrerClient build = InstallReferrerClient.newBuilder(context).build();
                AFLogger.afDebugLog("Connecting to Install Referrer Library...");
                build.startConnection(new InstallReferrerStateListener() {
                    /* access modifiers changed from: package-private */
                    /* renamed from: lambda$onInstallReferrerSetupFinished$0$com-appsflyer-internal-AFg1wSDK$3  reason: not valid java name */
                    public final /* synthetic */ void m57lambda$onInstallReferrerSetupFinished$0$comappsflyerinternalAFg1wSDK$3(InstallReferrerClient installReferrerClient, Context context, int i) {
                        AFg1wSDK.values(AFg1wSDK.this, installReferrerClient, context, i);
                    }

                    public final void onInstallReferrerSetupFinished(int i) {
                        AFg1wSDK.this.AFInAppEventType.execute(new AFg1wSDK$3$$ExternalSyntheticLambda0(this, build, context, i));
                    }

                    public final void onInstallReferrerServiceDisconnected() {
                        AFLogger.afDebugLog("Install Referrer service disconnected");
                    }
                });
            } catch (Throwable th) {
                AFLogger.afErrorLog("referrerClient -> startConnection", th);
            }
        }
    }

    static /* synthetic */ void values(AFg1wSDK aFg1wSDK, InstallReferrerClient installReferrerClient, Context context, int i) {
        aFg1wSDK.AFInAppEventParameterName.put("code", String.valueOf(i));
        aFg1wSDK.valueOf.put("api_ver", Long.valueOf(AFa1bSDK.AFKeystoreWrapper(context, "com.android.vending")));
        aFg1wSDK.valueOf.put("api_ver_name", AFa1bSDK.values(context, "com.android.vending"));
        if (i == -1) {
            AFLogger.afWarnLog("InstallReferrer SERVICE_DISCONNECTED");
            aFg1wSDK.valueOf.put("response", "SERVICE_DISCONNECTED");
        } else if (i == 0) {
            aFg1wSDK.valueOf.put("response", "OK");
            try {
                AFLogger.afDebugLog("InstallReferrer connected");
                if (installReferrerClient.isReady()) {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null) {
                        aFg1wSDK.AFInAppEventParameterName.put("val", installReferrer2);
                        aFg1wSDK.valueOf.put("referrer", installReferrer2);
                    }
                    long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                    aFg1wSDK.AFInAppEventParameterName.put("clk", Long.toString(referrerClickTimestampSeconds));
                    aFg1wSDK.valueOf.put("click_ts", Long.valueOf(referrerClickTimestampSeconds));
                    long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                    aFg1wSDK.AFInAppEventParameterName.put("install", Long.toString(installBeginTimestampSeconds));
                    aFg1wSDK.valueOf.put("install_begin_ts", Long.valueOf(installBeginTimestampSeconds));
                    HashMap hashMap = new HashMap();
                    boolean googlePlayInstantParam = installReferrer.getGooglePlayInstantParam();
                    aFg1wSDK.AFInAppEventParameterName.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    hashMap.put("instant", Boolean.valueOf(googlePlayInstantParam));
                    try {
                        hashMap.put("click_server_ts", Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()));
                        hashMap.put("install_begin_server_ts", Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()));
                        hashMap.put("install_version", installReferrer.getInstallVersion());
                    } catch (NoSuchMethodError e) {
                        AFLogger.afErrorLogForExcManagerOnly("some method not exist", e);
                    }
                    if (!hashMap.isEmpty()) {
                        aFg1wSDK.valueOf.put("google_custom", hashMap);
                    }
                    installReferrerClient.endConnection();
                } else {
                    AFLogger.afWarnLog("ReferrerClient: InstallReferrer is not ready");
                    aFg1wSDK.AFInAppEventParameterName.put(NotificationCompat.CATEGORY_ERROR, "ReferrerClient: InstallReferrer is not ready");
                }
            } catch (NoSuchMethodError e2) {
                AFLogger.afErrorLogForExcManagerOnly("getGooglePlayInstantParam not exist", e2);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Failed to get install referrer: ");
                sb.append(th.getMessage());
                AFLogger.afWarnLog(sb.toString());
                aFg1wSDK.AFInAppEventParameterName.put(NotificationCompat.CATEGORY_ERROR, th.getMessage());
                AFLogger.afErrorLogForExcManagerOnly("Failed to get install referrer", th);
            }
        } else if (i == 1) {
            aFg1wSDK.valueOf.put("response", "SERVICE_UNAVAILABLE");
            AFLogger.afWarnLog("InstallReferrer not supported");
        } else if (i == 2) {
            AFLogger.afWarnLog("InstallReferrer FEATURE_NOT_SUPPORTED");
            aFg1wSDK.valueOf.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i != 3) {
            AFLogger.afWarnLog("responseCode not found.");
        } else {
            AFLogger.afWarnLog("InstallReferrer DEVELOPER_ERROR");
            aFg1wSDK.valueOf.put("response", "DEVELOPER_ERROR");
        }
        AFLogger.afDebugLog("Install Referrer collected locally");
        aFg1wSDK.AFInAppEventType();
    }
}
