// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains encryption settings for a data disk image.
 * 
 */
public final class DataDiskImageEncryptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataDiskImageEncryptionResponse Empty = new DataDiskImageEncryptionResponse();

    /**
     * A relative URI containing the resource ID of the disk encryption set.
     * 
     */
    @InputImport(name="diskEncryptionSetId")
      private final @Nullable String diskEncryptionSetId;

    public Optional<String> getDiskEncryptionSetId() {
        return this.diskEncryptionSetId == null ? Optional.empty() : Optional.ofNullable(this.diskEncryptionSetId);
    }

    /**
     * This property specifies the logical unit number of the data disk. This value is used to identify data disks within the Virtual Machine and therefore must be unique for each data disk attached to the Virtual Machine.
     * 
     */
    @InputImport(name="lun", required=true)
      private final Integer lun;

    public Integer getLun() {
        return this.lun;
    }

    public DataDiskImageEncryptionResponse(
        @Nullable String diskEncryptionSetId,
        Integer lun) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        this.lun = Objects.requireNonNull(lun, "expected parameter 'lun' to be non-null");
    }

    private DataDiskImageEncryptionResponse() {
        this.diskEncryptionSetId = null;
        this.lun = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskImageEncryptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String diskEncryptionSetId;
        private Integer lun;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskImageEncryptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskEncryptionSetId = defaults.diskEncryptionSetId;
    	      this.lun = defaults.lun;
        }

        public Builder setDiskEncryptionSetId(@Nullable String diskEncryptionSetId) {
            this.diskEncryptionSetId = diskEncryptionSetId;
            return this;
        }

        public Builder setLun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        public DataDiskImageEncryptionResponse build() {
            return new DataDiskImageEncryptionResponse(diskEncryptionSetId, lun);
        }
    }
}
