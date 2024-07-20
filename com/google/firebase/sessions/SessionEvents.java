package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.test.internal.runner.tracker.UsageTrackerRegistry;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class SessionEvents {
    public static final SessionEvents INSTANCE = new SessionEvents();
    private static final DataEncoder SESSION_EVENT_ENCODER;

    private SessionEvents() {
    }

    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }

    static {
        DataEncoder build = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        Intrinsics.checkNotNullExpressionValue(build, "");
        SESSION_EVENT_ENCODER = build;
    }

    public final SessionEvent buildSession(FirebaseApp firebaseApp, SessionDetails sessionDetails, SessionsSettings sessionsSettings, ProcessDetails processDetails, List<ProcessDetails> list, Map<SessionSubscriber.Name, ? extends SessionSubscriber> map, String str) {
        Intrinsics.checkNotNullParameter(firebaseApp, "");
        Intrinsics.checkNotNullParameter(sessionDetails, "");
        Intrinsics.checkNotNullParameter(sessionsSettings, "");
        Intrinsics.checkNotNullParameter(processDetails, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(toDataCollectionState((SessionSubscriber) map.get(SessionSubscriber.Name.PERFORMANCE)), toDataCollectionState((SessionSubscriber) map.get(SessionSubscriber.Name.CRASHLYTICS)), sessionsSettings.getSamplingRate()), str), getApplicationInfo(firebaseApp));
    }

    public final ApplicationInfo getApplicationInfo(FirebaseApp firebaseApp) {
        String str;
        Intrinsics.checkNotNullParameter(firebaseApp, "");
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            str = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            str = String.valueOf(packageInfo.versionCode);
        }
        String str2 = str;
        String applicationId = firebaseApp.getOptions().getApplicationId();
        Intrinsics.checkNotNullExpressionValue(applicationId, "");
        String str3 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        String str4 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String str5 = packageInfo.versionName;
        String str6 = str5 == null ? str2 : str5;
        String str7 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str7, "");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext2);
        ProcessDetailsProvider processDetailsProvider2 = ProcessDetailsProvider.INSTANCE;
        Context applicationContext3 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
        return new ApplicationInfo(applicationId, str3, UsageTrackerRegistry.AxtVersions.RUNNER_VERSION, str4, logEnvironment, new AndroidApplicationInfo(packageName, str6, str2, str7, currentProcessDetails, processDetailsProvider2.getAppProcessDetails(applicationContext3)));
    }

    private final DataCollectionState toDataCollectionState(SessionSubscriber sessionSubscriber) {
        if (sessionSubscriber == null) {
            return DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        }
        if (sessionSubscriber.isDataCollectionEnabled()) {
            return DataCollectionState.COLLECTION_ENABLED;
        }
        return DataCollectionState.COLLECTION_DISABLED;
    }
}
