package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.ActionBar;
import o.ActivityResultContracts;
import o.AnimatedStateListDrawableCompat;
import o.AppCompatDelegateImpl;
import o.DrawableContainerCompat;
import o.OnBackPressedDispatcher;
import o.applyButtonTint;
import o.createFromXmlInner;
import o.dispatchKeyShortcutEvent;
import o.findMenuItemForSubmenu;
import o.generateConfigDelta_locale;
import o.onCloseSubMenu;
import o.onOpenSubMenu;
import o.onSubMenuSelected;
import o.setMultiChoiceItems;
import o.setNegativeButton;
import o.setOnBackInvokedDispatcher;
import o.setShowTitle;
import o.setTitleOptionalHint;
import o.updateNavigationIcon;

public abstract class MediaCodecRenderer extends ActionBar.TabListener {
    private static final byte[] RemoteActionCompatParcelizer = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public onOpenSubMenu AudioAttributesCompatParcelizer;
    private final DecoderInputBuffer AudioAttributesImplApi21Parcelizer = new DecoderInputBuffer(0);
    public ExoPlaybackException AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean Cancellable;
    private boolean ComponentActivity;
    public boolean IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$ItemReceiver;
    private final onSubMenuSelected.asBinder MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    private DrmSession MediaDescriptionCompat;
    private setMultiChoiceItems MediaMetadataCompat;
    private createFromXmlInner MediaSessionCompat$QueueItem;
    private long MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token;
    private boolean ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction;
    private boolean RatingCompat;
    private MediaFormat access$001;
    private boolean addContentView;
    private boolean addMenuProvider;
    private int addOnConfigurationChangedListener;
    private boolean addOnContextAvailableListener;
    private boolean addOnMultiWindowModeChangedListener;
    private final ArrayList<Long> addOnNewIntentListener;
    private int addOnPictureInPictureModeChangedListener;
    private float addOnTrimMemoryListener;
    private final float asBinder;
    private ArrayDeque<createFromXmlInner> asInterface;
    private boolean cancel;
    private boolean createFullyDrawnExecutor;
    private final boolean ensureViewModelStore;
    private setMultiChoiceItems getActivityResultRegistry;
    private boolean getDefaultViewModelCreationExtras;
    private long getDefaultViewModelProviderFactory;
    private boolean getFullyDrawnReporter;
    private long getLastCustomNonConfigurationInstance;
    private boolean getLifecycle;
    private boolean getOnBackPressedDispatcher;
    private MediaCrypto getSavedStateRegistry;
    private boolean getViewModelStore;
    private float initViewTreeOwners;
    private final AnimatedStateListDrawableCompat invalidateMenu;

    /* renamed from: lambda$new$0$androidx-activity-ComponentActivity  reason: not valid java name */
    private long f3lambda$new$0$androidxactivityComponentActivity;

    /* renamed from: lambda$new$1$androidx-activity-ComponentActivity  reason: not valid java name */
    private final MediaCodec.BufferInfo f4lambda$new$1$androidxactivityComponentActivity;

    /* renamed from: lambda$new$2$androidx-activity-ComponentActivity  reason: not valid java name */
    private int f5lambda$new$2$androidxactivityComponentActivity;
    private setMultiChoiceItems onActivityResult;
    private final DecoderInputBuffer onBackPressed = new DecoderInputBuffer(0);
    private ByteBuffer onConfigurationChanged;
    private final DecoderInputBuffer onConnected = new DecoderInputBuffer(2);
    private onCloseSubMenu onConnectionFailed;
    private boolean onConnectionSuspended;
    private boolean onCreate;
    private DecoderInitializationException onCreatePanelMenu;
    private long onMenuItemSelected;
    private onTransact onMultiWindowModeChanged;
    private final ArrayDeque<onTransact> onNewIntent;
    private float onPanelClosed;
    private boolean onPictureInPictureModeChanged;
    private DrmSession onPreparePanel;
    private boolean onRequestPermissionsResult;
    public onSubMenuSelected read;
    private boolean setInternalConnectionCallback;
    private final setTitleOptionalHint write;

    public void Cancellable() {
    }

    public void MediaBrowserCompat$MediaItem() {
    }

    public void MediaDescriptionCompat() {
    }

    public final int MediaSessionCompat$QueueItem() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public void ParcelableVolumeInfo() throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    public abstract List<createFromXmlInner> RemoteActionCompatParcelizer(AnimatedStateListDrawableCompat animatedStateListDrawableCompat, setMultiChoiceItems setmultichoiceitems, boolean z) throws MediaCodecUtil.DecoderQueryException;

