// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.AgentPoolUpgradeSettingsResponse;
import io.pulumi.azurenative.containerservice.outputs.KubeletConfigResponse;
import io.pulumi.azurenative.containerservice.outputs.LinuxOSConfigResponse;
import io.pulumi.azurenative.containerservice.outputs.PowerStateResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterAgentPoolProfileResponse {
    private final @Nullable List<String> availabilityZones;
    private final @Nullable Integer count;
    private final @Nullable Boolean enableAutoScaling;
    private final @Nullable Boolean enableEncryptionAtHost;
    private final @Nullable Boolean enableFIPS;
    private final @Nullable Boolean enableNodePublicIP;
    private final @Nullable String gpuInstanceProfile;
    private final @Nullable KubeletConfigResponse kubeletConfig;
    private final @Nullable String kubeletDiskType;
    private final @Nullable LinuxOSConfigResponse linuxOSConfig;
    private final @Nullable Integer maxCount;
    private final @Nullable Integer maxPods;
    private final @Nullable Integer minCount;
    private final @Nullable String mode;
    private final String name;
    private final String nodeImageVersion;
    private final @Nullable Map<String,String> nodeLabels;
    private final @Nullable String nodePublicIPPrefixID;
    private final @Nullable List<String> nodeTaints;
    private final @Nullable String orchestratorVersion;
    private final @Nullable Integer osDiskSizeGB;
    private final @Nullable String osDiskType;
    private final @Nullable String osSKU;
    private final @Nullable String osType;
    private final @Nullable String podSubnetID;
    private final PowerStateResponse powerState;
    private final String provisioningState;
    private final @Nullable String proximityPlacementGroupID;
    private final @Nullable String scaleSetEvictionPolicy;
    private final @Nullable String scaleSetPriority;
    private final @Nullable Double spotMaxPrice;
    private final @Nullable Map<String,String> tags;
    private final @Nullable String type;
    private final @Nullable AgentPoolUpgradeSettingsResponse upgradeSettings;
    private final @Nullable String vmSize;
    private final @Nullable String vnetSubnetID;

    @OutputCustomType.Constructor({"availabilityZones","count","enableAutoScaling","enableEncryptionAtHost","enableFIPS","enableNodePublicIP","gpuInstanceProfile","kubeletConfig","kubeletDiskType","linuxOSConfig","maxCount","maxPods","minCount","mode","name","nodeImageVersion","nodeLabels","nodePublicIPPrefixID","nodeTaints","orchestratorVersion","osDiskSizeGB","osDiskType","osSKU","osType","podSubnetID","powerState","provisioningState","proximityPlacementGroupID","scaleSetEvictionPolicy","scaleSetPriority","spotMaxPrice","tags","type","upgradeSettings","vmSize","vnetSubnetID"})
    private ManagedClusterAgentPoolProfileResponse(
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
        this.name = Objects.requireNonNull(name);
        this.nodeImageVersion = Objects.requireNonNull(nodeImageVersion);
        this.nodeLabels = nodeLabels;
        this.nodePublicIPPrefixID = nodePublicIPPrefixID;
        this.nodeTaints = nodeTaints;
        this.orchestratorVersion = orchestratorVersion;
        this.osDiskSizeGB = osDiskSizeGB;
        this.osDiskType = osDiskType;
        this.osSKU = osSKU;
        this.osType = osType;
        this.podSubnetID = podSubnetID;
        this.powerState = Objects.requireNonNull(powerState);
        this.provisioningState = Objects.requireNonNull(provisioningState);
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

    public List<String> getAvailabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    public Optional<Integer> getCount() {
        return Optional.ofNullable(this.count);
    }
    public Optional<Boolean> getEnableAutoScaling() {
        return Optional.ofNullable(this.enableAutoScaling);
    }
    public Optional<Boolean> getEnableEncryptionAtHost() {
        return Optional.ofNullable(this.enableEncryptionAtHost);
    }
    public Optional<Boolean> getEnableFIPS() {
        return Optional.ofNullable(this.enableFIPS);
    }
    public Optional<Boolean> getEnableNodePublicIP() {
        return Optional.ofNullable(this.enableNodePublicIP);
    }
    public Optional<String> getGpuInstanceProfile() {
        return Optional.ofNullable(this.gpuInstanceProfile);
    }
    public Optional<KubeletConfigResponse> getKubeletConfig() {
        return Optional.ofNullable(this.kubeletConfig);
    }
    public Optional<String> getKubeletDiskType() {
        return Optional.ofNullable(this.kubeletDiskType);
    }
    public Optional<LinuxOSConfigResponse> getLinuxOSConfig() {
        return Optional.ofNullable(this.linuxOSConfig);
    }
    public Optional<Integer> getMaxCount() {
        return Optional.ofNullable(this.maxCount);
    }
    public Optional<Integer> getMaxPods() {
        return Optional.ofNullable(this.maxPods);
    }
    public Optional<Integer> getMinCount() {
        return Optional.ofNullable(this.minCount);
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public String getName() {
        return this.name;
    }
    public String getNodeImageVersion() {
        return this.nodeImageVersion;
    }
    public Map<String,String> getNodeLabels() {
        return this.nodeLabels == null ? Map.of() : this.nodeLabels;
    }
    public Optional<String> getNodePublicIPPrefixID() {
        return Optional.ofNullable(this.nodePublicIPPrefixID);
    }
    public List<String> getNodeTaints() {
        return this.nodeTaints == null ? List.of() : this.nodeTaints;
    }
    public Optional<String> getOrchestratorVersion() {
        return Optional.ofNullable(this.orchestratorVersion);
    }
    public Optional<Integer> getOsDiskSizeGB() {
        return Optional.ofNullable(this.osDiskSizeGB);
    }
    public Optional<String> getOsDiskType() {
        return Optional.ofNullable(this.osDiskType);
    }
    public Optional<String> getOsSKU() {
        return Optional.ofNullable(this.osSKU);
    }
    public Optional<String> getOsType() {
        return Optional.ofNullable(this.osType);
    }
    public Optional<String> getPodSubnetID() {
        return Optional.ofNullable(this.podSubnetID);
    }
    public PowerStateResponse getPowerState() {
        return this.powerState;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<String> getProximityPlacementGroupID() {
        return Optional.ofNullable(this.proximityPlacementGroupID);
    }
    public Optional<String> getScaleSetEvictionPolicy() {
        return Optional.ofNullable(this.scaleSetEvictionPolicy);
    }
    public Optional<String> getScaleSetPriority() {
        return Optional.ofNullable(this.scaleSetPriority);
    }
    public Optional<Double> getSpotMaxPrice() {
        return Optional.ofNullable(this.spotMaxPrice);
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    public Optional<AgentPoolUpgradeSettingsResponse> getUpgradeSettings() {
        return Optional.ofNullable(this.upgradeSettings);
    }
    public Optional<String> getVmSize() {
        return Optional.ofNullable(this.vmSize);
    }
    public Optional<String> getVnetSubnetID() {
        return Optional.ofNullable(this.vnetSubnetID);
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

        public Builder setAvailabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = count;
            return this;
        }

        public Builder setEnableAutoScaling(@Nullable Boolean enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }

        public Builder setEnableEncryptionAtHost(@Nullable Boolean enableEncryptionAtHost) {
            this.enableEncryptionAtHost = enableEncryptionAtHost;
            return this;
        }

        public Builder setEnableFIPS(@Nullable Boolean enableFIPS) {
            this.enableFIPS = enableFIPS;
            return this;
        }

        public Builder setEnableNodePublicIP(@Nullable Boolean enableNodePublicIP) {
            this.enableNodePublicIP = enableNodePublicIP;
            return this;
        }

        public Builder setGpuInstanceProfile(@Nullable String gpuInstanceProfile) {
            this.gpuInstanceProfile = gpuInstanceProfile;
            return this;
        }

        public Builder setKubeletConfig(@Nullable KubeletConfigResponse kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }

        public Builder setKubeletDiskType(@Nullable String kubeletDiskType) {
            this.kubeletDiskType = kubeletDiskType;
            return this;
        }

        public Builder setLinuxOSConfig(@Nullable LinuxOSConfigResponse linuxOSConfig) {
            this.linuxOSConfig = linuxOSConfig;
            return this;
        }

        public Builder setMaxCount(@Nullable Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder setMaxPods(@Nullable Integer maxPods) {
            this.maxPods = maxPods;
            return this;
        }

        public Builder setMinCount(@Nullable Integer minCount) {
            this.minCount = minCount;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeImageVersion(String nodeImageVersion) {
            this.nodeImageVersion = Objects.requireNonNull(nodeImageVersion);
            return this;
        }

        public Builder setNodeLabels(@Nullable Map<String,String> nodeLabels) {
            this.nodeLabels = nodeLabels;
            return this;
        }

        public Builder setNodePublicIPPrefixID(@Nullable String nodePublicIPPrefixID) {
            this.nodePublicIPPrefixID = nodePublicIPPrefixID;
            return this;
        }

        public Builder setNodeTaints(@Nullable List<String> nodeTaints) {
            this.nodeTaints = nodeTaints;
            return this;
        }

        public Builder setOrchestratorVersion(@Nullable String orchestratorVersion) {
            this.orchestratorVersion = orchestratorVersion;
            return this;
        }

        public Builder setOsDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }

        public Builder setOsDiskType(@Nullable String osDiskType) {
            this.osDiskType = osDiskType;
            return this;
        }

        public Builder setOsSKU(@Nullable String osSKU) {
            this.osSKU = osSKU;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setPodSubnetID(@Nullable String podSubnetID) {
            this.podSubnetID = podSubnetID;
            return this;
        }

        public Builder setPowerState(PowerStateResponse powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setProximityPlacementGroupID(@Nullable String proximityPlacementGroupID) {
            this.proximityPlacementGroupID = proximityPlacementGroupID;
            return this;
        }

        public Builder setScaleSetEvictionPolicy(@Nullable String scaleSetEvictionPolicy) {
            this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
            return this;
        }

        public Builder setScaleSetPriority(@Nullable String scaleSetPriority) {
            this.scaleSetPriority = scaleSetPriority;
            return this;
        }

        public Builder setSpotMaxPrice(@Nullable Double spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUpgradeSettings(@Nullable AgentPoolUpgradeSettingsResponse upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVnetSubnetID(@Nullable String vnetSubnetID) {
            this.vnetSubnetID = vnetSubnetID;
            return this;
        }

        public ManagedClusterAgentPoolProfileResponse build() {
            return new ManagedClusterAgentPoolProfileResponse(availabilityZones, count, enableAutoScaling, enableEncryptionAtHost, enableFIPS, enableNodePublicIP, gpuInstanceProfile, kubeletConfig, kubeletDiskType, linuxOSConfig, maxCount, maxPods, minCount, mode, name, nodeImageVersion, nodeLabels, nodePublicIPPrefixID, nodeTaints, orchestratorVersion, osDiskSizeGB, osDiskType, osSKU, osType, podSubnetID, powerState, provisioningState, proximityPlacementGroupID, scaleSetEvictionPolicy, scaleSetPriority, spotMaxPrice, tags, type, upgradeSettings, vmSize, vnetSubnetID);
        }
    }
}
