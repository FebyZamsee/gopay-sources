package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.DrawerArrowDrawable;
import o.OnBackPressedDispatcher;
import o.getArrowHeadLength;
import o.getBarLength;
import o.getHotspotBounds;
import o.getLocaleManagerForApplication;
import o.getMenuView;
import o.lerp;
import o.selectDrawable;
import o.setAlpha;
import o.setDrawable;
import o.setExitFadeDuration;
import o.setHotspotBounds;
import o.setMultiChoiceItems;
import o.setOnCancelListener;
import o.setState;
import o.setTintMode;
import o.setVariablePadding;
import o.showsIcon;

public final class AdsMediaSource extends getHotspotBounds<setHotspotBounds.onTransact> {
    private static final setHotspotBounds.onTransact read = new setHotspotBounds.onTransact(new Object());
    private final setHotspotBounds.asInterface AudioAttributesCompatParcelizer;
    private final showsIcon AudioAttributesImplApi21Parcelizer;
    private setVariablePadding AudioAttributesImplApi26Parcelizer;
    private final setHotspotBounds AudioAttributesImplBaseParcelizer;
    private final setState IconCompatParcelizer;
    final Handler asBinder = new Handler(Looper.getMainLooper());
    private final Object onConnected;
    private read onConnectionFailed;
    private getLocaleManagerForApplication.RemoteActionCompatParcelizer onConnectionSuspended = new getLocaleManagerForApplication.RemoteActionCompatParcelizer();
    public final setState onTransact;
    private getLocaleManagerForApplication setInternalConnectionCallback;
    private onTransact[][] write = new onTransact[0][];

    public final /* bridge */ /* synthetic */ setHotspotBounds.onTransact read(Object obj, setHotspotBounds.onTransact ontransact) {
        setHotspotBounds.onTransact ontransact2 = (setHotspotBounds.onTransact) obj;
        return !(ontransact2.asInterface != -1) ? ontransact : ontransact2;
    }