    /* access modifiers changed from: protected */
    public void RemoteActionCompatParcelizer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    public void RemoteActionCompatParcelizer(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    public boolean RemoteActionCompatParcelizer(setMultiChoiceItems setmultichoiceitems) {
        return false;
    }

    /* access modifiers changed from: protected */
    public float asBinder(float f, setMultiChoiceItems[] setmultichoiceitemsArr) {
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    public abstract onSubMenuSelected.RemoteActionCompatParcelizer asBinder(createFromXmlInner createfromxmlinner, setMultiChoiceItems setmultichoiceitems, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    public boolean asBinder(createFromXmlInner createfromxmlinner) {
        return true;
    }

    /* access modifiers changed from: protected */
    public void asInterface(Exception exc) {
    }

    /* access modifiers changed from: protected */
    public void asInterface(String str) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean asInterface(long j, long j2, onSubMenuSelected onsubmenuselected, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, setMultiChoiceItems setmultichoiceitems) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    public boolean initViewTreeOwners() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onTransact(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    public abstract int read(AnimatedStateListDrawableCompat animatedStateListDrawableCompat, setMultiChoiceItems setmultichoiceitems) throws MediaCodecUtil.DecoderQueryException;

    /* access modifiers changed from: protected */
    public void read(setMultiChoiceItems setmultichoiceitems, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    public static class DecoderInitializationException extends Exception {
        private DecoderInitializationException RemoteActionCompatParcelizer;
        public final createFromXmlInner asBinder;
        public final String asInterface;
        public final boolean onTransact;
        public final String read;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(o.setMultiChoiceItems r11, java.lang.Throwable r12, boolean r13, int r14) {
            /*
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Decoder init failed: ["
                r0.<init>(r1)
                r0.append(r14)
                java.lang.String r1 = "], "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.f17lambda$new$1$androidxactivityComponentActivity
                if (r14 >= 0) goto L_0x001d
                java.lang.String r11 = "neg_"
                goto L_0x001f
            L_0x001d:
                java.lang.String r11 = ""
            L_0x001f:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                r0.<init>(r1)
                r0.append(r11)
                int r11 = java.lang.Math.abs(r14)
                r0.append(r11)
                java.lang.String r8 = r0.toString()
                r7 = 0
                r9 = 0
                r2 = r10
                r4 = r12
                r6 = r13
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(o.setMultiChoiceItems, java.lang.Throwable, boolean, int):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(o.setMultiChoiceItems r11, java.lang.Throwable r12, boolean r13, o.createFromXmlInner r14) {
            /*
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Decoder init failed: "
                r0.<init>(r1)
                java.lang.String r1 = r14.onTransact
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.f17lambda$new$1$androidxactivityComponentActivity
                int r11 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
                r0 = 0
                r1 = 21
                if (r11 < r1) goto L_0x002c
                boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
                if (r11 == 0) goto L_0x002c
                r11 = r12
                android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
                java.lang.String r0 = r11.getDiagnosticInfo()
            L_0x002c:
                r8 = r0
                r9 = 0
                r2 = r10
                r4 = r12
                r6 = r13
                r7 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(o.setMultiChoiceItems, java.lang.Throwable, boolean, o.createFromXmlInner):void");
        }

        DecoderInitializationException(String str, Throwable th, String str2, boolean z, createFromXmlInner createfromxmlinner, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.read = str2;
            this.onTransact = z;
            this.asBinder = createfromxmlinner;
            this.asInterface = str3;
            this.RemoteActionCompatParcelizer = decoderInitializationException;
        }
    }

    public MediaCodecRenderer(int i, onSubMenuSelected.asBinder asbinder, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, boolean z, float f) {
        super(i);
        this.MediaBrowserCompat$MediaItem = asbinder;
        this.invalidateMenu = animatedStateListDrawableCompat;
        this.ensureViewModelStore = z;
        this.asBinder = f;
        setTitleOptionalHint settitleoptionalhint = new setTitleOptionalHint();
        this.write = settitleoptionalhint;
        this.addOnNewIntentListener = new ArrayList<>();
        this.f4lambda$new$1$androidxactivityComponentActivity = new MediaCodec.BufferInfo();
        this.addOnTrimMemoryListener = 1.0f;
        this.onPanelClosed = 1.0f;
        this.onMenuItemSelected = -9223372036854775807L;
        this.onNewIntent = new ArrayDeque<>();
        onTransact ontransact = onTransact.RemoteActionCompatParcelizer;
        this.onMultiWindowModeChanged = ontransact;
        if (ontransact.asInterface != -9223372036854775807L) {
            this.getOnBackPressedDispatcher = true;
            long j = ontransact.asInterface;
        }
        settitleoptionalhint.RemoteActionCompatParcelizer(0);
        settitleoptionalhint.read.order(ByteOrder.nativeOrder());
        this.initViewTreeOwners = -1.0f;
        this.MediaBrowserCompat$SearchResultReceiver = 0;
        this.addOnConfigurationChangedListener = 0;
        this.addOnPictureInPictureModeChangedListener = -1;
        this.f5lambda$new$2$androidxactivityComponentActivity = -1;
        this.MediaSessionCompat$ResultReceiverWrapper = -9223372036854775807L;
        this.getLastCustomNonConfigurationInstance = -9223372036854775807L;
        this.getDefaultViewModelProviderFactory = -9223372036854775807L;
        this.f3lambda$new$0$androidxactivityComponentActivity = -9223372036854775807L;
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
    }

    public final int onTransact(setMultiChoiceItems setmultichoiceitems) throws ExoPlaybackException {
        try {
            return read(this.invalidateMenu, setmultichoiceitems);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw asInterface(e, setmultichoiceitems, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public final void addOnConfigurationChangedListener() throws ExoPlaybackException {
        setMultiChoiceItems setmultichoiceitems;
        if (this.read == null && !this.setInternalConnectionCallback && (setmultichoiceitems = this.getActivityResultRegistry) != null) {
            if (this.onPreparePanel != null || !RemoteActionCompatParcelizer(setmultichoiceitems)) {
                asInterface(this.onPreparePanel);
                String str = this.getActivityResultRegistry.f17lambda$new$1$androidxactivityComponentActivity;
                DrmSession drmSession = this.MediaDescriptionCompat;
                if (drmSession != null) {
                    if (this.getSavedStateRegistry == null) {
                        dispatchKeyShortcutEvent asBinder2 = asBinder(drmSession);
                        if (asBinder2 != null) {
                            try {
                                this.getSavedStateRegistry = new MediaCrypto(asBinder2.read, asBinder2.asInterface);
                                this.getViewModelStore = !asBinder2.RemoteActionCompatParcelizer && this.getSavedStateRegistry.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw asInterface(e, this.getActivityResultRegistry, 6006);
                            }
                        } else if (this.MediaDescriptionCompat.asInterface() == null) {
                            return;
                        }
                    }
                    if (dispatchKeyShortcutEvent.asBinder) {
                        int asBinder3 = this.MediaDescriptionCompat.asBinder();
                        if (asBinder3 == 1) {
                            DrmSession.DrmSessionException asInterface2 = this.MediaDescriptionCompat.asInterface();
                            throw asInterface(asInterface2, this.getActivityResultRegistry, asInterface2.RemoteActionCompatParcelizer);
                        } else if (asBinder3 != 4) {
                            return;
                        }
                    }
                }
                try {
                    asBinder(this.getSavedStateRegistry, this.getViewModelStore);
                } catch (DecoderInitializationException e2) {
                    throw asInterface(e2, this.getActivityResultRegistry, 4001);
                }
            } else {
                read(this.getActivityResultRegistry);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void RemoteActionCompatParcelizer(long j) throws ExoPlaybackException {
        boolean z;
        setMultiChoiceItems asBinder2 = this.onMultiWindowModeChanged.onTransact.asBinder(j);
        if (asBinder2 == null && this.getOnBackPressedDispatcher && this.access$001 != null) {
            asBinder2 = this.onMultiWindowModeChanged.onTransact.read();
        }
        if (asBinder2 != null) {
            this.onActivityResult = asBinder2;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.addMenuProvider && this.onActivityResult != null)) {
            read(this.onActivityResult, this.access$001);
            this.addMenuProvider = false;
            this.getOnBackPressedDispatcher = false;
        }
    }

    public final onSubMenuSelected access$001() {
        return this.read;
    }

    /* access modifiers changed from: protected */
    public final MediaFormat ComponentActivity() {
        return this.access$001;
    }

    /* access modifiers changed from: protected */
    public final createFromXmlInner createFullyDrawnExecutor() {
        return this.MediaSessionCompat$QueueItem;
    }

    public void read(boolean z, boolean z2) throws ExoPlaybackException {
        this.AudioAttributesCompatParcelizer = new onOpenSubMenu();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r1 >= r0.getLastCustomNonConfigurationInstance) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTransact(o.setMultiChoiceItems[] r18, long r19, long r21) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r17 = this;
            r0 = r17
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$onTransact r1 = r0.onMultiWindowModeChanged
            long r1 = r1.asInterface
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0035
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$onTransact> r1 = r0.onNewIntent
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0023
            long r1 = r0.f3lambda$new$0$androidxactivityComponentActivity
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0023
            long r5 = r0.getLastCustomNonConfigurationInstance
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0035
        L_0x0023:
            java.util.ArrayDeque<com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$onTransact> r1 = r0.onNewIntent
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$onTransact r9 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$onTransact
            long r3 = r0.getLastCustomNonConfigurationInstance
            r2 = r9
            r5 = r19
            r7 = r21
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        L_0x0035:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$onTransact r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$onTransact
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r1
            r13 = r19
            r15 = r21
            r10.<init>(r11, r13, r15)
            r0.onMultiWindowModeChanged = r1
            long r5 = r1.asInterface
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0051
            r2 = 1
            r0.getOnBackPressedDispatcher = r2
            long r1 = r1.asInterface
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.onTransact(o.setMultiChoiceItems[], long, long):void");
    }

    public void read(long j, boolean z) throws ExoPlaybackException {
        this.getDefaultViewModelCreationExtras = false;
        this.onCreate = false;
        this.IconCompatParcelizer = false;
        if (this.setInternalConnectionCallback) {
            this.write.asInterface();
            this.onConnected.asInterface();
            this.onConnectionSuspended = false;
        } else {
            PlaybackStateCompat$CustomAction();
        }
        if (this.onMultiWindowModeChanged.onTransact.onTransact() > 0) {
            this.onPictureInPictureModeChanged = true;
        }
        setShowTitle<setMultiChoiceItems> setshowtitle = this.onMultiWindowModeChanged.onTransact;
        synchronized (setshowtitle) {
            setshowtitle.onTransact = 0;
            setshowtitle.asBinder = 0;
            Arrays.fill(setshowtitle.asInterface, (Object) null);
        }
        this.onNewIntent.clear();
    }

    public void asInterface(float f, float f2) throws ExoPlaybackException {
        this.addOnTrimMemoryListener = f;
        this.onPanelClosed = f2;
        ensureViewModelStore();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        this.getActivityResultRegistry = null;
        onTransact ontransact = onTransact.RemoteActionCompatParcelizer;
        this.onMultiWindowModeChanged = ontransact;
        if (ontransact.asInterface != -9223372036854775807L) {
            this.getOnBackPressedDispatcher = true;
            long j = ontransact.asInterface;
        }
        this.onNewIntent.clear();
        getActivityResultRegistry();
    }

    /* access modifiers changed from: protected */
    public final void addOnMultiWindowModeChangedListener() {
        try {
            onSubMenuSelected onsubmenuselected = this.read;
            if (onsubmenuselected != null) {
                onsubmenuselected.RemoteActionCompatParcelizer();
                this.AudioAttributesCompatParcelizer.asBinder++;
                asInterface(this.MediaSessionCompat$QueueItem.onTransact);
            }
            this.read = null;
            try {
                MediaCrypto mediaCrypto = this.getSavedStateRegistry;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.getSavedStateRegistry = null;
                asInterface((DrmSession) null);
                getDefaultViewModelProviderFactory();
            }
        } catch (Throwable th) {
            this.read = null;
            MediaCrypto mediaCrypto2 = this.getSavedStateRegistry;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.getSavedStateRegistry = null;
            asInterface((DrmSession) null);
            getDefaultViewModelProviderFactory();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void asBinder(long r8, long r10) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r7 = this;
            boolean r0 = r7.IconCompatParcelizer
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r7.IconCompatParcelizer = r1
            r7.addOnTrimMemoryListener()
        L_0x000a:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r7.AudioAttributesImplApi26Parcelizer
            if (r0 != 0) goto L_0x00dc
            r0 = 1
            boolean r2 = r7.onCreate     // Catch:{ IllegalStateException -> 0x008b }
            if (r2 == 0) goto L_0x0017
            r7.ParcelableVolumeInfo()     // Catch:{ IllegalStateException -> 0x008b }
            return
        L_0x0017:
            o.setMultiChoiceItems r2 = r7.getActivityResultRegistry     // Catch:{ IllegalStateException -> 0x008b }
            if (r2 != 0) goto L_0x0023
            r2 = 2
            boolean r2 = r7.read((int) r2)     // Catch:{ IllegalStateException -> 0x008b }
            if (r2 != 0) goto L_0x0023
            return
        L_0x0023:
            r7.addOnConfigurationChangedListener()     // Catch:{ IllegalStateException -> 0x008b }
            boolean r2 = r7.setInternalConnectionCallback     // Catch:{ IllegalStateException -> 0x008b }
            r3 = 18
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "bypassRender"
            int r4 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ IllegalStateException -> 0x008b }
            if (r4 < r3) goto L_0x0035
            android.os.Trace.beginSection(r2)     // Catch:{ IllegalStateException -> 0x008b }
        L_0x0035:
            boolean r2 = r7.onTransact((long) r8, (long) r10)     // Catch:{ IllegalStateException -> 0x008b }
            if (r2 == 0) goto L_0x003c
            goto L_0x0035
        L_0x003c:
            int r8 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ IllegalStateException -> 0x008b }
            if (r8 < r3) goto L_0x0085
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x008b }
            goto L_0x0085
        L_0x0044:
            o.onSubMenuSelected r2 = r7.read     // Catch:{ IllegalStateException -> 0x008b }
            if (r2 == 0) goto L_0x0077
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x008b }
            java.lang.String r2 = "drainAndFeed"
            int r6 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ IllegalStateException -> 0x008b }
            if (r6 < r3) goto L_0x0055
            android.os.Trace.beginSection(r2)     // Catch:{ IllegalStateException -> 0x008b }
        L_0x0055:
            boolean r2 = r7.read((long) r8, (long) r10)     // Catch:{ IllegalStateException -> 0x008b }
            if (r2 == 0) goto L_0x0062
            boolean r2 = r7.read((long) r4)     // Catch:{ IllegalStateException -> 0x008b }
            if (r2 == 0) goto L_0x0062
            goto L_0x0055
        L_0x0062:
            boolean r8 = r7.addOnPictureInPictureModeChangedListener()     // Catch:{ IllegalStateException -> 0x008b }
            if (r8 == 0) goto L_0x006f
            boolean r8 = r7.read((long) r4)     // Catch:{ IllegalStateException -> 0x008b }
            if (r8 == 0) goto L_0x006f
            goto L_0x0062
        L_0x006f:
            int r8 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ IllegalStateException -> 0x008b }
            if (r8 < r3) goto L_0x0085
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x008b }
            goto L_0x0085
        L_0x0077:
            o.onOpenSubMenu r10 = r7.AudioAttributesCompatParcelizer     // Catch:{ IllegalStateException -> 0x008b }
            int r11 = r10.AudioAttributesImplApi21Parcelizer     // Catch:{ IllegalStateException -> 0x008b }
            int r8 = r7.asBinder(r8)     // Catch:{ IllegalStateException -> 0x008b }
            int r11 = r11 + r8
            r10.AudioAttributesImplApi21Parcelizer = r11     // Catch:{ IllegalStateException -> 0x008b }
            r7.read((int) r0)     // Catch:{ IllegalStateException -> 0x008b }
        L_0x0085:
            o.onOpenSubMenu r8 = r7.AudioAttributesCompatParcelizer     // Catch:{ IllegalStateException -> 0x008b }
            r8.asInterface()     // Catch:{ IllegalStateException -> 0x008b }
            return
        L_0x008b:
            r8 = move-exception
            int r9 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            r10 = 21
            if (r9 < r10) goto L_0x0098
            boolean r9 = r8 instanceof android.media.MediaCodec.CodecException
            if (r9 == 0) goto L_0x0098
        L_0x0096:
            r9 = 1
            goto L_0x00ae
        L_0x0098:
            java.lang.StackTraceElement[] r9 = r8.getStackTrace()
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00ad
            r9 = r9[r1]
            java.lang.String r9 = r9.getClassName()
            java.lang.String r11 = "android.media.MediaCodec"
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0096
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            if (r9 == 0) goto L_0x00db
            r7.asInterface((java.lang.Exception) r8)
            int r9 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            if (r9 < r10) goto L_0x00c7
            boolean r9 = r8 instanceof android.media.MediaCodec.CodecException
            if (r9 == 0) goto L_0x00c3
            r9 = r8
            android.media.MediaCodec$CodecException r9 = (android.media.MediaCodec.CodecException) r9
            boolean r9 = r9.isRecoverable()
            goto L_0x00c4
        L_0x00c3:
            r9 = 0
        L_0x00c4:
            if (r9 == 0) goto L_0x00c7
            r1 = 1
        L_0x00c7:
            if (r1 == 0) goto L_0x00cc
            r7.addOnMultiWindowModeChangedListener()
        L_0x00cc:
            o.createFromXmlInner r9 = r7.MediaSessionCompat$QueueItem
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r8 = r7.onTransact((java.lang.Throwable) r8, (o.createFromXmlInner) r9)
            o.setMultiChoiceItems r9 = r7.getActivityResultRegistry
            r10 = 4003(0xfa3, float:5.61E-42)
            com.google.android.exoplayer2.ExoPlaybackException r8 = r7.RemoteActionCompatParcelizer(r8, r9, r1, r10)
            throw r8
        L_0x00db:
            throw r8
        L_0x00dc:
            r8 = 0
            r7.AudioAttributesImplApi26Parcelizer = r8
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.asBinder(long, long):void");
    }

