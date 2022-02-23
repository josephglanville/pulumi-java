// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.pubsub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LiteSubscriptionDeliveryConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final LiteSubscriptionDeliveryConfigGetArgs Empty = new LiteSubscriptionDeliveryConfigGetArgs();

    /**
     * When this subscription should send messages to subscribers relative to messages persistence in storage.
     * Possible values are `DELIVER_IMMEDIATELY`, `DELIVER_AFTER_STORED`, and `DELIVERY_REQUIREMENT_UNSPECIFIED`.
     * 
     */
    @InputImport(name="deliveryRequirement", required=true)
      private final Input<String> deliveryRequirement;

    public Input<String> getDeliveryRequirement() {
        return this.deliveryRequirement;
    }

    public LiteSubscriptionDeliveryConfigGetArgs(Input<String> deliveryRequirement) {
        this.deliveryRequirement = Objects.requireNonNull(deliveryRequirement, "expected parameter 'deliveryRequirement' to be non-null");
    }

    private LiteSubscriptionDeliveryConfigGetArgs() {
        this.deliveryRequirement = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteSubscriptionDeliveryConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> deliveryRequirement;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteSubscriptionDeliveryConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryRequirement = defaults.deliveryRequirement;
        }

        public Builder setDeliveryRequirement(Input<String> deliveryRequirement) {
            this.deliveryRequirement = Objects.requireNonNull(deliveryRequirement);
            return this;
        }

        public Builder setDeliveryRequirement(String deliveryRequirement) {
            this.deliveryRequirement = Input.of(Objects.requireNonNull(deliveryRequirement));
            return this;
        }
        public LiteSubscriptionDeliveryConfigGetArgs build() {
            return new LiteSubscriptionDeliveryConfigGetArgs(deliveryRequirement);
        }
    }
}
