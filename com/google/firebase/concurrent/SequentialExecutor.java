package com.google.firebase.concurrent;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

final class SequentialExecutor implements Executor {
    /* access modifiers changed from: private */
    public static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    /* access modifiers changed from: private */
    public final Deque<Runnable> queue = new ArrayDeque();
    private final QueueWorker worker = new QueueWorker();
    private long workerRunCount = 0;
    /* access modifiers changed from: private */
    public WorkerRunningState workerRunningState = WorkerRunningState.IDLE;

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    SequentialExecutor(Executor executor2) {
        this.executor = (Executor) Preconditions.checkNotNull(executor2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.executor.execute(r6.worker);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r6.workerRunningState != com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r7 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r7 = r6.queue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r6.workerRunCount != r1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r6.workerRunningState != com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        r6.workerRunningState = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        monitor-enter(r6.queue);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        if ((r1 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(final java.lang.Runnable r7) {
        /*
            r6 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r7)
            java.util.Deque<java.lang.Runnable> r0 = r6.queue
            monitor-enter(r0)
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = r6.workerRunningState     // Catch:{ all -> 0x007e }
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x007e }
            if (r1 == r2) goto L_0x0077
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = r6.workerRunningState     // Catch:{ all -> 0x007e }
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch:{ all -> 0x007e }
            if (r1 != r2) goto L_0x0013
            goto L_0x0077
        L_0x0013:
            long r1 = r6.workerRunCount     // Catch:{ all -> 0x007e }
            com.google.firebase.concurrent.SequentialExecutor$1 r3 = new com.google.firebase.concurrent.SequentialExecutor$1     // Catch:{ all -> 0x007e }
            r3.<init>(r7)     // Catch:{ all -> 0x007e }
            java.util.Deque<java.lang.Runnable> r7 = r6.queue     // Catch:{ all -> 0x007e }
            r7.add(r3)     // Catch:{ all -> 0x007e }
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r7 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x007e }
            r6.workerRunningState = r7     // Catch:{ all -> 0x007e }
            monitor-exit(r0)
            r7 = 0
            r0 = 1
            java.util.concurrent.Executor r4 = r6.executor     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0050 }
            com.google.firebase.concurrent.SequentialExecutor$QueueWorker r5 = r6.worker     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0050 }
            r4.execute(r5)     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0050 }
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = r6.workerRunningState
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUING
            if (r3 != r4) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r7 = 1
        L_0x0035:
            if (r7 == 0) goto L_0x0038
            return
        L_0x0038:
            java.util.Deque<java.lang.Runnable> r7 = r6.queue
            monitor-enter(r7)
            long r3 = r6.workerRunCount     // Catch:{ all -> 0x004d }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = r6.workerRunningState     // Catch:{ all -> 0x004d }
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x004d }
            if (r0 != r1) goto L_0x004b
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch:{ all -> 0x004d }
            r6.workerRunningState = r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r7)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0050:
            r1 = move-exception
            goto L_0x0053
        L_0x0052:
            r1 = move-exception
        L_0x0053:
            java.util.Deque<java.lang.Runnable> r2 = r6.queue
            monitor-enter(r2)
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = r6.workerRunningState     // Catch:{ all -> 0x0074 }
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r5 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x0074 }
            if (r4 == r5) goto L_0x0062
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = r6.workerRunningState     // Catch:{ all -> 0x0074 }
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r5 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x0074 }
            if (r4 != r5) goto L_0x006b
        L_0x0062:
            java.util.Deque<java.lang.Runnable> r4 = r6.queue     // Catch:{ all -> 0x0074 }
            boolean r3 = r4.removeLastOccurrence(r3)     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x006b
            r7 = 1
        L_0x006b:
            boolean r0 = r1 instanceof java.util.concurrent.RejectedExecutionException
            if (r0 == 0) goto L_0x0073
            if (r7 != 0) goto L_0x0073
            monitor-exit(r2)
            return
        L_0x0073:
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0077:
            java.util.Deque<java.lang.Runnable> r1 = r6.queue     // Catch:{ all -> 0x007e }
            r1.add(r7)     // Catch:{ all -> 0x007e }
            monitor-exit(r0)
            return
        L_0x007e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.execute(java.lang.Runnable):void");
    }

    final class QueueWorker implements Runnable {
        Runnable task;

        private QueueWorker() {
        }

        public final void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.queue) {
                    WorkerRunningState unused = SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
            if (r0 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
            r0 = r0 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r8.task.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r4 = com.google.firebase.concurrent.SequentialExecutor.access$400();
            r5 = java.util.logging.Level.SEVERE;
            r6 = new java.lang.StringBuilder();
            r6.append("Exception while executing runnable ");
            r6.append(r8.task);
            r4.log(r5, r6.toString(), r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void workOnQueue() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                com.google.firebase.concurrent.SequentialExecutor r2 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x0084 }
                java.util.Deque r2 = r2.queue     // Catch:{ all -> 0x0084 }
                monitor-enter(r2)     // Catch:{ all -> 0x0084 }
                if (r1 != 0) goto L_0x002d
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r1 = r1.workerRunningState     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x0081 }
                if (r1 != r3) goto L_0x0020
                monitor-exit(r2)
                if (r0 == 0) goto L_0x001f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001f:
                return
            L_0x0020:
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor.access$308(r1)     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState unused = r1.workerRunningState = r3     // Catch:{ all -> 0x0081 }
                r1 = 1
            L_0x002d:
                com.google.firebase.concurrent.SequentialExecutor r3 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x0081 }
                java.util.Deque r3 = r3.queue     // Catch:{ all -> 0x0081 }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x0081 }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x0081 }
                r8.task = r3     // Catch:{ all -> 0x0081 }
                if (r3 != 0) goto L_0x004f
                com.google.firebase.concurrent.SequentialExecutor r1 = com.google.firebase.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x0081 }
                com.google.firebase.concurrent.SequentialExecutor.WorkerRunningState unused = r1.workerRunningState = r3     // Catch:{ all -> 0x0081 }
                monitor-exit(r2)
                if (r0 == 0) goto L_0x004e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x004e:
                return
            L_0x004f:
                monitor-exit(r2)
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0084 }
                r0 = r0 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.task     // Catch:{ RuntimeException -> 0x005e }
                r3.run()     // Catch:{ RuntimeException -> 0x005e }
                goto L_0x007b
            L_0x005c:
                r1 = move-exception
                goto L_0x007e
            L_0x005e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.firebase.concurrent.SequentialExecutor.log     // Catch:{ all -> 0x005c }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x005c }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x005c }
                r6.<init>()     // Catch:{ all -> 0x005c }
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch:{ all -> 0x005c }
                java.lang.Runnable r7 = r8.task     // Catch:{ all -> 0x005c }
                r6.append(r7)     // Catch:{ all -> 0x005c }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x005c }
                r4.log(r5, r6, r3)     // Catch:{ all -> 0x005c }
            L_0x007b:
                r8.task = r2     // Catch:{ all -> 0x0084 }
                goto L_0x0002
            L_0x007e:
                r8.task = r2     // Catch:{ all -> 0x0084 }
                throw r1     // Catch:{ all -> 0x0084 }
            L_0x0081:
                r1 = move-exception
                monitor-exit(r2)
                throw r1     // Catch:{ all -> 0x0084 }
            L_0x0084:
                r1 = move-exception
                if (r0 == 0) goto L_0x008e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x008e:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }

        public final String toString() {
            Runnable runnable = this.task;
            if (runnable != null) {
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{running=");
                sb.append(runnable);
                sb.append("}");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
            sb2.append(SequentialExecutor.this.workerRunningState);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SequentialExecutor@");
        sb.append(System.identityHashCode(this));
        sb.append("{");
        sb.append(this.executor);
        sb.append("}");
        return sb.toString();
    }
}
