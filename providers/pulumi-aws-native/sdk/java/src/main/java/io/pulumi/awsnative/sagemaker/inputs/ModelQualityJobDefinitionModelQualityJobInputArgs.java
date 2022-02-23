// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionEndpointInputArgs;
import io.pulumi.awsnative.sagemaker.inputs.ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The inputs for a monitoring job.
 * 
 */
public final class ModelQualityJobDefinitionModelQualityJobInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelQualityJobDefinitionModelQualityJobInputArgs Empty = new ModelQualityJobDefinitionModelQualityJobInputArgs();

    @InputImport(name="endpointInput", required=true)
      private final Input<ModelQualityJobDefinitionEndpointInputArgs> endpointInput;

    public Input<ModelQualityJobDefinitionEndpointInputArgs> getEndpointInput() {
        return this.endpointInput;
    }

    @InputImport(name="groundTruthS3Input", required=true)
      private final Input<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input;

    public Input<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> getGroundTruthS3Input() {
        return this.groundTruthS3Input;
    }

    public ModelQualityJobDefinitionModelQualityJobInputArgs(
        Input<ModelQualityJobDefinitionEndpointInputArgs> endpointInput,
        Input<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input) {
        this.endpointInput = Objects.requireNonNull(endpointInput, "expected parameter 'endpointInput' to be non-null");
        this.groundTruthS3Input = Objects.requireNonNull(groundTruthS3Input, "expected parameter 'groundTruthS3Input' to be non-null");
    }

    private ModelQualityJobDefinitionModelQualityJobInputArgs() {
        this.endpointInput = Input.empty();
        this.groundTruthS3Input = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelQualityJobDefinitionModelQualityJobInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ModelQualityJobDefinitionEndpointInputArgs> endpointInput;
        private Input<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelQualityJobDefinitionModelQualityJobInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
    	      this.groundTruthS3Input = defaults.groundTruthS3Input;
        }

        public Builder setEndpointInput(Input<ModelQualityJobDefinitionEndpointInputArgs> endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }

        public Builder setEndpointInput(ModelQualityJobDefinitionEndpointInputArgs endpointInput) {
            this.endpointInput = Input.of(Objects.requireNonNull(endpointInput));
            return this;
        }

        public Builder setGroundTruthS3Input(Input<ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs> groundTruthS3Input) {
            this.groundTruthS3Input = Objects.requireNonNull(groundTruthS3Input);
            return this;
        }

        public Builder setGroundTruthS3Input(ModelQualityJobDefinitionMonitoringGroundTruthS3InputArgs groundTruthS3Input) {
            this.groundTruthS3Input = Input.of(Objects.requireNonNull(groundTruthS3Input));
            return this;
        }
        public ModelQualityJobDefinitionModelQualityJobInputArgs build() {
            return new ModelQualityJobDefinitionModelQualityJobInputArgs(endpointInput, groundTruthS3Input);
        }
    }
}
