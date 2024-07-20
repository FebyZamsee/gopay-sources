package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class zbn {
    private static zbn zbd;
    final Storage zba;
    GoogleSignInAccount zbb;
    GoogleSignInOptions zbc;

    private zbn(Context context) {
        Storage instance = Storage.getInstance(context);
        this.zba = instance;
        this.zbb = instance.getSavedDefaultGoogleSignInAccount();
        this.zbc = instance.getSavedDefaultGoogleSignInOptions();
    }

    public static zbn zbc(Context context) {
        zbn zbf;
        synchronized (zbn.class) {
            zbf = zbf(context.getApplicationContext());
        }
        return zbf;
    }

    private static zbn zbf(Context context) {
        synchronized (zbn.class) {
            zbn zbn = zbd;
            if (zbn != null) {
                return zbn;
            }
            zbn zbn2 = new zbn(context);
            zbd = zbn2;
            return zbn2;
        }
    }

    public final GoogleSignInAccount zba() {
        GoogleSignInAccount googleSignInAccount;
        synchronized (this) {
            googleSignInAccount = this.zbb;
        }
        return googleSignInAccount;
    }

    public final GoogleSignInOptions zbb() {
        GoogleSignInOptions googleSignInOptions;
        synchronized (this) {
            googleSignInOptions = this.zbc;
        }
        return googleSignInOptions;
    }

    public final void zbd() {
        synchronized (this) {
            this.zba.clear();
            this.zbb = null;
            this.zbc = null;
        }
    }

    public final void zbe(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        synchronized (this) {
            this.zba.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
            this.zbb = googleSignInAccount;
            this.zbc = googleSignInOptions;
        }
    }
}
