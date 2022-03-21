// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Constraints applied to pods.
 * 
 */
public final class MaxPodsConstraintResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaxPodsConstraintResponse Empty = new MaxPodsConstraintResponse();

    /**
     * Constraint enforced on the max num of pods per node.
     * 
     */
    @Import(name="maxPodsPerNode", required=true)
      private final String maxPodsPerNode;

    public String getMaxPodsPerNode() {
        return this.maxPodsPerNode;
    }

    public MaxPodsConstraintResponse(String maxPodsPerNode) {
        this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode, "expected parameter 'maxPodsPerNode' to be non-null");
    }

    private MaxPodsConstraintResponse() {
        this.maxPodsPerNode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaxPodsConstraintResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String maxPodsPerNode;

        public Builder() {
    	      // Empty
        }

        public Builder(MaxPodsConstraintResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        public Builder maxPodsPerNode(String maxPodsPerNode) {
            this.maxPodsPerNode = Objects.requireNonNull(maxPodsPerNode);
            return this;
        }        public MaxPodsConstraintResponse build() {
            return new MaxPodsConstraintResponse(maxPodsPerNode);
        }
    }
}
