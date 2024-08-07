package com.google.firebase.messaging;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

final class TopicOperation {
    private static final Pattern TOPIC_NAME_REGEXP = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String operation;
    private final String serializedString;
    private final String topic;

    private TopicOperation(String str, String str2) {
        this.topic = normalizeTopicOrThrow(str2, str);
        this.operation = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.serializedString = sb.toString();
    }

    private static String normalizeTopicOrThrow(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            str = str.substring(8);
        }
        if (str != null && TOPIC_NAME_REGEXP.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", new Object[]{str, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }

    static TopicOperation from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new TopicOperation(split[0], split[1]);
    }

    public final String getTopic() {
        return this.topic;
    }

    public final String getOperation() {
        return this.operation;
    }

    public final String serialize() {
        return this.serializedString;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        if (!this.topic.equals(topicOperation.topic) || !this.operation.equals(topicOperation.operation)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.operation, this.topic);
    }
}
