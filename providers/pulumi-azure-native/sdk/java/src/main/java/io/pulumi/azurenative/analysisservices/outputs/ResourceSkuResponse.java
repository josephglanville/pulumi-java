// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceSkuResponse {
    /**
     * The number of instances in the read only query pool.
     * 
     */
    private final @Nullable Integer capacity;
    /**
     * Name of the SKU level.
     * 
     */
    private final String name;
    /**
     * The name of the Azure pricing tier to which the SKU applies.
     * 
     */
    private final @Nullable String tier;

    @CustomType.Constructor
    private ResourceSkuResponse(
        @CustomType.Parameter("capacity") @Nullable Integer capacity,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tier") @Nullable String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = tier;
    }

    /**
     * The number of instances in the read only query pool.
     * 
    */
    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    /**
     * Name of the SKU level.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The name of the Azure pricing tier to which the SKU applies.
     * 
    */
    public Optional<String> getTier() {
        return Optional.ofNullable(this.tier);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String name;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public ResourceSkuResponse build() {
            return new ResourceSkuResponse(capacity, name, tier);
        }
    }
}
