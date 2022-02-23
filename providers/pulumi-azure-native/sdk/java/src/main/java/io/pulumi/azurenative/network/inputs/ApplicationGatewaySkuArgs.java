// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewaySkuName;
import io.pulumi.azurenative.network.enums.ApplicationGatewayTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU of an application gateway.
 * 
 */
public final class ApplicationGatewaySkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewaySkuArgs Empty = new ApplicationGatewaySkuArgs();

    /**
     * Capacity (instance count) of an application gateway.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * Name of an application gateway SKU.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<Either<String,ApplicationGatewaySkuName>> name;

    public Input<Either<String,ApplicationGatewaySkuName>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Tier of an application gateway.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<Either<String,ApplicationGatewayTier>> tier;

    public Input<Either<String,ApplicationGatewayTier>> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public ApplicationGatewaySkuArgs(
        @Nullable Input<Integer> capacity,
        @Nullable Input<Either<String,ApplicationGatewaySkuName>> name,
        @Nullable Input<Either<String,ApplicationGatewayTier>> tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    private ApplicationGatewaySkuArgs() {
        this.capacity = Input.empty();
        this.name = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private @Nullable Input<Either<String,ApplicationGatewaySkuName>> name;
        private @Nullable Input<Either<String,ApplicationGatewayTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Input<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = Input.ofNullable(capacity);
            return this;
        }

        public Builder setName(@Nullable Input<Either<String,ApplicationGatewaySkuName>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,ApplicationGatewaySkuName> name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTier(@Nullable Input<Either<String,ApplicationGatewayTier>> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable Either<String,ApplicationGatewayTier> tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public ApplicationGatewaySkuArgs build() {
            return new ApplicationGatewaySkuArgs(capacity, name, tier);
        }
    }
}
