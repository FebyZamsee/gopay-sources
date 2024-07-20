import java.security.MessageDigest;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;

public class SignatureExample {
    private static final String DEFAULT_PACKAGE_NAME = "com.gojek.gopay"; // Default package name

    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Command-line argument for package name must be provided");
            }
            String nameForUid = args[0]; // Use the first command-line argument for nameForUid
            String result = query("https://api.gojekapi.com/v7/customers/signup", nameForUid);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String read(String str) {
        if (str != null) {
            try {
                Context context = InstrumentationRegistry.getContext();
                String versionName = context.getPackageManager().getPackageInfo(str, 0).versionName;
                return versionName;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "1.0";
    }

    public static String query(String uriString, String nameForUid) throws Exception {
        Uri uri = Uri.parse(uriString);
        Context context = InstrumentationRegistry.getContext();
        String packageName = DEFAULT_PACKAGE_NAME; // Use default package name

        // Retrieve version and signature for the package
        // String readVersion = read(nameForUid);

        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(nameForUid, 64);
        Signature signature = packageInfo.signatures[0];
        byte[] digest = instance.digest(signature.toByteArray());

        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(digest.length * 3) - 1];
        int length = digest.length - 1;

        for (int i = 0; i <= length; i++) {
            byte b = digest[i];
            cArr2[i * 3] = cArr[(b >> 4) & 0x0F];
            cArr2[i * 3 + 1] = cArr[b & 0x0F];
            if (i < length) {
                cArr2[i * 3 + 2] = ':';
            }
        }

        return new String(cArr2);
    }
}
