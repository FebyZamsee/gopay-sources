package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import java.io.IOException;
import java.util.List;
import o.ActionMode;
import o.AppCompatDelegateImpl;
import o.BaseMenuPresenter;
import o.DrawableContainerCompat;
import o.StandaloneActionMode;
import o.SupportActionModeWrapper;
import o.SupportMenuInflater;
import o.bypassDispatchKeyEvent;
import o.bypassOnContentChanged;
import o.collapseItemActionView;
import o.generateConfigDelta_locale;
import o.getCurrentIndex;
import o.getEmbeddedMenuWidthLimit;
import o.getIntrinsicWidth;
import o.getMenuView;
import o.getMenuWrapper;
import o.getPadding;
import o.getResourcesInternal;
import o.hasEmbeddedTabs;
import o.initialize;
import o.invalidateDrawable;
import o.isUiFocusable;
import o.onApplyThemeResource;
import o.setExitFadeDuration;
import o.setExpandedFormat;
import o.setHotspotBounds;
import o.setNegativeButtonIcon;
import o.setOnCancelListener;
import o.setTintMode;

public final class HlsMediaSource extends getCurrentIndex implements HlsPlaylistTracker.RemoteActionCompatParcelizer {
    private setOnCancelListener.AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer;
    private final collapseItemActionView AudioAttributesImplApi21Parcelizer;
    private final bypassOnContentChanged AudioAttributesImplApi26Parcelizer;
    private final setOnCancelListener.write AudioAttributesImplBaseParcelizer;
    private final hasEmbeddedTabs IconCompatParcelizer;
    private final boolean MediaBrowserCompat$MediaItem;
    private final boolean asBinder;
    private final setOnCancelListener onConnected;
    private final HlsPlaylistTracker onConnectionFailed;
    private final int onConnectionSuspended;
    private final isUiFocusable onTransact;
    private final invalidateDrawable read;
    private getMenuView setInternalConnectionCallback;
    private final long write;

    /* synthetic */ HlsMediaSource(setOnCancelListener setoncancellistener, isUiFocusable isuifocusable, hasEmbeddedTabs hasembeddedtabs, invalidateDrawable invalidatedrawable, bypassOnContentChanged bypassoncontentchanged, collapseItemActionView collapseitemactionview, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2, byte b) {
        this(setoncancellistener, isuifocusable, hasembeddedtabs, invalidatedrawable, bypassoncontentchanged, collapseitemactionview, hlsPlaylistTracker, j, z, i, z2);
    }

    static {
        setNegativeButtonIcon.read("goog.exo.hls");
    }

    public static final class Factory implements DrawableContainerCompat.AnonymousClass1 {
        private HlsPlaylistTracker.asBinder AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi21Parcelizer;
        private collapseItemActionView AudioAttributesImplApi26Parcelizer;
        private final isUiFocusable IconCompatParcelizer;
        private long RemoteActionCompatParcelizer;
        private bypassDispatchKeyEvent asBinder;
        private boolean asInterface;
        private boolean onConnected;
        private hasEmbeddedTabs onTransact;
        private invalidateDrawable read;
        private SupportMenuInflater.InflatedOnMenuItemClickListener write;

        public final int[] r_() {
            return new int[]{2};
        }

        public Factory(setExpandedFormat.read read2) {
            this((isUiFocusable) new getEmbeddedMenuWidthLimit(read2));
        }

        private Factory(isUiFocusable isuifocusable) {
            this.IconCompatParcelizer = isuifocusable;
            this.asBinder = new AppCompatDelegateImpl.Api24Impl();
            this.write = new StandaloneActionMode();
            this.AudioAttributesCompatParcelizer = onApplyThemeResource.asInterface;
            this.onTransact = hasEmbeddedTabs.read;
            this.AudioAttributesImplApi26Parcelizer = new BaseMenuPresenter();
            this.read = new getPadding();
            this.AudioAttributesImplApi21Parcelizer = 1;
            this.RemoteActionCompatParcelizer = -9223372036854775807L;
            this.asInterface = true;
        }

