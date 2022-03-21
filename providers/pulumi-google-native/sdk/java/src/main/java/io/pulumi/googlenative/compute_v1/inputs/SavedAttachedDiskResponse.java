// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_v1.inputs.CustomerEncryptionKeyResponse;
import io.pulumi.googlenative.compute_v1.inputs.GuestOsFeatureResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * DEPRECATED: Please use compute#savedDisk instead. An instance-attached disk resource.
 * 
 */
public final class SavedAttachedDiskResponse extends io.pulumi.resources.InvokeArgs {

    public static final SavedAttachedDiskResponse Empty = new SavedAttachedDiskResponse();

    /**
     * Specifies whether the disk will be auto-deleted when the instance is deleted (but not when the disk is detached from the instance).
     * 
     */
    @Import(name="autoDelete", required=true)
      private final Boolean autoDelete;

    public Boolean getAutoDelete() {
        return this.autoDelete;
    }

    /**
     * Indicates that this is a boot disk. The virtual machine will use the first partition of the disk for its root filesystem.
     * 
     */
    @Import(name="boot", required=true)
      private final Boolean boot;

    public Boolean getBoot() {
        return this.boot;
    }

    /**
     * Specifies the name of the disk attached to the source instance.
     * 
     */
    @Import(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * The encryption key for the disk.
     * 
     */
    @Import(name="diskEncryptionKey", required=true)
      private final CustomerEncryptionKeyResponse diskEncryptionKey;

    public CustomerEncryptionKeyResponse getDiskEncryptionKey() {
        return this.diskEncryptionKey;
    }

    /**
     * The size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb", required=true)
      private final String diskSizeGb;

    public String getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * URL of the disk type resource. For example: projects/project /zones/zone/diskTypes/pd-standard or pd-ssd
     * 
     */
    @Import(name="diskType", required=true)
      private final String diskType;

    public String getDiskType() {
        return this.diskType;
    }

    /**
     * A list of features to enable on the guest operating system. Applicable only for bootable images. Read Enabling guest operating system features to see a list of available options.
     * 
     */
    @Import(name="guestOsFeatures", required=true)
      private final List<GuestOsFeatureResponse> guestOsFeatures;

    public List<GuestOsFeatureResponse> getGuestOsFeatures() {
        return this.guestOsFeatures;
    }

    /**
     * Specifies zero-based index of the disk that is attached to the source instance.
     * 
     */
    @Import(name="index", required=true)
      private final Integer index;

    public Integer getIndex() {
        return this.index;
    }

    /**
     * Specifies the disk interface to use for attaching this disk, which is either SCSI or NVME.
     * 
     */
    @Import(name="interface", required=true)
      private final String $interface;

    public String get$interface() {
        return this.$interface;
    }

    /**
     * Type of the resource. Always compute#attachedDisk for attached disks.
     * 
     */
    @Import(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * Any valid publicly visible licenses.
     * 
     */
    @Import(name="licenses", required=true)
      private final List<String> licenses;

    public List<String> getLicenses() {
        return this.licenses;
    }

    /**
     * The mode in which this disk is attached to the source instance, either READ_WRITE or READ_ONLY.
     * 
     */
    @Import(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    @Import(name="source", required=true)
      private final String source;

    public String getSource() {
        return this.source;
    }

    /**
     * A size of the storage used by the disk's snapshot by this machine image.
     * 
     */
    @Import(name="storageBytes", required=true)
      private final String storageBytes;

    public String getStorageBytes() {
        return this.storageBytes;
    }

    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    @Import(name="storageBytesStatus", required=true)
      private final String storageBytesStatus;

    public String getStorageBytesStatus() {
        return this.storageBytesStatus;
    }

    /**
     * Specifies the type of the attached disk, either SCRATCH or PERSISTENT.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public SavedAttachedDiskResponse(
        Boolean autoDelete,
        Boolean boot,
        String deviceName,
        CustomerEncryptionKeyResponse diskEncryptionKey,
        String diskSizeGb,
        String diskType,
        List<GuestOsFeatureResponse> guestOsFeatures,
        Integer index,
        String $interface,
        String kind,
        List<String> licenses,
        String mode,
        String source,
        String storageBytes,
        String storageBytesStatus,
        String type) {
        this.autoDelete = Objects.requireNonNull(autoDelete, "expected parameter 'autoDelete' to be non-null");
        this.boot = Objects.requireNonNull(boot, "expected parameter 'boot' to be non-null");
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey, "expected parameter 'diskEncryptionKey' to be non-null");
        this.diskSizeGb = Objects.requireNonNull(diskSizeGb, "expected parameter 'diskSizeGb' to be non-null");
        this.diskType = Objects.requireNonNull(diskType, "expected parameter 'diskType' to be non-null");
        this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures, "expected parameter 'guestOsFeatures' to be non-null");
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
        this.$interface = Objects.requireNonNull($interface, "expected parameter '$interface' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.licenses = Objects.requireNonNull(licenses, "expected parameter 'licenses' to be non-null");
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.storageBytes = Objects.requireNonNull(storageBytes, "expected parameter 'storageBytes' to be non-null");
        this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus, "expected parameter 'storageBytesStatus' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SavedAttachedDiskResponse() {
        this.autoDelete = null;
        this.boot = null;
        this.deviceName = null;
        this.diskEncryptionKey = null;
        this.diskSizeGb = null;
        this.diskType = null;
        this.guestOsFeatures = List.of();
        this.index = null;
        this.$interface = null;
        this.kind = null;
        this.licenses = List.of();
        this.mode = null;
        this.source = null;
        this.storageBytes = null;
        this.storageBytesStatus = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedAttachedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoDelete;
        private Boolean boot;
        private String deviceName;
        private CustomerEncryptionKeyResponse diskEncryptionKey;
        private String diskSizeGb;
        private String diskType;
        private List<GuestOsFeatureResponse> guestOsFeatures;
        private Integer index;
        private String $interface;
        private String kind;
        private List<String> licenses;
        private String mode;
        private String source;
        private String storageBytes;
        private String storageBytesStatus;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedAttachedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDelete = defaults.autoDelete;
    	      this.boot = defaults.boot;
    	      this.deviceName = defaults.deviceName;
    	      this.diskEncryptionKey = defaults.diskEncryptionKey;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
    	      this.guestOsFeatures = defaults.guestOsFeatures;
    	      this.index = defaults.index;
    	      this.$interface = defaults.$interface;
    	      this.kind = defaults.kind;
    	      this.licenses = defaults.licenses;
    	      this.mode = defaults.mode;
    	      this.source = defaults.source;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
    	      this.type = defaults.type;
        }

        public Builder autoDelete(Boolean autoDelete) {
            this.autoDelete = Objects.requireNonNull(autoDelete);
            return this;
        }
        public Builder boot(Boolean boot) {
            this.boot = Objects.requireNonNull(boot);
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder diskEncryptionKey(CustomerEncryptionKeyResponse diskEncryptionKey) {
            this.diskEncryptionKey = Objects.requireNonNull(diskEncryptionKey);
            return this;
        }
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        public Builder diskType(String diskType) {
            this.diskType = Objects.requireNonNull(diskType);
            return this;
        }
        public Builder guestOsFeatures(List<GuestOsFeatureResponse> guestOsFeatures) {
            this.guestOsFeatures = Objects.requireNonNull(guestOsFeatures);
            return this;
        }
        public Builder guestOsFeatures(GuestOsFeatureResponse... guestOsFeatures) {
            return guestOsFeatures(List.of(guestOsFeatures));
        }
        public Builder index(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public Builder $interface(String $interface) {
            this.$interface = Objects.requireNonNull($interface);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder licenses(List<String> licenses) {
            this.licenses = Objects.requireNonNull(licenses);
            return this;
        }
        public Builder licenses(String... licenses) {
            return licenses(List.of(licenses));
        }
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder storageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }
        public Builder storageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public SavedAttachedDiskResponse build() {
            return new SavedAttachedDiskResponse(autoDelete, boot, deviceName, diskEncryptionKey, diskSizeGb, diskType, guestOsFeatures, index, $interface, kind, licenses, mode, source, storageBytes, storageBytesStatus, type);
        }
    }
}
