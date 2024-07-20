package com.gojek.icp.identity.loginsso;

import android.content.ContentProvider;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.gojek.icp.identity.loginsso.di.DataModule;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.Scopes;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricFragment;
import o.BiometricManager;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2;
import o.addCallback;
import o.createOnBackInvokedCallback;
import o.createOnBackInvokedCallback$lambda$0;
import o.getCryptoObject;
import o.getCurrentContentInsetLeft;
import o.getLayoutResource;
import o.read;
import o.setContentInsetsAbsolute;

public final class ILoginSSOProvider extends ContentProvider {
    /* access modifiers changed from: private */
    public static String RemoteActionCompatParcelizer = "identity.loginsso.provider";
    public static final asBinder onTransact = new asBinder((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static UriMatcher read;
    @getCurrentContentInsetLeft
    public createOnBackInvokedCallback$lambda$0 repository;

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.asBinder asbinder = new ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.asBinder((byte) 0);
            asbinder.onTransact = new DataModule(context);
            read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(asbinder.onTransact, DataModule.class);
            new ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2(asbinder.onTransact, (byte) 0).asBinder(this);
        }
        if (this.repository != null) {
            return true;
        }
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        Intrinsics.checkNotNullParameter(uri, "");
        Context context = getContext();
        Intrinsics.onTransact((Object) context);
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        asBinder.asBinder(packageName);
        try {
            UriMatcher uriMatcher = read;
            Integer valueOf = uriMatcher == null ? null : Integer.valueOf(uriMatcher.match(uri));
            if (valueOf == null || valueOf.intValue() != 2) {
                matrixCursor = new MatrixCursor((String[]) ((Object[]) new String[0]));
                return matrixCursor;
            }
            Context context2 = getContext();
            Intrinsics.onTransact((Object) context2);
            String nameForUid = context2.getPackageManager().getNameForUid(Binder.getCallingUid());
            String read2 = read(nameForUid);
            Context context3 = getContext();
            Intrinsics.onTransact((Object) context3);
            Intrinsics.checkNotNullExpressionValue(context3, "");
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Intrinsics.checkNotNullExpressionValue(instance, "");
            Signature signature = context3.getPackageManager().getPackageInfo(nameForUid, 64).signatures[0];
            Intrinsics.checkNotNullExpressionValue(signature, "");
            byte[] digest = instance.digest(signature.toByteArray());
            Intrinsics.checkNotNullExpressionValue(digest, "");
            Intrinsics.checkNotNullParameter(digest, "");
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            char[] cArr2 = new char[((digest.length * 3) - 1)];
            int length = digest.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    byte b = digest[i] & 255;
                    int i3 = i * 3;
                    cArr2[i3] = cArr[b / 16];
                    cArr2[i3 + 1] = cArr[b % 16];
                    if (i < digest.length - 1) {
                        cArr2[i3 + 2] = ':';
                    }
                    if (i2 > length) {
                        break;
                    }
                    i = i2;
                }
            }
            String str3 = new String(cArr2);
            matrixCursor = new MatrixCursor(new String[]{"access_token", SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE, "auth_code_expiry", "code_verifier", Scopes.PROFILE});
            RemoteActionCompatParcelizer.onTransact.onTransact((CoroutineContext) getCryptoObject.asBinder(), new onTransact(this, nameForUid, read2, str3, matrixCursor, (TooltipCompatHandler<? super onTransact>) null));
            return matrixCursor;
        } catch (Exception e) {
            MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"error"});
            String[] strArr3 = new String[1];
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            strArr3[0] = message;
            matrixCursor2.addRow(strArr3);
            matrixCursor = matrixCursor2;
        }
    }

    private final String read(String str) {
        if (str != null) {
            try {
                Context context = getContext();
                Intrinsics.onTransact((Object) context);
                String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            } catch (Exception unused) {
            }
        }
        return "1.0";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0024, code lost:
        r4 = r4.getPackageManager();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri insert(android.net.Uri r18, android.content.ContentValues r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            android.content.Context r4 = r17.getContext()
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r4)
            java.lang.String r4 = r4.getPackageName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
            com.gojek.icp.identity.loginsso.ILoginSSOProvider.asBinder.asBinder(r4)
            android.content.Context r4 = r17.getContext()
            r5 = 0
            if (r4 != 0) goto L_0x0024
            goto L_0x0033
        L_0x0024:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            if (r4 == 0) goto L_0x0033
            int r6 = android.os.Binder.getCallingUid()
            java.lang.String r4 = r4.getNameForUid(r6)
            goto L_0x0034
        L_0x0033:
            r4 = r5
        L_0x0034:
            android.content.Context r6 = r17.getContext()
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r6)
            java.lang.String r6 = r6.getPackageName()
            if (r2 == 0) goto L_0x0130
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x0046
            goto L_0x0055
        L_0x0046:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r3)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r4 = o.BiometricFragment.AnonymousClass5.read((java.lang.CharSequence) r4, (java.lang.CharSequence) r6, (boolean) r8)
            if (r4 != r8) goto L_0x0055
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            if (r4 == 0) goto L_0x0130
            android.content.UriMatcher r4 = read
            if (r4 != 0) goto L_0x005e
            r4 = r5
            goto L_0x0066
        L_0x005e:
            int r4 = r4.match(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0066:
            if (r4 == 0) goto L_0x00e3
            int r6 = r4.intValue()
            r9 = 3
            if (r6 != r9) goto L_0x00e3
            java.lang.String r4 = "profile_accessToken"
            java.lang.String r10 = r2.getAsString(r4)
            java.lang.String r4 = "profile_customerId"
            java.lang.String r11 = r2.getAsString(r4)
            java.lang.String r4 = "profile_countryCode"
            java.lang.String r4 = r2.getAsString(r4)
            java.lang.String r6 = "profile_phone"
            java.lang.String r13 = r2.getAsString(r6)
            java.lang.String r6 = "profile_name"
            java.lang.String r14 = r2.getAsString(r6)
            java.lang.String r6 = "profile_email"
            java.lang.String r15 = r2.getAsString(r6)
            java.lang.String r6 = "profile_ImageUrl"
            java.lang.String r16 = r2.getAsString(r6)
            r2 = r10
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00a6
            boolean r2 = o.BiometricFragment.AnonymousClass5.asBinder(r2)
            if (r2 != 0) goto L_0x00a6
            r2 = 0
            goto L_0x00a7
        L_0x00a6:
            r2 = 1
        L_0x00a7:
            if (r2 != 0) goto L_0x0130
            r2 = r14
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00b6
            boolean r2 = o.BiometricFragment.AnonymousClass5.asBinder(r2)
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            goto L_0x00b7
        L_0x00b6:
            r2 = 1
        L_0x00b7:
            if (r2 != 0) goto L_0x0130
            r2 = r13
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r2 == 0) goto L_0x00c4
            boolean r2 = o.BiometricFragment.AnonymousClass5.asBinder(r2)
            if (r2 == 0) goto L_0x00c5
        L_0x00c4:
            r7 = 1
        L_0x00c5:
            if (r7 != 0) goto L_0x0130
            if (r4 == 0) goto L_0x00cb
            r12 = r4
            goto L_0x00cc
        L_0x00cb:
            r12 = r3
        L_0x00cc:
            o.addCallback$default r2 = new o.addCallback$default
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            o.BiometricManager$Api30Impl r3 = o.getCryptoObject.asBinder()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.gojek.icp.identity.loginsso.ILoginSSOProvider$RemoteActionCompatParcelizer r4 = new com.gojek.icp.identity.loginsso.ILoginSSOProvider$RemoteActionCompatParcelizer
            r4.<init>(r0, r2, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            o.RemoteActionCompatParcelizer.onTransact.onTransact((kotlin.coroutines.CoroutineContext) r3, r4)
            goto L_0x0130
        L_0x00e3:
            if (r4 == 0) goto L_0x0130
            int r3 = r4.intValue()
            r4 = 5
            if (r3 != r4) goto L_0x0130
            java.lang.String r3 = "profile_AUTHDATA"
            java.lang.String r2 = r2.getAsString(r3)
            com.google.gson.Gson r3 = new com.google.gson.Gson
            r3.<init>()
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0102
            boolean r4 = o.BiometricFragment.AnonymousClass5.asBinder(r4)
            if (r4 == 0) goto L_0x0103
        L_0x0102:
            r7 = 1
        L_0x0103:
            if (r7 != 0) goto L_0x0130
            java.lang.Class<o.createOnBackInvokedCallback> r4 = o.createOnBackInvokedCallback.class
            if (r2 != 0) goto L_0x010b
            r2 = r5
            goto L_0x0114
        L_0x010b:
            java.io.StringReader r6 = new java.io.StringReader
            r6.<init>(r2)
            java.lang.Object r2 = r3.asBinder(r6, r4)
        L_0x0114:
            java.lang.Class r3 = o.setOnBackInvokedDispatcher.asBinder(r4)
            java.lang.Object r2 = r3.cast(r2)
            o.createOnBackInvokedCallback r2 = (o.createOnBackInvokedCallback) r2
            if (r2 == 0) goto L_0x0130
            o.BiometricManager$Api30Impl r3 = o.getCryptoObject.asBinder()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            com.gojek.icp.identity.loginsso.ILoginSSOProvider$read r4 = new com.gojek.icp.identity.loginsso.ILoginSSOProvider$read
            r4.<init>(r0, r2, r5)
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            o.RemoteActionCompatParcelizer.onTransact.onTransact((kotlin.coroutines.CoroutineContext) r3, r4)
        L_0x0130:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gojek.icp.identity.loginsso.ILoginSSOProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "");
        Context context = getContext();
        Intrinsics.onTransact((Object) context);
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        asBinder.asBinder(packageName);
        UriMatcher uriMatcher = read;
        if (uriMatcher != null && uriMatcher.match(uri) == 4) {
            RemoteActionCompatParcelizer.onTransact.onTransact((CoroutineContext) getCryptoObject.asBinder(), new asInterface(this, (TooltipCompatHandler<? super asInterface>) null));
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r3 = r3.getPackageManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int update(android.net.Uri r18, android.content.ContentValues r19, java.lang.String r20, java.lang.String[] r21) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            android.content.Context r3 = r17.getContext()
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r3)
            java.lang.String r3 = r3.getPackageName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            com.gojek.icp.identity.loginsso.ILoginSSOProvider.asBinder.asBinder(r3)
            android.content.Context r3 = r17.getContext()
            r4 = 0
            if (r3 != 0) goto L_0x0022
            goto L_0x0031
        L_0x0022:
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 == 0) goto L_0x0031
            int r5 = android.os.Binder.getCallingUid()
            java.lang.String r3 = r3.getNameForUid(r5)
            goto L_0x0032
        L_0x0031:
            r3 = r4
        L_0x0032:
            android.content.Context r5 = r17.getContext()
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r5)
            java.lang.String r5 = r5.getPackageName()
            if (r1 == 0) goto L_0x00a3
            r6 = 0
            r7 = 1
            if (r3 == 0) goto L_0x0051
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r2 = o.BiometricFragment.AnonymousClass5.read((java.lang.CharSequence) r3, (java.lang.CharSequence) r5, (boolean) r7)
            if (r2 != r7) goto L_0x0051
            r6 = 1
        L_0x0051:
            if (r6 == 0) goto L_0x00a3
            android.content.UriMatcher r2 = read
            if (r2 != 0) goto L_0x0058
            goto L_0x0060
        L_0x0058:
            int r0 = r2.match(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x0060:
            if (r4 == 0) goto L_0x00a3
            int r0 = r4.intValue()
            r2 = 6
            if (r0 != r2) goto L_0x00a3
            java.lang.String r0 = "profile_customerId"
            java.lang.String r12 = r1.getAsString(r0)
            java.lang.String r0 = "profile_countryCode"
            java.lang.String r13 = r1.getAsString(r0)
            java.lang.String r0 = "profile_phone"
            java.lang.String r11 = r1.getAsString(r0)
            java.lang.String r0 = "profile_name"
            java.lang.String r10 = r1.getAsString(r0)
            java.lang.String r0 = "profile_email"
            java.lang.String r14 = r1.getAsString(r0)
            java.lang.String r0 = "profile_ImageUrl"
            java.lang.String r15 = r1.getAsString(r0)
            o.BiometricManager$Api30Impl r0 = o.getCryptoObject.asBinder()
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            com.gojek.icp.identity.loginsso.ILoginSSOProvider$write r1 = new com.gojek.icp.identity.loginsso.ILoginSSOProvider$write
            r16 = 0
            r8 = r1
            r9 = r17
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            o.RemoteActionCompatParcelizer.onTransact.onTransact((kotlin.coroutines.CoroutineContext) r0, r1)
            return r7
        L_0x00a3:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gojek.icp.identity.loginsso.ILoginSSOProvider.update(android.net.Uri, android.content.ContentValues, java.lang.String, java.lang.String[]):int");
    }

    public static final class asBinder {
        public /* synthetic */ asBinder(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private asBinder() {
        }

        public static void asBinder(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            sb.append(ILoginSSOProvider.RemoteActionCompatParcelizer);
            String obj = sb.toString();
            UriMatcher uriMatcher = new UriMatcher(-1);
            uriMatcher.addURI(obj, SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE, 2);
            uriMatcher.addURI(obj, "save_profile", 3);
            uriMatcher.addURI(obj, "update_profile", 6);
            uriMatcher.addURI(obj, "delete_profile", 4);
            uriMatcher.addURI(obj, "save_authdata", 5);
            Unit unit = Unit.asInterface;
            ILoginSSOProvider.read = uriMatcher;
        }
    }

    static final class RemoteActionCompatParcelizer extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ addCallback.Cdefault asBinder;
        private /* synthetic */ ILoginSSOProvider asInterface;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(ILoginSSOProvider iLoginSSOProvider, addCallback.Cdefault defaultR, TooltipCompatHandler<? super RemoteActionCompatParcelizer> tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.asInterface = iLoginSSOProvider;
            this.asBinder = defaultR;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new RemoteActionCompatParcelizer(this.asInterface, this.asBinder, tooltipCompatHandler);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((RemoteActionCompatParcelizer) create((BiometricManager.Authenticators) obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                    throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                }
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                createOnBackInvokedCallback$lambda$0 createonbackinvokedcallback_lambda_0 = this.asInterface.repository;
                if (createonbackinvokedcallback_lambda_0 == null) {
                    Intrinsics.asBinder("");
                    createonbackinvokedcallback_lambda_0 = null;
                }
                this.RemoteActionCompatParcelizer = 1;
                if (createonbackinvokedcallback_lambda_0.asInterface(this.asBinder, this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            return Unit.asInterface;
        }
    }

    static final class asInterface extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ ILoginSSOProvider asBinder;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        asInterface(ILoginSSOProvider iLoginSSOProvider, TooltipCompatHandler<? super asInterface> tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.asBinder = iLoginSSOProvider;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new asInterface(this.asBinder, tooltipCompatHandler);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((asInterface) create((BiometricManager.Authenticators) obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                    throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                }
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                createOnBackInvokedCallback$lambda$0 createonbackinvokedcallback_lambda_0 = this.asBinder.repository;
                if (createonbackinvokedcallback_lambda_0 == null) {
                    Intrinsics.asBinder("");
                    createonbackinvokedcallback_lambda_0 = null;
                }
                TooltipCompatHandler tooltipCompatHandler = this;
                this.RemoteActionCompatParcelizer = 1;
                if (createonbackinvokedcallback_lambda_0.onTransact() == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            return Unit.asInterface;
        }
    }

    static final class onTransact extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ ILoginSSOProvider AudioAttributesImplApi21Parcelizer;
        private Object AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String asBinder;
        private /* synthetic */ String asInterface;
        private /* synthetic */ MatrixCursor onTransact;
        private Object read;
        private Object write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        onTransact(ILoginSSOProvider iLoginSSOProvider, String str, String str2, String str3, MatrixCursor matrixCursor, TooltipCompatHandler<? super onTransact> tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.AudioAttributesImplApi21Parcelizer = iLoginSSOProvider;
            this.asBinder = str;
            this.asInterface = str2;
            this.RemoteActionCompatParcelizer = str3;
            this.onTransact = matrixCursor;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new onTransact(this.AudioAttributesImplApi21Parcelizer, this.asBinder, this.asInterface, this.RemoteActionCompatParcelizer, this.onTransact, tooltipCompatHandler);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((onTransact) create((BiometricManager.Authenticators) obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x00ea  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x00fe A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00ff  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x010c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                o.TooltipCompatHandler$$ExternalSyntheticLambda1 r2 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
                int r3 = r0.AudioAttributesCompatParcelizer
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                java.lang.String r9 = ""
                if (r3 == 0) goto L_0x0063
                if (r3 == r7) goto L_0x0059
                if (r3 == r6) goto L_0x004b
                if (r3 == r5) goto L_0x0038
                if (r3 != r4) goto L_0x0030
                java.lang.Object r2 = r0.write
                o.onBackInvoked r2 = (o.onBackInvoked) r2
                java.lang.Object r3 = r0.AudioAttributesImplApi26Parcelizer
                o.OnBackPressedDispatcher$2 r3 = (o.OnBackPressedDispatcher.AnonymousClass2) r3
                java.lang.Object r8 = r0.read
                java.lang.String r8 = (java.lang.String) r8
                boolean r10 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r10 != 0) goto L_0x002b
                goto L_0x0102
            L_0x002b:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            L_0x0030:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0038:
                java.lang.Object r3 = r0.AudioAttributesImplApi26Parcelizer
                o.OnBackPressedDispatcher$2 r3 = (o.OnBackPressedDispatcher.AnonymousClass2) r3
                java.lang.Object r10 = r0.read
                java.lang.String r10 = (java.lang.String) r10
                boolean r11 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r11 != 0) goto L_0x0046
                goto L_0x00e0
            L_0x0046:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            L_0x004b:
                java.lang.Object r3 = r0.read
                o.createOnBackInvokedCallback r3 = (o.createOnBackInvokedCallback) r3
                boolean r10 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r10 != 0) goto L_0x0054
                goto L_0x009c
            L_0x0054:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            L_0x0059:
                boolean r3 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r3 != 0) goto L_0x005e
                goto L_0x007e
            L_0x005e:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            L_0x0063:
                boolean r3 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r3 != 0) goto L_0x0145
                com.gojek.icp.identity.loginsso.ILoginSSOProvider r1 = r0.AudioAttributesImplApi21Parcelizer
                o.createOnBackInvokedCallback$lambda$0 r1 = r1.repository
                if (r1 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                kotlin.jvm.internal.Intrinsics.asBinder(r9)
                r1 = r8
            L_0x0072:
                r3 = r0
                o.TooltipCompatHandler r3 = (o.TooltipCompatHandler) r3
                r0.AudioAttributesCompatParcelizer = r7
                java.lang.Object r1 = r1.read()
                if (r1 != r2) goto L_0x007e
                return r2
            L_0x007e:
                r3 = r1
                o.createOnBackInvokedCallback r3 = (o.createOnBackInvokedCallback) r3
                if (r3 == 0) goto L_0x013d
                com.gojek.icp.identity.loginsso.ILoginSSOProvider r1 = r0.AudioAttributesImplApi21Parcelizer
                r10 = r0
                o.TooltipCompatHandler r10 = (o.TooltipCompatHandler) r10
                r0.read = r3
                r0.AudioAttributesCompatParcelizer = r6
                o.createOnBackInvokedCallback$lambda$0 r1 = r1.repository
                if (r1 == 0) goto L_0x0091
                goto L_0x0095
            L_0x0091:
                kotlin.jvm.internal.Intrinsics.asBinder(r9)
                r1 = r8
            L_0x0095:
                java.lang.Object r1 = r1.onTransact(r10)
                if (r1 != r2) goto L_0x009c
                return r2
            L_0x009c:
                java.lang.String r1 = (java.lang.String) r1
                o.OnBackPressedDispatcher$1 r10 = o.OnBackPressedDispatcher.AnonymousClass1.onTransact
                o.OnBackPressedDispatcher$2 r10 = o.OnBackPressedDispatcher.AnonymousClass1.read()
                java.lang.String r11 = r0.asBinder
                if (r11 != 0) goto L_0x00a9
                r11 = r9
            L_0x00a9:
                java.lang.String r12 = r0.asInterface
                o.OnBackPressedDispatcherKt$addCallback$callback$1 r13 = new o.OnBackPressedDispatcherKt$addCallback$callback$1
                r13.<init>(r1, r11, r12)
                java.lang.String r11 = r0.RemoteActionCompatParcelizer
                java.lang.String r12 = r3.onTransact
                java.lang.String r3 = r3.RemoteActionCompatParcelizer
                java.lang.String r14 = r10.asBinder
                o.R$id r15 = new o.R$id
                r15.<init>(r11, r12, r3, r14)
                com.gojek.icp.identity.loginsso.ILoginSSOProvider r3 = r0.AudioAttributesImplApi21Parcelizer
                o.createOnBackInvokedCallback$lambda$0 r3 = r3.repository
                if (r3 == 0) goto L_0x00c4
                goto L_0x00c8
            L_0x00c4:
                kotlin.jvm.internal.Intrinsics.asBinder(r9)
                r3 = r8
            L_0x00c8:
                o.setSubMenu$read r13 = (o.setSubMenu.read) r13
                r11 = r0
                o.TooltipCompatHandler r11 = (o.TooltipCompatHandler) r11
                r0.read = r1
                r0.AudioAttributesImplApi26Parcelizer = r10
                r0.AudioAttributesCompatParcelizer = r5
                java.lang.Object r3 = r3.RemoteActionCompatParcelizer(r15, r13, r11)
                if (r3 != r2) goto L_0x00da
                return r2
            L_0x00da:
                r16 = r10
                r10 = r1
                r1 = r3
                r3 = r16
            L_0x00e0:
                o.onBackInvoked r1 = (o.onBackInvoked) r1
                com.gojek.icp.identity.loginsso.ILoginSSOProvider r11 = r0.AudioAttributesImplApi21Parcelizer
                o.createOnBackInvokedCallback$lambda$0 r11 = r11.repository
                if (r11 == 0) goto L_0x00ea
                r8 = r11
                goto L_0x00ed
            L_0x00ea:
                kotlin.jvm.internal.Intrinsics.asBinder(r9)
            L_0x00ed:
                r11 = r0
                o.TooltipCompatHandler r11 = (o.TooltipCompatHandler) r11
                r0.read = r10
                r0.AudioAttributesImplApi26Parcelizer = r3
                r0.write = r1
                r0.AudioAttributesCompatParcelizer = r4
                java.lang.Object r8 = r8.read(r11)
                if (r8 != r2) goto L_0x00ff
                return r2
            L_0x00ff:
                r2 = r1
                r1 = r8
                r8 = r10
            L_0x0102:
                o.addCallback$default r1 = (o.addCallback.Cdefault) r1
                com.google.gson.Gson r10 = new com.google.gson.Gson
                r10.<init>()
                if (r1 != 0) goto L_0x010c
                goto L_0x0121
            L_0x010c:
                if (r1 != 0) goto L_0x0115
                o.hasFocus r1 = o.hasFocus.asInterface
                java.lang.String r1 = r10.RemoteActionCompatParcelizer((o.hasWindowFocus) r1)
                goto L_0x011d
            L_0x0115:
                java.lang.Class r11 = r1.getClass()
                java.lang.String r1 = r10.read((java.lang.Object) r1, (java.lang.reflect.Type) r11)
            L_0x011d:
                if (r1 != 0) goto L_0x0120
                goto L_0x0121
            L_0x0120:
                r9 = r1
            L_0x0121:
                android.database.MatrixCursor r1 = r0.onTransact
                r10 = 5
                java.lang.String[] r10 = new java.lang.String[r10]
                r11 = 0
                r10[r11] = r8
                java.lang.String r8 = r2.asInterface
                r10[r7] = r8
                java.lang.String r2 = r2.RemoteActionCompatParcelizer
                r10[r6] = r2
                java.lang.String r2 = r3.onTransact
                r10[r5] = r2
                r10[r4] = r9
                r1.addRow(r10)
                kotlin.Unit r1 = kotlin.Unit.asInterface
                return r1
            L_0x013d:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Auth Data not saved"
                r1.<init>(r2)
                throw r1
            L_0x0145:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.gojek.icp.identity.loginsso.ILoginSSOProvider.onTransact.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class read extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private /* synthetic */ ILoginSSOProvider RemoteActionCompatParcelizer;
        private int asInterface;
        private /* synthetic */ createOnBackInvokedCallback onTransact;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(ILoginSSOProvider iLoginSSOProvider, createOnBackInvokedCallback createonbackinvokedcallback, TooltipCompatHandler<? super read> tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.RemoteActionCompatParcelizer = iLoginSSOProvider;
            this.onTransact = createonbackinvokedcallback;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new read(this.RemoteActionCompatParcelizer, this.onTransact, tooltipCompatHandler);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((read) create((BiometricManager.Authenticators) obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            int i = this.asInterface;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                    throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                }
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                createOnBackInvokedCallback$lambda$0 createonbackinvokedcallback_lambda_0 = this.RemoteActionCompatParcelizer.repository;
                if (createonbackinvokedcallback_lambda_0 == null) {
                    Intrinsics.asBinder("");
                    createonbackinvokedcallback_lambda_0 = null;
                }
                createOnBackInvokedCallback createonbackinvokedcallback = this.onTransact;
                Intrinsics.checkNotNullExpressionValue(createonbackinvokedcallback, "");
                TooltipCompatHandler tooltipCompatHandler = this;
                this.asInterface = 1;
                if (createonbackinvokedcallback_lambda_0.asBinder(createonbackinvokedcallback) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            return Unit.asInterface;
        }
    }

    static final class write extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private /* synthetic */ String AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ ILoginSSOProvider IconCompatParcelizer;
        private /* synthetic */ String RemoteActionCompatParcelizer;
        private /* synthetic */ String asBinder;
        private /* synthetic */ String asInterface;
        private /* synthetic */ String onTransact;
        private /* synthetic */ String read;
        private int write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(ILoginSSOProvider iLoginSSOProvider, String str, String str2, String str3, String str4, String str5, String str6, TooltipCompatHandler<? super write> tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.IconCompatParcelizer = iLoginSSOProvider;
            this.onTransact = str;
            this.asInterface = str2;
            this.RemoteActionCompatParcelizer = str3;
            this.read = str4;
            this.asBinder = str5;
            this.AudioAttributesImplApi21Parcelizer = str6;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            return new write(this.IconCompatParcelizer, this.onTransact, this.asInterface, this.RemoteActionCompatParcelizer, this.read, this.asBinder, this.AudioAttributesImplApi21Parcelizer, tooltipCompatHandler);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((write) create((BiometricManager.Authenticators) obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            int i = this.write;
            createOnBackInvokedCallback$lambda$0 createonbackinvokedcallback_lambda_0 = null;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (obj instanceof setContentInsetsAbsolute.onTransact) {
                            throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                        }
                        return Unit.asInterface;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                    throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                }
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                ILoginSSOProvider iLoginSSOProvider = this.IconCompatParcelizer;
                TooltipCompatHandler tooltipCompatHandler = this;
                this.write = 1;
                createOnBackInvokedCallback$lambda$0 createonbackinvokedcallback_lambda_02 = iLoginSSOProvider.repository;
                if (createonbackinvokedcallback_lambda_02 == null) {
                    Intrinsics.asBinder("");
                    createonbackinvokedcallback_lambda_02 = null;
                }
                obj = createonbackinvokedcallback_lambda_02.onTransact(tooltipCompatHandler);
                if (obj == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            String str2 = (String) obj;
            CharSequence charSequence = str2;
            if (!(charSequence == null || BiometricFragment.AnonymousClass5.asBinder(charSequence))) {
                CharSequence charSequence2 = this.onTransact;
                if (!(charSequence2 == null || BiometricFragment.AnonymousClass5.asBinder(charSequence2))) {
                    CharSequence charSequence3 = this.asInterface;
                    if (charSequence3 != null && !BiometricFragment.AnonymousClass5.asBinder(charSequence3)) {
                        z = false;
                    }
                    if (!z) {
                        String str3 = this.RemoteActionCompatParcelizer;
                        String str4 = this.read;
                        if (str4 == null) {
                            str = "";
                        } else {
                            str = str4;
                        }
                        addCallback.Cdefault defaultR = new addCallback.Cdefault(str2, str3, str, this.asInterface, this.onTransact, this.asBinder, this.AudioAttributesImplApi21Parcelizer);
                        createOnBackInvokedCallback$lambda$0 createonbackinvokedcallback_lambda_03 = this.IconCompatParcelizer.repository;
                        if (createonbackinvokedcallback_lambda_03 != null) {
                            createonbackinvokedcallback_lambda_0 = createonbackinvokedcallback_lambda_03;
                        } else {
                            Intrinsics.asBinder("");
                        }
                        this.write = 2;
                        if (createonbackinvokedcallback_lambda_0.asInterface(defaultR, this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                            return tooltipCompatHandler$$ExternalSyntheticLambda1;
                        }
                    }
                }
            }
            return Unit.asInterface;
        }
    }
}
