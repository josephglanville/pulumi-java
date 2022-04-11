// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An assertion rule enforces that, when a routing control state is changed, that the criteria set by the rule configuration is met. Otherwise, the change to the routing control is not accepted.
 * 
 */
public final class SafetyRuleAssertionRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleAssertionRuleArgs Empty = new SafetyRuleAssertionRuleArgs();

    /**
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed. For example, you might include three routing controls, one for each of three AWS Regions.
     * 
     */
    @Import(name="assertedControls", required=true)
      private final Output<List<String>> assertedControls;

    public Output<List<String>> getAssertedControls() {
        return this.assertedControls;
    }

    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
     */
    @Import(name="waitPeriodMs", required=true)
      private final Output<Integer> waitPeriodMs;

    public Output<Integer> getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    public SafetyRuleAssertionRuleArgs(
        Output<List<String>> assertedControls,
        Output<Integer> waitPeriodMs) {
        this.assertedControls = Objects.requireNonNull(assertedControls, "expected parameter 'assertedControls' to be non-null");
        this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs, "expected parameter 'waitPeriodMs' to be non-null");
    }

    private SafetyRuleAssertionRuleArgs() {
        this.assertedControls = Codegen.empty();
        this.waitPeriodMs = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleAssertionRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> assertedControls;
        private Output<Integer> waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleAssertionRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertedControls = defaults.assertedControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder assertedControls(Output<List<String>> assertedControls) {
            this.assertedControls = Objects.requireNonNull(assertedControls);
            return this;
        }
        public Builder assertedControls(List<String> assertedControls) {
            this.assertedControls = Output.of(Objects.requireNonNull(assertedControls));
            return this;
        }
        public Builder assertedControls(String... assertedControls) {
            return assertedControls(List.of(assertedControls));
        }
        public Builder waitPeriodMs(Output<Integer> waitPeriodMs) {
            this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
            return this;
        }
        public Builder waitPeriodMs(Integer waitPeriodMs) {
            this.waitPeriodMs = Output.of(Objects.requireNonNull(waitPeriodMs));
            return this;
        }        public SafetyRuleAssertionRuleArgs build() {
            return new SafetyRuleAssertionRuleArgs(assertedControls, waitPeriodMs);
        }
    }
}
