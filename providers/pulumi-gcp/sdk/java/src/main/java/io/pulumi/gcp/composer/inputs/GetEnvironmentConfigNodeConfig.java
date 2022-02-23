// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.composer.inputs.GetEnvironmentConfigNodeConfigIpAllocationPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEnvironmentConfigNodeConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigNodeConfig Empty = new GetEnvironmentConfigNodeConfig();

    @InputImport(name="diskSizeGb", required=true)
      private final Integer diskSizeGb;

    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }

    @InputImport(name="enableIpMasqAgent", required=true)
      private final Boolean enableIpMasqAgent;

    public Boolean getEnableIpMasqAgent() {
        return this.enableIpMasqAgent;
    }

    @InputImport(name="ipAllocationPolicies", required=true)
      private final List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies;

    public List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> getIpAllocationPolicies() {
        return this.ipAllocationPolicies;
    }

    @InputImport(name="machineType", required=true)
      private final String machineType;

    public String getMachineType() {
        return this.machineType;
    }

    @InputImport(name="maxPodsPerNode", required=true)
      private final Integer maxPodsPerNode;

    public Integer getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    @InputImport(name="network", required=true)
      private final String network;

    public String getNetwork() {
        return this.network;
    }

    @InputImport(name="oauthScopes", required=true)
      private final List<String> oauthScopes;

    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }

    @InputImport(name="serviceAccount", required=true)
      private final String serviceAccount;

    public String getServiceAccount() {
        return this.serviceAccount;
    }

    @InputImport(name="subnetwork", required=true)
      private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    @InputImport(name="tags", required=true)
      private final List<String> tags;

    public List<String> getTags() {
        return this.tags;
    }

    @InputImport(name="zone", required=true)
      private final String zone;

    public String getZone() {
        return this.zone;
    }

    public GetEnvironmentConfigNodeConfig(
        Integer diskSizeGb,
        Boolean enableIpMasqAgent,
        List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies,
        String machineType,
        Integer maxPodsPerNode,
        String network,
        List<String> oauthScopes,
        String serviceAccount,
        String subnetwork,
        List<String> tags,
        String zone) {
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent, "expected parameter 'enableIpMasqAgent' to be non-null");
        this.ipAllocationPolicies = Objects.requireNonNull(ipAllocationPolicies, "expected parameter 'ipAllocationPolicies' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode, "expected parameter 'maxPodsPerNode' to be non-null");
        this.network = Objects.requireNonNull(network, "expected parameter 'network' to be non-null");
        this.oauthScopes = Objects.requireNonNull(oauthScopes, "expected parameter 'oauthScopes' to be non-null");
        this.serviceAccount = Objects.requireNonNull(serviceAccount, "expected parameter 'serviceAccount' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
        this.tags = Objects.requireNonNull(tags, "expected parameter 'tags' to be non-null");
        this.zone = Objects.requireNonNull(zone, "expected parameter 'zone' to be non-null");
    }

    private GetEnvironmentConfigNodeConfig() {
        this.diskSizeGb = null;
        this.enableIpMasqAgent = null;
        this.ipAllocationPolicies = List.of();
        this.machineType = null;
        this.maxPodsPerNode = null;
        this.network = null;
        this.oauthScopes = List.of();
        this.serviceAccount = null;
        this.subnetwork = null;
        this.tags = List.of();
        this.zone = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigNodeConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer diskSizeGb;
        private Boolean enableIpMasqAgent;
        private List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies;
        private String machineType;
        private Integer maxPodsPerNode;
        private String network;
        private List<String> oauthScopes;
        private String serviceAccount;
        private String subnetwork;
        private List<String> tags;
        private String zone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.enableIpMasqAgent = defaults.enableIpMasqAgent;
    	      this.ipAllocationPolicies = defaults.ipAllocationPolicies;
    	      this.machineType = defaults.machineType;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.network = defaults.network;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder setDiskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }

        public Builder setEnableIpMasqAgent(Boolean enableIpMasqAgent) {
            this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent);
            return this;
        }

        public Builder setIpAllocationPolicies(List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies) {
            this.ipAllocationPolicies = Objects.requireNonNull(ipAllocationPolicies);
            return this;
        }

        public Builder setMachineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }

        public Builder setMaxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setOauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }

        public Builder setServiceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setTags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setZone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }
        public GetEnvironmentConfigNodeConfig build() {
            return new GetEnvironmentConfigNodeConfig(diskSizeGb, enableIpMasqAgent, ipAllocationPolicies, machineType, maxPodsPerNode, network, oauthScopes, serviceAccount, subnetwork, tags, zone);
        }
    }
}
