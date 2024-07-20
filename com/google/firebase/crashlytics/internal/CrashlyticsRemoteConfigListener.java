package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {
    private final UserMetadata userMetadata;

    public CrashlyticsRemoteConfigListener(UserMetadata userMetadata2) {
        Intrinsics.checkNotNullParameter(userMetadata2, "");
        this.userMetadata = userMetadata2;
    }

    public final void onRolloutsStateChanged(RolloutsState rolloutsState) {
        Intrinsics.checkNotNullParameter(rolloutsState, "");
        UserMetadata userMetadata2 = this.userMetadata;
        Set<RolloutAssignment> rolloutAssignments = rolloutsState.getRolloutAssignments();
        Intrinsics.checkNotNullExpressionValue(rolloutAssignments, "");
        Iterable<RolloutAssignment> iterable = rolloutAssignments;
        Intrinsics.checkNotNullParameter(iterable, "");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (RolloutAssignment rolloutAssignment : iterable) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(rolloutAssignment.getRolloutId(), rolloutAssignment.getParameterKey(), rolloutAssignment.getParameterValue(), rolloutAssignment.getVariantId(), rolloutAssignment.getTemplateVersion()));
        }
        userMetadata2.updateRolloutsState((List) arrayList);
        Logger.getLogger().d("Updated Crashlytics Rollout State");
    }
}
