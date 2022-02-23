// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.AzureFileFilterDetailsResponse;
import io.pulumi.azurenative.databox.inputs.BlobFilterDetailsResponse;
import io.pulumi.azurenative.databox.inputs.FilterFileDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the filtering the transfer of data.
 * 
 */
public final class TransferFilterDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final TransferFilterDetailsResponse Empty = new TransferFilterDetailsResponse();

    /**
     * Filter details to transfer Azure files.
     * 
     */
    @InputImport(name="azureFileFilterDetails")
      private final @Nullable AzureFileFilterDetailsResponse azureFileFilterDetails;

    public Optional<AzureFileFilterDetailsResponse> getAzureFileFilterDetails() {
        return this.azureFileFilterDetails == null ? Optional.empty() : Optional.ofNullable(this.azureFileFilterDetails);
    }

    /**
     * Filter details to transfer blobs.
     * 
     */
    @InputImport(name="blobFilterDetails")
      private final @Nullable BlobFilterDetailsResponse blobFilterDetails;

    public Optional<BlobFilterDetailsResponse> getBlobFilterDetails() {
        return this.blobFilterDetails == null ? Optional.empty() : Optional.ofNullable(this.blobFilterDetails);
    }

    /**
     * Type of the account of data.
     * 
     */
    @InputImport(name="dataAccountType", required=true)
      private final String dataAccountType;

    public String getDataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Details of the filter files to be used for data transfer.
     * 
     */
    @InputImport(name="filterFileDetails")
      private final @Nullable List<FilterFileDetailsResponse> filterFileDetails;

    public List<FilterFileDetailsResponse> getFilterFileDetails() {
        return this.filterFileDetails == null ? List.of() : this.filterFileDetails;
    }

    public TransferFilterDetailsResponse(
        @Nullable AzureFileFilterDetailsResponse azureFileFilterDetails,
        @Nullable BlobFilterDetailsResponse blobFilterDetails,
        String dataAccountType,
        @Nullable List<FilterFileDetailsResponse> filterFileDetails) {
        this.azureFileFilterDetails = azureFileFilterDetails;
        this.blobFilterDetails = blobFilterDetails;
        this.dataAccountType = dataAccountType == null ? "StorageAccount" : Objects.requireNonNull(dataAccountType, "expected parameter 'dataAccountType' to be non-null");
        this.filterFileDetails = filterFileDetails;
    }

    private TransferFilterDetailsResponse() {
        this.azureFileFilterDetails = null;
        this.blobFilterDetails = null;
        this.dataAccountType = null;
        this.filterFileDetails = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferFilterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureFileFilterDetailsResponse azureFileFilterDetails;
        private @Nullable BlobFilterDetailsResponse blobFilterDetails;
        private String dataAccountType;
        private @Nullable List<FilterFileDetailsResponse> filterFileDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferFilterDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureFileFilterDetails = defaults.azureFileFilterDetails;
    	      this.blobFilterDetails = defaults.blobFilterDetails;
    	      this.dataAccountType = defaults.dataAccountType;
    	      this.filterFileDetails = defaults.filterFileDetails;
        }

        public Builder setAzureFileFilterDetails(@Nullable AzureFileFilterDetailsResponse azureFileFilterDetails) {
            this.azureFileFilterDetails = azureFileFilterDetails;
            return this;
        }

        public Builder setBlobFilterDetails(@Nullable BlobFilterDetailsResponse blobFilterDetails) {
            this.blobFilterDetails = blobFilterDetails;
            return this;
        }

        public Builder setDataAccountType(String dataAccountType) {
            this.dataAccountType = Objects.requireNonNull(dataAccountType);
            return this;
        }

        public Builder setFilterFileDetails(@Nullable List<FilterFileDetailsResponse> filterFileDetails) {
            this.filterFileDetails = filterFileDetails;
            return this;
        }
        public TransferFilterDetailsResponse build() {
            return new TransferFilterDetailsResponse(azureFileFilterDetails, blobFilterDetails, dataAccountType, filterFileDetails);
        }
    }
}
