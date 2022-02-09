// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.AzureFunctionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventHubEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventSubscriptionFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.HybridConnectionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.RetryPolicyResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusTopicEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.StorageBlobDeadLetterDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.StorageQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.azurenative.eventgrid.outputs.WebHookEventSubscriptionDestinationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEventSubscriptionResult {
    private final @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
    private final @Nullable Object destination;
    private final @Nullable String eventDeliverySchema;
    private final @Nullable String expirationTimeUtc;
    private final @Nullable EventSubscriptionFilterResponse filter;
    private final String id;
    private final @Nullable List<String> labels;
    private final String name;
    private final String provisioningState;
    private final @Nullable RetryPolicyResponse retryPolicy;
    private final SystemDataResponse systemData;
    private final String topic;
    private final String type;

    @OutputCustomType.Constructor({"deadLetterDestination","destination","eventDeliverySchema","expirationTimeUtc","filter","id","labels","name","provisioningState","retryPolicy","systemData","topic","type"})
    private GetEventSubscriptionResult(
        @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination,
        @Nullable Object destination,
        @Nullable String eventDeliverySchema,
        @Nullable String expirationTimeUtc,
        @Nullable EventSubscriptionFilterResponse filter,
        String id,
        @Nullable List<String> labels,
        String name,
        String provisioningState,
        @Nullable RetryPolicyResponse retryPolicy,
        SystemDataResponse systemData,
        String topic,
        String type) {
        this.deadLetterDestination = deadLetterDestination;
        this.destination = destination;
        this.eventDeliverySchema = eventDeliverySchema;
        this.expirationTimeUtc = expirationTimeUtc;
        this.filter = filter;
        this.id = Objects.requireNonNull(id);
        this.labels = labels;
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.retryPolicy = retryPolicy;
        this.systemData = Objects.requireNonNull(systemData);
        this.topic = Objects.requireNonNull(topic);
        this.type = Objects.requireNonNull(type);
    }

    public Optional<StorageBlobDeadLetterDestinationResponse> getDeadLetterDestination() {
        return Optional.ofNullable(this.deadLetterDestination);
    }
    public Optional<Object> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    public Optional<String> getEventDeliverySchema() {
        return Optional.ofNullable(this.eventDeliverySchema);
    }
    public Optional<String> getExpirationTimeUtc() {
        return Optional.ofNullable(this.expirationTimeUtc);
    }
    public Optional<EventSubscriptionFilterResponse> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    public String getId() {
        return this.id;
    }
    public List<String> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<RetryPolicyResponse> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getTopic() {
        return this.topic;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination;
        private @Nullable Object destination;
        private @Nullable String eventDeliverySchema;
        private @Nullable String expirationTimeUtc;
        private @Nullable EventSubscriptionFilterResponse filter;
        private String id;
        private @Nullable List<String> labels;
        private String name;
        private String provisioningState;
        private @Nullable RetryPolicyResponse retryPolicy;
        private SystemDataResponse systemData;
        private String topic;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterDestination = defaults.deadLetterDestination;
    	      this.destination = defaults.destination;
    	      this.eventDeliverySchema = defaults.eventDeliverySchema;
    	      this.expirationTimeUtc = defaults.expirationTimeUtc;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.systemData = defaults.systemData;
    	      this.topic = defaults.topic;
    	      this.type = defaults.type;
        }

        public Builder setDeadLetterDestination(@Nullable StorageBlobDeadLetterDestinationResponse deadLetterDestination) {
            this.deadLetterDestination = deadLetterDestination;
            return this;
        }

        public Builder setDestination(@Nullable Object destination) {
            this.destination = destination;
            return this;
        }

        public Builder setEventDeliverySchema(@Nullable String eventDeliverySchema) {
            this.eventDeliverySchema = eventDeliverySchema;
            return this;
        }

        public Builder setExpirationTimeUtc(@Nullable String expirationTimeUtc) {
            this.expirationTimeUtc = expirationTimeUtc;
            return this;
        }

        public Builder setFilter(@Nullable EventSubscriptionFilterResponse filter) {
            this.filter = filter;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLabels(@Nullable List<String> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRetryPolicy(@Nullable RetryPolicyResponse retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTopic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetEventSubscriptionResult build() {
            return new GetEventSubscriptionResult(deadLetterDestination, destination, eventDeliverySchema, expirationTimeUtc, filter, id, labels, name, provisioningState, retryPolicy, systemData, topic, type);
        }
    }
}
