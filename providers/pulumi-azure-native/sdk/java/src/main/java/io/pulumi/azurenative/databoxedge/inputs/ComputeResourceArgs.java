// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Compute infrastructure Resource
 * 
 */
public final class ComputeResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComputeResourceArgs Empty = new ComputeResourceArgs();

    /**
     * Memory in GB
     * 
     */
    @Import(name="memoryInGB", required=true)
      private final Output<Double> memoryInGB;

    public Output<Double> getMemoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Processor count
     * 
     */
    @Import(name="processorCount", required=true)
      private final Output<Integer> processorCount;

    public Output<Integer> getProcessorCount() {
        return this.processorCount;
    }

    public ComputeResourceArgs(
        Output<Double> memoryInGB,
        Output<Integer> processorCount) {
        this.memoryInGB = Objects.requireNonNull(memoryInGB, "expected parameter 'memoryInGB' to be non-null");
        this.processorCount = Objects.requireNonNull(processorCount, "expected parameter 'processorCount' to be non-null");
    }

    private ComputeResourceArgs() {
        this.memoryInGB = Output.empty();
        this.processorCount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Double> memoryInGB;
        private Output<Integer> processorCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.processorCount = defaults.processorCount;
        }

        public Builder memoryInGB(Output<Double> memoryInGB) {
            this.memoryInGB = Objects.requireNonNull(memoryInGB);
            return this;
        }
        public Builder memoryInGB(Double memoryInGB) {
            this.memoryInGB = Output.of(Objects.requireNonNull(memoryInGB));
            return this;
        }
        public Builder processorCount(Output<Integer> processorCount) {
            this.processorCount = Objects.requireNonNull(processorCount);
            return this;
        }
        public Builder processorCount(Integer processorCount) {
            this.processorCount = Output.of(Objects.requireNonNull(processorCount));
            return this;
        }        public ComputeResourceArgs build() {
            return new ComputeResourceArgs(memoryInGB, processorCount);
        }
    }
}
