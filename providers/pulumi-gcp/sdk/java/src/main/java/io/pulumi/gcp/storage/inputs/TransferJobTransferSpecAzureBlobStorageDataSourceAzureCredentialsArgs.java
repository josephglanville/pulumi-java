// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs Empty = new TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs();

    @InputImport(name="sasToken", required=true)
    private final Input<String> sasToken;

    public Input<String> getSasToken() {
        return this.sasToken;
    }

    public TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs(Input<String> sasToken) {
        this.sasToken = Objects.requireNonNull(sasToken, "expected parameter 'sasToken' to be non-null");
    }

    private TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs() {
        this.sasToken = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sasToken;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasToken = defaults.sasToken;
        }

        public Builder setSasToken(Input<String> sasToken) {
            this.sasToken = Objects.requireNonNull(sasToken);
            return this;
        }

        public Builder setSasToken(String sasToken) {
            this.sasToken = Input.of(Objects.requireNonNull(sasToken));
            return this;
        }

        public TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs build() {
            return new TransferJobTransferSpecAzureBlobStorageDataSourceAzureCredentialsArgs(sasToken);
        }
    }
}