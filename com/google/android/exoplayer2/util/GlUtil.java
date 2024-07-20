package com.google.android.exoplayer2.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.updateNavigationIcon;

public final class GlUtil implements ActivityResultContracts.StartIntentSenderForResult.Companion {
    private final String RemoteActionCompatParcelizer;
    private final String asBinder;
    private final String asInterface;
    private final String onTransact;
    private final String read;

    public final String asBinder() {
        return "Notification Type Incorrect";
    }

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    public static void onTransact() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append(10);
            }
            sb.append("glError: ");
            sb.append(GLU.gluErrorString(glGetError));
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString());
        }
    }

    public GlUtil(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.read = str;
        this.asInterface = str2;
        this.onTransact = str3;
        this.asBinder = str4;
        this.RemoteActionCompatParcelizer = str5;
    }

    public final Map<String, Object> asInterface() {
        return updateNavigationIcon.onTransact((Pair<? extends K, ? extends V>[]) new Pair[]{new Pair("transactionId", this.read), new Pair("notificationId", this.asInterface), new Pair("campaignName", this.onTransact), new Pair("campaignId", this.asBinder), new Pair("notificationType", this.RemoteActionCompatParcelizer)});
    }
}
