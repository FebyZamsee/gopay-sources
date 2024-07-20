package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

class HeartBeatInfoStorage {
    private final SharedPreferences firebaseSharedPreferences;

    public HeartBeatInfoStorage(Context context, String str) {
        StringBuilder sb = new StringBuilder("FirebaseHeartBeat");
        sb.append(str);
        this.firebaseSharedPreferences = context.getSharedPreferences(sb.toString(), 0);
    }

    /* access modifiers changed from: package-private */
    public void deleteAllHeartBeats() {
        synchronized (this) {
            SharedPreferences.Editor edit = this.firebaseSharedPreferences.edit();
            int i = 0;
            for (Map.Entry next : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    String formattedDate = getFormattedDate(System.currentTimeMillis());
                    String str = (String) next.getKey();
                    if (((Set) next.getValue()).contains(formattedDate)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(formattedDate);
                        i++;
                        edit.putStringSet(str, hashSet);
                    } else {
                        edit.remove(str);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", (long) i);
            }
            edit.commit();
        }
    }

    /* access modifiers changed from: package-private */
    public List<HeartBeatResult> getAllHeartBeats() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (Map.Entry next : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) next.getValue());
                    hashSet.remove(getFormattedDate(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create((String) next.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        }
        return arrayList;
    }

    private String getStoredUserAgentString(String str) {
        synchronized (this) {
            for (Map.Entry next : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (next.getValue() instanceof Set) {
                    for (String equals : (Set) next.getValue()) {
                        if (str.equals(equals)) {
                            String str2 = (String) next.getKey();
                            return str2;
                        }
                    }
                    continue;
                }
            }
            return null;
        }
    }

    private void updateStoredUserAgent(String str, String str2) {
        synchronized (this) {
            removeStoredDate(str2);
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.add(str2);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).commit();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void removeStoredDate(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.getStoredUserAgentString(r5)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r4.firebaseSharedPreferences     // Catch:{ all -> 0x003f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            r1.remove(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0030
            android.content.SharedPreferences r5 = r4.firebaseSharedPreferences     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0030:
            android.content.SharedPreferences r5 = r4.firebaseSharedPreferences     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.removeStoredDate(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public void postHeartBeatCleanUp() {
        synchronized (this) {
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            this.firebaseSharedPreferences.edit().putString("last-used-date", formattedDate).commit();
            removeStoredDate(formattedDate);
        }
    }

    private String getFormattedDate(long j) {
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26) {
                String format = new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
                return format;
            }
            String format2 = new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
            return format2;
        }
    }

    /* access modifiers changed from: package-private */
    public void storeHeartBeat(long j, String str) {
        synchronized (this) {
            String formattedDate = getFormattedDate(j);
            if (this.firebaseSharedPreferences.getString("last-used-date", "").equals(formattedDate)) {
                String storedUserAgentString = getStoredUserAgentString(formattedDate);
                if (storedUserAgentString != null) {
                    if (!storedUserAgentString.equals(str)) {
                        updateStoredUserAgent(str, formattedDate);
                        return;
                    }
                    return;
                }
                return;
            }
            long j2 = this.firebaseSharedPreferences.getLong("fire-count", 0);
            if (j2 + 1 == 30) {
                cleanUpStoredHeartBeats();
                j2 = this.firebaseSharedPreferences.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.add(formattedDate);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", formattedDate).commit();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void cleanUpStoredHeartBeats() {
        /*
            r9 = this;
            monitor-enter(r9)
            android.content.SharedPreferences r0 = r9.firebaseSharedPreferences     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "fire-count"
            r2 = 0
            long r0 = r0.getLong(r1, r2)     // Catch:{ all -> 0x0082 }
            android.content.SharedPreferences r2 = r9.firebaseSharedPreferences     // Catch:{ all -> 0x0082 }
            java.util.Map r2 = r2.getAll()     // Catch:{ all -> 0x0082 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0082 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0082 }
            r3 = 0
            java.lang.String r4 = ""
        L_0x001c:
            boolean r5 = r2.hasNext()     // Catch:{ all -> 0x0082 }
            if (r5 == 0) goto L_0x0057
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x0082 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x0082 }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x0082 }
            boolean r6 = r6 instanceof java.util.Set     // Catch:{ all -> 0x0082 }
            if (r6 == 0) goto L_0x001c
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x0082 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0082 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0082 }
        L_0x003a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0082 }
            if (r7 == 0) goto L_0x001c
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0082 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x004e
            int r8 = r3.compareTo(r7)     // Catch:{ all -> 0x0082 }
            if (r8 <= 0) goto L_0x003a
        L_0x004e:
            java.lang.Object r3 = r5.getKey()     // Catch:{ all -> 0x0082 }
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0082 }
            r3 = r7
            goto L_0x003a
        L_0x0057:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0082 }
            android.content.SharedPreferences r5 = r9.firebaseSharedPreferences     // Catch:{ all -> 0x0082 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x0082 }
            r6.<init>()     // Catch:{ all -> 0x0082 }
            java.util.Set r5 = r5.getStringSet(r4, r6)     // Catch:{ all -> 0x0082 }
            r2.<init>(r5)     // Catch:{ all -> 0x0082 }
            r2.remove(r3)     // Catch:{ all -> 0x0082 }
            android.content.SharedPreferences r3 = r9.firebaseSharedPreferences     // Catch:{ all -> 0x0082 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0082 }
            android.content.SharedPreferences$Editor r2 = r3.putStringSet(r4, r2)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "fire-count"
            r4 = 1
            long r0 = r0 - r4
            android.content.SharedPreferences$Editor r0 = r2.putLong(r3, r0)     // Catch:{ all -> 0x0082 }
            r0.commit()     // Catch:{ all -> 0x0082 }
            monitor-exit(r9)
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.heartbeatinfo.HeartBeatInfoStorage.cleanUpStoredHeartBeats():void");
    }

    /* access modifiers changed from: package-private */
    public void updateGlobalHeartBeat(long j) {
        synchronized (this) {
            this.firebaseSharedPreferences.edit().putLong("fire-global", j).commit();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isSameDateUtc(long j, long j2) {
        boolean equals;
        synchronized (this) {
            equals = getFormattedDate(j).equals(getFormattedDate(j2));
        }
        return equals;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldSendSdkHeartBeat(String str, long j) {
        synchronized (this) {
            if (!this.firebaseSharedPreferences.contains(str)) {
                this.firebaseSharedPreferences.edit().putLong(str, j).commit();
                return true;
            } else if (isSameDateUtc(this.firebaseSharedPreferences.getLong(str, -1), j)) {
                return false;
            } else {
                this.firebaseSharedPreferences.edit().putLong(str, j).commit();
                return true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldSendGlobalHeartBeat(long j) {
        boolean shouldSendSdkHeartBeat;
        synchronized (this) {
            shouldSendSdkHeartBeat = shouldSendSdkHeartBeat("fire-global", j);
        }
        return shouldSendSdkHeartBeat;
    }
}
