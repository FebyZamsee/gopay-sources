package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.work.PeriodicWorkRequest;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o.AppCompatDelegateImpl;
import o.AppCompatImageButton;
import o.BaseMenuPresenter;
import o.OnBackPressedDispatcher;
import o.asInterface;
import o.bypassOnContentChanged;
import o.bypassOnPanelClosed;
import o.collapseItemActionView;
import o.createPopupWindow;
import o.dispatchKeyShortcutEvent;
import o.findMenuItemForSubmenu;
import o.generateConfigDelta_locale;
import o.getKeyListener;
import o.getLocales;
import o.getSampleTile;
import o.isPowerSaveMode;
import o.mapNightMode;
import o.onWindowStartingActionMode;
import o.setActionBarCallback;
import o.setLocale;
import o.setMultiChoiceItems;
import o.setOnBackInvokedDispatcher;
import o.startAsSupportActionMode;
import o.tileify;

public final class DefaultDrmSessionManager implements bypassOnContentChanged {
    public final Set<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer;
    public Looper AudioAttributesImplApi21Parcelizer;
    public int AudioAttributesImplApi26Parcelizer;
    final asBinder AudioAttributesImplBaseParcelizer;
    DefaultDrmSession IconCompatParcelizer;
    private final bypassOnPanelClosed.RemoteActionCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final HashMap<String, String> MediaBrowserCompat$ItemReceiver;
    private final boolean MediaBrowserCompat$MediaItem;
    private bypassOnPanelClosed MediaBrowserCompat$SearchResultReceiver;
    private mapNightMode MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    private final collapseItemActionView MediaDescriptionCompat;
    private final int[] MediaMetadataCompat;
    private final boolean MediaSessionCompat$QueueItem;
    private final AudioAttributesImplApi26Parcelizer MediaSessionCompat$ResultReceiverWrapper;
    private final UUID RatingCompat;
    volatile onTransact RemoteActionCompatParcelizer;
    DefaultDrmSession asBinder;
    public byte[] asInterface;
    final long onConnected;
    public final List<DefaultDrmSession> onConnectionSuspended;
    final Set<DefaultDrmSession> onTransact;
    public int read;
    private final startAsSupportActionMode setInternalConnectionCallback;
    Handler write;

    public /* synthetic */ DefaultDrmSessionManager(UUID uuid, bypassOnPanelClosed.RemoteActionCompatParcelizer remoteActionCompatParcelizer, startAsSupportActionMode startassupportactionmode, HashMap hashMap, boolean z, int[] iArr, boolean z2, collapseItemActionView collapseitemactionview, long j, byte b) {
        this(uuid, remoteActionCompatParcelizer, startassupportactionmode, hashMap, z, iArr, z2, collapseitemactionview, j);
    }

    public static final class read {
        public long AudioAttributesCompatParcelizer = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        public int[] IconCompatParcelizer = new int[0];
        public boolean RemoteActionCompatParcelizer;
        public collapseItemActionView asBinder = new BaseMenuPresenter();
        public bypassOnPanelClosed.RemoteActionCompatParcelizer asInterface = onWindowStartingActionMode.onTransact;
        public boolean onTransact;
        public final HashMap<String, String> read = new HashMap<>();
        public UUID write = setOnBackInvokedDispatcher.AudioAttributesImplApi26Parcelizer;

        public final read read(int... iArr) {
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                boolean z = true;
                if (!(i2 == 2 || i2 == 1)) {
                    z = false;
                }
                if (z) {
                    i++;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            this.IconCompatParcelizer = (int[]) iArr.clone();
            return this;
        }
    }

    public static final class MissingSchemeDataException extends Exception {
        /* synthetic */ MissingSchemeDataException(UUID uuid, byte b) {
            this(uuid);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private MissingSchemeDataException(java.util.UUID r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Media does not support uuid: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException.<init>(java.util.UUID):void");
        }
    }

