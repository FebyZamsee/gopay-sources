package com.appsflyer.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.BiometricFragment;

public final class AFc1gSDK {
    public static final List<StackTraceElement> values(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        StackTraceElement[] stackTrace = th.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        Collection arrayList = new ArrayList();
        for (Object obj : (Object[]) stackTrace) {
            StackTraceElement stackTraceElement = (StackTraceElement) obj;
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "");
            if (!BiometricFragment.AnonymousClass5.RemoteActionCompatParcelizer(className, "com.appsflyer", false)) {
                stackTraceElement = null;
            }
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
        }
        return (List) arrayList;
    }
}