        /* renamed from: asBinder */
        public final HlsMediaSource read(setOnCancelListener setoncancellistener) {
            setOnCancelListener setoncancellistener2 = setoncancellistener;
            setOnCancelListener.write write2 = setoncancellistener2.write;
            SupportMenuInflater.InflatedOnMenuItemClickListener inflatedOnMenuItemClickListener = this.write;
            List<getIntrinsicWidth> list = setoncancellistener2.write.asBinder;
            if (!list.isEmpty()) {
                inflatedOnMenuItemClickListener = new getMenuWrapper(inflatedOnMenuItemClickListener, list);
            }
            isUiFocusable isuifocusable = this.IconCompatParcelizer;
            hasEmbeddedTabs hasembeddedtabs = this.onTransact;
            invalidateDrawable invalidatedrawable = this.read;
            bypassOnContentChanged onTransact2 = this.asBinder.onTransact(setoncancellistener2);
            collapseItemActionView collapseitemactionview = this.AudioAttributesImplApi26Parcelizer;
            return new HlsMediaSource(setoncancellistener, isuifocusable, hasembeddedtabs, invalidatedrawable, onTransact2, collapseitemactionview, this.AudioAttributesCompatParcelizer.onTransact(this.IconCompatParcelizer, collapseitemactionview, inflatedOnMenuItemClickListener), this.RemoteActionCompatParcelizer, this.asInterface, this.AudioAttributesImplApi21Parcelizer, this.onConnected, (byte) 0);
        }

