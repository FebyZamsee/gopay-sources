package com.google.android.exoplayer2.drm;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.core.location.LocationRequestCompat;
import com.google.android.exoplayer2.drm.DrmSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import o.AppCompatDelegateImpl;
import o.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0;
import o.DrawableContainerCompat;
import o.bypassOnPanelClosed;
import o.collapseItemActionView;
import o.createConfigurationContext;
import o.findMenuItemForSubmenu;
import o.generateConfigDelta_densityDpi;
import o.generateConfigDelta_locale;
import o.isPowerSaveMode;
import o.mapNightMode;
import o.onDestroyActionMode;
import o.selectDrawable;
import o.setCallback;
import o.setHotspot;
import o.setId;
import o.setLayoutDirection;
import o.setOnBackInvokedDispatcher;
import o.startAsSupportActionMode;

public final class DefaultDrmSession implements DrmSession {
    public final List<isPowerSaveMode.asBinder> AudioAttributesCompatParcelizer;
    final RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    final int AudioAttributesImplApi26Parcelizer;
    private DrawableContainerCompat.AnonymousClass1 AudioAttributesImplBaseParcelizer;
    final asBinder IconCompatParcelizer;
    private DrmSession.DrmSessionException MediaBrowserCompat$CustomActionResultReceiver;
    private final boolean MediaBrowserCompat$ItemReceiver;
    private final mapNightMode MediaBrowserCompat$MediaItem;
    private final HashMap<String, String> MediaBrowserCompat$SearchResultReceiver;
    private final asInterface MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    private final boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private onTransact MediaSessionCompat$ResultReceiverWrapper;
    private HandlerThread RatingCompat;
    final bypassOnPanelClosed RemoteActionCompatParcelizer;
    bypassOnPanelClosed.read asBinder;
    final collapseItemActionView asInterface;
    byte[] onConnected;
    final UUID onConnectionFailed;
    private final setCallback<generateConfigDelta_locale.asBinder> onConnectionSuspended;
    bypassOnPanelClosed.asInterface onTransact;
    final startAsSupportActionMode read;
    int setInternalConnectionCallback;
    byte[] write;

    public interface asBinder {
        void asBinder(Exception exc, boolean z);

        void onTransact();

        void onTransact(DefaultDrmSession defaultDrmSession);
    }

    public interface asInterface {
        void asBinder(DefaultDrmSession defaultDrmSession, int i);

        void asInterface(DefaultDrmSession defaultDrmSession);
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    public DefaultDrmSession(UUID uuid, bypassOnPanelClosed bypassonpanelclosed, asBinder asbinder, asInterface asinterface, List<isPowerSaveMode.asBinder> list, int i, boolean z, boolean z2, byte[] bArr, HashMap<String, String> hashMap, startAsSupportActionMode startassupportactionmode, Looper looper, collapseItemActionView collapseitemactionview, mapNightMode mapnightmode) {
        this.onConnectionFailed = uuid;
        this.IconCompatParcelizer = asbinder;
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = asinterface;
        this.RemoteActionCompatParcelizer = bypassonpanelclosed;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaDescriptionCompat = z2;
        if (bArr != null) {
            this.write = bArr;
            this.AudioAttributesCompatParcelizer = null;
        } else {
            this.AudioAttributesCompatParcelizer = Collections.unmodifiableList(list);
        }
        this.MediaBrowserCompat$SearchResultReceiver = hashMap;
        this.read = startassupportactionmode;
        this.onConnectionSuspended = new setCallback<>();
        this.asInterface = collapseitemactionview;
        this.MediaBrowserCompat$MediaItem = mapnightmode;
        this.setInternalConnectionCallback = 2;
        this.AudioAttributesImplApi21Parcelizer = new RemoteActionCompatParcelizer(looper);
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        bypassOnPanelClosed.asInterface asInterface2 = this.RemoteActionCompatParcelizer.asInterface();
        this.onTransact = asInterface2;
        this.MediaSessionCompat$ResultReceiverWrapper.obtainMessage(0, new read(selectDrawable.read.getAndIncrement(), true, SystemClock.elapsedRealtime(), asInterface2)).sendToTarget();
    }

