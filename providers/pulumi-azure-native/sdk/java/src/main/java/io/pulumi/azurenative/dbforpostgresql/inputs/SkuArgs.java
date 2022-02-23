// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbforpostgresql.inputs;

import io.pulumi.azurenative.dbforpostgresql.enums.SkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Billing information related properties of a server.
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The scale up/out capacity, representing server's compute units.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity == null ? Input.empty() : this.capacity;
    }

    /**
     * The family of hardware.
     * 
     */
    @InputImport(name="family")
      private final @Nullable Input<String> family;

    public Input<String> getFamily() {
        return this.family == null ? Input.empty() : this.family;
    }

    /**
     * The name of the sku, typically, tier + family + cores, e.g. B_Gen4_1, GP_Gen5_8.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The size code, to be interpreted by resource as appropriate.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Input<String> size;

    public Input<String> getSize() {
        return this.size == null ? Input.empty() : this.size;
    }

    /**
     * The tier of the particular SKU, e.g. Basic.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Input<Either<String,SkuTier>> tier;

    public Input<Either<String,SkuTier>> getTier() {
        return this.tier == null ? Input.empty() : this.tier;
    }

    public SkuArgs(
        @Nullable Input<Integer> capacity,
        @Nullable Input<String> family,
        Input<String> name,
        @Nullable Input<String> size,
        @Nullable Input<Either<String,SkuTier>> tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.size = size;
        this.tier = tier;
    }

    private SkuArgs() {
        this.capacity = Input.empty();
        this.family = Input.empty();
        this.name = Input.empty();
        this.size = Input.empty();
        this.tier = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> capacity;
        private @Nullable Input<String> family;
        private Input<String> name;
        private @Nullable Input<String> size;
        private @Nullable Input<Either<String,SkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
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

        public Builder setFamily(@Nullable Input<String> family) {
            this.family = family;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = Input.ofNullable(family);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSize(@Nullable Input<String> size) {
            this.size = size;
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = Input.ofNullable(size);
            return this;
        }

        public Builder setTier(@Nullable Input<Either<String,SkuTier>> tier) {
            this.tier = tier;
            return this;
        }

        public Builder setTier(@Nullable Either<String,SkuTier> tier) {
            this.tier = Input.ofNullable(tier);
            return this;
        }
        public SkuArgs build() {
            return new SkuArgs(capacity, family, name, size, tier);
        }
    }
}
