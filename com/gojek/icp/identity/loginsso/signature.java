
public class signature  
{  
public static void main(String args[])  
{  
    // private final String read(String str) {
    //     if (str != null) {
    //         try {
    //             Context context = getContext();
    //             // Intrinsics.onTransact((Object) context);
    //             String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
    //             // Intrinsics.checkNotNullExpressionValue(str2, "");
    //             return str2;
    //         } catch (Exception unused) {
    //         }
    //     }
    //     return "1.0";
    // }
    // public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Uri uri = 'https://api.gojekapi.com/v7/customers/signup'; // contoh
        // MatrixCursor matrixCursor;
        // Intrinsics.checkNotNullParameter(uri, "");
        Context context = getContext();
        // Intrinsics.onTransact((Object) context);
        String packageName = "com.gojek.gopay" // context.getPackageName();
        // Intrinsics.checkNotNullExpressionValue(packageName, "");
        // asBinder.asBinder(packageName);
        // try {
            // UriMatcher uriMatcher = read;
            // Integer valueOf = uriMatcher == null ? null : Integer.valueOf(uriMatcher.match(uri));
            // if (valueOf == null || valueOf.intValue() != 2) {
            //     matrixCursor = new MatrixCursor((String[]) ((Object[]) new String[0]));
            //     return matrixCursor;
            // }
            Context context2 = getContext();
            // Intrinsics.onTransact((Object) context2);
            String nameForUid = args[0] //context2.getPackageManager().getNameForUid(Binder.getCallingUid());  // Location -> com\google\android\gms\common\wrappers\PackageManagerWrapper.java
            String read2 = read(nameForUid);
            Context context3 = getContext();
            // Intrinsics.onTransact((Object) context3);
            // Intrinsics.checkNotNullExpressionValue(context3, "");
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            // Intrinsics.checkNotNullExpressionValue(instance, "");
            Signature signature = context3.getPackageManager().getPackageInfo(nameForUid, 64).signatures[0];
            // Intrinsics.checkNotNullExpressionValue(signature, "");
            byte[] digest = instance.digest(signature.toByteArray());
            // Intrinsics.checkNotNullExpressionValue(digest, "");
            // Intrinsics.checkNotNullParameter(digest, "");
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
            return sr3;
            // matrixCursor = new MatrixCursor(new String[]{"access_token", SaveAccountLinkingTokenRequest.TOKEN_TYPE_AUTH_CODE, "auth_code_expiry", "code_verifier", Scopes.PROFILE});
            // RemoteActionCompatParcelizer.onTransact.onTransact((CoroutineContext) getCryptoObject.asBinder(), new onTransact(this, nameForUid, read2, str3, matrixCursor, (TooltipCompatHandler<? super onTransact>) null));
            // return matrixCursor;
        // } catch (Exception e) {
        //     MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"error"});
        //     String[] strArr3 = new String[1];
        //     String message = e.getMessage();
        //     if (message == null) {
        //         message = "Unknown Error";
        //     }
        //     strArr3[0] = message;
        //     matrixCursor2.addRow(strArr3);
        //     matrixCursor = matrixCursor2;
        // }
    // }
}  
}