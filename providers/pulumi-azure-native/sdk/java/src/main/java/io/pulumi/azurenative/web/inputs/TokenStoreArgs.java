// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.BlobStorageTokenStoreArgs;
import io.pulumi.azurenative.web.inputs.FileSystemTokenStoreArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the token store.
 * 
 */
public final class TokenStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final TokenStoreArgs Empty = new TokenStoreArgs();

    /**
     * The configuration settings of the storage of the tokens if blob storage is used.
     * 
     */
    @Import(name="azureBlobStorage")
      private final @Nullable Output<BlobStorageTokenStoreArgs> azureBlobStorage;

    public Output<BlobStorageTokenStoreArgs> getAzureBlobStorage() {
        return this.azureBlobStorage == null ? Output.empty() : this.azureBlobStorage;
    }

    /**
     * <code>true</code> to durably store platform-specific security tokens that are obtained during login flows; otherwise, <code>false</code>.
     *  The default is <code>false</code>.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The configuration settings of the storage of the tokens if a file system is used.
     * 
     */
    @Import(name="fileSystem")
      private final @Nullable Output<FileSystemTokenStoreArgs> fileSystem;

    public Output<FileSystemTokenStoreArgs> getFileSystem() {
        return this.fileSystem == null ? Output.empty() : this.fileSystem;
    }

    /**
     * The number of hours after session token expiration that a session token can be used to
     * call the token refresh API. The default is 72 hours.
     * 
     */
    @Import(name="tokenRefreshExtensionHours")
      private final @Nullable Output<Double> tokenRefreshExtensionHours;

    public Output<Double> getTokenRefreshExtensionHours() {
        return this.tokenRefreshExtensionHours == null ? Output.empty() : this.tokenRefreshExtensionHours;
    }

    public TokenStoreArgs(
        @Nullable Output<BlobStorageTokenStoreArgs> azureBlobStorage,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<FileSystemTokenStoreArgs> fileSystem,
        @Nullable Output<Double> tokenRefreshExtensionHours) {
        this.azureBlobStorage = azureBlobStorage;
        this.enabled = enabled;
        this.fileSystem = fileSystem;
        this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
    }

    private TokenStoreArgs() {
        this.azureBlobStorage = Output.empty();
        this.enabled = Output.empty();
        this.fileSystem = Output.empty();
        this.tokenRefreshExtensionHours = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TokenStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BlobStorageTokenStoreArgs> azureBlobStorage;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<FileSystemTokenStoreArgs> fileSystem;
        private @Nullable Output<Double> tokenRefreshExtensionHours;

        public Builder() {
    	      // Empty
        }

        public Builder(TokenStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobStorage = defaults.azureBlobStorage;
    	      this.enabled = defaults.enabled;
    	      this.fileSystem = defaults.fileSystem;
    	      this.tokenRefreshExtensionHours = defaults.tokenRefreshExtensionHours;
        }

        public Builder azureBlobStorage(@Nullable Output<BlobStorageTokenStoreArgs> azureBlobStorage) {
            this.azureBlobStorage = azureBlobStorage;
            return this;
        }
        public Builder azureBlobStorage(@Nullable BlobStorageTokenStoreArgs azureBlobStorage) {
            this.azureBlobStorage = Output.ofNullable(azureBlobStorage);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder fileSystem(@Nullable Output<FileSystemTokenStoreArgs> fileSystem) {
            this.fileSystem = fileSystem;
            return this;
        }
        public Builder fileSystem(@Nullable FileSystemTokenStoreArgs fileSystem) {
            this.fileSystem = Output.ofNullable(fileSystem);
            return this;
        }
        public Builder tokenRefreshExtensionHours(@Nullable Output<Double> tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = tokenRefreshExtensionHours;
            return this;
        }
        public Builder tokenRefreshExtensionHours(@Nullable Double tokenRefreshExtensionHours) {
            this.tokenRefreshExtensionHours = Output.ofNullable(tokenRefreshExtensionHours);
            return this;
        }        public TokenStoreArgs build() {
            return new TokenStoreArgs(azureBlobStorage, enabled, fileSystem, tokenRefreshExtensionHours);
        }
    }
}
