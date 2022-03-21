// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Persistent Disk resource in Google Compute Engine.
 * 
 * A GCE PD must exist before mounting to a container. The disk must also be in the same GCE project and zone as the kubelet. A GCE PD can only be mounted as read/write once or read-only many times. GCE PDs support ownership management and SELinux relabeling.
 * 
 */
public final class GCEPersistentDiskVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GCEPersistentDiskVolumeSourceArgs Empty = new GCEPersistentDiskVolumeSourceArgs();

    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that the filesystem type is supported by the host operating system. Examples: "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @Import(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> getFsType() {
        return this.fsType == null ? Output.empty() : this.fsType;
    }

    /**
     * The partition in the volume that you want to mount. If omitted, the default is to mount by volume name. Examples: For volume /dev/sda1, you specify the partition as "1". Similarly, the volume partition for /dev/sda is "0" (or you can leave the property empty). More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @Import(name="partition")
      private final @Nullable Output<Integer> partition;

    public Output<Integer> getPartition() {
        return this.partition == null ? Output.empty() : this.partition;
    }

    /**
     * Unique name of the PD resource in GCE. Used to identify the disk in GCE. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @Import(name="pdName", required=true)
      private final Output<String> pdName;

    public Output<String> getPdName() {
        return this.pdName;
    }

    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults to false. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     * 
     */
    @Import(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> getReadOnly() {
        return this.readOnly == null ? Output.empty() : this.readOnly;
    }

    public GCEPersistentDiskVolumeSourceArgs(
        @Nullable Output<String> fsType,
        @Nullable Output<Integer> partition,
        Output<String> pdName,
        @Nullable Output<Boolean> readOnly) {
        this.fsType = fsType;
        this.partition = partition;
        this.pdName = Objects.requireNonNull(pdName, "expected parameter 'pdName' to be non-null");
        this.readOnly = readOnly;
    }

    private GCEPersistentDiskVolumeSourceArgs() {
        this.fsType = Output.empty();
        this.partition = Output.empty();
        this.pdName = Output.empty();
        this.readOnly = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GCEPersistentDiskVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private @Nullable Output<Integer> partition;
        private Output<String> pdName;
        private @Nullable Output<Boolean> readOnly;

        public Builder() {
    	      // Empty
        }

        public Builder(GCEPersistentDiskVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.partition = defaults.partition;
    	      this.pdName = defaults.pdName;
    	      this.readOnly = defaults.readOnly;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }
        public Builder fsType(@Nullable String fsType) {
            this.fsType = Output.ofNullable(fsType);
            return this;
        }
        public Builder partition(@Nullable Output<Integer> partition) {
            this.partition = partition;
            return this;
        }
        public Builder partition(@Nullable Integer partition) {
            this.partition = Output.ofNullable(partition);
            return this;
        }
        public Builder pdName(Output<String> pdName) {
            this.pdName = Objects.requireNonNull(pdName);
            return this;
        }
        public Builder pdName(String pdName) {
            this.pdName = Output.of(Objects.requireNonNull(pdName));
            return this;
        }
        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Output.ofNullable(readOnly);
            return this;
        }        public GCEPersistentDiskVolumeSourceArgs build() {
            return new GCEPersistentDiskVolumeSourceArgs(fsType, partition, pdName, readOnly);
        }
    }
}
