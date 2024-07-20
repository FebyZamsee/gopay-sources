package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActionBarOverlayLayout;
import o.ActivityResultContracts;
import o.AppCompatDelegateImpl;
import o.BaseMenuWrapper;
import o.CustomTabsService;
import o.OnBackPressedDispatcher;
import o.createPopupWindow;
import o.findMenuItemForSubmenu;
import o.getCREATOR$annotations;
import o.getCREATOR$annotations$MediaBrowserCompat$CustomActionResultReceiver;
import o.getCREATOR$annotations$MediaBrowserCompat$SearchResultReceiver;
import o.getCREATOR$annotations$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
import o.getCREATOR$annotations$MediaSessionCompat$QueueItem;
import o.getCompoundPaddingRight;
import o.getMediaType;
import o.mapNightMode;
import o.onActionItemClicked;
import o.onAnimationEnd;
import o.onAnimationStart;
import o.onApplyWindowInsets;
import o.onAttachedFromWindow;
import o.onCreatePanelView;
import o.onCreateView;
import o.onDetachedFromWindow;
import o.onRestoreInstanceState;
import o.onSubDecorInstalled;
import o.onTitleChanged;
import o.setButtonPanelLayoutHint;
import o.setConfigurationLocales;
import o.setExpandActivityOverflowButtonContentDescription;
import o.setHorizontalOffset;
import o.setMediaType;
import o.setMultiChoiceItems;
import o.setOnBackInvokedDispatcher;
import o.setShowingForActionMode;
import o.shouldIncludeItem;

public final class DefaultAudioSink implements AudioSink {
    public static ExecutorService RemoteActionCompatParcelizer;
    public static int asInterface;
    public static final Object onTransact = new Object();
    private onSubDecorInstalled AudioAttributesCompatParcelizer;
    AudioSink.RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private AudioAttributesImplApi26Parcelizer AudioAttributesImplApi26Parcelizer;
    private final setConfigurationLocales AudioAttributesImplBaseParcelizer;
    private ByteBuffer Cancellable;
    private boolean ComponentActivity;
    boolean IconCompatParcelizer;
    private onTitleChanged MediaBrowserCompat$CustomActionResultReceiver;
    private ByteBuffer MediaBrowserCompat$ItemReceiver;
    private final AppCompatDelegateImpl.AnonymousClass5 MediaBrowserCompat$MediaItem;
    private AppCompatDelegateImpl.AnonymousClass3 MediaBrowserCompat$SearchResultReceiver;
    private final onAnimationEnd MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private IconCompatParcelizer MediaSessionCompat$QueueItem;
    private final boolean MediaSessionCompat$ResultReceiverWrapper;
    private final AudioAttributesImplApi21Parcelizer<AudioSink.InitializationException> MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    private boolean PlaybackStateCompat;
    private boolean PlaybackStateCompat$CustomAction;
    private final boolean RatingCompat;
    private boolean access$001;
    private onConnected addContentView;
    private ByteBuffer addMenuProvider;
    private ByteBuffer[] addOnConfigurationChangedListener;
    private final int addOnContextAvailableListener;
    private IconCompatParcelizer addOnMultiWindowModeChangedListener;
    private int addOnNewIntentListener;
    private byte[] addOnPictureInPictureModeChangedListener;
    private mapNightMode addOnTrimMemoryListener;
    long asBinder;
    private int cancel;
    private AudioAttributesImplApi26Parcelizer createFullyDrawnExecutor;
    private read ensureViewModelStore;
    private final BaseMenuWrapper getActivityResultRegistry;
    private boolean getDefaultViewModelCreationExtras;
    private long getDefaultViewModelProviderFactory;
    private boolean getFullyDrawnReporter;
    private boolean getLastCustomNonConfigurationInstance;
    private long getLifecycle;
    private final AudioProcessor[] getOnBackPressedDispatcher;
    private final AudioProcessor[] getSavedStateRegistry;
    private long getViewModelStore;
    private final ArrayDeque<AudioAttributesImplApi26Parcelizer> initViewTreeOwners;
    private final onActionItemClicked invalidateMenu;

    /* renamed from: lambda$new$0$androidx-activity-ComponentActivity  reason: not valid java name */
    private boolean f0lambda$new$0$androidxactivityComponentActivity;

    /* renamed from: lambda$new$1$androidx-activity-ComponentActivity  reason: not valid java name */
    private long f1lambda$new$1$androidxactivityComponentActivity;

