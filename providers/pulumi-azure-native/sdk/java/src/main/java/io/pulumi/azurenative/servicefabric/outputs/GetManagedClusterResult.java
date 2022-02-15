// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.AzureActiveDirectoryResponse;
import io.pulumi.azurenative.servicefabric.outputs.ClientCertificateResponse;
import io.pulumi.azurenative.servicefabric.outputs.LoadBalancingRuleResponse;
import io.pulumi.azurenative.servicefabric.outputs.SettingsSectionDescriptionResponse;
import io.pulumi.azurenative.servicefabric.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetManagedClusterResult {
    private final @Nullable List<String> addonFeatures;
    private final @Nullable String adminPassword;
    private final String adminUserName;
    private final @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
    private final @Nullable Integer clientConnectionPort;
    private final @Nullable List<ClientCertificateResponse> clients;
    private final String clusterCertificateThumbprint;
    private final @Nullable String clusterCodeVersion;
    private final String clusterId;
    private final String clusterState;
    private final String dnsName;
    private final String etag;
    private final @Nullable List<SettingsSectionDescriptionResponse> fabricSettings;
    private final String fqdn;
    private final @Nullable Integer httpGatewayConnectionPort;
    private final String id;
    private final @Nullable List<LoadBalancingRuleResponse> loadBalancingRules;
    private final String location;
    private final String name;
    private final String provisioningState;
    private final @Nullable SkuResponse sku;
    private final @Nullable Map<String,String> tags;
    private final String type;

    @OutputCustomType.Constructor({"addonFeatures","adminPassword","adminUserName","azureActiveDirectory","clientConnectionPort","clients","clusterCertificateThumbprint","clusterCodeVersion","clusterId","clusterState","dnsName","etag","fabricSettings","fqdn","httpGatewayConnectionPort","id","loadBalancingRules","location","name","provisioningState","sku","tags","type"})
    private GetManagedClusterResult(
        @Nullable List<String> addonFeatures,
        @Nullable String adminPassword,
        String adminUserName,
        @Nullable AzureActiveDirectoryResponse azureActiveDirectory,
        @Nullable Integer clientConnectionPort,
        @Nullable List<ClientCertificateResponse> clients,
        String clusterCertificateThumbprint,
        @Nullable String clusterCodeVersion,
        String clusterId,
        String clusterState,
        String dnsName,
        String etag,
        @Nullable List<SettingsSectionDescriptionResponse> fabricSettings,
        String fqdn,
        @Nullable Integer httpGatewayConnectionPort,
        String id,
        @Nullable List<LoadBalancingRuleResponse> loadBalancingRules,
        String location,
        String name,
        String provisioningState,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.addonFeatures = addonFeatures;
        this.adminPassword = adminPassword;
        this.adminUserName = Objects.requireNonNull(adminUserName);
        this.azureActiveDirectory = azureActiveDirectory;
        this.clientConnectionPort = clientConnectionPort;
        this.clients = clients;
        this.clusterCertificateThumbprint = Objects.requireNonNull(clusterCertificateThumbprint);
        this.clusterCodeVersion = clusterCodeVersion;
        this.clusterId = Objects.requireNonNull(clusterId);
        this.clusterState = Objects.requireNonNull(clusterState);
        this.dnsName = Objects.requireNonNull(dnsName);
        this.etag = Objects.requireNonNull(etag);
        this.fabricSettings = fabricSettings;
        this.fqdn = Objects.requireNonNull(fqdn);
        this.httpGatewayConnectionPort = httpGatewayConnectionPort;
        this.id = Objects.requireNonNull(id);
        this.loadBalancingRules = loadBalancingRules;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    public List<String> getAddonFeatures() {
        return this.addonFeatures == null ? List.of() : this.addonFeatures;
    }
    public Optional<String> getAdminPassword() {
        return Optional.ofNullable(this.adminPassword);
    }
    public String getAdminUserName() {
        return this.adminUserName;
    }
    public Optional<AzureActiveDirectoryResponse> getAzureActiveDirectory() {
        return Optional.ofNullable(this.azureActiveDirectory);
    }
    public Optional<Integer> getClientConnectionPort() {
        return Optional.ofNullable(this.clientConnectionPort);
    }
    public List<ClientCertificateResponse> getClients() {
        return this.clients == null ? List.of() : this.clients;
    }
    public String getClusterCertificateThumbprint() {
        return this.clusterCertificateThumbprint;
    }
    public Optional<String> getClusterCodeVersion() {
        return Optional.ofNullable(this.clusterCodeVersion);
    }
    public String getClusterId() {
        return this.clusterId;
    }
    public String getClusterState() {
        return this.clusterState;
    }
    public String getDnsName() {
        return this.dnsName;
    }
    public String getEtag() {
        return this.etag;
    }
    public List<SettingsSectionDescriptionResponse> getFabricSettings() {
        return this.fabricSettings == null ? List.of() : this.fabricSettings;
    }
    public String getFqdn() {
        return this.fqdn;
    }
    public Optional<Integer> getHttpGatewayConnectionPort() {
        return Optional.ofNullable(this.httpGatewayConnectionPort);
    }
    public String getId() {
        return this.id;
    }
    public List<LoadBalancingRuleResponse> getLoadBalancingRules() {
        return this.loadBalancingRules == null ? List.of() : this.loadBalancingRules;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addonFeatures;
        private @Nullable String adminPassword;
        private String adminUserName;
        private @Nullable AzureActiveDirectoryResponse azureActiveDirectory;
        private @Nullable Integer clientConnectionPort;
        private @Nullable List<ClientCertificateResponse> clients;
        private String clusterCertificateThumbprint;
        private @Nullable String clusterCodeVersion;
        private String clusterId;
        private String clusterState;
        private String dnsName;
        private String etag;
        private @Nullable List<SettingsSectionDescriptionResponse> fabricSettings;
        private String fqdn;
        private @Nullable Integer httpGatewayConnectionPort;
        private String id;
        private @Nullable List<LoadBalancingRuleResponse> loadBalancingRules;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonFeatures = defaults.addonFeatures;
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUserName = defaults.adminUserName;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.clientConnectionPort = defaults.clientConnectionPort;
    	      this.clients = defaults.clients;
    	      this.clusterCertificateThumbprint = defaults.clusterCertificateThumbprint;
    	      this.clusterCodeVersion = defaults.clusterCodeVersion;
    	      this.clusterId = defaults.clusterId;
    	      this.clusterState = defaults.clusterState;
    	      this.dnsName = defaults.dnsName;
    	      this.etag = defaults.etag;
    	      this.fabricSettings = defaults.fabricSettings;
    	      this.fqdn = defaults.fqdn;
    	      this.httpGatewayConnectionPort = defaults.httpGatewayConnectionPort;
    	      this.id = defaults.id;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setAddonFeatures(@Nullable List<String> addonFeatures) {
            this.addonFeatures = addonFeatures;
            return this;
        }

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminUserName(String adminUserName) {
            this.adminUserName = Objects.requireNonNull(adminUserName);
            return this;
        }

        public Builder setAzureActiveDirectory(@Nullable AzureActiveDirectoryResponse azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        public Builder setClientConnectionPort(@Nullable Integer clientConnectionPort) {
            this.clientConnectionPort = clientConnectionPort;
            return this;
        }

        public Builder setClients(@Nullable List<ClientCertificateResponse> clients) {
            this.clients = clients;
            return this;
        }

        public Builder setClusterCertificateThumbprint(String clusterCertificateThumbprint) {
            this.clusterCertificateThumbprint = Objects.requireNonNull(clusterCertificateThumbprint);
            return this;
        }

        public Builder setClusterCodeVersion(@Nullable String clusterCodeVersion) {
            this.clusterCodeVersion = clusterCodeVersion;
            return this;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterState(String clusterState) {
            this.clusterState = Objects.requireNonNull(clusterState);
            return this;
        }

        public Builder setDnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setFabricSettings(@Nullable List<SettingsSectionDescriptionResponse> fabricSettings) {
            this.fabricSettings = fabricSettings;
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setHttpGatewayConnectionPort(@Nullable Integer httpGatewayConnectionPort) {
            this.httpGatewayConnectionPort = httpGatewayConnectionPort;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLoadBalancingRules(@Nullable List<LoadBalancingRuleResponse> loadBalancingRules) {
            this.loadBalancingRules = loadBalancingRules;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetManagedClusterResult build() {
            return new GetManagedClusterResult(addonFeatures, adminPassword, adminUserName, azureActiveDirectory, clientConnectionPort, clients, clusterCertificateThumbprint, clusterCodeVersion, clusterId, clusterState, dnsName, etag, fabricSettings, fqdn, httpGatewayConnectionPort, id, loadBalancingRules, location, name, provisioningState, sku, tags, type);
        }
    }
}