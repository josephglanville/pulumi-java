// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.inputs;

import io.pulumi.azurenative.powerbi.enums.AzureSkuName;
import io.pulumi.azurenative.powerbi.enums.AzureSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AzureSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSkuArgs Empty = new AzureSkuArgs();

    /**
     * SKU name
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<Either<String,AzureSkuName>> name;

    public Input<Either<String,AzureSkuName>> getName() {
        return this.name;
    }

    /**
     * SKU tier
     * 
     */
    @InputImport(name="tier", required=true)
      private final Input<Either<String,AzureSkuTier>> tier;

    public Input<Either<String,AzureSkuTier>> getTier() {
        return this.tier;
    }

    public AzureSkuArgs(
        Input<Either<String,AzureSkuName>> name,
        Input<Either<String,AzureSkuTier>> tier) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private AzureSkuArgs() {
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AzureSkuName>> name;
        private Input<Either<String,AzureSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setName(Input<Either<String,AzureSkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(Either<String,AzureSkuName> name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setTier(Input<Either<String,AzureSkuTier>> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder setTier(Either<String,AzureSkuTier> tier) {
            this.tier = Input.of(Objects.requireNonNull(tier));
            return this;
        }
        public AzureSkuArgs build() {
            return new AzureSkuArgs(name, tier);
        }
    }
}
