// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.AzureFunctionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventHubEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventSubscriptionIdentityResponse;
import io.pulumi.azurenative.eventgrid.outputs.HybridConnectionEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.ServiceBusTopicEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.StorageQueueEventSubscriptionDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.WebHookEventSubscriptionDestinationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeliveryWithResourceIdentityResponse {
    private final @Nullable Object destination;
    private final @Nullable EventSubscriptionIdentityResponse identity;

    @OutputCustomType.Constructor({"destination","identity"})
    private DeliveryWithResourceIdentityResponse(
        @Nullable Object destination,
        @Nullable EventSubscriptionIdentityResponse identity) {
        this.destination = destination;
        this.identity = identity;
    }

    public Optional<Object> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    public Optional<EventSubscriptionIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryWithResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object destination;
        private @Nullable EventSubscriptionIdentityResponse identity;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryWithResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.identity = defaults.identity;
        }

        public Builder setDestination(@Nullable Object destination) {
            this.destination = destination;
            return this;
        }

        public Builder setIdentity(@Nullable EventSubscriptionIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public DeliveryWithResourceIdentityResponse build() {
            return new DeliveryWithResourceIdentityResponse(destination, identity);
        }
    }
}
