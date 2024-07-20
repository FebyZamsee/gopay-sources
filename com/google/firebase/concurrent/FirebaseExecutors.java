package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

public class FirebaseExecutors {
    public static Executor newSequentialExecutor(Executor executor) {
        return new SequentialExecutor(executor);
    }

    public static Executor directExecutor() {
        return DirectExecutor.INSTANCE;
    }

    enum DirectExecutor implements Executor {
        INSTANCE;

        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
