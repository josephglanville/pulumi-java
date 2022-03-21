// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyScaleInControlGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyScaleInControlGetArgs Empty = new AutoscalarAutoscalingPolicyScaleInControlGetArgs();

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="maxScaledInReplicas")
      private final @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas;

    public Output<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> getMaxScaledInReplicas() {
        return this.maxScaledInReplicas == null ? Output.empty() : this.maxScaledInReplicas;
    }

    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    @Import(name="timeWindowSec")
      private final @Nullable Output<Integer> timeWindowSec;

    public Output<Integer> getTimeWindowSec() {
        return this.timeWindowSec == null ? Output.empty() : this.timeWindowSec;
    }

    public AutoscalarAutoscalingPolicyScaleInControlGetArgs(
        @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas,
        @Nullable Output<Integer> timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    private AutoscalarAutoscalingPolicyScaleInControlGetArgs() {
        this.maxScaledInReplicas = Output.empty();
        this.timeWindowSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleInControlGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas;
        private @Nullable Output<Integer> timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScaleInControlGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledInReplicas(@Nullable Output<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas) {
            this.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }
        public Builder maxScaledInReplicas(@Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs maxScaledInReplicas) {
            this.maxScaledInReplicas = Output.ofNullable(maxScaledInReplicas);
            return this;
        }
        public Builder timeWindowSec(@Nullable Output<Integer> timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }
        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = Output.ofNullable(timeWindowSec);
            return this;
        }        public AutoscalarAutoscalingPolicyScaleInControlGetArgs build() {
            return new AutoscalarAutoscalingPolicyScaleInControlGetArgs(maxScaledInReplicas, timeWindowSec);
        }
    }
}
