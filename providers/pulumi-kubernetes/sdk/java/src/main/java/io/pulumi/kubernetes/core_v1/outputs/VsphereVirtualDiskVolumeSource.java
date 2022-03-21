// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VsphereVirtualDiskVolumeSource {
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    private final @Nullable String fsType;
    /**
     * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
     */
    private final @Nullable String storagePolicyID;
    /**
     * Storage Policy Based Management (SPBM) profile name.
     * 
     */
    private final @Nullable String storagePolicyName;
    /**
     * Path that identifies vSphere volume vmdk
     * 
     */
    private final String volumePath;

    @CustomType.Constructor
    private VsphereVirtualDiskVolumeSource(
        @CustomType.Parameter("fsType") @Nullable String fsType,
        @CustomType.Parameter("storagePolicyID") @Nullable String storagePolicyID,
        @CustomType.Parameter("storagePolicyName") @Nullable String storagePolicyName,
        @CustomType.Parameter("volumePath") String volumePath) {
        this.fsType = fsType;
        this.storagePolicyID = storagePolicyID;
        this.storagePolicyName = storagePolicyName;
        this.volumePath = volumePath;
    }

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
    */
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * Storage Policy Based Management (SPBM) profile ID associated with the StoragePolicyName.
     * 
    */
    public Optional<String> getStoragePolicyID() {
        return Optional.ofNullable(this.storagePolicyID);
    }
    /**
     * Storage Policy Based Management (SPBM) profile name.
     * 
    */
    public Optional<String> getStoragePolicyName() {
        return Optional.ofNullable(this.storagePolicyName);
    }
    /**
     * Path that identifies vSphere volume vmdk
     * 
    */
    public String getVolumePath() {
        return this.volumePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VsphereVirtualDiskVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fsType;
        private @Nullable String storagePolicyID;
        private @Nullable String storagePolicyName;
        private String volumePath;

        public Builder() {
    	      // Empty
        }

        public Builder(VsphereVirtualDiskVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.storagePolicyID = defaults.storagePolicyID;
    	      this.storagePolicyName = defaults.storagePolicyName;
    	      this.volumePath = defaults.volumePath;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder storagePolicyID(@Nullable String storagePolicyID) {
            this.storagePolicyID = storagePolicyID;
            return this;
        }
        public Builder storagePolicyName(@Nullable String storagePolicyName) {
            this.storagePolicyName = storagePolicyName;
            return this;
        }
        public Builder volumePath(String volumePath) {
            this.volumePath = Objects.requireNonNull(volumePath);
            return this;
        }        public VsphereVirtualDiskVolumeSource build() {
            return new VsphereVirtualDiskVolumeSource(fsType, storagePolicyID, storagePolicyName, volumePath);
        }
    }
}
