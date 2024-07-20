package com.gojek.narad.core.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.gojek.narad.core.contracts.data.NotificationPayload;
import com.gojek.narad.core.sdk.NaradSdkImpl;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InspectableProperty;
import o.Px;
import o.backward;
import o.findMenuItemForSubmenu;
import o.getCurrentContentInsetLeft;
import o.getMinHeight;
import o.message;
import o.setOnBackInvokedDispatcher;

public final class RedirectionActivity extends AppCompatActivity {
    public static final onTransact asBinder = new onTransact((DefaultConstructorMarker) null);
    @getCurrentContentInsetLeft
    public Px notificationClientDetailsResolver;
    @getCurrentContentInsetLeft
    public message sdkAnalyticsHandler;

    public final void onCreate(Bundle bundle) {
        InspectableProperty.ValueType valueType;
        super.onCreate(bundle);
        NaradSdkImpl.asBinder asbinder = NaradSdkImpl.asInterface;
        NaradSdkImpl onTransact2 = NaradSdkImpl.read;
        if (!(onTransact2 == null || (valueType = onTransact2.asBinder) == null)) {
            valueType.asBinder(this);
        }
        Intent intent = getIntent();
        Serializable serializable = null;
        String stringExtra = intent != null ? intent.getStringExtra("deeplink") : null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("payload");
        }
        if (stringExtra != null) {
            setOnBackInvokedDispatcher.onTransact(stringExtra, (Function1<? super String, Unit>) new asInterface(this, serializable, stringExtra));
        }
        finish();
    }

    static final class asInterface extends backward implements Function1<String, Unit> {
        private /* synthetic */ Serializable asBinder;
        private /* synthetic */ String asInterface;
        private /* synthetic */ RedirectionActivity onTransact;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        asInterface(RedirectionActivity redirectionActivity, Serializable serializable, String str) {
            super(1);
            this.onTransact = redirectionActivity;
            this.asBinder = serializable;
            this.asInterface = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Intrinsics.checkNotNullParameter((String) obj, "");
            RedirectionActivity.asBinder(this.onTransact, this.asBinder);
            try {
                RedirectionActivity redirectionActivity = this.onTransact;
                redirectionActivity.startActivity(RedirectionActivity.RemoteActionCompatParcelizer(redirectionActivity, this.asInterface));
            } catch (ActivityNotFoundException e) {
                getMinHeight.onTransact((Throwable) e);
                Px px = null;
                if (this.asBinder instanceof NotificationPayload) {
                    message message = this.onTransact.sdkAnalyticsHandler;
                    if (message == null) {
                        Intrinsics.asBinder("");
                        message = null;
                    }
                    message.onTransact((NotificationPayload) this.asBinder);
                }
                RedirectionActivity redirectionActivity2 = this.onTransact;
                Px px2 = redirectionActivity2.notificationClientDetailsResolver;
                if (px2 != null) {
                    px = px2;
                } else {
                    Intrinsics.asBinder("");
                }
                redirectionActivity2.startActivity(RedirectionActivity.RemoteActionCompatParcelizer(redirectionActivity2, px.asBinder.onTransact()));
            }
            return Unit.asInterface;
        }
    }

    public static final class onTransact {
        public /* synthetic */ onTransact(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onTransact() {
        }
    }

    public static final /* synthetic */ Intent RemoteActionCompatParcelizer(RedirectionActivity redirectionActivity, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setPackage(redirectionActivity.getPackageName());
        return intent;
    }

    public static final /* synthetic */ void asBinder(RedirectionActivity redirectionActivity, Serializable serializable) {
        String str;
        String str2;
        if (serializable instanceof NotificationPayload) {
            try {
                message message = redirectionActivity.sdkAnalyticsHandler;
                if (message == null) {
                    Intrinsics.asBinder("");
                    message = null;
                }
                NotificationPayload notificationPayload = (NotificationPayload) serializable;
                Intrinsics.checkNotNullParameter(notificationPayload, "");
                String notificationId = notificationPayload.getNotificationId();
                if (notificationId == null) {
                    str = "";
                } else {
                    str = notificationId;
                }
                String title = notificationPayload.getTitle();
                if (title == null) {
                    str2 = "";
                } else {
                    str2 = title;
                }
                message.asBinder.read(new findMenuItemForSubmenu(str, setOnBackInvokedDispatcher.asInterface(notificationPayload, "sdkCampaignName"), setOnBackInvokedDispatcher.asInterface(notificationPayload, "sdkCampaignID"), str2, setOnBackInvokedDispatcher.asInterface(notificationPayload, "sdkPNType"), (String) null, 32, (DefaultConstructorMarker) null));
            } catch (Exception unused) {
            }
        }
    }
}
