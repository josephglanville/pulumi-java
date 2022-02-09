// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceBusTopicEventSubscriptionDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceBusTopicEventSubscriptionDestinationArgs Empty = new ServiceBusTopicEventSubscriptionDestinationArgs();

    @InputImport(name="endpointType", required=true)
    private final Input<String> endpointType;

    public Input<String> getEndpointType() {
        return this.endpointType;
    }

    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public ServiceBusTopicEventSubscriptionDestinationArgs(
        Input<String> endpointType,
        @Nullable Input<String> resourceId) {
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.resourceId = resourceId;
    }

    private ServiceBusTopicEventSubscriptionDestinationArgs() {
        this.endpointType = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceBusTopicEventSubscriptionDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> endpointType;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceBusTopicEventSubscriptionDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setEndpointType(Input<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Input.of(Objects.requireNonNull(endpointType));
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public ServiceBusTopicEventSubscriptionDestinationArgs build() {
            return new ServiceBusTopicEventSubscriptionDestinationArgs(endpointType, resourceId);
        }
    }
}
