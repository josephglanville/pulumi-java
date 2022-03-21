// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkerPoolWorkerConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkerPoolWorkerConfigArgs Empty = new WorkerPoolWorkerConfigArgs();

    /**
     * Size of the disk attached to the worker, in GB. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). Specify a value of up to 1000. If `0` is specified, Cloud Build will use a standard disk size.
     * 
     */
    @Import(name="diskSizeGb")
      private final @Nullable Output<Integer> diskSizeGb;

    public Output<Integer> getDiskSizeGb() {
        return this.diskSizeGb == null ? Output.empty() : this.diskSizeGb;
    }

    /**
     * Machine type of a worker, such as `n1-standard-1`. See (https://cloud.google.com/cloud-build/docs/custom-workers/worker-pool-config-file). If left blank, Cloud Build will use `n1-standard-1`.
     * 
     */
    @Import(name="machineType")
      private final @Nullable Output<String> machineType;

    public Output<String> getMachineType() {
        return this.machineType == null ? Output.empty() : this.machineType;
    }

    /**
     * If true, workers are created without any public address, which prevents network egress to public IPs.
     * 
     */
    @Import(name="noExternalIp")
      private final @Nullable Output<Boolean> noExternalIp;

    public Output<Boolean> getNoExternalIp() {
        return this.noExternalIp == null ? Output.empty() : this.noExternalIp;
    }

    public WorkerPoolWorkerConfigArgs(
        @Nullable Output<Integer> diskSizeGb,
        @Nullable Output<String> machineType,
        @Nullable Output<Boolean> noExternalIp) {
        this.diskSizeGb = diskSizeGb;
        this.machineType = machineType;
        this.noExternalIp = noExternalIp;
    }

    private WorkerPoolWorkerConfigArgs() {
        this.diskSizeGb = Output.empty();
        this.machineType = Output.empty();
        this.noExternalIp = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerPoolWorkerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> diskSizeGb;
        private @Nullable Output<String> machineType;
        private @Nullable Output<Boolean> noExternalIp;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkerPoolWorkerConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.noExternalIp = defaults.noExternalIp;
        }

        public Builder diskSizeGb(@Nullable Output<Integer> diskSizeGb) {
            this.diskSizeGb = diskSizeGb;
            return this;
        }
        public Builder diskSizeGb(@Nullable Integer diskSizeGb) {
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
        public Builder noExternalIp(@Nullable Output<Boolean> noExternalIp) {
            this.noExternalIp = noExternalIp;
            return this;
        }
        public Builder noExternalIp(@Nullable Boolean noExternalIp) {
            this.noExternalIp = Output.ofNullable(noExternalIp);
            return this;
        }        public WorkerPoolWorkerConfigArgs build() {
            return new WorkerPoolWorkerConfigArgs(diskSizeGb, machineType, noExternalIp);
        }
    }
}
