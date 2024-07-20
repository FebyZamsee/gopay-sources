package com.google.firebase.sessions.api;

import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.openBrowserAction;
import o.openFallbackBrowserActionsMenu;

public final class FirebaseSessionsDependencies {
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();
    private static final Map<SessionSubscriber.Name, Dependency> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    private FirebaseSessionsDependencies() {
    }

    public final void addDependency(SessionSubscriber.Name name) {
        Intrinsics.checkNotNullParameter(name, "");
        if (name != SessionSubscriber.Name.PERFORMANCE) {
            Map<SessionSubscriber.Name, Dependency> map = dependencies;
            if (!map.containsKey(name)) {
                Intrinsics.checkNotNullExpressionValue(map, "");
                map.put(name, new Dependency(openBrowserAction.RemoteActionCompatParcelizer(true), (SessionSubscriber) null, 2, (DefaultConstructorMarker) null));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
    }

    public static final void register(SessionSubscriber sessionSubscriber) {
        Intrinsics.checkNotNullParameter(sessionSubscriber, "");
        Dependency dependency = INSTANCE.getDependency(sessionSubscriber.getSessionSubscriberName());
        if (dependency.getSubscriber() == null) {
            dependency.setSubscriber(sessionSubscriber);
            dependency.getMutex().read((Object) null);
        }
    }

    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(SessionSubscriber.Name name) {
        Intrinsics.checkNotNullParameter(name, "");
        SessionSubscriber subscriber = getDependency(name).getSubscriber();
        if (subscriber != null) {
            return subscriber;
        }
        StringBuilder sb = new StringBuilder("Subscriber ");
        sb.append(name);
        sb.append(" has not been registered.");
        throw new IllegalStateException(sb.toString());
    }

    private final Dependency getDependency(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, Dependency> map = dependencies;
        Intrinsics.checkNotNullExpressionValue(map, "");
        Dependency dependency = map.get(name);
        if (dependency != null) {
            Intrinsics.checkNotNullExpressionValue(dependency, "");
            return dependency;
        }
        StringBuilder sb = new StringBuilder("Cannot get dependency ");
        sb.append(name);
        sb.append(". Dependencies should be added at class load time.");
        throw new IllegalStateException(sb.toString());
    }

    static final class Dependency {
        private final openFallbackBrowserActionsMenu mutex;
        private SessionSubscriber subscriber;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            return Intrinsics.RemoteActionCompatParcelizer(this.mutex, dependency.mutex) && Intrinsics.RemoteActionCompatParcelizer(this.subscriber, dependency.subscriber);
        }

        public final int hashCode() {
            int hashCode = this.mutex.hashCode();
            SessionSubscriber sessionSubscriber = this.subscriber;
            return (hashCode * 31) + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dependency(mutex=");
            sb.append(this.mutex);
            sb.append(", subscriber=");
            sb.append(this.subscriber);
            sb.append(')');
            return sb.toString();
        }

        public Dependency(openFallbackBrowserActionsMenu openfallbackbrowseractionsmenu, SessionSubscriber sessionSubscriber) {
            Intrinsics.checkNotNullParameter(openfallbackbrowseractionsmenu, "");
            this.mutex = openfallbackbrowseractionsmenu;
            this.subscriber = sessionSubscriber;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Dependency(openFallbackBrowserActionsMenu openfallbackbrowseractionsmenu, SessionSubscriber sessionSubscriber, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(openfallbackbrowseractionsmenu, (i & 2) != 0 ? null : sessionSubscriber);
        }

        public final openFallbackBrowserActionsMenu getMutex() {
            return this.mutex;
        }

        public final SessionSubscriber getSubscriber() {
            return this.subscriber;
        }

        public final void setSubscriber(SessionSubscriber sessionSubscriber) {
            this.subscriber = sessionSubscriber;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.firebase.sessions.api.SessionSubscriber$Name} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(o.TooltipCompatHandler<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 + r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1 r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$getRegisteredSubscribers$1
            r0.<init>(r11, r12)
        L_0x0019:
            java.lang.Object r12 = r0.result
            o.TooltipCompatHandler$$ExternalSyntheticLambda1 r1 = o.TooltipCompatHandler$$ExternalSyntheticLambda1.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r2 = r0.L$5
            java.lang.Object r5 = r0.L$4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.L$3
            o.openFallbackBrowserActionsMenu r6 = (o.openFallbackBrowserActionsMenu) r6
            java.lang.Object r7 = r0.L$2
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.L$0
            java.util.Map r9 = (java.util.Map) r9
            boolean r10 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r10 != 0) goto L_0x0040
            goto L_0x00aa
        L_0x0040:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        L_0x0045:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x004d:
            boolean r2 = r12 instanceof o.setContentInsetsAbsolute.onTransact
            if (r2 != 0) goto L_0x00be
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency> r12 = dependencies
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r12.size()
            int r5 = o.updateNavigationIcon.RemoteActionCompatParcelizer((int) r5)
            r2.<init>(r5)
            java.util.Map r2 = (java.util.Map) r2
            java.util.Set r12 = r12.entrySet()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r8 = r12
            r5 = r2
        L_0x0073:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto L_0x00bd
            java.lang.Object r12 = r8.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r2 = r12.getKey()
            java.lang.Object r6 = r12.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r12 = r12.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$Dependency r12 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.Dependency) r12
            o.openFallbackBrowserActionsMenu r6 = r12.getMutex()
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r7
            r0.L$3 = r6
            r0.L$4 = r5
            r0.L$5 = r2
            r0.label = r3
            java.lang.Object r12 = r6.asInterface(r4, r0)
            if (r12 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r9 = r5
        L_0x00aa:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r12 = INSTANCE     // Catch:{ all -> 0x00b8 }
            com.google.firebase.sessions.api.SessionSubscriber r12 = r12.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch:{ all -> 0x00b8 }
            r6.read(r4)
            r5.put(r2, r12)
            r5 = r9
            goto L_0x0073
        L_0x00b8:
            r12 = move-exception
            r6.read(r4)
            throw r12
        L_0x00bd:
            return r5
        L_0x00be:
            o.setContentInsetsAbsolute$onTransact r12 = (o.setContentInsetsAbsolute.onTransact) r12
            java.lang.Throwable r12 = r12.RemoteActionCompatParcelizer
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(o.TooltipCompatHandler):java.lang.Object");
    }
}
