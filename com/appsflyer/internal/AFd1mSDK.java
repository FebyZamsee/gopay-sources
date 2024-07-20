package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class AFd1mSDK {
    final Set<AFd1kSDK> AFInAppEventParameterName = new CopyOnWriteArraySet();
    final ExecutorService AFInAppEventType;
    public Executor AFKeystoreWrapper = Executors.newSingleThreadExecutor();
    final NavigableSet<AFd1jSDK<?>> AFLogger = new ConcurrentSkipListSet();
    final Set<AFd1jSDK<?>> afDebugLog = Collections.newSetFromMap(new ConcurrentHashMap());
    final List<AFd1jSDK<?>> afErrorLog = new ArrayList();
    final NavigableSet<AFd1jSDK<?>> afInfoLog = new ConcurrentSkipListSet();
    final Set<AFd1kSDK> afRDLog = Collections.newSetFromMap(new ConcurrentHashMap());
    public final List<AFd1nSDK> valueOf = new CopyOnWriteArrayList();
    final Timer values = new Timer(true);

    public AFd1mSDK(ExecutorService executorService) {
        this.AFInAppEventType = executorService;
    }

    /* access modifiers changed from: package-private */
    public final void AFInAppEventType(NavigableSet<AFd1jSDK<?>> navigableSet) {
        AFd1jSDK pollFirst = navigableSet.pollFirst();
        this.AFInAppEventParameterName.add(pollFirst.valueOf);
        for (AFd1nSDK AFInAppEventType2 : this.valueOf) {
            AFInAppEventType2.AFInAppEventType(pollFirst);
        }
    }

    /* access modifiers changed from: private */
    public boolean valueOf(AFd1jSDK<?> aFd1jSDK) {
        return this.AFInAppEventParameterName.containsAll(aFd1jSDK.AFInAppEventType);
    }

    static /* synthetic */ void valueOf(AFd1mSDK aFd1mSDK) {
        synchronized (aFd1mSDK.afInfoLog) {
            Iterator<AFd1jSDK<?>> it = aFd1mSDK.AFLogger.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AFd1jSDK next = it.next();
                if (aFd1mSDK.valueOf((AFd1jSDK<?>) next)) {
                    it.remove();
                    aFd1mSDK.afInfoLog.add(next);
                    z = true;
                }
            }
            if (z) {
                aFd1mSDK.AFInAppEventType.submit(new Runnable() {
                    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
                        r2 = r1.AFInAppEventType();
                        r0 = new com.appsflyer.internal.AFd1lSDK(java.lang.Thread.currentThread());
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
                        if (r2 <= 0) goto L_0x0035;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
                        r7.AFInAppEventType.values.schedule(r0, r2);
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
                        r2 = r7.AFInAppEventType;
                        r2.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFd1mSDK.AnonymousClass4(r2, r1));
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
                        if (r7.AFInAppEventType.afInfoLog.isEmpty() != false) goto L_0x0057;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
                        r2 = r7.AFInAppEventType;
                        r2.AFInAppEventType.submit(new com.appsflyer.internal.AFd1mSDK.AnonymousClass1(r2));
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
                        com.appsflyer.AFLogger.afDebugLog("QUEUE: starting task execution: ".concat(java.lang.String.valueOf(r1)));
                        r2 = r1.AFLogger();
                        r0.cancel();
                        r3 = r7.AFInAppEventType;
                        r3.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFd1mSDK.AnonymousClass2(r3, r1, r2));
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
                        return;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
                        r0.cancel();
                        r0 = r7.AFInAppEventType;
                        r0.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFd1mSDK.AnonymousClass2(r0, r1, com.appsflyer.internal.AFd1sSDK.values));
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
                        return;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
                        com.appsflyer.AFLogger.afDebugLog("QUEUE: task was interrupted: ".concat(java.lang.String.valueOf(r1)));
                        r1.values = com.appsflyer.internal.AFd1sSDK.AFInAppEventParameterName;
                        r0 = r7.AFInAppEventType;
                        r0.AFKeystoreWrapper.execute(new com.appsflyer.internal.AFd1mSDK.AnonymousClass2(r0, r1, com.appsflyer.internal.AFd1sSDK.AFInAppEventParameterName));
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
                        return;
                     */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r7 = this;
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r0 = r0.afInfoLog
                            monitor-enter(r0)
                            com.appsflyer.internal.AFd1mSDK r1 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x00aa }
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r1 = r1.afInfoLog     // Catch:{ all -> 0x00aa }
                            java.lang.Object r1 = r1.pollFirst()     // Catch:{ all -> 0x00aa }
                            com.appsflyer.internal.AFd1jSDK r1 = (com.appsflyer.internal.AFd1jSDK) r1     // Catch:{ all -> 0x00aa }
                            if (r1 != 0) goto L_0x0013
                            monitor-exit(r0)
                            return
                        L_0x0013:
                            com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ all -> 0x00aa }
                            java.util.Set<com.appsflyer.internal.AFd1jSDK<?>> r2 = r2.afDebugLog     // Catch:{ all -> 0x00aa }
                            r2.add(r1)     // Catch:{ all -> 0x00aa }
                            monitor-exit(r0)
                            long r2 = r1.AFInAppEventType()
                            com.appsflyer.internal.AFd1lSDK r0 = new com.appsflyer.internal.AFd1lSDK
                            java.lang.Thread r4 = java.lang.Thread.currentThread()
                            r0.<init>(r4)
                            r4 = 0
                            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                            if (r6 <= 0) goto L_0x0035
                            com.appsflyer.internal.AFd1mSDK r4 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.Timer r4 = r4.values
                            r4.schedule(r0, r2)
                        L_0x0035:
                            com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.concurrent.Executor r3 = r2.AFKeystoreWrapper
                            com.appsflyer.internal.AFd1mSDK$4 r4 = new com.appsflyer.internal.AFd1mSDK$4
                            r4.<init>(r1)
                            r3.execute(r4)
                            com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.NavigableSet<com.appsflyer.internal.AFd1jSDK<?>> r2 = r2.afInfoLog
                            boolean r2 = r2.isEmpty()
                            if (r2 != 0) goto L_0x0057
                            com.appsflyer.internal.AFd1mSDK r2 = com.appsflyer.internal.AFd1mSDK.this
                            java.util.concurrent.ExecutorService r3 = r2.AFInAppEventType
                            com.appsflyer.internal.AFd1mSDK$1 r4 = new com.appsflyer.internal.AFd1mSDK$1
                            r4.<init>()
                            r3.submit(r4)
                        L_0x0057:
                            java.lang.String r2 = "QUEUE: starting task execution: "
                            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            java.lang.String r2 = r2.concat(r3)     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            com.appsflyer.internal.AFd1sSDK r2 = r1.call()     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            r0.cancel()     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            com.appsflyer.internal.AFd1mSDK r3 = com.appsflyer.internal.AFd1mSDK.this     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            java.util.concurrent.Executor r4 = r3.AFKeystoreWrapper     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            com.appsflyer.internal.AFd1mSDK$2 r5 = new com.appsflyer.internal.AFd1mSDK$2     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            r5.<init>(r1, r2)     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            r4.execute(r5)     // Catch:{ InterruptedIOException | InterruptedException -> 0x008a, all -> 0x0078 }
                            return
                        L_0x0078:
                            r0.cancel()
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            com.appsflyer.internal.AFd1sSDK r2 = com.appsflyer.internal.AFd1sSDK.FAILURE
                            java.util.concurrent.Executor r3 = r0.AFKeystoreWrapper
                            com.appsflyer.internal.AFd1mSDK$2 r4 = new com.appsflyer.internal.AFd1mSDK$2
                            r4.<init>(r1, r2)
                            r3.execute(r4)
                            return
                        L_0x008a:
                            java.lang.String r0 = java.lang.String.valueOf(r1)
                            java.lang.String r2 = "QUEUE: task was interrupted: "
                            java.lang.String r0 = r2.concat(r0)
                            com.appsflyer.AFLogger.afDebugLog(r0)
                            com.appsflyer.internal.AFd1sSDK r0 = com.appsflyer.internal.AFd1sSDK.TIMEOUT
                            r1.values = r0
                            com.appsflyer.internal.AFd1mSDK r0 = com.appsflyer.internal.AFd1mSDK.this
                            com.appsflyer.internal.AFd1sSDK r2 = com.appsflyer.internal.AFd1sSDK.TIMEOUT
                            java.util.concurrent.Executor r3 = r0.AFKeystoreWrapper
                            com.appsflyer.internal.AFd1mSDK$2 r4 = new com.appsflyer.internal.AFd1mSDK$2
                            r4.<init>(r1, r2)
                            r3.execute(r4)
                            return
                        L_0x00aa:
                            r1 = move-exception
                            monitor-exit(r0)
                            throw r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1mSDK.AnonymousClass1.run():void");
                    }
                });
            }
        }
    }
}
