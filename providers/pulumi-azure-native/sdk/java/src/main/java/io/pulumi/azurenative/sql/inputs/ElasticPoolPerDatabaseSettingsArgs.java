// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Per database settings of an elastic pool.
 * 
 */
public final class ElasticPoolPerDatabaseSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ElasticPoolPerDatabaseSettingsArgs Empty = new ElasticPoolPerDatabaseSettingsArgs();

    /**
     * The maximum capacity any one database can consume.
     * 
     */
    @InputImport(name="maxCapacity")
      private final @Nullable Output<Double> maxCapacity;

    public Output<Double> getMaxCapacity() {
        return this.maxCapacity == null ? Output.empty() : this.maxCapacity;
    }

    /**
     * The minimum capacity all databases are guaranteed.
     * 
     */
    @InputImport(name="minCapacity")
      private final @Nullable Output<Double> minCapacity;

    public Output<Double> getMinCapacity() {
        return this.minCapacity == null ? Output.empty() : this.minCapacity;
    }

    public ElasticPoolPerDatabaseSettingsArgs(
        @Nullable Output<Double> maxCapacity,
        @Nullable Output<Double> minCapacity) {
        this.maxCapacity = maxCapacity;
        this.minCapacity = minCapacity;
    }

    private ElasticPoolPerDatabaseSettingsArgs() {
        this.maxCapacity = Output.empty();
        this.minCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ElasticPoolPerDatabaseSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> maxCapacity;
        private @Nullable Output<Double> minCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(ElasticPoolPerDatabaseSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCapacity = defaults.maxCapacity;
    	      this.minCapacity = defaults.minCapacity;
        }

        public Builder maxCapacity(@Nullable Output<Double> maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        public Builder maxCapacity(@Nullable Double maxCapacity) {
            this.maxCapacity = Output.ofNullable(maxCapacity);
            return this;
        }

        public Builder minCapacity(@Nullable Output<Double> minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        public Builder minCapacity(@Nullable Double minCapacity) {
            this.minCapacity = Output.ofNullable(minCapacity);
            return this;
        }
        public ElasticPoolPerDatabaseSettingsArgs build() {
            return new ElasticPoolPerDatabaseSettingsArgs(maxCapacity, minCapacity);
        }
    }
}
