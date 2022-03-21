// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes an Event Hub output data source.
 * 
 */
public final class EventHubOutputDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubOutputDataSourceArgs Empty = new EventHubOutputDataSourceArgs();

    /**
     * The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="eventHubName")
      private final @Nullable Output<String> eventHubName;

    public Output<String> getEventHubName() {
        return this.eventHubName == null ? Output.empty() : this.eventHubName;
    }

    /**
     * The key/column that is used to determine to which partition to send event data.
     * 
     */
    @Import(name="partitionKey")
      private final @Nullable Output<String> partitionKey;

    public Output<String> getPartitionKey() {
        return this.partitionKey == null ? Output.empty() : this.partitionKey;
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="serviceBusNamespace")
      private final @Nullable Output<String> serviceBusNamespace;

    public Output<String> getServiceBusNamespace() {
        return this.serviceBusNamespace == null ? Output.empty() : this.serviceBusNamespace;
    }

    /**
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyKey")
      private final @Nullable Output<String> sharedAccessPolicyKey;

    public Output<String> getSharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey == null ? Output.empty() : this.sharedAccessPolicyKey;
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="sharedAccessPolicyName")
      private final @Nullable Output<String> sharedAccessPolicyName;

    public Output<String> getSharedAccessPolicyName() {
        return this.sharedAccessPolicyName == null ? Output.empty() : this.sharedAccessPolicyName;
    }

    /**
     * Indicates the type of data source output will be written to. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Microsoft.ServiceBus/EventHub'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EventHubOutputDataSourceArgs(
        @Nullable Output<String> eventHubName,
        @Nullable Output<String> partitionKey,
        @Nullable Output<String> serviceBusNamespace,
        @Nullable Output<String> sharedAccessPolicyKey,
        @Nullable Output<String> sharedAccessPolicyName,
        Output<String> type) {
        this.eventHubName = eventHubName;
        this.partitionKey = partitionKey;
        this.serviceBusNamespace = serviceBusNamespace;
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EventHubOutputDataSourceArgs() {
        this.eventHubName = Output.empty();
        this.partitionKey = Output.empty();
        this.serviceBusNamespace = Output.empty();
        this.sharedAccessPolicyKey = Output.empty();
        this.sharedAccessPolicyName = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubOutputDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eventHubName;
        private @Nullable Output<String> partitionKey;
        private @Nullable Output<String> serviceBusNamespace;
        private @Nullable Output<String> sharedAccessPolicyKey;
        private @Nullable Output<String> sharedAccessPolicyName;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubOutputDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventHubName = defaults.eventHubName;
    	      this.partitionKey = defaults.partitionKey;
    	      this.serviceBusNamespace = defaults.serviceBusNamespace;
    	      this.sharedAccessPolicyKey = defaults.sharedAccessPolicyKey;
    	      this.sharedAccessPolicyName = defaults.sharedAccessPolicyName;
    	      this.type = defaults.type;
        }

        public Builder eventHubName(@Nullable Output<String> eventHubName) {
            this.eventHubName = eventHubName;
            return this;
        }
        public Builder eventHubName(@Nullable String eventHubName) {
            this.eventHubName = Output.ofNullable(eventHubName);
            return this;
        }
        public Builder partitionKey(@Nullable Output<String> partitionKey) {
            this.partitionKey = partitionKey;
            return this;
        }
        public Builder partitionKey(@Nullable String partitionKey) {
            this.partitionKey = Output.ofNullable(partitionKey);
            return this;
        }
        public Builder serviceBusNamespace(@Nullable Output<String> serviceBusNamespace) {
            this.serviceBusNamespace = serviceBusNamespace;
            return this;
        }
        public Builder serviceBusNamespace(@Nullable String serviceBusNamespace) {
            this.serviceBusNamespace = Output.ofNullable(serviceBusNamespace);
            return this;
        }
        public Builder sharedAccessPolicyKey(@Nullable Output<String> sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }
        public Builder sharedAccessPolicyKey(@Nullable String sharedAccessPolicyKey) {
            this.sharedAccessPolicyKey = Output.ofNullable(sharedAccessPolicyKey);
            return this;
        }
        public Builder sharedAccessPolicyName(@Nullable Output<String> sharedAccessPolicyName) {
            this.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }
        public Builder sharedAccessPolicyName(@Nullable String sharedAccessPolicyName) {
            this.sharedAccessPolicyName = Output.ofNullable(sharedAccessPolicyName);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public EventHubOutputDataSourceArgs build() {
            return new EventHubOutputDataSourceArgs(eventHubName, partitionKey, serviceBusNamespace, sharedAccessPolicyKey, sharedAccessPolicyName, type);
        }
    }
}
