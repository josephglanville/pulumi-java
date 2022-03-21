// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ElasticPoolPerDatabaseSettingsResponse {
    /**
     * The maximum capacity any one database can consume.
     * 
     */
    private final @Nullable Double maxCapacity;
    /**
     * The minimum capacity all databases are guaranteed.
     * 
     */
    private final @Nullable Double minCapacity;

    @CustomType.Constructor
    private ElasticPoolPerDatabaseSettingsResponse(
        @CustomType.Parameter("maxCapacity") @Nullable Double maxCapacity,
        @CustomType.Parameter("minCapacity") @Nullable Double minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    /**
     * The maximum capacity any one database can consume.
     * 
    */
    public Optional<Double> getMaxCapacity() {
        return Optional.ofNullable(this.maxCapacity);
    }
    /**
     * The minimum capacity all databases are guaranteed.
     * 
    */
    public Optional<Double> getMinCapacity() {
        return Optional.ofNullable(this.minCapacity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticPoolPerDatabaseSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double maxCapacity;
        private @Nullable Double minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticPoolPerDatabaseSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder maxCapacity(@Nullable Double maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Builder minCapacity(@Nullable Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }        public ElasticPoolPerDatabaseSettingsResponse build() {
            return new ElasticPoolPerDatabaseSettingsResponse(maxCapacity, minCapacity);
        }
    }
}
