// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The consistency policy for the Cosmos DB database account.
 * 
 */
public final class ConsistencyPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConsistencyPolicyResponse Empty = new ConsistencyPolicyResponse();

    /**
     * The default consistency level and configuration settings of the Cosmos DB account.
     * 
     */
    @Import(name="defaultConsistencyLevel", required=true)
      private final String defaultConsistencyLevel;

    public String getDefaultConsistencyLevel() {
        return this.defaultConsistencyLevel;
    }

    /**
     * When used with the Bounded Staleness consistency level, this value represents the time amount of staleness (in seconds) tolerated. Accepted range for this value is 5 - 86400. Required when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     * 
     */
    @Import(name="maxIntervalInSeconds")
      private final @Nullable Integer maxIntervalInSeconds;

    public Optional<Integer> getMaxIntervalInSeconds() {
        return this.maxIntervalInSeconds == null ? Optional.empty() : Optional.ofNullable(this.maxIntervalInSeconds);
    }

    /**
     * When used with the Bounded Staleness consistency level, this value represents the number of stale requests tolerated. Accepted range for this value is 1 – 2,147,483,647. Required when defaultConsistencyPolicy is set to 'BoundedStaleness'.
     * 
     */
    @Import(name="maxStalenessPrefix")
      private final @Nullable Double maxStalenessPrefix;

    public Optional<Double> getMaxStalenessPrefix() {
        return this.maxStalenessPrefix == null ? Optional.empty() : Optional.ofNullable(this.maxStalenessPrefix);
    }

    public ConsistencyPolicyResponse(
        String defaultConsistencyLevel,
        @Nullable Integer maxIntervalInSeconds,
        @Nullable Double maxStalenessPrefix) {
        this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel, "expected parameter 'defaultConsistencyLevel' to be non-null");
        this.maxIntervalInSeconds = maxIntervalInSeconds;
        this.maxStalenessPrefix = maxStalenessPrefix;
    }

    private ConsistencyPolicyResponse() {
        this.defaultConsistencyLevel = null;
        this.maxIntervalInSeconds = null;
        this.maxStalenessPrefix = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistencyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultConsistencyLevel;
        private @Nullable Integer maxIntervalInSeconds;
        private @Nullable Double maxStalenessPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistencyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultConsistencyLevel = defaults.defaultConsistencyLevel;
    	      this.maxIntervalInSeconds = defaults.maxIntervalInSeconds;
    	      this.maxStalenessPrefix = defaults.maxStalenessPrefix;
        }

        public Builder defaultConsistencyLevel(String defaultConsistencyLevel) {
            this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel);
            return this;
        }
        public Builder maxIntervalInSeconds(@Nullable Integer maxIntervalInSeconds) {
            this.maxIntervalInSeconds = maxIntervalInSeconds;
            return this;
        }
        public Builder maxStalenessPrefix(@Nullable Double maxStalenessPrefix) {
            this.maxStalenessPrefix = maxStalenessPrefix;
            return this;
        }        public ConsistencyPolicyResponse build() {
            return new ConsistencyPolicyResponse(defaultConsistencyLevel, maxIntervalInSeconds, maxStalenessPrefix);
        }
    }
}
