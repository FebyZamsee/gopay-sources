package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    public static final int LOCAL = -1;
    public static final int NONE = 0;
    public static final int NO_SELECTION = 0;
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION = new zzi();
    public static final VersionPolicy PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING = new zzj();
    public static final VersionPolicy PREFER_HIGHEST_OR_REMOTE_VERSION = new zzk();
    public static final VersionPolicy PREFER_LOCAL = new zzg();
    public static final VersionPolicy PREFER_REMOTE = new zzf();
    public static final VersionPolicy PREFER_REMOTE_VERSION_NO_FORCE_STAGING = new zzh();
    public static final int REMOTE = 1;
    public static final VersionPolicy zza = new zzl();
    private static Boolean zzb = null;
    private static String zzc = null;
    private static boolean zzd = false;
    private static int zze = -1;
    private static Boolean zzf;
    private static final ThreadLocal zzg = new ThreadLocal();
    private static final ThreadLocal zzh = new zzd();
    private static final VersionPolicy.IVersions zzi = new zze();
    private static zzq zzk;
    private static zzr zzl;
    private final Context zzj;

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class LoadingException extends Exception {
        /* synthetic */ LoadingException(String str, zzp zzp) {
            super(str);
        }

        /* synthetic */ LoadingException(String str, Throwable th, zzp zzp) {
            super(str, th);
        }
    }

    public interface VersionPolicy {

        public interface IVersions {
            int zza(Context context, String str);

            int zzb(Context context, String str, boolean z) throws LoadingException;
        }

        public static class SelectionResult {
            public int localVersion = 0;
            public int remoteVersion = 0;
            public int selection = 0;
        }

        SelectionResult selectModule(Context context, String str, IVersions iVersions) throws LoadingException;
    }

    private DynamiteModule(Context context) {
        Preconditions.checkNotNull(context);
        this.zzj = context;
    }

    public static int getLocalVersion(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (Objects.equal(declaredField.get((Object) null), str)) {
                return declaredField2.getInt((Object) null);
            }
            declaredField.get((Object) null);
            return 0;
        } catch (ClassNotFoundException unused) {
            return 0;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

    public static int getRemoteVersion(Context context, String str) {
        return zza(context, str, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:156:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0252  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.dynamite.DynamiteModule load(android.content.Context r20, com.google.android.gms.dynamite.DynamiteModule.VersionPolicy r21, java.lang.String r22) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r1 = r20
            r2 = r21
            r3 = r22
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            java.lang.ThreadLocal r0 = zzg
            java.lang.Object r5 = r0.get()
            com.google.android.gms.dynamite.zzn r5 = (com.google.android.gms.dynamite.zzn) r5
            com.google.android.gms.dynamite.zzn r6 = new com.google.android.gms.dynamite.zzn
            r7 = 0
            r6.<init>(r7)
            r0.set(r6)
            java.lang.ThreadLocal r8 = zzh
            java.lang.Object r9 = r8.get()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            r11 = 0
            long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0239 }
            java.lang.Long r13 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0239 }
            r8.set(r13)     // Catch:{ all -> 0x0239 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions r13 = zzi     // Catch:{ all -> 0x0239 }
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r13 = r2.selectModule(r1, r3, r13)     // Catch:{ all -> 0x0239 }
            int r14 = r13.localVersion     // Catch:{ all -> 0x0239 }
            int r14 = r13.remoteVersion     // Catch:{ all -> 0x0239 }
            int r14 = r13.selection     // Catch:{ all -> 0x0239 }
            if (r14 == 0) goto L_0x0207
            r15 = -1
            if (r14 != r15) goto L_0x0048
            int r14 = r13.localVersion     // Catch:{ all -> 0x0239 }
            if (r14 == 0) goto L_0x0207
            r14 = -1
        L_0x0048:
            r7 = 1
            if (r14 != r7) goto L_0x004f
            int r7 = r13.remoteVersion     // Catch:{ all -> 0x0239 }
            if (r7 == 0) goto L_0x0207
        L_0x004f:
            if (r14 != r15) goto L_0x006f
            com.google.android.gms.dynamite.DynamiteModule r1 = zzc(r1, r3)     // Catch:{ all -> 0x0239 }
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x005d
            r8.remove()
            goto L_0x0064
        L_0x005d:
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r8.set(r2)
        L_0x0064:
            android.database.Cursor r2 = r6.zza
            if (r2 == 0) goto L_0x006b
            r2.close()
        L_0x006b:
            r0.set(r5)
            return r1
        L_0x006f:
            r7 = 1
            if (r14 != r7) goto L_0x01f2
            int r7 = r13.remoteVersion     // Catch:{ LoadingException -> 0x01aa }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            boolean r18 = zzf(r20)     // Catch:{ all -> 0x018b }
            if (r18 == 0) goto L_0x0182
            java.lang.Boolean r18 = zzb     // Catch:{ all -> 0x018b }
            monitor-exit(r4)
            if (r18 == 0) goto L_0x0179
            boolean r18 = r18.booleanValue()     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            r15 = 2
            if (r18 == 0) goto L_0x00fe
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamite.zzr r14 = zzl     // Catch:{ all -> 0x00fa }
            monitor-exit(r4)
            if (r14 == 0) goto L_0x00f1
            java.lang.Object r19 = r0.get()     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            r11 = r19
            com.google.android.gms.dynamite.zzn r11 = (com.google.android.gms.dynamite.zzn) r11     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            if (r11 == 0) goto L_0x00e8
            android.database.Cursor r12 = r11.zza     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            if (r12 == 0) goto L_0x00e8
            android.content.Context r12 = r20.getApplicationContext()     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            android.database.Cursor r11 = r11.zza     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            r16 = 0
            com.google.android.gms.dynamic.ObjectWrapper.wrap(r16)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            monitor-enter(r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            int r2 = zze     // Catch:{ all -> 0x00e4 }
            if (r2 < r15) goto L_0x00ae
            r17 = 1
            goto L_0x00b0
        L_0x00ae:
            r17 = 0
        L_0x00b0:
            monitor-exit(r4)
            if (r17 == 0) goto L_0x00c0
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r14.zzf(r2, r3, r7, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            goto L_0x00cc
        L_0x00c0:
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r12)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r14.zze(r2, r3, r7, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x00cc:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            if (r2 == 0) goto L_0x00db
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            goto L_0x014b
        L_0x00db:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            java.lang.String r2 = "Failed to get module context"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x00e4:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)
            throw r2     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x00e8:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            java.lang.String r2 = "No result cursor"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x00f1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            java.lang.String r2 = "DynamiteLoaderV2 was not cached."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x00fa:
            r0 = move-exception
            r2 = r0
            monitor-exit(r4)
            throw r2     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x00fe:
            com.google.android.gms.dynamite.zzq r2 = zzg(r20)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            if (r2 == 0) goto L_0x0170
            int r4 = r2.zze()     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            r11 = 3
            if (r4 < r11) goto L_0x012b
            java.lang.Object r4 = r0.get()     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamite.zzn r4 = (com.google.android.gms.dynamite.zzn) r4     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            if (r4 == 0) goto L_0x0122
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            android.database.Cursor r4 = r4.zza     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzi(r11, r3, r7, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            goto L_0x013e
        L_0x0122:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            java.lang.String r2 = "No cached result cursor holder"
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x012b:
            if (r4 != r15) goto L_0x0136
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzj(r4, r3, r7)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            goto L_0x013e
        L_0x0136:
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r20)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            com.google.android.gms.dynamic.IObjectWrapper r2 = r2.zzh(r4, r3, r7)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x013e:
            java.lang.Object r2 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r2)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            if (r2 == 0) goto L_0x0167
            com.google.android.gms.dynamite.DynamiteModule r4 = new com.google.android.gms.dynamite.DynamiteModule     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            android.content.Context r2 = (android.content.Context) r2     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x014b:
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0155
            r8.remove()
            goto L_0x015c
        L_0x0155:
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r8.set(r1)
        L_0x015c:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x0163
            r1.close()
        L_0x0163:
            r0.set(r5)
            return r4
        L_0x0167:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            java.lang.String r2 = "Failed to load remote module."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x0170:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            java.lang.String r2 = "Failed to create IDynamiteLoader."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x0179:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            java.lang.String r2 = "Failed to determine which loading route to use."
            r4 = 0
            r0.<init>(r2, r4)     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x0182:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x018b }
            java.lang.String r2 = "Remote loading disabled"
            r7 = 0
            r0.<init>(r2, r7)     // Catch:{ all -> 0x018b }
            throw r0     // Catch:{ all -> 0x018b }
        L_0x018b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0     // Catch:{ RemoteException -> 0x0192, LoadingException -> 0x0190, all -> 0x018e }
        L_0x018e:
            r0 = move-exception
            goto L_0x0194
        L_0x0190:
            r0 = move-exception
            goto L_0x01a0
        L_0x0192:
            r0 = move-exception
            goto L_0x01a1
        L_0x0194:
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r1, r0)     // Catch:{ all -> 0x0235 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0235 }
            java.lang.String r4 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r4, r0, r7)     // Catch:{ all -> 0x0235 }
            throw r2     // Catch:{ all -> 0x0235 }
        L_0x01a0:
            throw r0     // Catch:{ all -> 0x0235 }
        L_0x01a1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r2 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x0235 }
            java.lang.String r4 = "Failed to load remote module."
            r7 = 0
            r2.<init>(r4, r0, r7)     // Catch:{ all -> 0x0235 }
            throw r2     // Catch:{ all -> 0x0235 }
        L_0x01aa:
            r0 = move-exception
            r0.getMessage()     // Catch:{  }
            int r2 = r13.localVersion     // Catch:{  }
            if (r2 == 0) goto L_0x01e9
            com.google.android.gms.dynamite.zzo r4 = new com.google.android.gms.dynamite.zzo     // Catch:{  }
            r7 = 0
            r4.<init>(r2, r7)     // Catch:{  }
            r2 = r21
            com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$SelectionResult r2 = r2.selectModule(r1, r3, r4)     // Catch:{  }
            int r2 = r2.selection     // Catch:{  }
            r4 = -1
            if (r2 != r4) goto L_0x01e9
            com.google.android.gms.dynamite.DynamiteModule r0 = zzc(r1, r3)     // Catch:{  }
            r1 = 0
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x01d3
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x01dc
        L_0x01d3:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x01dc:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x01e3
            r1.close()
        L_0x01e3:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r5)
            return r0
        L_0x01e9:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r1 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.String r2 = "Remote load failed. No local fallback found."
            r3 = 0
            r1.<init>(r2, r0, r3)     // Catch:{  }
            throw r1     // Catch:{  }
        L_0x01f2:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            java.lang.String r2 = "VersionPolicy returned invalid code:"
            r1.<init>(r2)     // Catch:{  }
            r1.append(r14)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0207:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r0 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{  }
            int r1 = r13.localVersion     // Catch:{  }
            int r2 = r13.remoteVersion     // Catch:{  }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{  }
            java.lang.String r7 = "No acceptable module "
            r4.<init>(r7)     // Catch:{  }
            r4.append(r3)     // Catch:{  }
            java.lang.String r3 = " found. Local version is "
            r4.append(r3)     // Catch:{  }
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = " and remote version is "
            r4.append(r1)     // Catch:{  }
            r4.append(r2)     // Catch:{  }
            java.lang.String r1 = "."
            r4.append(r1)     // Catch:{  }
            java.lang.String r1 = r4.toString()     // Catch:{  }
            r2 = 0
            r0.<init>(r1, r2)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x0235:
            r0 = move-exception
            r1 = 0
            goto L_0x023b
        L_0x0239:
            r0 = move-exception
            r1 = r11
        L_0x023b:
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0245
            java.lang.ThreadLocal r1 = zzh
            r1.remove()
            goto L_0x024e
        L_0x0245:
            java.lang.ThreadLocal r1 = zzh
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r1.set(r2)
        L_0x024e:
            android.database.Cursor r1 = r6.zza
            if (r1 == 0) goto L_0x0255
            r1.close()
        L_0x0255:
            java.lang.ThreadLocal r1 = zzg
            r1.set(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.load(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$VersionPolicy, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0055=Splitter:B:30:0x0055, B:17:0x003b=Splitter:B:17:0x003b} */
    public static int zza(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x0160 }
            java.lang.Boolean r1 = zzb     // Catch:{ all -> 0x015d }
            r2 = 0
            r3 = 0
            if (r1 != 0) goto L_0x00ba
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r4 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r4 = r4.getName()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
            java.lang.Class r1 = r1.loadClass(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
            java.lang.String r4 = "sClassLoader"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
            java.lang.Class r4 = r1.getDeclaringClass()     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
            monitor-enter(r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.ClassLoader r5 = (java.lang.ClassLoader) r5     // Catch:{ all -> 0x00b3 }
            java.lang.ClassLoader r6 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b3 }
            if (r5 != r6) goto L_0x0036
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x0036:
            if (r5 == 0) goto L_0x003f
            zzd(r5)     // Catch:{ LoadingException -> 0x003b }
        L_0x003b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x003f:
            boolean r5 = zzf(r10)     // Catch:{ all -> 0x00b3 }
            if (r5 != 0) goto L_0x0048
            monitor-exit(r4)
            monitor-exit(r0)
            return r3
        L_0x0048:
            boolean r5 = zzd     // Catch:{ all -> 0x00b3 }
            if (r5 != 0) goto L_0x00a8
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x00b3 }
            boolean r5 = r5.equals(r2)     // Catch:{ all -> 0x00b3 }
            if (r5 != 0) goto L_0x00a8
            r5 = 1
            int r5 = zzb(r10, r11, r12, r5)     // Catch:{ LoadingException -> 0x009e }
            java.lang.String r6 = zzc     // Catch:{ LoadingException -> 0x009e }
            if (r6 == 0) goto L_0x009b
            boolean r6 = r6.isEmpty()     // Catch:{ LoadingException -> 0x009e }
            if (r6 == 0) goto L_0x0064
            goto L_0x009b
        L_0x0064:
            java.lang.ClassLoader r6 = com.google.android.gms.dynamite.zzb.zza()     // Catch:{ LoadingException -> 0x009e }
            if (r6 != 0) goto L_0x008e
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x009e }
            r7 = 29
            if (r6 < r7) goto L_0x007f
            java.lang.String r6 = zzc     // Catch:{ LoadingException -> 0x009e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ LoadingException -> 0x009e }
            dalvik.system.DelegateLastClassLoader r7 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x009e }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009e }
            r7.<init>(r6, r8)     // Catch:{ LoadingException -> 0x009e }
            goto L_0x008d
        L_0x007f:
            java.lang.String r6 = zzc     // Catch:{ LoadingException -> 0x009e }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ LoadingException -> 0x009e }
            com.google.android.gms.dynamite.zzc r7 = new com.google.android.gms.dynamite.zzc     // Catch:{ LoadingException -> 0x009e }
            java.lang.ClassLoader r8 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x009e }
            r7.<init>(r6, r8)     // Catch:{ LoadingException -> 0x009e }
        L_0x008d:
            r6 = r7
        L_0x008e:
            zzd(r6)     // Catch:{ LoadingException -> 0x009e }
            r1.set(r2, r6)     // Catch:{ LoadingException -> 0x009e }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x009e }
            zzb = r6     // Catch:{ LoadingException -> 0x009e }
            monitor-exit(r4)
            monitor-exit(r0)
            return r5
        L_0x009b:
            monitor-exit(r4)
            monitor-exit(r0)
            return r5
        L_0x009e:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b3 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b3 }
            goto L_0x00b1
        L_0x00a8:
            java.lang.ClassLoader r5 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x00b3 }
            r1.set(r2, r5)     // Catch:{ all -> 0x00b3 }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r4)
            goto L_0x00b8
        L_0x00b3:
            r1 = move-exception
            monitor-exit(r4)
            throw r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchFieldException -> 0x00b6 }
        L_0x00b6:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x015d }
        L_0x00b8:
            zzb = r1     // Catch:{ all -> 0x015d }
        L_0x00ba:
            monitor-exit(r0)
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x0160 }
            if (r0 == 0) goto L_0x00cb
            int r10 = zzb(r10, r11, r12, r3)     // Catch:{ LoadingException -> 0x00c6 }
            return r10
        L_0x00c6:
            r11 = move-exception
            r11.getMessage()     // Catch:{ all -> 0x0160 }
            return r3
        L_0x00cb:
            com.google.android.gms.dynamite.zzq r4 = zzg(r10)     // Catch:{ all -> 0x0160 }
            if (r4 != 0) goto L_0x00d3
            goto L_0x0154
        L_0x00d3:
            int r0 = r4.zze()     // Catch:{ RemoteException -> 0x014a }
            r1 = 3
            if (r0 < r1) goto L_0x0133
            java.lang.ThreadLocal r0 = zzg     // Catch:{ RemoteException -> 0x014a }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x014a }
            com.google.android.gms.dynamite.zzn r0 = (com.google.android.gms.dynamite.zzn) r0     // Catch:{ RemoteException -> 0x014a }
            if (r0 == 0) goto L_0x00ee
            android.database.Cursor r0 = r0.zza     // Catch:{ RemoteException -> 0x014a }
            if (r0 == 0) goto L_0x00ee
            int r3 = r0.getInt(r3)     // Catch:{ RemoteException -> 0x014a }
            goto L_0x0154
        L_0x00ee:
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x014a }
            java.lang.ThreadLocal r0 = zzh     // Catch:{ RemoteException -> 0x014a }
            java.lang.Object r0 = r0.get()     // Catch:{ RemoteException -> 0x014a }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ RemoteException -> 0x014a }
            long r8 = r0.longValue()     // Catch:{ RemoteException -> 0x014a }
            r6 = r11
            r7 = r12
            com.google.android.gms.dynamic.IObjectWrapper r11 = r4.zzk(r5, r6, r7, r8)     // Catch:{ RemoteException -> 0x014a }
            java.lang.Object r11 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r11)     // Catch:{ RemoteException -> 0x014a }
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch:{ RemoteException -> 0x014a }
            if (r11 == 0) goto L_0x012d
            boolean r12 = r11.moveToFirst()     // Catch:{ RemoteException -> 0x012a, all -> 0x0128 }
            if (r12 != 0) goto L_0x0113
            goto L_0x012d
        L_0x0113:
            int r12 = r11.getInt(r3)     // Catch:{ RemoteException -> 0x012a, all -> 0x0128 }
            if (r12 <= 0) goto L_0x0120
            boolean r0 = zze(r11)     // Catch:{ RemoteException -> 0x012a, all -> 0x0128 }
            if (r0 == 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            r2 = r11
        L_0x0121:
            if (r2 == 0) goto L_0x0126
            r2.close()     // Catch:{ all -> 0x0160 }
        L_0x0126:
            r3 = r12
            goto L_0x0154
        L_0x0128:
            r12 = move-exception
            goto L_0x0157
        L_0x012a:
            r12 = move-exception
            r2 = r11
            goto L_0x014c
        L_0x012d:
            if (r11 == 0) goto L_0x0154
            r11.close()     // Catch:{ all -> 0x0160 }
            goto L_0x0154
        L_0x0133:
            r1 = 2
            if (r0 != r1) goto L_0x013f
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x014a }
            int r3 = r4.zzg(r0, r11, r12)     // Catch:{ RemoteException -> 0x014a }
            goto L_0x0154
        L_0x013f:
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x014a }
            int r3 = r4.zzf(r0, r11, r12)     // Catch:{ RemoteException -> 0x014a }
            goto L_0x0154
        L_0x0148:
            r11 = move-exception
            goto L_0x0155
        L_0x014a:
            r11 = move-exception
            r12 = r11
        L_0x014c:
            r12.getMessage()     // Catch:{ all -> 0x0148 }
            if (r2 == 0) goto L_0x0154
            r2.close()     // Catch:{ all -> 0x0160 }
        L_0x0154:
            return r3
        L_0x0155:
            r12 = r11
            r11 = r2
        L_0x0157:
            if (r11 == 0) goto L_0x015c
            r11.close()     // Catch:{ all -> 0x0160 }
        L_0x015c:
            throw r12     // Catch:{ all -> 0x0160 }
        L_0x015d:
            r11 = move-exception
            monitor-exit(r0)
            throw r11     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r11 = move-exception
            com.google.android.gms.common.util.CrashUtils.addDynamiteErrorToDropBox(r10, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b3 A[SYNTHETIC, Splitter:B:56:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b4 A[Catch:{ all -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int zzb(android.content.Context r9, java.lang.String r10, boolean r11, boolean r12) throws com.google.android.gms.dynamite.DynamiteModule.LoadingException {
        /*
            r0 = 0
            java.lang.ThreadLocal r1 = zzh     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            long r1 = r1.longValue()     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            android.content.ContentResolver r3 = r9.getContentResolver()     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            r9 = 1
            if (r9 == r11) goto L_0x0017
            java.lang.String r11 = "api"
            goto L_0x0019
        L_0x0017:
            java.lang.String r11 = "api_force_staging"
        L_0x0019:
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            r4.<init>()     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            java.lang.String r5 = "content"
            android.net.Uri$Builder r4 = r4.scheme(r5)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            java.lang.String r5 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r4 = r4.authority(r5)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            android.net.Uri$Builder r11 = r4.path(r11)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            android.net.Uri$Builder r10 = r11.appendPath(r10)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            java.lang.String r11 = "requestStartTime"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r1)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            android.net.Uri r4 = r10.build()     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00ad, all -> 0x00ab }
            if (r10 == 0) goto L_0x00a1
            boolean r11 = r10.moveToFirst()     // Catch:{ Exception -> 0x00a9 }
            if (r11 == 0) goto L_0x00a1
            r11 = 0
            int r1 = r10.getInt(r11)     // Catch:{ Exception -> 0x00a9 }
            if (r1 <= 0) goto L_0x008e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r2 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r2)     // Catch:{ Exception -> 0x00a9 }
            r3 = 2
            java.lang.String r3 = r10.getString(r3)     // Catch:{ all -> 0x008b }
            zzc = r3     // Catch:{ all -> 0x008b }
            java.lang.String r3 = "loaderVersion"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x008b }
            if (r3 < 0) goto L_0x006f
            int r3 = r10.getInt(r3)     // Catch:{ all -> 0x008b }
            zze = r3     // Catch:{ all -> 0x008b }
        L_0x006f:
            java.lang.String r3 = "disableStandaloneDynamiteLoader2"
            int r3 = r10.getColumnIndex(r3)     // Catch:{ all -> 0x008b }
            if (r3 < 0) goto L_0x0082
            int r3 = r10.getInt(r3)     // Catch:{ all -> 0x008b }
            if (r3 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r9 = 0
        L_0x007f:
            zzd = r9     // Catch:{ all -> 0x008b }
            r11 = r9
        L_0x0082:
            monitor-exit(r2)
            boolean r9 = zze(r10)     // Catch:{ Exception -> 0x00a9 }
            if (r9 == 0) goto L_0x008e
            r10 = r0
            goto L_0x008e
        L_0x008b:
            r9 = move-exception
            monitor-exit(r2)
            throw r9     // Catch:{ Exception -> 0x00a9 }
        L_0x008e:
            if (r12 == 0) goto L_0x009b
            if (r11 != 0) goto L_0x0093
            goto L_0x009b
        L_0x0093:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r11 = "forcing fallback to container DynamiteLoader impl"
            r9.<init>(r11, r0)     // Catch:{ Exception -> 0x00a9 }
            throw r9     // Catch:{ Exception -> 0x00a9 }
        L_0x009b:
            if (r10 == 0) goto L_0x00a0
            r10.close()
        L_0x00a0:
            return r1
        L_0x00a1:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x00a9 }
            java.lang.String r11 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r11, r0)     // Catch:{ Exception -> 0x00a9 }
            throw r9     // Catch:{ Exception -> 0x00a9 }
        L_0x00a9:
            r9 = move-exception
            goto L_0x00af
        L_0x00ab:
            r9 = move-exception
            goto L_0x00be
        L_0x00ad:
            r9 = move-exception
            r10 = r0
        L_0x00af:
            boolean r11 = r9 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException
            if (r11 == 0) goto L_0x00b4
            throw r9     // Catch:{ all -> 0x00bc }
        L_0x00b4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r11 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00bc }
            java.lang.String r12 = "V2 version check failed"
            r11.<init>(r12, r9, r0)     // Catch:{ all -> 0x00bc }
            throw r11     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r9 = move-exception
            r0 = r10
        L_0x00be:
            if (r0 == 0) goto L_0x00c3
            r0.close()
        L_0x00c3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzb(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static void zzd(ClassLoader classLoader) throws LoadingException {
        zzr zzr;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzr = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof zzr) {
                    zzr = (zzr) queryLocalInterface;
                } else {
                    zzr = new zzr(iBinder);
                }
            }
            zzl = zzr;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new LoadingException("Failed to instantiate dynamite loader", e, (zzp) null);
        }
    }

    private static boolean zze(Cursor cursor) {
        zzn zzn = (zzn) zzg.get();
        if (zzn == null || zzn.zza != null) {
            return false;
        }
        zzn.zza = cursor;
        return true;
    }

    private static boolean zzf(Context context) {
        if (Boolean.TRUE.equals((Object) null) || Boolean.TRUE.equals(zzf)) {
            return true;
        }
        boolean z = false;
        if (zzf == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            zzf = valueOf;
            z = valueOf.booleanValue();
            if (z && resolveContentProvider != null && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                zzd = true;
            }
        }
        return z;
    }

    private static zzq zzg(Context context) {
        zzq zzq;
        synchronized (DynamiteModule.class) {
            zzq zzq2 = zzk;
            if (zzq2 != null) {
                return zzq2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    zzq = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    zzq = queryLocalInterface instanceof zzq ? (zzq) queryLocalInterface : new zzq(iBinder);
                }
                if (zzq != null) {
                    zzk = zzq;
                    return zzq;
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return null;
    }

    public final Context getModuleContext() {
        return this.zzj;
    }

    public final IBinder instantiate(String str) throws LoadingException {
        try {
            return (IBinder) this.zzj.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new LoadingException("Failed to instantiate module class: ".concat(String.valueOf(str)), e, (zzp) null);
        }
    }

    private static DynamiteModule zzc(Context context, String str) {
        return new DynamiteModule(context.getApplicationContext());
    }
}
