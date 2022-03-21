// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The billing information of the resource.
 * 
 */
public final class ResourceSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceSkuResponse Empty = new ResourceSkuResponse();

    /**
     * Optional, integer. The unit count of the resource. 1 by default.
     * 
     * If present, following values are allowed:
     *     Free: 1
     *     Standard: 1,2,5,10,20,50,100
     * 
     */
    @Import(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Not used. Retained for future use.
     * 
     */
    @Import(name="family", required=true)
      private final String family;

    public String getFamily() {
        return this.family;
    }

    /**
     * The name of the SKU. Required.
     * 
     * Allowed values: Standard_S1, Free_F1
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Not used. Retained for future use.
     * 
     */
    @Import(name="size", required=true)
      private final String size;

    public String getSize() {
        return this.size;
    }

    /**
     * Optional tier of this particular SKU. 'Standard' or 'Free'.
     * 
     * `Basic` is deprecated, use `Standard` instead.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public ResourceSkuResponse(
        @Nullable Integer capacity,
        String family,
        String name,
        String size,
        @Nullable String tier) {
        this.capacity = capacity;
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
        this.tier = tier;
    }

    private ResourceSkuResponse() {
        this.capacity = null;
        this.family = null;
        this.name = null;
        this.size = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private String family;
        private String name;
        private String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder family(String family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder size(String size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public ResourceSkuResponse build() {
            return new ResourceSkuResponse(capacity, family, name, size, tier);
        }
    }
}
