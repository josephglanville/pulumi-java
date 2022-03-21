// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConsumerGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConsumerGroupArgs Empty = new GetConsumerGroupArgs();

    /**
     * The consumer group name
     * 
     */
    @Import(name="consumerGroupName", required=true)
      private final String consumerGroupName;

    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * The Event Hub name
     * 
     */
    @Import(name="eventHubName", required=true)
      private final String eventHubName;

    public String getEventHubName() {
        return this.eventHubName;
    }

    /**
     * The Namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the resource group within the azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetConsumerGroupArgs(
        String consumerGroupName,
        String eventHubName,
        String namespaceName,
        String resourceGroupName) {
        this.consumerGroupName = Objects.requireNonNull(consumerGroupName, "expected parameter 'consumerGroupName' to be non-null");
        this.eventHubName = Objects.requireNonNull(eventHubName, "expected parameter 'eventHubName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetConsumerGroupArgs() {
        this.consumerGroupName = null;
        this.eventHubName = null;
        this.namespaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsumerGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consumerGroupName;
        private String eventHubName;
        private String namespaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsumerGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consumerGroupName = defaults.consumerGroupName;
    	      this.eventHubName = defaults.eventHubName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder consumerGroupName(String consumerGroupName) {
            this.consumerGroupName = Objects.requireNonNull(consumerGroupName);
            return this;
        }
        public Builder eventHubName(String eventHubName) {
            this.eventHubName = Objects.requireNonNull(eventHubName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetConsumerGroupArgs build() {
            return new GetConsumerGroupArgs(consumerGroupName, eventHubName, namespaceName, resourceGroupName);
        }
    }
}
