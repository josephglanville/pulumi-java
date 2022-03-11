// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.enums.GoogleCloudHealthcareV1beta1DicomBigQueryDestinationWriteDisposition;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The BigQuery table where the server writes output.
 * 
 */
public final class GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs Empty = new GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs();

    /**
     * Use `write_disposition` instead. If `write_disposition` is specified, this parameter is ignored. force=false is equivalent to write_disposition=WRITE_EMPTY and force=true is equivalent to write_disposition=WRITE_TRUNCATE.
     * 
     */
    @InputImport(name="force")
      private final @Nullable Output<Boolean> force;

    public Output<Boolean> getForce() {
        return this.force == null ? Output.empty() : this.force;
    }

    /**
     * BigQuery URI to a table, up to 2000 characters long, in the format `bq://projectId.bqDatasetId.tableId`
     * 
     */
    @InputImport(name="tableUri")
      private final @Nullable Output<String> tableUri;

    public Output<String> getTableUri() {
        return this.tableUri == null ? Output.empty() : this.tableUri;
    }

    /**
     * Determines whether the existing table in the destination is to be overwritten or appended to. If a write_disposition is specified, the `force` parameter is ignored.
     * 
     */
    @InputImport(name="writeDisposition")
      private final @Nullable Output<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationWriteDisposition> writeDisposition;

    public Output<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationWriteDisposition> getWriteDisposition() {
        return this.writeDisposition == null ? Output.empty() : this.writeDisposition;
    }

    public GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs(
        @Nullable Output<Boolean> force,
        @Nullable Output<String> tableUri,
        @Nullable Output<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationWriteDisposition> writeDisposition) {
        this.force = force;
        this.tableUri = tableUri;
        this.writeDisposition = writeDisposition;
    }

    private GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs() {
        this.force = Output.empty();
        this.tableUri = Output.empty();
        this.writeDisposition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> force;
        private @Nullable Output<String> tableUri;
        private @Nullable Output<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationWriteDisposition> writeDisposition;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.force = defaults.force;
    	      this.tableUri = defaults.tableUri;
    	      this.writeDisposition = defaults.writeDisposition;
        }

        public Builder force(@Nullable Output<Boolean> force) {
            this.force = force;
            return this;
        }

        public Builder force(@Nullable Boolean force) {
            this.force = Output.ofNullable(force);
            return this;
        }

        public Builder tableUri(@Nullable Output<String> tableUri) {
            this.tableUri = tableUri;
            return this;
        }

        public Builder tableUri(@Nullable String tableUri) {
            this.tableUri = Output.ofNullable(tableUri);
            return this;
        }

        public Builder writeDisposition(@Nullable Output<GoogleCloudHealthcareV1beta1DicomBigQueryDestinationWriteDisposition> writeDisposition) {
            this.writeDisposition = writeDisposition;
            return this;
        }

        public Builder writeDisposition(@Nullable GoogleCloudHealthcareV1beta1DicomBigQueryDestinationWriteDisposition writeDisposition) {
            this.writeDisposition = Output.ofNullable(writeDisposition);
            return this;
        }
        public GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs build() {
            return new GoogleCloudHealthcareV1beta1DicomBigQueryDestinationArgs(force, tableUri, writeDisposition);
        }
    }
}
