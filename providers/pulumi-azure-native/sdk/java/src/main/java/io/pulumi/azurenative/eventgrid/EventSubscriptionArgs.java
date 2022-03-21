// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid;

import io.pulumi.azurenative.eventgrid.enums.EventDeliverySchema;
import io.pulumi.azurenative.eventgrid.inputs.AzureFunctionEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventHubEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.EventSubscriptionFilterArgs;
import io.pulumi.azurenative.eventgrid.inputs.HybridConnectionEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.RetryPolicyArgs;
import io.pulumi.azurenative.eventgrid.inputs.ServiceBusQueueEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.ServiceBusTopicEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.StorageBlobDeadLetterDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.StorageQueueEventSubscriptionDestinationArgs;
import io.pulumi.azurenative.eventgrid.inputs.WebHookEventSubscriptionDestinationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventSubscriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSubscriptionArgs Empty = new EventSubscriptionArgs();

    /**
     * The DeadLetter destination of the event subscription.
     * 
     */
    @Import(name="deadLetterDestination")
      private final @Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination;

    public Output<StorageBlobDeadLetterDestinationArgs> getDeadLetterDestination() {
        return this.deadLetterDestination == null ? Output.empty() : this.deadLetterDestination;
    }

    /**
     * Information about the destination where events have to be delivered for the event subscription.
     * 
     */
    @Import(name="destination")
      private final @Nullable Output<Object> destination;

    public Output<Object> getDestination() {
        return this.destination == null ? Output.empty() : this.destination;
    }

    /**
     * The event delivery schema for the event subscription.
     * 
     */
    @Import(name="eventDeliverySchema")
      private final @Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema;

    public Output<Either<String,EventDeliverySchema>> getEventDeliverySchema() {
        return this.eventDeliverySchema == null ? Output.empty() : this.eventDeliverySchema;
    }

    /**
     * Name of the event subscription. Event subscription names must be between 3 and 64 characters in length and should use alphanumeric letters only.
     * 
     */
    @Import(name="eventSubscriptionName")
      private final @Nullable Output<String> eventSubscriptionName;

    public Output<String> getEventSubscriptionName() {
        return this.eventSubscriptionName == null ? Output.empty() : this.eventSubscriptionName;
    }

    /**
     * Expiration time of the event subscription.
     * 
     */
    @Import(name="expirationTimeUtc")
      private final @Nullable Output<String> expirationTimeUtc;

    public Output<String> getExpirationTimeUtc() {
        return this.expirationTimeUtc == null ? Output.empty() : this.expirationTimeUtc;
    }

    /**
     * Information about the filter for the event subscription.
     * 
     */
    @Import(name="filter")
      private final @Nullable Output<EventSubscriptionFilterArgs> filter;

    public Output<EventSubscriptionFilterArgs> getFilter() {
        return this.filter == null ? Output.empty() : this.filter;
    }

    /**
     * List of user defined labels.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<String>> labels;

    public Output<List<String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The retry policy for events. This can be used to configure maximum number of delivery attempts and time to live for events.
     * 
     */
    @Import(name="retryPolicy")
      private final @Nullable Output<RetryPolicyArgs> retryPolicy;

    public Output<RetryPolicyArgs> getRetryPolicy() {
        return this.retryPolicy == null ? Output.empty() : this.retryPolicy;
    }

    /**
     * The identifier of the resource to which the event subscription needs to be created or updated. The scope can be a subscription, or a resource group, or a top level resource belonging to a resource provider namespace, or an EventGrid topic. For example, use '/subscriptions/{subscriptionId}/' for a subscription, '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}' for a resource group, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}' for a resource, and '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventGrid/topics/{topicName}' for an EventGrid topic.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    public EventSubscriptionArgs(
        @Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination,
        @Nullable Output<Object> destination,
        @Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema,
        @Nullable Output<String> eventSubscriptionName,
        @Nullable Output<String> expirationTimeUtc,
        @Nullable Output<EventSubscriptionFilterArgs> filter,
        @Nullable Output<List<String>> labels,
        @Nullable Output<RetryPolicyArgs> retryPolicy,
        Output<String> scope) {
        this.deadLetterDestination = deadLetterDestination;
        this.destination = destination;
        this.eventDeliverySchema = eventDeliverySchema == null ? Output.ofLeft("EventGridSchema") : eventDeliverySchema;
        this.eventSubscriptionName = eventSubscriptionName;
        this.expirationTimeUtc = expirationTimeUtc;
        this.filter = filter;
        this.labels = labels;
        this.retryPolicy = retryPolicy;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private EventSubscriptionArgs() {
        this.deadLetterDestination = Output.empty();
        this.destination = Output.empty();
        this.eventDeliverySchema = Output.empty();
        this.eventSubscriptionName = Output.empty();
        this.expirationTimeUtc = Output.empty();
        this.filter = Output.empty();
        this.labels = Output.empty();
        this.retryPolicy = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination;
        private @Nullable Output<Object> destination;
        private @Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema;
        private @Nullable Output<String> eventSubscriptionName;
        private @Nullable Output<String> expirationTimeUtc;
        private @Nullable Output<EventSubscriptionFilterArgs> filter;
        private @Nullable Output<List<String>> labels;
        private @Nullable Output<RetryPolicyArgs> retryPolicy;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deadLetterDestination = defaults.deadLetterDestination;
    	      this.destination = defaults.destination;
    	      this.eventDeliverySchema = defaults.eventDeliverySchema;
    	      this.eventSubscriptionName = defaults.eventSubscriptionName;
    	      this.expirationTimeUtc = defaults.expirationTimeUtc;
    	      this.filter = defaults.filter;
    	      this.labels = defaults.labels;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.scope = defaults.scope;
        }

        public Builder deadLetterDestination(@Nullable Output<StorageBlobDeadLetterDestinationArgs> deadLetterDestination) {
            this.deadLetterDestination = deadLetterDestination;
            return this;
        }
        public Builder deadLetterDestination(@Nullable StorageBlobDeadLetterDestinationArgs deadLetterDestination) {
            this.deadLetterDestination = Output.ofNullable(deadLetterDestination);
            return this;
        }
        public Builder destination(@Nullable Output<Object> destination) {
            this.destination = destination;
            return this;
        }
        public Builder destination(@Nullable Object destination) {
            this.destination = Output.ofNullable(destination);
            return this;
        }
        public Builder eventDeliverySchema(@Nullable Output<Either<String,EventDeliverySchema>> eventDeliverySchema) {
            this.eventDeliverySchema = eventDeliverySchema;
            return this;
        }
        public Builder eventDeliverySchema(@Nullable Either<String,EventDeliverySchema> eventDeliverySchema) {
            this.eventDeliverySchema = Output.ofNullable(eventDeliverySchema);
            return this;
        }
        public Builder eventSubscriptionName(@Nullable Output<String> eventSubscriptionName) {
            this.eventSubscriptionName = eventSubscriptionName;
            return this;
        }
        public Builder eventSubscriptionName(@Nullable String eventSubscriptionName) {
            this.eventSubscriptionName = Output.ofNullable(eventSubscriptionName);
            return this;
        }
        public Builder expirationTimeUtc(@Nullable Output<String> expirationTimeUtc) {
            this.expirationTimeUtc = expirationTimeUtc;
            return this;
        }
        public Builder expirationTimeUtc(@Nullable String expirationTimeUtc) {
            this.expirationTimeUtc = Output.ofNullable(expirationTimeUtc);
            return this;
        }
        public Builder filter(@Nullable Output<EventSubscriptionFilterArgs> filter) {
            this.filter = filter;
            return this;
        }
        public Builder filter(@Nullable EventSubscriptionFilterArgs filter) {
            this.filter = Output.ofNullable(filter);
            return this;
        }
        public Builder labels(@Nullable Output<List<String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(String... labels) {
            return labels(List.of(labels));
        }
        public Builder retryPolicy(@Nullable Output<RetryPolicyArgs> retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder retryPolicy(@Nullable RetryPolicyArgs retryPolicy) {
            this.retryPolicy = Output.ofNullable(retryPolicy);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }        public EventSubscriptionArgs build() {
            return new EventSubscriptionArgs(deadLetterDestination, destination, eventDeliverySchema, eventSubscriptionName, expirationTimeUtc, filter, labels, retryPolicy, scope);
        }
    }
}
