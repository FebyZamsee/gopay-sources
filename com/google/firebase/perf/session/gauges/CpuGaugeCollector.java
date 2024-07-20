package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class CpuGaugeCollector {
    private static final long MICROSECONDS_PER_SECOND = TimeUnit.SECONDS.toMicros(1);
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final long clockTicksPerSecond;
    private long cpuMetricCollectionRateMs = -1;
    private final ScheduledExecutorService cpuMetricCollectorExecutor = Executors.newSingleThreadScheduledExecutor();
    private ScheduledFuture cpuMetricCollectorJob = null;
    public final ConcurrentLinkedQueue<CpuMetricReading> cpuMetricReadings = new ConcurrentLinkedQueue<>();
    private final String procFileName;

    public static boolean isInvalidCollectionFrequency(long j) {
        return j <= 0;
    }

    CpuGaugeCollector() {
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder("/proc/");
        sb.append(Integer.toString(myPid));
        sb.append("/stat");
        this.procFileName = sb.toString();
        this.clockTicksPerSecond = getClockTicksPerSecond();
    }

    public void startCollecting(long j, Timer timer) {
        long j2 = this.clockTicksPerSecond;
        if (j2 != -1 && j2 != 0 && !isInvalidCollectionFrequency(j)) {
            if (this.cpuMetricCollectorJob == null) {
                scheduleCpuMetricCollectionWithRate(j, timer);
            } else if (this.cpuMetricCollectionRateMs != j) {
                stopCollecting();
                scheduleCpuMetricCollectionWithRate(j, timer);
            }
        }
    }

    public void stopCollecting() {
        ScheduledFuture scheduledFuture = this.cpuMetricCollectorJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.cpuMetricCollectorJob = null;
            this.cpuMetricCollectionRateMs = -1;
        }
    }

    public void collectOnce(Timer timer) {
        scheduleCpuMetricCollectionOnce(timer);
    }

    private void scheduleCpuMetricCollectionWithRate(long j, Timer timer) {
        synchronized (this) {
            this.cpuMetricCollectionRateMs = j;
            try {
                this.cpuMetricCollectorJob = this.cpuMetricCollectorExecutor.scheduleAtFixedRate(new CpuGaugeCollector$$ExternalSyntheticLambda0(this, timer), 0, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AndroidLogger androidLogger = logger;
                StringBuilder sb = new StringBuilder("Unable to start collecting Cpu Metrics: ");
                sb.append(e.getMessage());
                androidLogger.warn(sb.toString());
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$scheduleCpuMetricCollectionWithRate$0$com-google-firebase-perf-session-gauges-CpuGaugeCollector  reason: not valid java name */
    public /* synthetic */ void m126lambda$scheduleCpuMetricCollectionWithRate$0$comgooglefirebaseperfsessiongaugesCpuGaugeCollector(Timer timer) {
        CpuMetricReading syncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (syncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(syncCollectCpuMetric);
        }
    }

    private void scheduleCpuMetricCollectionOnce(Timer timer) {
        synchronized (this) {
            try {
                this.cpuMetricCollectorExecutor.schedule(new CpuGaugeCollector$$ExternalSyntheticLambda1(this, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                AndroidLogger androidLogger = logger;
                StringBuilder sb = new StringBuilder("Unable to collect Cpu Metric: ");
                sb.append(e.getMessage());
                androidLogger.warn(sb.toString());
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$scheduleCpuMetricCollectionOnce$1$com-google-firebase-perf-session-gauges-CpuGaugeCollector  reason: not valid java name */
    public /* synthetic */ void m125lambda$scheduleCpuMetricCollectionOnce$1$comgooglefirebaseperfsessiongaugesCpuGaugeCollector(Timer timer) {
        CpuMetricReading syncCollectCpuMetric = syncCollectCpuMetric(timer);
        if (syncCollectCpuMetric != null) {
            this.cpuMetricReadings.add(syncCollectCpuMetric);
        }
    }

    private CpuMetricReading syncCollectCpuMetric(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.procFileName));
            long currentTimestampMicros = timer.getCurrentTimestampMicros();
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            CpuMetricReading cpuMetricReading = (CpuMetricReading) CpuMetricReading.newBuilder().setClientTimeUs(currentTimestampMicros).setSystemTimeUs(convertClockTicksToMicroseconds(Long.parseLong(split[14]) + Long.parseLong(split[16]))).setUserTimeUs(convertClockTicksToMicroseconds(parseLong + parseLong2)).build();
            bufferedReader.close();
            return cpuMetricReading;
        } catch (IOException e) {
            AndroidLogger androidLogger = logger;
            StringBuilder sb = new StringBuilder("Unable to read 'proc/[pid]/stat' file: ");
            sb.append(e.getMessage());
            androidLogger.warn(sb.toString());
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            AndroidLogger androidLogger2 = logger;
            StringBuilder sb2 = new StringBuilder("Unexpected '/proc/[pid]/stat' file format encountered: ");
            sb2.append(e2.getMessage());
            androidLogger2.warn(sb2.toString());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private long getClockTicksPerSecond() {
        return Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    private long convertClockTicksToMicroseconds(long j) {
        return Math.round((((double) j) / ((double) this.clockTicksPerSecond)) * ((double) MICROSECONDS_PER_SECOND));
    }
}