    private DefaultDrmSessionManager(UUID uuid, bypassOnPanelClosed.RemoteActionCompatParcelizer remoteActionCompatParcelizer, startAsSupportActionMode startassupportactionmode, HashMap<String, String> hashMap, boolean z, int[] iArr, boolean z2, collapseItemActionView collapseitemactionview, long j) {
        if (!setOnBackInvokedDispatcher.RemoteActionCompatParcelizer.equals(uuid)) {
            this.RatingCompat = uuid;
            this.MediaBrowserCompat$CustomActionResultReceiver = remoteActionCompatParcelizer;
            this.setInternalConnectionCallback = startassupportactionmode;
            this.MediaBrowserCompat$ItemReceiver = hashMap;
            this.MediaBrowserCompat$MediaItem = z;
            this.MediaMetadataCompat = iArr;
            this.MediaSessionCompat$QueueItem = z2;
            this.MediaDescriptionCompat = collapseitemactionview;
            this.AudioAttributesImplBaseParcelizer = new asBinder();
            this.MediaSessionCompat$ResultReceiverWrapper = new AudioAttributesImplApi26Parcelizer(this, (byte) 0);
            this.read = 0;
            this.onConnectionSuspended = new ArrayList();
            this.AudioAttributesCompatParcelizer = Collections.newSetFromMap(new IdentityHashMap());
            this.onTransact = Collections.newSetFromMap(new IdentityHashMap());
            this.onConnected = j;
            return;
        }
        throw new IllegalArgumentException("Use C.CLEARKEY_UUID instead");
    }

    public final void read() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        this.AudioAttributesImplApi26Parcelizer = i + 1;
        if (i == 0) {
            if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                bypassOnPanelClosed read2 = this.MediaBrowserCompat$CustomActionResultReceiver.read(this.RatingCompat);
                this.MediaBrowserCompat$SearchResultReceiver = read2;
                read2.onTransact((bypassOnPanelClosed.asBinder) new asInterface(this, (byte) 0));
            } else if (this.onConnected != -9223372036854775807L) {
                for (int i2 = 0; i2 < this.onConnectionSuspended.size(); i2++) {
                    this.onConnectionSuspended.get(i2).read((generateConfigDelta_locale.asBinder) null);
                }
            }
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int i = this.AudioAttributesImplApi26Parcelizer - 1;
        this.AudioAttributesImplApi26Parcelizer = i;
        if (i == 0) {
            if (this.onConnected != -9223372036854775807L) {
                ArrayList arrayList = new ArrayList(this.onConnectionSuspended);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ((DefaultDrmSession) arrayList.get(i2)).asBinder((generateConfigDelta_locale.asBinder) null);
                }
            }
            onTransact();
            asInterface();
        }
    }

    public final void onTransact(Looper looper, mapNightMode mapnightmode) {
        synchronized (this) {
            Looper looper2 = this.AudioAttributesImplApi21Parcelizer;
            if (looper2 == null) {
                this.AudioAttributesImplApi21Parcelizer = looper;
                this.write = new Handler(looper);
            } else {
                if (!(looper2 == looper)) {
                    throw new IllegalStateException();
                }
            }
        }
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mapnightmode;
    }

