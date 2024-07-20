package com.baseflow.geolocator.errors;

public enum ErrorCodes {
    activityMissing,
    errorWhileAcquiringPosition,
    locationServicesDisabled,
    permissionDefinitionsNotFound,
    permissionDenied,
    permissionRequestInProgress;

    /* renamed from: com.baseflow.geolocator.errors.ErrorCodes$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baseflow$geolocator$errors$ErrorCodes = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.baseflow.geolocator.errors.ErrorCodes[] r0 = com.baseflow.geolocator.errors.ErrorCodes.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$baseflow$geolocator$errors$ErrorCodes = r0
                com.baseflow.geolocator.errors.ErrorCodes r1 = com.baseflow.geolocator.errors.ErrorCodes.activityMissing     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$errors$ErrorCodes     // Catch:{ NoSuchFieldError -> 0x001d }
                com.baseflow.geolocator.errors.ErrorCodes r1 = com.baseflow.geolocator.errors.ErrorCodes.errorWhileAcquiringPosition     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$errors$ErrorCodes     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.baseflow.geolocator.errors.ErrorCodes r1 = com.baseflow.geolocator.errors.ErrorCodes.locationServicesDisabled     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$errors$ErrorCodes     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.baseflow.geolocator.errors.ErrorCodes r1 = com.baseflow.geolocator.errors.ErrorCodes.permissionDefinitionsNotFound     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$errors$ErrorCodes     // Catch:{ NoSuchFieldError -> 0x003e }
                com.baseflow.geolocator.errors.ErrorCodes r1 = com.baseflow.geolocator.errors.ErrorCodes.permissionDenied     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$errors$ErrorCodes     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.baseflow.geolocator.errors.ErrorCodes r1 = com.baseflow.geolocator.errors.ErrorCodes.permissionRequestInProgress     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baseflow.geolocator.errors.ErrorCodes.AnonymousClass1.<clinit>():void");
        }
    }

    public final String toString() {
        switch (AnonymousClass1.$SwitchMap$com$baseflow$geolocator$errors$ErrorCodes[ordinal()]) {
            case 1:
                return "ACTIVITY_MISSING";
            case 2:
                return "ERROR_WHILE_ACQUIRING_POSITION";
            case 3:
                return "LOCATION_SERVICES_DISABLED";
            case 4:
                return "PERMISSION_DEFINITIONS_NOT_FOUND";
            case 5:
                return "PERMISSION_DENIED";
            case 6:
                return "PERMISSION_REQUEST_IN_PROGRESS";
            default:
                throw new IndexOutOfBoundsException();
        }
    }

    public final String toDescription() {
        switch (AnonymousClass1.$SwitchMap$com$baseflow$geolocator$errors$ErrorCodes[ordinal()]) {
            case 1:
                return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
            case 2:
                return "An unexpected error occurred while trying to acquire the device's position.";
            case 3:
                return "Location services are disabled. To receive location updates the location services should be enabled.";
            case 4:
                return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
            case 5:
                return "User denied permissions to access the device's location.";
            case 6:
                return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
            default:
                throw new IndexOutOfBoundsException();
        }
    }
}
