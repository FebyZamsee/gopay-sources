package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import o.initTitle;
import o.isOverflowMenuShowPending;

public class AssetPackExtractionService extends Service {
    public isOverflowMenuShowPending read;

    public final IBinder onBind(Intent intent) {
        return this.read;
    }

    public final void onCreate() {
        super.onCreate();
        initTitle.RemoteActionCompatParcelizer(getApplicationContext()).asBinder(this);
    }
}
