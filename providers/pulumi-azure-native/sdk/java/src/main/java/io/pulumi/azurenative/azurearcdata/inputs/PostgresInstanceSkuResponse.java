// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The resource model definition representing SKU for Azure Database for PostgresSQL - Azure Arc
 * 
 */
public final class PostgresInstanceSkuResponse extends io.pulumi.resources.InvokeArgs {

    public static final PostgresInstanceSkuResponse Empty = new PostgresInstanceSkuResponse();

    /**
     * If the SKU supports scale out/in then the capacity integer should be included. If scale out/in is not possible for the resource this may be omitted.
     * 
     */
    @Import(name="capacity")
      private final @Nullable Integer capacity;

    public Optional<Integer> getCapacity() {
        return this.capacity == null ? Optional.empty() : Optional.ofNullable(this.capacity);
    }

    /**
     * Whether dev/test is enabled. When the dev field is set to true, the resource is used for dev/test purpose.
     * 
     */
    @Import(name="dev")
      private final @Nullable Boolean dev;

    public Optional<Boolean> getDev() {
        return this.dev == null ? Optional.empty() : Optional.ofNullable(this.dev);
    }

    /**
     * If the service has different generations of hardware, for the same SKU, then that can be captured here.
     * 
     */
    @Import(name="family")
      private final @Nullable String family;

    public Optional<String> getFamily() {
        return this.family == null ? Optional.empty() : Optional.ofNullable(this.family);
    }

    /**
     * The name of the SKU.  It is typically a letter+number code
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The SKU size. When the name field is the combination of tier and some other value, this would be the standalone code.
     * 
     */
    @Import(name="size")
      private final @Nullable String size;

    public Optional<String> getSize() {
        return this.size == null ? Optional.empty() : Optional.ofNullable(this.size);
    }

    /**
     * This field is required to be implemented by the Resource Provider if the service has more than one tier.
     * 
     */
    @Import(name="tier")
      private final @Nullable String tier;

    public Optional<String> getTier() {
        return this.tier == null ? Optional.empty() : Optional.ofNullable(this.tier);
    }

    public PostgresInstanceSkuResponse(
        @Nullable Integer capacity,
        @Nullable Boolean dev,
        @Nullable String family,
        String name,
        @Nullable String size,
        @Nullable String tier) {
        this.capacity = capacity;
        this.dev = dev == null ? true : dev;
        this.family = family;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.size = size;
        this.tier = tier == null ? "Hyperscale" : tier;
    }

    private PostgresInstanceSkuResponse() {
        this.capacity = null;
        this.dev = null;
        this.family = null;
        this.name = null;
        this.size = null;
        this.tier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PostgresInstanceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer capacity;
        private @Nullable Boolean dev;
        private @Nullable String family;
        private String name;
        private @Nullable String size;
        private @Nullable String tier;

        public Builder() {
    	      // Empty
        }

        public Builder(PostgresInstanceSkuResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.dev = defaults.dev;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
    	      this.size = defaults.size;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder dev(@Nullable Boolean dev) {
            this.dev = dev;
            return this;
        }
        public Builder family(@Nullable String family) {
            this.family = family;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder size(@Nullable String size) {
            this.size = size;
            return this;
        }
        public Builder tier(@Nullable String tier) {
            this.tier = tier;
            return this;
        }        public PostgresInstanceSkuResponse build() {
            return new PostgresInstanceSkuResponse(capacity, dev, family, name, size, tier);
        }
    }
}
