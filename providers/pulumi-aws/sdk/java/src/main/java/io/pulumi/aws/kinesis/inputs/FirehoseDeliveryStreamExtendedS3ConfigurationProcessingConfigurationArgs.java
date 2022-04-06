// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs();

    /**
     * Enables or disables data processing.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Array of data processors. More details are given below
     * 
     */
    @Import(name="processors")
      private final @Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs>> processors;

    public Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs>> getProcessors() {
        return this.processors == null ? Output.empty() : this.processors;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs>> processors) {
        this.enabled = enabled;
        this.processors = processors;
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs() {
        this.enabled = Output.empty();
        this.processors = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs>> processors;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs defaults) {
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
        public Builder processors(@Nullable Output<List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs>> processors) {
            this.processors = processors;
            return this;
        }
        public Builder processors(@Nullable List<FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs> processors) {
            this.processors = Output.ofNullable(processors);
            return this;
        }
        public Builder processors(FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationProcessorArgs... processors) {
            return processors(List.of(processors));
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationProcessingConfigurationArgs(enabled, processors);
        }
    }
}