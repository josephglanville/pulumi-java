// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="maxScaledInReplicas")
      private final @Nullable Input<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas;

    public Input<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> getMaxScaledInReplicas() {
        return this.maxScaledInReplicas == null ? Input.empty() : this.maxScaledInReplicas;
    }

    /**
     * How long back autoscaling should look when computing recommendations
     * to include directives regarding slower scale down, as described above.
     * 
     */
    @InputImport(name="timeWindowSec")
      private final @Nullable Input<Integer> timeWindowSec;

    public Input<Integer> getTimeWindowSec() {
        return this.timeWindowSec == null ? Input.empty() : this.timeWindowSec;
    }

    public AutoscalarAutoscalingPolicyScaleInControlGetArgs(
        @Nullable Input<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas,
        @Nullable Input<Integer> timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    private AutoscalarAutoscalingPolicyScaleInControlGetArgs() {
        this.maxScaledInReplicas = Input.empty();
        this.timeWindowSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleInControlGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas;
        private @Nullable Input<Integer> timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScaleInControlGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledInReplicas(@Nullable Input<AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs> maxScaledInReplicas) {
            this.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }

        public Builder setMaxScaledInReplicas(@Nullable AutoscalarAutoscalingPolicyScaleInControlMaxScaledInReplicasGetArgs maxScaledInReplicas) {
            this.maxScaledInReplicas = Input.ofNullable(maxScaledInReplicas);
            return this;
        }

        public Builder setTimeWindowSec(@Nullable Input<Integer> timeWindowSec) {
            this.timeWindowSec = timeWindowSec;
            return this;
        }

        public Builder setTimeWindowSec(@Nullable Integer timeWindowSec) {
            this.timeWindowSec = Input.ofNullable(timeWindowSec);
            return this;
        }
        public AutoscalarAutoscalingPolicyScaleInControlGetArgs build() {
            return new AutoscalarAutoscalingPolicyScaleInControlGetArgs(maxScaledInReplicas, timeWindowSec);
        }
    }
}
