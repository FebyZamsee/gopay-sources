package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.util.Clock;

public final class zzfo extends zze {
    private final zzfn zza = new zzfn(this, zza(), "google_app_measurement_local.db");
    private boolean zzb;

    /* access modifiers changed from: protected */
    public final boolean zzz() {
        return false;
    }

    private static long zza(SQLiteDatabase sQLiteDatabase) {
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, (String) null, (String) null, "rowid desc", "1");
            if (cursor.moveToFirst()) {
                return cursor.getLong(0);
            }
            if (cursor == null) {
                return -1;
            }
            cursor.close();
            return -1;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    private final SQLiteDatabase zzad() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    public final /* bridge */ /* synthetic */ zzfl zzg() {
        return super.zzg();
    }

    public final /* bridge */ /* synthetic */ zzfo zzh() {
        return super.zzh();
    }

    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ zziq zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ zzkh zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzkp zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzlx zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:57|58|59|60) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:72|73|74|75) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:44|45|46|47|169) */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01da, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01df, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        zzj().zzg().zza("Failed to load event from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        zzj().zzg().zza("Failed to load user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        zzj().zzg().zza("Failed to load conditional user property from local database");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r11.recycle();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x018d, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00d1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0107 */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[ExcHandler: SQLiteDatabaseLockedException (unused android.database.sqlite.SQLiteDatabaseLockedException), SYNTHETIC, Splitter:B:12:0x0026] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01af A[SYNTHETIC, Splitter:B:118:0x01af] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01fd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01fd A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable> zza(int r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = "Error reading entries from local database"
            r21.zzt()
            boolean r0 = r1.zzb
            r3 = 0
            if (r0 == 0) goto L_0x000d
            return r3
        L_0x000d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r0 = r21.zzae()
            if (r0 != 0) goto L_0x0019
            return r4
        L_0x0019:
            r5 = 5
            r6 = 0
            r7 = 0
            r8 = 5
        L_0x001d:
            if (r7 >= r5) goto L_0x0211
            r9 = 1
            android.database.sqlite.SQLiteDatabase r15 = r21.zzad()     // Catch:{ SQLiteFullException -> 0x01e3, SQLiteDatabaseLockedException -> 0x01d0, SQLiteException -> 0x01aa, all -> 0x01a7 }
            if (r15 != 0) goto L_0x002e
            r1.zzb = r9     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            if (r15 == 0) goto L_0x002d
            r15.close()
        L_0x002d:
            return r3
        L_0x002e:
            r15.beginTransaction()     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            long r10 = zza((android.database.sqlite.SQLiteDatabase) r15)     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            r19 = -1
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x004e
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            r0[r6] = r10     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            java.lang.String r10 = "rowid<?"
            r14 = r0
            r13 = r10
            goto L_0x0050
        L_0x0048:
            r5 = r15
            goto L_0x019b
        L_0x004b:
            r5 = r15
            goto L_0x01a4
        L_0x004e:
            r13 = r3
            r14 = r13
        L_0x0050:
            java.lang.String r0 = "rowid"
            java.lang.String r10 = "type"
            java.lang.String r11 = "entry"
            java.lang.String[] r12 = new java.lang.String[]{r0, r10, r11}     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            r0 = 100
            java.lang.String r18 = java.lang.Integer.toString(r0)     // Catch:{ SQLiteFullException -> 0x01a1, SQLiteDatabaseLockedException -> 0x018d, SQLiteException -> 0x0198, all -> 0x0192 }
            java.lang.String r11 = "messages"
            r0 = 0
            r16 = 0
            java.lang.String r17 = "rowid asc"
            r10 = r15
            r5 = r15
            r15 = r0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SQLiteFullException -> 0x0184, SQLiteDatabaseLockedException -> 0x019e, SQLiteException -> 0x0182, all -> 0x017f }
        L_0x006e:
            boolean r0 = r10.moveToNext()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            if (r0 == 0) goto L_0x0144
            long r19 = r10.getLong(r6)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            int r0 = r10.getInt(r9)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            r11 = 2
            byte[] r12 = r10.getBlob(r11)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            if (r0 != 0) goto L_0x00b6
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00a1 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x00a1 }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x00a1 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzbg> r0 = com.google.android.gms.measurement.internal.zzbg.CREATOR     // Catch:{ ParseException -> 0x00a1 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x00a1 }
            com.google.android.gms.measurement.internal.zzbg r0 = (com.google.android.gms.measurement.internal.zzbg) r0     // Catch:{ ParseException -> 0x00a1 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            if (r0 == 0) goto L_0x006e
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x006e
        L_0x009f:
            r0 = move-exception
            goto L_0x00b2
        L_0x00a1:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x009f }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x009f }
            java.lang.String r12 = "Failed to load event from local database"
            r0.zza(r12)     // Catch:{ all -> 0x009f }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x006e
        L_0x00b2:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            throw r0     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
        L_0x00b6:
            if (r0 != r9) goto L_0x00ec
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x00d1 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x00d1 }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x00d1 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zznc> r0 = com.google.android.gms.measurement.internal.zznc.CREATOR     // Catch:{ ParseException -> 0x00d1 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x00d1 }
            com.google.android.gms.measurement.internal.zznc r0 = (com.google.android.gms.measurement.internal.zznc) r0     // Catch:{ ParseException -> 0x00d1 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x00e2
        L_0x00cf:
            r0 = move-exception
            goto L_0x00e8
        L_0x00d1:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x00cf }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x00cf }
            java.lang.String r12 = "Failed to load user property from local database"
            r0.zza(r12)     // Catch:{ all -> 0x00cf }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            r0 = r3
        L_0x00e2:
            if (r0 == 0) goto L_0x006e
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x006e
        L_0x00e8:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            throw r0     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
        L_0x00ec:
            if (r0 != r11) goto L_0x0123
            android.os.Parcel r11 = android.os.Parcel.obtain()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            int r0 = r12.length     // Catch:{ ParseException -> 0x0107 }
            r11.unmarshall(r12, r6, r0)     // Catch:{ ParseException -> 0x0107 }
            r11.setDataPosition(r6)     // Catch:{ ParseException -> 0x0107 }
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.zzad> r0 = com.google.android.gms.measurement.internal.zzad.CREATOR     // Catch:{ ParseException -> 0x0107 }
            java.lang.Object r0 = r0.createFromParcel(r11)     // Catch:{ ParseException -> 0x0107 }
            com.google.android.gms.measurement.internal.zzad r0 = (com.google.android.gms.measurement.internal.zzad) r0     // Catch:{ ParseException -> 0x0107 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x0118
        L_0x0105:
            r0 = move-exception
            goto L_0x011f
        L_0x0107:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ all -> 0x0105 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ all -> 0x0105 }
            java.lang.String r12 = "Failed to load conditional user property from local database"
            r0.zza(r12)     // Catch:{ all -> 0x0105 }
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            r0 = r3
        L_0x0118:
            if (r0 == 0) goto L_0x006e
            r4.add(r0)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x006e
        L_0x011f:
            r11.recycle()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            throw r0     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
        L_0x0123:
            r11 = 3
            if (r0 != r11) goto L_0x0135
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzu()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            java.lang.String r11 = "Skipping app launch break"
            r0.zza(r11)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x006e
        L_0x0135:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            java.lang.String r11 = "Unknown record type in local database"
            r0.zza(r11)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            goto L_0x006e
        L_0x0144:
            java.lang.String[] r0 = new java.lang.String[r9]     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            java.lang.String r11 = java.lang.Long.toString(r19)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            r0[r6] = r11     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            java.lang.String r11 = "messages"
            java.lang.String r12 = "rowid <= ?"
            int r0 = r5.delete(r11, r12, r0)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            int r11 = r4.size()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            if (r0 >= r11) goto L_0x0167
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzg()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            java.lang.String r11 = "Fewer entries removed from local database than expected"
            r0.zza(r11)     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
        L_0x0167:
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x017d, SQLiteDatabaseLockedException -> 0x019f, SQLiteException -> 0x017b, all -> 0x0178 }
            if (r10 == 0) goto L_0x0172
            r10.close()
        L_0x0172:
            if (r5 == 0) goto L_0x0177
            r5.close()
        L_0x0177:
            return r4
        L_0x0178:
            r0 = move-exception
            goto L_0x0205
        L_0x017b:
            r0 = move-exception
            goto L_0x019c
        L_0x017d:
            r0 = move-exception
            goto L_0x01a5
        L_0x017f:
            r0 = move-exception
            goto L_0x0206
        L_0x0182:
            r0 = move-exception
            goto L_0x019b
        L_0x0184:
            r0 = move-exception
            goto L_0x01a4
        L_0x0186:
            r0 = move-exception
            r5 = r15
            goto L_0x0206
        L_0x018a:
            r0 = move-exception
            r5 = r15
            goto L_0x019b
        L_0x018d:
            r5 = r15
            goto L_0x019e
        L_0x018f:
            r0 = move-exception
            r5 = r15
            goto L_0x01a4
        L_0x0192:
            r0 = move-exception
            r5 = r15
            r10 = r3
            r3 = r5
            goto L_0x0204
        L_0x0198:
            r0 = move-exception
            goto L_0x0048
        L_0x019b:
            r10 = r3
        L_0x019c:
            r15 = r5
            goto L_0x01ad
        L_0x019e:
            r10 = r3
        L_0x019f:
            r15 = r5
            goto L_0x01d2
        L_0x01a1:
            r0 = move-exception
            goto L_0x004b
        L_0x01a4:
            r10 = r3
        L_0x01a5:
            r15 = r5
            goto L_0x01e6
        L_0x01a7:
            r0 = move-exception
            r5 = r3
            goto L_0x0206
        L_0x01aa:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01ad:
            if (r15 == 0) goto L_0x01b8
            boolean r5 = r15.inTransaction()     // Catch:{ all -> 0x0202 }
            if (r5 == 0) goto L_0x01b8
            r15.endTransaction()     // Catch:{ all -> 0x0202 }
        L_0x01b8:
            com.google.android.gms.measurement.internal.zzfr r5 = r21.zzj()     // Catch:{ all -> 0x0202 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ all -> 0x0202 }
            r5.zza(r2, r0)     // Catch:{ all -> 0x0202 }
            r1.zzb = r9     // Catch:{ all -> 0x0202 }
            if (r10 == 0) goto L_0x01ca
            r10.close()
        L_0x01ca:
            if (r15 == 0) goto L_0x01fd
            r15.close()
            goto L_0x01fd
        L_0x01d0:
            r10 = r3
            r15 = r10
        L_0x01d2:
            long r11 = (long) r8
            android.os.SystemClock.sleep(r11)     // Catch:{ all -> 0x0202 }
            int r8 = r8 + 20
            if (r10 == 0) goto L_0x01dd
            r10.close()
        L_0x01dd:
            if (r15 == 0) goto L_0x01fd
            r15.close()
            goto L_0x01fd
        L_0x01e3:
            r0 = move-exception
            r10 = r3
            r15 = r10
        L_0x01e6:
            com.google.android.gms.measurement.internal.zzfr r5 = r21.zzj()     // Catch:{ all -> 0x0202 }
            com.google.android.gms.measurement.internal.zzft r5 = r5.zzg()     // Catch:{ all -> 0x0202 }
            r5.zza(r2, r0)     // Catch:{ all -> 0x0202 }
            r1.zzb = r9     // Catch:{ all -> 0x0202 }
            if (r10 == 0) goto L_0x01f8
            r10.close()
        L_0x01f8:
            if (r15 == 0) goto L_0x01fd
            r15.close()
        L_0x01fd:
            int r7 = r7 + 1
            r5 = 5
            goto L_0x001d
        L_0x0202:
            r0 = move-exception
            r3 = r15
        L_0x0204:
            r5 = r3
        L_0x0205:
            r3 = r10
        L_0x0206:
            if (r3 == 0) goto L_0x020b
            r3.close()
        L_0x020b:
            if (r5 == 0) goto L_0x0210
            r5.close()
        L_0x0210:
            throw r0
        L_0x0211:
            com.google.android.gms.measurement.internal.zzfr r0 = r21.zzj()
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzu()
            java.lang.String r2 = "Failed to read events from database in reasonable time"
            r0.zza(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zza(int):java.util.List");
    }

    zzfo(zzhf zzhf) {
        super(zzhf);
    }

    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final void zzaa() {
        int delete;
        zzt();
        try {
            SQLiteDatabase zzad = zzad();
            if (zzad != null && (delete = zzad.delete("messages", (String) null, (String[]) null) + 0) > 0) {
                zzj().zzp().zza("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzj().zzg().zza("Error resetting local analytics data. error", e);
        }
    }

    public final boolean zzab() {
        return zza(3, new byte[0]);
    }

    private final boolean zzae() {
        return zza().getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0086, code lost:
        r3 = r3 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzac() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.zzt()
            boolean r1 = r10.zzb
            r2 = 0
            if (r1 == 0) goto L_0x000b
            return r2
        L_0x000b:
            boolean r1 = r10.zzae()
            if (r1 != 0) goto L_0x0012
            return r2
        L_0x0012:
            r1 = 5
            r3 = 0
            r4 = 5
        L_0x0015:
            if (r3 >= r1) goto L_0x008f
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.zzad()     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            if (r5 != 0) goto L_0x0027
            r10.zzb = r6     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            if (r5 == 0) goto L_0x0026
            r5.close()
        L_0x0026:
            return r2
        L_0x0027:
            r5.beginTransaction()     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            r8 = 3
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            r7[r2] = r8     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r5.delete(r8, r9, r7)     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            r5.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            r5.endTransaction()     // Catch:{ SQLiteFullException -> 0x0073, SQLiteDatabaseLockedException -> 0x0067, SQLiteException -> 0x0048 }
            if (r5 == 0) goto L_0x0045
            r5.close()
        L_0x0045:
            return r6
        L_0x0046:
            r0 = move-exception
            goto L_0x0089
        L_0x0048:
            r7 = move-exception
            if (r5 == 0) goto L_0x0054
            boolean r8 = r5.inTransaction()     // Catch:{ all -> 0x0046 }
            if (r8 == 0) goto L_0x0054
            r5.endTransaction()     // Catch:{ all -> 0x0046 }
        L_0x0054:
            com.google.android.gms.measurement.internal.zzfr r8 = r10.zzj()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzg()     // Catch:{ all -> 0x0046 }
            r8.zza(r0, r7)     // Catch:{ all -> 0x0046 }
            r10.zzb = r6     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0086
            r5.close()
            goto L_0x0086
        L_0x0067:
            long r6 = (long) r4
            android.os.SystemClock.sleep(r6)     // Catch:{ all -> 0x0046 }
            int r4 = r4 + 20
            if (r5 == 0) goto L_0x0086
            r5.close()
            goto L_0x0086
        L_0x0073:
            r7 = move-exception
            com.google.android.gms.measurement.internal.zzfr r8 = r10.zzj()     // Catch:{ all -> 0x0046 }
            com.google.android.gms.measurement.internal.zzft r8 = r8.zzg()     // Catch:{ all -> 0x0046 }
            r8.zza(r0, r7)     // Catch:{ all -> 0x0046 }
            r10.zzb = r6     // Catch:{ all -> 0x0046 }
            if (r5 == 0) goto L_0x0086
            r5.close()
        L_0x0086:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0089:
            if (r5 == 0) goto L_0x008e
            r5.close()
        L_0x008e:
            throw r0
        L_0x008f:
            com.google.android.gms.measurement.internal.zzfr r0 = r10.zzj()
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzu()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.zza(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zzac():boolean");
    }

    public final boolean zza(zzad zzad) {
        zzq();
        byte[] zza2 = zznd.zza((Parcelable) zzad);
        if (zza2.length <= 131072) {
            return zza(2, zza2);
        }
        zzj().zzm().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.database.sqlite.SQLiteDatabase} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r8v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: type inference failed for: r8v10 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC, Splitter:B:27:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ca A[SYNTHETIC, Splitter:B:51:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x009a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x011e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zza(int r17, byte[] r18) {
        /*
            r16 = this;
            r1 = r16
            r16.zzt()
            boolean r0 = r1.zzb
            r2 = 0
            if (r0 == 0) goto L_0x000b
            return r2
        L_0x000b:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.String r4 = "type"
            r3.put(r4, r0)
            java.lang.String r0 = "entry"
            r4 = r18
            r3.put(r0, r4)
            r4 = 5
            r5 = 0
            r6 = 5
        L_0x0023:
            if (r5 >= r4) goto L_0x0131
            r7 = 1
            r8 = 0
            android.database.sqlite.SQLiteDatabase r9 = r16.zzad()     // Catch:{ SQLiteFullException -> 0x0102, SQLiteDatabaseLockedException -> 0x00f0, SQLiteException -> 0x00c6, all -> 0x00c3 }
            if (r9 != 0) goto L_0x0035
            r1.zzb = r7     // Catch:{ SQLiteFullException -> 0x00c1, SQLiteDatabaseLockedException -> 0x00f1, SQLiteException -> 0x00bd }
            if (r9 == 0) goto L_0x0034
            r9.close()
        L_0x0034:
            return r2
        L_0x0035:
            r9.beginTransaction()     // Catch:{ SQLiteFullException -> 0x00c1, SQLiteDatabaseLockedException -> 0x00f1, SQLiteException -> 0x00bd }
            java.lang.String r0 = "select count(1) from messages"
            android.database.Cursor r10 = r9.rawQuery(r0, r8)     // Catch:{ SQLiteFullException -> 0x00c1, SQLiteDatabaseLockedException -> 0x00f1, SQLiteException -> 0x00bd }
            if (r10 == 0) goto L_0x0051
            boolean r0 = r10.moveToFirst()     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            if (r0 == 0) goto L_0x0051
            long r11 = r10.getLong(r2)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            goto L_0x0053
        L_0x004b:
            r0 = move-exception
            goto L_0x00af
        L_0x004d:
            r0 = move-exception
            goto L_0x00b2
        L_0x004f:
            r0 = move-exception
            goto L_0x00b6
        L_0x0051:
            r11 = 0
        L_0x0053:
            java.lang.String r0 = "messages"
            r13 = 100000(0x186a0, double:4.94066E-319)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009a
            com.google.android.gms.measurement.internal.zzfr r15 = r16.zzj()     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            com.google.android.gms.measurement.internal.zzft r15 = r15.zzg()     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            java.lang.String r4 = "Data loss, local db full"
            r15.zza(r4)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            long r13 = r13 - r11
            r11 = 1
            long r13 = r13 + r11
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            java.lang.String r11 = java.lang.Long.toString(r13)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            r4[r2] = r11     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            java.lang.String r11 = "rowid in (select rowid from messages order by rowid asc limit ?)"
            int r4 = r9.delete(r0, r11, r4)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            long r11 = (long) r4     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x009a
            com.google.android.gms.measurement.internal.zzfr r4 = r16.zzj()     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            java.lang.String r15 = "Different delete count than expected in local db. expected, received, difference"
            java.lang.Long r2 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            java.lang.Long r7 = java.lang.Long.valueOf(r11)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            long r13 = r13 - r11
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            r4.zza(r15, r2, r7, r11)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
        L_0x009a:
            r9.insertOrThrow(r0, r8, r3)     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            r9.setTransactionSuccessful()     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            r9.endTransaction()     // Catch:{ SQLiteFullException -> 0x004f, SQLiteDatabaseLockedException -> 0x00b4, SQLiteException -> 0x004d, all -> 0x004b }
            if (r10 == 0) goto L_0x00a8
            r10.close()
        L_0x00a8:
            if (r9 == 0) goto L_0x00ad
            r9.close()
        L_0x00ad:
            r2 = 1
            return r2
        L_0x00af:
            r8 = r10
            goto L_0x0126
        L_0x00b2:
            r8 = r10
            goto L_0x00be
        L_0x00b4:
            r8 = r10
            goto L_0x00f1
        L_0x00b6:
            r8 = r10
            goto L_0x0104
        L_0x00b8:
            r0 = move-exception
            r2 = r8
            r8 = r9
            goto L_0x0124
        L_0x00bd:
            r0 = move-exception
        L_0x00be:
            r2 = r8
            r8 = r9
            goto L_0x00c8
        L_0x00c1:
            r0 = move-exception
            goto L_0x0104
        L_0x00c3:
            r0 = move-exception
            r9 = r8
            goto L_0x0126
        L_0x00c6:
            r0 = move-exception
            r2 = r8
        L_0x00c8:
            if (r8 == 0) goto L_0x00d3
            boolean r4 = r8.inTransaction()     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x00d3
            r8.endTransaction()     // Catch:{ all -> 0x00ee }
        L_0x00d3:
            com.google.android.gms.measurement.internal.zzfr r4 = r16.zzj()     // Catch:{ all -> 0x00ee }
            com.google.android.gms.measurement.internal.zzft r4 = r4.zzg()     // Catch:{ all -> 0x00ee }
            java.lang.String r7 = "Error writing entry to local database"
            r4.zza(r7, r0)     // Catch:{ all -> 0x00ee }
            r4 = 1
            r1.zzb = r4     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x00e8
            r2.close()
        L_0x00e8:
            if (r8 == 0) goto L_0x011e
            r8.close()
            goto L_0x011e
        L_0x00ee:
            r0 = move-exception
            goto L_0x0124
        L_0x00f0:
            r9 = r8
        L_0x00f1:
            long r10 = (long) r6
            android.os.SystemClock.sleep(r10)     // Catch:{ all -> 0x00b8 }
            int r6 = r6 + 20
            if (r8 == 0) goto L_0x00fc
            r8.close()
        L_0x00fc:
            if (r9 == 0) goto L_0x011e
            r9.close()
            goto L_0x011e
        L_0x0102:
            r0 = move-exception
            r9 = r8
        L_0x0104:
            com.google.android.gms.measurement.internal.zzfr r2 = r16.zzj()     // Catch:{ all -> 0x00b8 }
            com.google.android.gms.measurement.internal.zzft r2 = r2.zzg()     // Catch:{ all -> 0x00b8 }
            java.lang.String r4 = "Error writing entry; local database full"
            r2.zza(r4, r0)     // Catch:{ all -> 0x00b8 }
            r2 = 1
            r1.zzb = r2     // Catch:{ all -> 0x00b8 }
            if (r8 == 0) goto L_0x0119
            r8.close()
        L_0x0119:
            if (r9 == 0) goto L_0x011e
            r9.close()
        L_0x011e:
            int r5 = r5 + 1
            r2 = 0
            r4 = 5
            goto L_0x0023
        L_0x0124:
            r9 = r8
            r8 = r2
        L_0x0126:
            if (r8 == 0) goto L_0x012b
            r8.close()
        L_0x012b:
            if (r9 == 0) goto L_0x0130
            r9.close()
        L_0x0130:
            throw r0
        L_0x0131:
            com.google.android.gms.measurement.internal.zzfr r0 = r16.zzj()
            com.google.android.gms.measurement.internal.zzft r0 = r0.zzp()
            java.lang.String r2 = "Failed to write entry to local database"
            r0.zza(r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfo.zza(int, byte[]):boolean");
    }

    public final boolean zza(zzbg zzbg) {
        Parcel obtain = Parcel.obtain();
        zzbg.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(0, marshall);
        }
        zzj().zzm().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zza(zznc zznc) {
        Parcel obtain = Parcel.obtain();
        zznc.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return zza(1, marshall);
        }
        zzj().zzm().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
