// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalDiskArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalDiskArgs Empty = new LocalDiskArgs();

    /**
     * Specifies the number of such disks.
     * 
     */
    @Import(name="diskCount")
      private final @Nullable Output<Integer> diskCount;

    public Output<Integer> getDiskCount() {
        return this.diskCount == null ? Codegen.empty() : this.diskCount;
    }

    /**
     * Specifies the size of the disk in base-2 GB.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Codegen.empty() : this.diskSizeGb;
    }

    /**
     * Specifies the desired disk type on the node. This disk type must be a local storage type (e.g.: local-ssd). Note that for nodeTemplates, this should be the name of the disk type and not its URL.
     * 
     */
    @Import(name="diskType")
      private final @Nullable Output<String> diskType;

    public Output<String> getDiskType() {
        return this.diskType == null ? Codegen.empty() : this.diskType;
    }

    public LocalDiskArgs(
        @Nullable Output<Integer> diskCount,
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<String> diskType) {
        this.diskCount = diskCount;
        this.diskSizeGb = diskSizeGb;
        this.diskType = diskType;
    }

    private LocalDiskArgs() {
        this.diskCount = Codegen.empty();
        this.diskSizeGb = Codegen.empty();
        this.diskType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> diskCount;
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<String> diskType;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalDiskArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskCount = defaults.diskCount;
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.diskType = defaults.diskType;
        }

        public Builder diskCount(@Nullable Output<Integer> diskCount) {
            this.diskCount = diskCount;
            return this;
        }
        public Builder diskCount(@Nullable Integer diskCount) {
            this.diskCount = Codegen.ofNullable(diskCount);
            return this;
        }
        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
            this.diskSizeGb = Codegen.ofNullable(diskSizeGb);
            return this;
        }
        public Builder diskType(@Nullable Output<String> diskType) {
            this.diskType = diskType;
            return this;
        }
        public Builder diskType(@Nullable String diskType) {
            this.diskType = Codegen.ofNullable(diskType);
            return this;
        }        public LocalDiskArgs build() {
            return new LocalDiskArgs(diskCount, diskSizeGb, diskType);
        }
    }
}
