package com.gojek.narad.core.internal.di.module;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

public final class DataModule {
    static {
        new DataModule();
    }

    private DataModule() {
    }

    public static final SharedPreferences asBinder(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("nid_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return sharedPreferences;
    }

    public static final SharedPreferences onTransact(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("feedback_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return sharedPreferences;
    }

    public static final SharedPreferences read(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        SharedPreferences sharedPreferences = context.getSharedPreferences("notif_preferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        return sharedPreferences;
    }
}
