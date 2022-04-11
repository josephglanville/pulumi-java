// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsThresholdArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsThresholdArgs Empty = new SecurityPolicyRuleRateLimitOptionsThresholdArgs();

    /**
     * Number of HTTP(S) requests for calculating the threshold.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count == null ? Codegen.empty() : this.count;
    }

    /**
     * Interval over which the threshold is computed.
     * 
     */
    @Import(name="intervalSec")
      private final @Nullable Output<Integer> intervalSec;

    public Output<Integer> getIntervalSec() {
        return this.intervalSec == null ? Codegen.empty() : this.intervalSec;
    }

    public SecurityPolicyRuleRateLimitOptionsThresholdArgs(
        @Nullable Output<Integer> count,
        @Nullable Output<Integer> intervalSec) {
        this.count = count;
        this.intervalSec = intervalSec;
    }

    private SecurityPolicyRuleRateLimitOptionsThresholdArgs() {
        this.count = Codegen.empty();
        this.intervalSec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsThresholdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> count;
        private @Nullable Output<Integer> intervalSec;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsThresholdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.intervalSec = defaults.intervalSec;
        }

        public Builder count(@Nullable Output<Integer> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable Integer count) {
            this.count = Codegen.ofNullable(count);
            return this;
        }
        public Builder intervalSec(@Nullable Output<Integer> intervalSec) {
            this.intervalSec = intervalSec;
            return this;
        }
        public Builder intervalSec(@Nullable Integer intervalSec) {
            this.intervalSec = Codegen.ofNullable(intervalSec);
            return this;
        }        public SecurityPolicyRuleRateLimitOptionsThresholdArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsThresholdArgs(count, intervalSec);
        }
    }
}
