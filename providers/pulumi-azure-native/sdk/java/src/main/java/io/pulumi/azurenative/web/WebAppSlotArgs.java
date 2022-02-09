// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.ClientCertMode;
import io.pulumi.azurenative.web.enums.RedundancyMode;
import io.pulumi.azurenative.web.inputs.CloningInfoArgs;
import io.pulumi.azurenative.web.inputs.HostNameSslStateArgs;
import io.pulumi.azurenative.web.inputs.HostingEnvironmentProfileArgs;
import io.pulumi.azurenative.web.inputs.ManagedServiceIdentityArgs;
import io.pulumi.azurenative.web.inputs.SiteConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSlotArgs Empty = new WebAppSlotArgs();

    @InputImport(name="clientAffinityEnabled")
    private final @Nullable Input<Boolean> clientAffinityEnabled;

    public Input<Boolean> getClientAffinityEnabled() {
        return this.clientAffinityEnabled == null ? Input.empty() : this.clientAffinityEnabled;
    }

    @InputImport(name="clientCertEnabled")
    private final @Nullable Input<Boolean> clientCertEnabled;

    public Input<Boolean> getClientCertEnabled() {
        return this.clientCertEnabled == null ? Input.empty() : this.clientCertEnabled;
    }

    @InputImport(name="clientCertExclusionPaths")
    private final @Nullable Input<String> clientCertExclusionPaths;

    public Input<String> getClientCertExclusionPaths() {
        return this.clientCertExclusionPaths == null ? Input.empty() : this.clientCertExclusionPaths;
    }

    @InputImport(name="clientCertMode")
    private final @Nullable Input<ClientCertMode> clientCertMode;

    public Input<ClientCertMode> getClientCertMode() {
        return this.clientCertMode == null ? Input.empty() : this.clientCertMode;
    }

    @InputImport(name="cloningInfo")
    private final @Nullable Input<CloningInfoArgs> cloningInfo;

    public Input<CloningInfoArgs> getCloningInfo() {
        return this.cloningInfo == null ? Input.empty() : this.cloningInfo;
    }

    @InputImport(name="containerSize")
    private final @Nullable Input<Integer> containerSize;

    public Input<Integer> getContainerSize() {
        return this.containerSize == null ? Input.empty() : this.containerSize;
    }

    @InputImport(name="customDomainVerificationId")
    private final @Nullable Input<String> customDomainVerificationId;

    public Input<String> getCustomDomainVerificationId() {
        return this.customDomainVerificationId == null ? Input.empty() : this.customDomainVerificationId;
    }

    @InputImport(name="dailyMemoryTimeQuota")
    private final @Nullable Input<Integer> dailyMemoryTimeQuota;

    public Input<Integer> getDailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota == null ? Input.empty() : this.dailyMemoryTimeQuota;
    }

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="hostNameSslStates")
    private final @Nullable Input<List<HostNameSslStateArgs>> hostNameSslStates;

    public Input<List<HostNameSslStateArgs>> getHostNameSslStates() {
        return this.hostNameSslStates == null ? Input.empty() : this.hostNameSslStates;
    }

    @InputImport(name="hostNamesDisabled")
    private final @Nullable Input<Boolean> hostNamesDisabled;

    public Input<Boolean> getHostNamesDisabled() {
        return this.hostNamesDisabled == null ? Input.empty() : this.hostNamesDisabled;
    }

    @InputImport(name="hostingEnvironmentProfile")
    private final @Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;

    public Input<HostingEnvironmentProfileArgs> getHostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile == null ? Input.empty() : this.hostingEnvironmentProfile;
    }

    @InputImport(name="httpsOnly")
    private final @Nullable Input<Boolean> httpsOnly;

    public Input<Boolean> getHttpsOnly() {
        return this.httpsOnly == null ? Input.empty() : this.httpsOnly;
    }

    @InputImport(name="hyperV")
    private final @Nullable Input<Boolean> hyperV;

    public Input<Boolean> getHyperV() {
        return this.hyperV == null ? Input.empty() : this.hyperV;
    }

    @InputImport(name="identity")
    private final @Nullable Input<ManagedServiceIdentityArgs> identity;

    public Input<ManagedServiceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="isXenon")
    private final @Nullable Input<Boolean> isXenon;

    public Input<Boolean> getIsXenon() {
        return this.isXenon == null ? Input.empty() : this.isXenon;
    }

    @InputImport(name="keyVaultReferenceIdentity")
    private final @Nullable Input<String> keyVaultReferenceIdentity;

    public Input<String> getKeyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity == null ? Input.empty() : this.keyVaultReferenceIdentity;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="redundancyMode")
    private final @Nullable Input<RedundancyMode> redundancyMode;

    public Input<RedundancyMode> getRedundancyMode() {
        return this.redundancyMode == null ? Input.empty() : this.redundancyMode;
    }

    @InputImport(name="reserved")
    private final @Nullable Input<Boolean> reserved;

    public Input<Boolean> getReserved() {
        return this.reserved == null ? Input.empty() : this.reserved;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="scmSiteAlsoStopped")
    private final @Nullable Input<Boolean> scmSiteAlsoStopped;

    public Input<Boolean> getScmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped == null ? Input.empty() : this.scmSiteAlsoStopped;
    }

    @InputImport(name="serverFarmId")
    private final @Nullable Input<String> serverFarmId;

    public Input<String> getServerFarmId() {
        return this.serverFarmId == null ? Input.empty() : this.serverFarmId;
    }

    @InputImport(name="siteConfig")
    private final @Nullable Input<SiteConfigArgs> siteConfig;

    public Input<SiteConfigArgs> getSiteConfig() {
        return this.siteConfig == null ? Input.empty() : this.siteConfig;
    }

    @InputImport(name="slot")
    private final @Nullable Input<String> slot;

    public Input<String> getSlot() {
        return this.slot == null ? Input.empty() : this.slot;
    }

    @InputImport(name="storageAccountRequired")
    private final @Nullable Input<Boolean> storageAccountRequired;

    public Input<Boolean> getStorageAccountRequired() {
        return this.storageAccountRequired == null ? Input.empty() : this.storageAccountRequired;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="virtualNetworkSubnetId")
    private final @Nullable Input<String> virtualNetworkSubnetId;

    public Input<String> getVirtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId == null ? Input.empty() : this.virtualNetworkSubnetId;
    }

    public WebAppSlotArgs(
        @Nullable Input<Boolean> clientAffinityEnabled,
        @Nullable Input<Boolean> clientCertEnabled,
        @Nullable Input<String> clientCertExclusionPaths,
        @Nullable Input<ClientCertMode> clientCertMode,
        @Nullable Input<CloningInfoArgs> cloningInfo,
        @Nullable Input<Integer> containerSize,
        @Nullable Input<String> customDomainVerificationId,
        @Nullable Input<Integer> dailyMemoryTimeQuota,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<List<HostNameSslStateArgs>> hostNameSslStates,
        @Nullable Input<Boolean> hostNamesDisabled,
        @Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile,
        @Nullable Input<Boolean> httpsOnly,
        @Nullable Input<Boolean> hyperV,
        @Nullable Input<ManagedServiceIdentityArgs> identity,
        @Nullable Input<Boolean> isXenon,
        @Nullable Input<String> keyVaultReferenceIdentity,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        Input<String> name,
        @Nullable Input<RedundancyMode> redundancyMode,
        @Nullable Input<Boolean> reserved,
        Input<String> resourceGroupName,
        @Nullable Input<Boolean> scmSiteAlsoStopped,
        @Nullable Input<String> serverFarmId,
        @Nullable Input<SiteConfigArgs> siteConfig,
        @Nullable Input<String> slot,
        @Nullable Input<Boolean> storageAccountRequired,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> virtualNetworkSubnetId) {
        this.clientAffinityEnabled = clientAffinityEnabled;
        this.clientCertEnabled = clientCertEnabled;
        this.clientCertExclusionPaths = clientCertExclusionPaths;
        this.clientCertMode = clientCertMode;
        this.cloningInfo = cloningInfo;
        this.containerSize = containerSize;
        this.customDomainVerificationId = customDomainVerificationId;
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        this.enabled = enabled;
        this.hostNameSslStates = hostNameSslStates;
        this.hostNamesDisabled = hostNamesDisabled;
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        this.httpsOnly = httpsOnly;
        this.hyperV = hyperV == null ? Input.ofNullable(false) : hyperV;
        this.identity = identity;
        this.isXenon = isXenon == null ? Input.ofNullable(false) : isXenon;
        this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
        this.kind = kind;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.redundancyMode = redundancyMode;
        this.reserved = reserved == null ? Input.ofNullable(false) : reserved;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scmSiteAlsoStopped = scmSiteAlsoStopped == null ? Input.ofNullable(false) : scmSiteAlsoStopped;
        this.serverFarmId = serverFarmId;
        this.siteConfig = siteConfig;
        this.slot = slot;
        this.storageAccountRequired = storageAccountRequired;
        this.tags = tags;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    private WebAppSlotArgs() {
        this.clientAffinityEnabled = Input.empty();
        this.clientCertEnabled = Input.empty();
        this.clientCertExclusionPaths = Input.empty();
        this.clientCertMode = Input.empty();
        this.cloningInfo = Input.empty();
        this.containerSize = Input.empty();
        this.customDomainVerificationId = Input.empty();
        this.dailyMemoryTimeQuota = Input.empty();
        this.enabled = Input.empty();
        this.hostNameSslStates = Input.empty();
        this.hostNamesDisabled = Input.empty();
        this.hostingEnvironmentProfile = Input.empty();
        this.httpsOnly = Input.empty();
        this.hyperV = Input.empty();
        this.identity = Input.empty();
        this.isXenon = Input.empty();
        this.keyVaultReferenceIdentity = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.redundancyMode = Input.empty();
        this.reserved = Input.empty();
        this.resourceGroupName = Input.empty();
        this.scmSiteAlsoStopped = Input.empty();
        this.serverFarmId = Input.empty();
        this.siteConfig = Input.empty();
        this.slot = Input.empty();
        this.storageAccountRequired = Input.empty();
        this.tags = Input.empty();
        this.virtualNetworkSubnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> clientAffinityEnabled;
        private @Nullable Input<Boolean> clientCertEnabled;
        private @Nullable Input<String> clientCertExclusionPaths;
        private @Nullable Input<ClientCertMode> clientCertMode;
        private @Nullable Input<CloningInfoArgs> cloningInfo;
        private @Nullable Input<Integer> containerSize;
        private @Nullable Input<String> customDomainVerificationId;
        private @Nullable Input<Integer> dailyMemoryTimeQuota;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<List<HostNameSslStateArgs>> hostNameSslStates;
        private @Nullable Input<Boolean> hostNamesDisabled;
        private @Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;
        private @Nullable Input<Boolean> httpsOnly;
        private @Nullable Input<Boolean> hyperV;
        private @Nullable Input<ManagedServiceIdentityArgs> identity;
        private @Nullable Input<Boolean> isXenon;
        private @Nullable Input<String> keyVaultReferenceIdentity;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private Input<String> name;
        private @Nullable Input<RedundancyMode> redundancyMode;
        private @Nullable Input<Boolean> reserved;
        private Input<String> resourceGroupName;
        private @Nullable Input<Boolean> scmSiteAlsoStopped;
        private @Nullable Input<String> serverFarmId;
        private @Nullable Input<SiteConfigArgs> siteConfig;
        private @Nullable Input<String> slot;
        private @Nullable Input<Boolean> storageAccountRequired;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAffinityEnabled = defaults.clientAffinityEnabled;
    	      this.clientCertEnabled = defaults.clientCertEnabled;
    	      this.clientCertExclusionPaths = defaults.clientCertExclusionPaths;
    	      this.clientCertMode = defaults.clientCertMode;
    	      this.cloningInfo = defaults.cloningInfo;
    	      this.containerSize = defaults.containerSize;
    	      this.customDomainVerificationId = defaults.customDomainVerificationId;
    	      this.dailyMemoryTimeQuota = defaults.dailyMemoryTimeQuota;
    	      this.enabled = defaults.enabled;
    	      this.hostNameSslStates = defaults.hostNameSslStates;
    	      this.hostNamesDisabled = defaults.hostNamesDisabled;
    	      this.hostingEnvironmentProfile = defaults.hostingEnvironmentProfile;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.hyperV = defaults.hyperV;
    	      this.identity = defaults.identity;
    	      this.isXenon = defaults.isXenon;
    	      this.keyVaultReferenceIdentity = defaults.keyVaultReferenceIdentity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.redundancyMode = defaults.redundancyMode;
    	      this.reserved = defaults.reserved;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scmSiteAlsoStopped = defaults.scmSiteAlsoStopped;
    	      this.serverFarmId = defaults.serverFarmId;
    	      this.siteConfig = defaults.siteConfig;
    	      this.slot = defaults.slot;
    	      this.storageAccountRequired = defaults.storageAccountRequired;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder setClientAffinityEnabled(@Nullable Input<Boolean> clientAffinityEnabled) {
            this.clientAffinityEnabled = clientAffinityEnabled;
            return this;
        }

        public Builder setClientAffinityEnabled(@Nullable Boolean clientAffinityEnabled) {
            this.clientAffinityEnabled = Input.ofNullable(clientAffinityEnabled);
            return this;
        }

        public Builder setClientCertEnabled(@Nullable Input<Boolean> clientCertEnabled) {
            this.clientCertEnabled = clientCertEnabled;
            return this;
        }

        public Builder setClientCertEnabled(@Nullable Boolean clientCertEnabled) {
            this.clientCertEnabled = Input.ofNullable(clientCertEnabled);
            return this;
        }

        public Builder setClientCertExclusionPaths(@Nullable Input<String> clientCertExclusionPaths) {
            this.clientCertExclusionPaths = clientCertExclusionPaths;
            return this;
        }

        public Builder setClientCertExclusionPaths(@Nullable String clientCertExclusionPaths) {
            this.clientCertExclusionPaths = Input.ofNullable(clientCertExclusionPaths);
            return this;
        }

        public Builder setClientCertMode(@Nullable Input<ClientCertMode> clientCertMode) {
            this.clientCertMode = clientCertMode;
            return this;
        }

        public Builder setClientCertMode(@Nullable ClientCertMode clientCertMode) {
            this.clientCertMode = Input.ofNullable(clientCertMode);
            return this;
        }

        public Builder setCloningInfo(@Nullable Input<CloningInfoArgs> cloningInfo) {
            this.cloningInfo = cloningInfo;
            return this;
        }

        public Builder setCloningInfo(@Nullable CloningInfoArgs cloningInfo) {
            this.cloningInfo = Input.ofNullable(cloningInfo);
            return this;
        }

        public Builder setContainerSize(@Nullable Input<Integer> containerSize) {
            this.containerSize = containerSize;
            return this;
        }

        public Builder setContainerSize(@Nullable Integer containerSize) {
            this.containerSize = Input.ofNullable(containerSize);
            return this;
        }

        public Builder setCustomDomainVerificationId(@Nullable Input<String> customDomainVerificationId) {
            this.customDomainVerificationId = customDomainVerificationId;
            return this;
        }

        public Builder setCustomDomainVerificationId(@Nullable String customDomainVerificationId) {
            this.customDomainVerificationId = Input.ofNullable(customDomainVerificationId);
            return this;
        }

        public Builder setDailyMemoryTimeQuota(@Nullable Input<Integer> dailyMemoryTimeQuota) {
            this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            return this;
        }

        public Builder setDailyMemoryTimeQuota(@Nullable Integer dailyMemoryTimeQuota) {
            this.dailyMemoryTimeQuota = Input.ofNullable(dailyMemoryTimeQuota);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setHostNameSslStates(@Nullable Input<List<HostNameSslStateArgs>> hostNameSslStates) {
            this.hostNameSslStates = hostNameSslStates;
            return this;
        }

        public Builder setHostNameSslStates(@Nullable List<HostNameSslStateArgs> hostNameSslStates) {
            this.hostNameSslStates = Input.ofNullable(hostNameSslStates);
            return this;
        }

        public Builder setHostNamesDisabled(@Nullable Input<Boolean> hostNamesDisabled) {
            this.hostNamesDisabled = hostNamesDisabled;
            return this;
        }

        public Builder setHostNamesDisabled(@Nullable Boolean hostNamesDisabled) {
            this.hostNamesDisabled = Input.ofNullable(hostNamesDisabled);
            return this;
        }

        public Builder setHostingEnvironmentProfile(@Nullable Input<HostingEnvironmentProfileArgs> hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = hostingEnvironmentProfile;
            return this;
        }

        public Builder setHostingEnvironmentProfile(@Nullable HostingEnvironmentProfileArgs hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = Input.ofNullable(hostingEnvironmentProfile);
            return this;
        }

        public Builder setHttpsOnly(@Nullable Input<Boolean> httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }

        public Builder setHttpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = Input.ofNullable(httpsOnly);
            return this;
        }

        public Builder setHyperV(@Nullable Input<Boolean> hyperV) {
            this.hyperV = hyperV;
            return this;
        }

        public Builder setHyperV(@Nullable Boolean hyperV) {
            this.hyperV = Input.ofNullable(hyperV);
            return this;
        }

        public Builder setIdentity(@Nullable Input<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setIsXenon(@Nullable Input<Boolean> isXenon) {
            this.isXenon = isXenon;
            return this;
        }

        public Builder setIsXenon(@Nullable Boolean isXenon) {
            this.isXenon = Input.ofNullable(isXenon);
            return this;
        }

        public Builder setKeyVaultReferenceIdentity(@Nullable Input<String> keyVaultReferenceIdentity) {
            this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
            return this;
        }

        public Builder setKeyVaultReferenceIdentity(@Nullable String keyVaultReferenceIdentity) {
            this.keyVaultReferenceIdentity = Input.ofNullable(keyVaultReferenceIdentity);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setRedundancyMode(@Nullable Input<RedundancyMode> redundancyMode) {
            this.redundancyMode = redundancyMode;
            return this;
        }

        public Builder setRedundancyMode(@Nullable RedundancyMode redundancyMode) {
            this.redundancyMode = Input.ofNullable(redundancyMode);
            return this;
        }

        public Builder setReserved(@Nullable Input<Boolean> reserved) {
            this.reserved = reserved;
            return this;
        }

        public Builder setReserved(@Nullable Boolean reserved) {
            this.reserved = Input.ofNullable(reserved);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setScmSiteAlsoStopped(@Nullable Input<Boolean> scmSiteAlsoStopped) {
            this.scmSiteAlsoStopped = scmSiteAlsoStopped;
            return this;
        }

        public Builder setScmSiteAlsoStopped(@Nullable Boolean scmSiteAlsoStopped) {
            this.scmSiteAlsoStopped = Input.ofNullable(scmSiteAlsoStopped);
            return this;
        }

        public Builder setServerFarmId(@Nullable Input<String> serverFarmId) {
            this.serverFarmId = serverFarmId;
            return this;
        }

        public Builder setServerFarmId(@Nullable String serverFarmId) {
            this.serverFarmId = Input.ofNullable(serverFarmId);
            return this;
        }

        public Builder setSiteConfig(@Nullable Input<SiteConfigArgs> siteConfig) {
            this.siteConfig = siteConfig;
            return this;
        }

        public Builder setSiteConfig(@Nullable SiteConfigArgs siteConfig) {
            this.siteConfig = Input.ofNullable(siteConfig);
            return this;
        }

        public Builder setSlot(@Nullable Input<String> slot) {
            this.slot = slot;
            return this;
        }

        public Builder setSlot(@Nullable String slot) {
            this.slot = Input.ofNullable(slot);
            return this;
        }

        public Builder setStorageAccountRequired(@Nullable Input<Boolean> storageAccountRequired) {
            this.storageAccountRequired = storageAccountRequired;
            return this;
        }

        public Builder setStorageAccountRequired(@Nullable Boolean storageAccountRequired) {
            this.storageAccountRequired = Input.ofNullable(storageAccountRequired);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVirtualNetworkSubnetId(@Nullable Input<String> virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }

        public Builder setVirtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Input.ofNullable(virtualNetworkSubnetId);
            return this;
        }

        public WebAppSlotArgs build() {
            return new WebAppSlotArgs(clientAffinityEnabled, clientCertEnabled, clientCertExclusionPaths, clientCertMode, cloningInfo, containerSize, customDomainVerificationId, dailyMemoryTimeQuota, enabled, hostNameSslStates, hostNamesDisabled, hostingEnvironmentProfile, httpsOnly, hyperV, identity, isXenon, keyVaultReferenceIdentity, kind, location, name, redundancyMode, reserved, resourceGroupName, scmSiteAlsoStopped, serverFarmId, siteConfig, slot, storageAccountRequired, tags, virtualNetworkSubnetId);
        }
    }
}
