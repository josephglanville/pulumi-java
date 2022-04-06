// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol;

import io.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SafetyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleArgs Empty = new SafetyRuleArgs();

    /**
     * Routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed.
     * 
     */
    @Import(name="assertedControls")
      private final @Nullable Output<List<String>> assertedControls;

    public Output<List<String>> getAssertedControls() {
        return this.assertedControls == null ? Output.empty() : this.assertedControls;
    }

    /**
     * ARN of the control panel in which this safety rule will reside.
     * 
     */
    @Import(name="controlPanelArn", required=true)
      private final Output<String> controlPanelArn;

    public Output<String> getControlPanelArn() {
        return this.controlPanelArn;
    }

    /**
     * Gating controls for the new gating rule. That is, routing controls that are evaluated by the rule configuration that you specify.
     * 
     */
    @Import(name="gatingControls")
      private final @Nullable Output<List<String>> gatingControls;

    public Output<List<String>> getGatingControls() {
        return this.gatingControls == null ? Output.empty() : this.gatingControls;
    }

    /**
     * Name describing the safety rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Configuration block for safety rule criteria. See below.
     * 
     */
    @Import(name="ruleConfig", required=true)
      private final Output<SafetyRuleRuleConfigArgs> ruleConfig;

    public Output<SafetyRuleRuleConfigArgs> getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * Routing controls that can only be set or unset if the specified `rule_config` evaluates to true for the specified `gating_controls`.
     * 
     */
    @Import(name="targetControls")
      private final @Nullable Output<List<String>> targetControls;

    public Output<List<String>> getTargetControls() {
        return this.targetControls == null ? Output.empty() : this.targetControls;
    }

    /**
     * Evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail.
     * 
     */
    @Import(name="waitPeriodMs", required=true)
      private final Output<Integer> waitPeriodMs;

    public Output<Integer> getWaitPeriodMs() {
        return this.waitPeriodMs;
    }

    public SafetyRuleArgs(
        @Nullable Output<List<String>> assertedControls,
        Output<String> controlPanelArn,
        @Nullable Output<List<String>> gatingControls,
        @Nullable Output<String> name,
        Output<SafetyRuleRuleConfigArgs> ruleConfig,
        @Nullable Output<List<String>> targetControls,
        Output<Integer> waitPeriodMs) {
        this.assertedControls = assertedControls;
        this.controlPanelArn = Objects.requireNonNull(controlPanelArn, "expected parameter 'controlPanelArn' to be non-null");
        this.gatingControls = gatingControls;
        this.name = name;
        this.ruleConfig = Objects.requireNonNull(ruleConfig, "expected parameter 'ruleConfig' to be non-null");
        this.targetControls = targetControls;
        this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs, "expected parameter 'waitPeriodMs' to be non-null");
    }

    private SafetyRuleArgs() {
        this.assertedControls = Output.empty();
        this.controlPanelArn = Output.empty();
        this.gatingControls = Output.empty();
        this.name = Output.empty();
        this.ruleConfig = Output.empty();
        this.targetControls = Output.empty();
        this.waitPeriodMs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> assertedControls;
        private Output<String> controlPanelArn;
        private @Nullable Output<List<String>> gatingControls;
        private @Nullable Output<String> name;
        private Output<SafetyRuleRuleConfigArgs> ruleConfig;
        private @Nullable Output<List<String>> targetControls;
        private Output<Integer> waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assertedControls = defaults.assertedControls;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.gatingControls = defaults.gatingControls;
    	      this.name = defaults.name;
    	      this.ruleConfig = defaults.ruleConfig;
    	      this.targetControls = defaults.targetControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder assertedControls(@Nullable Output<List<String>> assertedControls) {
            this.assertedControls = assertedControls;
            return this;
        }
        public Builder assertedControls(@Nullable List<String> assertedControls) {
            this.assertedControls = Output.ofNullable(assertedControls);
            return this;
        }
        public Builder assertedControls(String... assertedControls) {
            return assertedControls(List.of(assertedControls));
        }
        public Builder controlPanelArn(Output<String> controlPanelArn) {
            this.controlPanelArn = Objects.requireNonNull(controlPanelArn);
            return this;
        }
        public Builder controlPanelArn(String controlPanelArn) {
            this.controlPanelArn = Output.of(Objects.requireNonNull(controlPanelArn));
            return this;
        }
        public Builder gatingControls(@Nullable Output<List<String>> gatingControls) {
            this.gatingControls = gatingControls;
            return this;
        }
        public Builder gatingControls(@Nullable List<String> gatingControls) {
            this.gatingControls = Output.ofNullable(gatingControls);
            return this;
        }
        public Builder gatingControls(String... gatingControls) {
            return gatingControls(List.of(gatingControls));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder ruleConfig(Output<SafetyRuleRuleConfigArgs> ruleConfig) {
            this.ruleConfig = Objects.requireNonNull(ruleConfig);
            return this;
        }
        public Builder ruleConfig(SafetyRuleRuleConfigArgs ruleConfig) {
            this.ruleConfig = Output.of(Objects.requireNonNull(ruleConfig));
            return this;
        }
        public Builder targetControls(@Nullable Output<List<String>> targetControls) {
            this.targetControls = targetControls;
            return this;
        }
        public Builder targetControls(@Nullable List<String> targetControls) {
            this.targetControls = Output.ofNullable(targetControls);
            return this;
        }
        public Builder targetControls(String... targetControls) {
            return targetControls(List.of(targetControls));
        }
        public Builder waitPeriodMs(Output<Integer> waitPeriodMs) {
            this.waitPeriodMs = Objects.requireNonNull(waitPeriodMs);
            return this;
        }
        public Builder waitPeriodMs(Integer waitPeriodMs) {
            this.waitPeriodMs = Output.of(Objects.requireNonNull(waitPeriodMs));
            return this;
        }        public SafetyRuleArgs build() {
            return new SafetyRuleArgs(assertedControls, controlPanelArn, gatingControls, name, ruleConfig, targetControls, waitPeriodMs);
        }
    }
}