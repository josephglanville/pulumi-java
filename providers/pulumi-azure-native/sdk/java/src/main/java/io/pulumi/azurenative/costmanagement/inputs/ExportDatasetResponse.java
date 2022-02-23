// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.inputs;

import io.pulumi.azurenative.costmanagement.inputs.ExportDatasetConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The definition for data in the export.
 * 
 */
public final class ExportDatasetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExportDatasetResponse Empty = new ExportDatasetResponse();

    /**
     * The export dataset configuration.
     * 
     */
    @InputImport(name="configuration")
      private final @Nullable ExportDatasetConfigurationResponse configuration;

    public Optional<ExportDatasetConfigurationResponse> getConfiguration() {
        return this.configuration == null ? Optional.empty() : Optional.ofNullable(this.configuration);
    }

    /**
     * The granularity of rows in the export. Currently only 'Daily' is supported.
     * 
     */
    @InputImport(name="granularity")
      private final @Nullable String granularity;

    public Optional<String> getGranularity() {
        return this.granularity == null ? Optional.empty() : Optional.ofNullable(this.granularity);
    }

    public ExportDatasetResponse(
        @Nullable ExportDatasetConfigurationResponse configuration,
        @Nullable String granularity) {
        this.configuration = configuration;
        this.granularity = granularity;
    }

    private ExportDatasetResponse() {
        this.configuration = null;
        this.granularity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExportDatasetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExportDatasetConfigurationResponse configuration;
        private @Nullable String granularity;

        public Builder() {
    	      // Empty
        }

        public Builder(ExportDatasetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.granularity = defaults.granularity;
        }

        public Builder setConfiguration(@Nullable ExportDatasetConfigurationResponse configuration) {
            this.configuration = configuration;
            return this;
        }

        public Builder setGranularity(@Nullable String granularity) {
            this.granularity = granularity;
            return this;
        }
        public ExportDatasetResponse build() {
            return new ExportDatasetResponse(configuration, granularity);
        }
    }
}
