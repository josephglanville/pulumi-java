// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * List of possible provisioning service SKUs.
 * 
 */
public final class IotDpsSkuInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final IotDpsSkuInfoResponse Empty = new IotDpsSkuInfoResponse();

    /**
     * The number of units to provision
     * 
     */
    @Import(name="capacity")
      private final @Nullable Double capacity;

    public Optional<Double> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Sku name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Pricing tier name of the provisioning service.
     * 
     */
    @Import(name="tier", required=true)
      private final String tier;

    public String getTier() {
        return this.tier;
    }

    public IotDpsSkuInfoResponse(
        @Nullable Double capacity,
        @Nullable String name,
        String tier) {
        this.capacity = capacity;
        this.name = name;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private IotDpsSkuInfoResponse() {
        this.capacity = null;
        this.name = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotDpsSkuInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private @Nullable String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(IotDpsSkuInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Double capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }        public IotDpsSkuInfoResponse build() {
            return new IotDpsSkuInfoResponse(capacity, name, tier);
        }
    }
}
