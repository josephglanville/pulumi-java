// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storagetransfer_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class NotificationConfigResponse {
    private final List<String> eventTypes;
    private final String payloadFormat;
    private final String pubsubTopic;

    @OutputCustomType.Constructor({"eventTypes","payloadFormat","pubsubTopic"})
    private NotificationConfigResponse(
        List<String> eventTypes,
        String payloadFormat,
        String pubsubTopic) {
        this.eventTypes = Objects.requireNonNull(eventTypes);
        this.payloadFormat = Objects.requireNonNull(payloadFormat);
        this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
    }

    public List<String> getEventTypes() {
        return this.eventTypes;
    }
    public String getPayloadFormat() {
        return this.payloadFormat;
    }
    public String getPubsubTopic() {
        return this.pubsubTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> eventTypes;
        private String payloadFormat;
        private String pubsubTopic;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventTypes = defaults.eventTypes;
    	      this.payloadFormat = defaults.payloadFormat;
    	      this.pubsubTopic = defaults.pubsubTopic;
        }

        public Builder setEventTypes(List<String> eventTypes) {
            this.eventTypes = Objects.requireNonNull(eventTypes);
            return this;
        }

        public Builder setPayloadFormat(String payloadFormat) {
            this.payloadFormat = Objects.requireNonNull(payloadFormat);
            return this;
        }

        public Builder setPubsubTopic(String pubsubTopic) {
            this.pubsubTopic = Objects.requireNonNull(pubsubTopic);
            return this;
        }

        public NotificationConfigResponse build() {
            return new NotificationConfigResponse(eventTypes, payloadFormat, pubsubTopic);
        }
    }
}