// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecAwsS3DataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecAzureBlobStorageDataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSinkArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecGcsDataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecHttpDataSourceArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecObjectConditionsArgs;
import io.pulumi.gcp.storage.inputs.TransferJobTransferSpecTransferOptionsArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransferJobTransferSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecArgs Empty = new TransferJobTransferSpecArgs();

    /**
     * An AWS S3 data source. Structure documented below.
     * 
     */
    @InputImport(name="awsS3DataSource")
      private final @Nullable Input<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource;

    public Input<TransferJobTransferSpecAwsS3DataSourceArgs> getAwsS3DataSource() {
        return this.awsS3DataSource == null ? Input.empty() : this.awsS3DataSource;
    }

    /**
     * An Azure Blob Storage data source. Structure documented below.
     * 
     */
    @InputImport(name="azureBlobStorageDataSource")
      private final @Nullable Input<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource;

    public Input<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> getAzureBlobStorageDataSource() {
        return this.azureBlobStorageDataSource == null ? Input.empty() : this.azureBlobStorageDataSource;
    }

    /**
     * A Google Cloud Storage data sink. Structure documented below.
     * 
     */
    @InputImport(name="gcsDataSink")
      private final @Nullable Input<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink;

    public Input<TransferJobTransferSpecGcsDataSinkArgs> getGcsDataSink() {
        return this.gcsDataSink == null ? Input.empty() : this.gcsDataSink;
    }

    /**
     * A Google Cloud Storage data source. Structure documented below.
     * 
     */
    @InputImport(name="gcsDataSource")
      private final @Nullable Input<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource;

    public Input<TransferJobTransferSpecGcsDataSourceArgs> getGcsDataSource() {
        return this.gcsDataSource == null ? Input.empty() : this.gcsDataSource;
    }

    /**
     * A HTTP URL data source. Structure documented below.
     * 
     */
    @InputImport(name="httpDataSource")
      private final @Nullable Input<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource;

    public Input<TransferJobTransferSpecHttpDataSourceArgs> getHttpDataSource() {
        return this.httpDataSource == null ? Input.empty() : this.httpDataSource;
    }

    /**
     * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' `last_modification_time` do not exclude objects in a data sink. Structure documented below.
     * 
     */
    @InputImport(name="objectConditions")
      private final @Nullable Input<TransferJobTransferSpecObjectConditionsArgs> objectConditions;

    public Input<TransferJobTransferSpecObjectConditionsArgs> getObjectConditions() {
        return this.objectConditions == null ? Input.empty() : this.objectConditions;
    }

    /**
     * Characteristics of how to treat files from datasource and sink during job. If the option `delete_objects_unique_in_sink` is true, object conditions based on objects' `last_modification_time` are ignored and do not exclude objects in a data source or a data sink. Structure documented below.
     * 
     */
    @InputImport(name="transferOptions")
      private final @Nullable Input<TransferJobTransferSpecTransferOptionsArgs> transferOptions;

    public Input<TransferJobTransferSpecTransferOptionsArgs> getTransferOptions() {
        return this.transferOptions == null ? Input.empty() : this.transferOptions;
    }

    public TransferJobTransferSpecArgs(
        @Nullable Input<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource,
        @Nullable Input<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource,
        @Nullable Input<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink,
        @Nullable Input<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource,
        @Nullable Input<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource,
        @Nullable Input<TransferJobTransferSpecObjectConditionsArgs> objectConditions,
        @Nullable Input<TransferJobTransferSpecTransferOptionsArgs> transferOptions) {
        this.awsS3DataSource = awsS3DataSource;
        this.azureBlobStorageDataSource = azureBlobStorageDataSource;
        this.gcsDataSink = gcsDataSink;
        this.gcsDataSource = gcsDataSource;
        this.httpDataSource = httpDataSource;
        this.objectConditions = objectConditions;
        this.transferOptions = transferOptions;
    }

    private TransferJobTransferSpecArgs() {
        this.awsS3DataSource = Input.empty();
        this.azureBlobStorageDataSource = Input.empty();
        this.gcsDataSink = Input.empty();
        this.gcsDataSource = Input.empty();
        this.httpDataSource = Input.empty();
        this.objectConditions = Input.empty();
        this.transferOptions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource;
        private @Nullable Input<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource;
        private @Nullable Input<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink;
        private @Nullable Input<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource;
        private @Nullable Input<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource;
        private @Nullable Input<TransferJobTransferSpecObjectConditionsArgs> objectConditions;
        private @Nullable Input<TransferJobTransferSpecTransferOptionsArgs> transferOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsS3DataSource = defaults.awsS3DataSource;
    	      this.azureBlobStorageDataSource = defaults.azureBlobStorageDataSource;
    	      this.gcsDataSink = defaults.gcsDataSink;
    	      this.gcsDataSource = defaults.gcsDataSource;
    	      this.httpDataSource = defaults.httpDataSource;
    	      this.objectConditions = defaults.objectConditions;
    	      this.transferOptions = defaults.transferOptions;
        }

        public Builder setAwsS3DataSource(@Nullable Input<TransferJobTransferSpecAwsS3DataSourceArgs> awsS3DataSource) {
            this.awsS3DataSource = awsS3DataSource;
            return this;
        }

        public Builder setAwsS3DataSource(@Nullable TransferJobTransferSpecAwsS3DataSourceArgs awsS3DataSource) {
            this.awsS3DataSource = Input.ofNullable(awsS3DataSource);
            return this;
        }

        public Builder setAzureBlobStorageDataSource(@Nullable Input<TransferJobTransferSpecAzureBlobStorageDataSourceArgs> azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = azureBlobStorageDataSource;
            return this;
        }

        public Builder setAzureBlobStorageDataSource(@Nullable TransferJobTransferSpecAzureBlobStorageDataSourceArgs azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = Input.ofNullable(azureBlobStorageDataSource);
            return this;
        }

        public Builder setGcsDataSink(@Nullable Input<TransferJobTransferSpecGcsDataSinkArgs> gcsDataSink) {
            this.gcsDataSink = gcsDataSink;
            return this;
        }

        public Builder setGcsDataSink(@Nullable TransferJobTransferSpecGcsDataSinkArgs gcsDataSink) {
            this.gcsDataSink = Input.ofNullable(gcsDataSink);
            return this;
        }

        public Builder setGcsDataSource(@Nullable Input<TransferJobTransferSpecGcsDataSourceArgs> gcsDataSource) {
            this.gcsDataSource = gcsDataSource;
            return this;
        }

        public Builder setGcsDataSource(@Nullable TransferJobTransferSpecGcsDataSourceArgs gcsDataSource) {
            this.gcsDataSource = Input.ofNullable(gcsDataSource);
            return this;
        }

        public Builder setHttpDataSource(@Nullable Input<TransferJobTransferSpecHttpDataSourceArgs> httpDataSource) {
            this.httpDataSource = httpDataSource;
            return this;
        }

        public Builder setHttpDataSource(@Nullable TransferJobTransferSpecHttpDataSourceArgs httpDataSource) {
            this.httpDataSource = Input.ofNullable(httpDataSource);
            return this;
        }

        public Builder setObjectConditions(@Nullable Input<TransferJobTransferSpecObjectConditionsArgs> objectConditions) {
            this.objectConditions = objectConditions;
            return this;
        }

        public Builder setObjectConditions(@Nullable TransferJobTransferSpecObjectConditionsArgs objectConditions) {
            this.objectConditions = Input.ofNullable(objectConditions);
            return this;
        }

        public Builder setTransferOptions(@Nullable Input<TransferJobTransferSpecTransferOptionsArgs> transferOptions) {
            this.transferOptions = transferOptions;
            return this;
        }

        public Builder setTransferOptions(@Nullable TransferJobTransferSpecTransferOptionsArgs transferOptions) {
            this.transferOptions = Input.ofNullable(transferOptions);
            return this;
        }
        public TransferJobTransferSpecArgs build() {
            return new TransferJobTransferSpecArgs(awsS3DataSource, azureBlobStorageDataSource, gcsDataSink, gcsDataSource, httpDataSource, objectConditions, transferOptions);
        }
    }
}
