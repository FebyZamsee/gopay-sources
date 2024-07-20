package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.core.location.LocationRequestCompat;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import o.AppCompatDelegateImpl;
import o.BaseMenuPresenter;
import o.DrawableContainerCompat;
import o.OnBackPressedDispatcher;
import o.SupportMenuInflater;
import o.addSubMenuItem;
import o.bindItemView;
import o.bypassDispatchKeyEvent;
import o.bypassOnContentChanged;
import o.collapseItemActionView;
import o.expandItemActionView;
import o.generateConfigDelta_locale;
import o.getConstantPadding;
import o.getConstantState;
import o.getCurrentIndex;
import o.getIntrinsicWidth;
import o.getLocaleManagerForApplication;
import o.getMenuView;
import o.getPadding;
import o.getPaint;
import o.getRealOwner;
import o.getShortcut;
import o.hasAddedItem;
import o.initialize;
import o.invalidateDrawable;
import o.selectDrawable;
import o.setExitFadeDuration;
import o.setExpandedFormat;
import o.setHotspot;
import o.setHotspotBounds;
import o.setMultiChoiceItems;
import o.setNegativeButtonIcon;
import o.setOnCancelListener;
import o.setTintMode;

public final class SsMediaSource extends getCurrentIndex implements Loader.read<expandItemActionView<addSubMenuItem>> {
    private final setOnCancelListener.write AudioAttributesCompatParcelizer;
    private final long AudioAttributesImplApi21Parcelizer;
    private setExpandedFormat AudioAttributesImplApi26Parcelizer;
    private Loader AudioAttributesImplBaseParcelizer;
    private final collapseItemActionView IconCompatParcelizer;
    private final Uri MediaBrowserCompat$CustomActionResultReceiver;
    private final ArrayList<getRealOwner> MediaBrowserCompat$ItemReceiver;
    private Handler MediaBrowserCompat$MediaItem;
    private final setOnCancelListener MediaBrowserCompat$SearchResultReceiver;
    private final expandItemActionView.RemoteActionCompatParcelizer<? extends addSubMenuItem> MediaDescriptionCompat;
    private final boolean MediaSessionCompat$ResultReceiverWrapper;
    private getMenuView RatingCompat;
    private final bypassOnContentChanged asBinder;
    private final setExpandedFormat.read onConnected;
    private long onConnectionFailed;
    private bindItemView onConnectionSuspended;
    private final invalidateDrawable onTransact;
    private final SupportMenuInflater.MenuState.read read;
    private final setTintMode.asInterface setInternalConnectionCallback;
    private addSubMenuItem write;

    /* synthetic */ SsMediaSource(setOnCancelListener setoncancellistener, addSubMenuItem addsubmenuitem, setExpandedFormat.read read2, expandItemActionView.RemoteActionCompatParcelizer remoteActionCompatParcelizer, SupportMenuInflater.MenuState.read read3, invalidateDrawable invalidatedrawable, bypassOnContentChanged bypassoncontentchanged, collapseItemActionView collapseitemactionview, long j, byte b) {
        this(setoncancellistener, addsubmenuitem, read2, remoteActionCompatParcelizer, read3, invalidatedrawable, bypassoncontentchanged, collapseitemactionview, j);
    }

