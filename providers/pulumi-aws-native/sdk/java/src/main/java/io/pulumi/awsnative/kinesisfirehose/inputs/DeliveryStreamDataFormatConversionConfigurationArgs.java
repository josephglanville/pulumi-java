// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamInputFormatConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamOutputFormatConfigurationArgs;
import io.pulumi.awsnative.kinesisfirehose.inputs.DeliveryStreamSchemaConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamDataFormatConversionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamDataFormatConversionConfigurationArgs Empty = new DeliveryStreamDataFormatConversionConfigurationArgs();

    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    @Import(name="inputFormatConfiguration")
      private final @Nullable Output<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration;

    public Output<DeliveryStreamInputFormatConfigurationArgs> getInputFormatConfiguration() {
        return this.inputFormatConfiguration == null ? Codegen.empty() : this.inputFormatConfiguration;
    }

    @Import(name="outputFormatConfiguration")
      private final @Nullable Output<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration;

    public Output<DeliveryStreamOutputFormatConfigurationArgs> getOutputFormatConfiguration() {
        return this.outputFormatConfiguration == null ? Codegen.empty() : this.outputFormatConfiguration;
    }

    @Import(name="schemaConfiguration")
      private final @Nullable Output<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration;

    public Output<DeliveryStreamSchemaConfigurationArgs> getSchemaConfiguration() {
        return this.schemaConfiguration == null ? Codegen.empty() : this.schemaConfiguration;
    }

    public DeliveryStreamDataFormatConversionConfigurationArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration,
        @Nullable Output<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration,
        @Nullable Output<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration) {
        this.enabled = enabled;
        this.inputFormatConfiguration = inputFormatConfiguration;
        this.outputFormatConfiguration = outputFormatConfiguration;
        this.schemaConfiguration = schemaConfiguration;
    }

    private DeliveryStreamDataFormatConversionConfigurationArgs() {
        this.enabled = Codegen.empty();
        this.inputFormatConfiguration = Codegen.empty();
        this.outputFormatConfiguration = Codegen.empty();
        this.schemaConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamDataFormatConversionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration;
        private @Nullable Output<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration;
        private @Nullable Output<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamDataFormatConversionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.inputFormatConfiguration = defaults.inputFormatConfiguration;
    	      this.outputFormatConfiguration = defaults.outputFormatConfiguration;
    	      this.schemaConfiguration = defaults.schemaConfiguration;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder inputFormatConfiguration(@Nullable Output<DeliveryStreamInputFormatConfigurationArgs> inputFormatConfiguration) {
            this.inputFormatConfiguration = inputFormatConfiguration;
            return this;
        }
        public Builder inputFormatConfiguration(@Nullable DeliveryStreamInputFormatConfigurationArgs inputFormatConfiguration) {
            this.inputFormatConfiguration = Codegen.ofNullable(inputFormatConfiguration);
            return this;
        }
        public Builder outputFormatConfiguration(@Nullable Output<DeliveryStreamOutputFormatConfigurationArgs> outputFormatConfiguration) {
            this.outputFormatConfiguration = outputFormatConfiguration;
            return this;
        }
        public Builder outputFormatConfiguration(@Nullable DeliveryStreamOutputFormatConfigurationArgs outputFormatConfiguration) {
            this.outputFormatConfiguration = Codegen.ofNullable(outputFormatConfiguration);
            return this;
        }
        public Builder schemaConfiguration(@Nullable Output<DeliveryStreamSchemaConfigurationArgs> schemaConfiguration) {
            this.schemaConfiguration = schemaConfiguration;
            return this;
        }
        public Builder schemaConfiguration(@Nullable DeliveryStreamSchemaConfigurationArgs schemaConfiguration) {
            this.schemaConfiguration = Codegen.ofNullable(schemaConfiguration);
            return this;
        }        public DeliveryStreamDataFormatConversionConfigurationArgs build() {
            return new DeliveryStreamDataFormatConversionConfigurationArgs(enabled, inputFormatConfiguration, outputFormatConfiguration, schemaConfiguration);
        }
    }
}
