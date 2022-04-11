// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PublicIPPrefixSkuName;
import io.pulumi.azurenative.network.enums.PublicIPPrefixSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU of a public IP prefix.
 * 
 */
public final class PublicIPPrefixSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPPrefixSkuArgs Empty = new PublicIPPrefixSkuArgs();

    /**
     * Name of a public IP prefix SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<Either<String,PublicIPPrefixSkuName>> name;

    public Output<Either<String,PublicIPPrefixSkuName>> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Tier of a public IP prefix SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,PublicIPPrefixSkuTier>> tier;

    public Output<Either<String,PublicIPPrefixSkuTier>> getTier() {
        return this.tier == null ? Codegen.empty() : this.tier;
    }

    public PublicIPPrefixSkuArgs(
        @Nullable Output<Either<String,PublicIPPrefixSkuName>> name,
        @Nullable Output<Either<String,PublicIPPrefixSkuTier>> tier) {
        this.name = name;
        this.tier = tier;
    }

    private PublicIPPrefixSkuArgs() {
        this.name = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPPrefixSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,PublicIPPrefixSkuName>> name;
        private @Nullable Output<Either<String,PublicIPPrefixSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPPrefixSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder name(@Nullable Output<Either<String,PublicIPPrefixSkuName>> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable Either<String,PublicIPPrefixSkuName> name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,PublicIPPrefixSkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,PublicIPPrefixSkuTier> tier) {
            this.tier = Codegen.ofNullable(tier);
            return this;
        }        public PublicIPPrefixSkuArgs build() {
            return new PublicIPPrefixSkuArgs(name, tier);
        }
    }
}
