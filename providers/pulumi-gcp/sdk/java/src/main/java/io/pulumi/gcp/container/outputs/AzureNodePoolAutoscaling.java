// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AzureNodePoolAutoscaling {
    /**
     * Required. Maximum number of nodes in the node pool. Must be >= min_node_count.
     * 
     */
    private final Integer maxNodeCount;
    /**
     * Required. Minimum number of nodes in the node pool. Must be >= 1 and <= max_node_count.
     * 
     */
    private final Integer minNodeCount;

    @CustomType.Constructor
    private AzureNodePoolAutoscaling(
        @CustomType.Parameter("maxNodeCount") Integer maxNodeCount,
        @CustomType.Parameter("minNodeCount") Integer minNodeCount) {
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
    }

    /**
     * Required. Maximum number of nodes in the node pool. Must be >= min_node_count.
     * 
    */
    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * Required. Minimum number of nodes in the node pool. Must be >= 1 and <= max_node_count.
     * 
    */
    public Integer getMinNodeCount() {
        return this.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolAutoscaling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxNodeCount;
        private Integer minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }
        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }        public AzureNodePoolAutoscaling build() {
            return new AzureNodePoolAutoscaling(maxNodeCount, minNodeCount);
        }
    }
}
