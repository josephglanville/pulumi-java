// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerTargetGroupStickinessConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.inputs.ListenerTargetGroupTuple;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerForwardConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerForwardConfig Empty = new ListenerForwardConfig();

    @InputImport(name="targetGroupStickinessConfig")
      private final @Nullable ListenerTargetGroupStickinessConfig targetGroupStickinessConfig;

    public Optional<ListenerTargetGroupStickinessConfig> getTargetGroupStickinessConfig() {
        return this.targetGroupStickinessConfig == null ? Optional.empty() : Optional.ofNullable(this.targetGroupStickinessConfig);
    }

    @InputImport(name="targetGroups")
      private final @Nullable List<ListenerTargetGroupTuple> targetGroups;

    public List<ListenerTargetGroupTuple> getTargetGroups() {
        return this.targetGroups == null ? List.of() : this.targetGroups;
    }

    public ListenerForwardConfig(
        @Nullable ListenerTargetGroupStickinessConfig targetGroupStickinessConfig,
        @Nullable List<ListenerTargetGroupTuple> targetGroups) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
        this.targetGroups = targetGroups;
    }

    private ListenerForwardConfig() {
        this.targetGroupStickinessConfig = null;
        this.targetGroups = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerForwardConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerTargetGroupStickinessConfig targetGroupStickinessConfig;
        private @Nullable List<ListenerTargetGroupTuple> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerForwardConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupStickinessConfig = defaults.targetGroupStickinessConfig;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder setTargetGroupStickinessConfig(@Nullable ListenerTargetGroupStickinessConfig targetGroupStickinessConfig) {
            this.targetGroupStickinessConfig = targetGroupStickinessConfig;
            return this;
        }

        public Builder setTargetGroups(@Nullable List<ListenerTargetGroupTuple> targetGroups) {
            this.targetGroups = targetGroups;
            return this;
        }
        public ListenerForwardConfig build() {
            return new ListenerForwardConfig(targetGroupStickinessConfig, targetGroups);
        }
    }
}
