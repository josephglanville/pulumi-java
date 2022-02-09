// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PublicIPAddressSkuName;
import io.pulumi.azurenative.network.enums.PublicIPAddressSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublicIPAddressSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPAddressSkuArgs Empty = new PublicIPAddressSkuArgs();

    @InputImport(name="name")
    private final @Nullable Input<Either<String,PublicIPAddressSkuName>> name;

    public Input<Either<String,PublicIPAddressSkuName>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="tier")
    private final @Nullable Input<Either<String,PublicIPAddressSkuTier>> tier;

    public Input<Either<String,PublicIPAddressSkuTier>> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public PublicIPAddressSkuArgs(
        @Nullable Input<Either<String,PublicIPAddressSkuName>> name,
        @Nullable Input<Either<String,PublicIPAddressSkuTier>> tier) {
        this.name = name;
        this.tier = tier;
    }

    private PublicIPAddressSkuArgs() {
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPAddressSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,PublicIPAddressSkuName>> name;
        private @Nullable Input<Either<String,PublicIPAddressSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPAddressSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(@Nullable Input<Either<String,PublicIPAddressSkuName>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,PublicIPAddressSkuName> name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTier(@Nullable Input<Either<String,PublicIPAddressSkuTier>> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable Either<String,PublicIPAddressSkuTier> tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }

        public PublicIPAddressSkuArgs build() {
            return new PublicIPAddressSkuArgs(name, tier);
        }
    }
}
