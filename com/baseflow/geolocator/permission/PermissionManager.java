package com.baseflow.geolocator.permission;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.baseflow.geolocator.errors.ErrorCallback;
import com.baseflow.geolocator.errors.ErrorCodes;
import com.baseflow.geolocator.errors.PermissionUndefinedException;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PermissionManager implements PluginRegistry.RequestPermissionsResultListener {
    private static final int PERMISSION_REQUEST_CODE = 109;
    private Activity activity;
    private ErrorCallback errorCallback;
    private PermissionResultCallback resultCallback;

    public LocationPermission checkPermissionStatus(Context context) throws PermissionUndefinedException {
        char c;
        List<String> locationPermissionsFromManifest = getLocationPermissionsFromManifest(context);
        if (Build.VERSION.SDK_INT < 23) {
            return LocationPermission.always;
        }
        Iterator<String> it = locationPermissionsFromManifest.iterator();
        while (true) {
            if (it.hasNext()) {
                if (ContextCompat.checkSelfPermission(context, it.next()) == 0) {
                    c = 0;
                    break;
                }
            } else {
                c = 65535;
                break;
            }
        }
        if (c == 65535) {
            return LocationPermission.denied;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return LocationPermission.always;
        }
        if (!PermissionUtils.hasPermissionInManifest(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return LocationPermission.whileInUse;
        }
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return LocationPermission.always;
        }
        return LocationPermission.whileInUse;
    }

    public void requestPermission(Activity activity2, PermissionResultCallback permissionResultCallback, ErrorCallback errorCallback2) throws PermissionUndefinedException {
        if (activity2 == null) {
            errorCallback2.onError(ErrorCodes.activityMissing);
        } else if (Build.VERSION.SDK_INT < 23) {
            permissionResultCallback.onResult(LocationPermission.always);
        } else {
            List<String> locationPermissionsFromManifest = getLocationPermissionsFromManifest(activity2);
            if (Build.VERSION.SDK_INT >= 29 && PermissionUtils.hasPermissionInManifest(activity2, "android.permission.ACCESS_BACKGROUND_LOCATION") && checkPermissionStatus(activity2) == LocationPermission.whileInUse) {
                locationPermissionsFromManifest.add("android.permission.ACCESS_BACKGROUND_LOCATION");
            }
            this.errorCallback = errorCallback2;
            this.resultCallback = permissionResultCallback;
            this.activity = activity2;
            ActivityCompat.requestPermissions(activity2, (String[]) locationPermissionsFromManifest.toArray(new String[0]), 109);
        }
    }

    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 109) {
            return false;
        }
        Activity activity2 = this.activity;
        if (activity2 == null) {
            ErrorCallback errorCallback2 = this.errorCallback;
            if (errorCallback2 != null) {
                errorCallback2.onError(ErrorCodes.activityMissing);
            }
            return false;
        }
        try {
            List<String> locationPermissionsFromManifest = getLocationPermissionsFromManifest(activity2);
            if (iArr.length == 0) {
                return false;
            }
            LocationPermission locationPermission = LocationPermission.denied;
            char c = 65535;
            boolean z = false;
            boolean z2 = false;
            for (String next : locationPermissionsFromManifest) {
                int indexOf = indexOf(strArr, next);
                if (indexOf >= 0) {
                    z = true;
                }
                if (iArr[indexOf] == 0) {
                    c = 0;
                }
                if (ActivityCompat.shouldShowRequestPermissionRationale(this.activity, next)) {
                    z2 = true;
                }
            }
            if (!z) {
                return false;
            }
            if (c == 0) {
                if (Build.VERSION.SDK_INT < 29 || hasBackgroundAccess(strArr, iArr)) {
                    locationPermission = LocationPermission.always;
                } else {
                    locationPermission = LocationPermission.whileInUse;
                }
            } else if (!z2) {
                locationPermission = LocationPermission.deniedForever;
            }
            PermissionResultCallback permissionResultCallback = this.resultCallback;
            if (permissionResultCallback != null) {
                permissionResultCallback.onResult(locationPermission);
            }
            return true;
        } catch (PermissionUndefinedException unused) {
            ErrorCallback errorCallback3 = this.errorCallback;
            if (errorCallback3 != null) {
                errorCallback3.onError(ErrorCodes.permissionDefinitionsNotFound);
            }
            return false;
        }
    }

    private boolean hasBackgroundAccess(String[] strArr, int[] iArr) {
        int indexOf = indexOf(strArr, "android.permission.ACCESS_BACKGROUND_LOCATION");
        return indexOf >= 0 && iArr[indexOf] == 0;
    }

    private static <T> int indexOf(T[] tArr, T t) {
        return Arrays.asList(tArr).indexOf(t);
    }

    private static List<String> getLocationPermissionsFromManifest(Context context) throws PermissionUndefinedException {
        boolean hasPermissionInManifest = PermissionUtils.hasPermissionInManifest(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean hasPermissionInManifest2 = PermissionUtils.hasPermissionInManifest(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (hasPermissionInManifest || hasPermissionInManifest2) {
            ArrayList arrayList = new ArrayList();
            if (hasPermissionInManifest) {
                arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            }
            if (hasPermissionInManifest2) {
                arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            }
            return arrayList;
        }
        throw new PermissionUndefinedException();
    }

    public boolean hasPermission(Context context) throws PermissionUndefinedException {
        LocationPermission checkPermissionStatus = checkPermissionStatus(context);
        return checkPermissionStatus == LocationPermission.whileInUse || checkPermissionStatus == LocationPermission.always;
    }
}
