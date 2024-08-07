package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;

public class LogFileManager {
    private static final NoopLogStore NOOP_LOG_STORE = new NoopLogStore();
    private FileLogStore currentLog;
    private final FileStore fileStore;

    public LogFileManager(FileStore fileStore2) {
        this.fileStore = fileStore2;
        this.currentLog = NOOP_LOG_STORE;
    }

    public LogFileManager(FileStore fileStore2, String str) {
        this(fileStore2);
        setCurrentSession(str);
    }

    public final void setCurrentSession(String str) {
        this.currentLog.closeLogFile();
        this.currentLog = NOOP_LOG_STORE;
        if (str != null) {
            setLogFile(getWorkingFileForSession(str), 65536);
        }
    }

    public void writeToLog(long j, String str) {
        this.currentLog.writeToLog(j, str);
    }

    public byte[] getBytesForLog() {
        return this.currentLog.getLogAsBytes();
    }

    public String getLogString() {
        return this.currentLog.getLogAsString();
    }

    public void clearLog() {
        this.currentLog.deleteLogFile();
    }

    /* access modifiers changed from: package-private */
    public void setLogFile(File file, int i) {
        this.currentLog = new QueueFileLogStore(file, i);
    }

    private File getWorkingFileForSession(String str) {
        return this.fileStore.getSessionFile(str, "userlog");
    }

    static final class NoopLogStore implements FileLogStore {
        public final void closeLogFile() {
        }

        public final void deleteLogFile() {
        }

        public final byte[] getLogAsBytes() {
            return null;
        }

        public final String getLogAsString() {
            return null;
        }

        public final void writeToLog(long j, String str) {
        }

        private NoopLogStore() {
        }
    }
}
