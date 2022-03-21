// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.inputs;

import io.pulumi.awsnative.evidently.inputs.LaunchGroupToWeightArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class LaunchStepConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchStepConfigArgs Empty = new LaunchStepConfigArgs();

    @Import(name="groupWeights", required=true)
      private final Output<List<LaunchGroupToWeightArgs>> groupWeights;

    public Output<List<LaunchGroupToWeightArgs>> getGroupWeights() {
        return this.groupWeights;
    }

    @Import(name="startTime", required=true)
      private final Output<String> startTime;

    public Output<String> getStartTime() {
        return this.startTime;
    }

    public LaunchStepConfigArgs(
        Output<List<LaunchGroupToWeightArgs>> groupWeights,
        Output<String> startTime) {
        this.groupWeights = Objects.requireNonNull(groupWeights, "expected parameter 'groupWeights' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
    }

    private LaunchStepConfigArgs() {
        this.groupWeights = Output.empty();
        this.startTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchStepConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<LaunchGroupToWeightArgs>> groupWeights;
        private Output<String> startTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchStepConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupWeights = defaults.groupWeights;
    	      this.startTime = defaults.startTime;
        }

        public Builder groupWeights(Output<List<LaunchGroupToWeightArgs>> groupWeights) {
            this.groupWeights = Objects.requireNonNull(groupWeights);
            return this;
        }
        public Builder groupWeights(List<LaunchGroupToWeightArgs> groupWeights) {
            this.groupWeights = Output.of(Objects.requireNonNull(groupWeights));
            return this;
        }
        public Builder groupWeights(LaunchGroupToWeightArgs... groupWeights) {
            return groupWeights(List.of(groupWeights));
        }
        public Builder startTime(Output<String> startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Output.of(Objects.requireNonNull(startTime));
            return this;
        }        public LaunchStepConfigArgs build() {
            return new LaunchStepConfigArgs(groupWeights, startTime);
        }
    }
}
