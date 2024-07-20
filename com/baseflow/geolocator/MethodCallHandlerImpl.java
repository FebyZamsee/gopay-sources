package com.baseflow.geolocator;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.baseflow.geolocator.errors.ErrorCodes;
import com.baseflow.geolocator.errors.PermissionUndefinedException;
import com.baseflow.geolocator.location.FlutterLocationServiceListener;
import com.baseflow.geolocator.location.GeolocationManager;
import com.baseflow.geolocator.location.LocationAccuracyManager;
import com.baseflow.geolocator.location.LocationAccuracyStatus;
import com.baseflow.geolocator.location.LocationClient;
import com.baseflow.geolocator.location.LocationMapper;
import com.baseflow.geolocator.location.LocationOptions;
import com.baseflow.geolocator.permission.PermissionManager;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.Map;

class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {
    private static final String TAG = "MethodCallHandlerImpl";
    private Activity activity;
    private MethodChannel channel;
    private Context context;
    private final GeolocationManager geolocationManager;
    private final LocationAccuracyManager locationAccuracyManager;
    final Map<String, LocationClient> pendingCurrentPositionLocationClients = new HashMap();
    private final PermissionManager permissionManager;

    MethodCallHandlerImpl(PermissionManager permissionManager2, GeolocationManager geolocationManager2, LocationAccuracyManager locationAccuracyManager2) {
        this.permissionManager = permissionManager2;
        this.geolocationManager = geolocationManager2;
        this.locationAccuracyManager = locationAccuracyManager2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r3, io.flutter.plugin.common.MethodChannel.Result r4) {
        /*
            r2 = this;
            java.lang.String r0 = r3.method
            r0.hashCode()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1757019252: goto L_0x005e;
                case -1156770336: goto L_0x0054;
                case -821636766: goto L_0x004a;
                case 347240634: goto L_0x0040;
                case 356040619: goto L_0x0036;
                case 686218487: goto L_0x002c;
                case 746581438: goto L_0x0022;
                case 877043524: goto L_0x0018;
                case 1774650278: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0068
        L_0x000d:
            java.lang.String r1 = "cancelGetCurrentPosition"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 8
            goto L_0x0069
        L_0x0018:
            java.lang.String r1 = "getLocationAccuracy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 7
            goto L_0x0069
        L_0x0022:
            java.lang.String r1 = "requestPermission"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 6
            goto L_0x0069
        L_0x002c:
            java.lang.String r1 = "checkPermission"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 5
            goto L_0x0069
        L_0x0036:
            java.lang.String r1 = "isLocationServiceEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 4
            goto L_0x0069
        L_0x0040:
            java.lang.String r1 = "openAppSettings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 3
            goto L_0x0069
        L_0x004a:
            java.lang.String r1 = "openLocationSettings"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 2
            goto L_0x0069
        L_0x0054:
            java.lang.String r1 = "getLastKnownPosition"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 1
            goto L_0x0069
        L_0x005e:
            java.lang.String r1 = "getCurrentPosition"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 0
            goto L_0x0069
        L_0x0068:
            r0 = -1
        L_0x0069:
            switch(r0) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x00a2;
                case 2: goto L_0x0094;
                case 3: goto L_0x0086;
                case 4: goto L_0x0082;
                case 5: goto L_0x007e;
                case 6: goto L_0x007a;
                case 7: goto L_0x0074;
                case 8: goto L_0x0070;
                default: goto L_0x006c;
            }
        L_0x006c:
            r4.notImplemented()
            return
        L_0x0070:
            r2.onCancelGetCurrentPosition(r3, r4)
            return
        L_0x0074:
            android.content.Context r3 = r2.context
            r2.getLocationAccuracy(r4, r3)
            return
        L_0x007a:
            r2.onRequestPermission(r4)
            return
        L_0x007e:
            r2.onCheckPermission(r4)
            return
        L_0x0082:
            r2.onIsLocationServiceEnabled(r4)
            return
        L_0x0086:
            android.content.Context r3 = r2.context
            boolean r3 = com.baseflow.geolocator.utils.Utils.openAppSettings(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.success(r3)
            return
        L_0x0094:
            android.content.Context r3 = r2.context
            boolean r3 = com.baseflow.geolocator.utils.Utils.openLocationSettings(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.success(r3)
            return
        L_0x00a2:
            r2.onGetLastKnownPosition(r3, r4)
            return
        L_0x00a6:
            r2.onGetCurrentPosition(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baseflow.geolocator.MethodCallHandlerImpl.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    /* access modifiers changed from: package-private */
    public void startListening(Context context2, BinaryMessenger binaryMessenger) {
        if (this.channel != null) {
            stopListening();
        }
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "flutter.baseflow.com/geolocator_android");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.context = context2;
    }

