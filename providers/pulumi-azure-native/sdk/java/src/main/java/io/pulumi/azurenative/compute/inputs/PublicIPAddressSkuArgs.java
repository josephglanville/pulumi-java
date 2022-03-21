// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.PublicIPAddressSkuName;
import io.pulumi.azurenative.compute.enums.PublicIPAddressSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the public IP Sku
 * 
 */
public final class PublicIPAddressSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPAddressSkuArgs Empty = new PublicIPAddressSkuArgs();

    /**
     * Specify public IP sku name
     * 
     */
    @Import(name="name")
      private final @Nullable Output<Either<String,PublicIPAddressSkuName>> name;

    public Output<Either<String,PublicIPAddressSkuName>> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specify public IP sku tier
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,PublicIPAddressSkuTier>> tier;

    public Output<Either<String,PublicIPAddressSkuTier>> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public PublicIPAddressSkuArgs(
        @Nullable Output<Either<String,PublicIPAddressSkuName>> name,
        @Nullable Output<Either<String,PublicIPAddressSkuTier>> tier) {
        this.name = name;
        this.tier = tier;
    }

    private PublicIPAddressSkuArgs() {
        this.name = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,PublicIPAddressSkuName>> name;
        private @Nullable Output<Either<String,PublicIPAddressSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable Output<Either<String,PublicIPAddressSkuName>> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable Either<String,PublicIPAddressSkuName> name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,PublicIPAddressSkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,PublicIPAddressSkuTier> tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }        public PublicIPAddressSkuArgs build() {
            return new PublicIPAddressSkuArgs(name, tier);
        }
    }
}
