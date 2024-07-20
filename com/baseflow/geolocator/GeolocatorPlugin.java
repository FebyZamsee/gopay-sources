package com.baseflow.geolocator;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.baseflow.geolocator.GeolocatorLocationService;
import com.baseflow.geolocator.location.GeolocationManager;
import com.baseflow.geolocator.location.LocationAccuracyManager;
import com.baseflow.geolocator.permission.PermissionManager;
import io.flutter.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;

public class GeolocatorPlugin implements FlutterPlugin, ActivityAware {
    private static final String TAG = "FlutterGeolocator";
    /* access modifiers changed from: private */
    public GeolocatorLocationService foregroundLocationService;
    private final GeolocationManager geolocationManager = new GeolocationManager();
    private final LocationAccuracyManager locationAccuracyManager = new LocationAccuracyManager();
    private LocationServiceHandlerImpl locationServiceHandler;
    private MethodCallHandlerImpl methodCallHandler;
    private final PermissionManager permissionManager = new PermissionManager();
    private ActivityPluginBinding pluginBinding;
    private PluginRegistry.Registrar pluginRegistrar;
    private final ServiceConnection serviceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(GeolocatorPlugin.TAG, "Geolocator foreground service connected");
            if (iBinder instanceof GeolocatorLocationService.LocalBinder) {
                GeolocatorPlugin.this.initialize(((GeolocatorLocationService.LocalBinder) iBinder).getLocationService());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(GeolocatorPlugin.TAG, "Geolocator foreground service disconnected");
            if (GeolocatorPlugin.this.foregroundLocationService != null) {
                GeolocatorPlugin.this.foregroundLocationService.setActivity((Activity) null);
                GeolocatorLocationService unused = GeolocatorPlugin.this.foregroundLocationService = null;
            }
        }
    };
    private StreamHandlerImpl streamHandler;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        GeolocatorPlugin geolocatorPlugin = new GeolocatorPlugin();
        geolocatorPlugin.pluginRegistrar = registrar;
        geolocatorPlugin.registerListeners();
        MethodCallHandlerImpl methodCallHandlerImpl = new MethodCallHandlerImpl(geolocatorPlugin.permissionManager, geolocatorPlugin.geolocationManager, geolocatorPlugin.locationAccuracyManager);
        methodCallHandlerImpl.startListening(registrar.context(), registrar.messenger());
        methodCallHandlerImpl.setActivity(registrar.activity());
        new StreamHandlerImpl(geolocatorPlugin.permissionManager).startListening(registrar.context(), registrar.messenger());
        LocationServiceHandlerImpl locationServiceHandlerImpl = new LocationServiceHandlerImpl();
        locationServiceHandlerImpl.startListening(registrar.context(), registrar.messenger());
        locationServiceHandlerImpl.setContext(registrar.activeContext());
        geolocatorPlugin.bindForegroundService(registrar.activeContext());
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodCallHandlerImpl methodCallHandlerImpl = new MethodCallHandlerImpl(this.permissionManager, this.geolocationManager, this.locationAccuracyManager);
        this.methodCallHandler = methodCallHandlerImpl;
        methodCallHandlerImpl.startListening(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        StreamHandlerImpl streamHandlerImpl = new StreamHandlerImpl(this.permissionManager);
        this.streamHandler = streamHandlerImpl;
        streamHandlerImpl.startListening(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        LocationServiceHandlerImpl locationServiceHandlerImpl = new LocationServiceHandlerImpl();
        this.locationServiceHandler = locationServiceHandlerImpl;
        locationServiceHandlerImpl.setContext(flutterPluginBinding.getApplicationContext());
        this.locationServiceHandler.startListening(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
        bindForegroundService(flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        unbindForegroundService(flutterPluginBinding.getApplicationContext());
        dispose();
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Log.d(TAG, "Attaching Geolocator to activity");
        this.pluginBinding = activityPluginBinding;
        registerListeners();
        MethodCallHandlerImpl methodCallHandlerImpl = this.methodCallHandler;
        if (methodCallHandlerImpl != null) {
            methodCallHandlerImpl.setActivity(activityPluginBinding.getActivity());
        }
        StreamHandlerImpl streamHandlerImpl = this.streamHandler;
        if (streamHandlerImpl != null) {
            streamHandlerImpl.setActivity(activityPluginBinding.getActivity());
        }
        GeolocatorLocationService geolocatorLocationService = this.foregroundLocationService;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.setActivity(this.pluginBinding.getActivity());
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }

    public void onDetachedFromActivity() {
        Log.d(TAG, "Detaching Geolocator from activity");
        deregisterListeners();
        MethodCallHandlerImpl methodCallHandlerImpl = this.methodCallHandler;
        if (methodCallHandlerImpl != null) {
            methodCallHandlerImpl.setActivity((Activity) null);
        }
        StreamHandlerImpl streamHandlerImpl = this.streamHandler;
        if (streamHandlerImpl != null) {
            streamHandlerImpl.setActivity((Activity) null);
        }
        GeolocatorLocationService geolocatorLocationService = this.foregroundLocationService;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.setActivity((Activity) null);
        }
        if (this.pluginBinding != null) {
            this.pluginBinding = null;
        }
    }

    private void registerListeners() {
        PluginRegistry.Registrar registrar = this.pluginRegistrar;
        if (registrar != null) {
            registrar.addActivityResultListener(this.geolocationManager);
            this.pluginRegistrar.addRequestPermissionsResultListener(this.permissionManager);
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.pluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.addActivityResultListener(this.geolocationManager);
            this.pluginBinding.addRequestPermissionsResultListener(this.permissionManager);
        }
    }

    private void deregisterListeners() {
        ActivityPluginBinding activityPluginBinding = this.pluginBinding;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this.geolocationManager);
            this.pluginBinding.removeRequestPermissionsResultListener(this.permissionManager);
        }
    }

    private void bindForegroundService(Context context) {
        context.bindService(new Intent(context, GeolocatorLocationService.class), this.serviceConnection, 1);
    }

    private void unbindForegroundService(Context context) {
        GeolocatorLocationService geolocatorLocationService = this.foregroundLocationService;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.flutterEngineDisconnected();
        }
        context.unbindService(this.serviceConnection);
    }

    /* access modifiers changed from: private */
    public void initialize(GeolocatorLocationService geolocatorLocationService) {
        Log.d(TAG, "Initializing Geolocator services");
        this.foregroundLocationService = geolocatorLocationService;
        geolocatorLocationService.flutterEngineConnected();
        StreamHandlerImpl streamHandlerImpl = this.streamHandler;
        if (streamHandlerImpl != null) {
            streamHandlerImpl.setForegroundLocationService(geolocatorLocationService);
        }
    }

    private void dispose() {
        Log.d(TAG, "Disposing Geolocator services");
        MethodCallHandlerImpl methodCallHandlerImpl = this.methodCallHandler;
        if (methodCallHandlerImpl != null) {
            methodCallHandlerImpl.stopListening();
            this.methodCallHandler.setActivity((Activity) null);
            this.methodCallHandler = null;
        }
        StreamHandlerImpl streamHandlerImpl = this.streamHandler;
        if (streamHandlerImpl != null) {
            streamHandlerImpl.stopListening();
            this.streamHandler.setForegroundLocationService((GeolocatorLocationService) null);
            this.streamHandler = null;
        }
        LocationServiceHandlerImpl locationServiceHandlerImpl = this.locationServiceHandler;
        if (locationServiceHandlerImpl != null) {
            locationServiceHandlerImpl.setContext((Context) null);
            this.locationServiceHandler.stopListening();
            this.locationServiceHandler = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.foregroundLocationService;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.setActivity((Activity) null);
        }
    }
}
