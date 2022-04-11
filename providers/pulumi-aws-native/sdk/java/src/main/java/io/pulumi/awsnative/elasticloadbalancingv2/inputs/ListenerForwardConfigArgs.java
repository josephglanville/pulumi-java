// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerTargetGroupStickinessConfigArgs;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerTargetGroupTupleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerForwardConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerForwardConfigArgs Empty = new ListenerForwardConfigArgs();

    @Import(name="targetGroupStickinessConfig")
      private final @Nullable Output<ListenerTargetGroupStickinessConfigArgs> targetGroupStickinessConfig;

    public Output<ListenerTargetGroupStickinessConfigArgs> getTargetGroupStickinessConfig() {
        return this.targetGroupStickinessConfig == null ? Codegen.empty() : this.targetGroupStickinessConfig;
    }

    @Import(name="targetGroups")
      private final @Nullable Output<List<ListenerTargetGroupTupleArgs>> targetGroups;

    public Output<List<ListenerTargetGroupTupleArgs>> getTargetGroups() {
        return this.targetGroups == null ? Codegen.empty() : this.targetGroups;
    }

    public ListenerForwardConfigArgs(
        @Nullable Output<ListenerTargetGroupStickinessConfigArgs> targetGroupStickinessConfig,
        @Nullable Output<List<ListenerTargetGroupTupleArgs>> targetGroups) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
        this.targetGroups = targetGroups;
    }

    private ListenerForwardConfigArgs() {
        this.targetGroupStickinessConfig = Codegen.empty();
        this.targetGroups = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerForwardConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ListenerTargetGroupStickinessConfigArgs> targetGroupStickinessConfig;
        private @Nullable Output<List<ListenerTargetGroupTupleArgs>> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerForwardConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupStickinessConfig = defaults.targetGroupStickinessConfig;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder targetGroupStickinessConfig(@Nullable Output<ListenerTargetGroupStickinessConfigArgs> targetGroupStickinessConfig) {
            this.targetGroupStickinessConfig = targetGroupStickinessConfig;
            return this;
        }
        public Builder targetGroupStickinessConfig(@Nullable ListenerTargetGroupStickinessConfigArgs targetGroupStickinessConfig) {
            this.targetGroupStickinessConfig = Codegen.ofNullable(targetGroupStickinessConfig);
            return this;
        }
        public Builder targetGroups(@Nullable Output<List<ListenerTargetGroupTupleArgs>> targetGroups) {
            this.targetGroups = targetGroups;
            return this;
        }
        public Builder targetGroups(@Nullable List<ListenerTargetGroupTupleArgs> targetGroups) {
            this.targetGroups = Codegen.ofNullable(targetGroups);
            return this;
        }
        public Builder targetGroups(ListenerTargetGroupTupleArgs... targetGroups) {
            return targetGroups(List.of(targetGroups));
        }        public ListenerForwardConfigArgs build() {
            return new ListenerForwardConfigArgs(targetGroupStickinessConfig, targetGroups);
        }
    }
}