    public final bypassOnContentChanged.onTransact read(generateConfigDelta_locale.asBinder asbinder, setMultiChoiceItems setmultichoiceitems) {
        if (!(this.AudioAttributesImplApi26Parcelizer > 0)) {
            throw new IllegalStateException();
        } else if (this.AudioAttributesImplApi21Parcelizer != null) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(asbinder);
            DefaultDrmSessionManager.this.write.post(new AppCompatDelegateImpl.Api21Impl(remoteActionCompatParcelizer, setmultichoiceitems));
            return remoteActionCompatParcelizer;
        } else {
            throw new IllegalStateException();
        }
    }

    public final DrmSession RemoteActionCompatParcelizer(generateConfigDelta_locale.asBinder asbinder, setMultiChoiceItems setmultichoiceitems) {
        if (this.AudioAttributesImplApi26Parcelizer > 0) {
            Looper looper = this.AudioAttributesImplApi21Parcelizer;
            if (looper != null) {
                return read(looper, asbinder, setmultichoiceitems, true);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int asInterface(o.setMultiChoiceItems r7) {
        /*
            r6 = this;
            o.bypassOnPanelClosed r0 = r6.MediaBrowserCompat$SearchResultReceiver
            o.bypassOnPanelClosed r0 = (o.bypassOnPanelClosed) r0
            int r0 = r0.asBinder()
            o.isPowerSaveMode r1 = r7.addOnTrimMemoryListener
            r2 = 0
            if (r1 != 0) goto L_0x0027
            java.lang.String r7 = r7.f17lambda$new$1$androidxactivityComponentActivity
            int r7 = o.createPopupWindow.asInterface(r7)
            int[] r1 = r6.MediaMetadataCompat
            r3 = 0
        L_0x0016:
            int r4 = r1.length
            r5 = -1
            if (r3 >= r4) goto L_0x0022
            r4 = r1[r3]
            if (r4 != r7) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0022:
            r3 = -1
        L_0x0023:
            if (r3 != r5) goto L_0x0026
            r0 = 0
        L_0x0026:
            return r0
        L_0x0027:
            o.isPowerSaveMode r7 = r7.addOnTrimMemoryListener
            byte[] r1 = r6.asInterface
            r3 = 1
            if (r1 != 0) goto L_0x007a
            java.util.UUID r1 = r6.RatingCompat
            java.util.List r1 = read(r7, r1, r3)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x004e
            int r1 = r7.onTransact
            if (r1 != r3) goto L_0x007b
            o.isPowerSaveMode$asBinder[] r1 = r7.RemoteActionCompatParcelizer
            r1 = r1[r2]
            java.util.UUID r4 = o.setOnBackInvokedDispatcher.RemoteActionCompatParcelizer
            boolean r1 = r1.RemoteActionCompatParcelizer(r4)
            if (r1 == 0) goto L_0x007b
            java.lang.Object r1 = o.findMenuItemForSubmenu.read
            monitor-enter(r1)
            monitor-exit(r1)
        L_0x004e:
            java.lang.String r7 = r7.asInterface
            if (r7 == 0) goto L_0x007a
            java.lang.String r1 = "cenc"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x007a
            java.lang.String r1 = "cbcs"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0069
            int r7 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            r1 = 25
            if (r7 >= r1) goto L_0x007a
            goto L_0x007b
        L_0x0069:
            java.lang.String r1 = "cbc1"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x007b
            java.lang.String r1 = "cens"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r2 = 1
        L_0x007b:
            if (r2 != 0) goto L_0x007e
            r0 = 1
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.asInterface(o.setMultiChoiceItems):int");
    }

    private DefaultDrmSession onTransact(List<isPowerSaveMode.asBinder> list, boolean z, generateConfigDelta_locale.asBinder asbinder, boolean z2) {
        DefaultDrmSession asInterface2 = asInterface(list, z, asbinder);
        if (asBinder(asInterface2) && !this.onTransact.isEmpty()) {
            asBinder();
            asInterface2.asBinder(asbinder);
            if (this.onConnected != -9223372036854775807L) {
                asInterface2.asBinder((generateConfigDelta_locale.asBinder) null);
            }
            asInterface2 = asInterface(list, z, asbinder);
        }
        if (!asBinder(asInterface2) || !z2 || this.AudioAttributesCompatParcelizer.isEmpty()) {
            return asInterface2;
        }
        onTransact();
        if (!this.onTransact.isEmpty()) {
            asBinder();
        }
        asInterface2.asBinder(asbinder);
        if (this.onConnected != -9223372036854775807L) {
            asInterface2.asBinder((generateConfigDelta_locale.asBinder) null);
        }
        return asInterface(list, z, asbinder);
    }

    private static boolean asBinder(DrmSession drmSession) {
        if (drmSession.asBinder() != 1 || (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 19 && !(drmSession.asInterface().getCause() instanceof ResourceBusyException))) {
            return false;
        }
        return true;
    }

    private void asBinder() {
        tileify<DefaultDrmSession> IconCompatParcelizer2 = AppCompatImageButton.RemoteActionCompatParcelizer(this.onTransact).iterator();
        while (IconCompatParcelizer2.hasNext()) {
            IconCompatParcelizer2.next().asBinder((generateConfigDelta_locale.asBinder) null);
        }
    }

    private void onTransact() {
        tileify<RemoteActionCompatParcelizer> IconCompatParcelizer2 = AppCompatImageButton.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer).iterator();
        while (IconCompatParcelizer2.hasNext()) {
            RemoteActionCompatParcelizer next = IconCompatParcelizer2.next();
            OnBackPressedDispatcher.Api33Impl.onTransact(DefaultDrmSessionManager.this.write, (Runnable) new setLocale(next));
        }
    }

    private DefaultDrmSession asInterface(List<isPowerSaveMode.asBinder> list, boolean z, generateConfigDelta_locale.asBinder asbinder) {
        bypassOnPanelClosed bypassonpanelclosed = this.MediaBrowserCompat$SearchResultReceiver;
        boolean z2 = this.MediaSessionCompat$QueueItem;
        collapseItemActionView collapseitemactionview = this.MediaDescriptionCompat;
        List<isPowerSaveMode.asBinder> list2 = list;
        DefaultDrmSession defaultDrmSession = r1;
        DefaultDrmSession defaultDrmSession2 = new DefaultDrmSession(this.RatingCompat, bypassonpanelclosed, this.AudioAttributesImplBaseParcelizer, this.MediaSessionCompat$ResultReceiverWrapper, list2, 0, z2 | z, z, this.asInterface, this.MediaBrowserCompat$ItemReceiver, this.setInternalConnectionCallback, this.AudioAttributesImplApi21Parcelizer, collapseitemactionview, this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver);
        defaultDrmSession.read(asbinder);
        DefaultDrmSession defaultDrmSession3 = defaultDrmSession;
        if (this.onConnected != -9223372036854775807L) {
            defaultDrmSession3.read((generateConfigDelta_locale.asBinder) null);
        }
        return defaultDrmSession3;
    }

    /* access modifiers changed from: package-private */
    public final void asInterface() {
        if (this.MediaBrowserCompat$SearchResultReceiver != null && this.AudioAttributesImplApi26Parcelizer == 0 && this.onConnectionSuspended.isEmpty() && this.AudioAttributesCompatParcelizer.isEmpty()) {
            this.MediaBrowserCompat$SearchResultReceiver.read();
            this.MediaBrowserCompat$SearchResultReceiver = null;
        }
    }

    private static List<isPowerSaveMode.asBinder> read(isPowerSaveMode ispowersavemode, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(ispowersavemode.onTransact);
        for (int i = 0; i < ispowersavemode.onTransact; i++) {
            isPowerSaveMode.asBinder asbinder = ispowersavemode.RemoteActionCompatParcelizer[i];
            if ((asbinder.RemoteActionCompatParcelizer(uuid) || (setOnBackInvokedDispatcher.read.equals(uuid) && asbinder.RemoteActionCompatParcelizer(setOnBackInvokedDispatcher.RemoteActionCompatParcelizer))) && (asbinder.onTransact != null || z)) {
                arrayList.add(asbinder);
            }
        }
        return arrayList;
    }

    class onTransact extends Handler {
        public onTransact(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr != null) {
                for (DefaultDrmSession next : DefaultDrmSessionManager.this.onConnectionSuspended) {
                    if (Arrays.equals(next.onConnected, bArr)) {
                        if (message.what == 2 && next.AudioAttributesImplApi26Parcelizer == 0 && next.setInternalConnectionCallback == 4) {
                            byte[] bArr2 = next.onConnected;
                            next.RemoteActionCompatParcelizer(false);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    class asBinder implements DefaultDrmSession.asBinder {
        DefaultDrmSession RemoteActionCompatParcelizer;
        final Set<DefaultDrmSession> asBinder = new HashSet();

        public final void onTransact(DefaultDrmSession defaultDrmSession) {
            this.asBinder.add(defaultDrmSession);
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = defaultDrmSession;
                defaultDrmSession.AudioAttributesImplApi26Parcelizer();
            }
        }

        public final void onTransact() {
            getSampleTile<Object> getsampletile;
            this.RemoteActionCompatParcelizer = null;
            getKeyListener<DefaultDrmSession> asInterface = getKeyListener.asInterface(this.asBinder);
            this.asBinder.clear();
            int size = asInterface.size();
            if (size >= 0) {
                if (asInterface.isEmpty()) {
                    getsampletile = getKeyListener.onTransact;
                } else {
                    getsampletile = new getKeyListener.onTransact<>(asInterface, 0);
                }
                while (getsampletile.hasNext()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) getsampletile.next();
                    if (defaultDrmSession.read()) {
                        defaultDrmSession.RemoteActionCompatParcelizer(true);
                    }
                }
                return;
            }
            throw new IndexOutOfBoundsException(asInterface.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0, size, "index"));
        }

        public final void asBinder(Exception exc, boolean z) {
            getSampleTile<Object> getsampletile;
            this.RemoteActionCompatParcelizer = null;
            getKeyListener<DefaultDrmSession> asInterface = getKeyListener.asInterface(this.asBinder);
            this.asBinder.clear();
            int size = asInterface.size();
            if (size >= 0) {
                if (asInterface.isEmpty()) {
                    getsampletile = getKeyListener.onTransact;
                } else {
                    getsampletile = new getKeyListener.onTransact<>(asInterface, 0);
                }
                while (getsampletile.hasNext()) {
                    ((DefaultDrmSession) getsampletile.next()).RemoteActionCompatParcelizer(exc, z ? 1 : 3);
                }
                return;
            }
            throw new IndexOutOfBoundsException(asInterface.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0, size, "index"));
        }
    }

    class AudioAttributesImplApi26Parcelizer implements DefaultDrmSession.asInterface {
        private AudioAttributesImplApi26Parcelizer() {
        }

        /* synthetic */ AudioAttributesImplApi26Parcelizer(DefaultDrmSessionManager defaultDrmSessionManager, byte b) {
            this();
        }

        public final void asInterface(DefaultDrmSession defaultDrmSession) {
            if (DefaultDrmSessionManager.this.onConnected != -9223372036854775807L) {
                DefaultDrmSessionManager.this.onTransact.remove(defaultDrmSession);
                DefaultDrmSessionManager.this.write.removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        public final void asBinder(DefaultDrmSession defaultDrmSession, int i) {
            if (i == 1 && DefaultDrmSessionManager.this.AudioAttributesImplApi26Parcelizer > 0 && DefaultDrmSessionManager.this.onConnected != -9223372036854775807L) {
                DefaultDrmSessionManager.this.onTransact.add(defaultDrmSession);
                DefaultDrmSessionManager.this.write.postAtTime(new getLocales(defaultDrmSession), defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.onConnected);
            } else if (i == 0) {
                DefaultDrmSessionManager.this.onConnectionSuspended.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.IconCompatParcelizer == defaultDrmSession) {
                    DefaultDrmSessionManager.this.IconCompatParcelizer = null;
                }
                if (DefaultDrmSessionManager.this.asBinder == defaultDrmSession) {
                    DefaultDrmSessionManager.this.asBinder = null;
                }
                asBinder asbinder = DefaultDrmSessionManager.this.AudioAttributesImplBaseParcelizer;
                asbinder.asBinder.remove(defaultDrmSession);
                if (asbinder.RemoteActionCompatParcelizer == defaultDrmSession) {
                    asbinder.RemoteActionCompatParcelizer = null;
                    if (!asbinder.asBinder.isEmpty()) {
                        DefaultDrmSession next = asbinder.asBinder.iterator().next();
                        asbinder.RemoteActionCompatParcelizer = next;
                        next.AudioAttributesImplApi26Parcelizer();
                    }
                }
                if (DefaultDrmSessionManager.this.onConnected != -9223372036854775807L) {
                    DefaultDrmSessionManager.this.write.removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.onTransact.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.asInterface();
        }
    }

    class asInterface implements bypassOnPanelClosed.asBinder {
        private asInterface() {
        }

        /* synthetic */ asInterface(DefaultDrmSessionManager defaultDrmSessionManager, byte b) {
            this();
        }

        public final void RemoteActionCompatParcelizer(byte[] bArr, int i) {
            DefaultDrmSessionManager.this.RemoteActionCompatParcelizer.obtainMessage(i, bArr).sendToTarget();
        }
    }

    public class RemoteActionCompatParcelizer implements bypassOnContentChanged.onTransact {
        public boolean RemoteActionCompatParcelizer;
        public final generateConfigDelta_locale.asBinder asBinder;
        public DrmSession asInterface;

        public RemoteActionCompatParcelizer(generateConfigDelta_locale.asBinder asbinder) {
            this.asBinder = asbinder;
        }

        public final void RemoteActionCompatParcelizer() {
            OnBackPressedDispatcher.Api33Impl.onTransact(DefaultDrmSessionManager.this.write, (Runnable) new setLocale(this));
        }
    }

    public final DrmSession read(Looper looper, generateConfigDelta_locale.asBinder asbinder, setMultiChoiceItems setmultichoiceitems, boolean z) {
        List<isPowerSaveMode.asBinder> list;
        boolean z2;
        if (this.RemoteActionCompatParcelizer == null) {
            this.RemoteActionCompatParcelizer = new onTransact(looper);
        }
        DefaultDrmSession defaultDrmSession = null;
        int i = 0;
        if (setmultichoiceitems.addOnTrimMemoryListener == null) {
            int asInterface2 = createPopupWindow.asInterface(setmultichoiceitems.f17lambda$new$1$androidxactivityComponentActivity);
            bypassOnPanelClosed bypassonpanelclosed = this.MediaBrowserCompat$SearchResultReceiver;
            if (!(bypassonpanelclosed.asBinder() == 2 && dispatchKeyShortcutEvent.asBinder)) {
                int[] iArr = this.MediaMetadataCompat;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    } else if (iArr[i] == asInterface2) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!(i == -1 || bypassonpanelclosed.asBinder() == 1)) {
                    DefaultDrmSession defaultDrmSession2 = this.IconCompatParcelizer;
                    if (defaultDrmSession2 == null) {
                        DefaultDrmSession onTransact2 = onTransact(getKeyListener.write(), true, (generateConfigDelta_locale.asBinder) null, z);
                        this.onConnectionSuspended.add(onTransact2);
                        this.IconCompatParcelizer = onTransact2;
                    } else {
                        defaultDrmSession2.read((generateConfigDelta_locale.asBinder) null);
                    }
                    return this.IconCompatParcelizer;
                }
            }
            return null;
        }
        if (this.asInterface == null) {
            list = read(setmultichoiceitems.addOnTrimMemoryListener, this.RatingCompat, false);
            if (list.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.RatingCompat, (byte) 0);
                findMenuItemForSubmenu.onTransact("DRM error", missingSchemeDataException);
                synchronized (findMenuItemForSubmenu.read) {
                }
                if (asbinder != null) {
                    asbinder.onTransact(missingSchemeDataException);
                }
                return new setActionBarCallback(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            list = null;
        }
        if (this.MediaBrowserCompat$MediaItem) {
            Iterator<DefaultDrmSession> it = this.onConnectionSuspended.iterator();
            while (true) {
                if (it.hasNext()) {
                    DefaultDrmSession next = it.next();
                    List<isPowerSaveMode.asBinder> list2 = next.AudioAttributesCompatParcelizer;
                    if (list2 != null) {
                        z2 = list2.equals(list);
                        continue;
                    } else if (list == null) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        defaultDrmSession = next;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            defaultDrmSession = this.asBinder;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = onTransact(list, false, asbinder, z);
            if (!this.MediaBrowserCompat$MediaItem) {
                this.asBinder = defaultDrmSession;
            }
            this.onConnectionSuspended.add(defaultDrmSession);
        } else {
            defaultDrmSession.read(asbinder);
        }
        return defaultDrmSession;
    }
}
