// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.enums.GranularityType;
import io.pulumi.azurenative.costmanagement.inputs.ExportDatasetConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The definition for data in the export.
 * 
 */
public final class ExportDatasetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExportDatasetArgs Empty = new ExportDatasetArgs();

    /**
     * The export dataset configuration.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<ExportDatasetConfigurationArgs> configuration;

    public Output<ExportDatasetConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    /**
     * The granularity of rows in the export. Currently only 'Daily' is supported.
     * 
     */
    @Import(name="granularity")
      private final @Nullable Output<Either<String,GranularityType>> granularity;

    public Output<Either<String,GranularityType>> getGranularity() {
        return this.granularity == null ? Codegen.empty() : this.granularity;
    }

    public ExportDatasetArgs(
        @Nullable Output<ExportDatasetConfigurationArgs> configuration,
        @Nullable Output<Either<String,GranularityType>> granularity) {
        this.configuration = configuration;
        this.granularity = granularity;
    }

    private ExportDatasetArgs() {
        this.configuration = Codegen.empty();
        this.granularity = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDatasetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExportDatasetConfigurationArgs> configuration;
        private @Nullable Output<Either<String,GranularityType>> granularity;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDatasetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.granularity = defaults.granularity;
        }

        public Builder configuration(@Nullable Output<ExportDatasetConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable ExportDatasetConfigurationArgs configuration) {
            this.configuration = Codegen.ofNullable(configuration);
            return this;
        }
        public Builder granularity(@Nullable Output<Either<String,GranularityType>> granularity) {
            this.granularity = granularity;
            return this;
        }
        public Builder granularity(@Nullable Either<String,GranularityType> granularity) {
            this.granularity = Codegen.ofNullable(granularity);
            return this;
        }        public ExportDatasetArgs build() {
            return new ExportDatasetArgs(configuration, granularity);
        }
    }
}
