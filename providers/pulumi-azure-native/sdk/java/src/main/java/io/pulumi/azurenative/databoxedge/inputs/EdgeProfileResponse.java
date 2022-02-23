// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.EdgeProfileSubscriptionResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details about Edge Profile for the resource
 * 
 */
public final class EdgeProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final EdgeProfileResponse Empty = new EdgeProfileResponse();

    /**
     * Edge Profile Subscription
     * 
     */
    @InputImport(name="subscription")
      private final @Nullable EdgeProfileSubscriptionResponse subscription;

    public Optional<EdgeProfileSubscriptionResponse> getSubscription() {
        return this.subscription == null ? Optional.empty() : Optional.ofNullable(this.subscription);
    }

    public EdgeProfileResponse(@Nullable EdgeProfileSubscriptionResponse subscription) {
        this.subscription = subscription;
    }

    private EdgeProfileResponse() {
        this.subscription = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EdgeProfileSubscriptionResponse subscription;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscription = defaults.subscription;
        }

        public Builder setSubscription(@Nullable EdgeProfileSubscriptionResponse subscription) {
            this.subscription = subscription;
            return this;
        }
        public EdgeProfileResponse build() {
            return new EdgeProfileResponse(subscription);
        }
    }
}
