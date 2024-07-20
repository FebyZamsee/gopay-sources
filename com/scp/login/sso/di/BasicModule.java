package com.scp.login.sso.di;

import com.google.gson.Gson;

public final class BasicModule {
    public final Gson read() {
        return new Gson();
    }
}