    public final /* synthetic */ void read(Object obj, setHotspotBounds sethotspotbounds, getLocaleManagerForApplication getlocalemanagerforapplication) {
        long j;
        long j2;
        getLocaleManagerForApplication getlocalemanagerforapplication2;
        getLocaleManagerForApplication getlocalemanagerforapplication3 = getlocalemanagerforapplication;
        setHotspotBounds.onTransact ontransact = (setHotspotBounds.onTransact) obj;
        int i = -1;
        boolean z = true;
        int i2 = 0;
        if (ontransact.asInterface != -1) {
            onTransact ontransact2 = this.write[ontransact.asInterface][ontransact.read];
            if (getlocalemanagerforapplication.read() == 1) {
                if (ontransact2.IconCompatParcelizer == null) {
                    Object AudioAttributesImplApi21Parcelizer2 = getlocalemanagerforapplication3.AudioAttributesImplApi21Parcelizer(0);
                    for (int i3 = 0; i3 < ontransact2.onTransact.size(); i3++) {
                        setAlpha setalpha = ontransact2.onTransact.get(i3);
                        setalpha.onTransact(new setHotspotBounds.onTransact(AudioAttributesImplApi21Parcelizer2, setalpha.asBinder.asBinder));
                    }
                }
                ontransact2.IconCompatParcelizer = getlocalemanagerforapplication3;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            if (getlocalemanagerforapplication.read() == 1) {
                this.setInternalConnectionCallback = getlocalemanagerforapplication3;
            } else {
                throw new IllegalArgumentException();
            }
        }
        getLocaleManagerForApplication getlocalemanagerforapplication4 = this.setInternalConnectionCallback;
        setVariablePadding setvariablepadding = this.AudioAttributesImplApi26Parcelizer;
        if (setvariablepadding != null && getlocalemanagerforapplication4 != null) {
            if (setvariablepadding.AudioAttributesCompatParcelizer == 0) {
                asInterface(getlocalemanagerforapplication4);
                return;
            }
            setVariablePadding setvariablepadding2 = this.AudioAttributesImplApi26Parcelizer;
            long[][] jArr = new long[this.write.length][];
            int i4 = 0;
            while (true) {
                onTransact[][] ontransactArr = this.write;
                j = -9223372036854775807L;
                if (i4 >= ontransactArr.length) {
                    break;
                }
                jArr[i4] = new long[ontransactArr[i4].length];
                int i5 = 0;
                while (true) {
                    onTransact[] ontransactArr2 = this.write[i4];
                    if (i5 >= ontransactArr2.length) {
                        break;
                    }
                    onTransact ontransact3 = ontransactArr2[i5];
                    long[] jArr2 = jArr[i4];
                    if (ontransact3 == null || (getlocalemanagerforapplication2 = ontransact3.IconCompatParcelizer) == null) {
                        j2 = -9223372036854775807L;
                    } else {
                        j2 = getlocalemanagerforapplication2.read(0, AdsMediaSource.this.onConnectionSuspended, false).write;
                    }
                    jArr2[i5] = j2;
                    i5++;
                }
                i4++;
            }
            if (setvariablepadding2.onConnected != 0) {
                z = false;
            }
            if (z) {
                setVariablePadding.onTransact[] ontransactArr3 = setvariablepadding2.write;
                setVariablePadding.onTransact[] ontransactArr4 = (setVariablePadding.onTransact[]) OnBackPressedDispatcher.Api33Impl.asInterface((T[]) ontransactArr3, ontransactArr3.length);
                while (i2 < setvariablepadding2.AudioAttributesCompatParcelizer) {
                    setVariablePadding.onTransact ontransact4 = ontransactArr4[i2];
                    long[] jArr3 = jArr[i2];
                    int length = jArr3.length;
                    Uri[] uriArr = ontransact4.MediaBrowserCompat$ItemReceiver;
                    if (length < uriArr.length) {
                        int length2 = uriArr.length;
                        int length3 = jArr3.length;
                        int max = Math.max(length2, length3);
                        jArr3 = Arrays.copyOf(jArr3, max);
                        Arrays.fill(jArr3, length3, max, j);
                    } else if (ontransact4.onConnectionSuspended != i && jArr3.length > uriArr.length) {
                        jArr3 = Arrays.copyOf(jArr3, uriArr.length);
                    }
                    ontransactArr4[i2] = new setVariablePadding.onTransact(ontransact4.MediaDescriptionCompat, ontransact4.onConnectionSuspended, ontransact4.onConnected, ontransact4.AudioAttributesImplBaseParcelizer, ontransact4.MediaBrowserCompat$ItemReceiver, jArr3, ontransact4.AudioAttributesImplApi21Parcelizer, ontransact4.onConnectionFailed);
                    i2++;
                    i = -1;
                    j = -9223372036854775807L;
                }
                this.AudioAttributesImplApi26Parcelizer = new setVariablePadding(setvariablepadding2.AudioAttributesImplBaseParcelizer, ontransactArr4, setvariablepadding2.IconCompatParcelizer, setvariablepadding2.setInternalConnectionCallback, setvariablepadding2.onConnected);
                asInterface((getLocaleManagerForApplication) new getBarLength(getlocalemanagerforapplication4, this.AudioAttributesImplApi26Parcelizer));
                return;
            }
            throw new IllegalStateException();
        }
    }

    public static final class AdLoadException extends IOException {
        private int RemoteActionCompatParcelizer = 0;

        AdLoadException(Exception exc) {
            super(exc);
        }
    }

    public AdsMediaSource(setHotspotBounds sethotspotbounds, showsIcon showsicon, Object obj, setHotspotBounds.asInterface asinterface, setState setstate, setState setstate2) {
        this.AudioAttributesImplBaseParcelizer = sethotspotbounds;
        this.AudioAttributesCompatParcelizer = asinterface;
        this.onTransact = setstate;
        this.IconCompatParcelizer = setstate2;
        this.AudioAttributesImplApi21Parcelizer = showsicon;
        this.onConnected = obj;
        asinterface.r_();
    }

    public final setOnCancelListener AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
    }

