package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AFg1oSDK implements SensorEventListener {
    private final int AFInAppEventParameterName;
    private final float[][] AFInAppEventType = new float[2][];
    private final long[] AFKeystoreWrapper = new long[2];
    private long AFLogger;
    private final int afErrorLog;
    private Executor afInfoLog;
    private double afRDLog;
    private final String valueOf;
    private final String values;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    AFg1oSDK(Sensor sensor) {
        int type = sensor.getType();
        this.AFInAppEventParameterName = type;
        String name = sensor.getName();
        String str = "";
        name = name == null ? str : name;
        this.valueOf = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.values = str;
        this.afErrorLog = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
    }

    private Executor AFInAppEventType() {
        Executor executor;
        synchronized (this) {
            if (this.afInfoLog == null) {
                this.afInfoLog = Executors.newSingleThreadExecutor();
            }
            executor = this.afInfoLog;
        }
        return executor;
    }

    private static double AFInAppEventParameterName(float[] fArr, float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow((double) (fArr[i] - fArr2[i]), 2.0d);
        }
        return Math.sqrt(d);
    }

    private static List<Float> values(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float valueOf2 : fArr) {
            arrayList.add(Float.valueOf(valueOf2));
        }
        return arrayList;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFInAppEventType().execute(new AFg1oSDK$$ExternalSyntheticLambda0(this, sensorEvent));
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: AFInAppEventParameterName */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.AFInAppEventType;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.AFKeystoreWrapper[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.AFInAppEventType[1] = copyOf;
            this.AFKeystoreWrapper[1] = currentTimeMillis;
            this.afRDLog = AFInAppEventParameterName(fArr3, copyOf);
        } else if (50000000 <= j - this.AFLogger) {
            this.AFLogger = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.AFKeystoreWrapper[1] = currentTimeMillis;
                return;
            }
            double AFInAppEventParameterName2 = AFInAppEventParameterName(fArr3, fArr);
            if (AFInAppEventParameterName2 > this.afRDLog) {
                this.AFInAppEventType[1] = Arrays.copyOf(fArr, fArr.length);
                this.AFKeystoreWrapper[1] = currentTimeMillis;
                this.afRDLog = AFInAppEventParameterName2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void AFInAppEventType(Map<AFg1oSDK, Map<String, Object>> map, boolean z) {
        if (values()) {
            map.put(this, AFKeystoreWrapper());
            if (z) {
                int length = this.AFInAppEventType.length;
                for (int i = 0; i < length; i++) {
                    this.AFInAppEventType[i] = null;
                }
                int length2 = this.AFKeystoreWrapper.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.AFKeystoreWrapper[i2] = 0;
                }
                this.afRDLog = 0.0d;
                this.AFLogger = 0;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, AFKeystoreWrapper());
        }
    }

    private boolean values(int i, String str, String str2) {
        return this.AFInAppEventParameterName == i && this.valueOf.equals(str) && this.values.equals(str2);
    }

    private Map<String, Object> AFKeystoreWrapper() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFInAppEventParameterName));
        concurrentHashMap.put("sN", this.valueOf);
        concurrentHashMap.put("sV", this.values);
        float[] fArr = this.AFInAppEventType[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", values(fArr));
        }
        float[] fArr2 = this.AFInAppEventType[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", values(fArr2));
        }
        return concurrentHashMap;
    }

    private boolean values() {
        return this.AFInAppEventType[0] != null;
    }

    public final int hashCode() {
        return this.afErrorLog;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AFg1oSDK)) {
            return false;
        }
        AFg1oSDK aFg1oSDK = (AFg1oSDK) obj;
        return values(aFg1oSDK.AFInAppEventParameterName, aFg1oSDK.valueOf, aFg1oSDK.values);
    }
}