    public final int asBinder() {
        return this.setInternalConnectionCallback;
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final DrmSession.DrmSessionException asInterface() {
        if (this.setInternalConnectionCallback == 1) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return null;
    }

    public final UUID onTransact() {
        return this.onConnectionFailed;
    }

    public final DrawableContainerCompat.AnonymousClass1 RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final Map<String, String> AudioAttributesCompatParcelizer() {
        byte[] bArr = this.onConnected;
        if (bArr == null) {
            return null;
        }
        return this.RemoteActionCompatParcelizer.asBinder(bArr);
    }

    public final boolean onTransact(String str) {
        bypassOnPanelClosed bypassonpanelclosed = this.RemoteActionCompatParcelizer;
        byte[] bArr = this.onConnected;
        if (bArr != null) {
            return bypassonpanelclosed.read(bArr, str);
        }
        throw new IllegalStateException();
    }

    public final void read(generateConfigDelta_locale.asBinder asbinder) {
        boolean z = false;
        if (this.MediaMetadataCompat < 0) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            this.MediaMetadataCompat = 0;
        }
        if (asbinder != null) {
            setCallback<generateConfigDelta_locale.asBinder> setcallback = this.onConnectionSuspended;
            synchronized (setcallback.RemoteActionCompatParcelizer) {
                ArrayList arrayList = new ArrayList(setcallback.asInterface);
                arrayList.add(asbinder);
                setcallback.asInterface = Collections.unmodifiableList(arrayList);
                Integer num = setcallback.asBinder.get(asbinder);
                if (num == null) {
                    HashSet hashSet = new HashSet(setcallback.read);
                    hashSet.add(asbinder);
                    setcallback.read = Collections.unmodifiableSet(hashSet);
                }
                setcallback.asBinder.put(asbinder, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.MediaMetadataCompat + 1;
        this.MediaMetadataCompat = i;
        if (i == 1) {
            if (this.setInternalConnectionCallback == 2) {
                z = true;
            }
            if (z) {
                HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
                this.RatingCompat = handlerThread;
                handlerThread.start();
                this.MediaSessionCompat$ResultReceiverWrapper = new onTransact(this.RatingCompat.getLooper());
                if (read()) {
                    RemoteActionCompatParcelizer(true);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (asbinder != null) {
            int i2 = this.setInternalConnectionCallback;
            if (i2 == 3 || i2 == 4) {
                z = true;
            }
            if (z && this.onConnectionSuspended.RemoteActionCompatParcelizer(asbinder) == 1) {
                asbinder.RemoteActionCompatParcelizer(this.setInternalConnectionCallback);
            }
        }
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.asInterface(this);
    }

    public final void asBinder(generateConfigDelta_locale.asBinder asbinder) {
        int i = this.MediaMetadataCompat;
        if (i <= 0) {
            synchronized (findMenuItemForSubmenu.read) {
            }
            return;
        }
        int i2 = i - 1;
        this.MediaMetadataCompat = i2;
        if (i2 == 0) {
            this.setInternalConnectionCallback = 0;
            this.AudioAttributesImplApi21Parcelizer.removeCallbacksAndMessages((Object) null);
            onTransact ontransact = this.MediaSessionCompat$ResultReceiverWrapper;
            synchronized (ontransact) {
                ontransact.removeCallbacksAndMessages((Object) null);
                ontransact.asInterface = true;
            }
            this.MediaSessionCompat$ResultReceiverWrapper = null;
            this.RatingCompat.quit();
            this.RatingCompat = null;
            this.AudioAttributesImplBaseParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.asBinder = null;
            this.onTransact = null;
            byte[] bArr = this.onConnected;
            if (bArr != null) {
                this.RemoteActionCompatParcelizer.read(bArr);
                this.onConnected = null;
            }
        }
        if (asbinder != null) {
            setCallback<generateConfigDelta_locale.asBinder> setcallback = this.onConnectionSuspended;
            synchronized (setcallback.RemoteActionCompatParcelizer) {
                Integer num = setcallback.asBinder.get(asbinder);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(setcallback.asInterface);
                    arrayList.remove(asbinder);
                    setcallback.asInterface = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        setcallback.asBinder.remove(asbinder);
                        HashSet hashSet = new HashSet(setcallback.read);
                        hashSet.remove(asbinder);
                        setcallback.read = Collections.unmodifiableSet(hashSet);
                    } else {
                        setcallback.asBinder.put(asbinder, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.onConnectionSuspended.RemoteActionCompatParcelizer(asbinder) == 0) {
                asbinder.read();
            }
        }
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.asBinder(this, this.MediaMetadataCompat);
    }

    /* access modifiers changed from: package-private */
    public final void RemoteActionCompatParcelizer(boolean z) {
        long j;
        Pair pair;
        if (!this.MediaDescriptionCompat) {
            byte[] bArr = this.onConnected;
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i == 0 || i == 1) {
                if (this.write == null) {
                    asInterface(bArr, 1, z);
                } else if (this.setInternalConnectionCallback == 4 || IconCompatParcelizer()) {
                    if (!setOnBackInvokedDispatcher.AudioAttributesImplApi26Parcelizer.equals(this.onConnectionFailed)) {
                        j = LocationRequestCompat.PASSIVE_INTERVAL;
                    } else {
                        Map<String, String> AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
                        if (AudioAttributesCompatParcelizer2 == null) {
                            pair = null;
                        } else {
                            pair = new Pair(Long.valueOf(setOnBackInvokedDispatcher.read(AudioAttributesCompatParcelizer2, "LicenseDurationRemaining")), Long.valueOf(setOnBackInvokedDispatcher.read(AudioAttributesCompatParcelizer2, "PlaybackDurationRemaining")));
                        }
                        Pair pair2 = pair;
                        j = Math.min(((Long) pair2.first).longValue(), ((Long) pair2.second).longValue());
                    }
                    if (this.AudioAttributesImplApi26Parcelizer == 0 && j <= 60) {
                        synchronized (findMenuItemForSubmenu.read) {
                        }
                        asInterface(bArr, 2, z);
                    } else if (j <= 0) {
                        RemoteActionCompatParcelizer(new KeysExpiredException(), 2);
                    } else {
                        this.setInternalConnectionCallback = 4;
                        onTransact((setId<generateConfigDelta_locale.asBinder>) new setLayoutDirection());
                    }
                }
            } else if (i != 2) {
                if (i == 3) {
                    asInterface(this.write, 3, z);
                }
            } else if (this.write == null || IconCompatParcelizer()) {
                asInterface(bArr, 2, z);
            }
        }
    }

    private boolean IconCompatParcelizer() {
        try {
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.onConnected, this.write);
            return true;
        } catch (Exception e) {
            RemoteActionCompatParcelizer(e, 1);
            return false;
        }
    }

    private void asInterface(byte[] bArr, int i, boolean z) {
        try {
            bypassOnPanelClosed.read onTransact2 = this.RemoteActionCompatParcelizer.onTransact(bArr, this.AudioAttributesCompatParcelizer, i, this.MediaBrowserCompat$SearchResultReceiver);
            this.asBinder = onTransact2;
            this.MediaSessionCompat$ResultReceiverWrapper.obtainMessage(1, new read(selectDrawable.read.getAndIncrement(), z, SystemClock.elapsedRealtime(), onTransact2)).sendToTarget();
        } catch (Exception e) {
            asBinder(e, true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void asBinder(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.IconCompatParcelizer.onTransact(this);
        } else {
            RemoteActionCompatParcelizer(exc, z ? 1 : 2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void RemoteActionCompatParcelizer(Exception exc, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new DrmSession.DrmSessionException(exc, AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0.onTransact(exc, i));
        findMenuItemForSubmenu.onTransact("DRM session error", exc);
        synchronized (findMenuItemForSubmenu.read) {
        }
        onTransact((setId<generateConfigDelta_locale.asBinder>) new createConfigurationContext(exc));
        if (this.setInternalConnectionCallback != 4) {
            this.setInternalConnectionCallback = 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void onTransact(setId<generateConfigDelta_locale.asBinder> setid) {
        for (generateConfigDelta_locale.asBinder onTransact2 : this.onConnectionSuspended.read()) {
            setid.onTransact(onTransact2);
        }
    }

    class RemoteActionCompatParcelizer extends Handler {
        public RemoteActionCompatParcelizer(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.onTransact) {
                    if (defaultDrmSession.setInternalConnectionCallback != 2) {
                        int i2 = defaultDrmSession.setInternalConnectionCallback;
                        if (!(i2 == 3 || i2 == 4)) {
                            return;
                        }
                    }
                    defaultDrmSession.onTransact = null;
                    if (obj2 instanceof Exception) {
                        defaultDrmSession.IconCompatParcelizer.asBinder((Exception) obj2, false);
                        return;
                    }
                    try {
                        defaultDrmSession.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((byte[]) obj2);
                        defaultDrmSession.IconCompatParcelizer.onTransact();
                    } catch (Exception e) {
                        defaultDrmSession.IconCompatParcelizer.asBinder(e, true);
                    }
                }
            } else if (i == 1) {
                DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
                if (obj == defaultDrmSession2.asBinder) {
                    int i3 = defaultDrmSession2.setInternalConnectionCallback;
                    if (i3 == 3 || i3 == 4) {
                        defaultDrmSession2.asBinder = null;
                        if (obj2 instanceof Exception) {
                            defaultDrmSession2.asBinder((Exception) obj2, false);
                            return;
                        }
                        try {
                            byte[] bArr = (byte[]) obj2;
                            if (defaultDrmSession2.AudioAttributesImplApi26Parcelizer == 3) {
                                defaultDrmSession2.RemoteActionCompatParcelizer.asInterface(defaultDrmSession2.write, bArr);
                                defaultDrmSession2.onTransact((setId<generateConfigDelta_locale.asBinder>) new AppCompatDelegateImpl.Api17Impl());
                                return;
                            }
                            byte[] asInterface = defaultDrmSession2.RemoteActionCompatParcelizer.asInterface(defaultDrmSession2.onConnected, bArr);
                            int i4 = defaultDrmSession2.AudioAttributesImplApi26Parcelizer;
                            if (!((i4 != 2 && (i4 != 0 || defaultDrmSession2.write == null)) || asInterface == null || asInterface.length == 0)) {
                                defaultDrmSession2.write = asInterface;
                            }
                            defaultDrmSession2.setInternalConnectionCallback = 4;
                            defaultDrmSession2.onTransact((setId<generateConfigDelta_locale.asBinder>) new onDestroyActionMode());
                        } catch (Exception e2) {
                            defaultDrmSession2.asBinder(e2, true);
                        }
                    }
                }
            }
        }
    }

    class onTransact extends Handler {
        boolean asInterface;

        public onTransact(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.google.android.exoplayer2.drm.MediaDrmCallbackException} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte[]} */
        /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
            	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
            	at java.util.ArrayList.get(ArrayList.java:435)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        public final void handleMessage(android.os.Message r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r5.obj
                com.google.android.exoplayer2.drm.DefaultDrmSession$read r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession.read) r0
                int r1 = r5.what     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                if (r1 == 0) goto L_0x0022
                r2 = 1
                if (r1 != r2) goto L_0x001c
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                o.startAsSupportActionMode r1 = r1.read     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                java.util.UUID r2 = r2.onConnectionFailed     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                java.lang.Object r3 = r0.asBinder     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                o.bypassOnPanelClosed$read r3 = (o.bypassOnPanelClosed.read) r3     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                byte[] r1 = r1.RemoteActionCompatParcelizer(r2, r3)     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                goto L_0x0046
            L_0x001c:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                r1.<init>()     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                throw r1     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
            L_0x0022:
                com.google.android.exoplayer2.drm.DefaultDrmSession r1 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                o.startAsSupportActionMode r1 = r1.read     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                java.util.UUID r2 = r2.onConnectionFailed     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                java.lang.Object r2 = r0.asBinder     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                o.bypassOnPanelClosed$asInterface r2 = (o.bypassOnPanelClosed.asInterface) r2     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                byte[] r1 = r1.asBinder(r2)     // Catch:{ MediaDrmCallbackException -> 0x003e, Exception -> 0x0033 }
                goto L_0x0046
            L_0x0033:
                r1 = move-exception
                java.lang.String r2 = "Key/provisioning request produced an unexpected exception. Not retrying."
                o.findMenuItemForSubmenu.onTransact(r2, r1)
                java.lang.Object r2 = o.findMenuItemForSubmenu.read
                monitor-enter(r2)
                monitor-exit(r2)
                goto L_0x0046
            L_0x003e:
                r1 = move-exception
                boolean r2 = r4.asInterface(r5, r1)
                if (r2 == 0) goto L_0x0046
                return
            L_0x0046:
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this
                o.collapseItemActionView r2 = r2.asInterface
                long r2 = r0.onTransact
                monitor-enter(r4)
                boolean r2 = r4.asInterface     // Catch:{ all -> 0x0066 }
                if (r2 != 0) goto L_0x0064
                com.google.android.exoplayer2.drm.DefaultDrmSession r2 = com.google.android.exoplayer2.drm.DefaultDrmSession.this     // Catch:{ all -> 0x0066 }
                com.google.android.exoplayer2.drm.DefaultDrmSession$RemoteActionCompatParcelizer r2 = r2.AudioAttributesImplApi21Parcelizer     // Catch:{ all -> 0x0066 }
                int r5 = r5.what     // Catch:{ all -> 0x0066 }
                java.lang.Object r0 = r0.asBinder     // Catch:{ all -> 0x0066 }
                android.util.Pair r0 = android.util.Pair.create(r0, r1)     // Catch:{ all -> 0x0066 }
                android.os.Message r5 = r2.obtainMessage(r5, r0)     // Catch:{ all -> 0x0066 }
                r5.sendToTarget()     // Catch:{ all -> 0x0066 }
            L_0x0064:
                monitor-exit(r4)
                return
            L_0x0066:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.onTransact.handleMessage(android.os.Message):void");
        }

        private boolean asInterface(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            IOException iOException;
            MediaDrmCallbackException mediaDrmCallbackException2 = mediaDrmCallbackException;
            read read = (read) message.obj;
            if (!read.asInterface) {
                return false;
            }
            read.read++;
            if (read.read > DefaultDrmSession.this.asInterface.asBinder(3)) {
                return false;
            }
            selectDrawable selectdrawable = new selectDrawable(read.onTransact, mediaDrmCallbackException2.asBinder, mediaDrmCallbackException2.asInterface, mediaDrmCallbackException2.onTransact, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - read.RemoteActionCompatParcelizer, mediaDrmCallbackException2.RemoteActionCompatParcelizer);
            setHotspot sethotspot = new setHotspot(3);
            if (mediaDrmCallbackException.getCause() instanceof IOException) {
                iOException = (IOException) mediaDrmCallbackException.getCause();
            } else {
                iOException = new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause());
            }
            long read2 = DefaultDrmSession.this.asInterface.read(new collapseItemActionView.asBinder(selectdrawable, sethotspot, iOException, read.read));
            if (read2 == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                if (this.asInterface) {
                    return false;
                }
                sendMessageDelayed(Message.obtain(message), read2);
                return true;
            }
        }
    }

    static final class read {
        public final long RemoteActionCompatParcelizer;
        public final Object asBinder;
        public final boolean asInterface;
        public final long onTransact;
        public int read;

        public read(long j, boolean z, long j2, Object obj) {
            this.onTransact = j;
            this.asInterface = z;
            this.RemoteActionCompatParcelizer = j2;
            this.asBinder = obj;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean read() {
        int i = this.setInternalConnectionCallback;
        if (i == 3 || i == 4) {
            return true;
        }
        try {
            byte[] onTransact2 = this.RemoteActionCompatParcelizer.onTransact();
            this.onConnected = onTransact2;
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onTransact2, this.MediaBrowserCompat$MediaItem);
            this.AudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer.onTransact(this.onConnected);
            this.setInternalConnectionCallback = 3;
            onTransact((setId<generateConfigDelta_locale.asBinder>) new generateConfigDelta_densityDpi());
            return true;
        } catch (NotProvisionedException unused) {
            this.IconCompatParcelizer.onTransact(this);
            return false;
        } catch (Exception e) {
            RemoteActionCompatParcelizer(e, 1);
            return false;
        }
    }
}