    /* access modifiers changed from: protected */
    public final boolean PlaybackStateCompat$CustomAction() throws ExoPlaybackException {
        boolean activityResultRegistry = getActivityResultRegistry();
        if (activityResultRegistry) {
            addOnConfigurationChangedListener();
        }
        return activityResultRegistry;
    }

    private boolean getActivityResultRegistry() {
        if (this.read == null) {
            return false;
        }
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == 3 || this.cancel || ((this.ComponentActivity && !this.RatingCompat) || (this.PlaybackStateCompat$CustomAction && this.addOnMultiWindowModeChangedListener))) {
            addOnMultiWindowModeChangedListener();
            return true;
        }
        if (i == 2) {
            if (!(OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 23)) {
                throw new IllegalStateException();
            } else if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 23) {
                try {
                    addOnNewIntentListener();
                } catch (ExoPlaybackException e) {
                    findMenuItemForSubmenu.onTransact("Failed to update the DRM session, releasing the codec instead.", e);
                    synchronized (findMenuItemForSubmenu.read) {
                        addOnMultiWindowModeChangedListener();
                        return true;
                    }
                }
            }
        }
        try {
            this.read.read();
            return false;
        } finally {
            addMenuProvider();
        }
    }

    private void getDefaultViewModelProviderFactory() {
        addMenuProvider();
        this.AudioAttributesImplApi26Parcelizer = null;
        this.onConnectionFailed = null;
        this.asInterface = null;
        this.MediaSessionCompat$QueueItem = null;
        this.MediaMetadataCompat = null;
        this.access$001 = null;
        this.addMenuProvider = false;
        this.RatingCompat = false;
        this.initViewTreeOwners = -1.0f;
        this.MediaBrowserCompat$SearchResultReceiver = 0;
        this.ParcelableVolumeInfo = false;
        this.cancel = false;
        this.ComponentActivity = false;
        this.PlaybackStateCompat$CustomAction = false;
        this.Cancellable = false;
        this.MediaSessionCompat$Token = false;
        this.createFullyDrawnExecutor = false;
        this.PlaybackStateCompat = false;
        this.addOnContextAvailableListener = false;
        this.addOnConfigurationChangedListener = 0;
        this.getViewModelStore = false;
    }

    /* access modifiers changed from: protected */
    public MediaCodecDecoderException onTransact(Throwable th, createFromXmlInner createfromxmlinner) {
        return new MediaCodecDecoderException(th, createfromxmlinner);
    }

    private boolean read(int i) throws ExoPlaybackException {
        setNegativeButton m_ = m_();
        this.onBackPressed.asInterface();
        int asBinder2 = asBinder(m_, this.onBackPressed, i | 4);
        if (asBinder2 == -5) {
            RemoteActionCompatParcelizer(m_);
            return true;
        }
        if (asBinder2 == -4) {
            if ((this.onBackPressed.asInterface & 4) == 4) {
                this.getDefaultViewModelCreationExtras = true;
                addOnTrimMemoryListener();
            }
        }
        return false;
    }

    private void asBinder(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        if (this.asInterface == null) {
            try {
                List<createFromXmlInner> RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(z);
                ArrayDeque<createFromXmlInner> arrayDeque = new ArrayDeque<>();
                this.asInterface = arrayDeque;
                if (this.ensureViewModelStore) {
                    arrayDeque.addAll(RemoteActionCompatParcelizer2);
                } else if (!RemoteActionCompatParcelizer2.isEmpty()) {
                    this.asInterface.add(RemoteActionCompatParcelizer2.get(0));
                }
                this.onCreatePanelMenu = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.getActivityResultRegistry, (Throwable) e, z, -49998);
            }
        }
        if (!this.asInterface.isEmpty()) {
            createFromXmlInner peekFirst = this.asInterface.peekFirst();
            while (this.read == null) {
                createFromXmlInner peekFirst2 = this.asInterface.peekFirst();
                if (asBinder(peekFirst2)) {
                    try {
                        asBinder(peekFirst2, mediaCrypto);
                    } catch (Exception e2) {
                        if (peekFirst2 == peekFirst) {
                            findMenuItemForSubmenu.onTransact();
                            Thread.sleep(50);
                            asBinder(peekFirst2, mediaCrypto);
                        } else {
                            throw e2;
                        }
                    } catch (Exception e3) {
                        StringBuilder sb = new StringBuilder("Failed to initialize decoder: ");
                        sb.append(peekFirst2);
                        findMenuItemForSubmenu.onTransact(sb.toString(), e3);
                        synchronized (findMenuItemForSubmenu.read) {
                            this.asInterface.removeFirst();
                            DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.getActivityResultRegistry, (Throwable) e3, z, peekFirst2);
                            asInterface((Exception) decoderInitializationException);
                            DecoderInitializationException decoderInitializationException2 = this.onCreatePanelMenu;
                            if (decoderInitializationException2 == null) {
                                this.onCreatePanelMenu = decoderInitializationException;
                            } else {
                                this.onCreatePanelMenu = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.read, decoderInitializationException2.onTransact, decoderInitializationException2.asBinder, decoderInitializationException2.asInterface, decoderInitializationException);
                            }
                            if (this.asInterface.isEmpty()) {
                                throw this.onCreatePanelMenu;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            this.asInterface = null;
            return;
        }
        throw new DecoderInitializationException(this.getActivityResultRegistry, (Throwable) null, z, -49999);
    }

    public static final class asBinder implements ActivityResultContracts.StartIntentSenderForResult.Companion {
        private final String RemoteActionCompatParcelizer;
        private final String asInterface;
        private final String onTransact;

        public final String asBinder() {
            return "InApp Rendered";
        }

        public asBinder(String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.asInterface = str;
            this.RemoteActionCompatParcelizer = str2;
            this.onTransact = str3;
        }

        public final Map<String, Object> asInterface() {
            return updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("campaignId", this.asInterface), new Pair("campaignName", this.RemoteActionCompatParcelizer), new Pair("notificationType", this.onTransact)});
        }
    }

    private List<createFromXmlInner> RemoteActionCompatParcelizer(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<createFromXmlInner> RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.invalidateMenu, this.getActivityResultRegistry, z);
        if (RemoteActionCompatParcelizer2.isEmpty() && z) {
            RemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(this.invalidateMenu, this.getActivityResultRegistry, false);
            if (!RemoteActionCompatParcelizer2.isEmpty()) {
                String str = this.getActivityResultRegistry.f17lambda$new$1$androidxactivityComponentActivity;
                synchronized (findMenuItemForSubmenu.read) {
                }
            }
        }
        return RemoteActionCompatParcelizer2;
    }

    /* JADX INFO: finally extract failed */
    private void asBinder(createFromXmlInner createfromxmlinner, MediaCrypto mediaCrypto) throws Exception {
        float f;
        int i;
        createFromXmlInner createfromxmlinner2 = createfromxmlinner;
        String str = createfromxmlinner2.onTransact;
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 23) {
            f = -1.0f;
        } else {
            f = asBinder(this.onPanelClosed, AudioAttributesImplApi26Parcelizer());
        }
        if (f <= this.asBinder) {
            f = -1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        onSubMenuSelected.RemoteActionCompatParcelizer asBinder2 = asBinder(createfromxmlinner2, this.getActivityResultRegistry, mediaCrypto, f);
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 31) {
            LogSessionId logSessionId = write().read.asInterface;
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                asBinder2.asBinder.setString("log-session-id", logSessionId.getStringId());
            }
        }
        try {
            StringBuilder sb = new StringBuilder("createCodec:");
            sb.append(str);
            String obj = sb.toString();
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 18) {
                Trace.beginSection(obj);
            }
            this.read = this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer(asBinder2);
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 18) {
                Trace.endSection();
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!createfromxmlinner2.asBinder(this.getActivityResultRegistry)) {
                setMultiChoiceItems setmultichoiceitems = this.getActivityResultRegistry;
                if (setmultichoiceitems != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("id=");
                    sb2.append(setmultichoiceitems.getDefaultViewModelCreationExtras);
                    sb2.append(", mimeType=");
                    sb2.append(setmultichoiceitems.f17lambda$new$1$androidxactivityComponentActivity);
                    if (setmultichoiceitems.addOnMultiWindowModeChangedListener != -1) {
                        sb2.append(", bitrate=");
                        sb2.append(setmultichoiceitems.addOnMultiWindowModeChangedListener);
                    }
                    if (setmultichoiceitems.addMenuProvider != null) {
                        sb2.append(", codecs=");
                        sb2.append(setmultichoiceitems.addMenuProvider);
                    }
                    if (setmultichoiceitems.addOnTrimMemoryListener != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (int i2 = 0; i2 < setmultichoiceitems.addOnTrimMemoryListener.onTransact; i2++) {
                            UUID uuid = setmultichoiceitems.addOnTrimMemoryListener.RemoteActionCompatParcelizer[i2].RemoteActionCompatParcelizer;
                            if (uuid.equals(setOnBackInvokedDispatcher.RemoteActionCompatParcelizer)) {
                                linkedHashSet.add("cenc");
                            } else if (uuid.equals(setOnBackInvokedDispatcher.read)) {
                                linkedHashSet.add("clearkey");
                            } else if (uuid.equals(setOnBackInvokedDispatcher.asInterface)) {
                                linkedHashSet.add("playready");
                            } else if (uuid.equals(setOnBackInvokedDispatcher.AudioAttributesImplApi26Parcelizer)) {
                                linkedHashSet.add("widevine");
                            } else if (uuid.equals(setOnBackInvokedDispatcher.onTransact)) {
                                linkedHashSet.add("universal");
                            } else {
                                StringBuilder sb3 = new StringBuilder("unknown (");
                                sb3.append(uuid);
                                sb3.append(")");
                                linkedHashSet.add(sb3.toString());
                            }
                        }
                        sb2.append(", drm=[");
                        new applyButtonTint(",").asInterface(sb2, linkedHashSet.iterator());
                        sb2.append(']');
                    }
                    if (!(setmultichoiceitems.onPictureInPictureModeChanged == -1 || setmultichoiceitems.getFullyDrawnReporter == -1)) {
                        sb2.append(", res=");
                        sb2.append(setmultichoiceitems.onPictureInPictureModeChanged);
                        sb2.append("x");
                        sb2.append(setmultichoiceitems.getFullyDrawnReporter);
                    }
                    if (setmultichoiceitems.addOnPictureInPictureModeChangedListener != -1.0f) {
                        sb2.append(", fps=");
                        sb2.append(setmultichoiceitems.addOnPictureInPictureModeChangedListener);
                    }
                    if (setmultichoiceitems.addOnConfigurationChangedListener != -1) {
                        sb2.append(", channels=");
                        sb2.append(setmultichoiceitems.addOnConfigurationChangedListener);
                    }
                    if (setmultichoiceitems.onActivityResult != -1) {
                        sb2.append(", sample_rate=");
                        sb2.append(setmultichoiceitems.onActivityResult);
                    }
                    if (setmultichoiceitems.getLastCustomNonConfigurationInstance != null) {
                        sb2.append(", language=");
                        sb2.append(setmultichoiceitems.getLastCustomNonConfigurationInstance);
                    }
                    if (setmultichoiceitems.getDefaultViewModelProviderFactory != null) {
                        sb2.append(", label=");
                        sb2.append(setmultichoiceitems.getDefaultViewModelProviderFactory);
                    }
                    if (setmultichoiceitems.onCreatePanelMenu != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((setmultichoiceitems.onCreatePanelMenu & 4) != 0) {
                            arrayList.add("auto");
                        }
                        if ((setmultichoiceitems.onCreatePanelMenu & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((setmultichoiceitems.onCreatePanelMenu & 2) != 0) {
                            arrayList.add("forced");
                        }
                        sb2.append(", selectionFlags=[");
                        new applyButtonTint(",").asInterface(sb2, arrayList.iterator());
                        sb2.append("]");
                    }
                    if (setmultichoiceitems.onBackPressed != 0) {
                        ArrayList arrayList2 = new ArrayList();
                        if ((setmultichoiceitems.onBackPressed & 1) != 0) {
                            arrayList2.add("main");
                        }
                        if ((setmultichoiceitems.onBackPressed & 2) != 0) {
                            arrayList2.add("alt");
                        }
                        if ((setmultichoiceitems.onBackPressed & 4) != 0) {
                            arrayList2.add("supplementary");
                        }
                        if ((setmultichoiceitems.onBackPressed & 8) != 0) {
                            arrayList2.add("commentary");
                        }
                        if ((setmultichoiceitems.onBackPressed & 16) != 0) {
                            arrayList2.add("dub");
                        }
                        if ((setmultichoiceitems.onBackPressed & 32) != 0) {
                            arrayList2.add("emergency");
                        }
                        if ((setmultichoiceitems.onBackPressed & 64) != 0) {
                            arrayList2.add("caption");
                        }
                        if ((setmultichoiceitems.onBackPressed & 128) != 0) {
                            arrayList2.add("subtitle");
                        }
                        if ((setmultichoiceitems.onBackPressed & 256) != 0) {
                            arrayList2.add("sign");
                        }
                        if ((setmultichoiceitems.onBackPressed & 512) != 0) {
                            arrayList2.add("describes-video");
                        }
                        if ((setmultichoiceitems.onBackPressed & 1024) != 0) {
                            arrayList2.add("describes-music");
                        }
                        if ((setmultichoiceitems.onBackPressed & 2048) != 0) {
                            arrayList2.add("enhanced-intelligibility");
                        }
                        if ((setmultichoiceitems.onBackPressed & 4096) != 0) {
                            arrayList2.add("transcribes-dialog");
                        }
                        if ((setmultichoiceitems.onBackPressed & 8192) != 0) {
                            arrayList2.add("easy-read");
                        }
                        if ((setmultichoiceitems.onBackPressed & 16384) != 0) {
                            arrayList2.add("trick-play");
                        }
                        sb2.append(", roleFlags=[");
                        new applyButtonTint(",").asInterface(sb2, arrayList2.iterator());
                        sb2.append("]");
                    }
                    sb2.toString();
                }
                synchronized (findMenuItemForSubmenu.read) {
                }
            }
            this.MediaSessionCompat$QueueItem = createfromxmlinner2;
            this.initViewTreeOwners = f;
            this.MediaMetadataCompat = this.getActivityResultRegistry;
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed > 25 || !"OMX.Exynos.avc.dec.secure".equals(str) || (!OnBackPressedDispatcher.Api33Impl.setInternalConnectionCallback.startsWith("SM-T585") && !OnBackPressedDispatcher.Api33Impl.setInternalConnectionCallback.startsWith("SM-A510") && !OnBackPressedDispatcher.Api33Impl.setInternalConnectionCallback.startsWith("SM-A520") && !OnBackPressedDispatcher.Api33Impl.setInternalConnectionCallback.startsWith("SM-J700"))) {
                i = (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 24 || (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) || (!"flounder".equals(OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer) && !"flounder_lte".equals(OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer) && !"grouper".equals(OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer) && !"tilapia".equals(OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer))) ? 0 : 1;
            } else {
                i = 2;
            }
            this.MediaBrowserCompat$SearchResultReceiver = i;
            this.ParcelableVolumeInfo = OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 21 && this.MediaMetadataCompat.getLifecycle.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.cancel = OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 18 || (OnBackPressedDispatcher.Api33Impl.onConnectionFailed == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (OnBackPressedDispatcher.Api33Impl.onConnectionFailed == 19 && OnBackPressedDispatcher.Api33Impl.setInternalConnectionCallback.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.ComponentActivity = OnBackPressedDispatcher.Api33Impl.onConnectionFailed == 29 && "c2.android.aac.decoder".equals(str);
            this.PlaybackStateCompat$CustomAction = (OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 19 && (("hb2000".equals(OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer) || "stvm8".equals(OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
            this.Cancellable = OnBackPressedDispatcher.Api33Impl.onConnectionFailed == 21 && "OMX.google.aac.decoder".equals(str);
            this.MediaSessionCompat$Token = OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(OnBackPressedDispatcher.Api33Impl.write) && (OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer.startsWith("baffin") || OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer.startsWith("grand") || OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer.startsWith("fortuna") || OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer.startsWith("gprimelte") || OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer.startsWith("j2y18lte") || OnBackPressedDispatcher.Api33Impl.AudioAttributesCompatParcelizer.startsWith("ms01"));
            this.createFullyDrawnExecutor = OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 18 && this.MediaMetadataCompat.addOnConfigurationChangedListener == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            String str2 = createfromxmlinner2.onTransact;
            this.PlaybackStateCompat = ((OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 25 && "OMX.rk.video_decoder.avc".equals(str2)) || ((OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 17 && "OMX.allwinner.video.decoder.avc".equals(str2)) || ((OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(OnBackPressedDispatcher.Api33Impl.write) && "AFTS".equals(OnBackPressedDispatcher.Api33Impl.setInternalConnectionCallback) && createfromxmlinner2.IconCompatParcelizer)))) || initViewTreeOwners();
            if ("c2.android.mp3.decoder".equals(createfromxmlinner2.onTransact)) {
                this.onConnectionFailed = new onCloseSubMenu();
            }
            if (IconCompatParcelizer() == 2) {
                this.MediaSessionCompat$ResultReceiverWrapper = SystemClock.elapsedRealtime() + 1000;
            }
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer++;
            RemoteActionCompatParcelizer(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 18) {
                Trace.endSection();
            }
            throw th;
        }
    }

    private boolean read(long j) {
        return this.onMenuItemSelected == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.onMenuItemSelected;
    }

    private void RemoteActionCompatParcelizer(DrmSession drmSession) {
        DrmSession drmSession2 = this.onPreparePanel;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.read((generateConfigDelta_locale.asBinder) null);
            }
            if (drmSession2 != null) {
                drmSession2.asBinder((generateConfigDelta_locale.asBinder) null);
            }
        }
        this.onPreparePanel = drmSession;
    }

    private void asInterface(DrmSession drmSession) {
        DrmSession drmSession2 = this.MediaDescriptionCompat;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.read((generateConfigDelta_locale.asBinder) null);
            }
            if (drmSession2 != null) {
                drmSession2.asBinder((generateConfigDelta_locale.asBinder) null);
            }
        }
        this.MediaDescriptionCompat = drmSession;
    }

    private boolean addOnPictureInPictureModeChangedListener() throws ExoPlaybackException {
        boolean z;
        long j;
        long j2;
        onSubMenuSelected onsubmenuselected = this.read;
        if (onsubmenuselected == null || this.MediaBrowserCompat$ItemReceiver == 2 || this.getDefaultViewModelCreationExtras) {
            return false;
        }
        if (this.addOnPictureInPictureModeChangedListener < 0) {
            int asInterface2 = onsubmenuselected.asInterface();
            this.addOnPictureInPictureModeChangedListener = asInterface2;
            if (asInterface2 < 0) {
                return false;
            }
            this.AudioAttributesImplApi21Parcelizer.read = this.read.onTransact(asInterface2);
            this.AudioAttributesImplApi21Parcelizer.asInterface();
        }
        if (this.MediaBrowserCompat$ItemReceiver == 1) {
            if (!this.PlaybackStateCompat) {
                this.addOnMultiWindowModeChangedListener = true;
                this.read.RemoteActionCompatParcelizer(this.addOnPictureInPictureModeChangedListener, 0, 0, 4);
                this.addOnPictureInPictureModeChangedListener = -1;
                this.AudioAttributesImplApi21Parcelizer.read = null;
            }
            this.MediaBrowserCompat$ItemReceiver = 2;
            return false;
        } else if (this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
            this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = false;
            ByteBuffer byteBuffer = this.AudioAttributesImplApi21Parcelizer.read;
            byte[] bArr = RemoteActionCompatParcelizer;
            byteBuffer.put(bArr);
            this.read.RemoteActionCompatParcelizer(this.addOnPictureInPictureModeChangedListener, bArr.length, 0, 0);
            this.addOnPictureInPictureModeChangedListener = -1;
            this.AudioAttributesImplApi21Parcelizer.read = null;
            this.addContentView = true;
            return true;
        } else {
            if (this.addOnConfigurationChangedListener == 1) {
                for (int i = 0; i < this.MediaMetadataCompat.getLifecycle.size(); i++) {
                    this.AudioAttributesImplApi21Parcelizer.read.put(this.MediaMetadataCompat.getLifecycle.get(i));
                }
                this.addOnConfigurationChangedListener = 2;
            }
            int position = this.AudioAttributesImplApi21Parcelizer.read.position();
            setNegativeButton m_ = m_();
            try {
                int asBinder2 = asBinder(m_, this.AudioAttributesImplApi21Parcelizer, 0);
                if (AudioAttributesImplBaseParcelizer()) {
                    this.getDefaultViewModelProviderFactory = this.getLastCustomNonConfigurationInstance;
                }
                if (asBinder2 == -3) {
                    return false;
                }
                if (asBinder2 == -5) {
                    if (this.addOnConfigurationChangedListener == 2) {
                        this.AudioAttributesImplApi21Parcelizer.asInterface();
                        this.addOnConfigurationChangedListener = 1;
                    }
                    RemoteActionCompatParcelizer(m_);
                    return true;
                }
                if ((this.AudioAttributesImplApi21Parcelizer.asInterface & 4) == 4) {
                    if (this.addOnConfigurationChangedListener == 2) {
                        this.AudioAttributesImplApi21Parcelizer.asInterface();
                        this.addOnConfigurationChangedListener = 1;
                    }
                    this.getDefaultViewModelCreationExtras = true;
                    if (!this.addContentView) {
                        addOnTrimMemoryListener();
                        return false;
                    }
                    try {
                        if (!this.PlaybackStateCompat) {
                            this.addOnMultiWindowModeChangedListener = true;
                            this.read.RemoteActionCompatParcelizer(this.addOnPictureInPictureModeChangedListener, 0, 0, 4);
                            this.addOnPictureInPictureModeChangedListener = -1;
                            this.AudioAttributesImplApi21Parcelizer.read = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw asInterface(e, this.getActivityResultRegistry, OnBackPressedDispatcher.Api33Impl.asBinder(e.getErrorCode()));
                    }
                } else {
                    if (!this.addContentView) {
                        if (!((this.AudioAttributesImplApi21Parcelizer.asInterface & 1) == 1)) {
                            this.AudioAttributesImplApi21Parcelizer.asInterface();
                            if (this.addOnConfigurationChangedListener == 2) {
                                this.addOnConfigurationChangedListener = 1;
                            }
                            return true;
                        }
                    }
                    boolean onTransact2 = this.AudioAttributesImplApi21Parcelizer.onTransact();
                    if (onTransact2) {
                        AppCompatDelegateImpl.ActionModeCallbackWrapperV9 actionModeCallbackWrapperV9 = this.AudioAttributesImplApi21Parcelizer.asBinder;
                        if (position != 0) {
                            if (actionModeCallbackWrapperV9.AudioAttributesImplApi21Parcelizer == null) {
                                int[] iArr = new int[1];
                                actionModeCallbackWrapperV9.AudioAttributesImplApi21Parcelizer = iArr;
                                actionModeCallbackWrapperV9.RemoteActionCompatParcelizer.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = actionModeCallbackWrapperV9.AudioAttributesImplApi21Parcelizer;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.ParcelableVolumeInfo && !onTransact2) {
                        ByteBuffer byteBuffer2 = this.AudioAttributesImplApi21Parcelizer.read;
                        int position2 = byteBuffer2.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 >= position2) {
                                byteBuffer2.clear();
                                break;
                            }
                            byte b = byteBuffer2.get(i2) & 255;
                            if (i3 == 3) {
                                if (b == 1 && (byteBuffer2.get(i4) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i2 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                            } else if (b == 0) {
                                i3++;
                            }
                            if (b != 0) {
                                i3 = 0;
                            }
                            i2 = i4;
                        }
                        if (this.AudioAttributesImplApi21Parcelizer.read.position() == 0) {
                            return true;
                        }
                        this.ParcelableVolumeInfo = false;
                    }
                    long j3 = this.AudioAttributesImplApi21Parcelizer.onTransact;
                    onCloseSubMenu onclosesubmenu = this.onConnectionFailed;
                    if (onclosesubmenu != null) {
                        setMultiChoiceItems setmultichoiceitems = this.getActivityResultRegistry;
                        DecoderInputBuffer decoderInputBuffer = this.AudioAttributesImplApi21Parcelizer;
                        if (onclosesubmenu.read == 0) {
                            onclosesubmenu.onTransact = decoderInputBuffer.onTransact;
                        }
                        if (onclosesubmenu.asBinder) {
                            j2 = decoderInputBuffer.onTransact;
                        } else {
                            ByteBuffer byteBuffer3 = decoderInputBuffer.read;
                            int i5 = 0;
                            byte b2 = 0;
                            for (int i6 = 4; i5 < i6; i6 = 4) {
                                b2 = (b2 << 8) | (byteBuffer3.get(i5) & 255);
                                i5++;
                            }
                            int read2 = AppCompatDelegateImpl.ActionBarMenuCallback.read(b2);
                            if (read2 == -1) {
                                onclosesubmenu.asBinder = true;
                                onclosesubmenu.read = 0;
                                onclosesubmenu.onTransact = decoderInputBuffer.onTransact;
                                synchronized (findMenuItemForSubmenu.read) {
                                }
                                j2 = decoderInputBuffer.onTransact;
                            } else {
                                z = onTransact2;
                                long max = onclosesubmenu.onTransact + Math.max(0, ((onclosesubmenu.read - 529) * 1000000) / ((long) setmultichoiceitems.onActivityResult));
                                onclosesubmenu.read += (long) read2;
                                j = max;
                                long j4 = this.getLastCustomNonConfigurationInstance;
                                onCloseSubMenu onclosesubmenu2 = this.onConnectionFailed;
                                this.getLastCustomNonConfigurationInstance = Math.max(j4, onclosesubmenu2.onTransact + Math.max(0, ((onclosesubmenu2.read - 529) * 1000000) / ((long) this.getActivityResultRegistry.onActivityResult)));
                                j3 = j;
                            }
                        }
                        z = onTransact2;
                        j = j2;
                        long j42 = this.getLastCustomNonConfigurationInstance;
                        onCloseSubMenu onclosesubmenu22 = this.onConnectionFailed;
                        this.getLastCustomNonConfigurationInstance = Math.max(j42, onclosesubmenu22.onTransact + Math.max(0, ((onclosesubmenu22.read - 529) * 1000000) / ((long) this.getActivityResultRegistry.onActivityResult)));
                        j3 = j;
                    } else {
                        z = onTransact2;
                    }
                    if ((this.AudioAttributesImplApi21Parcelizer.asInterface & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                        this.addOnNewIntentListener.add(Long.valueOf(j3));
                    }
                    if (this.onPictureInPictureModeChanged) {
                        if (!this.onNewIntent.isEmpty()) {
                            setShowTitle<setMultiChoiceItems> setshowtitle = this.onNewIntent.peekLast().onTransact;
                            setMultiChoiceItems setmultichoiceitems2 = this.getActivityResultRegistry;
                            synchronized (setshowtitle) {
                                setshowtitle.read(j3);
                                setshowtitle.asInterface();
                                setshowtitle.asBinder(j3, setmultichoiceitems2);
                            }
                        } else {
                            setShowTitle<setMultiChoiceItems> setshowtitle2 = this.onMultiWindowModeChanged.onTransact;
                            setMultiChoiceItems setmultichoiceitems3 = this.getActivityResultRegistry;
                            synchronized (setshowtitle2) {
                                setshowtitle2.read(j3);
                                setshowtitle2.asInterface();
                                setshowtitle2.asBinder(j3, setmultichoiceitems3);
                            }
                        }
                        this.onPictureInPictureModeChanged = false;
                    }
                    this.getLastCustomNonConfigurationInstance = Math.max(this.getLastCustomNonConfigurationInstance, j3);
                    DecoderInputBuffer decoderInputBuffer2 = this.AudioAttributesImplApi21Parcelizer;
                    ByteBuffer byteBuffer4 = decoderInputBuffer2.read;
                    if (byteBuffer4 != null) {
                        byteBuffer4.flip();
                    }
                    ByteBuffer byteBuffer5 = decoderInputBuffer2.RemoteActionCompatParcelizer;
                    if (byteBuffer5 != null) {
                        byteBuffer5.flip();
                    }
                    if ((this.AudioAttributesImplApi21Parcelizer.asInterface & 268435456) == 268435456) {
                        onTransact(this.AudioAttributesImplApi21Parcelizer);
                    }
                    RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
                    if (z) {
                        try {
                            this.read.read(this.addOnPictureInPictureModeChangedListener, this.AudioAttributesImplApi21Parcelizer.asBinder, j3);
                        } catch (MediaCodec.CryptoException e2) {
                            throw asInterface(e2, this.getActivityResultRegistry, OnBackPressedDispatcher.Api33Impl.asBinder(e2.getErrorCode()));
                        }
                    } else {
                        this.read.RemoteActionCompatParcelizer(this.addOnPictureInPictureModeChangedListener, this.AudioAttributesImplApi21Parcelizer.read.limit(), j3, 0);
                    }
                    this.addOnPictureInPictureModeChangedListener = -1;
                    this.AudioAttributesImplApi21Parcelizer.read = null;
                    this.addContentView = true;
                    this.addOnConfigurationChangedListener = 0;
                    this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer++;
                    return true;
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
                asInterface((Exception) e3);
                read(0);
                this.read.read();
                addMenuProvider();
                return true;
            } catch (Throwable th) {
                addMenuProvider();
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r2 != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cb, code lost:
        if (addOnContextAvailableListener() == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00fc, code lost:
        if (addOnContextAvailableListener() == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0112, code lost:
        if (addOnContextAvailableListener() == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0129, code lost:
        if (r0 == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x012b, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.AppCompatDelegateImpl.ActionModeCallbackWrapperV9.AnonymousClass1 RemoteActionCompatParcelizer(o.setNegativeButton r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r11 = this;
            r0 = 1
            r11.onPictureInPictureModeChanged = r0
            o.setMultiChoiceItems r1 = r12.asBinder
            r5 = r1
            o.setMultiChoiceItems r5 = (o.setMultiChoiceItems) r5
            java.lang.String r1 = r5.f17lambda$new$1$androidxactivityComponentActivity
            if (r1 == 0) goto L_0x0159
            com.google.android.exoplayer2.drm.DrmSession r12 = r12.onTransact
            r11.RemoteActionCompatParcelizer((com.google.android.exoplayer2.drm.DrmSession) r12)
            r11.getActivityResultRegistry = r5
            boolean r12 = r11.setInternalConnectionCallback
            r1 = 0
            if (r12 == 0) goto L_0x001b
            r11.AudioAttributesImplBaseParcelizer = r0
            return r1
        L_0x001b:
            o.onSubMenuSelected r12 = r11.read
            if (r12 != 0) goto L_0x0025
            r11.asInterface = r1
            r11.addOnConfigurationChangedListener()
            return r1
        L_0x0025:
            o.createFromXmlInner r1 = r11.MediaSessionCompat$QueueItem
            o.setMultiChoiceItems r4 = r11.MediaMetadataCompat
            com.google.android.exoplayer2.drm.DrmSession r2 = r11.MediaDescriptionCompat
            com.google.android.exoplayer2.drm.DrmSession r3 = r11.onPreparePanel
            r6 = 23
            r7 = 0
            if (r2 != r3) goto L_0x0034
        L_0x0032:
            r2 = 0
            goto L_0x007c
        L_0x0034:
            if (r3 == 0) goto L_0x007b
            if (r2 == 0) goto L_0x007b
            java.util.UUID r8 = r3.onTransact()
            java.util.UUID r9 = r2.onTransact()
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x007b
            int r8 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            if (r8 < r6) goto L_0x007b
            java.util.UUID r8 = o.setOnBackInvokedDispatcher.asInterface
            java.util.UUID r2 = r2.onTransact()
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L_0x007b
            java.util.UUID r2 = o.setOnBackInvokedDispatcher.asInterface
            java.util.UUID r8 = r3.onTransact()
            boolean r2 = r2.equals(r8)
            if (r2 != 0) goto L_0x007b
            o.dispatchKeyShortcutEvent r2 = r11.asBinder((com.google.android.exoplayer2.drm.DrmSession) r3)
            if (r2 == 0) goto L_0x007b
            boolean r2 = r2.RemoteActionCompatParcelizer
            if (r2 == 0) goto L_0x006e
            r2 = 0
            goto L_0x0074
        L_0x006e:
            java.lang.String r2 = r5.f17lambda$new$1$androidxactivityComponentActivity
            boolean r2 = r3.onTransact(r2)
        L_0x0074:
            boolean r3 = r1.IconCompatParcelizer
            if (r3 != 0) goto L_0x0032
            if (r2 != 0) goto L_0x007b
            goto L_0x0032
        L_0x007b:
            r2 = 1
        L_0x007c:
            r3 = 3
            if (r2 == 0) goto L_0x009a
            boolean r12 = r11.addContentView
            if (r12 == 0) goto L_0x0088
            r11.MediaBrowserCompat$ItemReceiver = r0
            r11.MediaBrowserCompat$CustomActionResultReceiver = r3
            goto L_0x008e
        L_0x0088:
            r11.addOnMultiWindowModeChangedListener()
            r11.addOnConfigurationChangedListener()
        L_0x008e:
            o.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1 r12 = new o.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1
            java.lang.String r3 = r1.onTransact
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x009a:
            com.google.android.exoplayer2.drm.DrmSession r2 = r11.onPreparePanel
            com.google.android.exoplayer2.drm.DrmSession r8 = r11.MediaDescriptionCompat
            if (r2 == r8) goto L_0x00a2
            r2 = 1
            goto L_0x00a3
        L_0x00a2:
            r2 = 0
        L_0x00a3:
            if (r2 == 0) goto L_0x00ab
            int r8 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            if (r8 >= r6) goto L_0x00ab
            r6 = 0
            goto L_0x00ac
        L_0x00ab:
            r6 = 1
        L_0x00ac:
            if (r6 == 0) goto L_0x0153
            o.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1 r6 = r11.onTransact((o.createFromXmlInner) r1, (o.setMultiChoiceItems) r4, (o.setMultiChoiceItems) r5)
            int r8 = r6.asInterface
            r9 = 2
            if (r8 == 0) goto L_0x012d
            if (r8 == r0) goto L_0x00ff
            if (r8 == r9) goto L_0x00d4
            if (r8 != r3) goto L_0x00ce
            boolean r0 = r11.ensureViewModelStore()
            if (r0 == 0) goto L_0x0105
            r11.MediaMetadataCompat = r5
            if (r2 == 0) goto L_0x013c
            boolean r0 = r11.addOnContextAvailableListener()
            if (r0 != 0) goto L_0x013c
            goto L_0x012b
        L_0x00ce:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00d4:
            boolean r8 = r11.ensureViewModelStore()
            if (r8 == 0) goto L_0x0105
            r11.addOnContextAvailableListener = r0
            r11.addOnConfigurationChangedListener = r0
            int r8 = r11.MediaBrowserCompat$SearchResultReceiver
            if (r8 == r9) goto L_0x00f2
            if (r8 != r0) goto L_0x00f1
            int r8 = r5.onPictureInPictureModeChanged
            int r10 = r4.onPictureInPictureModeChanged
            if (r8 != r10) goto L_0x00f1
            int r8 = r5.getFullyDrawnReporter
            int r10 = r4.getFullyDrawnReporter
            if (r8 != r10) goto L_0x00f1
            goto L_0x00f2
        L_0x00f1:
            r0 = 0
        L_0x00f2:
            r11.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = r0
            r11.MediaMetadataCompat = r5
            if (r2 == 0) goto L_0x013c
            boolean r0 = r11.addOnContextAvailableListener()
            if (r0 != 0) goto L_0x013c
            goto L_0x012b
        L_0x00ff:
            boolean r8 = r11.ensureViewModelStore()
            if (r8 != 0) goto L_0x010a
        L_0x0105:
            r0 = 16
            r7 = 16
            goto L_0x013c
        L_0x010a:
            r11.MediaMetadataCompat = r5
            if (r2 == 0) goto L_0x0115
            boolean r0 = r11.addOnContextAvailableListener()
            if (r0 != 0) goto L_0x013c
            goto L_0x012b
        L_0x0115:
            boolean r2 = r11.addContentView
            if (r2 == 0) goto L_0x0129
            r11.MediaBrowserCompat$ItemReceiver = r0
            boolean r2 = r11.cancel
            if (r2 != 0) goto L_0x0126
            boolean r2 = r11.PlaybackStateCompat$CustomAction
            if (r2 != 0) goto L_0x0126
            r11.MediaBrowserCompat$CustomActionResultReceiver = r0
            goto L_0x0129
        L_0x0126:
            r11.MediaBrowserCompat$CustomActionResultReceiver = r3
            r0 = 0
        L_0x0129:
            if (r0 != 0) goto L_0x013c
        L_0x012b:
            r7 = 2
            goto L_0x013c
        L_0x012d:
            boolean r2 = r11.addContentView
            if (r2 == 0) goto L_0x0136
            r11.MediaBrowserCompat$ItemReceiver = r0
            r11.MediaBrowserCompat$CustomActionResultReceiver = r3
            goto L_0x013c
        L_0x0136:
            r11.addOnMultiWindowModeChangedListener()
            r11.addOnConfigurationChangedListener()
        L_0x013c:
            int r0 = r6.asInterface
            if (r0 == 0) goto L_0x0152
            o.onSubMenuSelected r0 = r11.read
            if (r0 != r12) goto L_0x0148
            int r12 = r11.MediaBrowserCompat$CustomActionResultReceiver
            if (r12 != r3) goto L_0x0152
        L_0x0148:
            o.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1 r12 = new o.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1
            java.lang.String r3 = r1.onTransact
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0152:
            return r6
        L_0x0153:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0159:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.asInterface(r12, r5, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.RemoteActionCompatParcelizer(o.setNegativeButton):o.AppCompatDelegateImpl$ActionModeCallbackWrapperV9$1");
    }

    public void asInterface(long j) {
        this.f3lambda$new$0$androidxactivityComponentActivity = j;
        if (!this.onNewIntent.isEmpty() && j >= this.onNewIntent.peek().read) {
            onTransact poll = this.onNewIntent.poll();
            this.onMultiWindowModeChanged = poll;
            if (poll.asInterface != -9223372036854775807L) {
                this.getOnBackPressedDispatcher = true;
                long j2 = poll.asInterface;
            }
            Cancellable();
        }
    }

    /* access modifiers changed from: protected */
    public AppCompatDelegateImpl.ActionModeCallbackWrapperV9.AnonymousClass1 onTransact(createFromXmlInner createfromxmlinner, setMultiChoiceItems setmultichoiceitems, setMultiChoiceItems setmultichoiceitems2) {
        return new Object(createfromxmlinner.onTransact, setmultichoiceitems, setmultichoiceitems2, 0, 1) {
            private setMultiChoiceItems RemoteActionCompatParcelizer;
            private String asBinder;
            public final int asInterface;
            public final int onTransact;
            private setMultiChoiceItems read;

            {
                if (!(r5 == 0 || r6 == 0)) {
                    throw new IllegalArgumentException();
                } else if (!TextUtils.isEmpty(r2)) {
                    this.asBinder = r2;
                    this.read = r3;
                    this.RemoteActionCompatParcelizer = r4;
                    this.asInterface = r5;
                    this.onTransact = r6;
                } else {
                    throw new IllegalArgumentException();
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AnonymousClass1 r5 = (AnonymousClass1) obj;
                if (this.asInterface != r5.asInterface || this.onTransact != r5.onTransact || !this.asBinder.equals(r5.asBinder) || !this.read.equals(r5.read) || !this.RemoteActionCompatParcelizer.equals(r5.RemoteActionCompatParcelizer)) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = this.asInterface;
                int i2 = this.onTransact;
                return ((((((((i + 527) * 31) + i2) * 31) + this.asBinder.hashCode()) * 31) + this.read.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
            }
        };
    }

    public boolean PlaybackStateCompat() {
        return this.onCreate;
    }

    public boolean MediaSessionCompat$Token() {
        if (this.getActivityResultRegistry != null) {
            if (onConnectionSuspended()) {
                return true;
            }
            if (this.f5lambda$new$2$androidxactivityComponentActivity >= 0) {
                return true;
            }
            if (this.MediaSessionCompat$ResultReceiverWrapper == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.MediaSessionCompat$ResultReceiverWrapper) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final float addContentView() {
        return this.addOnTrimMemoryListener;
    }

    private boolean ensureViewModelStore() throws ExoPlaybackException {
        if (!(OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 23 || this.read == null || this.MediaBrowserCompat$CustomActionResultReceiver == 3 || IconCompatParcelizer() == 0)) {
            float asBinder2 = asBinder(this.onPanelClosed, AudioAttributesImplApi26Parcelizer());
            float f = this.initViewTreeOwners;
            if (f == asBinder2) {
                return true;
            }
            if (asBinder2 == -1.0f) {
                if (this.addContentView) {
                    this.MediaBrowserCompat$ItemReceiver = 1;
                    this.MediaBrowserCompat$CustomActionResultReceiver = 3;
                    return false;
                }
                addOnMultiWindowModeChangedListener();
                addOnConfigurationChangedListener();
                return false;
            } else if (f == -1.0f && asBinder2 <= this.asBinder) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", asBinder2);
                this.read.onTransact(bundle);
                this.initViewTreeOwners = asBinder2;
            }
        }
        return true;
    }

    private boolean addOnContextAvailableListener() throws ExoPlaybackException {
        if (this.addContentView) {
            this.MediaBrowserCompat$ItemReceiver = 1;
            if (this.cancel || this.PlaybackStateCompat$CustomAction) {
                this.MediaBrowserCompat$CustomActionResultReceiver = 3;
                return false;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = 2;
        } else {
            addOnNewIntentListener();
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    private void addOnTrimMemoryListener() throws ExoPlaybackException {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == 1) {
            try {
                this.read.read();
            } finally {
                addMenuProvider();
            }
        } else if (i == 2) {
            try {
                this.read.read();
                addMenuProvider();
                addOnNewIntentListener();
            } catch (Throwable th) {
                addMenuProvider();
                throw th;
            }
        } else if (i != 3) {
            this.onCreate = true;
            ParcelableVolumeInfo();
        } else {
            addOnMultiWindowModeChangedListener();
            addOnConfigurationChangedListener();
        }
    }

    /* access modifiers changed from: protected */
    public final long cancel() {
        return this.onMultiWindowModeChanged.asInterface;
    }

    private void addOnNewIntentListener() throws ExoPlaybackException {
        try {
            this.getSavedStateRegistry.setMediaDrmSession(asBinder(this.onPreparePanel).asInterface);
            asInterface(this.onPreparePanel);
            this.MediaBrowserCompat$ItemReceiver = 0;
            this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        } catch (MediaCryptoException e) {
            throw asInterface(e, this.getActivityResultRegistry, 6006);
        }
    }

    private dispatchKeyShortcutEvent asBinder(DrmSession drmSession) throws ExoPlaybackException {
        DrawableContainerCompat.AnonymousClass1 RemoteActionCompatParcelizer2 = drmSession.RemoteActionCompatParcelizer();
        if (RemoteActionCompatParcelizer2 == null || (RemoteActionCompatParcelizer2 instanceof dispatchKeyShortcutEvent)) {
            return (dispatchKeyShortcutEvent) RemoteActionCompatParcelizer2;
        }
        StringBuilder sb = new StringBuilder("Expecting FrameworkCryptoConfig but found: ");
        sb.append(RemoteActionCompatParcelizer2);
        throw asInterface(new IllegalArgumentException(sb.toString()), this.getActivityResultRegistry, 6001);
    }

    private boolean onTransact(long j, long j2) throws ExoPlaybackException {
        if (!this.onCreate) {
            if (this.write.AudioAttributesImplApi26Parcelizer > 0) {
                if (!asInterface(j, j2, (onSubMenuSelected) null, this.write.read, this.f5lambda$new$2$androidxactivityComponentActivity, 0, this.write.AudioAttributesImplApi26Parcelizer, this.write.onTransact, (this.write.asInterface & Integer.MIN_VALUE) == Integer.MIN_VALUE, (this.write.asInterface & 4) == 4, this.onActivityResult)) {
                    return false;
                }
                asInterface(this.write.write);
                this.write.asInterface();
            }
            if (this.getDefaultViewModelCreationExtras) {
                this.onCreate = true;
                return false;
            }
            if (this.onConnectionSuspended) {
                if (this.write.asBinder(this.onConnected)) {
                    this.onConnectionSuspended = false;
                } else {
                    throw new IllegalStateException();
                }
            }
            if (this.AudioAttributesImplBaseParcelizer) {
                if (this.write.AudioAttributesImplApi26Parcelizer > 0) {
                    return true;
                }
                this.AudioAttributesImplBaseParcelizer = false;
                this.write.asInterface();
                this.onConnected.asInterface();
                this.onConnectionSuspended = false;
                this.setInternalConnectionCallback = false;
                this.AudioAttributesImplBaseParcelizer = false;
                addOnConfigurationChangedListener();
                if (!this.setInternalConnectionCallback) {
                    return false;
                }
            }
            if (!this.getDefaultViewModelCreationExtras) {
                setNegativeButton m_ = m_();
                this.onConnected.asInterface();
                while (true) {
                    this.onConnected.asInterface();
                    int asBinder2 = asBinder(m_, this.onConnected, 0);
                    if (asBinder2 != -5) {
                        if (asBinder2 == -4) {
                            if (!((this.onConnected.asInterface & 4) == 4)) {
                                if (this.onPictureInPictureModeChanged) {
                                    setMultiChoiceItems setmultichoiceitems = this.getActivityResultRegistry;
                                    this.onActivityResult = setmultichoiceitems;
                                    read(setmultichoiceitems, (MediaFormat) null);
                                    this.onPictureInPictureModeChanged = false;
                                }
                                DecoderInputBuffer decoderInputBuffer = this.onConnected;
                                ByteBuffer byteBuffer = decoderInputBuffer.read;
                                if (byteBuffer != null) {
                                    byteBuffer.flip();
                                }
                                ByteBuffer byteBuffer2 = decoderInputBuffer.RemoteActionCompatParcelizer;
                                if (byteBuffer2 != null) {
                                    byteBuffer2.flip();
                                }
                                if (!this.write.asBinder(this.onConnected)) {
                                    this.onConnectionSuspended = true;
                                    break;
                                }
                            } else {
                                this.getDefaultViewModelCreationExtras = true;
                                break;
                            }
                        } else if (asBinder2 != -3) {
                            throw new IllegalStateException();
                        }
                    } else {
                        RemoteActionCompatParcelizer(m_);
                        break;
                    }
                }
                if (this.write.AudioAttributesImplApi26Parcelizer > 0) {
                    setTitleOptionalHint settitleoptionalhint = this.write;
                    ByteBuffer byteBuffer3 = settitleoptionalhint.read;
                    if (byteBuffer3 != null) {
                        byteBuffer3.flip();
                    }
                    ByteBuffer byteBuffer4 = settitleoptionalhint.RemoteActionCompatParcelizer;
                    if (byteBuffer4 != null) {
                        byteBuffer4.flip();
                    }
                }
                return (this.write.AudioAttributesImplApi26Parcelizer > 0) || this.getDefaultViewModelCreationExtras || this.AudioAttributesImplBaseParcelizer;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    static final class onTransact {
        public static final onTransact RemoteActionCompatParcelizer = new onTransact(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);
        private long asBinder;
        public final long asInterface;
        public final setShowTitle<setMultiChoiceItems> onTransact = new setShowTitle<>();
        public final long read;

        public onTransact(long j, long j2, long j3) {
            this.read = j;
            this.asBinder = j2;
            this.asInterface = j3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x015d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean read(long r20, long r22) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r19 = this;
            r15 = r19
            int r0 = r15.f5lambda$new$2$androidxactivityComponentActivity
            r14 = 1
            r13 = 0
            if (r0 < 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 != 0) goto L_0x011b
            boolean r0 = r15.Cancellable
            if (r0 == 0) goto L_0x002a
            boolean r0 = r15.addOnMultiWindowModeChangedListener
            if (r0 == 0) goto L_0x002a
            o.onSubMenuSelected r0 = r15.read     // Catch:{ IllegalStateException -> 0x001e }
            android.media.MediaCodec$BufferInfo r1 = r15.f4lambda$new$1$androidxactivityComponentActivity     // Catch:{ IllegalStateException -> 0x001e }
            int r0 = r0.asBinder(r1)     // Catch:{ IllegalStateException -> 0x001e }
            goto L_0x0032
        L_0x001e:
            r19.addOnTrimMemoryListener()
            boolean r0 = r15.onCreate
            if (r0 == 0) goto L_0x0029
            r19.addOnMultiWindowModeChangedListener()
        L_0x0029:
            return r13
        L_0x002a:
            o.onSubMenuSelected r0 = r15.read
            android.media.MediaCodec$BufferInfo r1 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r0 = r0.asBinder(r1)
        L_0x0032:
            if (r0 >= 0) goto L_0x0077
            r1 = -2
            if (r0 != r1) goto L_0x0066
            r15.RatingCompat = r14
            o.onSubMenuSelected r0 = r15.read
            android.media.MediaFormat r0 = r0.onTransact()
            int r1 = r15.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0058
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0058
            r15.onRequestPermissionsResult = r14
            goto L_0x0065
        L_0x0058:
            boolean r1 = r15.createFullyDrawnExecutor
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)
        L_0x0061:
            r15.access$001 = r0
            r15.addMenuProvider = r14
        L_0x0065:
            return r14
        L_0x0066:
            boolean r0 = r15.PlaybackStateCompat
            if (r0 == 0) goto L_0x0076
            boolean r0 = r15.getDefaultViewModelCreationExtras
            if (r0 != 0) goto L_0x0073
            int r0 = r15.MediaBrowserCompat$ItemReceiver
            r1 = 2
            if (r0 != r1) goto L_0x0076
        L_0x0073:
            r19.addOnTrimMemoryListener()
        L_0x0076:
            return r13
        L_0x0077:
            boolean r1 = r15.onRequestPermissionsResult
            if (r1 == 0) goto L_0x0083
            r15.onRequestPermissionsResult = r13
            o.onSubMenuSelected r1 = r15.read
            r1.read(r0, r13)
            return r14
        L_0x0083:
            android.media.MediaCodec$BufferInfo r1 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r1 = r1.size
            if (r1 != 0) goto L_0x0095
            android.media.MediaCodec$BufferInfo r1 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0095
            r19.addOnTrimMemoryListener()
            return r13
        L_0x0095:
            r15.f5lambda$new$2$androidxactivityComponentActivity = r0
            o.onSubMenuSelected r1 = r15.read
            java.nio.ByteBuffer r0 = r1.RemoteActionCompatParcelizer(r0)
            r15.onConfigurationChanged = r0
            if (r0 == 0) goto L_0x00b6
            android.media.MediaCodec$BufferInfo r1 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.onConfigurationChanged
            android.media.MediaCodec$BufferInfo r1 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r1 = r1.offset
            android.media.MediaCodec$BufferInfo r2 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r2 = r2.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x00b6:
            boolean r0 = r15.MediaSessionCompat$Token
            if (r0 == 0) goto L_0x00db
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            long r0 = r0.presentationTimeUs
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00db
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00db
            long r0 = r15.getLastCustomNonConfigurationInstance
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00db
            android.media.MediaCodec$BufferInfo r2 = r15.f4lambda$new$1$androidxactivityComponentActivity
            r2.presentationTimeUs = r0
        L_0x00db:
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            long r0 = r0.presentationTimeUs
            java.util.ArrayList<java.lang.Long> r2 = r15.addOnNewIntentListener
            int r2 = r2.size()
            r3 = 0
        L_0x00e6:
            if (r3 >= r2) goto L_0x0102
            java.util.ArrayList<java.lang.Long> r4 = r15.addOnNewIntentListener
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00ff
            java.util.ArrayList<java.lang.Long> r0 = r15.addOnNewIntentListener
            r0.remove(r3)
            r0 = 1
            goto L_0x0103
        L_0x00ff:
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x0102:
            r0 = 0
        L_0x0103:
            r15.getFullyDrawnReporter = r0
            long r0 = r15.getDefaultViewModelProviderFactory
            android.media.MediaCodec$BufferInfo r2 = r15.f4lambda$new$1$androidxactivityComponentActivity
            long r2 = r2.presentationTimeUs
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0111
            r0 = 1
            goto L_0x0112
        L_0x0111:
            r0 = 0
        L_0x0112:
            r15.getLifecycle = r0
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            long r0 = r0.presentationTimeUs
            r15.RemoteActionCompatParcelizer((long) r0)
        L_0x011b:
            boolean r0 = r15.Cancellable
            if (r0 == 0) goto L_0x0161
            boolean r0 = r15.addOnMultiWindowModeChangedListener
            if (r0 == 0) goto L_0x0161
            o.onSubMenuSelected r5 = r15.read     // Catch:{ IllegalStateException -> 0x0154 }
            java.nio.ByteBuffer r6 = r15.onConfigurationChanged     // Catch:{ IllegalStateException -> 0x0154 }
            int r7 = r15.f5lambda$new$2$androidxactivityComponentActivity     // Catch:{ IllegalStateException -> 0x0154 }
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity     // Catch:{ IllegalStateException -> 0x0154 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0154 }
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity     // Catch:{ IllegalStateException -> 0x0154 }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0154 }
            boolean r12 = r15.getFullyDrawnReporter     // Catch:{ IllegalStateException -> 0x0154 }
            boolean r9 = r15.getLifecycle     // Catch:{ IllegalStateException -> 0x0154 }
            o.setMultiChoiceItems r3 = r15.onActivityResult     // Catch:{ IllegalStateException -> 0x0154 }
            r16 = 1
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = r9
            r9 = r16
            r16 = 0
            r13 = r18
            r18 = 1
            r14 = r17
            boolean r0 = r0.asInterface(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0152 }
            goto L_0x0184
        L_0x0152:
            goto L_0x0156
        L_0x0154:
            r16 = 0
        L_0x0156:
            r19.addOnTrimMemoryListener()
            boolean r0 = r15.onCreate
            if (r0 == 0) goto L_0x0160
            r19.addOnMultiWindowModeChangedListener()
        L_0x0160:
            return r16
        L_0x0161:
            r16 = 0
            r18 = 1
            o.onSubMenuSelected r5 = r15.read
            java.nio.ByteBuffer r6 = r15.onConfigurationChanged
            int r7 = r15.f5lambda$new$2$androidxactivityComponentActivity
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r8 = r0.flags
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.getFullyDrawnReporter
            boolean r13 = r15.getLifecycle
            o.setMultiChoiceItems r14 = r15.onActivityResult
            r9 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.asInterface(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0184:
            if (r0 == 0) goto L_0x01a4
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            long r0 = r0.presentationTimeUs
            r15.asInterface((long) r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f4lambda$new$1$androidxactivityComponentActivity
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0197
            r14 = 1
            goto L_0x0198
        L_0x0197:
            r14 = 0
        L_0x0198:
            r0 = -1
            r15.f5lambda$new$2$androidxactivityComponentActivity = r0
            r0 = 0
            r15.onConfigurationChanged = r0
            if (r14 != 0) goto L_0x01a1
            return r18
        L_0x01a1:
            r19.addOnTrimMemoryListener()
        L_0x01a4:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.read(long, long):boolean");
    }

    private void read(setMultiChoiceItems setmultichoiceitems) {
        this.AudioAttributesImplBaseParcelizer = false;
        this.write.asInterface();
        this.onConnected.asInterface();
        this.onConnectionSuspended = false;
        this.setInternalConnectionCallback = false;
        String str = setmultichoiceitems.f17lambda$new$1$androidxactivityComponentActivity;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.write.IconCompatParcelizer = 32;
        } else {
            this.write.IconCompatParcelizer = 1;
        }
        this.setInternalConnectionCallback = true;
    }

    public void MediaBrowserCompat$ItemReceiver() {
        try {
            this.AudioAttributesImplBaseParcelizer = false;
            this.write.asInterface();
            this.onConnected.asInterface();
            this.onConnectionSuspended = false;
            this.setInternalConnectionCallback = false;
            addOnMultiWindowModeChangedListener();
        } finally {
            RemoteActionCompatParcelizer((DrmSession) null);
        }
    }

    public void addMenuProvider() {
        this.addOnPictureInPictureModeChangedListener = -1;
        this.AudioAttributesImplApi21Parcelizer.read = null;
        this.f5lambda$new$2$androidxactivityComponentActivity = -1;
        this.onConfigurationChanged = null;
        this.MediaSessionCompat$ResultReceiverWrapper = -9223372036854775807L;
        this.addOnMultiWindowModeChangedListener = false;
        this.addContentView = false;
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = false;
        this.onRequestPermissionsResult = false;
        this.getFullyDrawnReporter = false;
        this.getLifecycle = false;
        this.addOnNewIntentListener.clear();
        this.getLastCustomNonConfigurationInstance = -9223372036854775807L;
        this.getDefaultViewModelProviderFactory = -9223372036854775807L;
        this.f3lambda$new$0$androidxactivityComponentActivity = -9223372036854775807L;
        onCloseSubMenu onclosesubmenu = this.onConnectionFailed;
        if (onclosesubmenu != null) {
            onclosesubmenu.onTransact = 0;
            onclosesubmenu.read = 0;
            onclosesubmenu.asBinder = false;
        }
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.addOnConfigurationChangedListener = this.addOnContextAvailableListener ? 1 : 0;
    }
}
