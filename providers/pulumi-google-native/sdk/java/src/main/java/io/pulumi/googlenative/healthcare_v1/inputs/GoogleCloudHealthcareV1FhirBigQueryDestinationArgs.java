// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.enums.GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition;
import io.pulumi.googlenative.healthcare_v1.inputs.SchemaConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration for exporting to BigQuery.
 * 
 */
public final class GoogleCloudHealthcareV1FhirBigQueryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudHealthcareV1FhirBigQueryDestinationArgs Empty = new GoogleCloudHealthcareV1FhirBigQueryDestinationArgs();

    /**
     * BigQuery URI to an existing dataset, up to 2000 characters long, in the format `bq://projectId.bqDatasetId`.
     * 
     */
    @InputImport(name="datasetUri")
      private final @Nullable Output<String> datasetUri;

    public Output<String> getDatasetUri() {
        return this.datasetUri == null ? Output.empty() : this.datasetUri;
    }

    /**
     * If this flag is `TRUE`, all tables are deleted from the dataset before the new exported tables are written. If the flag is not set and the destination dataset contains tables, the export call returns an error. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    @InputImport(name="force")
      private final @Nullable Output<Boolean> force;

    public Output<Boolean> getForce() {
        return this.force == null ? Output.empty() : this.force;
    }

    /**
     * The configuration for the exported BigQuery schema.
     * 
     */
    @InputImport(name="schemaConfig")
      private final @Nullable Output<SchemaConfigArgs> schemaConfig;

    public Output<SchemaConfigArgs> getSchemaConfig() {
        return this.schemaConfig == null ? Output.empty() : this.schemaConfig;
    }

    /**
     * Determines if existing data in the destination dataset is overwritten, appended to, or not written if the tables contain data. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    @InputImport(name="writeDisposition")
      private final @Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition> writeDisposition;

    public Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition> getWriteDisposition() {
        return this.writeDisposition == null ? Output.empty() : this.writeDisposition;
    }

    public GoogleCloudHealthcareV1FhirBigQueryDestinationArgs(
        @Nullable Output<String> datasetUri,
        @Nullable Output<Boolean> force,
        @Nullable Output<SchemaConfigArgs> schemaConfig,
        @Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition> writeDisposition) {
        this.datasetUri = datasetUri;
        this.force = force;
        this.schemaConfig = schemaConfig;
        this.writeDisposition = writeDisposition;
    }

    private GoogleCloudHealthcareV1FhirBigQueryDestinationArgs() {
        this.datasetUri = Output.empty();
        this.force = Output.empty();
        this.schemaConfig = Output.empty();
        this.writeDisposition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1FhirBigQueryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> datasetUri;
        private @Nullable Output<Boolean> force;
        private @Nullable Output<SchemaConfigArgs> schemaConfig;
        private @Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1FhirBigQueryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetUri = defaults.datasetUri;
    	      this.force = defaults.force;
    	      this.schemaConfig = defaults.schemaConfig;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder datasetUri(@Nullable Output<String> datasetUri) {
            this.datasetUri = datasetUri;
            return this;
        }

        public Builder datasetUri(@Nullable String datasetUri) {
            this.datasetUri = Output.ofNullable(datasetUri);
            return this;
        }

        public Builder force(@Nullable Output<Boolean> force) {
            this.force = force;
            return this;
        }

        public Builder force(@Nullable Boolean force) {
            this.force = Output.ofNullable(force);
            return this;
        }

        public Builder schemaConfig(@Nullable Output<SchemaConfigArgs> schemaConfig) {
            this.schemaConfig = schemaConfig;
            return this;
        }

        public Builder schemaConfig(@Nullable SchemaConfigArgs schemaConfig) {
            this.schemaConfig = Output.ofNullable(schemaConfig);
            return this;
        }

        public Builder writeDisposition(@Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder writeDisposition(@Nullable GoogleCloudHealthcareV1FhirBigQueryDestinationWriteDisposition writeDisposition) {
            this.writeDisposition = Output.ofNullable(writeDisposition);
            return this;
        }
        public GoogleCloudHealthcareV1FhirBigQueryDestinationArgs build() {
            return new GoogleCloudHealthcareV1FhirBigQueryDestinationArgs(datasetUri, force, schemaConfig, writeDisposition);
        }
    }
}
