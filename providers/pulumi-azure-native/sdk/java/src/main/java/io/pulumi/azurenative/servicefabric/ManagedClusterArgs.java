// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric;

import io.pulumi.azurenative.servicefabric.inputs.AzureActiveDirectoryArgs;
import io.pulumi.azurenative.servicefabric.inputs.ClientCertificateArgs;
import io.pulumi.azurenative.servicefabric.inputs.LoadBalancingRuleArgs;
import io.pulumi.azurenative.servicefabric.inputs.SettingsSectionDescriptionArgs;
import io.pulumi.azurenative.servicefabric.inputs.SkuArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterArgs Empty = new ManagedClusterArgs();

    /**
     * client certificates for the cluster.
     * 
     */
    @InputImport(name="addonFeatures")
      private final @Nullable Input<List<String>> addonFeatures;

    public Input<List<String>> getAddonFeatures() {
        return this.addonFeatures == null ? Input.empty() : this.addonFeatures;
    }

    /**
     * vm admin user password.
     * 
     */
    @InputImport(name="adminPassword")
      private final @Nullable Input<String> adminPassword;

    public Input<String> getAdminPassword() {
        return this.adminPassword == null ? Input.empty() : this.adminPassword;
    }

    /**
     * vm admin user name.
     * 
     */
    @InputImport(name="adminUserName", required=true)
      private final Input<String> adminUserName;

    public Input<String> getAdminUserName() {
        return this.adminUserName;
    }

    /**
     * Azure active directory.
     * 
     */
    @InputImport(name="azureActiveDirectory")
      private final @Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory;

    public Input<AzureActiveDirectoryArgs> getAzureActiveDirectory() {
        return this.azureActiveDirectory == null ? Input.empty() : this.azureActiveDirectory;
    }

    /**
     * The port used for client connections to the cluster.
     * 
     */
    @InputImport(name="clientConnectionPort")
      private final @Nullable Input<Integer> clientConnectionPort;

    public Input<Integer> getClientConnectionPort() {
        return this.clientConnectionPort == null ? Input.empty() : this.clientConnectionPort;
    }

    /**
     * client certificates for the cluster.
     * 
     */
    @InputImport(name="clients")
      private final @Nullable Input<List<ClientCertificateArgs>> clients;

    public Input<List<ClientCertificateArgs>> getClients() {
        return this.clients == null ? Input.empty() : this.clients;
    }

    /**
     * The Service Fabric runtime version of the cluster. This property can only by set the user when **upgradeMode** is set to 'Manual'. To get list of available Service Fabric versions for new clusters use [ClusterVersion API](./ClusterVersion.md). To get the list of available version for existing clusters use **availableClusterVersions**.
     * 
     */
    @InputImport(name="clusterCodeVersion")
      private final @Nullable Input<String> clusterCodeVersion;

    public Input<String> getClusterCodeVersion() {
        return this.clusterCodeVersion == null ? Input.empty() : this.clusterCodeVersion;
    }

    /**
     * The name of the cluster resource.
     * 
     */
    @InputImport(name="clusterName")
      private final @Nullable Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName == null ? Input.empty() : this.clusterName;
    }

    /**
     * The cluster dns name.
     * 
     */
    @InputImport(name="dnsName", required=true)
      private final Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName;
    }

    /**
     * The list of custom fabric settings to configure the cluster.
     * 
     */
    @InputImport(name="fabricSettings")
      private final @Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings;

    public Input<List<SettingsSectionDescriptionArgs>> getFabricSettings() {
        return this.fabricSettings == null ? Input.empty() : this.fabricSettings;
    }

    /**
     * The port used for http connections to the cluster.
     * 
     */
    @InputImport(name="httpGatewayConnectionPort")
      private final @Nullable Input<Integer> httpGatewayConnectionPort;

    public Input<Integer> getHttpGatewayConnectionPort() {
        return this.httpGatewayConnectionPort == null ? Input.empty() : this.httpGatewayConnectionPort;
    }

    /**
     * Describes load balancing rules.
     * 
     */
    @InputImport(name="loadBalancingRules")
      private final @Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules;

    public Input<List<LoadBalancingRuleArgs>> getLoadBalancingRules() {
        return this.loadBalancingRules == null ? Input.empty() : this.loadBalancingRules;
    }

    /**
     * Azure resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The sku of the managed cluster
     * 
     */
    @InputImport(name="sku")
      private final @Nullable Input<SkuArgs> sku;

    public Input<SkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    /**
     * Azure resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ManagedClusterArgs(
        @Nullable Input<List<String>> addonFeatures,
        @Nullable Input<String> adminPassword,
        Input<String> adminUserName,
        @Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory,
        @Nullable Input<Integer> clientConnectionPort,
        @Nullable Input<List<ClientCertificateArgs>> clients,
        @Nullable Input<String> clusterCodeVersion,
        @Nullable Input<String> clusterName,
        Input<String> dnsName,
        @Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings,
        @Nullable Input<Integer> httpGatewayConnectionPort,
        @Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<SkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.addonFeatures = addonFeatures;
        this.adminPassword = adminPassword;
        this.adminUserName = Objects.requireNonNull(adminUserName, "expected parameter 'adminUserName' to be non-null");
        this.azureActiveDirectory = azureActiveDirectory;
        this.clientConnectionPort = clientConnectionPort == null ? Input.ofNullable(19000) : clientConnectionPort;
        this.clients = clients;
        this.clusterCodeVersion = clusterCodeVersion;
        this.clusterName = clusterName;
        this.dnsName = Objects.requireNonNull(dnsName, "expected parameter 'dnsName' to be non-null");
        this.fabricSettings = fabricSettings;
        this.httpGatewayConnectionPort = httpGatewayConnectionPort == null ? Input.ofNullable(19080) : httpGatewayConnectionPort;
        this.loadBalancingRules = loadBalancingRules;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
    }

    private ManagedClusterArgs() {
        this.addonFeatures = Input.empty();
        this.adminPassword = Input.empty();
        this.adminUserName = Input.empty();
        this.azureActiveDirectory = Input.empty();
        this.clientConnectionPort = Input.empty();
        this.clients = Input.empty();
        this.clusterCodeVersion = Input.empty();
        this.clusterName = Input.empty();
        this.dnsName = Input.empty();
        this.fabricSettings = Input.empty();
        this.httpGatewayConnectionPort = Input.empty();
        this.loadBalancingRules = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> addonFeatures;
        private @Nullable Input<String> adminPassword;
        private Input<String> adminUserName;
        private @Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory;
        private @Nullable Input<Integer> clientConnectionPort;
        private @Nullable Input<List<ClientCertificateArgs>> clients;
        private @Nullable Input<String> clusterCodeVersion;
        private @Nullable Input<String> clusterName;
        private Input<String> dnsName;
        private @Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings;
        private @Nullable Input<Integer> httpGatewayConnectionPort;
        private @Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<SkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addonFeatures = defaults.addonFeatures;
    	      this.adminPassword = defaults.adminPassword;
    	      this.adminUserName = defaults.adminUserName;
    	      this.azureActiveDirectory = defaults.azureActiveDirectory;
    	      this.clientConnectionPort = defaults.clientConnectionPort;
    	      this.clients = defaults.clients;
    	      this.clusterCodeVersion = defaults.clusterCodeVersion;
    	      this.clusterName = defaults.clusterName;
    	      this.dnsName = defaults.dnsName;
    	      this.fabricSettings = defaults.fabricSettings;
    	      this.httpGatewayConnectionPort = defaults.httpGatewayConnectionPort;
    	      this.loadBalancingRules = defaults.loadBalancingRules;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setAddonFeatures(@Nullable Input<List<String>> addonFeatures) {
            this.addonFeatures = addonFeatures;
            return this;
        }

        public Builder setAddonFeatures(@Nullable List<String> addonFeatures) {
            this.addonFeatures = Input.ofNullable(addonFeatures);
            return this;
        }

        public Builder setAdminPassword(@Nullable Input<String> adminPassword) {
            this.adminPassword = adminPassword;
            return this;
        }

        public Builder setAdminPassword(@Nullable String adminPassword) {
            this.adminPassword = Input.ofNullable(adminPassword);
            return this;
        }

        public Builder setAdminUserName(Input<String> adminUserName) {
            this.adminUserName = Objects.requireNonNull(adminUserName);
            return this;
        }

        public Builder setAdminUserName(String adminUserName) {
            this.adminUserName = Input.of(Objects.requireNonNull(adminUserName));
            return this;
        }

        public Builder setAzureActiveDirectory(@Nullable Input<AzureActiveDirectoryArgs> azureActiveDirectory) {
            this.azureActiveDirectory = azureActiveDirectory;
            return this;
        }

        public Builder setAzureActiveDirectory(@Nullable AzureActiveDirectoryArgs azureActiveDirectory) {
            this.azureActiveDirectory = Input.ofNullable(azureActiveDirectory);
            return this;
        }

        public Builder setClientConnectionPort(@Nullable Input<Integer> clientConnectionPort) {
            this.clientConnectionPort = clientConnectionPort;
            return this;
        }

        public Builder setClientConnectionPort(@Nullable Integer clientConnectionPort) {
            this.clientConnectionPort = Input.ofNullable(clientConnectionPort);
            return this;
        }

        public Builder setClients(@Nullable Input<List<ClientCertificateArgs>> clients) {
            this.clients = clients;
            return this;
        }

        public Builder setClients(@Nullable List<ClientCertificateArgs> clients) {
            this.clients = Input.ofNullable(clients);
            return this;
        }

        public Builder setClusterCodeVersion(@Nullable Input<String> clusterCodeVersion) {
            this.clusterCodeVersion = clusterCodeVersion;
            return this;
        }

        public Builder setClusterCodeVersion(@Nullable String clusterCodeVersion) {
            this.clusterCodeVersion = Input.ofNullable(clusterCodeVersion);
            return this;
        }

        public Builder setClusterName(@Nullable Input<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        public Builder setClusterName(@Nullable String clusterName) {
            this.clusterName = Input.ofNullable(clusterName);
            return this;
        }

        public Builder setDnsName(Input<String> dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }

        public Builder setDnsName(String dnsName) {
            this.dnsName = Input.of(Objects.requireNonNull(dnsName));
            return this;
        }

        public Builder setFabricSettings(@Nullable Input<List<SettingsSectionDescriptionArgs>> fabricSettings) {
            this.fabricSettings = fabricSettings;
            return this;
        }

        public Builder setFabricSettings(@Nullable List<SettingsSectionDescriptionArgs> fabricSettings) {
            this.fabricSettings = Input.ofNullable(fabricSettings);
            return this;
        }

        public Builder setHttpGatewayConnectionPort(@Nullable Input<Integer> httpGatewayConnectionPort) {
            this.httpGatewayConnectionPort = httpGatewayConnectionPort;
            return this;
        }

        public Builder setHttpGatewayConnectionPort(@Nullable Integer httpGatewayConnectionPort) {
            this.httpGatewayConnectionPort = Input.ofNullable(httpGatewayConnectionPort);
            return this;
        }

        public Builder setLoadBalancingRules(@Nullable Input<List<LoadBalancingRuleArgs>> loadBalancingRules) {
            this.loadBalancingRules = loadBalancingRules;
            return this;
        }

        public Builder setLoadBalancingRules(@Nullable List<LoadBalancingRuleArgs> loadBalancingRules) {
            this.loadBalancingRules = Input.ofNullable(loadBalancingRules);
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<SkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable SkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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
        public ManagedClusterArgs build() {
            return new ManagedClusterArgs(addonFeatures, adminPassword, adminUserName, azureActiveDirectory, clientConnectionPort, clients, clusterCodeVersion, clusterName, dnsName, fabricSettings, httpGatewayConnectionPort, loadBalancingRules, location, resourceGroupName, sku, tags);
        }
    }
}
