// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


public final class ModelQualityJobDefinitionStoppingConditionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionStoppingConditionArgs Empty = new ModelQualityJobDefinitionStoppingConditionArgs();

    @InputImport(name="maxRuntimeInSeconds", required=true)
    private final Input<Integer> maxRuntimeInSeconds;

    public Input<Integer> getMaxRuntimeInSeconds() {
        return this.maxRuntimeInSeconds;
    }

    public ModelQualityJobDefinitionStoppingConditionArgs(Input<Integer> maxRuntimeInSeconds) {
        this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds, "expected parameter 'maxRuntimeInSeconds' to be non-null");
    }

    private ModelQualityJobDefinitionStoppingConditionArgs() {
        this.maxRuntimeInSeconds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionStoppingConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> maxRuntimeInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionStoppingConditionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRuntimeInSeconds = defaults.maxRuntimeInSeconds;
        }

        public Builder setMaxRuntimeInSeconds(Input<Integer> maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Objects.requireNonNull(maxRuntimeInSeconds);
            return this;
        }

        public Builder setMaxRuntimeInSeconds(Integer maxRuntimeInSeconds) {
            this.maxRuntimeInSeconds = Input.of(Objects.requireNonNull(maxRuntimeInSeconds));
            return this;
        }

        public ModelQualityJobDefinitionStoppingConditionArgs build() {
            return new ModelQualityJobDefinitionStoppingConditionArgs(maxRuntimeInSeconds);
        }
    }
}