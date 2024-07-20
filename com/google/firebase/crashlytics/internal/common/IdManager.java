package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.InstallIdProvider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

public class IdManager implements InstallIdProvider {
    private static final String FORWARD_SLASH_REGEX = Pattern.quote("/");
    private static final Pattern ID_PATTERN = Pattern.compile("[^\\p{Alnum}]");
    private final Context appContext;
    private final String appIdentifier;
    private final DataCollectionArbiter dataCollectionArbiter;
    private final FirebaseInstallationsApi firebaseInstallationsApi;
    private InstallIdProvider.InstallIds installIds;
    private final InstallerPackageNameProvider installerPackageNameProvider;

    public IdManager(Context context, String str, FirebaseInstallationsApi firebaseInstallationsApi2, DataCollectionArbiter dataCollectionArbiter2) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str != null) {
            this.appContext = context;
            this.appIdentifier = str;
            this.firebaseInstallationsApi = firebaseInstallationsApi2;
            this.dataCollectionArbiter = dataCollectionArbiter2;
            this.installerPackageNameProvider = new InstallerPackageNameProvider();
        } else {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
    }

    private static String formatId(String str) {
        if (str == null) {
            return null;
        }
        return ID_PATTERN.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public InstallIdProvider.InstallIds getInstallIds() {
        synchronized (this) {
            if (!shouldRefresh()) {
                InstallIdProvider.InstallIds installIds2 = this.installIds;
                return installIds2;
            }
            Logger.getLogger().v("Determining Crashlytics installation ID...");
            SharedPreferences sharedPrefs = CommonUtils.getSharedPrefs(this.appContext);
            String string = sharedPrefs.getString("firebase.installation.id", (String) null);
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Cached Firebase Installation ID: ");
            sb.append(string);
            logger.v(sb.toString());
            if (this.dataCollectionArbiter.isAutomaticDataCollectionEnabled()) {
                String fetchTrueFid = fetchTrueFid();
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder("Fetched Firebase Installation ID: ");
                sb2.append(fetchTrueFid);
                logger2.v(sb2.toString());
                if (fetchTrueFid == null) {
                    fetchTrueFid = string == null ? createSyntheticFid() : string;
                }
                if (fetchTrueFid.equals(string)) {
                    this.installIds = InstallIdProvider.InstallIds.create(readCachedCrashlyticsInstallId(sharedPrefs), fetchTrueFid);
                } else {
                    this.installIds = InstallIdProvider.InstallIds.create(createAndCacheCrashlyticsInstallId(fetchTrueFid, sharedPrefs), fetchTrueFid);
                }
            } else if (isSyntheticFid(string)) {
                this.installIds = InstallIdProvider.InstallIds.createWithoutFid(readCachedCrashlyticsInstallId(sharedPrefs));
            } else {
                this.installIds = InstallIdProvider.InstallIds.createWithoutFid(createAndCacheCrashlyticsInstallId(createSyntheticFid(), sharedPrefs));
            }
            Logger logger3 = Logger.getLogger();
            StringBuilder sb3 = new StringBuilder("Install IDs: ");
            sb3.append(this.installIds);
            logger3.v(sb3.toString());
            InstallIdProvider.InstallIds installIds3 = this.installIds;
            return installIds3;
        }
    }

    private boolean shouldRefresh() {
        InstallIdProvider.InstallIds installIds2 = this.installIds;
        return installIds2 == null || (installIds2.getFirebaseInstallationId() == null && this.dataCollectionArbiter.isAutomaticDataCollectionEnabled());
    }

    static String createSyntheticFid() {
        StringBuilder sb = new StringBuilder("SYN_");
        sb.append(UUID.randomUUID().toString());
        return sb.toString();
    }

    static boolean isSyntheticFid(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String readCachedCrashlyticsInstallId(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", (String) null);
    }

    public String fetchTrueFid() {
        try {
            return (String) Utils.awaitEvenIfOnMainThread(this.firebaseInstallationsApi.getId());
        } catch (Exception e) {
            Logger.getLogger().w("Failed to retrieve Firebase Installation ID.", e);
            return null;
        }
    }

    private String createAndCacheCrashlyticsInstallId(String str, SharedPreferences sharedPreferences) {
        String formatId;
        synchronized (this) {
            formatId = formatId(UUID.randomUUID().toString());
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Created new Crashlytics installation ID: ");
            sb.append(formatId);
            sb.append(" for FID: ");
            sb.append(str);
            logger.v(sb.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", formatId).putString("firebase.installation.id", str).apply();
        }
        return formatId;
    }

    public String getAppIdentifier() {
        return this.appIdentifier;
    }

    public String getOsDisplayVersionString() {
        return removeForwardSlashesIn(Build.VERSION.RELEASE);
    }

    public String getOsBuildVersionString() {
        return removeForwardSlashesIn(Build.VERSION.INCREMENTAL);
    }

    public String getModelName() {
        return String.format(Locale.US, "%s/%s", new Object[]{removeForwardSlashesIn(Build.MANUFACTURER), removeForwardSlashesIn(Build.MODEL)});
    }

    private String removeForwardSlashesIn(String str) {
        return str.replaceAll(FORWARD_SLASH_REGEX, "");
    }

    public String getInstallerPackageName() {
        return this.installerPackageNameProvider.getInstallerPackageName(this.appContext);
    }
}