    public final /* synthetic */ void onTransact(Loader.asInterface asinterface, long j, long j2) {
        expandItemActionView expanditemactionview = (expandItemActionView) asinterface;
        selectDrawable selectdrawable = new selectDrawable(expanditemactionview.asBinder, expanditemactionview.read, expanditemactionview.onTransact.RemoteActionCompatParcelizer, expanditemactionview.onTransact.onTransact, j, j2, expanditemactionview.onTransact.asInterface);
        long j3 = expanditemactionview.asBinder;
        this.setInternalConnectionCallback.onTransact(selectdrawable, expanditemactionview.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        this.write = (addSubMenuItem) expanditemactionview.RemoteActionCompatParcelizer;
        this.onConnectionFailed = j - j2;
        onConnectionSuspended();
        if (this.write.onTransact) {
            this.MediaBrowserCompat$MediaItem.postDelayed(new hasAddedItem(this), Math.max(0, (this.onConnectionFailed + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final /* synthetic */ void onTransact(Loader.asInterface asinterface, long j, long j2, boolean z) {
        expandItemActionView expanditemactionview = (expandItemActionView) asinterface;
        selectDrawable selectdrawable = new selectDrawable(expanditemactionview.asBinder, expanditemactionview.read, expanditemactionview.onTransact.RemoteActionCompatParcelizer, expanditemactionview.onTransact.onTransact, j, j2, expanditemactionview.onTransact.asInterface);
        long j3 = expanditemactionview.asBinder;
        this.setInternalConnectionCallback.asInterface(selectdrawable, expanditemactionview.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final /* synthetic */ Loader.RemoteActionCompatParcelizer read(Loader.asInterface asinterface, long j, long j2, IOException iOException, int i) {
        Loader.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        expandItemActionView expanditemactionview = (expandItemActionView) asinterface;
        selectDrawable selectdrawable = new selectDrawable(expanditemactionview.asBinder, expanditemactionview.read, expanditemactionview.onTransact.RemoteActionCompatParcelizer, expanditemactionview.onTransact.onTransact, j, j2, expanditemactionview.onTransact.asInterface);
        long read2 = this.IconCompatParcelizer.read(new collapseItemActionView.asBinder(selectdrawable, new setHotspot(expanditemactionview.asInterface), iOException, i));
        boolean z = false;
        if (read2 == -9223372036854775807L) {
            remoteActionCompatParcelizer = Loader.onTransact;
        } else {
            remoteActionCompatParcelizer = new Loader.RemoteActionCompatParcelizer(0, read2, (byte) 0);
        }
        int i2 = remoteActionCompatParcelizer.asInterface;
        if (i2 == 0 || i2 == 1) {
            z = true;
        }
        boolean z2 = !z;
        this.setInternalConnectionCallback.asInterface(selectdrawable, expanditemactionview.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, iOException, z2);
        if (z2) {
            long j3 = expanditemactionview.asBinder;
        }
        return remoteActionCompatParcelizer;
    }

    static {
        setNegativeButtonIcon.read("goog.exo.smoothstreaming");
    }

    public static final class Factory implements DrawableContainerCompat.AnonymousClass1 {
        private final setExpandedFormat.read AudioAttributesImplApi21Parcelizer;
        private final SupportMenuInflater.MenuState.read RemoteActionCompatParcelizer;
        private long asBinder;
        private invalidateDrawable asInterface;
        private bypassDispatchKeyEvent onTransact;
        private collapseItemActionView read;
        private expandItemActionView.RemoteActionCompatParcelizer<? extends addSubMenuItem> write;

        public final int[] r_() {
            return new int[]{1};
        }

        public Factory(setExpandedFormat.read read2) {
            this(new getShortcut.asBinder(read2), read2);
        }

        public Factory(SupportMenuInflater.MenuState.read read2, setExpandedFormat.read read3) {
            this.RemoteActionCompatParcelizer = read2;
            this.AudioAttributesImplApi21Parcelizer = read3;
            this.onTransact = new AppCompatDelegateImpl.Api24Impl();
            this.read = new BaseMenuPresenter();
            this.asBinder = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
            this.asInterface = new getPadding();
        }

        /* renamed from: asInterface */
        public final SsMediaSource read(setOnCancelListener setoncancellistener) {
            setOnCancelListener.write write2 = setoncancellistener.write;
            expandItemActionView.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write;
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = new SsManifestParser();
            }
            List<getIntrinsicWidth> list = setoncancellistener.write.asBinder;
            return new SsMediaSource(setoncancellistener, (addSubMenuItem) null, this.AudioAttributesImplApi21Parcelizer, !list.isEmpty() ? new getConstantState(remoteActionCompatParcelizer, list) : remoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, this.asInterface, this.onTransact.onTransact(setoncancellistener), this.read, this.asBinder, (byte) 0);
        }

        public final /* synthetic */ setHotspotBounds.asInterface onTransact(bypassDispatchKeyEvent bypassdispatchkeyevent) {
            if (bypassdispatchkeyevent != null) {
                this.onTransact = bypassdispatchkeyevent;
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

    private SsMediaSource(setOnCancelListener setoncancellistener, addSubMenuItem addsubmenuitem, setExpandedFormat.read read2, expandItemActionView.RemoteActionCompatParcelizer<? extends addSubMenuItem> remoteActionCompatParcelizer, SupportMenuInflater.MenuState.read read3, invalidateDrawable invalidatedrawable, bypassOnContentChanged bypassoncontentchanged, collapseItemActionView collapseitemactionview, long j) {
        Uri uri;
        boolean z = false;
        if (addsubmenuitem == null || !addsubmenuitem.onTransact) {
            this.MediaBrowserCompat$SearchResultReceiver = setoncancellistener;
            setOnCancelListener.write write2 = setoncancellistener.write;
            this.AudioAttributesCompatParcelizer = write2;
            this.write = addsubmenuitem;
            if (write2.AudioAttributesImplApi26Parcelizer.equals(Uri.EMPTY)) {
                uri = null;
            } else {
                uri = write2.AudioAttributesImplApi26Parcelizer;
                String path = uri.getPath();
                if (path != null) {
                    Matcher matcher = OnBackPressedDispatcher.Api33Impl.AudioAttributesImplApi26Parcelizer.matcher(path);
                    if (matcher.matches() && matcher.group(1) == null) {
                        uri = Uri.withAppendedPath(uri, "Manifest");
                    }
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = uri;
            this.onConnected = read2;
            this.MediaDescriptionCompat = remoteActionCompatParcelizer;
            this.read = read3;
            this.onTransact = invalidatedrawable;
            this.asBinder = bypassoncontentchanged;
            this.IconCompatParcelizer = collapseitemactionview;
            this.AudioAttributesImplApi21Parcelizer = j;
            this.setInternalConnectionCallback = new setTintMode.asInterface(this.asInterface.RemoteActionCompatParcelizer, 0, (setHotspotBounds.onTransact) null, 0);
            this.MediaSessionCompat$ResultReceiverWrapper = addsubmenuitem != null ? true : z;
            this.MediaBrowserCompat$ItemReceiver = new ArrayList<>();
            return;
        }
        throw new IllegalStateException();
    }

    public final setOnCancelListener AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final void onTransact(getMenuView getmenuview) {
        this.RatingCompat = getmenuview;
        this.asBinder.read();
        this.asBinder.onTransact(Looper.myLooper(), asBinder());
        if (this.MediaSessionCompat$ResultReceiverWrapper) {
            this.onConnectionSuspended = new bindItemView.read();
            onConnectionSuspended();
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = this.onConnected.s_();
        Loader loader = new Loader("SsMediaSource");
        this.AudioAttributesImplBaseParcelizer = loader;
        this.onConnectionSuspended = loader;
        this.MediaBrowserCompat$MediaItem = OnBackPressedDispatcher.Api33Impl.read();
        IconCompatParcelizer();
    }

    public final void AudioAttributesImplApi26Parcelizer() throws IOException {
        this.onConnectionSuspended.setInternalConnectionCallback();
    }

    public final void asBinder(setExitFadeDuration setexitfadeduration) {
        getRealOwner getrealowner = (getRealOwner) setexitfadeduration;
        for (getPaint<SupportMenuInflater.MenuState> RemoteActionCompatParcelizer : getrealowner.asBinder) {
            RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((getPaint.asBinder<SupportMenuInflater.MenuState>) null);
        }
        getrealowner.asInterface = null;
        this.MediaBrowserCompat$ItemReceiver.remove(setexitfadeduration);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        this.write = this.MediaSessionCompat$ResultReceiverWrapper ? this.write : null;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.onConnectionFailed = 0;
        Loader loader = this.AudioAttributesImplBaseParcelizer;
        if (loader != null) {
            loader.asBinder((Loader.onTransact) null);
            this.AudioAttributesImplBaseParcelizer = null;
        }
        Handler handler = this.MediaBrowserCompat$MediaItem;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
            this.MediaBrowserCompat$MediaItem = null;
        }
        this.asBinder.RemoteActionCompatParcelizer();
    }

    private void onConnectionSuspended() {
        getConstantPadding getconstantpadding;
        for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver.size(); i++) {
            getRealOwner getrealowner = this.MediaBrowserCompat$ItemReceiver.get(i);
            addSubMenuItem addsubmenuitem = this.write;
            getrealowner.read = addsubmenuitem;
            for (getPaint<SupportMenuInflater.MenuState> getpaint : getrealowner.asBinder) {
                ((SupportMenuInflater.MenuState) getpaint.read).RemoteActionCompatParcelizer(addsubmenuitem);
            }
            getrealowner.asInterface.read(getrealowner);
        }
        long j = Long.MAX_VALUE;
        long j2 = Long.MIN_VALUE;
        for (addSubMenuItem.RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.write.asInterface) {
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer > 0) {
                j = Math.min(j, remoteActionCompatParcelizer.read[0]);
                j2 = Math.max(j2, remoteActionCompatParcelizer.read[remoteActionCompatParcelizer.RemoteActionCompatParcelizer - 1] + remoteActionCompatParcelizer.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer - 1));
            }
        }
        if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
            getconstantpadding = new getConstantPadding(this.write.onTransact ? -9223372036854775807L : 0, 0, 0, 0, true, this.write.onTransact, this.write.onTransact, this.write, this.MediaBrowserCompat$SearchResultReceiver);
        } else if (this.write.onTransact) {
            if (this.write.RemoteActionCompatParcelizer != -9223372036854775807L && this.write.RemoteActionCompatParcelizer > 0) {
                j = Math.max(j, j2 - this.write.RemoteActionCompatParcelizer);
            }
            long j3 = j;
            long j4 = j2 - j3;
            long j5 = this.AudioAttributesImplApi21Parcelizer;
            if (!(j5 == -9223372036854775807L || j5 == Long.MIN_VALUE)) {
                j5 *= 1000;
            }
            long j6 = j4 - j5;
            if (j6 < 5000000) {
                j6 = Math.min(5000000, j4 / 2);
            }
            getconstantpadding = new getConstantPadding(-9223372036854775807L, j4, j3, j6, true, true, true, this.write, this.MediaBrowserCompat$SearchResultReceiver);
        } else {
            long j7 = this.write.asBinder != -9223372036854775807L ? this.write.asBinder : j2 - j;
            getconstantpadding = new getConstantPadding(j + j7, j7, j, 0, true, false, false, this.write, this.MediaBrowserCompat$SearchResultReceiver);
        }
        asInterface((getLocaleManagerForApplication) getconstantpadding);
    }

    public final void IconCompatParcelizer() {
        if (!(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer != null)) {
            expandItemActionView expanditemactionview = new expandItemActionView(this.AudioAttributesImplApi26Parcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, 4, this.MediaDescriptionCompat);
            this.setInternalConnectionCallback.read(new selectDrawable(expanditemactionview.asBinder, expanditemactionview.read, this.AudioAttributesImplBaseParcelizer.onTransact(expanditemactionview, this, this.IconCompatParcelizer.asBinder(expanditemactionview.asInterface))), expanditemactionview.asInterface, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public final setExitFadeDuration asInterface(setHotspotBounds.onTransact ontransact, initialize initialize, long j) {
        setTintMode.asInterface asinterface = new setTintMode.asInterface(this.asInterface.RemoteActionCompatParcelizer, 0, ontransact, 0);
        getRealOwner getrealowner = new getRealOwner(this.write, this.read, this.RatingCompat, this.onTransact, this.asBinder, new generateConfigDelta_locale.asBinder(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, 0, ontransact), this.IconCompatParcelizer, asinterface, this.onConnectionSuspended, initialize);
        this.MediaBrowserCompat$ItemReceiver.add(getrealowner);
        return getrealowner;
    }
}