    /* renamed from: lambda$new$2$androidx-activity-ComponentActivity  reason: not valid java name */
    private final AudioAttributesImplApi21Parcelizer<AudioSink.WriteException> f2lambda$new$2$androidxactivityComponentActivity;
    private float onActivityResult;
    private long onBackPressed;
    private final onTransact onConnected;
    private int onConnectionFailed;
    private final onCreateView onConnectionSuspended;
    AudioTrack read;
    private final setButtonPanelLayoutHint.RemoteActionCompatParcelizer setInternalConnectionCallback;
    private AudioProcessor[] write;

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
    }

    public static final class asBinder {
        public int IconCompatParcelizer = 0;
        public setConfigurationLocales RemoteActionCompatParcelizer;
        public onCreateView asBinder = onCreateView.onTransact;
        setButtonPanelLayoutHint.RemoteActionCompatParcelizer asInterface;
        public boolean onTransact;
        onTransact read = onTransact.asInterface;
        public boolean write;
    }

    public interface onTransact {
        public static final onTransact asInterface = new onDetachedFromWindow.RemoteActionCompatParcelizer().read();

        int asBinder(int i, int i2, int i3, int i4, int i5, int i6, double d);
    }

    public /* synthetic */ DefaultAudioSink(asBinder asbinder, byte b) {
        this(asbinder);
    }

    public static class write implements setConfigurationLocales {
        private final AudioProcessor[] asBinder;
        private final AppCompatDelegateImpl.AnonymousClass7 asInterface;
        private final onCreatePanelView read;

        public write(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new onCreatePanelView(), new AudioProcessor() {
                private ByteBuffer AudioAttributesCompatParcelizer;
                public boolean AudioAttributesImplApi21Parcelizer;
                public float AudioAttributesImplApi26Parcelizer = 1.0f;
                private AudioProcessor.read AudioAttributesImplBaseParcelizer = AudioProcessor.read.read;
                public float IconCompatParcelizer = 1.0f;
                private ShortBuffer MediaDescriptionCompat;
                public AudioProcessor.read RemoteActionCompatParcelizer = AudioProcessor.read.read;
                public long asInterface;
                private ByteBuffer onConnected;
                private boolean onConnectionFailed;
                private AudioProcessor.read onConnectionSuspended = AudioProcessor.read.read;
                public AudioProcessor.read onTransact = AudioProcessor.read.read;
                public long read;
                private int setInternalConnectionCallback;
                public ActionBarDrawableToggleImpl write;

                {
                    ByteBuffer byteBuffer = asBinder;
                    this.AudioAttributesCompatParcelizer = byteBuffer;
                    this.MediaDescriptionCompat = byteBuffer.asShortBuffer();
                    this.onConnected = asBinder;
                    this.setInternalConnectionCallback = -1;
                }

                public final AudioProcessor.read read(AudioProcessor.read read2) throws AudioProcessor.UnhandledAudioFormatException {
                    if (read2.onTransact == 2) {
                        int i = this.setInternalConnectionCallback;
                        if (i == -1) {
                            i = read2.asInterface;
                        }
                        this.onConnectionSuspended = read2;
                        AudioProcessor.read read3 = new AudioProcessor.read(i, read2.asBinder, 2);
                        this.AudioAttributesImplBaseParcelizer = read3;
                        this.AudioAttributesImplApi21Parcelizer = true;
                        return read3;
                    }
                    throw new AudioProcessor.UnhandledAudioFormatException(read2);
                }

                public final boolean onTransact() {
                    return this.AudioAttributesImplBaseParcelizer.asInterface != -1 && (Math.abs(this.IconCompatParcelizer - 1.0f) >= 1.0E-4f || Math.abs(this.AudioAttributesImplApi26Parcelizer - 1.0f) >= 1.0E-4f || this.AudioAttributesImplBaseParcelizer.asInterface != this.onConnectionSuspended.asInterface);
                }

                public final void read(ByteBuffer byteBuffer) {
                    if (byteBuffer.hasRemaining()) {
                        ActionBarDrawableToggleImpl actionBarDrawableToggleImpl = this.write;
                        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                        int remaining = byteBuffer.remaining();
                        this.read += (long) remaining;
                        int remaining2 = asShortBuffer.remaining();
                        int i = actionBarDrawableToggleImpl.onTransact;
                        int i2 = remaining2 / i;
                        short[] onTransact2 = actionBarDrawableToggleImpl.onTransact(actionBarDrawableToggleImpl.read, actionBarDrawableToggleImpl.RemoteActionCompatParcelizer, i2);
                        actionBarDrawableToggleImpl.read = onTransact2;
                        asShortBuffer.get(onTransact2, actionBarDrawableToggleImpl.RemoteActionCompatParcelizer * actionBarDrawableToggleImpl.onTransact, ((i * i2) << 1) / 2);
                        actionBarDrawableToggleImpl.RemoteActionCompatParcelizer += i2;
                        actionBarDrawableToggleImpl.asBinder();
                        byteBuffer.position(byteBuffer.position() + remaining);
                    }
                }

                public final void read() {
                    int i;
                    ActionBarDrawableToggleImpl actionBarDrawableToggleImpl = this.write;
                    if (actionBarDrawableToggleImpl != null) {
                        int i2 = actionBarDrawableToggleImpl.RemoteActionCompatParcelizer;
                        float f = actionBarDrawableToggleImpl.MediaDescriptionCompat;
                        float f2 = actionBarDrawableToggleImpl.onConnectionFailed;
                        int i3 = actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer + ((int) ((((((float) i2) / (f / f2)) + ((float) actionBarDrawableToggleImpl.AudioAttributesImplBaseParcelizer)) / (actionBarDrawableToggleImpl.onConnectionSuspended * f2)) + 0.5f));
                        actionBarDrawableToggleImpl.read = actionBarDrawableToggleImpl.onTransact(actionBarDrawableToggleImpl.read, i2, (actionBarDrawableToggleImpl.asInterface << 1) + i2);
                        int i4 = 0;
                        while (true) {
                            int i5 = actionBarDrawableToggleImpl.asInterface;
                            int i6 = actionBarDrawableToggleImpl.onTransact;
                            i = i5 << 1;
                            if (i4 >= i * i6) {
                                break;
                            }
                            actionBarDrawableToggleImpl.read[(i6 * i2) + i4] = 0;
                            i4++;
                        }
                        actionBarDrawableToggleImpl.RemoteActionCompatParcelizer += i;
                        actionBarDrawableToggleImpl.asBinder();
                        if (actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer > i3) {
                            actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer = i3;
                        }
                        actionBarDrawableToggleImpl.RemoteActionCompatParcelizer = 0;
                        actionBarDrawableToggleImpl.MediaBrowserCompat$CustomActionResultReceiver = 0;
                        actionBarDrawableToggleImpl.AudioAttributesImplBaseParcelizer = 0;
                    }
                    this.onConnectionFailed = true;
                }

                public final ByteBuffer asInterface() {
                    int i;
                    ActionBarDrawableToggleImpl actionBarDrawableToggleImpl = this.write;
                    if (actionBarDrawableToggleImpl != null && (i = (actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer * actionBarDrawableToggleImpl.onTransact) << 1) > 0) {
                        if (this.AudioAttributesCompatParcelizer.capacity() < i) {
                            ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                            this.AudioAttributesCompatParcelizer = order;
                            this.MediaDescriptionCompat = order.asShortBuffer();
                        } else {
                            this.AudioAttributesCompatParcelizer.clear();
                            this.MediaDescriptionCompat.clear();
                        }
                        ShortBuffer shortBuffer = this.MediaDescriptionCompat;
                        int min = Math.min(shortBuffer.remaining() / actionBarDrawableToggleImpl.onTransact, actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer);
                        shortBuffer.put(actionBarDrawableToggleImpl.IconCompatParcelizer, 0, actionBarDrawableToggleImpl.onTransact * min);
                        int i2 = actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer - min;
                        actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer = i2;
                        short[] sArr = actionBarDrawableToggleImpl.IconCompatParcelizer;
                        int i3 = actionBarDrawableToggleImpl.onTransact;
                        System.arraycopy(sArr, min * i3, sArr, 0, i2 * i3);
                        this.asInterface += (long) i;
                        this.AudioAttributesCompatParcelizer.limit(i);
                        this.onConnected = this.AudioAttributesCompatParcelizer;
                    }
                    ByteBuffer byteBuffer = this.onConnected;
                    this.onConnected = asBinder;
                    return byteBuffer;
                }

                /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
                    r0 = r3.write;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final boolean RemoteActionCompatParcelizer() {
                    /*
                        r3 = this;
                        boolean r0 = r3.onConnectionFailed
                        r1 = 1
                        if (r0 == 0) goto L_0x0014
                        o.AppCompatDelegateImpl$ActionBarDrawableToggleImpl r0 = r3.write
                        if (r0 == 0) goto L_0x0015
                        int r2 = r0.AudioAttributesImplApi26Parcelizer
                        int r0 = r0.onTransact
                        int r2 = r2 * r0
                        int r0 = r2 << 1
                        if (r0 != 0) goto L_0x0014
                        goto L_0x0015
                    L_0x0014:
                        r1 = 0
                    L_0x0015:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.AppCompatDelegateImpl.AnonymousClass7.RemoteActionCompatParcelizer():boolean");
                }

                public final void asBinder() {
                    if (onTransact()) {
                        AudioProcessor.read read2 = this.onConnectionSuspended;
                        this.RemoteActionCompatParcelizer = read2;
                        this.onTransact = this.AudioAttributesImplBaseParcelizer;
                        if (this.AudioAttributesImplApi21Parcelizer) {
                            this.write = new ActionBarDrawableToggleImpl(read2.asInterface, this.RemoteActionCompatParcelizer.asBinder, this.IconCompatParcelizer, this.AudioAttributesImplApi26Parcelizer, this.onTransact.asInterface);
                        } else {
                            ActionBarDrawableToggleImpl actionBarDrawableToggleImpl = this.write;
                            if (actionBarDrawableToggleImpl != null) {
                                actionBarDrawableToggleImpl.RemoteActionCompatParcelizer = 0;
                                actionBarDrawableToggleImpl.AudioAttributesImplApi26Parcelizer = 0;
                                actionBarDrawableToggleImpl.AudioAttributesImplBaseParcelizer = 0;
                                actionBarDrawableToggleImpl.AudioAttributesCompatParcelizer = 0;
                                actionBarDrawableToggleImpl.AudioAttributesImplApi21Parcelizer = 0;
                                actionBarDrawableToggleImpl.MediaBrowserCompat$CustomActionResultReceiver = 0;
                                actionBarDrawableToggleImpl.onConnected = 0;
                                actionBarDrawableToggleImpl.setInternalConnectionCallback = 0;
                                actionBarDrawableToggleImpl.write = 0;
                                actionBarDrawableToggleImpl.asBinder = 0;
                            }
                        }
                    }
                    this.onConnected = asBinder;
                    this.read = 0;
                    this.asInterface = 0;
                    this.onConnectionFailed = false;
                }

                public final void IconCompatParcelizer() {
                    this.IconCompatParcelizer = 1.0f;
                    this.AudioAttributesImplApi26Parcelizer = 1.0f;
                    this.onConnectionSuspended = AudioProcessor.read.read;
                    this.AudioAttributesImplBaseParcelizer = AudioProcessor.read.read;
                    this.RemoteActionCompatParcelizer = AudioProcessor.read.read;
                    this.onTransact = AudioProcessor.read.read;
                    ByteBuffer byteBuffer = asBinder;
                    this.AudioAttributesCompatParcelizer = byteBuffer;
                    this.MediaDescriptionCompat = byteBuffer.asShortBuffer();
                    this.onConnected = asBinder;
                    this.setInternalConnectionCallback = -1;
                    this.AudioAttributesImplApi21Parcelizer = false;
                    this.write = null;
                    this.read = 0;
                    this.asInterface = 0;
                    this.onConnectionFailed = false;
                }
            });
        }

        private write(AudioProcessor[] audioProcessorArr, onCreatePanelView oncreatepanelview, AppCompatDelegateImpl.AnonymousClass7 r6) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[(audioProcessorArr.length + 2)];
            this.asBinder = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.read = oncreatepanelview;
            this.asInterface = r6;
            audioProcessorArr2[audioProcessorArr.length] = oncreatepanelview;
            audioProcessorArr2[audioProcessorArr.length + 1] = r6;
        }

        public final AudioProcessor[] asBinder() {
            return this.asBinder;
        }

        public final onTitleChanged asBinder(onTitleChanged ontitlechanged) {
            AppCompatDelegateImpl.AnonymousClass7 r0 = this.asInterface;
            float f = ontitlechanged.AudioAttributesImplApi26Parcelizer;
            if (r0.IconCompatParcelizer != f) {
                r0.IconCompatParcelizer = f;
                r0.AudioAttributesImplApi21Parcelizer = true;
            }
            AppCompatDelegateImpl.AnonymousClass7 r02 = this.asInterface;
            float f2 = ontitlechanged.onTransact;
            if (r02.AudioAttributesImplApi26Parcelizer != f2) {
                r02.AudioAttributesImplApi26Parcelizer = f2;
                r02.AudioAttributesImplApi21Parcelizer = true;
            }
            return ontitlechanged;
        }

        public final boolean asInterface(boolean z) {
            this.read.RemoteActionCompatParcelizer = z;
            return z;
        }

        public final long onTransact(long j) {
            AppCompatDelegateImpl.AnonymousClass7 r1 = this.asInterface;
            if (r1.asInterface < 1024) {
                return (long) (((double) r1.IconCompatParcelizer) * ((double) j));
            }
            long j2 = r1.read;
            AppCompatDelegateImpl.ActionBarDrawableToggleImpl actionBarDrawableToggleImpl = r1.write;
            long j3 = j2 - ((long) ((actionBarDrawableToggleImpl.RemoteActionCompatParcelizer * actionBarDrawableToggleImpl.onTransact) << 1));
            if (r1.onTransact.asInterface == r1.RemoteActionCompatParcelizer.asInterface) {
                return OnBackPressedDispatcher.Api33Impl.asInterface(j, j3, r1.asInterface);
            }
            return OnBackPressedDispatcher.Api33Impl.asInterface(j, j3 * ((long) r1.onTransact.asInterface), r1.asInterface * ((long) r1.RemoteActionCompatParcelizer.asInterface));
        }

        public final long read() {
            return this.read.read;
        }
    }

    private DefaultAudioSink(asBinder asbinder) {
        this.onConnectionSuspended = asbinder.asBinder;
        setConfigurationLocales setconfigurationlocales = asbinder.RemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = setconfigurationlocales;
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 21) {
            boolean z = asbinder.write;
        }
        this.RatingCompat = false;
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 23) {
            boolean z2 = asbinder.onTransact;
        }
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 29) {
            int i = asbinder.IconCompatParcelizer;
        }
        this.addOnContextAvailableListener = 0;
        this.onConnected = asbinder.read;
        BaseMenuWrapper baseMenuWrapper = new BaseMenuWrapper(shouldIncludeItem.asInterface);
        this.getActivityResultRegistry = baseMenuWrapper;
        baseMenuWrapper.asBinder();
        this.MediaBrowserCompat$MediaItem = new Object(new AudioAttributesCompatParcelizer(this, (byte) 0)) {
            public long AudioAttributesCompatParcelizer;
            public boolean AudioAttributesImplApi21Parcelizer;
            public boolean AudioAttributesImplApi26Parcelizer;
            public final read AudioAttributesImplBaseParcelizer;
            private int Cancellable;
            private long ComponentActivity;
            public long IconCompatParcelizer;
            public long MediaBrowserCompat$CustomActionResultReceiver;
            public long MediaBrowserCompat$ItemReceiver;
            public long MediaBrowserCompat$MediaItem;
            public long MediaBrowserCompat$SearchResultReceiver;
            private long MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
            public long MediaDescriptionCompat;
            private long MediaMetadataCompat;
            private boolean MediaSessionCompat$QueueItem;
            private long MediaSessionCompat$ResultReceiverWrapper;
            private long MediaSessionCompat$Token;
            private final long[] ParcelableVolumeInfo;
            private int PlaybackStateCompat;
            private boolean PlaybackStateCompat$CustomAction;
            private Method RatingCompat;
            public AnonymousClass4 RemoteActionCompatParcelizer;
            private long access$001;
            public AudioTrack asBinder;
            public int asInterface;
            private long cancel;
            public int onConnected;
            public boolean onConnectionFailed;
            public int onConnectionSuspended;
            public long onTransact;
            public float read;
            public long setInternalConnectionCallback;
            public long write;

            /* renamed from: o.AppCompatDelegateImpl$5$read */
            public interface read {
                void asInterface(long j, long j2, long j3, long j4);

                void onTransact(int i, long j);

                void onTransact(long j, long j2, long j3, long j4);

                void read(long j);
            }

            {
                this.AudioAttributesImplBaseParcelizer = r3;
                if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 18) {
                    try {
                        Class[] clsArr = null;
                        this.RatingCompat = AudioTrack.class.getMethod("getLatency", (Class[]) null);
                    } catch (NoSuchMethodException unused) {
                    }
                }
                this.ParcelableVolumeInfo = new long[10];
            }

            /* JADX WARNING: Removed duplicated region for block: B:103:0x01e5  */
            /* JADX WARNING: Removed duplicated region for block: B:104:0x01e7  */
            /* JADX WARNING: Removed duplicated region for block: B:106:0x01ea  */
            /* JADX WARNING: Removed duplicated region for block: B:118:0x0222  */
            /* JADX WARNING: Removed duplicated region for block: B:129:0x0259  */
            /* JADX WARNING: Removed duplicated region for block: B:132:0x026c  */
            /* JADX WARNING: Removed duplicated region for block: B:137:0x0295  */
            /* JADX WARNING: Removed duplicated region for block: B:140:0x029a  */
            /* JADX WARNING: Removed duplicated region for block: B:63:0x0127  */
            /* JADX WARNING: Removed duplicated region for block: B:94:0x01cb A[Catch:{ Exception -> 0x01cf }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final long asInterface(boolean r29) {
                /*
                    r28 = this;
                    r0 = r28
                    android.media.AudioTrack r1 = r0.asBinder
                    android.media.AudioTrack r1 = (android.media.AudioTrack) r1
                    int r1 = r1.getPlayState()
                    r4 = 2
                    r5 = 3
                    r8 = 1065353216(0x3f800000, float:1.0)
                    r9 = 0
                    r11 = 1000000(0xf4240, double:4.940656E-318)
                    r13 = 1
                    r15 = 1000(0x3e8, double:4.94E-321)
                    if (r1 != r5) goto L_0x01d5
                    long r17 = java.lang.System.nanoTime()
                    long r2 = r17 / r15
                    long r6 = r0.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                    long r6 = r2 - r6
                    r19 = 30000(0x7530, double:1.4822E-319)
                    int r1 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
                    if (r1 < 0) goto L_0x0071
                    long r6 = r28.asBinder()
                    long r6 = r6 * r11
                    int r1 = r0.onConnectionSuspended
                    long r11 = (long) r1
                    long r6 = r6 / r11
                    int r1 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
                    if (r1 == 0) goto L_0x01d5
                    long[] r1 = r0.ParcelableVolumeInfo
                    int r11 = r0.PlaybackStateCompat
                    float r12 = r0.read
                    int r19 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
                    if (r19 != 0) goto L_0x0041
                    goto L_0x0048
                L_0x0041:
                    double r6 = (double) r6
                    double r14 = (double) r12
                    double r6 = r6 / r14
                    long r6 = java.lang.Math.round(r6)
                L_0x0048:
                    long r6 = r6 - r2
                    r1[r11] = r6
                    int r1 = r0.PlaybackStateCompat
                    int r1 = r1 + r13
                    r6 = 10
                    int r1 = r1 % r6
                    r0.PlaybackStateCompat = r1
                    int r1 = r0.Cancellable
                    if (r1 >= r6) goto L_0x005a
                    int r1 = r1 + r13
                    r0.Cancellable = r1
                L_0x005a:
                    r0.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = r2
                    r0.cancel = r9
                    r1 = 0
                L_0x005f:
                    int r6 = r0.Cancellable
                    if (r1 >= r6) goto L_0x0071
                    long r11 = r0.cancel
                    long[] r7 = r0.ParcelableVolumeInfo
                    r14 = r7[r1]
                    long r6 = (long) r6
                    long r14 = r14 / r6
                    long r11 = r11 + r14
                    r0.cancel = r11
                    int r1 = r1 + 1
                    goto L_0x005f
                L_0x0071:
                    boolean r1 = r0.onConnectionFailed
                    if (r1 != 0) goto L_0x01d5
                    o.AppCompatDelegateImpl$4 r1 = r0.RemoteActionCompatParcelizer
                    o.AppCompatDelegateImpl$4 r1 = (o.AppCompatDelegateImpl.AnonymousClass4) r1
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r6 = r1.read
                    r11 = 500000(0x7a120, double:2.47033E-318)
                    r7 = 4
                    if (r6 == 0) goto L_0x0121
                    long r14 = r1.asBinder
                    long r14 = r2 - r14
                    long r8 = r1.asInterface
                    int r10 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
                    if (r10 >= 0) goto L_0x008d
                    goto L_0x0121
                L_0x008d:
                    r1.asBinder = r2
                    android.media.AudioTrack r8 = r6.read
                    android.media.AudioTimestamp r9 = r6.asInterface
                    boolean r8 = r8.getTimestamp(r9)
                    if (r8 == 0) goto L_0x00b6
                    android.media.AudioTimestamp r9 = r6.asInterface
                    long r9 = r9.framePosition
                    long r14 = r6.onTransact
                    int r19 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
                    if (r19 <= 0) goto L_0x00ab
                    long r14 = r6.RemoteActionCompatParcelizer
                    r19 = 1
                    long r14 = r14 + r19
                    r6.RemoteActionCompatParcelizer = r14
                L_0x00ab:
                    r6.onTransact = r9
                    long r14 = r6.RemoteActionCompatParcelizer
                    r19 = 32
                    long r14 = r14 << r19
                    long r9 = r9 + r14
                    r6.asBinder = r9
                L_0x00b6:
                    int r6 = r1.write
                    if (r6 == 0) goto L_0x00fa
                    if (r6 == r13) goto L_0x00e1
                    if (r6 == r4) goto L_0x00d6
                    if (r6 == r5) goto L_0x00c9
                    if (r6 != r7) goto L_0x00c3
                    goto L_0x0122
                L_0x00c3:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    r1.<init>()
                    throw r1
                L_0x00c9:
                    if (r8 == 0) goto L_0x0122
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r5 = r1.read
                    if (r5 == 0) goto L_0x00d4
                    r5 = 0
                    r1.asInterface(r5)
                    goto L_0x0122
                L_0x00d4:
                    r5 = 0
                    goto L_0x0122
                L_0x00d6:
                    r5 = 0
                    if (r8 != 0) goto L_0x0122
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r6 = r1.read
                    if (r6 == 0) goto L_0x0122
                    r1.asInterface(r5)
                    goto L_0x0122
                L_0x00e1:
                    if (r8 == 0) goto L_0x00f1
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r5 = r1.read
                    long r5 = r5.asBinder
                    long r9 = r1.onTransact
                    int r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                    if (r14 <= 0) goto L_0x0122
                    r1.asInterface(r4)
                    goto L_0x0122
                L_0x00f1:
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r5 = r1.read
                    if (r5 == 0) goto L_0x0122
                    r5 = 0
                    r1.asInterface(r5)
                    goto L_0x0122
                L_0x00fa:
                    if (r8 == 0) goto L_0x0115
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r5 = r1.read
                    android.media.AudioTimestamp r5 = r5.asInterface
                    long r5 = r5.nanoTime
                    r9 = 1000(0x3e8, double:4.94E-321)
                    long r5 = r5 / r9
                    long r9 = r1.RemoteActionCompatParcelizer
                    int r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                    if (r14 < 0) goto L_0x0121
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r5 = r1.read
                    long r5 = r5.asBinder
                    r1.onTransact = r5
                    r1.asInterface(r13)
                    goto L_0x0122
                L_0x0115:
                    long r9 = r1.RemoteActionCompatParcelizer
                    long r9 = r2 - r9
                    int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r6 <= 0) goto L_0x0122
                    r1.asInterface(r5)
                    goto L_0x0122
                L_0x0121:
                    r8 = 0
                L_0x0122:
                    r5 = 5000000(0x4c4b40, double:2.470328E-317)
                    if (r8 == 0) goto L_0x0196
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r8 = r1.read
                    if (r8 == 0) goto L_0x0135
                    android.media.AudioTimestamp r8 = r8.asInterface
                    long r8 = r8.nanoTime
                    r14 = 1000(0x3e8, double:4.94E-321)
                    long r8 = r8 / r14
                    r22 = r8
                    goto L_0x013a
                L_0x0135:
                    r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                L_0x013a:
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r8 = r1.read
                    if (r8 == 0) goto L_0x0143
                    long r8 = r8.asBinder
                    r20 = r8
                    goto L_0x0145
                L_0x0143:
                    r20 = -1
                L_0x0145:
                    long r8 = r28.asBinder()
                    r14 = 1000000(0xf4240, double:4.940656E-318)
                    long r8 = r8 * r14
                    int r10 = r0.onConnectionSuspended
                    long r14 = (long) r10
                    long r26 = r8 / r14
                    long r8 = r22 - r2
                    long r8 = java.lang.Math.abs(r8)
                    int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                    if (r10 <= 0) goto L_0x016a
                    o.AppCompatDelegateImpl$5$read r8 = r0.AudioAttributesImplBaseParcelizer
                    r19 = r8
                    r24 = r2
                    r19.asInterface(r20, r22, r24, r26)
                    r1.asInterface(r7)
                    goto L_0x0196
                L_0x016a:
                    r8 = 1000000(0xf4240, double:4.940656E-318)
                    long r14 = r20 * r8
                    int r8 = r0.onConnectionSuspended
                    long r8 = (long) r8
                    long r14 = r14 / r8
                    long r14 = r14 - r26
                    long r8 = java.lang.Math.abs(r14)
                    int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                    if (r10 <= 0) goto L_0x018a
                    o.AppCompatDelegateImpl$5$read r8 = r0.AudioAttributesImplBaseParcelizer
                    r19 = r8
                    r24 = r2
                    r19.onTransact(r20, r22, r24, r26)
                    r1.asInterface(r7)
                    goto L_0x0196
                L_0x018a:
                    int r8 = r1.write
                    if (r8 != r7) goto L_0x0196
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r7 = r1.read
                    if (r7 == 0) goto L_0x0196
                    r7 = 0
                    r1.asInterface(r7)
                L_0x0196:
                    boolean r1 = r0.AudioAttributesImplApi26Parcelizer
                    if (r1 == 0) goto L_0x01d5
                    java.lang.reflect.Method r1 = r0.RatingCompat
                    if (r1 == 0) goto L_0x01d5
                    long r7 = r0.IconCompatParcelizer
                    long r7 = r2 - r7
                    int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                    if (r9 < 0) goto L_0x01d5
                    android.media.AudioTrack r7 = r0.asBinder     // Catch:{ Exception -> 0x01ce }
                    r8 = 0
                    java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01cf }
                    java.lang.Object r1 = r1.invoke(r7, r9)     // Catch:{ Exception -> 0x01cf }
                    java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x01cf }
                    int r1 = r1.intValue()     // Catch:{ Exception -> 0x01cf }
                    long r9 = (long) r1     // Catch:{ Exception -> 0x01cf }
                    r11 = 1000(0x3e8, double:4.94E-321)
                    long r9 = r9 * r11
                    long r11 = r0.onTransact     // Catch:{ Exception -> 0x01cf }
                    long r9 = r9 - r11
                    r0.setInternalConnectionCallback = r9     // Catch:{ Exception -> 0x01cf }
                    r11 = 0
                    long r9 = java.lang.Math.max(r9, r11)     // Catch:{ Exception -> 0x01cf }
                    r0.setInternalConnectionCallback = r9     // Catch:{ Exception -> 0x01cf }
                    int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                    if (r1 <= 0) goto L_0x01d2
                    r0.setInternalConnectionCallback = r11     // Catch:{ Exception -> 0x01cf }
                    goto L_0x01d2
                L_0x01ce:
                    r8 = 0
                L_0x01cf:
                    r1 = 0
                    r0.RatingCompat = r1
                L_0x01d2:
                    r0.IconCompatParcelizer = r2
                    goto L_0x01d6
                L_0x01d5:
                    r8 = 0
                L_0x01d6:
                    long r1 = java.lang.System.nanoTime()
                    r5 = 1000(0x3e8, double:4.94E-321)
                    long r1 = r1 / r5
                    o.AppCompatDelegateImpl$4 r3 = r0.RemoteActionCompatParcelizer
                    o.AppCompatDelegateImpl$4 r3 = (o.AppCompatDelegateImpl.AnonymousClass4) r3
                    int r5 = r3.write
                    if (r5 != r4) goto L_0x01e7
                    r14 = 1
                    goto L_0x01e8
                L_0x01e7:
                    r14 = 0
                L_0x01e8:
                    if (r14 == 0) goto L_0x0222
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r4 = r3.read
                    if (r4 == 0) goto L_0x01f1
                    long r4 = r4.asBinder
                    goto L_0x01f3
                L_0x01f1:
                    r4 = -1
                L_0x01f3:
                    r6 = 1000000(0xf4240, double:4.940656E-318)
                    long r4 = r4 * r6
                    int r6 = r0.onConnectionSuspended
                    long r6 = (long) r6
                    long r4 = r4 / r6
                    o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r3 = r3.read
                    if (r3 == 0) goto L_0x0208
                    android.media.AudioTimestamp r3 = r3.asInterface
                    long r6 = r3.nanoTime
                    r8 = 1000(0x3e8, double:4.94E-321)
                    long r6 = r6 / r8
                    goto L_0x020d
                L_0x0208:
                    r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                L_0x020d:
                    float r3 = r0.read
                    long r6 = r1 - r6
                    r8 = 1065353216(0x3f800000, float:1.0)
                    int r9 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                    if (r9 != 0) goto L_0x0218
                    goto L_0x0220
                L_0x0218:
                    double r6 = (double) r6
                    double r8 = (double) r3
                    double r6 = r6 * r8
                    long r6 = java.lang.Math.round(r6)
                L_0x0220:
                    long r4 = r4 + r6
                    goto L_0x0255
                L_0x0222:
                    int r3 = r0.Cancellable
                    if (r3 != 0) goto L_0x0235
                    long r3 = r28.asBinder()
                    r5 = 1000000(0xf4240, double:4.940656E-318)
                    long r3 = r3 * r5
                    int r5 = r0.onConnectionSuspended
                    long r5 = (long) r5
                    long r3 = r3 / r5
                L_0x0233:
                    r4 = r3
                    goto L_0x024a
                L_0x0235:
                    long r3 = r0.cancel
                    float r5 = r0.read
                    long r3 = r3 + r1
                    r6 = 1065353216(0x3f800000, float:1.0)
                    int r7 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                    if (r7 != 0) goto L_0x0241
                    goto L_0x0233
                L_0x0241:
                    double r3 = (double) r3
                    double r5 = (double) r5
                    double r3 = r3 * r5
                    long r3 = java.lang.Math.round(r3)
                    goto L_0x0233
                L_0x024a:
                    if (r29 != 0) goto L_0x0255
                    long r6 = r0.setInternalConnectionCallback
                    long r4 = r4 - r6
                    r6 = 0
                    long r4 = java.lang.Math.max(r6, r4)
                L_0x0255:
                    boolean r3 = r0.MediaSessionCompat$QueueItem
                    if (r3 == r14) goto L_0x0261
                    long r6 = r0.MediaSessionCompat$Token
                    r0.ComponentActivity = r6
                    long r6 = r0.MediaSessionCompat$ResultReceiverWrapper
                    r0.access$001 = r6
                L_0x0261:
                    long r6 = r0.ComponentActivity
                    long r6 = r1 - r6
                    r8 = 1000000(0xf4240, double:4.940656E-318)
                    int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r3 >= 0) goto L_0x0295
                    long r8 = r0.access$001
                    float r3 = r0.read
                    r10 = 1065353216(0x3f800000, float:1.0)
                    int r11 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                    if (r11 != 0) goto L_0x0279
                    r10 = r6
                    r15 = r14
                    goto L_0x0282
                L_0x0279:
                    double r10 = (double) r6
                    r15 = r14
                    double r13 = (double) r3
                    double r10 = r10 * r13
                    long r10 = java.lang.Math.round(r10)
                L_0x0282:
                    r13 = 1000(0x3e8, double:4.94E-321)
                    long r6 = r6 * r13
                    r19 = 1000000(0xf4240, double:4.940656E-318)
                    long r6 = r6 / r19
                    long r4 = r4 * r6
                    long r6 = r13 - r6
                    long r8 = r8 + r10
                    long r6 = r6 * r8
                    long r4 = r4 + r6
                    long r4 = r4 / r13
                    goto L_0x0296
                L_0x0295:
                    r15 = r14
                L_0x0296:
                    boolean r3 = r0.PlaybackStateCompat$CustomAction
                    if (r3 != 0) goto L_0x02e3
                    long r6 = r0.MediaSessionCompat$ResultReceiverWrapper
                    int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r3 <= 0) goto L_0x02e3
                    r3 = 1
                    r0.PlaybackStateCompat$CustomAction = r3
                    long r6 = r4 - r6
                    r8 = -9223372036854775808
                    r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    int r3 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                    if (r3 == 0) goto L_0x02b8
                    int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r3 != 0) goto L_0x02b5
                    goto L_0x02b8
                L_0x02b5:
                    r10 = 1000(0x3e8, double:4.94E-321)
                    long r6 = r6 / r10
                L_0x02b8:
                    float r3 = r0.read
                    r10 = 1065353216(0x3f800000, float:1.0)
                    int r10 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                    if (r10 != 0) goto L_0x02c1
                    goto L_0x02c8
                L_0x02c1:
                    double r6 = (double) r6
                    double r10 = (double) r3
                    double r6 = r6 / r10
                    long r6 = java.lang.Math.round(r6)
                L_0x02c8:
                    long r10 = java.lang.System.currentTimeMillis()
                    r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                    int r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
                    if (r3 == 0) goto L_0x02dd
                    int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    if (r3 != 0) goto L_0x02da
                    goto L_0x02dd
                L_0x02da:
                    r8 = 1000(0x3e8, double:4.94E-321)
                    long r6 = r6 / r8
                L_0x02dd:
                    o.AppCompatDelegateImpl$5$read r3 = r0.AudioAttributesImplBaseParcelizer
                    long r10 = r10 - r6
                    r3.read(r10)
                L_0x02e3:
                    r0.MediaSessionCompat$Token = r1
                    r0.MediaSessionCompat$ResultReceiverWrapper = r4
                    r8 = r15
                    r0.MediaSessionCompat$QueueItem = r8
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: o.AppCompatDelegateImpl.AnonymousClass5.asInterface(boolean):long");
            }

            public final boolean asBinder(long j) {
                if (j <= asBinder()) {
                    if (!(this.onConnectionFailed && this.asBinder.getPlayState() == 2 && asBinder() == 0)) {
                        return false;
                    }
                }
                return true;
            }

            public final void read() {
                this.cancel = 0;
                this.Cancellable = 0;
                this.PlaybackStateCompat = 0;
                this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = 0;
                this.MediaSessionCompat$Token = 0;
                this.ComponentActivity = 0;
                this.PlaybackStateCompat$CustomAction = false;
            }

            public final long asBinder() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.MediaBrowserCompat$MediaItem;
                if (j != -9223372036854775807L) {
                    float f = this.read;
                    long j2 = (elapsedRealtime * 1000) - j;
                    if (f != 1.0f) {
                        j2 = Math.round(((double) j2) * ((double) f));
                    }
                    return Math.min(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompat$ItemReceiver + ((j2 * ((long) this.onConnectionSuspended)) / 1000000));
                }
                if (elapsedRealtime - this.MediaMetadataCompat >= 5) {
                    AudioTrack audioTrack = this.asBinder;
                    int playState = audioTrack.getPlayState();
                    if (playState != 1) {
                        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & KeyboardMap.kValueMask;
                        if (this.onConnectionFailed) {
                            if (playState == 2 && playbackHeadPosition == 0) {
                                this.MediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
                            }
                            playbackHeadPosition += this.MediaDescriptionCompat;
                        }
                        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed <= 29) {
                            if (playbackHeadPosition != 0 || this.MediaBrowserCompat$CustomActionResultReceiver <= 0 || playState != 3) {
                                this.write = -9223372036854775807L;
                            } else if (this.write == -9223372036854775807L) {
                                this.write = elapsedRealtime;
                            }
                        }
                        if (this.MediaBrowserCompat$CustomActionResultReceiver > playbackHeadPosition) {
                            this.MediaBrowserCompat$SearchResultReceiver++;
                        }
                        this.MediaBrowserCompat$CustomActionResultReceiver = playbackHeadPosition;
                    }
                    this.MediaMetadataCompat = elapsedRealtime;
                }
                return this.MediaBrowserCompat$CustomActionResultReceiver + (this.MediaBrowserCompat$SearchResultReceiver << 32);
            }
        };
        onAnimationEnd onanimationend = new onAnimationEnd();
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = onanimationend;
        onActionItemClicked onactionitemclicked = new onActionItemClicked();
        this.invalidateMenu = onactionitemclicked;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new onApplyWindowInsets[]{new onAnimationStart(), onanimationend, onactionitemclicked});
        Collections.addAll(arrayList, setconfigurationlocales.asBinder());
        this.getSavedStateRegistry = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.getOnBackPressedDispatcher = new AudioProcessor[]{new onApplyWindowInsets() {
            private static final int read = Float.floatToIntBits(Float.NaN);

            public final AudioProcessor.read onTransact(AudioProcessor.read read2) throws AudioProcessor.UnhandledAudioFormatException {
                int i = read2.onTransact;
                if (!(i == 536870912 || i == 805306368 || i == 4)) {
                    throw new AudioProcessor.UnhandledAudioFormatException(read2);
                } else if (i != 4) {
                    return new AudioProcessor.read(read2.asInterface, read2.asBinder, 4);
                } else {
                    return AudioProcessor.read.read;
                }
            }

            public final void read(ByteBuffer byteBuffer) {
                ByteBuffer byteBuffer2;
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                int i = limit - position;
                int i2 = this.onTransact.onTransact;
                if (i2 == 536870912) {
                    byteBuffer2 = read((i / 3) << 2);
                    while (position < limit) {
                        int floatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24))) * 4.656612875245797E-10d));
                        if (floatToIntBits == read) {
                            floatToIntBits = Float.floatToIntBits(0.0f);
                        }
                        byteBuffer2.putInt(floatToIntBits);
                        position += 3;
                    }
                } else if (i2 == 805306368) {
                    byteBuffer2 = read(i);
                    while (position < limit) {
                        int floatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24))) * 4.656612875245797E-10d));
                        if (floatToIntBits2 == read) {
                            floatToIntBits2 = Float.floatToIntBits(0.0f);
                        }
                        byteBuffer2.putInt(floatToIntBits2);
                        position += 4;
                    }
                } else {
                    throw new IllegalStateException();
                }
                byteBuffer.position(byteBuffer.limit());
                byteBuffer2.flip();
            }
        }};
        this.onActivityResult = 1.0f;
        this.AudioAttributesCompatParcelizer = onSubDecorInstalled.asInterface;
        this.onConnectionFailed = 0;
        this.MediaBrowserCompat$SearchResultReceiver = new Object() {
            public final int asBinder = 0;
            public final float asInterface = 0.0f;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AnonymousClass3 r5 = (AnonymousClass3) obj;
                int i = r5.asBinder;
                float f = r5.asInterface;
                if (Float.compare(0.0f, 0.0f) != 0) {
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.asInterface) + 16337;
            }
        };
        this.createFullyDrawnExecutor = new AudioAttributesImplApi26Parcelizer(onTitleChanged.asInterface, false, 0, 0, (byte) 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = onTitleChanged.asInterface;
        this.MediaMetadataCompat = -1;
        this.write = new AudioProcessor[0];
        this.addOnConfigurationChangedListener = new ByteBuffer[0];
        this.initViewTreeOwners = new ArrayDeque<>();
        this.MediaSessionCompat$Token = new AudioAttributesImplApi21Parcelizer<>();
        this.f2lambda$new$2$androidxactivityComponentActivity = new AudioAttributesImplApi21Parcelizer<>();
        this.setInternalConnectionCallback = asbinder.asInterface;
    }

    public final void read(AudioSink.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(mapNightMode mapnightmode) {
        this.addOnTrimMemoryListener = mapnightmode;
    }

    public final boolean asBinder(setMultiChoiceItems setmultichoiceitems) {
        return RemoteActionCompatParcelizer(setmultichoiceitems) != 0;
    }

    public final int RemoteActionCompatParcelizer(setMultiChoiceItems setmultichoiceitems) {
        boolean z = true;
        if ("audio/raw".equals(setmultichoiceitems.f17lambda$new$1$androidxactivityComponentActivity)) {
            if (OnBackPressedDispatcher.Api33Impl.AudioAttributesImplApi26Parcelizer(setmultichoiceitems.getOnBackPressedDispatcher)) {
                return (setmultichoiceitems.getOnBackPressedDispatcher == 2 || (this.RatingCompat && setmultichoiceitems.getOnBackPressedDispatcher == 4)) ? 2 : 1;
            }
            int i = setmultichoiceitems.getOnBackPressedDispatcher;
            synchronized (findMenuItemForSubmenu.read) {
            }
            return 0;
        } else if (!this.ComponentActivity && asBinder(setmultichoiceitems, this.AudioAttributesCompatParcelizer)) {
            return 2;
        } else {
            if (this.onConnectionSuspended.asBinder(setmultichoiceitems) == null) {
                z = false;
            }
            return z ? 2 : 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void asInterface(o.setMultiChoiceItems r24, int[] r25) throws com.google.android.exoplayer2.audio.AudioSink.ConfigurationException {
        /*
            r23 = this;
            r1 = r23
            r3 = r24
            java.lang.String r0 = r3.f17lambda$new$1$androidxactivityComponentActivity
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            r2 = -1
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x00ac
            int r0 = r3.getOnBackPressedDispatcher
            boolean r0 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesImplApi26Parcelizer((int) r0)
            if (r0 == 0) goto L_0x00a6
            int r0 = r3.getOnBackPressedDispatcher
            int r4 = r3.addOnConfigurationChangedListener
            int r0 = o.OnBackPressedDispatcher.Api33Impl.onTransact((int) r0, (int) r4)
            int r4 = r3.getOnBackPressedDispatcher
            boolean r5 = r1.RatingCompat
            if (r5 == 0) goto L_0x0039
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            if (r4 == r5) goto L_0x0034
            r5 = 805306368(0x30000000, float:4.656613E-10)
            if (r4 == r5) goto L_0x0034
            r5 = 4
            if (r4 == r5) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x0034:
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0039
            r4 = 1
            goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            if (r4 == 0) goto L_0x003f
            com.google.android.exoplayer2.audio.AudioProcessor[] r4 = r1.getOnBackPressedDispatcher
            goto L_0x0041
        L_0x003f:
            com.google.android.exoplayer2.audio.AudioProcessor[] r4 = r1.getSavedStateRegistry
        L_0x0041:
            o.onActionItemClicked r5 = r1.invalidateMenu
            int r6 = r3.addOnNewIntentListener
            int r7 = r3.getActivityResultRegistry
            r5.read = r6
            r5.RemoteActionCompatParcelizer = r7
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            r6 = 21
            if (r5 >= r6) goto L_0x0064
            int r5 = r3.addOnConfigurationChangedListener
            r6 = 8
            if (r5 != r6) goto L_0x0064
            if (r25 != 0) goto L_0x0064
            r5 = 6
            int[] r6 = new int[r5]
            r7 = 0
        L_0x005d:
            if (r7 >= r5) goto L_0x0066
            r6[r7] = r7
            int r7 = r7 + 1
            goto L_0x005d
        L_0x0064:
            r6 = r25
        L_0x0066:
            o.onAnimationEnd r5 = r1.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
            r5.RemoteActionCompatParcelizer = r6
            com.google.android.exoplayer2.audio.AudioProcessor$read r5 = new com.google.android.exoplayer2.audio.AudioProcessor$read
            int r6 = r3.onActivityResult
            int r7 = r3.addOnConfigurationChangedListener
            int r8 = r3.getOnBackPressedDispatcher
            r5.<init>(r6, r7, r8)
            int r6 = r4.length
            r7 = 0
        L_0x0077:
            if (r7 >= r6) goto L_0x0090
            r8 = r4[r7]
            com.google.android.exoplayer2.audio.AudioProcessor$read r9 = r8.read((com.google.android.exoplayer2.audio.AudioProcessor.read) r5)     // Catch:{ UnhandledAudioFormatException -> 0x0089 }
            boolean r8 = r8.onTransact()     // Catch:{ UnhandledAudioFormatException -> 0x0089 }
            if (r8 == 0) goto L_0x0086
            r5 = r9
        L_0x0086:
            int r7 = r7 + 1
            goto L_0x0077
        L_0x0089:
            r0 = move-exception
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r2 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            r2.<init>((java.lang.Throwable) r0, (o.setMultiChoiceItems) r3)
            throw r2
        L_0x0090:
            int r6 = r5.onTransact
            int r7 = r5.asInterface
            int r8 = r5.asBinder
            int r8 = o.OnBackPressedDispatcher.Api33Impl.read((int) r8)
            int r5 = r5.asBinder
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onTransact((int) r6, (int) r5)
            r11 = r4
            r9 = r6
            r4 = r0
            r6 = r5
            r5 = 0
            goto L_0x00f0
        L_0x00a6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x00ac:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = new com.google.android.exoplayer2.audio.AudioProcessor[r13]
            int r4 = r3.onActivityResult
            o.onSubDecorInstalled r5 = r1.AudioAttributesCompatParcelizer
            boolean r5 = r1.asBinder(r3, r5)
            if (r5 == 0) goto L_0x00d0
            java.lang.String r5 = r3.f17lambda$new$1$androidxactivityComponentActivity
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r3.addMenuProvider
            int r5 = o.createPopupWindow.asInterface(r5, r6)
            int r6 = r3.addOnConfigurationChangedListener
            int r6 = o.OnBackPressedDispatcher.Api33Impl.read((int) r6)
            r11 = r0
            r7 = r4
            r9 = r5
            r8 = r6
            r4 = -1
            r5 = 1
        L_0x00ce:
            r6 = -1
            goto L_0x00f0
        L_0x00d0:
            o.onCreateView r5 = r1.onConnectionSuspended
            android.util.Pair r5 = r5.asBinder(r3)
            if (r5 == 0) goto L_0x0176
            java.lang.Object r6 = r5.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r5 = r5.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r7 = 2
            r11 = r0
            r7 = r4
            r8 = r5
            r9 = r6
            r4 = -1
            r5 = 2
            goto L_0x00ce
        L_0x00f0:
            java.lang.String r0 = ") for: "
            if (r9 == 0) goto L_0x015c
            if (r8 == 0) goto L_0x0142
            com.google.android.exoplayer2.audio.DefaultAudioSink$onTransact r14 = r1.onConnected
            int r15 = android.media.AudioTrack.getMinBufferSize(r7, r8, r9)
            r0 = -2
            if (r15 == r0) goto L_0x0101
            r0 = 1
            goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            if (r0 == 0) goto L_0x013c
            if (r6 == r2) goto L_0x0109
            r18 = r6
            goto L_0x010b
        L_0x0109:
            r18 = 1
        L_0x010b:
            int r0 = r3.addOnMultiWindowModeChangedListener
            boolean r2 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r2 == 0) goto L_0x0114
            r16 = 4620693217682128896(0x4020000000000000, double:8.0)
            goto L_0x0116
        L_0x0114:
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0116:
            r21 = r16
            r16 = r9
            r17 = r5
            r19 = r7
            r20 = r0
            int r10 = r14.asBinder(r15, r16, r17, r18, r19, r20, r21)
            r1.ComponentActivity = r13
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r0 = new com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer
            r2 = r0
            r3 = r24
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            android.media.AudioTrack r2 = r1.read
            if (r2 == 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r12 = 0
        L_0x0134:
            if (r12 == 0) goto L_0x0139
            r1.addOnMultiWindowModeChangedListener = r0
            return
        L_0x0139:
            r1.MediaSessionCompat$QueueItem = r0
            return
        L_0x013c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0142:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid output channel config (mode="
            r2.<init>(r4)
            r2.append(r5)
            r2.append(r0)
            r2.append(r3)
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2, (o.setMultiChoiceItems) r3)
            throw r0
        L_0x015c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Invalid output encoding (mode="
            r2.<init>(r4)
            r2.append(r5)
            r2.append(r0)
            r2.append(r3)
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r0 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r2 = r2.toString()
            r0.<init>((java.lang.String) r2, (o.setMultiChoiceItems) r3)
            throw r0
        L_0x0176:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to configure passthrough for: "
            r0.<init>(r2)
            r0.append(r3)
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r2 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.String r0 = r0.toString()
            r2.<init>((java.lang.String) r0, (o.setMultiChoiceItems) r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.asInterface(o.setMultiChoiceItems, int[]):void");
    }

    private void MediaDescriptionCompat() {
        int i = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.write;
            if (i < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i];
                audioProcessor.asBinder();
                this.addOnConfigurationChangedListener[i] = audioProcessor.asInterface();
                i++;
            } else {
                return;
            }
        }
    }

    public final void write() {
        boolean z = true;
        this.IconCompatParcelizer = true;
        if (this.read == null) {
            z = false;
        }
        if (z) {
            AppCompatDelegateImpl.AnonymousClass4 r0 = this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer;
            if (r0.read != null) {
                r0.asInterface(0);
            }
            this.read.play();
        }
    }

    public final void onTransact() {
        this.getLastCustomNonConfigurationInstance = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0246, code lost:
        if (r5.asBinder() == 0) goto L_0x0239;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01bd A[Catch:{ InitializationException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01bf A[Catch:{ InitializationException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0277 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0179 A[Catch:{ InitializationException -> 0x01cc }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0185 A[Catch:{ InitializationException -> 0x01cc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean asInterface(java.nio.ByteBuffer r18, long r19, int r21) throws com.google.android.exoplayer2.audio.AudioSink.InitializationException, com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r4 = r21
            java.nio.ByteBuffer r5 = r1.Cancellable
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0012
            if (r0 == r5) goto L_0x0012
            r5 = 0
            goto L_0x0013
        L_0x0012:
            r5 = 1
        L_0x0013:
            if (r5 == 0) goto L_0x04fe
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r5 = r1.addOnMultiWindowModeChangedListener
            r8 = 29
            r9 = 0
            r10 = 3
            if (r5 == 0) goto L_0x00ab
            boolean r5 = r17.onConnectionFailed()
            if (r5 != 0) goto L_0x0024
            return r7
        L_0x0024:
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r5 = r1.addOnMultiWindowModeChangedListener
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r11 = r1.MediaSessionCompat$QueueItem
            int r12 = r11.IconCompatParcelizer
            int r13 = r5.IconCompatParcelizer
            if (r12 != r13) goto L_0x0048
            int r12 = r11.AudioAttributesImplApi26Parcelizer
            int r13 = r5.AudioAttributesImplApi26Parcelizer
            if (r12 != r13) goto L_0x0048
            int r12 = r11.AudioAttributesCompatParcelizer
            int r13 = r5.AudioAttributesCompatParcelizer
            if (r12 != r13) goto L_0x0048
            int r12 = r11.read
            int r13 = r5.read
            if (r12 != r13) goto L_0x0048
            int r11 = r11.write
            int r5 = r5.write
            if (r11 != r5) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 != 0) goto L_0x006d
            r17.MediaBrowserCompat$CustomActionResultReceiver()
            android.media.AudioTrack r5 = r1.read
            if (r5 == 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            if (r5 == 0) goto L_0x0065
            o.AppCompatDelegateImpl$5 r5 = r1.MediaBrowserCompat$MediaItem
            long r11 = r17.AudioAttributesImplBaseParcelizer()
            boolean r5 = r5.asBinder(r11)
            if (r5 == 0) goto L_0x0065
            r5 = 1
            goto L_0x0066
        L_0x0065:
            r5 = 0
        L_0x0066:
            if (r5 == 0) goto L_0x0069
            return r7
        L_0x0069:
            r17.read()
            goto L_0x00a8
        L_0x006d:
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r5 = r1.addOnMultiWindowModeChangedListener
            r1.MediaSessionCompat$QueueItem = r5
            r1.addOnMultiWindowModeChangedListener = r9
            android.media.AudioTrack r5 = r1.read
            int r11 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            if (r11 < r8) goto L_0x0081
            boolean r5 = r5.isOffloadedPlayback()
            if (r5 == 0) goto L_0x0081
            r5 = 1
            goto L_0x0082
        L_0x0081:
            r5 = 0
        L_0x0082:
            if (r5 == 0) goto L_0x00a8
            int r5 = r1.addOnContextAvailableListener
            if (r5 == r10) goto L_0x00a8
            android.media.AudioTrack r5 = r1.read
            int r5 = r5.getPlayState()
            if (r5 != r10) goto L_0x0095
            android.media.AudioTrack r5 = r1.read
            r5.setOffloadEndOfStream()
        L_0x0095:
            android.media.AudioTrack r5 = r1.read
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r11 = r1.MediaSessionCompat$QueueItem
            o.setMultiChoiceItems r11 = r11.asInterface
            int r11 = r11.addOnNewIntentListener
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r12 = r1.MediaSessionCompat$QueueItem
            o.setMultiChoiceItems r12 = r12.asInterface
            int r12 = r12.getActivityResultRegistry
            r5.setOffloadDelayPadding(r11, r12)
            r1.access$001 = r6
        L_0x00a8:
            r1.onTransact((long) r2)
        L_0x00ab:
            android.media.AudioTrack r5 = r1.read
            if (r5 == 0) goto L_0x00b1
            r5 = 1
            goto L_0x00b2
        L_0x00b1:
            r5 = 0
        L_0x00b2:
            r11 = 31
            r14 = 23
            r15 = 2
            r9 = 6
            r6 = 5
            if (r5 != 0) goto L_0x01d9
            o.BaseMenuWrapper r5 = r1.getActivityResultRegistry     // Catch:{ InitializationException -> 0x01cc }
            boolean r5 = r5.asInterface()     // Catch:{ InitializationException -> 0x01cc }
            if (r5 != 0) goto L_0x00c6
            r5 = 0
            goto L_0x01c8
        L_0x00c6:
            android.media.AudioTrack r5 = r17.onConnected()     // Catch:{ InitializationException -> 0x01cc }
            r1.read = r5     // Catch:{ InitializationException -> 0x01cc }
            int r7 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ InitializationException -> 0x01cc }
            if (r7 < r8) goto L_0x00d8
            boolean r5 = r5.isOffloadedPlayback()     // Catch:{ InitializationException -> 0x01cc }
            if (r5 == 0) goto L_0x00d8
            r5 = 1
            goto L_0x00d9
        L_0x00d8:
            r5 = 0
        L_0x00d9:
            if (r5 == 0) goto L_0x010e
            android.media.AudioTrack r5 = r1.read     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$onConnected r7 = r1.addContentView     // Catch:{ InitializationException -> 0x01cc }
            if (r7 != 0) goto L_0x00e8
            com.google.android.exoplayer2.audio.DefaultAudioSink$onConnected r7 = new com.google.android.exoplayer2.audio.DefaultAudioSink$onConnected     // Catch:{ InitializationException -> 0x01cc }
            r7.<init>()     // Catch:{ InitializationException -> 0x01cc }
            r1.addContentView = r7     // Catch:{ InitializationException -> 0x01cc }
        L_0x00e8:
            com.google.android.exoplayer2.audio.DefaultAudioSink$onConnected r7 = r1.addContentView     // Catch:{ InitializationException -> 0x01cc }
            android.os.Handler r8 = r7.RemoteActionCompatParcelizer     // Catch:{ InitializationException -> 0x01cc }
            java.util.Objects.requireNonNull(r8)     // Catch:{ InitializationException -> 0x01cc }
            androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1 r12 = new androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda1     // Catch:{ InitializationException -> 0x01cc }
            r12.<init>(r8)     // Catch:{ InitializationException -> 0x01cc }
            android.media.AudioTrack$StreamEventCallback r7 = r7.onTransact     // Catch:{ InitializationException -> 0x01cc }
            r5.registerStreamEventCallback(r12, r7)     // Catch:{ InitializationException -> 0x01cc }
            int r5 = r1.addOnContextAvailableListener     // Catch:{ InitializationException -> 0x01cc }
            if (r5 == r10) goto L_0x010e
            android.media.AudioTrack r5 = r1.read     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r7 = r1.MediaSessionCompat$QueueItem     // Catch:{ InitializationException -> 0x01cc }
            o.setMultiChoiceItems r7 = r7.asInterface     // Catch:{ InitializationException -> 0x01cc }
            int r7 = r7.addOnNewIntentListener     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r8 = r1.MediaSessionCompat$QueueItem     // Catch:{ InitializationException -> 0x01cc }
            o.setMultiChoiceItems r8 = r8.asInterface     // Catch:{ InitializationException -> 0x01cc }
            int r8 = r8.getActivityResultRegistry     // Catch:{ InitializationException -> 0x01cc }
            r5.setOffloadDelayPadding(r7, r8)     // Catch:{ InitializationException -> 0x01cc }
        L_0x010e:
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ InitializationException -> 0x01cc }
            if (r5 < r11) goto L_0x0129
            o.mapNightMode r5 = r1.addOnTrimMemoryListener     // Catch:{ InitializationException -> 0x01cc }
            if (r5 == 0) goto L_0x0129
            android.media.AudioTrack r7 = r1.read     // Catch:{ InitializationException -> 0x01cc }
            o.mapNightMode$RemoteActionCompatParcelizer r5 = r5.read     // Catch:{ InitializationException -> 0x01cc }
            o.mapNightMode$RemoteActionCompatParcelizer r5 = (o.mapNightMode.RemoteActionCompatParcelizer) r5     // Catch:{ InitializationException -> 0x01cc }
            android.media.metrics.LogSessionId r5 = r5.asInterface     // Catch:{ InitializationException -> 0x01cc }
            android.media.metrics.LogSessionId r8 = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE     // Catch:{ InitializationException -> 0x01cc }
            boolean r8 = r5.equals(r8)     // Catch:{ InitializationException -> 0x01cc }
            if (r8 != 0) goto L_0x0129
            r7.setLogSessionId(r5)     // Catch:{ InitializationException -> 0x01cc }
        L_0x0129:
            android.media.AudioTrack r5 = r1.read     // Catch:{ InitializationException -> 0x01cc }
            int r5 = r5.getAudioSessionId()     // Catch:{ InitializationException -> 0x01cc }
            r1.onConnectionFailed = r5     // Catch:{ InitializationException -> 0x01cc }
            o.AppCompatDelegateImpl$5 r5 = r1.MediaBrowserCompat$MediaItem     // Catch:{ InitializationException -> 0x01cc }
            android.media.AudioTrack r7 = r1.read     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r8 = r1.MediaSessionCompat$QueueItem     // Catch:{ InitializationException -> 0x01cc }
            int r8 = r8.IconCompatParcelizer     // Catch:{ InitializationException -> 0x01cc }
            if (r8 != r15) goto L_0x013d
            r8 = 1
            goto L_0x013e
        L_0x013d:
            r8 = 0
        L_0x013e:
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r12 = r1.MediaSessionCompat$QueueItem     // Catch:{ InitializationException -> 0x01cc }
            int r12 = r12.AudioAttributesImplApi26Parcelizer     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r13 = r1.MediaSessionCompat$QueueItem     // Catch:{ InitializationException -> 0x01cc }
            int r13 = r13.write     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r10 = r1.MediaSessionCompat$QueueItem     // Catch:{ InitializationException -> 0x01cc }
            int r10 = r10.asBinder     // Catch:{ InitializationException -> 0x01cc }
            r5.asBinder = r7     // Catch:{ InitializationException -> 0x01cc }
            r5.onConnected = r13     // Catch:{ InitializationException -> 0x01cc }
            r5.asInterface = r10     // Catch:{ InitializationException -> 0x01cc }
            o.AppCompatDelegateImpl$4 r11 = new o.AppCompatDelegateImpl$4     // Catch:{ InitializationException -> 0x01cc }
            r11.<init>(r7)     // Catch:{ InitializationException -> 0x01cc }
            r5.RemoteActionCompatParcelizer = r11     // Catch:{ InitializationException -> 0x01cc }
            int r7 = r7.getSampleRate()     // Catch:{ InitializationException -> 0x01cc }
            r5.onConnectionSuspended = r7     // Catch:{ InitializationException -> 0x01cc }
            if (r8 == 0) goto L_0x016e
            int r7 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ InitializationException -> 0x01cc }
            if (r7 >= r14) goto L_0x0169
            if (r12 == r6) goto L_0x0167
            if (r12 != r9) goto L_0x0169
        L_0x0167:
            r7 = 1
            goto L_0x016a
        L_0x0169:
            r7 = 0
        L_0x016a:
            if (r7 == 0) goto L_0x016e
            r7 = 1
            goto L_0x016f
        L_0x016e:
            r7 = 0
        L_0x016f:
            r5.onConnectionFailed = r7     // Catch:{ InitializationException -> 0x01cc }
            boolean r7 = o.OnBackPressedDispatcher.Api33Impl.AudioAttributesImplApi26Parcelizer((int) r12)     // Catch:{ InitializationException -> 0x01cc }
            r5.AudioAttributesImplApi26Parcelizer = r7     // Catch:{ InitializationException -> 0x01cc }
            if (r7 == 0) goto L_0x0185
            int r10 = r10 / r13
            long r7 = (long) r10     // Catch:{ InitializationException -> 0x01cc }
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r10
            int r10 = r5.onConnectionSuspended     // Catch:{ InitializationException -> 0x01cc }
            long r10 = (long) r10     // Catch:{ InitializationException -> 0x01cc }
            long r7 = r7 / r10
            goto L_0x018a
        L_0x0185:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x018a:
            r5.onTransact = r7     // Catch:{ InitializationException -> 0x01cc }
            r7 = 0
            r5.MediaBrowserCompat$CustomActionResultReceiver = r7     // Catch:{ InitializationException -> 0x01cc }
            r5.MediaBrowserCompat$SearchResultReceiver = r7     // Catch:{ InitializationException -> 0x01cc }
            r5.MediaDescriptionCompat = r7     // Catch:{ InitializationException -> 0x01cc }
            r10 = 0
            r5.AudioAttributesImplApi21Parcelizer = r10     // Catch:{ InitializationException -> 0x01cc }
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.MediaBrowserCompat$MediaItem = r10     // Catch:{ InitializationException -> 0x01cc }
            r5.write = r10     // Catch:{ InitializationException -> 0x01cc }
            r5.IconCompatParcelizer = r7     // Catch:{ InitializationException -> 0x01cc }
            r5.setInternalConnectionCallback = r7     // Catch:{ InitializationException -> 0x01cc }
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.read = r7     // Catch:{ InitializationException -> 0x01cc }
            r17.MediaBrowserCompat$MediaItem()     // Catch:{ InitializationException -> 0x01cc }
            o.AppCompatDelegateImpl$3 r5 = r1.MediaBrowserCompat$SearchResultReceiver     // Catch:{ InitializationException -> 0x01cc }
            int r5 = r5.asBinder     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$read r5 = r1.ensureViewModelStore     // Catch:{ InitializationException -> 0x01cc }
            if (r5 == 0) goto L_0x01c4
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed     // Catch:{ InitializationException -> 0x01cc }
            if (r5 < r14) goto L_0x01c4
            android.media.AudioTrack r5 = r1.read     // Catch:{ InitializationException -> 0x01cc }
            com.google.android.exoplayer2.audio.DefaultAudioSink$read r7 = r1.ensureViewModelStore     // Catch:{ InitializationException -> 0x01cc }
            if (r7 != 0) goto L_0x01bf
            r7 = 0
            goto L_0x01c1
        L_0x01bf:
            android.media.AudioDeviceInfo r7 = r7.read     // Catch:{ InitializationException -> 0x01cc }
        L_0x01c1:
            r5.setPreferredDevice(r7)     // Catch:{ InitializationException -> 0x01cc }
        L_0x01c4:
            r5 = 1
            r1.getFullyDrawnReporter = r5     // Catch:{ InitializationException -> 0x01cc }
            r5 = 1
        L_0x01c8:
            if (r5 != 0) goto L_0x01d9
            r5 = 0
            return r5
        L_0x01cc:
            r0 = move-exception
            boolean r2 = r0.onTransact
            if (r2 != 0) goto L_0x01d8
            com.google.android.exoplayer2.audio.DefaultAudioSink$AudioAttributesImplApi21Parcelizer<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r2 = r1.MediaSessionCompat$Token
            r2.asInterface(r0)
            r5 = 0
            return r5
        L_0x01d8:
            throw r0
        L_0x01d9:
            r5 = 0
            com.google.android.exoplayer2.audio.DefaultAudioSink$AudioAttributesImplApi21Parcelizer<com.google.android.exoplayer2.audio.AudioSink$InitializationException> r7 = r1.MediaSessionCompat$Token
            r8 = 0
            r7.RemoteActionCompatParcelizer = r8
            boolean r7 = r1.getFullyDrawnReporter
            if (r7 == 0) goto L_0x0222
            r7 = 0
            long r10 = java.lang.Math.max(r7, r2)
            r1.getDefaultViewModelProviderFactory = r10
            r1.getLastCustomNonConfigurationInstance = r5
            r1.getFullyDrawnReporter = r5
            boolean r5 = r1.MediaSessionCompat$ResultReceiverWrapper
            if (r5 == 0) goto L_0x01fc
            int r5 = o.OnBackPressedDispatcher.Api33Impl.onConnectionFailed
            if (r5 < r14) goto L_0x01fc
            o.onTitleChanged r5 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r1.RemoteActionCompatParcelizer((o.onTitleChanged) r5)
        L_0x01fc:
            r1.onTransact((long) r2)
            boolean r5 = r1.IconCompatParcelizer
            if (r5 == 0) goto L_0x0222
            r5 = 1
            r1.IconCompatParcelizer = r5
            android.media.AudioTrack r5 = r1.read
            if (r5 == 0) goto L_0x020c
            r5 = 1
            goto L_0x020d
        L_0x020c:
            r5 = 0
        L_0x020d:
            if (r5 == 0) goto L_0x0222
            o.AppCompatDelegateImpl$5 r5 = r1.MediaBrowserCompat$MediaItem
            o.AppCompatDelegateImpl$4 r5 = r5.RemoteActionCompatParcelizer
            o.AppCompatDelegateImpl$4 r5 = (o.AppCompatDelegateImpl.AnonymousClass4) r5
            o.AppCompatDelegateImpl$4$RemoteActionCompatParcelizer r7 = r5.read
            if (r7 == 0) goto L_0x021d
            r7 = 0
            r5.asInterface(r7)
        L_0x021d:
            android.media.AudioTrack r5 = r1.read
            r5.play()
        L_0x0222:
            o.AppCompatDelegateImpl$5 r5 = r1.MediaBrowserCompat$MediaItem
            long r7 = r17.AudioAttributesImplBaseParcelizer()
            android.media.AudioTrack r10 = r5.asBinder
            android.media.AudioTrack r10 = (android.media.AudioTrack) r10
            int r10 = r10.getPlayState()
            boolean r11 = r5.onConnectionFailed
            if (r11 == 0) goto L_0x0249
            if (r10 != r15) goto L_0x023b
            r11 = 0
            r5.AudioAttributesImplApi21Parcelizer = r11
        L_0x0239:
            r5 = 0
            goto L_0x0275
        L_0x023b:
            r11 = 1
            if (r10 != r11) goto L_0x0249
            long r11 = r5.asBinder()
            r13 = 0
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 != 0) goto L_0x0249
            goto L_0x0239
        L_0x0249:
            boolean r11 = r5.AudioAttributesImplApi21Parcelizer
            boolean r7 = r5.asBinder(r7)
            r5.AudioAttributesImplApi21Parcelizer = r7
            if (r11 == 0) goto L_0x0274
            if (r7 != 0) goto L_0x0274
            r7 = 1
            if (r10 == r7) goto L_0x0274
            o.AppCompatDelegateImpl$5$read r7 = r5.AudioAttributesImplBaseParcelizer
            int r8 = r5.asInterface
            long r10 = r5.onTransact
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 == 0) goto L_0x0271
            r12 = -9223372036854775808
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 != 0) goto L_0x026e
            goto L_0x0271
        L_0x026e:
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 / r12
        L_0x0271:
            r7.onTransact(r8, r10)
        L_0x0274:
            r5 = 1
        L_0x0275:
            if (r5 != 0) goto L_0x0279
            r5 = 0
            return r5
        L_0x0279:
            java.nio.ByteBuffer r5 = r1.Cancellable
            if (r5 != 0) goto L_0x04b8
            java.nio.ByteOrder r5 = r18.order()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r5 != r7) goto L_0x0287
            r5 = 1
            goto L_0x0288
        L_0x0287:
            r5 = 0
        L_0x0288:
            if (r5 == 0) goto L_0x04b2
            boolean r5 = r18.hasRemaining()
            if (r5 != 0) goto L_0x0292
            r5 = 1
            return r5
        L_0x0292:
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r5 = r1.MediaSessionCompat$QueueItem
            int r5 = r5.IconCompatParcelizer
            if (r5 == 0) goto L_0x0420
            int r5 = r1.ParcelableVolumeInfo
            if (r5 != 0) goto L_0x0420
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r5 = r1.MediaSessionCompat$QueueItem
            int r5 = r5.AudioAttributesImplApi26Parcelizer
            r7 = 8
            r8 = 1024(0x400, float:1.435E-42)
            r10 = -2
            r11 = 10
            r12 = -1
            switch(r5) {
                case 5: goto L_0x03de;
                case 6: goto L_0x03de;
                case 7: goto L_0x0383;
                case 8: goto L_0x0383;
                case 9: goto L_0x0361;
                case 10: goto L_0x041a;
                case 11: goto L_0x035d;
                case 12: goto L_0x035d;
                case 13: goto L_0x02ab;
                case 14: goto L_0x0300;
                case 15: goto L_0x02fc;
                case 16: goto L_0x041a;
                case 17: goto L_0x02e1;
                case 18: goto L_0x03de;
                case 19: goto L_0x02ab;
                case 20: goto L_0x02bf;
                default: goto L_0x02ab;
            }
        L_0x02ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected audio encoding: "
            r0.<init>(r2)
            r0.append(r5)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        L_0x02bf:
            r13 = 0
            byte r5 = r0.get(r13)
            int r6 = r18.limit()
            r7 = 1
            if (r6 <= r7) goto L_0x02d0
            byte r6 = r0.get(r7)
            goto L_0x02d1
        L_0x02d0:
            r6 = 0
        L_0x02d1:
            long r5 = o.setOnBackInvokedDispatcher.asInterface((byte) r5, (byte) r6)
            r7 = 48000(0xbb80, double:2.3715E-319)
            long r5 = r5 * r7
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 / r7
            int r8 = (int) r5
            goto L_0x041a
        L_0x02e1:
            r5 = 16
            byte[] r5 = new byte[r5]
            int r6 = r18.position()
            r0.get(r5)
            r0.position(r6)
            o.getNextMenuPosition r6 = new o.getNextMenuPosition
            r6.<init>(r5)
            o.onMenuModeChange$onTransact r5 = o.onMenuModeChange.read(r6)
            int r8 = r5.read
            goto L_0x041a
        L_0x02fc:
            r8 = 512(0x200, float:7.175E-43)
            goto L_0x041a
        L_0x0300:
            int r5 = r18.position()
            int r6 = r18.limit()
            r8 = r5
        L_0x0309:
            int r9 = r6 + -10
            if (r8 > r9) goto L_0x032a
            int r9 = r8 + 4
            int r9 = r0.getInt(r9)
            java.nio.ByteOrder r13 = r18.order()
            java.nio.ByteOrder r14 = java.nio.ByteOrder.BIG_ENDIAN
            if (r13 == r14) goto L_0x031f
            int r9 = java.lang.Integer.reverseBytes(r9)
        L_0x031f:
            r9 = r9 & r10
            r13 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r9 != r13) goto L_0x0327
            int r8 = r8 - r5
            goto L_0x032b
        L_0x0327:
            int r8 = r8 + 1
            goto L_0x0309
        L_0x032a:
            r8 = -1
        L_0x032b:
            if (r8 != r12) goto L_0x032f
            r5 = 0
            goto L_0x035a
        L_0x032f:
            int r5 = r18.position()
            int r5 = r5 + r8
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 187(0xbb, float:2.62E-43)
            if (r5 != r6) goto L_0x0342
            r5 = 1
            goto L_0x0343
        L_0x0342:
            r5 = 0
        L_0x0343:
            int r6 = r18.position()
            if (r5 == 0) goto L_0x034b
            r7 = 9
        L_0x034b:
            r5 = 40
            int r6 = r6 + r8
            int r6 = r6 + r7
            byte r6 = r0.get(r6)
            int r6 = r6 >> 4
            r6 = r6 & 7
            int r5 = r5 << r6
            int r5 = r5 << 4
        L_0x035a:
            r8 = r5
            goto L_0x041a
        L_0x035d:
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x041a
        L_0x0361:
            int r5 = r18.position()
            int r5 = r0.getInt(r5)
            java.nio.ByteOrder r6 = r18.order()
            java.nio.ByteOrder r7 = java.nio.ByteOrder.BIG_ENDIAN
            if (r6 == r7) goto L_0x0375
            int r5 = java.lang.Integer.reverseBytes(r5)
        L_0x0375:
            int r8 = o.AppCompatDelegateImpl.ActionBarMenuCallback.read(r5)
            if (r8 == r12) goto L_0x037d
            goto L_0x041a
        L_0x037d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0383:
            int r5 = r18.position()
            byte r7 = r0.get(r5)
            if (r7 == r10) goto L_0x03c7
            if (r7 == r12) goto L_0x03b3
            r8 = 31
            if (r7 == r8) goto L_0x03a3
            int r7 = r5 + 4
            byte r7 = r0.get(r7)
            r8 = 1
            r7 = r7 & r8
            int r7 = r7 << r9
            int r5 = r5 + r6
            byte r5 = r0.get(r5)
            r8 = 1
            goto L_0x03d6
        L_0x03a3:
            int r7 = r5 + 5
            byte r7 = r0.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + r9
            byte r5 = r0.get(r5)
            goto L_0x03c3
        L_0x03b3:
            int r7 = r5 + 4
            byte r7 = r0.get(r7)
            r7 = r7 & 7
            int r7 = r7 << 4
            int r5 = r5 + 7
            byte r5 = r0.get(r5)
        L_0x03c3:
            r5 = r5 & 60
            r8 = 1
            goto L_0x03d8
        L_0x03c7:
            int r7 = r5 + 5
            byte r7 = r0.get(r7)
            r8 = 1
            r7 = r7 & r8
            int r7 = r7 << r9
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
        L_0x03d6:
            r5 = r5 & 252(0xfc, float:3.53E-43)
        L_0x03d8:
            int r5 = r5 >> r15
            r5 = r5 | r7
            int r5 = r5 + r8
            int r8 = r5 << 5
            goto L_0x041a
        L_0x03de:
            int r5 = r18.position()
            int r5 = r5 + r6
            byte r5 = r0.get(r5)
            r5 = r5 & 248(0xf8, float:3.48E-43)
            r6 = 3
            int r5 = r5 >> r6
            if (r5 <= r11) goto L_0x03ef
            r5 = 1
            goto L_0x03f0
        L_0x03ef:
            r5 = 0
        L_0x03f0:
            if (r5 == 0) goto L_0x0418
            int r5 = r18.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r5 = r5 >> r9
            if (r5 != r6) goto L_0x0403
            r10 = 3
            goto L_0x0411
        L_0x0403:
            int r5 = r18.position()
            int r5 = r5 + 4
            byte r5 = r0.get(r5)
            r5 = r5 & 48
            int r10 = r5 >> 4
        L_0x0411:
            int[] r5 = o.getWindowCallback.RemoteActionCompatParcelizer
            r5 = r5[r10]
            int r8 = r5 << 8
            goto L_0x041a
        L_0x0418:
            r8 = 1536(0x600, float:2.152E-42)
        L_0x041a:
            r1.ParcelableVolumeInfo = r8
            if (r8 != 0) goto L_0x0420
            r5 = 1
            return r5
        L_0x0420:
            com.google.android.exoplayer2.audio.DefaultAudioSink$AudioAttributesImplApi26Parcelizer r5 = r1.AudioAttributesImplApi26Parcelizer
            if (r5 == 0) goto L_0x0432
            boolean r5 = r17.onConnectionFailed()
            if (r5 != 0) goto L_0x042c
            r5 = 0
            return r5
        L_0x042c:
            r1.onTransact((long) r2)
            r5 = 0
            r1.AudioAttributesImplApi26Parcelizer = r5
        L_0x0432:
            long r5 = r1.getDefaultViewModelProviderFactory
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r7 = r1.MediaSessionCompat$QueueItem
            long r8 = r17.onConnectionSuspended()
            o.onActionItemClicked r10 = r1.invalidateMenu
            long r10 = r10.write
            long r8 = r8 - r10
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r10
            o.setMultiChoiceItems r7 = r7.asInterface
            int r7 = r7.onActivityResult
            long r10 = (long) r7
            long r8 = r8 / r10
            long r5 = r5 + r8
            boolean r7 = r1.getLastCustomNonConfigurationInstance
            if (r7 != 0) goto L_0x046b
            long r7 = r5 - r2
            long r7 = java.lang.Math.abs(r7)
            r9 = 200000(0x30d40, double:9.8813E-319)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x046b
            com.google.android.exoplayer2.audio.AudioSink$RemoteActionCompatParcelizer r7 = r1.AudioAttributesImplApi21Parcelizer
            if (r7 == 0) goto L_0x0468
            com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException r8 = new com.google.android.exoplayer2.audio.AudioSink$UnexpectedDiscontinuityException
            r8.<init>(r2, r5)
            r7.asInterface(r8)
        L_0x0468:
            r7 = 1
            r1.getLastCustomNonConfigurationInstance = r7
        L_0x046b:
            boolean r7 = r1.getLastCustomNonConfigurationInstance
            if (r7 == 0) goto L_0x0491
            boolean r7 = r17.onConnectionFailed()
            if (r7 != 0) goto L_0x0477
            r7 = 0
            return r7
        L_0x0477:
            r7 = 0
            long r5 = r2 - r5
            long r8 = r1.getDefaultViewModelProviderFactory
            long r8 = r8 + r5
            r1.getDefaultViewModelProviderFactory = r8
            r1.getLastCustomNonConfigurationInstance = r7
            r1.onTransact((long) r2)
            com.google.android.exoplayer2.audio.AudioSink$RemoteActionCompatParcelizer r7 = r1.AudioAttributesImplApi21Parcelizer
            if (r7 == 0) goto L_0x0491
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0491
            r7.asBinder()
        L_0x0491:
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r5 = r1.MediaSessionCompat$QueueItem
            int r5 = r5.IconCompatParcelizer
            if (r5 != 0) goto L_0x04a2
            long r5 = r1.getViewModelStore
            int r7 = r18.remaining()
            long r7 = (long) r7
            long r5 = r5 + r7
            r1.getViewModelStore = r5
            goto L_0x04ad
        L_0x04a2:
            long r5 = r1.getLifecycle
            int r7 = r1.ParcelableVolumeInfo
            long r7 = (long) r7
            long r9 = (long) r4
            long r7 = r7 * r9
            long r5 = r5 + r7
            r1.getLifecycle = r5
        L_0x04ad:
            r1.Cancellable = r0
            r1.cancel = r4
            goto L_0x04b8
        L_0x04b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x04b8:
            r1.read((long) r2)
            java.nio.ByteBuffer r0 = r1.Cancellable
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x04cb
            r0 = 0
            r1.Cancellable = r0
            r2 = 0
            r1.cancel = r2
        L_0x04c9:
            r0 = 1
            return r0
        L_0x04cb:
            o.AppCompatDelegateImpl$5 r0 = r1.MediaBrowserCompat$MediaItem
            long r2 = r17.AudioAttributesImplBaseParcelizer()
            long r4 = r0.write
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x04f1
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x04f1
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0.write
            long r2 = r2 - r4
            r4 = 200(0xc8, double:9.9E-322)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x04f1
            r10 = 1
            goto L_0x04f2
        L_0x04f1:
            r10 = 0
        L_0x04f2:
            if (r10 == 0) goto L_0x04fc
            java.lang.Object r0 = o.findMenuItemForSubmenu.read
            monitor-enter(r0)
            monitor-exit(r0)
            r17.read()
            goto L_0x04c9
        L_0x04fc:
            r2 = 0
            return r2
        L_0x04fe:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.asInterface(java.nio.ByteBuffer, long, int):boolean");
    }

    public static final class asInterface implements CustomTabsService.Result {
        public static final setShowingForActionMode asBinder = new setShowingForActionMode();
        private final setMediaType.activity_release read;

        public asInterface(setMediaType.activity_release activity_release) {
            Intrinsics.checkNotNullParameter(activity_release, "");
            this.read = activity_release;
        }

        public final void asBinder() {
            this.read.read();
        }

        public final void asInterface() {
            this.read.asBinder();
        }

        public final void asBinder(int i) {
            this.read.onTransact(i);
        }

        public final void onTransact(int i, String str, long j, long j2) {
            this.read.asBinder(i, str, j, j2);
        }

        public final void RemoteActionCompatParcelizer(int i, String str, long j) {
            this.read.asBinder(i, str, j);
        }

        public final void read(int i, String str, long j, Throwable th, long j2) {
            this.read.onTransact(i, str, j, th, j2);
        }

        public final void read(int i, String str, long j, long j2) {
            this.read.read(i, str, j, j2);
        }

        public final void asInterface(int i, String str, long j) {
            this.read.read(i, str, j);
        }

        public final void read(long j, int i, String str, long j2, Throwable th) {
            this.read.asInterface(j, i, str, j2, th);
        }

        public final void read(long j, int i, String str, long j2) {
            this.read.asBinder(j, i, str, j2);
        }

        public asInterface() {
        }
    }

    public static final class RemoteActionCompatParcelizer implements ActivityResultContracts.PickMultipleVisualMedia.Companion {
        private static final ActionBarOverlayLayout.AnonymousClass1 asInterface = new Object("PhoneskyVerificationUtils") {
            public final String asInterface;

            {
                int myUid = Process.myUid();
                int myPid = Process.myPid();
                StringBuilder sb = new StringBuilder(39);
                sb.append("UID: [");
                sb.append(myUid);
                sb.append("]  PID: [");
                sb.append(myPid);
                sb.append("] ");
                String valueOf = String.valueOf(sb.toString());
                String valueOf2 = String.valueOf(r5);
                this.asInterface = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            }

            public static String asInterface(String str, String str2, Object... objArr) {
                if (objArr.length > 0) {
                    try {
                        str2 = String.format(Locale.US, str2, objArr);
                    } catch (IllegalFormatException unused) {
                        String join = TextUtils.join(", ", objArr);
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                        sb.append(str2);
                        sb.append(" [");
                        sb.append(join);
                        sb.append("]");
                        str2 = sb.toString();
                    }
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
                sb2.append(str);
                sb2.append(" : ");
                sb2.append(str2);
                return sb2.toString();
            }
        };
        private final getMediaType read;

        public RemoteActionCompatParcelizer(getMediaType getmediatype) {
            Intrinsics.checkNotNullParameter(getmediatype, "");
            this.read = getmediatype;
        }

        public final void asBinder(Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "");
            this.read.onEvent(new getCREATOR$annotations$MediaBrowserCompat$CustomActionResultReceiver(setOnBackInvokedDispatcher.read((Throwable) exc), false, (onRestoreInstanceState) null, 4, (DefaultConstructorMarker) null));
        }

        public final void asBinder(String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.read.onEvent(new getCREATOR$annotations$MediaSessionCompat$QueueItem(str, j, false, (onRestoreInstanceState) null, 8, (DefaultConstructorMarker) null));
        }

        public final void read(long j, long j2) {
            this.read.onEvent(new getCREATOR$annotations.MediaMetadataCompat(j, j2, false, (onRestoreInstanceState) null, 8, (DefaultConstructorMarker) null));
        }

        public final void asInterface() {
            this.read.onEvent(new getCREATOR$annotations.RemoteActionCompatParcelizer(false, (onRestoreInstanceState) null, 2, (DefaultConstructorMarker) null));
        }

        public final void read(String str, long j, Throwable th, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(th, "");
            this.read.onEvent(new getCREATOR$annotations$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver(str, j, j2, setOnBackInvokedDispatcher.read(th), false, (onRestoreInstanceState) null, 32, (DefaultConstructorMarker) null));
        }

        public final void read(String str, long j, long j2) {
            Intrinsics.checkNotNullParameter(str, "");
            this.read.onEvent(new getCREATOR$annotations.RatingCompat(str, j, j2, false, (onRestoreInstanceState) null, 16, (DefaultConstructorMarker) null));
        }

        public final void RemoteActionCompatParcelizer(String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.read.onEvent(new getCREATOR$annotations$MediaBrowserCompat$SearchResultReceiver(str, j, false, (onRestoreInstanceState) null, 8, (DefaultConstructorMarker) null));
        }

        public static boolean RemoteActionCompatParcelizer(Context context) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (r1 = signatureArr.length) == 0) {
                    ActionBarOverlayLayout.AnonymousClass1 r6 = asInterface;
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 5)) {
                        ActionBarOverlayLayout.AnonymousClass1.asInterface(r6.asInterface, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr);
                    }
                    return false;
                }
                for (Signature byteArray : signatureArr) {
                    String asInterface2 = setExpandActivityOverflowButtonContentDescription.asInterface(byteArray.toByteArray());
                    if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(asInterface2)) {
                        return true;
                    }
                    if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(asInterface2)) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public static boolean onTransact(Context context) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(Binder.getCallingUid());
            return packagesForUid != null && Arrays.asList(packagesForUid).contains("com.android.vending");
        }

        public RemoteActionCompatParcelizer() {
        }

        public static boolean read(Context context) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(context.getCacheDir());
                sb.append("/file_picker/");
                File[] listFiles = new File(sb.toString()).listFiles();
                if (listFiles == null) {
                    return true;
                }
                for (File delete : listFiles) {
                    delete.delete();
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        private static String onTransact(Class<?> cls, Object obj) {
            try {
                if (Build.VERSION.SDK_INT < 30) {
                    return (String) cls.getMethod("getPath", new Class[0]).invoke(obj, new Object[0]);
                }
                File file = (File) cls.getMethod("getDirectory", new Class[0]).invoke(obj, new Object[0]);
                if (file != null) {
                    return file.getPath();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        public static String asInterface(Uri uri, Context context) {
            Cursor query;
            String str = null;
            try {
                if (uri.getScheme().equals("content")) {
                    query = context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
                    if (query != null) {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                        }
                    }
                    query.close();
                }
                if (str != null) {
                    return str;
                }
                String path = uri.getPath();
                int lastIndexOf = path.lastIndexOf(47);
                return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
            } catch (Exception unused) {
                return null;
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }

        public static String RemoteActionCompatParcelizer(String str, Context context) {
            try {
                StorageManager storageManager = (StorageManager) context.getSystemService("storage");
                Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
                Method method2 = cls.getMethod("getUuid", new Class[0]);
                Method method3 = cls.getMethod("isPrimary", new Class[0]);
                Object invoke = method.invoke(storageManager, new Object[0]);
                if (invoke == null) {
                    return null;
                }
                int length = Array.getLength(invoke);
                for (int i = 0; i < length; i++) {
                    Object obj = Array.get(invoke, i);
                    String str2 = (String) method2.invoke(obj, new Object[0]);
                    if (((Boolean) method3.invoke(obj, new Object[0])) != null && "primary".equals(str)) {
                        return onTransact(cls, obj);
                    }
                    if (str2 != null && str2.equals(str)) {
                        return onTransact(cls, obj);
                    }
                }
                return null;
            } catch (Exception unused) {
            }
        }

        public static getCompoundPaddingRight asInterface(Context context, Uri uri, boolean z) {
            FileOutputStream fileOutputStream;
            getCompoundPaddingRight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new getCompoundPaddingRight.RemoteActionCompatParcelizer();
            String asInterface2 = asInterface(uri, context);
            StringBuilder sb = new StringBuilder();
            sb.append(context.getCacheDir().getAbsolutePath());
            sb.append("/file_picker/");
            sb.append(asInterface2 != null ? asInterface2 : Long.valueOf(System.currentTimeMillis()));
            String obj = sb.toString();
            File file = new File(obj);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(obj);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read2 = openInputStream.read(bArr);
                            if (read2 < 0) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read2);
                        }
                        bufferedOutputStream.flush();
                        fileOutputStream.getFD().sync();
                    } catch (Exception e) {
                        e = e;
                        try {
                            fileOutputStream.close();
                            e.getMessage();
                            return null;
                        } catch (IOException | NullPointerException unused) {
                            e.getMessage();
                            return null;
                        }
                    } catch (Throwable th) {
                        fileOutputStream.getFD().sync();
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = null;
                    fileOutputStream.close();
                    e.getMessage();
                    return null;
                }
            }
            if (z) {
                try {
                    int length = (int) file.length();
                    byte[] bArr2 = new byte[length];
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        bufferedInputStream.read(bArr2, 0, length);
                        bufferedInputStream.close();
                    } catch (FileNotFoundException e3) {
                        e3.getMessage();
                    } catch (IOException e4) {
                        e4.getMessage();
                    }
                    remoteActionCompatParcelizer.read = bArr2;
                } catch (Exception unused2) {
                }
            }
            remoteActionCompatParcelizer.onTransact = obj;
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer = asInterface2;
            remoteActionCompatParcelizer.asInterface = uri;
            remoteActionCompatParcelizer.asBinder = Long.parseLong(String.valueOf(file.length()));
            return new getCompoundPaddingRight(remoteActionCompatParcelizer.onTransact, remoteActionCompatParcelizer.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.asInterface, remoteActionCompatParcelizer.asBinder, remoteActionCompatParcelizer.read);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.media.AudioTrack onConnected() throws com.google.android.exoplayer2.audio.AudioSink.InitializationException {
        /*
            r13 = this;
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r0 = r13.MediaSessionCompat$QueueItem     // Catch:{ InitializationException -> 0x0009 }
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink.IconCompatParcelizer) r0     // Catch:{ InitializationException -> 0x0009 }
            android.media.AudioTrack r0 = r13.RemoteActionCompatParcelizer((com.google.android.exoplayer2.audio.DefaultAudioSink.IconCompatParcelizer) r0)     // Catch:{ InitializationException -> 0x0009 }
            return r0
        L_0x0009:
            r0 = move-exception
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r1 = r13.MediaSessionCompat$QueueItem
            int r1 = r1.asBinder
            r2 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 <= r2) goto L_0x0039
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r1 = r13.MediaSessionCompat$QueueItem
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r12 = new com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer
            o.setMultiChoiceItems r3 = r1.asInterface
            int r4 = r1.RemoteActionCompatParcelizer
            int r5 = r1.IconCompatParcelizer
            int r6 = r1.write
            int r7 = r1.AudioAttributesCompatParcelizer
            int r8 = r1.read
            int r9 = r1.AudioAttributesImplApi26Parcelizer
            r10 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.exoplayer2.audio.AudioProcessor[] r11 = r1.onTransact
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            android.media.AudioTrack r1 = r13.RemoteActionCompatParcelizer((com.google.android.exoplayer2.audio.DefaultAudioSink.IconCompatParcelizer) r12)     // Catch:{ InitializationException -> 0x0035 }
            r13.MediaSessionCompat$QueueItem = r12     // Catch:{ InitializationException -> 0x0035 }
            return r1
        L_0x0035:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x0039:
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r1 = r13.MediaSessionCompat$QueueItem
            int r1 = r1.IconCompatParcelizer
            r2 = 1
            if (r1 == r2) goto L_0x0042
            r1 = 0
            goto L_0x0043
        L_0x0042:
            r1 = 1
        L_0x0043:
            if (r1 == 0) goto L_0x0047
            r13.ComponentActivity = r2
        L_0x0047:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.onConnected():android.media.AudioTrack");
    }

    private AudioTrack RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) throws AudioSink.InitializationException {
        try {
            AudioTrack onTransact2 = iconCompatParcelizer.onTransact(this.f0lambda$new$0$androidxactivityComponentActivity, this.AudioAttributesCompatParcelizer, this.onConnectionFailed);
            if (this.setInternalConnectionCallback != null && OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 29) {
                onTransact2.isOffloadedPlayback();
            }
            return onTransact2;
        } catch (AudioSink.InitializationException e) {
            AudioSink.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.asInterface(e);
            }
            throw e;
        }
    }

    private void read(long j) throws AudioSink.WriteException {
        ByteBuffer byteBuffer;
        int length = this.write.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.addOnConfigurationChangedListener[i - 1];
            } else {
                byteBuffer = this.Cancellable;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.asBinder;
                }
            }
            if (i == length) {
                read(byteBuffer, j);
            } else {
                AudioProcessor audioProcessor = this.write[i];
                if (i > this.MediaMetadataCompat) {
                    audioProcessor.read(byteBuffer);
                }
                ByteBuffer asInterface2 = audioProcessor.asInterface();
                this.addOnConfigurationChangedListener[i] = asInterface2;
                if (asInterface2.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private void read(ByteBuffer byteBuffer, long j) throws AudioSink.WriteException {
        int i;
        AudioSink.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.addMenuProvider;
            boolean z = true;
            if (byteBuffer2 != null) {
                if (!(byteBuffer2 == byteBuffer)) {
                    throw new IllegalArgumentException();
                }
            } else {
                this.addMenuProvider = byteBuffer;
                if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.addOnPictureInPictureModeChangedListener;
                    if (bArr == null || bArr.length < remaining) {
                        this.addOnPictureInPictureModeChangedListener = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.addOnPictureInPictureModeChangedListener, 0, remaining);
                    byteBuffer.position(position);
                    this.addOnNewIntentListener = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 21) {
                AppCompatDelegateImpl.AnonymousClass5 r14 = this.MediaBrowserCompat$MediaItem;
                int asBinder2 = r14.asInterface - ((int) (this.f1lambda$new$1$androidxactivityComponentActivity - (r14.asBinder() * ((long) r14.onConnected))));
                if (asBinder2 > 0) {
                    i = this.read.write(this.addOnPictureInPictureModeChangedListener, this.addOnNewIntentListener, Math.min(remaining2, asBinder2));
                    if (i > 0) {
                        this.addOnNewIntentListener += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else if (this.f0lambda$new$0$androidxactivityComponentActivity) {
                if (j != -9223372036854775807L) {
                    i = asBinder(this.read, byteBuffer, remaining2, j);
                } else {
                    throw new IllegalStateException();
                }
            } else {
                i = this.read.write(byteBuffer, remaining2, 1);
            }
            this.asBinder = SystemClock.elapsedRealtime();
            if (i < 0) {
                if (!((OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 24 && i == -6) || i == -32) || this.onBackPressed <= 0) {
                    z = false;
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(i, this.MediaSessionCompat$QueueItem.asInterface, z);
                AudioSink.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer;
                if (remoteActionCompatParcelizer2 != null) {
                    remoteActionCompatParcelizer2.asInterface(writeException);
                }
                if (!writeException.read) {
                    this.f2lambda$new$2$androidxactivityComponentActivity.asInterface(writeException);
                    return;
                }
                throw writeException;
            }
            this.f2lambda$new$2$androidxactivityComponentActivity.RemoteActionCompatParcelizer = null;
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 29 && this.read.isOffloadedPlayback()) {
                if (this.onBackPressed > 0) {
                    this.access$001 = false;
                }
                if (this.IconCompatParcelizer && (remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer) != null && i < remaining2 && !this.access$001) {
                    remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                }
            }
            if (this.MediaSessionCompat$QueueItem.IconCompatParcelizer == 0) {
                this.f1lambda$new$1$androidxactivityComponentActivity += (long) i;
            }
            if (i == remaining2) {
                if (this.MediaSessionCompat$QueueItem.IconCompatParcelizer != 0) {
                    if (byteBuffer != this.Cancellable) {
                        z = false;
                    }
                    if (z) {
                        this.onBackPressed += ((long) this.ParcelableVolumeInfo) * ((long) this.cancel);
                    } else {
                        throw new IllegalStateException();
                    }
                }
                this.addMenuProvider = null;
            }
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() throws AudioSink.WriteException {
        if (!this.PlaybackStateCompat$CustomAction) {
            if ((this.read != null) && onConnectionFailed()) {
                MediaBrowserCompat$CustomActionResultReceiver();
                this.PlaybackStateCompat$CustomAction = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onConnectionFailed() throws com.google.android.exoplayer2.audio.AudioSink.WriteException {
        /*
            r10 = this;
            int r0 = r10.MediaMetadataCompat
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r10.MediaMetadataCompat = r3
            r0 = r10
            goto L_0x002f
        L_0x000b:
            r4 = 0
            r0 = r10
        L_0x000d:
            int r5 = r0.MediaMetadataCompat
            com.google.android.exoplayer2.audio.AudioProcessor[] r6 = r0.write
            int r7 = r6.length
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 >= r7) goto L_0x0031
            r5 = r6[r5]
            if (r4 == 0) goto L_0x0020
            r5.read()
        L_0x0020:
            r0.read((long) r8)
            boolean r4 = r5.RemoteActionCompatParcelizer()
            if (r4 != 0) goto L_0x002a
            return r3
        L_0x002a:
            int r4 = r0.MediaMetadataCompat
            int r4 = r4 + r2
            r0.MediaMetadataCompat = r4
        L_0x002f:
            r4 = 1
            goto L_0x000d
        L_0x0031:
            java.nio.ByteBuffer r4 = r0.addMenuProvider
            if (r4 == 0) goto L_0x003d
            r0.read(r4, r8)
            java.nio.ByteBuffer r4 = r0.addMenuProvider
            if (r4 == 0) goto L_0x003d
            return r3
        L_0x003d:
            r0.MediaMetadataCompat = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.onConnectionFailed():boolean");
    }

    public final void onTransact(onTitleChanged ontitlechanged) {
        onTitleChanged ontitlechanged2 = new onTitleChanged(Math.max(0.1f, Math.min(ontitlechanged.AudioAttributesImplApi26Parcelizer, 8.0f)), Math.max(0.1f, Math.min(ontitlechanged.onTransact, 8.0f)));
        if (!this.MediaSessionCompat$ResultReceiverWrapper || OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 23) {
            RemoteActionCompatParcelizer(ontitlechanged2, MediaBrowserCompat$ItemReceiver().onTransact);
        } else {
            RemoteActionCompatParcelizer(ontitlechanged2);
        }
    }

    public final onTitleChanged RemoteActionCompatParcelizer() {
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return MediaBrowserCompat$ItemReceiver().RemoteActionCompatParcelizer;
    }

    public final void asInterface(onSubDecorInstalled onsubdecorinstalled) {
        if (!this.AudioAttributesCompatParcelizer.equals(onsubdecorinstalled)) {
            this.AudioAttributesCompatParcelizer = onsubdecorinstalled;
            if (!this.f0lambda$new$0$androidxactivityComponentActivity) {
                read();
            }
        }
    }

    public final void asBinder(int i) {
        if (this.onConnectionFailed != i) {
            this.onConnectionFailed = i;
            this.PlaybackStateCompat = i != 0;
            read();
        }
    }

    public final void RemoteActionCompatParcelizer(AppCompatDelegateImpl.AnonymousClass3 r2) {
        if (!this.MediaBrowserCompat$SearchResultReceiver.equals(r2)) {
            int i = r2.asBinder;
            float f = r2.asInterface;
            if (this.read != null) {
                int i2 = this.MediaBrowserCompat$SearchResultReceiver.asBinder;
            }
            this.MediaBrowserCompat$SearchResultReceiver = r2;
        }
    }

    public final void asInterface(AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2 = null;
        read read2 = audioDeviceInfo == null ? null : new read(audioDeviceInfo);
        this.ensureViewModelStore = read2;
        AudioTrack audioTrack = this.read;
        if (audioTrack != null) {
            if (read2 != null) {
                audioDeviceInfo2 = read2.read;
            }
            audioTrack.setPreferredDevice(audioDeviceInfo2);
        }
    }

    public final void asBinder() {
        if (!(OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 21)) {
            throw new IllegalStateException();
        } else if (!this.PlaybackStateCompat) {
            throw new IllegalStateException();
        } else if (!this.f0lambda$new$0$androidxactivityComponentActivity) {
            this.f0lambda$new$0$androidxactivityComponentActivity = true;
            read();
        }
    }

    public final void asInterface() {
        if (this.f0lambda$new$0$androidxactivityComponentActivity) {
            this.f0lambda$new$0$androidxactivityComponentActivity = false;
            read();
        }
    }

    public final void onTransact(float f) {
        if (this.onActivityResult != f) {
            this.onActivityResult = f;
            MediaBrowserCompat$MediaItem();
        }
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        boolean z = false;
        this.IconCompatParcelizer = false;
        if (this.read != null) {
            AppCompatDelegateImpl.AnonymousClass5 r1 = this.MediaBrowserCompat$MediaItem;
            r1.read();
            if (r1.MediaBrowserCompat$MediaItem == -9223372036854775807L) {
                AppCompatDelegateImpl.AnonymousClass4 r12 = r1.RemoteActionCompatParcelizer;
                if (r12.read != null) {
                    r12.asInterface(0);
                }
                z = true;
            }
            if (z) {
                this.read.pause();
            }
        }
    }

    public final void setInternalConnectionCallback() {
        read();
        for (AudioProcessor IconCompatParcelizer2 : this.getSavedStateRegistry) {
            IconCompatParcelizer2.IconCompatParcelizer();
        }
        for (AudioProcessor IconCompatParcelizer3 : this.getOnBackPressedDispatcher) {
            IconCompatParcelizer3.IconCompatParcelizer();
        }
        this.IconCompatParcelizer = false;
        this.ComponentActivity = false;
    }

    private void MediaBrowserCompat$SearchResultReceiver() {
        this.getViewModelStore = 0;
        this.getLifecycle = 0;
        this.f1lambda$new$1$androidxactivityComponentActivity = 0;
        this.onBackPressed = 0;
        this.access$001 = false;
        this.ParcelableVolumeInfo = 0;
        this.createFullyDrawnExecutor = new AudioAttributesImplApi26Parcelizer(MediaBrowserCompat$ItemReceiver().RemoteActionCompatParcelizer, MediaBrowserCompat$ItemReceiver().onTransact, 0, 0, (byte) 0);
        this.getDefaultViewModelProviderFactory = 0;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.initViewTreeOwners.clear();
        this.Cancellable = null;
        this.cancel = 0;
        this.addMenuProvider = null;
        this.getDefaultViewModelCreationExtras = false;
        this.PlaybackStateCompat$CustomAction = false;
        this.MediaMetadataCompat = -1;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaDescriptionCompat = 0;
        this.invalidateMenu.write = 0;
        MediaDescriptionCompat();
    }

    private void RemoteActionCompatParcelizer(onTitleChanged ontitlechanged, boolean z) {
        AudioAttributesImplApi26Parcelizer MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
        if (!ontitlechanged.equals(MediaBrowserCompat$ItemReceiver2.RemoteActionCompatParcelizer) || z != MediaBrowserCompat$ItemReceiver2.onTransact) {
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer(ontitlechanged, z, -9223372036854775807L, -9223372036854775807L, (byte) 0);
            if (this.read != null) {
                this.AudioAttributesImplApi26Parcelizer = audioAttributesImplApi26Parcelizer;
            } else {
                this.createFullyDrawnExecutor = audioAttributesImplApi26Parcelizer;
            }
        }
    }

    private AudioAttributesImplApi26Parcelizer MediaBrowserCompat$ItemReceiver() {
        AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (audioAttributesImplApi26Parcelizer != null) {
            return audioAttributesImplApi26Parcelizer;
        }
        if (!this.initViewTreeOwners.isEmpty()) {
            return this.initViewTreeOwners.getLast();
        }
        return this.createFullyDrawnExecutor;
    }

    private void onTransact(long j) {
        onTitleChanged ontitlechanged;
        if (MediaSessionCompat$QueueItem()) {
            ontitlechanged = this.AudioAttributesImplBaseParcelizer.asBinder(MediaBrowserCompat$ItemReceiver().RemoteActionCompatParcelizer);
        } else {
            ontitlechanged = onTitleChanged.asInterface;
        }
        onTitleChanged ontitlechanged2 = ontitlechanged;
        boolean asInterface2 = MediaSessionCompat$QueueItem() ? this.AudioAttributesImplBaseParcelizer.asInterface(MediaBrowserCompat$ItemReceiver().onTransact) : false;
        this.initViewTreeOwners.add(new AudioAttributesImplApi26Parcelizer(ontitlechanged2, asInterface2, Math.max(0, j), (AudioAttributesImplBaseParcelizer() * 1000000) / ((long) this.MediaSessionCompat$QueueItem.AudioAttributesCompatParcelizer), (byte) 0));
        AudioProcessor[] audioProcessorArr = this.MediaSessionCompat$QueueItem.onTransact;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.onTransact()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.asBinder();
            }
        }
        int size = arrayList.size();
        this.write = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.addOnConfigurationChangedListener = new ByteBuffer[size];
        MediaDescriptionCompat();
        AudioSink.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.asBinder(asInterface2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean MediaSessionCompat$QueueItem() {
        /*
            r4 = this;
            boolean r0 = r4.f0lambda$new$0$androidxactivityComponentActivity
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0034
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r0 = r4.MediaSessionCompat$QueueItem
            o.setMultiChoiceItems r0 = r0.asInterface
            java.lang.String r0 = r0.f17lambda$new$1$androidxactivityComponentActivity
            java.lang.String r3 = "audio/raw"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0034
            com.google.android.exoplayer2.audio.DefaultAudioSink$IconCompatParcelizer r0 = r4.MediaSessionCompat$QueueItem
            o.setMultiChoiceItems r0 = r0.asInterface
            int r0 = r0.getOnBackPressedDispatcher
            boolean r3 = r4.RatingCompat
            if (r3 == 0) goto L_0x0030
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r3) goto L_0x002b
            r3 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r3) goto L_0x002b
            r3 = 4
            if (r0 == r3) goto L_0x002b
            r0 = 0
            goto L_0x002c
        L_0x002b:
            r0 = 1
        L_0x002c:
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.MediaSessionCompat$QueueItem():boolean");
    }

    /* access modifiers changed from: package-private */
    public final long onConnectionSuspended() {
        if (this.MediaSessionCompat$QueueItem.IconCompatParcelizer == 0) {
            return this.getViewModelStore / ((long) this.MediaSessionCompat$QueueItem.RemoteActionCompatParcelizer);
        }
        return this.getLifecycle;
    }

    /* access modifiers changed from: package-private */
    public final long AudioAttributesImplBaseParcelizer() {
        if (this.MediaSessionCompat$QueueItem.IconCompatParcelizer == 0) {
            return this.f1lambda$new$1$androidxactivityComponentActivity / ((long) this.MediaSessionCompat$QueueItem.write);
        }
        return this.onBackPressed;
    }

    private boolean asBinder(setMultiChoiceItems setmultichoiceitems, onSubDecorInstalled onsubdecorinstalled) {
        int asInterface2;
        int read2;
        int i;
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 29 || this.addOnContextAvailableListener == 0 || (asInterface2 = createPopupWindow.asInterface(setmultichoiceitems.f17lambda$new$1$androidxactivityComponentActivity, setmultichoiceitems.addMenuProvider)) == 0 || (read2 = OnBackPressedDispatcher.Api33Impl.read(setmultichoiceitems.addOnConfigurationChangedListener)) == 0) {
            return false;
        }
        AudioFormat build = new AudioFormat.Builder().setSampleRate(setmultichoiceitems.onActivityResult).setChannelMask(read2).setEncoding(asInterface2).build();
        if (onsubdecorinstalled.AudioAttributesImplApi26Parcelizer == null) {
            onsubdecorinstalled.AudioAttributesImplApi26Parcelizer = new onSubDecorInstalled.read(onsubdecorinstalled, (byte) 0);
        }
        AudioAttributes audioAttributes = onsubdecorinstalled.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 31) {
            i = AudioManager.getPlaybackOffloadSupport(build, audioAttributes);
        } else if (!AudioManager.isOffloadedPlaybackSupported(build, audioAttributes)) {
            i = 0;
        } else {
            i = (OnBackPressedDispatcher.Api33Impl.onConnectionFailed != 30 || !OnBackPressedDispatcher.Api33Impl.setInternalConnectionCallback.startsWith("Pixel")) ? 1 : 2;
        }
        if (i != 0) {
            if (i == 1) {
                boolean z = (setmultichoiceitems.addOnNewIntentListener == 0 && setmultichoiceitems.getActivityResultRegistry == 0) ? false : true;
                boolean z2 = this.addOnContextAvailableListener == 1;
                if (!z || !z2) {
                    return true;
                }
            } else if (i == 2) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
        return false;
    }

    private int asBinder(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 26) {
            return audioTrack.write(byteBuffer, i, 1, j * 1000);
        }
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.MediaBrowserCompat$ItemReceiver = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.MediaBrowserCompat$ItemReceiver.putInt(1431633921);
        }
        if (this.MediaDescriptionCompat == 0) {
            this.MediaBrowserCompat$ItemReceiver.putInt(4, i);
            this.MediaBrowserCompat$ItemReceiver.putLong(8, j * 1000);
            this.MediaBrowserCompat$ItemReceiver.position(0);
            this.MediaDescriptionCompat = i;
        }
        int remaining = this.MediaBrowserCompat$ItemReceiver.remaining();
        if (remaining > 0) {
            int write2 = audioTrack.write(this.MediaBrowserCompat$ItemReceiver, remaining, 1);
            if (write2 < 0) {
                this.MediaDescriptionCompat = 0;
                return write2;
            } else if (write2 < remaining) {
                return 0;
            }
        }
        int write3 = audioTrack.write(byteBuffer, i, 1);
        if (write3 < 0) {
            this.MediaDescriptionCompat = 0;
            return write3;
        }
        this.MediaDescriptionCompat -= write3;
        return write3;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.getDefaultViewModelCreationExtras) {
            this.getDefaultViewModelCreationExtras = true;
            AppCompatDelegateImpl.AnonymousClass5 r0 = this.MediaBrowserCompat$MediaItem;
            long AudioAttributesImplBaseParcelizer2 = AudioAttributesImplBaseParcelizer();
            r0.MediaBrowserCompat$ItemReceiver = r0.asBinder();
            r0.MediaBrowserCompat$MediaItem = SystemClock.elapsedRealtime() * 1000;
            r0.AudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer2;
            this.read.stop();
            this.MediaDescriptionCompat = 0;
        }
    }

    private static void asInterface(AudioTrack audioTrack, BaseMenuWrapper baseMenuWrapper) {
        baseMenuWrapper.onTransact();
        synchronized (onTransact) {
            if (RemoteActionCompatParcelizer == null) {
                RemoteActionCompatParcelizer = Executors.newSingleThreadExecutor(new setHorizontalOffset("ExoPlayer:AudioTrackReleaseThread"));
            }
            asInterface++;
            RemoteActionCompatParcelizer.execute(new onAttachedFromWindow(audioTrack, baseMenuWrapper));
        }
    }

    final class onConnected {
        final Handler RemoteActionCompatParcelizer = new Handler(Looper.myLooper());
        final AudioTrack.StreamEventCallback onTransact;

        public onConnected() {
            this.onTransact = new AudioTrack.StreamEventCallback(DefaultAudioSink.this) {
                public final void onDataRequest(AudioTrack audioTrack, int i) {
                    if (audioTrack.equals(DefaultAudioSink.this.read) && DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer != null && DefaultAudioSink.this.IconCompatParcelizer) {
                        DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer.onTransact();
                    }
                }

                public final void onTearDown(AudioTrack audioTrack) {
                    if (audioTrack.equals(DefaultAudioSink.this.read) && DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer != null && DefaultAudioSink.this.IconCompatParcelizer) {
                        DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer.onTransact();
                    }
                }
            };
        }
    }

    static final class AudioAttributesImplApi26Parcelizer {
        public final onTitleChanged RemoteActionCompatParcelizer;
        public final long asInterface;
        public final boolean onTransact;
        public final long read;

        /* synthetic */ AudioAttributesImplApi26Parcelizer(onTitleChanged ontitlechanged, boolean z, long j, long j2, byte b) {
            this(ontitlechanged, z, j, j2);
        }

        private AudioAttributesImplApi26Parcelizer(onTitleChanged ontitlechanged, boolean z, long j, long j2) {
            this.RemoteActionCompatParcelizer = ontitlechanged;
            this.onTransact = z;
            this.asInterface = j;
            this.read = j2;
        }
    }

    final class AudioAttributesCompatParcelizer implements AppCompatDelegateImpl.AnonymousClass5.read {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(DefaultAudioSink defaultAudioSink, byte b) {
            this();
        }

        public final void onTransact(long j, long j2, long j3, long j4) {
            DefaultAudioSink.this.onConnectionSuspended();
            DefaultAudioSink.this.AudioAttributesImplBaseParcelizer();
            synchronized (findMenuItemForSubmenu.read) {
            }
        }

        public final void asInterface(long j, long j2, long j3, long j4) {
            DefaultAudioSink.this.onConnectionSuspended();
            DefaultAudioSink.this.AudioAttributesImplBaseParcelizer();
            synchronized (findMenuItemForSubmenu.read) {
            }
        }

        public final void read(long j) {
            if (DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer != null) {
                DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer.read(j);
            }
        }

        public final void onTransact(int i, long j) {
            if (DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer != null) {
                int i2 = i;
                long j2 = j;
                DefaultAudioSink.this.AudioAttributesImplApi21Parcelizer.onTransact(i2, j2, SystemClock.elapsedRealtime() - DefaultAudioSink.this.asBinder);
            }
        }
    }

    static final class IconCompatParcelizer {
        public final int AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final int IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int asBinder;
        public final setMultiChoiceItems asInterface;
        public final AudioProcessor[] onTransact;
        public final int read;
        public final int write;

        public IconCompatParcelizer(setMultiChoiceItems setmultichoiceitems, int i, int i2, int i3, int i4, int i5, int i6, int i7, AudioProcessor[] audioProcessorArr) {
            this.asInterface = setmultichoiceitems;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.write = i3;
            this.AudioAttributesCompatParcelizer = i4;
            this.read = i5;
            this.AudioAttributesImplApi26Parcelizer = i6;
            this.asBinder = i7;
            this.onTransact = audioProcessorArr;
        }

        private static AudioAttributes onTransact(onSubDecorInstalled onsubdecorinstalled, boolean z) {
            if (z) {
                return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            }
            if (onsubdecorinstalled.AudioAttributesImplApi26Parcelizer == null) {
                onsubdecorinstalled.AudioAttributesImplApi26Parcelizer = new onSubDecorInstalled.read(onsubdecorinstalled, (byte) 0);
            }
            return onsubdecorinstalled.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
        }

        public final AudioTrack onTransact(boolean z, onSubDecorInstalled onsubdecorinstalled, int i) throws AudioSink.InitializationException {
            AudioTrack audioTrack;
            try {
                if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 29) {
                    audioTrack = new AudioTrack.Builder().setAudioAttributes(onTransact(onsubdecorinstalled, z)).setAudioFormat(new AudioFormat.Builder().setSampleRate(this.AudioAttributesCompatParcelizer).setChannelMask(this.read).setEncoding(this.AudioAttributesImplApi26Parcelizer).build()).setTransferMode(1).setBufferSizeInBytes(this.asBinder).setSessionId(i).setOffloadedPlayback(this.IconCompatParcelizer == 1).build();
                } else if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 21) {
                    audioTrack = new AudioTrack(onTransact(onsubdecorinstalled, z), new AudioFormat.Builder().setSampleRate(this.AudioAttributesCompatParcelizer).setChannelMask(this.read).setEncoding(this.AudioAttributesImplApi26Parcelizer).build(), this.asBinder, 1, i);
                } else {
                    int onTransact2 = OnBackPressedDispatcher.Api33Impl.onTransact(onsubdecorinstalled.setInternalConnectionCallback);
                    if (i == 0) {
                        audioTrack = new AudioTrack(onTransact2, this.AudioAttributesCompatParcelizer, this.read, this.AudioAttributesImplApi26Parcelizer, this.asBinder, 1);
                    } else {
                        audioTrack = new AudioTrack(onTransact2, this.AudioAttributesCompatParcelizer, this.read, this.AudioAttributesImplApi26Parcelizer, this.asBinder, 1, i);
                    }
                }
                int state = audioTrack.getState();
                if (state == 1) {
                    return audioTrack;
                }
                try {
                    audioTrack.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.AudioAttributesCompatParcelizer, this.read, this.asBinder, this.asInterface, this.IconCompatParcelizer == 1, (Exception) null);
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                throw new AudioSink.InitializationException(0, this.AudioAttributesCompatParcelizer, this.read, this.asBinder, this.asInterface, this.IconCompatParcelizer == 1, e);
            }
        }
    }

    static final class AudioAttributesImplApi21Parcelizer<T extends Exception> {
        T RemoteActionCompatParcelizer;
        private long asBinder;
        private final long onTransact = 100;

        public final void asInterface(T t) throws Exception {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = t;
                this.asBinder = this.onTransact + elapsedRealtime;
            }
            if (elapsedRealtime >= this.asBinder) {
                T t2 = this.RemoteActionCompatParcelizer;
                if (t2 != t) {
                    t2.addSuppressed(t);
                }
                T t3 = this.RemoteActionCompatParcelizer;
                this.RemoteActionCompatParcelizer = null;
                throw t3;
            }
        }
    }

    static final class read {
        public final AudioDeviceInfo read;

        public read(AudioDeviceInfo audioDeviceInfo) {
            this.read = audioDeviceInfo;
        }
    }

    private void RemoteActionCompatParcelizer(onTitleChanged ontitlechanged) {
        if (this.read != null) {
            try {
                this.read.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(ontitlechanged.AudioAttributesImplApi26Parcelizer).setPitch(ontitlechanged.onTransact).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                findMenuItemForSubmenu.onTransact("Failed to set playback params", e);
                synchronized (findMenuItemForSubmenu.read) {
                }
            }
            onTitleChanged ontitlechanged2 = new onTitleChanged(this.read.getPlaybackParams().getSpeed(), this.read.getPlaybackParams().getPitch());
            AppCompatDelegateImpl.AnonymousClass5 r5 = this.MediaBrowserCompat$MediaItem;
            r5.read = ontitlechanged2.AudioAttributesImplApi26Parcelizer;
            AppCompatDelegateImpl.AnonymousClass4 r2 = r5.RemoteActionCompatParcelizer;
            if (!(r2 == null || r2.read == null)) {
                r2.asInterface(0);
            }
            r5.read();
            ontitlechanged = ontitlechanged2;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = ontitlechanged;
    }

    private void MediaBrowserCompat$MediaItem() {
        if (!(this.read != null)) {
            return;
        }
        if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed >= 21) {
            this.read.setVolume(this.onActivityResult);
            return;
        }
        AudioTrack audioTrack = this.read;
        float f = this.onActivityResult;
        audioTrack.setStereoVolume(f, f);
    }

    public final void read() {
        boolean z = true;
        if (this.read != null) {
            MediaBrowserCompat$SearchResultReceiver();
            if (this.MediaBrowserCompat$MediaItem.asBinder.getPlayState() == 3) {
                this.read.pause();
            }
            AudioTrack audioTrack = this.read;
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 29 || !audioTrack.isOffloadedPlayback()) {
                z = false;
            }
            if (z) {
                onConnected onconnected = this.addContentView;
                this.read.unregisterStreamEventCallback(onconnected.onTransact);
                onconnected.RemoteActionCompatParcelizer.removeCallbacksAndMessages((Object) null);
            }
            if (OnBackPressedDispatcher.Api33Impl.onConnectionFailed < 21 && !this.PlaybackStateCompat) {
                this.onConnectionFailed = 0;
            }
            IconCompatParcelizer iconCompatParcelizer = this.addOnMultiWindowModeChangedListener;
            if (iconCompatParcelizer != null) {
                this.MediaSessionCompat$QueueItem = iconCompatParcelizer;
                this.addOnMultiWindowModeChangedListener = null;
            }
            AppCompatDelegateImpl.AnonymousClass5 r0 = this.MediaBrowserCompat$MediaItem;
            r0.read();
            r0.asBinder = null;
            r0.RemoteActionCompatParcelizer = null;
            asInterface(this.read, this.getActivityResultRegistry);
            this.read = null;
        }
        this.f2lambda$new$2$androidxactivityComponentActivity.RemoteActionCompatParcelizer = null;
        this.MediaSessionCompat$Token.RemoteActionCompatParcelizer = null;
    }

    public final long read(boolean z) {
        long j;
        if (!(this.read != null) || this.getFullyDrawnReporter) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.MediaBrowserCompat$MediaItem.asInterface(z), (AudioAttributesImplBaseParcelizer() * 1000000) / ((long) this.MediaSessionCompat$QueueItem.AudioAttributesCompatParcelizer));
        while (!this.initViewTreeOwners.isEmpty() && min >= this.initViewTreeOwners.getFirst().read) {
            this.createFullyDrawnExecutor = this.initViewTreeOwners.remove();
        }
        long j2 = min - this.createFullyDrawnExecutor.read;
        if (this.createFullyDrawnExecutor.RemoteActionCompatParcelizer.equals(onTitleChanged.asInterface)) {
            j = this.createFullyDrawnExecutor.asInterface + j2;
        } else if (this.initViewTreeOwners.isEmpty()) {
            j = this.AudioAttributesImplBaseParcelizer.onTransact(j2) + this.createFullyDrawnExecutor.asInterface;
        } else {
            AudioAttributesImplApi26Parcelizer first = this.initViewTreeOwners.getFirst();
            long j3 = first.read;
            float f = this.createFullyDrawnExecutor.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            long j4 = j3 - min;
            if (f != 1.0f) {
                j4 = Math.round(((double) j4) * ((double) f));
            }
            j = first.asInterface - j4;
        }
        return j + ((this.AudioAttributesImplBaseParcelizer.read() * 1000000) / ((long) this.MediaSessionCompat$QueueItem.AudioAttributesCompatParcelizer));
    }

    public final boolean IconCompatParcelizer() {
        if (!(this.read != null) || !this.MediaBrowserCompat$MediaItem.asBinder(AudioAttributesImplBaseParcelizer())) {
            return false;
        }
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        if (this.read != null) {
            return this.PlaybackStateCompat$CustomAction && !IconCompatParcelizer();
        }
        return true;
    }

    public final void asBinder(boolean z) {
        RemoteActionCompatParcelizer(MediaBrowserCompat$ItemReceiver().RemoteActionCompatParcelizer, z);
    }
}
