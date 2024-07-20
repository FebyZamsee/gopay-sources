package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p001authapi.zbam;
import com.google.android.gms.internal.p001authapi.zbau;

public final class Identity {
    private Identity() {
    }

    public static CredentialSavingClient getCredentialSavingClient(Activity activity) {
        return new zbam((Activity) Preconditions.checkNotNull(activity), new zbc());
    }

    public static SignInClient getSignInClient(Activity activity) {
        return new zbau((Activity) Preconditions.checkNotNull(activity), new zbl());
    }

    public static CredentialSavingClient getCredentialSavingClient(Context context) {
        return new zbam((Context) Preconditions.checkNotNull(context), new zbc());
    }

    public static SignInClient getSignInClient(Context context) {
        return new zbau((Context) Preconditions.checkNotNull(context), new zbl());
    }
}
