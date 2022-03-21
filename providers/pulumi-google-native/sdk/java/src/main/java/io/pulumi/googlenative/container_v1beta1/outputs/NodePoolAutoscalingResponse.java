// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NodePoolAutoscalingResponse {
    /**
     * Can this node pool be deleted automatically.
     * 
     */
    private final Boolean autoprovisioned;
    /**
     * Is autoscaling enabled for this node pool.
     * 
     */
    private final Boolean enabled;
    /**
     * Maximum number of nodes for one location in the NodePool. Must be >= min_node_count. There has to be enough quota to scale up the cluster.
     * 
     */
    private final Integer maxNodeCount;
    /**
     * Minimum number of nodes for one location in the NodePool. Must be >= 1 and <= max_node_count.
     * 
     */
    private final Integer minNodeCount;

    @CustomType.Constructor
    private NodePoolAutoscalingResponse(
        @CustomType.Parameter("autoprovisioned") Boolean autoprovisioned,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("maxNodeCount") Integer maxNodeCount,
        @CustomType.Parameter("minNodeCount") Integer minNodeCount) {
        this.autoprovisioned = autoprovisioned;
        this.enabled = enabled;
        this.maxNodeCount = maxNodeCount;
        this.minNodeCount = minNodeCount;
    }

    /**
     * Can this node pool be deleted automatically.
     * 
    */
    public Boolean getAutoprovisioned() {
        return this.autoprovisioned;
    }
    /**
     * Is autoscaling enabled for this node pool.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * Maximum number of nodes for one location in the NodePool. Must be >= min_node_count. There has to be enough quota to scale up the cluster.
     * 
    */
    public Integer getMaxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * Minimum number of nodes for one location in the NodePool. Must be >= 1 and <= max_node_count.
     * 
    */
    public Integer getMinNodeCount() {
        return this.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolAutoscalingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoprovisioned;
        private Boolean enabled;
        private Integer maxNodeCount;
        private Integer minNodeCount;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolAutoscalingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovisioned = defaults.autoprovisioned;
    	      this.enabled = defaults.enabled;
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        public Builder autoprovisioned(Boolean autoprovisioned) {
            this.autoprovisioned = Objects.requireNonNull(autoprovisioned);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }
        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }        public NodePoolAutoscalingResponse build() {
            return new NodePoolAutoscalingResponse(autoprovisioned, enabled, maxNodeCount, minNodeCount);
        }
    }
}
