package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public final class AFg1rSDK {

    enum AFa1wSDK {
        NONE,
        FIRST,
        ALL
    }

    static List<BigDecimal> AFInAppEventType(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f = (Float) arrayList.get(0);
        Float f2 = (Float) arrayList.get(1);
        Float f3 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2.add(BigDecimal.valueOf(AFb1oSDK.valueOf(f.toString())));
            arrayList2.add(BigDecimal.valueOf(AFb1oSDK.valueOf(f2.toString())));
            arrayList2.add(BigDecimal.valueOf(AFb1oSDK.valueOf(f3.toString())));
        } catch (ParseException e) {
            AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", e);
        }
        return arrayList2;
    }

    enum AFa1zSDK {
        UNKNOWN(0),
        ACCELEROMETER(1),
        MAGNETOMETER(2),
        RESERVED(3),
        GYROSCOPE(4);
        
        private int afDebugLog;

        private AFa1zSDK(int i) {
            this.afDebugLog = i;
        }
    }

    enum AFa1xSDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        
        String AFKeystoreWrapper;

        private AFa1xSDK(String str) {
            this.AFKeystoreWrapper = str;
        }
    }
}
