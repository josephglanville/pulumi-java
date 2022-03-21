// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.NodeSelectorTerm;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NodeSelector {
    /**
     * Required. A list of node selector terms. The terms are ORed.
     * 
     */
    private final List<NodeSelectorTerm> nodeSelectorTerms;

    @CustomType.Constructor
    private NodeSelector(@CustomType.Parameter("nodeSelectorTerms") List<NodeSelectorTerm> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    /**
     * Required. A list of node selector terms. The terms are ORed.
     * 
    */
    public List<NodeSelectorTerm> getNodeSelectorTerms() {
        return this.nodeSelectorTerms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSelector defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<NodeSelectorTerm> nodeSelectorTerms;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeSelectorTerms = defaults.nodeSelectorTerms;
        }

        public Builder nodeSelectorTerms(List<NodeSelectorTerm> nodeSelectorTerms) {
            this.nodeSelectorTerms = Objects.requireNonNull(nodeSelectorTerms);
            return this;
        }
        public Builder nodeSelectorTerms(NodeSelectorTerm... nodeSelectorTerms) {
            return nodeSelectorTerms(List.of(nodeSelectorTerms));
        }        public NodeSelector build() {
            return new NodeSelector(nodeSelectorTerms);
        }
    }
}
