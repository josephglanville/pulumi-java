// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.CorsRulesArgs;
import io.pulumi.azurenative.storage.inputs.DeleteRetentionPolicyArgs;
import io.pulumi.azurenative.storage.inputs.ProtocolSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FileServicePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FileServicePropertiesArgs Empty = new FileServicePropertiesArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @InputImport(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * 
     */
    @InputImport(name="cors")
      private final @Nullable Output<CorsRulesArgs> cors;

    public Output<CorsRulesArgs> getCors() {
        return this.cors == null ? Output.empty() : this.cors;
    }

    /**
     * The name of the file Service within the specified storage account. File Service Name must be "default"
     * 
     */
    @InputImport(name="fileServicesName")
      private final @Nullable Output<String> fileServicesName;

    public Output<String> getFileServicesName() {
        return this.fileServicesName == null ? Output.empty() : this.fileServicesName;
    }

    /**
     * Protocol settings for file service
     * 
     */
    @InputImport(name="protocolSettings")
      private final @Nullable Output<ProtocolSettingsArgs> protocolSettings;

    public Output<ProtocolSettingsArgs> getProtocolSettings() {
        return this.protocolSettings == null ? Output.empty() : this.protocolSettings;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The file service properties for share soft delete.
     * 
     */
    @InputImport(name="shareDeleteRetentionPolicy")
      private final @Nullable Output<DeleteRetentionPolicyArgs> shareDeleteRetentionPolicy;

    public Output<DeleteRetentionPolicyArgs> getShareDeleteRetentionPolicy() {
        return this.shareDeleteRetentionPolicy == null ? Output.empty() : this.shareDeleteRetentionPolicy;
    }

    public FileServicePropertiesArgs(
        Output<String> accountName,
        @Nullable Output<CorsRulesArgs> cors,
        @Nullable Output<String> fileServicesName,
        @Nullable Output<ProtocolSettingsArgs> protocolSettings,
        Output<String> resourceGroupName,
        @Nullable Output<DeleteRetentionPolicyArgs> shareDeleteRetentionPolicy) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.cors = cors;
        this.fileServicesName = fileServicesName;
        this.protocolSettings = protocolSettings;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
    }

    private FileServicePropertiesArgs() {
        this.accountName = Output.empty();
        this.cors = Output.empty();
        this.fileServicesName = Output.empty();
        this.protocolSettings = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shareDeleteRetentionPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileServicePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<CorsRulesArgs> cors;
        private @Nullable Output<String> fileServicesName;
        private @Nullable Output<ProtocolSettingsArgs> protocolSettings;
        private Output<String> resourceGroupName;
        private @Nullable Output<DeleteRetentionPolicyArgs> shareDeleteRetentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(FileServicePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.cors = defaults.cors;
    	      this.fileServicesName = defaults.fileServicesName;
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareDeleteRetentionPolicy = defaults.shareDeleteRetentionPolicy;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder cors(@Nullable Output<CorsRulesArgs> cors) {
            this.cors = cors;
            return this;
        }

        public Builder cors(@Nullable CorsRulesArgs cors) {
            this.cors = Output.ofNullable(cors);
            return this;
        }

        public Builder fileServicesName(@Nullable Output<String> fileServicesName) {
            this.fileServicesName = fileServicesName;
            return this;
        }

        public Builder fileServicesName(@Nullable String fileServicesName) {
            this.fileServicesName = Output.ofNullable(fileServicesName);
            return this;
        }

        public Builder protocolSettings(@Nullable Output<ProtocolSettingsArgs> protocolSettings) {
            this.protocolSettings = protocolSettings;
            return this;
        }

        public Builder protocolSettings(@Nullable ProtocolSettingsArgs protocolSettings) {
            this.protocolSettings = Output.ofNullable(protocolSettings);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder shareDeleteRetentionPolicy(@Nullable Output<DeleteRetentionPolicyArgs> shareDeleteRetentionPolicy) {
            this.shareDeleteRetentionPolicy = shareDeleteRetentionPolicy;
            return this;
        }

        public Builder shareDeleteRetentionPolicy(@Nullable DeleteRetentionPolicyArgs shareDeleteRetentionPolicy) {
            this.shareDeleteRetentionPolicy = Output.ofNullable(shareDeleteRetentionPolicy);
            return this;
        }
        public FileServicePropertiesArgs build() {
            return new FileServicePropertiesArgs(accountName, cors, fileServicesName, protocolSettings, resourceGroupName, shareDeleteRetentionPolicy);
        }
    }
}
