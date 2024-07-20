package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RolloutsStateFactory {
    ConfigGetParameterHandler getParameterHandler;

    RolloutsStateFactory(ConfigGetParameterHandler configGetParameterHandler) {
        this.getParameterHandler = configGetParameterHandler;
    }

    /* access modifiers changed from: package-private */
    public RolloutsState getActiveRolloutsState(ConfigContainer configContainer) throws FirebaseRemoteConfigClientException {
        JSONArray rolloutMetadata = configContainer.getRolloutMetadata();
        long templateVersionNumber = configContainer.getTemplateVersionNumber();
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < rolloutMetadata.length()) {
            try {
                JSONObject jSONObject = rolloutMetadata.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                int length = jSONArray.length();
                String optString = jSONArray.optString(0, "");
                hashSet.add(RolloutAssignment.builder().setRolloutId(string).setVariantId(jSONObject.getString("variantId")).setParameterKey(optString).setParameterValue(this.getParameterHandler.getString(optString)).setTemplateVersion(templateVersionNumber).build());
                i++;
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", (Throwable) e);
            }
        }
        return RolloutsState.create(hashSet);
    }

    public static RolloutsStateFactory create(ConfigGetParameterHandler configGetParameterHandler) {
        return new RolloutsStateFactory(configGetParameterHandler);
    }
}
