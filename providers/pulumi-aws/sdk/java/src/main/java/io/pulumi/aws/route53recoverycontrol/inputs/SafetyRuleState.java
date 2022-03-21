// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53recoverycontrol.inputs;

import io.pulumi.aws.route53recoverycontrol.inputs.SafetyRuleRuleConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SafetyRuleState extends io.pulumi.resources.ResourceArgs {

    public static final SafetyRuleState Empty = new SafetyRuleState();

    /**
     * ARN of the safety rule.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

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
    @Import(name="controlPanelArn")
      private final @Nullable Output<String> controlPanelArn;

    public Output<String> getControlPanelArn() {
        return this.controlPanelArn == null ? Output.empty() : this.controlPanelArn;
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
    @Import(name="ruleConfig")
      private final @Nullable Output<SafetyRuleRuleConfigGetArgs> ruleConfig;

    public Output<SafetyRuleRuleConfigGetArgs> getRuleConfig() {
        return this.ruleConfig == null ? Output.empty() : this.ruleConfig;
    }

    /**
     * Status of the safety rule. `PENDING` when it is being created/updated, `PENDING_DELETION` when it is being deleted, and `DEPLOYED` otherwise.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
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
    @Import(name="waitPeriodMs")
      private final @Nullable Output<Integer> waitPeriodMs;

    public Output<Integer> getWaitPeriodMs() {
        return this.waitPeriodMs == null ? Output.empty() : this.waitPeriodMs;
    }

    public SafetyRuleState(
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> assertedControls,
        @Nullable Output<String> controlPanelArn,
        @Nullable Output<List<String>> gatingControls,
        @Nullable Output<String> name,
        @Nullable Output<SafetyRuleRuleConfigGetArgs> ruleConfig,
        @Nullable Output<String> status,
        @Nullable Output<List<String>> targetControls,
        @Nullable Output<Integer> waitPeriodMs) {
        this.arn = arn;
        this.assertedControls = assertedControls;
        this.controlPanelArn = controlPanelArn;
        this.gatingControls = gatingControls;
        this.name = name;
        this.ruleConfig = ruleConfig;
        this.status = status;
        this.targetControls = targetControls;
        this.waitPeriodMs = waitPeriodMs;
    }

    private SafetyRuleState() {
        this.arn = Output.empty();
        this.assertedControls = Output.empty();
        this.controlPanelArn = Output.empty();
        this.gatingControls = Output.empty();
        this.name = Output.empty();
        this.ruleConfig = Output.empty();
        this.status = Output.empty();
        this.targetControls = Output.empty();
        this.waitPeriodMs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SafetyRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> assertedControls;
        private @Nullable Output<String> controlPanelArn;
        private @Nullable Output<List<String>> gatingControls;
        private @Nullable Output<String> name;
        private @Nullable Output<SafetyRuleRuleConfigGetArgs> ruleConfig;
        private @Nullable Output<String> status;
        private @Nullable Output<List<String>> targetControls;
        private @Nullable Output<Integer> waitPeriodMs;

        public Builder() {
    	      // Empty
        }

        public Builder(SafetyRuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assertedControls = defaults.assertedControls;
    	      this.controlPanelArn = defaults.controlPanelArn;
    	      this.gatingControls = defaults.gatingControls;
    	      this.name = defaults.name;
    	      this.ruleConfig = defaults.ruleConfig;
    	      this.status = defaults.status;
    	      this.targetControls = defaults.targetControls;
    	      this.waitPeriodMs = defaults.waitPeriodMs;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
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
        public Builder controlPanelArn(@Nullable Output<String> controlPanelArn) {
            this.controlPanelArn = controlPanelArn;
            return this;
        }
        public Builder controlPanelArn(@Nullable String controlPanelArn) {
            this.controlPanelArn = Output.ofNullable(controlPanelArn);
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
        public Builder ruleConfig(@Nullable Output<SafetyRuleRuleConfigGetArgs> ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public Builder ruleConfig(@Nullable SafetyRuleRuleConfigGetArgs ruleConfig) {
            this.ruleConfig = Output.ofNullable(ruleConfig);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
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
        public Builder waitPeriodMs(@Nullable Output<Integer> waitPeriodMs) {
            this.waitPeriodMs = waitPeriodMs;
            return this;
        }
        public Builder waitPeriodMs(@Nullable Integer waitPeriodMs) {
            this.waitPeriodMs = Output.ofNullable(waitPeriodMs);
            return this;
        }        public SafetyRuleState build() {
            return new SafetyRuleState(arn, assertedControls, controlPanelArn, gatingControls, name, ruleConfig, status, targetControls, waitPeriodMs);
        }
    }
}
