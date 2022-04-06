// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs;
import io.pulumi.aws.kinesis.inputs.FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs Empty = new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs();

    /**
     * Defaults to `true`. Set it to `false` if you want to disable format conversion while preserving the configuration details.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Nested argument that specifies the deserializer that you want Kinesis Data Firehose to use to convert the format of your data from JSON. More details below.
     * 
     */
    @Import(name="inputFormatConfiguration", required=true)
      private final Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration;

    public Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> getInputFormatConfiguration() {
        return this.inputFormatConfiguration;
    }

    /**
     * Nested argument that specifies the serializer that you want Kinesis Data Firehose to use to convert the format of your data to the Parquet or ORC format. More details below.
     * 
     */
    @Import(name="outputFormatConfiguration", required=true)
      private final Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration;

    public Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> getOutputFormatConfiguration() {
        return this.outputFormatConfiguration;
    }

    /**
     * Nested argument that specifies the AWS Glue Data Catalog table that contains the column information. More details below.
     * 
     */
    @Import(name="schemaConfiguration", required=true)
      private final Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration;

    public Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> getSchemaConfiguration() {
        return this.schemaConfiguration;
    }

    public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs(
        @Nullable Output<Boolean> enabled,
        Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration,
        Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration,
        Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration) {
        this.enabled = enabled;
        this.inputFormatConfiguration = Objects.requireNonNull(inputFormatConfiguration, "expected parameter 'inputFormatConfiguration' to be non-null");
        this.outputFormatConfiguration = Objects.requireNonNull(outputFormatConfiguration, "expected parameter 'outputFormatConfiguration' to be non-null");
        this.schemaConfiguration = Objects.requireNonNull(schemaConfiguration, "expected parameter 'schemaConfiguration' to be non-null");
    }

    private FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs() {
        this.enabled = Output.empty();
        this.inputFormatConfiguration = Output.empty();
        this.outputFormatConfiguration = Output.empty();
        this.schemaConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration;
        private Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration;
        private Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs defaults) {
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
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder inputFormatConfiguration(Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs> inputFormatConfiguration) {
            this.inputFormatConfiguration = Objects.requireNonNull(inputFormatConfiguration);
            return this;
        }
        public Builder inputFormatConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationInputFormatConfigurationGetArgs inputFormatConfiguration) {
            this.inputFormatConfiguration = Output.of(Objects.requireNonNull(inputFormatConfiguration));
            return this;
        }
        public Builder outputFormatConfiguration(Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs> outputFormatConfiguration) {
            this.outputFormatConfiguration = Objects.requireNonNull(outputFormatConfiguration);
            return this;
        }
        public Builder outputFormatConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationOutputFormatConfigurationGetArgs outputFormatConfiguration) {
            this.outputFormatConfiguration = Output.of(Objects.requireNonNull(outputFormatConfiguration));
            return this;
        }
        public Builder schemaConfiguration(Output<FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs> schemaConfiguration) {
            this.schemaConfiguration = Objects.requireNonNull(schemaConfiguration);
            return this;
        }
        public Builder schemaConfiguration(FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationSchemaConfigurationGetArgs schemaConfiguration) {
            this.schemaConfiguration = Output.of(Objects.requireNonNull(schemaConfiguration));
            return this;
        }        public FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs build() {
            return new FirehoseDeliveryStreamExtendedS3ConfigurationDataFormatConversionConfigurationGetArgs(enabled, inputFormatConfiguration, outputFormatConfiguration, schemaConfiguration);
        }
    }
}