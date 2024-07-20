package com.google.android.exoplayer2.source.hls.playlist;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.SupportActionModeWrapper;
import o.SupportMenuInflater;
import o.expandItemActionView;
import o.isPowerSaveMode;
import o.onItemSelected;
import o.parseMenu;
import o.preload;
import o.setOnBackInvokedDispatcher;

public final class HlsPlaylistParser implements expandItemActionView.RemoteActionCompatParcelizer<parseMenu> {
    private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern AudioAttributesImplApi21Parcelizer;
    private static final Pattern AudioAttributesImplApi26Parcelizer = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern AudioAttributesImplBaseParcelizer = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern Cancellable = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern ComponentActivity = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern IconCompatParcelizer = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern MediaBrowserCompat$CustomActionResultReceiver = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern MediaBrowserCompat$ItemReceiver;
    private static final Pattern MediaBrowserCompat$MediaItem;
    private static final Pattern MediaBrowserCompat$SearchResultReceiver;
    private static final Pattern MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern MediaDescriptionCompat = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern MediaMetadataCompat = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern MediaSessionCompat$QueueItem = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern MediaSessionCompat$ResultReceiverWrapper;
    private static final Pattern MediaSessionCompat$Token = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern ParcelableVolumeInfo = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern PlaybackStateCompat = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern PlaybackStateCompat$CustomAction = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern RatingCompat = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern RemoteActionCompatParcelizer = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern access$001 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern addContentView = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern addMenuProvider = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern addOnConfigurationChangedListener = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern addOnContextAvailableListener;
    private static final Pattern addOnMultiWindowModeChangedListener = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern addOnNewIntentListener = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern addOnPictureInPictureModeChangedListener = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern addOnTrimMemoryListener = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern asBinder = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern asInterface;
    private static final Pattern cancel = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern createFullyDrawnExecutor = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern ensureViewModelStore = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern getActivityResultRegistry = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern getDefaultViewModelCreationExtras = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern getDefaultViewModelProviderFactory = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern getFullyDrawnReporter = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern getLastCustomNonConfigurationInstance = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern getLifecycle = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern getOnBackPressedDispatcher = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern getViewModelStore = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern initViewTreeOwners = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern onConnected = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern onConnectionFailed;
    private static final Pattern onConnectionSuspended = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern onTransact = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern read = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern setInternalConnectionCallback = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern write = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private final SupportActionModeWrapper.CallbackWrapper invalidateMenu;

    /* renamed from: lambda$new$0$androidx-activity-ComponentActivity  reason: not valid java name */
    private final SupportMenuInflater f6lambda$new$0$androidxactivityComponentActivity;

