// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.inputs.AzureBlobFileSystemConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.AzureFileShareConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.CIFSMountConfigurationArgs;
import io.pulumi.azurenative.batch.inputs.NFSMountConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MountConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MountConfigurationArgs Empty = new MountConfigurationArgs();

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @InputImport(name="azureBlobFileSystemConfiguration")
      private final @Nullable Input<AzureBlobFileSystemConfigurationArgs> azureBlobFileSystemConfiguration;

    public Input<AzureBlobFileSystemConfigurationArgs> getAzureBlobFileSystemConfiguration() {
        return this.azureBlobFileSystemConfiguration == null ? Input.empty() : this.azureBlobFileSystemConfiguration;
    }

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @InputImport(name="azureFileShareConfiguration")
      private final @Nullable Input<AzureFileShareConfigurationArgs> azureFileShareConfiguration;

    public Input<AzureFileShareConfigurationArgs> getAzureFileShareConfiguration() {
        return this.azureFileShareConfiguration == null ? Input.empty() : this.azureFileShareConfiguration;
    }

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @InputImport(name="cifsMountConfiguration")
      private final @Nullable Input<CIFSMountConfigurationArgs> cifsMountConfiguration;

    public Input<CIFSMountConfigurationArgs> getCifsMountConfiguration() {
        return this.cifsMountConfiguration == null ? Input.empty() : this.cifsMountConfiguration;
    }

    /**
     * This property is mutually exclusive with all other properties.
     * 
     */
    @InputImport(name="nfsMountConfiguration")
      private final @Nullable Input<NFSMountConfigurationArgs> nfsMountConfiguration;

    public Input<NFSMountConfigurationArgs> getNfsMountConfiguration() {
        return this.nfsMountConfiguration == null ? Input.empty() : this.nfsMountConfiguration;
    }

    public MountConfigurationArgs(
        @Nullable Input<AzureBlobFileSystemConfigurationArgs> azureBlobFileSystemConfiguration,
        @Nullable Input<AzureFileShareConfigurationArgs> azureFileShareConfiguration,
        @Nullable Input<CIFSMountConfigurationArgs> cifsMountConfiguration,
        @Nullable Input<NFSMountConfigurationArgs> nfsMountConfiguration) {
        this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
        this.azureFileShareConfiguration = azureFileShareConfiguration;
        this.cifsMountConfiguration = cifsMountConfiguration;
        this.nfsMountConfiguration = nfsMountConfiguration;
    }

    private MountConfigurationArgs() {
        this.azureBlobFileSystemConfiguration = Input.empty();
        this.azureFileShareConfiguration = Input.empty();
        this.cifsMountConfiguration = Input.empty();
        this.nfsMountConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MountConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AzureBlobFileSystemConfigurationArgs> azureBlobFileSystemConfiguration;
        private @Nullable Input<AzureFileShareConfigurationArgs> azureFileShareConfiguration;
        private @Nullable Input<CIFSMountConfigurationArgs> cifsMountConfiguration;
        private @Nullable Input<NFSMountConfigurationArgs> nfsMountConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(MountConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureBlobFileSystemConfiguration = defaults.azureBlobFileSystemConfiguration;
    	      this.azureFileShareConfiguration = defaults.azureFileShareConfiguration;
    	      this.cifsMountConfiguration = defaults.cifsMountConfiguration;
    	      this.nfsMountConfiguration = defaults.nfsMountConfiguration;
        }

        public Builder setAzureBlobFileSystemConfiguration(@Nullable Input<AzureBlobFileSystemConfigurationArgs> azureBlobFileSystemConfiguration) {
            this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
            return this;
        }

        public Builder setAzureBlobFileSystemConfiguration(@Nullable AzureBlobFileSystemConfigurationArgs azureBlobFileSystemConfiguration) {
            this.azureBlobFileSystemConfiguration = Input.ofNullable(azureBlobFileSystemConfiguration);
            return this;
        }

        public Builder setAzureFileShareConfiguration(@Nullable Input<AzureFileShareConfigurationArgs> azureFileShareConfiguration) {
            this.azureFileShareConfiguration = azureFileShareConfiguration;
            return this;
        }

        public Builder setAzureFileShareConfiguration(@Nullable AzureFileShareConfigurationArgs azureFileShareConfiguration) {
            this.azureFileShareConfiguration = Input.ofNullable(azureFileShareConfiguration);
            return this;
        }

        public Builder setCifsMountConfiguration(@Nullable Input<CIFSMountConfigurationArgs> cifsMountConfiguration) {
            this.cifsMountConfiguration = cifsMountConfiguration;
            return this;
        }

        public Builder setCifsMountConfiguration(@Nullable CIFSMountConfigurationArgs cifsMountConfiguration) {
            this.cifsMountConfiguration = Input.ofNullable(cifsMountConfiguration);
            return this;
        }

        public Builder setNfsMountConfiguration(@Nullable Input<NFSMountConfigurationArgs> nfsMountConfiguration) {
            this.nfsMountConfiguration = nfsMountConfiguration;
            return this;
        }

        public Builder setNfsMountConfiguration(@Nullable NFSMountConfigurationArgs nfsMountConfiguration) {
            this.nfsMountConfiguration = Input.ofNullable(nfsMountConfiguration);
            return this;
        }
        public MountConfigurationArgs build() {
            return new MountConfigurationArgs(azureBlobFileSystemConfiguration, azureFileShareConfiguration, cifsMountConfiguration, nfsMountConfiguration);
        }
    }
}
