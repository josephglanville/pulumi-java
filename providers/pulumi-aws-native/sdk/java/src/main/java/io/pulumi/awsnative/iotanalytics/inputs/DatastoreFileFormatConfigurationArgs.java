// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatastoreJsonConfigurationArgs;
import io.pulumi.awsnative.iotanalytics.inputs.DatastoreParquetConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatastoreFileFormatConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatastoreFileFormatConfigurationArgs Empty = new DatastoreFileFormatConfigurationArgs();

    @Import(name="jsonConfiguration")
      private final @Nullable Output<DatastoreJsonConfigurationArgs> jsonConfiguration;

    public Output<DatastoreJsonConfigurationArgs> getJsonConfiguration() {
        return this.jsonConfiguration == null ? Output.empty() : this.jsonConfiguration;
    }

    @Import(name="parquetConfiguration")
      private final @Nullable Output<DatastoreParquetConfigurationArgs> parquetConfiguration;

    public Output<DatastoreParquetConfigurationArgs> getParquetConfiguration() {
        return this.parquetConfiguration == null ? Output.empty() : this.parquetConfiguration;
    }

    public DatastoreFileFormatConfigurationArgs(
        @Nullable Output<DatastoreJsonConfigurationArgs> jsonConfiguration,
        @Nullable Output<DatastoreParquetConfigurationArgs> parquetConfiguration) {
        this.jsonConfiguration = jsonConfiguration;
        this.parquetConfiguration = parquetConfiguration;
    }

    private DatastoreFileFormatConfigurationArgs() {
        this.jsonConfiguration = Output.empty();
        this.parquetConfiguration = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatastoreFileFormatConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatastoreJsonConfigurationArgs> jsonConfiguration;
        private @Nullable Output<DatastoreParquetConfigurationArgs> parquetConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DatastoreFileFormatConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsonConfiguration = defaults.jsonConfiguration;
    	      this.parquetConfiguration = defaults.parquetConfiguration;
        }

        public Builder jsonConfiguration(@Nullable Output<DatastoreJsonConfigurationArgs> jsonConfiguration) {
            this.jsonConfiguration = jsonConfiguration;
            return this;
        }
        public Builder jsonConfiguration(@Nullable DatastoreJsonConfigurationArgs jsonConfiguration) {
            this.jsonConfiguration = Output.ofNullable(jsonConfiguration);
            return this;
        }
        public Builder parquetConfiguration(@Nullable Output<DatastoreParquetConfigurationArgs> parquetConfiguration) {
            this.parquetConfiguration = parquetConfiguration;
            return this;
        }
        public Builder parquetConfiguration(@Nullable DatastoreParquetConfigurationArgs parquetConfiguration) {
            this.parquetConfiguration = Output.ofNullable(parquetConfiguration);
            return this;
        }        public DatastoreFileFormatConfigurationArgs build() {
            return new DatastoreFileFormatConfigurationArgs(jsonConfiguration, parquetConfiguration);
        }
    }
}
