// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains encryption settings for a data disk image.
 * 
 */
public final class DataDiskImageEncryptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataDiskImageEncryptionArgs Empty = new DataDiskImageEncryptionArgs();

    /**
     * A relative URI containing the resource ID of the disk encryption set.
     * 
     */
    @InputImport(name="diskEncryptionSetId")
      private final @Nullable Input<String> diskEncryptionSetId;

    public Input<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Input.empty() : this.diskEncryptionSetId;
    }

    /**
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    @InputImport(name="lun", required=true)
      private final Input<Integer> lun;

    public Input<Integer> getLun() {
        return this.lun;
    }

    public DataDiskImageEncryptionArgs(
        @Nullable Input<String> diskEncryptionSetId,
        Input<Integer> lun) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
    }

    private DataDiskImageEncryptionArgs() {
        this.diskEncryptionSetId = Input.empty();
        this.lun = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskImageEncryptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> diskEncryptionSetId;
        private Input<Integer> lun;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskImageEncryptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.lun = defaults.lun;
        }

        public Builder setDiskEncryptionSetId(@Nullable Input<String> diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder setDiskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = Input.ofNullable(diskEncryptionSetId);
            return this;
        }

        public Builder setLun(Input<Integer> lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Input.of(Objects.requireNonNull(lun));
            return this;
        }
        public DataDiskImageEncryptionArgs build() {
            return new DataDiskImageEncryptionArgs(diskEncryptionSetId, lun);
        }
    }
}
