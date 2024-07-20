package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1rSDK;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class AFg1pSDK implements AFg1nSDK {
    private static final BitSet afErrorLog;
    final Runnable AFInAppEventParameterName;
    final Handler AFInAppEventType;
    final Object AFKeystoreWrapper;
    /* access modifiers changed from: private */
    public final Map<AFg1oSDK, AFg1oSDK> AFLogger;
    private Runnable AFLogger$LogLevel;
    private long AFVersionDeclaration;
    /* access modifiers changed from: private */
    public boolean afDebugLog;
    /* access modifiers changed from: private */
    public final Runnable afErrorLogForExcManagerOnly;
    /* access modifiers changed from: private */
    public final SensorManager afInfoLog;
    /* access modifiers changed from: private */
    public final Map<AFg1oSDK, Map<String, Object>> afRDLog;
    /* access modifiers changed from: private */
    public int getLevel;
    boolean valueOf;
    final Runnable values;

    static {
        BitSet bitSet = new BitSet(6);
        afErrorLog = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void afDebugLog() {
        synchronized (this.AFKeystoreWrapper) {
            this.AFInAppEventType.post(new Runnable() {
                public final void run() {
                    try {
                        if (!AFg1pSDK.this.AFLogger.isEmpty()) {
                            for (AFg1oSDK aFg1oSDK : AFg1pSDK.this.AFLogger.values()) {
                                AFg1pSDK.this.afInfoLog.unregisterListener(aFg1oSDK);
                                aFg1oSDK.AFInAppEventType(AFg1pSDK.this.afRDLog, true);
                            }
                        }
                    } catch (Throwable th) {
                        AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
                    }
                    int unused = AFg1pSDK.this.getLevel = 0;
                    boolean unused2 = AFg1pSDK.this.afDebugLog = false;
                }
            });
        }
    }

    private AFg1pSDK(SensorManager sensorManager, Handler handler) {
        this.AFKeystoreWrapper = new Object();
        BitSet bitSet = afErrorLog;
        this.AFLogger = new HashMap(bitSet.size());
        this.afRDLog = new ConcurrentHashMap(bitSet.size());
        this.AFInAppEventParameterName = new Runnable() {
            public final void run() {
                synchronized (AFg1pSDK.this.AFKeystoreWrapper) {
                    AFg1pSDK aFg1pSDK = AFg1pSDK.this;
                    aFg1pSDK.AFInAppEventType.post(new Runnable() {
                        public final void run() {
                            try {
                                for (Sensor next : AFg1pSDK.this.afInfoLog.getSensorList(-1)) {
                                    if (AFg1pSDK.values(next.getType())) {
                                        AFg1oSDK aFg1oSDK = new AFg1oSDK(next);
                                        if (!AFg1pSDK.this.AFLogger.containsKey(aFg1oSDK)) {
                                            AFg1pSDK.this.AFLogger.put(aFg1oSDK, aFg1oSDK);
                                        }
                                        AFg1pSDK.this.afInfoLog.registerListener((SensorEventListener) AFg1pSDK.this.AFLogger.get(aFg1oSDK), next, 0, AFg1pSDK.this.AFInAppEventType);
                                    }
                                }
                            } catch (Throwable th) {
                                AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
                            }
                            boolean unused = AFg1pSDK.this.afDebugLog = true;
                        }
                    });
                    AFg1pSDK.this.AFInAppEventType.postDelayed(AFg1pSDK.this.afErrorLogForExcManagerOnly, 100);
                    AFg1pSDK.this.valueOf = true;
                }
            }
        };
        this.values = new AFg1pSDK$$ExternalSyntheticLambda0(this);
        this.AFLogger$LogLevel = new Runnable() {
            public final void run() {
                synchronized (AFg1pSDK.this.AFKeystoreWrapper) {
                    if (AFg1pSDK.this.valueOf) {
                        AFg1pSDK.this.AFInAppEventType.removeCallbacks(AFg1pSDK.this.AFInAppEventParameterName);
                        AFg1pSDK.this.AFInAppEventType.removeCallbacks(AFg1pSDK.this.values);
                        AFg1pSDK aFg1pSDK = AFg1pSDK.this;
                        aFg1pSDK.AFInAppEventType.post(new Runnable() {
                            public final void run() {
                                try {
                                    if (!AFg1pSDK.this.AFLogger.isEmpty()) {
                                        for (AFg1oSDK aFg1oSDK : AFg1pSDK.this.AFLogger.values()) {
                                            AFg1pSDK.this.afInfoLog.unregisterListener(aFg1oSDK);
                                            aFg1oSDK.AFInAppEventType(AFg1pSDK.this.afRDLog, true);
                                        }
                                    }
                                } catch (Throwable th) {
                                    AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
                                }
                                int unused = AFg1pSDK.this.getLevel = 0;
                                boolean unused2 = AFg1pSDK.this.afDebugLog = false;
                            }
                        });
                        AFg1pSDK.this.valueOf = false;
                    }
                }
            }
        };
        this.getLevel = 1;
        this.AFVersionDeclaration = 0;
        this.afErrorLogForExcManagerOnly = new Runnable() {
            public final void run() {
                synchronized (AFg1pSDK.this.AFKeystoreWrapper) {
                    if (AFg1pSDK.this.getLevel == 0) {
                        int unused = AFg1pSDK.this.getLevel = 1;
                    }
                    AFg1pSDK.this.AFInAppEventType.postDelayed(AFg1pSDK.this.values, ((long) AFg1pSDK.this.getLevel) * 500);
                }
            }
        };
        this.afInfoLog = sensorManager;
        this.AFInAppEventType = handler;
    }

    /* access modifiers changed from: private */
    public static boolean values(int i) {
        return i >= 0 && afErrorLog.get(i);
    }

    public final void AFInAppEventParameterName() {
        this.AFInAppEventType.post(this.AFLogger$LogLevel);
        this.AFInAppEventType.post(this.AFInAppEventParameterName);
    }

    public final void AFKeystoreWrapper() {
        synchronized (this) {
            this.AFInAppEventType.post(this.AFLogger$LogLevel);
        }
    }

    private List<Map<String, Object>> AFInAppEventType() {
        for (AFg1oSDK AFInAppEventType2 : this.AFLogger.values()) {
            AFInAppEventType2.AFInAppEventType(this.afRDLog, true);
        }
        Map<AFg1oSDK, Map<String, Object>> map = this.afRDLog;
        if (map == null || map.isEmpty()) {
            return new CopyOnWriteArrayList(Collections.emptyList());
        }
        return new CopyOnWriteArrayList(this.afRDLog.values());
    }

    private List<Map<String, Object>> afInfoLog() {
        synchronized (this.AFKeystoreWrapper) {
            if (!this.AFLogger.isEmpty() && this.afDebugLog) {
                for (AFg1oSDK AFInAppEventType2 : this.AFLogger.values()) {
                    AFInAppEventType2.AFInAppEventType(this.afRDLog, false);
                }
            }
            if (this.afRDLog.isEmpty()) {
                CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Collections.emptyList());
                return copyOnWriteArrayList;
            }
            CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList(this.afRDLog.values());
            return copyOnWriteArrayList2;
        }
    }

    public final Map<String, Object> values() throws ParseException {
        AFg1rSDK.AFa1wSDK aFa1wSDK;
        Iterator<Map<String, Object>> it;
        ConcurrentHashMap concurrentHashMap;
        AFg1rSDK.AFa1wSDK aFa1wSDK2;
        ArrayList arrayList;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        List<Map<String, Object>> AFInAppEventType2 = AFInAppEventType();
        if (!AFInAppEventType2.isEmpty()) {
            new AFg1rSDK();
            HashMap hashMap = new HashMap();
            Iterator<Map<String, Object>> it2 = AFInAppEventType2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map next = it2.next();
                HashMap hashMap2 = new HashMap();
                boolean z = next.get("sVS") != null;
                boolean z2 = next.get("sVE") != null;
                if (z && z2) {
                    aFa1wSDK = AFg1rSDK.AFa1wSDK.ALL;
                } else if (z) {
                    aFa1wSDK = AFg1rSDK.AFa1wSDK.FIRST;
                } else {
                    aFa1wSDK = AFg1rSDK.AFa1wSDK.NONE;
                }
                if (aFa1wSDK == AFg1rSDK.AFa1wSDK.NONE) {
                    ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                    hashMap = new HashMap();
                    hashMap.put("er", "na");
                    break;
                }
                Integer num = (Integer) next.get("sT");
                String str = (String) next.get("sN");
                if (str != null) {
                    hashMap2.put("n", str);
                } else {
                    hashMap2.put("n", "uk");
                }
                AFg1rSDK.AFa1zSDK aFa1zSDK = AFg1rSDK.AFa1zSDK.values()[num.intValue()];
                ArrayList arrayList2 = new ArrayList(AFg1rSDK.AFInAppEventType(next.get("sVS")));
                if (aFa1wSDK == AFg1rSDK.AFa1wSDK.ALL) {
                    arrayList2.addAll(AFg1rSDK.AFInAppEventType(next.get("sVE")));
                }
                if (aFa1zSDK == AFg1rSDK.AFa1zSDK.MAGNETOMETER) {
                    ArrayList arrayList3 = new ArrayList();
                    aFa1wSDK2 = aFa1wSDK;
                    BigDecimal valueOf2 = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(1)).doubleValue(), ((BigDecimal) arrayList2.get(0)).doubleValue()) * 57.29577951308232d);
                    DecimalFormat decimalFormat = new DecimalFormat("##.#");
                    decimalFormat.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat.format(valueOf2))));
                    DecimalFormat decimalFormat2 = new DecimalFormat("##.#");
                    decimalFormat2.setRoundingMode(RoundingMode.DOWN);
                    arrayList3.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat2.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        concurrentHashMap = concurrentHashMap2;
                        it = it2;
                        BigDecimal subtract = BigDecimal.valueOf(Math.atan2(((BigDecimal) arrayList2.get(4)).doubleValue(), ((BigDecimal) arrayList2.get(3)).doubleValue()) * 57.29577951308232d).subtract(valueOf2);
                        DecimalFormat decimalFormat3 = new DecimalFormat("##.#");
                        decimalFormat3.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat3.format(subtract))));
                        BigDecimal subtract2 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat4 = new DecimalFormat("##.#");
                        decimalFormat4.setRoundingMode(RoundingMode.DOWN);
                        arrayList4.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat4.format(subtract2))));
                    } else {
                        concurrentHashMap = concurrentHashMap2;
                        it = it2;
                    }
                    arrayList = new ArrayList();
                    arrayList.add(arrayList3);
                    arrayList.add(arrayList4);
                } else {
                    concurrentHashMap = concurrentHashMap2;
                    it = it2;
                    aFa1wSDK2 = aFa1wSDK;
                    ArrayList arrayList5 = new ArrayList();
                    if (arrayList2.size() > 5) {
                        BigDecimal subtract3 = ((BigDecimal) arrayList2.get(3)).subtract((BigDecimal) arrayList2.get(0));
                        DecimalFormat decimalFormat5 = new DecimalFormat("##.#");
                        decimalFormat5.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat5.format(subtract3))));
                        BigDecimal subtract4 = ((BigDecimal) arrayList2.get(4)).subtract((BigDecimal) arrayList2.get(1));
                        DecimalFormat decimalFormat6 = new DecimalFormat("##.#");
                        decimalFormat6.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat6.format(subtract4))));
                        BigDecimal subtract5 = ((BigDecimal) arrayList2.get(5)).subtract((BigDecimal) arrayList2.get(2));
                        DecimalFormat decimalFormat7 = new DecimalFormat("##.#");
                        decimalFormat7.setRoundingMode(RoundingMode.DOWN);
                        arrayList5.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat7.format(subtract5))));
                    }
                    ArrayList arrayList6 = new ArrayList();
                    DecimalFormat decimalFormat8 = new DecimalFormat("##.#");
                    decimalFormat8.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat8.format((BigDecimal) arrayList2.get(0)))));
                    DecimalFormat decimalFormat9 = new DecimalFormat("##.#");
                    decimalFormat9.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat9.format((BigDecimal) arrayList2.get(1)))));
                    DecimalFormat decimalFormat10 = new DecimalFormat("##.#");
                    decimalFormat10.setRoundingMode(RoundingMode.DOWN);
                    arrayList6.add(Double.valueOf(AFb1oSDK.valueOf(decimalFormat10.format((BigDecimal) arrayList2.get(2)))));
                    ArrayList arrayList7 = new ArrayList();
                    arrayList7.add(arrayList6);
                    arrayList7.add(arrayList5);
                    arrayList = arrayList7;
                }
                hashMap2.put("v", arrayList);
                hashMap.put(AFg1rSDK.AFa1xSDK.values()[num.intValue()].AFKeystoreWrapper, hashMap2);
                if (aFa1wSDK2 == AFg1rSDK.AFa1wSDK.FIRST) {
                    hashMap.put("er", "no_svs");
                }
                concurrentHashMap2 = concurrentHashMap;
                it2 = it;
            }
            concurrentHashMap2.put("sensors", hashMap);
        } else {
            concurrentHashMap2.put("sensors", "na");
        }
        return concurrentHashMap2;
    }

    public final Map<String, Object> valueOf() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> afInfoLog2 = afInfoLog();
        if (!afInfoLog2.isEmpty()) {
            concurrentHashMap.put("sensors", afInfoLog2);
        } else {
            List<Map<String, Object>> AFInAppEventType2 = AFInAppEventType();
            if (!AFInAppEventType2.isEmpty()) {
                concurrentHashMap.put("sensors", AFInAppEventType2);
            }
        }
        return concurrentHashMap;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AFg1pSDK(android.content.Context r3) {
        /*
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            java.lang.String r0 = "sensor"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.hardware.SensorManager r3 = (android.hardware.SensorManager) r3
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "internal"
            r0.<init>(r1)
            r0.start()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = r0.getLooper()
            r1.<init>(r0)
            r2.<init>(r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFg1pSDK.<init>(android.content.Context):void");
    }
}
