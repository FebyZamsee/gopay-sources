package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.ImageFormat;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;
import o.onItemClicked;

public class DevelopmentPlatformProvider {
    private static int asBinder = 0;
    private static int onTransact = 1;
    /* access modifiers changed from: private */
    public final Context context;
    private DevelopmentPlatform developmentPlatform = null;

    public DevelopmentPlatformProvider(Context context2) {
        this.context = context2;
    }

    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }

    /* access modifiers changed from: private */
    public boolean assetFileExists(String str) {
        int i = onTransact + 79;
        asBinder = i % 128;
        int i2 = i % 2;
        try {
            if ((this.context.getAssets() == null ? 8 : '`') != '`') {
                return false;
            }
            try {
                AssetManager assets = this.context.getAssets();
                Object[] objArr = new Object[2];
                objArr[1] = str;
                objArr[0] = assets;
                InputStream inputStream = (InputStream) ((Class) onItemClicked.onTransact((char) (51419 - MotionEvent.axisFromString("")), (ViewConfiguration.getLongPressTimeout() >> 16) + 19, -1 - ImageFormat.getBitsPerPixel(0))).getMethod("read", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
                if ((inputStream != null ? '#' : 21) != 21) {
                    int i3 = asBinder + 123;
                    onTransact = i3 % 128;
                    int i4 = i3 % 2;
                    inputStream.close();
                }
                return true;
            } catch (IOException unused) {
                return false;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    class DevelopmentPlatform {
        /* access modifiers changed from: private */
        public final String developmentPlatform;
        /* access modifiers changed from: private */
        public final String developmentPlatformVersion;

        private DevelopmentPlatform() {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.context, "com.google.firebase.crashlytics.unity_version", "string");
            if (resourcesIdentifier != 0) {
                this.developmentPlatform = "Unity";
                String string = DevelopmentPlatformProvider.this.context.getResources().getString(resourcesIdentifier);
                this.developmentPlatformVersion = string;
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Unity Editor version is: ");
                sb.append(string);
                logger.v(sb.toString());
            } else if (DevelopmentPlatformProvider.this.assetFileExists("flutter_assets/NOTICES.Z")) {
                this.developmentPlatform = "Flutter";
                this.developmentPlatformVersion = null;
                Logger.getLogger().v("Development platform is: Flutter");
            } else {
                this.developmentPlatform = null;
                this.developmentPlatformVersion = null;
            }
        }
    }
}
