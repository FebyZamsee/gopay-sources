package com.google.firebase.crashlytics.internal.send;

import android.database.SQLException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.getNavigationMode;
import o.getSelectedNavigationIndex;
import o.getTitle;
import o.setIcon;
import o.setListNavigationCallbacks;
import o.setNavigationMode;
import o.setOnBackInvokedDispatcher;
import o.setSelectedNavigationItem;

final class ReportQueue {
    private final double base;
    private long lastUpdatedMs;
    /* access modifiers changed from: private */
    public final OnDemandCounter onDemandCounter;
    private final BlockingQueue<Runnable> queue;
    private final int queueCapacity;
    private final double ratePerMinute;
    private final ThreadPoolExecutor singleThreadExecutor;
    private final long startTimeMs;
    private int step;
    private final long stepDurationMs;
    private final getTitle<CrashlyticsReport> transport;

    ReportQueue(getTitle<CrashlyticsReport> gettitle, Settings settings, OnDemandCounter onDemandCounter2) {
        this(settings.onDemandUploadRatePerMinute, settings.onDemandBackoffBase, ((long) settings.onDemandBackoffStepDurationSeconds) * 1000, gettitle, onDemandCounter2);
    }

    ReportQueue(double d, double d2, long j, getTitle<CrashlyticsReport> gettitle, OnDemandCounter onDemandCounter2) {
        this.ratePerMinute = d;
        this.base = d2;
        this.stepDurationMs = j;
        this.transport = gettitle;
        this.onDemandCounter = onDemandCounter2;
        this.startTimeMs = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.queueCapacity = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.queue = arrayBlockingQueue;
        this.singleThreadExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.step = 0;
        this.lastUpdatedMs = 0;
    }

