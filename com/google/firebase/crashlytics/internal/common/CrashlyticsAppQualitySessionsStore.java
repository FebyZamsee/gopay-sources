package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class CrashlyticsAppQualitySessionsStore {
    private static final FilenameFilter AQS_SESSION_ID_FILE_FILTER = new CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda0();
    private static final Comparator<File> FILE_RECENCY_COMPARATOR = new CrashlyticsAppQualitySessionsStore$$ExternalSyntheticLambda1();
    private String appQualitySessionId = null;
    private final FileStore fileStore;
    private String sessionId = null;

    CrashlyticsAppQualitySessionsStore(FileStore fileStore2) {
        this.fileStore = fileStore2;
    }

    public String getAppQualitySessionId(String str) {
        synchronized (this) {
            if (Objects.equals(this.sessionId, str)) {
                String str2 = this.appQualitySessionId;
                return str2;
            }
            String readAqsSessionIdFile = readAqsSessionIdFile(this.fileStore, str);
            return readAqsSessionIdFile;
        }
    }

    public void rotateAppQualitySessionId(String str) {
        synchronized (this) {
            if (!Objects.equals(this.appQualitySessionId, str)) {
                persist(this.fileStore, this.sessionId, str);
                this.appQualitySessionId = str;
            }
        }
    }

    public void rotateSessionId(String str) {
        synchronized (this) {
            if (!Objects.equals(this.sessionId, str)) {
                persist(this.fileStore, str, this.appQualitySessionId);
                this.sessionId = str;
            }
        }
    }

    private static void persist(FileStore fileStore2, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                StringBuilder sb = new StringBuilder("aqs.");
                sb.append(str2);
                fileStore2.getSessionFile(str, sb.toString()).createNewFile();
            } catch (IOException e) {
                Logger.getLogger().w("Failed to persist App Quality Sessions session id.", e);
            }
        }
    }

    static String readAqsSessionIdFile(FileStore fileStore2, String str) {
        List<File> sessionFiles = fileStore2.getSessionFiles(str, AQS_SESSION_ID_FILE_FILTER);
        if (!sessionFiles.isEmpty()) {
            return ((File) Collections.min(sessionFiles, FILE_RECENCY_COMPARATOR)).getName().substring(4);
        }
        Logger.getLogger().w("Unable to read App Quality Sessions session id.");
        return null;
    }
}
