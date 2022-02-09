// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.enums.AgentPoolMode;
import io.pulumi.azurenative.containerservice.enums.AgentPoolType;
import io.pulumi.azurenative.containerservice.enums.GPUInstanceProfile;
import io.pulumi.azurenative.containerservice.enums.KubeletDiskType;
import io.pulumi.azurenative.containerservice.enums.OSDiskType;
import io.pulumi.azurenative.containerservice.enums.OSSKU;
import io.pulumi.azurenative.containerservice.enums.OSType;
import io.pulumi.azurenative.containerservice.enums.ScaleSetEvictionPolicy;
import io.pulumi.azurenative.containerservice.enums.ScaleSetPriority;
import io.pulumi.azurenative.containerservice.inputs.AgentPoolUpgradeSettingsArgs;
import io.pulumi.azurenative.containerservice.inputs.KubeletConfigArgs;
import io.pulumi.azurenative.containerservice.inputs.LinuxOSConfigArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedClusterAgentPoolProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterAgentPoolProfileArgs Empty = new ManagedClusterAgentPoolProfileArgs();

    @InputImport(name="availabilityZones")
    private final @Nullable Input<List<String>> availabilityZones;

    public Input<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Input.empty() : this.availabilityZones;
    }

    @InputImport(name="count")
    private final @Nullable Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count == null ? Input.empty() : this.count;
    }

    @InputImport(name="enableAutoScaling")
    private final @Nullable Input<Boolean> enableAutoScaling;

    public Input<Boolean> getEnableAutoScaling() {
        return this.enableAutoScaling == null ? Input.empty() : this.enableAutoScaling;
    }

    @InputImport(name="enableEncryptionAtHost")
    private final @Nullable Input<Boolean> enableEncryptionAtHost;

    public Input<Boolean> getEnableEncryptionAtHost() {
        return this.enableEncryptionAtHost == null ? Input.empty() : this.enableEncryptionAtHost;
    }

    @InputImport(name="enableFIPS")
    private final @Nullable Input<Boolean> enableFIPS;

    public Input<Boolean> getEnableFIPS() {
        return this.enableFIPS == null ? Input.empty() : this.enableFIPS;
    }

    @InputImport(name="enableNodePublicIP")
    private final @Nullable Input<Boolean> enableNodePublicIP;

    public Input<Boolean> getEnableNodePublicIP() {
        return this.enableNodePublicIP == null ? Input.empty() : this.enableNodePublicIP;
    }

    @InputImport(name="gpuInstanceProfile")
    private final @Nullable Input<Either<String,GPUInstanceProfile>> gpuInstanceProfile;

    public Input<Either<String,GPUInstanceProfile>> getGpuInstanceProfile() {
        return this.gpuInstanceProfile == null ? Input.empty() : this.gpuInstanceProfile;
    }

    @InputImport(name="kubeletConfig")
    private final @Nullable Input<KubeletConfigArgs> kubeletConfig;

    public Input<KubeletConfigArgs> getKubeletConfig() {
        return this.kubeletConfig == null ? Input.empty() : this.kubeletConfig;
    }

    @InputImport(name="kubeletDiskType")
    private final @Nullable Input<Either<String,KubeletDiskType>> kubeletDiskType;

    public Input<Either<String,KubeletDiskType>> getKubeletDiskType() {
        return this.kubeletDiskType == null ? Input.empty() : this.kubeletDiskType;
    }

    @InputImport(name="linuxOSConfig")
    private final @Nullable Input<LinuxOSConfigArgs> linuxOSConfig;

    public Input<LinuxOSConfigArgs> getLinuxOSConfig() {
        return this.linuxOSConfig == null ? Input.empty() : this.linuxOSConfig;
    }

    @InputImport(name="maxCount")
    private final @Nullable Input<Integer> maxCount;

    public Input<Integer> getMaxCount() {
        return this.maxCount == null ? Input.empty() : this.maxCount;
    }

    @InputImport(name="maxPods")
    private final @Nullable Input<Integer> maxPods;

    public Input<Integer> getMaxPods() {
        return this.maxPods == null ? Input.empty() : this.maxPods;
    }

    @InputImport(name="minCount")
    private final @Nullable Input<Integer> minCount;

    public Input<Integer> getMinCount() {
        return this.minCount == null ? Input.empty() : this.minCount;
    }

    @InputImport(name="mode")
    private final @Nullable Input<Either<String,AgentPoolMode>> mode;

    public Input<Either<String,AgentPoolMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="nodeLabels")
    private final @Nullable Input<Map<String,String>> nodeLabels;

    public Input<Map<String,String>> getNodeLabels() {
        return this.nodeLabels == null ? Input.empty() : this.nodeLabels;
    }

    @InputImport(name="nodePublicIPPrefixID")
    private final @Nullable Input<String> nodePublicIPPrefixID;

    public Input<String> getNodePublicIPPrefixID() {
        return this.nodePublicIPPrefixID == null ? Input.empty() : this.nodePublicIPPrefixID;
    }

    @InputImport(name="nodeTaints")
    private final @Nullable Input<List<String>> nodeTaints;

    public Input<List<String>> getNodeTaints() {
        return this.nodeTaints == null ? Input.empty() : this.nodeTaints;
    }

    @InputImport(name="orchestratorVersion")
    private final @Nullable Input<String> orchestratorVersion;

    public Input<String> getOrchestratorVersion() {
        return this.orchestratorVersion == null ? Input.empty() : this.orchestratorVersion;
    }

    @InputImport(name="osDiskSizeGB")
    private final @Nullable Input<Integer> osDiskSizeGB;

    public Input<Integer> getOsDiskSizeGB() {
        return this.osDiskSizeGB == null ? Input.empty() : this.osDiskSizeGB;
    }

    @InputImport(name="osDiskType")
    private final @Nullable Input<Either<String,OSDiskType>> osDiskType;

    public Input<Either<String,OSDiskType>> getOsDiskType() {
        return this.osDiskType == null ? Input.empty() : this.osDiskType;
    }

    @InputImport(name="osSKU")
    private final @Nullable Input<Either<String,OSSKU>> osSKU;

    public Input<Either<String,OSSKU>> getOsSKU() {
        return this.osSKU == null ? Input.empty() : this.osSKU;
    }

    @InputImport(name="osType")
    private final @Nullable Input<Either<String,OSType>> osType;

    public Input<Either<String,OSType>> getOsType() {
        return this.osType == null ? Input.empty() : this.osType;
    }

    @InputImport(name="podSubnetID")
    private final @Nullable Input<String> podSubnetID;

    public Input<String> getPodSubnetID() {
        return this.podSubnetID == null ? Input.empty() : this.podSubnetID;
    }

    @InputImport(name="proximityPlacementGroupID")
    private final @Nullable Input<String> proximityPlacementGroupID;

    public Input<String> getProximityPlacementGroupID() {
        return this.proximityPlacementGroupID == null ? Input.empty() : this.proximityPlacementGroupID;
    }

    @InputImport(name="scaleSetEvictionPolicy")
    private final @Nullable Input<Either<String,ScaleSetEvictionPolicy>> scaleSetEvictionPolicy;

    public Input<Either<String,ScaleSetEvictionPolicy>> getScaleSetEvictionPolicy() {
        return this.scaleSetEvictionPolicy == null ? Input.empty() : this.scaleSetEvictionPolicy;
    }

    @InputImport(name="scaleSetPriority")
    private final @Nullable Input<Either<String,ScaleSetPriority>> scaleSetPriority;

    public Input<Either<String,ScaleSetPriority>> getScaleSetPriority() {
        return this.scaleSetPriority == null ? Input.empty() : this.scaleSetPriority;
    }

    @InputImport(name="spotMaxPrice")
    private final @Nullable Input<Double> spotMaxPrice;

    public Input<Double> getSpotMaxPrice() {
        return this.spotMaxPrice == null ? Input.empty() : this.spotMaxPrice;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,AgentPoolType>> type;

    public Input<Either<String,AgentPoolType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="upgradeSettings")
    private final @Nullable Input<AgentPoolUpgradeSettingsArgs> upgradeSettings;

    public Input<AgentPoolUpgradeSettingsArgs> getUpgradeSettings() {
        return this.upgradeSettings == null ? Input.empty() : this.upgradeSettings;
    }

    @InputImport(name="vmSize")
    private final @Nullable Input<String> vmSize;

    public Input<String> getVmSize() {
        return this.vmSize == null ? Input.empty() : this.vmSize;
    }

    @InputImport(name="vnetSubnetID")
    private final @Nullable Input<String> vnetSubnetID;

    public Input<String> getVnetSubnetID() {
        return this.vnetSubnetID == null ? Input.empty() : this.vnetSubnetID;
    }

    public ManagedClusterAgentPoolProfileArgs(
        @Nullable Input<List<String>> availabilityZones,
        @Nullable Input<Integer> count,
        @Nullable Input<Boolean> enableAutoScaling,
        @Nullable Input<Boolean> enableEncryptionAtHost,
        @Nullable Input<Boolean> enableFIPS,
        @Nullable Input<Boolean> enableNodePublicIP,
        @Nullable Input<Either<String,GPUInstanceProfile>> gpuInstanceProfile,
        @Nullable Input<KubeletConfigArgs> kubeletConfig,
        @Nullable Input<Either<String,KubeletDiskType>> kubeletDiskType,
        @Nullable Input<LinuxOSConfigArgs> linuxOSConfig,
        @Nullable Input<Integer> maxCount,
        @Nullable Input<Integer> maxPods,
        @Nullable Input<Integer> minCount,
        @Nullable Input<Either<String,AgentPoolMode>> mode,
        Input<String> name,
        @Nullable Input<Map<String,String>> nodeLabels,
        @Nullable Input<String> nodePublicIPPrefixID,
        @Nullable Input<List<String>> nodeTaints,
        @Nullable Input<String> orchestratorVersion,
        @Nullable Input<Integer> osDiskSizeGB,
        @Nullable Input<Either<String,OSDiskType>> osDiskType,
        @Nullable Input<Either<String,OSSKU>> osSKU,
        @Nullable Input<Either<String,OSType>> osType,
        @Nullable Input<String> podSubnetID,
        @Nullable Input<String> proximityPlacementGroupID,
        @Nullable Input<Either<String,ScaleSetEvictionPolicy>> scaleSetEvictionPolicy,
        @Nullable Input<Either<String,ScaleSetPriority>> scaleSetPriority,
        @Nullable Input<Double> spotMaxPrice,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Either<String,AgentPoolType>> type,
        @Nullable Input<AgentPoolUpgradeSettingsArgs> upgradeSettings,
        @Nullable Input<String> vmSize,
        @Nullable Input<String> vnetSubnetID) {
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
        this.nodeLabels = nodeLabels;
        this.nodePublicIPPrefixID = nodePublicIPPrefixID;
        this.nodeTaints = nodeTaints;
        this.orchestratorVersion = orchestratorVersion;
        this.osDiskSizeGB = osDiskSizeGB;
        this.osDiskType = osDiskType;
        this.osSKU = osSKU;
        this.osType = osType;
        this.podSubnetID = podSubnetID;
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

    private ManagedClusterAgentPoolProfileArgs() {
        this.availabilityZones = Input.empty();
        this.count = Input.empty();
        this.enableAutoScaling = Input.empty();
        this.enableEncryptionAtHost = Input.empty();
        this.enableFIPS = Input.empty();
        this.enableNodePublicIP = Input.empty();
        this.gpuInstanceProfile = Input.empty();
        this.kubeletConfig = Input.empty();
        this.kubeletDiskType = Input.empty();
        this.linuxOSConfig = Input.empty();
        this.maxCount = Input.empty();
        this.maxPods = Input.empty();
        this.minCount = Input.empty();
        this.mode = Input.empty();
        this.name = Input.empty();
        this.nodeLabels = Input.empty();
        this.nodePublicIPPrefixID = Input.empty();
        this.nodeTaints = Input.empty();
        this.orchestratorVersion = Input.empty();
        this.osDiskSizeGB = Input.empty();
        this.osDiskType = Input.empty();
        this.osSKU = Input.empty();
        this.osType = Input.empty();
        this.podSubnetID = Input.empty();
        this.proximityPlacementGroupID = Input.empty();
        this.scaleSetEvictionPolicy = Input.empty();
        this.scaleSetPriority = Input.empty();
        this.spotMaxPrice = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
        this.upgradeSettings = Input.empty();
        this.vmSize = Input.empty();
        this.vnetSubnetID = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterAgentPoolProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> availabilityZones;
        private @Nullable Input<Integer> count;
        private @Nullable Input<Boolean> enableAutoScaling;
        private @Nullable Input<Boolean> enableEncryptionAtHost;
        private @Nullable Input<Boolean> enableFIPS;
        private @Nullable Input<Boolean> enableNodePublicIP;
        private @Nullable Input<Either<String,GPUInstanceProfile>> gpuInstanceProfile;
        private @Nullable Input<KubeletConfigArgs> kubeletConfig;
        private @Nullable Input<Either<String,KubeletDiskType>> kubeletDiskType;
        private @Nullable Input<LinuxOSConfigArgs> linuxOSConfig;
        private @Nullable Input<Integer> maxCount;
        private @Nullable Input<Integer> maxPods;
        private @Nullable Input<Integer> minCount;
        private @Nullable Input<Either<String,AgentPoolMode>> mode;
        private Input<String> name;
        private @Nullable Input<Map<String,String>> nodeLabels;
        private @Nullable Input<String> nodePublicIPPrefixID;
        private @Nullable Input<List<String>> nodeTaints;
        private @Nullable Input<String> orchestratorVersion;
        private @Nullable Input<Integer> osDiskSizeGB;
        private @Nullable Input<Either<String,OSDiskType>> osDiskType;
        private @Nullable Input<Either<String,OSSKU>> osSKU;
        private @Nullable Input<Either<String,OSType>> osType;
        private @Nullable Input<String> podSubnetID;
        private @Nullable Input<String> proximityPlacementGroupID;
        private @Nullable Input<Either<String,ScaleSetEvictionPolicy>> scaleSetEvictionPolicy;
        private @Nullable Input<Either<String,ScaleSetPriority>> scaleSetPriority;
        private @Nullable Input<Double> spotMaxPrice;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Either<String,AgentPoolType>> type;
        private @Nullable Input<AgentPoolUpgradeSettingsArgs> upgradeSettings;
        private @Nullable Input<String> vmSize;
        private @Nullable Input<String> vnetSubnetID;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterAgentPoolProfileArgs defaults) {
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
    	      this.nodeLabels = defaults.nodeLabels;
    	      this.nodePublicIPPrefixID = defaults.nodePublicIPPrefixID;
    	      this.nodeTaints = defaults.nodeTaints;
    	      this.orchestratorVersion = defaults.orchestratorVersion;
    	      this.osDiskSizeGB = defaults.osDiskSizeGB;
    	      this.osDiskType = defaults.osDiskType;
    	      this.osSKU = defaults.osSKU;
    	      this.osType = defaults.osType;
    	      this.podSubnetID = defaults.podSubnetID;
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

        public Builder setAvailabilityZones(@Nullable Input<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }

        public Builder setAvailabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Input.ofNullable(availabilityZones);
            return this;
        }

        public Builder setCount(@Nullable Input<Integer> count) {
            this.count = count;
            return this;
        }

        public Builder setCount(@Nullable Integer count) {
            this.count = Input.ofNullable(count);
            return this;
        }

        public Builder setEnableAutoScaling(@Nullable Input<Boolean> enableAutoScaling) {
            this.enableAutoScaling = enableAutoScaling;
            return this;
        }

        public Builder setEnableAutoScaling(@Nullable Boolean enableAutoScaling) {
            this.enableAutoScaling = Input.ofNullable(enableAutoScaling);
            return this;
        }

        public Builder setEnableEncryptionAtHost(@Nullable Input<Boolean> enableEncryptionAtHost) {
            this.enableEncryptionAtHost = enableEncryptionAtHost;
            return this;
        }

        public Builder setEnableEncryptionAtHost(@Nullable Boolean enableEncryptionAtHost) {
            this.enableEncryptionAtHost = Input.ofNullable(enableEncryptionAtHost);
            return this;
        }

        public Builder setEnableFIPS(@Nullable Input<Boolean> enableFIPS) {
            this.enableFIPS = enableFIPS;
            return this;
        }

        public Builder setEnableFIPS(@Nullable Boolean enableFIPS) {
            this.enableFIPS = Input.ofNullable(enableFIPS);
            return this;
        }

        public Builder setEnableNodePublicIP(@Nullable Input<Boolean> enableNodePublicIP) {
            this.enableNodePublicIP = enableNodePublicIP;
            return this;
        }

        public Builder setEnableNodePublicIP(@Nullable Boolean enableNodePublicIP) {
            this.enableNodePublicIP = Input.ofNullable(enableNodePublicIP);
            return this;
        }

        public Builder setGpuInstanceProfile(@Nullable Input<Either<String,GPUInstanceProfile>> gpuInstanceProfile) {
            this.gpuInstanceProfile = gpuInstanceProfile;
            return this;
        }

        public Builder setGpuInstanceProfile(@Nullable Either<String,GPUInstanceProfile> gpuInstanceProfile) {
            this.gpuInstanceProfile = Input.ofNullable(gpuInstanceProfile);
            return this;
        }

        public Builder setKubeletConfig(@Nullable Input<KubeletConfigArgs> kubeletConfig) {
            this.kubeletConfig = kubeletConfig;
            return this;
        }

        public Builder setKubeletConfig(@Nullable KubeletConfigArgs kubeletConfig) {
            this.kubeletConfig = Input.ofNullable(kubeletConfig);
            return this;
        }

        public Builder setKubeletDiskType(@Nullable Input<Either<String,KubeletDiskType>> kubeletDiskType) {
            this.kubeletDiskType = kubeletDiskType;
            return this;
        }

        public Builder setKubeletDiskType(@Nullable Either<String,KubeletDiskType> kubeletDiskType) {
            this.kubeletDiskType = Input.ofNullable(kubeletDiskType);
            return this;
        }

        public Builder setLinuxOSConfig(@Nullable Input<LinuxOSConfigArgs> linuxOSConfig) {
            this.linuxOSConfig = linuxOSConfig;
            return this;
        }

        public Builder setLinuxOSConfig(@Nullable LinuxOSConfigArgs linuxOSConfig) {
            this.linuxOSConfig = Input.ofNullable(linuxOSConfig);
            return this;
        }

        public Builder setMaxCount(@Nullable Input<Integer> maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder setMaxCount(@Nullable Integer maxCount) {
            this.maxCount = Input.ofNullable(maxCount);
            return this;
        }

        public Builder setMaxPods(@Nullable Input<Integer> maxPods) {
            this.maxPods = maxPods;
            return this;
        }

        public Builder setMaxPods(@Nullable Integer maxPods) {
            this.maxPods = Input.ofNullable(maxPods);
            return this;
        }

        public Builder setMinCount(@Nullable Input<Integer> minCount) {
            this.minCount = minCount;
            return this;
        }

        public Builder setMinCount(@Nullable Integer minCount) {
            this.minCount = Input.ofNullable(minCount);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,AgentPoolMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,AgentPoolMode> mode) {
            this.mode = Input.ofNullable(mode);
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

        public Builder setNodeLabels(@Nullable Input<Map<String,String>> nodeLabels) {
            this.nodeLabels = nodeLabels;
            return this;
        }

        public Builder setNodeLabels(@Nullable Map<String,String> nodeLabels) {
            this.nodeLabels = Input.ofNullable(nodeLabels);
            return this;
        }

        public Builder setNodePublicIPPrefixID(@Nullable Input<String> nodePublicIPPrefixID) {
            this.nodePublicIPPrefixID = nodePublicIPPrefixID;
            return this;
        }

        public Builder setNodePublicIPPrefixID(@Nullable String nodePublicIPPrefixID) {
            this.nodePublicIPPrefixID = Input.ofNullable(nodePublicIPPrefixID);
            return this;
        }

        public Builder setNodeTaints(@Nullable Input<List<String>> nodeTaints) {
            this.nodeTaints = nodeTaints;
            return this;
        }

        public Builder setNodeTaints(@Nullable List<String> nodeTaints) {
            this.nodeTaints = Input.ofNullable(nodeTaints);
            return this;
        }

        public Builder setOrchestratorVersion(@Nullable Input<String> orchestratorVersion) {
            this.orchestratorVersion = orchestratorVersion;
            return this;
        }

        public Builder setOrchestratorVersion(@Nullable String orchestratorVersion) {
            this.orchestratorVersion = Input.ofNullable(orchestratorVersion);
            return this;
        }

        public Builder setOsDiskSizeGB(@Nullable Input<Integer> osDiskSizeGB) {
            this.osDiskSizeGB = osDiskSizeGB;
            return this;
        }

        public Builder setOsDiskSizeGB(@Nullable Integer osDiskSizeGB) {
            this.osDiskSizeGB = Input.ofNullable(osDiskSizeGB);
            return this;
        }

        public Builder setOsDiskType(@Nullable Input<Either<String,OSDiskType>> osDiskType) {
            this.osDiskType = osDiskType;
            return this;
        }

        public Builder setOsDiskType(@Nullable Either<String,OSDiskType> osDiskType) {
            this.osDiskType = Input.ofNullable(osDiskType);
            return this;
        }

        public Builder setOsSKU(@Nullable Input<Either<String,OSSKU>> osSKU) {
            this.osSKU = osSKU;
            return this;
        }

        public Builder setOsSKU(@Nullable Either<String,OSSKU> osSKU) {
            this.osSKU = Input.ofNullable(osSKU);
            return this;
        }

        public Builder setOsType(@Nullable Input<Either<String,OSType>> osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsType(@Nullable Either<String,OSType> osType) {
            this.osType = Input.ofNullable(osType);
            return this;
        }

        public Builder setPodSubnetID(@Nullable Input<String> podSubnetID) {
            this.podSubnetID = podSubnetID;
            return this;
        }

        public Builder setPodSubnetID(@Nullable String podSubnetID) {
            this.podSubnetID = Input.ofNullable(podSubnetID);
            return this;
        }

        public Builder setProximityPlacementGroupID(@Nullable Input<String> proximityPlacementGroupID) {
            this.proximityPlacementGroupID = proximityPlacementGroupID;
            return this;
        }

        public Builder setProximityPlacementGroupID(@Nullable String proximityPlacementGroupID) {
            this.proximityPlacementGroupID = Input.ofNullable(proximityPlacementGroupID);
            return this;
        }

        public Builder setScaleSetEvictionPolicy(@Nullable Input<Either<String,ScaleSetEvictionPolicy>> scaleSetEvictionPolicy) {
            this.scaleSetEvictionPolicy = scaleSetEvictionPolicy;
            return this;
        }

        public Builder setScaleSetEvictionPolicy(@Nullable Either<String,ScaleSetEvictionPolicy> scaleSetEvictionPolicy) {
            this.scaleSetEvictionPolicy = Input.ofNullable(scaleSetEvictionPolicy);
            return this;
        }

        public Builder setScaleSetPriority(@Nullable Input<Either<String,ScaleSetPriority>> scaleSetPriority) {
            this.scaleSetPriority = scaleSetPriority;
            return this;
        }

        public Builder setScaleSetPriority(@Nullable Either<String,ScaleSetPriority> scaleSetPriority) {
            this.scaleSetPriority = Input.ofNullable(scaleSetPriority);
            return this;
        }

        public Builder setSpotMaxPrice(@Nullable Input<Double> spotMaxPrice) {
            this.spotMaxPrice = spotMaxPrice;
            return this;
        }

        public Builder setSpotMaxPrice(@Nullable Double spotMaxPrice) {
            this.spotMaxPrice = Input.ofNullable(spotMaxPrice);
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

        public Builder setType(@Nullable Input<Either<String,AgentPoolType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,AgentPoolType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUpgradeSettings(@Nullable Input<AgentPoolUpgradeSettingsArgs> upgradeSettings) {
            this.upgradeSettings = upgradeSettings;
            return this;
        }

        public Builder setUpgradeSettings(@Nullable AgentPoolUpgradeSettingsArgs upgradeSettings) {
            this.upgradeSettings = Input.ofNullable(upgradeSettings);
            return this;
        }

        public Builder setVmSize(@Nullable Input<String> vmSize) {
            this.vmSize = vmSize;
            return this;
        }

        public Builder setVmSize(@Nullable String vmSize) {
            this.vmSize = Input.ofNullable(vmSize);
            return this;
        }

        public Builder setVnetSubnetID(@Nullable Input<String> vnetSubnetID) {
            this.vnetSubnetID = vnetSubnetID;
            return this;
        }

        public Builder setVnetSubnetID(@Nullable String vnetSubnetID) {
            this.vnetSubnetID = Input.ofNullable(vnetSubnetID);
            return this;
        }

        public ManagedClusterAgentPoolProfileArgs build() {
            return new ManagedClusterAgentPoolProfileArgs(availabilityZones, count, enableAutoScaling, enableEncryptionAtHost, enableFIPS, enableNodePublicIP, gpuInstanceProfile, kubeletConfig, kubeletDiskType, linuxOSConfig, maxCount, maxPods, minCount, mode, name, nodeLabels, nodePublicIPPrefixID, nodeTaints, orchestratorVersion, osDiskSizeGB, osDiskType, osSKU, osType, podSubnetID, proximityPlacementGroupID, scaleSetEvictionPolicy, scaleSetPriority, spotMaxPrice, tags, type, upgradeSettings, vmSize, vnetSubnetID);
        }
    }
}
