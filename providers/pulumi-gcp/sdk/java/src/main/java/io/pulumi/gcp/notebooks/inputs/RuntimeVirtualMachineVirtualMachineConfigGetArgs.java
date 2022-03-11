// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigGetArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigGetArgs();

    /**
     * The Compute Engine accelerator configuration for this runtime.
     * Structure is documented below.
     * 
     */
    @InputImport(name="acceleratorConfig")
      private final @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs> acceleratorConfig;

    public Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs> getAcceleratorConfig() {
        return this.acceleratorConfig == null ? Output.empty() : this.acceleratorConfig;
    }

    /**
     * Use a list of container images to start the notebook instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="containerImages")
      private final @Nullable Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs>> containerImages;

    public Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs>> getContainerImages() {
        return this.containerImages == null ? Output.empty() : this.containerImages;
    }

    /**
     * Data disk option configuration settings.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dataDisk", required=true)
      private final Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs> dataDisk;

    public Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs> getDataDisk() {
        return this.dataDisk;
    }

    /**
     * Encryption settings for virtual machine data disk.
     * Structure is documented below.
     * 
     */
    @InputImport(name="encryptionConfig")
      private final @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs> encryptionConfig;

    public Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Output.empty() : this.encryptionConfig;
    }

    /**
     * - 
     * The Compute Engine guest attributes. (see [Project and instance
     * guest attributes](https://cloud.google.com/compute/docs/
     * storing-retrieving-metadata#guest_attributes)).
     * 
     */
    @InputImport(name="guestAttributes")
      private final @Nullable Output<Map<String,String>> guestAttributes;

    public Output<Map<String,String>> getGuestAttributes() {
        return this.guestAttributes == null ? Output.empty() : this.guestAttributes;
    }

    /**
     * If true, runtime will only have internal IP addresses. By default,
     * runtimes are not restricted to internal IP addresses, and will
     * have ephemeral external IP addresses assigned to each vm. This
     * `internal_ip_only` restriction can only be enabled for subnetwork
     * enabled networks, and all dependencies must be configured to be
     * accessible without external IP addresses.
     * 
     */
    @InputImport(name="internalIpOnly")
      private final @Nullable Output<Boolean> internalIpOnly;

    public Output<Boolean> getInternalIpOnly() {
        return this.internalIpOnly == null ? Output.empty() : this.internalIpOnly;
    }

    /**
     * Labels to apply to this disk. These can be later modified
     * by the disks.setLabels method. This field is only
     * applicable for persistent disks.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The Compute Engine machine type used for runtimes.
     * 
     */
    @InputImport(name="machineType", required=true)
      private final Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType;
    }

    /**
     * The Compute Engine metadata entries to add to virtual machine.
     * (see [Project and instance metadata](https://cloud.google.com
     * /compute/docs/storing-retrieving-metadata#project_and_instance
     * _metadata)).
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The Compute Engine network to be used for machine communications.
     * Cannot be specified with subnetwork. If neither `network` nor
     * `subnet` is specified, the "default" network of the project is
     * used, if it exists. A full URL or partial URI. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     *   Runtimes are managed resources inside Google Infrastructure.
     *   Runtimes support the following network configurations:
     * * Google Managed Network (Network & subnet are empty)
     * * Consumer Project VPC (network & subnet are required). Requires
     *   configuring Private Service Access.
     * * Shared VPC (network & subnet are required). Requires
     *   configuring Private Service Access.
     * 
     */
    @InputImport(name="network")
      private final @Nullable Output<String> network;

    public Output<String> getNetwork() {
        return this.network == null ? Output.empty() : this.network;
    }

    /**
     * The type of vNIC to be used on this interface. This may be gVNIC
     * or VirtioNet.
     * Possible values are `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, and `GVNIC`.
     * 
     */
    @InputImport(name="nicType")
      private final @Nullable Output<String> nicType;

    public Output<String> getNicType() {
        return this.nicType == null ? Output.empty() : this.nicType;
    }

    /**
     * Shielded VM Instance configuration settings.
     * Structure is documented below.
     * 
     */
    @InputImport(name="shieldedInstanceConfig")
      private final @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigGetArgs> shieldedInstanceConfig;

    public Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigGetArgs> getShieldedInstanceConfig() {
        return this.shieldedInstanceConfig == null ? Output.empty() : this.shieldedInstanceConfig;
    }

    /**
     * The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network. A full URL or
     * partial URI are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet == null ? Output.empty() : this.subnet;
    }

    /**
     * The Compute Engine tags to add to runtime (see [Tagging instances]
     * (https://cloud.google.com/compute/docs/
     * label-or-tag-resources#tags)).
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * - 
     * The zone where the virtual machine is located.
     * 
     */
    @InputImport(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public RuntimeVirtualMachineVirtualMachineConfigGetArgs(
        @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs> acceleratorConfig,
        @Nullable Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs>> containerImages,
        Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs> dataDisk,
        @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs> encryptionConfig,
        @Nullable Output<Map<String,String>> guestAttributes,
        @Nullable Output<Boolean> internalIpOnly,
        @Nullable Output<Map<String,String>> labels,
        Output<String> machineType,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> network,
        @Nullable Output<String> nicType,
        @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigGetArgs> shieldedInstanceConfig,
        @Nullable Output<String> subnet,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> zone) {
        this.acceleratorConfig = acceleratorConfig;
        this.containerImages = containerImages;
        this.dataDisk = Objects.requireNonNull(dataDisk, "expected parameter 'dataDisk' to be non-null");
        this.encryptionConfig = encryptionConfig;
        this.guestAttributes = guestAttributes;
        this.internalIpOnly = internalIpOnly;
        this.labels = labels;
        this.machineType = Objects.requireNonNull(machineType, "expected parameter 'machineType' to be non-null");
        this.metadata = metadata;
        this.network = network;
        this.nicType = nicType;
        this.shieldedInstanceConfig = shieldedInstanceConfig;
        this.subnet = subnet;
        this.tags = tags;
        this.zone = zone;
    }

    private RuntimeVirtualMachineVirtualMachineConfigGetArgs() {
        this.acceleratorConfig = Output.empty();
        this.containerImages = Output.empty();
        this.dataDisk = Output.empty();
        this.encryptionConfig = Output.empty();
        this.guestAttributes = Output.empty();
        this.internalIpOnly = Output.empty();
        this.labels = Output.empty();
        this.machineType = Output.empty();
        this.metadata = Output.empty();
        this.network = Output.empty();
        this.nicType = Output.empty();
        this.shieldedInstanceConfig = Output.empty();
        this.subnet = Output.empty();
        this.tags = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs> acceleratorConfig;
        private @Nullable Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs>> containerImages;
        private Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs> dataDisk;
        private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs> encryptionConfig;
        private @Nullable Output<Map<String,String>> guestAttributes;
        private @Nullable Output<Boolean> internalIpOnly;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> machineType;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> network;
        private @Nullable Output<String> nicType;
        private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigGetArgs> shieldedInstanceConfig;
        private @Nullable Output<String> subnet;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImages = defaults.containerImages;
    	      this.dataDisk = defaults.dataDisk;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.guestAttributes = defaults.guestAttributes;
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        public Builder acceleratorConfig(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs> acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }

        public Builder acceleratorConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfigGetArgs acceleratorConfig) {
            this.acceleratorConfig = Output.ofNullable(acceleratorConfig);
            return this;
        }

        public Builder containerImages(@Nullable Output<List<RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs>> containerImages) {
            this.containerImages = containerImages;
            return this;
        }

        public Builder containerImages(@Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImageGetArgs> containerImages) {
            this.containerImages = Output.ofNullable(containerImages);
            return this;
        }

        public Builder dataDisk(Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs> dataDisk) {
            this.dataDisk = Objects.requireNonNull(dataDisk);
            return this;
        }

        public Builder dataDisk(RuntimeVirtualMachineVirtualMachineConfigDataDiskGetArgs dataDisk) {
            this.dataDisk = Output.of(Objects.requireNonNull(dataDisk));
            return this;
        }

        public Builder encryptionConfig(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder encryptionConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfigGetArgs encryptionConfig) {
            this.encryptionConfig = Output.ofNullable(encryptionConfig);
            return this;
        }

        public Builder guestAttributes(@Nullable Output<Map<String,String>> guestAttributes) {
            this.guestAttributes = guestAttributes;
            return this;
        }

        public Builder guestAttributes(@Nullable Map<String,String> guestAttributes) {
            this.guestAttributes = Output.ofNullable(guestAttributes);
            return this;
        }

        public Builder internalIpOnly(@Nullable Output<Boolean> internalIpOnly) {
            this.internalIpOnly = internalIpOnly;
            return this;
        }

        public Builder internalIpOnly(@Nullable Boolean internalIpOnly) {
            this.internalIpOnly = Output.ofNullable(internalIpOnly);
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

        public Builder shieldedInstanceConfig(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigGetArgs> shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfigGetArgs shieldedInstanceConfig) {
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

        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }

        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }
        public RuntimeVirtualMachineVirtualMachineConfigGetArgs build() {
            return new RuntimeVirtualMachineVirtualMachineConfigGetArgs(acceleratorConfig, containerImages, dataDisk, encryptionConfig, guestAttributes, internalIpOnly, labels, machineType, metadata, network, nicType, shieldedInstanceConfig, subnet, tags, zone);
        }
    }
}
