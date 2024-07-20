package com.google.android.exoplayer2.offline;

import java.io.IOException;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.setActionProvider;
import o.updateNavigationIcon;

public final class DownloadHelper implements ActivityResultContracts.StartIntentSenderForResult.Companion {
    private final String AudioAttributesImplApi21Parcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String asBinder;
    private final String asInterface;
    private final String onTransact;
    private final String read;
    private final String write;

    public static class LiveContentUnsupportedException extends IOException {
    }

    public final String asBinder() {
        return "Notification Deeplink Format Incorrect";
    }

    static {
        setActionProvider.asBinder.read RemoteActionCompatParcelizer2 = new setActionProvider.asBinder.read(setActionProvider.asBinder.asBinder, (byte) 0).RemoteActionCompatParcelizer(true);
        RemoteActionCompatParcelizer2.AudioAttributesImplApi21Parcelizer = false;
        new setActionProvider.asBinder(RemoteActionCompatParcelizer2, (byte) 0);
    }

    public DownloadHelper(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AudioAttributesImplApi21Parcelizer = str;
        this.asBinder = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.read = str4;
        this.write = str5;
        this.onTransact = str6;
        this.asInterface = str7;
    }

    public final Map<String, Object> asInterface() {
        return updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("transactionId", this.AudioAttributesImplApi21Parcelizer), new Pair("notificationId", this.asBinder), new Pair("campaignName", this.RemoteActionCompatParcelizer), new Pair("campaignId", this.read), new Pair("notificationType", this.write), new Pair("displayType", this.onTransact), new Pair("deeplink", this.asInterface)});
    }
}
