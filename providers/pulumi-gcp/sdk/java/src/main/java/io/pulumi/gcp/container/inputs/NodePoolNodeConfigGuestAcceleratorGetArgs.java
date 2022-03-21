// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodePoolNodeConfigGuestAcceleratorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigGuestAcceleratorGetArgs Empty = new NodePoolNodeConfigGuestAcceleratorGetArgs();

    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    @Import(name="gpuPartitionSize")
      private final @Nullable Output<String> gpuPartitionSize;

    public Output<String> getGpuPartitionSize() {
        return this.gpuPartitionSize == null ? Output.empty() : this.gpuPartitionSize;
    }

    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public NodePoolNodeConfigGuestAcceleratorGetArgs(
        Output<Integer> count,
        @Nullable Output<String> gpuPartitionSize,
        Output<String> type) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.gpuPartitionSize = gpuPartitionSize;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private NodePoolNodeConfigGuestAcceleratorGetArgs() {
        this.count = Output.empty();
        this.gpuPartitionSize = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigGuestAcceleratorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private @Nullable Output<String> gpuPartitionSize;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolNodeConfigGuestAcceleratorGetArgs defaults) {
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
            this.gpuPartitionSize = Output.ofNullable(gpuPartitionSize);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public NodePoolNodeConfigGuestAcceleratorGetArgs build() {
            return new NodePoolNodeConfigGuestAcceleratorGetArgs(count, gpuPartitionSize, type);
        }
    }
}
