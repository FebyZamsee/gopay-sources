package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class WorkSourceUtil {
    private static final int zza = Process.myUid();
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[SYNTHETIC, Splitter:B:23:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074 A[SYNTHETIC, Splitter:B:29:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a8 A[SYNTHETIC, Splitter:B:42:0x00a8] */
    static {
        /*
            java.lang.String r0 = "add"
            int r1 = android.os.Process.myUid()
            zza = r1
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0018 }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0018 }
            r4[r2] = r5     // Catch:{ Exception -> 0x0018 }
            java.lang.Class<android.os.WorkSource> r5 = android.os.WorkSource.class
            java.lang.reflect.Method r4 = r5.getMethod(r0, r4)     // Catch:{ Exception -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r4 = r3
        L_0x0019:
            zzb = r4
            boolean r4 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            r5 = 2
            if (r4 == 0) goto L_0x0033
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0033 }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0033 }
            r4[r2] = r6     // Catch:{ Exception -> 0x0033 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r4[r1] = r6     // Catch:{ Exception -> 0x0033 }
            java.lang.Class<android.os.WorkSource> r6 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = r6.getMethod(r0, r4)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0034
        L_0x0033:
            r0 = r3
        L_0x0034:
            zzc = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0041 }
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "size"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch:{ Exception -> 0x0041 }
            goto L_0x0042
        L_0x0041:
            r0 = r3
        L_0x0042:
            zzd = r0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0053 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0053 }
            r0[r2] = r4     // Catch:{ Exception -> 0x0053 }
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "get"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r0 = r3
        L_0x0054:
            zze = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastJellyBeanMR2()
            if (r0 == 0) goto L_0x006b
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x006b }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x006b }
            r0[r2] = r4     // Catch:{ Exception -> 0x006b }
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "getName"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch:{ Exception -> 0x006b }
            goto L_0x006c
        L_0x006b:
            r0 = r3
        L_0x006c:
            zzf = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L_0x007f
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x007f }
            java.lang.Class<android.os.WorkSource> r4 = android.os.WorkSource.class
            java.lang.String r6 = "createWorkChain"
            java.lang.reflect.Method r0 = r4.getMethod(r6, r0)     // Catch:{ Exception -> 0x007f }
            goto L_0x0080
        L_0x007f:
            r0 = r3
        L_0x0080:
            zzg = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x009f }
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x009f }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x009f }
            r4[r2] = r5     // Catch:{ Exception -> 0x009f }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch:{ Exception -> 0x009f }
            java.lang.String r5 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r5, r4)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a0
        L_0x009f:
            r0 = r3
        L_0x00a0:
            zzh = r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L_0x00b5
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00b5 }
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r4 = "isEmpty"
            java.lang.reflect.Method r3 = r2.getMethod(r4, r0)     // Catch:{ Exception -> 0x00b5 }
            r3.setAccessible(r1)     // Catch:{ Exception -> 0x00b5 }
        L_0x00b5:
            zzi = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.WorkSourceUtil.<clinit>():void");
    }

    private WorkSourceUtil() {
    }

    public static void add(WorkSource workSource, int i, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, new Object[]{Integer.valueOf(i), str});
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = zzb;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    public static WorkSource fromPackage(Context context, String str) {
        if (context == null || context.getPackageManager() == null || str == null) {
            return null;
        }
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo == null) {
                return null;
            }
            int i = applicationInfo.uid;
            WorkSource workSource = new WorkSource();
            add(workSource, i, str);
            return workSource;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        Method method;
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            return null;
        }
        int i = -1;
        try {
            ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
            if (applicationInfo != null) {
                i = applicationInfo.uid;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (i < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method2 = zzg;
        if (method2 == null || (method = zzh) == null) {
            add(workSource, i, str);
        } else {
            try {
                Object invoke = method2.invoke(workSource, new Object[0]);
                int i2 = zza;
                if (i != i2) {
                    method.invoke(invoke, new Object[]{Integer.valueOf(i), str});
                }
                method.invoke(invoke, new Object[]{Integer.valueOf(i2), str2});
            } catch (Exception unused2) {
            }
        }
        return workSource;
    }

    public static int get(WorkSource workSource, int i) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[]{Integer.valueOf(i)});
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }

    public static String getName(WorkSource workSource, int i) {
        Method method = zzf;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, new Object[]{Integer.valueOf(i)});
        } catch (Exception e) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            return null;
        }
    }

    public static List<String> getNames(WorkSource workSource) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            i = 0;
        } else {
            i = size(workSource);
        }
        if (i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                String name = getName(workSource, i2);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public static boolean hasWorkSourcePermission(Context context) {
        if (context == null || context.getPackageManager() == null || Wrappers.packageManager(context).checkPermission("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }

    public static boolean isEmpty(WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        if (size(workSource) == 0) {
            return true;
        }
        return false;
    }

    public static int size(WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        }
        return 0;
    }
}
