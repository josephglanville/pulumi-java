// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.policy_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.policy_v1beta1.inputs.IDRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * FSGroupStrategyOptions defines the strategy type and options used to create the strategy.
 * 
 */
public final class FSGroupStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FSGroupStrategyOptionsArgs Empty = new FSGroupStrategyOptionsArgs();

    /**
     * ranges are the allowed ranges of fs groups.  If you would like to force a single fs group then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    @InputImport(name="ranges")
      private final @Nullable Input<List<IDRangeArgs>> ranges;

    public Input<List<IDRangeArgs>> getRanges() {
        return this.ranges == null ? Input.empty() : this.ranges;
    }

    /**
     * rule is the strategy that will dictate what FSGroup is used in the SecurityContext.
     * 
     */
    @InputImport(name="rule")
      private final @Nullable Input<String> rule;

    public Input<String> getRule() {
        return this.rule == null ? Input.empty() : this.rule;
    }

    public FSGroupStrategyOptionsArgs(
        @Nullable Input<List<IDRangeArgs>> ranges,
        @Nullable Input<String> rule) {
        this.ranges = ranges;
        this.rule = rule;
    }

    private FSGroupStrategyOptionsArgs() {
        this.ranges = Input.empty();
        this.rule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FSGroupStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IDRangeArgs>> ranges;
        private @Nullable Input<String> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(FSGroupStrategyOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder setRanges(@Nullable Input<List<IDRangeArgs>> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder setRanges(@Nullable List<IDRangeArgs> ranges) {
            this.ranges = Input.ofNullable(ranges);
            return this;
        }

        public Builder setRule(@Nullable Input<String> rule) {
            this.rule = rule;
            return this;
        }

        public Builder setRule(@Nullable String rule) {
            this.rule = Input.ofNullable(rule);
            return this;
        }
        public FSGroupStrategyOptionsArgs build() {
            return new FSGroupStrategyOptionsArgs(ranges, rule);
        }
    }
}
