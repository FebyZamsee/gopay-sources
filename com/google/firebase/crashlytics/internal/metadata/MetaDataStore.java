package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import io.flutter.plugins.firebase.analytics.Constants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class MetaDataStore {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final FileStore fileStore;

    public MetaDataStore(FileStore fileStore2) {
        this.fileStore = fileStore2;
    }

    public void writeUserData(String str, String str2) {
        File userDataFileForSession = getUserDataFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String userIdToJson = userIdToJson(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(userDataFileForSession), UTF_8));
            try {
                bufferedWriter2.write(userIdToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().w("Error serializing user metadata.", e);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().w("Error serializing user metadata.", e);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        }
    }

    public String readUserId(String str) {
        FileInputStream fileInputStream;
        File userDataFileForSession = getUserDataFileForSession(str);
        FileInputStream fileInputStream2 = null;
        if (!userDataFileForSession.exists() || userDataFileForSession.length() == 0) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("No userId set for session ");
            sb.append(str);
            logger.d(sb.toString());
            safeDeleteCorruptFile(userDataFileForSession);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(userDataFileForSession);
            try {
                String jsonToUserId = jsonToUserId(CommonUtils.streamToString(fileInputStream));
                Logger logger2 = Logger.getLogger();
                StringBuilder sb2 = new StringBuilder("Loaded userId ");
                sb2.append(jsonToUserId);
                sb2.append(" for session ");
                sb2.append(str);
                logger2.d(sb2.toString());
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                return jsonToUserId;
            } catch (Exception e) {
                e = e;
                try {
                    Logger.getLogger().w("Error deserializing user metadata.", e);
                    safeDeleteCorruptFile(userDataFileForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            Logger.getLogger().w("Error deserializing user metadata.", e);
            safeDeleteCorruptFile(userDataFileForSession);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    public void writeKeyData(String str, Map<String, String> map) {
        writeKeyData(str, map, false);
    }

    public void writeKeyData(String str, Map<String, String> map, boolean z) {
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        BufferedWriter bufferedWriter = null;
        try {
            String keysDataToJson = keysDataToJson(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(internalKeysFileForSession), UTF_8));
            try {
                bufferedWriter2.write(keysDataToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().w("Error serializing key/value metadata.", e);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().w("Error serializing key/value metadata.", e);
            safeDeleteCorruptFile(internalKeysFileForSession);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, String> readKeyData(String str, boolean z) {
        File internalKeysFileForSession = z ? getInternalKeysFileForSession(str) : getKeysFileForSession(str);
        if (!internalKeysFileForSession.exists() || internalKeysFileForSession.length() == 0) {
            safeDeleteCorruptFile(internalKeysFileForSession);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(internalKeysFileForSession);
            try {
                Map<String, String> jsonToKeysData = jsonToKeysData(CommonUtils.streamToString(fileInputStream2));
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close user metadata file.");
                return jsonToKeysData;
            } catch (Exception e) {
                FileInputStream fileInputStream3 = fileInputStream2;
                e = e;
                fileInputStream = fileInputStream3;
                try {
                    Logger.getLogger().w("Error deserializing user metadata.", e);
                    safeDeleteCorruptFile(internalKeysFileForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().w("Error deserializing user metadata.", e);
            safeDeleteCorruptFile(internalKeysFileForSession);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        }
    }

    public List<RolloutAssignment> readRolloutsState(String str) {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (!rolloutsStateForSession.exists() || rolloutsStateForSession.length() == 0) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return Collections.emptyList();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(rolloutsStateForSession);
            try {
                List<RolloutAssignment> jsonToRolloutsState = jsonToRolloutsState(CommonUtils.streamToString(fileInputStream2));
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Loaded rollouts state:\n");
                sb.append(jsonToRolloutsState);
                sb.append("\nfor session ");
                sb.append(str);
                logger.d(sb.toString());
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                return jsonToRolloutsState;
            } catch (Exception e) {
                e = e;
                fileInputStream = fileInputStream2;
                try {
                    Logger.getLogger().w("Error deserializing rollouts state.", e);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
                    return Collections.emptyList();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(fileInputStream2, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().w("Error deserializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close rollouts state file.");
            return Collections.emptyList();
        }
    }

    public void writeRolloutState(String str, List<RolloutAssignment> list) {
        File rolloutsStateForSession = getRolloutsStateForSession(str);
        if (list.isEmpty()) {
            safeDeleteCorruptFile(rolloutsStateForSession);
            return;
        }
        BufferedWriter bufferedWriter = null;
        try {
            String rolloutsStateToJson = rolloutsStateToJson(list);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(rolloutsStateForSession), UTF_8));
            try {
                bufferedWriter2.write(rolloutsStateToJson);
                bufferedWriter2.flush();
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    Logger.getLogger().w("Error serializing rollouts state.", e);
                    safeDeleteCorruptFile(rolloutsStateForSession);
                    CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter2 = bufferedWriter;
                    CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                CommonUtils.closeOrLog(bufferedWriter2, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.getLogger().w("Error serializing rollouts state.", e);
            safeDeleteCorruptFile(rolloutsStateForSession);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close rollouts state file.");
        }
    }

    public File getUserDataFileForSession(String str) {
        return this.fileStore.getSessionFile(str, "user-data");
    }

    public File getKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, "keys");
    }

    public File getInternalKeysFileForSession(String str) {
        return this.fileStore.getSessionFile(str, "internal-keys");
    }

    public File getRolloutsStateForSession(String str) {
        return this.fileStore.getSessionFile(str, "rollouts-state");
    }

    private String jsonToUserId(String str) throws JSONException {
        return valueOrNull(new JSONObject(str), Constants.USER_ID);
    }

    private static String userIdToJson(String str) throws JSONException {
        return new JSONObject(str) {
            final /* synthetic */ String val$userId;

            {
                this.val$userId = r2;
                put(Constants.USER_ID, r2);
            }
        }.toString();
    }

    private static Map<String, String> jsonToKeysData(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    private static String keysDataToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    private static List<RolloutAssignment> jsonToRolloutsState(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.create(string));
            } catch (Exception e) {
                Logger logger = Logger.getLogger();
                StringBuilder sb = new StringBuilder("Failed de-serializing rollouts state. ");
                sb.append(string);
                logger.w(sb.toString(), e);
            }
        }
        return arrayList;
    }

    private static String rolloutsStateToJson(List<RolloutAssignment> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.ROLLOUT_ASSIGNMENT_JSON_ENCODER.encode(list.get(i))));
            } catch (JSONException e) {
                Logger.getLogger().w("Exception parsing rollout assignment!", e);
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    private static String valueOrNull(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    private static void safeDeleteCorruptFile(File file) {
        if (file.exists() && file.delete()) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Deleted corrupt file: ");
            sb.append(file.getAbsolutePath());
            logger.i(sb.toString());
        }
    }
}
