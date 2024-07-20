package com.google.firebase.messaging.reporting;

import com.google.firebase.messaging.ProtoEncoderDoNotUse;

public final class MessagingClientEventExtension {
    private static final MessagingClientEventExtension DEFAULT_INSTANCE = new Builder().build();
    private final MessagingClientEvent messaging_client_event_;

    MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.messaging_client_event_ = messagingClientEvent;
    }

    public final byte[] toByteArray() {
        return ProtoEncoderDoNotUse.encode(this);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final MessagingClientEvent getMessagingClientEventInternal() {
        return this.messaging_client_event_;
    }

    public static final class Builder {
        private MessagingClientEvent messaging_client_event_ = null;

        Builder() {
        }

        public final MessagingClientEventExtension build() {
            return new MessagingClientEventExtension(this.messaging_client_event_);
        }

        public final Builder setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
            this.messaging_client_event_ = messagingClientEvent;
            return this;
        }
    }
}
