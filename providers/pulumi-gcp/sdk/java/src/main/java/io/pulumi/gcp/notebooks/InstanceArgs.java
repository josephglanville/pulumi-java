// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.notebooks.inputs.InstanceAcceleratorConfigArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceContainerImageArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceReservationAffinityArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceShieldedInstanceConfigArgs;
import io.pulumi.gcp.notebooks.inputs.InstanceVmImageArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * The hardware accelerator used on this instance. If you use accelerators,
     * make sure that your configuration has enough vCPUs and memory to support the
     * machineType you have selected.
     * Structure is documented below.
     * 
     */
    @Import(name="acceleratorConfig")
      private final @Nullable Output<InstanceAcceleratorConfigArgs> acceleratorConfig;

    public Output<InstanceAcceleratorConfigArgs> getAcceleratorConfig() {
        return this.acceleratorConfig == null ? Output.empty() : this.acceleratorConfig;
    }

    /**
     * The size of the boot disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB). The minimum recommended value is 100 GB.
     * If not specified, this defaults to 100.
     * 
     */
    @Import(name="bootDiskSizeGb")
      private final @Nullable Output<Integer> bootDiskSizeGb;

    public Output<Integer> getBootDiskSizeGb() {
        return this.bootDiskSizeGb == null ? Output.empty() : this.bootDiskSizeGb;
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @Import(name="bootDiskType")
      private final @Nullable Output<String> bootDiskType;

    public Output<String> getBootDiskType() {
        return this.bootDiskType == null ? Output.empty() : this.bootDiskType;
    }

    /**
     * Use a container image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="containerImage")
      private final @Nullable Output<InstanceContainerImageArgs> containerImage;

    public Output<InstanceContainerImageArgs> getContainerImage() {
        return this.containerImage == null ? Output.empty() : this.containerImage;
    }

    /**
     * Instance creation time
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * Specify a custom Cloud Storage path where the GPU driver is stored.
     * If not specified, we'll automatically choose from official GPU drivers.
     * 
     */
    @Import(name="customGpuDriverPath")
      private final @Nullable Output<String> customGpuDriverPath;

    public Output<String> getCustomGpuDriverPath() {
        return this.customGpuDriverPath == null ? Output.empty() : this.customGpuDriverPath;
    }

    /**
     * The size of the data disk in GB attached to this instance,
     * up to a maximum of 64000 GB (64 TB).
     * You can choose the size of the data disk based on how big your notebooks and data are.
     * If not specified, this defaults to 100.
     * 
     */
    @Import(name="dataDiskSizeGb")
      private final @Nullable Output<Integer> dataDiskSizeGb;

    public Output<Integer> getDataDiskSizeGb() {
        return this.dataDiskSizeGb == null ? Output.empty() : this.dataDiskSizeGb;
    }

    /**
     * Possible disk types for notebook instances.
     * Possible values are `DISK_TYPE_UNSPECIFIED`, `PD_STANDARD`, `PD_SSD`, and `PD_BALANCED`.
     * 
     */
    @Import(name="dataDiskType")
      private final @Nullable Output<String> dataDiskType;

    public Output<String> getDataDiskType() {
        return this.dataDiskType == null ? Output.empty() : this.dataDiskType;
    }

    /**
     * Disk encryption method used on the boot and data disks, defaults to GMEK.
     * Possible values are `DISK_ENCRYPTION_UNSPECIFIED`, `GMEK`, and `CMEK`.
     * 
     */
    @Import(name="diskEncryption")
      private final @Nullable Output<String> diskEncryption;

    public Output<String> getDiskEncryption() {
        return this.diskEncryption == null ? Output.empty() : this.diskEncryption;
    }

    /**
     * Whether the end user authorizes Google Cloud to install GPU driver
     * on this instance. If this field is empty or set to false, the GPU driver
     * won't be installed. Only applicable to instances with GPUs.
     * 
     */
    @Import(name="installGpuDriver")
      private final @Nullable Output<Boolean> installGpuDriver;

    public Output<Boolean> getInstallGpuDriver() {
        return this.installGpuDriver == null ? Output.empty() : this.installGpuDriver;
    }

    /**
     * The list of owners of this instance after creation.
     * Format: alias@example.com.
     * Currently supports one owner only.
     * If not specified, all of the service account users of
     * your VM instance's service account can use the instance.
     * 
     */
    @Import(name="instanceOwners")
      private final @Nullable Output<List<String>> instanceOwners;

    public Output<List<String>> getInstanceOwners() {
        return this.instanceOwners == null ? Output.empty() : this.instanceOwners;
    }

    /**
     * The KMS key used to encrypt the disks, only applicable if diskEncryption is CMEK.
     * Format: projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}
     * 
     */
    @Import(name="kmsKey")
      private final @Nullable Output<String> kmsKey;

    public Output<String> getKmsKey() {
        return this.kmsKey == null ? Output.empty() : this.kmsKey;
    }

    /**
     * Labels to apply to this instance. These can be later modified by the setLabels method.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }

    /**
     * A reference to a machine type which defines VM kind.
     * 
     */
    @Import(name="machineType", required=true)
      private final Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType;
    }

    /**
     * Custom metadata to apply to this instance.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The name of the VPC that this instance is in.
     * Format: projects/{project_id}/global/networks/{network_id}
     * 
     */
    @Import(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The type of vNIC driver.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    @Import(name="nicType")
      private final @Nullable Output<String> nicType;

    public Output<String> getNicType() {
        return this.nicType == null ? Output.empty() : this.nicType;
    }

    /**
     * The notebook instance will not register with the proxy..
     * 
     */
    @Import(name="noProxyAccess")
      private final @Nullable Output<Boolean> noProxyAccess;

    public Output<Boolean> getNoProxyAccess() {
        return this.noProxyAccess == null ? Output.empty() : this.noProxyAccess;
    }

    /**
     * No public IP will be assigned to this instance.
     * 
     */
    @Import(name="noPublicIp")
      private final @Nullable Output<Boolean> noPublicIp;

    public Output<Boolean> getNoPublicIp() {
        return this.noPublicIp == null ? Output.empty() : this.noPublicIp;
    }

    /**
     * If true, the data disk will not be auto deleted when deleting the instance.
     * 
     */
    @Import(name="noRemoveDataDisk")
      private final @Nullable Output<Boolean> noRemoveDataDisk;

    public Output<Boolean> getNoRemoveDataDisk() {
        return this.noRemoveDataDisk == null ? Output.empty() : this.noRemoveDataDisk;
    }

    /**
     * Path to a Bash script that automatically runs after a
     * notebook instance fully boots up. The path must be a URL
     * or Cloud Storage path (gs://path-to-file/file-name).
     * 
     */
    @Import(name="postStartupScript")
      private final @Nullable Output<String> postStartupScript;

    public Output<String> getPostStartupScript() {
        return this.postStartupScript == null ? Output.empty() : this.postStartupScript;
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Reservation Affinity for consuming Zonal reservation.
     * Structure is documented below.
     * 
     */
    @Import(name="reservationAffinity")
      private final @Nullable Output<InstanceReservationAffinityArgs> reservationAffinity;

    public Output<InstanceReservationAffinityArgs> getReservationAffinity() {
        return this.reservationAffinity == null ? Output.empty() : this.reservationAffinity;
    }

    /**
     * The service account on this instance, giving access to other
     * Google Cloud services. You can use any service account within
     * the same project, but you must have the service account user
     * permission to use the instance. If not specified,
     * the Compute Engine default service account is used.
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances.
     * If not specified, the following scopes are defined:
     * - https://www.googleapis.com/auth/cloud-platform
     * - https://www.googleapis.com/auth/userinfo.email
     * 
     */
    @Import(name="serviceAccountScopes")
      private final @Nullable Output<List<String>> serviceAccountScopes;

    public Output<List<String>> getServiceAccountScopes() {
        return this.serviceAccountScopes == null ? Output.empty() : this.serviceAccountScopes;
    }

    /**
     * A set of Shielded Instance options. Check [Images using supported Shielded VM features]
     * Not all combinations are valid
     * Structure is documented below.
     * 
     */
    @Import(name="shieldedInstanceConfig")
      private final @Nullable Output<InstanceShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Output<InstanceShieldedInstanceConfigArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Output.empty() : this.shieldedInstanceConfig;
    }

    /**
     * The name of the subnet that this instance is in.
     * Format: projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}
     * 
     */
    @Import(name="subnet")
      private final @Nullable Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    /**
     * The Compute Engine tags to add to instance.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Instance update time.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    /**
     * Use a Compute Engine VM image to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="vmImage")
      private final @Nullable Output<InstanceVmImageArgs> vmImage;

    public Output<InstanceVmImageArgs> getVmImage() {
        return this.vmImage == null ? Output.empty() : this.vmImage;
    }

    public InstanceArgs(
        @Nullable Output<InstanceAcceleratorConfigArgs> acceleratorConfig,
        @Nullable Output<Integer> bootDiskSizeGb,
        @Nullable Output<String> bootDiskType,
        @Nullable Output<InstanceContainerImageArgs> containerImage,
        @Nullable Output<String> createTime,
        @Nullable Output<String> customGpuDriverPath,
        @Nullable Output<Integer> dataDiskSizeGb,
        @Nullable Output<String> dataDiskType,
        @Nullable Output<String> diskEncryption,
        @Nullable Output<Boolean> installGpuDriver,
        @Nullable Output<List<String>> instanceOwners,
        @Nullable Output<String> kmsKey,
        @Nullable Output<Map<String,String>> labels,
        Output<String> location,
        Output<String> machineType,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> network,
        @Nullable Output<String> nicType,
        @Nullable Output<Boolean> noProxyAccess,
        @Nullable Output<Boolean> noPublicIp,
        @Nullable Output<Boolean> noRemoveDataDisk,
        @Nullable Output<String> postStartupScript,
        @Nullable Output<String> project,
        @Nullable Output<InstanceReservationAffinityArgs> reservationAffinity,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<List<String>> serviceAccountScopes,
        @Nullable Output<InstanceShieldedInstanceConfigArgs> shieldedInstanceConfig,
        @Nullable Output<String> subnet,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> updateTime,
        @Nullable Output<InstanceVmImageArgs> vmImage) {
        this.acceleratorConfig = acceleratorConfig;
        this.bootDiskSizeGb = bootDiskSizeGb;
        this.bootDiskType = bootDiskType;
        this.containerImage = containerImage;
        this.createTime = createTime;
        this.customGpuDriverPath = customGpuDriverPath;
        this.dataDiskSizeGb = dataDiskSizeGb;
        this.dataDiskType = dataDiskType;
        this.diskEncryption = diskEncryption;
        this.installGpuDriver = installGpuDriver;
        this.instanceOwners = instanceOwners;
        this.kmsKey = kmsKey;
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = metadata;
        this.name = name;
        this.network = network;
        this.nicType = nicType;
        this.noProxyAccess = noProxyAccess;
        this.noPublicIp = noPublicIp;
        this.noRemoveDataDisk = noRemoveDataDisk;
        this.postStartupScript = postStartupScript;
        this.project = project;
        this.reservationAffinity = reservationAffinity;
        this.serviceAccount = serviceAccount;
        this.serviceAccountScopes = serviceAccountScopes;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnet = subnet;
        this.tags = tags;
        this.updateTime = updateTime;
        this.vmImage = vmImage;
    }

    private InstanceArgs() {
        this.acceleratorConfig = Output.empty();
        this.bootDiskSizeGb = Output.empty();
        this.bootDiskType = Output.empty();
        this.containerImage = Output.empty();
        this.createTime = Output.empty();
        this.customGpuDriverPath = Output.empty();
        this.dataDiskSizeGb = Output.empty();
        this.dataDiskType = Output.empty();
        this.diskEncryption = Output.empty();
        this.installGpuDriver = Output.empty();
        this.instanceOwners = Output.empty();
        this.kmsKey = Output.empty();
        this.labels = Output.empty();
        this.location = Output.empty();
        this.machineType = Output.empty();
        this.metadata = Output.empty();
        this.name = Output.empty();
        this.network = Output.empty();
        this.nicType = Output.empty();
        this.noProxyAccess = Output.empty();
        this.noPublicIp = Output.empty();
        this.noRemoveDataDisk = Output.empty();
        this.postStartupScript = Output.empty();
        this.project = Output.empty();
        this.reservationAffinity = Output.empty();
        this.serviceAccount = Output.empty();
        this.serviceAccountScopes = Output.empty();
        this.shieldedInstanceConfig = Output.empty();
        this.subnet = Output.empty();
        this.tags = Output.empty();
        this.updateTime = Output.empty();
        this.vmImage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<InstanceAcceleratorConfigArgs> acceleratorConfig;
        private @Nullable Output<Integer> bootDiskSizeGb;
        private @Nullable Output<String> bootDiskType;
        private @Nullable Output<InstanceContainerImageArgs> containerImage;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> customGpuDriverPath;
        private @Nullable Output<Integer> dataDiskSizeGb;
        private @Nullable Output<String> dataDiskType;
        private @Nullable Output<String> diskEncryption;
        private @Nullable Output<Boolean> installGpuDriver;
        private @Nullable Output<List<String>> instanceOwners;
        private @Nullable Output<String> kmsKey;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> location;
        private Output<String> machineType;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> network;
        private @Nullable Output<String> nicType;
        private @Nullable Output<Boolean> noProxyAccess;
        private @Nullable Output<Boolean> noPublicIp;
        private @Nullable Output<Boolean> noRemoveDataDisk;
        private @Nullable Output<String> postStartupScript;
        private @Nullable Output<String> project;
        private @Nullable Output<InstanceReservationAffinityArgs> reservationAffinity;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<List<String>> serviceAccountScopes;
        private @Nullable Output<InstanceShieldedInstanceConfigArgs> shieldedInstanceConfig;
        private @Nullable Output<String> subnet;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> updateTime;
        private @Nullable Output<InstanceVmImageArgs> vmImage;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.bootDiskSizeGb = defaults.bootDiskSizeGb;
    	      this.bootDiskType = defaults.bootDiskType;
    	      this.containerImage = defaults.containerImage;
    	      this.createTime = defaults.createTime;
    	      this.customGpuDriverPath = defaults.customGpuDriverPath;
    	      this.dataDiskSizeGb = defaults.dataDiskSizeGb;
    	      this.dataDiskType = defaults.dataDiskType;
    	      this.diskEncryption = defaults.diskEncryption;
    	      this.installGpuDriver = defaults.installGpuDriver;
    	      this.instanceOwners = defaults.instanceOwners;
    	      this.kmsKey = defaults.kmsKey;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.noProxyAccess = defaults.noProxyAccess;
    	      this.noPublicIp = defaults.noPublicIp;
    	      this.noRemoveDataDisk = defaults.noRemoveDataDisk;
    	      this.postStartupScript = defaults.postStartupScript;
    	      this.project = defaults.project;
    	      this.reservationAffinity = defaults.reservationAffinity;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountScopes = defaults.serviceAccountScopes;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.updateTime = defaults.updateTime;
    	      this.vmImage = defaults.vmImage;
        }

        public Builder acceleratorConfig(@Nullable Output<InstanceAcceleratorConfigArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }
        public Builder acceleratorConfig(@Nullable InstanceAcceleratorConfigArgs acceleratorConfig) {
            this.acceleratorConfig = Output.ofNullable(acceleratorConfig);
            return this;
        }
        public Builder bootDiskSizeGb(@Nullable Output<Integer> bootDiskSizeGb) {
            this.bootDiskSizeGb = bootDiskSizeGb;
            return this;
        }
        public Builder bootDiskSizeGb(@Nullable Integer bootDiskSizeGb) {
            this.bootDiskSizeGb = Output.ofNullable(bootDiskSizeGb);
            return this;
        }
        public Builder bootDiskType(@Nullable Output<String> bootDiskType) {
            this.bootDiskType = bootDiskType;
            return this;
        }
        public Builder bootDiskType(@Nullable String bootDiskType) {
            this.bootDiskType = Output.ofNullable(bootDiskType);
            return this;
        }
        public Builder containerImage(@Nullable Output<InstanceContainerImageArgs> containerImage) {
            this.containerImage = containerImage;
            return this;
        }
        public Builder containerImage(@Nullable InstanceContainerImageArgs containerImage) {
            this.containerImage = Output.ofNullable(containerImage);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }
        public Builder customGpuDriverPath(@Nullable Output<String> customGpuDriverPath) {
            this.customGpuDriverPath = customGpuDriverPath;
            return this;
        }
        public Builder customGpuDriverPath(@Nullable String customGpuDriverPath) {
            this.customGpuDriverPath = Output.ofNullable(customGpuDriverPath);
            return this;
        }
        public Builder dataDiskSizeGb(@Nullable Output<Integer> dataDiskSizeGb) {
            this.dataDiskSizeGb = dataDiskSizeGb;
            return this;
        }
        public Builder dataDiskSizeGb(@Nullable Integer dataDiskSizeGb) {
            this.dataDiskSizeGb = Output.ofNullable(dataDiskSizeGb);
            return this;
        }
        public Builder dataDiskType(@Nullable Output<String> dataDiskType) {
            this.dataDiskType = dataDiskType;
            return this;
        }
        public Builder dataDiskType(@Nullable String dataDiskType) {
            this.dataDiskType = Output.ofNullable(dataDiskType);
            return this;
        }
        public Builder diskEncryption(@Nullable Output<String> diskEncryption) {
            this.diskEncryption = diskEncryption;
            return this;
        }
        public Builder diskEncryption(@Nullable String diskEncryption) {
            this.diskEncryption = Output.ofNullable(diskEncryption);
            return this;
        }
        public Builder installGpuDriver(@Nullable Output<Boolean> installGpuDriver) {
            this.installGpuDriver = installGpuDriver;
            return this;
        }
        public Builder installGpuDriver(@Nullable Boolean installGpuDriver) {
            this.installGpuDriver = Output.ofNullable(installGpuDriver);
            return this;
        }
        public Builder instanceOwners(@Nullable Output<List<String>> instanceOwners) {
            this.instanceOwners = instanceOwners;
            return this;
        }
        public Builder instanceOwners(@Nullable List<String> instanceOwners) {
            this.instanceOwners = Output.ofNullable(instanceOwners);
            return this;
        }
        public Builder instanceOwners(String... instanceOwners) {
            return instanceOwners(List.of(instanceOwners));
        }
        public Builder kmsKey(@Nullable Output<String> kmsKey) {
            this.kmsKey = kmsKey;
            return this;
        }
        public Builder kmsKey(@Nullable String kmsKey) {
            this.kmsKey = Output.ofNullable(kmsKey);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
            return this;
        }
        public Builder machineType(Output<String> machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public Builder machineType(String machineType) {
            this.machineType = Output.of(Objects.requireNonNull(machineType));
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
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
        public Builder nicType(@Nullable Output<String> nicType) {
            this.nicType = nicType;
            return this;
        }
        public Builder nicType(@Nullable String nicType) {
            this.nicType = Output.ofNullable(nicType);
            return this;
        }
        public Builder noProxyAccess(@Nullable Output<Boolean> noProxyAccess) {
            this.noProxyAccess = noProxyAccess;
            return this;
        }
        public Builder noProxyAccess(@Nullable Boolean noProxyAccess) {
            this.noProxyAccess = Output.ofNullable(noProxyAccess);
            return this;
        }
        public Builder noPublicIp(@Nullable Output<Boolean> noPublicIp) {
            this.noPublicIp = noPublicIp;
            return this;
        }
        public Builder noPublicIp(@Nullable Boolean noPublicIp) {
            this.noPublicIp = Output.ofNullable(noPublicIp);
            return this;
        }
        public Builder noRemoveDataDisk(@Nullable Output<Boolean> noRemoveDataDisk) {
            this.noRemoveDataDisk = noRemoveDataDisk;
            return this;
        }
        public Builder noRemoveDataDisk(@Nullable Boolean noRemoveDataDisk) {
            this.noRemoveDataDisk = Output.ofNullable(noRemoveDataDisk);
            return this;
        }
        public Builder postStartupScript(@Nullable Output<String> postStartupScript) {
            this.postStartupScript = postStartupScript;
            return this;
        }
        public Builder postStartupScript(@Nullable String postStartupScript) {
            this.postStartupScript = Output.ofNullable(postStartupScript);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder reservationAffinity(@Nullable Output<InstanceReservationAffinityArgs> reservationAffinity) {
            this.reservationAffinity = reservationAffinity;
            return this;
        }
        public Builder reservationAffinity(@Nullable InstanceReservationAffinityArgs reservationAffinity) {
            this.reservationAffinity = Output.ofNullable(reservationAffinity);
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
        public Builder serviceAccountScopes(@Nullable Output<List<String>> serviceAccountScopes) {
            this.serviceAccountScopes = serviceAccountScopes;
            return this;
        }
        public Builder serviceAccountScopes(@Nullable List<String> serviceAccountScopes) {
            this.serviceAccountScopes = Output.ofNullable(serviceAccountScopes);
            return this;
        }
        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }
        public Builder shieldedInstanceConfig(@Nullable Output<InstanceShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        public Builder shieldedInstanceConfig(@Nullable InstanceShieldedInstanceConfigArgs shieldedInstanceConfig) {
            this.shieldedInstanceConfig = Output.ofNullable(shieldedInstanceConfig);
            return this;
        }
        public Builder subnet(@Nullable Output<String> subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = Output.ofNullable(subnet);
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
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }
        public Builder vmImage(@Nullable Output<InstanceVmImageArgs> vmImage) {
            this.vmImage = vmImage;
            return this;
        }
        public Builder vmImage(@Nullable InstanceVmImageArgs vmImage) {
            this.vmImage = Output.ofNullable(vmImage);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(acceleratorConfig, bootDiskSizeGb, bootDiskType, containerImage, createTime, customGpuDriverPath, dataDiskSizeGb, dataDiskType, diskEncryption, installGpuDriver, instanceOwners, kmsKey, labels, location, machineType, metadata, name, network, nicType, noProxyAccess, noPublicIp, noRemoveDataDisk, postStartupScript, project, reservationAffinity, serviceAccount, serviceAccountScopes, shieldedInstanceConfig, subnet, tags, updateTime, vmImage);
        }
    }
}
