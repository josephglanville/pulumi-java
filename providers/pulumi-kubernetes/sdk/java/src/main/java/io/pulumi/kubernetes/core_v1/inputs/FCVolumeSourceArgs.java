// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 * 
 */
public final class FCVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final FCVolumeSourceArgs Empty = new FCVolumeSourceArgs();

    /**
     * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * 
     */
    @InputImport(name="fsType")
      private final @Nullable Output<String> fsType;

    public Output<String> getFsType() {
        return this.fsType == null ? Output.empty() : this.fsType;
    }

    /**
     * Optional: FC target lun number
     * 
     */
    @InputImport(name="lun")
      private final @Nullable Output<Integer> lun;

    public Output<Integer> getLun() {
        return this.lun == null ? Output.empty() : this.lun;
    }

    /**
     * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * 
     */
    @InputImport(name="readOnly")
      private final @Nullable Output<Boolean> readOnly;

    public Output<Boolean> getReadOnly() {
        return this.readOnly == null ? Output.empty() : this.readOnly;
    }

    /**
     * Optional: FC target worldwide names (WWNs)
     * 
     */
    @InputImport(name="targetWWNs")
      private final @Nullable Output<List<String>> targetWWNs;

    public Output<List<String>> getTargetWWNs() {
        return this.targetWWNs == null ? Output.empty() : this.targetWWNs;
    }

    /**
     * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
     * 
     */
    @InputImport(name="wwids")
      private final @Nullable Output<List<String>> wwids;

    public Output<List<String>> getWwids() {
        return this.wwids == null ? Output.empty() : this.wwids;
    }

    public FCVolumeSourceArgs(
        @Nullable Output<String> fsType,
        @Nullable Output<Integer> lun,
        @Nullable Output<Boolean> readOnly,
        @Nullable Output<List<String>> targetWWNs,
        @Nullable Output<List<String>> wwids) {
        this.fsType = fsType;
        this.lun = lun;
        this.readOnly = readOnly;
        this.targetWWNs = targetWWNs;
        this.wwids = wwids;
    }

    private FCVolumeSourceArgs() {
        this.fsType = Output.empty();
        this.lun = Output.empty();
        this.readOnly = Output.empty();
        this.targetWWNs = Output.empty();
        this.wwids = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FCVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fsType;
        private @Nullable Output<Integer> lun;
        private @Nullable Output<Boolean> readOnly;
        private @Nullable Output<List<String>> targetWWNs;
        private @Nullable Output<List<String>> wwids;

        public Builder() {
    	      // Empty
        }

        public Builder(FCVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fsType = defaults.fsType;
    	      this.lun = defaults.lun;
    	      this.readOnly = defaults.readOnly;
    	      this.targetWWNs = defaults.targetWWNs;
    	      this.wwids = defaults.wwids;
        }

        public Builder fsType(@Nullable Output<String> fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder fsType(@Nullable String fsType) {
            this.fsType = Output.ofNullable(fsType);
            return this;
        }

        public Builder lun(@Nullable Output<Integer> lun) {
            this.lun = lun;
            return this;
        }

        public Builder lun(@Nullable Integer lun) {
            this.lun = Output.ofNullable(lun);
            return this;
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(@Nullable Boolean readOnly) {
            this.readOnly = Output.ofNullable(readOnly);
            return this;
        }

        public Builder targetWWNs(@Nullable Output<List<String>> targetWWNs) {
            this.targetWWNs = targetWWNs;
            return this;
        }

        public Builder targetWWNs(@Nullable List<String> targetWWNs) {
            this.targetWWNs = Output.ofNullable(targetWWNs);
            return this;
        }

        public Builder wwids(@Nullable Output<List<String>> wwids) {
            this.wwids = wwids;
            return this;
        }

        public Builder wwids(@Nullable List<String> wwids) {
            this.wwids = Output.ofNullable(wwids);
            return this;
        }
        public FCVolumeSourceArgs build() {
            return new FCVolumeSourceArgs(fsType, lun, readOnly, targetWWNs, wwids);
        }
    }
}
