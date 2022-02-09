// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.EdgeProfileSubscriptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EdgeProfileResponse {
    private final @Nullable EdgeProfileSubscriptionResponse subscription;

    @OutputCustomType.Constructor({"subscription"})
    private EdgeProfileResponse(@Nullable EdgeProfileSubscriptionResponse subscription) {
        this.subscription = subscription;
    }

    public Optional<EdgeProfileSubscriptionResponse> getSubscription() {
        return Optional.ofNullable(this.subscription);
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
