// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalarAutoscalingPolicyScaleDownControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalarAutoscalingPolicyScaleDownControlArgs Empty = new AutoscalarAutoscalingPolicyScaleDownControlArgs();

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @InputImport(name="maxScaledDownReplicas")
      private final @Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas;

    public Input<AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> getMaxScaledDownReplicas() {
        return this.maxScaledDownReplicas == null ? Input.empty() : this.maxScaledDownReplicas;
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

    public AutoscalarAutoscalingPolicyScaleDownControlArgs(
        @Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas,
        @Nullable Input<Integer> timeWindowSec) {
        this.maxScaledDownReplicas = maxScaledDownReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    private AutoscalarAutoscalingPolicyScaleDownControlArgs() {
        this.maxScaledDownReplicas = Input.empty();
        this.timeWindowSec = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalarAutoscalingPolicyScaleDownControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas;
        private @Nullable Input<Integer> timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalarAutoscalingPolicyScaleDownControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledDownReplicas = defaults.maxScaledDownReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder setMaxScaledDownReplicas(@Nullable Input<AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs> maxScaledDownReplicas) {
            this.maxScaledDownReplicas = maxScaledDownReplicas;
            return this;
        }

        public Builder setMaxScaledDownReplicas(@Nullable AutoscalarAutoscalingPolicyScaleDownControlMaxScaledDownReplicasArgs maxScaledDownReplicas) {
            this.maxScaledDownReplicas = Input.ofNullable(maxScaledDownReplicas);
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
        public AutoscalarAutoscalingPolicyScaleDownControlArgs build() {
            return new AutoscalarAutoscalingPolicyScaleDownControlArgs(maxScaledDownReplicas, timeWindowSec);
        }
    }
}
