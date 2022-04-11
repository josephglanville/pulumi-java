// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.core_v1.inputs.NodeSelectorTermArgs;
import java.util.List;
import java.util.Objects;


/**
 * A node selector represents the union of the results of one or more label queries over a set of nodes; that is, it represents the OR of the selectors represented by the node selector terms.
 * 
 */
public final class NodeSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeSelectorArgs Empty = new NodeSelectorArgs();

    /**
     * Required. A list of node selector terms. The terms are ORed.
     * 
     */
    @Import(name="nodeSelectorTerms", required=true)
      private final Output<List<NodeSelectorTermArgs>> nodeSelectorTerms;

    public Output<List<NodeSelectorTermArgs>> getNodeSelectorTerms() {
        return this.nodeSelectorTerms;
    }

    public NodeSelectorArgs(Output<List<NodeSelectorTermArgs>> nodeSelectorTerms) {
        this.nodeSelectorTerms = Objects.requireNonNull(nodeSelectorTerms, "expected parameter 'nodeSelectorTerms' to be non-null");
    }

    private NodeSelectorArgs() {
        this.nodeSelectorTerms = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<NodeSelectorTermArgs>> nodeSelectorTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelectorTerms = defaults.nodeSelectorTerms;
        }

        public Builder nodeSelectorTerms(Output<List<NodeSelectorTermArgs>> nodeSelectorTerms) {
            this.nodeSelectorTerms = Objects.requireNonNull(nodeSelectorTerms);
            return this;
        }
        public Builder nodeSelectorTerms(List<NodeSelectorTermArgs> nodeSelectorTerms) {
            this.nodeSelectorTerms = Output.of(Objects.requireNonNull(nodeSelectorTerms));
            return this;
        }
        public Builder nodeSelectorTerms(NodeSelectorTermArgs... nodeSelectorTerms) {
            return nodeSelectorTerms(List.of(nodeSelectorTerms));
        }        public NodeSelectorArgs build() {
            return new NodeSelectorArgs(nodeSelectorTerms);
        }
    }
}
