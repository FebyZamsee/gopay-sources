package com.appsflyer.internal;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.internal.AFg1wSDK;

public final /* synthetic */ class AFg1wSDK$3$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ AFg1wSDK.AnonymousClass3 f$0;
    public final /* synthetic */ InstallReferrerClient f$1;
    public final /* synthetic */ Context f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ AFg1wSDK$3$$ExternalSyntheticLambda0(AFg1wSDK.AnonymousClass3 r1, InstallReferrerClient installReferrerClient, Context context, int i) {
        this.f$0 = r1;
        this.f$1 = installReferrerClient;
        this.f$2 = context;
        this.f$3 = i;
    }

    public final void run() {
        this.f$0.m57lambda$onInstallReferrerSetupFinished$0$comappsflyerinternalAFg1wSDK$3(this.f$1, this.f$2, this.f$3);
    }
}
