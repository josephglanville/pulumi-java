// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoverycontrol.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An assertion rule enforces that, when a routing control state is changed, that the criteria set by the rule configuration is met. Otherwise, the change to the routing control is not accepted.
 * 
 */
public final class SafetyRuleAssertionRule extends io.pulumi.resources.InvokeArgs {

    public static final SafetyRuleAssertionRule Empty = new SafetyRuleAssertionRule();

    /**
     * The routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed. For example, you might include three routing controls, one for each of three AWS Regions.
     * 
     */
    @InputImport(name="assertedControls", required=true)
      private final List<String> assertedControls;

    public List<String> getAssertedControls() {
        return this.assertedControls;
    }

    /**
     * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
     * 
     */
    @InputImport(name="waitPeriodMs", required=true)
      private final Integer waitPeriodMs;

    public Integer getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    public SafetyRuleAssertionRule(
        List<String> assertedControls,
        Integer waitPeriodMs) {
        this.assertedControls = Objects.requireNonNull(assertedControls, "expected parameter 'assertedControls' to be non-null");
        this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs, "expected parameter 'waitPeriodMs' to be non-null");
    }

    private SafetyRuleAssertionRule() {
        this.assertedControls = List.of();
        this.waitPeriodMs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleAssertionRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> assertedControls;
        private Integer waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleAssertionRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertedControls = defaults.assertedControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder setAssertedControls(List<String> assertedControls) {
            this.assertedControls = Objects.requireNonNull(assertedControls);
            return this;
        }

        public Builder setWaitPeriodMs(Integer waitPeriodMs) {
            this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
            return this;
        }
        public SafetyRuleAssertionRule build() {
            return new SafetyRuleAssertionRule(assertedControls, waitPeriodMs);
        }
    }
}
