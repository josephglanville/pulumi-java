// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.VirtualNetworkGatewaySkuName;
import io.pulumi.azurenative.network.enums.VirtualNetworkGatewaySkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * VirtualNetworkGatewaySku details.
 * 
 */
public final class VirtualNetworkGatewaySkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkGatewaySkuArgs Empty = new VirtualNetworkGatewaySkuArgs();

    /**
     * Gateway SKU name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<Either<String,VirtualNetworkGatewaySkuName>> name;

    public Output<Either<String,VirtualNetworkGatewaySkuName>> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Gateway SKU tier.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,VirtualNetworkGatewaySkuTier>> tier;

    public Output<Either<String,VirtualNetworkGatewaySkuTier>> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public VirtualNetworkGatewaySkuArgs(
        @Nullable Output<Either<String,VirtualNetworkGatewaySkuName>> name,
        @Nullable Output<Either<String,VirtualNetworkGatewaySkuTier>> tier) {
        this.name = name;
        this.tier = tier;
    }

    private VirtualNetworkGatewaySkuArgs() {
        this.name = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkGatewaySkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,VirtualNetworkGatewaySkuName>> name;
        private @Nullable Output<Either<String,VirtualNetworkGatewaySkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkGatewaySkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable Output<Either<String,VirtualNetworkGatewaySkuName>> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable Either<String,VirtualNetworkGatewaySkuName> name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,VirtualNetworkGatewaySkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,VirtualNetworkGatewaySkuTier> tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }        public VirtualNetworkGatewaySkuArgs build() {
            return new VirtualNetworkGatewaySkuArgs(name, tier);
        }
    }
}
