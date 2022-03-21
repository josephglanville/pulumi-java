// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SavedDiskResponse {
    /**
     * Type of the resource. Always compute#savedDisk for attached disks.
     * 
     */
    private final String kind;
    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
     */
    private final String sourceDisk;
    /**
     * Size of the individual disk snapshot used by this machine image.
     * 
     */
    private final String storageBytes;
    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
     */
    private final String storageBytesStatus;

    @CustomType.Constructor
    private SavedDiskResponse(
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("sourceDisk") String sourceDisk,
        @CustomType.Parameter("storageBytes") String storageBytes,
        @CustomType.Parameter("storageBytesStatus") String storageBytesStatus) {
        this.kind = kind;
        this.sourceDisk = sourceDisk;
        this.storageBytes = storageBytes;
        this.storageBytesStatus = storageBytesStatus;
    }

    /**
     * Type of the resource. Always compute#savedDisk for attached disks.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Specifies a URL of the disk attached to the source instance.
     * 
    */
    public String getSourceDisk() {
        return this.sourceDisk;
    }
    /**
     * Size of the individual disk snapshot used by this machine image.
     * 
    */
    public String getStorageBytes() {
        return this.storageBytes;
    }
    /**
     * An indicator whether storageBytes is in a stable state or it is being adjusted as a result of shared storage reallocation. This status can either be UPDATING, meaning the size of the snapshot is being updated, or UP_TO_DATE, meaning the size of the snapshot is up-to-date.
     * 
    */
    public String getStorageBytesStatus() {
        return this.storageBytesStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SavedDiskResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String sourceDisk;
        private String storageBytes;
        private String storageBytesStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(SavedDiskResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.sourceDisk = defaults.sourceDisk;
    	      this.storageBytes = defaults.storageBytes;
    	      this.storageBytesStatus = defaults.storageBytesStatus;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder sourceDisk(String sourceDisk) {
            this.sourceDisk = Objects.requireNonNull(sourceDisk);
            return this;
        }
        public Builder storageBytes(String storageBytes) {
            this.storageBytes = Objects.requireNonNull(storageBytes);
            return this;
        }
        public Builder storageBytesStatus(String storageBytesStatus) {
            this.storageBytesStatus = Objects.requireNonNull(storageBytesStatus);
            return this;
        }        public SavedDiskResponse build() {
            return new SavedDiskResponse(kind, sourceDisk, storageBytes, storageBytesStatus);
        }
    }
}
