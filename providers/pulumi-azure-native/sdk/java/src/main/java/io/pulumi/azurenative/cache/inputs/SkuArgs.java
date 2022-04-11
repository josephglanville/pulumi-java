// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.azurenative.cache.enums.SkuFamily;
import io.pulumi.azurenative.cache.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * SKU parameters supplied to the create Redis operation.
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The size of the Redis cache to deploy. Valid values: for C (Basic/Standard) family (0, 1, 2, 3, 4, 5, 6), for P (Premium) family (1, 2, 3, 4).
     * 
     */
    @Import(name="capacity", required=true)
      private final Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity;
    }

    /**
     * The SKU family to use. Valid values: (C, P). (C = Basic/Standard, P = Premium).
     * 
     */
    @Import(name="family", required=true)
      private final Output<Either<String,SkuFamily>> family;

    public Output<Either<String,SkuFamily>> getFamily() {
        return this.family;
    }

    /**
     * The type of Redis cache to deploy. Valid values: (Basic, Standard, Premium)
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,SkuName>> name;

    public Output<Either<String,SkuName>> getName() {
        return this.name;
    }

    public SkuArgs(
        Output<Integer> capacity,
        Output<Either<String,SkuFamily>> family,
        Output<Either<String,SkuName>> name) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuArgs() {
        this.capacity = Codegen.empty();
        this.family = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> capacity;
        private Output<Either<String,SkuFamily>> family;
        private Output<Either<String,SkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder capacity(Output<Integer> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public Builder capacity(Integer capacity) {
            this.capacity = Output.of(Objects.requireNonNull(capacity));
            return this;
        }
        public Builder family(Output<Either<String,SkuFamily>> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder family(Either<String,SkuFamily> family) {
            this.family = Output.of(Objects.requireNonNull(family));
            return this;
        }
        public Builder name(Output<Either<String,SkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,SkuName> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public SkuArgs build() {
            return new SkuArgs(capacity, family, name);
        }
    }
}
