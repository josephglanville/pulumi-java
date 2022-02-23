// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Execution policy for an activity.
 * 
 */
public final class RetryPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RetryPolicyResponse Empty = new RetryPolicyResponse();

    /**
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     */
    @InputImport(name="count")
      private final @Nullable Object count;

    public Optional<Object> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * Interval between retries in seconds. Default is 30.
     * 
     */
    @InputImport(name="intervalInSeconds")
      private final @Nullable Integer intervalInSeconds;

    public Optional<Integer> getIntervalInSeconds() {
        return this.intervalInSeconds == null ? Optional.empty() : Optional.ofNullable(this.intervalInSeconds);
    }

    public RetryPolicyResponse(
        @Nullable Object count,
        @Nullable Integer intervalInSeconds) {
        this.count = count;
        this.intervalInSeconds = intervalInSeconds;
    }

    private RetryPolicyResponse() {
        this.count = null;
        this.intervalInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object count;
        private @Nullable Integer intervalInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(RetryPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalInSeconds = defaults.intervalInSeconds;
        }

        public Builder setCount(@Nullable Object count) {
            this.count = count;
            return this;
        }

        public Builder setIntervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }
        public RetryPolicyResponse build() {
            return new RetryPolicyResponse(count, intervalInSeconds);
        }
    }
}
