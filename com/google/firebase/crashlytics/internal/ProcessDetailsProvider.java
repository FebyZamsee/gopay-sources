package com.google.firebase.crashlytics.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.Toolbar;
import o.Toolbar$Api33Impl$$ExternalSyntheticLambda0;

public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return buildProcessDetails$default(this, str, i, i2, false, 8, (Object) null);
    }

    private ProcessDetailsProvider() {
    }

    public final List<CrashlyticsReport.Session.Event.Application.ProcessDetails> getAppProcessDetails(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = Toolbar$Api33Impl$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer;
        }
        Iterable iterable = list;
        Intrinsics.checkNotNullParameter(iterable, "");
        Collection arrayList = new ArrayList();
        for (Object next : (List) Toolbar.ExpandedActionViewMenuPresenter.asBinder(iterable, new ArrayList())) {
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        Iterable<ActivityManager.RunningAppProcessInfo> iterable2 = (List) arrayList;
        Intrinsics.checkNotNullParameter(iterable2, "");
        Collection arrayList2 = new ArrayList(((Collection) iterable2).size());
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : iterable2) {
            arrayList2.add(CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(runningAppProcessInfo.processName).setPid(runningAppProcessInfo.pid).setImportance(runningAppProcessInfo.importance).setDefaultProcess(Intrinsics.RemoteActionCompatParcelizer(runningAppProcessInfo.processName, str)).build());
        }
        return (List) arrayList2;
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails getCurrentProcessDetails(Context context) {
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "");
        int myPid = Process.myPid();
        Iterator it = getAppProcessDetails(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((CrashlyticsReport.Session.Event.Application.ProcessDetails) obj).getPid() == myPid) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
        if (processDetails != null) {
            return processDetails;
        }
        return buildProcessDetails$default(this, getProcessName(), myPid, 0, false, 12, (Object) null);
    }

    public static /* synthetic */ CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return processDetailsProvider.buildProcessDetails(str, i, i2, z);
    }

    public final CrashlyticsReport.Session.Event.Application.ProcessDetails buildProcessDetails(String str, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        CrashlyticsReport.Session.Event.Application.ProcessDetails build = CrashlyticsReport.Session.Event.Application.ProcessDetails.builder().setProcessName(str).setPid(i).setImportance(i2).setDefaultProcess(z).build();
        Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    private final String getProcessName() {
        String processName;
        if (Build.VERSION.SDK_INT >= 33) {
            processName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "");
        } else if (Build.VERSION.SDK_INT < 28 || (processName = Application.getProcessName()) == null) {
            return "";
        }
        return processName;
    }
}
