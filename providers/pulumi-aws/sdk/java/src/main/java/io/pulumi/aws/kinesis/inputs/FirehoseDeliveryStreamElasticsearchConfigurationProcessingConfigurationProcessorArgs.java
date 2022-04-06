// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs Empty = new FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs();

    /**
     * Array of processor parameters. More details are given below
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;

    public Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs>> getParameters() {
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

    public FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs(
        @Nullable Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs>> parameters,
        Output<String> type) {
        this.parameters = parameters;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs() {
        this.parameters = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs>> parameters;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        public Builder parameters(@Nullable Output<List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder parameters(FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorParameterArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs build() {
            return new FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfigurationProcessorArgs(parameters, type);
        }
    }
}