// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.composer_v1beta1.inputs.IPAllocationPolicyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration information for the Kubernetes Engine nodes running the Apache Airflow software.
 * 
 */
public final class NodeConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeConfigArgs Empty = new NodeConfigArgs();

    /**
     * Optional. The disk size in GB used for node VMs. Minimum size is 20GB. If unspecified, defaults to 100GB. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * Optional. Deploys 'ip-masq-agent' daemon set in the GKE cluster and defines nonMasqueradeCIDRs equals to pod IP range so IP masquerading is used for all destination addresses, except between pods traffic. See: https://cloud.google.com/kubernetes-engine/docs/how-to/ip-masquerade-agent
     * 
     */
    @InputImport(name="enableIpMasqAgent")
      private final @Nullable Output<Boolean> enableIpMasqAgent;

    public Output<Boolean> getEnableIpMasqAgent() {
        return this.enableIpMasqAgent == null ? Output.empty() : this.enableIpMasqAgent;
    }

    /**
     * Optional. The IPAllocationPolicy fields for the GKE cluster.
     * 
     */
    @InputImport(name="ipAllocationPolicy")
      private final @Nullable Output<IPAllocationPolicyArgs> ipAllocationPolicy;

    public Output<IPAllocationPolicyArgs> getIpAllocationPolicy() {
        return this.ipAllocationPolicy == null ? Output.empty() : this.ipAllocationPolicy;
    }

    /**
     * Optional. The Compute Engine [zone](/compute/docs/regions-zones) in which to deploy the VMs used to run the Apache Airflow software, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: "projects/{projectId}/zones/{zoneId}". This `location` must belong to the enclosing environment's project and location. If both this field and `nodeConfig.machineType` are specified, `nodeConfig.machineType` must belong to this `location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If only one field (`location` or `nodeConfig.machineType`) is specified, the location information from the specified field will be propagated to the unspecified field. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. The Compute Engine [machine type](/compute/docs/machine-types) used for cluster instances, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: "projects/{projectId}/zones/{zoneId}/machineTypes/{machineTypeId}". The `machineType` must belong to the enclosing environment's project and location. If both this field and `nodeConfig.location` are specified, this `machineType` must belong to the `nodeConfig.location`; if both are unspecified, the service will pick a zone in the Compute Engine region corresponding to the Cloud Composer location, and propagate that choice to both fields. If exactly one of this field and `nodeConfig.location` is specified, the location information from the specified field will be propagated to the unspecified field. The `machineTypeId` must not be a [shared-core machine type](/compute/docs/machine-types#sharedcore). If this field is unspecified, the `machineTypeId` defaults to "n1-standard-1". This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * Optional. The maximum number of pods per node in the Cloud Composer GKE cluster. The value must be between 8 and 110 and it can be set only if the environment is VPC-native. The default value is 32. Values of this field will be propagated both to the `default-pool` node pool of the newly created GKE cluster, and to the default "Maximum Pods per Node" value which is used for newly created node pools if their value is not explicitly set during node pool creation. For more information, see [Optimizing IP address allocation] (https://cloud.google.com/kubernetes-engine/docs/how-to/flexible-pod-cidr). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @InputImport(name="maxPodsPerNode")
      private final @Nullable Output<Integer> maxPodsPerNode;

    public Output<Integer> getMaxPodsPerNode() {
        return this.maxPodsPerNode == null ? Output.empty() : this.maxPodsPerNode;
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: "projects/{projectId}/global/networks/{networkId}". If unspecified, the default network in the environment's project is used. If a [Custom Subnet Network](/vpc/docs/vpc#vpc_networks_and_subnets) is provided, `nodeConfig.subnetwork` must also be provided. For [Shared VPC](/vpc/docs/shared-vpc) subnetwork requirements, see `nodeConfig.subnetwork`.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * Optional. The set of Google API scopes to be made available on all node VMs. If `oauth_scopes` is empty, defaults to ["https://www.googleapis.com/auth/cloud-platform"]. Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @InputImport(name="oauthScopes")
      private final @Nullable Output<List<String>> oauthScopes;

    public Output<List<String>> getOauthScopes() {
        return this.oauthScopes == null ? Output.empty() : this.oauthScopes;
    }

    /**
     * Optional. The Google Cloud Platform Service Account to be used by the workloads. If a service account is not specified, the "default" Compute Engine service account is used. Cannot be updated.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications, specified as a [relative resource name](/apis/design/resource_names#relative_resource_name). For example: "projects/{projectId}/regions/{regionId}/subnetworks/{subnetworkId}" If a subnetwork is provided, `nodeConfig.network` must also be provided, and the subnetwork must belong to the enclosing environment's project and location.
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Output<String> subnetwork;

    public Output<String> getSubnetwork() {
        return this.subnetwork == null ? Output.empty() : this.subnetwork;
    }

    /**
     * Optional. The list of instance tags applied to all node VMs. Tags are used to identify valid sources or targets for network firewalls. Each tag within the list must comply with [RFC1035](https://www.ietf.org/rfc/rfc1035.txt). Cannot be updated. This field is supported for Cloud Composer environments in versions composer-1.*.*-airflow-*.*.*.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public NodeConfigArgs(
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<Boolean> enableIpMasqAgent,
        @Nullable Output<IPAllocationPolicyArgs> ipAllocationPolicy,
        @Nullable Output<String> location,
        @Nullable Output<String> machineType,
        @Nullable Output<Integer> maxPodsPerNode,
        @Nullable Output<String> network,
        @Nullable Output<List<String>> oauthScopes,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<String> subnetwork,
        @Nullable Output<List<String>> tags) {
        this.diskSizeGb = diskSizeGb;
        this.enableIpMasqAgent = enableIpMasqAgent;
        this.ipAllocationPolicy = ipAllocationPolicy;
        this.location = location;
        this.machineType = machineType;
        this.maxPodsPerNode = maxPodsPerNode;
        this.network = network;
        this.oauthScopes = oauthScopes;
        this.serviceAccount = serviceAccount;
        this.subnetwork = subnetwork;
        this.tags = tags;
    }

    private NodeConfigArgs() {
        this.diskSizeGb = Output.empty();
        this.enableIpMasqAgent = Output.empty();
        this.ipAllocationPolicy = Output.empty();
        this.location = Output.empty();
        this.machineType = Output.empty();
        this.maxPodsPerNode = Output.empty();
        this.network = Output.empty();
        this.oauthScopes = Output.empty();
        this.serviceAccount = Output.empty();
        this.subnetwork = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<Boolean> enableIpMasqAgent;
        private @Nullable Output<IPAllocationPolicyArgs> ipAllocationPolicy;
        private @Nullable Output<String> location;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Integer> maxPodsPerNode;
        private @Nullable Output<String> network;
        private @Nullable Output<List<String>> oauthScopes;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<String> subnetwork;
        private @Nullable Output<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.enableIpMasqAgent = defaults.enableIpMasqAgent;
    	      this.ipAllocationPolicy = defaults.ipAllocationPolicy;
    	      this.location = defaults.location;
    	      this.machineType = defaults.machineType;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
    	      this.network = defaults.network;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tags = defaults.tags;
        }

        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Output.ofNullable(diskSizeGb);
            return this;
        }

        public Builder enableIpMasqAgent(@Nullable Output<Boolean> enableIpMasqAgent) {
            this.enableIpMasqAgent = enableIpMasqAgent;
            return this;
        }

        public Builder enableIpMasqAgent(@Nullable Boolean enableIpMasqAgent) {
            this.enableIpMasqAgent = Output.ofNullable(enableIpMasqAgent);
            return this;
        }

        public Builder ipAllocationPolicy(@Nullable Output<IPAllocationPolicyArgs> ipAllocationPolicy) {
            this.ipAllocationPolicy = ipAllocationPolicy;
            return this;
        }

        public Builder ipAllocationPolicy(@Nullable IPAllocationPolicyArgs ipAllocationPolicy) {
            this.ipAllocationPolicy = Output.ofNullable(ipAllocationPolicy);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
            return this;
        }

        public Builder maxPodsPerNode(@Nullable Output<Integer> maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            return this;
        }

        public Builder maxPodsPerNode(@Nullable Integer maxPodsPerNode) {
            this.maxPodsPerNode = Output.ofNullable(maxPodsPerNode);
            return this;
        }

        public Builder network(@Nullable Output<String> network) {
            this.network = network;
            return this;
        }

        public Builder network(@Nullable String network) {
            this.network = Output.ofNullable(network);
            return this;
        }

        public Builder oauthScopes(@Nullable Output<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        public Builder oauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Output.ofNullable(oauthScopes);
            return this;
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }

        public Builder subnetwork(@Nullable Output<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = Output.ofNullable(subnetwork);
            return this;
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public NodeConfigArgs build() {
            return new NodeConfigArgs(diskSizeGb, enableIpMasqAgent, ipAllocationPolicy, location, machineType, maxPodsPerNode, network, oauthScopes, serviceAccount, subnetwork, tags);
        }
    }
}
