package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Utils {
    private static final ExecutorService TASK_CONTINUATION_EXECUTOR_SERVICE = ExecutorUtils.buildSingleThreadExecutorService("awaitEvenIfOnMainThread task continuation executor");

    public static <T> Task<T> race(Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Utils$$ExternalSyntheticLambda1 utils$$ExternalSyntheticLambda1 = new Utils$$ExternalSyntheticLambda1(taskCompletionSource);
        task.continueWith(utils$$ExternalSyntheticLambda1);
        task2.continueWith(utils$$ExternalSyntheticLambda1);
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ Void lambda$race$0(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        } else if (task.getException() == null) {
            return null;
        } else {
            taskCompletionSource.trySetException(task.getException());
            return null;
        }
    }

    public static <T> Task<T> race(Executor executor, Task<T> task, Task<T> task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Utils$$ExternalSyntheticLambda3 utils$$ExternalSyntheticLambda3 = new Utils$$ExternalSyntheticLambda3(taskCompletionSource);
        task.continueWith(executor, utils$$ExternalSyntheticLambda3);
        task2.continueWith(executor, utils$$ExternalSyntheticLambda3);
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ Void lambda$race$1(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        } else if (task.getException() == null) {
            return null;
        } else {
            taskCompletionSource.trySetException(task.getException());
            return null;
        }
    }

    public static <T> Task<T> callTask(Executor executor, Callable<Task<T>> callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Utils$$ExternalSyntheticLambda4(callable, executor, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    static /* synthetic */ void lambda$callTask$3(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).continueWith(executor, new Utils$$ExternalSyntheticLambda0(taskCompletionSource));
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    static /* synthetic */ Object lambda$callTask$2(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
            return null;
        } else if (task.getException() == null) {
            return null;
        } else {
            taskCompletionSource.setException(task.getException());
            return null;
        }
    }

    public static <T> T awaitEvenIfOnMainThread(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(TASK_CONTINUATION_EXECUTOR_SERVICE, new Utils$$ExternalSyntheticLambda2(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new TimeoutException();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean awaitUninterruptibly(java.util.concurrent.CountDownLatch r8, long r9, java.util.concurrent.TimeUnit r11) {
        /*
            r0 = 1
            r1 = 0
            long r9 = r11.toNanos(r9)     // Catch:{ all -> 0x002a }
            long r2 = java.lang.System.nanoTime()     // Catch:{ all -> 0x002a }
            r4 = r9
        L_0x000b:
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ InterruptedException -> 0x001e, all -> 0x001b }
            boolean r8 = r8.await(r4, r11)     // Catch:{ InterruptedException -> 0x001e, all -> 0x001b }
            if (r1 == 0) goto L_0x001a
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L_0x001a:
            return r8
        L_0x001b:
            r8 = move-exception
            r0 = r1
            goto L_0x002c
        L_0x001e:
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0028 }
            long r6 = r2 + r9
            long r4 = r6 - r4
            r1 = 1
            goto L_0x000b
        L_0x0028:
            r8 = move-exception
            goto L_0x002c
        L_0x002a:
            r8 = move-exception
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
        L_0x0035:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.Utils.awaitUninterruptibly(java.util.concurrent.CountDownLatch, long, java.util.concurrent.TimeUnit):boolean");
    }
}
