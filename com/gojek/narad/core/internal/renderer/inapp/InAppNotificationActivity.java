package com.gojek.narad.core.internal.renderer.inapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.gojek.narad.core.contracts.data.NotificationPayload;
import com.gojek.narad.core.internal.RedirectionActivity;
import com.gojek.narad.core.sdk.NaradSdkImpl;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityResultContracts;
import o.DeprecatedSinceApi;
import o.InspectableProperty;
import o.dispatchRestoreInstanceState;
import o.getCurrentContentInsetLeft;
import o.getMinHeight;
import o.lambda;
import o.message;
import o.setOnBackInvokedDispatcher;

public final class InAppNotificationActivity extends AppCompatActivity {
    public static final read read = new read((DefaultConstructorMarker) null);
    private NotificationPayload RemoteActionCompatParcelizer;
    @getCurrentContentInsetLeft
    public message analyticsHandler;
    private lambda asInterface;
    @getCurrentContentInsetLeft
    public ActivityResultContracts.StartActivityForResult clientAppDetailsFetcher;
    @getCurrentContentInsetLeft
    public ActivityResultContracts.TakePicturePreview imageLoader;

    public final void onCreate(Bundle bundle) {
        InspectableProperty.ValueType valueType;
        super.onCreate(bundle);
        lambda asInterface2 = lambda.asInterface(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(asInterface2, "");
        this.asInterface = asInterface2;
        setContentView(asInterface2.asInterface);
        NaradSdkImpl.asBinder asbinder = NaradSdkImpl.asInterface;
        NaradSdkImpl onTransact = NaradSdkImpl.read;
        if (!(onTransact == null || (valueType = onTransact.asBinder) == null)) {
            valueType.onTransact(this);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("notification_payload");
        this.RemoteActionCompatParcelizer = serializableExtra instanceof NotificationPayload ? (NotificationPayload) serializableExtra : null;
        onTransact();
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra("notification_payload") : null;
        this.RemoteActionCompatParcelizer = serializableExtra instanceof NotificationPayload ? (NotificationPayload) serializableExtra : null;
        lambda lambda = this.asInterface;
        if (lambda == null) {
            Intrinsics.asBinder("");
            lambda = null;
        }
        lambda.read.setImageDrawable((Drawable) null);
        onTransact();
    }

    private final void onTransact() {
        float f;
        if (this.RemoteActionCompatParcelizer == null) {
            finish();
        }
        if (this.clientAppDetailsFetcher == null) {
            Intrinsics.asBinder("");
        }
        lambda lambda = this.asInterface;
        String str = null;
        if (lambda == null) {
            Intrinsics.asBinder("");
            lambda = null;
        }
        lambda.asBinder.setImageResource(17301560);
        lambda lambda2 = this.asInterface;
        if (lambda2 == null) {
            Intrinsics.asBinder("");
            lambda2 = null;
        }
        lambda2.asBinder.setOnClickListener(new dispatchRestoreInstanceState.asBinder(this));
        lambda lambda3 = this.asInterface;
        if (lambda3 == null) {
            Intrinsics.asBinder("");
            lambda3 = null;
        }
        lambda3.read.setOnClickListener(new dispatchRestoreInstanceState.asInterface(this));
        try {
            NotificationPayload notificationPayload = this.RemoteActionCompatParcelizer;
            Intrinsics.onTransact((Object) notificationPayload);
            float parseFloat = Float.parseFloat(setOnBackInvokedDispatcher.asInterface(notificationPayload, "imageHeight"));
            NotificationPayload notificationPayload2 = this.RemoteActionCompatParcelizer;
            Intrinsics.onTransact((Object) notificationPayload2);
            f = parseFloat / Float.parseFloat(setOnBackInvokedDispatcher.asInterface(notificationPayload2, "imageWidth"));
        } catch (NumberFormatException unused) {
            getMinHeight.onTransact((Throwable) new IllegalStateException("NARAD SDK: InApp image dimensions not found"));
            finish();
            f = 0.0f;
        }
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Size size = new Size(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int i = (int) (Resources.getSystem().getDisplayMetrics().density * 40.0f);
        lambda lambda4 = this.asInterface;
        if (lambda4 == null) {
            Intrinsics.asBinder("");
            lambda4 = null;
        }
        ViewGroup.LayoutParams layoutParams = lambda4.read.getLayoutParams();
        Intrinsics.onTransact((Object) layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        int i2 = i << 1;
        int width = size.getWidth() - i2;
        if ((((float) size.getWidth()) * f) - ((float) i2) > ((float) size.getHeight())) {
            layoutParams2.width = ((int) (((float) size.getHeight()) / f)) - i2;
            layoutParams2.height = size.getHeight() - i2;
        } else {
            layoutParams2.width = width;
            layoutParams2.height = (int) (f * ((float) width));
        }
        lambda lambda5 = this.asInterface;
        if (lambda5 == null) {
            Intrinsics.asBinder("");
            lambda5 = null;
        }
        lambda5.read.setLayoutParams(layoutParams2);
        lambda lambda6 = this.asInterface;
        if (lambda6 == null) {
            Intrinsics.asBinder("");
            lambda6 = null;
        }
        lambda6.asBinder.getLayoutParams();
        NotificationPayload notificationPayload3 = this.RemoteActionCompatParcelizer;
        if (notificationPayload3 != null) {
            str = setOnBackInvokedDispatcher.asInterface(notificationPayload3, "sdkMediaURL");
        }
        if (str != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new dispatchRestoreInstanceState.RemoteActionCompatParcelizer(this, str), 200);
        } else {
            finish();
        }
    }

    public static final class read {
        public /* synthetic */ read(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private read() {
        }
    }

    public static /* synthetic */ void onTransact(InAppNotificationActivity inAppNotificationActivity) {
        Intrinsics.checkNotNullParameter(inAppNotificationActivity, "");
        NotificationPayload notificationPayload = inAppNotificationActivity.RemoteActionCompatParcelizer;
        if (notificationPayload != null) {
            message message = inAppNotificationActivity.analyticsHandler;
            if (message == null) {
                Intrinsics.asBinder("");
                message = null;
            }
            message.onTransact(notificationPayload, DeprecatedSinceApi.IMAGE);
        }
        NotificationPayload notificationPayload2 = inAppNotificationActivity.RemoteActionCompatParcelizer;
        if (notificationPayload2 != null) {
            RedirectionActivity.onTransact ontransact = RedirectionActivity.asBinder;
            Context context = inAppNotificationActivity;
            String asInterface2 = setOnBackInvokedDispatcher.asInterface(notificationPayload2, "deeplink");
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(asInterface2, "");
            Intrinsics.checkNotNullParameter(notificationPayload2, "");
            Intent intent = new Intent(context, RedirectionActivity.class);
            intent.putExtra("deeplink", asInterface2);
            intent.putExtra("payload", notificationPayload2);
            context.startActivity(intent);
            inAppNotificationActivity.finish();
        }
    }

    public static /* synthetic */ void read(InAppNotificationActivity inAppNotificationActivity) {
        Intrinsics.checkNotNullParameter(inAppNotificationActivity, "");
        NotificationPayload notificationPayload = inAppNotificationActivity.RemoteActionCompatParcelizer;
        if (notificationPayload != null) {
            message message = inAppNotificationActivity.analyticsHandler;
            if (message == null) {
                Intrinsics.asBinder("");
                message = null;
            }
            message.onTransact(notificationPayload, DeprecatedSinceApi.CROSS);
        }
        inAppNotificationActivity.finish();
    }

    public static /* synthetic */ void asInterface(InAppNotificationActivity inAppNotificationActivity, String str) {
        Intrinsics.checkNotNullParameter(inAppNotificationActivity, "");
        ActivityResultContracts.TakePicturePreview takePicturePreview = inAppNotificationActivity.imageLoader;
        message message = null;
        if (takePicturePreview == null) {
            Intrinsics.asBinder("");
            takePicturePreview = null;
        }
        lambda lambda = inAppNotificationActivity.asInterface;
        if (lambda == null) {
            Intrinsics.asBinder("");
            lambda = null;
        }
        ImageView imageView = lambda.read;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        if (inAppNotificationActivity.clientAppDetailsFetcher == null) {
            Intrinsics.asBinder("");
        }
        takePicturePreview.asInterface(str, imageView);
        NotificationPayload notificationPayload = inAppNotificationActivity.RemoteActionCompatParcelizer;
        if (notificationPayload != null) {
            message message2 = inAppNotificationActivity.analyticsHandler;
            if (message2 != null) {
                message = message2;
            } else {
                Intrinsics.asBinder("");
            }
            Intrinsics.checkNotNullParameter(notificationPayload, "");
            message.asBinder.read(new MediaCodecRenderer.asBinder(setOnBackInvokedDispatcher.asInterface(notificationPayload, "sdkCampaignID"), setOnBackInvokedDispatcher.asInterface(notificationPayload, "sdkCampaignName"), setOnBackInvokedDispatcher.asInterface(notificationPayload, "sdkPNType")));
        }
    }
}
