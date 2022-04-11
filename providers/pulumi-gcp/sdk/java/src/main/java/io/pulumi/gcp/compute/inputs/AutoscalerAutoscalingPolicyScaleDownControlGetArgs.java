// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasGetArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyScaleDownControlGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyScaleDownControlGetArgs Empty = new AutoscalerAutoscalingPolicyScaleDownControlGetArgs();

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="maxScaledDownReplicas")
      private final @Nullable Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasGetArgs> maxScaledDownReplicas;

    public Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasGetArgs> getMaxScaledDownReplicas() {
        return this.maxScaledDownReplicas == null ? Codegen.empty() : this.maxScaledDownReplicas;
    }

    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    @Import(name="timeWindowSec")
      private final @Nullable Output<Integer> timeWindowSec;

    public Output<Integer> getTimeWindowSec() {
        return this.timeWindowSec == null ? Codegen.empty() : this.timeWindowSec;
    }

    public AutoscalerAutoscalingPolicyScaleDownControlGetArgs(
        @Nullable Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasGetArgs> maxScaledDownReplicas,
        @Nullable Output<Integer> timeWindowSec) {
        this.maxScaledDownReplicas = maxScaledDownReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    private AutoscalerAutoscalingPolicyScaleDownControlGetArgs() {
        this.maxScaledDownReplicas = Codegen.empty();
        this.timeWindowSec = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScaleDownControlGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasGetArgs> maxScaledDownReplicas;
        private @Nullable Output<Integer> timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScaleDownControlGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledDownReplicas(@Nullable Output<AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasGetArgs> maxScaledDownReplicas) {
            this.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }
        public Builder maxScaledDownReplicas(@Nullable AutoscalerAutoscalingPolicyScaleDownControlMaxScaledDownReplicasGetArgs maxScaledDownReplicas) {
            this.maxScaledDownReplicas = Codegen.ofNullable(maxScaledDownReplicas);
            return this;
        }
        public Builder timeWindowSec(@Nullable Output<Integer> timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }
        public Builder timeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = Codegen.ofNullable(timeWindowSec);
            return this;
        }        public AutoscalerAutoscalingPolicyScaleDownControlGetArgs build() {
            return new AutoscalerAutoscalingPolicyScaleDownControlGetArgs(maxScaledDownReplicas, timeWindowSec);
        }
    }
}
