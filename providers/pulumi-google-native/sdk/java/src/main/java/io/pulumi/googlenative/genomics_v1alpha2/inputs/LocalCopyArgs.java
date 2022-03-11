// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * LocalCopy defines how a remote file should be copied to and from the VM.
 * 
 */
public final class LocalCopyArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalCopyArgs Empty = new LocalCopyArgs();

    /**
     * The name of the disk where this parameter is located. Can be the name of one of the disks specified in the Resources field, or "boot", which represents the Docker instance's boot disk and has a mount point of `/`.
     * 
     */
    @InputImport(name="disk", required=true)
      private final Output<String> disk;

    public Output<String> getDisk() {
        return this.disk;
    }

    /**
     * The path within the user's docker container where this input should be localized to and from, relative to the specified disk's mount point. For example: file.txt,
     * 
     */
    @InputImport(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    public LocalCopyArgs(
        Output<String> disk,
        Output<String> path) {
        this.disk = Objects.requireNonNull(disk, "expected parameter 'disk' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
    }

    private LocalCopyArgs() {
        this.disk = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalCopyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> disk;
        private Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalCopyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
    	      this.path = defaults.path;
        }

        public Builder disk(Output<String> disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }

        public Builder disk(String disk) {
            this.disk = Output.of(Objects.requireNonNull(disk));
            return this;
        }

        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }
        public LocalCopyArgs build() {
            return new LocalCopyArgs(disk, path);
        }
    }
}
