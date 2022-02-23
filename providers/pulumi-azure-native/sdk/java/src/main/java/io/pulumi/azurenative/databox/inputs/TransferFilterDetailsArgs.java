// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.enums.DataAccountType;
import io.pulumi.azurenative.databox.inputs.AzureFileFilterDetailsArgs;
import io.pulumi.azurenative.databox.inputs.BlobFilterDetailsArgs;
import io.pulumi.azurenative.databox.inputs.FilterFileDetailsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Details of the filtering the transfer of data.
 * 
 */
public final class TransferFilterDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferFilterDetailsArgs Empty = new TransferFilterDetailsArgs();

    /**
     * Filter details to transfer Azure files.
     * 
     */
    @InputImport(name="azureFileFilterDetails")
      private final @Nullable Input<AzureFileFilterDetailsArgs> azureFileFilterDetails;

    public Input<AzureFileFilterDetailsArgs> getAzureFileFilterDetails() {
        return this.azureFileFilterDetails == null ? Input.empty() : this.azureFileFilterDetails;
    }

    /**
     * Filter details to transfer blobs.
     * 
     */
    @InputImport(name="blobFilterDetails")
      private final @Nullable Input<BlobFilterDetailsArgs> blobFilterDetails;

    public Input<BlobFilterDetailsArgs> getBlobFilterDetails() {
        return this.blobFilterDetails == null ? Input.empty() : this.blobFilterDetails;
    }

    /**
     * Type of the account of data.
     * 
     */
    @InputImport(name="dataAccountType", required=true)
      private final Input<Either<String,DataAccountType>> dataAccountType;

    public Input<Either<String,DataAccountType>> getDataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Details of the filter files to be used for data transfer.
     * 
     */
    @InputImport(name="filterFileDetails")
      private final @Nullable Input<List<FilterFileDetailsArgs>> filterFileDetails;

    public Input<List<FilterFileDetailsArgs>> getFilterFileDetails() {
        return this.filterFileDetails == null ? Input.empty() : this.filterFileDetails;
    }

    public TransferFilterDetailsArgs(
        @Nullable Input<AzureFileFilterDetailsArgs> azureFileFilterDetails,
        @Nullable Input<BlobFilterDetailsArgs> blobFilterDetails,
        Input<Either<String,DataAccountType>> dataAccountType,
        @Nullable Input<List<FilterFileDetailsArgs>> filterFileDetails) {
        this.azureFileFilterDetails = azureFileFilterDetails;
        this.blobFilterDetails = blobFilterDetails;
        this.dataAccountType = dataAccountType == null ? Input.ofLeft("StorageAccount") : Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.filterFileDetails = filterFileDetails;
    }

    private TransferFilterDetailsArgs() {
        this.azureFileFilterDetails = Input.empty();
        this.blobFilterDetails = Input.empty();
        this.dataAccountType = Input.empty();
        this.filterFileDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferFilterDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AzureFileFilterDetailsArgs> azureFileFilterDetails;
        private @Nullable Input<BlobFilterDetailsArgs> blobFilterDetails;
        private Input<Either<String,DataAccountType>> dataAccountType;
        private @Nullable Input<List<FilterFileDetailsArgs>> filterFileDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferFilterDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFileFilterDetails = defaults.azureFileFilterDetails;
    	      this.blobFilterDetails = defaults.blobFilterDetails;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.filterFileDetails = defaults.filterFileDetails;
        }

        public Builder setAzureFileFilterDetails(@Nullable Input<AzureFileFilterDetailsArgs> azureFileFilterDetails) {
            this.azureFileFilterDetails = azureFileFilterDetails;
            return this;
        }

        public Builder setAzureFileFilterDetails(@Nullable AzureFileFilterDetailsArgs azureFileFilterDetails) {
            this.azureFileFilterDetails = Input.ofNullable(azureFileFilterDetails);
            return this;
        }

        public Builder setBlobFilterDetails(@Nullable Input<BlobFilterDetailsArgs> blobFilterDetails) {
            this.blobFilterDetails = blobFilterDetails;
            return this;
        }

        public Builder setBlobFilterDetails(@Nullable BlobFilterDetailsArgs blobFilterDetails) {
            this.blobFilterDetails = Input.ofNullable(blobFilterDetails);
            return this;
        }

        public Builder setDataAccountType(Input<Either<String,DataAccountType>> dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setDataAccountType(Either<String,DataAccountType> dataAccountType) {
            this.dataAccountType = Input.of(Objects.requireNonNull(dataAccountType));
            return this;
        }

        public Builder setFilterFileDetails(@Nullable Input<List<FilterFileDetailsArgs>> filterFileDetails) {
            this.filterFileDetails = filterFileDetails;
            return this;
        }

        public Builder setFilterFileDetails(@Nullable List<FilterFileDetailsArgs> filterFileDetails) {
            this.filterFileDetails = Input.ofNullable(filterFileDetails);
            return this;
        }
        public TransferFilterDetailsArgs build() {
            return new TransferFilterDetailsArgs(azureFileFilterDetails, blobFilterDetails, dataAccountType, filterFileDetails);
        }
    }
}
