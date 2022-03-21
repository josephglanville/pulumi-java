// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.composer.outputs.GetEnvironmentConfigNodeConfigIpAllocationPolicy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigNodeConfig {
    private final Integer diskSizeGb;
    private final Boolean enableIpMasqAgent;
    private final List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies;
    private final String machineType;
    private final Integer maxPodsPerNode;
    private final String network;
    private final List<String> oauthScopes;
    private final String serviceAccount;
    private final String subnetwork;
    private final List<String> tags;
    private final String zone;

    @CustomType.Constructor
    private GetEnvironmentConfigNodeConfig(
        @CustomType.Parameter("diskSizeGb") Integer diskSizeGb,
        @CustomType.Parameter("enableIpMasqAgent") Boolean enableIpMasqAgent,
        @CustomType.Parameter("ipAllocationPolicies") List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies,
        @CustomType.Parameter("machineType") String machineType,
        @CustomType.Parameter("maxPodsPerNode") Integer maxPodsPerNode,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("oauthScopes") List<String> oauthScopes,
        @CustomType.Parameter("serviceAccount") String serviceAccount,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("tags") List<String> tags,
        @CustomType.Parameter("zone") String zone) {
        this.diskSizeGb = diskSizeGb;
        this.enableIpMasqAgent = enableIpMasqAgent;
        this.ipAllocationPolicies = ipAllocationPolicies;
        this.machineType = machineType;
        this.maxPodsPerNode = maxPodsPerNode;
        this.network = network;
        this.oauthScopes = oauthScopes;
        this.serviceAccount = serviceAccount;
        this.subnetwork = subnetwork;
        this.tags = tags;
        this.zone = zone;
    }

    public Integer getDiskSizeGb() {
        return this.diskSizeGb;
    }
    public Boolean getEnableIpMasqAgent() {
        return this.enableIpMasqAgent;
    }
    public List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> getIpAllocationPolicies() {
        return this.ipAllocationPolicies;
    }
    public String getMachineType() {
        return this.machineType;
    }
    public Integer getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }
    public String getNetwork() {
        return this.network;
    }
    public List<String> getOauthScopes() {
        return this.oauthScopes;
    }
    public String getServiceAccount() {
        return this.serviceAccount;
    }
    public String getSubnetwork() {
        return this.subnetwork;
    }
    public List<String> getTags() {
        return this.tags;
    }
    public String getZone() {
        return this.zone;
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

        public Builder diskSizeGb(Integer diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder enableIpMasqAgent(Boolean enableIpMasqAgent) {
            this.enableIpMasqAgent = Objects.requireNonNull(enableIpMasqAgent);
            return this;
        }
        public Builder ipAllocationPolicies(List<GetEnvironmentConfigNodeConfigIpAllocationPolicy> ipAllocationPolicies) {
            this.ipAllocationPolicies = Objects.requireNonNull(ipAllocationPolicies);
            return this;
        }
        public Builder ipAllocationPolicies(GetEnvironmentConfigNodeConfigIpAllocationPolicy... ipAllocationPolicies) {
            return ipAllocationPolicies(List.of(ipAllocationPolicies));
        }
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder maxPodsPerNode(Integer maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder oauthScopes(List<String> oauthScopes) {
            this.oauthScopes = Objects.requireNonNull(oauthScopes);
            return this;
        }
        public Builder oauthScopes(String... oauthScopes) {
            return oauthScopes(List.of(oauthScopes));
        }
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder zone(String zone) {
            this.zone = Objects.requireNonNull(zone);
            return this;
        }        public GetEnvironmentConfigNodeConfig build() {
            return new GetEnvironmentConfigNodeConfig(diskSizeGb, enableIpMasqAgent, ipAllocationPolicies, machineType, maxPodsPerNode, network, oauthScopes, serviceAccount, subnetwork, tags, zone);
        }
    }
}
