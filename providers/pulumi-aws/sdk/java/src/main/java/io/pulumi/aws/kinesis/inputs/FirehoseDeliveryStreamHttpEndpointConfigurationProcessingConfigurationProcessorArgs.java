// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs();

    /**
     * Array of processor parameters. More details are given below
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;

    public Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The type of processor. Valid Values: `Lambda`
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs(
        @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs>> parameters,
        Output<String> type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs() {
        this.parameters = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder parameters(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorArgs(parameters, type);
        }
    }
}
