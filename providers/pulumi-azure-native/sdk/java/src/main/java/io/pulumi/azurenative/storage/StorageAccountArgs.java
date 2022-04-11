// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.enums.AccessTier;
import io.pulumi.azurenative.storage.enums.Kind;
import io.pulumi.azurenative.storage.enums.LargeFileSharesState;
import io.pulumi.azurenative.storage.enums.MinimumTlsVersion;
import io.pulumi.azurenative.storage.inputs.AzureFilesIdentityBasedAuthenticationArgs;
import io.pulumi.azurenative.storage.inputs.CustomDomainArgs;
import io.pulumi.azurenative.storage.inputs.EncryptionArgs;
import io.pulumi.azurenative.storage.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.storage.inputs.IdentityArgs;
import io.pulumi.azurenative.storage.inputs.KeyPolicyArgs;
import io.pulumi.azurenative.storage.inputs.NetworkRuleSetArgs;
import io.pulumi.azurenative.storage.inputs.RoutingPreferenceArgs;
import io.pulumi.azurenative.storage.inputs.SasPolicyArgs;
import io.pulumi.azurenative.storage.inputs.SkuArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StorageAccountArgs extends io.pulumi.resources.ResourceArgs {

    public static final StorageAccountArgs Empty = new StorageAccountArgs();

    /**
     * Required for storage accounts where kind = BlobStorage. The access tier used for billing.
     * 
     */
    @Import(name="accessTier")
      private final @Nullable Output<AccessTier> accessTier;

    public Output<AccessTier> getAccessTier() {
        return this.accessTier == null ? Codegen.empty() : this.accessTier;
    }

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName")
      private final @Nullable Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName == null ? Codegen.empty() : this.accountName;
    }

    /**
     * Allow or disallow public access to all blobs or containers in the storage account. The default interpretation is true for this property.
     * 
     */
    @Import(name="allowBlobPublicAccess")
      private final @Nullable Output<Boolean> allowBlobPublicAccess;

    public Output<Boolean> getAllowBlobPublicAccess() {
        return this.allowBlobPublicAccess == null ? Codegen.empty() : this.allowBlobPublicAccess;
    }

    /**
     * Indicates whether the storage account permits requests to be authorized with the account access key via Shared Key. If false, then all requests, including shared access signatures, must be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     * 
     */
    @Import(name="allowSharedKeyAccess")
      private final @Nullable Output<Boolean> allowSharedKeyAccess;

    public Output<Boolean> getAllowSharedKeyAccess() {
        return this.allowSharedKeyAccess == null ? Codegen.empty() : this.allowSharedKeyAccess;
    }

    /**
     * Provides the identity based authentication settings for Azure Files.
     * 
     */
    @Import(name="azureFilesIdentityBasedAuthentication")
      private final @Nullable Output<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication;

    public Output<AzureFilesIdentityBasedAuthenticationArgs> getAzureFilesIdentityBasedAuthentication() {
        return this.azureFilesIdentityBasedAuthentication == null ? Codegen.empty() : this.azureFilesIdentityBasedAuthentication;
    }

    /**
     * User domain assigned to the storage account. Name is the CNAME source. Only one custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty string for the custom domain name property.
     * 
     */
    @Import(name="customDomain")
      private final @Nullable Output<CustomDomainArgs> customDomain;

    public Output<CustomDomainArgs> getCustomDomain() {
        return this.customDomain == null ? Codegen.empty() : this.customDomain;
    }

    /**
     * Allows https traffic only to storage service if sets to true. The default value is true since API version 2019-04-01.
     * 
     */
    @Import(name="enableHttpsTrafficOnly")
      private final @Nullable Output<Boolean> enableHttpsTrafficOnly;

    public Output<Boolean> getEnableHttpsTrafficOnly() {
        return this.enableHttpsTrafficOnly == null ? Codegen.empty() : this.enableHttpsTrafficOnly;
    }

    /**
     * NFS 3.0 protocol support enabled if set to true.
     * 
     */
    @Import(name="enableNfsV3")
      private final @Nullable Output<Boolean> enableNfsV3;

    public Output<Boolean> getEnableNfsV3() {
        return this.enableNfsV3 == null ? Codegen.empty() : this.enableNfsV3;
    }

    /**
     * Not applicable. Azure Storage encryption is enabled for all storage accounts and cannot be disabled.
     * 
     */
    @Import(name="encryption")
      private final @Nullable Output<EncryptionArgs> encryption;

    public Output<EncryptionArgs> getEncryption() {
        return this.encryption == null ? Codegen.empty() : this.encryption;
    }

    /**
     * Optional. Set the extended location of the resource. If not set, the storage account will be created in Azure main region. Otherwise it will be created in the specified extended location
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Codegen.empty() : this.extendedLocation;
    }

    /**
     * The identity of the resource.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<IdentityArgs> identity;

    public Output<IdentityArgs> getIdentity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Account HierarchicalNamespace enabled if sets to true.
     * 
     */
    @Import(name="isHnsEnabled")
      private final @Nullable Output<Boolean> isHnsEnabled;

    public Output<Boolean> getIsHnsEnabled() {
        return this.isHnsEnabled == null ? Codegen.empty() : this.isHnsEnabled;
    }

    /**
     * KeyPolicy assigned to the storage account.
     * 
     */
    @Import(name="keyPolicy")
      private final @Nullable Output<KeyPolicyArgs> keyPolicy;

    public Output<KeyPolicyArgs> getKeyPolicy() {
        return this.keyPolicy == null ? Codegen.empty() : this.keyPolicy;
    }

    /**
     * Required. Indicates the type of storage account.
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,Kind>> kind;

    public Output<Either<String,Kind>> getKind() {
        return this.kind;
    }

    /**
     * Allow large file shares if sets to Enabled. It cannot be disabled once it is enabled.
     * 
     */
    @Import(name="largeFileSharesState")
      private final @Nullable Output<Either<String,LargeFileSharesState>> largeFileSharesState;

    public Output<Either<String,LargeFileSharesState>> getLargeFileSharesState() {
        return this.largeFileSharesState == null ? Codegen.empty() : this.largeFileSharesState;
    }

    /**
     * Required. Gets or sets the location of the resource. This will be one of the supported and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource cannot be changed once it is created, but if an identical geo region is specified on update, the request will succeed.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Set the minimum TLS version to be permitted on requests to storage. The default interpretation is TLS 1.0 for this property.
     * 
     */
    @Import(name="minimumTlsVersion")
      private final @Nullable Output<Either<String,MinimumTlsVersion>> minimumTlsVersion;

    public Output<Either<String,MinimumTlsVersion>> getMinimumTlsVersion() {
        return this.minimumTlsVersion == null ? Codegen.empty() : this.minimumTlsVersion;
    }

    /**
     * Network rule set
     * 
     */
    @Import(name="networkRuleSet")
      private final @Nullable Output<NetworkRuleSetArgs> networkRuleSet;

    public Output<NetworkRuleSetArgs> getNetworkRuleSet() {
        return this.networkRuleSet == null ? Codegen.empty() : this.networkRuleSet;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Maintains information about the network routing choice opted by the user for data transfer
     * 
     */
    @Import(name="routingPreference")
      private final @Nullable Output<RoutingPreferenceArgs> routingPreference;

    public Output<RoutingPreferenceArgs> getRoutingPreference() {
        return this.routingPreference == null ? Codegen.empty() : this.routingPreference;
    }

    /**
     * SasPolicy assigned to the storage account.
     * 
     */
    @Import(name="sasPolicy")
      private final @Nullable Output<SasPolicyArgs> sasPolicy;

    public Output<SasPolicyArgs> getSasPolicy() {
        return this.sasPolicy == null ? Codegen.empty() : this.sasPolicy;
    }

    /**
     * Required. Gets or sets the SKU name.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<SkuArgs> sku;

    public Output<SkuArgs> getSku() {
        return this.sku;
    }

    /**
     * Gets or sets a list of key value pairs that describe the resource. These tags can be used for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no greater than 256 characters.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public StorageAccountArgs(
        @Nullable Output<AccessTier> accessTier,
        @Nullable Output<String> accountName,
        @Nullable Output<Boolean> allowBlobPublicAccess,
        @Nullable Output<Boolean> allowSharedKeyAccess,
        @Nullable Output<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication,
        @Nullable Output<CustomDomainArgs> customDomain,
        @Nullable Output<Boolean> enableHttpsTrafficOnly,
        @Nullable Output<Boolean> enableNfsV3,
        @Nullable Output<EncryptionArgs> encryption,
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<IdentityArgs> identity,
        @Nullable Output<Boolean> isHnsEnabled,
        @Nullable Output<KeyPolicyArgs> keyPolicy,
        Output<Either<String,Kind>> kind,
        @Nullable Output<Either<String,LargeFileSharesState>> largeFileSharesState,
        @Nullable Output<String> location,
        @Nullable Output<Either<String,MinimumTlsVersion>> minimumTlsVersion,
        @Nullable Output<NetworkRuleSetArgs> networkRuleSet,
        Output<String> resourceGroupName,
        @Nullable Output<RoutingPreferenceArgs> routingPreference,
        @Nullable Output<SasPolicyArgs> sasPolicy,
        Output<SkuArgs> sku,
        @Nullable Output<Map<String,String>> tags) {
        this.accessTier = accessTier;
        this.accountName = accountName;
        this.allowBlobPublicAccess = allowBlobPublicAccess;
        this.allowSharedKeyAccess = allowSharedKeyAccess;
        this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
        this.customDomain = customDomain;
        this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
        this.enableNfsV3 = enableNfsV3;
        this.encryption = encryption;
        this.extendedLocation = extendedLocation;
        this.identity = identity;
        this.isHnsEnabled = isHnsEnabled;
        this.keyPolicy = keyPolicy;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.largeFileSharesState = largeFileSharesState;
        this.location = location;
        this.minimumTlsVersion = minimumTlsVersion;
        this.networkRuleSet = networkRuleSet;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routingPreference = routingPreference;
        this.sasPolicy = sasPolicy;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private StorageAccountArgs() {
        this.accessTier = Codegen.empty();
        this.accountName = Codegen.empty();
        this.allowBlobPublicAccess = Codegen.empty();
        this.allowSharedKeyAccess = Codegen.empty();
        this.azureFilesIdentityBasedAuthentication = Codegen.empty();
        this.customDomain = Codegen.empty();
        this.enableHttpsTrafficOnly = Codegen.empty();
        this.enableNfsV3 = Codegen.empty();
        this.encryption = Codegen.empty();
        this.extendedLocation = Codegen.empty();
        this.identity = Codegen.empty();
        this.isHnsEnabled = Codegen.empty();
        this.keyPolicy = Codegen.empty();
        this.kind = Codegen.empty();
        this.largeFileSharesState = Codegen.empty();
        this.location = Codegen.empty();
        this.minimumTlsVersion = Codegen.empty();
        this.networkRuleSet = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.routingPreference = Codegen.empty();
        this.sasPolicy = Codegen.empty();
        this.sku = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StorageAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AccessTier> accessTier;
        private @Nullable Output<String> accountName;
        private @Nullable Output<Boolean> allowBlobPublicAccess;
        private @Nullable Output<Boolean> allowSharedKeyAccess;
        private @Nullable Output<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication;
        private @Nullable Output<CustomDomainArgs> customDomain;
        private @Nullable Output<Boolean> enableHttpsTrafficOnly;
        private @Nullable Output<Boolean> enableNfsV3;
        private @Nullable Output<EncryptionArgs> encryption;
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<IdentityArgs> identity;
        private @Nullable Output<Boolean> isHnsEnabled;
        private @Nullable Output<KeyPolicyArgs> keyPolicy;
        private Output<Either<String,Kind>> kind;
        private @Nullable Output<Either<String,LargeFileSharesState>> largeFileSharesState;
        private @Nullable Output<String> location;
        private @Nullable Output<Either<String,MinimumTlsVersion>> minimumTlsVersion;
        private @Nullable Output<NetworkRuleSetArgs> networkRuleSet;
        private Output<String> resourceGroupName;
        private @Nullable Output<RoutingPreferenceArgs> routingPreference;
        private @Nullable Output<SasPolicyArgs> sasPolicy;
        private Output<SkuArgs> sku;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StorageAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessTier = defaults.accessTier;
    	      this.accountName = defaults.accountName;
    	      this.allowBlobPublicAccess = defaults.allowBlobPublicAccess;
    	      this.allowSharedKeyAccess = defaults.allowSharedKeyAccess;
    	      this.azureFilesIdentityBasedAuthentication = defaults.azureFilesIdentityBasedAuthentication;
    	      this.customDomain = defaults.customDomain;
    	      this.enableHttpsTrafficOnly = defaults.enableHttpsTrafficOnly;
    	      this.enableNfsV3 = defaults.enableNfsV3;
    	      this.encryption = defaults.encryption;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.identity = defaults.identity;
    	      this.isHnsEnabled = defaults.isHnsEnabled;
    	      this.keyPolicy = defaults.keyPolicy;
    	      this.kind = defaults.kind;
    	      this.largeFileSharesState = defaults.largeFileSharesState;
    	      this.location = defaults.location;
    	      this.minimumTlsVersion = defaults.minimumTlsVersion;
    	      this.networkRuleSet = defaults.networkRuleSet;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routingPreference = defaults.routingPreference;
    	      this.sasPolicy = defaults.sasPolicy;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder accessTier(@Nullable Output<AccessTier> accessTier) {
            this.accessTier = accessTier;
            return this;
        }
        public Builder accessTier(@Nullable AccessTier accessTier) {
            this.accessTier = Codegen.ofNullable(accessTier);
            return this;
        }
        public Builder accountName(@Nullable Output<String> accountName) {
            this.accountName = accountName;
            return this;
        }
        public Builder accountName(@Nullable String accountName) {
            this.accountName = Codegen.ofNullable(accountName);
            return this;
        }
        public Builder allowBlobPublicAccess(@Nullable Output<Boolean> allowBlobPublicAccess) {
            this.allowBlobPublicAccess = allowBlobPublicAccess;
            return this;
        }
        public Builder allowBlobPublicAccess(@Nullable Boolean allowBlobPublicAccess) {
            this.allowBlobPublicAccess = Codegen.ofNullable(allowBlobPublicAccess);
            return this;
        }
        public Builder allowSharedKeyAccess(@Nullable Output<Boolean> allowSharedKeyAccess) {
            this.allowSharedKeyAccess = allowSharedKeyAccess;
            return this;
        }
        public Builder allowSharedKeyAccess(@Nullable Boolean allowSharedKeyAccess) {
            this.allowSharedKeyAccess = Codegen.ofNullable(allowSharedKeyAccess);
            return this;
        }
        public Builder azureFilesIdentityBasedAuthentication(@Nullable Output<AzureFilesIdentityBasedAuthenticationArgs> azureFilesIdentityBasedAuthentication) {
            this.azureFilesIdentityBasedAuthentication = azureFilesIdentityBasedAuthentication;
            return this;
        }
        public Builder azureFilesIdentityBasedAuthentication(@Nullable AzureFilesIdentityBasedAuthenticationArgs azureFilesIdentityBasedAuthentication) {
            this.azureFilesIdentityBasedAuthentication = Codegen.ofNullable(azureFilesIdentityBasedAuthentication);
            return this;
        }
        public Builder customDomain(@Nullable Output<CustomDomainArgs> customDomain) {
            this.customDomain = customDomain;
            return this;
        }
        public Builder customDomain(@Nullable CustomDomainArgs customDomain) {
            this.customDomain = Codegen.ofNullable(customDomain);
            return this;
        }
        public Builder enableHttpsTrafficOnly(@Nullable Output<Boolean> enableHttpsTrafficOnly) {
            this.enableHttpsTrafficOnly = enableHttpsTrafficOnly;
            return this;
        }
        public Builder enableHttpsTrafficOnly(@Nullable Boolean enableHttpsTrafficOnly) {
            this.enableHttpsTrafficOnly = Codegen.ofNullable(enableHttpsTrafficOnly);
            return this;
        }
        public Builder enableNfsV3(@Nullable Output<Boolean> enableNfsV3) {
            this.enableNfsV3 = enableNfsV3;
            return this;
        }
        public Builder enableNfsV3(@Nullable Boolean enableNfsV3) {
            this.enableNfsV3 = Codegen.ofNullable(enableNfsV3);
            return this;
        }
        public Builder encryption(@Nullable Output<EncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }
        public Builder encryption(@Nullable EncryptionArgs encryption) {
            this.encryption = Codegen.ofNullable(encryption);
            return this;
        }
        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Codegen.ofNullable(extendedLocation);
            return this;
        }
        public Builder identity(@Nullable Output<IdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable IdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder isHnsEnabled(@Nullable Output<Boolean> isHnsEnabled) {
            this.isHnsEnabled = isHnsEnabled;
            return this;
        }
        public Builder isHnsEnabled(@Nullable Boolean isHnsEnabled) {
            this.isHnsEnabled = Codegen.ofNullable(isHnsEnabled);
            return this;
        }
        public Builder keyPolicy(@Nullable Output<KeyPolicyArgs> keyPolicy) {
            this.keyPolicy = keyPolicy;
            return this;
        }
        public Builder keyPolicy(@Nullable KeyPolicyArgs keyPolicy) {
            this.keyPolicy = Codegen.ofNullable(keyPolicy);
            return this;
        }
        public Builder kind(Output<Either<String,Kind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,Kind> kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }
        public Builder largeFileSharesState(@Nullable Output<Either<String,LargeFileSharesState>> largeFileSharesState) {
            this.largeFileSharesState = largeFileSharesState;
            return this;
        }
        public Builder largeFileSharesState(@Nullable Either<String,LargeFileSharesState> largeFileSharesState) {
            this.largeFileSharesState = Codegen.ofNullable(largeFileSharesState);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder minimumTlsVersion(@Nullable Output<Either<String,MinimumTlsVersion>> minimumTlsVersion) {
            this.minimumTlsVersion = minimumTlsVersion;
            return this;
        }
        public Builder minimumTlsVersion(@Nullable Either<String,MinimumTlsVersion> minimumTlsVersion) {
            this.minimumTlsVersion = Codegen.ofNullable(minimumTlsVersion);
            return this;
        }
        public Builder networkRuleSet(@Nullable Output<NetworkRuleSetArgs> networkRuleSet) {
            this.networkRuleSet = networkRuleSet;
            return this;
        }
        public Builder networkRuleSet(@Nullable NetworkRuleSetArgs networkRuleSet) {
            this.networkRuleSet = Codegen.ofNullable(networkRuleSet);
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
        public Builder routingPreference(@Nullable Output<RoutingPreferenceArgs> routingPreference) {
            this.routingPreference = routingPreference;
            return this;
        }
        public Builder routingPreference(@Nullable RoutingPreferenceArgs routingPreference) {
            this.routingPreference = Codegen.ofNullable(routingPreference);
            return this;
        }
        public Builder sasPolicy(@Nullable Output<SasPolicyArgs> sasPolicy) {
            this.sasPolicy = sasPolicy;
            return this;
        }
        public Builder sasPolicy(@Nullable SasPolicyArgs sasPolicy) {
            this.sasPolicy = Codegen.ofNullable(sasPolicy);
            return this;
        }
        public Builder sku(Output<SkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(SkuArgs sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public StorageAccountArgs build() {
            return new StorageAccountArgs(accessTier, accountName, allowBlobPublicAccess, allowSharedKeyAccess, azureFilesIdentityBasedAuthentication, customDomain, enableHttpsTrafficOnly, enableNfsV3, encryption, extendedLocation, identity, isHnsEnabled, keyPolicy, kind, largeFileSharesState, location, minimumTlsVersion, networkRuleSet, resourceGroupName, routingPreference, sasPolicy, sku, tags);
        }
    }
}
