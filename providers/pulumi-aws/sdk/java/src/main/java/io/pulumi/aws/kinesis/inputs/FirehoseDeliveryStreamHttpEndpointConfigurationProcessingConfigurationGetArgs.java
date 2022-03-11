// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs Empty = new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs();

    /**
     * Enables or disables data processing.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Array of data processors. More details are given below
     * 
     */
    @InputImport(name="processors")
      private final @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs>> processors;

    public Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs>> getProcessors() {
        return this.processors == null ? Output.empty() : this.processors;
    }

    public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs>> processors) {
        this.enabled = enabled;
        this.processors = processors;
    }

    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs() {
        this.enabled = Output.empty();
        this.processors = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs>> processors;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.processors = defaults.processors;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }

        public Builder processors(@Nullable Output<List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs>> processors) {
            this.processors = processors;
            return this;
        }

        public Builder processors(@Nullable List<FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorGetArgs> processors) {
            this.processors = Output.ofNullable(processors);
            return this;
        }
        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationGetArgs(enabled, processors);
        }
    }
}
