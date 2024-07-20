package com.google.firebase.sessions;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import o.cancelAuthentication;

public final class SessionDataStoreConfigs {
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();
    private static final String PROCESS_NAME;
    private static final String SESSIONS_CONFIG_NAME;
    private static final String SETTINGS_CONFIG_NAME;

    private SessionDataStoreConfigs() {
    }

    static {
        String processName$com_google_firebase_firebase_sessions = ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
        Intrinsics.checkNotNullParameter(processName$com_google_firebase_firebase_sessions, "");
        byte[] bytes = processName$com_google_firebase_firebase_sessions.getBytes(cancelAuthentication.onTransact);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String encodeToString = Base64.encodeToString(bytes, 10);
        PROCESS_NAME = encodeToString;
        StringBuilder sb = new StringBuilder("firebase_session_");
        sb.append(encodeToString);
        sb.append("_data");
        SESSIONS_CONFIG_NAME = sb.toString();
        StringBuilder sb2 = new StringBuilder("firebase_session_");
        sb2.append(encodeToString);
        sb2.append("_settings");
        SETTINGS_CONFIG_NAME = sb2.toString();
    }

    public final String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    public final String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}
