package com.baseflow.geolocator.permission;

public enum LocationPermission {
    denied,
    deniedForever,
    whileInUse,
    always;

    /* renamed from: com.baseflow.geolocator.permission.LocationPermission$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baseflow$geolocator$permission$LocationPermission = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.baseflow.geolocator.permission.LocationPermission[] r0 = com.baseflow.geolocator.permission.LocationPermission.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$baseflow$geolocator$permission$LocationPermission = r0
                com.baseflow.geolocator.permission.LocationPermission r1 = com.baseflow.geolocator.permission.LocationPermission.denied     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$permission$LocationPermission     // Catch:{ NoSuchFieldError -> 0x001d }
                com.baseflow.geolocator.permission.LocationPermission r1 = com.baseflow.geolocator.permission.LocationPermission.deniedForever     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$permission$LocationPermission     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.baseflow.geolocator.permission.LocationPermission r1 = com.baseflow.geolocator.permission.LocationPermission.whileInUse     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$baseflow$geolocator$permission$LocationPermission     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.baseflow.geolocator.permission.LocationPermission r1 = com.baseflow.geolocator.permission.LocationPermission.always     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baseflow.geolocator.permission.LocationPermission.AnonymousClass1.<clinit>():void");
        }
    }

    public final int toInt() {
        int i = AnonymousClass1.$SwitchMap$com$baseflow$geolocator$permission$LocationPermission[ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new IndexOutOfBoundsException();
    }
}
