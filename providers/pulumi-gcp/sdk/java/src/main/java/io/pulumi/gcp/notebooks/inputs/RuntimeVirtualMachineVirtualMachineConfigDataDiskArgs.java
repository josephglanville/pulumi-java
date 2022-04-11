// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs Empty = new RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs();

    /**
     * - 
     * Optional. Specifies whether the disk will be auto-deleted
     * when the instance is deleted (but not when the disk is
     * detached from the instance).
     * 
     */
    @Import(name="autoDelete")
      private final @Nullable Output<Boolean> autoDelete;

    public Output<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Codegen.empty() : this.autoDelete;
    }

    /**
     * - 
     * Optional. Indicates that this is a boot disk. The virtual
     * machine will use the first partition of the disk for its
     * root filesystem.
     * 
     */
    @Import(name="boot")
      private final @Nullable Output<Boolean> boot;

    public Output<Boolean> getBoot() {
        return this.boot == null ? Codegen.empty() : this.boot;
    }

    /**
     * - 
     * Optional. Specifies a unique device name of your choice
     * that is reflected into the /dev/disk/by-id/google-* tree
     * of a Linux operating system running within the instance.
     * This name can be used to reference the device for mounting,
     * resizing, and so on, from within the instance.
     * If not specified, the server chooses a default device name
     * to apply to this disk, in the form persistent-disk-x, where
     * x is a number assigned by Google Compute Engine. This field
     * is only applicable for persistent disks.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Codegen.empty() : this.deviceName;
    }

    /**
     * - 
     * Indicates a list of features to enable on the guest operating
     * system. Applicable only for bootable images. To see a list of
     * available features, read `https://cloud.google.com/compute/docs/
     * images/create-delete-deprecate-private-images#guest-os-features`
     * options. ``
     * 
     */
    @Import(name="guestOsFeatures")
      private final @Nullable Output<List<String>> guestOsFeatures;

    public Output<List<String>> getGuestOsFeatures() {
        return this.guestOsFeatures == null ? Codegen.empty() : this.guestOsFeatures;
    }

    /**
     * - 
     * Output only. A zero-based index to this disk, where 0 is
     * reserved for the boot disk. If you have many disks attached
     * to an instance, each disk would have a unique index number.
     * 
     */
    @Import(name="index")
      private final @Nullable Output<Integer> index;

    public Output<Integer> getIndex() {
        return this.index == null ? Codegen.empty() : this.index;
    }

    /**
     * Input only. Specifies the parameters for a new disk that will
     * be created alongside the new instance. Use initialization
     * parameters to create boot disks or local SSDs attached to the
     * new instance. This property is mutually exclusive with the
     * source property; you can only define one or the other, but not
     * both.
     * Structure is documented below.
     * 
     */
    @Import(name="initializeParams")
      private final @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs> initializeParams;

    public Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs> getInitializeParams() {
        return this.initializeParams == null ? Codegen.empty() : this.initializeParams;
    }

    /**
     * "Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent
     * disks must always use SCSI and the request will fail if you attempt
     * to attach a persistent disk in any other format than SCSI. Local SSDs
     * can use either NVME or SCSI. For performance characteristics of SCSI
     * over NVMe, see Local SSD performance. Valid values: * NVME * SCSI".
     * 
     */
    @Import(name="interface")
      private final @Nullable Output<String> interface_;

    public Output<String> getInterface_() {
        return this.interface_ == null ? Codegen.empty() : this.interface_;
    }

    /**
     * - 
     * Type of the resource. Always compute#attachedDisk for attached
     * disks.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * - 
     * Output only. Any valid publicly visible licenses.
     * 
     */
    @Import(name="licenses")
      private final @Nullable Output<List<String>> licenses;

    public Output<List<String>> getLicenses() {
        return this.licenses == null ? Codegen.empty() : this.licenses;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If not specified, the default is to attach
     * the disk in READ_WRITE mode.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    /**
     * Specifies a valid partial or full URL to an existing
     * Persistent Disk resource.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> getSource() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * Accelerator model. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#AcceleratorType`
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs(
        @Nullable Output<Boolean> autoDelete,
        @Nullable Output<Boolean> boot,
        @Nullable Output<String> deviceName,
        @Nullable Output<List<String>> guestOsFeatures,
        @Nullable Output<Integer> index,
        @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs> initializeParams,
        @Nullable Output<String> interface_,
        @Nullable Output<String> kind,
        @Nullable Output<List<String>> licenses,
        @Nullable Output<String> mode,
        @Nullable Output<String> source,
        @Nullable Output<String> type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.guestOsFeatures = guestOsFeatures;
        this.index = index;
        this.initializeParams = initializeParams;
        this.interface_ = interface_;
        this.kind = kind;
        this.licenses = licenses;
        this.mode = mode;
        this.source = source;
        this.type = type;
    }

    private RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs() {
        this.autoDelete = Codegen.empty();
        this.boot = Codegen.empty();
        this.deviceName = Codegen.empty();
        this.guestOsFeatures = Codegen.empty();
        this.index = Codegen.empty();
        this.initializeParams = Codegen.empty();
        this.interface_ = Codegen.empty();
        this.kind = Codegen.empty();
        this.licenses = Codegen.empty();
        this.mode = Codegen.empty();
        this.source = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoDelete;
        private @Nullable Output<Boolean> boot;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<List<String>> guestOsFeatures;
        private @Nullable Output<Integer> index;
        private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs> initializeParams;
        private @Nullable Output<String> interface_;
        private @Nullable Output<String> kind;
        private @Nullable Output<List<String>> licenses;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> source;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.initializeParams = defaults.initializeParams;
    	      this.interface_ = defaults.interface_;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Codegen.ofNullable(autoDelete);
            return this;
        }
        public Builder boot(@Nullable Output<Boolean> boot) {
            this.boot = boot;
            return this;
        }
        public Builder boot(@Nullable Boolean boot) {
            this.boot = Codegen.ofNullable(boot);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Codegen.ofNullable(deviceName);
            return this;
        }
        public Builder guestOsFeatures(@Nullable Output<List<String>> guestOsFeatures) {
            this.guestOsFeatures = guestOsFeatures;
            return this;
        }
        public Builder guestOsFeatures(@Nullable List<String> guestOsFeatures) {
            this.guestOsFeatures = Codegen.ofNullable(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(String... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder index(@Nullable Output<Integer> index) {
            this.index = index;
            return this;
        }
        public Builder index(@Nullable Integer index) {
            this.index = Codegen.ofNullable(index);
            return this;
        }
        public Builder initializeParams(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs> initializeParams) {
            this.initializeParams = initializeParams;
            return this;
        }
        public Builder initializeParams(@Nullable RuntimeVirtualMachineVirtualMachineConfigDataDiskInitializeParamsArgs initializeParams) {
            this.initializeParams = Codegen.ofNullable(initializeParams);
            return this;
        }
        public Builder interface_(@Nullable Output<String> interface_) {
            this.interface_ = interface_;
            return this;
        }
        public Builder interface_(@Nullable String interface_) {
            this.interface_ = Codegen.ofNullable(interface_);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder licenses(@Nullable Output<List<String>> licenses) {
            this.licenses = licenses;
            return this;
        }
        public Builder licenses(@Nullable List<String> licenses) {
            this.licenses = Codegen.ofNullable(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs build() {
            return new RuntimeVirtualMachineVirtualMachineConfigDataDiskArgs(autoDelete, boot, deviceName, guestOsFeatures, index, initializeParams, interface_, kind, licenses, mode, source, type);
        }
    }
}
