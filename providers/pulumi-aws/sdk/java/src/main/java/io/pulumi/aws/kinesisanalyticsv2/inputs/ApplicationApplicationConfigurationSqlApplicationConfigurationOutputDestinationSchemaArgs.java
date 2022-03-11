// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs Empty = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs();

    /**
     * Specifies the format of the records on the output stream. Valid values: `CSV`, `JSON`.
     * 
     */
    @InputImport(name="recordFormatType", required=true)
      private final Output<String> recordFormatType;

    public Output<String> getRecordFormatType() {
        return this.recordFormatType;
    }

    public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs(Output<String> recordFormatType) {
        this.recordFormatType = Objects.requireNonNull(recordFormatType, "expected parameter 'recordFormatType' to be non-null");
    }

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs() {
        this.recordFormatType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder recordFormatType(Output<String> recordFormatType) {
            this.recordFormatType = Objects.requireNonNull(recordFormatType);
            return this;
        }

        public Builder recordFormatType(String recordFormatType) {
            this.recordFormatType = Output.of(Objects.requireNonNull(recordFormatType));
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchemaArgs(recordFormatType);
        }
    }
}
