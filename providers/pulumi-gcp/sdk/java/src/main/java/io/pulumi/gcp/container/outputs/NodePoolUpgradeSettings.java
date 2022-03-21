// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class NodePoolUpgradeSettings {
    /**
     * The number of additional nodes that can be added to the node pool during
     * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
     * Can be set to 0 or greater.
     * 
     */
    private final Integer maxSurge;
    /**
     * The number of nodes that can be simultaneously unavailable during
     * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
     * parallel. Can be set to 0 or greater.
     * 
     */
    private final Integer maxUnavailable;

    @CustomType.Constructor
    private NodePoolUpgradeSettings(
        @CustomType.Parameter("maxSurge") Integer maxSurge,
        @CustomType.Parameter("maxUnavailable") Integer maxUnavailable) {
        this.maxSurge = maxSurge;
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * The number of additional nodes that can be added to the node pool during
     * an upgrade. Increasing `max_surge` raises the number of nodes that can be upgraded simultaneously.
     * Can be set to 0 or greater.
     * 
    */
    public Integer getMaxSurge() {
        return this.maxSurge;
    }
    /**
     * The number of nodes that can be simultaneously unavailable during
     * an upgrade. Increasing `max_unavailable` raises the number of nodes that can be upgraded in
     * parallel. Can be set to 0 or greater.
     * 
    */
    public Integer getMaxUnavailable() {
        return this.maxUnavailable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolUpgradeSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxSurge;
        private Integer maxUnavailable;

        public Builder() {
    	      // Empty
        }

        public Builder(NodePoolUpgradeSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
        }

        public Builder maxSurge(Integer maxSurge) {
            this.maxSurge = Objects.requireNonNull(maxSurge);
            return this;
        }
        public Builder maxUnavailable(Integer maxUnavailable) {
            this.maxUnavailable = Objects.requireNonNull(maxUnavailable);
            return this;
        }        public NodePoolUpgradeSettings build() {
            return new NodePoolUpgradeSettings(maxSurge, maxUnavailable);
        }
    }
}
