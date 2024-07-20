package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Logger;
import o.AppCompatImageButton;
import o.setHomeButtonEnabled;
import o.setImageLevel;
import o.setImageResource;

public class CycleDetectingLockFactory {

    static class asBinder {
    }

    static {
        new setImageResource().RemoteActionCompatParcelizer(setImageLevel.setInternalConnectionCallback.onTransact).onTransact();
        Logger.getLogger(CycleDetectingLockFactory.class.getName());
        new ThreadLocal<ArrayList<asBinder>>() {
            /* access modifiers changed from: protected */
            public final /* synthetic */ Object initialValue() {
                setHomeButtonEnabled.onTransact.asBinder(3, "initialArraySize");
                return new ArrayList(3);
            }
        };
    }

    static class read extends IllegalStateException {
        static {
            AppCompatImageButton.asInterface(CycleDetectingLockFactory.class.getName(), read.class.getName(), asBinder.class.getName());
        }
    }

    public static final class PotentialDeadlockException extends read {
        private final read onTransact;

        public final String getMessage() {
            StringBuilder sb = new StringBuilder((String) Objects.requireNonNull(super.getMessage()));
            for (Throwable th = this.onTransact; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }
}
