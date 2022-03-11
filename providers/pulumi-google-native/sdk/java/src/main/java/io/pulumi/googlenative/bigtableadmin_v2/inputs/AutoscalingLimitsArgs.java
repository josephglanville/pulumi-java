// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigtableadmin_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;


/**
 * Limits for the number of nodes a Cluster can autoscale up/down to.
 * 
 */
public final class AutoscalingLimitsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingLimitsArgs Empty = new AutoscalingLimitsArgs();

    /**
     * Maximum number of nodes to scale up to.
     * 
     */
    @InputImport(name="maxServeNodes", required=true)
      private final Output<Integer> maxServeNodes;

    public Output<Integer> getMaxServeNodes() {
        return this.maxServeNodes;
    }

    /**
     * Minimum number of nodes to scale down to.
     * 
     */
    @InputImport(name="minServeNodes", required=true)
      private final Output<Integer> minServeNodes;

    public Output<Integer> getMinServeNodes() {
        return this.minServeNodes;
    }

    public AutoscalingLimitsArgs(
        Output<Integer> maxServeNodes,
        Output<Integer> minServeNodes) {
        this.maxServeNodes = Objects.requireNonNull(maxServeNodes, "expected parameter 'maxServeNodes' to be non-null");
        this.minServeNodes = Objects.requireNonNull(minServeNodes, "expected parameter 'minServeNodes' to be non-null");
    }

    private AutoscalingLimitsArgs() {
        this.maxServeNodes = Output.empty();
        this.minServeNodes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingLimitsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxServeNodes;
        private Output<Integer> minServeNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingLimitsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxServeNodes = defaults.maxServeNodes;
    	      this.minServeNodes = defaults.minServeNodes;
        }

        public Builder maxServeNodes(Output<Integer> maxServeNodes) {
            this.maxServeNodes = Objects.requireNonNull(maxServeNodes);
            return this;
        }

        public Builder maxServeNodes(Integer maxServeNodes) {
            this.maxServeNodes = Output.of(Objects.requireNonNull(maxServeNodes));
            return this;
        }

        public Builder minServeNodes(Output<Integer> minServeNodes) {
            this.minServeNodes = Objects.requireNonNull(minServeNodes);
            return this;
        }

        public Builder minServeNodes(Integer minServeNodes) {
            this.minServeNodes = Output.of(Objects.requireNonNull(minServeNodes));
            return this;
        }
        public AutoscalingLimitsArgs build() {
            return new AutoscalingLimitsArgs(maxServeNodes, minServeNodes);
        }
    }
}
