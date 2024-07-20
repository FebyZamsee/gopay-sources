package com.gojek.narad.core.internal.di.module;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.R;
import o.StringDef;
import o.StringRes;
import o.codename;
import o.getTintList;
import o.multiple;

public abstract class FeedbackLoopModule {
    private static Companion RemoteActionCompatParcelizer = new Companion((DefaultConstructorMarker) null);

    public static final multiple read(StringRes stringRes, getTintList gettintlist, R.integer integer, codename codename) {
        return RemoteActionCompatParcelizer.asBinder(stringRes, gettintlist, integer, codename);
    }

    public abstract StringRes RemoteActionCompatParcelizer(StringDef stringDef);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final multiple asBinder(StringRes stringRes, getTintList gettintlist, R.integer integer, codename codename) {
            Intrinsics.checkNotNullParameter(stringRes, "");
            Intrinsics.checkNotNullParameter(gettintlist, "");
            Intrinsics.checkNotNullParameter(integer, "");
            Intrinsics.checkNotNullParameter(codename, "");
            return new multiple(stringRes, gettintlist, integer, codename);
        }
    }
}
