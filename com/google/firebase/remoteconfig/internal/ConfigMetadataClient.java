package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigInfo;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import java.util.Date;

public class ConfigMetadataClient {
    static final Date LAST_FETCH_TIME_NO_FETCH_YET = new Date(-1);
    static final Date NO_BACKOFF_TIME = new Date(-1);
    private final Object backoffMetadataLock = new Object();
    private final Object frcInfoLock = new Object();
    private final SharedPreferences frcMetadata;
    private final Object realtimeBackoffMetadataLock = new Object();

    public ConfigMetadataClient(SharedPreferences sharedPreferences) {
        this.frcMetadata = sharedPreferences;
    }

    public long getFetchTimeoutInSeconds() {
        return this.frcMetadata.getLong("fetch_timeout_in_seconds", 60);
    }

    public long getMinimumFetchIntervalInSeconds() {
        return this.frcMetadata.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS);
    }

    /* access modifiers changed from: package-private */
    public Date getLastSuccessfulFetchTime() {
        return new Date(this.frcMetadata.getLong("last_fetch_time_in_millis", -1));
    }

    /* access modifiers changed from: package-private */
    public String getLastFetchETag() {
        return this.frcMetadata.getString("last_fetch_etag", (String) null);
    }

    /* access modifiers changed from: package-private */
    public long getLastTemplateVersion() {
        return this.frcMetadata.getLong("last_template_version", 0);
    }

    public FirebaseRemoteConfigInfo getInfo() {
        FirebaseRemoteConfigInfoImpl build;
        synchronized (this.frcInfoLock) {
            long j = this.frcMetadata.getLong("last_fetch_time_in_millis", -1);
            int i = this.frcMetadata.getInt("last_fetch_status", 0);
            build = FirebaseRemoteConfigInfoImpl.newBuilder().withLastFetchStatus(i).withLastSuccessfulFetchTimeInMillis(j).withConfigSettings(new FirebaseRemoteConfigSettings.Builder().setFetchTimeoutInSeconds(this.frcMetadata.getLong("fetch_timeout_in_seconds", 60)).setMinimumFetchIntervalInSeconds(this.frcMetadata.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS)).build()).build();
        }
        return build;
    }

    public void setConfigSettings(FirebaseRemoteConfigSettings firebaseRemoteConfigSettings) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putLong("fetch_timeout_in_seconds", firebaseRemoteConfigSettings.getFetchTimeoutInSeconds()).putLong("minimum_fetch_interval_in_seconds", firebaseRemoteConfigSettings.getMinimumFetchIntervalInSeconds()).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLastFetchAsSuccessfulAt(Date date) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLastFetchAsFailed() {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void updateLastFetchAsThrottled() {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putInt("last_fetch_status", 2).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void setLastFetchETag(String str) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putString("last_fetch_etag", str).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void setLastTemplateVersion(long j) {
        synchronized (this.frcInfoLock) {
            this.frcMetadata.edit().putLong("last_template_version", j).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public BackoffMetadata getBackoffMetadata() {
        BackoffMetadata backoffMetadata;
        synchronized (this.backoffMetadataLock) {
            backoffMetadata = new BackoffMetadata(this.frcMetadata.getInt("num_failed_fetches", 0), new Date(this.frcMetadata.getLong("backoff_end_time_in_millis", -1)));
        }
        return backoffMetadata;
    }

    /* access modifiers changed from: package-private */
    public void setBackoffMetadata(int i, Date date) {
        synchronized (this.backoffMetadataLock) {
            this.frcMetadata.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void resetBackoff() {
        setBackoffMetadata(0, NO_BACKOFF_TIME);
    }

    static class BackoffMetadata {
        private Date backoffEndTime;
        private int numFailedFetches;

        BackoffMetadata(int i, Date date) {
            this.numFailedFetches = i;
            this.backoffEndTime = date;
        }

        /* access modifiers changed from: package-private */
        public int getNumFailedFetches() {
            return this.numFailedFetches;
        }

        /* access modifiers changed from: package-private */
        public Date getBackoffEndTime() {
            return this.backoffEndTime;
        }
    }

    public RealtimeBackoffMetadata getRealtimeBackoffMetadata() {
        RealtimeBackoffMetadata realtimeBackoffMetadata;
        synchronized (this.realtimeBackoffMetadataLock) {
            realtimeBackoffMetadata = new RealtimeBackoffMetadata(this.frcMetadata.getInt("num_failed_realtime_streams", 0), new Date(this.frcMetadata.getLong("realtime_backoff_end_time_in_millis", -1)));
        }
        return realtimeBackoffMetadata;
    }

    /* access modifiers changed from: package-private */
    public void setRealtimeBackoffMetadata(int i, Date date) {
        synchronized (this.realtimeBackoffMetadataLock) {
            this.frcMetadata.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* access modifiers changed from: package-private */
    public void resetRealtimeBackoff() {
        setRealtimeBackoffMetadata(0, NO_BACKOFF_TIME);
    }

    public static class RealtimeBackoffMetadata {
        private Date backoffEndTime;
        private int numFailedStreams;

        public RealtimeBackoffMetadata(int i, Date date) {
            this.numFailedStreams = i;
            this.backoffEndTime = date;
        }

        /* access modifiers changed from: package-private */
        public int getNumFailedStreams() {
            return this.numFailedStreams;
        }

        /* access modifiers changed from: package-private */
        public Date getBackoffEndTime() {
            return this.backoffEndTime;
        }
    }
}
