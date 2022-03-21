// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryOptionsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2CloudStorageOptionsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2DatastoreOptionsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2HybridOptionsResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2TimespanConfigResponse;
import java.util.Objects;


/**
 * Shared message indicating Cloud storage type.
 * 
 */
public final class GooglePrivacyDlpV2StorageConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2StorageConfigResponse Empty = new GooglePrivacyDlpV2StorageConfigResponse();

    /**
     * BigQuery options.
     * 
     */
    @Import(name="bigQueryOptions", required=true)
      private final GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions;

    public GooglePrivacyDlpV2BigQueryOptionsResponse getBigQueryOptions() {
        return this.bigQueryOptions;
    }

    /**
     * Google Cloud Storage options.
     * 
     */
    @Import(name="cloudStorageOptions", required=true)
      private final GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions;

    public GooglePrivacyDlpV2CloudStorageOptionsResponse getCloudStorageOptions() {
        return this.cloudStorageOptions;
    }

    /**
     * Google Cloud Datastore options.
     * 
     */
    @Import(name="datastoreOptions", required=true)
      private final GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions;

    public GooglePrivacyDlpV2DatastoreOptionsResponse getDatastoreOptions() {
        return this.datastoreOptions;
    }

    /**
     * Hybrid inspection options.
     * 
     */
    @Import(name="hybridOptions", required=true)
      private final GooglePrivacyDlpV2HybridOptionsResponse hybridOptions;

    public GooglePrivacyDlpV2HybridOptionsResponse getHybridOptions() {
        return this.hybridOptions;
    }

    @Import(name="timespanConfig", required=true)
      private final GooglePrivacyDlpV2TimespanConfigResponse timespanConfig;

    public GooglePrivacyDlpV2TimespanConfigResponse getTimespanConfig() {
        return this.timespanConfig;
    }

    public GooglePrivacyDlpV2StorageConfigResponse(
        GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions,
        GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions,
        GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions,
        GooglePrivacyDlpV2HybridOptionsResponse hybridOptions,
        GooglePrivacyDlpV2TimespanConfigResponse timespanConfig) {
        this.bigQueryOptions = Objects.requireNonNull(bigQueryOptions, "expected parameter 'bigQueryOptions' to be non-null");
        this.cloudStorageOptions = Objects.requireNonNull(cloudStorageOptions, "expected parameter 'cloudStorageOptions' to be non-null");
        this.datastoreOptions = Objects.requireNonNull(datastoreOptions, "expected parameter 'datastoreOptions' to be non-null");
        this.hybridOptions = Objects.requireNonNull(hybridOptions, "expected parameter 'hybridOptions' to be non-null");
        this.timespanConfig = Objects.requireNonNull(timespanConfig, "expected parameter 'timespanConfig' to be non-null");
    }

    private GooglePrivacyDlpV2StorageConfigResponse() {
        this.bigQueryOptions = null;
        this.cloudStorageOptions = null;
        this.datastoreOptions = null;
        this.hybridOptions = null;
        this.timespanConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2StorageConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions;
        private GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions;
        private GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions;
        private GooglePrivacyDlpV2HybridOptionsResponse hybridOptions;
        private GooglePrivacyDlpV2TimespanConfigResponse timespanConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2StorageConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigQueryOptions = defaults.bigQueryOptions;
    	      this.cloudStorageOptions = defaults.cloudStorageOptions;
    	      this.datastoreOptions = defaults.datastoreOptions;
    	      this.hybridOptions = defaults.hybridOptions;
    	      this.timespanConfig = defaults.timespanConfig;
        }

        public Builder bigQueryOptions(GooglePrivacyDlpV2BigQueryOptionsResponse bigQueryOptions) {
            this.bigQueryOptions = Objects.requireNonNull(bigQueryOptions);
            return this;
        }
        public Builder cloudStorageOptions(GooglePrivacyDlpV2CloudStorageOptionsResponse cloudStorageOptions) {
            this.cloudStorageOptions = Objects.requireNonNull(cloudStorageOptions);
            return this;
        }
        public Builder datastoreOptions(GooglePrivacyDlpV2DatastoreOptionsResponse datastoreOptions) {
            this.datastoreOptions = Objects.requireNonNull(datastoreOptions);
            return this;
        }
        public Builder hybridOptions(GooglePrivacyDlpV2HybridOptionsResponse hybridOptions) {
            this.hybridOptions = Objects.requireNonNull(hybridOptions);
            return this;
        }
        public Builder timespanConfig(GooglePrivacyDlpV2TimespanConfigResponse timespanConfig) {
            this.timespanConfig = Objects.requireNonNull(timespanConfig);
            return this;
        }        public GooglePrivacyDlpV2StorageConfigResponse build() {
            return new GooglePrivacyDlpV2StorageConfigResponse(bigQueryOptions, cloudStorageOptions, datastoreOptions, hybridOptions, timespanConfig);
        }
    }
}