    /* access modifiers changed from: package-private */
    public final TaskCompletionSource<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        synchronized (this.queue) {
            TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource = new TaskCompletionSource<>();
            if (z) {
                this.onDemandCounter.incrementRecordedOnDemandExceptions();
                if (isQueueAvailable()) {
                    Logger logger = Logger.getLogger();
                    StringBuilder sb = new StringBuilder("Enqueueing report: ");
                    sb.append(crashlyticsReportWithSessionId.getSessionId());
                    logger.d(sb.toString());
                    Logger logger2 = Logger.getLogger();
                    StringBuilder sb2 = new StringBuilder("Queue size: ");
                    sb2.append(this.queue.size());
                    logger2.d(sb2.toString());
                    this.singleThreadExecutor.execute(new ReportRunnable(crashlyticsReportWithSessionId, taskCompletionSource));
                    Logger logger3 = Logger.getLogger();
                    StringBuilder sb3 = new StringBuilder("Closing task for report: ");
                    sb3.append(crashlyticsReportWithSessionId.getSessionId());
                    logger3.d(sb3.toString());
                    taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                    return taskCompletionSource;
                }
                calcStep();
                Logger logger4 = Logger.getLogger();
                StringBuilder sb4 = new StringBuilder("Dropping report due to queue being full: ");
                sb4.append(crashlyticsReportWithSessionId.getSessionId());
                logger4.d(sb4.toString());
                this.onDemandCounter.incrementDroppedOnDemandExceptions();
                taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
                return taskCompletionSource;
            }
            sendReport(crashlyticsReportWithSessionId, taskCompletionSource);
            return taskCompletionSource;
        }
    }

    public final void flushScheduledReportsIfAble() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new ReportQueue$$ExternalSyntheticLambda1(this, countDownLatch)).start();
        Utils.awaitUninterruptibly(countDownLatch, 2, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$flushScheduledReportsIfAble$0$com-google-firebase-crashlytics-internal-send-ReportQueue  reason: not valid java name */
    public final /* synthetic */ void m101lambda$flushScheduledReportsIfAble$0$comgooglefirebasecrashlyticsinternalsendReportQueue(CountDownLatch countDownLatch) {
        try {
            getTitle<CrashlyticsReport> gettitle = this.transport;
            getNavigationMode getnavigationmode = getNavigationMode.HIGHEST;
            if (gettitle instanceof setNavigationMode) {
                setIcon seticon = ((setNavigationMode) gettitle).onTransact;
                setIcon asBinder = setIcon.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(seticon.read()).read(getnavigationmode).asBinder(seticon.asBinder()).asBinder();
                setListNavigationCallbacks setlistnavigationcallbacks = setSelectedNavigationItem.onTransact;
                if (setlistnavigationcallbacks != null) {
                    setlistnavigationcallbacks.RemoteActionCompatParcelizer().asInterface.RemoteActionCompatParcelizer(asBinder, 1);
                } else {
                    throw new IllegalStateException("Not initialized!");
                }
            } else {
                boolean isLoggable = Log.isLoggable(setOnBackInvokedDispatcher.asInterface("ForcedSender"), 5);
            }
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* access modifiers changed from: private */
    public void sendReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
        Logger logger = Logger.getLogger();
        StringBuilder sb = new StringBuilder("Sending report through Google DataTransport: ");
        sb.append(crashlyticsReportWithSessionId.getSessionId());
        logger.d(sb.toString());
        this.transport.onTransact(new getSelectedNavigationIndex((Integer) null, crashlyticsReportWithSessionId.getReport(), getNavigationMode.HIGHEST), new ReportQueue$$ExternalSyntheticLambda0(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.startTimeMs < 2000, crashlyticsReportWithSessionId));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$sendReport$1$com-google-firebase-crashlytics-internal-send-ReportQueue  reason: not valid java name */
    public final /* synthetic */ void m102lambda$sendReport$1$comgooglefirebasecrashlyticsinternalsendReportQueue(TaskCompletionSource taskCompletionSource, boolean z, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            flushScheduledReportsIfAble();
        }
        taskCompletionSource.trySetResult(crashlyticsReportWithSessionId);
    }

    private boolean isQueueAvailable() {
        return this.queue.size() < this.queueCapacity;
    }

    private boolean isQueueFull() {
        return this.queue.size() == this.queueCapacity;
    }

    /* access modifiers changed from: private */
    public double calcDelay() {
        return Math.min(3600000.0d, (60000.0d / this.ratePerMinute) * Math.pow(this.base, (double) calcStep()));
    }

    private int calcStep() {
        int i;
        if (this.lastUpdatedMs == 0) {
            this.lastUpdatedMs = now();
        }
        int now = (int) ((now() - this.lastUpdatedMs) / this.stepDurationMs);
        if (isQueueFull()) {
            i = Math.min(100, this.step + now);
        } else {
            i = Math.max(0, this.step - now);
        }
        if (this.step != i) {
            this.step = i;
            this.lastUpdatedMs = now();
        }
        return i;
    }

    private long now() {
        return System.currentTimeMillis();
    }

    final class ReportRunnable implements Runnable {
        private final CrashlyticsReportWithSessionId reportWithSessionId;
        private final TaskCompletionSource<CrashlyticsReportWithSessionId> tcs;

        private ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource<CrashlyticsReportWithSessionId> taskCompletionSource) {
            this.reportWithSessionId = crashlyticsReportWithSessionId;
            this.tcs = taskCompletionSource;
        }

        public final void run() {
            ReportQueue.this.sendReport(this.reportWithSessionId, this.tcs);
            ReportQueue.this.onDemandCounter.resetDroppedOnDemandExceptions();
            double access$300 = ReportQueue.this.calcDelay();
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Delay for: ");
            sb.append(String.format(Locale.US, "%.2f", new Object[]{Double.valueOf(access$300 / 1000.0d)}));
            sb.append(" s for report: ");
            sb.append(this.reportWithSessionId.getSessionId());
            logger.d(sb.toString());
            ReportQueue.sleep(access$300);
        }
    }

    /* access modifiers changed from: private */
    public static void sleep(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }
}
