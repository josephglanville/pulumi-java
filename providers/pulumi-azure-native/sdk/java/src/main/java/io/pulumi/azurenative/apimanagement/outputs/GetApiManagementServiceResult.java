// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.AdditionalLocationResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiManagementServiceIdentityResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiManagementServiceSkuPropertiesResponse;
import io.pulumi.azurenative.apimanagement.outputs.ApiVersionConstraintResponse;
import io.pulumi.azurenative.apimanagement.outputs.CertificateConfigurationResponse;
import io.pulumi.azurenative.apimanagement.outputs.HostnameConfigurationResponse;
import io.pulumi.azurenative.apimanagement.outputs.VirtualNetworkConfigurationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApiManagementServiceResult {
    private final @Nullable List<AdditionalLocationResponse> additionalLocations;
    private final @Nullable ApiVersionConstraintResponse apiVersionConstraint;
    private final @Nullable List<CertificateConfigurationResponse> certificates;
    private final String createdAtUtc;
    private final @Nullable Map<String,String> customProperties;
    private final String developerPortalUrl;
    private final @Nullable Boolean disableGateway;
    private final @Nullable Boolean enableClientCertificate;
    private final String etag;
    private final String gatewayRegionalUrl;
    private final String gatewayUrl;
    private final @Nullable List<HostnameConfigurationResponse> hostnameConfigurations;
    private final String id;
    private final @Nullable ApiManagementServiceIdentityResponse identity;
    private final String location;
    private final String managementApiUrl;
    private final String name;
    private final @Nullable String notificationSenderEmail;
    private final String portalUrl;
    private final List<String> privateIPAddresses;
    private final String provisioningState;
    private final List<String> publicIPAddresses;
    private final String publisherEmail;
    private final String publisherName;
    private final @Nullable Boolean restore;
    private final String scmUrl;
    private final ApiManagementServiceSkuPropertiesResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String targetProvisioningState;
    private final String type;
    private final @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
    private final @Nullable String virtualNetworkType;
    private final @Nullable List<String> zones;

    @OutputCustomType.Constructor({"additionalLocations","apiVersionConstraint","certificates","createdAtUtc","customProperties","developerPortalUrl","disableGateway","enableClientCertificate","etag","gatewayRegionalUrl","gatewayUrl","hostnameConfigurations","id","identity","location","managementApiUrl","name","notificationSenderEmail","portalUrl","privateIPAddresses","provisioningState","publicIPAddresses","publisherEmail","publisherName","restore","scmUrl","sku","tags","targetProvisioningState","type","virtualNetworkConfiguration","virtualNetworkType","zones"})
    private GetApiManagementServiceResult(
        @Nullable List<AdditionalLocationResponse> additionalLocations,
        @Nullable ApiVersionConstraintResponse apiVersionConstraint,
        @Nullable List<CertificateConfigurationResponse> certificates,
        String createdAtUtc,
        @Nullable Map<String,String> customProperties,
        String developerPortalUrl,
        @Nullable Boolean disableGateway,
        @Nullable Boolean enableClientCertificate,
        String etag,
        String gatewayRegionalUrl,
        String gatewayUrl,
        @Nullable List<HostnameConfigurationResponse> hostnameConfigurations,
        String id,
        @Nullable ApiManagementServiceIdentityResponse identity,
        String location,
        String managementApiUrl,
        String name,
        @Nullable String notificationSenderEmail,
        String portalUrl,
        List<String> privateIPAddresses,
        String provisioningState,
        List<String> publicIPAddresses,
        String publisherEmail,
        String publisherName,
        @Nullable Boolean restore,
        String scmUrl,
        ApiManagementServiceSkuPropertiesResponse sku,
        @Nullable Map<String,String> tags,
        String targetProvisioningState,
        String type,
        @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration,
        @Nullable String virtualNetworkType,
        @Nullable List<String> zones) {
        this.additionalLocations = additionalLocations;
        this.apiVersionConstraint = apiVersionConstraint;
        this.certificates = certificates;
        this.createdAtUtc = Objects.requireNonNull(createdAtUtc);
        this.customProperties = customProperties;
        this.developerPortalUrl = Objects.requireNonNull(developerPortalUrl);
        this.disableGateway = disableGateway;
        this.enableClientCertificate = enableClientCertificate;
        this.etag = Objects.requireNonNull(etag);
        this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl);
        this.gatewayUrl = Objects.requireNonNull(gatewayUrl);
        this.hostnameConfigurations = hostnameConfigurations;
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = Objects.requireNonNull(location);
        this.managementApiUrl = Objects.requireNonNull(managementApiUrl);
        this.name = Objects.requireNonNull(name);
        this.notificationSenderEmail = notificationSenderEmail;
        this.portalUrl = Objects.requireNonNull(portalUrl);
        this.privateIPAddresses = Objects.requireNonNull(privateIPAddresses);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
        this.publisherEmail = Objects.requireNonNull(publisherEmail);
        this.publisherName = Objects.requireNonNull(publisherName);
        this.restore = restore;
        this.scmUrl = Objects.requireNonNull(scmUrl);
        this.sku = Objects.requireNonNull(sku);
        this.tags = tags;
        this.targetProvisioningState = Objects.requireNonNull(targetProvisioningState);
        this.type = Objects.requireNonNull(type);
        this.virtualNetworkConfiguration = virtualNetworkConfiguration;
        this.virtualNetworkType = virtualNetworkType;
        this.zones = zones;
    }

    public List<AdditionalLocationResponse> getAdditionalLocations() {
        return this.additionalLocations == null ? List.of() : this.additionalLocations;
    }
    public Optional<ApiVersionConstraintResponse> getApiVersionConstraint() {
        return Optional.ofNullable(this.apiVersionConstraint);
    }
    public List<CertificateConfigurationResponse> getCertificates() {
        return this.certificates == null ? List.of() : this.certificates;
    }
    public String getCreatedAtUtc() {
        return this.createdAtUtc;
    }
    public Map<String,String> getCustomProperties() {
        return this.customProperties == null ? Map.of() : this.customProperties;
    }
    public String getDeveloperPortalUrl() {
        return this.developerPortalUrl;
    }
    public Optional<Boolean> getDisableGateway() {
        return Optional.ofNullable(this.disableGateway);
    }
    public Optional<Boolean> getEnableClientCertificate() {
        return Optional.ofNullable(this.enableClientCertificate);
    }
    public String getEtag() {
        return this.etag;
    }
    public String getGatewayRegionalUrl() {
        return this.gatewayRegionalUrl;
    }
    public String getGatewayUrl() {
        return this.gatewayUrl;
    }
    public List<HostnameConfigurationResponse> getHostnameConfigurations() {
        return this.hostnameConfigurations == null ? List.of() : this.hostnameConfigurations;
    }
    public String getId() {
        return this.id;
    }
    public Optional<ApiManagementServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    public String getLocation() {
        return this.location;
    }
    public String getManagementApiUrl() {
        return this.managementApiUrl;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNotificationSenderEmail() {
        return Optional.ofNullable(this.notificationSenderEmail);
    }
    public String getPortalUrl() {
        return this.portalUrl;
    }
    public List<String> getPrivateIPAddresses() {
        return this.privateIPAddresses;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<String> getPublicIPAddresses() {
        return this.publicIPAddresses;
    }
    public String getPublisherEmail() {
        return this.publisherEmail;
    }
    public String getPublisherName() {
        return this.publisherName;
    }
    public Optional<Boolean> getRestore() {
        return Optional.ofNullable(this.restore);
    }
    public String getScmUrl() {
        return this.scmUrl;
    }
    public ApiManagementServiceSkuPropertiesResponse getSku() {
        return this.sku;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getTargetProvisioningState() {
        return this.targetProvisioningState;
    }
    public String getType() {
        return this.type;
    }
    public Optional<VirtualNetworkConfigurationResponse> getVirtualNetworkConfiguration() {
        return Optional.ofNullable(this.virtualNetworkConfiguration);
    }
    public Optional<String> getVirtualNetworkType() {
        return Optional.ofNullable(this.virtualNetworkType);
    }
    public List<String> getZones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiManagementServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AdditionalLocationResponse> additionalLocations;
        private @Nullable ApiVersionConstraintResponse apiVersionConstraint;
        private @Nullable List<CertificateConfigurationResponse> certificates;
        private String createdAtUtc;
        private @Nullable Map<String,String> customProperties;
        private String developerPortalUrl;
        private @Nullable Boolean disableGateway;
        private @Nullable Boolean enableClientCertificate;
        private String etag;
        private String gatewayRegionalUrl;
        private String gatewayUrl;
        private @Nullable List<HostnameConfigurationResponse> hostnameConfigurations;
        private String id;
        private @Nullable ApiManagementServiceIdentityResponse identity;
        private String location;
        private String managementApiUrl;
        private String name;
        private @Nullable String notificationSenderEmail;
        private String portalUrl;
        private List<String> privateIPAddresses;
        private String provisioningState;
        private List<String> publicIPAddresses;
        private String publisherEmail;
        private String publisherName;
        private @Nullable Boolean restore;
        private String scmUrl;
        private ApiManagementServiceSkuPropertiesResponse sku;
        private @Nullable Map<String,String> tags;
        private String targetProvisioningState;
        private String type;
        private @Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration;
        private @Nullable String virtualNetworkType;
        private @Nullable List<String> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiManagementServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalLocations = defaults.additionalLocations;
    	      this.apiVersionConstraint = defaults.apiVersionConstraint;
    	      this.certificates = defaults.certificates;
    	      this.createdAtUtc = defaults.createdAtUtc;
    	      this.customProperties = defaults.customProperties;
    	      this.developerPortalUrl = defaults.developerPortalUrl;
    	      this.disableGateway = defaults.disableGateway;
    	      this.enableClientCertificate = defaults.enableClientCertificate;
    	      this.etag = defaults.etag;
    	      this.gatewayRegionalUrl = defaults.gatewayRegionalUrl;
    	      this.gatewayUrl = defaults.gatewayUrl;
    	      this.hostnameConfigurations = defaults.hostnameConfigurations;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.managementApiUrl = defaults.managementApiUrl;
    	      this.name = defaults.name;
    	      this.notificationSenderEmail = defaults.notificationSenderEmail;
    	      this.portalUrl = defaults.portalUrl;
    	      this.privateIPAddresses = defaults.privateIPAddresses;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicIPAddresses = defaults.publicIPAddresses;
    	      this.publisherEmail = defaults.publisherEmail;
    	      this.publisherName = defaults.publisherName;
    	      this.restore = defaults.restore;
    	      this.scmUrl = defaults.scmUrl;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.targetProvisioningState = defaults.targetProvisioningState;
    	      this.type = defaults.type;
    	      this.virtualNetworkConfiguration = defaults.virtualNetworkConfiguration;
    	      this.virtualNetworkType = defaults.virtualNetworkType;
    	      this.zones = defaults.zones;
        }

        public Builder setAdditionalLocations(@Nullable List<AdditionalLocationResponse> additionalLocations) {
            this.additionalLocations = additionalLocations;
            return this;
        }

        public Builder setApiVersionConstraint(@Nullable ApiVersionConstraintResponse apiVersionConstraint) {
            this.apiVersionConstraint = apiVersionConstraint;
            return this;
        }

        public Builder setCertificates(@Nullable List<CertificateConfigurationResponse> certificates) {
            this.certificates = certificates;
            return this;
        }

        public Builder setCreatedAtUtc(String createdAtUtc) {
            this.createdAtUtc = Objects.requireNonNull(createdAtUtc);
            return this;
        }

        public Builder setCustomProperties(@Nullable Map<String,String> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        public Builder setDeveloperPortalUrl(String developerPortalUrl) {
            this.developerPortalUrl = Objects.requireNonNull(developerPortalUrl);
            return this;
        }

        public Builder setDisableGateway(@Nullable Boolean disableGateway) {
            this.disableGateway = disableGateway;
            return this;
        }

        public Builder setEnableClientCertificate(@Nullable Boolean enableClientCertificate) {
            this.enableClientCertificate = enableClientCertificate;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setGatewayRegionalUrl(String gatewayRegionalUrl) {
            this.gatewayRegionalUrl = Objects.requireNonNull(gatewayRegionalUrl);
            return this;
        }

        public Builder setGatewayUrl(String gatewayUrl) {
            this.gatewayUrl = Objects.requireNonNull(gatewayUrl);
            return this;
        }

        public Builder setHostnameConfigurations(@Nullable List<HostnameConfigurationResponse> hostnameConfigurations) {
            this.hostnameConfigurations = hostnameConfigurations;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ApiManagementServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setManagementApiUrl(String managementApiUrl) {
            this.managementApiUrl = Objects.requireNonNull(managementApiUrl);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNotificationSenderEmail(@Nullable String notificationSenderEmail) {
            this.notificationSenderEmail = notificationSenderEmail;
            return this;
        }

        public Builder setPortalUrl(String portalUrl) {
            this.portalUrl = Objects.requireNonNull(portalUrl);
            return this;
        }

        public Builder setPrivateIPAddresses(List<String> privateIPAddresses) {
            this.privateIPAddresses = Objects.requireNonNull(privateIPAddresses);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicIPAddresses(List<String> publicIPAddresses) {
            this.publicIPAddresses = Objects.requireNonNull(publicIPAddresses);
            return this;
        }

        public Builder setPublisherEmail(String publisherEmail) {
            this.publisherEmail = Objects.requireNonNull(publisherEmail);
            return this;
        }

        public Builder setPublisherName(String publisherName) {
            this.publisherName = Objects.requireNonNull(publisherName);
            return this;
        }

        public Builder setRestore(@Nullable Boolean restore) {
            this.restore = restore;
            return this;
        }

        public Builder setScmUrl(String scmUrl) {
            this.scmUrl = Objects.requireNonNull(scmUrl);
            return this;
        }

        public Builder setSku(ApiManagementServiceSkuPropertiesResponse sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetProvisioningState(String targetProvisioningState) {
            this.targetProvisioningState = Objects.requireNonNull(targetProvisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVirtualNetworkConfiguration(@Nullable VirtualNetworkConfigurationResponse virtualNetworkConfiguration) {
            this.virtualNetworkConfiguration = virtualNetworkConfiguration;
            return this;
        }

        public Builder setVirtualNetworkType(@Nullable String virtualNetworkType) {
            this.virtualNetworkType = virtualNetworkType;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }

        public GetApiManagementServiceResult build() {
            return new GetApiManagementServiceResult(additionalLocations, apiVersionConstraint, certificates, createdAtUtc, customProperties, developerPortalUrl, disableGateway, enableClientCertificate, etag, gatewayRegionalUrl, gatewayUrl, hostnameConfigurations, id, identity, location, managementApiUrl, name, notificationSenderEmail, portalUrl, privateIPAddresses, provisioningState, publicIPAddresses, publisherEmail, publisherName, restore, scmUrl, sku, tags, targetProvisioningState, type, virtualNetworkConfiguration, virtualNetworkType, zones);
        }
    }
}
