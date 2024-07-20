package com.baseflow.geolocator.location;

import java.util.Map;

public class LocationOptions {
    private final LocationAccuracy accuracy;
    private final long distanceFilter;
    private final long timeInterval;
    private final boolean useMSLAltitude;

    private LocationOptions(LocationAccuracy locationAccuracy, long j, long j2, boolean z) {
        this.accuracy = locationAccuracy;
        this.distanceFilter = j;
        this.timeInterval = j2;
        this.useMSLAltitude = z;
    }

    public static LocationOptions parseArguments(Map<String, Object> map) {
        if (map == null) {
            return new LocationOptions(LocationAccuracy.best, 0, 5000, false);
        }
        Integer num = (Integer) map.get("accuracy");
        Integer num2 = (Integer) map.get("distanceFilter");
        Integer num3 = (Integer) map.get("timeInterval");
        Boolean bool = (Boolean) map.get("useMSLAltitude");
        LocationAccuracy locationAccuracy = LocationAccuracy.best;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                locationAccuracy = LocationAccuracy.lowest;
            } else if (intValue == 1) {
                locationAccuracy = LocationAccuracy.low;
            } else if (intValue == 2) {
                locationAccuracy = LocationAccuracy.medium;
            } else if (intValue == 3) {
                locationAccuracy = LocationAccuracy.high;
            } else if (intValue == 5) {
                locationAccuracy = LocationAccuracy.bestForNavigation;
            }
        }
        return new LocationOptions(locationAccuracy, num2 != null ? (long) num2.intValue() : 0, num3 != null ? (long) num3.intValue() : 5000, bool != null && bool.booleanValue());
    }

    public LocationAccuracy getAccuracy() {
        return this.accuracy;
    }

    public long getDistanceFilter() {
        return this.distanceFilter;
    }

    public long getTimeInterval() {
        return this.timeInterval;
    }

    public boolean isUseMSLAltitude() {
        return this.useMSLAltitude;
    }
}
