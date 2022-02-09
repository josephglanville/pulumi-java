// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FirewallPolicySkuResponse {
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"tier"})
    private FirewallPolicySkuResponse(@Nullable String tier) {
        this.tier = tier;
    }

    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicySkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicySkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tier = defaults.tier;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public FirewallPolicySkuResponse build() {
            return new FirewallPolicySkuResponse(tier);
        }
    }
}
