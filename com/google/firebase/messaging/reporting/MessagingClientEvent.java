package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;

public final class MessagingClientEvent {
    private static final MessagingClientEvent DEFAULT_INSTANCE = new Builder().build();
    private final String analytics_label_;
    private final long bulk_id_;
    private final long campaign_id_;
    private final String collapse_key_;
    private final String composer_label_;
    private final Event event_;
    private final String instance_id_;
    private final String message_id_;
    private final MessageType message_type_;
    private final String package_name_;
    private final int priority_;
    private final long project_number_;
    private final SDKPlatform sdk_platform_;
    private final String topic_;
    private final int ttl_;

    MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.project_number_ = j;
        this.message_id_ = str;
        this.instance_id_ = str2;
        this.message_type_ = messageType;
        this.sdk_platform_ = sDKPlatform;
        this.package_name_ = str3;
        this.collapse_key_ = str4;
        this.priority_ = i;
        this.ttl_ = i2;
        this.topic_ = str5;
        this.bulk_id_ = j2;
        this.event_ = event;
        this.analytics_label_ = str6;
        this.campaign_id_ = j3;
        this.composer_label_ = str7;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public final long getProjectNumber() {
        return this.project_number_;
    }

    public final String getMessageId() {
        return this.message_id_;
    }

    public final String getInstanceId() {
        return this.instance_id_;
    }

    public final MessageType getMessageType() {
        return this.message_type_;
    }

    public final SDKPlatform getSdkPlatform() {
        return this.sdk_platform_;
    }

    public final String getPackageName() {
        return this.package_name_;
    }

    public final String getCollapseKey() {
        return this.collapse_key_;
    }

    public final int getPriority() {
        return this.priority_;
    }

    public final int getTtl() {
        return this.ttl_;
    }

    public final String getTopic() {
        return this.topic_;
    }

    public final long getBulkId() {
        return this.bulk_id_;
    }

    public final Event getEvent() {
        return this.event_;
    }

    public final String getAnalyticsLabel() {
        return this.analytics_label_;
    }

    public final long getCampaignId() {
        return this.campaign_id_;
    }

    public final String getComposerLabel() {
        return this.composer_label_;
    }

    public static final class Builder {
        private String analytics_label_ = "";
        private long bulk_id_ = 0;
        private long campaign_id_ = 0;
        private String collapse_key_ = "";
        private String composer_label_ = "";
        private Event event_ = Event.UNKNOWN_EVENT;
        private String instance_id_ = "";
        private String message_id_ = "";
        private MessageType message_type_ = MessageType.UNKNOWN;
        private String package_name_ = "";
        private int priority_ = 0;
        private long project_number_ = 0;
        private SDKPlatform sdk_platform_ = SDKPlatform.UNKNOWN_OS;
        private String topic_ = "";
        private int ttl_ = 0;

        Builder() {
        }

        public final MessagingClientEvent build() {
            return new MessagingClientEvent(this.project_number_, this.message_id_, this.instance_id_, this.message_type_, this.sdk_platform_, this.package_name_, this.collapse_key_, this.priority_, this.ttl_, this.topic_, this.bulk_id_, this.event_, this.analytics_label_, this.campaign_id_, this.composer_label_);
        }

        public final Builder setProjectNumber(long j) {
            this.project_number_ = j;
            return this;
        }

        public final Builder setMessageId(String str) {
            this.message_id_ = str;
            return this;
        }

        public final Builder setInstanceId(String str) {
            this.instance_id_ = str;
            return this;
        }

        public final Builder setMessageType(MessageType messageType) {
            this.message_type_ = messageType;
            return this;
        }

        public final Builder setSdkPlatform(SDKPlatform sDKPlatform) {
            this.sdk_platform_ = sDKPlatform;
            return this;
        }

        public final Builder setPackageName(String str) {
            this.package_name_ = str;
            return this;
        }

        public final Builder setCollapseKey(String str) {
            this.collapse_key_ = str;
            return this;
        }

        public final Builder setTtl(int i) {
            this.ttl_ = i;
            return this;
        }

        public final Builder setTopic(String str) {
            this.topic_ = str;
            return this;
        }

        public final Builder setEvent(Event event) {
            this.event_ = event;
            return this;
        }

        public final Builder setAnalyticsLabel(String str) {
            this.analytics_label_ = str;
            return this;
        }

        public final Builder setComposerLabel(String str) {
            this.composer_label_ = str;
            return this;
        }
    }

    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        private MessageType(int i) {
            this.number_ = i;
        }

        public final int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        private SDKPlatform(int i) {
            this.number_ = i;
        }

        public final int getNumber() {
            return this.number_;
        }
    }

    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        private Event(int i) {
            this.number_ = i;
        }

        public final int getNumber() {
            return this.number_;
        }
    }
}
