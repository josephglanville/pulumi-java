// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs;
import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyFirewallPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyGetArgs Empty = new FirewallPolicyFirewallPolicyGetArgs();

    /**
     * Set of actions to take on a packet if it does not match any stateful rules in the policy. This can only be specified if the policy has a `stateful_engine_options` block with a `rule_order` value of `STRICT_ORDER`. You can specify one of either or neither values of `aws:drop_strict` or `aws:drop_established`, as well as any combination of `aws:alert_strict` and `aws:alert_established`.
     * 
     */
    @Import(name="statefulDefaultActions")
      private final @Nullable Output<List<String>> statefulDefaultActions;

    public Output<List<String>> getStatefulDefaultActions() {
        return this.statefulDefaultActions == null ? Output.empty() : this.statefulDefaultActions;
    }

    /**
     * A configuration block that defines options on how the policy handles stateful rules. See Stateful Engine Options below for details.
     * 
     */
    @Import(name="statefulEngineOptions")
      private final @Nullable Output<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions;

    public Output<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> getStatefulEngineOptions() {
        return this.statefulEngineOptions == null ? Output.empty() : this.statefulEngineOptions;
    }

    /**
     * Set of configuration blocks containing references to the stateful rule groups that are used in the policy. See Stateful Rule Group Reference below for details.
     * 
     */
    @Import(name="statefulRuleGroupReferences")
      private final @Nullable Output<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences;

    public Output<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> getStatefulRuleGroupReferences() {
        return this.statefulRuleGroupReferences == null ? Output.empty() : this.statefulRuleGroupReferences;
    }

    /**
     * Set of configuration blocks describing the custom action definitions that are available for use in the firewall policy's `stateless_default_actions`. See Stateless Custom Action below for details.
     * 
     */
    @Import(name="statelessCustomActions")
      private final @Nullable Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions;

    public Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> getStatelessCustomActions() {
        return this.statelessCustomActions == null ? Output.empty() : this.statelessCustomActions;
    }

    /**
     * Set of actions to take on a packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
     */
    @Import(name="statelessDefaultActions", required=true)
      private final Output<List<String>> statelessDefaultActions;

    public Output<List<String>> getStatelessDefaultActions() {
        return this.statelessDefaultActions;
    }

    /**
     * Set of actions to take on a fragmented packet if it does not match any of the stateless rules in the policy. You must specify one of the standard actions including: `aws:drop`, `aws:pass`, or `aws:forward_to_sfe`.
     * In addition, you can specify custom actions that are compatible with your standard action choice. If you want non-matching packets to be forwarded for stateful inspection, specify `aws:forward_to_sfe`.
     * 
     */
    @Import(name="statelessFragmentDefaultActions", required=true)
      private final Output<List<String>> statelessFragmentDefaultActions;

    public Output<List<String>> getStatelessFragmentDefaultActions() {
        return this.statelessFragmentDefaultActions;
    }

    /**
     * Set of configuration blocks containing references to the stateless rule groups that are used in the policy. See Stateless Rule Group Reference below for details.
     * 
     */
    @Import(name="statelessRuleGroupReferences")
      private final @Nullable Output<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences;

    public Output<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> getStatelessRuleGroupReferences() {
        return this.statelessRuleGroupReferences == null ? Output.empty() : this.statelessRuleGroupReferences;
    }

    public FirewallPolicyFirewallPolicyGetArgs(
        @Nullable Output<List<String>> statefulDefaultActions,
        @Nullable Output<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions,
        @Nullable Output<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences,
        @Nullable Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions,
        Output<List<String>> statelessDefaultActions,
        Output<List<String>> statelessFragmentDefaultActions,
        @Nullable Output<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences) {
        this.statefulDefaultActions = statefulDefaultActions;
        this.statefulEngineOptions = statefulEngineOptions;
        this.statefulRuleGroupReferences = statefulRuleGroupReferences;
        this.statelessCustomActions = statelessCustomActions;
        this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions, "expected parameter 'statelessDefaultActions' to be non-null");
        this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions, "expected parameter 'statelessFragmentDefaultActions' to be non-null");
        this.statelessRuleGroupReferences = statelessRuleGroupReferences;
    }

    private FirewallPolicyFirewallPolicyGetArgs() {
        this.statefulDefaultActions = Output.empty();
        this.statefulEngineOptions = Output.empty();
        this.statefulRuleGroupReferences = Output.empty();
        this.statelessCustomActions = Output.empty();
        this.statelessDefaultActions = Output.empty();
        this.statelessFragmentDefaultActions = Output.empty();
        this.statelessRuleGroupReferences = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> statefulDefaultActions;
        private @Nullable Output<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions;
        private @Nullable Output<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences;
        private @Nullable Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions;
        private Output<List<String>> statelessDefaultActions;
        private Output<List<String>> statelessFragmentDefaultActions;
        private @Nullable Output<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statefulDefaultActions = defaults.statefulDefaultActions;
    	      this.statefulEngineOptions = defaults.statefulEngineOptions;
    	      this.statefulRuleGroupReferences = defaults.statefulRuleGroupReferences;
    	      this.statelessCustomActions = defaults.statelessCustomActions;
    	      this.statelessDefaultActions = defaults.statelessDefaultActions;
    	      this.statelessFragmentDefaultActions = defaults.statelessFragmentDefaultActions;
    	      this.statelessRuleGroupReferences = defaults.statelessRuleGroupReferences;
        }

        public Builder statefulDefaultActions(@Nullable Output<List<String>> statefulDefaultActions) {
            this.statefulDefaultActions = statefulDefaultActions;
            return this;
        }
        public Builder statefulDefaultActions(@Nullable List<String> statefulDefaultActions) {
            this.statefulDefaultActions = Output.ofNullable(statefulDefaultActions);
            return this;
        }
        public Builder statefulDefaultActions(String... statefulDefaultActions) {
            return statefulDefaultActions(List.of(statefulDefaultActions));
        }
        public Builder statefulEngineOptions(@Nullable Output<FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs> statefulEngineOptions) {
            this.statefulEngineOptions = statefulEngineOptions;
            return this;
        }
        public Builder statefulEngineOptions(@Nullable FirewallPolicyFirewallPolicyStatefulEngineOptionsGetArgs statefulEngineOptions) {
            this.statefulEngineOptions = Output.ofNullable(statefulEngineOptions);
            return this;
        }
        public Builder statefulRuleGroupReferences(@Nullable Output<List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs>> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = statefulRuleGroupReferences;
            return this;
        }
        public Builder statefulRuleGroupReferences(@Nullable List<FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs> statefulRuleGroupReferences) {
            this.statefulRuleGroupReferences = Output.ofNullable(statefulRuleGroupReferences);
            return this;
        }
        public Builder statefulRuleGroupReferences(FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceGetArgs... statefulRuleGroupReferences) {
            return statefulRuleGroupReferences(List.of(statefulRuleGroupReferences));
        }
        public Builder statelessCustomActions(@Nullable Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs>> statelessCustomActions) {
            this.statelessCustomActions = statelessCustomActions;
            return this;
        }
        public Builder statelessCustomActions(@Nullable List<FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs> statelessCustomActions) {
            this.statelessCustomActions = Output.ofNullable(statelessCustomActions);
            return this;
        }
        public Builder statelessCustomActions(FirewallPolicyFirewallPolicyStatelessCustomActionGetArgs... statelessCustomActions) {
            return statelessCustomActions(List.of(statelessCustomActions));
        }
        public Builder statelessDefaultActions(Output<List<String>> statelessDefaultActions) {
            this.statelessDefaultActions = Objects.requireNonNull(statelessDefaultActions);
            return this;
        }
        public Builder statelessDefaultActions(List<String> statelessDefaultActions) {
            this.statelessDefaultActions = Output.of(Objects.requireNonNull(statelessDefaultActions));
            return this;
        }
        public Builder statelessDefaultActions(String... statelessDefaultActions) {
            return statelessDefaultActions(List.of(statelessDefaultActions));
        }
        public Builder statelessFragmentDefaultActions(Output<List<String>> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Objects.requireNonNull(statelessFragmentDefaultActions);
            return this;
        }
        public Builder statelessFragmentDefaultActions(List<String> statelessFragmentDefaultActions) {
            this.statelessFragmentDefaultActions = Output.of(Objects.requireNonNull(statelessFragmentDefaultActions));
            return this;
        }
        public Builder statelessFragmentDefaultActions(String... statelessFragmentDefaultActions) {
            return statelessFragmentDefaultActions(List.of(statelessFragmentDefaultActions));
        }
        public Builder statelessRuleGroupReferences(@Nullable Output<List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs>> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = statelessRuleGroupReferences;
            return this;
        }
        public Builder statelessRuleGroupReferences(@Nullable List<FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs> statelessRuleGroupReferences) {
            this.statelessRuleGroupReferences = Output.ofNullable(statelessRuleGroupReferences);
            return this;
        }
        public Builder statelessRuleGroupReferences(FirewallPolicyFirewallPolicyStatelessRuleGroupReferenceGetArgs... statelessRuleGroupReferences) {
            return statelessRuleGroupReferences(List.of(statelessRuleGroupReferences));
        }        public FirewallPolicyFirewallPolicyGetArgs build() {
            return new FirewallPolicyFirewallPolicyGetArgs(statefulDefaultActions, statefulEngineOptions, statefulRuleGroupReferences, statelessCustomActions, statelessDefaultActions, statelessFragmentDefaultActions, statelessRuleGroupReferences);
        }
    }
}
