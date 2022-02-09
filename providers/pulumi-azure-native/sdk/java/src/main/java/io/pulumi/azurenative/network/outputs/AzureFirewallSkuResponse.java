// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFirewallSkuResponse {
    private final @Nullable String name;
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"name","tier"})
    private AzureFirewallSkuResponse(
        @Nullable String name,
        @Nullable String tier) {
        this.name = name;
        this.tier = tier;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public AzureFirewallSkuResponse build() {
            return new AzureFirewallSkuResponse(name, tier);
        }
    }
}
