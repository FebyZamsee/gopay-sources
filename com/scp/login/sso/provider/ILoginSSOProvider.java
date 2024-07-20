package com.scp.login.sso.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.gson.Gson;
import com.scp.login.sso.di.BasicModule;
import com.scp.login.sso.di.DataModule;
import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AsyncLayoutInflater;
import o.BiometricManager;
import o.RemoteActionCompatParcelizer;
import o.TooltipCompatHandler;
import o.TooltipCompatHandler$$ExternalSyntheticLambda1;
import o.getCryptoObject;
import o.getCurrentContentInsetLeft;
import o.getLayoutResource;
import o.getSplitTrack;
import o.getThumbTintMode;
import o.read;
import o.setContentInsetsAbsolute;
import o.setThumbTextPadding;

public final class ILoginSSOProvider extends ContentProvider {
    /* access modifiers changed from: private */
    public static UriMatcher RemoteActionCompatParcelizer;
    /* access modifiers changed from: private */
    public static String asBinder = "scp.sso.provider";
    public static final onTransact read = new onTransact((DefaultConstructorMarker) null);
    @getCurrentContentInsetLeft
    public Gson gson;
    @getCurrentContentInsetLeft
    public getThumbTintMode repository;

    public final String getType(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "");
        return -1;
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            setThumbTextPadding.read read2 = new setThumbTextPadding.read((byte) 0);
            Intrinsics.checkNotNullExpressionValue(context, "");
            read2.read = new DataModule(context);
            if (read2.RemoteActionCompatParcelizer == null) {
                read2.RemoteActionCompatParcelizer = new BasicModule();
            }
            read.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(read2.read, DataModule.class);
            new setThumbTextPadding(read2.RemoteActionCompatParcelizer, read2.read, (byte) 0).RemoteActionCompatParcelizer(this);
        }
        ILoginSSOProvider iLoginSSOProvider = this;
        if (this.repository != null) {
            return true;
        }
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        MatrixCursor matrixCursor;
        Intrinsics.checkNotNullParameter(uri, "");
        onTransact ontransact = read;
        Context context = getContext();
        Intrinsics.onTransact((Object) context);
        Intrinsics.checkNotNullExpressionValue(context, "");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        ontransact.asBinder(packageName);
        try {
            UriMatcher uriMatcher = RemoteActionCompatParcelizer;
            Integer valueOf = uriMatcher != null ? Integer.valueOf(uriMatcher.match(uri)) : null;
            if (valueOf == null || valueOf.intValue() != 2) {
                matrixCursor = new MatrixCursor(new String[0]);
                return matrixCursor;
            }
            AsyncLayoutInflater.read read2 = new AsyncLayoutInflater.read();
            Context context2 = getContext();
            Intrinsics.onTransact((Object) context2);
            Intrinsics.checkNotNullExpressionValue(context2, "");
            read2.onTransact = context2.getPackageManager().getNameForUid(Binder.getCallingUid());
            AsyncLayoutInflater.read read3 = new AsyncLayoutInflater.read();
            read3.onTransact = onTransact((String) read2.onTransact);
            AsyncLayoutInflater.read read4 = new AsyncLayoutInflater.read();
            Context context3 = getContext();
            Intrinsics.onTransact((Object) context3);
            Intrinsics.checkNotNullExpressionValue(context3, "");
            String str3 = (String) read2.onTransact;
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Intrinsics.checkNotNullExpressionValue(instance, "");
            PackageManager packageManager = context3.getPackageManager();
            Intrinsics.onTransact((Object) str3);
            Signature signature = packageManager.getPackageInfo(str3, 64).signatures[0];
            Intrinsics.checkNotNullExpressionValue(signature, "");
            byte[] digest = instance.digest(signature.toByteArray());
            Intrinsics.checkNotNullExpressionValue(digest, "");
            Intrinsics.checkNotNullParameter(digest, "");
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            char[] cArr2 = new char[((digest.length * 3) - 1)];
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                byte b = digest[i] & 255;
                int i2 = i * 3;
                cArr2[i2] = cArr[b / 16];
                cArr2[i2 + 1] = cArr[b % 16];
                if (i < digest.length - 1) {
                    cArr2[i2 + 2] = ':';
                }
            }
            read4.onTransact = new String(cArr2);
            AsyncLayoutInflater.read read5 = new AsyncLayoutInflater.read();
            read5.onTransact = new MatrixCursor(new String[]{SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE, "auth_code_expiry", "code_verifier", "is_registered", "accounts"});
            RemoteActionCompatParcelizer.onTransact.onTransact((CoroutineContext) getCryptoObject.asBinder(), new read(this, strArr2, read2, read3, read4, read5, (TooltipCompatHandler) null));
            matrixCursor = (MatrixCursor) read5.onTransact;
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

    private final String onTransact(String str) {
        if (str != null) {
            try {
                Context context = getContext();
                Intrinsics.onTransact((Object) context);
                Intrinsics.checkNotNullExpressionValue(context, "");
                String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            } catch (Exception unused) {
            }
        }
        return "1.0";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
        r1 = r1.getPackageManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.net.Uri insert(android.net.Uri r7, android.content.ContentValues r8) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            com.scp.login.sso.provider.ILoginSSOProvider$onTransact r1 = read
            android.content.Context r2 = r6.getContext()
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            java.lang.String r2 = r2.getPackageName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.asBinder(r2)
            android.content.Context r1 = r6.getContext()
            r2 = 0
            if (r1 == 0) goto L_0x0031
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            if (r1 == 0) goto L_0x0031
            int r3 = android.os.Binder.getCallingUid()
            java.lang.String r1 = r1.getNameForUid(r3)
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            android.content.Context r3 = r6.getContext()
            kotlin.jvm.internal.Intrinsics.onTransact((java.lang.Object) r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.String r3 = r3.getPackageName()
            if (r8 == 0) goto L_0x00d1
            if (r1 == 0) goto L_0x00d1
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r4 = 1
            boolean r1 = o.BiometricFragment.AnonymousClass5.read((java.lang.CharSequence) r1, (java.lang.CharSequence) r3, (boolean) r4)
            if (r1 != r4) goto L_0x00d1
            android.content.UriMatcher r1 = RemoteActionCompatParcelizer
            if (r1 == 0) goto L_0x005f
            int r1 = r1.match(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x0060
        L_0x005f:
            r1 = r2
        L_0x0060:
            if (r1 == 0) goto L_0x0087
            int r3 = r1.intValue()
            r5 = 7
            if (r3 != r5) goto L_0x0087
            o.AsyncLayoutInflater$read r0 = new o.AsyncLayoutInflater$read
            r0.<init>()
            java.lang.String r1 = "profile_accessToken"
            java.lang.String r8 = r8.getAsString(r1)
            r0.onTransact = r8
            o.BiometricManager$Api30Impl r8 = o.getCryptoObject.asBinder()
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.scp.login.sso.provider.ILoginSSOProvider$asBinder r1 = new com.scp.login.sso.provider.ILoginSSOProvider$asBinder
            r1.<init>(r6, r0, r2)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            o.RemoteActionCompatParcelizer.onTransact.onTransact((kotlin.coroutines.CoroutineContext) r8, r1)
            goto L_0x00d1
        L_0x0087:
            if (r1 == 0) goto L_0x00d1
            int r1 = r1.intValue()
            r3 = 5
            if (r1 != r3) goto L_0x00d1
            java.lang.String r1 = "profile_AUTHDATA"
            java.lang.String r8 = r8.getAsString(r1)
            r1 = r8
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x00a3
            boolean r1 = o.BiometricFragment.AnonymousClass5.asBinder(r1)
            if (r1 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            if (r4 != 0) goto L_0x00d1
            o.AsyncLayoutInflater$read r1 = new o.AsyncLayoutInflater$read
            r1.<init>()
            com.google.gson.Gson r3 = r6.gson
            if (r3 != 0) goto L_0x00b1
            kotlin.jvm.internal.Intrinsics.asBinder(r0)
        L_0x00b1:
            java.lang.Class<o.getSplitTrack> r0 = o.getSplitTrack.class
            java.lang.Object r8 = r3.read((java.lang.String) r8, r0)
            o.getSplitTrack r8 = (o.getSplitTrack) r8
            r1.onTransact = r8
            T r8 = r1.onTransact
            o.getSplitTrack r8 = (o.getSplitTrack) r8
            if (r8 == 0) goto L_0x00d1
            o.BiometricManager$Api30Impl r8 = o.getCryptoObject.asBinder()
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            com.scp.login.sso.provider.ILoginSSOProvider$asInterface r0 = new com.scp.login.sso.provider.ILoginSSOProvider$asInterface
            r0.<init>(r6, r1, r2)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            o.RemoteActionCompatParcelizer.onTransact.onTransact((kotlin.coroutines.CoroutineContext) r8, r0)
        L_0x00d1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scp.login.sso.provider.ILoginSSOProvider.insert(android.net.Uri, android.content.ContentValues):android.net.Uri");
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "");
        onTransact ontransact = read;
        Context context = getContext();
        Intrinsics.onTransact((Object) context);
        Intrinsics.checkNotNullExpressionValue(context, "");
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        ontransact.asBinder(packageName);
        UriMatcher uriMatcher = RemoteActionCompatParcelizer;
        if (uriMatcher == null || uriMatcher.match(uri) != 8) {
            return 0;
        }
        RemoteActionCompatParcelizer.onTransact.onTransact((CoroutineContext) getCryptoObject.asBinder(), new RemoteActionCompatParcelizer(this, (TooltipCompatHandler) null));
        return 0;
    }

    public static final class onTransact {
        private onTransact() {
        }

        public /* synthetic */ onTransact(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void asBinder(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('.');
            onTransact ontransact = this;
            sb.append(ILoginSSOProvider.asBinder);
            String obj = sb.toString();
            UriMatcher uriMatcher = new UriMatcher(-1);
            uriMatcher.addURI(obj, "sso_accounts", 2);
            uriMatcher.addURI(obj, "save_authdata", 5);
            uriMatcher.addURI(obj, "save_access_token", 7);
            uriMatcher.addURI(obj, "delete_access_token", 8);
            Unit unit = Unit.asInterface;
            ILoginSSOProvider.RemoteActionCompatParcelizer = uriMatcher;
        }
    }

    static final class RemoteActionCompatParcelizer extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ ILoginSSOProvider onTransact;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(ILoginSSOProvider iLoginSSOProvider, TooltipCompatHandler tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.onTransact = iLoginSSOProvider;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            Intrinsics.checkNotNullParameter(tooltipCompatHandler, "");
            return new RemoteActionCompatParcelizer(this.onTransact, tooltipCompatHandler);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((RemoteActionCompatParcelizer) create(obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
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
                getThumbTintMode getthumbtintmode = this.onTransact.repository;
                if (getthumbtintmode == null) {
                    Intrinsics.asBinder("");
                }
                this.RemoteActionCompatParcelizer = 1;
                if (getthumbtintmode.RemoteActionCompatParcelizer(this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            return Unit.asInterface;
        }
    }

    static final class asBinder extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private /* synthetic */ AsyncLayoutInflater.read asBinder;
        private /* synthetic */ ILoginSSOProvider asInterface;
        private int read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        asBinder(ILoginSSOProvider iLoginSSOProvider, AsyncLayoutInflater.read read2, TooltipCompatHandler tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.asInterface = iLoginSSOProvider;
            this.asBinder = read2;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            Intrinsics.checkNotNullParameter(tooltipCompatHandler, "");
            return new asBinder(this.asInterface, this.asBinder, tooltipCompatHandler);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((asBinder) create(obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            int i = this.read;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                    throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                }
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                getThumbTintMode getthumbtintmode = this.asInterface.repository;
                if (getthumbtintmode == null) {
                    Intrinsics.asBinder("");
                }
                String str = (String) this.asBinder.onTransact;
                Intrinsics.checkNotNullExpressionValue(str, "");
                this.read = 1;
                if (getthumbtintmode.RemoteActionCompatParcelizer(str, this) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            return Unit.asInterface;
        }
    }

    static final class asInterface extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private /* synthetic */ AsyncLayoutInflater.read asInterface;
        private /* synthetic */ ILoginSSOProvider onTransact;
        private int read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        asInterface(ILoginSSOProvider iLoginSSOProvider, AsyncLayoutInflater.read read2, TooltipCompatHandler tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.onTransact = iLoginSSOProvider;
            this.asInterface = read2;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            Intrinsics.checkNotNullParameter(tooltipCompatHandler, "");
            return new asInterface(this.onTransact, this.asInterface, tooltipCompatHandler);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((asInterface) create(obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        public final Object invokeSuspend(Object obj) {
            TooltipCompatHandler$$ExternalSyntheticLambda1 tooltipCompatHandler$$ExternalSyntheticLambda1 = TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED;
            int i = this.read;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else if (obj instanceof setContentInsetsAbsolute.onTransact) {
                    throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
                }
            } else if (!(obj instanceof setContentInsetsAbsolute.onTransact)) {
                getThumbTintMode getthumbtintmode = this.onTransact.repository;
                if (getthumbtintmode == null) {
                    Intrinsics.asBinder("");
                }
                this.read = 1;
                if (getthumbtintmode.read((getSplitTrack) this.asInterface.onTransact) == tooltipCompatHandler$$ExternalSyntheticLambda1) {
                    return tooltipCompatHandler$$ExternalSyntheticLambda1;
                }
            } else {
                throw ((setContentInsetsAbsolute.onTransact) obj).RemoteActionCompatParcelizer;
            }
            return Unit.asInterface;
        }
    }

    static final class read extends getLayoutResource implements Function2<BiometricManager.Authenticators, TooltipCompatHandler<? super Unit>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ ILoginSSOProvider IconCompatParcelizer;
        private /* synthetic */ AsyncLayoutInflater.read RemoteActionCompatParcelizer;
        private /* synthetic */ AsyncLayoutInflater.read asBinder;
        private /* synthetic */ AsyncLayoutInflater.read asInterface;
        private /* synthetic */ String[] onTransact;
        private /* synthetic */ AsyncLayoutInflater.read read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(ILoginSSOProvider iLoginSSOProvider, String[] strArr, AsyncLayoutInflater.read read2, AsyncLayoutInflater.read read3, AsyncLayoutInflater.read read4, AsyncLayoutInflater.read read5, TooltipCompatHandler tooltipCompatHandler) {
            super(2, tooltipCompatHandler);
            this.IconCompatParcelizer = iLoginSSOProvider;
            this.onTransact = strArr;
            this.read = read2;
            this.RemoteActionCompatParcelizer = read3;
            this.asBinder = read4;
            this.asInterface = read5;
        }

        public final TooltipCompatHandler<Unit> create(Object obj, TooltipCompatHandler<?> tooltipCompatHandler) {
            Intrinsics.checkNotNullParameter(tooltipCompatHandler, "");
            return new read(this.IconCompatParcelizer, this.onTransact, this.read, this.RemoteActionCompatParcelizer, this.asBinder, this.asInterface, tooltipCompatHandler);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((read) create(obj, (TooltipCompatHandler) obj2)).invokeSuspend(Unit.asInterface);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0083  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x011a  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0163  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r0 = r22
                r1 = r23
                o.TooltipCompatHandler$$ExternalSyntheticLambda1 r2 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
                int r3 = r0.AudioAttributesImplApi26Parcelizer
                r4 = 3
                r5 = 0
                r6 = 2
                r7 = 1
                java.lang.String r8 = ""
                if (r3 == 0) goto L_0x0047
                if (r3 == r7) goto L_0x003d
                if (r3 == r6) goto L_0x002f
                if (r3 != r4) goto L_0x0027
                boolean r2 = r0.AudioAttributesImplApi21Parcelizer
                java.lang.Object r3 = r0.AudioAttributesCompatParcelizer
                o.SwitchCompat$EmojiCompatInitCallback r3 = (o.SwitchCompat.EmojiCompatInitCallback) r3
                boolean r9 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r9 != 0) goto L_0x0022
                goto L_0x010c
            L_0x0022:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            L_0x0027:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002f:
                java.lang.Object r3 = r0.AudioAttributesCompatParcelizer
                o.getSplitTrack r3 = (o.getSplitTrack) r3
                boolean r9 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r9 != 0) goto L_0x0038
                goto L_0x0076
            L_0x0038:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            L_0x003d:
                boolean r3 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r3 != 0) goto L_0x0042
                goto L_0x005d
            L_0x0042:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            L_0x0047:
                boolean r3 = r1 instanceof o.setContentInsetsAbsolute.onTransact
                if (r3 != 0) goto L_0x0177
                com.scp.login.sso.provider.ILoginSSOProvider r1 = r0.IconCompatParcelizer
                o.getThumbTintMode r1 = r1.repository
                if (r1 != 0) goto L_0x0054
                kotlin.jvm.internal.Intrinsics.asBinder(r8)
            L_0x0054:
                r0.AudioAttributesImplApi26Parcelizer = r7
                java.lang.Object r1 = r1.onTransact()
                if (r1 != r2) goto L_0x005d
                return r2
            L_0x005d:
                r3 = r1
                o.getSplitTrack r3 = (o.getSplitTrack) r3
                if (r3 == 0) goto L_0x016d
                com.scp.login.sso.provider.ILoginSSOProvider r1 = r0.IconCompatParcelizer
                r0.AudioAttributesCompatParcelizer = r3
                r0.AudioAttributesImplApi26Parcelizer = r6
                o.getThumbTintMode r1 = r1.repository
                if (r1 != 0) goto L_0x006f
                kotlin.jvm.internal.Intrinsics.asBinder(r8)
            L_0x006f:
                java.lang.Object r1 = r1.read((o.TooltipCompatHandler<? super java.lang.String>) r0)
                if (r1 != r2) goto L_0x0076
                return r2
            L_0x0076:
                java.lang.String r1 = (java.lang.String) r1
                o.onInitialized r9 = o.onInitialized.asInterface
                o.SwitchCompat$EmojiCompatInitCallback r9 = o.onInitialized.asBinder()
                java.lang.String[] r10 = r0.onTransact
                r11 = 0
                if (r10 == 0) goto L_0x0086
                r10 = r10[r7]
                goto L_0x0087
            L_0x0086:
                r10 = r11
            L_0x0087:
                if (r10 != 0) goto L_0x008a
                r10 = r8
            L_0x008a:
                java.lang.CharSequence r10 = (java.lang.CharSequence) r10
                int r12 = r10.length()
                if (r12 != 0) goto L_0x0094
                r12 = 1
                goto L_0x0095
            L_0x0094:
                r12 = 0
            L_0x0095:
                if (r12 != 0) goto L_0x0163
                java.lang.String r10 = (java.lang.String) r10
                o.AsyncLayoutInflater$read r12 = r0.read
                T r12 = r12.onTransact
                java.lang.String r12 = (java.lang.String) r12
                if (r12 != 0) goto L_0x00a2
                r12 = r8
            L_0x00a2:
                o.AsyncLayoutInflater$read r13 = r0.RemoteActionCompatParcelizer
                T r13 = r13.onTransact
                java.lang.String r13 = (java.lang.String) r13
                o.setSplitTrack r14 = new o.setSplitTrack
                r14.<init>(r1, r12, r13, r10)
                java.lang.String[] r1 = r0.onTransact
                if (r1 == 0) goto L_0x00b4
                r1 = r1[r5]
                goto L_0x00b5
            L_0x00b4:
                r1 = r11
            L_0x00b5:
                if (r1 != 0) goto L_0x00b8
                r1 = r8
            L_0x00b8:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                int r10 = r1.length()
                if (r10 != 0) goto L_0x00c2
                r10 = 1
                goto L_0x00c3
            L_0x00c2:
                r10 = 0
            L_0x00c3:
                if (r10 != 0) goto L_0x0159
                r20 = r1
                java.lang.String r20 = (java.lang.String) r20
                java.lang.String[] r1 = r0.onTransact
                if (r1 == 0) goto L_0x00cf
                r11 = r1[r6]
            L_0x00cf:
                boolean r1 = java.lang.Boolean.parseBoolean(r11)
                o.AsyncLayoutInflater$read r10 = r0.asBinder
                T r10 = r10.onTransact
                r16 = r10
                java.lang.String r16 = (java.lang.String) r16
                java.lang.String r10 = r3.RemoteActionCompatParcelizer
                java.lang.String r11 = r3.asInterface
                java.lang.String r12 = r9.read
                java.lang.String r3 = r3.asBinder
                o.setTextOff r13 = new o.setTextOff
                r15 = r13
                r17 = r10
                r18 = r11
                r19 = r12
                r21 = r3
                r15.<init>(r16, r17, r18, r19, r20, r21)
                com.scp.login.sso.provider.ILoginSSOProvider r3 = r0.IconCompatParcelizer
                o.getThumbTintMode r3 = r3.repository
                if (r3 != 0) goto L_0x00fa
                kotlin.jvm.internal.Intrinsics.asBinder(r8)
            L_0x00fa:
                o.setSubMenu$read r14 = (o.setSubMenu.read) r14
                r0.AudioAttributesCompatParcelizer = r9
                r0.AudioAttributesImplApi21Parcelizer = r1
                r0.AudioAttributesImplApi26Parcelizer = r4
                java.lang.Object r3 = r3.asInterface(r13, r14, r0)
                if (r3 != r2) goto L_0x0109
                return r2
            L_0x0109:
                r2 = r1
                r1 = r3
                r3 = r9
            L_0x010c:
                o.setEnforceSwitchWidth r1 = (o.setEnforceSwitchWidth) r1
                if (r2 != 0) goto L_0x0114
                boolean r2 = r1.RemoteActionCompatParcelizer
                if (r2 == 0) goto L_0x0156
            L_0x0114:
                com.scp.login.sso.provider.ILoginSSOProvider r2 = r0.IconCompatParcelizer
                com.google.gson.Gson r2 = r2.gson
                if (r2 != 0) goto L_0x011d
                kotlin.jvm.internal.Intrinsics.asBinder(r8)
            L_0x011d:
                java.util.List<o.setThumbTintList$asInterface> r9 = r1.read
                if (r9 != 0) goto L_0x0128
                o.hasFocus r9 = o.hasFocus.asInterface
                java.lang.String r2 = r2.RemoteActionCompatParcelizer((o.hasWindowFocus) r9)
                goto L_0x0130
            L_0x0128:
                java.lang.Class r10 = r9.getClass()
                java.lang.String r2 = r2.read((java.lang.Object) r9, (java.lang.reflect.Type) r10)
            L_0x0130:
                if (r2 == 0) goto L_0x0133
                r8 = r2
            L_0x0133:
                o.AsyncLayoutInflater$read r2 = r0.asInterface
                T r2 = r2.onTransact
                android.database.MatrixCursor r2 = (android.database.MatrixCursor) r2
                r9 = 5
                java.lang.Object[] r9 = new java.lang.Object[r9]
                java.lang.String r10 = r1.onTransact
                r9[r5] = r10
                java.lang.String r5 = r1.asInterface
                r9[r7] = r5
                java.lang.String r3 = r3.onTransact
                r9[r6] = r3
                boolean r1 = r1.RemoteActionCompatParcelizer
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r9[r4] = r1
                r1 = 4
                r9[r1] = r8
                r2.addRow(r9)
            L_0x0156:
                kotlin.Unit r1 = kotlin.Unit.asInterface
                return r1
            L_0x0159:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Client device id is empty"
                r1.<init>(r2)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x0163:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Transaction id is empty"
                r1.<init>(r2)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x016d:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Auth Data not saved"
                r1.<init>(r2)
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                throw r1
            L_0x0177:
                o.setContentInsetsAbsolute$onTransact r1 = (o.setContentInsetsAbsolute.onTransact) r1
                java.lang.Throwable r1 = r1.RemoteActionCompatParcelizer
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scp.login.sso.provider.ILoginSSOProvider.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
