// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleTargetGroupStickinessConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerRuleTargetGroupTupleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleForwardConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleForwardConfigArgs Empty = new ListenerRuleForwardConfigArgs();

    @Import(name="targetGroupStickinessConfig")
      private final @Nullable Output<ListenerRuleTargetGroupStickinessConfigArgs> targetGroupStickinessConfig;

    public Output<ListenerRuleTargetGroupStickinessConfigArgs> getTargetGroupStickinessConfig() {
        return this.targetGroupStickinessConfig == null ? Output.empty() : this.targetGroupStickinessConfig;
    }

    @Import(name="targetGroups")
      private final @Nullable Output<List<ListenerRuleTargetGroupTupleArgs>> targetGroups;

    public Output<List<ListenerRuleTargetGroupTupleArgs>> getTargetGroups() {
        return this.targetGroups == null ? Output.empty() : this.targetGroups;
    }

    public ListenerRuleForwardConfigArgs(
        @Nullable Output<ListenerRuleTargetGroupStickinessConfigArgs> targetGroupStickinessConfig,
        @Nullable Output<List<ListenerRuleTargetGroupTupleArgs>> targetGroups) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
        this.targetGroups = targetGroups;
    }

    private ListenerRuleForwardConfigArgs() {
        this.targetGroupStickinessConfig = Output.empty();
        this.targetGroups = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleForwardConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerRuleTargetGroupStickinessConfigArgs> targetGroupStickinessConfig;
        private @Nullable Output<List<ListenerRuleTargetGroupTupleArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleForwardConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupStickinessConfig = defaults.targetGroupStickinessConfig;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder targetGroupStickinessConfig(@Nullable Output<ListenerRuleTargetGroupStickinessConfigArgs> targetGroupStickinessConfig) {
            this.targetGroupStickinessConfig = targetGroupStickinessConfig;
            return this;
        }
        public Builder targetGroupStickinessConfig(@Nullable ListenerRuleTargetGroupStickinessConfigArgs targetGroupStickinessConfig) {
            this.targetGroupStickinessConfig = Output.ofNullable(targetGroupStickinessConfig);
            return this;
        }
        public Builder targetGroups(@Nullable Output<List<ListenerRuleTargetGroupTupleArgs>> targetGroups) {
            this.targetGroups = targetGroups;
            return this;
        }
        public Builder targetGroups(@Nullable List<ListenerRuleTargetGroupTupleArgs> targetGroups) {
            this.targetGroups = Output.ofNullable(targetGroups);
            return this;
        }
        public Builder targetGroups(ListenerRuleTargetGroupTupleArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public ListenerRuleForwardConfigArgs build() {
            return new ListenerRuleForwardConfigArgs(targetGroupStickinessConfig, targetGroups);
        }
    }
}
