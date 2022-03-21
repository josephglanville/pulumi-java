// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Disk associated with the Instance.
 * 
 */
public final class InstanceDisk extends io.pulumi.resources.InvokeArgs {

    public static final InstanceDisk Empty = new InstanceDisk();

    /**
     * Instance attached to the disk.
     * 
     */
    @Import(name="attachedTo")
      private final @Nullable String attachedTo;

    public Optional<String> getAttachedTo() {
        return this.attachedTo == null ? Optional.empty() : Optional.ofNullable(this.attachedTo);
    }

    /**
     * Attachment state of the disk.
     * 
     */
    @Import(name="attachmentState")
      private final @Nullable String attachmentState;

    public Optional<String> getAttachmentState() {
        return this.attachmentState == null ? Optional.empty() : Optional.ofNullable(this.attachmentState);
    }

    /**
     * The names to use for your new Lightsail disk.
     * 
     */
    @Import(name="diskName", required=true)
      private final String diskName;

    public String getDiskName() {
        return this.diskName;
    }

    /**
     * IOPS of disk.
     * 
     */
    @Import(name="iOPS")
      private final @Nullable Integer iOPS;

    public Optional<Integer> getIOPS() {
        return this.iOPS == null ? Optional.empty() : Optional.ofNullable(this.iOPS);
    }

    /**
     * Is the Attached disk is the system disk of the Instance.
     * 
     */
    @Import(name="isSystemDisk")
      private final @Nullable Boolean isSystemDisk;

    public Optional<Boolean> getIsSystemDisk() {
        return this.isSystemDisk == null ? Optional.empty() : Optional.ofNullable(this.isSystemDisk);
    }

    /**
     * Path of the disk attached to the instance.
     * 
     */
    @Import(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Size of the disk attached to the Instance.
     * 
     */
    @Import(name="sizeInGb")
      private final @Nullable String sizeInGb;

    public Optional<String> getSizeInGb() {
        return this.sizeInGb == null ? Optional.empty() : Optional.ofNullable(this.sizeInGb);
    }

    public InstanceDisk(
        @Nullable String attachedTo,
        @Nullable String attachmentState,
        String diskName,
        @Nullable Integer iOPS,
        @Nullable Boolean isSystemDisk,
        String path,
        @Nullable String sizeInGb) {
        this.attachedTo = attachedTo;
        this.attachmentState = attachmentState;
        this.diskName = Objects.requireNonNull(diskName, "expected parameter 'diskName' to be non-null");
        this.iOPS = iOPS;
        this.isSystemDisk = isSystemDisk;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.sizeInGb = sizeInGb;
    }

    private InstanceDisk() {
        this.attachedTo = null;
        this.attachmentState = null;
        this.diskName = null;
        this.iOPS = null;
        this.isSystemDisk = null;
        this.path = null;
        this.sizeInGb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceDisk defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String attachedTo;
        private @Nullable String attachmentState;
        private String diskName;
        private @Nullable Integer iOPS;
        private @Nullable Boolean isSystemDisk;
        private String path;
        private @Nullable String sizeInGb;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachedTo = defaults.attachedTo;
    	      this.attachmentState = defaults.attachmentState;
    	      this.diskName = defaults.diskName;
    	      this.iOPS = defaults.iOPS;
    	      this.isSystemDisk = defaults.isSystemDisk;
    	      this.path = defaults.path;
    	      this.sizeInGb = defaults.sizeInGb;
        }

        public Builder attachedTo(@Nullable String attachedTo) {
            this.attachedTo = attachedTo;
            return this;
        }
        public Builder attachmentState(@Nullable String attachmentState) {
            this.attachmentState = attachmentState;
            return this;
        }
        public Builder diskName(String diskName) {
            this.diskName = Objects.requireNonNull(diskName);
            return this;
        }
        public Builder iOPS(@Nullable Integer iOPS) {
            this.iOPS = iOPS;
            return this;
        }
        public Builder isSystemDisk(@Nullable Boolean isSystemDisk) {
            this.isSystemDisk = isSystemDisk;
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder sizeInGb(@Nullable String sizeInGb) {
            this.sizeInGb = sizeInGb;
            return this;
        }        public InstanceDisk build() {
            return new InstanceDisk(attachedTo, attachmentState, diskName, iOPS, isSystemDisk, path, sizeInGb);
        }
    }
}
