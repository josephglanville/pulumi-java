// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IotHubSkuInfoResponse {
    private final @Nullable Double capacity;
    private final String name;
    private final String tier;

    @OutputCustomType.Constructor({"capacity","name","tier"})
    private IotHubSkuInfoResponse(
        @Nullable Double capacity,
        String name,
        String tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name);
        this.tier = Objects.requireNonNull(tier);
    }

    public Optional<Double> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    public String getName() {
        return this.name;
    }
    public String getTier() {
        return this.tier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubSkuInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private String name;
        private String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubSkuInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder setCapacity(@Nullable Double capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTier(String tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public IotHubSkuInfoResponse build() {
            return new IotHubSkuInfoResponse(capacity, name, tier);
        }
    }
}