    /* access modifiers changed from: package-private */
    public void stopListening() {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
            this.channel = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setActivity(Activity activity2) {
        this.activity = activity2;
    }

    private void onCheckPermission(MethodChannel.Result result) {
        try {
            result.success(Integer.valueOf(this.permissionManager.checkPermissionStatus(this.context).toInt()));
        } catch (PermissionUndefinedException unused) {
            ErrorCodes errorCodes = ErrorCodes.permissionDefinitionsNotFound;
            result.error(errorCodes.toString(), errorCodes.toDescription(), (Object) null);
        }
    }

    private void onIsLocationServiceEnabled(MethodChannel.Result result) {
        this.geolocationManager.isLocationServiceEnabled(this.context, new FlutterLocationServiceListener(result));
    }

    private void onRequestPermission(MethodChannel.Result result) {
        try {
            this.permissionManager.requestPermission(this.activity, new MethodCallHandlerImpl$$ExternalSyntheticLambda3(result), new MethodCallHandlerImpl$$ExternalSyntheticLambda4(result));
        } catch (PermissionUndefinedException unused) {
            ErrorCodes errorCodes = ErrorCodes.permissionDefinitionsNotFound;
            result.error(errorCodes.toString(), errorCodes.toDescription(), (Object) null);
        }
    }

    private void getLocationAccuracy(MethodChannel.Result result, Context context2) {
        LocationAccuracyStatus locationAccuracy = this.locationAccuracyManager.getLocationAccuracy(context2, new MethodCallHandlerImpl$$ExternalSyntheticLambda2(result));
        if (locationAccuracy != null) {
            result.success(Integer.valueOf(locationAccuracy.ordinal()));
        }
    }

    private void onGetLastKnownPosition(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (!this.permissionManager.hasPermission(this.context)) {
                result.error(ErrorCodes.permissionDenied.toString(), ErrorCodes.permissionDenied.toDescription(), (Object) null);
                return;
            }
            Boolean bool = (Boolean) methodCall.argument("forceLocationManager");
            this.geolocationManager.getLastKnownPosition(this.context, bool != null && bool.booleanValue(), new MethodCallHandlerImpl$$ExternalSyntheticLambda0(result), new MethodCallHandlerImpl$$ExternalSyntheticLambda1(result));
        } catch (PermissionUndefinedException unused) {
            result.error(ErrorCodes.permissionDefinitionsNotFound.toString(), ErrorCodes.permissionDefinitionsNotFound.toDescription(), (Object) null);
        }
    }

    private void onGetCurrentPosition(MethodCall methodCall, MethodChannel.Result result) {
        try {
            if (!this.permissionManager.hasPermission(this.context)) {
                result.error(ErrorCodes.permissionDenied.toString(), ErrorCodes.permissionDenied.toDescription(), (Object) null);
                return;
            }
            Map map = (Map) methodCall.arguments;
            boolean booleanValue = map.get("forceLocationManager") != null ? ((Boolean) map.get("forceLocationManager")).booleanValue() : false;
            LocationOptions parseArguments = LocationOptions.parseArguments(map);
            String str = (String) map.get("requestId");
            LocationClient createLocationClient = this.geolocationManager.createLocationClient(this.context, booleanValue, parseArguments);
            this.pendingCurrentPositionLocationClients.put(str, createLocationClient);
            boolean[] zArr = {false};
            LocationClient locationClient = createLocationClient;
            String str2 = str;
            MethodChannel.Result result2 = result;
            this.geolocationManager.startPositionUpdates(createLocationClient, this.activity, new MethodCallHandlerImpl$$ExternalSyntheticLambda5(this, zArr, locationClient, str2, result2), new MethodCallHandlerImpl$$ExternalSyntheticLambda6(this, zArr, locationClient, str2, result2));
        } catch (PermissionUndefinedException unused) {
            result.error(ErrorCodes.permissionDefinitionsNotFound.toString(), ErrorCodes.permissionDefinitionsNotFound.toDescription(), (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onGetCurrentPosition$5$com-baseflow-geolocator-MethodCallHandlerImpl  reason: not valid java name */
    public /* synthetic */ void m58lambda$onGetCurrentPosition$5$combaseflowgeolocatorMethodCallHandlerImpl(boolean[] zArr, LocationClient locationClient, String str, MethodChannel.Result result, Location location) {
        if (!zArr[0]) {
            zArr[0] = true;
            this.geolocationManager.stopPositionUpdates(locationClient);
            this.pendingCurrentPositionLocationClients.remove(str);
            result.success(LocationMapper.toHashMap(location));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$onGetCurrentPosition$6$com-baseflow-geolocator-MethodCallHandlerImpl  reason: not valid java name */
    public /* synthetic */ void m59lambda$onGetCurrentPosition$6$combaseflowgeolocatorMethodCallHandlerImpl(boolean[] zArr, LocationClient locationClient, String str, MethodChannel.Result result, ErrorCodes errorCodes) {
        if (!zArr[0]) {
            zArr[0] = true;
            this.geolocationManager.stopPositionUpdates(locationClient);
            this.pendingCurrentPositionLocationClients.remove(str);
            result.error(errorCodes.toString(), errorCodes.toDescription(), (Object) null);
        }
    }

    private void onCancelGetCurrentPosition(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) ((Map) methodCall.arguments).get("requestId");
        LocationClient locationClient = this.pendingCurrentPositionLocationClients.get(str);
        if (locationClient != null) {
            locationClient.stopPositionUpdates();
        }
        this.pendingCurrentPositionLocationClients.remove(str);
        result.success((Object) null);
    }
}
