package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import java.util.regex.Pattern;

public final class NetworkRequestMetricBuilderUtil {
    private static final Pattern FLG_USER_AGENT_PATTERN = Pattern.compile("(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    public static void logError(NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        if (!networkRequestMetricBuilder.hasHttpResponseCode()) {
            networkRequestMetricBuilder.setNetworkClientErrorReason();
        }
        networkRequestMetricBuilder.build();
    }

    public static boolean isAllowedUserAgent(String str) {
        return str == null || !FLG_USER_AGENT_PATTERN.matcher(str).matches();
    }
}