        public final /* synthetic */ setHotspotBounds.asInterface onTransact(bypassDispatchKeyEvent bypassdispatchkeyevent) {
            if (bypassdispatchkeyevent != null) {
                this.asBinder = bypassdispatchkeyevent;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        public final /* synthetic */ setHotspotBounds.asInterface RemoteActionCompatParcelizer(collapseItemActionView collapseitemactionview) {
            if (collapseitemactionview != null) {
                this.AudioAttributesImplApi26Parcelizer = collapseitemactionview;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
    }

    private HlsMediaSource(setOnCancelListener setoncancellistener, isUiFocusable isuifocusable, hasEmbeddedTabs hasembeddedtabs, invalidateDrawable invalidatedrawable, bypassOnContentChanged bypassoncontentchanged, collapseItemActionView collapseitemactionview, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2) {
        this.AudioAttributesImplBaseParcelizer = setoncancellistener.write;
        this.onConnected = setoncancellistener;
        this.AudioAttributesCompatParcelizer = setoncancellistener.AudioAttributesImplApi26Parcelizer;
        this.onTransact = isuifocusable;
        this.IconCompatParcelizer = hasembeddedtabs;
        this.read = invalidatedrawable;
        this.AudioAttributesImplApi26Parcelizer = bypassoncontentchanged;
        this.AudioAttributesImplApi21Parcelizer = collapseitemactionview;
        this.onConnectionFailed = hlsPlaylistTracker;
        this.write = j;
        this.asBinder = z;
        this.onConnectionSuspended = i;
        this.MediaBrowserCompat$MediaItem = z2;
    }

    public final setOnCancelListener AudioAttributesCompatParcelizer() {
        return this.onConnected;
    }

    public final void onTransact(getMenuView getmenuview) {
        this.setInternalConnectionCallback = getmenuview;
        this.AudioAttributesImplApi26Parcelizer.read();
        this.AudioAttributesImplApi26Parcelizer.onTransact(Looper.myLooper(), asBinder());
        this.onConnectionFailed.asInterface(this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer, new setTintMode.asInterface(this.asInterface.RemoteActionCompatParcelizer, 0, (setHotspotBounds.onTransact) null, 0), this);
    }

    public final void AudioAttributesImplApi26Parcelizer() throws IOException {
        this.onConnectionFailed.read();
    }

    public final void asBinder(setExitFadeDuration setexitfadeduration) {
        ActionMode.Callback callback = (ActionMode.Callback) setexitfadeduration;
        callback.asInterface.asInterface((HlsPlaylistTracker.read) callback);
        for (getResourcesInternal getresourcesinternal : callback.asBinder) {
            if (getresourcesinternal.MediaBrowserCompat$ItemReceiver) {
                for (getResourcesInternal.read IconCompatParcelizer2 : getresourcesinternal.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver) {
                    IconCompatParcelizer2.IconCompatParcelizer();
                }
            }
            getresourcesinternal.write.asBinder(getresourcesinternal);
            getresourcesinternal.IconCompatParcelizer.removeCallbacksAndMessages((Object) null);
            getresourcesinternal.MediaSessionCompat$QueueItem = true;
            getresourcesinternal.AudioAttributesCompatParcelizer.clear();
        }
        callback.onTransact = null;
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.onConnectionFailed.onTransact();
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onTransact(o.SupportActionModeWrapper.CallbackWrapper r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            boolean r2 = r1.AudioAttributesCompatParcelizer
            r3 = 1000(0x3e8, double:4.94E-321)
            r5 = -9223372036854775808
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x001f
            long r9 = r1.MediaBrowserCompat$MediaItem
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x001d
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            long r9 = r9 / r3
        L_0x001d:
            r14 = r9
            goto L_0x0020
        L_0x001f:
            r14 = r7
        L_0x0020:
            int r2 = r1.AudioAttributesImplApi26Parcelizer
            r9 = 2
            r10 = 1
            if (r2 == r9) goto L_0x002c
            int r2 = r1.AudioAttributesImplApi26Parcelizer
            if (r2 == r10) goto L_0x002c
            r12 = r7
            goto L_0x002d
        L_0x002c:
            r12 = r14
        L_0x002d:
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r0.onConnectionFailed
            o.onActionViewCollapsed r11 = new o.onActionViewCollapsed
            o.SupportMenuInflater r2 = r2.asInterface()
            o.SupportMenuInflater r2 = (o.SupportMenuInflater) r2
            r11.<init>(r2, r1)
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r0.onConnectionFailed
            boolean r2 = r2.RemoteActionCompatParcelizer()
            r16 = 0
            if (r2 == 0) goto L_0x01e6
            long r9 = r1.MediaBrowserCompat$MediaItem
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker r2 = r0.onConnectionFailed
            long r21 = r2.asBinder()
            long r9 = r9 - r21
            boolean r2 = r1.asBinder
            if (r2 == 0) goto L_0x0056
            long r3 = r1.read
            long r3 = r3 + r9
            goto L_0x0057
        L_0x0056:
            r3 = r7
        L_0x0057:
            boolean r2 = r1.AudioAttributesCompatParcelizer
            if (r2 == 0) goto L_0x0084
            long r5 = r0.write
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0066
            long r5 = java.lang.System.currentTimeMillis()
            goto L_0x006c
        L_0x0066:
            long r25 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 + r25
        L_0x006c:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x007b
            r23 = -9223372036854775808
            int r2 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x0077
            goto L_0x007b
        L_0x0077:
            r21 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r21
        L_0x007b:
            long r7 = r1.MediaBrowserCompat$MediaItem
            r30 = r9
            long r9 = r1.read
            long r7 = r7 + r9
            long r5 = r5 - r7
            goto L_0x0088
        L_0x0084:
            r30 = r9
            r5 = r16
        L_0x0088:
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r2 = r0.AudioAttributesCompatParcelizer
            long r7 = r2.setInternalConnectionCallback
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x00a9
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r2 = r0.AudioAttributesCompatParcelizer
            long r7 = r2.setInternalConnectionCallback
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x00e0
            r9 = -9223372036854775808
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x00a4
            goto L_0x00e0
        L_0x00a4:
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            goto L_0x00e0
        L_0x00a9:
            o.SupportActionModeWrapper$CallbackWrapper$RemoteActionCompatParcelizer r2 = r1.setInternalConnectionCallback
            long r7 = r1.onConnectionSuspended
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r19 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r19 == 0) goto L_0x00bc
            long r7 = r1.read
            long r9 = r1.onConnectionSuspended
            long r7 = r7 - r9
            goto L_0x00df
        L_0x00bc:
            long r7 = r2.asBinder
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r19 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r19 == 0) goto L_0x00d0
            long r7 = r1.write
            int r19 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r19 == 0) goto L_0x00d0
            long r7 = r2.asBinder
            goto L_0x00df
        L_0x00d0:
            long r7 = r2.RemoteActionCompatParcelizer
            int r19 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r19 == 0) goto L_0x00d9
            long r7 = r2.RemoteActionCompatParcelizer
            goto L_0x00df
        L_0x00d9:
            r7 = 3
            long r9 = r1.MediaBrowserCompat$CustomActionResultReceiver
            long r7 = r7 * r9
        L_0x00df:
            long r7 = r7 + r5
        L_0x00e0:
            long r9 = r1.read
            long r9 = r9 + r5
            long r7 = java.lang.Math.min(r7, r9)
            long r7 = java.lang.Math.max(r5, r7)
            o.setOnCancelListener r2 = r0.onConnected
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r2 = r2.AudioAttributesImplApi26Parcelizer
            float r2 = r2.onConnectionSuspended
            r9 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x011a
            o.setOnCancelListener r2 = r0.onConnected
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r2 = r2.AudioAttributesImplApi26Parcelizer
            float r2 = r2.AudioAttributesImplApi21Parcelizer
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x011a
            o.SupportActionModeWrapper$CallbackWrapper$RemoteActionCompatParcelizer r2 = r1.setInternalConnectionCallback
            r9 = r11
            long r10 = r2.RemoteActionCompatParcelizer
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x0120
            o.SupportActionModeWrapper$CallbackWrapper$RemoteActionCompatParcelizer r2 = r1.setInternalConnectionCallback
            long r10 = r2.asBinder
            int r2 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x0120
            r2 = 1
            goto L_0x0121
        L_0x011a:
            r9 = r11
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0120:
            r2 = 0
        L_0x0121:
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer$asInterface r10 = new o.setOnCancelListener$AudioAttributesImplApi26Parcelizer$asInterface
            r10.<init>()
            int r11 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r11 == 0) goto L_0x0135
            r23 = -9223372036854775808
            int r11 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r11 != 0) goto L_0x0131
            goto L_0x0135
        L_0x0131:
            r21 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r21
        L_0x0135:
            r10.RemoteActionCompatParcelizer = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x013e
            r8 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0142
        L_0x013e:
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r8 = r0.AudioAttributesCompatParcelizer
            float r8 = r8.onConnectionSuspended
        L_0x0142:
            r10.asBinder = r8
            if (r2 == 0) goto L_0x0147
            goto L_0x014b
        L_0x0147:
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r2 = r0.AudioAttributesCompatParcelizer
            float r7 = r2.AudioAttributesImplApi21Parcelizer
        L_0x014b:
            r10.read = r7
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r2 = new o.setOnCancelListener$AudioAttributesImplApi26Parcelizer
            r7 = 0
            r2.<init>(r10, r7)
            r0.AudioAttributesCompatParcelizer = r2
            long r10 = r1.onConnectionSuspended
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r2 == 0) goto L_0x0163
            long r5 = r1.onConnectionSuspended
            goto L_0x017b
        L_0x0163:
            long r10 = r1.read
            long r10 = r10 + r5
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r2 = r0.AudioAttributesCompatParcelizer
            long r5 = r2.setInternalConnectionCallback
            int r2 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r2 == 0) goto L_0x0179
            r23 = -9223372036854775808
            int r2 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r2 != 0) goto L_0x0175
            goto L_0x0179
        L_0x0175:
            r21 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 * r21
        L_0x0179:
            long r5 = r10 - r5
        L_0x017b:
            boolean r2 = r1.AudioAttributesImplApi21Parcelizer
            if (r2 == 0) goto L_0x0182
        L_0x017f:
            r22 = r5
            goto L_0x01b7
        L_0x0182:
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$onTransact> r2 = r1.MediaBrowserCompat$ItemReceiver
            o.SupportActionModeWrapper$CallbackWrapper$onTransact r2 = read(r2, r5)
            if (r2 == 0) goto L_0x018d
            long r5 = r2.AudioAttributesImplBaseParcelizer
            goto L_0x017f
        L_0x018d:
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$read> r2 = r1.AudioAttributesImplBaseParcelizer
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0198
            r22 = r16
            goto L_0x01b7
        L_0x0198:
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$read> r2 = r1.AudioAttributesImplBaseParcelizer
            java.lang.Long r8 = java.lang.Long.valueOf(r5)
            r10 = 1
            int r8 = o.OnBackPressedDispatcher.Api33Impl.read(r2, r8, (boolean) r10)
            java.lang.Object r2 = r2.get(r8)
            o.SupportActionModeWrapper$CallbackWrapper$read r2 = (o.SupportActionModeWrapper.CallbackWrapper.read) r2
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$onTransact> r8 = r2.onTransact
            o.SupportActionModeWrapper$CallbackWrapper$onTransact r5 = read(r8, r5)
            if (r5 == 0) goto L_0x01b4
            long r5 = r5.AudioAttributesImplBaseParcelizer
            goto L_0x017f
        L_0x01b4:
            long r5 = r2.AudioAttributesImplBaseParcelizer
            goto L_0x017f
        L_0x01b7:
            int r2 = r1.AudioAttributesImplApi26Parcelizer
            r5 = 2
            if (r2 != r5) goto L_0x01c3
            boolean r2 = r1.asInterface
            if (r2 == 0) goto L_0x01c3
            r26 = 1
            goto L_0x01c5
        L_0x01c3:
            r26 = 0
        L_0x01c5:
            o.getConstantPadding r2 = new o.getConstantPadding
            r5 = r9
            r11 = r2
            long r6 = r1.read
            r18 = r6
            r24 = 1
            boolean r1 = r1.asBinder
            r6 = 1
            r25 = r1 ^ 1
            o.setOnCancelListener r1 = r0.onConnected
            r28 = r1
            o.setOnCancelListener$AudioAttributesImplApi26Parcelizer r1 = r0.AudioAttributesCompatParcelizer
            r29 = r1
            r16 = r3
            r20 = r30
            r27 = r5
            r11.<init>(r12, r14, r16, r18, r20, r22, r24, r25, r26, r27, r28, r29)
            goto L_0x0241
        L_0x01e6:
            r5 = r11
            long r2 = r1.onConnectionSuspended
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0221
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$read> r2 = r1.AudioAttributesImplBaseParcelizer
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0221
            boolean r2 = r1.AudioAttributesImplApi21Parcelizer
            if (r2 != 0) goto L_0x021c
            long r2 = r1.onConnectionSuspended
            long r6 = r1.read
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x021c
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$read> r2 = r1.AudioAttributesImplBaseParcelizer
            long r3 = r1.onConnectionSuspended
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 1
            int r3 = o.OnBackPressedDispatcher.Api33Impl.read(r2, r3, (boolean) r4)
            java.lang.Object r2 = r2.get(r3)
            o.SupportActionModeWrapper$CallbackWrapper$read r2 = (o.SupportActionModeWrapper.CallbackWrapper.read) r2
            long r2 = r2.AudioAttributesImplBaseParcelizer
            goto L_0x021e
        L_0x021c:
            long r2 = r1.onConnectionSuspended
        L_0x021e:
            r22 = r2
            goto L_0x0223
        L_0x0221:
            r22 = r16
        L_0x0223:
            o.getConstantPadding r2 = new o.getConstantPadding
            r11 = r2
            long r3 = r1.read
            r16 = r3
            long r3 = r1.read
            r18 = r3
            r20 = 0
            r24 = 1
            r25 = 0
            r26 = 1
            o.setOnCancelListener r1 = r0.onConnected
            r28 = r1
            r29 = 0
            r27 = r5
            r11.<init>(r12, r14, r16, r18, r20, r22, r24, r25, r26, r27, r28, r29)
        L_0x0241:
            r0.asInterface((o.getLocaleManagerForApplication) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.onTransact(o.SupportActionModeWrapper$CallbackWrapper):void");
    }

    private static SupportActionModeWrapper.CallbackWrapper.onTransact read(List<SupportActionModeWrapper.CallbackWrapper.onTransact> list, long j) {
        SupportActionModeWrapper.CallbackWrapper.onTransact ontransact = null;
        for (int i = 0; i < list.size(); i++) {
            SupportActionModeWrapper.CallbackWrapper.onTransact ontransact2 = list.get(i);
            if (ontransact2.AudioAttributesImplBaseParcelizer > j || !ontransact2.asBinder) {
                if (ontransact2.AudioAttributesImplBaseParcelizer > j) {
                    break;
                }
            } else {
                ontransact = ontransact2;
            }
        }
        return ontransact;
    }

    public final setExitFadeDuration asInterface(setHotspotBounds.onTransact ontransact, initialize initialize, long j) {
        setTintMode.asInterface asinterface = new setTintMode.asInterface(this.asInterface.RemoteActionCompatParcelizer, 0, ontransact, 0);
        return new ActionMode.Callback(this.IconCompatParcelizer, this.onConnectionFailed, this.onTransact, this.setInternalConnectionCallback, this.AudioAttributesImplApi26Parcelizer, new generateConfigDelta_locale.asBinder(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, 0, ontransact), this.AudioAttributesImplApi21Parcelizer, asinterface, initialize, this.read, this.asBinder, this.onConnectionSuspended, this.MediaBrowserCompat$MediaItem, asBinder());
    }
}
