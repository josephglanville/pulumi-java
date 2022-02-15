// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.azurenative.documentdb.enums.DefaultConsistencyLevel;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConsistencyPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsistencyPolicyArgs Empty = new ConsistencyPolicyArgs();

    @InputImport(name="defaultConsistencyLevel", required=true)
    private final Input<DefaultConsistencyLevel> defaultConsistencyLevel;

    public Input<DefaultConsistencyLevel> getDefaultConsistencyLevel() {
        return this.defaultConsistencyLevel;
    }

    @InputImport(name="maxIntervalInSeconds")
    private final @Nullable Input<Integer> maxIntervalInSeconds;

    public Input<Integer> getMaxIntervalInSeconds() {
        return this.maxIntervalInSeconds == null ? Input.empty() : this.maxIntervalInSeconds;
    }

    @InputImport(name="maxStalenessPrefix")
    private final @Nullable Input<Double> maxStalenessPrefix;

    public Input<Double> getMaxStalenessPrefix() {
        return this.maxStalenessPrefix == null ? Input.empty() : this.maxStalenessPrefix;
    }

    public ConsistencyPolicyArgs(
        Input<DefaultConsistencyLevel> defaultConsistencyLevel,
        @Nullable Input<Integer> maxIntervalInSeconds,
        @Nullable Input<Double> maxStalenessPrefix) {
        this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel, "expected parameter 'defaultConsistencyLevel' to be non-null");
        this.maxIntervalInSeconds = maxIntervalInSeconds;
        this.maxStalenessPrefix = maxStalenessPrefix;
    }

    private ConsistencyPolicyArgs() {
        this.defaultConsistencyLevel = Input.empty();
        this.maxIntervalInSeconds = Input.empty();
        this.maxStalenessPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistencyPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DefaultConsistencyLevel> defaultConsistencyLevel;
        private @Nullable Input<Integer> maxIntervalInSeconds;
        private @Nullable Input<Double> maxStalenessPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistencyPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultConsistencyLevel = defaults.defaultConsistencyLevel;
    	      this.maxIntervalInSeconds = defaults.maxIntervalInSeconds;
    	      this.maxStalenessPrefix = defaults.maxStalenessPrefix;
        }

        public Builder setDefaultConsistencyLevel(Input<DefaultConsistencyLevel> defaultConsistencyLevel) {
            this.defaultConsistencyLevel = Objects.requireNonNull(defaultConsistencyLevel);
            return this;
        }

        public Builder setDefaultConsistencyLevel(DefaultConsistencyLevel defaultConsistencyLevel) {
            this.defaultConsistencyLevel = Input.of(Objects.requireNonNull(defaultConsistencyLevel));
            return this;
        }

        public Builder setMaxIntervalInSeconds(@Nullable Input<Integer> maxIntervalInSeconds) {
            this.maxIntervalInSeconds = maxIntervalInSeconds;
            return this;
        }

        public Builder setMaxIntervalInSeconds(@Nullable Integer maxIntervalInSeconds) {
            this.maxIntervalInSeconds = Input.ofNullable(maxIntervalInSeconds);
            return this;
        }

        public Builder setMaxStalenessPrefix(@Nullable Input<Double> maxStalenessPrefix) {
            this.maxStalenessPrefix = maxStalenessPrefix;
            return this;
        }

        public Builder setMaxStalenessPrefix(@Nullable Double maxStalenessPrefix) {
            this.maxStalenessPrefix = Input.ofNullable(maxStalenessPrefix);
            return this;
        }

        public ConsistencyPolicyArgs build() {
            return new ConsistencyPolicyArgs(defaultConsistencyLevel, maxIntervalInSeconds, maxStalenessPrefix);
        }
    }
}