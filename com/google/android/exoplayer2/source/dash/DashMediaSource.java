package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.ActionBarPolicy;
import o.AppCompatDelegateImpl;
import o.BaseMenuPresenter;
import o.Compatibility;
import o.DrawableContainerCompat;
import o.DrawerArrowDrawable;
import o.OnBackPressedDispatcher;
import o.StateListDrawableCompat;
import o.bindItemView;
import o.bypassDispatchKeyEvent;
import o.bypassOnContentChanged;
import o.collapseItemActionView;
import o.expandItemActionView;
import o.extractStateSet;
import o.findMenuItemForSubmenu;
import o.generateConfigDelta_locale;
import o.getConstantState;
import o.getCurrentIndex;
import o.getIntrinsicWidth;
import o.getLocaleManagerForApplication;
import o.getMaxActionButtons;
import o.getMenuView;
import o.getPadding;
import o.getPaint;
import o.getStateDrawable;
import o.getStateListState;
import o.getStateSet;
import o.getValueForDensity;
import o.initialize;
import o.invalidateDrawable;
import o.maybeHandleDragEventViaPerformReceiveContent;
import o.onDismiss;
import o.preload;
import o.selectDrawable;
import o.setDirection;
import o.setExitFadeDuration;
import o.setExpandedFormat;
import o.setGapSize;
import o.setHotspot;
import o.setHotspotBounds;
import o.setMultiChoiceItems;
import o.setNegativeButtonIcon;
import o.setOnCancelListener;
import o.setProgress;
import o.setTintMode;
import o.setVariablePadding;

public final class DashMediaSource extends getCurrentIndex implements onDismiss.RemoteActionCompatParcelizer, bindItemView {
    final Runnable AudioAttributesCompatParcelizer;
    final setTintMode.asInterface AudioAttributesImplApi21Parcelizer;
    private final setGapSize AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final setOnCancelListener Cancellable;
    private getMenuView ComponentActivity;
    private final setDirection.RemoteActionCompatParcelizer IconCompatParcelizer;
    private Uri MediaBrowserCompat$CustomActionResultReceiver;
    private Loader MediaBrowserCompat$ItemReceiver;
    private StateListDrawableCompat.StateListState MediaBrowserCompat$MediaItem;
    private final read MediaBrowserCompat$SearchResultReceiver;
    private final bindItemView MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
    private setOnCancelListener.AudioAttributesImplApi26Parcelizer MediaDescriptionCompat;
    private IOException MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private long MediaSessionCompat$ResultReceiverWrapper;
    private final Object MediaSessionCompat$Token;
    private final expandItemActionView.RemoteActionCompatParcelizer<? extends StateListDrawableCompat.StateListState> ParcelableVolumeInfo;
    private Uri PlaybackStateCompat;
    private long PlaybackStateCompat$CustomAction;
    private final setExpandedFormat.read RatingCompat;
    private final Runnable access$001;
    private int addContentView;
    final collapseItemActionView asBinder;
    private final boolean cancel;
    private final SparseArray<setProgress> createFullyDrawnExecutor;
    private final getStateSet.onTransact initViewTreeOwners;
    private final long onConnected;
    private int onConnectionFailed;
    private final bypassOnContentChanged onConnectionSuspended;
    Handler onTransact;
    long read;
    private setExpandedFormat setInternalConnectionCallback;
    private final invalidateDrawable write;

    /* synthetic */ DashMediaSource(setOnCancelListener setoncancellistener, StateListDrawableCompat.StateListState stateListState, setExpandedFormat.read read2, expandItemActionView.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setDirection.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, invalidateDrawable invalidatedrawable, bypassOnContentChanged bypassoncontentchanged, collapseItemActionView collapseitemactionview, long j, byte b) {
        this(setoncancellistener, stateListState, read2, remoteActionCompatParcelizer, remoteActionCompatParcelizer2, invalidatedrawable, bypassoncontentchanged, collapseitemactionview, j);
    }

    static {
        setNegativeButtonIcon.read("goog.exo.dash");
    }

    public static final class Factory implements DrawableContainerCompat.AnonymousClass1 {
        private final setExpandedFormat.read AudioAttributesCompatParcelizer;
        private expandItemActionView.RemoteActionCompatParcelizer<? extends StateListDrawableCompat.StateListState> AudioAttributesImplApi26Parcelizer;
        private invalidateDrawable RemoteActionCompatParcelizer;
        private long asBinder;
        private bypassDispatchKeyEvent asInterface;
        private final setDirection.RemoteActionCompatParcelizer onTransact;
        private collapseItemActionView read;

        public final int[] r_() {
            return new int[]{0};
        }

        public Factory(setExpandedFormat.read read2) {
            this(new DrawerArrowDrawable.ArrowDirection.asBinder(read2), read2);
        }

        public Factory(setDirection.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setExpandedFormat.read read2) {
            this.onTransact = remoteActionCompatParcelizer;
            this.AudioAttributesCompatParcelizer = read2;
            this.asInterface = new AppCompatDelegateImpl.Api24Impl();
            this.read = new BaseMenuPresenter();
            this.asBinder = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
            this.RemoteActionCompatParcelizer = new getPadding();
        }

        /* renamed from: onTransact */
        public final DashMediaSource read(setOnCancelListener setoncancellistener) {
            setOnCancelListener.write write = setoncancellistener.write;
            expandItemActionView.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = new getValueForDensity();
            }
            List<getIntrinsicWidth> list = setoncancellistener.write.asBinder;
            return new DashMediaSource(setoncancellistener, (StateListDrawableCompat.StateListState) null, this.AudioAttributesCompatParcelizer, !list.isEmpty() ? new getConstantState(remoteActionCompatParcelizer, list) : remoteActionCompatParcelizer, this.onTransact, this.RemoteActionCompatParcelizer, this.asInterface.onTransact(setoncancellistener), this.read, this.asBinder, (byte) 0);
        }

