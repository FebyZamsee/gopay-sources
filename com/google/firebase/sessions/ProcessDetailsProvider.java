package com.google.firebase.sessions;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.Toolbar;
import o.Toolbar$Api33Impl$$ExternalSyntheticLambda0;

public final class ProcessDetailsProvider {
    public static final ProcessDetailsProvider INSTANCE = new ProcessDetailsProvider();

    private ProcessDetailsProvider() {
    }

    public final List<ProcessDetails> getAppProcessDetails(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            arrayList2.add(new ProcessDetails(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, Intrinsics.RemoteActionCompatParcelizer(runningAppProcessInfo.processName, str)));
        }
        return (List) arrayList2;
    }

    public final ProcessDetails getCurrentProcessDetails(Context context) {
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
            if (((ProcessDetails) obj).getPid() == myPid) {
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
        ProcessDetails processDetails = (ProcessDetails) obj;
        if (processDetails != null) {
            return processDetails;
        }
        return buildProcessDetails$default(this, getProcessName$com_google_firebase_firebase_sessions(), myPid, 0, false, 12, (Object) null);
    }

    static /* synthetic */ ProcessDetails buildProcessDetails$default(ProcessDetailsProvider processDetailsProvider, String str, int i, int i2, boolean z, int i3, Object obj) {
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

    private final ProcessDetails buildProcessDetails(String str, int i, int i2, boolean z) {
        return new ProcessDetails(str, i, i2, z);
    }

    public final String getProcessName$com_google_firebase_firebase_sessions() {
        String processName;
        if (Build.VERSION.SDK_INT >= 33) {
            String myProcessName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(myProcessName, "");
            return myProcessName;
        } else if (Build.VERSION.SDK_INT >= 28 && (processName = Application.getProcessName()) != null) {
            return processName;
        } else {
            String myProcessName2 = ProcessUtils.getMyProcessName();
            if (myProcessName2 != null) {
                return myProcessName2;
            }
            return "";
        }
    }
}
