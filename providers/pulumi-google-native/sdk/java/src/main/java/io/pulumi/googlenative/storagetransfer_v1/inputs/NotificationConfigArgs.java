// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.storagetransfer_v1.enums.NotificationConfigEventTypesItem;
import io.pulumi.googlenative.storagetransfer_v1.enums.NotificationConfigPayloadFormat;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationConfigArgs Empty = new NotificationConfigArgs();

    @InputImport(name="eventTypes")
    private final @Nullable Input<List<NotificationConfigEventTypesItem>> eventTypes;

    public Input<List<NotificationConfigEventTypesItem>> getEventTypes() {
        return this.eventTypes == null ? Input.empty() : this.eventTypes;
    }

    @InputImport(name="payloadFormat", required=true)
    private final Input<NotificationConfigPayloadFormat> payloadFormat;

    public Input<NotificationConfigPayloadFormat> getPayloadFormat() {
        return this.payloadFormat;
    }

    @InputImport(name="pubsubTopic", required=true)
    private final Input<String> pubsubTopic;

    public Input<String> getPubsubTopic() {
        return this.pubsubTopic;
    }

    public NotificationConfigArgs(
        @Nullable Input<List<NotificationConfigEventTypesItem>> eventTypes,
        Input<NotificationConfigPayloadFormat> payloadFormat,
        Input<String> pubsubTopic) {
        this.eventTypes = eventTypes;
        this.payloadFormat = Objects.requireNonNull(payloadFormat, "expected parameter 'payloadFormat' to be non-null");
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic, "expected parameter 'pubsubTopic' to be non-null");
    }

    private NotificationConfigArgs() {
        this.eventTypes = Input.empty();
        this.payloadFormat = Input.empty();
        this.pubsubTopic = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NotificationConfigEventTypesItem>> eventTypes;
        private Input<NotificationConfigPayloadFormat> payloadFormat;
        private Input<String> pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTypes = defaults.eventTypes;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder setEventTypes(@Nullable Input<List<NotificationConfigEventTypesItem>> eventTypes) {
            this.eventTypes = eventTypes;
            return this;
        }

        public Builder setEventTypes(@Nullable List<NotificationConfigEventTypesItem> eventTypes) {
            this.eventTypes = Input.ofNullable(eventTypes);
            return this;
        }

        public Builder setPayloadFormat(Input<NotificationConfigPayloadFormat> payloadFormat) {
            this.payloadFormat = Objects.requireNonNull(payloadFormat);
            return this;
        }

        public Builder setPayloadFormat(NotificationConfigPayloadFormat payloadFormat) {
            this.payloadFormat = Input.of(Objects.requireNonNull(payloadFormat));
            return this;
        }

        public Builder setPubsubTopic(Input<String> pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }

        public Builder setPubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Input.of(Objects.requireNonNull(pubsubTopic));
            return this;
        }

        public NotificationConfigArgs build() {
            return new NotificationConfigArgs(eventTypes, payloadFormat, pubsubTopic);
        }
    }
}