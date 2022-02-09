// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceSkuResponse {
    private final @Nullable Integer capacity;
    private final String name;
    private final @Nullable String tier;

    @OutputCustomType.Constructor({"capacity","name","tier"})
    private ResourceSkuResponse(
        @Nullable Integer capacity,
        String name,
        @Nullable String tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name);
        this.tier = tier;
    }

    public Optional<Integer> getCapacity() {
        return Optional.ofNullable(this.capacity);
    }
    public String getName() {
        return this.name;
    }
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

        public Builder setCapacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }

        public ResourceSkuResponse build() {
            return new ResourceSkuResponse(capacity, name, tier);
        }
    }
}
