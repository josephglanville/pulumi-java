// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.FixedOrPercentArgs;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration that allows for slower scale in so that even if Autoscaler recommends an abrupt scale in of a MIG, it will be throttled as specified by the parameters below.
 * 
 */
public final class AutoscalingPolicyScaleInControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyScaleInControlArgs Empty = new AutoscalingPolicyScaleInControlArgs();

    /**
     * Maximum allowed number (or %) of VMs that can be deducted from the peak recommendation during the window autoscaler looks at when computing recommendations. Possibly all these VMs can be deleted at once so user service needs to be prepared to lose that many VMs in one step.
     * 
     */
    @Import(name="maxScaledInReplicas")
      private final @Nullable Output<FixedOrPercentArgs> maxScaledInReplicas;

    public Output<FixedOrPercentArgs> getMaxScaledInReplicas() {
        return this.maxScaledInReplicas == null ? Output.empty() : this.maxScaledInReplicas;
    }

    /**
     * How far back autoscaling looks when computing recommendations to include directives regarding slower scale in, as described above.
     * 
     */
    @Import(name="timeWindowSec")
      private final @Nullable Output<Integer> timeWindowSec;

    public Output<Integer> getTimeWindowSec() {
        return this.timeWindowSec == null ? Output.empty() : this.timeWindowSec;
    }

    public AutoscalingPolicyScaleInControlArgs(
        @Nullable Output<FixedOrPercentArgs> maxScaledInReplicas,
        @Nullable Output<Integer> timeWindowSec) {
        this.maxScaledInReplicas = maxScaledInReplicas;
        this.timeWindowSec = timeWindowSec;
    }

    private AutoscalingPolicyScaleInControlArgs() {
        this.maxScaledInReplicas = Output.empty();
        this.timeWindowSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyScaleInControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FixedOrPercentArgs> maxScaledInReplicas;
        private @Nullable Output<Integer> timeWindowSec;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyScaleInControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxScaledInReplicas = defaults.maxScaledInReplicas;
    	      this.timeWindowSec = defaults.timeWindowSec;
        }

        public Builder maxScaledInReplicas(@Nullable Output<FixedOrPercentArgs> maxScaledInReplicas) {
            this.maxScaledInReplicas = maxScaledInReplicas;
            return this;
        }
        public Builder maxScaledInReplicas(@Nullable FixedOrPercentArgs maxScaledInReplicas) {
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
        }        public AutoscalingPolicyScaleInControlArgs build() {
            return new AutoscalingPolicyScaleInControlArgs(maxScaledInReplicas, timeWindowSec);
        }
    }
}