        public final /* synthetic */ setHotspotBounds.asInterface onTransact(bypassDispatchKeyEvent bypassdispatchkeyevent) {
            if (bypassdispatchkeyevent != null) {
                this.asInterface = bypassdispatchkeyevent;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }

        public final /* synthetic */ setHotspotBounds.asInterface RemoteActionCompatParcelizer(collapseItemActionView collapseitemactionview) {
            if (collapseitemactionview != null) {
                this.read = collapseitemactionview;
                return this;
            }
            throw new NullPointerException("MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
    }

    private DashMediaSource(setOnCancelListener setoncancellistener, StateListDrawableCompat.StateListState stateListState, setExpandedFormat.read read2, expandItemActionView.RemoteActionCompatParcelizer<? extends StateListDrawableCompat.StateListState> remoteActionCompatParcelizer, setDirection.RemoteActionCompatParcelizer remoteActionCompatParcelizer2, invalidateDrawable invalidatedrawable, bypassOnContentChanged bypassoncontentchanged, collapseItemActionView collapseitemactionview, long j) {
        this.Cancellable = setoncancellistener;
        this.MediaDescriptionCompat = setoncancellistener.AudioAttributesImplApi26Parcelizer;
        this.PlaybackStateCompat = setoncancellistener.write.AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = setoncancellistener.write.AudioAttributesImplApi26Parcelizer;
        this.MediaBrowserCompat$MediaItem = stateListState;
        this.RatingCompat = read2;
        this.ParcelableVolumeInfo = remoteActionCompatParcelizer;
        this.IconCompatParcelizer = remoteActionCompatParcelizer2;
        this.onConnectionSuspended = bypassoncontentchanged;
        this.asBinder = collapseitemactionview;
        this.onConnected = j;
        this.write = invalidatedrawable;
        this.AudioAttributesImplApi26Parcelizer = new setGapSize();
        boolean z = stateListState != null;
        this.cancel = z;
        this.AudioAttributesImplApi21Parcelizer = new setTintMode.asInterface(this.asInterface.RemoteActionCompatParcelizer, 0, (setHotspotBounds.onTransact) null, 0);
        this.MediaSessionCompat$Token = new Object();
        this.createFullyDrawnExecutor = new SparseArray<>();
        this.initViewTreeOwners = new RemoteActionCompatParcelizer(this, (byte) 0);
        this.read = -9223372036854775807L;
        this.AudioAttributesImplBaseParcelizer = -9223372036854775807L;
        if (!z) {
            this.MediaBrowserCompat$SearchResultReceiver = new read(this, (byte) 0);
            this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this;
            this.access$001 = new getStateDrawable(this);
            this.AudioAttributesCompatParcelizer = new StateListDrawableCompat(this);
        } else if (true ^ stateListState.onTransact) {
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.access$001 = null;
            this.AudioAttributesCompatParcelizer = null;
            this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = new bindItemView.read();
        } else {
            throw new IllegalStateException();
        }
    }

    public final /* synthetic */ void onConnectionSuspended() {
        asInterface(false);
    }

    public final setOnCancelListener AudioAttributesCompatParcelizer() {
        return this.Cancellable;
    }

    public final void onTransact(getMenuView getmenuview) {
        this.ComponentActivity = getmenuview;
        this.onConnectionSuspended.read();
        this.onConnectionSuspended.onTransact(Looper.myLooper(), asBinder());
        if (this.cancel) {
            asInterface(false);
            return;
        }
        this.setInternalConnectionCallback = this.RatingCompat.s_();
        this.MediaBrowserCompat$ItemReceiver = new Loader("DashMediaSource");
        this.onTransact = OnBackPressedDispatcher.Api33Impl.read();
        IconCompatParcelizer();
    }

    public final void AudioAttributesImplApi26Parcelizer() throws IOException {
        this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.setInternalConnectionCallback();
    }

    public final setExitFadeDuration asInterface(setHotspotBounds.onTransact ontransact, initialize initialize, long j) {
        setHotspotBounds.onTransact ontransact2 = ontransact;
        int intValue = ((Integer) ontransact2.RemoteActionCompatParcelizer).intValue() - this.onConnectionFailed;
        setTintMode.asInterface asinterface = r1;
        setTintMode.asInterface asinterface2 = new setTintMode.asInterface(this.asInterface.RemoteActionCompatParcelizer, 0, ontransact, this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi21Parcelizer.get(intValue).asInterface);
        generateConfigDelta_locale.asBinder asbinder = r2;
        generateConfigDelta_locale.asBinder asbinder2 = new generateConfigDelta_locale.asBinder(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, 0, ontransact2);
        int i = this.onConnectionFailed;
        StateListDrawableCompat.StateListState stateListState = this.MediaBrowserCompat$MediaItem;
        setGapSize setgapsize = this.AudioAttributesImplApi26Parcelizer;
        int i2 = intValue + i;
        setProgress setprogress = new setProgress(i2, stateListState, setgapsize, intValue, this.IconCompatParcelizer, this.ComponentActivity, this.onConnectionSuspended, asbinder, this.asBinder, asinterface, this.AudioAttributesImplBaseParcelizer, this.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, initialize, this.write, this.initViewTreeOwners, asBinder());
        this.createFullyDrawnExecutor.put(setprogress.RemoteActionCompatParcelizer, setprogress);
        return setprogress;
    }

    public final void asBinder(setExitFadeDuration setexitfadeduration) {
        setProgress setprogress = (setProgress) setexitfadeduration;
        getStateSet getstateset = setprogress.asInterface;
        getstateset.IconCompatParcelizer = true;
        getstateset.asBinder.removeCallbacksAndMessages((Object) null);
        for (getPaint<setDirection> RemoteActionCompatParcelizer2 : setprogress.asBinder) {
            RemoteActionCompatParcelizer2.RemoteActionCompatParcelizer(setprogress);
        }
        setprogress.onTransact = null;
        this.createFullyDrawnExecutor.remove(setprogress.RemoteActionCompatParcelizer);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.MediaSessionCompat$QueueItem = false;
        this.setInternalConnectionCallback = null;
        Loader loader = this.MediaBrowserCompat$ItemReceiver;
        if (loader != null) {
            loader.asBinder((Loader.onTransact) null);
            this.MediaBrowserCompat$ItemReceiver = null;
        }
        this.PlaybackStateCompat$CustomAction = 0;
        this.MediaSessionCompat$ResultReceiverWrapper = 0;
        this.MediaBrowserCompat$MediaItem = this.cancel ? this.MediaBrowserCompat$MediaItem : null;
        this.PlaybackStateCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaMetadataCompat = null;
        Handler handler = this.onTransact;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.onTransact = null;
        }
        this.AudioAttributesImplBaseParcelizer = -9223372036854775807L;
        this.addContentView = 0;
        this.read = -9223372036854775807L;
        this.onConnectionFailed = 0;
        this.createFullyDrawnExecutor.clear();
        setGapSize setgapsize = this.AudioAttributesImplApi26Parcelizer;
        setgapsize.read.clear();
        setgapsize.asBinder.clear();
        setgapsize.RemoteActionCompatParcelizer.clear();
        this.onConnectionSuspended.RemoteActionCompatParcelizer();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void RemoteActionCompatParcelizer(o.expandItemActionView<o.StateListDrawableCompat.StateListState> r28, long r29, long r31) {
        /*
            r27 = this;
            r1 = r27
            r0 = r28
            r14 = r29
            long r3 = r0.asBinder
            o.showsIcon r5 = r0.read
            o.getId r2 = r0.onTransact
            android.net.Uri r6 = r2.RemoteActionCompatParcelizer
            o.getId r2 = r0.onTransact
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r2.onTransact
            o.selectDrawable r17 = new o.selectDrawable
            o.getId r2 = r0.onTransact
            long r12 = r2.asInterface
            r2 = r17
            r8 = r29
            r10 = r31
            r2.<init>(r3, r5, r6, r7, r8, r10, r12)
            long r2 = r0.asBinder
            o.setTintMode$asInterface r2 = r1.AudioAttributesImplApi21Parcelizer
            int r3 = r0.asInterface
            r19 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r2
            r18 = r3
            r16.onTransact(r17, r18, r19, r20, r21, r22, r23, r25)
            T r2 = r0.RemoteActionCompatParcelizer
            o.StateListDrawableCompat$StateListState r2 = (o.StateListDrawableCompat.StateListState) r2
            o.StateListDrawableCompat$StateListState r3 = r1.MediaBrowserCompat$MediaItem
            r4 = 0
            if (r3 != 0) goto L_0x004b
            r3 = 0
            goto L_0x0051
        L_0x004b:
            java.util.List<o.Compatibility$Api18Impl> r3 = r3.AudioAttributesImplApi21Parcelizer
            int r3 = r3.size()
        L_0x0051:
            java.util.List<o.Compatibility$Api18Impl> r5 = r2.AudioAttributesImplApi21Parcelizer
            java.lang.Object r5 = r5.get(r4)
            o.Compatibility$Api18Impl r5 = (o.Compatibility.Api18Impl) r5
            long r5 = r5.asInterface
            r7 = 0
        L_0x005c:
            if (r7 >= r3) goto L_0x0071
            o.StateListDrawableCompat$StateListState r8 = r1.MediaBrowserCompat$MediaItem
            java.util.List<o.Compatibility$Api18Impl> r8 = r8.AudioAttributesImplApi21Parcelizer
            java.lang.Object r8 = r8.get(r7)
            o.Compatibility$Api18Impl r8 = (o.Compatibility.Api18Impl) r8
            long r8 = r8.asInterface
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 >= 0) goto L_0x0071
            int r7 = r7 + 1
            goto L_0x005c
        L_0x0071:
            boolean r5 = r2.onTransact
            r6 = 1
            if (r5 == 0) goto L_0x00d5
            int r5 = r3 - r7
            java.util.List<o.Compatibility$Api18Impl> r8 = r2.AudioAttributesImplApi21Parcelizer
            int r8 = r8.size()
            if (r5 <= r8) goto L_0x0085
            java.lang.Object r5 = o.findMenuItemForSubmenu.read
            monitor-enter(r5)
            monitor-exit(r5)
            goto L_0x00a2
        L_0x0085:
            long r8 = r1.read
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x00a4
            long r8 = r2.IconCompatParcelizer
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            long r10 = r1.read
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 > 0) goto L_0x00a4
            long r8 = r2.IconCompatParcelizer
            java.lang.Object r5 = o.findMenuItemForSubmenu.read
            monitor-enter(r5)
            monitor-exit(r5)
        L_0x00a2:
            r5 = 1
            goto L_0x00a5
        L_0x00a4:
            r5 = 0
        L_0x00a5:
            if (r5 == 0) goto L_0x00d3
            int r2 = r1.addContentView
            int r3 = r2 + 1
            r1.addContentView = r3
            o.collapseItemActionView r3 = r1.asBinder
            int r0 = r0.asInterface
            int r0 = r3.asBinder(r0)
            if (r2 >= r0) goto L_0x00cb
            int r0 = r1.addContentView
            int r0 = r0 - r6
            int r0 = r0 * 1000
            r2 = 5000(0x1388, float:7.006E-42)
            int r0 = java.lang.Math.min(r0, r2)
            long r2 = (long) r0
            android.os.Handler r0 = r1.onTransact
            java.lang.Runnable r4 = r1.access$001
            r0.postDelayed(r4, r2)
            return
        L_0x00cb:
            com.google.android.exoplayer2.source.dash.DashManifestStaleException r0 = new com.google.android.exoplayer2.source.dash.DashManifestStaleException
            r0.<init>()
            r1.MediaMetadataCompat = r0
            return
        L_0x00d3:
            r1.addContentView = r4
        L_0x00d5:
            r1.MediaBrowserCompat$MediaItem = r2
            boolean r5 = r1.MediaSessionCompat$QueueItem
            boolean r2 = r2.onTransact
            r2 = r2 & r5
            r1.MediaSessionCompat$QueueItem = r2
            long r8 = r14 - r31
            r1.PlaybackStateCompat$CustomAction = r8
            r1.MediaSessionCompat$ResultReceiverWrapper = r14
            java.lang.Object r2 = r1.MediaSessionCompat$Token
            monitor-enter(r2)
            o.showsIcon r5 = r0.read     // Catch:{ all -> 0x01d1 }
            android.net.Uri r5 = r5.AudioAttributesCompatParcelizer     // Catch:{ all -> 0x01d1 }
            android.net.Uri r8 = r1.PlaybackStateCompat     // Catch:{ all -> 0x01d1 }
            if (r5 != r8) goto L_0x00f1
            r5 = 1
            goto L_0x00f2
        L_0x00f1:
            r5 = 0
        L_0x00f2:
            if (r5 == 0) goto L_0x0105
            o.StateListDrawableCompat$StateListState r5 = r1.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01d1 }
            android.net.Uri r5 = r5.asBinder     // Catch:{ all -> 0x01d1 }
            if (r5 == 0) goto L_0x00ff
            o.StateListDrawableCompat$StateListState r0 = r1.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01d1 }
            android.net.Uri r0 = r0.asBinder     // Catch:{ all -> 0x01d1 }
            goto L_0x0103
        L_0x00ff:
            o.getId r0 = r0.onTransact     // Catch:{ all -> 0x01d1 }
            android.net.Uri r0 = r0.RemoteActionCompatParcelizer     // Catch:{ all -> 0x01d1 }
        L_0x0103:
            r1.PlaybackStateCompat = r0     // Catch:{ all -> 0x01d1 }
        L_0x0105:
            monitor-exit(r2)
            if (r3 != 0) goto L_0x01c8
            o.StateListDrawableCompat$StateListState r0 = r1.MediaBrowserCompat$MediaItem
            boolean r0 = r0.onTransact
            if (r0 == 0) goto L_0x01c4
            o.StateListDrawableCompat$StateListState r0 = r1.MediaBrowserCompat$MediaItem
            o.getMaxActionButtons r0 = r0.onConnected
            if (r0 == 0) goto L_0x01c0
            o.StateListDrawableCompat$StateListState r0 = r1.MediaBrowserCompat$MediaItem
            o.getMaxActionButtons r0 = r0.onConnected
            java.lang.String r2 = r0.read
            if (r2 != 0) goto L_0x011e
            r3 = 0
            goto L_0x0124
        L_0x011e:
            java.lang.String r3 = "urn:mpeg:dash:utc:direct:2014"
            boolean r3 = r2.equals(r3)
        L_0x0124:
            if (r3 != 0) goto L_0x01a3
            if (r2 != 0) goto L_0x012a
            r3 = 0
            goto L_0x0130
        L_0x012a:
            java.lang.String r3 = "urn:mpeg:dash:utc:direct:2012"
            boolean r3 = r2.equals(r3)
        L_0x0130:
            if (r3 != 0) goto L_0x01a3
            if (r2 != 0) goto L_0x0136
            r3 = 0
            goto L_0x013c
        L_0x0136:
            java.lang.String r3 = "urn:mpeg:dash:utc:http-iso:2014"
            boolean r3 = r2.equals(r3)
        L_0x013c:
            if (r3 != 0) goto L_0x019a
            if (r2 != 0) goto L_0x0142
            r3 = 0
            goto L_0x0148
        L_0x0142:
            java.lang.String r3 = "urn:mpeg:dash:utc:http-iso:2012"
            boolean r3 = r2.equals(r3)
        L_0x0148:
            if (r3 != 0) goto L_0x019a
            if (r2 != 0) goto L_0x014e
            r3 = 0
            goto L_0x0154
        L_0x014e:
            java.lang.String r3 = "urn:mpeg:dash:utc:http-xsdate:2014"
            boolean r3 = r2.equals(r3)
        L_0x0154:
            if (r3 != 0) goto L_0x0191
            if (r2 != 0) goto L_0x015a
            r3 = 0
            goto L_0x0160
        L_0x015a:
            java.lang.String r3 = "urn:mpeg:dash:utc:http-xsdate:2012"
            boolean r3 = r2.equals(r3)
        L_0x0160:
            if (r3 != 0) goto L_0x0191
            if (r2 != 0) goto L_0x0166
            r0 = 0
            goto L_0x016c
        L_0x0166:
            java.lang.String r0 = "urn:mpeg:dash:utc:ntp:2014"
            boolean r0 = r2.equals(r0)
        L_0x016c:
            if (r0 != 0) goto L_0x018d
            if (r2 != 0) goto L_0x0171
            goto L_0x0177
        L_0x0171:
            java.lang.String r0 = "urn:mpeg:dash:utc:ntp:2012"
            boolean r4 = r2.equals(r0)
        L_0x0177:
            if (r4 != 0) goto L_0x018d
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Unsupported UTC timing scheme"
            r0.<init>(r2)
            java.lang.String r2 = "Failed to resolve time offset."
            o.findMenuItemForSubmenu.onTransact(r2, r0)
            java.lang.Object r0 = o.findMenuItemForSubmenu.read
            monitor-enter(r0)
            monitor-exit(r0)
            r1.asInterface(r6)
            return
        L_0x018d:
            r27.AudioAttributesImplBaseParcelizer()
            return
        L_0x0191:
            com.google.android.exoplayer2.source.dash.DashMediaSource$AudioAttributesCompatParcelizer r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$AudioAttributesCompatParcelizer
            r2.<init>(r4)
            r1.asInterface((o.getMaxActionButtons) r0, (o.expandItemActionView.RemoteActionCompatParcelizer<java.lang.Long>) r2)
            return
        L_0x019a:
            com.google.android.exoplayer2.source.dash.DashMediaSource$onTransact r2 = new com.google.android.exoplayer2.source.dash.DashMediaSource$onTransact
            r2.<init>()
            r1.asInterface((o.getMaxActionButtons) r0, (o.expandItemActionView.RemoteActionCompatParcelizer<java.lang.Long>) r2)
            return
        L_0x01a3:
            java.lang.String r0 = r0.onTransact     // Catch:{ ParserException -> 0x01b2 }
            long r2 = o.OnBackPressedDispatcher.Api33Impl.onTransact((java.lang.String) r0)     // Catch:{ ParserException -> 0x01b2 }
            long r4 = r1.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ ParserException -> 0x01b2 }
            long r2 = r2 - r4
            r1.AudioAttributesImplBaseParcelizer = r2     // Catch:{ ParserException -> 0x01b2 }
            r1.asInterface(r6)     // Catch:{ ParserException -> 0x01b2 }
            return
        L_0x01b2:
            r0 = move-exception
            java.lang.String r2 = "Failed to resolve time offset."
            o.findMenuItemForSubmenu.onTransact(r2, r0)
            java.lang.Object r0 = o.findMenuItemForSubmenu.read
            monitor-enter(r0)
            monitor-exit(r0)
            r1.asInterface(r6)
            return
        L_0x01c0:
            r27.AudioAttributesImplBaseParcelizer()
            return
        L_0x01c4:
            r1.asInterface(r6)
            return
        L_0x01c8:
            int r0 = r1.onConnectionFailed
            int r0 = r0 + r7
            r1.onConnectionFailed = r0
            r1.asInterface(r6)
            return
        L_0x01d1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.RemoteActionCompatParcelizer(o.expandItemActionView, long, long):void");
    }

    /* access modifiers changed from: package-private */
    public final void asInterface(expandItemActionView<Long> expanditemactionview, long j, long j2) {
        expandItemActionView<Long> expanditemactionview2 = expanditemactionview;
        selectDrawable selectdrawable = new selectDrawable(expanditemactionview2.asBinder, expanditemactionview2.read, expanditemactionview2.onTransact.RemoteActionCompatParcelizer, expanditemactionview2.onTransact.onTransact, j, j2, expanditemactionview2.onTransact.asInterface);
        long j3 = expanditemactionview2.asBinder;
        this.AudioAttributesImplApi21Parcelizer.onTransact(selectdrawable, expanditemactionview2.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        this.AudioAttributesImplBaseParcelizer = ((Long) expanditemactionview2.RemoteActionCompatParcelizer).longValue() - j;
        asInterface(true);
    }

    /* access modifiers changed from: package-private */
    public final Loader.RemoteActionCompatParcelizer RemoteActionCompatParcelizer(expandItemActionView<Long> expanditemactionview, long j, long j2, IOException iOException) {
        expandItemActionView<Long> expanditemactionview2 = expanditemactionview;
        this.AudioAttributesImplApi21Parcelizer.asInterface(new selectDrawable(expanditemactionview2.asBinder, expanditemactionview2.read, expanditemactionview2.onTransact.RemoteActionCompatParcelizer, expanditemactionview2.onTransact.onTransact, j, j2, expanditemactionview2.onTransact.asInterface), expanditemactionview2.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, true);
        long j3 = expanditemactionview2.asBinder;
        findMenuItemForSubmenu.onTransact("Failed to resolve time offset.", iOException);
        synchronized (findMenuItemForSubmenu.read) {
        }
        asInterface(true);
        return Loader.asBinder;
    }

    /* access modifiers changed from: package-private */
    public final void asBinder(expandItemActionView<?> expanditemactionview, long j, long j2) {
        expandItemActionView<?> expanditemactionview2 = expanditemactionview;
        selectDrawable selectdrawable = new selectDrawable(expanditemactionview2.asBinder, expanditemactionview2.read, expanditemactionview2.onTransact.RemoteActionCompatParcelizer, expanditemactionview2.onTransact.onTransact, j, j2, expanditemactionview2.onTransact.asInterface);
        long j3 = expanditemactionview2.asBinder;
        this.AudioAttributesImplApi21Parcelizer.asInterface(selectdrawable, expanditemactionview2.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    private void asInterface(getMaxActionButtons getmaxactionbuttons, expandItemActionView.RemoteActionCompatParcelizer<Long> remoteActionCompatParcelizer) {
        onTransact(new expandItemActionView(this.setInternalConnectionCallback, Uri.parse(getmaxactionbuttons.onTransact), 5, remoteActionCompatParcelizer), new asBinder(this, (byte) 0), 1);
    }

    private void AudioAttributesImplBaseParcelizer() {
        Loader loader = this.MediaBrowserCompat$ItemReceiver;
        if (onDismiss.read()) {
            onConnected();
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.onTransact(new onDismiss.onTransact((byte) 0), new onDismiss.read(this), 1);
    }

    private void asInterface(boolean z) {
        long j;
        long j2;
        long j3;
        Compatibility.Api18Impl api18Impl;
        long j4;
        long j5;
        for (int i = 0; i < this.createFullyDrawnExecutor.size(); i++) {
            int keyAt = this.createFullyDrawnExecutor.keyAt(i);
            if (keyAt >= this.onConnectionFailed) {
                this.createFullyDrawnExecutor.valueAt(i).RemoteActionCompatParcelizer(this.MediaBrowserCompat$MediaItem, keyAt - this.onConnectionFailed);
            }
        }
        Compatibility.Api18Impl api18Impl2 = this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi21Parcelizer.get(0);
        int size = this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi21Parcelizer.size() - 1;
        Compatibility.Api18Impl api18Impl3 = this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi21Parcelizer.get(size);
        long RemoteActionCompatParcelizer2 = this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer(size);
        if (!(RemoteActionCompatParcelizer2 == -9223372036854775807L || RemoteActionCompatParcelizer2 == Long.MIN_VALUE)) {
            RemoteActionCompatParcelizer2 *= 1000;
        }
        long j6 = this.AudioAttributesImplBaseParcelizer;
        if (j6 == -9223372036854775807L) {
            j = System.currentTimeMillis();
        } else {
            j = j6 + SystemClock.elapsedRealtime();
        }
        if (!(j == -9223372036854775807L || j == Long.MIN_VALUE)) {
            j *= 1000;
        }
        long RemoteActionCompatParcelizer3 = this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer(0);
        if (!(RemoteActionCompatParcelizer3 == -9223372036854775807L || RemoteActionCompatParcelizer3 == Long.MIN_VALUE)) {
            RemoteActionCompatParcelizer3 *= 1000;
        }
        long read2 = read(api18Impl2, RemoteActionCompatParcelizer3, j);
        long asBinder2 = asBinder(api18Impl3, RemoteActionCompatParcelizer2, j);
        boolean z2 = this.MediaBrowserCompat$MediaItem.onTransact && !read(api18Impl3);
        if (z2 && this.MediaBrowserCompat$MediaItem.AudioAttributesImplBaseParcelizer != -9223372036854775807L) {
            long j7 = this.MediaBrowserCompat$MediaItem.AudioAttributesImplBaseParcelizer;
            if (!(j7 == -9223372036854775807L || j7 == Long.MIN_VALUE)) {
                j7 *= 1000;
            }
            read2 = Math.max(read2, asBinder2 - j7);
        }
        long j8 = asBinder2 - read2;
        Compatibility.Api18Impl api18Impl4 = api18Impl2;
        if (this.MediaBrowserCompat$MediaItem.onTransact) {
            if (this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer != -9223372036854775807L) {
                long j9 = this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer;
                if (!(j9 == -9223372036854775807L || j9 == Long.MIN_VALUE)) {
                    j9 *= 1000;
                }
                long j10 = (j - j9) - read2;
                asBinder(j10, j8);
                long j11 = this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer;
                if (read2 == -9223372036854775807L || read2 == Long.MIN_VALUE) {
                    j5 = read2;
                } else {
                    j5 = read2 / 1000;
                }
                long j12 = this.MediaDescriptionCompat.setInternalConnectionCallback;
                if (!(j12 == -9223372036854775807L || j12 == Long.MIN_VALUE)) {
                    j12 *= 1000;
                }
                long j13 = j10 - j12;
                long min = Math.min(5000000, j8 / 2);
                j3 = j11 + j5;
                j2 = j13 < min ? min : j13;
                api18Impl = api18Impl4;
            } else {
                throw new IllegalStateException();
            }
        } else {
            j3 = -9223372036854775807L;
            api18Impl = api18Impl4;
            j2 = 0;
        }
        long j14 = api18Impl.asInterface;
        if (!(j14 == -9223372036854775807L || j14 == Long.MIN_VALUE)) {
            j14 *= 1000;
        }
        long j15 = this.MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer;
        long j16 = this.AudioAttributesImplBaseParcelizer;
        int i2 = this.onConnectionFailed;
        StateListDrawableCompat.StateListState stateListState = this.MediaBrowserCompat$MediaItem;
        asInterface((getLocaleManagerForApplication) new asInterface(j15, j3, j16, i2, read2 - j14, j8, j2, stateListState, this.Cancellable, stateListState.onTransact ? this.MediaDescriptionCompat : null));
        if (!this.cancel) {
            this.onTransact.removeCallbacks(this.AudioAttributesCompatParcelizer);
            if (z2) {
                Handler handler = this.onTransact;
                Runnable runnable = this.AudioAttributesCompatParcelizer;
                StateListDrawableCompat.StateListState stateListState2 = this.MediaBrowserCompat$MediaItem;
                long j17 = this.AudioAttributesImplBaseParcelizer;
                if (j17 == -9223372036854775807L) {
                    j4 = System.currentTimeMillis();
                } else {
                    j4 = j17 + SystemClock.elapsedRealtime();
                }
                handler.postDelayed(runnable, asInterface(stateListState2, j4));
            }
            if (this.MediaSessionCompat$QueueItem) {
                IconCompatParcelizer();
            } else if (z && this.MediaBrowserCompat$MediaItem.onTransact && this.MediaBrowserCompat$MediaItem.write != -9223372036854775807L) {
                long j18 = this.MediaBrowserCompat$MediaItem.write;
                if (j18 == 0) {
                    j18 = 5000;
                }
                this.onTransact.postDelayed(this.access$001, Math.max(0, (this.PlaybackStateCompat$CustomAction + j18) - SystemClock.elapsedRealtime()));
            }
        }
    }

    public final void IconCompatParcelizer() {
        Uri uri;
        this.onTransact.removeCallbacks(this.access$001);
        if (!(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null)) {
            if (this.MediaBrowserCompat$ItemReceiver.RemoteActionCompatParcelizer != null) {
                this.MediaSessionCompat$QueueItem = true;
                return;
            }
            synchronized (this.MediaSessionCompat$Token) {
                uri = this.PlaybackStateCompat;
            }
            this.MediaSessionCompat$QueueItem = false;
            onTransact(new expandItemActionView(this.setInternalConnectionCallback, uri, 4, this.ParcelableVolumeInfo), this.MediaBrowserCompat$SearchResultReceiver, this.asBinder.asBinder(4));
        }
    }

    private <T> void onTransact(expandItemActionView<T> expanditemactionview, Loader.read<expandItemActionView<T>> read2, int i) {
        expandItemActionView<T> expanditemactionview2 = expanditemactionview;
        this.AudioAttributesImplApi21Parcelizer.read(new selectDrawable(expanditemactionview2.asBinder, expanditemactionview2.read, this.MediaBrowserCompat$ItemReceiver.onTransact(expanditemactionview2, read2, i)), expanditemactionview2.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    private static long read(Compatibility.Api18Impl api18Impl, long j, long j2) {
        Compatibility.Api18Impl api18Impl2 = api18Impl;
        long j3 = j;
        long j4 = j2;
        long j5 = api18Impl2.asInterface;
        if (!(j5 == -9223372036854775807L || j5 == Long.MIN_VALUE)) {
            j5 *= 1000;
        }
        boolean asBinder2 = asBinder(api18Impl);
        long j6 = j5;
        for (int i = 0; i < api18Impl2.asBinder.size(); i++) {
            getStateListState getstateliststate = api18Impl2.asBinder.get(i);
            List<ActionBarPolicy> list = getstateliststate.onTransact;
            boolean z = true;
            if (getstateliststate.IconCompatParcelizer == 1 || getstateliststate.IconCompatParcelizer == 2) {
                z = false;
            }
            if ((!asBinder2 || !z) && !list.isEmpty()) {
                extractStateSet read2 = list.get(0).read();
                if (read2 == null || read2.RemoteActionCompatParcelizer(j3, j4) == 0) {
                    return j5;
                }
                j6 = Math.max(j6, read2.asInterface(read2.asBinder(j3, j4)) + j5);
            }
        }
        return j6;
    }

    private static long asBinder(Compatibility.Api18Impl api18Impl, long j, long j2) {
        Compatibility.Api18Impl api18Impl2 = api18Impl;
        long j3 = j;
        long j4 = j2;
        long j5 = api18Impl2.asInterface;
        if (!(j5 == -9223372036854775807L || j5 == Long.MIN_VALUE)) {
            j5 *= 1000;
        }
        boolean asBinder2 = asBinder(api18Impl);
        long j6 = LocationRequestCompat.PASSIVE_INTERVAL;
        for (int i = 0; i < api18Impl2.asBinder.size(); i++) {
            getStateListState getstateliststate = api18Impl2.asBinder.get(i);
            List<ActionBarPolicy> list = getstateliststate.onTransact;
            boolean z = true;
            if (getstateliststate.IconCompatParcelizer == 1 || getstateliststate.IconCompatParcelizer == 2) {
                z = false;
            }
            if ((!asBinder2 || !z) && !list.isEmpty()) {
                extractStateSet read2 = list.get(0).read();
                if (read2 == null) {
                    return j5 + j3;
                }
                long RemoteActionCompatParcelizer2 = read2.RemoteActionCompatParcelizer(j3, j4);
                if (RemoteActionCompatParcelizer2 == 0) {
                    return j5;
                }
                long asBinder3 = (read2.asBinder(j3, j4) + RemoteActionCompatParcelizer2) - 1;
                j6 = Math.min(j6, read2.onTransact(asBinder3, j3) + read2.asInterface(asBinder3) + j5);
            }
        }
        return j6;
    }

    private static boolean read(Compatibility.Api18Impl api18Impl) {
        for (int i = 0; i < api18Impl.asBinder.size(); i++) {
            extractStateSet read2 = api18Impl.asBinder.get(i).onTransact.get(0).read();
            if (read2 == null || read2.RemoteActionCompatParcelizer()) {
                return true;
            }
        }
        return false;
    }

    private static boolean asBinder(Compatibility.Api18Impl api18Impl) {
        for (int i = 0; i < api18Impl.asBinder.size(); i++) {
            int i2 = api18Impl.asBinder.get(i).IconCompatParcelizer;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    static final class asInterface extends getLocaleManagerForApplication {
        private final setOnCancelListener.AudioAttributesImplApi26Parcelizer AudioAttributesCompatParcelizer;
        private final StateListDrawableCompat.StateListState AudioAttributesImplApi21Parcelizer;
        private final long AudioAttributesImplApi26Parcelizer;
        private final long AudioAttributesImplBaseParcelizer;
        private final setOnCancelListener IconCompatParcelizer;
        private final long onConnected;
        private final long onConnectionSuspended;
        private final long read;
        private final long setInternalConnectionCallback;
        private final int write;

        public final int RemoteActionCompatParcelizer() {
            return 1;
        }

        public asInterface(long j, long j2, long j3, int i, long j4, long j5, long j6, StateListDrawableCompat.StateListState stateListState, setOnCancelListener setoncancellistener, setOnCancelListener.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            StateListDrawableCompat.StateListState stateListState2 = stateListState;
            setOnCancelListener.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer2 = audioAttributesImplApi26Parcelizer;
            if (stateListState2.onTransact != (audioAttributesImplApi26Parcelizer2 != null) ? false : true) {
                this.AudioAttributesImplBaseParcelizer = j;
                this.onConnected = j2;
                this.read = j3;
                this.write = i;
                this.AudioAttributesImplApi26Parcelizer = j4;
                this.setInternalConnectionCallback = j5;
                this.onConnectionSuspended = j6;
                this.AudioAttributesImplApi21Parcelizer = stateListState2;
                this.IconCompatParcelizer = setoncancellistener;
                this.AudioAttributesCompatParcelizer = audioAttributesImplApi26Parcelizer2;
                return;
            }
            throw new IllegalStateException();
        }

        public final int read() {
            return this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.size();
        }

        public final int RemoteActionCompatParcelizer(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.write) >= 0 && intValue < this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.size()) {
                return intValue;
            }
            return -1;
        }

        private static boolean RemoteActionCompatParcelizer(StateListDrawableCompat.StateListState stateListState) {
            return stateListState.onTransact && stateListState.write != -9223372036854775807L && stateListState.read == -9223372036854775807L;
        }

        public final getLocaleManagerForApplication.RemoteActionCompatParcelizer read(int i, getLocaleManagerForApplication.RemoteActionCompatParcelizer remoteActionCompatParcelizer, boolean z) {
            int i2 = i;
            int size = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.size();
            if (i2 < 0 || i2 >= size) {
                throw new IndexOutOfBoundsException();
            }
            Integer num = null;
            String str = z ? this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.get(i2).RemoteActionCompatParcelizer : null;
            if (z) {
                num = Integer.valueOf(this.write + i2);
            }
            Integer num2 = num;
            long RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(i2);
            if (!(RemoteActionCompatParcelizer == -9223372036854775807L || RemoteActionCompatParcelizer == Long.MIN_VALUE)) {
                RemoteActionCompatParcelizer *= 1000;
            }
            long j = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.get(i2).asInterface - this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.get(0).asInterface;
            if (!(j == -9223372036854775807L || j == Long.MIN_VALUE)) {
                j *= 1000;
            }
            return remoteActionCompatParcelizer.asBinder(str, num2, 0, RemoteActionCompatParcelizer, j - this.AudioAttributesImplApi26Parcelizer, setVariablePadding.AudioAttributesImplApi26Parcelizer, false);
        }

        public final Object AudioAttributesImplApi21Parcelizer(int i) {
            int size = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.size();
            if (i >= 0 && i < size) {
                return Integer.valueOf(this.write + i);
            }
            throw new IndexOutOfBoundsException();
        }

        public final getLocaleManagerForApplication.read asInterface(int i, getLocaleManagerForApplication.read read2, long j) {
            long j2;
            extractStateSet read3;
            if (i < 0 || i > 0) {
                throw new IndexOutOfBoundsException();
            }
            long j3 = this.onConnectionSuspended;
            if (RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer)) {
                if (j > 0) {
                    j3 += j;
                    if (j3 > this.setInternalConnectionCallback) {
                        j2 = -9223372036854775807L;
                        Object obj = getLocaleManagerForApplication.read.MediaBrowserCompat$ItemReceiver;
                        setOnCancelListener setoncancellistener = this.IconCompatParcelizer;
                        StateListDrawableCompat.StateListState stateListState = this.AudioAttributesImplApi21Parcelizer;
                        return read2.asInterface(obj, setoncancellistener, stateListState, this.AudioAttributesImplBaseParcelizer, this.onConnected, this.read, true, RemoteActionCompatParcelizer(stateListState), this.AudioAttributesCompatParcelizer, j2, this.setInternalConnectionCallback, 0, this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.size() - 1, this.AudioAttributesImplApi26Parcelizer);
                    }
                }
                long j4 = this.AudioAttributesImplApi26Parcelizer + j3;
                long RemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(0);
                if (!(RemoteActionCompatParcelizer == -9223372036854775807L || RemoteActionCompatParcelizer == Long.MIN_VALUE)) {
                    RemoteActionCompatParcelizer *= 1000;
                }
                int i2 = 0;
                while (i2 < this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.size() - 1 && j4 >= RemoteActionCompatParcelizer) {
                    j4 -= RemoteActionCompatParcelizer;
                    i2++;
                    long RemoteActionCompatParcelizer2 = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(i2);
                    if (!(RemoteActionCompatParcelizer2 == -9223372036854775807L || RemoteActionCompatParcelizer2 == Long.MIN_VALUE)) {
                        RemoteActionCompatParcelizer2 *= 1000;
                    }
                    RemoteActionCompatParcelizer = RemoteActionCompatParcelizer2;
                }
                Compatibility.Api18Impl api18Impl = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.get(i2);
                int size = api18Impl.asBinder.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    } else if (api18Impl.asBinder.get(i3).IconCompatParcelizer == 2) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!(i3 == -1 || (read3 = api18Impl.asBinder.get(i3).onTransact.get(0).read()) == null || read3.read(RemoteActionCompatParcelizer) == 0)) {
                    j3 = (j3 + read3.asInterface(read3.read(j4, RemoteActionCompatParcelizer))) - j4;
                }
            }
            j2 = j3;
            Object obj2 = getLocaleManagerForApplication.read.MediaBrowserCompat$ItemReceiver;
            setOnCancelListener setoncancellistener2 = this.IconCompatParcelizer;
            StateListDrawableCompat.StateListState stateListState2 = this.AudioAttributesImplApi21Parcelizer;
            return read2.asInterface(obj2, setoncancellistener2, stateListState2, this.AudioAttributesImplBaseParcelizer, this.onConnected, this.read, true, RemoteActionCompatParcelizer(stateListState2), this.AudioAttributesCompatParcelizer, j2, this.setInternalConnectionCallback, 0, this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi21Parcelizer.size() - 1, this.AudioAttributesImplApi26Parcelizer);
        }
    }

    final class RemoteActionCompatParcelizer implements getStateSet.onTransact {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(DashMediaSource dashMediaSource, byte b) {
            this();
        }

        public final void asBinder() {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.onTransact.removeCallbacks(dashMediaSource.AudioAttributesCompatParcelizer);
            dashMediaSource.IconCompatParcelizer();
        }

        public final void asInterface(long j) {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j2 = dashMediaSource.read;
            if (j2 == -9223372036854775807L || j2 < j) {
                dashMediaSource.read = j;
            }
        }
    }

    final class read implements Loader.read<expandItemActionView<StateListDrawableCompat.StateListState>> {
        private read() {
        }

        /* synthetic */ read(DashMediaSource dashMediaSource, byte b) {
            this();
        }

        public final /* synthetic */ void onTransact(Loader.asInterface asinterface, long j, long j2) {
            DashMediaSource.this.RemoteActionCompatParcelizer((expandItemActionView) asinterface, j, j2);
        }

        public final /* synthetic */ void onTransact(Loader.asInterface asinterface, long j, long j2, boolean z) {
            DashMediaSource.this.asBinder((expandItemActionView<?>) (expandItemActionView) asinterface, j, j2);
        }

        public final /* synthetic */ Loader.RemoteActionCompatParcelizer read(Loader.asInterface asinterface, long j, long j2, IOException iOException, int i) {
            Loader.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
            expandItemActionView expanditemactionview = (expandItemActionView) asinterface;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            selectDrawable selectdrawable = new selectDrawable(expanditemactionview.asBinder, expanditemactionview.read, expanditemactionview.onTransact.RemoteActionCompatParcelizer, expanditemactionview.onTransact.onTransact, j, j2, expanditemactionview.onTransact.asInterface);
            long read = dashMediaSource.asBinder.read(new collapseItemActionView.asBinder(selectdrawable, new setHotspot(expanditemactionview.asInterface), iOException, i));
            boolean z = false;
            if (read == -9223372036854775807L) {
                remoteActionCompatParcelizer = Loader.onTransact;
            } else {
                remoteActionCompatParcelizer = new Loader.RemoteActionCompatParcelizer(0, read, (byte) 0);
            }
            int i2 = remoteActionCompatParcelizer.asInterface;
            if (i2 == 0 || i2 == 1) {
                z = true;
            }
            boolean z2 = !z;
            dashMediaSource.AudioAttributesImplApi21Parcelizer.asInterface(selectdrawable, expanditemactionview.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z2);
            if (z2) {
                collapseItemActionView collapseitemactionview = dashMediaSource.asBinder;
                long j3 = expanditemactionview.asBinder;
            }
            return remoteActionCompatParcelizer;
        }
    }

    final class asBinder implements Loader.read<expandItemActionView<Long>> {
        private asBinder() {
        }

        /* synthetic */ asBinder(DashMediaSource dashMediaSource, byte b) {
            this();
        }

        public final /* synthetic */ void onTransact(Loader.asInterface asinterface, long j, long j2) {
            DashMediaSource.this.asInterface((expandItemActionView<Long>) (expandItemActionView) asinterface, j, j2);
        }

        public final /* synthetic */ void onTransact(Loader.asInterface asinterface, long j, long j2, boolean z) {
            DashMediaSource.this.asBinder((expandItemActionView<?>) (expandItemActionView) asinterface, j, j2);
        }

        public final /* synthetic */ Loader.RemoteActionCompatParcelizer read(Loader.asInterface asinterface, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.RemoteActionCompatParcelizer((expandItemActionView) asinterface, j, j2, iOException);
        }
    }

    static final class AudioAttributesCompatParcelizer implements expandItemActionView.RemoteActionCompatParcelizer<Long> {
        private AudioAttributesCompatParcelizer() {
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        public final /* synthetic */ Object onTransact(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(OnBackPressedDispatcher.Api33Impl.onTransact(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static final class onTransact implements expandItemActionView.RemoteActionCompatParcelizer<Long> {
        private static final Pattern onTransact = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        onTransact() {
        }

        public final /* synthetic */ Object onTransact(Uri uri, InputStream inputStream) throws IOException {
            return RemoteActionCompatParcelizer(inputStream);
        }

        private static Long RemoteActionCompatParcelizer(InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, preload.AudioAttributesCompatParcelizer)).readLine();
            try {
                Matcher matcher = onTransact.matcher(readLine);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    long time = simpleDateFormat.parse(group).getTime();
                    if (!"Z".equals(matcher.group(2))) {
                        long j = "+".equals(matcher.group(4)) ? 1 : -1;
                        long parseLong = Long.parseLong(matcher.group(5));
                        String group2 = matcher.group(7);
                        time -= j * ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0 : Long.parseLong(group2))) * 60) * 1000);
                    }
                    return Long.valueOf(time);
                }
                StringBuilder sb = new StringBuilder("Couldn't parse timestamp: ");
                sb.append(readLine);
                throw new ParserException(sb.toString(), (Throwable) null, true, 4);
            } catch (ParseException e) {
                throw new ParserException((String) null, e, true, 4);
            }
        }
    }

    private static long asInterface(StateListDrawableCompat.StateListState stateListState, long j) {
        extractStateSet read2;
        StateListDrawableCompat.StateListState stateListState2 = stateListState;
        int size = stateListState2.AudioAttributesImplApi21Parcelizer.size() - 1;
        Compatibility.Api18Impl api18Impl = stateListState2.AudioAttributesImplApi21Parcelizer.get(size);
        long j2 = api18Impl.asInterface;
        if (!(j2 == -9223372036854775807L || j2 == Long.MIN_VALUE)) {
            j2 *= 1000;
        }
        long RemoteActionCompatParcelizer2 = stateListState2.RemoteActionCompatParcelizer(size);
        if (!(RemoteActionCompatParcelizer2 == -9223372036854775807L || RemoteActionCompatParcelizer2 == Long.MIN_VALUE)) {
            RemoteActionCompatParcelizer2 *= 1000;
        }
        long j3 = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
        long j4 = stateListState2.RemoteActionCompatParcelizer;
        if (!(j4 == -9223372036854775807L || j4 == Long.MIN_VALUE)) {
            j4 *= 1000;
        }
        long j5 = 5000000;
        for (int i = 0; i < api18Impl.asBinder.size(); i++) {
            List<ActionBarPolicy> list = api18Impl.asBinder.get(i).onTransact;
            if (!list.isEmpty() && (read2 = list.get(0).read()) != null) {
                long asInterface2 = ((j4 + j2) + read2.asInterface(RemoteActionCompatParcelizer2, j3)) - j3;
                if (asInterface2 < j5 - 100000 || (asInterface2 > j5 && asInterface2 < 100000 + j5)) {
                    j5 = asInterface2;
                }
            }
        }
        return maybeHandleDragEventViaPerformReceiveContent.onTransact(j5, RoundingMode.CEILING);
    }

    private void asBinder(long j, long j2) {
        long j3;
        long j4;
        long j5;
        float f;
        float f2;
        if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
            j3 = j;
        } else {
            j3 = j / 1000;
        }
        if (this.Cancellable.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer != -9223372036854775807L) {
            j4 = Math.min(j3, this.Cancellable.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer);
        } else {
            j4 = (this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer == null || this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.onTransact == -9223372036854775807L) ? j3 : Math.min(j3, this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.onTransact);
        }
        long j6 = j - j2;
        if (!(j6 == -9223372036854775807L || j6 == Long.MIN_VALUE)) {
            j6 /= 1000;
        }
        if (j6 < 0 && j4 > 0) {
            j6 = 0;
        }
        if (this.MediaBrowserCompat$MediaItem.asInterface != -9223372036854775807L) {
            j6 = Math.min(j6 + this.MediaBrowserCompat$MediaItem.asInterface, j3);
        }
        if (this.Cancellable.AudioAttributesImplApi26Parcelizer.write != -9223372036854775807L) {
            j6 = Math.max(j6, Math.min(this.Cancellable.AudioAttributesImplApi26Parcelizer.write, j3));
        } else if (!(this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer == null || this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.asBinder == -9223372036854775807L)) {
            j6 = Math.max(j6, Math.min(this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.asBinder, j3));
        }
        if (j6 > j4) {
            j4 = j6;
        }
        if (this.MediaDescriptionCompat.setInternalConnectionCallback != -9223372036854775807L) {
            j5 = this.MediaDescriptionCompat.setInternalConnectionCallback;
        } else if (this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer != null && this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.asInterface != -9223372036854775807L) {
            j5 = this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.asInterface;
        } else if (this.MediaBrowserCompat$MediaItem.AudioAttributesCompatParcelizer != -9223372036854775807L) {
            j5 = this.MediaBrowserCompat$MediaItem.AudioAttributesCompatParcelizer;
        } else {
            j5 = this.onConnected;
        }
        if (j5 < j6) {
            j5 = j6;
        }
        if (j5 > j4) {
            long min = j - Math.min(5000000, j2 / 2);
            if (!(min == -9223372036854775807L || min == Long.MIN_VALUE)) {
                min /= 1000;
            }
            j5 = Math.max(j6, Math.min(min, j4));
        }
        if (this.Cancellable.AudioAttributesImplApi26Parcelizer.onConnectionSuspended != -3.4028235E38f) {
            f = this.Cancellable.AudioAttributesImplApi26Parcelizer.onConnectionSuspended;
        } else {
            f = this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer != null ? this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.read : -3.4028235E38f;
        }
        if (this.Cancellable.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer != -3.4028235E38f) {
            f2 = this.Cancellable.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi21Parcelizer;
        } else {
            f2 = this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer != null ? this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer : -3.4028235E38f;
        }
        if (f == -3.4028235E38f && f2 == -3.4028235E38f && (this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer == null || this.MediaBrowserCompat$MediaItem.AudioAttributesImplApi26Parcelizer.asInterface == -9223372036854775807L)) {
            f = 1.0f;
            f2 = 1.0f;
        }
        setOnCancelListener.AudioAttributesImplApi26Parcelizer.asInterface asinterface = new setOnCancelListener.AudioAttributesImplApi26Parcelizer.asInterface();
        asinterface.RemoteActionCompatParcelizer = j5;
        asinterface.asInterface = j6;
        asinterface.onTransact = j4;
        asinterface.asBinder = f;
        asinterface.read = f2;
        this.MediaDescriptionCompat = new setOnCancelListener.AudioAttributesImplApi26Parcelizer(asinterface, (byte) 0);
    }

    public final void read(IOException iOException) {
        findMenuItemForSubmenu.onTransact("Failed to resolve time offset.", iOException);
        synchronized (findMenuItemForSubmenu.read) {
        }
        asInterface(true);
    }

    public final void onConnected() {
        this.AudioAttributesImplBaseParcelizer = onDismiss.asInterface();
        asInterface(true);
    }

    public final void setInternalConnectionCallback() throws IOException {
        this.MediaBrowserCompat$ItemReceiver.RemoteActionCompatParcelizer(Integer.MIN_VALUE);
        IOException iOException = this.MediaMetadataCompat;
        if (iOException != null) {
            throw iOException;
        }
    }
}
