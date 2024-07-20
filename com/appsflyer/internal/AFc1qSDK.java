package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1rSDK;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.Toolbar$Api33Impl$$ExternalSyntheticLambda0;
import o.WithHint;
import o.cancelAuthentication;

public final class AFc1qSDK implements AFc1nSDK {
    private final AFc1tSDK valueOf;

    public AFc1qSDK(AFc1tSDK aFc1tSDK) {
        Intrinsics.checkNotNullParameter(aFc1tSDK, "");
        this.valueOf = aFc1tSDK;
    }

    private final File AFKeystoreWrapper() {
        Context context = this.valueOf.AFInAppEventType;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final File valueOf() {
        File AFKeystoreWrapper = AFKeystoreWrapper();
        if (AFKeystoreWrapper == null) {
            return null;
        }
        File file = new File(AFKeystoreWrapper, "6.11.1");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0147, code lost:
        r15 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        o.setOnBackInvokedDispatcher.asInterface(r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x014b, code lost:
        throw r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String values(java.lang.Throwable r14, java.lang.String r15) {
        /*
            r13 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            monitor-enter(r13)
            java.io.File r0 = r13.valueOf()     // Catch:{ all -> 0x0184 }
            r1 = 0
            if (r0 == 0) goto L_0x0182
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)     // Catch:{ Exception -> 0x014c }
            com.appsflyer.internal.AFc1rSDK r2 = new com.appsflyer.internal.AFc1rSDK     // Catch:{ Exception -> 0x014c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r3.<init>()     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r4)     // Catch:{ Exception -> 0x014c }
            java.lang.Class r4 = r14.getClass()     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x014c }
            java.lang.String r5 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch:{ Exception -> 0x014c }
            r3.append(r4)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = ": "
            r3.append(r4)     // Catch:{ Exception -> 0x014c }
            r3.append(r15)     // Catch:{ Exception -> 0x014c }
            java.lang.String r4 = r3.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.String r15 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)     // Catch:{ Exception -> 0x014c }
            java.lang.String r15 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)     // Catch:{ Exception -> 0x014c }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            r15.<init>()     // Catch:{ Exception -> 0x014c }
            r15.append(r14)     // Catch:{ Exception -> 0x014c }
            r3 = 10
            r15.append(r3)     // Catch:{ Exception -> 0x014c }
            java.util.List r3 = com.appsflyer.internal.AFc1gSDK.values(r14)     // Catch:{ Exception -> 0x014c }
            r5 = r3
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "\n"
            r6 = r3
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x014c }
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.appsflyer.internal.AFc1gSDK$4 r3 = com.appsflyer.internal.AFc1gSDK.AnonymousClass4.AFKeystoreWrapper     // Catch:{ Exception -> 0x014c }
            r11 = r3
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11     // Catch:{ Exception -> 0x014c }
            r12 = 30
            java.lang.String r3 = o.Toolbar.ExpandedActionViewMenuPresenter.asInterface(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x014c }
            r15.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r15 = r15.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "SHA-256"
            java.lang.String r5 = com.appsflyer.internal.AFc1fSDK.valueOf(r15, r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r15 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)     // Catch:{ Exception -> 0x014c }
            java.io.StringWriter r15 = new java.io.StringWriter     // Catch:{ Exception -> 0x014c }
            r15.<init>()     // Catch:{ Exception -> 0x014c }
            java.io.PrintWriter r3 = new java.io.PrintWriter     // Catch:{ Exception -> 0x014c }
            r6 = r15
            java.io.Writer r6 = (java.io.Writer) r6     // Catch:{ Exception -> 0x014c }
            r3.<init>(r6)     // Catch:{ Exception -> 0x014c }
            r14.printStackTrace(r3)     // Catch:{ Exception -> 0x014c }
            r3.flush()     // Catch:{ Exception -> 0x014c }
            java.lang.String r6 = r15.toString()     // Catch:{ Exception -> 0x014c }
            java.lang.String r14 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r14)     // Catch:{ Exception -> 0x014c }
            r7 = 0
            r8 = 8
            r9 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x014c }
            java.lang.String r14 = r2.AFInAppEventParameterName     // Catch:{ Exception -> 0x014c }
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x014c }
            r15.<init>(r0, r14)     // Catch:{ Exception -> 0x014c }
            boolean r0 = r15.exists()     // Catch:{ Exception -> 0x014c }
            if (r0 == 0) goto L_0x00d3
            com.appsflyer.internal.AFc1rSDK$AFa1vSDK r0 = com.appsflyer.internal.AFc1rSDK.AFa1vSDK     // Catch:{ Exception -> 0x014c }
            java.nio.charset.Charset r0 = o.cancelAuthentication.onTransact     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = o.WithHint.asBinder(r15, r0)     // Catch:{ Exception -> 0x014c }
            com.appsflyer.internal.AFc1rSDK r0 = com.appsflyer.internal.AFc1rSDK.AFa1vSDK.AFInAppEventParameterName(r0)     // Catch:{ Exception -> 0x014c }
            if (r0 == 0) goto L_0x00d3
            int r2 = r0.AFKeystoreWrapper     // Catch:{ Exception -> 0x014c }
            int r2 = r2 + 1
            r0.AFKeystoreWrapper = r2     // Catch:{ Exception -> 0x014c }
            r2 = r0
        L_0x00d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "label="
            r0.<init>(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = r2.AFInAppEventType     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = com.appsflyer.internal.AFc1fSDK.AFInAppEventParameterName(r3)     // Catch:{ Exception -> 0x014c }
            r0.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "\nhashName="
            r0.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = r2.AFInAppEventParameterName     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = com.appsflyer.internal.AFc1fSDK.AFInAppEventParameterName(r3)     // Catch:{ Exception -> 0x014c }
            r0.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "\nstackTrace="
            r0.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = r2.values     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = com.appsflyer.internal.AFc1fSDK.AFInAppEventParameterName(r3)     // Catch:{ Exception -> 0x014c }
            r0.append(r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = "\nc="
            r0.append(r3)     // Catch:{ Exception -> 0x014c }
            int r2 = r2.AFKeystoreWrapper     // Catch:{ Exception -> 0x014c }
            r0.append(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014c }
            java.nio.charset.Charset r2 = o.cancelAuthentication.onTransact     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)     // Catch:{ Exception -> 0x014c }
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)     // Catch:{ Exception -> 0x014c }
            byte[] r0 = r0.getBytes(r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r2)     // Catch:{ Exception -> 0x014c }
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)     // Catch:{ Exception -> 0x014c }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x014c }
            r2.<init>(r15)     // Catch:{ Exception -> 0x014c }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ Exception -> 0x014c }
            r15 = r2
            java.io.FileOutputStream r15 = (java.io.FileOutputStream) r15     // Catch:{ all -> 0x0145 }
            r15.write(r0)     // Catch:{ all -> 0x0145 }
            kotlin.Unit r15 = kotlin.Unit.asInterface     // Catch:{ all -> 0x0145 }
            o.setOnBackInvokedDispatcher.asInterface((java.io.Closeable) r2, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x014c }
            r1 = r14
            goto L_0x0182
        L_0x0145:
            r14 = move-exception
            throw r14     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r15 = move-exception
            o.setOnBackInvokedDispatcher.asInterface((java.io.Closeable) r2, (java.lang.Throwable) r14)     // Catch:{ Exception -> 0x014c }
            throw r15     // Catch:{ Exception -> 0x014c }
        L_0x014c:
            r14 = move-exception
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Could not cache exception\n"
            r15.<init>(r0)     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            java.lang.String r2 = " "
            r0.<init>(r2)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0184 }
            r0.append(r14)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = r0.toString()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "[Exception Manager]: "
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = r0.concat(r14)     // Catch:{ all -> 0x0184 }
            r15.append(r14)     // Catch:{ all -> 0x0184 }
            java.lang.String r14 = r15.toString()     // Catch:{ all -> 0x0184 }
            com.appsflyer.AFLogger.afRDLog(r14)     // Catch:{ all -> 0x0184 }
            r14 = r1
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x0184 }
        L_0x0182:
            monitor-exit(r13)
            return r1
        L_0x0184:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1qSDK.values(java.lang.Throwable, java.lang.String):java.lang.String");
    }

    public final List<AFc1rSDK> AFInAppEventType() {
        List<AFc1rSDK> list;
        synchronized (this) {
            File valueOf2 = valueOf();
            list = null;
            if (valueOf2 != null) {
                try {
                    File[] listFiles = valueOf2.listFiles();
                    if (listFiles != null) {
                        Intrinsics.checkNotNullExpressionValue(listFiles, "");
                        Collection arrayList = new ArrayList();
                        for (File file : listFiles) {
                            AFc1rSDK.AFa1vSDK aFa1vSDK = AFc1rSDK.AFa1vSDK;
                            Intrinsics.checkNotNullExpressionValue(file, "");
                            AFc1rSDK AFInAppEventParameterName = AFc1rSDK.AFa1vSDK.AFInAppEventParameterName(WithHint.asBinder(file, cancelAuthentication.onTransact));
                            if (AFInAppEventParameterName != null) {
                                arrayList.add(AFInAppEventParameterName);
                            }
                        }
                        list = (List) arrayList;
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("Could not get stored exceptions\n ");
                    sb.append(th.getMessage());
                    String obj = sb.toString();
                    Intrinsics.checkNotNullParameter(obj, "");
                    AFLogger.afRDLog("[Exception Manager]: ".concat(String.valueOf(obj)));
                    List list2 = null;
                }
            }
            if (list == null) {
                list = Toolbar$Api33Impl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer;
            }
        }
        return list;
    }

    public final int values() {
        int i = 0;
        for (AFc1rSDK aFc1rSDK : AFInAppEventType()) {
            i += aFc1rSDK.AFKeystoreWrapper;
        }
        return i;
    }

    public final boolean AFInAppEventParameterName() {
        return AFInAppEventType(new String[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0154, code lost:
        if (((java.lang.Boolean) o.Toolbar.ExpandedActionViewMenuPresenter.RemoteActionCompatParcelizer(r13)).booleanValue() != false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AFInAppEventType(java.lang.String... r13) {
        /*
            r12 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            monitor-enter(r12)
            java.io.File r0 = r12.AFKeystoreWrapper()     // Catch:{ all -> 0x0159 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0156
            int r3 = r13.length     // Catch:{ all -> 0x0159 }
            if (r3 != 0) goto L_0x0013
            r3 = 1
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            if (r3 == 0) goto L_0x0028
            java.lang.String r13 = "delete all exceptions"
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)     // Catch:{ all -> 0x0159 }
            java.lang.String r13 = "[Exception Manager]: delete all exceptions"
            com.appsflyer.AFLogger.afRDLog(r13)     // Catch:{ all -> 0x0159 }
            boolean r1 = o.WithHint.asBinder(r0)     // Catch:{ all -> 0x0159 }
            goto L_0x0157
        L_0x0028:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = "delete all exceptions except for: "
            r3.<init>(r4)     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = ", "
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch:{ all -> 0x0159 }
            java.lang.String r5 = ""
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch:{ all -> 0x0159 }
            java.lang.String r6 = ""
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x0159 }
            java.lang.String r7 = "..."
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x0159 }
            r8 = 0
            java.lang.String r9 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r9)     // Catch:{ all -> 0x0159 }
            java.lang.String r9 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r9)     // Catch:{ all -> 0x0159 }
            java.lang.String r9 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r9)     // Catch:{ all -> 0x0159 }
            java.lang.String r9 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r9)     // Catch:{ all -> 0x0159 }
            java.lang.String r9 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r9)     // Catch:{ all -> 0x0159 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0159 }
            r9.<init>()     // Catch:{ all -> 0x0159 }
            java.lang.Appendable r9 = (java.lang.Appendable) r9     // Catch:{ all -> 0x0159 }
            java.lang.String r10 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r10)     // Catch:{ all -> 0x0159 }
            java.lang.String r10 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r10)     // Catch:{ all -> 0x0159 }
            java.lang.String r10 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r10)     // Catch:{ all -> 0x0159 }
            java.lang.String r10 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r10)     // Catch:{ all -> 0x0159 }
            java.lang.String r10 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r10)     // Catch:{ all -> 0x0159 }
            java.lang.String r10 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)     // Catch:{ all -> 0x0159 }
            r9.append(r5)     // Catch:{ all -> 0x0159 }
            int r5 = r13.length     // Catch:{ all -> 0x0159 }
            r7 = 0
            r10 = 0
        L_0x0084:
            if (r7 >= r5) goto L_0x0094
            r11 = r13[r7]     // Catch:{ all -> 0x0159 }
            int r10 = r10 + r2
            if (r10 <= r2) goto L_0x008e
            r9.append(r4)     // Catch:{ all -> 0x0159 }
        L_0x008e:
            o.BiometricFragment.AnonymousClass5.RemoteActionCompatParcelizer(r9, r11, r8)     // Catch:{ all -> 0x0159 }
            int r7 = r7 + 1
            goto L_0x0084
        L_0x0094:
            r9.append(r6)     // Catch:{ all -> 0x0159 }
            java.lang.StringBuilder r9 = (java.lang.StringBuilder) r9     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = r9.toString()     // Catch:{ all -> 0x0159 }
            java.lang.String r5 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)     // Catch:{ all -> 0x0159 }
            r3.append(r4)     // Catch:{ all -> 0x0159 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = "[Exception Manager]: "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0159 }
            java.lang.String r3 = r4.concat(r3)     // Catch:{ all -> 0x0159 }
            com.appsflyer.AFLogger.afRDLog(r3)     // Catch:{ all -> 0x0159 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x0156
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ all -> 0x0159 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0159 }
            r3.<init>()     // Catch:{ all -> 0x0159 }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x0159 }
            int r4 = r0.length     // Catch:{ all -> 0x0159 }
            r5 = 0
        L_0x00cf:
            if (r5 >= r4) goto L_0x00ed
            r6 = r0[r5]     // Catch:{ all -> 0x0159 }
            java.lang.String r7 = r6.getName()     // Catch:{ all -> 0x0159 }
            java.lang.String r8 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r8)     // Catch:{ all -> 0x0159 }
            int r7 = o.setTitleMarginBottom.read(r13, r7)     // Catch:{ all -> 0x0159 }
            if (r7 < 0) goto L_0x00e4
            r7 = 1
            goto L_0x00e5
        L_0x00e4:
            r7 = 0
        L_0x00e5:
            if (r7 != 0) goto L_0x00ea
            r3.add(r6)     // Catch:{ all -> 0x0159 }
        L_0x00ea:
            int r5 = r5 + 1
            goto L_0x00cf
        L_0x00ed:
            java.util.List r3 = (java.util.List) r3     // Catch:{ all -> 0x0159 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x0159 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)     // Catch:{ all -> 0x0159 }
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0159 }
            int r0 = r0.size()     // Catch:{ all -> 0x0159 }
            r13.<init>(r0)     // Catch:{ all -> 0x0159 }
            java.util.Collection r13 = (java.util.Collection) r13     // Catch:{ all -> 0x0159 }
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x0159 }
        L_0x0108:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0159 }
            if (r3 == 0) goto L_0x0125
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0159 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0159 }
            java.lang.String r4 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)     // Catch:{ all -> 0x0159 }
            boolean r3 = o.WithHint.asBinder(r3)     // Catch:{ all -> 0x0159 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0159 }
            r13.add(r3)     // Catch:{ all -> 0x0159 }
            goto L_0x0108
        L_0x0125:
            java.util.List r13 = (java.util.List) r13     // Catch:{ all -> 0x0159 }
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x0159 }
            java.util.Set r13 = o.Toolbar.ExpandedActionViewMenuPresenter.AudioAttributesImplApi26Parcelizer(r13)     // Catch:{ all -> 0x0159 }
            java.util.Collection r13 = (java.util.Collection) r13     // Catch:{ all -> 0x0159 }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0159 }
            if (r0 == 0) goto L_0x0140
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0159 }
            java.util.Set r13 = java.util.Collections.singleton(r13)     // Catch:{ all -> 0x0159 }
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r0)     // Catch:{ all -> 0x0159 }
        L_0x0140:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0159 }
            int r0 = r13.size()     // Catch:{ all -> 0x0159 }
            if (r0 != r2) goto L_0x0157
            java.lang.Iterable r13 = (java.lang.Iterable) r13     // Catch:{ all -> 0x0159 }
            java.lang.Object r13 = o.Toolbar.ExpandedActionViewMenuPresenter.RemoteActionCompatParcelizer(r13)     // Catch:{ all -> 0x0159 }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x0159 }
            boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x0159 }
            if (r13 == 0) goto L_0x0157
        L_0x0156:
            r1 = 1
        L_0x0157:
            monitor-exit(r12)
            return r1
        L_0x0159:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1qSDK.AFInAppEventType(java.lang.String[]):boolean");
    }
}
