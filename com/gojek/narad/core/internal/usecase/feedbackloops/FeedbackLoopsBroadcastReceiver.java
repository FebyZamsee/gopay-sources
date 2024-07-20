package com.gojek.narad.core.internal.usecase.feedbackloops;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.core.app.NotificationManagerCompat;
import com.gojek.gopay.R;
import com.gojek.narad.core.sdk.NaradSdkImpl;
import dagger.Lazy;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricManager;
import o.InspectableProperty;
import o.RemoteActionCompatParcelizer;
import o.Size;
import o.Toolbar;
import o.TooltipCompatHandler;
import o.dispatchRestoreInstanceState;
import o.getCurrentContentInsetLeft;
import o.max;
import o.min;
import o.multiple;

public final class FeedbackLoopsBroadcastReceiver extends BroadcastReceiver {
    @getCurrentContentInsetLeft
    public Lazy<multiple> feedbackLoopsBroadcastHandler;

    public FeedbackLoopsBroadcastReceiver() {
        InspectableProperty.ValueType valueType;
        NaradSdkImpl.asBinder asbinder = NaradSdkImpl.asInterface;
        NaradSdkImpl onTransact = NaradSdkImpl.read;
        if (onTransact != null && (valueType = onTransact.asBinder) != null) {
            valueType.RemoteActionCompatParcelizer(this);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        Size size;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(intent, "");
        Lazy<multiple> lazy = this.feedbackLoopsBroadcastHandler;
        if (lazy != null) {
            if (lazy == null) {
                Intrinsics.asBinder("");
                lazy = null;
            }
            multiple multiple = lazy.get();
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(intent, "");
            max max = (max) intent.getParcelableExtra("feedback_data");
            int intExtra = intent.getIntExtra("notification_id", 0);
            if (max != null) {
                multiple.onTransact.read(new dispatchRestoreInstanceState.onConnected("Push Notification", max.asInterface, max.write, max.AudioAttributesImplApi21Parcelizer));
                Size.asInterface asinterface = Size.read;
                String str = max.AudioAttributesImplApi21Parcelizer;
                Intrinsics.checkNotNullParameter(str, "");
                if (Intrinsics.RemoteActionCompatParcelizer(str, "positive")) {
                    size = Size.read.onTransact;
                } else if (Intrinsics.RemoteActionCompatParcelizer(str, "negative")) {
                    size = Size.RemoteActionCompatParcelizer.onTransact;
                } else {
                    size = Size.asBinder.asBinder;
                }
                if (Intrinsics.RemoteActionCompatParcelizer(size, Size.read.onTransact)) {
                    Toast.makeText(context, context.getString(R.string.f20352131820726), 0).show();
                } else if (Intrinsics.RemoteActionCompatParcelizer(size, Size.RemoteActionCompatParcelizer.onTransact)) {
                    NotificationManagerCompat from = NotificationManagerCompat.from(context);
                    Intrinsics.checkNotNullExpressionValue(from, "");
                    from.cancel(intExtra);
                    Toast.makeText(context, context.getString(R.string.f20332131820718), 0).show();
                } else {
                    Intrinsics.RemoteActionCompatParcelizer(size, Size.asBinder.asBinder);
                }
                RemoteActionCompatParcelizer.onTransact.asInterface(multiple.read.onTransact, multiple.RemoteActionCompatParcelizer.asInterface(), (BiometricManager.DefaultInjector) null, new multiple.read(multiple, new min(Toolbar.ExpandedActionViewMenuPresenter.asBinder(max)), (TooltipCompatHandler<? super multiple.read>) null), 2);
            }
        }
    }
}
