package com.google.firebase.dynamiclinks;

import android.net.Uri;
import java.util.List;

public interface ShortDynamicLink {

    public interface Warning {
        String getMessage();
    }

    Uri getPreviewLink();

    Uri getShortLink();

    List<? extends Warning> getWarnings();
}
