// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.azurenative.eventhub.enums.SkuName;
import io.pulumi.azurenative.eventhub.enums.SkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SKU parameters supplied to the create namespace operation
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The Event Hubs throughput units, value should be 0 to 20 throughput units.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity == null ? Output.empty() : this.capacity;
    }

    /**
     * Name of this SKU.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,SkuName>> name;

    public Output<Either<String,SkuName>> getName() {
        return this.name;
    }

    /**
     * The billing tier of this particular SKU.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,SkuTier>> tier;

    public Output<Either<String,SkuTier>> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public SkuArgs(
        @Nullable Output<Integer> capacity,
        Output<Either<String,SkuName>> name,
        @Nullable Output<Either<String,SkuTier>> tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private SkuArgs() {
        this.capacity = Output.empty();
        this.name = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private Output<Either<String,SkuName>> name;
        private @Nullable Output<Either<String,SkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Output.ofNullable(capacity);
            return this;
        }
        public Builder name(Output<Either<String,SkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,SkuName> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,SkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,SkuTier> tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }        public SkuArgs build() {
            return new SkuArgs(capacity, name, tier);
        }
    }
}
