package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class AFc1wSDK implements AFc1pSDK {
    private static final int AFInAppEventParameterName = ((int) TimeUnit.SECONDS.toMillis(30));
    private ExecutorService AFInAppEventType;
    public final AFc1tSDK AFKeystoreWrapper = new AFc1tSDK();
    private AFc1vSDK AFLogger;
    private AFf1xSDK AFLogger$LogLevel;
    private AFd1mSDK AFVersionDeclaration;
    private AFb1xSDK AppsFlyer2dXConversionCallback;
    private AFe1oSDK afDebugLog;
    private AFc1dSDK afErrorLog;
    private AFe1eSDK afErrorLogForExcManagerOnly;
    private PurchaseHandler afInfoLog;
    private ScheduledExecutorService afRDLog;
    private AFg1nSDK afWarnLog;
    private AFb1uSDK getLevel;
    private AFg1vSDK init;
    private AFe1gSDK onAppOpenAttribution;
    private AFd1qSDK onAppOpenAttributionNative;
    private AFb1nSDK onAttributionFailureNative;
    private AFa1kSDK onConversionDataSuccess;
    private AFa1gSDK onDeepLinkingNative;
    private AFe1hSDK onInstallConversionDataLoadedNative;
    private AFc1oSDK onInstallConversionFailureNative;
    private AFb1bSDK onResponseErrorNative;
    private AFf1bSDK onResponseNative;
    private ExecutorService valueOf;
    public AFc1ySDK values;

    public final AFc1hSDK AFInAppEventType() {
        return new AFc1hSDK(onResponse(), AFKeystoreWrapper(), AppsFlyerProperties.getInstance(), onAppOpenAttributionNative());
    }

    private AFc1dSDK onResponse() {
        AFc1dSDK aFc1dSDK;
        synchronized (this) {
            if (this.afErrorLog == null) {
                this.afErrorLog = new AFc1dSDK(new AFd1zSDK(AFInAppEventParameterName), valueOf());
            }
            aFc1dSDK = this.afErrorLog;
        }
        return aFc1dSDK;
    }

    public final ExecutorService valueOf() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = Executors.newCachedThreadPool();
            }
            executorService = this.AFInAppEventType;
        }
        return executorService;
    }

    public final ExecutorService AFInAppEventParameterName() {
        ExecutorService executorService;
        synchronized (this) {
            if (this.valueOf == null) {
                this.valueOf = Executors.newSingleThreadExecutor();
            }
            executorService = this.valueOf;
        }
        return executorService;
    }

    public final ScheduledExecutorService values() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this) {
            if (this.afRDLog == null) {
                this.afRDLog = Executors.newScheduledThreadPool(2);
            }
            scheduledExecutorService = this.afRDLog;
        }
        return scheduledExecutorService;
    }

    public final AFc1vSDK AFKeystoreWrapper() {
        AFc1vSDK aFc1vSDK;
        synchronized (this) {
            if (this.AFLogger == null) {
                AFc1tSDK init2 = init();
                Context context = this.AFKeystoreWrapper.AFInAppEventType;
                if (context != null) {
                    this.AFLogger = new AFc1vSDK(init2, new AFc1zSDK(AFa1dSDK.AFInAppEventParameterName(context)));
                } else {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
            }
            aFc1vSDK = this.AFLogger;
        }
        return aFc1vSDK;
    }

    public final PurchaseHandler AFLogger() {
        PurchaseHandler purchaseHandler;
        synchronized (this) {
            if (this.afInfoLog == null) {
                this.afInfoLog = new PurchaseHandler(this);
            }
            purchaseHandler = this.afInfoLog;
        }
        return purchaseHandler;
    }

    public final AFe1oSDK afInfoLog() {
        AFe1oSDK aFe1oSDK;
        synchronized (this) {
            if (this.afDebugLog == null) {
                AFe1kSDK aFe1kSDK = new AFe1kSDK(afErrorLog());
                this.afDebugLog = new AFe1oSDK(new AFe1mSDK(), AFKeystoreWrapper(), AppsFlyer2dXConversionCallback(), aFe1kSDK, new AFc1hSDK(onResponse(), AFKeystoreWrapper(), AppsFlyerProperties.getInstance(), onAppOpenAttributionNative()), new AFe1lSDK(AFKeystoreWrapper(), aFe1kSDK), getLevel());
            }
            aFe1oSDK = this.afDebugLog;
        }
        return aFe1oSDK;
    }

    public final AFe1gSDK afRDLog() {
        AFe1gSDK aFe1gSDK;
        synchronized (this) {
            if (this.onAppOpenAttribution == null) {
                this.onAppOpenAttribution = new AFe1gSDK(init(), AFKeystoreWrapper());
            }
            aFe1gSDK = this.onAppOpenAttribution;
        }
        return aFe1gSDK;
    }

    public final AFf1xSDK afDebugLog() {
        AFf1xSDK aFf1xSDK;
        synchronized (this) {
            if (this.AFLogger$LogLevel == null) {
                this.AFLogger$LogLevel = new AFf1xSDK(afErrorLog());
            }
            aFf1xSDK = this.AFLogger$LogLevel;
        }
        return aFf1xSDK;
    }

    public final AFe1eSDK afWarnLog() {
        if (this.afErrorLogForExcManagerOnly == null) {
            Context context = this.AFKeystoreWrapper.AFInAppEventType;
            if (context != null) {
                this.afErrorLogForExcManagerOnly = new AFe1bSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afErrorLogForExcManagerOnly;
    }

    public final AFg1nSDK AFLogger$LogLevel() {
        if (this.afWarnLog == null) {
            Context context = this.AFKeystoreWrapper.AFInAppEventType;
            if (context != null) {
                this.afWarnLog = new AFg1pSDK(context);
            } else {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
        }
        return this.afWarnLog;
    }

    public final AFd1mSDK getLevel() {
        AFd1mSDK aFd1mSDK;
        synchronized (this) {
            if (this.AFVersionDeclaration == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 300, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>() {
                    /* access modifiers changed from: private */
                    /* renamed from: values */
                    public boolean offer(Runnable runnable) {
                        if (isEmpty()) {
                            return super.offer(runnable);
                        }
                        return false;
                    }
                }, new AFa1ySDK());
                threadPoolExecutor.setRejectedExecutionHandler(new AFc1wSDK$$ExternalSyntheticLambda0());
                this.AFVersionDeclaration = new AFd1mSDK(threadPoolExecutor);
            }
            aFd1mSDK = this.AFVersionDeclaration;
        }
        return aFd1mSDK;
    }

    public final AFb1uSDK afErrorLogForExcManagerOnly() {
        AFb1uSDK aFb1uSDK;
        synchronized (this) {
            if (this.getLevel == null) {
                this.getLevel = new AFb1mSDK();
            }
            aFb1uSDK = this.getLevel;
        }
        return aFb1uSDK;
    }

    public final AFg1vSDK AFVersionDeclaration() {
        AFg1vSDK aFg1vSDK;
        synchronized (this) {
            if (this.init == null) {
                this.init = new AFg1vSDK();
            }
            aFg1vSDK = this.init;
        }
        return aFg1vSDK;
    }

    public final AFe1hSDK AppsFlyer2dXConversionCallback() {
        AFe1hSDK aFe1hSDK;
        synchronized (this) {
            if (this.onInstallConversionDataLoadedNative == null) {
                this.onInstallConversionDataLoadedNative = new AFe1hSDK(init(), new AFe1nSDK());
            }
            aFe1hSDK = this.onInstallConversionDataLoadedNative;
        }
        return aFe1hSDK;
    }

    public final AFc1tSDK init() {
        AFc1tSDK aFc1tSDK;
        synchronized (this) {
            aFc1tSDK = this.AFKeystoreWrapper;
        }
        return aFc1tSDK;
    }

    public final AFb1xSDK onInstallConversionDataLoadedNative() {
        AFb1xSDK aFb1xSDK;
        synchronized (this) {
            if (this.AppsFlyer2dXConversionCallback == null) {
                this.AppsFlyer2dXConversionCallback = new AFb1ySDK(init());
            }
            aFb1xSDK = this.AppsFlyer2dXConversionCallback;
        }
        return aFb1xSDK;
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttributionFailure */
    public AFc1oSDK onDeepLinking() {
        AFc1oSDK aFc1oSDK;
        synchronized (this) {
            if (this.onInstallConversionFailureNative == null) {
                this.onInstallConversionFailureNative = new AFc1oSDK(this);
            }
            aFc1oSDK = this.onInstallConversionFailureNative;
        }
        return aFc1oSDK;
    }

    public final AFd1qSDK onAppOpenAttributionNative() {
        AFd1qSDK aFd1qSDK;
        synchronized (this) {
            if (this.onAppOpenAttributionNative == null) {
                this.onAppOpenAttributionNative = new AFd1qSDK(AFKeystoreWrapper(), afErrorLog());
            }
            aFd1qSDK = this.onAppOpenAttributionNative;
        }
        return aFd1qSDK;
    }

    public final AFf1bSDK onInstallConversionFailureNative() {
        if (this.onResponseNative == null) {
            this.onResponseNative = new AFf1cSDK();
        }
        return this.onResponseNative;
    }

    public final AFb1nSDK onResponseErrorNative() {
        AFb1nSDK aFb1nSDK;
        synchronized (this) {
            if (this.onAttributionFailureNative == null) {
                this.onAttributionFailureNative = new AFb1nSDK(this);
            }
            aFb1nSDK = this.onAttributionFailureNative;
        }
        return aFb1nSDK;
    }

    public final AFb1bSDK onResponseNative() {
        if (this.onResponseErrorNative == null) {
            this.onResponseErrorNative = new AFa1ySDK();
        }
        return this.onResponseErrorNative;
    }

    public final AFa1gSDK onDeepLinkingNative() {
        if (this.onDeepLinkingNative == null) {
            this.onDeepLinkingNative = new AFa1gSDK();
        }
        return this.onDeepLinkingNative;
    }

    public final AFa1kSDK onConversionDataSuccess() {
        if (this.onConversionDataSuccess == null) {
            this.onConversionDataSuccess = new AFa1hSDK();
        }
        return this.onConversionDataSuccess;
    }

    public final AFc1ySDK onAttributionFailureNative() {
        if (this.values == null) {
            this.values = new AFc1xSDK(AFInAppEventParameterName(), onResponseErrorNative());
        }
        return this.values;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void AFInAppEventParameterName(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            threadPoolExecutor.getQueue().put(runnable);
        } catch (InterruptedException e) {
            AFLogger.afErrorLogForExcManagerOnly("could not create executor for queue", e);
            Thread.currentThread().interrupt();
        }
    }

    static final class AFa1ySDK implements ThreadFactory {
        private static final AtomicInteger values = new AtomicInteger();
        private final AtomicInteger AFInAppEventParameterName = new AtomicInteger();

        public AFa1ySDK() {
            values.incrementAndGet();
        }

        public final Thread newThread(Runnable runnable) {
            int i = values.get();
            int incrementAndGet = this.AFInAppEventParameterName.incrementAndGet();
            StringBuilder sb = new StringBuilder("queue-");
            sb.append(i);
            sb.append("-");
            sb.append(incrementAndGet);
            return new Thread(runnable, sb.toString());
        }
    }

    public final AFb1aSDK afErrorLog() {
        Context context = this.AFKeystoreWrapper.AFInAppEventType;
        if (context != null) {
            return new AFc1zSDK(AFa1dSDK.AFInAppEventParameterName(context));
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }
}
