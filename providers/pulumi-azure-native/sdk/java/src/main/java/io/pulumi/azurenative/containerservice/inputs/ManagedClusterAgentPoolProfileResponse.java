// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.AgentPoolUpgradeSettingsResponse;
import io.pulumi.azurenative.containerservice.inputs.KubeletConfigResponse;
import io.pulumi.azurenative.containerservice.inputs.LinuxOSConfigResponse;
import io.pulumi.azurenative.containerservice.inputs.PowerStateResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Profile for the container service agent pool.
 * 
 */
public final class ManagedClusterAgentPoolProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterAgentPoolProfileResponse Empty = new ManagedClusterAgentPoolProfileResponse();

    /**
     * Availability zones for nodes. Must use VirtualMachineScaleSets AgentPoolType.
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable List<String> availabilityZones;

    public List<String> getAvailabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }

    /**
     * Number of agents (VMs) to host docker containers. Allowed values must be in the range of 0 to 100 (inclusive) for user pools and in the range of 1 to 100 (inclusive) for system pools. The default value is 1.
     * 
     */
    @Import(name="count")
      private final @Nullable Integer count;

    public Optional<Integer> getCount() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    /**
     * Whether to enable auto-scaler
     * 
     */
    @Import(name="enableAutoScaling")
      private final @Nullable Boolean enableAutoScaling;

    public Optional<Boolean> getEnableAutoScaling() {
        return this.enableAutoScaling == null ? Optional.empty() : Optional.ofNullable(this.enableAutoScaling);
    }

    /**
     * Whether to enable EncryptionAtHost
     * 
     */
    @Import(name="enableEncryptionAtHost")
      private final @Nullable Boolean enableEncryptionAtHost;

    public Optional<Boolean> getEnableEncryptionAtHost() {
        return this.enableEncryptionAtHost == null ? Optional.empty() : Optional.ofNullable(this.enableEncryptionAtHost);
    }

    /**
     * Whether to use FIPS enabled OS
     * 
     */
    @Import(name="enableFIPS")
      private final @Nullable Boolean enableFIPS;

    public Optional<Boolean> getEnableFIPS() {
        return this.enableFIPS == null ? Optional.empty() : Optional.ofNullable(this.enableFIPS);
    }

    /**
     * Enable public IP for nodes
     * 
     */
    @Import(name="enableNodePublicIP")
      private final @Nullable Boolean enableNodePublicIP;

    public Optional<Boolean> getEnableNodePublicIP() {
        return this.enableNodePublicIP == null ? Optional.empty() : Optional.ofNullable(this.enableNodePublicIP);
    }

    /**
     * GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. Supported values are MIG1g, MIG2g, MIG3g, MIG4g and MIG7g.
     * 
     */
    @Import(name="gpuInstanceProfile")
      private final @Nullable String gpuInstanceProfile;

    public Optional<String> getGpuInstanceProfile() {
        return this.gpuInstanceProfile == null ? Optional.empty() : Optional.ofNullable(this.gpuInstanceProfile);
    }

    /**
     * KubeletConfig specifies the configuration of kubelet on agent nodes.
     * 
     */
    @Import(name="kubeletConfig")
      private final @Nullable KubeletConfigResponse kubeletConfig;

    public Optional<KubeletConfigResponse> getKubeletConfig() {
        return this.kubeletConfig == null ? Optional.empty() : Optional.ofNullable(this.kubeletConfig);
    }

    /**
     * KubeletDiskType determines the placement of emptyDir volumes, container runtime data root, and Kubelet ephemeral storage. Currently allows one value, OS, resulting in Kubelet using the OS disk for data.
     * 
     */
    @Import(name="kubeletDiskType")
      private final @Nullable String kubeletDiskType;

    public Optional<String> getKubeletDiskType() {
        return this.kubeletDiskType == null ? Optional.empty() : Optional.ofNullable(this.kubeletDiskType);
    }

    /**
     * LinuxOSConfig specifies the OS configuration of linux agent nodes.
     * 
     */
    @Import(name="linuxOSConfig")
      private final @Nullable LinuxOSConfigResponse linuxOSConfig;

    public Optional<LinuxOSConfigResponse> getLinuxOSConfig() {
        return this.linuxOSConfig == null ? Optional.empty() : Optional.ofNullable(this.linuxOSConfig);
    }

    /**
     * Maximum number of nodes for auto-scaling
     * 
     */
    @Import(name="maxCount")
      private final @Nullable Integer maxCount;

    public Optional<Integer> getMaxCount() {
        return this.maxCount == null ? Optional.empty() : Optional.ofNullable(this.maxCount);
    }

    /**
     * Maximum number of pods that can run on a node.
     * 
     */
    @Import(name="maxPods")
      private final @Nullable Integer maxPods;

    public Optional<Integer> getMaxPods() {
        return this.maxPods == null ? Optional.empty() : Optional.ofNullable(this.maxPods);
    }

    /**
     * Minimum number of nodes for auto-scaling
     * 
     */
    @Import(name="minCount")
      private final @Nullable Integer minCount;

    public Optional<Integer> getMinCount() {
        return this.minCount == null ? Optional.empty() : Optional.ofNullable(this.minCount);
    }

    /**
     * AgentPoolMode represents mode of an agent pool
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> getMode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    /**
     * Unique name of the agent pool profile in the context of the subscription and resource group.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Version of node image
     * 
     */
    @Import(name="nodeImageVersion", required=true)
      private final String nodeImageVersion;

    public String getNodeImageVersion() {
        return this.nodeImageVersion;
    }

    /**
     * Agent pool node labels to be persisted across all nodes in agent pool.
     * 
     */
    @Import(name="nodeLabels")
      private final @Nullable Map<String,String> nodeLabels;

    public Map<String,String> getNodeLabels() {
        return this.nodeLabels == null ? Map.of() : this.nodeLabels;
    }

    /**
     * Public IP Prefix ID. VM nodes use IPs assigned from this Public IP Prefix.
     * 
     */
    @Import(name="nodePublicIPPrefixID")
      private final @Nullable String nodePublicIPPrefixID;

    public Optional<String> getNodePublicIPPrefixID() {
        return this.nodePublicIPPrefixID == null ? Optional.empty() : Optional.ofNullable(this.nodePublicIPPrefixID);
    }

    /**
     * Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     * 
     */
    @Import(name="nodeTaints")
      private final @Nullable List<String> nodeTaints;

    public List<String> getNodeTaints() {
        return this.nodeTaints == null ? List.of() : this.nodeTaints;
    }

    /**
     * Version of orchestrator specified when creating the managed cluster.
     * 
     */
    @Import(name="orchestratorVersion")
      private final @Nullable String orchestratorVersion;

    public Optional<String> getOrchestratorVersion() {
        return this.orchestratorVersion == null ? Optional.empty() : Optional.ofNullable(this.orchestratorVersion);
    }

    /**
     * OS Disk Size in GB to be used to specify the disk size for every machine in this master/agent pool. If you specify 0, it will apply the default osDisk size according to the vmSize specified.
     * 
     */
    @Import(name="osDiskSizeGB")
      private final @Nullable Integer osDiskSizeGB;

    public Optional<Integer> getOsDiskSizeGB() {
        return this.osDiskSizeGB == null ? Optional.empty() : Optional.ofNullable(this.osDiskSizeGB);
    }

    /**
     * OS disk type to be used for machines in a given agent pool. Allowed values are 'Ephemeral' and 'Managed'. If unspecified, defaults to 'Ephemeral' when the VM supports ephemeral OS and has a cache disk larger than the requested OSDiskSizeGB. Otherwise, defaults to 'Managed'. May not be changed after creation.
     * 
     */
    @Import(name="osDiskType")
      private final @Nullable String osDiskType;

    public Optional<String> getOsDiskType() {
        return this.osDiskType == null ? Optional.empty() : Optional.ofNullable(this.osDiskType);
    }

    /**
     * OsSKU to be used to specify os sku. Choose from Ubuntu(default) and CBLMariner for Linux OSType. Not applicable to Windows OSType.
     * 
     */
    @Import(name="osSKU")
      private final @Nullable String osSKU;

    public Optional<String> getOsSKU() {
        return this.osSKU == null ? Optional.empty() : Optional.ofNullable(this.osSKU);
    }

    /**
     * OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     * 
     */
    @Import(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * Pod SubnetID specifies the VNet's subnet identifier for pods.
     * 
     */
    @Import(name="podSubnetID")
      private final @Nullable String podSubnetID;

    public Optional<String> getPodSubnetID() {
        return this.podSubnetID == null ? Optional.empty() : Optional.ofNullable(this.podSubnetID);
    }

    /**
     * Describes whether the Agent Pool is Running or Stopped
     * 
     */
    @Import(name="powerState", required=true)
      private final PowerStateResponse powerState;

    public PowerStateResponse getPowerState() {
        return this.powerState;
    }

    /**
     * The current deployment or provisioning state, which only appears in the response.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The ID for Proximity Placement Group.
     * 
     */
    @Import(name="proximityPlacementGroupID")
      private final @Nullable String proximityPlacementGroupID;

    public Optional<String> getProximityPlacementGroupID() {
        return this.proximityPlacementGroupID == null ? Optional.empty() : Optional.ofNullable(this.proximityPlacementGroupID);
    }

    /**
     * ScaleSetEvictionPolicy to be used to specify eviction policy for Spot virtual machine scale set. Default to Delete.
     * 
     */
    @Import(name="scaleSetEvictionPolicy")
      private final @Nullable String scaleSetEvictionPolicy;

    public Optional<String> getScaleSetEvictionPolicy() {
        return this.scaleSetEvictionPolicy == null ? Optional.empty() : Optional.ofNullable(this.scaleSetEvictionPolicy);
    }

    /**
     * ScaleSetPriority to be used to specify virtual machine scale set priority. Default to regular.
     * 
     */
    @Import(name="scaleSetPriority")
      private final @Nullable String scaleSetPriority;

    public Optional<String> getScaleSetPriority() {
        return this.scaleSetPriority == null ? Optional.empty() : Optional.ofNullable(this.scaleSetPriority);
    }

    /**
     * SpotMaxPrice to be used to specify the maximum price you are willing to pay in US Dollars. Possible values are any decimal value greater than zero or -1 which indicates default price to be up-to on-demand.
     * 
     */
    @Import(name="spotMaxPrice")
      private final @Nullable Double spotMaxPrice;

    public Optional<Double> getSpotMaxPrice() {
        return this.spotMaxPrice == null ? Optional.empty() : Optional.ofNullable(this.spotMaxPrice);
    }

    /**
     * Agent pool tags to be persisted on the agent pool virtual machine scale set.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * AgentPoolType represents types of an agent pool
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * Settings for upgrading the agentpool
     * 
     */
    @Import(name="upgradeSettings")
      private final @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings;

    public Optional<AgentPoolUpgradeSettingsResponse> getUpgradeSettings() {
        return this.upgradeSettings == null ? Optional.empty() : Optional.ofNullable(this.upgradeSettings);
    }

    /**
     * Size of agent VMs.
     * 
     */
    @Import(name="vmSize")
      private final @Nullable String vmSize;

    public Optional<String> getVmSize() {
        return this.vmSize == null ? Optional.empty() : Optional.ofNullable(this.vmSize);
    }

    /**
     * VNet SubnetID specifies the VNet's subnet identifier for nodes and maybe pods
     * 
     */
    @Import(name="vnetSubnetID")
      private final @Nullable String vnetSubnetID;

    public Optional<String> getVnetSubnetID() {
        return this.vnetSubnetID == null ? Optional.empty() : Optional.ofNullable(this.vnetSubnetID);
    }

    public ManagedClusterAgentPoolProfileResponse(
        @Nullable List<String> availabilityZones,
        @Nullable Integer count,
        @Nullable Boolean enableAutoScaling,
        @Nullable Boolean enableEncryptionAtHost,
        @Nullable Boolean enableFIPS,
        @Nullable Boolean enableNodePublicIP,
        @Nullable String gpuInstanceProfile,
        @Nullable KubeletConfigResponse kubeletConfig,
        @Nullable String kubeletDiskType,
        @Nullable LinuxOSConfigResponse linuxOSConfig,
        @Nullable Integer maxCount,
        @Nullable Integer maxPods,
        @Nullable Integer minCount,
        @Nullable String mode,
        String name,
        String nodeImageVersion,
        @Nullable Map<String,String> nodeLabels,
        @Nullable String nodePublicIPPrefixID,
        @Nullable List<String> nodeTaints,
        @Nullable String orchestratorVersion,
        @Nullable Integer osDiskSizeGB,
        @Nullable String osDiskType,
        @Nullable String osSKU,
        @Nullable String osType,
        @Nullable String podSubnetID,
        PowerStateResponse powerState,
        String provisioningState,
        @Nullable String proximityPlacementGroupID,
        @Nullable String scaleSetEvictionPolicy,
        @Nullable String scaleSetPriority,
        @Nullable Double spotMaxPrice,
        @Nullable Map<String,String> tags,
        @Nullable String type,
        @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings,
        @Nullable String vmSize,
        @Nullable String vnetSubnetID) {
        this.availabilityZones = availabilityZones;
        this.count = count;
        this.enableAutoScaling = enableAutoScaling;
        this.enableEncryptionAtHost = enableEncryptionAtHost;
        this.enableFIPS = enableFIPS;
        this.enableNodePublicIP = enableNodePublicIP;
        this.gpuInstanceProfile = gpuInstanceProfile;
        this.kubeletConfig = kubeletConfig;
        this.kubeletDiskType = kubeletDiskType;
        this.linuxOSConfig = linuxOSConfig;
        this.maxCount = maxCount;
        this.maxPods = maxPods;
        this.minCount = minCount;
        this.mode = mode;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nodeImageVersion = Objects.requireNonNull(nodeImageVersion, "expected parameter 'nodeImageVersion' to be non-null");
        this.nodeLabels = nodeLabels;
        this.nodePublicIPPrefixID = nodePublicIPPrefixID;
        this.nodeTaints = nodeTaints;
        this.orchestratorVersion = orchestratorVersion;
        this.osDiskSizeGB = osDiskSizeGB;
        this.osDiskType = osDiskType;
        this.osSKU = osSKU;
        this.osType = osType;
        this.podSubnetID = podSubnetID;
        this.powerState = Objects.requireNonNull(powerState, "expected parameter 'powerState' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.proximityPlacementGroupID = proximityPlacementGroupID;
        this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
        this.scaleSetPriority = scaleSetPriority;
        this.spotMaxPrice = spotMaxPrice;
        this.tags = tags;
        this.type = type;
        this.upgradeSettings = upgradeSettings;
        this.vmSize = vmSize;
        this.vnetSubnetID = vnetSubnetID;
    }

    private ManagedClusterAgentPoolProfileResponse() {
        this.availabilityZones = List.of();
        this.count = null;
        this.enableAutoScaling = null;
        this.enableEncryptionAtHost = null;
        this.enableFIPS = null;
        this.enableNodePublicIP = null;
        this.gpuInstanceProfile = null;
        this.kubeletConfig = null;
        this.kubeletDiskType = null;
        this.linuxOSConfig = null;
        this.maxCount = null;
        this.maxPods = null;
        this.minCount = null;
        this.mode = null;
        this.name = null;
        this.nodeImageVersion = null;
        this.nodeLabels = Map.of();
        this.nodePublicIPPrefixID = null;
        this.nodeTaints = List.of();
        this.orchestratorVersion = null;
        this.osDiskSizeGB = null;
        this.osDiskType = null;
        this.osSKU = null;
        this.osType = null;
        this.podSubnetID = null;
        this.powerState = null;
        this.provisioningState = null;
        this.proximityPlacementGroupID = null;
        this.scaleSetEvictionPolicy = null;
        this.scaleSetPriority = null;
        this.spotMaxPrice = null;
        this.tags = Map.of();
        this.type = null;
        this.upgradeSettings = null;
        this.vmSize = null;
        this.vnetSubnetID = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAgentPoolProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> availabilityZones;
        private @Nullable Integer count;
        private @Nullable Boolean enableAutoScaling;
        private @Nullable Boolean enableEncryptionAtHost;
        private @Nullable Boolean enableFIPS;
        private @Nullable Boolean enableNodePublicIP;
        private @Nullable String gpuInstanceProfile;
        private @Nullable KubeletConfigResponse kubeletConfig;
        private @Nullable String kubeletDiskType;
        private @Nullable LinuxOSConfigResponse linuxOSConfig;
        private @Nullable Integer maxCount;
        private @Nullable Integer maxPods;
        private @Nullable Integer minCount;
        private @Nullable String mode;
        private String name;
        private String nodeImageVersion;
        private @Nullable Map<String,String> nodeLabels;
        private @Nullable String nodePublicIPPrefixID;
        private @Nullable List<String> nodeTaints;
        private @Nullable String orchestratorVersion;
        private @Nullable Integer osDiskSizeGB;
        private @Nullable String osDiskType;
        private @Nullable String osSKU;
        private @Nullable String osType;
        private @Nullable String podSubnetID;
        private PowerStateResponse powerState;
        private String provisioningState;
        private @Nullable String proximityPlacementGroupID;
        private @Nullable String scaleSetEvictionPolicy;
        private @Nullable String scaleSetPriority;
        private @Nullable Double spotMaxPrice;
        private @Nullable Map<String,String> tags;
        private @Nullable String type;
        private @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings;
        private @Nullable String vmSize;
        private @Nullable String vnetSubnetID;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAgentPoolProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.count = defaults.count;
    	      this.enableAutoScaling = defaults.enableAutoScaling;
    	      this.enableEncryptionAtHost = defaults.enableEncryptionAtHost;
    	      this.enableFIPS = defaults.enableFIPS;
    	      this.enableNodePublicIP = defaults.enableNodePublicIP;
    	      this.gpuInstanceProfile = defaults.gpuInstanceProfile;
    	      this.kubeletConfig = defaults.kubeletConfig;
    	      this.kubeletDiskType = defaults.kubeletDiskType;
    	      this.linuxOSConfig = defaults.linuxOSConfig;
    	      this.maxCount = defaults.maxCount;
    	      this.maxPods = defaults.maxPods;
    	      this.minCount = defaults.minCount;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.nodeImageVersion = defaults.nodeImageVersion;
    	      this.nodeLabels = defaults.nodeLabels;
    	      this.nodePublicIPPrefixID = defaults.nodePublicIPPrefixID;
    	      this.nodeTaints = defaults.nodeTaints;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGB = defaults.osDiskSizeGB;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osSKU = defaults.osSKU;
    	      this.osType = defaults.osType;
    	      this.podSubnetID = defaults.podSubnetID;
    	      this.powerState = defaults.powerState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.proximityPlacementGroupID = defaults.proximityPlacementGroupID;
    	      this.scaleSetEvictionPolicy = defaults.scaleSetEvictionPolicy;
    	      this.scaleSetPriority = defaults.scaleSetPriority;
    	      this.spotMaxPrice = defaults.spotMaxPrice;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.upgradeSettings = defaults.upgradeSettings;
    	      this.vmSize = defaults.vmSize;
    	      this.vnetSubnetID = defaults.vnetSubnetID;
        }

        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public Builder enableAutoScaling(@Nullable Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }
        public Builder enableEncryptionAtHost(@Nullable Boolean enableEncryptionAtHost) {
            this.enableEncryptionAtHost = enableEncryptionAtHost;
            return this;
        }
        public Builder enableFIPS(@Nullable Boolean enableFIPS) {
            this.enableFIPS = enableFIPS;
            return this;
        }
        public Builder enableNodePublicIP(@Nullable Boolean enableNodePublicIP) {
            this.enableNodePublicIP = enableNodePublicIP;
            return this;
        }
        public Builder gpuInstanceProfile(@Nullable String gpuInstanceProfile) {
            this.gpuInstanceProfile = gpuInstanceProfile;
            return this;
        }
        public Builder kubeletConfig(@Nullable KubeletConfigResponse kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }
        public Builder kubeletDiskType(@Nullable String kubeletDiskType) {
            this.kubeletDiskType = kubeletDiskType;
            return this;
        }
        public Builder linuxOSConfig(@Nullable LinuxOSConfigResponse linuxOSConfig) {
            this.linuxOSConfig = linuxOSConfig;
            return this;
        }
        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public Builder maxPods(@Nullable Integer maxPods) {
            this.maxPods = maxPods;
            return this;
        }
        public Builder minCount(@Nullable Integer minCount) {
            this.minCount = minCount;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nodeImageVersion(String nodeImageVersion) {
            this.nodeImageVersion = Objects.requireNonNull(nodeImageVersion);
            return this;
        }
        public Builder nodeLabels(@Nullable Map<String,String> nodeLabels) {
            this.nodeLabels = nodeLabels;
            return this;
        }
        public Builder nodePublicIPPrefixID(@Nullable String nodePublicIPPrefixID) {
            this.nodePublicIPPrefixID = nodePublicIPPrefixID;
            return this;
        }
        public Builder nodeTaints(@Nullable List<String> nodeTaints) {
            this.nodeTaints = nodeTaints;
            return this;
        }
        public Builder nodeTaints(String... nodeTaints) {
            return nodeTaints(List.of(nodeTaints));
        }
        public Builder orchestratorVersion(@Nullable String orchestratorVersion) {
            this.orchestratorVersion = orchestratorVersion;
            return this;
        }
        public Builder osDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }
        public Builder osDiskType(@Nullable String osDiskType) {
            this.osDiskType = osDiskType;
            return this;
        }
        public Builder osSKU(@Nullable String osSKU) {
            this.osSKU = osSKU;
            return this;
        }
        public Builder osType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }
        public Builder podSubnetID(@Nullable String podSubnetID) {
            this.podSubnetID = podSubnetID;
            return this;
        }
        public Builder powerState(PowerStateResponse powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder proximityPlacementGroupID(@Nullable String proximityPlacementGroupID) {
            this.proximityPlacementGroupID = proximityPlacementGroupID;
            return this;
        }
        public Builder scaleSetEvictionPolicy(@Nullable String scaleSetEvictionPolicy) {
            this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
            return this;
        }
        public Builder scaleSetPriority(@Nullable String scaleSetPriority) {
            this.scaleSetPriority = scaleSetPriority;
            return this;
        }
        public Builder spotMaxPrice(@Nullable Double spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder upgradeSettings(@Nullable AgentPoolUpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }
        public Builder vmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }
        public Builder vnetSubnetID(@Nullable String vnetSubnetID) {
            this.vnetSubnetID = vnetSubnetID;
            return this;
        }        public ManagedClusterAgentPoolProfileResponse build() {
            return new ManagedClusterAgentPoolProfileResponse(availabilityZones, count, enableAutoScaling, enableEncryptionAtHost, enableFIPS, enableNodePublicIP, gpuInstanceProfile, kubeletConfig, kubeletDiskType, linuxOSConfig, maxCount, maxPods, minCount, mode, name, nodeImageVersion, nodeLabels, nodePublicIPPrefixID, nodeTaints, orchestratorVersion, osDiskSizeGB, osDiskType, osSKU, osType, podSubnetID, powerState, provisioningState, proximityPlacementGroupID, scaleSetEvictionPolicy, scaleSetPriority, spotMaxPrice, tags, type, upgradeSettings, vmSize, vnetSubnetID);
        }
    }
}