    public final void onTransact(getMenuView getmenuview) {
        super.onTransact(getmenuview);
        read read2 = new read();
        this.onConnectionFailed = read2;
        RemoteActionCompatParcelizer(read, this.AudioAttributesImplBaseParcelizer);
        this.asBinder.post(new setDrawable(this, read2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e5, code lost:
        r8 = r8 + 1;
        r7 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.setExitFadeDuration asInterface(o.setHotspotBounds.onTransact r17, o.initialize r18, long r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            o.setVariablePadding r5 = r0.AudioAttributesImplApi26Parcelizer
            o.setVariablePadding r5 = (o.setVariablePadding) r5
            int r5 = r5.AudioAttributesCompatParcelizer
            r7 = 0
            if (r5 <= 0) goto L_0x012b
            int r5 = r1.asInterface
            r8 = -1
            if (r5 == r8) goto L_0x0018
            r5 = 1
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            if (r5 == 0) goto L_0x012b
            int r5 = r1.asInterface
            int r8 = r1.read
            com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact[][] r9 = r0.write
            r10 = r9[r5]
            int r11 = r10.length
            if (r11 > r8) goto L_0x0030
            int r11 = r8 + 1
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact[] r10 = (com.google.android.exoplayer2.source.ads.AdsMediaSource.onTransact[]) r10
            r9[r5] = r10
        L_0x0030:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact[][] r9 = r0.write
            r9 = r9[r5]
            r9 = r9[r8]
            if (r9 != 0) goto L_0x00ea
            com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact r9 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact
            r9.<init>(r1)
            com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact[][] r10 = r0.write
            r5 = r10[r5]
            r5[r8] = r9
            o.setVariablePadding r5 = r0.AudioAttributesImplApi26Parcelizer
            if (r5 == 0) goto L_0x00ea
            r8 = 0
        L_0x0048:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact[][] r10 = r0.write
            int r10 = r10.length
            if (r8 >= r10) goto L_0x00ea
            r10 = 0
        L_0x004e:
            com.google.android.exoplayer2.source.ads.AdsMediaSource$onTransact[][] r11 = r0.write
            r11 = r11[r8]
            int r12 = r11.length
            if (r10 >= r12) goto L_0x00e5
            r11 = r11[r10]
            int r12 = r5.onConnected
            if (r8 >= r12) goto L_0x005e
            o.setVariablePadding$onTransact r12 = o.setVariablePadding.AudioAttributesImplApi21Parcelizer
            goto L_0x0064
        L_0x005e:
            o.setVariablePadding$onTransact[] r13 = r5.write
            int r12 = r8 - r12
            r12 = r13[r12]
        L_0x0064:
            if (r11 == 0) goto L_0x00e0
            o.setHotspotBounds r13 = r11.asBinder
            if (r13 == 0) goto L_0x006c
            r13 = 1
            goto L_0x006d
        L_0x006c:
            r13 = 0
        L_0x006d:
            if (r13 != 0) goto L_0x00e0
            android.net.Uri[] r13 = r12.MediaBrowserCompat$ItemReceiver
            int r13 = r13.length
            if (r10 >= r13) goto L_0x00e0
            android.net.Uri[] r12 = r12.MediaBrowserCompat$ItemReceiver
            r12 = r12[r10]
            if (r12 == 0) goto L_0x00e0
            o.setOnCancelListener$RemoteActionCompatParcelizer r13 = new o.setOnCancelListener$RemoteActionCompatParcelizer
            r13.<init>()
            r13.AudioAttributesImplApi26Parcelizer = r12
            o.setHotspotBounds r14 = r0.AudioAttributesImplBaseParcelizer
            o.setOnCancelListener r14 = r14.AudioAttributesCompatParcelizer()
            o.setOnCancelListener$write r14 = r14.write
            if (r14 == 0) goto L_0x009c
            o.setOnCancelListener$asInterface r14 = r14.RemoteActionCompatParcelizer
            if (r14 == 0) goto L_0x0095
            o.setOnCancelListener$asInterface$asBinder r15 = new o.setOnCancelListener$asInterface$asBinder
            r15.<init>(r14, r7)
            goto L_0x009a
        L_0x0095:
            o.setOnCancelListener$asInterface$asBinder r15 = new o.setOnCancelListener$asInterface$asBinder
            r15.<init>((byte) r7)
        L_0x009a:
            r13.read = r15
        L_0x009c:
            o.setHotspotBounds$asInterface r14 = r0.AudioAttributesCompatParcelizer
            o.setOnCancelListener r13 = r13.onTransact()
            o.setHotspotBounds r13 = r14.read(r13)
            r11.asBinder = r13
            r11.RemoteActionCompatParcelizer = r12
            r14 = 0
        L_0x00ab:
            java.util.List<o.setAlpha> r15 = r11.onTransact
            int r15 = r15.size()
            if (r14 >= r15) goto L_0x00d9
            java.util.List<o.setAlpha> r15 = r11.onTransact
            java.lang.Object r15 = r15.get(r14)
            o.setAlpha r15 = (o.setAlpha) r15
            o.setHotspotBounds r6 = r15.read
            if (r6 != 0) goto L_0x00c1
            r6 = 1
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            if (r6 == 0) goto L_0x00d3
            r15.read = r13
            com.google.android.exoplayer2.source.ads.AdsMediaSource$RemoteActionCompatParcelizer r6 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$RemoteActionCompatParcelizer
            com.google.android.exoplayer2.source.ads.AdsMediaSource r7 = com.google.android.exoplayer2.source.ads.AdsMediaSource.this
            r6.<init>(r12)
            r15.asInterface = r6
            int r14 = r14 + 1
            r7 = 0
            goto L_0x00ab
        L_0x00d3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00d9:
            com.google.android.exoplayer2.source.ads.AdsMediaSource r6 = com.google.android.exoplayer2.source.ads.AdsMediaSource.this
            o.setHotspotBounds$onTransact r7 = r11.read
            r6.RemoteActionCompatParcelizer(r7, r13)
        L_0x00e0:
            int r10 = r10 + 1
            r7 = 0
            goto L_0x004e
        L_0x00e5:
            int r8 = r8 + 1
            r7 = 0
            goto L_0x0048
        L_0x00ea:
            o.setAlpha r5 = new o.setAlpha
            r5.<init>(r1, r2, r3)
            java.util.List<o.setAlpha> r2 = r9.onTransact
            r2.add(r5)
            o.setHotspotBounds r2 = r9.asBinder
            if (r2 == 0) goto L_0x0117
            o.setHotspotBounds r3 = r5.read
            if (r3 != 0) goto L_0x00fe
            r6 = 1
            goto L_0x00ff
        L_0x00fe:
            r6 = 0
        L_0x00ff:
            if (r6 == 0) goto L_0x0111
            r5.read = r2
            com.google.android.exoplayer2.source.ads.AdsMediaSource$RemoteActionCompatParcelizer r2 = new com.google.android.exoplayer2.source.ads.AdsMediaSource$RemoteActionCompatParcelizer
            com.google.android.exoplayer2.source.ads.AdsMediaSource r3 = com.google.android.exoplayer2.source.ads.AdsMediaSource.this
            android.net.Uri r4 = r9.RemoteActionCompatParcelizer
            android.net.Uri r4 = (android.net.Uri) r4
            r2.<init>(r4)
            r5.asInterface = r2
            goto L_0x0117
        L_0x0111:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0117:
            o.getLocaleManagerForApplication r2 = r9.IconCompatParcelizer
            if (r2 == 0) goto L_0x012a
            r6 = 0
            java.lang.Object r2 = r2.AudioAttributesImplApi21Parcelizer(r6)
            o.setHotspotBounds$onTransact r3 = new o.setHotspotBounds$onTransact
            long r6 = r1.asBinder
            r3.<init>(r2, r6)
            r5.onTransact((o.setHotspotBounds.onTransact) r3)
        L_0x012a:
            return r5
        L_0x012b:
            r6 = 0
            o.setAlpha r5 = new o.setAlpha
            r5.<init>(r1, r2, r3)
            o.setHotspotBounds r2 = r0.AudioAttributesImplBaseParcelizer
            o.setHotspotBounds r3 = r5.read
            if (r3 != 0) goto L_0x0138
            r6 = 1
        L_0x0138:
            if (r6 == 0) goto L_0x0140
            r5.read = r2
            r5.onTransact((o.setHotspotBounds.onTransact) r1)
            return r5
        L_0x0140:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.ads.AdsMediaSource.asInterface(o.setHotspotBounds$onTransact, o.initialize, long):o.setExitFadeDuration");
    }

    public final void asBinder(setExitFadeDuration setexitfadeduration) {
        setAlpha setalpha = (setAlpha) setexitfadeduration;
        setHotspotBounds.onTransact ontransact = setalpha.asBinder;
        boolean z = true;
        if (ontransact.asInterface != -1) {
            onTransact ontransact2 = this.write[ontransact.asInterface][ontransact.read];
            ontransact2.onTransact.remove(setalpha);
            if (setalpha.onTransact != null) {
                setalpha.read.asBinder(setalpha.onTransact);
            }
            if (ontransact2.onTransact.isEmpty()) {
                if (ontransact2.asBinder == null) {
                    z = false;
                }
                if (z) {
                    AdsMediaSource.this.onTransact(ontransact2.read);
                }
                this.write[ontransact.asInterface][ontransact.read] = null;
            }
        } else if (setalpha.onTransact != null) {
            setalpha.read.asBinder(setalpha.onTransact);
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        super.AudioAttributesImplApi21Parcelizer();
        read read2 = this.onConnectionFailed;
        this.onConnectionFailed = null;
        read2.onTransact = true;
        read2.RemoteActionCompatParcelizer.removeCallbacksAndMessages((Object) null);
        this.setInternalConnectionCallback = null;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.write = new onTransact[0][];
        this.asBinder.post(new lerp(this, read2));
    }

    public final class read {
        final Handler RemoteActionCompatParcelizer = OnBackPressedDispatcher.Api33Impl.read();
        volatile boolean onTransact;

        public read() {
        }
    }

    public final class RemoteActionCompatParcelizer implements setAlpha.asInterface {
        private final Uri RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(Uri uri) {
            this.RemoteActionCompatParcelizer = uri;
        }

        public final void read(setHotspotBounds.onTransact ontransact) {
            AdsMediaSource.this.asBinder.post(new DrawerArrowDrawable(this, ontransact));
        }

        public final void asBinder(setHotspotBounds.onTransact ontransact, IOException iOException) {
            IOException iOException2 = iOException;
            setTintMode.asInterface asinterface = new setTintMode.asInterface(AdsMediaSource.this.asInterface.RemoteActionCompatParcelizer, 0, ontransact, 0);
            asinterface.asInterface(new selectDrawable(selectDrawable.read.getAndIncrement(), new showsIcon(this.RemoteActionCompatParcelizer), SystemClock.elapsedRealtime()), 6, -1, (setMultiChoiceItems) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L, new AdLoadException(iOException2), true);
            AdsMediaSource.this.asBinder.post(new getArrowHeadLength(this, ontransact, iOException2));
        }
    }

    final class onTransact {
        getLocaleManagerForApplication IconCompatParcelizer;
        Uri RemoteActionCompatParcelizer;
        setHotspotBounds asBinder;
        final List<setAlpha> onTransact = new ArrayList();
        final setHotspotBounds.onTransact read;

        public onTransact(setHotspotBounds.onTransact ontransact) {
            this.read = ontransact;
        }
    }
}
