// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationalinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The cluster sku definition.
 * 
 */
public final class ClusterSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterSkuResponse Empty = new ClusterSkuResponse();

    /**
     * The capacity value
     * 
     */
    @Import(name="capacity")
      private final @Nullable Double capacity;

    public Optional<Double> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * The name of the SKU.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public ClusterSkuResponse(
        @Nullable Double capacity,
        @Nullable String name) {
        this.capacity = capacity;
        this.name = name;
    }

    private ClusterSkuResponse() {
        this.capacity = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double capacity;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(@Nullable Double capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public ClusterSkuResponse build() {
            return new ClusterSkuResponse(capacity, name);
        }
    }
}
