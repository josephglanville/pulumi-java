// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.enums.AzureContainerDataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Azure container mapping of the endpoint.
 * 
 */
public final class AzureContainerInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureContainerInfoArgs Empty = new AzureContainerInfoArgs();

    /**
     * Container name (Based on the data format specified, this represents the name of Azure Files/Page blob/Block blob).
     * 
     */
    @InputImport(name="containerName", required=true)
      private final Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName;
    }

    /**
     * Storage format used for the file represented by the share.
     * 
     */
    @InputImport(name="dataFormat", required=true)
      private final Input<Either<String,AzureContainerDataFormat>> dataFormat;

    public Input<Either<String,AzureContainerDataFormat>> getDataFormat() {
        return this.dataFormat;
    }

    /**
     * ID of the storage account credential used to access storage.
     * 
     */
    @InputImport(name="storageAccountCredentialId", required=true)
      private final Input<String> storageAccountCredentialId;

    public Input<String> getStorageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    public AzureContainerInfoArgs(
        Input<String> containerName,
        Input<Either<String,AzureContainerDataFormat>> dataFormat,
        Input<String> storageAccountCredentialId) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.dataFormat = Objects.requireNonNull(dataFormat, "expected parameter 'dataFormat' to be non-null");
        this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId, "expected parameter 'storageAccountCredentialId' to be non-null");
    }

    private AzureContainerInfoArgs() {
        this.containerName = Input.empty();
        this.dataFormat = Input.empty();
        this.storageAccountCredentialId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureContainerInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> containerName;
        private Input<Either<String,AzureContainerDataFormat>> dataFormat;
        private Input<String> storageAccountCredentialId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureContainerInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.dataFormat = defaults.dataFormat;
    	      this.storageAccountCredentialId = defaults.storageAccountCredentialId;
        }

        public Builder setContainerName(Input<String> containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Input.of(Objects.requireNonNull(containerName));
            return this;
        }

        public Builder setDataFormat(Input<Either<String,AzureContainerDataFormat>> dataFormat) {
            this.dataFormat = Objects.requireNonNull(dataFormat);
            return this;
        }

        public Builder setDataFormat(Either<String,AzureContainerDataFormat> dataFormat) {
            this.dataFormat = Input.of(Objects.requireNonNull(dataFormat));
            return this;
        }

        public Builder setStorageAccountCredentialId(Input<String> storageAccountCredentialId) {
            this.storageAccountCredentialId = Objects.requireNonNull(storageAccountCredentialId);
            return this;
        }

        public Builder setStorageAccountCredentialId(String storageAccountCredentialId) {
            this.storageAccountCredentialId = Input.of(Objects.requireNonNull(storageAccountCredentialId));
            return this;
        }
        public AzureContainerInfoArgs build() {
            return new AzureContainerInfoArgs(containerName, dataFormat, storageAccountCredentialId);
        }
    }
}
