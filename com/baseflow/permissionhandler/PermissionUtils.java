package com.baseflow.permissionhandler;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Environment;
import androidx.core.app.ActivityCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PermissionUtils {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int parseManifestName(java.lang.String r22) {
        /*
            r0 = r22
            r22.hashCode()
            int r1 = r22.hashCode()
            r2 = 30
            r3 = 29
            r4 = 28
            r5 = 27
            r6 = 24
            r7 = 23
            r8 = 22
            r9 = 20
            r10 = 19
            r11 = 18
            r12 = 15
            r13 = 13
            r14 = 12
            r15 = 8
            r16 = 7
            r17 = 4
            r18 = 3
            r19 = 2
            r20 = 1
            r21 = 0
            switch(r1) {
                case -2062386608: goto L_0x01be;
                case -1928411001: goto L_0x01b4;
                case -1921431796: goto L_0x01aa;
                case -1888586689: goto L_0x01a0;
                case -1813079487: goto L_0x0196;
                case -1783097621: goto L_0x018c;
                case -1561629405: goto L_0x0182;
                case -1479758289: goto L_0x0178;
                case -1238066820: goto L_0x016d;
                case -1164582768: goto L_0x0162;
                case -901151997: goto L_0x0156;
                case -895679497: goto L_0x014a;
                case -895673731: goto L_0x013e;
                case -798669607: goto L_0x0132;
                case -406040016: goto L_0x0126;
                case -63024214: goto L_0x011a;
                case -5573545: goto L_0x010e;
                case 52602690: goto L_0x0102;
                case 112197485: goto L_0x00f6;
                case 214526995: goto L_0x00ea;
                case 463403621: goto L_0x00de;
                case 603653886: goto L_0x00d2;
                case 610633091: goto L_0x00c6;
                case 784519842: goto L_0x00ba;
                case 1166454870: goto L_0x00ae;
                case 1271781903: goto L_0x00a2;
                case 1365911975: goto L_0x0096;
                case 1777263169: goto L_0x008a;
                case 1780337063: goto L_0x007e;
                case 1831139720: goto L_0x0072;
                case 1977429404: goto L_0x0066;
                case 2024715147: goto L_0x005a;
                case 2062356686: goto L_0x004e;
                case 2114579147: goto L_0x0042;
                case 2133799037: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x01c8
        L_0x0036:
            java.lang.String r1 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 34
            goto L_0x01c9
        L_0x0042:
            java.lang.String r1 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 33
            goto L_0x01c9
        L_0x004e:
            java.lang.String r1 = "android.permission.BLUETOOTH_SCAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 32
            goto L_0x01c9
        L_0x005a:
            java.lang.String r1 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 31
            goto L_0x01c9
        L_0x0066:
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 30
            goto L_0x01c9
        L_0x0072:
            java.lang.String r1 = "android.permission.RECORD_AUDIO"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 29
            goto L_0x01c9
        L_0x007e:
            java.lang.String r1 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 28
            goto L_0x01c9
        L_0x008a:
            java.lang.String r1 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 27
            goto L_0x01c9
        L_0x0096:
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 26
            goto L_0x01c9
        L_0x00a2:
            java.lang.String r1 = "android.permission.GET_ACCOUNTS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 25
            goto L_0x01c9
        L_0x00ae:
            java.lang.String r1 = "android.permission.BLUETOOTH_ADVERTISE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 24
            goto L_0x01c9
        L_0x00ba:
            java.lang.String r1 = "android.permission.USE_SIP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 23
            goto L_0x01c9
        L_0x00c6:
            java.lang.String r1 = "android.permission.WRITE_CALL_LOG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 22
            goto L_0x01c9
        L_0x00d2:
            java.lang.String r1 = "android.permission.WRITE_CALENDAR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 21
            goto L_0x01c9
        L_0x00de:
            java.lang.String r1 = "android.permission.CAMERA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 20
            goto L_0x01c9
        L_0x00ea:
            java.lang.String r1 = "android.permission.WRITE_CONTACTS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 19
            goto L_0x01c9
        L_0x00f6:
            java.lang.String r1 = "android.permission.CALL_PHONE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 18
            goto L_0x01c9
        L_0x0102:
            java.lang.String r1 = "android.permission.SEND_SMS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 17
            goto L_0x01c9
        L_0x010e:
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 16
            goto L_0x01c9
        L_0x011a:
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 15
            goto L_0x01c9
        L_0x0126:
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 14
            goto L_0x01c9
        L_0x0132:
            java.lang.String r1 = "android.permission.BLUETOOTH_CONNECT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 13
            goto L_0x01c9
        L_0x013e:
            java.lang.String r1 = "android.permission.RECEIVE_SMS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 12
            goto L_0x01c9
        L_0x014a:
            java.lang.String r1 = "android.permission.RECEIVE_MMS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 11
            goto L_0x01c9
        L_0x0156:
            java.lang.String r1 = "android.permission.BIND_CALL_REDIRECTION_SERVICE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 10
            goto L_0x01c9
        L_0x0162:
            java.lang.String r1 = "android.permission.READ_PHONE_NUMBERS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 9
            goto L_0x01c9
        L_0x016d:
            java.lang.String r1 = "android.permission.BODY_SENSORS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 8
            goto L_0x01c9
        L_0x0178:
            java.lang.String r1 = "android.permission.RECEIVE_WAP_PUSH"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 7
            goto L_0x01c9
        L_0x0182:
            java.lang.String r1 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 6
            goto L_0x01c9
        L_0x018c:
            java.lang.String r1 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 5
            goto L_0x01c9
        L_0x0196:
            java.lang.String r1 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 4
            goto L_0x01c9
        L_0x01a0:
            java.lang.String r1 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 3
            goto L_0x01c9
        L_0x01aa:
            java.lang.String r1 = "android.permission.READ_CALL_LOG"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 2
            goto L_0x01c9
        L_0x01b4:
            java.lang.String r1 = "android.permission.READ_CALENDAR"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 1
            goto L_0x01c9
        L_0x01be:
            java.lang.String r1 = "android.permission.READ_SMS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01c8
            r0 = 0
            goto L_0x01c9
        L_0x01c8:
            r0 = -1
        L_0x01c9:
            switch(r0) {
                case 0: goto L_0x01df;
                case 1: goto L_0x01de;
                case 2: goto L_0x01dd;
                case 3: goto L_0x01dc;
                case 4: goto L_0x01db;
                case 5: goto L_0x01da;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01df;
                case 8: goto L_0x01d8;
                case 9: goto L_0x01dd;
                case 10: goto L_0x01dd;
                case 11: goto L_0x01df;
                case 12: goto L_0x01df;
                case 13: goto L_0x01d7;
                case 14: goto L_0x01d6;
                case 15: goto L_0x01dc;
                case 16: goto L_0x01dd;
                case 17: goto L_0x01df;
                case 18: goto L_0x01dd;
                case 19: goto L_0x01d5;
                case 20: goto L_0x01d4;
                case 21: goto L_0x01de;
                case 22: goto L_0x01dd;
                case 23: goto L_0x01dd;
                case 24: goto L_0x01d3;
                case 25: goto L_0x01d5;
                case 26: goto L_0x01d6;
                case 27: goto L_0x01d2;
                case 28: goto L_0x01d1;
                case 29: goto L_0x01d0;
                case 30: goto L_0x01d5;
                case 31: goto L_0x01cf;
                case 32: goto L_0x01ce;
                case 33: goto L_0x01cd;
                case 34: goto L_0x01dd;
                default: goto L_0x01cc;
            }
        L_0x01cc:
            return r9
        L_0x01cd:
            return r11
        L_0x01ce:
            return r4
        L_0x01cf:
            return r17
        L_0x01d0:
            return r16
        L_0x01d1:
            return r10
        L_0x01d2:
            return r6
        L_0x01d3:
            return r3
        L_0x01d4:
            return r20
        L_0x01d5:
            return r19
        L_0x01d6:
            return r12
        L_0x01d7:
            return r2
        L_0x01d8:
            return r14
        L_0x01d9:
            return r7
        L_0x01da:
            return r5
        L_0x01db:
            return r8
        L_0x01dc:
            return r18
        L_0x01dd:
            return r15
        L_0x01de:
            return r21
        L_0x01df:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baseflow.permissionhandler.PermissionUtils.parseManifestName(java.lang.String):int");
    }

    static List<String> getManifestNames(Context context, int i) {
        ArrayList arrayList = new ArrayList();
        switch (i) {
            case 0:
                if (hasPermissionInManifest(context, arrayList, "android.permission.READ_CALENDAR")) {
                    arrayList.add("android.permission.READ_CALENDAR");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.WRITE_CALENDAR")) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                    break;
                }
                break;
            case 1:
                if (hasPermissionInManifest(context, arrayList, "android.permission.CAMERA")) {
                    arrayList.add("android.permission.CAMERA");
                    break;
                }
                break;
            case 2:
                if (hasPermissionInManifest(context, arrayList, "android.permission.READ_CONTACTS")) {
                    arrayList.add("android.permission.READ_CONTACTS");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.WRITE_CONTACTS")) {
                    arrayList.add("android.permission.WRITE_CONTACTS");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.GET_ACCOUNTS")) {
                    arrayList.add("android.permission.GET_ACCOUNTS");
                    break;
                }
                break;
            case 3:
            case 5:
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 29 && hasPermissionInManifest(context, arrayList, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    arrayList.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    break;
                }
            case 6:
            case 9:
            case 11:
            case 17:
            case 20:
                return null;
            case 7:
            case 14:
                if (hasPermissionInManifest(context, arrayList, "android.permission.RECORD_AUDIO")) {
                    arrayList.add("android.permission.RECORD_AUDIO");
                    break;
                }
                break;
            case 8:
                if (hasPermissionInManifest(context, arrayList, "android.permission.READ_PHONE_STATE")) {
                    arrayList.add("android.permission.READ_PHONE_STATE");
                }
                if (Build.VERSION.SDK_INT > 29 && hasPermissionInManifest(context, arrayList, "android.permission.READ_PHONE_NUMBERS")) {
                    arrayList.add("android.permission.READ_PHONE_NUMBERS");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.CALL_PHONE")) {
                    arrayList.add("android.permission.CALL_PHONE");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.READ_CALL_LOG")) {
                    arrayList.add("android.permission.READ_CALL_LOG");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.WRITE_CALL_LOG")) {
                    arrayList.add("android.permission.WRITE_CALL_LOG");
                }
                if (hasPermissionInManifest(context, arrayList, "com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    arrayList.add("com.android.voicemail.permission.ADD_VOICEMAIL");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.USE_SIP")) {
                    arrayList.add("android.permission.USE_SIP");
                }
                if (Build.VERSION.SDK_INT >= 29 && hasPermissionInManifest(context, arrayList, "android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    arrayList.add("android.permission.BIND_CALL_REDIRECTION_SERVICE");
                }
                if (Build.VERSION.SDK_INT >= 26 && hasPermissionInManifest(context, arrayList, "android.permission.ANSWER_PHONE_CALLS")) {
                    arrayList.add("android.permission.ANSWER_PHONE_CALLS");
                    break;
                }
            case 12:
                if (hasPermissionInManifest(context, arrayList, "android.permission.BODY_SENSORS")) {
                    arrayList.add("android.permission.BODY_SENSORS");
                    break;
                }
                break;
            case 13:
                if (hasPermissionInManifest(context, arrayList, "android.permission.SEND_SMS")) {
                    arrayList.add("android.permission.SEND_SMS");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.RECEIVE_SMS")) {
                    arrayList.add("android.permission.RECEIVE_SMS");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.READ_SMS")) {
                    arrayList.add("android.permission.READ_SMS");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.RECEIVE_WAP_PUSH")) {
                    arrayList.add("android.permission.RECEIVE_WAP_PUSH");
                }
                if (hasPermissionInManifest(context, arrayList, "android.permission.RECEIVE_MMS")) {
                    arrayList.add("android.permission.RECEIVE_MMS");
                    break;
                }
                break;
            case 15:
                if (hasPermissionInManifest(context, arrayList, "android.permission.READ_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
                }
                if ((Build.VERSION.SDK_INT < 29 || (Build.VERSION.SDK_INT == 29 && Environment.isExternalStorageLegacy())) && hasPermissionInManifest(context, arrayList, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
                    break;
                }
            case 16:
                if (Build.VERSION.SDK_INT >= 23 && hasPermissionInManifest(context, arrayList, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) {
                    arrayList.add("android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
                    break;
                }
            case 18:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (hasPermissionInManifest(context, arrayList, "android.permission.ACCESS_MEDIA_LOCATION")) {
                        arrayList.add("android.permission.ACCESS_MEDIA_LOCATION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 19:
                if (Build.VERSION.SDK_INT >= 29) {
                    if (hasPermissionInManifest(context, arrayList, "android.permission.ACTIVITY_RECOGNITION")) {
                        arrayList.add("android.permission.ACTIVITY_RECOGNITION");
                        break;
                    }
                } else {
                    return null;
                }
                break;
            case 21:
                if (hasPermissionInManifest(context, arrayList, "android.permission.BLUETOOTH")) {
                    arrayList.add("android.permission.BLUETOOTH");
                    break;
                }
                break;
            case 22:
                if (Build.VERSION.SDK_INT >= 30 && hasPermissionInManifest(context, arrayList, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    arrayList.add("android.permission.MANAGE_EXTERNAL_STORAGE");
                    break;
                }
            case 23:
                if (hasPermissionInManifest(context, arrayList, "android.permission.SYSTEM_ALERT_WINDOW")) {
                    arrayList.add("android.permission.SYSTEM_ALERT_WINDOW");
                    break;
                }
                break;
            case 24:
                if (Build.VERSION.SDK_INT >= 23 && hasPermissionInManifest(context, arrayList, "android.permission.REQUEST_INSTALL_PACKAGES")) {
                    arrayList.add("android.permission.REQUEST_INSTALL_PACKAGES");
                    break;
                }
            case 27:
                if (Build.VERSION.SDK_INT >= 23 && hasPermissionInManifest(context, arrayList, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    arrayList.add("android.permission.ACCESS_NOTIFICATION_POLICY");
                    break;
                }
            case 28:
                String determineBluetoothPermission = determineBluetoothPermission(context, "android.permission.BLUETOOTH_SCAN");
                if (determineBluetoothPermission != null) {
                    arrayList.add(determineBluetoothPermission);
                    break;
                }
                break;
            case 29:
                String determineBluetoothPermission2 = determineBluetoothPermission(context, "android.permission.BLUETOOTH_ADVERTISE");
                if (determineBluetoothPermission2 != null) {
                    arrayList.add(determineBluetoothPermission2);
                    break;
                }
                break;
            case 30:
                String determineBluetoothPermission3 = determineBluetoothPermission(context, "android.permission.BLUETOOTH_CONNECT");
                if (determineBluetoothPermission3 != null) {
                    arrayList.add(determineBluetoothPermission3);
                    break;
                }
                break;
        }
        if (hasPermissionInManifest(context, arrayList, "android.permission.ACCESS_COARSE_LOCATION")) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (hasPermissionInManifest(context, arrayList, "android.permission.ACCESS_FINE_LOCATION")) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        return arrayList;
    }

    private static boolean hasPermissionInManifest(Context context, ArrayList<String> arrayList, String str) {
        PackageInfo packageInfo;
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (context == null || (packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096)) == null) {
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    static int toPermissionStatus(Activity activity, String str, int i) {
        if (i == -1) {
            return (Build.VERSION.SDK_INT < 23 || !isNeverAskAgainSelected(activity, str)) ? 0 : 4;
        }
        return 1;
    }

    static void updatePermissionShouldShowStatus(Activity activity, int i) {
        List<String> manifestNames;
        if (activity != null && (manifestNames = getManifestNames(activity, i)) != null) {
            manifestNames.isEmpty();
        }
    }

    static boolean isNeverAskAgainSelected(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return !ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
    }

    private static String determineBluetoothPermission(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 31 && hasPermissionInManifest(context, (ArrayList<String>) null, str)) {
            return str;
        }
        if (Build.VERSION.SDK_INT < 29) {
            if (hasPermissionInManifest(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (hasPermissionInManifest(context, (ArrayList<String>) null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        } else if (Build.VERSION.SDK_INT < 29 || !hasPermissionInManifest(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }
}
