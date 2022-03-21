// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigWorkerConfigAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigWorkerConfigAcceleratorArgs Empty = new ClusterClusterConfigWorkerConfigAcceleratorArgs();

    /**
     * The number of the accelerator cards of this type exposed to this instance. Often restricted to one of `1`, `2`, `4`, or `8`.
     * 
     */
    @Import(name="acceleratorCount", required=true)
      private final Output<Integer> acceleratorCount;

    public Output<Integer> getAcceleratorCount() {
        return this.acceleratorCount;
    }

    /**
     * The short name of the accelerator type to expose to this instance. For example, `nvidia-tesla-k80`.
     * 
     */
    @Import(name="acceleratorType", required=true)
      private final Output<String> acceleratorType;

    public Output<String> getAcceleratorType() {
        return this.acceleratorType;
    }

    public ClusterClusterConfigWorkerConfigAcceleratorArgs(
        Output<Integer> acceleratorCount,
        Output<String> acceleratorType) {
        this.acceleratorCount = Objects.requireNonNull(acceleratorCount, "expected parameter 'acceleratorCount' to be non-null");
        this.acceleratorType = Objects.requireNonNull(acceleratorType, "expected parameter 'acceleratorType' to be non-null");
    }

    private ClusterClusterConfigWorkerConfigAcceleratorArgs() {
        this.acceleratorCount = Output.empty();
        this.acceleratorType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigWorkerConfigAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> acceleratorCount;
        private Output<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigWorkerConfigAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder acceleratorCount(Output<Integer> acceleratorCount) {
            this.acceleratorCount = Objects.requireNonNull(acceleratorCount);
            return this;
        }
        public Builder acceleratorCount(Integer acceleratorCount) {
            this.acceleratorCount = Output.of(Objects.requireNonNull(acceleratorCount));
            return this;
        }
        public Builder acceleratorType(Output<String> acceleratorType) {
            this.acceleratorType = Objects.requireNonNull(acceleratorType);
            return this;
        }
        public Builder acceleratorType(String acceleratorType) {
            this.acceleratorType = Output.of(Objects.requireNonNull(acceleratorType));
            return this;
        }        public ClusterClusterConfigWorkerConfigAcceleratorArgs build() {
            return new ClusterClusterConfigWorkerConfigAcceleratorArgs(acceleratorCount, acceleratorType);
        }
    }
}