    public static final class DeltaUpdateException extends IOException {
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("CAN-SKIP-DATERANGES");
        sb.append("=(NO|YES)");
        onConnectionFailed = Pattern.compile(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CAN-BLOCK-RELOAD");
        sb2.append("=(NO|YES)");
        AudioAttributesImplApi21Parcelizer = Pattern.compile(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("AUTOSELECT");
        sb3.append("=(NO|YES)");
        asInterface = Pattern.compile(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("DEFAULT");
        sb4.append("=(NO|YES)");
        MediaBrowserCompat$ItemReceiver = Pattern.compile(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("FORCED");
        sb5.append("=(NO|YES)");
        MediaBrowserCompat$MediaItem = Pattern.compile(sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append("INDEPENDENT");
        sb6.append("=(NO|YES)");
        MediaSessionCompat$ResultReceiverWrapper = Pattern.compile(sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append("GAP");
        sb7.append("=(NO|YES)");
        MediaBrowserCompat$SearchResultReceiver = Pattern.compile(sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append("PRECISE");
        sb8.append("=(NO|YES)");
        addOnContextAvailableListener = Pattern.compile(sb8.toString());
    }

    public HlsPlaylistParser() {
        this(SupportMenuInflater.onTransact, (SupportActionModeWrapper.CallbackWrapper) null);
    }

    public HlsPlaylistParser(SupportMenuInflater supportMenuInflater, SupportActionModeWrapper.CallbackWrapper callbackWrapper) {
        this.f6lambda$new$0$androidxactivityComponentActivity = supportMenuInflater;
        this.invalidateMenu = callbackWrapper;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060 A[Catch:{ all -> 0x0bec }, LOOP:1: B:24:0x0060->B:444:0x0060, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x0bdd  */
    /* renamed from: RemoteActionCompatParcelizer */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o.parseMenu onTransact(android.net.Uri r116, java.io.InputStream r117) throws java.io.IOException {
        /*
            r115 = this;
            r1 = r115
            java.lang.String r0 = "identity"
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            java.io.BufferedReader r3 = new java.io.BufferedReader
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r5 = r117
            r4.<init>(r5)
            r3.<init>(r4)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            int r5 = r3.read()     // Catch:{ all -> 0x0bec }
            r6 = 239(0xef, float:3.35E-43)
            r7 = 0
            r8 = 1
            if (r5 != r6) goto L_0x0038
            int r5 = r3.read()     // Catch:{ all -> 0x0bec }
            r6 = 187(0xbb, float:2.62E-43)
            if (r5 != r6) goto L_0x0036
            int r5 = r3.read()     // Catch:{ all -> 0x0bec }
            r6 = 191(0xbf, float:2.68E-43)
            if (r5 != r6) goto L_0x0036
            int r5 = r3.read()     // Catch:{ all -> 0x0bec }
            goto L_0x0038
        L_0x0036:
            r5 = 0
            goto L_0x005e
        L_0x0038:
            int r5 = onTransact(r3, r8, r5)     // Catch:{ all -> 0x0bec }
            r6 = 0
        L_0x003d:
            r9 = 7
            if (r6 >= r9) goto L_0x0050
            java.lang.String r9 = "#EXTM3U"
            char r9 = r9.charAt(r6)     // Catch:{ all -> 0x0bec }
            if (r5 == r9) goto L_0x0049
            goto L_0x0036
        L_0x0049:
            int r5 = r3.read()     // Catch:{ all -> 0x0bec }
            int r6 = r6 + 1
            goto L_0x003d
        L_0x0050:
            int r5 = onTransact(r3, r7, r5)     // Catch:{ all -> 0x0bec }
            r6 = 10
            if (r5 == r6) goto L_0x005d
            r6 = 13
            if (r5 == r6) goto L_0x005d
            goto L_0x0036
        L_0x005d:
            r5 = 1
        L_0x005e:
            if (r5 == 0) goto L_0x0bdd
        L_0x0060:
            java.lang.String r5 = r3.readLine()     // Catch:{ all -> 0x0bec }
            if (r5 == 0) goto L_0x0bcd
            java.lang.String r5 = r5.trim()     // Catch:{ all -> 0x0bec }
            boolean r10 = r5.isEmpty()     // Catch:{ all -> 0x0bec }
            if (r10 == 0) goto L_0x0071
            goto L_0x0060
        L_0x0071:
            java.lang.String r10 = "#EXT-X-STREAM-INF"
            boolean r10 = r5.startsWith(r10)     // Catch:{ all -> 0x0bec }
            if (r10 == 0) goto L_0x008d
            r4.add(r5)     // Catch:{ all -> 0x0bec }
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$RemoteActionCompatParcelizer r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$RemoteActionCompatParcelizer     // Catch:{ all -> 0x0bec }
            r0.<init>(r4, r3)     // Catch:{ all -> 0x0bec }
            java.lang.String r2 = r116.toString()     // Catch:{ all -> 0x0bec }
            o.SupportMenuInflater r0 = onTransact((com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.RemoteActionCompatParcelizer) r0, (java.lang.String) r2)     // Catch:{ all -> 0x0bec }
            r3.close()     // Catch:{ IOException -> 0x008c }
        L_0x008c:
            return r0
        L_0x008d:
            boolean r10 = r5.startsWith(r2)     // Catch:{ all -> 0x0bec }
            java.lang.String r11 = "#EXT-X-ENDLIST"
            java.lang.String r12 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            java.lang.String r13 = "#EXT-X-DISCONTINUITY"
            java.lang.String r14 = "#EXT-X-BYTERANGE"
            java.lang.String r15 = "#EXT-X-KEY"
            java.lang.String r6 = "#EXTINF"
            java.lang.String r7 = "#EXT-X-MEDIA-SEQUENCE"
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r5.startsWith(r7)     // Catch:{ all -> 0x0bec }
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r5.startsWith(r6)     // Catch:{ all -> 0x0bec }
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r5.startsWith(r15)     // Catch:{ all -> 0x0bec }
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r5.startsWith(r14)     // Catch:{ all -> 0x0bec }
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r5.equals(r13)     // Catch:{ all -> 0x0bec }
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r5.equals(r12)     // Catch:{ all -> 0x0bec }
            if (r10 != 0) goto L_0x00d1
            boolean r10 = r5.equals(r11)     // Catch:{ all -> 0x0bec }
            if (r10 == 0) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            r4.add(r5)     // Catch:{ all -> 0x0bec }
            r7 = 0
            goto L_0x0060
        L_0x00d1:
            r4.add(r5)     // Catch:{ all -> 0x0bec }
            o.SupportMenuInflater r5 = r1.f6lambda$new$0$androidxactivityComponentActivity     // Catch:{ all -> 0x0bec }
            o.SupportActionModeWrapper$CallbackWrapper r10 = r1.invalidateMenu     // Catch:{ all -> 0x0bec }
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$RemoteActionCompatParcelizer r8 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$RemoteActionCompatParcelizer     // Catch:{ all -> 0x0bec }
            r8.<init>(r4, r3)     // Catch:{ all -> 0x0bec }
            java.lang.String r4 = r116.toString()     // Catch:{ all -> 0x0bec }
            boolean r9 = r5.MediaMetadataCompat     // Catch:{ all -> 0x0bec }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0bec }
            r1.<init>()     // Catch:{ all -> 0x0bec }
            r18 = r9
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0bec }
            r9.<init>()     // Catch:{ all -> 0x0bec }
            r43 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0bea }
            r3.<init>()     // Catch:{ all -> 0x0bea }
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x0bea }
            r19.<init>()     // Catch:{ all -> 0x0bea }
            r116 = r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0bea }
            r9.<init>()     // Catch:{ all -> 0x0bea }
            r20 = r9
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0bea }
            r9.<init>()     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$RemoteActionCompatParcelizer r30 = new o.SupportActionModeWrapper$CallbackWrapper$RemoteActionCompatParcelizer     // Catch:{ all -> 0x0bea }
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r24 = 0
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r29 = 0
            r21 = r30
            r21.<init>(r22, r24, r25, r27, r29)     // Catch:{ all -> 0x0bea }
            r21 = r4
            java.util.TreeMap r4 = new java.util.TreeMap     // Catch:{ all -> 0x0bea }
            r4.<init>()     // Catch:{ all -> 0x0bea }
            r22 = r11
            java.lang.String r11 = ""
            r23 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = -1
            r27 = 0
            r47 = r11
            r89 = r13
            r62 = r18
            r61 = r19
            r39 = r23
            r41 = r39
            r67 = r25
            r32 = r27
            r36 = r32
            r45 = r36
            r56 = r45
            r90 = r56
            r93 = r90
            r95 = r93
            r97 = r95
            r64 = r30
            r13 = 0
            r18 = 0
            r19 = 0
            r31 = 0
            r34 = 0
            r35 = 0
            r38 = 1
            r44 = 0
            r58 = 0
            r60 = 0
            r63 = 0
            r65 = 0
            r66 = 0
            r87 = 0
            r88 = 0
            r92 = 0
            r29 = r41
        L_0x0178:
            boolean r48 = r8.asBinder()     // Catch:{ all -> 0x0bea }
            r99 = r12
            if (r48 == 0) goto L_0x0b2a
            boolean r48 = r8.asBinder()     // Catch:{ all -> 0x0bea }
            if (r48 == 0) goto L_0x0b24
            java.lang.String r12 = r8.asInterface     // Catch:{ all -> 0x0bea }
            r100 = r14
            r14 = 0
            r8.asInterface = r14     // Catch:{ all -> 0x0bea }
            java.lang.String r14 = "#EXT"
            boolean r14 = r12.startsWith(r14)     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x0198
            r9.add(r12)     // Catch:{ all -> 0x0bea }
        L_0x0198:
            java.lang.String r14 = "#EXT-X-PLAYLIST-TYPE"
            boolean r14 = r12.startsWith(r14)     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x01c4
            java.util.regex.Pattern r14 = addMenuProvider     // Catch:{ all -> 0x0bea }
            java.lang.String r12 = asInterface(r12, r14, r1)     // Catch:{ all -> 0x0bea }
            java.lang.String r14 = "VOD"
            boolean r14 = r14.equals(r12)     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x01b5
            r12 = r99
            r14 = r100
            r19 = 1
            goto L_0x0178
        L_0x01b5:
            java.lang.String r14 = "EVENT"
            boolean r12 = r14.equals(r12)     // Catch:{ all -> 0x0bea }
            if (r12 == 0) goto L_0x01bf
            r19 = 2
        L_0x01bf:
            r12 = r99
            r14 = r100
            goto L_0x0178
        L_0x01c4:
            java.lang.String r14 = "#EXT-X-I-FRAMES-ONLY"
            boolean r14 = r12.equals(r14)     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x01d3
            r12 = r99
            r14 = r100
            r18 = 1
            goto L_0x0178
        L_0x01d3:
            java.lang.String r14 = "#EXT-X-START"
            boolean r14 = r12.startsWith(r14)     // Catch:{ all -> 0x0bea }
            r101 = r8
            java.lang.String r8 = "YES"
            r49 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r14 == 0) goto L_0x021f
            java.util.regex.Pattern r14 = getLastCustomNonConfigurationInstance     // Catch:{ all -> 0x0bea }
            r102 = r9
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r9 = asInterface(r12, r14, r9)     // Catch:{ all -> 0x0bea }
            double r29 = java.lang.Double.parseDouble(r9)     // Catch:{ all -> 0x0bea }
            r9 = r13
            double r13 = r29 * r49
            long r13 = (long) r13     // Catch:{ all -> 0x0bea }
            r29 = r13
            java.util.regex.Pattern r13 = addOnContextAvailableListener     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r12 = r13.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r13 = r12.find()     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x0212
            r13 = 1
            java.lang.String r12 = r12.group(r13)     // Catch:{ all -> 0x0bea }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0bea }
            r31 = r8
            goto L_0x0214
        L_0x0212:
            r31 = 0
        L_0x0214:
            r13 = r9
        L_0x0215:
            r12 = r99
            r14 = r100
            r8 = r101
        L_0x021b:
            r9 = r102
            goto L_0x0178
        L_0x021f:
            r102 = r9
            r9 = r13
            java.lang.String r13 = "#EXT-X-SERVER-CONTROL"
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x02db
            java.util.regex.Pattern r13 = setInternalConnectionCallback     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r13 = r13.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r14 = r13.find()     // Catch:{ all -> 0x0bea }
            r51 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            if (r14 == 0) goto L_0x0244
            r14 = 1
            java.lang.String r13 = r13.group(r14)     // Catch:{ all -> 0x0bea }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0bea }
            double r13 = java.lang.Double.parseDouble(r13)     // Catch:{ all -> 0x0bea }
            goto L_0x0246
        L_0x0244:
            r13 = r51
        L_0x0246:
            int r48 = (r13 > r51 ? 1 : (r13 == r51 ? 0 : -1))
            if (r48 != 0) goto L_0x024d
            r70 = r23
            goto L_0x0252
        L_0x024d:
            double r13 = r13 * r49
            long r13 = (long) r13     // Catch:{ all -> 0x0bea }
            r70 = r13
        L_0x0252:
            java.util.regex.Pattern r13 = onConnectionFailed     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r13 = r13.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r14 = r13.find()     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x026a
            r14 = 1
            java.lang.String r13 = r13.group(r14)     // Catch:{ all -> 0x0bea }
            boolean r13 = r8.equals(r13)     // Catch:{ all -> 0x0bea }
            r72 = r13
            goto L_0x026c
        L_0x026a:
            r72 = 0
        L_0x026c:
            java.util.regex.Pattern r13 = MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r13 = r13.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r14 = r13.find()     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x0284
            r14 = 1
            java.lang.String r13 = r13.group(r14)     // Catch:{ all -> 0x0bea }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0bea }
            double r13 = java.lang.Double.parseDouble(r13)     // Catch:{ all -> 0x0bea }
            goto L_0x0286
        L_0x0284:
            r13 = r51
        L_0x0286:
            int r48 = (r13 > r51 ? 1 : (r13 == r51 ? 0 : -1))
            if (r48 != 0) goto L_0x028d
            r73 = r23
            goto L_0x0292
        L_0x028d:
            double r13 = r13 * r49
            long r13 = (long) r13     // Catch:{ all -> 0x0bea }
            r73 = r13
        L_0x0292:
            java.util.regex.Pattern r13 = addOnConfigurationChangedListener     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r13 = r13.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r14 = r13.find()     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x02aa
            r14 = 1
            java.lang.String r13 = r13.group(r14)     // Catch:{ all -> 0x0bea }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0bea }
            double r13 = java.lang.Double.parseDouble(r13)     // Catch:{ all -> 0x0bea }
            goto L_0x02ac
        L_0x02aa:
            r13 = r51
        L_0x02ac:
            int r48 = (r13 > r51 ? 1 : (r13 == r51 ? 0 : -1))
            if (r48 == 0) goto L_0x02b6
            double r13 = r13 * r49
            long r13 = (long) r13     // Catch:{ all -> 0x0bea }
            r75 = r13
            goto L_0x02b8
        L_0x02b6:
            r75 = r23
        L_0x02b8:
            java.util.regex.Pattern r13 = AudioAttributesImplApi21Parcelizer     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r12 = r13.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r13 = r12.find()     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x02d0
            r13 = 1
            java.lang.String r12 = r12.group(r13)     // Catch:{ all -> 0x0bea }
            boolean r8 = r8.equals(r12)     // Catch:{ all -> 0x0bea }
            r77 = r8
            goto L_0x02d2
        L_0x02d0:
            r77 = 0
        L_0x02d2:
            o.SupportActionModeWrapper$CallbackWrapper$RemoteActionCompatParcelizer r64 = new o.SupportActionModeWrapper$CallbackWrapper$RemoteActionCompatParcelizer     // Catch:{ all -> 0x0bea }
            r69 = r64
            r69.<init>(r70, r72, r73, r75, r77)     // Catch:{ all -> 0x0bea }
            goto L_0x0214
        L_0x02db:
            java.lang.String r13 = "#EXT-X-PART-INF"
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x02ff
            java.util.regex.Pattern r8 = addOnMultiWindowModeChangedListener     // Catch:{ all -> 0x0bea }
            java.util.Map r13 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r8 = asInterface(r12, r8, r13)     // Catch:{ all -> 0x0bea }
            double r12 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x0bea }
            double r12 = r12 * r49
            long r12 = (long) r12     // Catch:{ all -> 0x0bea }
            r41 = r12
            r12 = r99
            r14 = r100
            r8 = r101
            r13 = r9
            goto L_0x021b
        L_0x02ff:
            java.lang.String r13 = "#EXT-X-MAP"
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x0bea }
            java.lang.String r14 = "@"
            if (r13 == 0) goto L_0x035c
            java.util.regex.Pattern r8 = getDefaultViewModelProviderFactory     // Catch:{ all -> 0x0bea }
            java.lang.String r49 = asInterface(r12, r8, r1)     // Catch:{ all -> 0x0bea }
            java.util.regex.Pattern r8 = asBinder     // Catch:{ all -> 0x0bea }
            r13 = 0
            java.lang.String r8 = onTransact(r12, r8, r13, r1)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x032e
            r12 = -1
            java.lang.String[] r8 = r8.split(r14, r12)     // Catch:{ all -> 0x0bea }
            r12 = 0
            r13 = r8[r12]     // Catch:{ all -> 0x0bea }
            long r67 = java.lang.Long.parseLong(r13)     // Catch:{ all -> 0x0bea }
            int r12 = r8.length     // Catch:{ all -> 0x0bea }
            r13 = 1
            if (r12 <= r13) goto L_0x032e
            r8 = r8[r13]     // Catch:{ all -> 0x0bea }
            long r45 = java.lang.Long.parseLong(r8)     // Catch:{ all -> 0x0bea }
        L_0x032e:
            int r8 = (r67 > r25 ? 1 : (r67 == r25 ? 0 : -1))
            if (r8 != 0) goto L_0x0334
            r45 = r27
        L_0x0334:
            if (r87 == 0) goto L_0x0344
            if (r66 == 0) goto L_0x0339
            goto L_0x0344
        L_0x0339:
            java.lang.String r0 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException     // Catch:{ all -> 0x0bea }
            r2 = 4
            r3 = 0
            r4 = 1
            r1.<init>(r0, r3, r4, r2)     // Catch:{ all -> 0x0bea }
            throw r1     // Catch:{ all -> 0x0bea }
        L_0x0344:
            o.SupportActionModeWrapper$CallbackWrapper$read r92 = new o.SupportActionModeWrapper$CallbackWrapper$read     // Catch:{ all -> 0x0bea }
            r48 = r92
            r50 = r45
            r52 = r67
            r54 = r87
            r55 = r66
            r48.<init>(r49, r50, r52, r54, r55)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x0357
            long r45 = r45 + r67
        L_0x0357:
            r13 = r9
            r67 = r25
            goto L_0x0215
        L_0x035c:
            boolean r13 = r12.startsWith(r2)     // Catch:{ all -> 0x0bea }
            r51 = r8
            r103 = r9
            r8 = 1000000(0xf4240, double:4.940656E-318)
            if (r13 == 0) goto L_0x0386
            java.util.regex.Pattern r13 = getActivityResultRegistry     // Catch:{ all -> 0x0bea }
            java.util.Map r14 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r12 = asInterface(r12, r13, r14)     // Catch:{ all -> 0x0bea }
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ all -> 0x0bea }
            long r12 = (long) r12     // Catch:{ all -> 0x0bea }
            long r39 = r12 * r8
        L_0x037a:
            r12 = r99
            r14 = r100
            r8 = r101
            r9 = r102
            r13 = r103
            goto L_0x0178
        L_0x0386:
            boolean r13 = r12.startsWith(r7)     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x039d
            java.util.regex.Pattern r8 = cancel     // Catch:{ all -> 0x0bea }
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r8 = asInterface(r12, r8, r9)     // Catch:{ all -> 0x0bea }
            long r56 = java.lang.Long.parseLong(r8)     // Catch:{ all -> 0x0bea }
            r36 = r56
            goto L_0x037a
        L_0x039d:
            java.lang.String r13 = "#EXT-X-VERSION"
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x03b4
            java.util.regex.Pattern r8 = getOnBackPressedDispatcher     // Catch:{ all -> 0x0bea }
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r8 = asInterface(r12, r8, r9)     // Catch:{ all -> 0x0bea }
            int r38 = java.lang.Integer.parseInt(r8)     // Catch:{ all -> 0x0bea }
            goto L_0x037a
        L_0x03b4:
            java.lang.String r13 = "#EXT-X-DEFINE"
            boolean r13 = r12.startsWith(r13)     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x0405
            java.util.regex.Pattern r8 = MediaMetadataCompat     // Catch:{ all -> 0x0bea }
            r9 = 0
            java.lang.String r8 = onTransact(r12, r8, r9, r1)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x03d3
            java.util.Map<java.lang.String, java.lang.String> r9 = r5.AudioAttributesImplApi21Parcelizer     // Catch:{ all -> 0x0bea }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x0bea }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0bea }
            if (r9 == 0) goto L_0x03e2
            r1.put(r8, r9)     // Catch:{ all -> 0x0bea }
            goto L_0x03e2
        L_0x03d3:
            java.util.regex.Pattern r8 = addContentView     // Catch:{ all -> 0x0bea }
            java.lang.String r8 = asInterface(r12, r8, r1)     // Catch:{ all -> 0x0bea }
            java.util.regex.Pattern r9 = getDefaultViewModelCreationExtras     // Catch:{ all -> 0x0bea }
            java.lang.String r9 = asInterface(r12, r9, r1)     // Catch:{ all -> 0x0bea }
            r1.put(r8, r9)     // Catch:{ all -> 0x0bea }
        L_0x03e2:
            r111 = r0
            r112 = r1
            r104 = r2
            r0 = r3
            r105 = r5
            r106 = r6
            r107 = r7
            r108 = r10
            r109 = r11
            r114 = r15
            r9 = r20
            r13 = r21
            r8 = r61
            r10 = r65
            r1 = r103
            r3 = 0
            r11 = r116
            r7 = r4
            goto L_0x0afb
        L_0x0405:
            boolean r13 = r12.startsWith(r6)     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x042f
            java.util.regex.Pattern r13 = initViewTreeOwners     // Catch:{ all -> 0x0bea }
            java.util.Map r14 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r13 = asInterface(r12, r13, r14)     // Catch:{ all -> 0x0bea }
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch:{ all -> 0x0bea }
            r14.<init>(r13)     // Catch:{ all -> 0x0bea }
            java.math.BigDecimal r13 = new java.math.BigDecimal     // Catch:{ all -> 0x0bea }
            r13.<init>(r8)     // Catch:{ all -> 0x0bea }
            java.math.BigDecimal r8 = r14.multiply(r13)     // Catch:{ all -> 0x0bea }
            long r93 = r8.longValue()     // Catch:{ all -> 0x0bea }
            java.util.regex.Pattern r8 = access$001     // Catch:{ all -> 0x0bea }
            java.lang.String r47 = onTransact(r12, r8, r11, r1)     // Catch:{ all -> 0x0bea }
            goto L_0x037a
        L_0x042f:
            java.lang.String r8 = "#EXT-X-SKIP"
            boolean r8 = r12.startsWith(r8)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x05e3
            java.util.regex.Pattern r8 = addOnNewIntentListener     // Catch:{ all -> 0x0bea }
            java.util.Map r9 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r8 = asInterface(r12, r8, r9)     // Catch:{ all -> 0x0bea }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ all -> 0x0bea }
            if (r10 == 0) goto L_0x044f
            boolean r9 = r3.isEmpty()     // Catch:{ all -> 0x0bea }
            if (r9 == 0) goto L_0x044f
            r9 = 1
            goto L_0x0450
        L_0x044f:
            r9 = 0
        L_0x0450:
            if (r9 == 0) goto L_0x05dd
            r9 = r10
            o.SupportActionModeWrapper$CallbackWrapper r9 = (o.SupportActionModeWrapper.CallbackWrapper) r9     // Catch:{ all -> 0x0bea }
            long r12 = r9.IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            long r12 = r36 - r12
            int r9 = (int) r12     // Catch:{ all -> 0x0bea }
            int r8 = r8 + r9
            if (r9 < 0) goto L_0x05d7
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$read> r12 = r10.AudioAttributesImplBaseParcelizer     // Catch:{ all -> 0x0bea }
            int r12 = r12.size()     // Catch:{ all -> 0x0bea }
            if (r8 > r12) goto L_0x05d7
        L_0x0465:
            if (r9 >= r8) goto L_0x037a
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$read> r12 = r10.AudioAttributesImplBaseParcelizer     // Catch:{ all -> 0x0bea }
            java.lang.Object r12 = r12.get(r9)     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$read r12 = (o.SupportActionModeWrapper.CallbackWrapper.read) r12     // Catch:{ all -> 0x0bea }
            long r13 = r10.IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            int r48 = (r36 > r13 ? 1 : (r36 == r13 ? 0 : -1))
            if (r48 == 0) goto L_0x0565
            int r13 = r10.onTransact     // Catch:{ all -> 0x0bea }
            int r14 = r12.setInternalConnectionCallback     // Catch:{ all -> 0x0bea }
            int r13 = r13 - r35
            int r13 = r13 + r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0bea }
            r14.<init>()     // Catch:{ all -> 0x0bea }
            r104 = r2
            r105 = r5
            r48 = r90
            r2 = 0
        L_0x0488:
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$onTransact> r5 = r12.onTransact     // Catch:{ all -> 0x0bea }
            int r5 = r5.size()     // Catch:{ all -> 0x0bea }
            if (r2 >= r5) goto L_0x0513
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$onTransact> r5 = r12.onTransact     // Catch:{ all -> 0x0bea }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$onTransact r5 = (o.SupportActionModeWrapper.CallbackWrapper.onTransact) r5     // Catch:{ all -> 0x0bea }
            r106 = r6
            o.SupportActionModeWrapper$CallbackWrapper$onTransact r6 = new o.SupportActionModeWrapper$CallbackWrapper$onTransact     // Catch:{ all -> 0x0bea }
            r107 = r7
            java.lang.String r7 = r5.onConnectionSuspended     // Catch:{ all -> 0x0bea }
            r50 = r8
            o.SupportActionModeWrapper$CallbackWrapper$read r8 = r5.onConnectionFailed     // Catch:{ all -> 0x0bea }
            r108 = r10
            r109 = r11
            long r10 = r5.AudioAttributesImplApi26Parcelizer     // Catch:{ all -> 0x0bea }
            r110 = r4
            o.isPowerSaveMode r4 = r5.AudioAttributesImplApi21Parcelizer     // Catch:{ all -> 0x0bea }
            r111 = r0
            java.lang.String r0 = r5.write     // Catch:{ all -> 0x0bea }
            r112 = r1
            java.lang.String r1 = r5.IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            r51 = r2
            r113 = r3
            long r2 = r5.AudioAttributesCompatParcelizer     // Catch:{ all -> 0x0bea }
            r52 = r14
            r114 = r15
            long r14 = r5.read     // Catch:{ all -> 0x0bea }
            r53 = r9
            boolean r9 = r5.onConnected     // Catch:{ all -> 0x0bea }
            r54 = r12
            boolean r12 = r5.asBinder     // Catch:{ all -> 0x0bea }
            r55 = r12
            boolean r12 = r5.asInterface     // Catch:{ all -> 0x0bea }
            r69 = r6
            r70 = r7
            r71 = r8
            r72 = r10
            r74 = r13
            r75 = r48
            r77 = r4
            r78 = r0
            r79 = r1
            r80 = r2
            r82 = r14
            r84 = r9
            r85 = r55
            r86 = r12
            r69.<init>(r70, r71, r72, r74, r75, r77, r78, r79, r80, r82, r84, r85, r86)     // Catch:{ all -> 0x0bea }
            r0 = r52
            r0.add(r6)     // Catch:{ all -> 0x0bea }
            long r1 = r5.AudioAttributesImplApi26Parcelizer     // Catch:{ all -> 0x0bea }
            long r48 = r48 + r1
            int r2 = r51 + 1
            r14 = r0
            r8 = r50
            r9 = r53
            r12 = r54
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r4 = r110
            r0 = r111
            r1 = r112
            r3 = r113
            r15 = r114
            goto L_0x0488
        L_0x0513:
            r111 = r0
            r112 = r1
            r113 = r3
            r110 = r4
            r106 = r6
            r107 = r7
            r50 = r8
            r53 = r9
            r108 = r10
            r109 = r11
            r54 = r12
            r0 = r14
            r114 = r15
            o.SupportActionModeWrapper$CallbackWrapper$read r1 = new o.SupportActionModeWrapper$CallbackWrapper$read     // Catch:{ all -> 0x0bea }
            java.lang.String r2 = r12.onConnectionSuspended     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$read r3 = r12.onConnectionFailed     // Catch:{ all -> 0x0bea }
            java.lang.String r4 = r12.RemoteActionCompatParcelizer     // Catch:{ all -> 0x0bea }
            long r5 = r12.AudioAttributesImplApi26Parcelizer     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode r7 = r12.AudioAttributesImplApi21Parcelizer     // Catch:{ all -> 0x0bea }
            java.lang.String r8 = r12.write     // Catch:{ all -> 0x0bea }
            java.lang.String r9 = r12.IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            long r10 = r12.AudioAttributesCompatParcelizer     // Catch:{ all -> 0x0bea }
            long r14 = r12.read     // Catch:{ all -> 0x0bea }
            boolean r12 = r12.onConnected     // Catch:{ all -> 0x0bea }
            r69 = r1
            r70 = r2
            r71 = r3
            r72 = r4
            r73 = r5
            r75 = r13
            r76 = r90
            r78 = r7
            r79 = r8
            r80 = r9
            r81 = r10
            r83 = r14
            r85 = r12
            r86 = r0
            r69.<init>(r70, r71, r72, r73, r75, r76, r78, r79, r80, r81, r83, r85, r86)     // Catch:{ all -> 0x0bea }
            r12 = r1
            r0 = r113
            goto L_0x057e
        L_0x0565:
            r111 = r0
            r112 = r1
            r104 = r2
            r110 = r4
            r105 = r5
            r106 = r6
            r107 = r7
            r50 = r8
            r53 = r9
            r108 = r10
            r109 = r11
            r114 = r15
            r0 = r3
        L_0x057e:
            r0.add(r12)     // Catch:{ all -> 0x0bea }
            long r1 = r12.AudioAttributesImplApi26Parcelizer     // Catch:{ all -> 0x0bea }
            long r95 = r90 + r1
            long r1 = r12.read     // Catch:{ all -> 0x0bea }
            int r3 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r3 == 0) goto L_0x0592
            long r1 = r12.AudioAttributesCompatParcelizer     // Catch:{ all -> 0x0bea }
            long r3 = r12.read     // Catch:{ all -> 0x0bea }
            long r1 = r1 + r3
            r45 = r1
        L_0x0592:
            int r1 = r12.setInternalConnectionCallback     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$read r2 = r12.onConnectionFailed     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode r3 = r12.AudioAttributesImplApi21Parcelizer     // Catch:{ all -> 0x0bea }
            java.lang.String r4 = r12.write     // Catch:{ all -> 0x0bea }
            java.lang.String r5 = r12.IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            if (r5 == 0) goto L_0x05aa
            java.lang.String r5 = r12.IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            java.lang.String r6 = java.lang.Long.toHexString(r56)     // Catch:{ all -> 0x0bea }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0bea }
            if (r5 != 0) goto L_0x05ae
        L_0x05aa:
            java.lang.String r5 = r12.IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            r66 = r5
        L_0x05ae:
            r5 = 1
            long r56 = r56 + r5
            int r9 = r53 + 1
            r88 = r1
            r92 = r2
            r58 = r3
            r87 = r4
            r8 = r50
            r90 = r95
            r2 = r104
            r5 = r105
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r4 = r110
            r1 = r112
            r15 = r114
            r3 = r0
            r0 = r111
            goto L_0x0465
        L_0x05d7:
            com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException r0 = new com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$DeltaUpdateException     // Catch:{ all -> 0x0bea }
            r0.<init>()     // Catch:{ all -> 0x0bea }
            throw r0     // Catch:{ all -> 0x0bea }
        L_0x05dd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0bea }
            r0.<init>()     // Catch:{ all -> 0x0bea }
            throw r0     // Catch:{ all -> 0x0bea }
        L_0x05e3:
            r111 = r0
            r112 = r1
            r104 = r2
            r0 = r3
            r110 = r4
            r105 = r5
            r106 = r6
            r107 = r7
            r108 = r10
            r109 = r11
            r1 = r15
            boolean r2 = r12.startsWith(r1)     // Catch:{ all -> 0x0bea }
            if (r2 == 0) goto L_0x0689
            java.util.regex.Pattern r2 = createFullyDrawnExecutor     // Catch:{ all -> 0x0bea }
            r3 = r112
            java.lang.String r2 = asInterface(r12, r2, r3)     // Catch:{ all -> 0x0bea }
            java.util.regex.Pattern r4 = MediaSessionCompat$Token     // Catch:{ all -> 0x0bea }
            r5 = r111
            java.lang.String r4 = onTransact(r12, r4, r5, r3)     // Catch:{ all -> 0x0bea }
            java.lang.String r6 = "NONE"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x0bea }
            if (r6 == 0) goto L_0x061e
            r110.clear()     // Catch:{ all -> 0x0bea }
            r13 = r103
            r7 = r110
            r6 = 0
            goto L_0x066b
        L_0x061e:
            java.util.regex.Pattern r6 = Cancellable     // Catch:{ all -> 0x0bea }
            r7 = 0
            java.lang.String r6 = onTransact(r12, r6, r7, r3)     // Catch:{ all -> 0x0bea }
            boolean r7 = r5.equals(r4)     // Catch:{ all -> 0x0bea }
            if (r7 == 0) goto L_0x0645
            java.lang.String r4 = "AES-128"
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x0bea }
            if (r2 == 0) goto L_0x0640
            java.util.regex.Pattern r2 = getDefaultViewModelProviderFactory     // Catch:{ all -> 0x0bea }
            java.lang.String r2 = asInterface(r12, r2, r3)     // Catch:{ all -> 0x0bea }
            r66 = r6
            r13 = r103
            r7 = r110
            goto L_0x0674
        L_0x0640:
            r13 = r103
        L_0x0642:
            r7 = r110
            goto L_0x0671
        L_0x0645:
            if (r103 != 0) goto L_0x065e
            java.lang.String r7 = "SAMPLE-AES-CENC"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0bea }
            if (r7 != 0) goto L_0x065a
            java.lang.String r7 = "SAMPLE-AES-CTR"
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0bea }
            if (r2 != 0) goto L_0x065a
            java.lang.String r2 = "cbcs"
            goto L_0x065c
        L_0x065a:
            java.lang.String r2 = "cenc"
        L_0x065c:
            r13 = r2
            goto L_0x0660
        L_0x065e:
            r13 = r103
        L_0x0660:
            o.isPowerSaveMode$asBinder r2 = RemoteActionCompatParcelizer(r12, r4, r3)     // Catch:{ all -> 0x0bea }
            if (r2 == 0) goto L_0x0642
            r7 = r110
            r7.put(r4, r2)     // Catch:{ all -> 0x0bea }
        L_0x066b:
            r66 = r6
            r2 = 0
            r58 = 0
            goto L_0x0674
        L_0x0671:
            r66 = r6
            r2 = 0
        L_0x0674:
            r11 = r116
            r114 = r1
            r87 = r2
            r112 = r3
            r111 = r5
            r1 = r13
            r9 = r20
            r13 = r21
            r8 = r61
            r10 = r65
            goto L_0x073e
        L_0x0689:
            r7 = r110
            r5 = r111
            r3 = r112
            r2 = r100
            boolean r4 = r12.startsWith(r2)     // Catch:{ all -> 0x0bea }
            if (r4 == 0) goto L_0x06b9
            java.util.regex.Pattern r4 = AudioAttributesCompatParcelizer     // Catch:{ all -> 0x0bea }
            java.lang.String r4 = asInterface(r12, r4, r3)     // Catch:{ all -> 0x0bea }
            r6 = -1
            java.lang.String[] r4 = r4.split(r14, r6)     // Catch:{ all -> 0x0bea }
            r6 = 0
            r8 = r4[r6]     // Catch:{ all -> 0x0bea }
            long r67 = java.lang.Long.parseLong(r8)     // Catch:{ all -> 0x0bea }
            int r6 = r4.length     // Catch:{ all -> 0x0bea }
            r8 = 1
            if (r6 <= r8) goto L_0x06b3
            r4 = r4[r8]     // Catch:{ all -> 0x0bea }
            long r45 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0bea }
        L_0x06b3:
            r6 = r89
            r4 = r99
            goto L_0x0726
        L_0x06b9:
            r4 = r99
            boolean r6 = r12.startsWith(r4)     // Catch:{ all -> 0x0bea }
            if (r6 == 0) goto L_0x06ee
            r6 = 58
            int r6 = r12.indexOf(r6)     // Catch:{ all -> 0x0bea }
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = r12.substring(r6)     // Catch:{ all -> 0x0bea }
            int r35 = java.lang.Integer.parseInt(r6)     // Catch:{ all -> 0x0bea }
            r15 = r1
            r14 = r2
            r1 = r3
            r12 = r4
            r4 = r7
            r8 = r101
            r9 = r102
            r13 = r103
            r2 = r104
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r34 = 1
        L_0x06e8:
            r3 = r0
            r0 = r5
            r5 = r105
            goto L_0x0178
        L_0x06ee:
            r6 = r89
            boolean r8 = r12.equals(r6)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x06f9
            int r88 = r88 + 1
            goto L_0x0726
        L_0x06f9:
            java.lang.String r8 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r8 = r12.startsWith(r8)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x074f
            int r8 = (r32 > r27 ? 1 : (r32 == r27 ? 0 : -1))
            if (r8 != 0) goto L_0x0741
            r8 = 58
            int r8 = r12.indexOf(r8)     // Catch:{ all -> 0x0bea }
            r9 = 1
            int r8 = r8 + r9
            java.lang.String r8 = r12.substring(r8)     // Catch:{ all -> 0x0bea }
            long r8 = o.OnBackPressedDispatcher.Api33Impl.onTransact((java.lang.String) r8)     // Catch:{ all -> 0x0bea }
            int r10 = (r8 > r23 ? 1 : (r8 == r23 ? 0 : -1))
            if (r10 == 0) goto L_0x0724
            r10 = -9223372036854775808
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0720
            goto L_0x0724
        L_0x0720:
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
        L_0x0724:
            long r32 = r8 - r90
        L_0x0726:
            r11 = r116
            r114 = r1
            r100 = r2
            r112 = r3
            r99 = r4
            r111 = r5
            r89 = r6
            r9 = r20
            r13 = r21
            r8 = r61
            r10 = r65
            r1 = r103
        L_0x073e:
            r3 = 0
            goto L_0x0afb
        L_0x0741:
            r114 = r1
            r9 = r20
            r13 = r21
            r8 = r22
        L_0x0749:
            r10 = r65
        L_0x074b:
            r12 = r103
            goto L_0x08fd
        L_0x074f:
            java.lang.String r8 = "#EXT-X-GAP"
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x0772
            r15 = r1
            r14 = r2
            r1 = r3
            r12 = r4
            r89 = r6
            r4 = r7
            r8 = r101
            r9 = r102
            r13 = r103
            r2 = r104
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r60 = 1
            goto L_0x06e8
        L_0x0772:
            java.lang.String r8 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r8 = r12.equals(r8)     // Catch:{ all -> 0x0bea }
            if (r8 == 0) goto L_0x0795
            r15 = r1
            r14 = r2
            r1 = r3
            r12 = r4
            r89 = r6
            r4 = r7
            r8 = r101
            r9 = r102
            r13 = r103
            r2 = r104
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r62 = 1
            goto L_0x06e8
        L_0x0795:
            r8 = r22
            boolean r9 = r12.equals(r8)     // Catch:{ all -> 0x0bea }
            if (r9 == 0) goto L_0x07ba
            r15 = r1
            r14 = r2
            r1 = r3
            r12 = r4
            r89 = r6
            r4 = r7
            r22 = r8
            r8 = r101
            r9 = r102
            r13 = r103
            r2 = r104
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r63 = 1
            goto L_0x06e8
        L_0x07ba:
            java.lang.String r9 = "#EXT-X-RENDITION-REPORT"
            boolean r9 = r12.startsWith(r9)     // Catch:{ all -> 0x0bea }
            if (r9 == 0) goto L_0x0813
            java.util.regex.Pattern r9 = PlaybackStateCompat     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r9 = r9.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r10 = r9.find()     // Catch:{ all -> 0x0bea }
            if (r10 == 0) goto L_0x07da
            r10 = 1
            java.lang.String r9 = r9.group(r10)     // Catch:{ all -> 0x0bea }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0bea }
            long r9 = java.lang.Long.parseLong(r9)     // Catch:{ all -> 0x0bea }
            goto L_0x07dc
        L_0x07da:
            r9 = r25
        L_0x07dc:
            java.util.regex.Pattern r11 = ComponentActivity     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r11 = r11.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r13 = r11.find()     // Catch:{ all -> 0x0bea }
            if (r13 == 0) goto L_0x07f4
            r13 = 1
            java.lang.String r11 = r11.group(r13)     // Catch:{ all -> 0x0bea }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0bea }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ all -> 0x0bea }
            goto L_0x07f5
        L_0x07f4:
            r11 = -1
        L_0x07f5:
            java.util.regex.Pattern r13 = getDefaultViewModelProviderFactory     // Catch:{ all -> 0x0bea }
            java.lang.String r12 = asInterface(r12, r13, r3)     // Catch:{ all -> 0x0bea }
            r13 = r21
            java.lang.String r12 = o.setOnBackInvokedDispatcher.onTransact((java.lang.String) r13, (java.lang.String) r12)     // Catch:{ all -> 0x0bea }
            android.net.Uri r12 = android.net.Uri.parse(r12)     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$asInterface r14 = new o.SupportActionModeWrapper$CallbackWrapper$asInterface     // Catch:{ all -> 0x0bea }
            r14.<init>(r12, r9, r11)     // Catch:{ all -> 0x0bea }
            r9 = r20
            r9.add(r14)     // Catch:{ all -> 0x0bea }
            r114 = r1
            goto L_0x0749
        L_0x0813:
            r9 = r20
            r13 = r21
            java.lang.String r10 = "#EXT-X-PRELOAD-HINT"
            boolean r10 = r12.startsWith(r10)     // Catch:{ all -> 0x0bea }
            if (r10 == 0) goto L_0x0910
            r10 = r65
            if (r10 == 0) goto L_0x0827
        L_0x0823:
            r114 = r1
            goto L_0x074b
        L_0x0827:
            java.util.regex.Pattern r11 = ensureViewModelStore     // Catch:{ all -> 0x0bea }
            java.lang.String r11 = asInterface(r12, r11, r3)     // Catch:{ all -> 0x0bea }
            java.lang.String r14 = "PART"
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0bea }
            if (r11 == 0) goto L_0x0823
            java.util.regex.Pattern r11 = getDefaultViewModelProviderFactory     // Catch:{ all -> 0x0bea }
            java.lang.String r70 = asInterface(r12, r11, r3)     // Catch:{ all -> 0x0bea }
            java.util.regex.Pattern r11 = IconCompatParcelizer     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r11 = r11.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r14 = r11.find()     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x0853
            r14 = 1
            java.lang.String r11 = r11.group(r14)     // Catch:{ all -> 0x0bea }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0bea }
            long r14 = java.lang.Long.parseLong(r11)     // Catch:{ all -> 0x0bea }
            goto L_0x0855
        L_0x0853:
            r14 = r25
        L_0x0855:
            java.util.regex.Pattern r11 = write     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r11 = r11.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r12 = r11.find()     // Catch:{ all -> 0x0bea }
            if (r12 == 0) goto L_0x086f
            r12 = 1
            java.lang.String r11 = r11.group(r12)     // Catch:{ all -> 0x0bea }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0bea }
            long r11 = java.lang.Long.parseLong(r11)     // Catch:{ all -> 0x0bea }
            r82 = r11
            goto L_0x0871
        L_0x086f:
            r82 = r25
        L_0x0871:
            if (r87 != 0) goto L_0x0876
            r79 = 0
            goto L_0x0881
        L_0x0876:
            if (r66 == 0) goto L_0x087b
            r79 = r66
            goto L_0x0881
        L_0x087b:
            java.lang.String r11 = java.lang.Long.toHexString(r56)     // Catch:{ all -> 0x0bea }
            r79 = r11
        L_0x0881:
            if (r58 != 0) goto L_0x08a8
            boolean r11 = r7.isEmpty()     // Catch:{ all -> 0x0bea }
            if (r11 != 0) goto L_0x08a8
            java.util.Collection r11 = r7.values()     // Catch:{ all -> 0x0bea }
            r114 = r1
            r12 = 0
            o.isPowerSaveMode$asBinder[] r1 = new o.isPowerSaveMode.asBinder[r12]     // Catch:{ all -> 0x0bea }
            java.lang.Object[] r1 = r11.toArray(r1)     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode$asBinder[] r1 = (o.isPowerSaveMode.asBinder[]) r1     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode r11 = new o.isPowerSaveMode     // Catch:{ all -> 0x0bea }
            r12 = r103
            r11.<init>((java.lang.String) r12, (o.isPowerSaveMode.asBinder[]) r1)     // Catch:{ all -> 0x0bea }
            if (r44 != 0) goto L_0x08a5
            o.isPowerSaveMode r44 = asBinder(r12, r1)     // Catch:{ all -> 0x0bea }
        L_0x08a5:
            r58 = r11
            goto L_0x08ac
        L_0x08a8:
            r114 = r1
            r12 = r103
        L_0x08ac:
            int r1 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r1 == 0) goto L_0x08b8
            int r11 = (r82 > r25 ? 1 : (r82 == r25 ? 0 : -1))
            if (r11 == 0) goto L_0x08b5
            goto L_0x08b8
        L_0x08b5:
            r65 = r10
            goto L_0x08da
        L_0x08b8:
            if (r1 != 0) goto L_0x08bd
            r80 = r27
            goto L_0x08bf
        L_0x08bd:
            r80 = r14
        L_0x08bf:
            o.SupportActionModeWrapper$CallbackWrapper$onTransact r1 = new o.SupportActionModeWrapper$CallbackWrapper$onTransact     // Catch:{ all -> 0x0bea }
            r72 = 0
            r84 = 0
            r85 = 0
            r86 = 1
            r69 = r1
            r71 = r92
            r74 = r88
            r75 = r95
            r77 = r58
            r78 = r87
            r69.<init>(r70, r71, r72, r74, r75, r77, r78, r79, r80, r82, r84, r85, r86)     // Catch:{ all -> 0x0bea }
            r65 = r1
        L_0x08da:
            r14 = r2
            r1 = r3
            r89 = r6
            r22 = r8
            r20 = r9
            r21 = r13
            r8 = r101
            r9 = r102
            r2 = r104
            r6 = r106
            r10 = r108
            r11 = r109
            r15 = r114
            r3 = r0
            r0 = r5
            r13 = r12
            r5 = r105
            r12 = r4
            r4 = r7
            r7 = r107
            goto L_0x0178
        L_0x08fd:
            r11 = r116
            r100 = r2
            r112 = r3
            r99 = r4
            r111 = r5
            r89 = r6
            r22 = r8
            r1 = r12
            r8 = r61
            goto L_0x073e
        L_0x0910:
            r114 = r1
            r10 = r65
            r1 = r103
            java.lang.String r11 = "#EXT-X-PART"
            boolean r11 = r12.startsWith(r11)     // Catch:{ all -> 0x0bea }
            if (r11 == 0) goto L_0x0a0c
            if (r87 != 0) goto L_0x0923
            r79 = 0
            goto L_0x092e
        L_0x0923:
            if (r66 == 0) goto L_0x0928
            r79 = r66
            goto L_0x092e
        L_0x0928:
            java.lang.String r11 = java.lang.Long.toHexString(r56)     // Catch:{ all -> 0x0bea }
            r79 = r11
        L_0x092e:
            java.util.regex.Pattern r11 = getDefaultViewModelProviderFactory     // Catch:{ all -> 0x0bea }
            java.lang.String r70 = asInterface(r12, r11, r3)     // Catch:{ all -> 0x0bea }
            java.util.regex.Pattern r11 = RemoteActionCompatParcelizer     // Catch:{ all -> 0x0bea }
            java.util.Map r15 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bea }
            java.lang.String r11 = asInterface(r12, r11, r15)     // Catch:{ all -> 0x0bea }
            double r20 = java.lang.Double.parseDouble(r11)     // Catch:{ all -> 0x0bea }
            r99 = r4
            r111 = r5
            double r4 = r20 * r49
            long r4 = (long) r4     // Catch:{ all -> 0x0bea }
            java.util.regex.Pattern r11 = MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r11 = r11.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r15 = r11.find()     // Catch:{ all -> 0x0bea }
            if (r15 == 0) goto L_0x0961
            r15 = 1
            java.lang.String r11 = r11.group(r15)     // Catch:{ all -> 0x0bea }
            r15 = r51
            boolean r11 = r15.equals(r11)     // Catch:{ all -> 0x0bea }
            goto L_0x0964
        L_0x0961:
            r15 = r51
            r11 = 0
        L_0x0964:
            if (r62 == 0) goto L_0x0971
            boolean r20 = r61.isEmpty()     // Catch:{ all -> 0x0bea }
            if (r20 == 0) goto L_0x0971
            r100 = r2
            r20 = 1
            goto L_0x0975
        L_0x0971:
            r100 = r2
            r20 = 0
        L_0x0975:
            java.util.regex.Pattern r2 = MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x0bea }
            java.util.regex.Matcher r2 = r2.matcher(r12)     // Catch:{ all -> 0x0bea }
            boolean r21 = r2.find()     // Catch:{ all -> 0x0bea }
            if (r21 == 0) goto L_0x098f
            r89 = r6
            r6 = 1
            java.lang.String r2 = r2.group(r6)     // Catch:{ all -> 0x0bea }
            boolean r2 = r15.equals(r2)     // Catch:{ all -> 0x0bea }
            r84 = r2
            goto L_0x0993
        L_0x098f:
            r89 = r6
            r84 = 0
        L_0x0993:
            java.util.regex.Pattern r2 = asBinder     // Catch:{ all -> 0x0bea }
            r6 = 0
            java.lang.String r2 = onTransact(r12, r2, r6, r3)     // Catch:{ all -> 0x0bea }
            if (r2 == 0) goto L_0x09b5
            r6 = -1
            java.lang.String[] r2 = r2.split(r14, r6)     // Catch:{ all -> 0x0bea }
            r6 = 0
            r12 = r2[r6]     // Catch:{ all -> 0x0bea }
            long r14 = java.lang.Long.parseLong(r12)     // Catch:{ all -> 0x0bea }
            int r6 = r2.length     // Catch:{ all -> 0x0bea }
            r12 = 1
            if (r6 <= r12) goto L_0x09b7
            r2 = r2[r12]     // Catch:{ all -> 0x0bea }
            long r21 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0bea }
            r97 = r21
            goto L_0x09b7
        L_0x09b5:
            r14 = r25
        L_0x09b7:
            int r2 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r2 != 0) goto L_0x09bd
            r97 = r27
        L_0x09bd:
            if (r58 != 0) goto L_0x09e2
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x0bea }
            if (r6 != 0) goto L_0x09e2
            java.util.Collection r6 = r7.values()     // Catch:{ all -> 0x0bea }
            r22 = r8
            r12 = 0
            o.isPowerSaveMode$asBinder[] r8 = new o.isPowerSaveMode.asBinder[r12]     // Catch:{ all -> 0x0bea }
            java.lang.Object[] r6 = r6.toArray(r8)     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode$asBinder[] r6 = (o.isPowerSaveMode.asBinder[]) r6     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode r8 = new o.isPowerSaveMode     // Catch:{ all -> 0x0bea }
            r8.<init>((java.lang.String) r1, (o.isPowerSaveMode.asBinder[]) r6)     // Catch:{ all -> 0x0bea }
            if (r44 != 0) goto L_0x09df
            o.isPowerSaveMode r44 = asBinder(r1, r6)     // Catch:{ all -> 0x0bea }
        L_0x09df:
            r58 = r8
            goto L_0x09e4
        L_0x09e2:
            r22 = r8
        L_0x09e4:
            o.SupportActionModeWrapper$CallbackWrapper$onTransact r6 = new o.SupportActionModeWrapper$CallbackWrapper$onTransact     // Catch:{ all -> 0x0bea }
            r85 = r11 | r20
            r86 = 0
            r69 = r6
            r71 = r92
            r72 = r4
            r74 = r88
            r75 = r95
            r77 = r58
            r78 = r87
            r80 = r97
            r82 = r14
            r69.<init>(r70, r71, r72, r74, r75, r77, r78, r79, r80, r82, r84, r85, r86)     // Catch:{ all -> 0x0bea }
            r8 = r61
            r8.add(r6)     // Catch:{ all -> 0x0bea }
            long r95 = r95 + r4
            if (r2 == 0) goto L_0x0af5
            long r97 = r97 + r14
            goto L_0x0af5
        L_0x0a0c:
            r100 = r2
            r99 = r4
            r111 = r5
            r89 = r6
            r22 = r8
            r8 = r61
            java.lang.String r2 = "#"
            boolean r2 = r12.startsWith(r2)     // Catch:{ all -> 0x0bea }
            if (r2 != 0) goto L_0x0af5
            if (r87 != 0) goto L_0x0a24
            r2 = 0
            goto L_0x0a2d
        L_0x0a24:
            if (r66 == 0) goto L_0x0a29
            r2 = r66
            goto L_0x0a2d
        L_0x0a29:
            java.lang.String r2 = java.lang.Long.toHexString(r56)     // Catch:{ all -> 0x0bea }
        L_0x0a2d:
            r4 = 1
            long r4 = r56 + r4
            java.lang.String r6 = RemoteActionCompatParcelizer((java.lang.String) r12, (java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ all -> 0x0bea }
            r11 = r116
            java.lang.Object r12 = r11.get(r6)     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$read r12 = (o.SupportActionModeWrapper.CallbackWrapper.read) r12     // Catch:{ all -> 0x0bea }
            int r14 = (r67 > r25 ? 1 : (r67 == r25 ? 0 : -1))
            if (r14 != 0) goto L_0x0a44
            r20 = r27
            goto L_0x0a60
        L_0x0a44:
            if (r18 == 0) goto L_0x0a5e
            if (r92 != 0) goto L_0x0a5e
            if (r12 != 0) goto L_0x0a5e
            o.SupportActionModeWrapper$CallbackWrapper$read r12 = new o.SupportActionModeWrapper$CallbackWrapper$read     // Catch:{ all -> 0x0bea }
            r50 = 0
            r54 = 0
            r55 = 0
            r48 = r12
            r49 = r6
            r52 = r45
            r48.<init>(r49, r50, r52, r54, r55)     // Catch:{ all -> 0x0bea }
            r11.put(r6, r12)     // Catch:{ all -> 0x0bea }
        L_0x0a5e:
            r20 = r45
        L_0x0a60:
            if (r58 != 0) goto L_0x0a87
            boolean r15 = r7.isEmpty()     // Catch:{ all -> 0x0bea }
            if (r15 != 0) goto L_0x0a87
            java.util.Collection r15 = r7.values()     // Catch:{ all -> 0x0bea }
            r112 = r3
            r69 = r4
            r3 = 0
            o.isPowerSaveMode$asBinder[] r4 = new o.isPowerSaveMode.asBinder[r3]     // Catch:{ all -> 0x0bea }
            java.lang.Object[] r4 = r15.toArray(r4)     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode$asBinder[] r4 = (o.isPowerSaveMode.asBinder[]) r4     // Catch:{ all -> 0x0bea }
            o.isPowerSaveMode r5 = new o.isPowerSaveMode     // Catch:{ all -> 0x0bea }
            r5.<init>((java.lang.String) r1, (o.isPowerSaveMode.asBinder[]) r4)     // Catch:{ all -> 0x0bea }
            if (r44 != 0) goto L_0x0a84
            o.isPowerSaveMode r44 = asBinder(r1, r4)     // Catch:{ all -> 0x0bea }
        L_0x0a84:
            r4 = r44
            goto L_0x0a90
        L_0x0a87:
            r112 = r3
            r69 = r4
            r3 = 0
            r4 = r44
            r5 = r58
        L_0x0a90:
            if (r92 == 0) goto L_0x0a95
            r46 = r92
            goto L_0x0a97
        L_0x0a95:
            r46 = r12
        L_0x0a97:
            o.SupportActionModeWrapper$CallbackWrapper$read r12 = new o.SupportActionModeWrapper$CallbackWrapper$read     // Catch:{ all -> 0x0bea }
            r44 = r12
            r45 = r6
            r48 = r93
            r50 = r88
            r51 = r90
            r53 = r5
            r54 = r87
            r55 = r2
            r56 = r20
            r58 = r67
            r61 = r8
            r44.<init>(r45, r46, r47, r48, r50, r51, r53, r54, r55, r56, r58, r60, r61)     // Catch:{ all -> 0x0bea }
            r0.add(r12)     // Catch:{ all -> 0x0bea }
            long r95 = r90 + r93
            java.util.ArrayList r61 = new java.util.ArrayList     // Catch:{ all -> 0x0bea }
            r61.<init>()     // Catch:{ all -> 0x0bea }
            if (r14 == 0) goto L_0x0ac0
            long r20 = r20 + r67
        L_0x0ac0:
            r45 = r20
            r3 = r0
            r44 = r4
            r58 = r5
            r4 = r7
            r20 = r9
            r65 = r10
            r116 = r11
            r21 = r13
            r67 = r25
            r93 = r27
            r56 = r69
            r90 = r95
            r12 = r99
            r14 = r100
            r8 = r101
            r9 = r102
            r2 = r104
            r5 = r105
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r47 = r11
            r0 = r111
            r15 = r114
            r60 = 0
            goto L_0x0b1f
        L_0x0af5:
            r11 = r116
            r112 = r3
            goto L_0x073e
        L_0x0afb:
            r3 = r0
            r4 = r7
            r61 = r8
            r20 = r9
            r65 = r10
            r116 = r11
            r21 = r13
            r12 = r99
            r14 = r100
            r8 = r101
            r9 = r102
            r2 = r104
            r5 = r105
            r6 = r106
            r7 = r107
            r10 = r108
            r11 = r109
            r0 = r111
            r15 = r114
        L_0x0b1f:
            r13 = r1
            r1 = r112
            goto L_0x0178
        L_0x0b24:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0bea }
            r0.<init>()     // Catch:{ all -> 0x0bea }
            throw r0     // Catch:{ all -> 0x0bea }
        L_0x0b2a:
            r0 = r3
            r102 = r9
            r9 = r20
            r13 = r21
            r8 = r61
            r10 = r65
            r3 = 0
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0bea }
            r1.<init>()     // Catch:{ all -> 0x0bea }
            r12 = 0
        L_0x0b3c:
            int r2 = r9.size()     // Catch:{ all -> 0x0bea }
            if (r12 >= r2) goto L_0x0b8c
            java.lang.Object r2 = r9.get(r12)     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$asInterface r2 = (o.SupportActionModeWrapper.CallbackWrapper.asInterface) r2     // Catch:{ all -> 0x0bea }
            long r4 = r2.RemoteActionCompatParcelizer     // Catch:{ all -> 0x0bea }
            int r6 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
            if (r6 != 0) goto L_0x0b5b
            int r4 = r0.size()     // Catch:{ all -> 0x0bea }
            long r4 = (long) r4     // Catch:{ all -> 0x0bea }
            long r4 = r36 + r4
            boolean r6 = r8.isEmpty()     // Catch:{ all -> 0x0bea }
            long r6 = (long) r6     // Catch:{ all -> 0x0bea }
            long r4 = r4 - r6
        L_0x0b5b:
            int r6 = r2.asBinder     // Catch:{ all -> 0x0bea }
            r7 = -1
            if (r6 != r7) goto L_0x0b7d
            int r11 = (r41 > r23 ? 1 : (r41 == r23 ? 0 : -1))
            if (r11 == 0) goto L_0x0b7d
            boolean r6 = r8.isEmpty()     // Catch:{ all -> 0x0bea }
            if (r6 == 0) goto L_0x0b75
            java.lang.Object r6 = o.setOnBackInvokedDispatcher.asInterface(r0)     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$read r6 = (o.SupportActionModeWrapper.CallbackWrapper.read) r6     // Catch:{ all -> 0x0bea }
            java.util.List<o.SupportActionModeWrapper$CallbackWrapper$onTransact> r6 = r6.onTransact     // Catch:{ all -> 0x0bea }
            r61 = r6
            goto L_0x0b77
        L_0x0b75:
            r61 = r8
        L_0x0b77:
            int r6 = r61.size()     // Catch:{ all -> 0x0bea }
            r11 = 1
            int r6 = r6 - r11
        L_0x0b7d:
            android.net.Uri r11 = r2.read     // Catch:{ all -> 0x0bea }
            o.SupportActionModeWrapper$CallbackWrapper$asInterface r14 = new o.SupportActionModeWrapper$CallbackWrapper$asInterface     // Catch:{ all -> 0x0bea }
            android.net.Uri r2 = r2.read     // Catch:{ all -> 0x0bea }
            r14.<init>(r2, r4, r6)     // Catch:{ all -> 0x0bea }
            r1.put(r11, r14)     // Catch:{ all -> 0x0bea }
            int r12 = r12 + 1
            goto L_0x0b3c
        L_0x0b8c:
            if (r10 == 0) goto L_0x0b91
            r8.add(r10)     // Catch:{ all -> 0x0bea }
        L_0x0b91:
            int r2 = (r32 > r27 ? 1 : (r32 == r27 ? 0 : -1))
            if (r2 == 0) goto L_0x0b98
            r16 = 1
            goto L_0x0b9a
        L_0x0b98:
            r16 = 0
        L_0x0b9a:
            o.SupportActionModeWrapper$CallbackWrapper r2 = new o.SupportActionModeWrapper$CallbackWrapper     // Catch:{ all -> 0x0bea }
            r17 = r2
            r18 = r19
            r19 = r13
            r20 = r102
            r21 = r29
            r23 = r31
            r24 = r32
            r26 = r34
            r27 = r35
            r28 = r36
            r30 = r38
            r31 = r39
            r33 = r41
            r35 = r62
            r36 = r63
            r37 = r16
            r38 = r44
            r39 = r0
            r40 = r8
            r41 = r64
            r42 = r1
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27, r28, r30, r31, r33, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x0bea }
            r43.close()     // Catch:{ IOException -> 0x0bcc }
        L_0x0bcc:
            return r2
        L_0x0bcd:
            r43 = r3
            r43.close()     // Catch:{ IOException -> 0x0bd2 }
        L_0x0bd2:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r1 = "Failed to parse the playlist, could not identify any tags."
            r2 = 4
            r3 = 0
            r4 = 1
            r0.<init>(r1, r3, r4, r2)
            throw r0
        L_0x0bdd:
            r43 = r3
            r2 = 4
            r3 = 0
            r4 = 1
            java.lang.String r0 = "Input does not start with the #EXTM3U header."
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException     // Catch:{ all -> 0x0bea }
            r1.<init>(r0, r3, r4, r2)     // Catch:{ all -> 0x0bea }
            throw r1     // Catch:{ all -> 0x0bea }
        L_0x0bea:
            r0 = move-exception
            goto L_0x0bef
        L_0x0bec:
            r0 = move-exception
            r43 = r3
        L_0x0bef:
            r43.close()     // Catch:{ IOException -> 0x0bf2 }
        L_0x0bf2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.onTransact(android.net.Uri, java.io.InputStream):o.parseMenu");
    }

    private static int onTransact(BufferedReader bufferedReader, boolean z, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i)) {
            if (!z) {
                if (i == 10 || i == 13) {
                    break;
                }
            }
            i = bufferedReader.read();
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0161, code lost:
        if (r6 > 0) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static o.SupportMenuInflater onTransact(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.RemoteActionCompatParcelizer r37, java.lang.String r38) throws java.io.IOException {
        /*
            r0 = r37
            r1 = r38
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r13 = 0
            r14 = 0
        L_0x0038:
            boolean r15 = r37.asBinder()
            r10 = 0
            if (r15 == 0) goto L_0x0259
            boolean r15 = r37.asBinder()
            if (r15 == 0) goto L_0x0253
            java.lang.String r15 = r0.asInterface
            r0.asInterface = r10
            java.lang.String r10 = "#EXT"
            boolean r10 = r15.startsWith(r10)
            if (r10 == 0) goto L_0x0054
            r9.add(r15)
        L_0x0054:
            java.lang.String r10 = "#EXT-X-I-FRAME-STREAM-INF"
            boolean r10 = r15.startsWith(r10)
            r19 = r13
            java.lang.String r13 = "#EXT-X-DEFINE"
            boolean r13 = r15.startsWith(r13)
            if (r13 == 0) goto L_0x0075
            java.util.regex.Pattern r10 = addContentView
            java.lang.String r10 = asInterface(r15, r10, r11)
            java.util.regex.Pattern r13 = getDefaultViewModelCreationExtras
            java.lang.String r13 = asInterface(r15, r13, r11)
            r11.put(r10, r13)
            goto L_0x00e6
        L_0x0075:
            java.lang.String r13 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r13 = r15.equals(r13)
            if (r13 == 0) goto L_0x008f
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r34 = r8
            r30 = r9
            r21 = r12
            r13 = 1
        L_0x008c:
            r5 = r2
            goto L_0x0231
        L_0x008f:
            java.lang.String r13 = "#EXT-X-MEDIA"
            boolean r13 = r15.startsWith(r13)
            if (r13 == 0) goto L_0x009b
            r8.add(r15)
            goto L_0x00e6
        L_0x009b:
            java.lang.String r13 = "#EXT-X-SESSION-KEY"
            boolean r13 = r15.startsWith(r13)
            if (r13 == 0) goto L_0x00dc
            java.util.regex.Pattern r10 = MediaSessionCompat$Token
            java.lang.String r13 = "identity"
            java.lang.String r10 = onTransact(r15, r10, r13, r11)
            o.isPowerSaveMode$asBinder r10 = RemoteActionCompatParcelizer(r15, r10, r11)
            if (r10 == 0) goto L_0x00e6
            java.util.regex.Pattern r13 = createFullyDrawnExecutor
            java.lang.String r13 = asInterface(r15, r13, r11)
            java.lang.String r15 = "SAMPLE-AES-CENC"
            boolean r15 = r15.equals(r13)
            if (r15 != 0) goto L_0x00ca
            java.lang.String r15 = "SAMPLE-AES-CTR"
            boolean r13 = r15.equals(r13)
            if (r13 != 0) goto L_0x00ca
            java.lang.String r13 = "cbcs"
            goto L_0x00cc
        L_0x00ca:
            java.lang.String r13 = "cenc"
        L_0x00cc:
            r15 = 1
            o.isPowerSaveMode$asBinder[] r15 = new o.isPowerSaveMode.asBinder[r15]
            r16 = 0
            r15[r16] = r10
            o.isPowerSaveMode r10 = new o.isPowerSaveMode
            r10.<init>((java.lang.String) r13, (o.isPowerSaveMode.asBinder[]) r15)
            r12.add(r10)
            goto L_0x00e6
        L_0x00dc:
            java.lang.String r13 = "#EXT-X-STREAM-INF"
            boolean r13 = r15.startsWith(r13)
            if (r13 != 0) goto L_0x00f7
            if (r10 != 0) goto L_0x00f7
        L_0x00e6:
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r34 = r8
            r30 = r9
            r21 = r12
            r13 = r19
            goto L_0x008c
        L_0x00f7:
            java.lang.String r13 = "CLOSED-CAPTIONS=NONE"
            boolean r13 = r15.contains(r13)
            r14 = r14 | r13
            if (r10 == 0) goto L_0x0105
            r13 = 16384(0x4000, float:2.2959E-41)
            r20 = r14
            goto L_0x0108
        L_0x0105:
            r20 = r14
            r13 = 0
        L_0x0108:
            java.util.regex.Pattern r14 = AudioAttributesImplApi26Parcelizer
            r21 = r12
            java.util.Map r12 = java.util.Collections.emptyMap()
            java.lang.String r12 = asInterface(r15, r14, r12)
            int r12 = java.lang.Integer.parseInt(r12)
            java.util.regex.Pattern r14 = onTransact
            java.util.regex.Matcher r14 = r14.matcher(r15)
            boolean r22 = r14.find()
            if (r22 == 0) goto L_0x0132
            r29 = r7
            r7 = 1
            java.lang.String r14 = r14.group(r7)
            java.lang.String r14 = (java.lang.String) r14
            int r7 = java.lang.Integer.parseInt(r14)
            goto L_0x0135
        L_0x0132:
            r29 = r7
            r7 = -1
        L_0x0135:
            java.util.regex.Pattern r14 = MediaBrowserCompat$CustomActionResultReceiver
            r30 = r9
            r9 = 0
            java.lang.String r14 = onTransact(r15, r14, r9, r11)
            r31 = r6
            java.util.regex.Pattern r6 = addOnTrimMemoryListener
            java.lang.String r6 = onTransact(r15, r6, r9, r11)
            if (r6 == 0) goto L_0x0164
            java.lang.String r9 = "x"
            r32 = r5
            r5 = -1
            java.lang.String[] r6 = r6.split(r9, r5)
            r5 = 0
            r9 = r6[r5]
            int r5 = java.lang.Integer.parseInt(r9)
            r9 = 1
            r6 = r6[r9]
            int r6 = java.lang.Integer.parseInt(r6)
            if (r5 <= 0) goto L_0x0166
            if (r6 > 0) goto L_0x0168
            goto L_0x0166
        L_0x0164:
            r32 = r5
        L_0x0166:
            r5 = -1
            r6 = -1
        L_0x0168:
            java.util.regex.Pattern r9 = MediaDescriptionCompat
            r33 = r4
            r4 = 0
            java.lang.String r9 = onTransact(r15, r9, r4, r11)
            if (r9 == 0) goto L_0x0178
            float r9 = java.lang.Float.parseFloat(r9)
            goto L_0x017a
        L_0x0178:
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x017a:
            r34 = r8
            java.util.regex.Pattern r8 = getViewModelStore
            java.lang.String r8 = onTransact(r15, r8, r4, r11)
            r35 = r2
            java.util.regex.Pattern r2 = read
            java.lang.String r2 = onTransact(r15, r2, r4, r11)
            r17 = r2
            java.util.regex.Pattern r2 = addOnPictureInPictureModeChangedListener
            java.lang.String r2 = onTransact(r15, r2, r4, r11)
            r36 = r2
            java.util.regex.Pattern r2 = onConnectionSuspended
            java.lang.String r2 = onTransact(r15, r2, r4, r11)
            if (r10 == 0) goto L_0x01ab
            java.util.regex.Pattern r4 = getDefaultViewModelProviderFactory
            java.lang.String r4 = asInterface(r15, r4, r11)
            java.lang.String r4 = o.setOnBackInvokedDispatcher.onTransact((java.lang.String) r1, (java.lang.String) r4)
            android.net.Uri r4 = android.net.Uri.parse(r4)
            goto L_0x01c8
        L_0x01ab:
            boolean r4 = r37.asBinder()
            if (r4 == 0) goto L_0x0248
            boolean r4 = r37.asBinder()
            if (r4 == 0) goto L_0x0242
            java.lang.String r4 = r0.asInterface
            r10 = 0
            r0.asInterface = r10
            java.lang.String r4 = RemoteActionCompatParcelizer((java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.String>) r11)
            java.lang.String r4 = o.setOnBackInvokedDispatcher.onTransact((java.lang.String) r1, (java.lang.String) r4)
            android.net.Uri r4 = android.net.Uri.parse(r4)
        L_0x01c8:
            o.setMultiChoiceItems$RemoteActionCompatParcelizer r10 = new o.setMultiChoiceItems$RemoteActionCompatParcelizer
            r10.<init>()
            int r15 = r3.size()
            java.lang.String r15 = java.lang.Integer.toString(r15)
            r10.AudioAttributesImplBaseParcelizer = r15
            java.lang.String r15 = "application/x-mpegURL"
            r10.AudioAttributesImplApi21Parcelizer = r15
            r10.asBinder = r14
            r10.asInterface = r7
            r10.MediaBrowserCompat$SearchResultReceiver = r12
            r10.createFullyDrawnExecutor = r5
            r10.onConnected = r6
            r10.setInternalConnectionCallback = r9
            r10.RatingCompat = r13
            o.setMultiChoiceItems r5 = new o.setMultiChoiceItems
            r6 = 0
            r5.<init>(r10, r6)
            o.SupportMenuInflater$read r6 = new o.SupportMenuInflater$read
            r22 = r6
            r23 = r4
            r24 = r5
            r25 = r8
            r26 = r17
            r27 = r36
            r28 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r3.add(r6)
            r5 = r35
            java.lang.Object r6 = r5.get(r4)
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L_0x0217
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.put(r4, r6)
        L_0x0217:
            o.isEmptyConfiguration$asInterface r4 = new o.isEmptyConfiguration$asInterface
            r22 = r4
            r23 = r7
            r24 = r12
            r25 = r8
            r26 = r17
            r27 = r36
            r28 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r6.add(r4)
            r13 = r19
            r14 = r20
        L_0x0231:
            r2 = r5
            r12 = r21
            r7 = r29
            r9 = r30
            r6 = r31
            r5 = r32
            r4 = r33
            r8 = r34
            goto L_0x0038
        L_0x0242:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0248:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 4
            java.lang.String r2 = "#EXT-X-STREAM-INF must be followed by another line"
            r3 = 1
            r4 = 0
            r0.<init>(r2, r4, r3, r1)
            throw r0
        L_0x0253:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0259:
            r33 = r4
            r32 = r5
            r31 = r6
            r29 = r7
            r34 = r8
            r30 = r9
            r21 = r12
            r19 = r13
            r5 = r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2 = 0
        L_0x0275:
            int r6 = r3.size()
            if (r2 >= r6) goto L_0x02e7
            java.lang.Object r6 = r3.get(r2)
            o.SupportMenuInflater$read r6 = (o.SupportMenuInflater.read) r6
            android.net.Uri r7 = r6.RemoteActionCompatParcelizer
            boolean r7 = r0.add(r7)
            if (r7 == 0) goto L_0x02e4
            o.setMultiChoiceItems r7 = r6.asInterface
            o.updateStateFromTypedArray r7 = r7.getSavedStateRegistry
            if (r7 != 0) goto L_0x0291
            r7 = 1
            goto L_0x0292
        L_0x0291:
            r7 = 0
        L_0x0292:
            if (r7 == 0) goto L_0x02de
            android.net.Uri r7 = r6.RemoteActionCompatParcelizer
            o.isEmptyConfiguration r8 = new o.isEmptyConfiguration
            java.lang.Object r7 = r5.get(r7)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.List r7 = (java.util.List) r7
            r9 = 0
            r8.<init>(r9, r9, r7)
            r7 = 1
            o.updateStateFromTypedArray$RemoteActionCompatParcelizer[] r9 = new o.updateStateFromTypedArray.RemoteActionCompatParcelizer[r7]
            r7 = 0
            r9[r7] = r8
            o.updateStateFromTypedArray r8 = new o.updateStateFromTypedArray
            r8.<init>((o.updateStateFromTypedArray.RemoteActionCompatParcelizer[]) r9)
            o.setMultiChoiceItems r9 = r6.asInterface
            o.setMultiChoiceItems$RemoteActionCompatParcelizer r10 = new o.setMultiChoiceItems$RemoteActionCompatParcelizer
            r10.<init>(r9, r7)
            r10.MediaBrowserCompat$MediaItem = r8
            o.setMultiChoiceItems r8 = new o.setMultiChoiceItems
            r8.<init>(r10, r7)
            o.SupportMenuInflater$read r7 = new o.SupportMenuInflater$read
            android.net.Uri r9 = r6.RemoteActionCompatParcelizer
            java.lang.String r10 = r6.AudioAttributesImplApi21Parcelizer
            java.lang.String r12 = r6.onTransact
            java.lang.String r13 = r6.read
            java.lang.String r6 = r6.asBinder
            r22 = r7
            r23 = r9
            r24 = r8
            r25 = r10
            r26 = r12
            r27 = r13
            r28 = r6
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r4.add(r7)
            goto L_0x02e4
        L_0x02de:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02e4:
            int r2 = r2 + 1
            goto L_0x0275
        L_0x02e7:
            r0 = 0
            r8 = 0
            r9 = 0
        L_0x02ea:
            int r2 = r34.size()
            if (r0 >= r2) goto L_0x05ba
            r2 = r34
            java.lang.Object r5 = r2.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.util.regex.Pattern r6 = RatingCompat
            java.lang.String r6 = asInterface(r5, r6, r11)
            java.util.regex.Pattern r7 = addContentView
            java.lang.String r7 = asInterface(r5, r7, r11)
            o.setMultiChoiceItems$RemoteActionCompatParcelizer r10 = new o.setMultiChoiceItems$RemoteActionCompatParcelizer
            r10.<init>()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r13 = ":"
            r12.append(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            r10.AudioAttributesImplBaseParcelizer = r12
            r10.onConnectionSuspended = r7
            java.lang.String r12 = "application/x-mpegURL"
            r10.AudioAttributesImplApi21Parcelizer = r12
            java.util.regex.Pattern r12 = MediaBrowserCompat$ItemReceiver
            java.util.regex.Matcher r12 = r12.matcher(r5)
            boolean r13 = r12.find()
            if (r13 == 0) goto L_0x033d
            r13 = 1
            java.lang.String r12 = r12.group(r13)
            java.lang.String r15 = "YES"
            boolean r12 = r15.equals(r12)
            goto L_0x033f
        L_0x033d:
            r13 = 1
            r12 = 0
        L_0x033f:
            java.util.regex.Pattern r15 = MediaBrowserCompat$MediaItem
            java.util.regex.Matcher r15 = r15.matcher(r5)
            boolean r18 = r15.find()
            if (r18 == 0) goto L_0x0356
            java.lang.String r15 = r15.group(r13)
            java.lang.String r13 = "YES"
            boolean r13 = r13.equals(r15)
            goto L_0x0357
        L_0x0356:
            r13 = 0
        L_0x0357:
            if (r13 == 0) goto L_0x035b
            r12 = r12 | 2
        L_0x035b:
            java.util.regex.Pattern r13 = asInterface
            java.util.regex.Matcher r13 = r13.matcher(r5)
            boolean r15 = r13.find()
            if (r15 == 0) goto L_0x0373
            r15 = 1
            java.lang.String r13 = r13.group(r15)
            java.lang.String r15 = "YES"
            boolean r13 = r15.equals(r13)
            goto L_0x0374
        L_0x0373:
            r13 = 0
        L_0x0374:
            if (r13 == 0) goto L_0x0378
            r12 = r12 | 4
        L_0x0378:
            r10.PlaybackStateCompat$CustomAction = r12
            java.util.regex.Pattern r12 = AudioAttributesImplBaseParcelizer
            r13 = 0
            java.lang.String r12 = onTransact(r5, r12, r13, r11)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 == 0) goto L_0x0389
            r12 = 0
            goto L_0x03bc
        L_0x0389:
            java.lang.String r13 = ","
            r15 = -1
            java.lang.String[] r12 = r12.split(r13, r15)
            java.lang.String r13 = "public.accessibility.describes-video"
            boolean r13 = o.OnBackPressedDispatcher.Api33Impl.onTransact((java.lang.Object[]) r12, (java.lang.Object) r13)
            if (r13 == 0) goto L_0x039b
            r13 = 512(0x200, float:7.175E-43)
            goto L_0x039c
        L_0x039b:
            r13 = 0
        L_0x039c:
            java.lang.String r15 = "public.accessibility.transcribes-spoken-dialog"
            boolean r15 = o.OnBackPressedDispatcher.Api33Impl.onTransact((java.lang.Object[]) r12, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x03a6
            r13 = r13 | 4096(0x1000, float:5.74E-42)
        L_0x03a6:
            java.lang.String r15 = "public.accessibility.describes-music-and-sound"
            boolean r15 = o.OnBackPressedDispatcher.Api33Impl.onTransact((java.lang.Object[]) r12, (java.lang.Object) r15)
            if (r15 == 0) goto L_0x03b0
            r13 = r13 | 1024(0x400, float:1.435E-42)
        L_0x03b0:
            java.lang.String r15 = "public.easy-to-read"
            boolean r12 = o.OnBackPressedDispatcher.Api33Impl.onTransact((java.lang.Object[]) r12, (java.lang.Object) r15)
            if (r12 == 0) goto L_0x03bb
            r12 = r13 | 8192(0x2000, float:1.14794E-41)
            goto L_0x03bc
        L_0x03bb:
            r12 = r13
        L_0x03bc:
            r10.RatingCompat = r12
            java.util.regex.Pattern r12 = PlaybackStateCompat$CustomAction
            r13 = 0
            java.lang.String r12 = onTransact(r5, r12, r13, r11)
            r10.MediaBrowserCompat$CustomActionResultReceiver = r12
            java.util.regex.Pattern r12 = getDefaultViewModelProviderFactory
            java.lang.String r12 = onTransact(r5, r12, r13, r11)
            if (r12 != 0) goto L_0x03d1
            r12 = 0
            goto L_0x03d9
        L_0x03d1:
            java.lang.String r12 = o.setOnBackInvokedDispatcher.onTransact((java.lang.String) r1, (java.lang.String) r12)
            android.net.Uri r12 = android.net.Uri.parse(r12)
        L_0x03d9:
            r13 = 1
            o.updateStateFromTypedArray$RemoteActionCompatParcelizer[] r15 = new o.updateStateFromTypedArray.RemoteActionCompatParcelizer[r13]
            o.isEmptyConfiguration r13 = new o.isEmptyConfiguration
            java.util.List r1 = java.util.Collections.emptyList()
            r13.<init>(r6, r7, r1)
            r1 = 0
            r15[r1] = r13
            o.updateStateFromTypedArray r1 = new o.updateStateFromTypedArray
            r1.<init>((o.updateStateFromTypedArray.RemoteActionCompatParcelizer[]) r15)
            java.util.regex.Pattern r13 = getLifecycle
            java.lang.String r13 = asInterface(r5, r13, r11)
            r13.hashCode()
            int r15 = r13.hashCode()
            r34 = r2
            r2 = 2
            switch(r15) {
                case -959297733: goto L_0x041f;
                case -333210994: goto L_0x0415;
                case 62628790: goto L_0x040b;
                case 81665115: goto L_0x0401;
                default: goto L_0x0400;
            }
        L_0x0400:
            goto L_0x0429
        L_0x0401:
            java.lang.String r15 = "VIDEO"
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0429
            r13 = 3
            goto L_0x042a
        L_0x040b:
            java.lang.String r15 = "AUDIO"
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0429
            r13 = 2
            goto L_0x042a
        L_0x0415:
            java.lang.String r15 = "CLOSED-CAPTIONS"
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0429
            r13 = 1
            goto L_0x042a
        L_0x041f:
            java.lang.String r15 = "SUBTITLES"
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0429
            r13 = 0
            goto L_0x042a
        L_0x0429:
            r13 = -1
        L_0x042a:
            if (r13 == 0) goto L_0x055b
            r15 = 1
            if (r13 == r15) goto L_0x051a
            if (r13 == r2) goto L_0x0490
            r15 = 3
            if (r13 == r15) goto L_0x0437
        L_0x0434:
            r13 = r33
            goto L_0x0486
        L_0x0437:
            r5 = 0
        L_0x0438:
            int r13 = r3.size()
            if (r5 >= r13) goto L_0x0450
            java.lang.Object r13 = r3.get(r5)
            o.SupportMenuInflater$read r13 = (o.SupportMenuInflater.read) r13
            java.lang.String r15 = r13.AudioAttributesImplApi21Parcelizer
            boolean r15 = r6.equals(r15)
            if (r15 == 0) goto L_0x044d
            goto L_0x0451
        L_0x044d:
            int r5 = r5 + 1
            goto L_0x0438
        L_0x0450:
            r13 = 0
        L_0x0451:
            if (r13 == 0) goto L_0x046f
            o.setMultiChoiceItems r5 = r13.asInterface
            java.lang.String r13 = r5.addMenuProvider
            java.lang.String r2 = o.OnBackPressedDispatcher.Api33Impl.asBinder((java.lang.String) r13, (int) r2)
            r10.asBinder = r2
            java.lang.String r2 = o.createPopupWindow.asBinder(r2)
            r10.MediaMetadataCompat = r2
            int r2 = r5.onPictureInPictureModeChanged
            r10.createFullyDrawnExecutor = r2
            int r2 = r5.getFullyDrawnReporter
            r10.onConnected = r2
            float r2 = r5.addOnPictureInPictureModeChangedListener
            r10.setInternalConnectionCallback = r2
        L_0x046f:
            if (r12 == 0) goto L_0x0434
            r10.MediaBrowserCompat$MediaItem = r1
            o.SupportMenuInflater$RemoteActionCompatParcelizer r1 = new o.SupportMenuInflater$RemoteActionCompatParcelizer
            o.setMultiChoiceItems r2 = new o.setMultiChoiceItems
            r5 = 0
            r2.<init>(r10, r5)
            r1.<init>(r12, r2, r6, r7)
            r13 = r33
            r13.add(r1)
            r20 = r8
            goto L_0x048a
        L_0x0486:
            r20 = r8
            r33 = r13
        L_0x048a:
            r6 = r31
            r8 = r32
            goto L_0x0559
        L_0x0490:
            r13 = r33
            r15 = 0
        L_0x0493:
            int r2 = r3.size()
            if (r15 >= r2) goto L_0x04af
            java.lang.Object r2 = r3.get(r15)
            o.SupportMenuInflater$read r2 = (o.SupportMenuInflater.read) r2
            r20 = r8
            java.lang.String r8 = r2.onTransact
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x04aa
            goto L_0x04b2
        L_0x04aa:
            int r15 = r15 + 1
            r8 = r20
            goto L_0x0493
        L_0x04af:
            r20 = r8
            r2 = 0
        L_0x04b2:
            if (r2 == 0) goto L_0x04c4
            o.setMultiChoiceItems r8 = r2.asInterface
            java.lang.String r8 = r8.addMenuProvider
            r15 = 1
            java.lang.String r8 = o.OnBackPressedDispatcher.Api33Impl.asBinder((java.lang.String) r8, (int) r15)
            r10.asBinder = r8
            java.lang.String r8 = o.createPopupWindow.asBinder(r8)
            goto L_0x04c5
        L_0x04c4:
            r8 = 0
        L_0x04c5:
            java.util.regex.Pattern r15 = onConnected
            r33 = r13
            r13 = 0
            java.lang.String r5 = onTransact(r5, r15, r13, r11)
            if (r5 == 0) goto L_0x04f6
            java.lang.String r15 = "/"
            r13 = 2
            java.lang.String[] r13 = r5.split(r15, r13)
            r15 = 0
            r13 = r13[r15]
            int r13 = java.lang.Integer.parseInt(r13)
            r10.RemoteActionCompatParcelizer = r13
            java.lang.String r13 = "audio/eac3"
            boolean r13 = r13.equals(r8)
            if (r13 == 0) goto L_0x04f6
            java.lang.String r13 = "/JOC"
            boolean r5 = r5.endsWith(r13)
            if (r5 == 0) goto L_0x04f6
            java.lang.String r5 = "ec+3"
            r10.asBinder = r5
            java.lang.String r8 = "audio/eac3-joc"
        L_0x04f6:
            r10.MediaMetadataCompat = r8
            if (r12 == 0) goto L_0x050d
            r10.MediaBrowserCompat$MediaItem = r1
            o.SupportMenuInflater$RemoteActionCompatParcelizer r1 = new o.SupportMenuInflater$RemoteActionCompatParcelizer
            o.setMultiChoiceItems r2 = new o.setMultiChoiceItems
            r5 = 0
            r2.<init>(r10, r5)
            r1.<init>(r12, r2, r6, r7)
            r8 = r32
            r8.add(r1)
            goto L_0x0557
        L_0x050d:
            r8 = r32
            r5 = 0
            if (r2 == 0) goto L_0x0557
            o.setMultiChoiceItems r1 = new o.setMultiChoiceItems
            r1.<init>(r10, r5)
            r20 = r1
            goto L_0x0557
        L_0x051a:
            r20 = r8
            r8 = r32
            java.util.regex.Pattern r1 = MediaSessionCompat$QueueItem
            java.lang.String r1 = asInterface(r5, r1, r11)
            java.lang.String r2 = "CC"
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x0538
            r2 = 2
            java.lang.String r1 = r1.substring(r2)
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r2 = "application/cea-608"
            goto L_0x0543
        L_0x0538:
            r2 = 7
            java.lang.String r1 = r1.substring(r2)
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.String r2 = "application/cea-708"
        L_0x0543:
            if (r9 != 0) goto L_0x054a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x054a:
            r10.MediaMetadataCompat = r2
            r10.onTransact = r1
            o.setMultiChoiceItems r1 = new o.setMultiChoiceItems
            r2 = 0
            r1.<init>(r10, r2)
            r9.add(r1)
        L_0x0557:
            r6 = r31
        L_0x0559:
            r5 = 0
            goto L_0x05ae
        L_0x055b:
            r20 = r8
            r8 = r32
            r2 = 0
        L_0x0560:
            int r5 = r3.size()
            if (r2 >= r5) goto L_0x0578
            java.lang.Object r5 = r3.get(r2)
            o.SupportMenuInflater$read r5 = (o.SupportMenuInflater.read) r5
            java.lang.String r13 = r5.read
            boolean r13 = r6.equals(r13)
            if (r13 == 0) goto L_0x0575
            goto L_0x0579
        L_0x0575:
            int r2 = r2 + 1
            goto L_0x0560
        L_0x0578:
            r5 = 0
        L_0x0579:
            if (r5 == 0) goto L_0x058b
            o.setMultiChoiceItems r2 = r5.asInterface
            java.lang.String r2 = r2.addMenuProvider
            r5 = 3
            java.lang.String r2 = o.OnBackPressedDispatcher.Api33Impl.asBinder((java.lang.String) r2, (int) r5)
            r10.asBinder = r2
            java.lang.String r2 = o.createPopupWindow.asBinder(r2)
            goto L_0x058c
        L_0x058b:
            r2 = 0
        L_0x058c:
            if (r2 != 0) goto L_0x0590
            java.lang.String r2 = "text/vtt"
        L_0x0590:
            r10.MediaMetadataCompat = r2
            r10.MediaBrowserCompat$MediaItem = r1
            if (r12 == 0) goto L_0x05a7
            o.SupportMenuInflater$RemoteActionCompatParcelizer r1 = new o.SupportMenuInflater$RemoteActionCompatParcelizer
            o.setMultiChoiceItems r2 = new o.setMultiChoiceItems
            r5 = 0
            r2.<init>(r10, r5)
            r1.<init>(r12, r2, r6, r7)
            r6 = r31
            r6.add(r1)
            goto L_0x05ae
        L_0x05a7:
            r6 = r31
            r5 = 0
            java.lang.Object r1 = o.findMenuItemForSubmenu.read
            monitor-enter(r1)
            monitor-exit(r1)
        L_0x05ae:
            int r0 = r0 + 1
            r1 = r38
            r31 = r6
            r32 = r8
            r8 = r20
            goto L_0x02ea
        L_0x05ba:
            r20 = r8
            r6 = r31
            r8 = r32
            if (r14 == 0) goto L_0x05c7
            java.util.List r0 = java.util.Collections.emptyList()
            r9 = r0
        L_0x05c7:
            o.SupportMenuInflater r13 = new o.SupportMenuInflater
            r0 = r13
            r1 = r38
            r2 = r30
            r3 = r4
            r4 = r33
            r5 = r8
            r7 = r29
            r8 = r20
            r10 = r19
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser.onTransact(com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser$RemoteActionCompatParcelizer, java.lang.String):o.SupportMenuInflater");
    }

    private static isPowerSaveMode asBinder(String str, isPowerSaveMode.asBinder[] asbinderArr) {
        isPowerSaveMode.asBinder[] asbinderArr2 = new isPowerSaveMode.asBinder[asbinderArr.length];
        for (int i = 0; i < asbinderArr.length; i++) {
            isPowerSaveMode.asBinder asbinder = asbinderArr[i];
            asbinderArr2[i] = new isPowerSaveMode.asBinder(asbinder.RemoteActionCompatParcelizer, asbinder.asInterface, asbinder.read, (byte[]) null);
        }
        return new isPowerSaveMode(str, asbinderArr2);
    }

    private static isPowerSaveMode.asBinder RemoteActionCompatParcelizer(String str, String str2, Map<String, String> map) throws ParserException {
        String onTransact2 = onTransact(str, ParcelableVolumeInfo, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String asInterface2 = asInterface(str, getDefaultViewModelProviderFactory, map);
            return new isPowerSaveMode.asBinder(setOnBackInvokedDispatcher.AudioAttributesImplApi26Parcelizer, "video/mp4", Base64.decode(asInterface2.substring(asInterface2.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new isPowerSaveMode.asBinder(setOnBackInvokedDispatcher.AudioAttributesImplApi26Parcelizer, "hls", str.getBytes(preload.AudioAttributesCompatParcelizer));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(onTransact2)) {
                return null;
            }
            String asInterface3 = asInterface(str, getDefaultViewModelProviderFactory, map);
            return new isPowerSaveMode.asBinder(setOnBackInvokedDispatcher.asInterface, "video/mp4", onItemSelected.read(setOnBackInvokedDispatcher.asInterface, (UUID[]) null, Base64.decode(asInterface3.substring(asInterface3.indexOf(44)), 0)));
        }
    }

    private static String onTransact(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : RemoteActionCompatParcelizer(str2, map);
    }

    private static String RemoteActionCompatParcelizer(String str, Map<String, String> map) {
        Matcher matcher = getFullyDrawnReporter.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    static class RemoteActionCompatParcelizer {
        String asInterface;
        private final BufferedReader onTransact;
        private final Queue<String> read;

        public RemoteActionCompatParcelizer(Queue<String> queue, BufferedReader bufferedReader) {
            this.read = queue;
            this.onTransact = bufferedReader;
        }

        public final boolean asBinder() throws IOException {
            String trim;
            if (this.asInterface != null) {
                return true;
            }
            if (!this.read.isEmpty()) {
                this.asInterface = this.read.poll();
                return true;
            }
            do {
                String readLine = this.onTransact.readLine();
                this.asInterface = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.asInterface = trim;
            } while (trim.isEmpty());
            return true;
        }
    }

    private static String asInterface(String str, Pattern pattern, Map<String, String> map) throws ParserException {
        String onTransact2 = onTransact(str, pattern, (String) null, map);
        if (onTransact2 != null) {
            return onTransact2;
        }
        StringBuilder sb = new StringBuilder("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw new ParserException(sb.toString(), (Throwable) null, true, 4);
    }
}
