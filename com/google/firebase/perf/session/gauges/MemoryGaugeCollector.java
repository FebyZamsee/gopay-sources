package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.StorageUnit;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class MemoryGaugeCollector {
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private long memoryMetricCollectionRateMs;
    private final ScheduledExecutorService memoryMetricCollectorExecutor;
    private ScheduledFuture memoryMetricCollectorJob;
    public final ConcurrentLinkedQueue<AndroidMemoryReading> memoryMetricReadings;
    private final Runtime runtime;

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    MemoryGaugeCollector() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    MemoryGaugeCollector(ScheduledExecutorService scheduledExecutorService, Runtime runtime2) {
        this.memoryMetricCollectorJob = null;
        this.memoryMetricCollectionRateMs = -1;
        this.memoryMetricCollectorExecutor = scheduledExecutorService;
        this.memoryMetricReadings = new ConcurrentLinkedQueue<>();
        this.runtime = runtime2;
    }

    public void startCollecting(long j, Timer timer) {
        if (!isInvalidCollectionFrequency(j)) {
            if (this.memoryMetricCollectorJob == null) {
                scheduleMemoryMetricCollectionWithRate(j, timer);
            } else if (this.memoryMetricCollectionRateMs != j) {
                stopCollecting();
                scheduleMemoryMetricCollectionWithRate(j, timer);
            }
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.memoryMetricCollectorJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.memoryMetricCollectorJob = null;
            this.memoryMetricCollectionRateMs = -1;
        }
    }

    public void collectOnce(Timer timer) {
        scheduleMemoryMetricCollectionOnce(timer);
    }

    private void scheduleMemoryMetricCollectionWithRate(long j, Timer timer) {
        synchronized (this) {
            this.memoryMetricCollectionRateMs = j;
            try {
                this.memoryMetricCollectorJob = this.memoryMetricCollectorExecutor.scheduleAtFixedRate(new MemoryGaugeCollector$$ExternalSyntheticLambda0(this, timer), 0, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AndroidLogger androidLogger = logger;
                StringBuilder sb = new StringBuilder("Unable to start collecting Memory Metrics: ");
                sb.append(e.getMessage());
                androidLogger.warn(sb.toString());
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$scheduleMemoryMetricCollectionWithRate$0$com-google-firebase-perf-session-gauges-MemoryGaugeCollector  reason: not valid java name */
    public /* synthetic */ void m130lambda$scheduleMemoryMetricCollectionWithRate$0$comgooglefirebaseperfsessiongaugesMemoryGaugeCollector(Timer timer) {
        AndroidMemoryReading syncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (syncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(syncCollectMemoryMetric);
        }
    }

    private void scheduleMemoryMetricCollectionOnce(Timer timer) {
        synchronized (this) {
            try {
                this.memoryMetricCollectorExecutor.schedule(new MemoryGaugeCollector$$ExternalSyntheticLambda1(this, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AndroidLogger androidLogger = logger;
                StringBuilder sb = new StringBuilder("Unable to collect Memory Metric: ");
                sb.append(e.getMessage());
                androidLogger.warn(sb.toString());
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$scheduleMemoryMetricCollectionOnce$1$com-google-firebase-perf-session-gauges-MemoryGaugeCollector  reason: not valid java name */
    public /* synthetic */ void m129lambda$scheduleMemoryMetricCollectionOnce$1$comgooglefirebaseperfsessiongaugesMemoryGaugeCollector(Timer timer) {
        AndroidMemoryReading syncCollectMemoryMetric = syncCollectMemoryMetric(timer);
        if (syncCollectMemoryMetric != null) {
            this.memoryMetricReadings.add(syncCollectMemoryMetric);
        }
    }

    private AndroidMemoryReading syncCollectMemoryMetric(Timer timer) {
        if (timer == null) {
            return null;
        }
        return (AndroidMemoryReading) AndroidMemoryReading.newBuilder().setClientTimeUs(timer.getCurrentTimestampMicros()).setUsedAppJavaHeapMemoryKb(getCurrentUsedAppJavaHeapMemoryKb()).build();
    }

    private int getCurrentUsedAppJavaHeapMemoryKb() {
        return Utils.saturatedIntCast(StorageUnit.BYTES.toKilobytes(this.runtime.totalMemory() - this.runtime.freeMemory()));
    }
}
