// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionEndpointInput;
import io.pulumi.awsnative.sagemaker.outputs.ModelBiasJobDefinitionMonitoringGroundTruthS3Input;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class ModelBiasJobDefinitionModelBiasJobInput {
    private final ModelBiasJobDefinitionEndpointInput endpointInput;
    private final ModelBiasJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input;

    @CustomType.Constructor
    private ModelBiasJobDefinitionModelBiasJobInput(
        @CustomType.Parameter("endpointInput") ModelBiasJobDefinitionEndpointInput endpointInput,
        @CustomType.Parameter("groundTruthS3Input") ModelBiasJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input) {
        this.endpointInput = endpointInput;
        this.groundTruthS3Input = groundTruthS3Input;
    }

    public ModelBiasJobDefinitionEndpointInput getEndpointInput() {
        return this.endpointInput;
    }
    public ModelBiasJobDefinitionMonitoringGroundTruthS3Input getGroundTruthS3Input() {
        return this.groundTruthS3Input;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionModelBiasJobInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ModelBiasJobDefinitionEndpointInput endpointInput;
        private ModelBiasJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionModelBiasJobInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointInput = defaults.endpointInput;
    	      this.groundTruthS3Input = defaults.groundTruthS3Input;
        }

        public Builder endpointInput(ModelBiasJobDefinitionEndpointInput endpointInput) {
            this.endpointInput = Objects.requireNonNull(endpointInput);
            return this;
        }
        public Builder groundTruthS3Input(ModelBiasJobDefinitionMonitoringGroundTruthS3Input groundTruthS3Input) {
            this.groundTruthS3Input = Objects.requireNonNull(groundTruthS3Input);
            return this;
        }        public ModelBiasJobDefinitionModelBiasJobInput build() {
            return new ModelBiasJobDefinitionModelBiasJobInput(endpointInput, groundTruthS3Input);
        }
    }
}
