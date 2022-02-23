// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.AzureBlobStorageHttpLogsConfigResponse;
import io.pulumi.azurenative.web.inputs.FileSystemHttpLogsConfigResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Http logs configuration.
 * 
 */
public final class HttpLogsConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpLogsConfigResponse Empty = new HttpLogsConfigResponse();

    /**
     * Http logs to azure blob storage configuration.
     * 
     */
    @InputImport(name="azureBlobStorage")
      private final @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage;

    public Optional<AzureBlobStorageHttpLogsConfigResponse> getAzureBlobStorage() {
        return this.azureBlobStorage == null ? Optional.empty() : Optional.ofNullable(this.azureBlobStorage);
    }

    /**
     * Http logs to file system configuration.
     * 
     */
    @InputImport(name="fileSystem")
      private final @Nullable FileSystemHttpLogsConfigResponse fileSystem;

    public Optional<FileSystemHttpLogsConfigResponse> getFileSystem() {
        return this.fileSystem == null ? Optional.empty() : Optional.ofNullable(this.fileSystem);
    }

    public HttpLogsConfigResponse(
        @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage,
        @Nullable FileSystemHttpLogsConfigResponse fileSystem) {
        this.azureBlobStorage = azureBlobStorage;
        this.fileSystem = fileSystem;
    }

    private HttpLogsConfigResponse() {
        this.azureBlobStorage = null;
        this.fileSystem = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpLogsConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage;
        private @Nullable FileSystemHttpLogsConfigResponse fileSystem;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpLogsConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.fileSystem = defaults.fileSystem;
        }

        public Builder setAzureBlobStorage(@Nullable AzureBlobStorageHttpLogsConfigResponse azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }

        public Builder setFileSystem(@Nullable FileSystemHttpLogsConfigResponse fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public HttpLogsConfigResponse build() {
            return new HttpLogsConfigResponse(azureBlobStorage, fileSystem);
        }
    }
}
