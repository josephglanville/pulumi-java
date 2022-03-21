// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.InstanceTemplateDiskDiskEncryptionKeyGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceTemplateDiskGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateDiskGetArgs Empty = new InstanceTemplateDiskGetArgs();

    /**
     * Whether or not the disk should be auto-deleted.
     * This defaults to true.
     * 
     */
    @Import(name="autoDelete")
      private final @Nullable Output<Boolean> autoDelete;

    public Output<Boolean> getAutoDelete() {
        return this.autoDelete == null ? Output.empty() : this.autoDelete;
    }

    /**
     * Indicates that this is a boot disk.
     * 
     */
    @Import(name="boot")
      private final @Nullable Output<Boolean> boot;

    public Output<Boolean> getBoot() {
        return this.boot == null ? Output.empty() : this.boot;
    }

    /**
     * A unique device name that is reflected into the
     * /dev/  tree of a Linux operating system running within the instance. If not
     * specified, the server chooses a default device name to apply to this disk.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    /**
     * Encrypts or decrypts a disk using a customer-supplied encryption key.
     * 
     */
    @Import(name="diskEncryptionKey")
      private final @Nullable Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs> diskEncryptionKey;

    public Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs> getDiskEncryptionKey() {
        return this.diskEncryptionKey == null ? Output.empty() : this.diskEncryptionKey;
    }

    /**
     * Name of the disk. When not provided, this defaults
     * to the name of the instance.
     * 
     */
    @Import(name="diskName")
      private final @Nullable Output<String> diskName;

    public Output<String> getDiskName() {
        return this.diskName == null ? Output.empty() : this.diskName;
    }

    /**
     * The size of the image in gigabytes. If not
     * specified, it will inherit the size of its base image. For SCRATCH disks,
     * the size must be exactly 375GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * The GCE disk type. Can be either `"pd-ssd"`,
     * `"local-ssd"`, `"pd-balanced"` or `"pd-standard"`.
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<String> diskType;

    public Output<String> getDiskType() {
        return this.diskType == null ? Output.empty() : this.diskType;
    }

    /**
     * Specifies the disk interface to use for attaching this disk,
     * which is either SCSI or NVME. The default is SCSI. Persistent disks must always use SCSI
     * and the request will fail if you attempt to attach a persistent disk in any other format
     * than SCSI. Local SSDs can use either NVME or SCSI.
     * 
     */
    @Import(name="interface")
      private final @Nullable Output<String> $interface;

    public Output<String> get$interface() {
        return this.$interface == null ? Output.empty() : this.$interface;
    }

    /**
     * A set of ket/value label pairs to assign to disk created from
     * this template
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE
     * or READ_ONLY. If you are attaching or creating a boot disk, this must
     * read-write mode.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * -- A list (short name or id) of resource policies to attach to this disk for automatic snapshot creations. Currently a max of 1 resource policy is supported.
     * 
     */
    @Import(name="resourcePolicies")
      private final @Nullable Output<String> resourcePolicies;

    public Output<String> getResourcePolicies() {
        return this.resourcePolicies == null ? Output.empty() : this.resourcePolicies;
    }

    /**
     * The name (**not self_link**)
     * of the disk (such as those managed by `gcp.compute.Disk`) to attach.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<String> source;

    public Output<String> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    /**
     * The image from which to
     * initialize this disk. This can be one of: the image's `self_link`,
     * `projects/{project}/global/images/{image}`,
     * `projects/{project}/global/images/family/{family}`, `global/images/{image}`,
     * `global/images/family/{family}`, `family/{family}`, `{project}/{family}`,
     * `{project}/{image}`, `{family}`, or `{image}`.
     * > **Note:** Either `source` or `source_image` is **required** in a disk block unless the disk type is `local-ssd`. Check the API [docs](https://cloud.google.com/compute/docs/reference/rest/v1/instanceTemplates/insert) for details.
     * 
     */
    @Import(name="sourceImage")
      private final @Nullable Output<String> sourceImage;

    public Output<String> getSourceImage() {
        return this.sourceImage == null ? Output.empty() : this.sourceImage;
    }

    /**
     * The type of reservation from which this instance can consume resources.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public InstanceTemplateDiskGetArgs(
        @Nullable Output<Boolean> autoDelete,
        @Nullable Output<Boolean> boot,
        @Nullable Output<String> deviceName,
        @Nullable Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs> diskEncryptionKey,
        @Nullable Output<String> diskName,
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<String> diskType,
        @Nullable Output<String> $interface,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> mode,
        @Nullable Output<String> resourcePolicies,
        @Nullable Output<String> source,
        @Nullable Output<String> sourceImage,
        @Nullable Output<String> type) {
        this.autoDelete = autoDelete;
        this.boot = boot;
        this.deviceName = deviceName;
        this.diskEncryptionKey = diskEncryptionKey;
        this.diskName = diskName;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
        this.$interface = $interface;
        this.labels = labels;
        this.mode = mode;
        this.resourcePolicies = resourcePolicies;
        this.source = source;
        this.sourceImage = sourceImage;
        this.type = type;
    }

    private InstanceTemplateDiskGetArgs() {
        this.autoDelete = Output.empty();
        this.boot = Output.empty();
        this.deviceName = Output.empty();
        this.diskEncryptionKey = Output.empty();
        this.diskName = Output.empty();
        this.diskSizeGb = Output.empty();
        this.diskType = Output.empty();
        this.$interface = Output.empty();
        this.labels = Output.empty();
        this.mode = Output.empty();
        this.resourcePolicies = Output.empty();
        this.source = Output.empty();
        this.sourceImage = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateDiskGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoDelete;
        private @Nullable Output<Boolean> boot;
        private @Nullable Output<String> deviceName;
        private @Nullable Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs> diskEncryptionKey;
        private @Nullable Output<String> diskName;
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<String> diskType;
        private @Nullable Output<String> $interface;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> resourcePolicies;
        private @Nullable Output<String> source;
        private @Nullable Output<String> sourceImage;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceTemplateDiskGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskName = defaults.diskName;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.$interface = defaults.$interface;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.resourcePolicies = defaults.resourcePolicies;
    	      this.source = defaults.source;
    	      this.sourceImage = defaults.sourceImage;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(@Nullable Output<Boolean> autoDelete) {
            this.autoDelete = autoDelete;
            return this;
        }
        public Builder autoDelete(@Nullable Boolean autoDelete) {
            this.autoDelete = Output.ofNullable(autoDelete);
            return this;
        }
        public Builder boot(@Nullable Output<Boolean> boot) {
            this.boot = boot;
            return this;
        }
        public Builder boot(@Nullable Boolean boot) {
            this.boot = Output.ofNullable(boot);
            return this;
        }
        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }
        public Builder diskEncryptionKey(@Nullable Output<InstanceTemplateDiskDiskEncryptionKeyGetArgs> diskEncryptionKey) {
            this.diskEncryptionKey = diskEncryptionKey;
            return this;
        }
        public Builder diskEncryptionKey(@Nullable InstanceTemplateDiskDiskEncryptionKeyGetArgs diskEncryptionKey) {
            this.diskEncryptionKey = Output.ofNullable(diskEncryptionKey);
            return this;
        }
        public Builder diskName(@Nullable Output<String> diskName) {
            this.diskName = diskName;
            return this;
        }
        public Builder diskName(@Nullable String diskName) {
            this.diskName = Output.ofNullable(diskName);
            return this;
        }
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Output.ofNullable(diskSizeGb);
            return this;
        }
        public Builder diskType(@Nullable Output<String> diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = Output.ofNullable(diskType);
            return this;
        }
        public Builder $interface(@Nullable Output<String> $interface) {
            this.$interface = $interface;
            return this;
        }
        public Builder $interface(@Nullable String $interface) {
            this.$interface = Output.ofNullable($interface);
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
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder resourcePolicies(@Nullable Output<String> resourcePolicies) {
            this.resourcePolicies = resourcePolicies;
            return this;
        }
        public Builder resourcePolicies(@Nullable String resourcePolicies) {
            this.resourcePolicies = Output.ofNullable(resourcePolicies);
            return this;
        }
        public Builder source(@Nullable Output<String> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable String source) {
            this.source = Output.ofNullable(source);
            return this;
        }
        public Builder sourceImage(@Nullable Output<String> sourceImage) {
            this.sourceImage = sourceImage;
            return this;
        }
        public Builder sourceImage(@Nullable String sourceImage) {
            this.sourceImage = Output.ofNullable(sourceImage);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public InstanceTemplateDiskGetArgs build() {
            return new InstanceTemplateDiskGetArgs(autoDelete, boot, deviceName, diskEncryptionKey, diskName, diskSizeGb, diskType, $interface, labels, mode, resourcePolicies, source, sourceImage, type);
        }
    }
}
