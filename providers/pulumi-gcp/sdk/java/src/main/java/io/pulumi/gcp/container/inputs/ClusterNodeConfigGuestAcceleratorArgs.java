// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterNodeConfigGuestAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigGuestAcceleratorArgs Empty = new ClusterNodeConfigGuestAcceleratorArgs();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    /**
     * Size of partitions to create on the GPU. Valid values are described in the NVIDIA mig [user guide](https://docs.nvidia.com/datacenter/tesla/mig-user-guide/#partitioning).
     * 
     */
    @Import(name="gpuPartitionSize")
      private final @Nullable Output<String> gpuPartitionSize;

    public Output<String> getGpuPartitionSize() {
        return this.gpuPartitionSize == null ? Codegen.empty() : this.gpuPartitionSize;
    }

    /**
     * The accelerator type resource to expose to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ClusterNodeConfigGuestAcceleratorArgs(
        Output<Integer> count,
        @Nullable Output<String> gpuPartitionSize,
        Output<String> type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.gpuPartitionSize = gpuPartitionSize;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ClusterNodeConfigGuestAcceleratorArgs() {
        this.count = Codegen.empty();
        this.gpuPartitionSize = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodeConfigGuestAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private @Nullable Output<String> gpuPartitionSize;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterNodeConfigGuestAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.gpuPartitionSize = defaults.gpuPartitionSize;
    	      this.type = defaults.type;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }
        public Builder gpuPartitionSize(@Nullable Output<String> gpuPartitionSize) {
            this.gpuPartitionSize = gpuPartitionSize;
            return this;
        }
        public Builder gpuPartitionSize(@Nullable String gpuPartitionSize) {
            this.gpuPartitionSize = Codegen.ofNullable(gpuPartitionSize);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ClusterNodeConfigGuestAcceleratorArgs build() {
            return new ClusterNodeConfigGuestAcceleratorArgs(count, gpuPartitionSize, type);
        }
    }
}
