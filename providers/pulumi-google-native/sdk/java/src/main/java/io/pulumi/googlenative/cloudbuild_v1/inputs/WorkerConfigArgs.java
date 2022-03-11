// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the configuration to be used for creating workers in the pool.
 * 
 */
public final class WorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerConfigArgs Empty = new WorkerConfigArgs();

    /**
     * Size of the disk attached to the worker, in GB. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    @InputImport(name="diskSizeGb")
      private final @Nullable Output<String> diskSizeGb;

    public Output<String> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * Machine type of a worker, such as `e2-medium`. See [Worker pool config file](https://cloud.google.com/build/docs/private-pools/worker-pool-config-file-schema). If left blank, Cloud Build will use a sensible default.
     * 
     */
    @InputImport(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    public WorkerConfigArgs(
        @Nullable Output<String> diskSizeGb,
        @Nullable Output<String> machineType) {
        this.diskSizeGb = diskSizeGb;
        this.machineType = machineType;
    }

    private WorkerConfigArgs() {
        this.diskSizeGb = Output.empty();
        this.machineType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> diskSizeGb;
        private @Nullable Output<String> machineType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
        }

        public Builder diskSizeGb(@Nullable Output<String> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }

        public Builder diskSizeGb(@Nullable String diskSizeGb) {
            this.diskSizeGb = Output.ofNullable(diskSizeGb);
            return this;
        }

        public Builder machineType(@Nullable Output<String> machineType) {
            this.machineType = machineType;
            return this;
        }

        public Builder machineType(@Nullable String machineType) {
            this.machineType = Output.ofNullable(machineType);
            return this;
        }
        public WorkerConfigArgs build() {
            return new WorkerConfigArgs(diskSizeGb, machineType);
        }
    }
}
