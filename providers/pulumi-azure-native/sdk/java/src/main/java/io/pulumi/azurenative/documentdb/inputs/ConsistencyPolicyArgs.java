// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.DefaultConsistencyLevel;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The consistency policy for the Cosmos DB database account.
 * 
 */
public final class ConsistencyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsistencyPolicyArgs Empty = new ConsistencyPolicyArgs();

    /**
     * The default consistency level and configuration settings of the Cosmos DB account.
     * 
     */
    @Import(name="defaultConsistencyLevel", required=true)
      private final Output<DefaultConsistencyLevel> defaultConsistencyLevel;

    public Output<DefaultConsistencyLevel> getDefaultConsistencyLevel() {
        return this.defaultConsistencyLevel;
    }

    /**
     * When used with the Bounded Staleness consistency level, this value represents the time amount of staleness (in seconds) tolerated. Accepted range for this value is 5 - 86400. Required when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     * 
     */
    @Import(name="maxIntervalInSeconds")
      private final @Nullable Output<Integer> maxIntervalInSeconds;

    public Output<Integer> getMaxIntervalInSeconds() {
        return this.maxIntervalInSeconds == null ? Output.empty() : this.maxIntervalInSeconds;
    }

    /**
     * When used with the Bounded Staleness consistency level, this value represents the number of stale requests tolerated. Accepted range for this value is 1 – 2,147,483,647. Required when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     * 
     */
    @Import(name="maxStalenessPrefix")
      private final @Nullable Output<Double> maxStalenessPrefix;

    public Output<Double> getMaxStalenessPrefix() {
        return this.maxStalenessPrefix == null ? Output.empty() : this.maxStalenessPrefix;
    }

    public ConsistencyPolicyArgs(
        Output<DefaultConsistencyLevel> defaultConsistencyLevel,
        @Nullable Output<Integer> maxIntervalInSeconds,
        @Nullable Output<Double> maxStalenessPrefix) {
        this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel, "expected parameter 'defaultConsistencyLevel' to be non-null");
        this.maxIntervalInSeconds = maxIntervalInSeconds;
        this.maxStalenessPrefix = maxStalenessPrefix;
    }

    private ConsistencyPolicyArgs() {
        this.defaultConsistencyLevel = Output.empty();
        this.maxIntervalInSeconds = Output.empty();
        this.maxStalenessPrefix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistencyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DefaultConsistencyLevel> defaultConsistencyLevel;
        private @Nullable Output<Integer> maxIntervalInSeconds;
        private @Nullable Output<Double> maxStalenessPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistencyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultConsistencyLevel = defaults.defaultConsistencyLevel;
    	      this.maxIntervalInSeconds = defaults.maxIntervalInSeconds;
    	      this.maxStalenessPrefix = defaults.maxStalenessPrefix;
        }

        public Builder defaultConsistencyLevel(Output<DefaultConsistencyLevel> defaultConsistencyLevel) {
            this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel);
            return this;
        }
        public Builder defaultConsistencyLevel(DefaultConsistencyLevel defaultConsistencyLevel) {
            this.defaultConsistencyLevel = Output.of(Objects.requireNonNull(defaultConsistencyLevel));
            return this;
        }
        public Builder maxIntervalInSeconds(@Nullable Output<Integer> maxIntervalInSeconds) {
            this.maxIntervalInSeconds = maxIntervalInSeconds;
            return this;
        }
        public Builder maxIntervalInSeconds(@Nullable Integer maxIntervalInSeconds) {
            this.maxIntervalInSeconds = Output.ofNullable(maxIntervalInSeconds);
            return this;
        }
        public Builder maxStalenessPrefix(@Nullable Output<Double> maxStalenessPrefix) {
            this.maxStalenessPrefix = maxStalenessPrefix;
            return this;
        }
        public Builder maxStalenessPrefix(@Nullable Double maxStalenessPrefix) {
            this.maxStalenessPrefix = Output.ofNullable(maxStalenessPrefix);
            return this;
        }        public ConsistencyPolicyArgs build() {
            return new ConsistencyPolicyArgs(defaultConsistencyLevel, maxIntervalInSeconds, maxStalenessPrefix);
        }
    }
}
