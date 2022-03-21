// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HybridConnectionEventSubscriptionDestinationResponse {
    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'HybridConnection'.
     * 
     */
    private final String endpointType;
    /**
     * The Azure Resource ID of an hybrid connection that is the destination of an event subscription.
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private HybridConnectionEventSubscriptionDestinationResponse(
        @CustomType.Parameter("endpointType") String endpointType,
        @CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.endpointType = endpointType;
        this.resourceId = resourceId;
    }

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'HybridConnection'.
     * 
    */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * The Azure Resource ID of an hybrid connection that is the destination of an event subscription.
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridConnectionEventSubscriptionDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridConnectionEventSubscriptionDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder endpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public HybridConnectionEventSubscriptionDestinationResponse build() {
            return new HybridConnectionEventSubscriptionDestinationResponse(endpointType, resourceId);
        }
    }
}
