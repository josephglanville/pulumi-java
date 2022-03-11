// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.CapabilityArgs;
import io.pulumi.azurenative.web.inputs.SkuCapacityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a SKU for a scalable resource.
 * 
 */
public final class SkuDescriptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuDescriptionArgs Empty = new SkuDescriptionArgs();

    /**
     * Capabilities of the SKU, e.g., is traffic manager enabled?
     * 
     */
    @InputImport(name="capabilities")
      private final @Nullable Output<List<CapabilityArgs>> capabilities;

    public Output<List<CapabilityArgs>> getCapabilities() {
        return this.capabilities == null ? Output.empty() : this.capabilities;
    }

    /**
     * Current number of instances assigned to the resource.
     * 
     */
    @InputImport(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity == null ? Output.empty() : this.capacity;
    }

    /**
     * Family code of the resource SKU.
     * 
     */
    @InputImport(name="family")
      private final @Nullable Output<String> family;

    public Output<String> getFamily() {
        return this.family == null ? Output.empty() : this.family;
    }

    /**
     * Locations of the SKU.
     * 
     */
    @InputImport(name="locations")
      private final @Nullable Output<List<String>> locations;

    public Output<List<String>> getLocations() {
        return this.locations == null ? Output.empty() : this.locations;
    }

    /**
     * Name of the resource SKU.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Size specifier of the resource SKU.
     * 
     */
    @InputImport(name="size")
      private final @Nullable Output<String> size;

    public Output<String> getSize() {
        return this.size == null ? Output.empty() : this.size;
    }

    /**
     * Min, max, and default scale values of the SKU.
     * 
     */
    @InputImport(name="skuCapacity")
      private final @Nullable Output<SkuCapacityArgs> skuCapacity;

    public Output<SkuCapacityArgs> getSkuCapacity() {
        return this.skuCapacity == null ? Output.empty() : this.skuCapacity;
    }

    /**
     * Service tier of the resource SKU.
     * 
     */
    @InputImport(name="tier")
      private final @Nullable Output<String> tier;

    public Output<String> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public SkuDescriptionArgs(
        @Nullable Output<List<CapabilityArgs>> capabilities,
        @Nullable Output<Integer> capacity,
        @Nullable Output<String> family,
        @Nullable Output<List<String>> locations,
        @Nullable Output<String> name,
        @Nullable Output<String> size,
        @Nullable Output<SkuCapacityArgs> skuCapacity,
        @Nullable Output<String> tier) {
        this.capabilities = capabilities;
        this.capacity = capacity;
        this.family = family;
        this.locations = locations;
        this.name = name;
        this.size = size;
        this.skuCapacity = skuCapacity;
        this.tier = tier;
    }

    private SkuDescriptionArgs() {
        this.capabilities = Output.empty();
        this.capacity = Output.empty();
        this.family = Output.empty();
        this.locations = Output.empty();
        this.name = Output.empty();
        this.size = Output.empty();
        this.skuCapacity = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuDescriptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CapabilityArgs>> capabilities;
        private @Nullable Output<Integer> capacity;
        private @Nullable Output<String> family;
        private @Nullable Output<List<String>> locations;
        private @Nullable Output<String> name;
        private @Nullable Output<String> size;
        private @Nullable Output<SkuCapacityArgs> skuCapacity;
        private @Nullable Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuDescriptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.locations = defaults.locations;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.skuCapacity = defaults.skuCapacity;
    	      this.tier = defaults.tier;
        }

        public Builder capabilities(@Nullable Output<List<CapabilityArgs>> capabilities) {
            this.capabilities = capabilities;
            return this;
        }

        public Builder capabilities(@Nullable List<CapabilityArgs> capabilities) {
            this.capabilities = Output.ofNullable(capabilities);
            return this;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Output.ofNullable(capacity);
            return this;
        }

        public Builder family(@Nullable Output<String> family) {
            this.family = family;
            return this;
        }

        public Builder family(@Nullable String family) {
            this.family = Output.ofNullable(family);
            return this;
        }

        public Builder locations(@Nullable Output<List<String>> locations) {
            this.locations = locations;
            return this;
        }

        public Builder locations(@Nullable List<String> locations) {
            this.locations = Output.ofNullable(locations);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder size(@Nullable Output<String> size) {
            this.size = size;
            return this;
        }

        public Builder size(@Nullable String size) {
            this.size = Output.ofNullable(size);
            return this;
        }

        public Builder skuCapacity(@Nullable Output<SkuCapacityArgs> skuCapacity) {
            this.skuCapacity = skuCapacity;
            return this;
        }

        public Builder skuCapacity(@Nullable SkuCapacityArgs skuCapacity) {
            this.skuCapacity = Output.ofNullable(skuCapacity);
            return this;
        }

        public Builder tier(@Nullable Output<String> tier) {
            this.tier = tier;
            return this;
        }

        public Builder tier(@Nullable String tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }
        public SkuDescriptionArgs build() {
            return new SkuDescriptionArgs(capabilities, capacity, family, locations, name, size, skuCapacity, tier);
        }
    }
}
