// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An ARM Resource SKU.
 * 
 */
public final class SkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final SkuResponse Empty = new SkuResponse();

    /**
     * Capacity of the particular SKU.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    @InputImport(name="family")
      private final @Nullable String family;

    public Optional<String> getFamily() {
        return this.family == null ? Optional.empty() : Optional.ofNullable(this.family);
    }

    /**
     * The name of the SKU, typically, a letter + Number code, e.g. P3.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Size of the particular SKU
     * 
     */
    @InputImport(name="size")
      private final @Nullable String size;

    public Optional<String> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    /**
     * The tier or edition of the particular SKU, e.g. Basic, Premium.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public SkuResponse(
        @Nullable Integer capacity,
        @Nullable String family,
        String name,
        @Nullable String size,
        @Nullable String tier) {
        this.capacity = capacity;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.size = size;
        this.tier = tier;
    }

    private SkuResponse() {
        this.capacity = null;
        this.family = null;
        this.name = null;
        this.size = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable String family;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setFamily(@Nullable String family) {
            this.family = family;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSize(@Nullable String size) {
            this.size = size;
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }
        public SkuResponse build() {
            return new SkuResponse(capacity, family, name, size, tier);
        }
    }
}
