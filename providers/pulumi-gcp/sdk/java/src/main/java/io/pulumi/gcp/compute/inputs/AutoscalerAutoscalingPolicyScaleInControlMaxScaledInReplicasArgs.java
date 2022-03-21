// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs Empty = new AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs();

    /**
     * Specifies a fixed number of VM instances. This must be a positive
     * integer.
     * 
     */
    @Import(name="fixed")
      private final @Nullable Output<Integer> fixed;

    public Output<Integer> getFixed() {
        return this.fixed == null ? Output.empty() : this.fixed;
    }

    /**
     * Specifies a percentage of instances between 0 to 100%, inclusive.
     * For example, specify 80 for 80%.
     * 
     */
    @Import(name="percent")
      private final @Nullable Output<Integer> percent;

    public Output<Integer> getPercent() {
        return this.percent == null ? Output.empty() : this.percent;
    }

    public AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs(
        @Nullable Output<Integer> fixed,
        @Nullable Output<Integer> percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    private AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs() {
        this.fixed = Output.empty();
        this.percent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> fixed;
        private @Nullable Output<Integer> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(@Nullable Output<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }
        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = Output.ofNullable(fixed);
            return this;
        }
        public Builder percent(@Nullable Output<Integer> percent) {
            this.percent = percent;
            return this;
        }
        public Builder percent(@Nullable Integer percent) {
            this.percent = Output.ofNullable(percent);
            return this;
        }        public AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs build() {
            return new AutoscalerAutoscalingPolicyScaleInControlMaxScaledInReplicasArgs(fixed, percent);
        }
    }
}
