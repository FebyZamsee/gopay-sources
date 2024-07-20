package com.google.firebase.iid.internal;

import com.google.android.gms.tasks.Task;

public interface FirebaseInstanceIdInternal {

    public interface NewTokenListener {
    }

    void addNewTokenListener(NewTokenListener newTokenListener);

    String getToken();

    Task<String> getTokenTask();
}
