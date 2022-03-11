// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs();

    /**
     * Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`
     * 
     */
    @InputImport(name="parameterName", required=true)
      private final Output<String> parameterName;

    public Output<String> getParameterName() {
        return this.parameterName;
    }

    /**
     * Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    @InputImport(name="parameterValue", required=true)
      private final Output<String> parameterValue;

    public Output<String> getParameterValue() {
        return this.parameterValue;
    }

    public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs(
        Output<String> parameterName,
        Output<String> parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs() {
        this.parameterName = Output.empty();
        this.parameterValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parameterName;
        private Output<String> parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(Output<String> parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Output.of(Objects.requireNonNull(parameterName));
            return this;
        }

        public Builder parameterValue(Output<String> parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }

        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Output.of(Objects.requireNonNull(parameterValue));
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterGetArgs(parameterName, parameterValue);
        }
    }
}
