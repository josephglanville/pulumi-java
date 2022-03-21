// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupAutoscalingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupAutoscalingPolicyArgs Empty = new NodeGroupAutoscalingPolicyArgs();

    /**
     * Maximum size of the node group. Set to a value less than or equal
     * to 100 and greater than or equal to min-nodes.
     * 
     */
    @Import(name="maxNodes")
      private final @Nullable Output<Integer> maxNodes;

    public Output<Integer> getMaxNodes() {
        return this.maxNodes == null ? Output.empty() : this.maxNodes;
    }

    /**
     * Minimum size of the node group. Must be less
     * than or equal to max-nodes. The default value is 0.
     * 
     */
    @Import(name="minNodes")
      private final @Nullable Output<Integer> minNodes;

    public Output<Integer> getMinNodes() {
        return this.minNodes == null ? Output.empty() : this.minNodes;
    }

    /**
     * The autoscaling mode. Set to one of the following:
     * - OFF: Disables the autoscaler.
     * - ON: Enables scaling in and scaling out.
     * - ONLY_SCALE_OUT: Enables only scaling out.
     *   You must use this mode if your node groups are configured to
     *   restart their hosted VMs on minimal servers.
     *   Possible values are `OFF`, `ON`, and `ONLY_SCALE_OUT`.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    public NodeGroupAutoscalingPolicyArgs(
        @Nullable Output<Integer> maxNodes,
        @Nullable Output<Integer> minNodes,
        @Nullable Output<String> mode) {
        this.maxNodes = maxNodes;
        this.minNodes = minNodes;
        this.mode = mode;
    }

    private NodeGroupAutoscalingPolicyArgs() {
        this.maxNodes = Output.empty();
        this.minNodes = Output.empty();
        this.mode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupAutoscalingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxNodes;
        private @Nullable Output<Integer> minNodes;
        private @Nullable Output<String> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupAutoscalingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodes = defaults.maxNodes;
    	      this.minNodes = defaults.minNodes;
    	      this.mode = defaults.mode;
        }

        public Builder maxNodes(@Nullable Output<Integer> maxNodes) {
            this.maxNodes = maxNodes;
            return this;
        }
        public Builder maxNodes(@Nullable Integer maxNodes) {
            this.maxNodes = Output.ofNullable(maxNodes);
            return this;
        }
        public Builder minNodes(@Nullable Output<Integer> minNodes) {
            this.minNodes = minNodes;
            return this;
        }
        public Builder minNodes(@Nullable Integer minNodes) {
            this.minNodes = Output.ofNullable(minNodes);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }        public NodeGroupAutoscalingPolicyArgs build() {
            return new NodeGroupAutoscalingPolicyArgs(maxNodes, minNodes, mode);
        }
    }
}
