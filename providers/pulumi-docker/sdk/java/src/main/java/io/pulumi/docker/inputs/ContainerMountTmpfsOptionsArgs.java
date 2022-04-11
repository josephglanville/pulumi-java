// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerMountTmpfsOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerMountTmpfsOptionsArgs Empty = new ContainerMountTmpfsOptionsArgs();

    @Import(name="mode")
      private final @Nullable Output<Integer> mode;

    public Output<Integer> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    @Import(name="sizeBytes")
      private final @Nullable Output<Integer> sizeBytes;

    public Output<Integer> getSizeBytes() {
        return this.sizeBytes == null ? Codegen.empty() : this.sizeBytes;
    }

    public ContainerMountTmpfsOptionsArgs(
        @Nullable Output<Integer> mode,
        @Nullable Output<Integer> sizeBytes) {
        this.mode = mode;
        this.sizeBytes = sizeBytes;
    }

    private ContainerMountTmpfsOptionsArgs() {
        this.mode = Codegen.empty();
        this.sizeBytes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerMountTmpfsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> mode;
        private @Nullable Output<Integer> sizeBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerMountTmpfsOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.sizeBytes = defaults.sizeBytes;
        }

        public Builder mode(@Nullable Output<Integer> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable Integer mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }
        public Builder sizeBytes(@Nullable Output<Integer> sizeBytes) {
            this.sizeBytes = sizeBytes;
            return this;
        }
        public Builder sizeBytes(@Nullable Integer sizeBytes) {
            this.sizeBytes = Codegen.ofNullable(sizeBytes);
            return this;
        }        public ContainerMountTmpfsOptionsArgs build() {
            return new ContainerMountTmpfsOptionsArgs(mode, sizeBytes);
        }
    }
}
