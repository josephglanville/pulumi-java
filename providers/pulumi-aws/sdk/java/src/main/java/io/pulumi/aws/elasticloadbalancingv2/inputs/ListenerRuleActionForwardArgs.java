// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerRuleActionForwardStickinessArgs;
import io.pulumi.aws.elasticloadbalancingv2.inputs.ListenerRuleActionForwardTargetGroupArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardArgs Empty = new ListenerRuleActionForwardArgs();

    /**
     * The target group stickiness for the rule.
     * 
     */
    @Import(name="stickiness")
      private final @Nullable Output<ListenerRuleActionForwardStickinessArgs> stickiness;

    public Output<ListenerRuleActionForwardStickinessArgs> getStickiness() {
        return this.stickiness == null ? Output.empty() : this.stickiness;
    }

    /**
     * One or more target groups block.
     * 
     */
    @Import(name="targetGroups", required=true)
      private final Output<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups;

    public Output<List<ListenerRuleActionForwardTargetGroupArgs>> getTargetGroups() {
        return this.targetGroups;
    }

    public ListenerRuleActionForwardArgs(
        @Nullable Output<ListenerRuleActionForwardStickinessArgs> stickiness,
        Output<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups) {
        this.stickiness = stickiness;
        this.targetGroups = Objects.requireNonNull(targetGroups, "expected parameter 'targetGroups' to be non-null");
    }

    private ListenerRuleActionForwardArgs() {
        this.stickiness = Output.empty();
        this.targetGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerRuleActionForwardStickinessArgs> stickiness;
        private Output<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForwardArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stickiness = defaults.stickiness;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder stickiness(@Nullable Output<ListenerRuleActionForwardStickinessArgs> stickiness) {
            this.stickiness = stickiness;
            return this;
        }
        public Builder stickiness(@Nullable ListenerRuleActionForwardStickinessArgs stickiness) {
            this.stickiness = Output.ofNullable(stickiness);
            return this;
        }
        public Builder targetGroups(Output<List<ListenerRuleActionForwardTargetGroupArgs>> targetGroups) {
            this.targetGroups = Objects.requireNonNull(targetGroups);
            return this;
        }
        public Builder targetGroups(List<ListenerRuleActionForwardTargetGroupArgs> targetGroups) {
            this.targetGroups = Output.of(Objects.requireNonNull(targetGroups));
            return this;
        }
        public Builder targetGroups(ListenerRuleActionForwardTargetGroupArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public ListenerRuleActionForwardArgs build() {
            return new ListenerRuleActionForwardArgs(stickiness, targetGroups);
        }
    }
}