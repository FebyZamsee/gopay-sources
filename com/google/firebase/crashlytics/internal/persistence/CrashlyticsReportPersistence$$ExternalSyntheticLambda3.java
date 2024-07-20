package com.google.firebase.crashlytics.internal.persistence;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;

public final /* synthetic */ class CrashlyticsReportPersistence$$ExternalSyntheticLambda3 implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }
}
